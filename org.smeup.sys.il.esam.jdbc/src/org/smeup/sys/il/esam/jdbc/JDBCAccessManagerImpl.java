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
package org.smeup.sys.il.esam.jdbc;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.esam.QAccessContext;
import org.smeup.sys.il.esam.QAccessManager;
import org.smeup.sys.rt.core.QApplication;

public class JDBCAccessManagerImpl implements QAccessManager {

	@Inject
	private QApplication application;

	@PostConstruct
	public void init() {

		QAdapterFactory adapterFactory = new JDBCEsamAdatpterFactoryImpl();
		application.getContext().registerAdapterFactory(adapterFactory, Index.class);
	}

	@Override
	public QAccessContext createAccessContext(Object connection, QDataContext dataContext) {

		QConnection databaseConnection = dataContext.getContext().getAdapter(connection, QConnection.class);

		return new JDBCAccessContextImpl(databaseConnection, dataContext);
	}

}
