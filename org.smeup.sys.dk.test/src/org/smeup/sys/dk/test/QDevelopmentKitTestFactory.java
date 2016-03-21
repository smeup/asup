/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage
 * @generated
 */
public interface QDevelopmentKitTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitTestFactory eINSTANCE = org.smeup.sys.dk.test.impl.DevelopmentKitTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assertion Failed</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assertion Failed</em>'.
	 * @generated
	 */
	QAssertionFailed createAssertionFailed();

	/**
	 * Returns a new object of class '<em>Assertion Success</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assertion Success</em>'.
	 * @generated
	 */
	QAssertionSuccess createAssertionSuccess();

	/**
	 * Returns a new object of class '<em>Test Runner Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Runner Event</em>'.
	 * @generated
	 */
	QTestRunnerEvent createTestRunnerEvent();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	QTestResult createTestResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDevelopmentKitTestPackage getDevelopmentKitTestPackage();

} // QFrameworkTestFactory
