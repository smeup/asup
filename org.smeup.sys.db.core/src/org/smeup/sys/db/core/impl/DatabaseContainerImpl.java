/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.il.core.impl.ObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.impl.DatabaseContainerImpl#getCatalogContainers <em>Catalog Containers</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.DatabaseContainerImpl#getDefaultCatalogContainer <em>Default Catalog Container</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.DatabaseContainerImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.DatabaseContainerImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseContainerImpl extends ObjectImpl implements QDatabaseContainer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getCatalogContainers()
	 * <em>Catalog Containers</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCatalogContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<QCatalogContainer> catalogContainers;

	/**
	 * The cached value of the '{@link #getDefaultCatalogContainer() <em>Default Catalog Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCatalogContainer()
	 * @generated
	 * @ordered
	 */
	protected QCatalogContainer defaultCatalogContainer;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.DATABASE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QCatalogContainer> getCatalogContainers() {
		if (catalogContainers == null) {
			catalogContainers = new EObjectContainmentEList<QCatalogContainer>(QCatalogContainer.class, this, QDatabaseCorePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS);
		}
		return catalogContainers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCatalogContainer getDefaultCatalogContainer() {
		if (defaultCatalogContainer != null && ((EObject)defaultCatalogContainer).eIsProxy()) {
			InternalEObject oldDefaultCatalogContainer = (InternalEObject)defaultCatalogContainer;
			defaultCatalogContainer = (QCatalogContainer)eResolveProxy(oldDefaultCatalogContainer);
			if (defaultCatalogContainer != oldDefaultCatalogContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER, oldDefaultCatalogContainer, defaultCatalogContainer));
			}
		}
		return defaultCatalogContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QCatalogContainer basicGetDefaultCatalogContainer() {
		return defaultCatalogContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCatalogContainer(QCatalogContainer newDefaultCatalogContainer) {
		QCatalogContainer oldDefaultCatalogContainer = defaultCatalogContainer;
		defaultCatalogContainer = newDefaultCatalogContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER, oldDefaultCatalogContainer, defaultCatalogContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				return ((InternalEList<?>)getCatalogContainers()).basicRemove(otherEnd, msgs);
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				return getCatalogContainers();
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				if (resolve) return getDefaultCatalogContainer();
				return basicGetDefaultCatalogContainer();
			case QDatabaseCorePackage.DATABASE_CONTAINER__VENDOR:
				return getVendor();
			case QDatabaseCorePackage.DATABASE_CONTAINER__VERSION:
				return getVersion();
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				getCatalogContainers().clear();
				getCatalogContainers().addAll((Collection<? extends QCatalogContainer>)newValue);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				setDefaultCatalogContainer((QCatalogContainer)newValue);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__VENDOR:
				setVendor((String)newValue);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__VERSION:
				setVersion((String)newValue);
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				getCatalogContainers().clear();
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				setDefaultCatalogContainer((QCatalogContainer)null);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case QDatabaseCorePackage.DATABASE_CONTAINER__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case QDatabaseCorePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				return catalogContainers != null && !catalogContainers.isEmpty();
			case QDatabaseCorePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				return defaultCatalogContainer != null;
			case QDatabaseCorePackage.DATABASE_CONTAINER__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case QDatabaseCorePackage.DATABASE_CONTAINER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(')');
		return result.toString();
	}

} // DatabaseContainerImpl
