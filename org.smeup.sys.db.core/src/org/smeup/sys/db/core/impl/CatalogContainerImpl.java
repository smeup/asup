/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QCatalogGenerationStrategy;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.core.SearchStrategy;
import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Catalog Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.impl.CatalogContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.CatalogContainerImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.CatalogContainerImpl#getConnectionConfig <em>Connection Config</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.CatalogContainerImpl#isSupportsGuestAccess <em>Supports Guest Access</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.CatalogContainerImpl#getGenerationStrategy <em>Generation Strategy</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.CatalogContainerImpl#getSearchStrategy <em>Search Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogContainerImpl extends MinimalEObjectImpl.Container implements QCatalogContainer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionConfig() <em>Connection Config</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getConnectionConfig()
	 * @generated
	 * @ordered
	 */
	protected QConnectionConfig connectionConfig;

	/**
	 * The default value of the '{@link #isSupportsGuestAccess() <em>Supports Guest Access</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSupportsGuestAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTS_GUEST_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportsGuestAccess() <em>Supports Guest Access</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSupportsGuestAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean supportsGuestAccess = SUPPORTS_GUEST_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerationStrategy() <em>Generation Strategy</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getGenerationStrategy()
	 * @generated
	 * @ordered
	 */
	protected QCatalogGenerationStrategy generationStrategy;

	/**
	 * The default value of the '{@link #getSearchStrategy() <em>Search Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final SearchStrategy SEARCH_STRATEGY_EDEFAULT = SearchStrategy.CURRENT;

	/**
	 * The cached value of the '{@link #getSearchStrategy() <em>Search Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchStrategy()
	 * @generated
	 * @ordered
	 */
	protected SearchStrategy searchStrategy = SEARCH_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.CATALOG_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSupportsGuestAccess() {
		return supportsGuestAccess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsGuestAccess(boolean newSupportsGuestAccess) {
		boolean oldSupportsGuestAccess = supportsGuestAccess;
		supportsGuestAccess = newSupportsGuestAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS, oldSupportsGuestAccess, supportsGuestAccess));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCatalogGenerationStrategy getGenerationStrategy() {
		return generationStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationStrategy(QCatalogGenerationStrategy newGenerationStrategy, NotificationChain msgs) {
		QCatalogGenerationStrategy oldGenerationStrategy = generationStrategy;
		generationStrategy = newGenerationStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY, oldGenerationStrategy, newGenerationStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerationStrategy(QCatalogGenerationStrategy newGenerationStrategy) {
		if (newGenerationStrategy != generationStrategy) {
			NotificationChain msgs = null;
			if (generationStrategy != null)
				msgs = ((InternalEObject)generationStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY, null, msgs);
			if (newGenerationStrategy != null)
				msgs = ((InternalEObject)newGenerationStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY, null, msgs);
			msgs = basicSetGenerationStrategy(newGenerationStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY, newGenerationStrategy, newGenerationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchStrategy getSearchStrategy() {
		return searchStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchStrategy(SearchStrategy newSearchStrategy) {
		SearchStrategy oldSearchStrategy = searchStrategy;
		searchStrategy = newSearchStrategy == null ? SEARCH_STRATEGY_EDEFAULT : newSearchStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__SEARCH_STRATEGY, oldSearchStrategy, searchStrategy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QConnectionConfig getConnectionConfig() {
		return connectionConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionConfig(QConnectionConfig newConnectionConfig, NotificationChain msgs) {
		QConnectionConfig oldConnectionConfig = connectionConfig;
		connectionConfig = newConnectionConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, oldConnectionConfig, newConnectionConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionConfig(QConnectionConfig newConnectionConfig) {
		if (newConnectionConfig != connectionConfig) {
			NotificationChain msgs = null;
			if (connectionConfig != null)
				msgs = ((InternalEObject)connectionConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, null, msgs);
			if (newConnectionConfig != null)
				msgs = ((InternalEObject)newConnectionConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, null, msgs);
			msgs = basicSetConnectionConfig(newConnectionConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG, newConnectionConfig, newConnectionConfig));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <C> C createConnection(Class<C> factory) throws SQLException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <C> C createConnection(Class<C> factory, String user, String password) throws SQLException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCatalogMetaData getMetaData() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QContext getCatalogContext() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index loadIndex(Table table, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema loadSchema(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table loadTable(Schema schema, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewTable loadView(Schema schema, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeIndex(Index index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeSchema(Schema schema) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeTable(Table table) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeView(ViewTable view) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				return basicSetConnectionConfig(null, msgs);
			case QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY:
				return basicSetGenerationStrategy(null, msgs);
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				return getName();
			case QDatabaseCorePackage.CATALOG_CONTAINER__ACTIVE:
				return isActive();
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				return getConnectionConfig();
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				return isSupportsGuestAccess();
			case QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY:
				return getGenerationStrategy();
			case QDatabaseCorePackage.CATALOG_CONTAINER__SEARCH_STRATEGY:
				return getSearchStrategy();
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				setConnectionConfig((QConnectionConfig)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				setSupportsGuestAccess((Boolean)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY:
				setGenerationStrategy((QCatalogGenerationStrategy)newValue);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SEARCH_STRATEGY:
				setSearchStrategy((SearchStrategy)newValue);
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				setConnectionConfig((QConnectionConfig)null);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				setSupportsGuestAccess(SUPPORTS_GUEST_ACCESS_EDEFAULT);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY:
				setGenerationStrategy((QCatalogGenerationStrategy)null);
				return;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SEARCH_STRATEGY:
				setSearchStrategy(SEARCH_STRATEGY_EDEFAULT);
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
			case QDatabaseCorePackage.CATALOG_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QDatabaseCorePackage.CATALOG_CONTAINER__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case QDatabaseCorePackage.CATALOG_CONTAINER__CONNECTION_CONFIG:
				return connectionConfig != null;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS:
				return supportsGuestAccess != SUPPORTS_GUEST_ACCESS_EDEFAULT;
			case QDatabaseCorePackage.CATALOG_CONTAINER__GENERATION_STRATEGY:
				return generationStrategy != null;
			case QDatabaseCorePackage.CATALOG_CONTAINER__SEARCH_STRATEGY:
				return searchStrategy != SEARCH_STRATEGY_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", active: ");
		result.append(active);
		result.append(", supportsGuestAccess: ");
		result.append(supportsGuestAccess);
		result.append(", searchStrategy: ");
		result.append(searchStrategy);
		result.append(')');
		return result.toString();
	}

} // CatalogContainerImpl
