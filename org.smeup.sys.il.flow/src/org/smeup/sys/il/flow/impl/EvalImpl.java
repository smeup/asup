/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.impl.EvalImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.EVAL__ASSIGNMENT:
				return getAssignment();
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
