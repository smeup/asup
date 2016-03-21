/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.test.QTestRunnerEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.QTestRunnerEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunnerEvent()
 * @model
 * @generated
 */
public interface QTestRunnerEvent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(QTestRunner)
	 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunnerEvent_Source()
	 * @model required="true"
	 * @generated
	 */
	QTestRunner getSource();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.test.QTestRunnerEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QTestRunner value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.dk.test.TestRunnerEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.dk.test.TestRunnerEventType
	 * @see #setType(TestRunnerEventType)
	 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunnerEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	TestRunnerEventType getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.test.QTestRunnerEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.dk.test.TestRunnerEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(TestRunnerEventType value);

} // QTestRunnerEvent
