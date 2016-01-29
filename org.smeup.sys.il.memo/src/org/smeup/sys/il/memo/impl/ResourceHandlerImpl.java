/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.QObjectNameable;

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.core.impl.ObjectImpl;

import org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage;
import org.smeup.sys.il.memo.QResourceHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.impl.ResourceHandlerImpl#getContextProvider <em>Context Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceHandlerImpl<T extends QObjectNameable> extends ObjectImpl implements QResourceHandler<T> {
	/**
	 * The cached value of the '{@link #getContextProvider() <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextProvider()
	 * @generated
	 * @ordered
	 */
	protected QContextProvider contextProvider;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageMemoryPackage.Literals.RESOURCE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContextProvider getContextProvider() {
		return contextProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextProvider(QContextProvider newContextProvider) {
		QContextProvider oldContextProvider = contextProvider;
		contextProvider = newContextProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryPackage.RESOURCE_HANDLER__CONTEXT_PROVIDER, oldContextProvider, contextProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageMemoryPackage.RESOURCE_HANDLER__CONTEXT_PROVIDER:
				return getContextProvider();
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_HANDLER__CONTEXT_PROVIDER:
				setContextProvider((QContextProvider)newValue);
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_HANDLER__CONTEXT_PROVIDER:
				setContextProvider((QContextProvider)null);
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_HANDLER__CONTEXT_PROVIDER:
				return contextProvider != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceHandlerImpl
