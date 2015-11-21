/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import org.smeup.sys.il.core.QNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.QExpression#getExpressionFormat <em>Expression Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface QExpression extends QNode {

	/**
	 * Returns the value of the '<em><b>Expression Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Format</em>' attribute.
	 * @see #setExpressionFormat(String)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getExpression_ExpressionFormat()
	 * @model
	 * @generated
	 */
	String getExpressionFormat();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QExpression#getExpressionFormat <em>Expression Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Format</em>' attribute.
	 * @see #getExpressionFormat()
	 * @generated
	 */
	void setExpressionFormat(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ExpressionType getExpressionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model patternRequired="true"
	 * @generated
	 */
	boolean match(String pattern);

} // QExpression
