/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.impl;

import org.eclipse.emf.common.util.URI;
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
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemEvent;
import org.smeup.sys.os.core.QSystemListener;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.SystemEventType;
import org.smeup.sys.os.core.SystemStatus;
import org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage;
import org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl;
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
	private EClass systemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemListenerEClass = null;

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
	private EEnum systemEventTypeEEnum = null;

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

		// Obtain or create and register interdependencies
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) : QOperatingSystemJobsPackage.eINSTANCE);
		OperatingSystemEnvironmentPackageImpl theOperatingSystemEnvironmentPackage = (OperatingSystemEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI) instanceof OperatingSystemEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI) : QOperatingSystemEnvironmentPackage.eINSTANCE);

		// Create package meta-data objects
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemJobsPackage.createPackageContents();
		theOperatingSystemEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemJobsPackage.initializePackageContents();
		theOperatingSystemEnvironmentPackage.initializePackageContents();

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
	public EAttribute getSystem_LastJobNumber() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Status() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_SystemLibrary() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_SystemUser() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_TemporaryLibrary() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_VariableContainer() {
		return (EReference)systemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemEvent() {
		return systemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEvent_Source() {
		return (EReference)systemEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemEvent_Type() {
		return (EAttribute)systemEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemListener() {
		return systemListenerEClass;
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
	public EEnum getSystemEventType() {
		return systemEventTypeEEnum;
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

		exceptionManagerEClass = createEClass(EXCEPTION_MANAGER);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONTEXT);
		createEReference(systemEClass, SYSTEM__CREATION_INFO);
		createEAttribute(systemEClass, SYSTEM__LAST_JOB_NUMBER);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__STATUS);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_LIBRARY);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_USER);
		createEAttribute(systemEClass, SYSTEM__TEMPORARY_LIBRARY);
		createEReference(systemEClass, SYSTEM__VARIABLE_CONTAINER);

		systemEventEClass = createEClass(SYSTEM_EVENT);
		createEReference(systemEventEClass, SYSTEM_EVENT__SOURCE);
		createEAttribute(systemEventEClass, SYSTEM_EVENT__TYPE);

		systemListenerEClass = createEClass(SYSTEM_LISTENER);

		systemManagerEClass = createEClass(SYSTEM_MANAGER);

		// Create enums
		systemEventTypeEEnum = createEEnum(SYSTEM_EVENT_TYPE);
		systemStatusEEnum = createEEnum(SYSTEM_STATUS);

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
		QOperatingSystemEnvironmentPackage theOperatingSystemEnvironmentPackage = (QOperatingSystemEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOperatingSystemJobsPackage);
		getESubpackages().add(theOperatingSystemEnvironmentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		creationInfoEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		systemEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		systemEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());

		// Initialize classes and features; add operations and parameters
		initEClass(creationInfoEClass, QCreationInfo.class, "CreationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreationInfo_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationInfo_CreationUser(), ecorePackage.getEString(), "creationUser", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationInfo_CreationSystem(), ecorePackage.getEString(), "creationSystem", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionManagerEClass, QExceptionManager.class, "ExceptionManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		EGenericType g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileLib", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEClass, QSystem.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Context(), theIntegratedLanguageCoreCtxPackage.getContext(), null, "context", null, 0, 1, QSystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_CreationInfo(), this.getCreationInfo(), null, "creationInfo", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_LastJobNumber(), ecorePackage.getEInt(), "lastJobNumber", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Status(), this.getSystemStatus(), "status", "STP", 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemLibrary(), ecorePackage.getEString(), "systemLibrary", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemUser(), ecorePackage.getEString(), "systemUser", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_TemporaryLibrary(), ecorePackage.getEString(), "temporaryLibrary", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_VariableContainer(), theOperatingSystemEnvironmentPackage.getEnvironmentVariableContainer(), null, "variableContainer", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(systemEClass, ecorePackage.getEInt(), "getAvailableProcessors", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemEClass, ecorePackage.getEDouble(), "getLoadAverage", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEventEClass, QSystemEvent.class, "SystemEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemEvent_Source(), this.getSystem(), null, "source", null, 0, 1, QSystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemEvent_Type(), this.getSystemEventType(), "type", null, 1, 1, QSystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemListenerEClass, QSystemListener.class, "SystemListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(systemListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystemEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemManagerEClass, QSystemManager.class, "SystemManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(systemManagerEClass, theOperatingSystemJobsPackage.getJob(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystem(), "system", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(systemManagerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystemListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(systemManagerEClass, null, "updateStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystemStatus(), "status", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(systemEventTypeEEnum, SystemEventType.class, "SystemEventType");
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STARTING);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STARTED);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STATUS_CHANGED);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STOPPING);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.STOPPED);

		initEEnum(systemStatusEEnum, SystemStatus.class, "SystemStatus");
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ACTIVATING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STARTED);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ENDING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STOPPED);

		// Initialize data types
		initEDataType(messageVariableListEDataType, Object[].class, "MessageVariableList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageExceptionEDataType, OperatingSystemMessageException.class, "MessageException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

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
		  (systemEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "precision", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });	
		addAnnotation
		  (systemEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "precision", "10",
			 "scale", "2"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });
	}

} //OperatingSystemCorePackageImpl
