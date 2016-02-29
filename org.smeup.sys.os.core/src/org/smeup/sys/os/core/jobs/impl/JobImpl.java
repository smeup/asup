/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QJobRunInfo;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QJob</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getCurrentLibrary <em>Current Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getDateSeparator <em>Date Separator</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobRunInfo <em>Job Run Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobThread <em>Job Thread</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getTimeSeparator <em>Time Separator</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.impl.JobImpl#getVariableContainer <em>Variable Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends ObjectNameableImpl implements QJob {

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCreationInfo()
	 * @generated
	 * @ordered
	 */
	protected QCreationInfo creationInfo;

	/**
	 * The default value of the '{@link #getCurrentLibrary() <em>Current Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCurrentLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_LIBRARY_EDEFAULT = "QGPL";

	/**
	 * The cached value of the '{@link #getCurrentLibrary() <em>Current Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCurrentLibrary()
	 * @generated
	 * @ordered
	 */
	protected String currentLibrary = CURRENT_LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DateFormat DATE_FORMAT_EDEFAULT = DateFormat.DMY;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected DateFormat dateFormat = DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSeparator() <em>Date Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_SEPARATOR_EDEFAULT = "/";

	/**
	 * The cached value of the '{@link #getDateSeparator() <em>Date Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateSeparator()
	 * @generated
	 * @ordered
	 */
	protected String dateSeparator = DATE_SEPARATOR_EDEFAULT;

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
	 * The cached value of the '{@link #getJobReference() <em>Job Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobReference()
	 * @generated
	 * @ordered
	 */
	protected QJobReference jobReference;

	/**
	 * The cached value of the '{@link #getJobRunInfo() <em>Job Run Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRunInfo()
	 * @generated
	 * @ordered
	 */
	protected QJobRunInfo jobRunInfo;

	/**
	 * The cached value of the '{@link #getJobThread() <em>Job Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobThread()
	 * @generated
	 * @ordered
	 */
	protected QThread jobThread;

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
	 * The default value of the '{@link #getSwitches() <em>Switches</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCHES_EDEFAULT = "00000000";

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected String switches = SWITCHES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected QSystem system;

	/**
	 * The default value of the '{@link #getTimeSeparator() <em>Time Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_SEPARATOR_EDEFAULT = ":";

	/**
	 * The cached value of the '{@link #getTimeSeparator() <em>Time Separator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeSeparator()
	 * @generated
	 * @ordered
	 */
	protected String timeSeparator = TIME_SEPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableContainer() <em>Variable Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableContainer()
	 * @generated
	 * @ordered
	 */
	protected QEnvironmentVariableContainer variableContainer;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QSystem basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJobReference getJobReference() {
		return jobReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobReference(QJobReference newJobReference, NotificationChain msgs) {
		QJobReference oldJobReference = jobReference;
		jobReference = newJobReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_REFERENCE, oldJobReference, newJobReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobReference(QJobReference newJobReference) {
		if (newJobReference != jobReference) {
			NotificationChain msgs = null;
			if (jobReference != null)
				msgs = ((InternalEObject)jobReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__JOB_REFERENCE, null, msgs);
			if (newJobReference != null)
				msgs = ((InternalEObject)newJobReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__JOB_REFERENCE, null, msgs);
			msgs = basicSetJobReference(newJobReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_REFERENCE, newJobReference, newJobReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJobRunInfo getJobRunInfo() {
		return jobRunInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobRunInfo(QJobRunInfo newJobRunInfo, NotificationChain msgs) {
		QJobRunInfo oldJobRunInfo = jobRunInfo;
		jobRunInfo = newJobRunInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO, oldJobRunInfo, newJobRunInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobRunInfo(QJobRunInfo newJobRunInfo) {
		if (newJobRunInfo != jobRunInfo) {
			NotificationChain msgs = null;
			if (jobRunInfo != null)
				msgs = ((InternalEObject)jobRunInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO, null, msgs);
			if (newJobRunInfo != null)
				msgs = ((InternalEObject)newJobRunInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO, null, msgs);
			msgs = basicSetJobRunInfo(newJobRunInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO, newJobRunInfo, newJobRunInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QThread getJobThread() {
		return jobThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobThread(QThread newJobThread) {
		QThread oldJobThread = jobThread;
		jobThread = newJobThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__JOB_THREAD, oldJobThread, jobThread));
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
	 * 
	 * @generated NOT
	 */
	@Override
	public JobStatus getJobStatus() {

		QThread thread = getJobThread();
		if(thread == null) {
			if(isActive())
				return JobStatus.ACTIVE;
			else
				return JobStatus.END;
		}

		switch (thread.getThreadStatus()) {
		case NEW:
			return JobStatus.ACTIVE;		
		case TERMINATED:
			if(isActive())
				return JobStatus.ACTIVE;
			else
				return JobStatus.END;
		case RUNNABLE:			
			return JobStatus.RUN;
		case WAITING:
			if(thread.isSuspended())
				return JobStatus.HOLD;
			
			return JobStatus.RUN;
			
			// TODO JobStatus.MESSAGE_WAITING
		case TIMED_WAITING:
			return JobStatus.TIME_WAITING;
		case BLOCKED:
			return JobStatus.LOCK_WAITING;
		}
		
		throw new OperatingSystemRuntimeException("Invalid job status: "+getJobID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getMemorySize() {		
		if(getJobRunInfo() == null)
			return 0;
		
		long memorySize = getJobRunInfo().getMemorySize()/1024/1024;
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getPriority() {
		if(getJobThread() == null)
			return 0;

		return getJobThread().getThreadPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getCPUUsage() {
		if(getJobThread() == null)
			return 0;
		
		return getJobThread().getThreadCPUUsage();
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
	public String getCurrentLibrary() {
		return currentLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setCurrentLibrary(String newCurrentLibrary) {
		String oldCurrentLibrary = currentLibrary;
		if (newCurrentLibrary == null || "".equals(newCurrentLibrary.trim())) {
			currentLibrary = CURRENT_LIBRARY_EDEFAULT;
		} else {
			currentLibrary = newCurrentLibrary;
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__CURRENT_LIBRARY, oldCurrentLibrary, currentLibrary));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(DateFormat newDateFormat) {
		DateFormat oldDateFormat = dateFormat;
		dateFormat = newDateFormat == null ? DATE_FORMAT_EDEFAULT : newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwitches() {
		return switches;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitches(String newSwitches) {
		String oldSwitches = switches;
		switches = newSwitches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__SWITCHES, oldSwitches, switches));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateSeparator() {
		return dateSeparator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSeparator(String newDateSeparator) {
		String oldDateSeparator = dateSeparator;
		dateSeparator = newDateSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__DATE_SEPARATOR, oldDateSeparator, dateSeparator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeSeparator() {
		return timeSeparator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeparator(String newTimeSeparator) {
		String oldTimeSeparator = timeSeparator;
		timeSeparator = newTimeSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__TIME_SEPARATOR, oldTimeSeparator, timeSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEnvironmentVariableContainer getVariableContainer() {
		return variableContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableContainer(QEnvironmentVariableContainer newVariableContainer, NotificationChain msgs) {
		QEnvironmentVariableContainer oldVariableContainer = variableContainer;
		variableContainer = newVariableContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER, oldVariableContainer, newVariableContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableContainer(QEnvironmentVariableContainer newVariableContainer) {
		if (newVariableContainer != variableContainer) {
			NotificationChain msgs = null;
			if (variableContainer != null)
				msgs = ((InternalEObject)variableContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER, null, msgs);
			if (newVariableContainer != null)
				msgs = ((InternalEObject)newVariableContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER, null, msgs);
			msgs = basicSetVariableContainer(newVariableContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER, newVariableContainer, newVariableContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("resource")
	public boolean isActive() {
		QContext context = getContext();
		if (context == null)
			return false;

		if (context.isClosed())
			return false;
		else
			return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isRouted() {
		return getJobThread() != null;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCreationInfo getCreationInfo() {
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case QOperatingSystemJobsPackage.JOB__JOB_REFERENCE:
				return basicSetJobReference(null, msgs);
			case QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO:
				return basicSetJobRunInfo(null, msgs);
			case QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER:
				return basicSetVariableContainer(null, msgs);
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
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				return getContext();
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				return getCreationInfo();
			case QOperatingSystemJobsPackage.JOB__CURRENT_LIBRARY:
				return getCurrentLibrary();
			case QOperatingSystemJobsPackage.JOB__DATE_FORMAT:
				return getDateFormat();
			case QOperatingSystemJobsPackage.JOB__DATE_SEPARATOR:
				return getDateSeparator();
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				return getJobID();
			case QOperatingSystemJobsPackage.JOB__JOB_REFERENCE:
				return getJobReference();
			case QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO:
				return getJobRunInfo();
			case QOperatingSystemJobsPackage.JOB__JOB_THREAD:
				return getJobThread();
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				return getJobType();
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				return getLibraries();
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				return getMessages();
			case QOperatingSystemJobsPackage.JOB__SWITCHES:
				return getSwitches();
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case QOperatingSystemJobsPackage.JOB__TIME_SEPARATOR:
				return getTimeSeparator();
			case QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER:
				return getVariableContainer();
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
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				setContext((QContext)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				setCreationInfo((QCreationInfo)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__CURRENT_LIBRARY:
				setCurrentLibrary((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__DATE_FORMAT:
				setDateFormat((DateFormat)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__DATE_SEPARATOR:
				setDateSeparator((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				setJobID((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_REFERENCE:
				setJobReference((QJobReference)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO:
				setJobRunInfo((QJobRunInfo)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_THREAD:
				setJobThread((QThread)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				setJobType((JobType)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends String>)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends String>)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__SWITCHES:
				setSwitches((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				setSystem((QSystem)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__TIME_SEPARATOR:
				setTimeSeparator((String)newValue);
				return;
			case QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER:
				setVariableContainer((QEnvironmentVariableContainer)newValue);
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
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				setContext((QContext)null);
				return;
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				setCreationInfo((QCreationInfo)null);
				return;
			case QOperatingSystemJobsPackage.JOB__CURRENT_LIBRARY:
				setCurrentLibrary(CURRENT_LIBRARY_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__DATE_SEPARATOR:
				setDateSeparator(DATE_SEPARATOR_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				setJobID(JOB_ID_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_REFERENCE:
				setJobReference((QJobReference)null);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO:
				setJobRunInfo((QJobRunInfo)null);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_THREAD:
				setJobThread((QThread)null);
				return;
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				setJobType(JOB_TYPE_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				getLibraries().clear();
				return;
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				getMessages().clear();
				return;
			case QOperatingSystemJobsPackage.JOB__SWITCHES:
				setSwitches(SWITCHES_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				setSystem((QSystem)null);
				return;
			case QOperatingSystemJobsPackage.JOB__TIME_SEPARATOR:
				setTimeSeparator(TIME_SEPARATOR_EDEFAULT);
				return;
			case QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER:
				setVariableContainer((QEnvironmentVariableContainer)null);
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
			case QOperatingSystemJobsPackage.JOB__CONTEXT:
				return context != null;
			case QOperatingSystemJobsPackage.JOB__CREATION_INFO:
				return creationInfo != null;
			case QOperatingSystemJobsPackage.JOB__CURRENT_LIBRARY:
				return CURRENT_LIBRARY_EDEFAULT == null ? currentLibrary != null : !CURRENT_LIBRARY_EDEFAULT.equals(currentLibrary);
			case QOperatingSystemJobsPackage.JOB__DATE_FORMAT:
				return dateFormat != DATE_FORMAT_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB__DATE_SEPARATOR:
				return DATE_SEPARATOR_EDEFAULT == null ? dateSeparator != null : !DATE_SEPARATOR_EDEFAULT.equals(dateSeparator);
			case QOperatingSystemJobsPackage.JOB__JOB_ID:
				return JOB_ID_EDEFAULT == null ? jobID != null : !JOB_ID_EDEFAULT.equals(jobID);
			case QOperatingSystemJobsPackage.JOB__JOB_REFERENCE:
				return jobReference != null;
			case QOperatingSystemJobsPackage.JOB__JOB_RUN_INFO:
				return jobRunInfo != null;
			case QOperatingSystemJobsPackage.JOB__JOB_THREAD:
				return jobThread != null;
			case QOperatingSystemJobsPackage.JOB__JOB_TYPE:
				return jobType != JOB_TYPE_EDEFAULT;
			case QOperatingSystemJobsPackage.JOB__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case QOperatingSystemJobsPackage.JOB__MESSAGES:
				return messages != null && !messages.isEmpty();
			case QOperatingSystemJobsPackage.JOB__SWITCHES:
				return SWITCHES_EDEFAULT == null ? switches != null : !SWITCHES_EDEFAULT.equals(switches);
			case QOperatingSystemJobsPackage.JOB__SYSTEM:
				return system != null;
			case QOperatingSystemJobsPackage.JOB__TIME_SEPARATOR:
				return TIME_SEPARATOR_EDEFAULT == null ? timeSeparator != null : !TIME_SEPARATOR_EDEFAULT.equals(timeSeparator);
			case QOperatingSystemJobsPackage.JOB__VARIABLE_CONTAINER:
				return variableContainer != null;
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
		result.append(" (currentLibrary: ");
		result.append(currentLibrary);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", dateSeparator: ");
		result.append(dateSeparator);
		result.append(", jobID: ");
		result.append(jobID);
		result.append(", jobType: ");
		result.append(jobType);
		result.append(", libraries: ");
		result.append(libraries);
		result.append(", messages: ");
		result.append(messages);
		result.append(", switches: ");
		result.append(switches);
		result.append(", timeSeparator: ");
		result.append(timeSeparator);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		return getJobID();
	}

} // QJobImpl
