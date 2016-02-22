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
package org.smeup.sys.db.core.base;

import java.sql.SQLException;

import javax.inject.Inject;

import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.impl.ConnectionManagerImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplication;

public class BaseConnectionManagerImpl extends ConnectionManagerImpl {

	private static int connectionID = 0;

	@Inject
	private QApplication application;
	@Inject
	private QDatabaseManager databaseManager;

	@Override
	public QConnection createConnection(QContext context) throws SQLException {
		return createConnection(context, null, null, null);
	}

	@Override
	public QConnection createConnection(String catalog) throws SQLException {
		return createConnection(catalog, null, null);
	}

	@Override
	public QConnection createConnection(String user, String password) throws SQLException {
		return createConnection(null, user, password);
	}

	@Override
	public QConnection createConnection(String catalog, String user, String password) throws SQLException {

		return createConnection(null, catalog, user, password);
	}

	@SuppressWarnings("resource")
	private QConnection createConnection(QContext context, String catalog, String user, String password) throws SQLException {

		if (!(databaseManager instanceof BaseDatabaseManagerImpl))
			return null;

		BaseDatabaseManagerImpl baseDatabaseManagerImpl = (BaseDatabaseManagerImpl) databaseManager;

		String connectionID = nextConnectionID(baseDatabaseManagerImpl);

		QCatalogContainer catalogContainer = baseDatabaseManagerImpl.getCatalogContainer(catalog);

		QContext contextChild = null;

		if (context != null)
			contextChild = context.createChildContext(connectionID);
		else
			contextChild = catalogContainer.getCatalogContext().createChildContext(connectionID);

		QConnection connection = new BaseConnectionImpl(baseDatabaseManagerImpl.getDatabaseContainer(), contextChild);
		connection.setCatalog(catalog);

		return connection;
	}

	protected synchronized String nextConnectionID(BaseDatabaseManagerImpl baseDatabaseManagerImpl) {

		connectionID++;
		String stringID = application.getContext().getContextDescription().getName() + "/" + connectionID;

		return stringID;
	}
}