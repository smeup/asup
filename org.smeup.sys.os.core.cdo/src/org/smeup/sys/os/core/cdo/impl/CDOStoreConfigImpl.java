/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.os.core.cdo.CDOStoreConfig;
import org.smeup.sys.os.core.cdo.CDOSystemCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>CDO Store Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl#getSocketConfig <em>Socket Config</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDOStoreConfigImpl extends MinimalEObjectImpl.Container implements CDOStoreConfig {
	/**
	 * The default value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected String adapter = ADAPTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected QConnectionCredentials credentials;
	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;
	/**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected String repository = REPOSITORY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSocketConfig() <em>Socket Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocketConfig()
	 * @generated
	 * @ordered
	 */
	protected org.smeup.sys.co.core.QServerSocketConfig socketConfig;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CDOStoreConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOSystemCorePackage.Literals.CDO_STORE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdapter() {
		return adapter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapter(String newAdapter) {
		String oldAdapter = adapter;
		adapter = newAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER, oldAdapter, adapter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository(String newRepository) {
		String oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.smeup.sys.co.core.QServerSocketConfig getSocketConfig() {
		return socketConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSocketConfig(org.smeup.sys.co.core.QServerSocketConfig newSocketConfig, NotificationChain msgs) {
		org.smeup.sys.co.core.QServerSocketConfig oldSocketConfig = socketConfig;
		socketConfig = newSocketConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG, oldSocketConfig, newSocketConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocketConfig(org.smeup.sys.co.core.QServerSocketConfig newSocketConfig) {
		if (newSocketConfig != socketConfig) {
			NotificationChain msgs = null;
			if (socketConfig != null)
				msgs = ((InternalEObject)socketConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG, null, msgs);
			if (newSocketConfig != null)
				msgs = ((InternalEObject)newSocketConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG, null, msgs);
			msgs = basicSetSocketConfig(newSocketConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG, newSocketConfig, newSocketConfig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__URL, oldUrl, url));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, oldCredentials, newCredentials);
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
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				return basicSetCredentials(null, msgs);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG:
				return basicSetSocketConfig(null, msgs);
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				return getAdapter();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				return getCredentials();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				return getDriver();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__REPOSITORY:
				return getRepository();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG:
				return getSocketConfig();
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				return getUrl();
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				setAdapter((String)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				setCredentials((QConnectionCredentials)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				setDriver((String)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__REPOSITORY:
				setRepository((String)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG:
				setSocketConfig((org.smeup.sys.co.core.QServerSocketConfig)newValue);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				setUrl((String)newValue);
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				setAdapter(ADAPTER_EDEFAULT);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				setCredentials((QConnectionCredentials)null);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG:
				setSocketConfig((org.smeup.sys.co.core.QServerSocketConfig)null);
				return;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				setUrl(URL_EDEFAULT);
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
			case CDOSystemCorePackage.CDO_STORE_CONFIG__ADAPTER:
				return ADAPTER_EDEFAULT == null ? adapter != null : !ADAPTER_EDEFAULT.equals(adapter);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__CREDENTIALS:
				return credentials != null;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
			case CDOSystemCorePackage.CDO_STORE_CONFIG__SOCKET_CONFIG:
				return socketConfig != null;
			case CDOSystemCorePackage.CDO_STORE_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (adapter: ");
		result.append(adapter);
		result.append(", driver: ");
		result.append(driver);
		result.append(", repository: ");
		result.append(repository);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} // CDOStoreConfigImpl
