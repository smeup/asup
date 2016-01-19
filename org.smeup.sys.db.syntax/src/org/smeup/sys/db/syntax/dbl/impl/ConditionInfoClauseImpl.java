/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.smeup.sys.db.syntax.dbl.QConditionInfoClause;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Info Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.ConditionInfoClauseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.ConditionInfoClauseImpl#getConditionItems <em>Condition Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionInfoClauseImpl extends EObjectImpl implements QConditionInfoClause {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionItems() <em>Condition Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QOption> conditionItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionInfoClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.CONDITION_INFO_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QOption> getConditionItems() {
		if (conditionItems == null) {
			conditionItems = new EObjectResolvingEList<QOption>(QOption.class, this, QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION_ITEMS);
		}
		return conditionItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION:
				return getCondition();
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION_ITEMS:
				return getConditionItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION:
				setCondition((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION_ITEMS:
				getConditionItems().clear();
				getConditionItems().addAll((Collection<? extends QOption>)newValue);
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
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION_ITEMS:
				getConditionItems().clear();
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
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE__CONDITION_ITEMS:
				return conditionItems != null && !conditionItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ConditionInfoClauseImpl
