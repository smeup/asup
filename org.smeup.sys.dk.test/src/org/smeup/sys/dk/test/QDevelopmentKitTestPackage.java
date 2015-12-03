/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestFactory
 * @model kind="package"
 * @generated
 */
public interface QDevelopmentKitTestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/dk/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitTestPackage eINSTANCE = org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.QAsserter <em>Asserter</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.test.QAsserter
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAsserter()
	 * @generated
	 */
	int ASSERTER = 0;

	/**
	 * The number of structural features of the '<em>Asserter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.AssertionResultImpl <em>Assertion Result</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.AssertionResultImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionResult()
	 * @generated
	 */
	int ASSERTION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Assertion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__ASSERTION_STATE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__MESSAGE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT__TIME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assertion Result</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_RESULT_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.AssertionFailedImpl <em>Assertion Failed</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.AssertionFailedImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionFailed()
	 * @generated
	 */
	int ASSERTION_FAILED = 1;

	/**
	 * The feature id for the '<em><b>Assertion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__ASSERTION_STATE = ASSERTION_RESULT__ASSERTION_STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED__TIME = ASSERTION_RESULT__TIME;

	/**
	 * The number of structural features of the '<em>Assertion Failed</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.AssertionSuccessImpl <em>Assertion Success</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.AssertionSuccessImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionSuccess()
	 * @generated
	 */
	int ASSERTION_SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Assertion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__ASSERTION_STATE = ASSERTION_RESULT__ASSERTION_STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS__TIME = ASSERTION_RESULT__TIME;

	/**
	 * The number of structural features of the '<em>Assertion Success</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SUCCESS_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.QCallableTest
	 * <em>Callable Test</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.dk.test.QCallableTest
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getCallableTest()
	 * @generated
	 */
	int CALLABLE_TEST = 4;

	/**
	 * The number of structural features of the '<em>Callable Test</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_TEST_FEATURE_COUNT = QMachineInterfaceCorePackage.JAVA_CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.MessageImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Assertion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ASSERTION_STATE = ASSERTION_RESULT__ASSERTION_STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE = ASSERTION_RESULT__MESSAGE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIME = ASSERTION_RESULT__TIME;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ASSERTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.TestRunnerImpl
	 * <em>Test Runner</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.dk.test.impl.TestRunnerImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestRunner()
	 * @generated
	 */
	int TEST_RUNNER = 12;

	/**
	 * The number of structural features of the '<em>Test Runner</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_FEATURE_COUNT = CALLABLE_TEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.SuiteTestRunnerImpl <em>Suite Test Runner</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.SuiteTestRunnerImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getSuiteTestRunner()
	 * @generated
	 */
	int SUITE_TEST_RUNNER = 6;

	/**
	 * The number of structural features of the '<em>Suite Test Runner</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_TEST_RUNNER_FEATURE_COUNT = TEST_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.QTestAsserter
	 * <em>Test Asserter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.dk.test.QTestAsserter
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestAsserter()
	 * @generated
	 */
	int TEST_ASSERTER = 7;

	/**
	 * The number of structural features of the '<em>Test Asserter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSERTER_FEATURE_COUNT = ASSERTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.TestContainerImpl <em>Test Container</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.TestContainerImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestContainer()
	 * @generated
	 */
	int TEST_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTAINER__TESTS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTAINER_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.QTestRunnerListener <em>Test Runner Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.test.QTestRunnerListener
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestRunnerListener()
	 * @generated
	 */
	int TEST_RUNNER_LISTENER = 9;

	/**
	 * The number of structural features of the '<em>Test Runner Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.QTestManager
	 * <em>Test Manager</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.dk.test.QTestManager
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestManager()
	 * @generated
	 */
	int TEST_MANAGER = 10;

	/**
	 * The number of structural features of the '<em>Test Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.TestResultImpl
	 * <em>Test Result</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.dk.test.impl.TestResultImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestResult()
	 * @generated
	 */
	int TEST_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Assert Results</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__ASSERT_RESULTS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__CATEGORY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__FAILED = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__OBJECT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__RUNNER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__TIME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.UnitTestRunnerImpl <em>Unit Test Runner</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.UnitTestRunnerImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getUnitTestRunner()
	 * @generated
	 */
	int UNIT_TEST_RUNNER = 13;

	/**
	 * The number of structural features of the '<em>Unit Test Runner</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_RUNNER_FEATURE_COUNT = TEST_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.impl.TestLauncherImpl <em>Test Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.test.impl.TestLauncherImpl
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestLauncher()
	 * @generated
	 */
	int TEST_LAUNCHER = 14;

	/**
	 * The number of structural features of the '<em>Test Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LAUNCHER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.QTestLauncherListener <em>Test Launcher Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.test.QTestLauncherListener
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestLauncherListener()
	 * @generated
	 */
	int TEST_LAUNCHER_LISTENER = 15;

	/**
	 * The number of structural features of the '<em>Test Launcher Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LAUNCHER_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.test.AssertionState <em>Assertion State</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.dk.test.AssertionState
	 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionState()
	 * @generated
	 */
	int ASSERTION_STATE = 16;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QAsserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserter</em>'.
	 * @see org.smeup.sys.dk.test.QAsserter
	 * @generated
	 */
	EClass getAsserter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QAssertionFailed <em>Assertion Failed</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Failed</em>'.
	 * @see org.smeup.sys.dk.test.QAssertionFailed
	 * @generated
	 */
	EClass getAssertionFailed();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QAssertionResult <em>Assertion Result</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Result</em>'.
	 * @see org.smeup.sys.dk.test.QAssertionResult
	 * @generated
	 */
	EClass getAssertionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.test.QAssertionResult#getAssertionState <em>Assertion State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assertion State</em>'.
	 * @see org.smeup.sys.dk.test.QAssertionResult#getAssertionState()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_AssertionState();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.test.QAssertionResult#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.smeup.sys.dk.test.QAssertionResult#getMessage()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_Message();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.dk.test.QAssertionResult#getTime <em>Time</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.smeup.sys.dk.test.QAssertionResult#getTime()
	 * @see #getAssertionResult()
	 * @generated
	 */
	EAttribute getAssertionResult_Time();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QAssertionSuccess <em>Assertion Success</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Success</em>'.
	 * @see org.smeup.sys.dk.test.QAssertionSuccess
	 * @generated
	 */
	EClass getAssertionSuccess();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QCallableTest <em>Callable Test</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Test</em>'.
	 * @see org.smeup.sys.dk.test.QCallableTest
	 * @generated
	 */
	EClass getCallableTest();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.smeup.sys.dk.test.QMessage
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QSuiteTestRunner <em>Suite Test Runner</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite Test Runner</em>'.
	 * @see org.smeup.sys.dk.test.QSuiteTestRunner
	 * @generated
	 */
	EClass getSuiteTestRunner();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestAsserter <em>Test Asserter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Asserter</em>'.
	 * @see org.smeup.sys.dk.test.QTestAsserter
	 * @generated
	 */
	EClass getTestAsserter();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.dk.test.QTestContainer <em>Test Container</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Test Container</em>'.
	 * @see org.smeup.sys.dk.test.QTestContainer
	 * @generated
	 */
	EClass getTestContainer();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.smeup.sys.dk.test.QTestContainer#getTests <em>Tests</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Tests</em>'.
	 * @see org.smeup.sys.dk.test.QTestContainer#getTests()
	 * @see #getTestContainer()
	 * @generated
	 */
	EReference getTestContainer_Tests();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestRunnerListener <em>Test Runner Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner Listener</em>'.
	 * @see org.smeup.sys.dk.test.QTestRunnerListener
	 * @generated
	 */
	EClass getTestRunnerListener();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestManager <em>Test Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Manager</em>'.
	 * @see org.smeup.sys.dk.test.QTestManager
	 * @generated
	 */
	EClass getTestManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Result</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult
	 * @generated
	 */
	EClass getTestResult();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.dk.test.QTestResult#isFailed <em>Failed</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Failed</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult#isFailed()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Failed();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.dk.test.QTestResult#getObject <em>Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult#getObject()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Object();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.dk.test.QTestResult#getRunner <em>Runner</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Runner</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult#getRunner()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Runner();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.dk.test.QTestResult#getTime <em>Time</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult#getTime()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.dk.test.QTestResult#getAssertResults <em>Assert Results</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assert Results</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult#getAssertResults()
	 * @see #getTestResult()
	 * @generated
	 */
	EReference getTestResult_AssertResults();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.dk.test.QTestResult#getCategory <em>Category</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.smeup.sys.dk.test.QTestResult#getCategory()
	 * @see #getTestResult()
	 * @generated
	 */
	EAttribute getTestResult_Category();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestRunner <em>Test Runner</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner</em>'.
	 * @see org.smeup.sys.dk.test.QTestRunner
	 * @generated
	 */
	EClass getTestRunner();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.dk.test.QUnitTestRunner <em>Unit Test Runner</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Test Runner</em>'.
	 * @see org.smeup.sys.dk.test.QUnitTestRunner
	 * @generated
	 */
	EClass getUnitTestRunner();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestLauncher <em>Test Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Launcher</em>'.
	 * @see org.smeup.sys.dk.test.QTestLauncher
	 * @generated
	 */
	EClass getTestLauncher();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.test.QTestLauncherListener <em>Test Launcher Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Launcher Listener</em>'.
	 * @see org.smeup.sys.dk.test.QTestLauncherListener
	 * @generated
	 */
	EClass getTestLauncherListener();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.dk.test.AssertionState <em>Assertion State</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion State</em>'.
	 * @see org.smeup.sys.dk.test.AssertionState
	 * @generated
	 */
	EEnum getAssertionState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDevelopmentKitTestFactory getDevelopmentKitTestFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.QAsserter
		 * <em>Asserter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.smeup.sys.dk.test.QAsserter
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAsserter()
		 * @generated
		 */
		EClass ASSERTER = eINSTANCE.getAsserter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.AssertionFailedImpl <em>Assertion Failed</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.AssertionFailedImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionFailed()
		 * @generated
		 */
		EClass ASSERTION_FAILED = eINSTANCE.getAssertionFailed();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.AssertionResultImpl <em>Assertion Result</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.AssertionResultImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionResult()
		 * @generated
		 */
		EClass ASSERTION_RESULT = eINSTANCE.getAssertionResult();

		/**
		 * The meta object literal for the '<em><b>Assertion State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__ASSERTION_STATE = eINSTANCE.getAssertionResult_AssertionState();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__MESSAGE = eINSTANCE.getAssertionResult_Message();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_RESULT__TIME = eINSTANCE.getAssertionResult_Time();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.AssertionSuccessImpl <em>Assertion Success</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.AssertionSuccessImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionSuccess()
		 * @generated
		 */
		EClass ASSERTION_SUCCESS = eINSTANCE.getAssertionSuccess();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.QCallableTest <em>Callable Test</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.QCallableTest
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getCallableTest()
		 * @generated
		 */
		EClass CALLABLE_TEST = eINSTANCE.getCallableTest();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.MessageImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.SuiteTestRunnerImpl <em>Suite Test Runner</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.SuiteTestRunnerImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getSuiteTestRunner()
		 * @generated
		 */
		EClass SUITE_TEST_RUNNER = eINSTANCE.getSuiteTestRunner();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.QTestAsserter <em>Test Asserter</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.QTestAsserter
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestAsserter()
		 * @generated
		 */
		EClass TEST_ASSERTER = eINSTANCE.getTestAsserter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.TestContainerImpl <em>Test Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.TestContainerImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestContainer()
		 * @generated
		 */
		EClass TEST_CONTAINER = eINSTANCE.getTestContainer();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CONTAINER__TESTS = eINSTANCE.getTestContainer_Tests();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.QTestRunnerListener <em>Test Runner Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.QTestRunnerListener
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestRunnerListener()
		 * @generated
		 */
		EClass TEST_RUNNER_LISTENER = eINSTANCE.getTestRunnerListener();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.QTestManager <em>Test Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.QTestManager
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestManager()
		 * @generated
		 */
		EClass TEST_MANAGER = eINSTANCE.getTestManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.TestResultImpl <em>Test Result</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.TestResultImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestResult()
		 * @generated
		 */
		EClass TEST_RESULT = eINSTANCE.getTestResult();

		/**
		 * The meta object literal for the '<em><b>Failed</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__FAILED = eINSTANCE.getTestResult_Failed();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__OBJECT = eINSTANCE.getTestResult_Object();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__RUNNER = eINSTANCE.getTestResult_Runner();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__TIME = eINSTANCE.getTestResult_Time();

		/**
		 * The meta object literal for the '<em><b>Assert Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESULT__ASSERT_RESULTS = eINSTANCE.getTestResult_AssertResults();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_RESULT__CATEGORY = eINSTANCE.getTestResult_Category();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.TestRunnerImpl <em>Test Runner</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.TestRunnerImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestRunner()
		 * @generated
		 */
		EClass TEST_RUNNER = eINSTANCE.getTestRunner();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.UnitTestRunnerImpl <em>Unit Test Runner</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.UnitTestRunnerImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getUnitTestRunner()
		 * @generated
		 */
		EClass UNIT_TEST_RUNNER = eINSTANCE.getUnitTestRunner();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.impl.TestLauncherImpl <em>Test Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.impl.TestLauncherImpl
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestLauncher()
		 * @generated
		 */
		EClass TEST_LAUNCHER = eINSTANCE.getTestLauncher();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.QTestLauncherListener <em>Test Launcher Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.QTestLauncherListener
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getTestLauncherListener()
		 * @generated
		 */
		EClass TEST_LAUNCHER_LISTENER = eINSTANCE.getTestLauncherListener();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.test.AssertionState <em>Assertion State</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.test.AssertionState
		 * @see org.smeup.sys.dk.test.impl.DevelopmentKitTestPackageImpl#getAssertionState()
		 * @generated
		 */
		EEnum ASSERTION_STATE = eINSTANCE.getAssertionState();

	}

} // QFrameworkTestPackage
