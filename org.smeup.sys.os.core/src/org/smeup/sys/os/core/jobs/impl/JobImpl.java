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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QJob</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobUser <em>Job User</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobImpl extends ObjectNameableImpl implements QJob {

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected QSystem system;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected QContext context;

	/**
	 * The cached value of the '{@link #getCreationInfo() <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationInfo()
	 * @generated
	 * @ordered
	 */
	protected QCreationInfo creationInfo;

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
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int jobNumber = JOB_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected static final JobStatus JOB_STATUS_EDEFAULT = JobStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected JobStatus jobStatus = JOB_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobType()
	 * @generated
	 * @ordered
	 */
	protected static final JobType JOB_TYPE_EDEFAULT = JobType.KERNEL;

	/**
	 * The cached value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobType()
	 * @generated
	 * @ordered
	 */
	protected JobType jobType = JOB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobUser() <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobUser()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobUser() <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJobUser()
	 * @generated
	 * @ordered
	 */
	protected String jobUser = JOB_USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<String> libraries;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemJobsPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSystem getSystem() {
		if (system != null && ((EObject)system).eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (QSystem)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemJobsPackage.JOB__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSystem basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(QSystem newSystem) {
		QSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__SYSTEM, oldSystem, system));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_ID, oldJobID, jobID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_NAME, oldJobName, jobName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobUser() {
		return jobUser;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobUser(String newJobUser) {
		String oldJobUser = jobUser;
		jobUser = newJobUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_USER, oldJobUser, jobUser));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJobNumber() {
		return jobNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobNumber(int newJobNumber) {
		int oldJobNumber = jobNumber;
		jobNumber = newJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_NUMBER, oldJobNumber, jobNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobType getJobType() {
		return jobType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobType(JobType newJobType) {
		JobType oldJobType = jobType;
		jobType = newJobType == null ? JOB_TYPE_EDEFAULT : newJobType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_TYPE, oldJobType, jobType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobStatus getJobStatus() {
		return jobStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobStatus(JobStatus newJobStatus) {
		JobStatus oldJobStatus = jobStatus;
		jobStatus = newJobStatus == null ? JOB_STATUS_EDEFAULT : newJobStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_STATUS, oldJobStatus, jobStatus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getLibraries() {
		if (libraries == null) {
			libraries = new EDataTypeUniqueEList<String>(String.class, this, QOperatingSystemJobsPackage.JOB__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getMessages() {
		if (messages == null) {
			messages = new EDataTypeUniqueEList<String>(String.class, this, QOperatingSystemJobsPackage.JOB__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(QContext newContext, NotificationChain msgs) {
		QContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(QContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCreationInfo getCreationInfo() {
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationInfo(QCreationInfo newCreationInfo, NotificationChain msgs) {
		QCreationInfo oldCreationInfo = creationInfo;
		creationInfo = newCreationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__CREATION_INFO, oldCreationInfo, newCreationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationInfo(QCreationInfo newCreationInfo) {
		if (newCreationInfo != creationInfo) {
			NotificationChain msgs = null;
			if (creationInfo != null)
				msgs = ((InternalEObject)creationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__CREATION_INFO, null, msgs);
			if (newCreationInfo != null)
				msgs = ((InternalEObject)newCreationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__CREATION_INFO, null, msgs);
			msgs = basicSetCreationInfo(newCreationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__CREATION_INFO, newCreationInfo, newCreationInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				return basicSetContext(null, msgs);
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				return basicSetCreationInfo(null, msgs);
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
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				return getContext();
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				return getCreationInfo();
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				return getJobID();
			case QOperatingSystemJobsPackage.JOB__JOB_NAME:
				return getJobName();
			case QOperatingSystemJobsPackage.JOB__JOB_NUMBER:
				return getJobNumber();
			case QOperatingSystemJobsPackage.JOB__JOB_STATUS:
				return getJobStatus();
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				return getJobType();
			case QOperatingSystemJobsPackage.JOB__JOB_USER:
				return getJobUser();
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				return getLibraries();
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				return getMessages();
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
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				setSystem((QSystem)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				setContext((QContext)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				setCreationInfo((QCreationInfo)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				setJobID((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_NAME:
				setJobName((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_NUMBER:
				setJobNumber((Integer)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_STATUS:
				setJobStatus((JobStatus)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				setJobType((JobType)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_USER:
				setJobUser((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends String>)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends String>)newValue);
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
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				setSystem((QSystem)null);
				return;
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				setContext((QContext)null);
				return;
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				setCreationInfo((QCreationInfo)null);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				setJobID(JOB_ID_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_NAME:
				setJobName(JOB_NAME_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_NUMBER:
				setJobNumber(JOB_NUMBER_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_STATUS:
				setJobStatus(JOB_STATUS_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				setJobType(JOB_TYPE_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_USER:
				setJobUser(JOB_USER_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				getLibraries().clear();
				return;
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				getMessages().clear();
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
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				return system != null;
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				return context != null;
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				return creationInfo != null;
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				return JOB_ID_EDEFAULT == null ? jobID != null : !JOB_ID_EDEFAULT.equals(jobID);
			case QOperatingSystemJobsPackage.JOB__JOB_NAME:
				return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
			case QOperatingSystemJobsPackage.JOB__JOB_NUMBER:
				return jobNumber != JOB_NUMBER_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB__JOB_STATUS:
				return jobStatus != JOB_STATUS_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				return jobType != JOB_TYPE_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB__JOB_USER:
				return JOB_USER_EDEFAULT == null ? jobUser != null : !JOB_USER_EDEFAULT.equals(jobUser);
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				return messages != null && !messages.isEmpty();
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
		result.append(", jobName: ");
		result.append(jobName);
		result.append(", jobNumber: ");
		result.append(jobNumber);
		result.append(", jobStatus: ");
		result.append(jobStatus);
		result.append(", jobType: ");
		result.append(jobType);
		result.append(", jobUser: ");
		result.append(jobUser);
		result.append(", libraries: ");
		result.append(libraries);
		result.append(", messages: ");
		result.append(messages);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String getName() {
		return getJobID();
	}

} // QJobImpl
