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
package org.smeup.sys.os.file.base;

import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;

public class BaseFileListenerImpl implements QResourceListener<QFile> {

	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QResourceManager resourceManager;

	@PostConstruct
	public void init() {
		resourceManager.registerListener(QFile.class, this);
	}

	@SuppressWarnings("resource")
	@Override
	public void handleEvent(QResourceEvent<QFile> event) {

		QFile file = event.getSource();

		if (!(file instanceof QDatabaseFile))
			return;

		if (event.getEventType() != ResourceEventType.PRE_SAVE && 
			event.getEventType() != ResourceEventType.PRE_DELETE &&
			event.getEventType() != ResourceEventType.PRE_RENAME) {
			return;
		}

		QContextProvider contextProvider = event.getContextProvider();

		// file.setLibrary(((QResourceReader<QFile>)
		// event.getResource()).getContainer());

		QContext jobContext = contextProvider.getContext();
		QConnection connection = jobContext.getAdapter(contextProvider, QConnection.class);

		Schema schema = connection.getCatalogMetaData().getSchema(event.getResource().getName());
		if (schema == null)
			throw new OperatingSystemRuntimeException("Schema not found: " + event.getResource().getName());

		try {
			switch (event.getEventType()) {
			case PRE_SAVE:
				deleteFile(jobContext, file, connection, schema);
				createFile(jobContext, file, connection, schema);
				break;
			case PRE_RENAME:
				renameFile(jobContext, file, connection, schema, event.getNewName());
				break;			
			case PRE_DELETE:
				deleteFile(jobContext, file, connection, schema);
			default:
				break;
			}
		} catch (SQLException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private void renameFile(QContext jobContext, QFile file, QConnection connection, Schema schema, String newName) throws SQLException {
		if (file instanceof QPhysicalFile) {
			Table table = connection.getCatalogMetaData().getTable(schema.getName(), file.getName());
			databaseManager.renameTable(connection, table, newName);
		} else if (file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;
			Index index = connection.getCatalogMetaData().getIndex(schema.getName(), logicalFile.getTables().get(0), file.getName());
			if (index != null) {
				databaseManager.renameIndex(connection, index, newName);
			}
		}
	}

	private void createFile(QContext jobContext, QFile file, QConnection connection, Schema schema) throws SQLException {

		if (file instanceof QPhysicalFile) {
			QPhysicalFile physicalFile = (QPhysicalFile) file;

			QTableDef tableDef = jobContext.getAdapter(physicalFile, QTableDef.class);
			Table table = databaseManager.createTable(connection, schema, file.getName(), tableDef);

			QIndexDef index = jobContext.getAdapter(file, QIndexDef.class);
			if (index != null)
				databaseManager.createIndex(connection, table, file.getName(), index);

		} else if (file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;

			Table table = null;

			QViewDef viewDef = jobContext.getAdapter(logicalFile, QViewDef.class);
			if (viewDef != null)
				table = databaseManager.createView(connection, schema, file.getName(), viewDef);

			QIndexDef index = jobContext.getAdapter(file, QIndexDef.class);
			if (index != null) {

				// retrieve first table (strategy or index with no view)
				if (!connection.getCatalogGenerationStrategy().isCreateIndexOnView() || table == null)
					table = connection.getCatalogMetaData().getTable(schema.getName(), logicalFile.getTables().get(0));

				if (table != null)
					databaseManager.createIndex(connection, table, file.getName(), index);
				else
					System.err.println("Ecchime !!!!!! : " + file);
			}
		}
	}

	private void deleteFile(QContext jobContext, QFile file, QConnection connection, Schema schema) throws SQLException {

		if (file instanceof QPhysicalFile) {
			Table table = connection.getCatalogMetaData().getTable(schema.getName(), file.getName());
			databaseManager.dropTable(connection, table);
		} else if (file instanceof QLogicalFile) {
			QLogicalFile logicalFile = (QLogicalFile) file;

			// retrieve first table
			if (!connection.getCatalogGenerationStrategy().isCreateIndexOnView()) {
				Index index = connection.getCatalogMetaData().getIndex(schema.getName(), logicalFile.getTables().get(0), file.getName());
				if (index != null)
					databaseManager.dropIndex(connection, index);
			} else {
				Index index = connection.getCatalogMetaData().getIndex(schema.getName(), file.getName(), file.getName());
				if (index != null)
					databaseManager.dropIndex(connection, index);
			}

			ViewTable view = (ViewTable) connection.getCatalogMetaData().getTable(schema.getName(), file.getName());
			if (view != null)
				databaseManager.dropView(connection, view);
		} else
			return;
	}
}
