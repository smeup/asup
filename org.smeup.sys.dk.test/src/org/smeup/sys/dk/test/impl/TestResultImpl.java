/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QDevelopmentKitTestPackage;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.il.core.impl.ObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.dk.test.impl.TestResultImpl#getAssertResults <em>Assert Results</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.TestResultImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.TestResultImpl#isFailed <em>Failed</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.TestResultImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.TestResultImpl#getRunner <em>Runner</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.TestResultImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestResultImpl extends ObjectImpl implements QTestResult {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getAssertResults() <em>Assert Results</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAssertResults()
	 * @generated
	 * @ordered
	 */
	protected EList<QAssertionResult> assertResults;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFailed() <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFailed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailed() <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFailed()
	 * @generated
	 * @ordered
	 */
	protected boolean failed = FAILED_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunner() <em>Runner</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunner() <em>Runner</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected String runner = RUNNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitTestPackage.Literals.TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFailed() {
		return failed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailed(boolean newFailed) {
		boolean oldFailed = failed;
		failed = newFailed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.TEST_RESULT__FAILED, oldFailed, failed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.TEST_RESULT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunner() {
		return runner;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunner(String newRunner) {
		String oldRunner = runner;
		runner = newRunner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.TEST_RESULT__RUNNER, oldRunner, runner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.TEST_RESULT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QAssertionResult> getAssertResults() {
		if (assertResults == null) {
			assertResults = new EObjectContainmentEList<QAssertionResult>(QAssertionResult.class, this, QDevelopmentKitTestPackage.TEST_RESULT__ASSERT_RESULTS);
		}
		return assertResults;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.TEST_RESULT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.TEST_RESULT__ASSERT_RESULTS:
				return ((InternalEList<?>)getAssertResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.TEST_RESULT__ASSERT_RESULTS:
				return getAssertResults();
			case QDevelopmentKitTestPackage.TEST_RESULT__CATEGORY:
				return getCategory();
			case QDevelopmentKitTestPackage.TEST_RESULT__FAILED:
				return isFailed();
			case QDevelopmentKitTestPackage.TEST_RESULT__OBJECT:
				return getObject();
			case QDevelopmentKitTestPackage.TEST_RESULT__RUNNER:
				return getRunner();
			case QDevelopmentKitTestPackage.TEST_RESULT__TIME:
				return getTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.TEST_RESULT__ASSERT_RESULTS:
				getAssertResults().clear();
				getAssertResults().addAll((Collection<? extends QAssertionResult>)newValue);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__CATEGORY:
				setCategory((String)newValue);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__FAILED:
				setFailed((Boolean)newValue);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__OBJECT:
				setObject((String)newValue);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__RUNNER:
				setRunner((String)newValue);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__TIME:
				setTime((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.TEST_RESULT__ASSERT_RESULTS:
				getAssertResults().clear();
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__FAILED:
				setFailed(FAILED_EDEFAULT);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__RUNNER:
				setRunner(RUNNER_EDEFAULT);
				return;
			case QDevelopmentKitTestPackage.TEST_RESULT__TIME:
				setTime(TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.TEST_RESULT__ASSERT_RESULTS:
				return assertResults != null && !assertResults.isEmpty();
			case QDevelopmentKitTestPackage.TEST_RESULT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case QDevelopmentKitTestPackage.TEST_RESULT__FAILED:
				return failed != FAILED_EDEFAULT;
			case QDevelopmentKitTestPackage.TEST_RESULT__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case QDevelopmentKitTestPackage.TEST_RESULT__RUNNER:
				return RUNNER_EDEFAULT == null ? runner != null : !RUNNER_EDEFAULT.equals(runner);
			case QDevelopmentKitTestPackage.TEST_RESULT__TIME:
				return time != TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (category: ");
		result.append(category);
		result.append(", failed: ");
		result.append(failed);
		result.append(", object: ");
		result.append(object);
		result.append(", runner: ");
		result.append(runner);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} // TestResultImpl
