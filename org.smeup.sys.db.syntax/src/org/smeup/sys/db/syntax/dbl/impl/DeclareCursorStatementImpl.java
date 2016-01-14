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
import org.smeup.sys.db.syntax.dbl.CursorType;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl#getCursorName <em>Cursor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl#getCursorType <em>Cursor Type</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl#getForQuery <em>For Query</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl#getForStatementName <em>For Statement Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl#isHold <em>Hold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclareCursorStatementImpl extends BindingStatementImpl implements QDeclareCursorStatement {
	/**
	 * The default value of the '{@link #getCursorName() <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursorName() <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorName()
	 * @generated
	 * @ordered
	 */
	protected String cursorName = CURSOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCursorType() <em>Cursor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorType()
	 * @generated
	 * @ordered
	 */
	protected static final CursorType CURSOR_TYPE_EDEFAULT = CursorType.NOTSCROLL;

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
	 * The default value of the '{@link #getForQuery() <em>For Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForQuery() <em>For Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForQuery()
	 * @generated
	 * @ordered
	 */
	protected String forQuery = FOR_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getForStatementName() <em>For Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForStatementName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_STATEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForStatementName() <em>For Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForStatementName()
	 * @generated
	 * @ordered
	 */
	protected String forStatementName = FOR_STATEMENT_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareCursorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.DECLARE_CURSOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursorName() {
		return cursorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorName(String newCursorName) {
		String oldCursorName = cursorName;
		cursorName = newCursorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_NAME, oldCursorName, cursorName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_TYPE, oldCursorType, cursorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForQuery() {
		return forQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForQuery(String newForQuery) {
		String oldForQuery = forQuery;
		forQuery = newForQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_QUERY, oldForQuery, forQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForStatementName() {
		return forStatementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForStatementName(String newForStatementName) {
		String oldForStatementName = forStatementName;
		forStatementName = newForStatementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME, oldForStatementName, forStatementName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__HOLD, oldHold, hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_NAME:
				return getCursorName();
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_TYPE:
				return getCursorType();
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_QUERY:
				return getForQuery();
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME:
				return getForStatementName();
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__HOLD:
				return isHold();
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
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_NAME:
				setCursorName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_TYPE:
				setCursorType((CursorType)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_QUERY:
				setForQuery((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME:
				setForStatementName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__HOLD:
				setHold((Boolean)newValue);
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
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_NAME:
				setCursorName(CURSOR_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_TYPE:
				setCursorType(CURSOR_TYPE_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_QUERY:
				setForQuery(FOR_QUERY_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME:
				setForStatementName(FOR_STATEMENT_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__HOLD:
				setHold(HOLD_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_NAME:
				return CURSOR_NAME_EDEFAULT == null ? cursorName != null : !CURSOR_NAME_EDEFAULT.equals(cursorName);
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__CURSOR_TYPE:
				return cursorType != CURSOR_TYPE_EDEFAULT;
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_QUERY:
				return FOR_QUERY_EDEFAULT == null ? forQuery != null : !FOR_QUERY_EDEFAULT.equals(forQuery);
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME:
				return FOR_STATEMENT_NAME_EDEFAULT == null ? forStatementName != null : !FOR_STATEMENT_NAME_EDEFAULT.equals(forStatementName);
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT__HOLD:
				return hold != HOLD_EDEFAULT;
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
		result.append(" (cursorName: ");
		result.append(cursorName);
		result.append(", cursorType: ");
		result.append(cursorType);
		result.append(", forQuery: ");
		result.append(forQuery);
		result.append(", forStatementName: ");
		result.append(forStatementName);
		result.append(", hold: ");
		result.append(hold);
		result.append(')');
		return result.toString();
	}

} //DeclareCursorStatementImpl
