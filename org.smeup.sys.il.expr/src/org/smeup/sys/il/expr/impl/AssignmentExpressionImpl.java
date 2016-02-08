/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.il.expr.AssignmentOperator;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionVisitor;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.expr.QTermExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assignment Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.impl.AssignmentExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.impl.AssignmentExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.smeup.sys.il.expr.impl.AssignmentExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements QAssignmentExpression {
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
	protected QTermExpression leftOperand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AssignmentOperator OPERATOR_EDEFAULT = AssignmentOperator.ASSIGN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected AssignmentOperator operator = OPERATOR_EDEFAULT;

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
	protected AssignmentExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.ASSIGNMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(AssignmentOperator newOperator) {
		AssignmentOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QTermExpression getLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperand(QTermExpression newLeftOperand, NotificationChain msgs) {
		QTermExpression oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftOperand(QTermExpression newLeftOperand) {
		if (newLeftOperand != leftOperand) {
			NotificationChain msgs = null;
			if (leftOperand != null)
				msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND, null, msgs);
			if (newLeftOperand != null)
				msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND, null, msgs);
			msgs = basicSetLeftOperand(newLeftOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND, newLeftOperand, newLeftOperand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
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
				msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND, null, msgs);
			if (newRightOperand != null)
				msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND, null, msgs);
			msgs = basicSetRightOperand(newRightOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND, newRightOperand, newRightOperand));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND:
				return basicSetLeftOperand(null, msgs);
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND:
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
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				return getOperator();
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND:
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
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((QTermExpression)newValue);
				return;
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				setOperator((AssignmentOperator)newValue);
				return;
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND:
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
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((QTermExpression)null);
				return;
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND:
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
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__LEFT_OPERAND:
				return leftOperand != null;
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION__RIGHT_OPERAND:
				return rightOperand != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {	
		return super.toString();
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
		return ExpressionType.ASSIGNMENT;
	}
} // AssignmentExpressionImpl