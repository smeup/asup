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
 * <em><b>Eval</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QEval#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEval#getRoundingMode <em>Rounding Mode</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEval#getRemainderTarget <em>Remainder Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval()
 * @model
 * @generated
 */
public interface QEval extends QInvoke {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Assignment</em>' attribute.
	 * @see #setAssignment(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval_Assignment()
	 * @model required="true"
	 * @generated
	 */
	String getAssignment();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEval#getAssignment <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' attribute.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(String value);

	/**
	 * Returns the value of the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounding Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding Mode</em>' attribute.
	 * @see #setRoundingMode(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval_RoundingMode()
	 * @model required="true"
	 * @generated
	 */
	String getRoundingMode();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEval#getRoundingMode <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Mode</em>' attribute.
	 * @see #getRoundingMode()
	 * @generated
	 */
	void setRoundingMode(String value);

	/**
	 * Returns the value of the '<em><b>Remainder Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remainder Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remainder Target</em>' attribute.
	 * @see #setRemainderTarget(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval_RemainderTarget()
	 * @model required="true"
	 * @generated
	 */
	String getRemainderTarget();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEval#getRemainderTarget <em>Remainder Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remainder Target</em>' attribute.
	 * @see #getRemainderTarget()
	 * @generated
	 */
	void setRemainderTarget(String value);

} // QEval
