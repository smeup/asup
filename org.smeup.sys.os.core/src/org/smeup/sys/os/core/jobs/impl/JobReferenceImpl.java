/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.core.impl.ObjectImpl;

import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobReferenceImpl#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobReferenceImpl#getJobUser <em>Job User</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobReferenceImpl#getJobName <em>Job Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobReferenceImpl extends ObjectImpl implements QJobReference {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int jobNumber = JOB_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobUser() <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobUser()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobUser() <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobUser()
	 * @generated
	 * @ordered
	 */
	protected String jobUser = JOB_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemJobsPackage.Literals.JOB_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobNumber() {
		return jobNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobNumber(int newJobNumber) {
		int oldJobNumber = jobNumber;
		jobNumber = newJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NUMBER, oldJobNumber, jobNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobUser() {
		return jobUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobUser(String newJobUser) {
		String oldJobUser = jobUser;
		jobUser = newJobUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_USER, oldJobUser, jobUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NAME, oldJobName, jobName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NUMBER:
				return getJobNumber();
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_USER:
				return getJobUser();
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NAME:
				return getJobName();
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
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NUMBER:
				setJobNumber((Integer)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_USER:
				setJobUser((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NAME:
				setJobName((String)newValue);
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
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NUMBER:
				setJobNumber(JOB_NUMBER_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_USER:
				setJobUser(JOB_USER_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NAME:
				setJobName(JOB_NAME_EDEFAULT);
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
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NUMBER:
				return jobNumber != JOB_NUMBER_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_USER:
				return JOB_USER_EDEFAULT == null ? jobUser != null : !JOB_USER_EDEFAULT.equals(jobUser);
			case QOperatingSystemJobsPackage.JOB_REFERENCE__JOB_NAME:
				return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
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
		result.append(" (jobNumber: ");
		result.append(jobNumber);
		result.append(", jobUser: ");
		result.append(jobUser);
		result.append(", jobName: ");
		result.append(jobName);
		result.append(')');
		return result.toString();
	}

} //JobReferenceImpl
