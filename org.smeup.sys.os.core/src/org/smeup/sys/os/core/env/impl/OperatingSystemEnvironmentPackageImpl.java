/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.env.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.dk.core.QDevelopmentKitCorePackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.env.EnvironmentLevel;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;
import org.smeup.sys.os.core.env.QEnvironmentVariableManager;
import org.smeup.sys.os.core.env.QOperatingSystemEnvironmentFactory;
import org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage;
import org.smeup.sys.os.core.impl.OperatingSystemCorePackageImpl;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemEnvironmentPackageImpl extends EPackageImpl implements QOperatingSystemEnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVariableManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVariableContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum environmentLevelEEnum = null;

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
	 * @see org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemEnvironmentPackageImpl() {
		super(eNS_URI, QOperatingSystemEnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemEnvironmentPackage init() {
		if (isInited) return (QOperatingSystemEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemEnvironmentPackageImpl theOperatingSystemEnvironmentPackage = (OperatingSystemEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDevelopmentKitCorePackage.eINSTANCE.eClass();
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		QIntegratedLanguageLockPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OperatingSystemCorePackageImpl theOperatingSystemCorePackage = (OperatingSystemCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) instanceof OperatingSystemCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) : QOperatingSystemCorePackage.eINSTANCE);
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) : QOperatingSystemJobsPackage.eINSTANCE);

		// Create package meta-data objects
		theOperatingSystemEnvironmentPackage.createPackageContents();
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemJobsPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemEnvironmentPackage.initializePackageContents();
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemJobsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemEnvironmentPackage.eNS_URI, theOperatingSystemEnvironmentPackage);
		return theOperatingSystemEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentVariableManager() {
		return environmentVariableManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentVariableContainer() {
		return environmentVariableContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentVariableContainer_Variables() {
		return (EReference)environmentVariableContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnvironmentLevel() {
		return environmentLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemEnvironmentFactory getOperatingSystemEnvironmentFactory() {
		return (QOperatingSystemEnvironmentFactory)getEFactoryInstance();
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
		environmentVariableManagerEClass = createEClass(ENVIRONMENT_VARIABLE_MANAGER);

		environmentVariableContainerEClass = createEClass(ENVIRONMENT_VARIABLE_CONTAINER);
		createEReference(environmentVariableContainerEClass, ENVIRONMENT_VARIABLE_CONTAINER__VARIABLES);

		// Create enums
		environmentLevelEEnum = createEEnum(ENVIRONMENT_LEVEL);
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
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(environmentVariableManagerEClass, QEnvironmentVariableManager.class, "EnvironmentVariableManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(environmentVariableManagerEClass, null, "addVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironmentLevel(), "level", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemCorePackage.getEnvironmentVariable(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(environmentVariableManagerEClass, null, "changeVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironmentLevel(), "level", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemCorePackage.getEnvironmentVariable(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(environmentVariableManagerEClass, theOperatingSystemCorePackage.getEnvironmentVariable(), "listVariables", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironmentLevel(), "level", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(environmentVariableManagerEClass, null, "removeVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironmentLevel(), "level", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemCorePackage.getEnvironmentVariable(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "replace", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(environmentVariableContainerEClass, QEnvironmentVariableContainer.class, "EnvironmentVariableContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentVariableContainer_Variables(), theOperatingSystemCorePackage.getEnvironmentVariable(), null, "variables", null, 0, -1, QEnvironmentVariableContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(environmentLevelEEnum, EnvironmentLevel.class, "EnvironmentLevel");
		addEEnumLiteral(environmentLevelEEnum, EnvironmentLevel.SYSTEM);
		addEEnumLiteral(environmentLevelEEnum, EnvironmentLevel.JOB);
	}

} //OperatingSystemEnvironmentPackageImpl
