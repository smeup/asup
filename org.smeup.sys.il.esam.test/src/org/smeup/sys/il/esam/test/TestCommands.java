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
package org.smeup.sys.il.esam.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QAccessManager;
import org.smeup.sys.il.esam.test.runner.KSDS_read;
import org.smeup.sys.il.esam.test.runner.KSDS_readp;
import org.smeup.sys.il.esam.test.runner.KSDS_write;
import org.smeup.sys.il.esam.test.runner.RRDS_read;
import org.smeup.sys.il.esam.test.runner.RRDS_readp;

public class TestCommands extends E4TestProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QAccessManager accessManager;
	@Inject
	private QTestManager testManager;

	public void _testILESAM(CommandInterpreter interpreter) throws Exception {

		String catalog = interpreter.nextArgument();

		QConnection connection = connectionManager.createConnection(catalog);
		QDataContext dataContext = dataManager.createDataContext(connection.getContext());
		QAccessFactory accessFactory = accessManager.createFactory(connection, dataContext);

		QContext testContext = connection.getContext().createChildContext("ILESAM");
		testContext.set(QConnection.class, connection);
		testContext.set(QDataContext.class, dataContext);
		testContext.set(QAccessFactory.class, accessFactory);

		QTestRunner testRunner = null;
		QTestResult testResult = null;

		try {
			// RRDS
			testRunner = testManager.prepareRunner(testContext, RRDS_read.class);
			testResult = testRunner.call();
			printTestResult(testResult);

			testRunner = testManager.prepareRunner(testContext, RRDS_readp.class);
			testResult = testRunner.call();
			printTestResult(testResult);

			// KSDS
			testRunner = testManager.prepareRunner(testContext, KSDS_read.class);
			testResult = testRunner.call();
			printTestResult(testResult);

			testRunner = testManager.prepareRunner(testContext, KSDS_readp.class);
			testResult = testRunner.call();
			printTestResult(testResult);

			testRunner = testManager.prepareRunner(testContext, KSDS_write.class);
			testResult = testRunner.call();
			printTestResult(testResult);

		} finally {
			// TODO remove and listen context.close()
			connection.close();

			testContext.close();
		}
	}
}