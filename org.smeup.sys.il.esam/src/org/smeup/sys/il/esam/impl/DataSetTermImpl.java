/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Set Term</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.smeup.sys.il.esam.impl.DataSetTermImpl#getAccessMode <em>
 * Access Mode</em>}</li>
 * <li>{@link org.smeup.sys.il.esam.impl.DataSetTermImpl#getFormatName <em>
 * Format Name</em>}</li>
 * <li>{@link org.smeup.sys.il.esam.impl.DataSetTermImpl#isKeyedAccess <em>Keyed
 * Access</em>}</li>
 * <li>{@link org.smeup.sys.il.esam.impl.DataSetTermImpl#getPrefix <em>Prefix
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetTermImpl extends FileTermImpl implements QDataSetTerm {
	/**
	 * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMode ACCESS_MODE_EDEFAULT = AccessMode.INPUT;
	/**
	 * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected AccessMode accessMode = ACCESS_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFormatName() <em>Format Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFormatName() <em>Format Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected String formatName = FORMAT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isKeyedAccess() <em>Keyed Access</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isKeyedAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEYED_ACCESS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isKeyedAccess() <em>Keyed Access</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isKeyedAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean keyedAccess = KEYED_ACCESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DataSetTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageEsamPackage.Literals.DATA_SET_TERM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AccessMode getAccessMode() {
		return accessMode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAccessMode(AccessMode newAccessMode) {
		AccessMode oldAccessMode = accessMode;
		accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.DATA_SET_TERM__ACCESS_MODE, oldAccessMode, accessMode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFormatName() {
		return formatName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFormatName(String newFormatName) {
		String oldFormatName = formatName;
		formatName = newFormatName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.DATA_SET_TERM__FORMAT_NAME, oldFormatName, formatName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isKeyedAccess() {
		return keyedAccess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKeyedAccess(boolean newKeyedAccess) {
		boolean oldKeyedAccess = keyedAccess;
		keyedAccess = newKeyedAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.DATA_SET_TERM__KEYED_ACCESS, oldKeyedAccess, keyedAccess));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEsamPackage.DATA_SET_TERM__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__ACCESS_MODE:
			return getAccessMode();
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__FORMAT_NAME:
			return getFormatName();
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__KEYED_ACCESS:
			return isKeyedAccess();
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__PREFIX:
			return getPrefix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__ACCESS_MODE:
			setAccessMode((AccessMode) newValue);
			return;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__FORMAT_NAME:
			setFormatName((String) newValue);
			return;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__KEYED_ACCESS:
			setKeyedAccess((Boolean) newValue);
			return;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__PREFIX:
			setPrefix((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__ACCESS_MODE:
			setAccessMode(ACCESS_MODE_EDEFAULT);
			return;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__FORMAT_NAME:
			setFormatName(FORMAT_NAME_EDEFAULT);
			return;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__KEYED_ACCESS:
			setKeyedAccess(KEYED_ACCESS_EDEFAULT);
			return;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__PREFIX:
			setPrefix(PREFIX_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__ACCESS_MODE:
			return accessMode != ACCESS_MODE_EDEFAULT;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__FORMAT_NAME:
			return FORMAT_NAME_EDEFAULT == null ? formatName != null : !FORMAT_NAME_EDEFAULT.equals(formatName);
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__KEYED_ACCESS:
			return keyedAccess != KEYED_ACCESS_EDEFAULT;
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM__PREFIX:
			return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accessMode: ");
		result.append(accessMode);
		result.append(", formatName: ");
		result.append(formatName);
		result.append(", keyedAccess: ");
		result.append(keyedAccess);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		if (getFormatName() == null || getFormatName().isEmpty())
			return getFileName();
		else
			return getFormatName();
	}
} // DataSetTermImpl
