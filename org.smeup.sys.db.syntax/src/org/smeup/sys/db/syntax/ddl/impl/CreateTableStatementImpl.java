/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.syntax.ddl.QCreateTableStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.impl.DefinitionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CreateTableStatementImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CreateTableStatementImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateTableStatementImpl extends DefinitionStatementImpl implements QCreateTableStatement {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<QTableColumnDef> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTableStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDDLPackage.Literals.CREATE_TABLE_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME, oldTableName, newTableName);
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
				msgs = ((InternalEObject)tableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME, null, msgs);
			if (newTableName != null)
				msgs = ((InternalEObject)newTableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME, null, msgs);
			msgs = basicSetTableName(newTableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME, newTableName, newTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QTableColumnDef> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<QTableColumnDef>(QTableColumnDef.class, this, QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				return basicSetTableName(null, msgs);
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				return getTableName();
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__FIELDS:
				return getFields();
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
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends QTableColumnDef>)newValue);
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
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				setTableName((QQualifiedName)null);
				return;
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__FIELDS:
				getFields().clear();
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
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__TABLE_NAME:
				return tableName != null;
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateTableStatementImpl
