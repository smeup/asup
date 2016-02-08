/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>If</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QIf#getElse <em>Else</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QIf#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getIf()
 * @model
 * @generated
 */
public interface QIf extends QStatement {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getIf_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QIf#getCondition
	 * <em>Condition</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(QStatement)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	QStatement getElse();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QIf#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(QStatement value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(QStatement)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getIf_Then()
	 * @model containment="true"
	 * @generated
	 */
	QStatement getThen();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QIf#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(QStatement value);

} // If
