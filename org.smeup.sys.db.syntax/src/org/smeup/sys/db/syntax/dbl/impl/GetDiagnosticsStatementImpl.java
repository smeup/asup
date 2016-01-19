/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.db.syntax.dbl.QConditionInfoClause;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement;

import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Diagnostics Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.GetDiagnosticsStatementImpl#getConditionInfo <em>Condition Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetDiagnosticsStatementImpl extends BindingStatementImpl implements QGetDiagnosticsStatement {
	/**
	 * The cached value of the '{@link #getConditionInfo() <em>Condition Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionInfo()
	 * @generated
	 * @ordered
	 */
	protected QConditionInfoClause conditionInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetDiagnosticsStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.GET_DIAGNOSTICS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConditionInfoClause getConditionInfo() {
		if (conditionInfo != null && ((EObject)conditionInfo).eIsProxy()) {
			InternalEObject oldConditionInfo = (InternalEObject)conditionInfo;
			conditionInfo = (QConditionInfoClause)eResolveProxy(oldConditionInfo);
			if (conditionInfo != oldConditionInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO, oldConditionInfo, conditionInfo));
			}
		}
		return conditionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConditionInfoClause basicGetConditionInfo() {
		return conditionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionInfo(QConditionInfoClause newConditionInfo) {
		QConditionInfoClause oldConditionInfo = conditionInfo;
		conditionInfo = newConditionInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO, oldConditionInfo, conditionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO:
				if (resolve) return getConditionInfo();
				return basicGetConditionInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO:
				setConditionInfo((QConditionInfoClause)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO:
				setConditionInfo((QConditionInfoClause)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO:
				return conditionInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //GetDiagnosticsStatementImpl
