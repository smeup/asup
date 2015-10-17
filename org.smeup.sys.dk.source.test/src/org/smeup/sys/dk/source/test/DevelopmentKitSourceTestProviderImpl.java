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
package org.smeup.sys.dk.source.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.source.test.runner.SourceTester;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplication;

public class DevelopmentKitSourceTestProviderImpl extends E4TestProviderImpl {

	@Inject
	private QApplication application;
	@Inject
	private QTestManager testManager;

	public void _testDKSource(CommandInterpreter interpreter) throws Exception {

		QContext testContext = application.getContext().createChildContext(this.getClass().getSimpleName());

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, SourceTester.class);
			QTestResult testResult = testRunner.call();
			
			printTestResult(testResult);
		}
		finally {
			if(testContext != null)
				testContext.close();
		}
	
	}
}
