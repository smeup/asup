/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.impl.DatabaseFileImpl#getDatabaseFormat <em>Database Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DatabaseFileImpl extends FileImpl implements QDatabaseFile {
	/**
	 * The cached value of the '{@link #getDatabaseFormat() <em>Database Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseFormat()
	 * @generated
	 * @ordered
	 */
	protected QDatabaseFileFormat databaseFormat;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.DATABASE_FILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatabaseFileFormat getDatabaseFormat() {
		return databaseFormat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseFormat(QDatabaseFileFormat newDatabaseFormat, NotificationChain msgs) {
		QDatabaseFileFormat oldDatabaseFormat = databaseFormat;
		databaseFormat = newDatabaseFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT, oldDatabaseFormat, newDatabaseFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseFormat(QDatabaseFileFormat newDatabaseFormat) {
		if (newDatabaseFormat != databaseFormat) {
			NotificationChain msgs = null;
			if (databaseFormat != null)
				msgs = ((InternalEObject)databaseFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT, null, msgs);
			if (newDatabaseFormat != null)
				msgs = ((InternalEObject)newDatabaseFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT, null, msgs);
			msgs = basicSetDatabaseFormat(newDatabaseFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT, newDatabaseFormat, newDatabaseFormat));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public QDatabaseFileFormat getFileFormat() {
		return getDatabaseFormat();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public URI getClassURI() {

		try {
			// TODO
			// eClass().getEPackage().getNsURI();
			String classURI = "file/dbf/" + getApplication() + "/gen/" + getName();
			URI uri = new URI(classURI);
			return uri;
		} catch (URISyntaxException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public URI getPackageInfoURI() {
		try {
//			String classURI = "file/dbf/" + getApplication();
			String classURI = "file/dbf/" + getApplication() + "/gen";
			URI uri = new URI(classURI);
			return uri;
		} catch (URISyntaxException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT:
				return basicSetDatabaseFormat(null, msgs);
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
			case QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT:
				return getDatabaseFormat();
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
			case QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT:
				setDatabaseFormat((QDatabaseFileFormat)newValue);
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
			case QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT:
				setDatabaseFormat((QDatabaseFileFormat)null);
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
			case QOperatingSystemFilePackage.DATABASE_FILE__DATABASE_FORMAT:
				return databaseFormat != null;
		}
		return super.eIsSet(featureID);
	}

} // DatabaseFileImpl
