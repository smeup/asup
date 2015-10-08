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
package org.smeup.sys.dk.test.base;

import java.util.List;

import org.smeup.sys.dk.test.DevelopmentKitTestRuntimeException;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QTestRunnerListener;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStopped;
import org.smeup.sys.dk.test.annotation.TestStarting;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.impl.UnitTestRunnerImpl;
import org.smeup.sys.il.core.ctx.QContext;

public class BaseUnitTestRunnerImpl extends UnitTestRunnerImpl {

	private QContext context;
	private String classURI;

	public BaseUnitTestRunnerImpl(QContext context, String classURI) {
		this.context = context;
		this.classURI = classURI;
	}

	@Override
	public QTestResult call() {
		
		List<QTestRunnerListener> listeners = getListeners();
		
			

		Class<?> testClass = context.loadClass(classURI);
		if (testClass == null)
			throw new DevelopmentKitTestRuntimeException("Invalid runner: " + classURI);
		
		//Notify test start
		for (QTestRunnerListener listener: listeners){
			listener.testStarted(testClass.getName());
		}

		// result
		QTestResult testResult = QDevelopmentKitTestFactory.eINSTANCE.createTestResult();
		Test test = testClass.getAnnotation(Test.class);
		testResult.setCategory(test.category());
		testResult.setObject(test.object());
		testResult.setRunner(testClass.getSimpleName());

		QTestAsserter testAsserter = new BaseTestAsserterImpl(testResult, getListeners());
		context.set(QTestAsserter.class, testAsserter);
		context.set(QTestRunner.class, this);

		Object testCase = context.make(testClass);

		// Call test initialization
		try {
			context.invoke(testCase, TestStarting.class);
		} catch (Exception exc) {
			testResult.setFailed(true);
			return testResult;
		}
		// Call test procedure
		long start = System.currentTimeMillis();
		try {
			testAsserter.resetTime();
			context.invoke(testCase, TestStarted.class);
		} catch (Exception exc) {
			testResult.setFailed(true);
		}
		long end = System.currentTimeMillis();
		testResult.setTime(end - start);

		// Call test destroyer

		if (testCase.getClass().getAnnotation(TestStopped.class) != null)
			context.invoke(testCase, TestStopped.class);
		
		//Notify test start
		for (QTestRunnerListener listener: listeners){
			listener.testFinished(testClass.getName(), testResult);
		}
		
		return testResult;
	}

	@Override
	public QContext getContext() {
		return this.context;
	}
}
