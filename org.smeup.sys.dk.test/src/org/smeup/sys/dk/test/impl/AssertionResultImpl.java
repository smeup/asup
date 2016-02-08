/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.dk.test.AssertionState;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QDevelopmentKitTestPackage;
import org.smeup.sys.il.core.impl.ObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assertion Result</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.test.impl.AssertionResultImpl#getAssertionState <em>Assertion State</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.AssertionResultImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.smeup.sys.dk.test.impl.AssertionResultImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssertionResultImpl extends ObjectImpl implements QAssertionResult {
	/**
	 * The default value of the '{@link #getAssertionState() <em>Assertion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionState()
	 * @generated
	 * @ordered
	 */
	protected static final AssertionState ASSERTION_STATE_EDEFAULT = AssertionState.SUCCESS;

	/**
	 * The cached value of the '{@link #getAssertionState() <em>Assertion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionState()
	 * @generated
	 * @ordered
	 */
	protected AssertionState assertionState = ASSERTION_STATE_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

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
	protected AssertionResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitTestPackage.Literals.ASSERTION_RESULT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.ASSERTION_RESULT__MESSAGE, oldMessage, message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.ASSERTION_RESULT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionState getAssertionState() {
		return assertionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertionState(AssertionState newAssertionState) {
		AssertionState oldAssertionState = assertionState;
		assertionState = newAssertionState == null ? ASSERTION_STATE_EDEFAULT : newAssertionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitTestPackage.ASSERTION_RESULT__ASSERTION_STATE, oldAssertionState, assertionState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__ASSERTION_STATE:
				return getAssertionState();
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__MESSAGE:
				return getMessage();
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__TIME:
				return getTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__ASSERTION_STATE:
				setAssertionState((AssertionState)newValue);
				return;
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__MESSAGE:
				setMessage((String)newValue);
				return;
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__TIME:
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
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__ASSERTION_STATE:
				setAssertionState(ASSERTION_STATE_EDEFAULT);
				return;
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__TIME:
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
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__ASSERTION_STATE:
				return assertionState != ASSERTION_STATE_EDEFAULT;
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case QDevelopmentKitTestPackage.ASSERTION_RESULT__TIME:
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
		result.append(" (assertionState: ");
		result.append(assertionState);
		result.append(", message: ");
		result.append(message);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} // AssertionResultImpl
