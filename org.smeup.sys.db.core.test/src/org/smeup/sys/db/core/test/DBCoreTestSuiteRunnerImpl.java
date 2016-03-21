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
package org.smeup.sys.db.core.test;

import java.sql.SQLException;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.annotation.TestStopped;
import org.smeup.sys.dk.test.base.BaseTestSuiteDirectoryRunnerImpl;
import org.smeup.sys.il.core.ctx.QContext;

@Test(category = "DB.CORE")
public class DBCoreTestSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	private QConnection connection;

	public DBCoreTestSuiteRunnerImpl(QContext context, QTestManager testManager) {
		super(context, testManager);
	}

	@TestStarted
	private void init() throws SQLException {

		QConnectionManager connectionManager = getContext().get(QConnectionManager.class);
		QConnection connection = connectionManager.createConnection(getContext());

		getContext().set(QConnection.class, connection);
	}

	@TestStopped
	private void close() throws SQLException {
		
		if (connection == null)
			return;

		connection.close();
	}
}