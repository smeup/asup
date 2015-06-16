/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgramStatus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Program Status</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramStatusImpl#getCallableProgram <em>Callable Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramStatusImpl extends ObjectImpl implements QProgramStatus {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getCallableProgram() <em>Callable Program</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCallableProgram()
	 * @generated
	 * @ordered
	 */
	protected QCallableProgram callableProgram;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemProgramPackage.Literals.PROGRAM_STATUS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCallableProgram getCallableProgram() {
		if (callableProgram != null && ((EObject)callableProgram).eIsProxy()) {
			InternalEObject oldCallableProgram = (InternalEObject)callableProgram;
			callableProgram = (QCallableProgram)eResolveProxy(oldCallableProgram);
			if (callableProgram != oldCallableProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemProgramPackage.PROGRAM_STATUS__CALLABLE_PROGRAM, oldCallableProgram, callableProgram));
			}
		}
		return callableProgram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QCallableProgram basicGetCallableProgram() {
		return callableProgram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallableProgram(QCallableProgram newCallableProgram) {
		QCallableProgram oldCallableProgram = callableProgram;
		callableProgram = newCallableProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM_STATUS__CALLABLE_PROGRAM, oldCallableProgram, callableProgram));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_STATUS__CALLABLE_PROGRAM:
				if (resolve) return getCallableProgram();
				return basicGetCallableProgram();
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
			case QOperatingSystemProgramPackage.PROGRAM_STATUS__CALLABLE_PROGRAM:
				setCallableProgram((QCallableProgram)newValue);
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
			case QOperatingSystemProgramPackage.PROGRAM_STATUS__CALLABLE_PROGRAM:
				setCallableProgram((QCallableProgram)null);
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
			case QOperatingSystemProgramPackage.PROGRAM_STATUS__CALLABLE_PROGRAM:
				return callableProgram != null;
		}
		return super.eIsSet(featureID);
	}

} // ProgramStatusImpl
