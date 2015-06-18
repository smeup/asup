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
package org.smeup.sys.rt.repo.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.repo.test.runner.RespositoryTester;

public class RuntimeRepositoryTestProviderImpl extends E4TestProviderImpl {


	@Inject
	private QTestManager testManager;

	@Inject
	private QApplicationManager applicationManager;
	
	public void _testRTRepo(CommandInterpreter interpreter) throws Exception {

		QContext testContext = testManager.prepareContext(this.getClass());

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, RespositoryTester.class);
			QTestResult testResult = testRunner.call();
			
			printTestResult(testResult);
		}
		finally {
			if(testContext != null)
				testContext.close();
		}
	}
	
	public void _testRestart(CommandInterpreter interpreter) throws Exception {
		applicationManager.restart();
	}	
}
