/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrspc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.term.QTermPackage;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.usrspc.QOperatingSystemUserSpaceFactory;
import org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage;
import org.smeup.sys.os.usrspc.QUserSpace;
import org.smeup.sys.os.usrspc.QUserSpaceManager;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemUserSpacePackageImpl extends EPackageImpl implements QOperatingSystemUserSpacePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSpaceManagerEClass = null;

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
	 * @see org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemUserSpacePackageImpl() {
		super(eNS_URI, QOperatingSystemUserSpaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemUserSpacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemUserSpacePackage init() {
		if (isInited) return (QOperatingSystemUserSpacePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemUserSpacePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemUserSpacePackageImpl theOperatingSystemUserSpacePackage = (OperatingSystemUserSpacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemUserSpacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemUserSpacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();
		QIntegratedLanguageLockPackage.eINSTANCE.eClass();
		QDefPackage.eINSTANCE.eClass();
		QTermPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemUserSpacePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemUserSpacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemUserSpacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemUserSpacePackage.eNS_URI, theOperatingSystemUserSpacePackage);
		return theOperatingSystemUserSpacePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserSpace() {
		return userSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSpace_Attribute() {
		return (EAttribute)userSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSpace_Header() {
		return (EAttribute)userSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSpace_Content() {
		return (EAttribute)userSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSpace_ContentArray() {
		return (EAttribute)userSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserSpaceManager() {
		return userSpaceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemUserSpaceFactory getOperatingSystemUserSpaceFactory() {
		return (QOperatingSystemUserSpaceFactory)getEFactoryInstance();
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
		userSpaceEClass = createEClass(USER_SPACE);
		createEAttribute(userSpaceEClass, USER_SPACE__ATTRIBUTE);
		createEAttribute(userSpaceEClass, USER_SPACE__HEADER);
		createEAttribute(userSpaceEClass, USER_SPACE__CONTENT);
		createEAttribute(userSpaceEClass, USER_SPACE__CONTENT_ARRAY);

		userSpaceManagerEClass = createEClass(USER_SPACE_MANAGER);
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
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userSpaceEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(userSpaceEClass, QUserSpace.class, "UserSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserSpace_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, QUserSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSpace_Header(), ecorePackage.getEString(), "header", null, 0, 1, QUserSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSpace_Content(), ecorePackage.getEString(), "content", null, 0, 1, QUserSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSpace_ContentArray(), ecorePackage.getEByteArray(), "contentArray", null, 0, 1, QUserSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userSpaceManagerEClass, QUserSpaceManager.class, "UserSpaceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // OSUserSpaceCorePackageImpl
