/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.smeup.sys.il.core.QObject;

import org.smeup.sys.il.core.ctx.QContext;

import org.smeup.sys.il.core.impl.ObjectNameableImpl;

import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QApplicationModule;
import org.smeup.sys.rt.core.QRuntimeCorePackage;
import org.smeup.sys.rt.core.QServiceHook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationComponentImpl#getConfigs <em>Configs</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationComponentImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationComponentImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ApplicationComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationComponentImpl extends ObjectNameableImpl implements QApplicationComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<QObject> configs;

	/**
	 * The cached value of the '{@link #getHooks() <em>Hooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHooks()
	 * @generated
	 * @ordered
	 */
	protected EList<QServiceHook> hooks;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<QApplicationModule> modules;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRuntimeCorePackage.Literals.APPLICATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QServiceHook> getHooks() {
		if (hooks == null) {
			hooks = new EObjectContainmentEList<QServiceHook>(QServiceHook.class, this, QRuntimeCorePackage.APPLICATION_COMPONENT__HOOKS);
		}
		return hooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QApplicationModule> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<QApplicationModule>(QApplicationModule.class, this, QRuntimeCorePackage.APPLICATION_COMPONENT__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.APPLICATION_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QObject> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList<QObject>(QObject.class, this, QRuntimeCorePackage.APPLICATION_COMPONENT__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QContext getContext() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION_COMPONENT__CONFIGS:
				return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
			case QRuntimeCorePackage.APPLICATION_COMPONENT__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION_COMPONENT__CONFIGS:
				return getConfigs();
			case QRuntimeCorePackage.APPLICATION_COMPONENT__HOOKS:
				return getHooks();
			case QRuntimeCorePackage.APPLICATION_COMPONENT__MODULES:
				return getModules();
			case QRuntimeCorePackage.APPLICATION_COMPONENT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QRuntimeCorePackage.APPLICATION_COMPONENT__CONFIGS:
				getConfigs().clear();
				getConfigs().addAll((Collection<? extends QObject>)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION_COMPONENT__HOOKS:
				getHooks().clear();
				getHooks().addAll((Collection<? extends QServiceHook>)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION_COMPONENT__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends QApplicationModule>)newValue);
				return;
			case QRuntimeCorePackage.APPLICATION_COMPONENT__NAME:
				setName((String)newValue);
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
			case QRuntimeCorePackage.APPLICATION_COMPONENT__CONFIGS:
				getConfigs().clear();
				return;
			case QRuntimeCorePackage.APPLICATION_COMPONENT__HOOKS:
				getHooks().clear();
				return;
			case QRuntimeCorePackage.APPLICATION_COMPONENT__MODULES:
				getModules().clear();
				return;
			case QRuntimeCorePackage.APPLICATION_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
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
			case QRuntimeCorePackage.APPLICATION_COMPONENT__CONFIGS:
				return configs != null && !configs.isEmpty();
			case QRuntimeCorePackage.APPLICATION_COMPONENT__HOOKS:
				return hooks != null && !hooks.isEmpty();
			case QRuntimeCorePackage.APPLICATION_COMPONENT__MODULES:
				return modules != null && !modules.isEmpty();
			case QRuntimeCorePackage.APPLICATION_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationComponentImpl
