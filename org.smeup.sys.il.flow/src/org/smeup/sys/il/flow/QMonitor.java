/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Monitor</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QMonitor#getBody <em>Body</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QMonitor#getOnErrors <em>On Errors</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMonitor()
 * @model
 * @generated
 */
public interface QMonitor extends QStatement {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(QStatement)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMonitor_Body()
	 * @model containment="true"
	 * @generated
	 */
	QStatement getBody();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QMonitor#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(QStatement value);

	/**
	 * Returns the value of the '<em><b>On Errors</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.flow.QOnError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Errors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Errors</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMonitor_OnErrors()
	 * @model containment="true"
	 * @generated
	 */
	List<QOnError> getOnErrors();
} // Monitor
