/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.data.InjectionStrategyType;
import org.smeup.sys.il.data.QDataManagerConfig;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Manager Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.impl.DataManagerConfigImpl#getInjectionStrategy <em>Injection Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataManagerConfigImpl extends ObjectImpl implements QDataManagerConfig {

	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getInjectionStrategy() <em>Injection Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final InjectionStrategyType INJECTION_STRATEGY_EDEFAULT = InjectionStrategyType.NONE;

	/**
	 * The cached value of the '{@link #getInjectionStrategy() <em>Injection Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionStrategy()
	 * @generated
	 * @ordered
	 */
	protected InjectionStrategyType injectionStrategy = INJECTION_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataManagerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_MANAGER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjectionStrategyType getInjectionStrategy() {
		return injectionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjectionStrategy(InjectionStrategyType newInjectionStrategy) {
		InjectionStrategyType oldInjectionStrategy = injectionStrategy;
		injectionStrategy = newInjectionStrategy == null ? INJECTION_STRATEGY_EDEFAULT : newInjectionStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataPackage.DATA_MANAGER_CONFIG__INJECTION_STRATEGY, oldInjectionStrategy, injectionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.DATA_MANAGER_CONFIG__INJECTION_STRATEGY:
				return getInjectionStrategy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.DATA_MANAGER_CONFIG__INJECTION_STRATEGY:
				setInjectionStrategy((InjectionStrategyType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.DATA_MANAGER_CONFIG__INJECTION_STRATEGY:
				setInjectionStrategy(INJECTION_STRATEGY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageDataPackage.DATA_MANAGER_CONFIG__INJECTION_STRATEGY:
				return injectionStrategy != INJECTION_STRATEGY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (injectionStrategy: ");
		result.append(injectionStrategy);
		result.append(')');
		return result.toString();
	}

} //DataManagerConfigImpl
