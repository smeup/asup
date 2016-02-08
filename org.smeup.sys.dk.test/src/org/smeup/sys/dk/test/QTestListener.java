/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Test Listener</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTestListener {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAssertionResult(QAssertionResult assertionResult);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startTest(QTestRunner test);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void endTest(QTestRunner test);

} // QTestListener
