/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;

import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgramInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramInfoImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramInfoImpl#getLoadTime <em>Load Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramInfoImpl#getCallTime <em>Call Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramInfoImpl extends ObjectImpl implements QProgramInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final long MEMORY_SIZE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected long memorySize = MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadTime() <em>Load Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LOAD_TIME_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLoadTime() <em>Load Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTime()
	 * @generated
	 * @ordered
	 */
	protected long loadTime = LOAD_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getCallTime() <em>Call Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CALL_TIME_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getCallTime() <em>Call Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTime()
	 * @generated
	 * @ordered
	 */
	protected long callTime = CALL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemProgramPackage.Literals.PROGRAM_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(long newMemorySize) {
		long oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM_INFO__MEMORY_SIZE, oldMemorySize, memorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLoadTime() {
		return loadTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadTime(long newLoadTime) {
		long oldLoadTime = loadTime;
		loadTime = newLoadTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM_INFO__LOAD_TIME, oldLoadTime, loadTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCallTime() {
		return callTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallTime(long newCallTime) {
		long oldCallTime = callTime;
		callTime = newCallTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM_INFO__CALL_TIME, oldCallTime, callTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_INFO__MEMORY_SIZE:
				return getMemorySize();
			case QOperatingSystemProgramPackage.PROGRAM_INFO__LOAD_TIME:
				return getLoadTime();
			case QOperatingSystemProgramPackage.PROGRAM_INFO__CALL_TIME:
				return getCallTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_INFO__MEMORY_SIZE:
				setMemorySize((Long)newValue);
				return;
			case QOperatingSystemProgramPackage.PROGRAM_INFO__LOAD_TIME:
				setLoadTime((Long)newValue);
				return;
			case QOperatingSystemProgramPackage.PROGRAM_INFO__CALL_TIME:
				setCallTime((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_INFO__MEMORY_SIZE:
				setMemorySize(MEMORY_SIZE_EDEFAULT);
				return;
			case QOperatingSystemProgramPackage.PROGRAM_INFO__LOAD_TIME:
				setLoadTime(LOAD_TIME_EDEFAULT);
				return;
			case QOperatingSystemProgramPackage.PROGRAM_INFO__CALL_TIME:
				setCallTime(CALL_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_INFO__MEMORY_SIZE:
				return memorySize != MEMORY_SIZE_EDEFAULT;
			case QOperatingSystemProgramPackage.PROGRAM_INFO__LOAD_TIME:
				return loadTime != LOAD_TIME_EDEFAULT;
			case QOperatingSystemProgramPackage.PROGRAM_INFO__CALL_TIME:
				return callTime != CALL_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (memorySize: ");
		result.append(memorySize);
		result.append(", loadTime: ");
		result.append(loadTime);
		result.append(", callTime: ");
		result.append(callTime);
		result.append(')');
		return result.toString();
	}

} //ProgramInfoImpl
