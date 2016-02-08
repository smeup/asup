/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>File Format Key</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.impl.FileFormatKeyImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.smeup.sys.os.file.impl.FileFormatKeyImpl#getKeyFields <em>Key Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileFormatKeyImpl extends ObjectImpl implements QFileFormatKey {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyFields() <em>Key Fields</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKeyFields()
	 * @generated
	 * @ordered
	 */
	protected EList<QFileFormatKeyField> keyFields;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileFormatKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE_FORMAT_KEY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.FILE_FORMAT_KEY__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QFileFormatKeyField> getKeyFields() {
		if (keyFields == null) {
			keyFields = new EObjectContainmentEList<QFileFormatKeyField>(QFileFormatKeyField.class, this, QOperatingSystemFilePackage.FILE_FORMAT_KEY__KEY_FIELDS);
		}
		return keyFields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__KEY_FIELDS:
				return ((InternalEList<?>)getKeyFields()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__UNIQUE:
				return isUnique();
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__KEY_FIELDS:
				return getKeyFields();
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
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__KEY_FIELDS:
				getKeyFields().clear();
				getKeyFields().addAll((Collection<? extends QFileFormatKeyField>)newValue);
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
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__KEY_FIELDS:
				getKeyFields().clear();
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
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY__KEY_FIELDS:
				return keyFields != null && !keyFields.isEmpty();
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
		result.append(" (unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} // FileFormatKeyImpl
