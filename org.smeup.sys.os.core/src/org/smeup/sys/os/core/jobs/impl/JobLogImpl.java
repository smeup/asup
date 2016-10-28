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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QJob Log</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobLogImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobLogImpl extends ObjectNameableImpl implements QJobLog {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected QJob job;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJob getJob() {
		if (job != null && ((EObject)job).eIsProxy()) {
			InternalEObject oldJob = (InternalEObject)job;
			job = (QJob)eResolveProxy(oldJob);
			if (job != oldJob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemJobsPackage.JOB_LOG__JOB, oldJob, job));
			}
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJob basicGetJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJob(QJob newJob) {
		QJob oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB_LOG__JOB, oldJob, job));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemJobsPackage.JOB_LOG__JOB:
				if (resolve) return getJob();
				return basicGetJob();
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
			case QOperatingSystemJobsPackage.JOB_LOG__JOB:
				setJob((QJob)newValue);
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
			case QOperatingSystemJobsPackage.JOB_LOG__JOB:
				setJob((QJob)null);
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
			case QOperatingSystemJobsPackage.JOB_LOG__JOB:
				return job != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getName() {
		if(getJob() != null)
			return getJob().getJobID();
		else
			return null;
	}

} // QJobLogImpl
