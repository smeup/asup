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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.smeup.sys.dk.test.DevelopmentKitTestRuntimeException;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunnerEvent;
import org.smeup.sys.dk.test.QTestSuiteRunner;
import org.smeup.sys.dk.test.QTestUnitRunner;
import org.smeup.sys.dk.test.TestRunnerEventType;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.annotation.TestStopped;
import org.smeup.sys.il.core.ctx.QContext;

public abstract class BaseTestSuiteRunnerImpl extends BaseTestRunnerImpl implements QTestSuiteRunner {

	private QTestManager testManager;
	
	public BaseTestSuiteRunnerImpl(QContext context, QTestManager testManager) {
		super(context);
		this.testManager = testManager;
	}

	/*
	 * Return the list of test classes to execute
	 */
	public abstract Collection<Class<?>> getTestClassList();

	@Override
	public List<QTestResult> call() {

		List<QTestResult> testResults = new ArrayList<QTestResult>();

		QTestRunnerEvent event = QDevelopmentKitTestFactory.eINSTANCE.createTestRunnerEvent();
		event.setSource(this);

		// suite starting
		event.setType(TestRunnerEventType.SUITE_STARTING);
		fireEvent(event);

		// call
		getContext().invoke(this, TestStarted.class);

		for (Class<?> testClass : getTestClassList()) {
			QTestUnitRunner testRunner = testManager.prepareUnitRunner(getContext(), null, testClass);
			QTestResult testResult;
			try {
				testResult = testRunner.call();
				testResults.add(testResult);
			} catch (Exception e) {
				throw new DevelopmentKitTestRuntimeException(e); 
			}
		}

		// suite stopping
		event.setType(TestRunnerEventType.SUITE_STOPPING);
		fireEvent(event);

		// invoke
		getContext().invoke(this, TestStopped.class);

		// suite stopped
		event.setType(TestRunnerEventType.SUITE_STOPPED);
		fireEvent(event);

		return testResults;
	}
}