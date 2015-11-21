/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.os.core.DateFormat;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QEnvironmentVariable;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.SystemStatus;
import org.smeup.sys.os.core.TimeFormat;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemCorePackageImpl extends EPackageImpl implements QOperatingSystemCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageVariableListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageExceptionEDataType = null;

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
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemCorePackageImpl() {
		super(eNS_URI, QOperatingSystemCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemCorePackage init() {
		if (isInited) return (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemCorePackageImpl theOperatingSystemCorePackage = (OperatingSystemCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		QIntegratedLanguageLockPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) : QOperatingSystemJobsPackage.eINSTANCE);

		// Create package meta-data objects
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemJobsPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemJobsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemCorePackage.eNS_URI, theOperatingSystemCorePackage);
		return theOperatingSystemCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreationInfo() {
		return creationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationInfo_CreationDate() {
		return (EAttribute)creationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationInfo_CreationUser() {
		return (EAttribute)creationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationInfo_CreationSystem() {
		return (EAttribute)creationInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Context() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_CreationInfo() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_InstallPath() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_LastJobNumber() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Status() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_SystemLibrary() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_SystemUser() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_TemporaryLibrary() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Variables() {
		return (EReference)systemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemManager() {
		return systemManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentVariable() {
		return environmentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentVariable_Name() {
		return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentVariable_Value() {
		return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionManager() {
		return exceptionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSystemStatus() {
		return systemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateFormat() {
		return dateFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeFormat() {
		return timeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageVariableList() {
		return messageVariableListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageException() {
		return messageExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemCoreFactory getOperatingSystemCoreFactory() {
		return (QOperatingSystemCoreFactory)getEFactoryInstance();
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
		creationInfoEClass = createEClass(CREATION_INFO);
		createEAttribute(creationInfoEClass, CREATION_INFO__CREATION_DATE);
		createEAttribute(creationInfoEClass, CREATION_INFO__CREATION_USER);
		createEAttribute(creationInfoEClass, CREATION_INFO__CREATION_SYSTEM);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONTEXT);
		createEReference(systemEClass, SYSTEM__CREATION_INFO);
		createEAttribute(systemEClass, SYSTEM__INSTALL_PATH);
		createEAttribute(systemEClass, SYSTEM__LAST_JOB_NUMBER);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__STATUS);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_LIBRARY);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_USER);
		createEAttribute(systemEClass, SYSTEM__TEMPORARY_LIBRARY);
		createEReference(systemEClass, SYSTEM__VARIABLES);

		systemManagerEClass = createEClass(SYSTEM_MANAGER);

		environmentVariableEClass = createEClass(ENVIRONMENT_VARIABLE);
		createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__NAME);
		createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__VALUE);

		exceptionManagerEClass = createEClass(EXCEPTION_MANAGER);

		// Create enums
		systemStatusEEnum = createEEnum(SYSTEM_STATUS);
		dateFormatEEnum = createEEnum(DATE_FORMAT);
		timeFormatEEnum = createEEnum(TIME_FORMAT);

		// Create data types
		messageVariableListEDataType = createEDataType(MESSAGE_VARIABLE_LIST);
		messageExceptionEDataType = createEDataType(MESSAGE_EXCEPTION);
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
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageLockPackage theIntegratedLanguageLockPackage = (QIntegratedLanguageLockPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageLockPackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageCoreJavaPackage theIntegratedLanguageCoreJavaPackage = (QIntegratedLanguageCoreJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOperatingSystemJobsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		creationInfoEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		systemEClass.getESuperTypes().add(theIntegratedLanguageLockPackage.getObjectLockable());
		systemEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		systemEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		environmentVariableEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(creationInfoEClass, QCreationInfo.class, "CreationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreationInfo_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationInfo_CreationUser(), ecorePackage.getEString(), "creationUser", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationInfo_CreationSystem(), ecorePackage.getEString(), "creationSystem", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, QSystem.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Context(), theIntegratedLanguageCoreCtxPackage.getContext(), null, "context", null, 0, 1, QSystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_CreationInfo(), this.getCreationInfo(), null, "creationInfo", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_InstallPath(), ecorePackage.getEString(), "installPath", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_LastJobNumber(), ecorePackage.getEInt(), "lastJobNumber", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Status(), this.getSystemStatus(), "status", "STP", 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemLibrary(), ecorePackage.getEString(), "systemLibrary", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemUser(), ecorePackage.getEString(), "systemUser", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_TemporaryLibrary(), ecorePackage.getEString(), "temporaryLibrary", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Variables(), this.getEnvironmentVariable(), null, "variables", null, 0, -1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemManagerEClass, QSystemManager.class, "SystemManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(systemManagerEClass, this.getSystem(), "getSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemManagerEClass, theOperatingSystemJobsPackage.getJob(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(environmentVariableEClass, QEnvironmentVariable.class, "EnvironmentVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, QEnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentVariable_Value(), ecorePackage.getEString(), "value", null, 1, 1, QEnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionManagerEClass, QExceptionManager.class, "ExceptionManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theIntegratedLanguageCoreJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theIntegratedLanguageCoreJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileLib", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(systemStatusEEnum, SystemStatus.class, "SystemStatus");
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ACTIVATING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STARTED);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ENDING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STOPPED);

		initEEnum(dateFormatEEnum, DateFormat.class, "DateFormat");
		addEEnumLiteral(dateFormatEEnum, DateFormat.MDY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.DMY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JUL);
		addEEnumLiteral(dateFormatEEnum, DateFormat.ISO);
		addEEnumLiteral(dateFormatEEnum, DateFormat.USA);
		addEEnumLiteral(dateFormatEEnum, DateFormat.EUR);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JIS);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JOBRUN);

		initEEnum(timeFormatEEnum, TimeFormat.class, "TimeFormat");
		addEEnumLiteral(timeFormatEEnum, TimeFormat.HMS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.ISO);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.USA);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.EUR);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JIS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JOBRUN);

		// Initialize data types
		initEDataType(messageVariableListEDataType, Object[].class, "MessageVariableList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageExceptionEDataType, OperatingSystemMessageException.class, "MessageException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OperatingSystemCorePackageImpl
