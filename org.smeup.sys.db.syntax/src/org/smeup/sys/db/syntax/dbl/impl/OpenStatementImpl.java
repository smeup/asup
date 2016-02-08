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
import org.smeup.sys.db.syntax.dbl.OpenUsingType;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QOpenStatement;
import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl#getCursor <em>Cursor</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl#getUsingType <em>Using Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenStatementImpl extends BindingStatementImpl implements QOpenStatement {
	/**
	 * The default value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected String cursor = CURSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected static final String USING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected String using = USING_EDEFAULT;

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
	protected OpenStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.OPEN_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(String newCursor) {
		String oldCursor = cursor;
		cursor = newCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__CURSOR, oldCursor, cursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsing() {
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsing(String newUsing) {
		String oldUsing = using;
		using = newUsing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING, oldUsing, using));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING_TYPE, oldUsingType, usingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__CURSOR:
				return getCursor();
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING:
				return getUsing();
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING_TYPE:
				return getUsingType();
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
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__CURSOR:
				setCursor((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING:
				setUsing((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING_TYPE:
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
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__CURSOR:
				setCursor(CURSOR_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING:
				setUsing(USING_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING_TYPE:
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
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__CURSOR:
				return CURSOR_EDEFAULT == null ? cursor != null : !CURSOR_EDEFAULT.equals(cursor);
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING:
				return USING_EDEFAULT == null ? using != null : !USING_EDEFAULT.equals(using);
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT__USING_TYPE:
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
		result.append(" (cursor: ");
		result.append(cursor);
		result.append(", using: ");
		result.append(using);
		result.append(", usingType: ");
		result.append(usingType);
		result.append(')');
		return result.toString();
	}

} //OpenStatementImpl
