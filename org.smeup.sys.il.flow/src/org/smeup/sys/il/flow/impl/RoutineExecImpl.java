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
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QRoutineExec;
import org.smeup.sys.il.flow.QStatementVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Routine Exec</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.impl.RoutineExecImpl#getRoutine <em>Routine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoutineExecImpl extends InvokeImpl implements QRoutineExec {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRoutine() <em>Routine</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoutine()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutine() <em>Routine</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoutine()
	 * @generated
	 * @ordered
	 */
	protected String routine = ROUTINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutineExecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.ROUTINE_EXEC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutine() {
		return routine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutine(String newRoutine) {
		String oldRoutine = routine;
		routine = newRoutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.ROUTINE_EXEC__ROUTINE, oldRoutine, routine));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.ROUTINE_EXEC__ROUTINE:
				return getRoutine();
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
			case QIntegratedLanguageFlowPackage.ROUTINE_EXEC__ROUTINE:
				setRoutine((String)newValue);
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
			case QIntegratedLanguageFlowPackage.ROUTINE_EXEC__ROUTINE:
				setRoutine(ROUTINE_EDEFAULT);
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
			case QIntegratedLanguageFlowPackage.ROUTINE_EXEC__ROUTINE:
				return ROUTINE_EDEFAULT == null ? routine != null : !ROUTINE_EDEFAULT.equals(routine);
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
		result.append(" (routine: ");
		result.append(routine);
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
} // RoutineExecImpl
