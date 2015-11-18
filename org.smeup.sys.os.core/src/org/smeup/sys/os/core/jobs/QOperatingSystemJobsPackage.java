/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemJobsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/core/jobs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-jobs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemJobsPackage eINSTANCE = org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.impl.JobImpl
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SYSTEM = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTEXT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CREATION_INFO = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_ID = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_NUMBER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Job Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_STATUS = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Job Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_TYPE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_USER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LIBRARIES = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__MESSAGES = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Current Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CURRENT_LIBRARY = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SWITCHES = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Job Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_DATE_FORMAT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Date Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DATE_SEPARATOR = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Time Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TIME_SEPARATOR = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__VARIABLES = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.impl.JobLogImpl <em>Job Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.impl.JobLogImpl
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLog()
	 * @generated
	 */
	int JOB_LOG = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.impl.JobLogEntryImpl <em>Job Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.impl.JobLogEntryImpl
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogEntry()
	 * @generated
	 */
	int JOB_LOG_ENTRY = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.QJobLogManager <em>Job Log Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.QJobLogManager
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogManager()
	 * @generated
	 */
	int JOB_LOG_MANAGER = 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.QJobManager <em>Job Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.QJobManager
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobManager()
	 * @generated
	 */
	int JOB_MANAGER = 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.QJobListener <em>Job Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.QJobListener
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobListener()
	 * @generated
	 */
	int JOB_LISTENER = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.impl.JobEventImpl <em>Job Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.impl.JobEventImpl
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobEvent()
	 * @generated
	 */
	int JOB_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_EVENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_EVENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Job Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Job Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG__ENTRIES = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG__JOB = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__GRAVITY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__MESSAGE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY__CREATION_DATE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_ENTRY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Job Log Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_LOG_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Job Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.JobStatus
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.JobType <em>Job Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.JobType
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobType()
	 * @generated
	 */
	int JOB_TYPE = 9;


	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.JobDateFormat <em>Job Date Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.JobDateFormat
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobDateFormat()
	 * @generated
	 */
	int JOB_DATE_FORMAT = 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.jobs.JobEventType <em>Job Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.jobs.JobEventType
	 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobEventType()
	 * @generated
	 */
	int JOB_EVENT_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.core.jobs.QJob#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getSystem()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.jobs.QJob#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getContext()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.jobs.QJob#getCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Info</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getCreationInfo()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_CreationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobID <em>Job ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job ID</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobID()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobID();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobNumber <em>Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Number</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobNumber()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Status</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobStatus()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Type</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobType()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobUser <em>Job User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job User</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobUser()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobUser();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.core.jobs.QJob#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Libraries</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getLibraries()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Libraries();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.core.jobs.QJob#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Messages</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getMessages()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Messages();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getCurrentLibrary <em>Current Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Library</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getCurrentLibrary()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_CurrentLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switches</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getSwitches()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Switches();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getJobDateFormat <em>Job Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Date Format</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getJobDateFormat()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobDateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getDateSeparator <em>Date Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Separator</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getDateSeparator()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_DateSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getTimeSeparator <em>Time Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Separator</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getTimeSeparator()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_TimeSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJob#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJob#getVariables()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Variables();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJobLog <em>Job Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLog
	 * @generated
	 */
	EClass getJobLog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.core.jobs.QJobLog#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLog#getEntries()
	 * @see #getJobLog()
	 * @generated
	 */
	EReference getJobLog_Entries();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.core.jobs.QJobLog#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLog#getJob()
	 * @see #getJobLog()
	 * @generated
	 */
	EReference getJobLog_Job();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJobLogEntry <em>Job Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log Entry</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLogEntry
	 * @generated
	 */
	EClass getJobLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJobLogEntry#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLogEntry#getGravity()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_Gravity();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJobLogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLogEntry#getMessage()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJobLogEntry#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLogEntry#getCreationDate()
	 * @see #getJobLogEntry()
	 * @generated
	 */
	EAttribute getJobLogEntry_CreationDate();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJobLogManager <em>Job Log Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Log Manager</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobLogManager
	 * @generated
	 */
	EClass getJobLogManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJobManager <em>Job Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Manager</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobManager
	 * @generated
	 */
	EClass getJobManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJobListener <em>Job Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Listener</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobListener
	 * @generated
	 */
	EClass getJobListener();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.jobs.QJobEvent <em>Job Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Event</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobEvent
	 * @generated
	 */
	EClass getJobEvent();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.core.jobs.QJobEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobEvent#getSource()
	 * @see #getJobEvent()
	 * @generated
	 */
	EReference getJobEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.jobs.QJobEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.os.core.jobs.QJobEvent#getType()
	 * @see #getJobEvent()
	 * @generated
	 */
	EAttribute getJobEvent_Type();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.jobs.JobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Status</em>'.
	 * @see org.smeup.sys.os.core.jobs.JobStatus
	 * @generated
	 */
	EEnum getJobStatus();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.jobs.JobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Type</em>'.
	 * @see org.smeup.sys.os.core.jobs.JobType
	 * @generated
	 */
	EEnum getJobType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.jobs.JobDateFormat <em>Job Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Date Format</em>'.
	 * @see org.smeup.sys.os.core.jobs.JobDateFormat
	 * @generated
	 */
	EEnum getJobDateFormat();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.jobs.JobEventType <em>Job Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Event Type</em>'.
	 * @see org.smeup.sys.os.core.jobs.JobEventType
	 * @generated
	 */
	EEnum getJobEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemJobsFactory getOperatingSystemJobsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.impl.JobImpl
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SYSTEM = eINSTANCE.getJob_System();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTEXT = eINSTANCE.getJob_Context();

		/**
		 * The meta object literal for the '<em><b>Creation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CREATION_INFO = eINSTANCE.getJob_CreationInfo();

		/**
		 * The meta object literal for the '<em><b>Job ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_ID = eINSTANCE.getJob_JobID();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_NAME = eINSTANCE.getJob_JobName();

		/**
		 * The meta object literal for the '<em><b>Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_NUMBER = eINSTANCE.getJob_JobNumber();

		/**
		 * The meta object literal for the '<em><b>Job Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_STATUS = eINSTANCE.getJob_JobStatus();

		/**
		 * The meta object literal for the '<em><b>Job Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_TYPE = eINSTANCE.getJob_JobType();

		/**
		 * The meta object literal for the '<em><b>Job User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_USER = eINSTANCE.getJob_JobUser();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__LIBRARIES = eINSTANCE.getJob_Libraries();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__MESSAGES = eINSTANCE.getJob_Messages();

		/**
		 * The meta object literal for the '<em><b>Current Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__CURRENT_LIBRARY = eINSTANCE.getJob_CurrentLibrary();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__SWITCHES = eINSTANCE.getJob_Switches();

		/**
		 * The meta object literal for the '<em><b>Job Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_DATE_FORMAT = eINSTANCE.getJob_JobDateFormat();

		/**
		 * The meta object literal for the '<em><b>Date Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DATE_SEPARATOR = eINSTANCE.getJob_DateSeparator();

		/**
		 * The meta object literal for the '<em><b>Time Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TIME_SEPARATOR = eINSTANCE.getJob_TimeSeparator();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__VARIABLES = eINSTANCE.getJob_Variables();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.impl.JobLogImpl <em>Job Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.impl.JobLogImpl
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLog()
		 * @generated
		 */
		EClass JOB_LOG = eINSTANCE.getJobLog();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_LOG__ENTRIES = eINSTANCE.getJobLog_Entries();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_LOG__JOB = eINSTANCE.getJobLog_Job();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.impl.JobLogEntryImpl <em>Job Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.impl.JobLogEntryImpl
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogEntry()
		 * @generated
		 */
		EClass JOB_LOG_ENTRY = eINSTANCE.getJobLogEntry();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__GRAVITY = eINSTANCE.getJobLogEntry_Gravity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__MESSAGE = eINSTANCE.getJobLogEntry_Message();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_LOG_ENTRY__CREATION_DATE = eINSTANCE.getJobLogEntry_CreationDate();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.QJobLogManager <em>Job Log Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.QJobLogManager
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobLogManager()
		 * @generated
		 */
		EClass JOB_LOG_MANAGER = eINSTANCE.getJobLogManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.QJobManager <em>Job Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.QJobManager
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobManager()
		 * @generated
		 */
		EClass JOB_MANAGER = eINSTANCE.getJobManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.QJobListener <em>Job Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.QJobListener
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobListener()
		 * @generated
		 */
		EClass JOB_LISTENER = eINSTANCE.getJobListener();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.impl.JobEventImpl <em>Job Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.impl.JobEventImpl
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobEvent()
		 * @generated
		 */
		EClass JOB_EVENT = eINSTANCE.getJobEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_EVENT__SOURCE = eINSTANCE.getJobEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_EVENT__TYPE = eINSTANCE.getJobEvent_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.JobStatus <em>Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.JobStatus
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobStatus()
		 * @generated
		 */
		EEnum JOB_STATUS = eINSTANCE.getJobStatus();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.JobType <em>Job Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.JobType
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobType()
		 * @generated
		 */
		EEnum JOB_TYPE = eINSTANCE.getJobType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.JobDateFormat <em>Job Date Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.JobDateFormat
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobDateFormat()
		 * @generated
		 */
		EEnum JOB_DATE_FORMAT = eINSTANCE.getJobDateFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.jobs.JobEventType <em>Job Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.jobs.JobEventType
		 * @see org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl#getJobEventType()
		 * @generated
		 */
		EEnum JOB_EVENT_TYPE = eINSTANCE.getJobEventType();

	}

} //QOperatingSystemJobsPackage
