/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.dk.test.AssertionState;
import org.smeup.sys.dk.test.QAsserter;
import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QAssertionSuccess;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QDevelopmentKitTestPackage;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QTestRunnerEvent;
import org.smeup.sys.dk.test.QTestRunnerListener;
import org.smeup.sys.dk.test.QTestRunnerMaker;
import org.smeup.sys.dk.test.QTestUnitRunner;
import org.smeup.sys.dk.test.TestRunnerEventType;
import org.smeup.sys.dk.test.QTestSuiteLauncher;
import org.smeup.sys.dk.test.QTestSuiteRunner;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

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
	private EClass testAsserterEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteLauncherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testUnitRunnerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testRunnerEventTypeEEnum = null;

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
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();

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
	public EClass getTestAsserter() {
		return testAsserterEClass;
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
	public EAttribute getTestResult_Object() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Runner() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestResult_Time() {
		return (EAttribute)testResultEClass.getEStructuralFeatures().get(4);
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
	public EClass getTestRunnerEvent() {
		return testRunnerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRunnerEvent_Source() {
		return (EReference)testRunnerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestRunnerEvent_Type() {
		return (EAttribute)testRunnerEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunnerListener() {
		return testRunnerListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunnerMaker() {
		return testRunnerMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuiteRunner() {
		return testSuiteRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuiteLauncher() {
		return testSuiteLauncherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestUnitRunner() {
		return testUnitRunnerEClass;
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
	public EEnum getTestRunnerEventType() {
		return testRunnerEventTypeEEnum;
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

		testAsserterEClass = createEClass(TEST_ASSERTER);

		testManagerEClass = createEClass(TEST_MANAGER);

		testRunnerEClass = createEClass(TEST_RUNNER);

		testRunnerEventEClass = createEClass(TEST_RUNNER_EVENT);
		createEReference(testRunnerEventEClass, TEST_RUNNER_EVENT__SOURCE);
		createEAttribute(testRunnerEventEClass, TEST_RUNNER_EVENT__TYPE);

		testRunnerListenerEClass = createEClass(TEST_RUNNER_LISTENER);

		testRunnerMakerEClass = createEClass(TEST_RUNNER_MAKER);

		testResultEClass = createEClass(TEST_RESULT);
		createEReference(testResultEClass, TEST_RESULT__ASSERT_RESULTS);
		createEAttribute(testResultEClass, TEST_RESULT__CATEGORY);
		createEAttribute(testResultEClass, TEST_RESULT__OBJECT);
		createEAttribute(testResultEClass, TEST_RESULT__RUNNER);
		createEAttribute(testResultEClass, TEST_RESULT__TIME);

		testSuiteLauncherEClass = createEClass(TEST_SUITE_LAUNCHER);

		testSuiteRunnerEClass = createEClass(TEST_SUITE_RUNNER);

		testUnitRunnerEClass = createEClass(TEST_UNIT_RUNNER);

		// Create enums
		assertionStateEEnum = createEEnum(ASSERTION_STATE);
		testRunnerEventTypeEEnum = createEEnum(TEST_RUNNER_EVENT_TYPE);
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
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assertionFailedEClass.getESuperTypes().add(this.getAssertionResult());
		assertionResultEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		assertionSuccessEClass.getESuperTypes().add(this.getAssertionResult());
		testAsserterEClass.getESuperTypes().add(this.getAsserter());
		testRunnerEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		testResultEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		EGenericType g1 = createEGenericType(this.getTestRunner());
		testSuiteRunnerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaCallable());
		EGenericType g2 = createEGenericType(theMachineInterfaceCorePackage.getJavaList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getTestResult());
		g2.getETypeArguments().add(g3);
		testSuiteRunnerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTestRunner());
		testUnitRunnerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaCallable());
		g2 = createEGenericType(this.getTestResult());
		g1.getETypeArguments().add(g2);
		testUnitRunnerEClass.getEGenericSuperTypes().add(g1);

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

		op = addEOperation(asserterEClass, null, "success", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionFailedEClass, QAssertionFailed.class, "AssertionFailed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionResultEClass, QAssertionResult.class, "AssertionResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionResult_Message(), ecorePackage.getEString(), "message", null, 0, 1, QAssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertionResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, QAssertionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(assertionResultEClass, this.getAssertionState(), "getAssertionState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionSuccessEClass, QAssertionSuccess.class, "AssertionSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testAsserterEClass, QTestAsserter.class, "TestAsserter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(testAsserterEClass, null, "resetTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testManagerEClass, QTestManager.class, "TestManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testManagerEClass, this.getTestSuiteRunner(), "prepareSuiteRunner", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerMaker(), "testMaker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testManagerEClass, this.getTestUnitRunner(), "prepareUnitRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerMaker(), "testMaker", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testManagerEClass, this.getTestUnitRunner(), "prepareUnitRunner", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerMaker(), "testMaker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "classURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testRunnerEClass, QTestRunner.class, "TestRunner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testRunnerEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testRunnerEClass, null, "removeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testRunnerEventEClass, QTestRunnerEvent.class, "TestRunnerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRunnerEvent_Source(), this.getTestRunner(), null, "source", null, 1, 1, QTestRunnerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestRunnerEvent_Type(), this.getTestRunnerEventType(), "type", null, 1, 1, QTestRunnerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testRunnerListenerEClass, QTestRunnerListener.class, "TestRunnerListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testRunnerListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTestRunnerEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testRunnerMakerEClass, QTestRunnerMaker.class, "TestRunnerMaker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testRunnerMakerEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(testResultEClass, QTestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestResult_AssertResults(), this.getAssertionResult(), null, "assertResults", null, 0, -1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Category(), ecorePackage.getEString(), "category", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Object(), ecorePackage.getEString(), "object", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Runner(), ecorePackage.getEString(), "runner", null, 1, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestResult_Time(), ecorePackage.getELong(), "time", null, 0, 1, QTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testResultEClass, ecorePackage.getEInt(), "getFailedCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testResultEClass, ecorePackage.getEInt(), "getSuccessCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testResultEClass, ecorePackage.getEBoolean(), "isFailed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testSuiteLauncherEClass, QTestSuiteLauncher.class, "TestSuiteLauncher", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(testSuiteLauncherEClass, this.getTestSuiteRunner(), "createSuite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testSuiteRunnerEClass, QTestSuiteRunner.class, "TestSuiteRunner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testUnitRunnerEClass, QTestUnitRunner.class, "TestUnitRunner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(assertionStateEEnum, AssertionState.class, "AssertionState");
		addEEnumLiteral(assertionStateEEnum, AssertionState.SUCCESS);
		addEEnumLiteral(assertionStateEEnum, AssertionState.FAILED);

		initEEnum(testRunnerEventTypeEEnum, TestRunnerEventType.class, "TestRunnerEventType");
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.UNIT_STARTING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.UNIT_STOPPING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.UNIT_STOPPED);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.SUITE_STARTING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.SUITE_STOPPING);
		addEEnumLiteral(testRunnerEventTypeEEnum, TestRunnerEventType.SUITE_STOPPED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// il-data
		createIldataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (getAssertionResult_Message(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (testResultEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "precision", "5",
			 "scale", "0"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });	
		addAnnotation
		  (testResultEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "precision", "5",
			 "scale", "0"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/DecimalDef")
		   });	
		addAnnotation
		  (testResultEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "length", "5"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTestResult_Category(), 
		   source, 
		   new String[] {
			 "length", "15"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTestResult_Object(), 
		   source, 
		   new String[] {
			 "length", "15"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getTestResult_Runner(), 
		   source, 
		   new String[] {
			 "length", "25"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

} // FrameworkTestPackageImpl
