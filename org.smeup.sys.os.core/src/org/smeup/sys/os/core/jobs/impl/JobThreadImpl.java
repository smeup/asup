/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;

import org.smeup.sys.os.core.jobs.JobThreadStatus;
import org.smeup.sys.os.core.jobs.QJobThread;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobThreadImpl#getThreadID <em>Thread ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobThreadImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class JobThreadImpl extends ObjectNameableImpl implements QJobThread {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getThreadID() <em>Thread ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadID()
	 * @generated
	 * @ordered
	 */
	protected static final long THREAD_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getThreadID() <em>Thread ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadID()
	 * @generated
	 * @ordered
	 */
	protected long threadID = THREAD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemJobsPackage.Literals.JOB_THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getThreadID() {
		return threadID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadID(long newThreadID) {
		long oldThreadID = threadID;
		threadID = newThreadID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB_THREAD__THREAD_ID, oldThreadID, threadID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobThreadStatus getThreadStatus() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemJobsPackage.JOB_THREAD__THREAD_ID:
				return getThreadID();
			case QOperatingSystemJobsPackage.JOB_THREAD__NAME:
				return getName();
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
			case QOperatingSystemJobsPackage.JOB_THREAD__THREAD_ID:
				setThreadID((Long)newValue);
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
			case QOperatingSystemJobsPackage.JOB_THREAD__THREAD_ID:
				setThreadID(THREAD_ID_EDEFAULT);
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
			case QOperatingSystemJobsPackage.JOB_THREAD__THREAD_ID:
				return threadID != THREAD_ID_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB_THREAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (threadID: ");
		result.append(threadID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobThreadImpl
