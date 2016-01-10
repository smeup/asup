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
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;
import org.smeup.sys.db.syntax.QDefinitionParseError;
import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Parser Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.impl.DefinitionParseResultImpl#getDefinitionStatement <em>Definition Statement</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.impl.DefinitionParseResultImpl#getErrorList <em>Error List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionParseResultImpl extends EObjectImpl implements QDefinitionParseResult {
	/**
	 * The cached value of the '{@link #getDefinitionStatement() <em>Definition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionStatement()
	 * @generated
	 * @ordered
	 */
	protected QDefinitionStatement definitionStatement;

	/**
	 * The cached value of the '{@link #getErrorList() <em>Error List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorList()
	 * @generated
	 * @ordered
	 */
	protected EList<QDefinitionParseError> errorList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionParseResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxPackage.Literals.DEFINITION_PARSE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDefinitionStatement getDefinitionStatement() {
		if (definitionStatement != null && ((EObject)definitionStatement).eIsProxy()) {
			InternalEObject oldDefinitionStatement = (InternalEObject)definitionStatement;
			definitionStatement = (QDefinitionStatement)eResolveProxy(oldDefinitionStatement);
			if (definitionStatement != oldDefinitionStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT, oldDefinitionStatement, definitionStatement));
			}
		}
		return definitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDefinitionStatement basicGetDefinitionStatement() {
		return definitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionStatement(QDefinitionStatement newDefinitionStatement) {
		QDefinitionStatement oldDefinitionStatement = definitionStatement;
		definitionStatement = newDefinitionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT, oldDefinitionStatement, definitionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QDefinitionParseError> getErrorList() {
		if (errorList == null) {
			errorList = new EObjectResolvingEList<QDefinitionParseError>(QDefinitionParseError.class, this, QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__ERROR_LIST);
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
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				if (resolve) return getDefinitionStatement();
				return basicGetDefinitionStatement();
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
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
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				setDefinitionStatement((QDefinitionStatement)newValue);
				return;
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
				getErrorList().clear();
				getErrorList().addAll((Collection<? extends QDefinitionParseError>)newValue);
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
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				setDefinitionStatement((QDefinitionStatement)null);
				return;
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
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
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				return definitionStatement != null;
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
				return errorList != null && !errorList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionParserResultImpl
