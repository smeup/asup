/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Row Fetch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl#getRowsNumber <em>Rows Number</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl#isUsingDescriptor <em>Using Descriptor</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleRowFetchClauseImpl extends EObjectImpl implements QMultipleRowFetchClause {
	/**
	 * The default value of the '{@link #getInto() <em>Into</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected static final String INTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInto() <em>Into</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInto()
	 * @generated
	 * @ordered
	 */
	protected String into = INTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowsNumber() <em>Rows Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowsNumber() <em>Rows Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsNumber()
	 * @generated
	 * @ordered
	 */
	protected String rowsNumber = ROWS_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected String descriptor = DESCRIPTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleRowFetchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.MULTIPLE_ROW_FETCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInto() {
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInto(String newInto) {
		String oldInto = into;
		into = newInto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__INTO, oldInto, into));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowsNumber() {
		return rowsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowsNumber(String newRowsNumber) {
		String oldRowsNumber = rowsNumber;
		rowsNumber = newRowsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER, oldRowsNumber, rowsNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR, oldUsingDescriptor, usingDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(String newDescriptor) {
		String oldDescriptor = descriptor;
		descriptor = newDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR, oldDescriptor, descriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__INTO:
				return getInto();
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER:
				return getRowsNumber();
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				return isUsingDescriptor();
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR:
				return getDescriptor();
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
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__INTO:
				setInto((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER:
				setRowsNumber((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				setUsingDescriptor((Boolean)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR:
				setDescriptor((String)newValue);
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
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__INTO:
				setInto(INTO_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER:
				setRowsNumber(ROWS_NUMBER_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				setUsingDescriptor(USING_DESCRIPTOR_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__INTO:
				return INTO_EDEFAULT == null ? into != null : !INTO_EDEFAULT.equals(into);
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER:
				return ROWS_NUMBER_EDEFAULT == null ? rowsNumber != null : !ROWS_NUMBER_EDEFAULT.equals(rowsNumber);
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR:
				return usingDescriptor != USING_DESCRIPTOR_EDEFAULT;
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR:
				return DESCRIPTOR_EDEFAULT == null ? descriptor != null : !DESCRIPTOR_EDEFAULT.equals(descriptor);
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
		result.append(", rowsNumber: ");
		result.append(rowsNumber);
		result.append(", usingDescriptor: ");
		result.append(usingDescriptor);
		result.append(", descriptor: ");
		result.append(descriptor);
		result.append(')');
		return result.toString();
	}

} //MultipleRowFetchClauseImpl
