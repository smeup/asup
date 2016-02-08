/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.lib.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.lib.LibraryType;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.os.lib.QOperatingSystemLibraryPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemLibraryPackageImpl extends EPackageImpl implements QOperatingSystemLibraryPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2016 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum libraryTypeEEnum = null;

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
	 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemLibraryPackageImpl() {
		super(eNS_URI, QOperatingSystemLibraryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemLibraryPackage init() {
		if (isInited) return (QOperatingSystemLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemLibraryPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemLibraryPackageImpl theOperatingSystemLibraryPackage = (OperatingSystemLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemLibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageMemoryPackage.eINSTANCE.eClass();
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemLibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemLibraryPackage.eNS_URI, theOperatingSystemLibraryPackage);
		return theOperatingSystemLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibraryManager() {
		return libraryManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_Dependencies() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_LibraryType() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_ParentLibrary() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_Synchronized() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLibraryType() {
		return libraryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_BasePackage() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemLibraryFactory getOperatingSystemLibraryFactory() {
		return (QOperatingSystemLibraryFactory)getEFactoryInstance();
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
		libraryManagerEClass = createEClass(LIBRARY_MANAGER);

		libraryEClass = createEClass(LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__BASE_PACKAGE);
		createEAttribute(libraryEClass, LIBRARY__DEPENDENCIES);
		createEAttribute(libraryEClass, LIBRARY__LIBRARY_TYPE);
		createEAttribute(libraryEClass, LIBRARY__PARENT_LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__SYNCHRONIZED);

		// Create enums
		libraryTypeEEnum = createEEnum(LIBRARY_TYPE);
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
		QIntegratedLanguageMemoryPackage theIntegratedLanguageMemoryPackage = (QIntegratedLanguageMemoryPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageMemoryPackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		libraryEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(libraryManagerEClass, QLibraryManager.class, "LibraryManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(libraryManagerEClass, null, "getLibraryReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theIntegratedLanguageMemoryPackage.getResourceReader());
		EGenericType g2 = createEGenericType(this.getLibrary());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(libraryManagerEClass, null, "getLibraryWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageMemoryPackage.getResourceWriter());
		g2 = createEGenericType(this.getLibrary());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(libraryManagerEClass, null, "createTemporaryLibrary", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(libraryManagerEClass, null, "destroyTemporaryLibrary", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(libraryManagerEClass, null, "destroyAllTemporaryLibrary", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(libraryManagerEClass, null, "clearLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(libraryEClass, QLibrary.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibrary_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, QLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_Dependencies(), ecorePackage.getEString(), "dependencies", null, 0, -1, QLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_LibraryType(), this.getLibraryType(), "libraryType", "PROD", 1, 1, QLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_ParentLibrary(), ecorePackage.getEString(), "parentLibrary", null, 0, 1, QLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_Synchronized(), ecorePackage.getEBoolean(), "synchronized", "false", 0, 1, QLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(libraryEClass, ecorePackage.getEBoolean(), "isRootLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(libraryEClass, ecorePackage.getEBoolean(), "isChildLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(libraryEClass, theMachineInterfaceCorePackage.getJavaURI(), "getPackageURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(libraryTypeEEnum, LibraryType.class, "LibraryType");
		addEEnumLiteral(libraryTypeEEnum, LibraryType.PRODUCTION);
		addEEnumLiteral(libraryTypeEEnum, LibraryType.TEST);
		addEEnumLiteral(libraryTypeEEnum, LibraryType.TEMPORARY);

		// Create resource
		createResource(eNS_URI);
	}

} // OperatingSystemLibraryPackageImpl
