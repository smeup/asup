/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Boolean Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.QBooleanExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface QBooleanExpression extends QPredicateExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(QExpression)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getBooleanExpression_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QExpression getOperand();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QBooleanExpression#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(QExpression value);

} // QBooleanExpression
