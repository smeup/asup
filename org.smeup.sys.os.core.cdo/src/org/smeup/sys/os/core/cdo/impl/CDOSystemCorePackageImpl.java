/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.cdo.CDOStoreConfig;
import org.smeup.sys.os.core.cdo.CDOSystemConfig;
import org.smeup.sys.os.core.cdo.CDOSystemCoreFactory;
import org.smeup.sys.os.core.cdo.CDOSystemCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CDOSystemCorePackageImpl extends EPackageImpl implements CDOSystemCorePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoSystemConfigEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoStoreConfigEClass = null;

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
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDOSystemCorePackageImpl() {
		super(eNS_URI, CDOSystemCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link CDOSystemCorePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDOSystemCorePackage init() {
		if (isInited) return (CDOSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(CDOSystemCorePackage.eNS_URI);

		// Obtain or create and register package
		CDOSystemCorePackageImpl theCDOSystemCorePackage = (CDOSystemCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDOSystemCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CDOSystemCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.smeup.sys.co.core.QCommunicationCorePackage.eINSTANCE.eClass();
		QDatabaseCorePackage.eINSTANCE.eClass();
		QOperatingSystemCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDOSystemCorePackage.createPackageContents();

		// Initialize created meta-data
		theCDOSystemCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDOSystemCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDOSystemCorePackage.eNS_URI, theCDOSystemCorePackage);
		return theCDOSystemCorePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDOSystemConfig() {
		return cdoSystemConfigEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCDOSystemConfig_System() {
		return (EReference)cdoSystemConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDOStoreConfig() {
		return cdoStoreConfigEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDOStoreConfig_Adapter() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDOStoreConfig_Driver() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDOStoreConfig_Repository() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCDOStoreConfig_SocketConfig() {
		return (EReference)cdoStoreConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDOStoreConfig_Url() {
		return (EAttribute)cdoStoreConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCDOStoreConfig_Credentials() {
		return (EReference)cdoStoreConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDOSystemCoreFactory getCDOSystemCoreFactory() {
		return (CDOSystemCoreFactory)getEFactoryInstance();
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
		cdoStoreConfigEClass = createEClass(CDO_STORE_CONFIG);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__ADAPTER);
		createEReference(cdoStoreConfigEClass, CDO_STORE_CONFIG__CREDENTIALS);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__DRIVER);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__REPOSITORY);
		createEReference(cdoStoreConfigEClass, CDO_STORE_CONFIG__SOCKET_CONFIG);
		createEAttribute(cdoStoreConfigEClass, CDO_STORE_CONFIG__URL);

		cdoSystemConfigEClass = createEClass(CDO_SYSTEM_CONFIG);
		createEReference(cdoSystemConfigEClass, CDO_SYSTEM_CONFIG__SYSTEM);
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
		QDatabaseCorePackage theDatabaseCorePackage = (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);
		org.smeup.sys.co.core.QCommunicationCorePackage theCommunicationCorePackage = (org.smeup.sys.co.core.QCommunicationCorePackage)EPackage.Registry.INSTANCE.getEPackage(org.smeup.sys.co.core.QCommunicationCorePackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cdoStoreConfigEClass, CDOStoreConfig.class, "CDOStoreConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDOStoreConfig_Adapter(), ecorePackage.getEString(), "adapter", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDOStoreConfig_Credentials(), theDatabaseCorePackage.getConnectionCredentials(), null, "credentials", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOStoreConfig_Driver(), ecorePackage.getEString(), "driver", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOStoreConfig_Repository(), ecorePackage.getEString(), "repository", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDOStoreConfig_SocketConfig(), theCommunicationCorePackage.getServerSocketConfig(), null, "socketConfig", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOStoreConfig_Url(), ecorePackage.getEString(), "url", null, 1, 1, CDOStoreConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdoSystemConfigEClass, CDOSystemConfig.class, "CDOSystemConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDOSystemConfig_System(), theOperatingSystemCorePackage.getSystem(), null, "system", null, 1, 1, CDOSystemConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // CDOSystemCorePackageImpl
