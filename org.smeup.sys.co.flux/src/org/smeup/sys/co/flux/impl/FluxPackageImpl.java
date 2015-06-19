/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.flux.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.co.flux.FluxFactory;
import org.smeup.sys.co.flux.FluxPackage;
import org.smeup.sys.co.flux.FluxServerConnectionConfig;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FluxPackageImpl extends EPackageImpl implements FluxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fluxServerConnectionConfigEClass = null;
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
	 * @see org.smeup.sys.co.flux.FluxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FluxPackageImpl() {
		super(eNS_URI, FluxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FluxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FluxPackage init() {
		if (isInited) return (FluxPackage)EPackage.Registry.INSTANCE.getEPackage(FluxPackage.eNS_URI);

		// Obtain or create and register package
		FluxPackageImpl theFluxPackage = (FluxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FluxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FluxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFluxPackage.createPackageContents();

		// Initialize created meta-data
		theFluxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFluxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FluxPackage.eNS_URI, theFluxPackage);
		return theFluxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFluxServerConnectionConfig() {
		return fluxServerConnectionConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluxServerConnectionConfig_ChannelID() {
		return (EAttribute)fluxServerConnectionConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluxServerConnectionConfig_Host() {
		return (EAttribute)fluxServerConnectionConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluxServerConnectionConfig_LazyStart() {
		return (EAttribute)fluxServerConnectionConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluxServerConnectionConfig_UserName() {
		return (EAttribute)fluxServerConnectionConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluxServerConnectionConfig_Token() {
		return (EAttribute)fluxServerConnectionConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluxFactory getFluxFactory() {
		return (FluxFactory)getEFactoryInstance();
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
		fluxServerConnectionConfigEClass = createEClass(FLUX_SERVER_CONNECTION_CONFIG);
		createEAttribute(fluxServerConnectionConfigEClass, FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID);
		createEAttribute(fluxServerConnectionConfigEClass, FLUX_SERVER_CONNECTION_CONFIG__HOST);
		createEAttribute(fluxServerConnectionConfigEClass, FLUX_SERVER_CONNECTION_CONFIG__LAZY_START);
		createEAttribute(fluxServerConnectionConfigEClass, FLUX_SERVER_CONNECTION_CONFIG__TOKEN);
		createEAttribute(fluxServerConnectionConfigEClass, FLUX_SERVER_CONNECTION_CONFIG__USER_NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fluxServerConnectionConfigEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(fluxServerConnectionConfigEClass, FluxServerConnectionConfig.class, "FluxServerConnectionConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFluxServerConnectionConfig_ChannelID(), ecorePackage.getEString(), "channelID", null, 0, 1, FluxServerConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFluxServerConnectionConfig_Host(), ecorePackage.getEString(), "host", null, 1, 1, FluxServerConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFluxServerConnectionConfig_LazyStart(), ecorePackage.getEBoolean(), "lazyStart", null, 0, 1, FluxServerConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFluxServerConnectionConfig_Token(), ecorePackage.getEString(), "token", null, 0, 1, FluxServerConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFluxServerConnectionConfig_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, FluxServerConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FluxPackageImpl
