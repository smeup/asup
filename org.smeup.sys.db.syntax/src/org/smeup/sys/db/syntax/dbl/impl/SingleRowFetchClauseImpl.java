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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Row Fetch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl#isUsingDescriptor <em>Using Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleRowFetchClauseImpl extends EObjectImpl implements QSingleRowFetchClause {
	/**
	 * The cached value of the '{@link #getInto() <em>Into</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected EList<String> into;

	/**
	 * The default value of the '{@link #isUsingDescriptor() <em>Using Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsingDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USING_DESCRIPTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsingDescriptor() <em>Using Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsingDescriptor()
	 * @generated
	 * @ordered
	 */
	protected boolean usingDescriptor = USING_DESCRIPTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleRowFetchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.SINGLE_ROW_FETCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getInto() {
		if (into == null) {
			into = new EDataTypeUniqueEList<String>(String.class, this, QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__INTO);
		}
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsingDescriptor() {
		return usingDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsingDescriptor(boolean newUsingDescriptor) {
		boolean oldUsingDescriptor = usingDescriptor;
		usingDescriptor = newUsingDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR, oldUsingDescriptor, usingDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__INTO:
				return getInto();
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				return isUsingDescriptor();
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
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__INTO:
				getInto().clear();
				getInto().addAll((Collection<? extends String>)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				setUsingDescriptor((Boolean)newValue);
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
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__INTO:
				getInto().clear();
				return;
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				setUsingDescriptor(USING_DESCRIPTOR_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__INTO:
				return into != null && !into.isEmpty();
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				return usingDescriptor != USING_DESCRIPTOR_EDEFAULT;
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
		result.append(" (into: ");
		result.append(into);
		result.append(", usingDescriptor: ");
		result.append(usingDescriptor);
		result.append(')');
		return result.toString();
	}

} //SingleRowFetchClauseImpl
