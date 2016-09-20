/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage;
import org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl;
import org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl;
import org.smeup.sys.os.core.jobs.JobEventType;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobEvent;
import org.smeup.sys.os.core.jobs.QJobListener;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QJobRunInfo;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemJobsPackageImpl extends EPackageImpl implements QOperatingSystemJobsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobLogManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRunInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobEventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemJobsPackageImpl() {
		super(eNS_URI, QOperatingSystemJobsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemJobsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemJobsPackage init() {
		if (isInited) return (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemJobsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OperatingSystemCorePackageImpl theOperatingSystemCorePackage = (OperatingSystemCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) instanceof OperatingSystemCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) : QOperatingSystemCorePackage.eINSTANCE);
		OperatingSystemEnvironmentPackageImpl theOperatingSystemEnvironmentPackage = (OperatingSystemEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI) instanceof OperatingSystemEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI) : QOperatingSystemEnvironmentPackage.eINSTANCE);

		// Create package meta-data objects
		theOperatingSystemJobsPackage.createPackageContents();
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemJobsPackage.initializePackageContents();
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemJobsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemJobsPackage.eNS_URI, theOperatingSystemJobsPackage);
		return theOperatingSystemJobsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_System() {
		return (EReference)jobEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Context() {
		return (EReference)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_CreationInfo() {
		return (EReference)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_JobID() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_JobReference() {
		return (EReference)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_JobRunInfo() {
		return (EReference)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_JobThread() {
		return (EReference)jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_JobType() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Libraries() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Messages() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_CurrentLibrary() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_DateFormat() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Switches() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_DateSeparator() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_TimeSeparator() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_VariableContainer() {
		return (EReference)jobEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobCapability() {
		return jobCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobCapability_JobReference() {
		return (EReference)jobCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobCapability_Port() {
		return (EAttribute)jobCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobLog() {
		return jobLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobLog_Entries() {
		return (EReference)jobLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobLog_Job() {
		return (EReference)jobLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobLogEntry() {
		return jobLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobLogEntry_Gravity() {
		return (EAttribute)jobLogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobLogEntry_Message() {
		return (EAttribute)jobLogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobLogEntry_CreationDate() {
		return (EAttribute)jobLogEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobLogManager() {
		return jobLogManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobManager() {
		return jobManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobReference() {
		return jobReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobReference_JobNumber() {
		return (EAttribute)jobReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobReference_JobUser() {
		return (EAttribute)jobReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobReference_JobName() {
		return (EAttribute)jobReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobRunInfo() {
		return jobRunInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRunInfo_MemorySize() {
		return (EAttribute)jobRunInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobListener() {
		return jobListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEvent() {
		return jobEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEvent_Source() {
		return (EReference)jobEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEvent_Type() {
		return (EAttribute)jobEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJobStatus() {
		return jobStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJobType() {
		return jobTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobEventType() {
		return jobEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemJobsFactory getOperatingSystemJobsFactory() {
		return (QOperatingSystemJobsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__CONTEXT);
		createEReference(jobEClass, JOB__CREATION_INFO);
		createEAttribute(jobEClass, JOB__CURRENT_LIBRARY);
		createEAttribute(jobEClass, JOB__DATE_FORMAT);
		createEAttribute(jobEClass, JOB__DATE_SEPARATOR);
		createEAttribute(jobEClass, JOB__JOB_ID);
		createEReference(jobEClass, JOB__JOB_REFERENCE);
		createEReference(jobEClass, JOB__JOB_RUN_INFO);
		createEReference(jobEClass, JOB__JOB_THREAD);
		createEAttribute(jobEClass, JOB__JOB_TYPE);
		createEAttribute(jobEClass, JOB__LIBRARIES);
		createEAttribute(jobEClass, JOB__MESSAGES);
		createEAttribute(jobEClass, JOB__SWITCHES);
		createEReference(jobEClass, JOB__SYSTEM);
		createEAttribute(jobEClass, JOB__TIME_SEPARATOR);
		createEReference(jobEClass, JOB__VARIABLE_CONTAINER);

		jobCapabilityEClass = createEClass(JOB_CAPABILITY);
		createEReference(jobCapabilityEClass, JOB_CAPABILITY__JOB_REFERENCE);
		createEAttribute(jobCapabilityEClass, JOB_CAPABILITY__PORT);

		jobEventEClass = createEClass(JOB_EVENT);
		createEReference(jobEventEClass, JOB_EVENT__SOURCE);
		createEAttribute(jobEventEClass, JOB_EVENT__TYPE);

		jobListenerEClass = createEClass(JOB_LISTENER);

		jobLogEClass = createEClass(JOB_LOG);
		createEReference(jobLogEClass, JOB_LOG__ENTRIES);
		createEReference(jobLogEClass, JOB_LOG__JOB);

		jobLogEntryEClass = createEClass(JOB_LOG_ENTRY);
		createEAttribute(jobLogEntryEClass, JOB_LOG_ENTRY__GRAVITY);
		createEAttribute(jobLogEntryEClass, JOB_LOG_ENTRY__MESSAGE);
		createEAttribute(jobLogEntryEClass, JOB_LOG_ENTRY__CREATION_DATE);

		jobLogManagerEClass = createEClass(JOB_LOG_MANAGER);

		jobManagerEClass = createEClass(JOB_MANAGER);

		jobReferenceEClass = createEClass(JOB_REFERENCE);
		createEAttribute(jobReferenceEClass, JOB_REFERENCE__JOB_NUMBER);
		createEAttribute(jobReferenceEClass, JOB_REFERENCE__JOB_USER);
		createEAttribute(jobReferenceEClass, JOB_REFERENCE__JOB_NAME);

		jobRunInfoEClass = createEClass(JOB_RUN_INFO);
		createEAttribute(jobRunInfoEClass, JOB_RUN_INFO__MEMORY_SIZE);

		// Create enums
		jobEventTypeEEnum = createEEnum(JOB_EVENT_TYPE);
		jobStatusEEnum = createEEnum(JOB_STATUS);
		jobTypeEEnum = createEEnum(JOB_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);
		QIntegratedLanguageDataDefPackage theIntegratedLanguageDataDefPackage = (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);
		QOperatingSystemEnvironmentPackage theOperatingSystemEnvironmentPackage = (QOperatingSystemEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI);
		QIntegratedLanguageCoreOutPackage theIntegratedLanguageCoreOutPackage = (QIntegratedLanguageCoreOutPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		jobEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		jobCapabilityEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getCapability());
		jobLogEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		jobLogEntryEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		jobReferenceEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		jobRunInfoEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(jobEClass, QJob.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Context(), theIntegratedLanguageCoreCtxPackage.getContext(), null, "context", null, 0, 1, QJob.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_CreationInfo(), theOperatingSystemCorePackage.getCreationInfo(), null, "creationInfo", null, 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_CurrentLibrary(), ecorePackage.getEString(), "currentLibrary", "QGPL", 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_DateFormat(), theIntegratedLanguageDataDefPackage.getDateFormat(), "dateFormat", "*DMY", 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_DateSeparator(), ecorePackage.getEString(), "dateSeparator", "/", 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_JobID(), ecorePackage.getEString(), "jobID", null, 1, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobReference(), this.getJobReference(), null, "jobReference", null, 1, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobRunInfo(), this.getJobRunInfo(), null, "jobRunInfo", null, 1, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobThread(), theIntegratedLanguageCorePackage.getThread(), null, "jobThread", null, 0, 1, QJob.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_JobType(), this.getJobType(), "jobType", null, 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Libraries(), ecorePackage.getEString(), "libraries", null, 0, -1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Messages(), ecorePackage.getEString(), "messages", null, 0, -1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Switches(), ecorePackage.getEString(), "switches", "00000000", 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_System(), theOperatingSystemCorePackage.getSystem(), null, "system", null, 1, 1, QJob.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_TimeSeparator(), ecorePackage.getEString(), "timeSeparator", ":", 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_VariableContainer(), theOperatingSystemEnvironmentPackage.getEnvironmentVariableContainer(), null, "variableContainer", null, 0, 1, QJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jobEClass, this.getJobStatus(), "getJobStatus", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEDouble(), "getCPUUsage", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getELong(), "getMemorySize", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEInt(), "getPriority", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEBoolean(), "isActive", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobEClass, ecorePackage.getEBoolean(), "isRouted", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobCapabilityEClass, QJobCapability.class, "JobCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobCapability_JobReference(), this.getJobReference(), null, "jobReference", null, 1, 1, QJobCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobCapability_Port(), ecorePackage.getEInt(), "port", null, 0, 1, QJobCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEventEClass, QJobEvent.class, "JobEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEvent_Source(), this.getJob(), null, "source", null, 0, 1, QJobEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEvent_Type(), this.getJobEventType(), "type", null, 1, 1, QJobEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobListenerEClass, QJobListener.class, "JobListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(jobListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobLogEClass, QJobLog.class, "JobLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobLog_Entries(), this.getJobLogEntry(), null, "entries", null, 1, -1, QJobLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobLog_Job(), this.getJob(), null, "job", null, 1, 1, QJobLog.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobLogEntryEClass, QJobLogEntry.class, "JobLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobLogEntry_Gravity(), ecorePackage.getEInt(), "gravity", null, 1, 1, QJobLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobLogEntry_Message(), ecorePackage.getEString(), "message", null, 1, 1, QJobLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobLogEntry_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, QJobLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobLogManagerEClass, QJobLogManager.class, "JobLogManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(jobLogManagerEClass, null, "addEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "gravity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, this.getJobLog(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, this.getJobLog(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobReference(), "jobReference", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobLogManagerEClass, this.getJobLog(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobManagerEClass, QJobManager.class, "JobManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(jobManagerEClass, ecorePackage.getEBoolean(), "checkCapability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobManagerEClass, ecorePackage.getEInt(), "countActiveJobs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJobCapability(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getIdentity());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "identity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJobCapability(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getIdentity());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "identity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "delay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "millis", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "delay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resumeTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jobManagerEClass, this.getJob(), "getActiveJobs", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobReference(), "jobReference", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "number", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookupActiveJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJob(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, ecorePackage.getEDate(), "now", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "registerWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreOutPackage.getObjectWriter(), "writer", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "setDefaultWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, this.getJobCapability(), "spawn", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "copyEnvironmentVariables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jobManagerEClass, null, "updateStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobStatus(), "status", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobReferenceEClass, QJobReference.class, "JobReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobReference_JobNumber(), ecorePackage.getEInt(), "jobNumber", null, 1, 1, QJobReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobReference_JobUser(), ecorePackage.getEString(), "jobUser", null, 1, 1, QJobReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobReference_JobName(), ecorePackage.getEString(), "jobName", null, 1, 1, QJobReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobRunInfoEClass, QJobRunInfo.class, "JobRunInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobRunInfo_MemorySize(), ecorePackage.getELong(), "memorySize", null, 0, 1, QJobRunInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jobEventTypeEEnum, JobEventType.class, "JobEventType");
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STARTING);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STARTED);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STATUS_CHANGED);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STOPPING);
		addEEnumLiteral(jobEventTypeEEnum, JobEventType.STOPPED);

		initEEnum(jobStatusEEnum, JobStatus.class, "JobStatus");
		addEEnumLiteral(jobStatusEEnum, JobStatus.ACTIVE);
		addEEnumLiteral(jobStatusEEnum, JobStatus.TIME_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.RUN);
		addEEnumLiteral(jobStatusEEnum, JobStatus.MESSAGE_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.LOCK_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.EVENT_WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.HOLD);
		addEEnumLiteral(jobStatusEEnum, JobStatus.END_OF_JOB);
		addEEnumLiteral(jobStatusEEnum, JobStatus.END);

		initEEnum(jobTypeEEnum, JobType.class, "JobType");
		addEEnumLiteral(jobTypeEEnum, JobType.KERNEL);
		addEEnumLiteral(jobTypeEEnum, JobType.INTERACTIVE);
		addEEnumLiteral(jobTypeEEnum, JobType.BATCH);

		// Create annotations
		// il-data
		createIldataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (jobEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "length", "20"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (jobEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "precision", "10",
			 "scale", "2"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });	
		addAnnotation
		  (jobEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "precision", "10",
			 "scale", "0"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });	
		addAnnotation
		  (jobEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (jobEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (jobEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJob_CurrentLibrary(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJob_DateSeparator(), 
		   source, 
		   new String[] {
			 "length", "1"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJob_JobID(), 
		   source, 
		   new String[] {
			 "length", "13"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJob_JobReference(), 
		   source, 
		   new String[] {
			 "length", "28"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJob_Switches(), 
		   source, 
		   new String[] {
			 "length", "8"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJob_TimeSeparator(), 
		   source, 
		   new String[] {
			 "length", "1"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJobLogEntry_Message(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJobReference_JobNumber(), 
		   source, 
		   new String[] {
			 "precision", "6"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });	
		addAnnotation
		  (getJobReference_JobUser(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getJobReference_JobName(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

} //OperatingSystemJobsPackageImpl
