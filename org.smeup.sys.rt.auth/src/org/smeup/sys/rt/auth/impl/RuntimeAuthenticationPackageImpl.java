/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.auth.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.rt.auth.QAuthentication;
import org.smeup.sys.rt.auth.QAuthenticationManager;
import org.smeup.sys.rt.auth.QAuthenticationUserPassword;
import org.smeup.sys.rt.auth.QRuntimeAuthenticationFactory;
import org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeAuthenticationPackageImpl extends EPackageImpl implements QRuntimeAuthenticationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationUserPasswordEClass = null;

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
	 * @see org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimeAuthenticationPackageImpl() {
		super(eNS_URI, QRuntimeAuthenticationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QRuntimeAuthenticationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QRuntimeAuthenticationPackage init() {
		if (isInited) return (QRuntimeAuthenticationPackage)EPackage.Registry.INSTANCE.getEPackage(QRuntimeAuthenticationPackage.eNS_URI);

		// Obtain or create and register package
		RuntimeAuthenticationPackageImpl theRuntimeAuthenticationPackage = (RuntimeAuthenticationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimeAuthenticationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimeAuthenticationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimeAuthenticationPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimeAuthenticationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimeAuthenticationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QRuntimeAuthenticationPackage.eNS_URI, theRuntimeAuthenticationPackage);
		return theRuntimeAuthenticationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationManager() {
		return authenticationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationUserPassword() {
		return authenticationUserPasswordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationUserPassword_User() {
		return (EAttribute)authenticationUserPasswordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationUserPassword_Password() {
		return (EAttribute)authenticationUserPasswordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRuntimeAuthenticationFactory getRuntimeAuthenticationFactory() {
		return (QRuntimeAuthenticationFactory)getEFactoryInstance();
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
		authenticationEClass = createEClass(AUTHENTICATION);

		authenticationManagerEClass = createEClass(AUTHENTICATION_MANAGER);

		authenticationUserPasswordEClass = createEClass(AUTHENTICATION_USER_PASSWORD);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__USER);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__PASSWORD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authenticationEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		authenticationUserPasswordEClass.getESuperTypes().add(this.getAuthentication());

		// Initialize classes and features; add operations and parameters
		initEClass(authenticationEClass, QAuthentication.class, "Authentication", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationManagerEClass, QAuthenticationManager.class, "AuthenticationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(authenticationManagerEClass, null, "authenticate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthentication(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getIdentity());
		EGenericType g2 = createEGenericType(this.getAuthentication());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(authenticationUserPasswordEClass, QAuthenticationUserPassword.class, "AuthenticationUserPassword", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationUserPassword_User(), ecorePackage.getEString(), "user", null, 1, 1, QAuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserPassword_Password(), ecorePackage.getEString(), "password", null, 1, 1, QAuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimeAuthenticationPackageImpl
