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
package org.smeup.sys.il.expr.ibmi.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.expr.ibmi.test.runner.CLExpressionTester;
import org.smeup.sys.il.expr.ibmi.test.runner.RPGExpressionTester;
import org.smeup.sys.rt.core.QApplication;

public class LanguageExpressionTestProviderImpl extends E4TestProviderImpl {

	@Inject
	private QTestManager testManager;
	@Inject
	private QApplication application;

	public void _testILExpr(CommandInterpreter interpreter) throws Exception {

		QContext testContext = application.getContext().createChildContext(this.getClass().getSimpleName());

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, RPGExpressionTester.class);
			QTestResult testResult = testRunner.call();
			printTestResult(testResult);

			testRunner = testManager.prepareRunner(testContext, CLExpressionTester.class);
			testResult = testRunner.call();
			printTestResult(testResult);
		} finally {
			if (testContext != null)
				testContext.close();
		}

	}
}
