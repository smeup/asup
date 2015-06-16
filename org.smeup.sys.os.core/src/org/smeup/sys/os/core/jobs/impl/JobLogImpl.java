/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QJob Log</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobLogImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobLogImpl#getJobID <em>Job ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobLogImpl extends ObjectNameableImpl implements QJobLog {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<QJobLogEntry> entries;

	/**
	 * The default value of the '{@link #getJobID() <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobID()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobID() <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobID()
	 * @generated
	 * @ordered
	 */
	protected String jobID = JOB_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected JobLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemJobsPackage.Literals.JOB_LOG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QJobLogEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<QJobLogEntry>(QJobLogEntry.class, this, QOperatingSystemJobsPackage.JOB_LOG__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobID() {
		return jobID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobID(String newJobID) {
		String oldJobID = jobID;
		jobID = newJobID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB_LOG__JOB_ID, oldJobID, jobID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemJobsPackage.JOB_LOG__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemJobsPackage.JOB_LOG__ENTRIES:
				return getEntries();
			case QOperatingSystemJobsPackage.JOB_LOG__JOB_ID:
				return getJobID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemJobsPackage.JOB_LOG__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends QJobLogEntry>)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB_LOG__JOB_ID:
				setJobID((String)newValue);
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
			case QOperatingSystemJobsPackage.JOB_LOG__ENTRIES:
				getEntries().clear();
				return;
			case QOperatingSystemJobsPackage.JOB_LOG__JOB_ID:
				setJobID(JOB_ID_EDEFAULT);
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
			case QOperatingSystemJobsPackage.JOB_LOG__ENTRIES:
				return entries != null && !entries.isEmpty();
			case QOperatingSystemJobsPackage.JOB_LOG__JOB_ID:
				return JOB_ID_EDEFAULT == null ? jobID != null : !JOB_ID_EDEFAULT.equals(jobID);
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
		result.append(" (jobID: ");
		result.append(jobID);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		return getJobID();
	}

} // QJobLogImpl
