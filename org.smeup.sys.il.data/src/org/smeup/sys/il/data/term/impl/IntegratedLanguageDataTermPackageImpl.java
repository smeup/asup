/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl;
import org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl;
import org.smeup.sys.il.data.term.DataTermType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QDataTermContainer;
import org.smeup.sys.il.data.term.QDataTermVisitor;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataTermPackageImpl extends EPackageImpl implements QIntegratedLanguageDataTermPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTermEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTermContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTermVisitorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTermTypeEEnum = null;

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
	 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageDataTermPackageImpl() {
		super(eNS_URI, QIntegratedLanguageDataTermFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageDataTermPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageDataTermPackage init() {
		if (isInited) return (QIntegratedLanguageDataTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageDataTermPackageImpl theIntegratedLanguageDataTermPackage = (IntegratedLanguageDataTermPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageDataTermPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageDataTermPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IntegratedLanguageDataPackageImpl theIntegratedLanguageDataPackage = (IntegratedLanguageDataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI) instanceof IntegratedLanguageDataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI) : QIntegratedLanguageDataPackage.eINSTANCE);
		IntegratedLanguageDataDefPackageImpl theIntegratedLanguageDataDefPackage = (IntegratedLanguageDataDefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI) instanceof IntegratedLanguageDataDefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI) : QIntegratedLanguageDataDefPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageDataTermPackage.createPackageContents();
		theIntegratedLanguageDataPackage.createPackageContents();
		theIntegratedLanguageDataDefPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageDataTermPackage.initializePackageContents();
		theIntegratedLanguageDataPackage.initializePackageContents();
		theIntegratedLanguageDataDefPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageDataTermPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageDataTermPackage.eNS_URI, theIntegratedLanguageDataTermPackage);
		return theIntegratedLanguageDataTermPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTerm() {
		return dataTermEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTerm_Constant() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataTerm_Definition() {
		return (EReference)dataTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTerm_Initialized() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTerm_Like() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTerm_Name() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTerm_Restricted() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTerm_Text() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTermContainer() {
		return dataTermContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTermVisitor() {
		return dataTermVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTermType() {
		return dataTermTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageDataTermFactory getIntegratedLanguageDataTermFactory() {
		return (QIntegratedLanguageDataTermFactory)getEFactoryInstance();
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
		dataTermEClass = createEClass(DATA_TERM);
		createEAttribute(dataTermEClass, DATA_TERM__CONSTANT);
		createEReference(dataTermEClass, DATA_TERM__DEFINITION);
		createEAttribute(dataTermEClass, DATA_TERM__INITIALIZED);
		createEAttribute(dataTermEClass, DATA_TERM__LIKE);
		createEAttribute(dataTermEClass, DATA_TERM__NAME);
		createEAttribute(dataTermEClass, DATA_TERM__RESTRICTED);
		createEAttribute(dataTermEClass, DATA_TERM__TEXT);

		dataTermContainerEClass = createEClass(DATA_TERM_CONTAINER);

		dataTermVisitorEClass = createEClass(DATA_TERM_VISITOR);

		// Create enums
		dataTermTypeEEnum = createEEnum(DATA_TERM_TYPE);
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
		QIntegratedLanguageDataDefPackage theIntegratedLanguageDataDefPackage = (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);
		QIntegratedLanguageCoreTermPackage theIntegratedLanguageCoreTermPackage = (QIntegratedLanguageCoreTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI);

		// Create type parameters
		ETypeParameter dataTermEClass_DD = addETypeParameter(dataTermEClass, "DD");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getDataDef());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		dataTermEClass_DD.getEBounds().add(g1);

		// Add supertypes to classes
		dataTermEClass.getESuperTypes().add(theIntegratedLanguageCoreTermPackage.getTerm());
		g1 = createEGenericType(theIntegratedLanguageCoreTermPackage.getTermContainer());
		g2 = createEGenericType(this.getDataTerm());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		dataTermContainerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(dataTermEClass, QDataTerm.class, "DataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTerm_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(dataTermEClass_DD);
		initEReference(getDataTerm_Definition(), g1, null, "definition", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Initialized(), ecorePackage.getEBoolean(), "initialized", null, 1, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Like(), ecorePackage.getEString(), "like", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Restricted(), ecorePackage.getEBoolean(), "restricted", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Text(), ecorePackage.getEString(), "text", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(dataTermEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTermVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataTermEClass, this.getDataTermType(), "getDataTermType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTermContainerEClass, QDataTermContainer.class, "DataTermContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTermVisitorEClass, QDataTermVisitor.class, "DataTermVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataTermVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTermTypeEEnum, DataTermType.class, "DataTermType");
		addEEnumLiteral(dataTermTypeEEnum, DataTermType.UNARY_ATOMIC);
		addEEnumLiteral(dataTermTypeEEnum, DataTermType.UNARY_COMPOUND);
		addEEnumLiteral(dataTermTypeEEnum, DataTermType.MULTIPLE_ATOMIC);
		addEEnumLiteral(dataTermTypeEEnum, DataTermType.MULTIPLE_COMPOUND);
	}

} // IntegratedLanguageDataTermPackageImpl
