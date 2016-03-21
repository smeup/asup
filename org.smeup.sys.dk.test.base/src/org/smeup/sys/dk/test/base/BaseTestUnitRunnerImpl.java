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
package org.smeup.sys.dk.test.base;

import org.smeup.sys.dk.test.DevelopmentKitTestRuntimeException;
import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QTestRunnerEvent;
import org.smeup.sys.dk.test.QTestUnitRunner;
import org.smeup.sys.dk.test.TestRunnerEventType;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.annotation.TestStopped;
import org.smeup.sys.il.core.ctx.QContext;

public class BaseTestUnitRunnerImpl extends BaseTestRunnerImpl implements QTestUnitRunner {

	private String classURI;

	public BaseTestUnitRunnerImpl(QContext context, String classURI) {
		super(context);
		this.classURI = classURI;
	}

	@Override
	public QTestResult call() {

		Class<?> testClass = getContext().loadClass(classURI);
		if (testClass == null)
			throw new DevelopmentKitTestRuntimeException("Invalid runner: " + classURI);

		// result
		QTestResult testResult = QDevelopmentKitTestFactory.eINSTANCE.createTestResult();

		Test test = testClass.getAnnotation(Test.class);
		testResult.setCategory(test.category());
		testResult.setObject(test.object());
		testResult.setRunner(testClass.getSimpleName());

		QTestAsserter testAsserter = new BaseTestAsserterImpl(testResult);
		getContext().set(QTestAsserter.class, testAsserter);
		getContext().set(QTestResult.class, testResult);
		getContext().set(QTestRunner.class, this);
		

		QTestRunnerEvent event = QDevelopmentKitTestFactory.eINSTANCE.createTestRunnerEvent();
		event.setSource(this);

		long start = System.currentTimeMillis();
		testAsserter.resetTime();
		try {
			// unit starting
			event.setType(TestRunnerEventType.UNIT_STARTING);
			fireEvent(event);

			// call
			Object testCase = getContext().make(testClass);
			getContext().invoke(testCase, TestStarted.class);

			// unit stopping
			event.setType(TestRunnerEventType.UNIT_STOPPING);
			fireEvent(event);

			// invoke
			getContext().invoke(testCase, TestStopped.class);

			// unit stopped
			event.setType(TestRunnerEventType.UNIT_STOPPED);
			fireEvent(event);

		} catch (Exception e) {
			QAssertionFailed assertionFailed = QDevelopmentKitTestFactory.eINSTANCE.createAssertionFailed();
			assertionFailed.setMessage(e.getMessage());
			testResult.getAssertResults().add(assertionFailed);
		} finally {
			long end = System.currentTimeMillis();
			testResult.setTime(end - start);
		}

		return testResult;
	}
}
