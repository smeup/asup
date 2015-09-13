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
package org.smeup.sys.os.file.base;

import java.sql.SQLException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;
import org.smeup.sys.db.syntax.QAliasResolver;
import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionParser;
import org.smeup.sys.db.syntax.ddl.QCreateViewStatement;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDatabaseFileField;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;
import org.smeup.sys.os.file.QLogicalFile;

public class BaseFileAdapterFactoryImpl implements QAdapterFactory {

	private QConnectionManager connectionManager;

	public BaseFileAdapterFactoryImpl(QConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public <T> T getAdapter(QContext context, Object adaptableObject, Class<T> adapterType) {

		T adaptee = null;

		if (adaptableObject instanceof QJob) {
			QJob job = (QJob) adaptableObject;
			if (QConnection.class.isAssignableFrom(adapterType))
				adaptee = (T) adaptJobToConnection(job);
		} else if (adaptableObject instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile) adaptableObject;

			if (QViewDef.class.isAssignableFrom(adapterType) && databaseFile instanceof QLogicalFile)
				adaptee = (T) adaptDatabaseFileToViewDef(context, (QLogicalFile) databaseFile);

			else if (QTableDef.class.isAssignableFrom(adapterType))
				adaptee = (T) adaptDatabaseFileToTableDef(databaseFile);

			else if (QIndexDef.class.isAssignableFrom(adapterType))
				adaptee = (T) adaptDatabaseFileToIndexDef(databaseFile);
		}

		return adaptee;
	}

	private QConnection adaptJobToConnection(final QJob job) {

		QConnection connection = job.getContext().get(QConnection.class);
		if (connection == null)
			synchronized (job) {
				connection = job.getContext().get(QConnection.class);
				if (connection == null)
					try {
						// TODO credentials
						connection = connectionManager.createConnection();
						job.getContext().set(QConnection.class, connection);
					
						connection.getContext().set(QAliasResolver.class, new BaseAliasResolverImpl());
						
					} catch (SQLException e) {
						throw new OperatingSystemRuntimeException(e);
					}
			}

		return connection;
	}

	private QTableDef adaptDatabaseFileToTableDef(QDatabaseFile file) {

		QTableDef tableDef = QDatabaseCoreFactory.eINSTANCE.createTableDef();
		tableDef.setLabel(file.getText());
		
		QDatabaseFileFormat databaseFileFormat = file.getDatabaseFormat();

		for (QDatabaseFileField field : databaseFileFormat.getDefinition().getElements()) {

			QUnaryAtomicBufferedDataDef<?> dataDef = field.getDefinition();
			QTableColumnDef tableColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
			tableColumnDef.setName(field.getName());
			tableColumnDef.setLabel(field.getText());
			tableColumnDef.setDefinition((QDataDef<?>) EcoreUtil.copy((EObject)dataDef));
			
			tableDef.getColumns().add(tableColumnDef);
		}

		return tableDef;
	}

	private QViewDef adaptDatabaseFileToViewDef(QContext context, QLogicalFile file) {

		if (file.getCreationStatement() == null)
			return null;

		QViewDef viewDef = QDatabaseCoreFactory.eINSTANCE.createViewDef();
		viewDef.setLabel(file.getText());
		
		QDatabaseFileFormat databaseFileFormat = file.getDatabaseFormat();
		
		for (QDatabaseFileField field : databaseFileFormat.getDefinition().getElements()) {
			QUnaryAtomicBufferedDataDef<?> dataDef = field.getDefinition();
			QTableColumnDef tableColumnDef = QDatabaseCoreFactory.eINSTANCE.createTableColumnDef();
			tableColumnDef.setName(field.getName());
			tableColumnDef.setLabel(field.getText());
			tableColumnDef.setDefinition((QDataDef<?>) EcoreUtil.copy((EObject)dataDef));
			
			viewDef.getColumns().add(tableColumnDef);
		}

		try {
			QDefinitionParser definitionParser = context.get(QDefinitionParser.class);
			QDefinitionParseResult definitionParseResult = definitionParser.parseDefinition(file.getCreationStatement().trim());

			QCreateViewStatement createViewStatement = (QCreateViewStatement) definitionParseResult.getDefinitionStatement();
			viewDef.setQuerySelect(createViewStatement.getQuery());

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return viewDef;
	}

	private QIndexDef adaptDatabaseFileToIndexDef(QDatabaseFile file) {

		QDatabaseFileFormat databaseFileFormat = file.getDatabaseFormat();
		if (databaseFileFormat.getFormatKey() == null)
			return null;

		QFileFormatKey fileFormatKey = databaseFileFormat.getFormatKey();

		QIndexDef indexDef = QDatabaseCoreFactory.eINSTANCE.createIndexDef();
		indexDef.setUnique(fileFormatKey.isUnique());

		int i = 1;
		for (QFileFormatKeyField fileFormatKeyField : fileFormatKey.getKeyFields()) {
			QIndexColumnDef indexColumnDef = QDatabaseCoreFactory.eINSTANCE.createIndexColumnDef();
			indexColumnDef.setName(fileFormatKeyField.getName());
			indexColumnDef.setSequence(i);
			if (fileFormatKeyField.isDescend())
				indexColumnDef.setOrdering(OrderingType.DESCEND);
			else
				indexColumnDef.setOrdering(OrderingType.ASCEND);

			indexDef.getColumns().add(indexColumnDef);
			i++;
		}

		return indexDef;
	}
}
