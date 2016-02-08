/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.ddl.QLockTableStatement;
import org.smeup.sys.db.syntax.ddl.ShareMode;
import org.smeup.sys.db.syntax.impl.DefinitionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lock Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl#isAllowRead <em>Allow Read</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl#getShareMode <em>Share Mode</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockTableStatementImpl extends DefinitionStatementImpl implements QLockTableStatement {
	/**
	 * The default value of the '{@link #isAllowRead() <em>Allow Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowRead() <em>Allow Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRead()
	 * @generated
	 * @ordered
	 */
	protected boolean allowRead = ALLOW_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareMode() <em>Share Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShareMode SHARE_MODE_EDEFAULT = ShareMode.SHARE;

	/**
	 * The cached value of the '{@link #getShareMode() <em>Share Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareMode()
	 * @generated
	 * @ordered
	 */
	protected ShareMode shareMode = SHARE_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName tableName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LockTableStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDDLPackage.Literals.LOCK_TABLE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowRead() {
		return allowRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowRead(boolean newAllowRead) {
		boolean oldAllowRead = allowRead;
		allowRead = newAllowRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__ALLOW_READ, oldAllowRead, allowRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareMode getShareMode() {
		return shareMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareMode(ShareMode newShareMode) {
		ShareMode oldShareMode = shareMode;
		shareMode = newShareMode == null ? SHARE_MODE_EDEFAULT : newShareMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__SHARE_MODE, oldShareMode, shareMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableName(QQualifiedName newTableName, NotificationChain msgs) {
		QQualifiedName oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME, oldTableName, newTableName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(QQualifiedName newTableName) {
		if (newTableName != tableName) {
			NotificationChain msgs = null;
			if (tableName != null)
				msgs = ((InternalEObject)tableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME, null, msgs);
			if (newTableName != null)
				msgs = ((InternalEObject)newTableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME, null, msgs);
			msgs = basicSetTableName(newTableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME, newTableName, newTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME:
				return basicSetTableName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__ALLOW_READ:
				return isAllowRead();
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__SHARE_MODE:
				return getShareMode();
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME:
				return getTableName();
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
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__ALLOW_READ:
				setAllowRead((Boolean)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__SHARE_MODE:
				setShareMode((ShareMode)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)newValue);
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
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__ALLOW_READ:
				setAllowRead(ALLOW_READ_EDEFAULT);
				return;
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__SHARE_MODE:
				setShareMode(SHARE_MODE_EDEFAULT);
				return;
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)null);
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
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__ALLOW_READ:
				return allowRead != ALLOW_READ_EDEFAULT;
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__SHARE_MODE:
				return shareMode != SHARE_MODE_EDEFAULT;
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT__TABLE_NAME:
				return tableName != null;
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
		result.append(" (allowRead: ");
		result.append(allowRead);
		result.append(", shareMode: ");
		result.append(shareMode);
		result.append(')');
		return result.toString();
	}

} //LockTableStatementImpl
