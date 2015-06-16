/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Callable Unit</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QCallableUnit#getSetupSection <em>Setup Section</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QCallableUnit#getDataSection <em>Data Section</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QCallableUnit#getFileSection <em>File Section</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QCallableUnit#getFlowSection <em>Flow Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getCallableUnit()
 * @model abstract="true"
 * @generated
 */
public interface QCallableUnit extends QUnit {

	/**
	 * Returns the value of the '<em><b>Data Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Section</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Section</em>' containment reference.
	 * @see #setDataSection(QDataSection)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getCallableUnit_DataSection()
	 * @model containment="true"
	 * @generated
	 */
	QDataSection getDataSection();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QCallableUnit#getDataSection <em>Data Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Section</em>' containment reference.
	 * @see #getDataSection()
	 * @generated
	 */
	void setDataSection(QDataSection value);

	/**
	 * Returns the value of the '<em><b>File Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Section</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Section</em>' containment reference.
	 * @see #setFileSection(QFileSection)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getCallableUnit_FileSection()
	 * @model containment="true"
	 * @generated
	 */
	QFileSection getFileSection();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QCallableUnit#getFileSection <em>File Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Section</em>' containment reference.
	 * @see #getFileSection()
	 * @generated
	 */
	void setFileSection(QFileSection value);

	/**
	 * Returns the value of the '<em><b>Flow Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Section</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Section</em>' containment reference.
	 * @see #setFlowSection(QFlowSection)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getCallableUnit_FlowSection()
	 * @model containment="true"
	 * @generated
	 */
	QFlowSection getFlowSection();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QCallableUnit#getFlowSection <em>Flow Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Section</em>' containment reference.
	 * @see #getFlowSection()
	 * @generated
	 */
	void setFlowSection(QFlowSection value);

	/**
	 * Returns the value of the '<em><b>Setup Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup Section</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup Section</em>' containment reference.
	 * @see #setSetupSection(QSetupSection)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getCallableUnit_SetupSection()
	 * @model containment="true"
	 * @generated
	 */
	QSetupSection getSetupSection();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QCallableUnit#getSetupSection <em>Setup Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup Section</em>' containment reference.
	 * @see #getSetupSection()
	 * @generated
	 */
	void setSetupSection(QSetupSection value);

} // QCallableUnit
