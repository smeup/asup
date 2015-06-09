/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dml.impl;

import org.eclipse.datatools.modelbase.sql.query.impl.QueryExpressionBodyImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage;
import org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Query Expression Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQueryExpressionBodyImpl#getOptimizeRecordsNumber <em>Optimize Records Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedQueryExpressionBodyImpl extends QueryExpressionBodyImpl implements QExtendedQueryExpressionBody {
	/**
	 * The default value of the '{@link #getOptimizeRecordsNumber() <em>Optimize Records Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizeRecordsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int OPTIMIZE_RECORDS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOptimizeRecordsNumber() <em>Optimize Records Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizeRecordsNumber()
	 * @generated
	 * @ordered
	 */
	protected int optimizeRecordsNumber = OPTIMIZE_RECORDS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedQueryExpressionBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDMLPackage.Literals.EXTENDED_QUERY_EXPRESSION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOptimizeRecordsNumber() {
		return optimizeRecordsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimizeRecordsNumber(int newOptimizeRecordsNumber) {
		int oldOptimizeRecordsNumber = optimizeRecordsNumber;
		optimizeRecordsNumber = newOptimizeRecordsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER, oldOptimizeRecordsNumber, optimizeRecordsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER:
				return getOptimizeRecordsNumber();
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
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER:
				setOptimizeRecordsNumber((Integer)newValue);
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
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER:
				setOptimizeRecordsNumber(OPTIMIZE_RECORDS_NUMBER_EDEFAULT);
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
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER:
				return optimizeRecordsNumber != OPTIMIZE_RECORDS_NUMBER_EDEFAULT;
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
		result.append(" (optimizeRecordsNumber: ");
		result.append(optimizeRecordsNumber);
		result.append(')');
		return result.toString();
	}

} //ExtendedQueryExpressionBodyImpl
