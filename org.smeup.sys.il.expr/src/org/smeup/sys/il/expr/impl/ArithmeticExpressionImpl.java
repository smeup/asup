/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionVisitor;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Arithmetic Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArithmeticExpressionImpl extends ExpressionImpl implements QArithmeticExpression {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected QExpression leftOperand;
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator OPERATOR_EDEFAULT = ArithmeticOperator.PLUS;
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator operator = OPERATOR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected QExpression rightOperand;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.ARITHMETIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(ArithmeticOperator newOperator) {
		ArithmeticOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QExpression getLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperand(QExpression newLeftOperand, NotificationChain msgs) {
		QExpression oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftOperand(QExpression newLeftOperand) {
		if (newLeftOperand != leftOperand) {
			NotificationChain msgs = null;
			if (leftOperand != null)
				msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND, null, msgs);
			if (newLeftOperand != null)
				msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND, null, msgs);
			msgs = basicSetLeftOperand(newLeftOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND, newLeftOperand, newLeftOperand));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QExpression getRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOperand(QExpression newRightOperand, NotificationChain msgs) {
		QExpression oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightOperand(QExpression newRightOperand) {
		if (newRightOperand != rightOperand) {
			NotificationChain msgs = null;
			if (rightOperand != null)
				msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND, null, msgs);
			if (newRightOperand != null)
				msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND, null, msgs);
			msgs = basicSetRightOperand(newRightOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND, newRightOperand, newRightOperand));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				return basicSetLeftOperand(null, msgs);
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				return basicSetRightOperand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__OPERATOR:
				return getOperator();
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((QExpression)newValue);
				return;
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__OPERATOR:
				setOperator((ArithmeticOperator)newValue);
				return;
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((QExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((QExpression)null);
				return;
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((QExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__LEFT_OPERAND:
				return leftOperand != null;
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION__RIGHT_OPERAND:
				return rightOperand != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void accept(QExpressionVisitor visitor) {

		if (visitor.visit(this)) {

			if (getLeftOperand() != null)
				getLeftOperand().accept(visitor);

			if (getRightOperand() != null)
				getRightOperand().accept(visitor);
		}

		visitor.endVisit(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public ExpressionType getExpressionType() {
		return ExpressionType.ARITHMETIC;
	}
} // ArithmeticExpressionImpl
