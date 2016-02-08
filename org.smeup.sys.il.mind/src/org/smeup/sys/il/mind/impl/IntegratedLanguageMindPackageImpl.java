/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.mind.QGoal;
import org.smeup.sys.il.mind.QIntegratedLanguageMindFactory;
import org.smeup.sys.il.mind.QIntegratedLanguageMindPackage;
import org.smeup.sys.il.mind.QMindManager;
import org.smeup.sys.il.mind.QMindTerm;
import org.smeup.sys.il.mind.QQuestion;
import org.smeup.sys.il.mind.QReasoner;
import org.smeup.sys.il.mind.QTheory;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageMindPackageImpl extends EPackageImpl implements QIntegratedLanguageMindPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonerEClass = null;

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
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageMindPackageImpl() {
		super(eNS_URI, QIntegratedLanguageMindFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageMindPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageMindPackage init() {
		if (isInited) return (QIntegratedLanguageMindPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageMindPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageMindPackageImpl theIntegratedLanguageMindPackage = (IntegratedLanguageMindPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageMindPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageMindPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageMindPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageMindPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageMindPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageMindPackage.eNS_URI, theIntegratedLanguageMindPackage);
		return theIntegratedLanguageMindPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Terms() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindManager() {
		return mindManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindTerm() {
		return mindTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindTerm_Name() {
		return (EAttribute)mindTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Object() {
		return (EReference)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Subject() {
		return (EReference)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Relation() {
		return (EReference)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Rule() {
		return (EReference)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheory() {
		return theoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheory_Name() {
		return (EAttribute)theoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheory_Facts() {
		return (EReference)theoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoner() {
		return reasonerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageMindFactory getIntegratedLanguageMindFactory() {
		return (QIntegratedLanguageMindFactory)getEFactoryInstance();
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
		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__TERMS);

		mindManagerEClass = createEClass(MIND_MANAGER);

		mindTermEClass = createEClass(MIND_TERM);
		createEAttribute(mindTermEClass, MIND_TERM__NAME);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__OBJECT);
		createEReference(questionEClass, QUESTION__SUBJECT);
		createEReference(questionEClass, QUESTION__RELATION);
		createEReference(questionEClass, QUESTION__RULE);

		theoryEClass = createEClass(THEORY);
		createEAttribute(theoryEClass, THEORY__NAME);
		createEReference(theoryEClass, THEORY__FACTS);

		reasonerEClass = createEClass(REASONER);
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
		QIntegratedLanguageCoreMetaPackage theIntegratedLanguageCoreMetaPackage = (QIntegratedLanguageCoreMetaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI);
		QIntegratedLanguageCoreTermPackage theIntegratedLanguageCoreTermPackage = (QIntegratedLanguageCoreTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		goalEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		mindTermEClass.getESuperTypes().add(theIntegratedLanguageCoreTermPackage.getTerm());
		questionEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		theoryEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		reasonerEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		reasonerEClass.getESuperTypes().add(theMachineInterfaceCorePackage.getJavaCloseable());

		// Initialize classes and features; add operations and parameters
		initEClass(goalEClass, QGoal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Terms(), this.getMindTerm(), null, "terms", null, 0, -1, QGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindManagerEClass, QMindManager.class, "MindManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(mindManagerEClass, this.getTheory(), "buildTheory", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "O");
		EGenericType g1 = createEGenericType(theIntegratedLanguageCorePackage.getObject());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageCoreMetaPackage.getFrame());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindManagerEClass, this.getReasoner(), "createReasoner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mindTermEClass, QMindTerm.class, "MindTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMindTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, QMindTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, QQuestion.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_Object(), this.getMindTerm(), null, "object", null, 0, 1, QQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Subject(), this.getMindTerm(), null, "subject", null, 0, 1, QQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Relation(), this.getMindTerm(), null, "relation", null, 0, 1, QQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Rule(), this.getMindTerm(), null, "rule", null, 0, 1, QQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theoryEClass, QTheory.class, "Theory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTheory_Name(), ecorePackage.getEString(), "name", null, 1, 1, QTheory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheory_Facts(), this.getMindTerm(), null, "facts", null, 0, -1, QTheory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reasonerEClass, QReasoner.class, "Reasoner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonerEClass, this.getQuestion(), "buildQuestion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "question", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(reasonerEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonerEClass, null, "loadTheory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTheory(), "theory", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonerEClass, this.getGoal(), "query", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "question", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonerEClass, this.getGoal(), "query", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQuestion(), "question", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(reasonerEClass, null, "reload", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageMindPackageImpl
