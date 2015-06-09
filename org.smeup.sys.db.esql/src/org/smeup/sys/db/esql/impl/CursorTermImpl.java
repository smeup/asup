/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cursor Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.esql.impl.CursorTermImpl#getCursorType <em>Cursor Type</em>}</li>
 *   <li>{@link org.smeup.sys.db.esql.impl.CursorTermImpl#isHold <em>Hold</em>}</li>
 *   <li>{@link org.smeup.sys.db.esql.impl.CursorTermImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.smeup.sys.db.esql.impl.CursorTermImpl#getStatementName <em>Statement Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CursorTermImpl extends ESqlTermImpl implements QCursorTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCursorType() <em>Cursor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorType()
	 * @generated
	 * @ordered
	 */
	protected static final CursorType CURSOR_TYPE_EDEFAULT = CursorType.NOT_SCROLLABLE;

	/**
	 * The cached value of the '{@link #getCursorType() <em>Cursor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorType()
	 * @generated
	 * @ordered
	 */
	protected CursorType cursorType = CURSOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHold() <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHold() <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHold()
	 * @generated
	 * @ordered
	 */
	protected boolean hold = HOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSql() <em>Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSql() <em>Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected String sql = SQL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CursorTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageEmbeddedSQLPackage.Literals.CURSOR_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CursorType getCursorType() {
		return cursorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorType(CursorType newCursorType) {
		CursorType oldCursorType = cursorType;
		cursorType = newCursorType == null ? CURSOR_TYPE_EDEFAULT : newCursorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__CURSOR_TYPE, oldCursorType, cursorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHold() {
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHold(boolean newHold) {
		boolean oldHold = hold;
		hold = newHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__HOLD, oldHold, hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSql() {
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSql(String newSql) {
		String oldSql = sql;
		sql = newSql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__SQL, oldSql, sql));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__STATEMENT_NAME, oldStatementName, statementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__CURSOR_TYPE:
				return getCursorType();
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__HOLD:
				return isHold();
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__SQL:
				return getSql();
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__STATEMENT_NAME:
				return getStatementName();
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
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__CURSOR_TYPE:
				setCursorType((CursorType)newValue);
				return;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__HOLD:
				setHold((Boolean)newValue);
				return;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__SQL:
				setSql((String)newValue);
				return;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__STATEMENT_NAME:
				setStatementName((String)newValue);
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
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__CURSOR_TYPE:
				setCursorType(CURSOR_TYPE_EDEFAULT);
				return;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__HOLD:
				setHold(HOLD_EDEFAULT);
				return;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__SQL:
				setSql(SQL_EDEFAULT);
				return;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__STATEMENT_NAME:
				setStatementName(STATEMENT_NAME_EDEFAULT);
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
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__CURSOR_TYPE:
				return cursorType != CURSOR_TYPE_EDEFAULT;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__HOLD:
				return hold != HOLD_EDEFAULT;
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__SQL:
				return SQL_EDEFAULT == null ? sql != null : !SQL_EDEFAULT.equals(sql);
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM__STATEMENT_NAME:
				return STATEMENT_NAME_EDEFAULT == null ? statementName != null : !STATEMENT_NAME_EDEFAULT.equals(statementName);
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
		result.append(" (cursorType: ");
		result.append(cursorType);
		result.append(", hold: ");
		result.append(hold);
		result.append(", sql: ");
		result.append(sql);
		result.append(", statementName: ");
		result.append(statementName);
		result.append(')');
		return result.toString();
	}

} //CursorTermImpl
