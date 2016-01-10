/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.core.QViewDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.impl.ViewDefImpl#getQuerySelect <em>Query Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewDefImpl extends TableDefImpl implements QViewDef {
	/**
	 * The default value of the '{@link #getQuerySelect() <em>Query Select</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuerySelect()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuerySelect() <em>Query Select</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuerySelect()
	 * @generated
	 * @ordered
	 */
	protected String querySelect = QUERY_SELECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.VIEW_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuerySelect() {
		return querySelect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuerySelect(String newQuerySelect) {
		String oldQuerySelect = querySelect;
		querySelect = newQuerySelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseCorePackage.VIEW_DEF__QUERY_SELECT, oldQuerySelect, querySelect));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseCorePackage.VIEW_DEF__QUERY_SELECT:
				return getQuerySelect();
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
			case QDatabaseCorePackage.VIEW_DEF__QUERY_SELECT:
				setQuerySelect((String)newValue);
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
			case QDatabaseCorePackage.VIEW_DEF__QUERY_SELECT:
				setQuerySelect(QUERY_SELECT_EDEFAULT);
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
			case QDatabaseCorePackage.VIEW_DEF__QUERY_SELECT:
				return QUERY_SELECT_EDEFAULT == null ? querySelect != null : !QUERY_SELECT_EDEFAULT.equals(querySelect);
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
		result.append(" (querySelect: ");
		result.append(querySelect);
		result.append(')');
		return result.toString();
	}

} // ViewDefImpl
