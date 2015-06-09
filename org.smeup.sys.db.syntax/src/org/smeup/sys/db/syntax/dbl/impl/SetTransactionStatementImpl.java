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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.syntax.dbl.IsolationLevel;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QSetTransactionStatement;
import org.smeup.sys.db.syntax.dbl.RWOperation;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Transaction Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl#getIsolationLevel <em>Isolation Level</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl#getRwOperation <em>Rw Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetTransactionStatementImpl extends BindingStatementImpl implements QSetTransactionStatement {
	/**
	 * The default value of the '{@link #getIsolationLevel() <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final IsolationLevel ISOLATION_LEVEL_EDEFAULT = IsolationLevel.NONE;

	/**
	 * The cached value of the '{@link #getIsolationLevel() <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolationLevel()
	 * @generated
	 * @ordered
	 */
	protected IsolationLevel isolationLevel = ISOLATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRwOperation() <em>Rw Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwOperation()
	 * @generated
	 * @ordered
	 */
	protected static final RWOperation RW_OPERATION_EDEFAULT = RWOperation.READ_ONLY;

	/**
	 * The cached value of the '{@link #getRwOperation() <em>Rw Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwOperation()
	 * @generated
	 * @ordered
	 */
	protected RWOperation rwOperation = RW_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTransactionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.SET_TRANSACTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationLevel getIsolationLevel() {
		return isolationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolationLevel(IsolationLevel newIsolationLevel) {
		IsolationLevel oldIsolationLevel = isolationLevel;
		isolationLevel = newIsolationLevel == null ? ISOLATION_LEVEL_EDEFAULT : newIsolationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL, oldIsolationLevel, isolationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWOperation getRwOperation() {
		return rwOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRwOperation(RWOperation newRwOperation) {
		RWOperation oldRwOperation = rwOperation;
		rwOperation = newRwOperation == null ? RW_OPERATION_EDEFAULT : newRwOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__RW_OPERATION, oldRwOperation, rwOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL:
				return getIsolationLevel();
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__RW_OPERATION:
				return getRwOperation();
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
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL:
				setIsolationLevel((IsolationLevel)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__RW_OPERATION:
				setRwOperation((RWOperation)newValue);
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
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL:
				setIsolationLevel(ISOLATION_LEVEL_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__RW_OPERATION:
				setRwOperation(RW_OPERATION_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL:
				return isolationLevel != ISOLATION_LEVEL_EDEFAULT;
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT__RW_OPERATION:
				return rwOperation != RW_OPERATION_EDEFAULT;
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
		result.append(" (isolationLevel: ");
		result.append(isolationLevel);
		result.append(", rwOperation: ");
		result.append(rwOperation);
		result.append(')');
		return result.toString();
	}

} //SetTransactionStatementImpl
