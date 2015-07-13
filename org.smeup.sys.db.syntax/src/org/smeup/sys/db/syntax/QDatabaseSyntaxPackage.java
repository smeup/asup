/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseSyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "syntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/db/syntax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxPackage eINSTANCE = org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QAliasResolver <em>Alias Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QAliasResolver
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getAliasResolver()
	 * @generated
	 */
	int ALIAS_RESOLVER = 0;

	/**
	 * The number of structural features of the '<em>Alias Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.BindingParseErrorImpl <em>Binding Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.BindingParseErrorImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseError()
	 * @generated
	 */
	int BINDING_PARSE_ERROR = 1;

	/**
	 * The number of structural features of the '<em>Binding Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QStatementParser <em>Statement Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QStatementParser
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementParser()
	 * @generated
	 */
	int STATEMENT_PARSER = 21;

	/**
	 * The number of structural features of the '<em>Statement Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QBindingParser <em>Binding Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QBindingParser
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParser()
	 * @generated
	 */
	int BINDING_PARSER = 2;

	/**
	 * The number of structural features of the '<em>Binding Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QBindingParserRegistry <em>Binding Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QBindingParserRegistry
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParserRegistry()
	 * @generated
	 */
	int BINDING_PARSER_REGISTRY = 3;

	/**
	 * The number of structural features of the '<em>Binding Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.BindingParseResultImpl <em>Binding Parse Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.BindingParseResultImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseResult()
	 * @generated
	 */
	int BINDING_PARSE_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Binding Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_RESULT__BINDING_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_RESULT__ERROR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Binding Parse Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PARSE_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.BindingStatementImpl <em>Binding Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.BindingStatementImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingStatement()
	 * @generated
	 */
	int BINDING_STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Binding Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QDefinitionParser <em>Definition Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QDefinitionParser
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParser()
	 * @generated
	 */
	int DEFINITION_PARSER = 6;

	/**
	 * The number of structural features of the '<em>Definition Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QDefinitionParserRegistry <em>Definition Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QDefinitionParserRegistry
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserRegistry()
	 * @generated
	 */
	int DEFINITION_PARSER_REGISTRY = 7;

	/**
	 * The number of structural features of the '<em>Definition Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.DefinitionParseErrorImpl <em>Definition Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.DefinitionParseErrorImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseError()
	 * @generated
	 */
	int DEFINITION_PARSE_ERROR = 8;

	/**
	 * The number of structural features of the '<em>Definition Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.DefinitionParseResultImpl <em>Definition Parse Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.DefinitionParseResultImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseResult()
	 * @generated
	 */
	int DEFINITION_PARSE_RESULT = 9;

	/**
	 * The feature id for the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT__ERROR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Definition Parse Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.StatementWriterImpl <em>Statement Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.StatementWriterImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementWriter()
	 * @generated
	 */
	int STATEMENT_WRITER = 20;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__NAME_HELPER = 0;

	/**
	 * The number of structural features of the '<em>Statement Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QDefinitionWriter <em>Definition Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QDefinitionWriter
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriter()
	 * @generated
	 */
	int DEFINITION_WRITER = 10;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__NAME_HELPER = STATEMENT_WRITER__NAME_HELPER;

	/**
	 * The number of structural features of the '<em>Definition Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_FEATURE_COUNT = STATEMENT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QDefinitionWriterRegistry <em>Definition Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QDefinitionWriterRegistry
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriterRegistry()
	 * @generated
	 */
	int DEFINITION_WRITER_REGISTRY = 11;

	/**
	 * The number of structural features of the '<em>Definition Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.impl.DefinitionStatementImpl <em>Definition Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.impl.DefinitionStatementImpl
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionStatement()
	 * @generated
	 */
	int DEFINITION_STATEMENT = 12;

	/**
	 * The number of structural features of the '<em>Definition Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QNameHelper <em>Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QNameHelper
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelper()
	 * @generated
	 */
	int NAME_HELPER = 13;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QNameHelperRegistry <em>Name Helper Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QNameHelperRegistry
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelperRegistry()
	 * @generated
	 */
	int NAME_HELPER_REGISTRY = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QQueryWriter <em>Query Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QQueryWriter
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriter()
	 * @generated
	 */
	int QUERY_WRITER = 15;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QQueryWriterRegistry <em>Query Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QQueryWriterRegistry
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriterRegistry()
	 * @generated
	 */
	int QUERY_WRITER_REGISTRY = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QQueryParser <em>Query Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QQueryParser
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParser()
	 * @generated
	 */
	int QUERY_PARSER = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.QQueryParserRegistry <em>Query Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.QQueryParserRegistry
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParserRegistry()
	 * @generated
	 */
	int QUERY_PARSER_REGISTRY = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLObjectNameHelper()
	 * @generated
	 */
	int SQL_OBJECT_NAME_HELPER = 19;

	/**
	 * The number of structural features of the '<em>SQL Object Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OBJECT_NAME_HELPER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_FEATURE_COUNT = SQL_OBJECT_NAME_HELPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Helper Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__NAME_HELPER = STATEMENT_WRITER__NAME_HELPER;

	/**
	 * The number of structural features of the '<em>Query Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_FEATURE_COUNT = STATEMENT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.StatementType <em>Statement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.StatementType
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 22;

	/**
	 * The meta object id for the '<em>SQL Query Parse Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLQueryParseResult()
	 * @generated
	 */
	int SQL_QUERY_PARSE_RESULT = 23;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QAliasResolver <em>Alias Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Resolver</em>'.
	 * @see org.smeup.sys.db.syntax.QAliasResolver
	 * @generated
	 */
	EClass getAliasResolver();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QBindingParseError <em>Binding Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parse Error</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingParseError
	 * @generated
	 */
	EClass getBindingParseError();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QBindingParser <em>Binding Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parser</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingParser
	 * @generated
	 */
	EClass getBindingParser();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QBindingParserRegistry <em>Binding Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parser Registry</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingParserRegistry
	 * @generated
	 */
	EClass getBindingParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QBindingParseResult <em>Binding Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Parse Result</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingParseResult
	 * @generated
	 */
	EClass getBindingParseResult();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.db.syntax.QBindingParseResult#getBindingStatement <em>Binding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Statement</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingParseResult#getBindingStatement()
	 * @see #getBindingParseResult()
	 * @generated
	 */
	EReference getBindingParseResult_BindingStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.smeup.sys.db.syntax.QBindingParseResult#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error List</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingParseResult#getErrorList()
	 * @see #getBindingParseResult()
	 * @generated
	 */
	EReference getBindingParseResult_ErrorList();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QBindingStatement <em>Binding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Statement</em>'.
	 * @see org.smeup.sys.db.syntax.QBindingStatement
	 * @generated
	 */
	EClass getBindingStatement();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionParser <em>Definition Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionParser
	 * @generated
	 */
	EClass getDefinitionParser();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionParserRegistry <em>Definition Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser Registry</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionParserRegistry
	 * @generated
	 */
	EClass getDefinitionParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionParseError <em>Definition Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parse Error</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionParseError
	 * @generated
	 */
	EClass getDefinitionParseError();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionParseResult <em>Definition Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parse Result</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionParseResult
	 * @generated
	 */
	EClass getDefinitionParseResult();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.db.syntax.QDefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition Statement</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionParseResult#getDefinitionStatement()
	 * @see #getDefinitionParseResult()
	 * @generated
	 */
	EReference getDefinitionParseResult_DefinitionStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.smeup.sys.db.syntax.QDefinitionParseResult#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error List</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionParseResult#getErrorList()
	 * @see #getDefinitionParseResult()
	 * @generated
	 */
	EReference getDefinitionParseResult_ErrorList();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionWriter <em>Definition Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Writer</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionWriter
	 * @generated
	 */
	EClass getDefinitionWriter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionWriterRegistry <em>Definition Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Writer Registry</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionWriterRegistry
	 * @generated
	 */
	EClass getDefinitionWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Statement</em>'.
	 * @see org.smeup.sys.db.syntax.QDefinitionStatement
	 * @generated
	 */
	EClass getDefinitionStatement();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QNameHelper <em>Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Helper</em>'.
	 * @see org.smeup.sys.db.syntax.QNameHelper
	 * @generated
	 */
	EClass getNameHelper();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QNameHelperRegistry <em>Name Helper Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Helper Registry</em>'.
	 * @see org.smeup.sys.db.syntax.QNameHelperRegistry
	 * @generated
	 */
	EClass getNameHelperRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QQueryWriter <em>Query Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Writer</em>'.
	 * @see org.smeup.sys.db.syntax.QQueryWriter
	 * @generated
	 */
	EClass getQueryWriter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QQueryWriterRegistry <em>Query Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Writer Registry</em>'.
	 * @see org.smeup.sys.db.syntax.QQueryWriterRegistry
	 * @generated
	 */
	EClass getQueryWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QQueryParser <em>Query Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parser</em>'.
	 * @see org.smeup.sys.db.syntax.QQueryParser
	 * @generated
	 */
	EClass getQueryParser();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QQueryParserRegistry <em>Query Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parser Registry</em>'.
	 * @see org.smeup.sys.db.syntax.QQueryParserRegistry
	 * @generated
	 */
	EClass getQueryParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Object Name Helper</em>'.
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @model instanceClass="org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper"
	 * @generated
	 */
	EClass getSQLObjectNameHelper();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QStatementWriter <em>Statement Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Writer</em>'.
	 * @see org.smeup.sys.db.syntax.QStatementWriter
	 * @generated
	 */
	EClass getStatementWriter();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.db.syntax.QStatementWriter#getNameHelper <em>Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Helper</em>'.
	 * @see org.smeup.sys.db.syntax.QStatementWriter#getNameHelper()
	 * @see #getStatementWriter()
	 * @generated
	 */
	EReference getStatementWriter_NameHelper();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.QStatementParser <em>Statement Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Parser</em>'.
	 * @see org.smeup.sys.db.syntax.QStatementParser
	 * @generated
	 */
	EClass getStatementParser();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statement Type</em>'.
	 * @see org.smeup.sys.db.syntax.StatementType
	 * @generated
	 */
	EEnum getStatementType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult <em>SQL Query Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SQL Query Parse Result</em>'.
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @model instanceClass="org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult"
	 * @generated
	 */
	EDataType getSQLQueryParseResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseSyntaxFactory getDatabaseSyntaxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QAliasResolver <em>Alias Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QAliasResolver
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getAliasResolver()
		 * @generated
		 */
		EClass ALIAS_RESOLVER = eINSTANCE.getAliasResolver();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.BindingParseErrorImpl <em>Binding Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.BindingParseErrorImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseError()
		 * @generated
		 */
		EClass BINDING_PARSE_ERROR = eINSTANCE.getBindingParseError();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QBindingParser <em>Binding Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QBindingParser
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParser()
		 * @generated
		 */
		EClass BINDING_PARSER = eINSTANCE.getBindingParser();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QBindingParserRegistry <em>Binding Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QBindingParserRegistry
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParserRegistry()
		 * @generated
		 */
		EClass BINDING_PARSER_REGISTRY = eINSTANCE.getBindingParserRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.BindingParseResultImpl <em>Binding Parse Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.BindingParseResultImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingParseResult()
		 * @generated
		 */
		EClass BINDING_PARSE_RESULT = eINSTANCE.getBindingParseResult();

		/**
		 * The meta object literal for the '<em><b>Binding Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PARSE_RESULT__BINDING_STATEMENT = eINSTANCE.getBindingParseResult_BindingStatement();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PARSE_RESULT__ERROR_LIST = eINSTANCE.getBindingParseResult_ErrorList();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.BindingStatementImpl <em>Binding Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.BindingStatementImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getBindingStatement()
		 * @generated
		 */
		EClass BINDING_STATEMENT = eINSTANCE.getBindingStatement();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QDefinitionParser <em>Definition Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QDefinitionParser
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParser()
		 * @generated
		 */
		EClass DEFINITION_PARSER = eINSTANCE.getDefinitionParser();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QDefinitionParserRegistry <em>Definition Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QDefinitionParserRegistry
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParserRegistry()
		 * @generated
		 */
		EClass DEFINITION_PARSER_REGISTRY = eINSTANCE.getDefinitionParserRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.DefinitionParseErrorImpl <em>Definition Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.DefinitionParseErrorImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseError()
		 * @generated
		 */
		EClass DEFINITION_PARSE_ERROR = eINSTANCE.getDefinitionParseError();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.DefinitionParseResultImpl <em>Definition Parse Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.DefinitionParseResultImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionParseResult()
		 * @generated
		 */
		EClass DEFINITION_PARSE_RESULT = eINSTANCE.getDefinitionParseResult();

		/**
		 * The meta object literal for the '<em><b>Definition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT = eINSTANCE.getDefinitionParseResult_DefinitionStatement();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSE_RESULT__ERROR_LIST = eINSTANCE.getDefinitionParseResult_ErrorList();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QDefinitionWriter <em>Definition Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QDefinitionWriter
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriter()
		 * @generated
		 */
		EClass DEFINITION_WRITER = eINSTANCE.getDefinitionWriter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QDefinitionWriterRegistry <em>Definition Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QDefinitionWriterRegistry
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionWriterRegistry()
		 * @generated
		 */
		EClass DEFINITION_WRITER_REGISTRY = eINSTANCE.getDefinitionWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.DefinitionStatementImpl <em>Definition Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.DefinitionStatementImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getDefinitionStatement()
		 * @generated
		 */
		EClass DEFINITION_STATEMENT = eINSTANCE.getDefinitionStatement();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QNameHelper <em>Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QNameHelper
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelper()
		 * @generated
		 */
		EClass NAME_HELPER = eINSTANCE.getNameHelper();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QNameHelperRegistry <em>Name Helper Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QNameHelperRegistry
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getNameHelperRegistry()
		 * @generated
		 */
		EClass NAME_HELPER_REGISTRY = eINSTANCE.getNameHelperRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QQueryWriter <em>Query Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QQueryWriter
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriter()
		 * @generated
		 */
		EClass QUERY_WRITER = eINSTANCE.getQueryWriter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QQueryWriterRegistry <em>Query Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QQueryWriterRegistry
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryWriterRegistry()
		 * @generated
		 */
		EClass QUERY_WRITER_REGISTRY = eINSTANCE.getQueryWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QQueryParser <em>Query Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QQueryParser
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParser()
		 * @generated
		 */
		EClass QUERY_PARSER = eINSTANCE.getQueryParser();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QQueryParserRegistry <em>Query Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QQueryParserRegistry
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getQueryParserRegistry()
		 * @generated
		 */
		EClass QUERY_PARSER_REGISTRY = eINSTANCE.getQueryParserRegistry();

		/**
		 * The meta object literal for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLObjectNameHelper()
		 * @generated
		 */
		EClass SQL_OBJECT_NAME_HELPER = eINSTANCE.getSQLObjectNameHelper();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.impl.StatementWriterImpl <em>Statement Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.impl.StatementWriterImpl
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementWriter()
		 * @generated
		 */
		EClass STATEMENT_WRITER = eINSTANCE.getStatementWriter();

		/**
		 * The meta object literal for the '<em><b>Name Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WRITER__NAME_HELPER = eINSTANCE.getStatementWriter_NameHelper();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.QStatementParser <em>Statement Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.QStatementParser
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementParser()
		 * @generated
		 */
		EClass STATEMENT_PARSER = eINSTANCE.getStatementParser();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.StatementType <em>Statement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.StatementType
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getStatementType()
		 * @generated
		 */
		EEnum STATEMENT_TYPE = eINSTANCE.getStatementType();

		/**
		 * The meta object literal for the '<em>SQL Query Parse Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
		 * @see org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl#getSQLQueryParseResult()
		 * @generated
		 */
		EDataType SQL_QUERY_PARSE_RESULT = eINSTANCE.getSQLQueryParseResult();

	}

} //QDatabaseSyntaxPackage
