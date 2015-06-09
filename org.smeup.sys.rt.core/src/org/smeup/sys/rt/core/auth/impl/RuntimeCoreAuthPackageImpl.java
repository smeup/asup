/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.auth.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.rt.core.QRuntimeCorePackage;

import org.smeup.sys.rt.core.auth.QAuthenticationManager;
import org.smeup.sys.rt.core.auth.QAuthenticationToken;
import org.smeup.sys.rt.core.auth.QRuntimeCoreAuthFactory;
import org.smeup.sys.rt.core.auth.QRuntimeCoreAuthPackage;

import org.smeup.sys.rt.core.impl.RuntimeCorePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeCoreAuthPackageImpl extends EPackageImpl implements QRuntimeCoreAuthPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationManagerEClass = null;

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
	 * @see org.smeup.sys.rt.core.auth.QRuntimeCoreAuthPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimeCoreAuthPackageImpl() {
		super(eNS_URI, QRuntimeCoreAuthFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QRuntimeCoreAuthPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QRuntimeCoreAuthPackage init() {
		if (isInited) return (QRuntimeCoreAuthPackage)EPackage.Registry.INSTANCE.getEPackage(QRuntimeCoreAuthPackage.eNS_URI);

		// Obtain or create and register package
		RuntimeCoreAuthPackageImpl theRuntimeCoreAuthPackage = (RuntimeCoreAuthPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimeCoreAuthPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimeCoreAuthPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RuntimeCorePackageImpl theRuntimeCorePackage = (RuntimeCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QRuntimeCorePackage.eNS_URI) instanceof RuntimeCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QRuntimeCorePackage.eNS_URI) : QRuntimeCorePackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimeCoreAuthPackage.createPackageContents();
		theRuntimeCorePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimeCoreAuthPackage.initializePackageContents();
		theRuntimeCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimeCoreAuthPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QRuntimeCoreAuthPackage.eNS_URI, theRuntimeCoreAuthPackage);
		return theRuntimeCoreAuthPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationToken() {
		return authenticationTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationManager() {
		return authenticationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRuntimeCoreAuthFactory getRuntimeCoreAuthFactory() {
		return (QRuntimeCoreAuthFactory)getEFactoryInstance();
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
		authenticationTokenEClass = createEClass(AUTHENTICATION_TOKEN);

		authenticationManagerEClass = createEClass(AUTHENTICATION_MANAGER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(authenticationTokenEClass, QAuthenticationToken.class, "AuthenticationToken", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(authenticationTokenEClass, ecorePackage.getEString(), "getID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authenticationManagerEClass, QAuthenticationManager.class, "AuthenticationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(authenticationManagerEClass, this.getAuthenticationToken(), "createAuthenticationToken", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //RuntimeCoreAuthPackageImpl
