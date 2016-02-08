/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.db.core.QDatabaseCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl#isPersistent <em>Persistent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionConfigImpl extends MinimalEObjectImpl.Container implements QConnectionConfig {
	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected QConnectionCredentials credentials;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.CONNECTION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QConnectionCredentials getCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentials(QConnectionCredentials newCredentials, NotificationChain msgs) {
		QConnectionCredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS, oldCredentials, newCredentials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredentials(QConnectionCredentials newCredentials) {
		if (newCredentials != credentials) {
			NotificationChain msgs = null;
			if (credentials != null)
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CONNECTION_CONFIG__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS:
				return basicSetCredentials(null, msgs);
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS:
				return getCredentials();
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				return getVendor();
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				return getVersion();
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				return getUrl();
			case QDatabaseCorePackage.CONNECTION_CONFIG__CATALOG:
				return getCatalog();
			case QDatabaseCorePackage.CONNECTION_CONFIG__PERSISTENT:
				return isPersistent();
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS:
				setCredentials((QConnectionCredentials)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				setVendor((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				setVersion((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__CATALOG:
				setCatalog((String)newValue);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PERSISTENT:
				setPersistent((Boolean)newValue);
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS:
				setCredentials((QConnectionCredentials)null);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case QDatabaseCorePackage.CONNECTION_CONFIG__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
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
			case QDatabaseCorePackage.CONNECTION_CONFIG__CREDENTIALS:
				return credentials != null;
			case QDatabaseCorePackage.CONNECTION_CONFIG__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case QDatabaseCorePackage.CONNECTION_CONFIG__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case QDatabaseCorePackage.CONNECTION_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case QDatabaseCorePackage.CONNECTION_CONFIG__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case QDatabaseCorePackage.CONNECTION_CONFIG__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", url: ");
		result.append(url);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(')');
		return result.toString();
	}

} // ConnectionConfigImpl
