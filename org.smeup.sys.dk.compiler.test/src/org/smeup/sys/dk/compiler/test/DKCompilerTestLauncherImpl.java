package org.smeup.sys.dk.compiler.test;
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


import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.base.BaseTestLauncherImpl;
import org.smeup.sys.dk.test.base.TestLauncherHelper;
import org.smeup.sys.il.core.ctx.QContext;

@Test(category = "DKCOMPILER")
public class DKCompilerTestLauncherImpl extends BaseTestLauncherImpl{
	
	@Inject
	QTestManager testManager;

	public void launch(String object) {
		
		// Notify launcher start
		TestLauncherHelper.notifyLauncherStarted(this);
		
		Collection<Class<?>> testRunners = TestLauncherHelper.findTestClasses(this, "/runner/", object);		
		
		for (Class<?> testRunnerClass: testRunners){
			
			QContext testContext = testManager.prepareContext(testRunnerClass);
			QTestRunner testRunner = testManager.prepareRunner(testContext, testRunnerClass);
			QTestResult testResult;
			try {
				testResult = testRunner.call();
				
				// Notify launcher result
				TestLauncherHelper.notifyResultAdded(this, testRunner, testResult);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// Notify launcher stop
		TestLauncherHelper.notifyLauncherStopped(this);
	}	
}

