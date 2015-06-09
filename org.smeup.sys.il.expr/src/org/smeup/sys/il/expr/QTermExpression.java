/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.QTermExpression#isFunction <em>Function</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.QTermExpression#isSpecial <em>Special</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.QTermExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getTermExpression()
 * @model abstract="true"
 * @generated
 */
public interface QTermExpression extends QExpression {

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(boolean)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getTermExpression_Function()
	 * @model
	 * @generated
	 */
	boolean isFunction();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QTermExpression#isFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #isFunction()
	 * @generated
	 */
	void setFunction(boolean value);

	/**
	 * Returns the value of the '<em><b>Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' attribute.
	 * @see #setSpecial(boolean)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getTermExpression_Special()
	 * @model
	 * @generated
	 */
	boolean isSpecial();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QTermExpression#isSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special</em>' attribute.
	 * @see #isSpecial()
	 * @generated
	 */
	void setSpecial(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getTermExpression_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QTermExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);
} // QTermExpression
