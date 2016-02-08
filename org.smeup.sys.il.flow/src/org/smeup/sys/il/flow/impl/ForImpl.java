/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QStatementVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>For</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.impl.ForImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.ForImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForImpl extends IterationImpl implements QFor {
	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final String INCREMENT_EDEFAULT = null;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected String increment = INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected String initialization = INITIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.FOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(String newIncrement) {
		String oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.FOR__INCREMENT, oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialization(String newInitialization) {
		String oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.FOR__INITIALIZATION, oldInitialization, initialization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.FOR__INCREMENT:
				return getIncrement();
			case QIntegratedLanguageFlowPackage.FOR__INITIALIZATION:
				return getInitialization();
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
			case QIntegratedLanguageFlowPackage.FOR__INCREMENT:
				setIncrement((String)newValue);
				return;
			case QIntegratedLanguageFlowPackage.FOR__INITIALIZATION:
				setInitialization((String)newValue);
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
			case QIntegratedLanguageFlowPackage.FOR__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
				return;
			case QIntegratedLanguageFlowPackage.FOR__INITIALIZATION:
				setInitialization(INITIALIZATION_EDEFAULT);
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
			case QIntegratedLanguageFlowPackage.FOR__INCREMENT:
				return INCREMENT_EDEFAULT == null ? increment != null : !INCREMENT_EDEFAULT.equals(increment);
			case QIntegratedLanguageFlowPackage.FOR__INITIALIZATION:
				return INITIALIZATION_EDEFAULT == null ? initialization != null : !INITIALIZATION_EDEFAULT.equals(initialization);
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
		result.append(" (increment: ");
		result.append(increment);
		result.append(", initialization: ");
		result.append(initialization);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void accept(QStatementVisitor visitor) {

		if (visitor.visit(this))
			if (getBody() != null)
				getBody().accept(visitor);

		visitor.endVisit(this);

	}
} // ForImpl
