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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.lib.QLibrary;

public class BaseLibraryListenerImpl implements QResourceListener<QLibrary> {

	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QResourceManager resourceManager;

	@PostConstruct
	public void init() {
		resourceManager.registerListener(QLibrary.class, this);
	}

	@Override
	public void handleEvent(QResourceEvent<QLibrary> event) {

		if (event.getEventType() != ResourceEventType.PRE_SAVE && event.getEventType() != ResourceEventType.PRE_DELETE)
			return;

		QLibrary library = event.getSource();
		QContextProvider contextProvider = event.getContextProvider();
		
		QContext jobContext = contextProvider.getContext();

		QConnection connection = jobContext.getAdapter(contextProvider, QConnection.class);
		if (connection == null)
			throw new OperatingSystemRuntimeException("Database connection not found: " + jobContext);

		switch (event.getEventType()) {

		case PRE_SAVE:

			try {
				createSchema(jobContext, library, connection);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e);
			}
			break;

		case PRE_DELETE:
			try {
				dropSchema(jobContext, library, connection);
			} catch (SQLException e) {
				throw new OperatingSystemRuntimeException(e);
			}
			break;

		default:
			break;
		}
	}

	private void createSchema(QContext jobContext, QLibrary library, QConnection connection) throws SQLException {

		// schema
		Schema schema = connection.getCatalogMetaData().getSchema(library.getName());
		if (schema == null) {
			QSchemaDef schemaDef = QDatabaseCoreFactory.eINSTANCE.createSchemaDef();
			schemaDef.setLabel(library.getText());
			
			databaseManager.createSchema(connection, library.getName(), schemaDef);
		} else
			System.err.println("Schema already exists: " + library.getName());
	}

	private void dropSchema(QContext jobContext, QLibrary library, QConnection connection) throws SQLException {

		// schema
		Schema schema = connection.getCatalogMetaData().getSchema(library.getName());
		if (schema == null)
			throw new SQLException("Schema not found: " + library.getName());

		databaseManager.dropSchema(connection, schema, true);
	}
}