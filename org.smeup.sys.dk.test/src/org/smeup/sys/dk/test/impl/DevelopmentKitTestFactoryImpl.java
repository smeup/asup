/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.dk.test.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DevelopmentKitTestFactoryImpl extends EFactoryImpl implements QDevelopmentKitTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QDevelopmentKitTestFactory init() {
		try {
			QDevelopmentKitTestFactory theDevelopmentKitTestFactory = (QDevelopmentKitTestFactory)EPackage.Registry.INSTANCE.getEFactory(QDevelopmentKitTestPackage.eNS_URI);
			if (theDevelopmentKitTestFactory != null) {
				return theDevelopmentKitTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevelopmentKitTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DevelopmentKitTestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QDevelopmentKitTestPackage.ASSERTION_FAILED: return (EObject)createAssertionFailed();
			case QDevelopmentKitTestPackage.ASSERTION_SUCCESS: return (EObject)createAssertionSuccess();
			case QDevelopmentKitTestPackage.TEST_CONTAINER: return (EObject)createTestContainer();
			case QDevelopmentKitTestPackage.TEST_RUNNER_EVENT: return (EObject)createTestRunnerEvent();
			case QDevelopmentKitTestPackage.TEST_RESULT: return (EObject)createTestResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QDevelopmentKitTestPackage.ASSERTION_STATE:
				return createAssertionStateFromString(eDataType, initialValue);
			case QDevelopmentKitTestPackage.TEST_RUNNER_EVENT_TYPE:
				return createTestRunnerEventTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QDevelopmentKitTestPackage.ASSERTION_STATE:
				return convertAssertionStateToString(eDataType, instanceValue);
			case QDevelopmentKitTestPackage.TEST_RUNNER_EVENT_TYPE:
				return convertTestRunnerEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAssertionFailed createAssertionFailed() {
		AssertionFailedImpl assertionFailed = new AssertionFailedImpl();
		return assertionFailed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAssertionSuccess createAssertionSuccess() {
		AssertionSuccessImpl assertionSuccess = new AssertionSuccessImpl();
		return assertionSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTestRunnerEvent createTestRunnerEvent() {
		TestRunnerEventImpl testRunnerEvent = new TestRunnerEventImpl();
		return testRunnerEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QTestResult createTestResult() {
		TestResultImpl testResult = new TestResultImpl();
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTestContainer createTestContainer() {
		TestContainerImpl testContainer = new TestContainerImpl();
		return testContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionState createAssertionStateFromString(EDataType eDataType, String initialValue) {
		AssertionState result = AssertionState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestRunnerEventType createTestRunnerEventTypeFromString(EDataType eDataType, String initialValue) {
		TestRunnerEventType result = TestRunnerEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestRunnerEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitTestPackage getDevelopmentKitTestPackage() {
		return (QDevelopmentKitTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDevelopmentKitTestPackage getPackage() {
		return QDevelopmentKitTestPackage.eINSTANCE;
	}

} // FrameworkTestFactoryImpl
