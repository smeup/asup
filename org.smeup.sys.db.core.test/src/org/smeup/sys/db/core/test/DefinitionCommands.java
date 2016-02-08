/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.db.core.test;

import java.net.URL;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QDatabaseObjectDef;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;
import org.smeup.sys.dk.test.e4.E4TestHelper;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.mi.core.util.QFiles;

public class DefinitionCommands extends E4TestProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QFiles files;

	public void _createSchema(CommandInterpreter interpreter) throws SQLException {

		String schemaName = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();

		// connect to default catalog
		QConnection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema != null)
			databaseManager.dropSchema(connection, schema, true);

		QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
		schema = databaseManager.createSchema(connection, schemaName, schemaDef);

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());

		// tables
		Enumeration<URL> tables = bundle.findEntries("/resources/schemas/" + schemaName + "/tables", null, false);
		while (tables.hasMoreElements()) {

			URL tableURL = tables.nextElement();
			String fileName = files.getBaseName(tableURL.getFile());

			QDatabaseObjectDef file = (QDatabaseObjectDef) E4TestHelper.load(tableURL);

			SQLObject sqlObject = null;
			try {
				QTableDef tableDef = (QTableDef) file;
				sqlObject = databaseManager.createTable(connection, schema, fileName, tableDef);
				System.out.println(sqlObject);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		// views
		Enumeration<URL> views = bundle.findEntries("/resources/schemas/" + schemaName + "/views", null, false);
		while (views.hasMoreElements()) {

			URL viewURL = views.nextElement();
			String fileName = files.getBaseName(viewURL.getFile());

			QDatabaseObjectDef file = (QDatabaseObjectDef) E4TestHelper.load(viewURL);

			SQLObject sqlObject = null;
			try {
				QViewDef viewDef = (QViewDef) file;
				sqlObject = databaseManager.createView(connection, schema, fileName, viewDef);
				System.out.println(sqlObject);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		// indices
		Enumeration<URL> indices = bundle.findEntries("/resources/schemas/" + schemaName + "/indices", null, false);
		while (indices.hasMoreElements()) {

			URL indexURL = indices.nextElement();
			String fileName = files.getBaseName(indexURL.getFile());

			QDatabaseObjectDef file = (QDatabaseObjectDef) E4TestHelper.load(indexURL);

			SQLObject sqlObject = null;
			try {
				QIndexDef indexDef = (QIndexDef) file;

				Table table = null;
				if (connection.getCatalogGenerationStrategy().isCreateIndexOnView()) {
					table = connection.getCatalogMetaData().getView(schemaName, fileName);

					if (table != null) {
						sqlObject = databaseManager.createIndex(connection, table, fileName, indexDef);
						System.out.println(sqlObject);
					}
				} else {
					// TODO
				}
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}

		connection.close();
		System.out.println("Creazione schema completata");
	}

	public Object _testDDL(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		String schemaName = "ASUP_TEST";
		String tableName = "ASUP_TABLE";
		String indexName = "ASUP_INDEX";

		QConnection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema != null)
			databaseManager.dropSchema(connection, schema, true);

		QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
		schema = databaseManager.createSchema(connection, schemaName, schemaDef);

		QTableDef tableDef = QDatabaseCoreFactory.eINSTANCE.createTableDef();

		for (int i = 1; i <= 3; i++) {
			QTableColumnDef column = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
			QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			characterDef.setLength(10);
			column.setDefinition(characterDef);
			column.setName("COL" + i);
			tableDef.getColumns().add(column);
		}

		Table table = databaseManager.createTable(connection, schema, tableName, tableDef);

		QIndexDef indexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();

		QIndexColumnDef indexColumn = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
		indexColumn.setName("COL2");
		indexColumn.setSequence(1);
		indexColumn.setOrdering(OrderingType.ASCEND);

		indexDef.getColumns().add(indexColumn);

		databaseManager.createIndex(connection, table, indexName, indexDef);

		connection.close();

		return null;
	}

	@SuppressWarnings("unchecked")
	public Object _copyDDL(CommandInterpreter interpreter) throws SQLException {

		String catalogFrom = interpreter.nextArgument();
		String cataloTo = interpreter.nextArgument();
		String schemaName = interpreter.nextArgument();

		QConnection connectionTo = connectionManager.createConnection(cataloTo);

		Schema schemaTo = connectionTo.getCatalogMetaData().getSchema(schemaName);
		if (schemaTo != null)
			databaseManager.dropSchema(connectionTo, schemaTo, true);

		QConnection connectionFrom = connectionManager.createConnection(catalogFrom);
		Schema schemaFrom = connectionFrom.getCatalogMetaData().getSchema(schemaName);

		QSchemaDef schemaDef = connectionTo.getContext().getAdapter(schemaFrom, QSchemaDef.class);
		databaseManager.createSchema(connectionTo, schemaFrom.getName(), schemaDef);
		// TODO
		schemaTo = connectionTo.getCatalogMetaData().getSchema(schemaFrom.getName());

		for (Table table : (List<Table>) schemaFrom.getTables())
			if (table instanceof ViewTable) {
				QViewDef viewDef = connectionTo.getContext().getAdapter(schemaFrom, QViewDef.class);
				databaseManager.createView(connectionTo, schemaTo, table.getName(), viewDef);
			} else {
				QTableDef tableDef = connectionTo.getContext().getAdapter(table, QTableDef.class);
				databaseManager.createTable(connectionTo, schemaTo, table.getName(), tableDef);
			}

		for (Index index : (List<Index>) schemaFrom.getIndices()) {
			QIndexDef indexDef = connectionTo.getContext().getAdapter(index, QIndexDef.class);
			Table tableTo = connectionTo.getCatalogMetaData().getTable(schemaTo.getName(), index.getName());
			databaseManager.createIndex(connectionTo, tableTo, index.getName(), indexDef);
		}

		return null;
	}
}