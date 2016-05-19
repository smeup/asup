/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi	- Initial API and implementation
 */
package org.smeup.sys.il.esam.test;

import java.sql.SQLException;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.annotation.TestStopped;
import org.smeup.sys.dk.test.base.BaseTestSuiteDirectoryRunnerImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QAccessManager;

@Test(category = "ILEsam")
public class ILEsamTestSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	private QConnection connection;

	public ILEsamTestSuiteRunnerImpl(QContext context, QTestManager testManager, String category) {
		super(context, testManager, category);
	}

	@TestStarted
	private void init() throws SQLException {

		QConnectionManager connectionManager = getContext().get(QConnectionManager.class);
		QConnection connection = connectionManager.createConnection(getContext());

		QDataManager dataManager = getContext().get(QDataManager.class);
		QDataContext dataContext = dataManager.createDataContext(getContext(), null);

		QAccessManager accessManager = getContext().get(QAccessManager.class);
		QAccessFactory accessFactory = accessManager.createFactory(connection, dataContext);

		getContext().set(QConnection.class, connection);
		getContext().set(QDataContext.class, dataContext);
		getContext().set(QAccessFactory.class, accessFactory);
	}

	@TestStopped
	private void close() throws SQLException {
		
		if (connection == null)
			return;

		connection.close();
	}
}