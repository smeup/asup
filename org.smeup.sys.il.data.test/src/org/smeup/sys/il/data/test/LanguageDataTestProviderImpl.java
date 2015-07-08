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
package org.smeup.sys.il.data.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.test.runner.DataStructureTester;
import org.smeup.sys.il.data.test.runner.HexadecimalTester;

public class LanguageDataTestProviderImpl extends E4TestProviderImpl {

	@Inject
	private QTestManager testManager;

	public void _testILData(CommandInterpreter interpreter) throws Exception {

		QContext testContext = testManager.prepareContext(this.getClass());

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, DataStructureTester.class);
			QTestResult testResult = testRunner.call();
			printTestResult(testResult);

			testRunner = testManager.prepareRunner(testContext, HexadecimalTester.class);
			testResult = testRunner.call();

			printTestResult(testResult);
		} finally {
			if (testContext != null)
				testContext.close();
		}

	}
}
