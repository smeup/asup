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
 * <em><b>Expression Visitor</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getExpressionVisitor()
 * @model abstract="true"
 * @generated
 */
public interface QExpressionVisitor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QAssignmentExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QAtomicTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QBlockExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QBooleanExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QFunctionTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QQualifiedTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QAssignmentExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QAtomicTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QBlockExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QBooleanExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QLogicalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QRelationalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QLogicalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QQualifiedTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QFunctionTermExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QRelationalExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	void endVisit(QArithmeticExpression expression);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	boolean visit(QArithmeticExpression expression);

} // QExpressionVisitor
