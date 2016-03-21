/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti	- Initial API and implementation
 */
package org.smeup.sys.dk.test.base;

import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QAssertionSuccess;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestResult;

public class BaseTestAsserterImpl implements QTestAsserter {

	private QTestResult testResult;
	private long time;

	public BaseTestAsserterImpl(QTestResult testResult) {
		this.testResult = testResult;
		resetTime();
	}

	/**
	 * Asserts that a condition is true. If it isn't it throws an
	 * AssertionFailedError with the given message.
	 */
	@Override
	public void assertTrue(String message, boolean condition) {
		if (condition)
			success(message);
		else
			fail(message);
	}

	/**
	 * Asserts that a condition is false. If it isn't it throws an
	 * AssertionFailedError with the given message.
	 */
	public void assertFalse(String message, boolean condition) {
		assertTrue(message, !condition);
	}

	/**
	 * Asserts that two objects are equal. If they are not an
	 * AssertionFailedError is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, Object expected, Object actual) {
		if (expected == null && actual == null)
			return;
		if (expected != null && expected.equals(actual))
			successEquals(message, expected, actual);
		else
			failNotEquals(message, expected, actual);
	}

	/**
	 * Asserts that two Strings are equal.
	 */
	@Override
	public void assertEquals(String message, String expected, String actual) {
		if (expected == null && actual == null)
			return;
		if (expected != null && expected.equals(actual))
			successEquals(message, expected, actual);
		else
			failNotEquals(message, expected, actual);
	}

	/**
	 * Asserts that two doubles are equal concerning a delta. If they are not an
	 * AssertionFailedError is thrown with the given message. If the expected
	 * value is infinity then the delta value is ignored.
	 */
	@Override
	public void assertEquals(String message, double expected, double actual, double delta) {
		if (Double.compare(expected, actual) == 0 || Math.abs(expected - actual) <= delta)
			successEquals(message, new Double(expected), new Double(actual));
		else
			failNotEquals(message, new Double(expected), new Double(actual));
	}

	/**
	 * Asserts that two floats are equal concerning a positive delta. If they
	 * are not an AssertionFailedError is thrown with the given message. If the
	 * expected value is infinity then the delta value is ignored.
	 */
	@Override
	public void assertEquals(String message, float expected, float actual, float delta) {
		if (Float.compare(expected, actual) == 0 || Math.abs(expected - actual) <= delta)
			successEquals(message, new Float(expected), new Float(actual));
		else
			failNotEquals(message, new Float(expected), new Float(actual));
	}

	/**
	 * Asserts that two longs are equal. If they are not an AssertionFailedError
	 * is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, long expected, long actual) {
		assertEquals(message, new Long(expected), new Long(actual));
	}

	/**
	 * Asserts that two booleans are equal. If they are not an
	 * AssertionFailedError is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, boolean expected, boolean actual) {
		assertEquals(message, Boolean.valueOf(expected), Boolean.valueOf(actual));
	}

	/**
	 * Asserts that two bytes are equal. If they are not an AssertionFailedError
	 * is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, byte expected, byte actual) {
		assertEquals(message, new Byte(expected), new Byte(actual));
	}

	/**
	 * Asserts that two chars are equal. If they are not an AssertionFailedError
	 * is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, char expected, char actual) {
		assertEquals(message, new Character(expected), new Character(actual));
	}

	/**
	 * Asserts that two shorts are equal. If they are not an
	 * AssertionFailedError is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, short expected, short actual) {
		assertEquals(message, new Short(expected), new Short(actual));
	}

	/**
	 * Asserts that two ints are equal. If they are not an AssertionFailedError
	 * is thrown with the given message.
	 */
	@Override
	public void assertEquals(String message, int expected, int actual) {
		assertEquals(message, new Integer(expected), new Integer(actual));
	}

	/**
	 * Asserts that an object isn't null. If it is an AssertionFailedError is
	 * thrown with the given message.
	 */
	@Override
	public void assertNotNull(String message, Object object) {
		assertTrue(message, object != null);
	}

	/**
	 * Asserts that an object is null. If it is not an AssertionFailedError is
	 * thrown with the given message.
	 */
	@Override
	public void assertNull(String message, Object object) {
		assertTrue(message, object == null);
	}

	/**
	 * Asserts that two objects refer to the same object. If they are not an
	 * AssertionFailedError is thrown with the given message.
	 */
	@Override
	public void assertSame(String message, Object expected, Object actual) {
		if (expected == actual)
			successSame(message);
		else
			failNotSame(message, expected, actual);
	}

	/**
	 * Asserts that two objects do not refer to the same object. If they do
	 * refer to the same object an AssertionFailedError is thrown with the given
	 * message.
	 */
	@Override
	public void assertNotSame(String message, Object expected, Object actual) {
		if (expected == actual)
			failSame(message);
		else
			successNotSame(message, expected, actual);

	}

	public void failSame(String message) {
		String formatted = (message != null) ? message + " " : "";
		fail(formatted + "expected not same");
	}

	public void failNotSame(String message, Object expected, Object actual) {
		String formatted = (message != null) ? message + " " : "";
		fail(formatted + "expected same:<" + expected + "> was not:<" + actual + ">");
	}

	public void successSame(String message) {
		String formatted = (message != null) ? message + " " : "";
		success(formatted + "as expected same");
	}

	public void successNotSame(String message, Object expected, Object actual) {
		String formatted = (message != null) ? message + " " : "";
		success(formatted + "expected not same:<" + expected + "> was not :<" + actual + "> as expected");
	}

	/**
	 * Fails a test with the given message.
	 *
	 * @throws FrameworkTestFailureError
	 */
	@Override
	public void fail(String message) {

		// Create fail assertion
		QAssertionFailed assertionFailed = QDevelopmentKitTestFactory.eINSTANCE.createAssertionFailed();
		assertionFailed.setMessage(message);
		assertionFailed.setTime(System.currentTimeMillis() - time);
		testResult.getAssertResults().add(assertionFailed);

		resetTime();
	}

	/**
	 * Fails a test with the given message.
	 */
	public void failNotEquals(String message, Object expected, Object actual) {
		fail(formatFailMessage(message, expected, actual));
	}

	
	public void success(String message) {

		// Create fail assertion
		QAssertionSuccess assertionSuccess = QDevelopmentKitTestFactory.eINSTANCE.createAssertionSuccess();
		assertionSuccess.setMessage(message);
		assertionSuccess.setTime(System.currentTimeMillis() - time);
		testResult.getAssertResults().add(assertionSuccess);

		resetTime();
	}

	public void successEquals(String message, Object expected, Object actual) {
		success(formatSuccessMessage(message, expected, actual));
	}

	public static String formatSuccessMessage(String message, Object expected, Object actual) {
		String formatted = "";
		if (message != null && message.length() > 0)
			formatted = message + " ";
		return formatted + "expected:<" + expected + "> was:<" + actual + ">";
	}

	public static String formatFailMessage(String message, Object expected, Object actual) {
		String formatted = "";
		if (message != null && message.length() > 0)
			formatted = message + " ";
		return formatted + "expected:<" + expected + "> but was:<" + actual + ">";
	}

	@Override
	public void resetTime() {
		time = System.currentTimeMillis();
	}
}
