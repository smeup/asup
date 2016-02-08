/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.dk.core.DevelopmentStatusType;
import org.smeup.sys.dk.core.QComment;
import org.smeup.sys.dk.core.QDevelopmentKitCoreFactory;
import org.smeup.sys.dk.core.QDevelopmentKitCorePackage;
import org.smeup.sys.dk.core.QDevelopmentStatus;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentKitCorePackageImpl extends EPackageImpl implements QDevelopmentKitCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum developmentStatusTypeEEnum = null;

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
	 * @see org.smeup.sys.dk.core.QDevelopmentKitCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitCorePackageImpl() {
		super(eNS_URI, QDevelopmentKitCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDevelopmentKitCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitCorePackage init() {
		if (isInited) return (QDevelopmentKitCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitCorePackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitCorePackageImpl theDevelopmentKitCorePackage = (DevelopmentKitCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevelopmentKitCorePackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitCorePackage.eNS_URI, theDevelopmentKitCorePackage);
		return theDevelopmentKitCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentStatus() {
		return developmentStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevelopmentStatus_Value() {
		return (EAttribute)developmentStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Text() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDevelopmentStatusType() {
		return developmentStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitCoreFactory getDevelopmentKitCoreFactory() {
		return (QDevelopmentKitCoreFactory)getEFactoryInstance();
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
		developmentStatusEClass = createEClass(DEVELOPMENT_STATUS);
		createEAttribute(developmentStatusEClass, DEVELOPMENT_STATUS__VALUE);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TEXT);

		// Create enums
		developmentStatusTypeEEnum = createEEnum(DEVELOPMENT_STATUS_TYPE);
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
		QIntegratedLanguageCoreMetaPackage theIntegratedLanguageCoreMetaPackage = (QIntegratedLanguageCoreMetaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		developmentStatusEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		commentEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());

		// Initialize classes and features; add operations and parameters
		initEClass(developmentStatusEClass, QDevelopmentStatus.class, "DevelopmentStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevelopmentStatus_Value(), this.getDevelopmentStatusType(), "value", null, 1, 1, QDevelopmentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, QComment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 1, 1, QComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(developmentStatusTypeEEnum, DevelopmentStatusType.class, "DevelopmentStatusType");
		addEEnumLiteral(developmentStatusTypeEEnum, DevelopmentStatusType.SUPPORTED);
		addEEnumLiteral(developmentStatusTypeEEnum, DevelopmentStatusType.UNSUPPORTED);
		addEEnumLiteral(developmentStatusTypeEEnum, DevelopmentStatusType.TO_DO);

		// Create resource
		createResource(eNS_URI);
	}

} //DevelopmentKitCorePackageImpl
