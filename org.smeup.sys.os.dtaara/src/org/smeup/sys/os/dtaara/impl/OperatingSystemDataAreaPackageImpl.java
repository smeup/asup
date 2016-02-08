/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaara.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.os.dtaara.DataAreaType;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.dtaara.QOperatingSystemDataAreaFactory;
import org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemDataAreaPackageImpl extends EPackageImpl implements QOperatingSystemDataAreaPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAreaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAreaManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataAreaTypeEEnum = null;

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
	 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemDataAreaPackageImpl() {
		super(eNS_URI, QOperatingSystemDataAreaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemDataAreaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemDataAreaPackage init() {
		if (isInited) return (QOperatingSystemDataAreaPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemDataAreaPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemDataAreaPackageImpl theOperatingSystemDataAreaPackage = (OperatingSystemDataAreaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemDataAreaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemDataAreaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemDataAreaPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemDataAreaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemDataAreaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemDataAreaPackage.eNS_URI, theOperatingSystemDataAreaPackage);
		return theOperatingSystemDataAreaPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataArea() {
		return dataAreaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataArea_DataAreaType() {
		return (EAttribute)dataAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataArea_ContentLength() {
		return (EAttribute)dataAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataArea_ContentDecimal() {
		return (EAttribute)dataAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataArea_Content() {
		return (EAttribute)dataAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAreaManager() {
		return dataAreaManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataAreaType() {
		return dataAreaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemDataAreaFactory getOperatingSystemDataAreaFactory() {
		return (QOperatingSystemDataAreaFactory)getEFactoryInstance();
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
		dataAreaEClass = createEClass(DATA_AREA);
		createEAttribute(dataAreaEClass, DATA_AREA__DATA_AREA_TYPE);
		createEAttribute(dataAreaEClass, DATA_AREA__CONTENT_LENGTH);
		createEAttribute(dataAreaEClass, DATA_AREA__CONTENT_DECIMAL);
		createEAttribute(dataAreaEClass, DATA_AREA__CONTENT);

		dataAreaManagerEClass = createEClass(DATA_AREA_MANAGER);

		// Create enums
		dataAreaTypeEEnum = createEEnum(DATA_AREA_TYPE);
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
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataAreaEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(dataAreaEClass, QDataArea.class, "DataArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataArea_DataAreaType(), this.getDataAreaType(), "dataAreaType", null, 1, 1, QDataArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataArea_ContentLength(), ecorePackage.getEInt(), "contentLength", null, 1, 1, QDataArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataArea_ContentDecimal(), ecorePackage.getEInt(), "contentDecimal", null, 0, 1, QDataArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataArea_Content(), ecorePackage.getEString(), "content", null, 0, 1, QDataArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAreaManagerEClass, QDataAreaManager.class, "DataAreaManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(dataAreaManagerEClass, this.getDataArea(), "getLocalDataArea", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataAreaTypeEEnum, DataAreaType.class, "DataAreaType");
		addEEnumLiteral(dataAreaTypeEEnum, DataAreaType.CHARACTER);
		addEEnumLiteral(dataAreaTypeEEnum, DataAreaType.DECIMAL);
		addEEnumLiteral(dataAreaTypeEEnum, DataAreaType.LOGICAL);
		addEEnumLiteral(dataAreaTypeEEnum, DataAreaType.DISTRIBUTED);

		// Create resource
		createResource(eNS_URI);
	}

} // OperatingSystemDataAreaPackageImpl
