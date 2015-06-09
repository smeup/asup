/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.dk.test.AssertionState;
import org.smeup.sys.dk.test.QAsserter;
import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QAssertionSuccess;
import org.smeup.sys.dk.test.QCallableTest;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QDevelopmentKitTestPackage;
import org.smeup.sys.dk.test.QSuiteTestRunner;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestContainer;
import org.smeup.sys.dk.test.QTestListener;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QUnitTestRunner;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DevelopmentKitTestPackageImpl extends EPackageImpl implements QDevelopmentKitTestPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asserterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionFailedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionResultEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionSuccessEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableTestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suiteTestRunnerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testAsserterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testListenerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testResultEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestRunnerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionStateEEnum = null;

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
	 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitTestPackageImpl() {
		super(eNS_URI, QDevelopmentKitTestFactory.eINSTANCE);
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
	 * This method is used to initialize {@link QDevelopmentKitTestPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitTestPackage init() {
		if (isInited) return (QDevelopmentKitTestPackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitTestPackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitTestPackageImpl theDevelopmentKitTestPackage = (DevelopmentKitTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitTestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevelopmentKitTestPackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitTestPackage.eNS_URI, theDevelopmentKitTestPackage);
		return theDevelopmentKitTestPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsserter() {
		return asserterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertionFailed() {
		return assertionFailedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertionResult() {
		return assertionResultEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionResult_Message() {
		return (EAttribute)assertionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionResult_Time() {
		return (EAttribute)assertionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertionSuccess() {
		return assertionSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallableTest() {
		return callableTestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuiteTestRunner() {
		return suiteTestRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestAsserter() {
		return testAsserterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestContainer() {
		return testContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestContainer_Tests() {
		return (EReference)testContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestListener() {
		return testListenerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestManager() {
		return testManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestResult() {
		return testResultEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Failed() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Object() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Runner() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Time() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestResult_AssertResults() {
		return (EReference)testResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Category() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestRunner() {
		return testRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRunner_Listeners() {
		return (EReference)testRunnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitTestRunner() {
		return unitTestRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssertionState() {
		return assertionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitTestFactory getDevelopmentKitTestFactory() {
		return (QDevelopmentKitTestFactory)getEFactoryInstance();
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
		asserterEClass = createEClass(ASSERTER);

		assertionFailedEClass = createEClass(ASSERTION_FAILED);

		assertionResultEClass = createEClass(ASSERTION_RESULT);
		createEAttribute(assertionResultEClass, ASSERTION_RESULT__MESSAGE);
		createEAttribute(assertionResultEClass, ASSERTION_RESULT__TIME);

		assertionSuccessEClass = createEClass(ASSERTION_SUCCESS);

		callableTestEClass = createEClass(CALLABLE_TEST);

		suiteTestRunnerEClass = createEClass(SUITE_TEST_RUNNER);

		testAsserterEClass = createEClass(TEST_ASSERTER);

		testContainerEClass = createEClass(TEST_CONTAINER);
		createEReference(testContainerEClass, TEST_CONTAINER__TESTS);

		testListenerEClass = createEClass(TEST_LISTENER);

		testManagerEClass = createEClass(TEST_MANAGER);

		testResultEClass = createEClass(TEST_RESULT);
		createEReference(testResultEClass, TEST_RESULT__ASSERT_RESULTS);
		createEAttribute(testResultEClass, TEST_RESULT__CATEGORY);
		createEAttribute(testResultEClass, TEST_RESULT__FAILED);
		createEAttribute(testResultEClass, TEST_RESULT__OBJECT);
		createEAttribute(testResultEClass, TEST_RESULT__RUNNER);
		createEAttribute(testResultEClass, TEST_RESULT__TIME);

		testRunnerEClass = createEClass(TEST_RUNNER);
		createEReference(testRunnerEClass, TEST_RUNNER__LISTENERS);

		unitTestRunnerEClass = createEClass(UNIT_TEST_RUNNER);

		// Create enums
		assertionStateEEnum = createEEnum(ASSERTION_STATE);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreJavaPackage theIntegratedLanguageCoreJavaPackage = (QIntegratedLanguageCoreJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assertionFailedEClass.getESuperTypes().add(this.getAssertionResult());
		assertionResultEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		assertionSuccessEClass.getESuperTypes().add(this.getAssertionResult());
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreJavaPackage.getJavaCallable());
		EGenericType g2 = createEGenericType(this.getTestResult());
		g1.getETypeArguments().add(g2);
		callableTestEClass.getEGenericSuperTypes().add(g1);
		suiteTestRunnerEClass.getESuperTypes().add(this.getTestRunner());
		testAsserterEClass.getESuperTypes().add(this.getAsserter());
		testContainerEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		testResultEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		testRunnerEClass.getESuperTypes().add(this.getCallableTest());
		testRunnerEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		unitTestRunnerEClass.getESuperTypes().add(this.getTestRunner());

		// Initialize classes and features; add operations and parameters
		initEClass(asserterEClass, QAsserter.class, "Asserter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(asserterEClass, null, "assertTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEChar(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertEquals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "assertNotSame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "expected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "actual", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asserterEClass, null, "fail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionFailedEClass, QAssertionFailed.class, "AssertionFailed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionResultEClass, QAssertionResult.class, "AssertionResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionResult_Message(), ecorePackage.getEString(), "message", null, 0, 1, QAssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertionResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, QAssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(assertionResultEClass, this.getAssertionState(), "getAssertionState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionSuccessEClass, QAssertionSuccess.class, "AssertionSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callableTestEClass, QCallableTest.class, "CallableTest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suiteTestRunnerEClass, QSuiteTestRunner.class, "SuiteTestRunner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testAsserterEClass, QTestAsserter.class, "TestAsserter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(testAsserterEClass, null, "resetTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testContainerEClass, QTestContainer.class, "TestContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestContainer_Tests(), this.getTestRunner(), null, "tests", null, 0, -1, QTestContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testListenerEClass, QTestListener.class, "TestListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testListenerEClass, null, "addAssertionResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssertionResult(), "assertionResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testListenerEClass, null, "startTest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunner(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testListenerEClass, null, "endTest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunner(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testManagerEClass, QTestManager.class, "TestManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testManagerEClass, theIntegratedLanguageCoreCtxPackage.getContext(), "prepareContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testManagerEClass, this.getTestRunner(), "prepareRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testManagerEClass, this.getTestRunner(), "prepareRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "classURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testResultEClass, QTestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestResult_AssertResults(), this.getAssertionResult(), null, "assertResults", null, 0, -1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Category(), ecorePackage.getEString(), "category", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Failed(), ecorePackage.getEBoolean(), "failed", "false", 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Object(), ecorePackage.getEString(), "object", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Runner(), ecorePackage.getEString(), "runner", null, 1, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testRunnerEClass, QTestRunner.class, "TestRunner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRunner_Listeners(), this.getTestListener(), null, "listeners", null, 0, -1, QTestRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTestRunnerEClass, QUnitTestRunner.class, "UnitTestRunner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(assertionStateEEnum, AssertionState.class, "AssertionState");
		addEEnumLiteral(assertionStateEEnum, AssertionState.SUCCESS);
		addEEnumLiteral(assertionStateEEnum, AssertionState.FAILED);

		// Create resource
		createResource(eNS_URI);
	}

} // FrameworkTestPackageImpl
