/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.smeup.sys.db.syntax.QBindingParseError;
import org.smeup.sys.db.syntax.QBindingParseResult;
import org.smeup.sys.db.syntax.QBindingStatement;
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Parse Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.impl.BindingParseResultImpl#getBindingStatement <em>Binding Statement</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.impl.BindingParseResultImpl#getErrorList <em>Error List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingParseResultImpl extends EObjectImpl implements QBindingParseResult {
	/**
	 * The cached value of the '{@link #getBindingStatement() <em>Binding Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingStatement()
	 * @generated
	 * @ordered
	 */
	protected QBindingStatement bindingStatement;

	/**
	 * The cached value of the '{@link #getErrorList() <em>Error List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorList()
	 * @generated
	 * @ordered
	 */
	protected EList<QBindingParseError> errorList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingParseResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.BINDING_PARSE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBindingStatement getBindingStatement() {
		if (bindingStatement != null && ((EObject)bindingStatement).eIsProxy()) {
			InternalEObject oldBindingStatement = (InternalEObject)bindingStatement;
			bindingStatement = (QBindingStatement)eResolveProxy(oldBindingStatement);
			if (bindingStatement != oldBindingStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__BINDING_STATEMENT, oldBindingStatement, bindingStatement));
			}
		}
		return bindingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBindingStatement basicGetBindingStatement() {
		return bindingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingStatement(QBindingStatement newBindingStatement) {
		QBindingStatement oldBindingStatement = bindingStatement;
		bindingStatement = newBindingStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__BINDING_STATEMENT, oldBindingStatement, bindingStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QBindingParseError> getErrorList() {
		if (errorList == null) {
			errorList = new EObjectResolvingEList<QBindingParseError>(QBindingParseError.class, this, QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__ERROR_LIST);
		}
		return errorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__BINDING_STATEMENT:
				if (resolve) return getBindingStatement();
				return basicGetBindingStatement();
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__ERROR_LIST:
				return getErrorList();
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
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__BINDING_STATEMENT:
				setBindingStatement((QBindingStatement)newValue);
				return;
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__ERROR_LIST:
				getErrorList().clear();
				getErrorList().addAll((Collection<? extends QBindingParseError>)newValue);
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
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__BINDING_STATEMENT:
				setBindingStatement((QBindingStatement)null);
				return;
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__ERROR_LIST:
				getErrorList().clear();
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
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__BINDING_STATEMENT:
				return bindingStatement != null;
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT__ERROR_LIST:
				return errorList != null && !errorList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingParseResultImpl
