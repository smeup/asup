/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIPackage;
import org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ECF Server Container Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.co.osgi.ecf.impl.ECFServerContainerConfigImpl#getServerContainerType <em>Server Container Type</em>}</li>
 *   <li>{@link org.smeup.sys.co.osgi.ecf.impl.ECFServerContainerConfigImpl#getContainerId <em>Container Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECFServerContainerConfigImpl extends MinimalEObjectImpl.Container implements ECFServerContainerConfig {

	/**
	 * The default value of the '{@link #getServerContainerType() <em>Server Container Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getServerContainerType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_CONTAINER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerContainerType() <em>Server Container Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getServerContainerType()
	 * @generated
	 * @ordered
	 */
	protected String serverContainerType = SERVER_CONTAINER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected String containerId = CONTAINER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ECFServerContainerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECFConnectorOSGIPackage.Literals.ECF_SERVER_CONTAINER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerContainerType() {
		return serverContainerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerContainerType(String newServerContainerType) {
		String oldServerContainerType = serverContainerType;
		serverContainerType = newServerContainerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE, oldServerContainerType, serverContainerType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerId() {
		return containerId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(String newContainerId) {
		String oldContainerId = containerId;
		containerId = newContainerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID, oldContainerId, containerId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE:
				return getServerContainerType();
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID:
				return getContainerId();
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
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE:
				setServerContainerType((String)newValue);
				return;
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID:
				setContainerId((String)newValue);
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
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE:
				setServerContainerType(SERVER_CONTAINER_TYPE_EDEFAULT);
				return;
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID:
				setContainerId(CONTAINER_ID_EDEFAULT);
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
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE:
				return SERVER_CONTAINER_TYPE_EDEFAULT == null ? serverContainerType != null : !SERVER_CONTAINER_TYPE_EDEFAULT.equals(serverContainerType);
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID:
				return CONTAINER_ID_EDEFAULT == null ? containerId != null : !CONTAINER_ID_EDEFAULT.equals(containerId);
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
		result.append(" (serverContainerType: ");
		result.append(serverContainerType);
		result.append(", containerId: ");
		result.append(containerId);
		result.append(')');
		return result.toString();
	}

} // ECFServerContainerConfigImpl
