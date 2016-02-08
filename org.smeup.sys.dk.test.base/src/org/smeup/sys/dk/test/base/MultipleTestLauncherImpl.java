/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.test.base;

import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.ctx.QContext;

public abstract class MultipleTestLauncherImpl extends BaseTestLauncherImpl {

	@Inject
	QTestManager testManager;

	public MultipleTestLauncherImpl() {
		super();
	}

	@Override
	public void launch(QContext context, String object) {
		
		Collection<Class<?>> testClasses = getTestClassList(object);	
		
		for (Class<?> testClass: testClasses){
						
			QTestRunner testRunner = testManager.prepareRunner(context, testClass);
			QTestResult testResult;
			try {
				testResult = testRunner.call();
				
				// Notify launcher result
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, testResult);
				
				if (breaksOnFirstFailedTest() && testResult.isFailed()) {
					break;
				}
				
			} catch (Exception e) {
				
				QTestResult errorResult = TestLauncherHelper.createErrorResult(this, testRunner, testClass, e.getMessage());
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, errorResult);	
				if (breaksOnFirstFailedTest()) break;
			}
		}
	}
	
	/*
	 * Return the list of test classes to execute
	 */
	public abstract Collection<Class<?>> getTestClassList(String object);
	
	/*
	 * Return true if launcher break on first failed test 
	 */
	public abstract boolean breaksOnFirstFailedTest();

}