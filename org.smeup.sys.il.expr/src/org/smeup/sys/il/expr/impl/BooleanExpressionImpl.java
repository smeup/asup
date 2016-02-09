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
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionVisitor;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Boolean Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.impl.BooleanExpressionImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExpressionImpl extends PredicateExpressionImpl implements QBooleanExpression {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected QExpression operand;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QExpression getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(QExpression newOperand, NotificationChain msgs) {
		QExpression oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND, oldOperand, newOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperand(QExpression newOperand) {
		if (newOperand != operand) {
			NotificationChain msgs = null;
			if (operand != null)
				msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND, null, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND, null, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND, newOperand, newOperand));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND:
				return basicSetOperand(null, msgs);
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
			case QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND:
				return getOperand();
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
			case QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND:
				setOperand((QExpression)newValue);
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
			case QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND:
				setOperand((QExpression)null);
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
			case QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION__OPERAND:
				return operand != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public ExpressionType getExpressionType() {
		return ExpressionType.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void accept(QExpressionVisitor visitor) {

		if (visitor.visit(this))
			if (getOperand() != null)
				getOperand().accept(visitor);

		visitor.endVisit(this);
	}
} // BooleanExpressionImpl
