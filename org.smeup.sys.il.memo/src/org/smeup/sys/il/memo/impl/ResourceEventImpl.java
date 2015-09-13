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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.ResourceEventType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QResource Event</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.impl.ResourceEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.impl.ResourceEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.impl.ResourceEventImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceEventImpl<T extends QObjectNameable> extends MinimalEObjectImpl.Container implements QResourceEvent<T> {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected T source;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceEventType TYPE_EDEFAULT = ResourceEventType.PRE_SAVE;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceEventType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected QResource<T> resource;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageMemoryPackage.Literals.RESOURCE_EVENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T getSource() {
		if (source != null && ((EObject)source).eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (T)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(T newSource) {
		T oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceEventType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ResourceEventType newType) {
		ResourceEventType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public QResource<T> getResource() {
		if (resource != null && ((EObject)resource).eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (QResource<T>)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QResource<T> basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(QResource<T> newResource) {
		QResource<T> oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__TYPE:
				return getType();
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__SOURCE:
				setSource((T)newValue);
				return;
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__TYPE:
				setType((ResourceEventType)newValue);
				return;
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__RESOURCE:
				setResource((QResource<T>)newValue);
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__SOURCE:
				setSource((T)null);
				return;
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__RESOURCE:
				setResource((QResource<T>)null);
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__SOURCE:
				return source != null;
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__TYPE:
				return type != TYPE_EDEFAULT;
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT__RESOURCE:
				return resource != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // QResourceEventImpl
