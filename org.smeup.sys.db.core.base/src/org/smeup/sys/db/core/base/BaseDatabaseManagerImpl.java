/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.db.core.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.query.QuerySelect;
import org.eclipse.datatools.modelbase.sql.query.QuerySelectStatement;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.ResultColumn;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelFactory;
import org.eclipse.datatools.modelbase.sql.query.TableExpression;
import org.eclipse.datatools.modelbase.sql.query.TableInDatabase;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionColumn;
import org.eclipse.datatools.modelbase.sql.query.helper.StatementHelper;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;
import org.smeup.sys.db.syntax.QDefinitionParser;
import org.smeup.sys.db.syntax.QDefinitionParserRegistry;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.db.syntax.QQueryParserRegistry;
import org.smeup.sys.db.syntax.QQueryWriter;
import org.smeup.sys.il.data.def.QIdentityDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.rt.core.QApplication;

public class BaseDatabaseManagerImpl implements QDatabaseManager {

	@Inject
	private QApplication application;
	@Inject
	private QDefinitionParserRegistry definitionParserRegistry;
	@Inject
	private QQueryParserRegistry queryParserRegistry;
	@Inject
	private QDatabaseContainer databaseContainer;

	private boolean started;
	
	protected QDatabaseContainer getDatabaseContainer() {
		return this.databaseContainer;
	}

	@Override
	public void start() {

		if (isStarted())
			throw new DatabaseCoreRuntimeException("Database Manager already started: " + this.databaseContainer);

		// database context
		QDefinitionParser definitionParser = this.definitionParserRegistry.lookupByVendorVersion(databaseContainer.getVendor(), databaseContainer.getVersion());
		application.getContext().set(QDefinitionParser.class, definitionParser);
		QQueryParser queryParser = this.queryParserRegistry.lookupByVendorVersion(databaseContainer.getVendor(), databaseContainer.getVersion());
		application.getContext().set(QQueryParser.class, queryParser);

		// database loader
		BaseDatabaseLoader databaseStarter = application.getContext().make(BaseDatabaseLoader.class);
		databaseStarter.loadDatabase(databaseContainer);
		
		this.started = false;
	}

	@Override
	public boolean isStarted() {
		return this.started;
	}


	@Override
	public Schema createSchema(QConnection connection, String name, QSchemaDef schemaDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;

		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			statement = connection.createStatement(true);
			
			// definition
			String command = definitionWriter.createSchema(name, schemaDef);
			statement.execute(command);
			
			// label
			String sql = definitionWriter.createLabel(name, schemaDef);
			executeWithoutErrors(statement, sql);

		} finally {
			if (statement != null)
				statement.close();
		}

		Schema schema = getCatalogContainer(connection).loadSchema(name);
		return schema;
	}

	private void executeWithoutErrors(QStatement statement, String sql) {
		try {
			if(sql != null)
				statement.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Table createTable(QConnection connection, Schema schema, String name, QTableDef tableDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {

			// relative record number support
			if (catalogContainer.getGenerationStrategy().isCreateRelativeRecordNumber()) {
				tableDef = (QTableDef) EcoreUtil.copy((EObject) tableDef);

				QTableColumnDef pkTableComColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
				QIdentityDef identityDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createIdentityDef();
				pkTableComColumnDef.setDefinition(identityDef);

				pkTableComColumnDef.setName(TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME);

				tableDef.getColumns().add(pkTableComColumnDef);
			}

			statement = connection.createStatement(true);
			
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			
			// definition
			String command = definitionWriter.createTable(schema, name, tableDef);
			statement.execute(command);
			
			// label
			command = definitionWriter.createLabel(schema, name, tableDef);
			executeWithoutErrors(statement, command);

			command = definitionWriter.createLabelForFields(schema, name, tableDef);
			executeWithoutErrors(statement, command);
			
		} finally {
			if (statement != null)
				statement.close();
		}

		Table table = catalogContainer.loadTable(schema, name);
		return table;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public ViewTable createView(QConnection connection, Schema schema, String name, QViewDef viewDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		boolean copy = false;

		QStatement statement = null;
		try {

			SQLQueryParseResult query = connection.getContext().get(QQueryParser.class).parseQuery(viewDef.getQuerySelect());
			QueryStatement queryStatement = query.getQueryStatement();
			QuerySelectStatement querySelectStatement = (QuerySelectStatement) queryStatement;
			QuerySelect querySelect = (QuerySelect) querySelectStatement.getQueryExpr().getQuery();
			List<TableExpression> tableExpressions = StatementHelper.getTablesForStatement(queryStatement);

			// complete column definition
			if (viewDef.getColumns().isEmpty()) {

				if (!copy) {
					viewDef = (QViewDef) EcoreUtil.copy((EObject) viewDef);
					copy = true;
				}

				for (ValueExpressionColumn expressionColumn : (List<ValueExpressionColumn>) querySelect.getColumnList()) {
					QTableColumnDef tableColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
					tableColumnDef.setName(expressionColumn.getName());
					viewDef.getColumns().add(tableColumnDef);
				}
			}

			// relative record number support
			if (catalogContainer.getGenerationStrategy().isCreateRelativeRecordNumber()) {

				if (!copy) {
					viewDef = (QViewDef) EcoreUtil.copy((EObject) viewDef);
					copy = true;
				}

				QTableColumnDef pkTableComColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
				QIdentityDef identityDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createIdentityDef();
				pkTableComColumnDef.setDefinition(identityDef);

				pkTableComColumnDef.setName(TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME);

				viewDef.getColumns().add(pkTableComColumnDef);

				String fieldName = QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME;

				// column list
				querySelect.getColumnList().add(StatementHelper.createColumnExpression(fieldName));

				// result column
				ResultColumn resultColumn = SQLQueryModelFactory.eINSTANCE.createResultColumn();
				ValueExpressionColumn columnExpr = StatementHelper.createColumnExpression(fieldName);

				// select table as..
				if (tableExpressions.get(0).getTableCorrelation() != null)
					columnExpr.setTableExpr(tableExpressions.get(0).getTableCorrelation().getTableExpr());

				resultColumn.setValueExpr(columnExpr);

				querySelect.getSelectClause().add(resultColumn);

			}

			for (TableExpression tableExpression : tableExpressions)
				if (tableExpression instanceof TableInDatabase) {
					TableInDatabase tableInDatabase = (TableInDatabase) tableExpression;
					Schema tableSchema = tableInDatabase.getDatabaseTable().getSchema();
					tableSchema.setName(schema.getName());
				}

			// rewrite query
			// TODO connection.getContext().get(QQueryWriter.class);
			// ERROR: get the last inject writer from OSGIContainer
			QQueryWriter queryWriter = catalogContainer.getCatalogContext().get(QQueryWriter.class);
			String sqlQuerySelect = queryWriter.writeQuery(querySelectStatement);

			if (!copy) {
				viewDef = (QViewDef) EcoreUtil.copy((EObject) viewDef);
				copy = true;
			}
			viewDef.setQuerySelect(sqlQuerySelect);

			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			statement = connection.createStatement(true);
			
			// definition
			String command = definitionWriter.createView(schema, name, viewDef);
			statement.execute(command);
			
			// label
			command = definitionWriter.createLabel(schema, name, viewDef);
			executeWithoutErrors(statement, command);

		} finally {
			if (statement != null)
				statement.close();
		}

		ViewTable view = getCatalogContainer(connection).loadView(schema, name);
		return view;
	}

	@Override
	public Index createIndex(QConnection connection, Table table, String name, QIndexDef indexDef) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.createIndex(table, name, indexDef);

			statement = connection.createStatement(true);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		Index index = getCatalogContainer(connection).loadIndex(table, name);
		return index;
	}

	@Override
	public void dropSchema(QConnection connection, Schema schema, boolean ignoreFailOnNonEmpty) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropSchema(schema, ignoreFailOnNonEmpty);

			statement = connection.createStatement(true);
			statement.execute(command);
		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeSchema(schema);
	}

	@Override
	public void dropTable(QConnection connection, Table table) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropTable(table);

			statement = connection.createStatement(true);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeTable(table);
	}

	@Override
	public void dropView(QConnection connection, ViewTable view) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropView(view);

			statement = connection.createStatement(true);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeView(view);
	}

	@Override
	public void dropIndex(QConnection connection, Index index) throws SQLException {

		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.dropIndex(index);

			statement = connection.createStatement(true);
			statement.execute(command);

		} finally {
			if (statement != null)
				statement.close();
		}

		catalogContainer.removeIndex(index);
	}

	@Override
	public boolean hasLogicals(QConnection connection, Table table) throws SQLException {
		QCatalogContainer catalogContainer = getCatalogContainer(connection);

		QStatement statement = null;
		ResultSet resultSet = null;
		try {
			QDefinitionWriter definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
			String command = definitionWriter.hasLogicals(table);

			statement = connection.createStatement(true);
			resultSet = statement.executeQuery(command);
			return resultSet.next();
		} finally {
			if (resultSet != null)
				resultSet.close();
			
			if (statement != null)
				statement.close();
		}
	}
	
	private QCatalogContainer getCatalogContainer(QConnection connection) throws SQLException {
		return getCatalogContainer(connection.getCatalog());
	}

	protected QCatalogContainer getCatalogContainer(String catalogName) throws SQLException {

		QCatalogContainer catalogContainer = null;

		if (catalogName == null || catalogName.isEmpty())
			catalogContainer = this.databaseContainer.getDefaultCatalogContainer();
		else
			for (QCatalogContainer tempContainer : this.databaseContainer.getCatalogContainers())
				if (catalogName.equals(tempContainer.getName())) {
					catalogContainer = tempContainer;
					break;
				}

		return catalogContainer;
	}
}