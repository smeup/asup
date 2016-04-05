/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QStatementVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eval</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.impl.EvalImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.EvalImpl#isHalfAdjust <em>Half Adjust</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.EvalImpl#isMaxPrecision <em>Max Precision</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.EvalImpl#isRightAdjust <em>Right Adjust</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvalImpl extends InvokeImpl implements QEval {
	/**
	 * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected String assignment = ASSIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHalfAdjust() <em>Half Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHalfAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HALF_ADJUST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHalfAdjust() <em>Half Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHalfAdjust()
	 * @generated
	 * @ordered
	 */
	protected boolean halfAdjust = HALF_ADJUST_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxPrecision() <em>Max Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_PRECISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxPrecision() <em>Max Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxPrecision()
	 * @generated
	 * @ordered
	 */
	protected boolean maxPrecision = MAX_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRightAdjust() <em>Right Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHT_ADJUST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRightAdjust() <em>Right Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightAdjust()
	 * @generated
	 * @ordered
	 */
	protected boolean rightAdjust = RIGHT_ADJUST_EDEFAULT;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EvalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.EVAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignment(String newAssignment) {
		String oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.EVAL__ASSIGNMENT, oldAssignment, assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHalfAdjust() {
		return halfAdjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHalfAdjust(boolean newHalfAdjust) {
		boolean oldHalfAdjust = halfAdjust;
		halfAdjust = newHalfAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.EVAL__HALF_ADJUST, oldHalfAdjust, halfAdjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxPrecision() {
		return maxPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPrecision(boolean newMaxPrecision) {
		boolean oldMaxPrecision = maxPrecision;
		maxPrecision = newMaxPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.EVAL__MAX_PRECISION, oldMaxPrecision, maxPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRightAdjust() {
		return rightAdjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightAdjust(boolean newRightAdjust) {
		boolean oldRightAdjust = rightAdjust;
		rightAdjust = newRightAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.EVAL__RIGHT_ADJUST, oldRightAdjust, rightAdjust));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.EVAL__ASSIGNMENT:
				return getAssignment();
			case QIntegratedLanguageFlowPackage.EVAL__HALF_ADJUST:
				return isHalfAdjust();
			case QIntegratedLanguageFlowPackage.EVAL__MAX_PRECISION:
				return isMaxPrecision();
			case QIntegratedLanguageFlowPackage.EVAL__RIGHT_ADJUST:
				return isRightAdjust();
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
			case QIntegratedLanguageFlowPackage.EVAL__ASSIGNMENT:
				setAssignment((String)newValue);
				return;
			case QIntegratedLanguageFlowPackage.EVAL__HALF_ADJUST:
				setHalfAdjust((Boolean)newValue);
				return;
			case QIntegratedLanguageFlowPackage.EVAL__MAX_PRECISION:
				setMaxPrecision((Boolean)newValue);
				return;
			case QIntegratedLanguageFlowPackage.EVAL__RIGHT_ADJUST:
				setRightAdjust((Boolean)newValue);
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
			case QIntegratedLanguageFlowPackage.EVAL__ASSIGNMENT:
				setAssignment(ASSIGNMENT_EDEFAULT);
				return;
			case QIntegratedLanguageFlowPackage.EVAL__HALF_ADJUST:
				setHalfAdjust(HALF_ADJUST_EDEFAULT);
				return;
			case QIntegratedLanguageFlowPackage.EVAL__MAX_PRECISION:
				setMaxPrecision(MAX_PRECISION_EDEFAULT);
				return;
			case QIntegratedLanguageFlowPackage.EVAL__RIGHT_ADJUST:
				setRightAdjust(RIGHT_ADJUST_EDEFAULT);
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
			case QIntegratedLanguageFlowPackage.EVAL__ASSIGNMENT:
				return ASSIGNMENT_EDEFAULT == null ? assignment != null : !ASSIGNMENT_EDEFAULT.equals(assignment);
			case QIntegratedLanguageFlowPackage.EVAL__HALF_ADJUST:
				return halfAdjust != HALF_ADJUST_EDEFAULT;
			case QIntegratedLanguageFlowPackage.EVAL__MAX_PRECISION:
				return maxPrecision != MAX_PRECISION_EDEFAULT;
			case QIntegratedLanguageFlowPackage.EVAL__RIGHT_ADJUST:
				return rightAdjust != RIGHT_ADJUST_EDEFAULT;
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
		result.append(" (assignment: ");
		result.append(assignment);
		result.append(", halfAdjust: ");
		result.append(halfAdjust);
		result.append(", maxPrecision: ");
		result.append(maxPrecision);
		result.append(", rightAdjust: ");
		result.append(rightAdjust);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void accept(QStatementVisitor visitor) {
		visitor.visit(this);
	}
} // EvalImpl
