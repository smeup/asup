/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Index</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.impl.IndexDefImpl#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.IndexDefImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.impl.IndexDefImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexDefImpl extends DatabaseObjectDefImpl implements QIndexDef {
	/**
	 * The default value of the '{@link #isClustered() <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isClustered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClustered() <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isClustered()
	 * @generated
	 * @ordered
	 */
	protected boolean clustered = CLUSTERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<QIndexColumnDef> columns;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.INDEX_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isClustered() {
		return clustered;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClustered(boolean newClustered) {
		boolean oldClustered = clustered;
		clustered = newClustered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.INDEX_DEF__CLUSTERED, oldClustered, clustered));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QIndexColumnDef> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<QIndexColumnDef>(QIndexColumnDef.class, this, QDatabaseCorePackage.INDEX_DEF__COLUMNS);
		}
		return columns;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.INDEX_DEF__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseCorePackage.INDEX_DEF__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case QDatabaseCorePackage.INDEX_DEF__CLUSTERED:
				return isClustered();
			case QDatabaseCorePackage.INDEX_DEF__COLUMNS:
				return getColumns();
			case QDatabaseCorePackage.INDEX_DEF__UNIQUE:
				return isUnique();
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
			case QDatabaseCorePackage.INDEX_DEF__CLUSTERED:
				setClustered((Boolean)newValue);
				return;
			case QDatabaseCorePackage.INDEX_DEF__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends QIndexColumnDef>)newValue);
				return;
			case QDatabaseCorePackage.INDEX_DEF__UNIQUE:
				setUnique((Boolean)newValue);
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
			case QDatabaseCorePackage.INDEX_DEF__CLUSTERED:
				setClustered(CLUSTERED_EDEFAULT);
				return;
			case QDatabaseCorePackage.INDEX_DEF__COLUMNS:
				getColumns().clear();
				return;
			case QDatabaseCorePackage.INDEX_DEF__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case QDatabaseCorePackage.INDEX_DEF__CLUSTERED:
				return clustered != CLUSTERED_EDEFAULT;
			case QDatabaseCorePackage.INDEX_DEF__COLUMNS:
				return columns != null && !columns.isEmpty();
			case QDatabaseCorePackage.INDEX_DEF__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
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
		result.append(" (clustered: ");
		result.append(clustered);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} // IndexDefImpl
