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
package org.smeup.sys.il.core.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.base.BaseTestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.test.runner.FrameTester;
import org.smeup.sys.rt.core.QApplication;

public class LanguageCoreTestProviderImpl extends BaseTestProviderImpl {
	
	@Inject
	private QApplication application;
	@Inject
	private QTestManager testManager;

	public void _testILCore(CommandInterpreter interpreter) throws Exception {

		QContext testContext = application.getContext().createChildContext(this.getClass().getSimpleName());

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, FrameTester.class);
			QTestResult testResult = testRunner.call();

			printTestResult(testResult);
		} finally {
			if (testContext != null)
				testContext.close();
		}

	}
}
