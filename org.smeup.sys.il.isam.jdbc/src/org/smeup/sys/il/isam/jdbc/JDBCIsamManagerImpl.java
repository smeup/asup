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
package org.smeup.sys.il.isam.jdbc;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.isam.QIsamFactory;
import org.smeup.sys.il.isam.QIsamManager;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.ServiceRegistering;

public class JDBCIsamManagerImpl implements QIsamManager {

	@Inject
	private QApplication application;
	@Inject
	private QDataManager dataManager;

	@ServiceRegistering
	public void init() {

		QAdapterFactory adapterFactory = new JDBCIsamAdatpterFactoryImpl();
		application.getContext().registerAdapterFactory(adapterFactory, Index.class);
	}

	@Override
	public QIsamFactory createFactory(QContextProvider contextProvider) {

		QConnection connection = contextProvider.getContext().getAdapter(contextProvider, QConnection.class);

		QDataFactory dataFactory = dataManager.createFactory(contextProvider.getContext());

		return new JDBCIsamFactoryImpl(connection, dataFactory);
	}

}
