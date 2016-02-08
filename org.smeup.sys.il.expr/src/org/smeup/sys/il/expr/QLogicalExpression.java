/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Logic Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.QLogicalExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.QLogicalExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.QLogicalExpression#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getLogicalExpression()
 * @model
 * @generated
 */
public interface QLogicalExpression extends QPredicateExpression {

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.expr.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.smeup.sys.il.expr.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getLogicalExpression_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.expr.QLogicalExpression#getOperator
	 * <em>Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Operator</em>' attribute.
	 * @see org.smeup.sys.il.expr.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(QExpression)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getLogicalExpression_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QExpression getLeftOperand();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QLogicalExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(QExpression value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(QExpression)
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getLogicalExpression_RightOperand()
	 * @model containment="true"
	 * @generated
	 */
	QExpression getRightOperand();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.expr.QLogicalExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(QExpression value);
} // QLogicExpression
