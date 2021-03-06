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
 * <em><b>Eval</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QEval#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEval#isHalfAdjust <em>Half Adjust</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEval#isMaxPrecision <em>Max Precision</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QEval#isRightAdjust <em>Right Adjust</em>}</li>
 * </ul>
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
	 * Returns the value of the '<em><b>Half Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half Adjust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Half Adjust</em>' attribute.
	 * @see #setHalfAdjust(boolean)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval_HalfAdjust()
	 * @model
	 * @generated
	 */
	boolean isHalfAdjust();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEval#isHalfAdjust <em>Half Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Half Adjust</em>' attribute.
	 * @see #isHalfAdjust()
	 * @generated
	 */
	void setHalfAdjust(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Precision</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Precision</em>' attribute.
	 * @see #setMaxPrecision(boolean)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval_MaxPrecision()
	 * @model default="false"
	 * @generated
	 */
	boolean isMaxPrecision();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEval#isMaxPrecision <em>Max Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Precision</em>' attribute.
	 * @see #isMaxPrecision()
	 * @generated
	 */
	void setMaxPrecision(boolean value);

	/**
	 * Returns the value of the '<em><b>Right Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Adjust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Adjust</em>' attribute.
	 * @see #setRightAdjust(boolean)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getEval_RightAdjust()
	 * @model
	 * @generated
	 */
	boolean isRightAdjust();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QEval#isRightAdjust <em>Right Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Adjust</em>' attribute.
	 * @see #isRightAdjust()
	 * @generated
	 */
	void setRightAdjust(boolean value);

} // QEval
