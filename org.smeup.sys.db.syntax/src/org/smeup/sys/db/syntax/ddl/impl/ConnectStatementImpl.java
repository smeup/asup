/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.syntax.ddl.QConnectStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.impl.DefinitionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl#isReset <em>Reset</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectStatementImpl extends DefinitionStatementImpl implements QConnectStatement {
	/**
	 * The default value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String PWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected String pwd = PWD_EDEFAULT;

	/**
	 * The default value of the '{@link #isReset() <em>Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReset()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReset() <em>Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReset()
	 * @generated
	 * @ordered
	 */
	protected boolean reset = RESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDDLPackage.Literals.CONNECT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwd(String newPwd) {
		String oldPwd = pwd;
		pwd = newPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__PWD, oldPwd, pwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReset() {
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset(boolean newReset) {
		boolean oldReset = reset;
		reset = newReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__RESET, oldReset, reset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__PWD:
				return getPwd();
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__RESET:
				return isReset();
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__TO:
				return getTo();
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__USER:
				return getUser();
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
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__PWD:
				setPwd((String)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__RESET:
				setReset((Boolean)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__TO:
				setTo((String)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__USER:
				setUser((String)newValue);
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
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__PWD:
				setPwd(PWD_EDEFAULT);
				return;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__RESET:
				setReset(RESET_EDEFAULT);
				return;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__TO:
				setTo(TO_EDEFAULT);
				return;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__USER:
				setUser(USER_EDEFAULT);
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
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__RESET:
				return reset != RESET_EDEFAULT;
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(" (pwd: ");
		result.append(pwd);
		result.append(", reset: ");
		result.append(reset);
		result.append(", to: ");
		result.append(to);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //ConnectStatementImpl
