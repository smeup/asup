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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.smeup.sys.rt.core.QRuntimeCorePackage;
import org.smeup.sys.rt.core.QServiceRef;
import org.smeup.sys.rt.core.ServiceStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.impl.ServiceRefImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ServiceRefImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ServiceRefImpl#isRemoteExport <em>Remote Export</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ServiceRefImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.impl.ServiceRefImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceRefImpl extends MinimalEObjectImpl.Container implements QServiceRef {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteExport() <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EXPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteExport() <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteExport()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteExport = REMOTE_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStatus STATUS_EDEFAULT = ServiceStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ServiceStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<QServiceRef> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRuntimeCorePackage.Literals.SERVICE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.SERVICE_REF__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceName(String newInterfaceName) {
		String oldInterfaceName = interfaceName;
		interfaceName = newInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.SERVICE_REF__INTERFACE_NAME, oldInterfaceName, interfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteExport() {
		return remoteExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteExport(boolean newRemoteExport) {
		boolean oldRemoteExport = remoteExport;
		remoteExport = newRemoteExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.SERVICE_REF__REMOTE_EXPORT, oldRemoteExport, remoteExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ServiceStatus newStatus) {
		ServiceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QRuntimeCorePackage.SERVICE_REF__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QServiceRef> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<QServiceRef>(QServiceRef.class, this, QRuntimeCorePackage.SERVICE_REF__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QRuntimeCorePackage.SERVICE_REF__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case QRuntimeCorePackage.SERVICE_REF__CLASS_NAME:
				return getClassName();
			case QRuntimeCorePackage.SERVICE_REF__INTERFACE_NAME:
				return getInterfaceName();
			case QRuntimeCorePackage.SERVICE_REF__REMOTE_EXPORT:
				return isRemoteExport();
			case QRuntimeCorePackage.SERVICE_REF__STATUS:
				return getStatus();
			case QRuntimeCorePackage.SERVICE_REF__SERVICES:
				return getServices();
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
			case QRuntimeCorePackage.SERVICE_REF__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case QRuntimeCorePackage.SERVICE_REF__INTERFACE_NAME:
				setInterfaceName((String)newValue);
				return;
			case QRuntimeCorePackage.SERVICE_REF__REMOTE_EXPORT:
				setRemoteExport((Boolean)newValue);
				return;
			case QRuntimeCorePackage.SERVICE_REF__STATUS:
				setStatus((ServiceStatus)newValue);
				return;
			case QRuntimeCorePackage.SERVICE_REF__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends QServiceRef>)newValue);
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
			case QRuntimeCorePackage.SERVICE_REF__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case QRuntimeCorePackage.SERVICE_REF__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
				return;
			case QRuntimeCorePackage.SERVICE_REF__REMOTE_EXPORT:
				setRemoteExport(REMOTE_EXPORT_EDEFAULT);
				return;
			case QRuntimeCorePackage.SERVICE_REF__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case QRuntimeCorePackage.SERVICE_REF__SERVICES:
				getServices().clear();
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
			case QRuntimeCorePackage.SERVICE_REF__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case QRuntimeCorePackage.SERVICE_REF__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
			case QRuntimeCorePackage.SERVICE_REF__REMOTE_EXPORT:
				return remoteExport != REMOTE_EXPORT_EDEFAULT;
			case QRuntimeCorePackage.SERVICE_REF__STATUS:
				return status != STATUS_EDEFAULT;
			case QRuntimeCorePackage.SERVICE_REF__SERVICES:
				return services != null && !services.isEmpty();
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
		result.append(" (className: ");
		result.append(className);
		result.append(", interfaceName: ");
		result.append(interfaceName);
		result.append(", remoteExport: ");
		result.append(remoteExport);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ServiceRefImpl
