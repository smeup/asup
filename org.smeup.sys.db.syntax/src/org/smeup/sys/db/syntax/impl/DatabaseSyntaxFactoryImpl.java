/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.impl;

import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.db.syntax.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxFactoryImpl extends EFactoryImpl implements QDatabaseSyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDatabaseSyntaxFactory init() {
		try {
			QDatabaseSyntaxFactory theDatabaseSyntaxFactory = (QDatabaseSyntaxFactory)EPackage.Registry.INSTANCE.getEFactory(QDatabaseSyntaxPackage.eNS_URI);
			if (theDatabaseSyntaxFactory != null) {
				return theDatabaseSyntaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseSyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSyntaxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QDatabaseSyntaxPackage.BINDING_PARSE_ERROR: return (EObject)createBindingParseError();
			case QDatabaseSyntaxPackage.BINDING_PARSE_RESULT: return (EObject)createBindingParseResult();
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_ERROR: return (EObject)createDefinitionParseError();
			case QDatabaseSyntaxPackage.DEFINITION_PARSE_RESULT: return (EObject)createDefinitionParseResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseSyntaxPackage.STATEMENT_TYPE:
				return createStatementTypeFromString(eDataType, initialValue);
			case QDatabaseSyntaxPackage.SQL_QUERY_PARSE_RESULT:
				return createSQLQueryParseResultFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseSyntaxPackage.STATEMENT_TYPE:
				return convertStatementTypeToString(eDataType, instanceValue);
			case QDatabaseSyntaxPackage.SQL_QUERY_PARSE_RESULT:
				return convertSQLQueryParseResultToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBindingParseError createBindingParseError() {
		BindingParseErrorImpl bindingParseError = new BindingParseErrorImpl();
		return bindingParseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBindingParseResult createBindingParseResult() {
		BindingParseResultImpl bindingParseResult = new BindingParseResultImpl();
		return bindingParseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDefinitionParseError createDefinitionParseError() {
		DefinitionParseErrorImpl definitionParseError = new DefinitionParseErrorImpl();
		return definitionParseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDefinitionParseResult createDefinitionParseResult() {
		DefinitionParseResultImpl definitionParseResult = new DefinitionParseResultImpl();
		return definitionParseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementType createStatementTypeFromString(EDataType eDataType, String initialValue) {
		StatementType result = StatementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQueryParseResult createSQLQueryParseResultFromString(EDataType eDataType, String initialValue) {
		return (SQLQueryParseResult)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSQLQueryParseResultToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxPackage getDatabaseSyntaxPackage() {
		return (QDatabaseSyntaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDatabaseSyntaxPackage getPackage() {
		return QDatabaseSyntaxPackage.eINSTANCE;
	}

} //DatabaseSyntaxFactoryImpl
