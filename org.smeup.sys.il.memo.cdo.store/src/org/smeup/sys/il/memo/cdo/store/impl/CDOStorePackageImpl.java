/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo.cdo.store.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.co.core.QCommunicationCorePackage;

import org.smeup.sys.db.core.QDatabaseCorePackage;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.il.memo.cdo.store.CDOStoreConfig;
import org.smeup.sys.il.memo.cdo.store.CDOStoreFactory;
import org.smeup.sys.il.memo.cdo.store.CDOStorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOStorePackageImpl extends EPackageImpl implements CDOStorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoStoreConfigEClass = null;

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
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDOStorePackageImpl() {
		super(eNS_URI, CDOStoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CDOStorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDOStorePackage init() {
		if (isInited) return (CDOStorePackage)EPackage.Registry.INSTANCE.getEPackage(CDOStorePackage.eNS_URI);

		// Obtain or create and register package
		CDOStorePackageImpl theCDOStorePackage = (CDOStorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDOStorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CDOStorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QCommunicationCorePackage.eINSTANCE.eClass();
		QDatabaseCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDOStorePackage.createPackageContents();

		// Initialize created meta-data
		theCDOStorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDOStorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDOStorePackage.eNS_URI, theCDOStorePackage);
		return theCDOStorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDOStoreConfig() {
		return cdoStoreConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOStoreConfig_Adapter() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDOStoreConfig_Credentials() {
		return (EReference)cdoStoreConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOStoreConfig_Driver() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOStoreConfig_Repository() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDOStoreConfig_SocketConfig() {
		return (EReference)cdoStoreConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOStoreConfig_Url() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOStoreFactory getCDOStoreFactory() {
		return (CDOStoreFactory)getEFactoryInstance();
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
		cdoStoreConfigEClass = createEClass(CDO_STORE_CONFIG);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__ADAPTER);
		createEReference(cdoStoreConfigEClass, CDO_STORE_CONFIG__CREDENTIALS);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__DRIVER);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__REPOSITORY);
		createEReference(cdoStoreConfigEClass, CDO_STORE_CONFIG__SOCKET_CONFIG);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__URL);
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
		QDatabaseCorePackage theDatabaseCorePackage = (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);
		QCommunicationCorePackage theCommunicationCorePackage = (QCommunicationCorePackage)EPackage.Registry.INSTANCE.getEPackage(QCommunicationCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cdoStoreConfigEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(cdoStoreConfigEClass, CDOStoreConfig.class, "CDOStoreConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDOStoreConfig_Adapter(), ecorePackage.getEString(), "adapter", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDOStoreConfig_Credentials(), theDatabaseCorePackage.getConnectionCredentials(), null, "credentials", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOStoreConfig_Driver(), ecorePackage.getEString(), "driver", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOStoreConfig_Repository(), ecorePackage.getEString(), "repository", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDOStoreConfig_SocketConfig(), theCommunicationCorePackage.getServerSocketConfig(), null, "socketConfig", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOStoreConfig_Url(), ecorePackage.getEString(), "url", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CDOStorePackageImpl
