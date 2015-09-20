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
package org.smeup.sys.il.esam.jdbc;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QAccessManager;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.ServiceRegistering;

public class JDBCAccessManagerImpl implements QAccessManager {

	@Inject
	private QApplication application;
	@Inject
	private QDataManager dataManager;

	@ServiceRegistering
	public void init() {

		QAdapterFactory adapterFactory = new JDBCEsamAdatpterFactoryImpl();
		application.getContext().registerAdapterFactory(adapterFactory, Index.class);
	}

	@Override
	public QAccessFactory createFactory(QContextProvider contextProvider, QDataContext dataContext) {

		QContext context = contextProvider.getContext();
		
		QConnection connection = context.getAdapter(contextProvider, QConnection.class);

		QDataFactory dataFactory = dataManager.createFactory(context, dataContext);

		return new JDBCAccessFactoryImpl(context, connection, dataFactory);
	}

}
