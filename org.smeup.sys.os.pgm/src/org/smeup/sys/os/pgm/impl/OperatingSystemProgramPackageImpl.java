/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

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
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.pgm.ProgramStackOrder;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramCallable;
import org.smeup.sys.os.pgm.QProgramContainer;
import org.smeup.sys.os.pgm.QProgramInfo;
import org.smeup.sys.os.pgm.QProgramManager;
import org.smeup.sys.os.pgm.QProgramSource;
import org.smeup.sys.os.pgm.QProgramStack;
import org.smeup.sys.os.pgm.QProgramStatus;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemProgramPackageImpl extends EPackageImpl implements QOperatingSystemProgramPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationGroupManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programCallableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programInfoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programSourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStackEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programStackOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterListEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemProgramPackageImpl() {
		super(eNS_URI, QOperatingSystemProgramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemProgramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemProgramPackage init() {
		if (isInited) return (QOperatingSystemProgramPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemProgramPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemProgramPackageImpl theOperatingSystemProgramPackage = (OperatingSystemProgramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemProgramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemProgramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();
		QIntegratedLanguageLockPackage.eINSTANCE.eClass();
		QIntegratedLanguageDataDefPackage.eINSTANCE.eClass();
		QIntegratedLanguageDataTermPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemProgramPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemProgramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemProgramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemProgramPackage.eNS_URI, theOperatingSystemProgramPackage);
		return theOperatingSystemProgramPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivationGroup() {
		return activationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivationGroup_Name() {
		return (EAttribute)activationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivationGroup_Programs() {
		return (EReference)activationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivationGroupManager() {
		return activationGroupManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_ActivationGroup() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_Address() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_BaseProgram() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_CreationParams() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Source() {
		return (EReference)programEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramCallable() {
		return programCallableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramCallable_ActivationGroup() {
		return (EReference)programCallableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramContainer() {
		return programContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramContainer_BasePackage() {
		return (EAttribute)programContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramContainer_ScanPackage() {
		return (EAttribute)programContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramInfo() {
		return programInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramInfo_MemorySize() {
		return (EAttribute)programInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramInfo_LoadTime() {
		return (EAttribute)programInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramInfo_CallTime() {
		return (EAttribute)programInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramManager() {
		return programManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramSource() {
		return programSourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramSource_Type() {
		return (EAttribute)programSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramSource_Content() {
		return (EAttribute)programSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramStack() {
		return programStackEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramStatus() {
		return programStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProgramStackOrder() {
		return programStackOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getParameterList() {
		return parameterListEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemProgramFactory getOperatingSystemProgramFactory() {
		return (QOperatingSystemProgramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		activationGroupEClass = createEClass(ACTIVATION_GROUP);
		createEAttribute(activationGroupEClass, ACTIVATION_GROUP__NAME);
		createEReference(activationGroupEClass, ACTIVATION_GROUP__PROGRAMS);

		activationGroupManagerEClass = createEClass(ACTIVATION_GROUP_MANAGER);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__ACTIVATION_GROUP);
		createEAttribute(programEClass, PROGRAM__ADDRESS);
		createEAttribute(programEClass, PROGRAM__BASE_PROGRAM);
		createEAttribute(programEClass, PROGRAM__CREATION_PARAMS);
		createEReference(programEClass, PROGRAM__SOURCE);

		programCallableEClass = createEClass(PROGRAM_CALLABLE);
		createEReference(programCallableEClass, PROGRAM_CALLABLE__ACTIVATION_GROUP);

		programContainerEClass = createEClass(PROGRAM_CONTAINER);
		createEAttribute(programContainerEClass, PROGRAM_CONTAINER__BASE_PACKAGE);
		createEAttribute(programContainerEClass, PROGRAM_CONTAINER__SCAN_PACKAGE);

		programInfoEClass = createEClass(PROGRAM_INFO);
		createEAttribute(programInfoEClass, PROGRAM_INFO__MEMORY_SIZE);
		createEAttribute(programInfoEClass, PROGRAM_INFO__LOAD_TIME);
		createEAttribute(programInfoEClass, PROGRAM_INFO__CALL_TIME);

		programManagerEClass = createEClass(PROGRAM_MANAGER);

		programSourceEClass = createEClass(PROGRAM_SOURCE);
		createEAttribute(programSourceEClass, PROGRAM_SOURCE__TYPE);
		createEAttribute(programSourceEClass, PROGRAM_SOURCE__CONTENT);

		programStackEClass = createEClass(PROGRAM_STACK);

		programStatusEClass = createEClass(PROGRAM_STATUS);

		// Create enums
		programStackOrderEEnum = createEEnum(PROGRAM_STACK_ORDER);

		// Create data types
		parameterListEDataType = createEDataType(PARAMETER_LIST);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
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
		QMachineInterfaceUtilPackage theMachineInterfaceUtilPackage = (QMachineInterfaceUtilPackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceUtilPackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activationGroupEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		EGenericType g1 = createEGenericType(theMachineInterfaceUtilPackage.getSingleton());
		EGenericType g2 = createEGenericType(this.getActivationGroupManager());
		g1.getETypeArguments().add(g2);
		activationGroupManagerEClass.getEGenericSuperTypes().add(g1);
		programEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getObject());
		programCallableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaCallable());
		g2 = createEGenericType(this.getParameterList());
		g1.getETypeArguments().add(g2);
		programCallableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaCloseable());
		programCallableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theOperatingSystemTypePackage.getTypedContainer());
		g2 = createEGenericType(this.getProgram());
		g1.getETypeArguments().add(g2);
		programContainerEClass.getEGenericSuperTypes().add(g1);
		programInfoEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		programSourceEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		programStackEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		programStatusEClass.getESuperTypes().add(theIntegratedLanguageDataPackage.getDataStruct());

		// Initialize classes and features; add operations and parameters
		initEClass(activationGroupEClass, QActivationGroup.class, "ActivationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, QActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationGroup_Programs(), this.getProgramCallable(), this.getProgramCallable_ActivationGroup(), "programs", null, 0, -1, QActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(activationGroupEClass, this.getProgramCallable(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activationGroupManagerEClass, QActivationGroupManager.class, "ActivationGroupManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(activationGroupManagerEClass, ecorePackage.getEBoolean(), "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivationGroup(), "activationGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, null, "closeAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, this.getActivationGroup(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "register", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, this.getActivationGroup(), "list", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, this.getActivationGroup(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivationGroup(), "activationGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programEClass, QProgram.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_ActivationGroup(), ecorePackage.getEString(), "activationGroup", "*DFT", 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Address(), ecorePackage.getEString(), "address", null, 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_BaseProgram(), ecorePackage.getEString(), "baseProgram", null, 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_CreationParams(), ecorePackage.getEString(), "creationParams", null, 0, -1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Source(), this.getProgramSource(), null, "source", null, 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(programEClass, theMachineInterfaceCorePackage.getJavaURI(), "getClassURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programEClass, theMachineInterfaceCorePackage.getJavaURI(), "getPackageInfoURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programCallableEClass, QProgramCallable.class, "ProgramCallable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramCallable_ActivationGroup(), this.getActivationGroup(), this.getActivationGroup_Programs(), "activationGroup", null, 0, 1, QProgramCallable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(programCallableEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, theIntegratedLanguageDataPackage.getDataContext(), "getDataContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, this.getParameterList(), "getParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, this.getProgram(), "getProgram", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, this.getProgramInfo(), "getProgramInfo", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, this.getProgramStatus(), "getProgramStatus", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, ecorePackage.getEJavaObject(), "getRawProgram", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programCallableEClass, ecorePackage.getEBoolean(), "isOpen", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programContainerEClass, QProgramContainer.class, "ProgramContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramContainer_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, QProgramContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramContainer_ScanPackage(), ecorePackage.getEBoolean(), "scanPackage", null, 1, 1, QProgramContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programInfoEClass, QProgramInfo.class, "ProgramInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramInfo_MemorySize(), ecorePackage.getELong(), "memorySize", null, 0, 1, QProgramInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramInfo_LoadTime(), ecorePackage.getELong(), "loadTime", null, 0, 1, QProgramInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramInfo_CallTime(), ecorePackage.getELong(), "callTime", null, 0, 1, QProgramInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programManagerEClass, QProgramManager.class, "ProgramManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(programManagerEClass, null, "callProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterList(), "params", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, null, "callProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterList(), "params", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, null, "callProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterList(), "params", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, null, "callProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterList(), "params", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramCallable(), "getCaller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgramCallable(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramCallable(), "getCaller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramCallable(), "getCaller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgramCallable(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramCallable(), "getCaller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramStack(), "getProgramStack", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramStack(), "getProgramStack", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramCallable(), "loadProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, null, "loadProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "P");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(programSourceEClass, QProgramSource.class, "ProgramSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramSource_Type(), ecorePackage.getEString(), "type", "ASUP", 0, 1, QProgramSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramSource_Content(), ecorePackage.getEString(), "content", null, 0, 1, QProgramSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programStackEClass, QProgramStack.class, "ProgramStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(programStackEClass, ecorePackage.getEBoolean(), "contains", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgramCallable(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programStackEClass, ecorePackage.getEBoolean(), "contains", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programStackEClass, this.getProgramCallable(), "list", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgramStackOrder(), "order", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programStackEClass, null, "push", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgramCallable(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, this.getProgramCallable(), "peek", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, this.getProgramCallable(), "pop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programStatusEClass, QProgramStatus.class, "ProgramStatus", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getDecimal(), "getJobNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getCharacter(), "getJobName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getDecimal(), "getParametersNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getCharacter(), "getProgramName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getCharacter(), "getProgramLibrary", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getDecimal(), "getStatusCode", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStatusEClass, theIntegratedLanguageDataPackage.getCharacter(), "getUserName", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(programStackOrderEEnum, ProgramStackOrder.class, "ProgramStackOrder");
		addEEnumLiteral(programStackOrderEEnum, ProgramStackOrder.ASCEND);
		addEEnumLiteral(programStackOrderEEnum, ProgramStackOrder.DESCEND);

		// Initialize data types
		initEDataType(parameterListEDataType, QData[].class, "ParameterList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getProgram_ActivationGroup(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getProgram_Address(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getProgram_BaseProgram(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

} // OSProgramCorePackageImpl
