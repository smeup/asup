/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDatabaseFileFormatDef;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database File Format</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.impl.DatabaseFileFormatImpl#getFormatKey <em>Format Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseFileFormatImpl extends FileFormatImpl<QDatabaseFileFormatDef> implements QDatabaseFileFormat {
	/**
	 * The cached value of the '{@link #getFormatKey() <em>Format Key</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFormatKey()
	 * @generated
	 * @ordered
	 */
	protected QFileFormatKey formatKey;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseFileFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.DATABASE_FILE_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileFormatKey getFormatKey() {
		return formatKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormatKey(QFileFormatKey newFormatKey, NotificationChain msgs) {
		QFileFormatKey oldFormatKey = formatKey;
		formatKey = newFormatKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY, oldFormatKey, newFormatKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatKey(QFileFormatKey newFormatKey) {
		if (newFormatKey != formatKey) {
			NotificationChain msgs = null;
			if (formatKey != null)
				msgs = ((InternalEObject)formatKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY, null, msgs);
			if (newFormatKey != null)
				msgs = ((InternalEObject)newFormatKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY, null, msgs);
			msgs = basicSetFormatKey(newFormatKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY, newFormatKey, newFormatKey));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isEmpty() {

		if (getDefinition() == null)
			return true;

		return getDefinition().getElements().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY:
				return basicSetFormatKey(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY:
				return getFormatKey();
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY:
				setFormatKey((QFileFormatKey)newValue);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY:
				setFormatKey((QFileFormatKey)null);
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT__FORMAT_KEY:
				return formatKey != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return name;
	}
} // DatabaseFileFormatImpl
