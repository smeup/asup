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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.ddl.QCreateViewStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.impl.DefinitionStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateViewStatementImpl extends DefinitionStatementImpl implements QCreateViewStatement {
	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected QQualifiedName viewName;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fields;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateViewStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDDLPackage.Literals.CREATE_VIEW_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getFields() {
		if (fields == null) {
			fields = new EDataTypeUniqueEList<String>(String.class, this, QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QQualifiedName getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewName(QQualifiedName newViewName, NotificationChain msgs) {
		QQualifiedName oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, oldViewName, newViewName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewName(QQualifiedName newViewName) {
		if (newViewName != viewName) {
			NotificationChain msgs = null;
			if (viewName != null)
				msgs = ((InternalEObject)viewName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, null, msgs);
			if (newViewName != null)
				msgs = ((InternalEObject)newViewName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, null, msgs);
			msgs = basicSetViewName(newViewName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME, newViewName, newViewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				return basicSetViewName(null, msgs);
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
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				return getViewName();
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__FIELDS:
				return getFields();
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__QUERY:
				return getQuery();
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
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				setViewName((QQualifiedName)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends String>)newValue);
				return;
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__QUERY:
				setQuery((String)newValue);
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
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				setViewName((QQualifiedName)null);
				return;
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__FIELDS:
				getFields().clear();
				return;
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__QUERY:
				setQuery(QUERY_EDEFAULT);
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
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__VIEW_NAME:
				return viewName != null;
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__FIELDS:
				return fields != null && !fields.isEmpty();
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
		result.append(" (fields: ");
		result.append(fields);
		result.append(", query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

} //CreateViewStatementImpl
