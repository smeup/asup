/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.db.syntax.dbl.OpenUsingType;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QExecuteStatement;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl#getStatementName <em>Statement Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl#getUsingType <em>Using Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteStatementImpl extends BindingStatementImpl implements QExecuteStatement {
	/**
	 * The default value of the '{@link #getStatementName() <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementName() <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementName()
	 * @generated
	 * @ordered
	 */
	protected String statementName = STATEMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected EList<String> using;

	/**
	 * The default value of the '{@link #getUsingType() <em>Using Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingType()
	 * @generated
	 * @ordered
	 */
	protected static final OpenUsingType USING_TYPE_EDEFAULT = OpenUsingType.NONE;

	/**
	 * The cached value of the '{@link #getUsingType() <em>Using Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingType()
	 * @generated
	 * @ordered
	 */
	protected OpenUsingType usingType = USING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.EXECUTE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementName() {
		return statementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementName(String newStatementName) {
		String oldStatementName = statementName;
		statementName = newStatementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__STATEMENT_NAME, oldStatementName, statementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getUsing() {
		if (using == null) {
			using = new EDataTypeUniqueEList<String>(String.class, this, QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING);
		}
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenUsingType getUsingType() {
		return usingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsingType(OpenUsingType newUsingType) {
		OpenUsingType oldUsingType = usingType;
		usingType = newUsingType == null ? USING_TYPE_EDEFAULT : newUsingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING_TYPE, oldUsingType, usingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__STATEMENT_NAME:
				return getStatementName();
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING:
				return getUsing();
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING_TYPE:
				return getUsingType();
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
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__STATEMENT_NAME:
				setStatementName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING:
				getUsing().clear();
				getUsing().addAll((Collection<? extends String>)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING_TYPE:
				setUsingType((OpenUsingType)newValue);
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
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__STATEMENT_NAME:
				setStatementName(STATEMENT_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING:
				getUsing().clear();
				return;
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING_TYPE:
				setUsingType(USING_TYPE_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__STATEMENT_NAME:
				return STATEMENT_NAME_EDEFAULT == null ? statementName != null : !STATEMENT_NAME_EDEFAULT.equals(statementName);
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING:
				return using != null && !using.isEmpty();
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT__USING_TYPE:
				return usingType != USING_TYPE_EDEFAULT;
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
		result.append(" (statementName: ");
		result.append(statementName);
		result.append(", using: ");
		result.append(using);
		result.append(", usingType: ");
		result.append(usingType);
		result.append(')');
		return result.toString();
	}

} //ExecuteStatementImpl
