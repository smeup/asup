/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.module.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.module.QModule;
import org.smeup.sys.os.module.QModuleContainer;
import org.smeup.sys.os.module.QOperatingSystemModulePackage;
import org.smeup.sys.os.type.impl.TypedContainerImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Module Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.module.impl.ModuleContainerImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.smeup.sys.os.module.impl.ModuleContainerImpl#isScanPackage <em>Scan Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleContainerImpl extends TypedContainerImpl<QModule> implements QModuleContainer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isScanPackage() <em>Scan Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isScanPackage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCAN_PACKAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScanPackage() <em>Scan Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isScanPackage()
	 * @generated
	 * @ordered
	 */
	protected boolean scanPackage = SCAN_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemModulePackage.Literals.MODULE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemModulePackage.MODULE_CONTAINER__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isScanPackage() {
		return scanPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanPackage(boolean newScanPackage) {
		boolean oldScanPackage = scanPackage;
		scanPackage = newScanPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemModulePackage.MODULE_CONTAINER__SCAN_PACKAGE, oldScanPackage, scanPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemModulePackage.MODULE_CONTAINER__BASE_PACKAGE:
				return getBasePackage();
			case QOperatingSystemModulePackage.MODULE_CONTAINER__SCAN_PACKAGE:
				return isScanPackage();
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
			case QOperatingSystemModulePackage.MODULE_CONTAINER__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case QOperatingSystemModulePackage.MODULE_CONTAINER__SCAN_PACKAGE:
				setScanPackage((Boolean)newValue);
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
			case QOperatingSystemModulePackage.MODULE_CONTAINER__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case QOperatingSystemModulePackage.MODULE_CONTAINER__SCAN_PACKAGE:
				setScanPackage(SCAN_PACKAGE_EDEFAULT);
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
			case QOperatingSystemModulePackage.MODULE_CONTAINER__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case QOperatingSystemModulePackage.MODULE_CONTAINER__SCAN_PACKAGE:
				return scanPackage != SCAN_PACKAGE_EDEFAULT;
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", scanPackage: ");
		result.append(scanPackage);
		result.append(')');
		return result.toString();
	}

} // ModuleContainerImpl
