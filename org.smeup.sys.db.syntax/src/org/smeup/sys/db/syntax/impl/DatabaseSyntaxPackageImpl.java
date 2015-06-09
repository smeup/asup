/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.impl;

import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.syntax.QBindingParseError;
import org.smeup.sys.db.syntax.QBindingParseResult;
import org.smeup.sys.db.syntax.QBindingParser;
import org.smeup.sys.db.syntax.QBindingParserRegistry;
import org.smeup.sys.db.syntax.QBindingStatement;
import org.smeup.sys.db.syntax.QDatabaseSyntaxFactory;
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;
import org.smeup.sys.db.syntax.QDefinitionParseError;
import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionParser;
import org.smeup.sys.db.syntax.QDefinitionParserRegistry;
import org.smeup.sys.db.syntax.QDefinitionStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.db.syntax.QDefinitionWriterRegistry;
import org.smeup.sys.db.syntax.QNameHelper;
import org.smeup.sys.db.syntax.QNameHelperRegistry;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.db.syntax.QQueryParserRegistry;
import org.smeup.sys.db.syntax.QQueryWriter;
import org.smeup.sys.db.syntax.QQueryWriterRegistry;
import org.smeup.sys.db.syntax.QStatementParser;
import org.smeup.sys.db.syntax.QStatementWriter;
import org.smeup.sys.db.syntax.StatementType;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage;
import org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxPackageImpl extends EPackageImpl implements QDatabaseSyntaxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingParseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingParseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionWriterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameHelperRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryWriterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlObjectNameHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sqlQueryParseResultEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseSyntaxPackageImpl() {
		super(eNS_URI, QDatabaseSyntaxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDatabaseSyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseSyntaxPackage init() {
		if (isInited) return (QDatabaseSyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI);

		// Obtain or create and register package
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseSyntaxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DatabaseSyntaxDDLPackageImpl theDatabaseSyntaxDDLPackage = (DatabaseSyntaxDDLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI) instanceof DatabaseSyntaxDDLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI) : QDatabaseSyntaxDDLPackage.eINSTANCE);
		DatabaseSyntaxDMLPackageImpl theDatabaseSyntaxDMLPackage = (DatabaseSyntaxDMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI) instanceof DatabaseSyntaxDMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI) : QDatabaseSyntaxDMLPackage.eINSTANCE);
		DatabaseSyntaxDBLPackageImpl theDatabaseSyntaxDBLPackage = (DatabaseSyntaxDBLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI) instanceof DatabaseSyntaxDBLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI) : QDatabaseSyntaxDBLPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseSyntaxPackage.createPackageContents();
		theDatabaseSyntaxDDLPackage.createPackageContents();
		theDatabaseSyntaxDMLPackage.createPackageContents();
		theDatabaseSyntaxDBLPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseSyntaxPackage.initializePackageContents();
		theDatabaseSyntaxDDLPackage.initializePackageContents();
		theDatabaseSyntaxDMLPackage.initializePackageContents();
		theDatabaseSyntaxDBLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseSyntaxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseSyntaxPackage.eNS_URI, theDatabaseSyntaxPackage);
		return theDatabaseSyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingParseError() {
		return bindingParseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingParser() {
		return bindingParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingParserRegistry() {
		return bindingParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingParseResult() {
		return bindingParseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingParseResult_BindingStatement() {
		return (EReference)bindingParseResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingParseResult_ErrorList() {
		return (EReference)bindingParseResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingStatement() {
		return bindingStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionParser() {
		return definitionParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionParserRegistry() {
		return definitionParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionParseError() {
		return definitionParseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionParseResult() {
		return definitionParseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionParseResult_DefinitionStatement() {
		return (EReference)definitionParseResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionParseResult_ErrorList() {
		return (EReference)definitionParseResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionWriter() {
		return definitionWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionWriterRegistry() {
		return definitionWriterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionStatement() {
		return definitionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameHelper() {
		return nameHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameHelperRegistry() {
		return nameHelperRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryWriter() {
		return queryWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryWriterRegistry() {
		return queryWriterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParser() {
		return queryParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParserRegistry() {
		return queryParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLObjectNameHelper() {
		return sqlObjectNameHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementWriter() {
		return statementWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementWriter_NameHelper() {
		return (EReference)statementWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementParser() {
		return statementParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatementType() {
		return statementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSQLQueryParseResult() {
		return sqlQueryParseResultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxFactory getDatabaseSyntaxFactory() {
		return (QDatabaseSyntaxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bindingParseErrorEClass = createEClass(BINDING_PARSE_ERROR);

		bindingParserEClass = createEClass(BINDING_PARSER);

		bindingParserRegistryEClass = createEClass(BINDING_PARSER_REGISTRY);

		bindingParseResultEClass = createEClass(BINDING_PARSE_RESULT);
		createEReference(bindingParseResultEClass, BINDING_PARSE_RESULT__BINDING_STATEMENT);
		createEReference(bindingParseResultEClass, BINDING_PARSE_RESULT__ERROR_LIST);

		bindingStatementEClass = createEClass(BINDING_STATEMENT);

		definitionParserEClass = createEClass(DEFINITION_PARSER);

		definitionParserRegistryEClass = createEClass(DEFINITION_PARSER_REGISTRY);

		definitionParseErrorEClass = createEClass(DEFINITION_PARSE_ERROR);

		definitionParseResultEClass = createEClass(DEFINITION_PARSE_RESULT);
		createEReference(definitionParseResultEClass, DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT);
		createEReference(definitionParseResultEClass, DEFINITION_PARSE_RESULT__ERROR_LIST);

		definitionWriterEClass = createEClass(DEFINITION_WRITER);

		definitionWriterRegistryEClass = createEClass(DEFINITION_WRITER_REGISTRY);

		definitionStatementEClass = createEClass(DEFINITION_STATEMENT);

		nameHelperEClass = createEClass(NAME_HELPER);

		nameHelperRegistryEClass = createEClass(NAME_HELPER_REGISTRY);

		queryWriterEClass = createEClass(QUERY_WRITER);

		queryWriterRegistryEClass = createEClass(QUERY_WRITER_REGISTRY);

		queryParserEClass = createEClass(QUERY_PARSER);

		queryParserRegistryEClass = createEClass(QUERY_PARSER_REGISTRY);

		sqlObjectNameHelperEClass = createEClass(SQL_OBJECT_NAME_HELPER);

		statementWriterEClass = createEClass(STATEMENT_WRITER);
		createEReference(statementWriterEClass, STATEMENT_WRITER__NAME_HELPER);

		statementParserEClass = createEClass(STATEMENT_PARSER);

		// Create enums
		statementTypeEEnum = createEEnum(STATEMENT_TYPE);

		// Create data types
		sqlQueryParseResultEDataType = createEDataType(SQL_QUERY_PARSE_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QDatabaseSyntaxDDLPackage theDatabaseSyntaxDDLPackage = (QDatabaseSyntaxDDLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI);
		QDatabaseSyntaxDMLPackage theDatabaseSyntaxDMLPackage = (QDatabaseSyntaxDMLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI);
		QDatabaseSyntaxDBLPackage theDatabaseSyntaxDBLPackage = (QDatabaseSyntaxDBLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI);
		QIntegratedLanguageCoreJavaPackage theIntegratedLanguageCoreJavaPackage = (QIntegratedLanguageCoreJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);
		QDatabaseCorePackage theDatabaseCorePackage = (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);
		SQLTablesPackage theSQLTablesPackage = (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		SQLQueryModelPackage theSQLQueryModelPackage = (SQLQueryModelPackage)EPackage.Registry.INSTANCE.getEPackage(SQLQueryModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatabaseSyntaxDDLPackage);
		getESubpackages().add(theDatabaseSyntaxDMLPackage);
		getESubpackages().add(theDatabaseSyntaxDBLPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bindingParserEClass.getESuperTypes().add(this.getStatementParser());
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getBindingParser());
		g1.getETypeArguments().add(g2);
		bindingParserRegistryEClass.getEGenericSuperTypes().add(g1);
		definitionParserEClass.getESuperTypes().add(this.getStatementParser());
		g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		g2 = createEGenericType(this.getDefinitionParser());
		g1.getETypeArguments().add(g2);
		definitionParserRegistryEClass.getEGenericSuperTypes().add(g1);
		definitionWriterEClass.getESuperTypes().add(this.getStatementWriter());
		g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		g2 = createEGenericType(this.getDefinitionWriter());
		g1.getETypeArguments().add(g2);
		definitionWriterRegistryEClass.getEGenericSuperTypes().add(g1);
		nameHelperEClass.getESuperTypes().add(this.getSQLObjectNameHelper());
		g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		g2 = createEGenericType(this.getNameHelper());
		g1.getETypeArguments().add(g2);
		nameHelperRegistryEClass.getEGenericSuperTypes().add(g1);
		queryWriterEClass.getESuperTypes().add(this.getStatementWriter());
		g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		g2 = createEGenericType(this.getQueryWriter());
		g1.getETypeArguments().add(g2);
		queryWriterRegistryEClass.getEGenericSuperTypes().add(g1);
		queryParserEClass.getESuperTypes().add(this.getStatementParser());
		g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		g2 = createEGenericType(this.getQueryParser());
		g1.getETypeArguments().add(g2);
		queryParserRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(bindingParseErrorEClass, QBindingParseError.class, "BindingParseError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingParserEClass, QBindingParser.class, "BindingParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(bindingParserEClass, this.getBindingParseResult(), "parseBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		op = addEOperation(bindingParserEClass, this.getBindingParseResult(), "parseBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		initEClass(bindingParserRegistryEClass, QBindingParserRegistry.class, "BindingParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bindingParserRegistryEClass, this.getBindingParser(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bindingParseResultEClass, QBindingParseResult.class, "BindingParseResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingParseResult_BindingStatement(), this.getBindingStatement(), null, "bindingStatement", null, 0, 1, QBindingParseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingParseResult_ErrorList(), this.getBindingParseError(), null, "errorList", null, 0, -1, QBindingParseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingStatementEClass, QBindingStatement.class, "BindingStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bindingStatementEClass, this.getStatementType(), "getStatementType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionParserEClass, QDefinitionParser.class, "DefinitionParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionParserEClass, this.getDefinitionParseResult(), "parseDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		op = addEOperation(definitionParserEClass, this.getDefinitionParseResult(), "parseDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		initEClass(definitionParserRegistryEClass, QDefinitionParserRegistry.class, "DefinitionParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionParserRegistryEClass, this.getDefinitionParser(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionParseErrorEClass, QDefinitionParseError.class, "DefinitionParseError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionParseResultEClass, QDefinitionParseResult.class, "DefinitionParseResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionParseResult_DefinitionStatement(), this.getDefinitionStatement(), null, "definitionStatement", null, 0, 1, QDefinitionParseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionParseResult_ErrorList(), this.getDefinitionParseError(), null, "errorList", null, 0, -1, QDefinitionParseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionWriterEClass, QDefinitionWriter.class, "DefinitionWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getSchemaDef(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getViewDef(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getIndexDef(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "ignoreFailOnNonEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "deleteData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "insertData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "selectData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionWriterRegistryEClass, QDefinitionWriterRegistry.class, "DefinitionWriterRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionWriterRegistryEClass, this.getDefinitionWriter(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionStatementEClass, QDefinitionStatement.class, "DefinitionStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(definitionStatementEClass, this.getStatementType(), "getStatementType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameHelperEClass, QNameHelper.class, "NameHelper", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(nameHelperEClass, null, "resolveContainers", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLQueryModelPackage.getQueryStatement(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameHelperRegistryEClass, QNameHelperRegistry.class, "NameHelperRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(nameHelperRegistryEClass, this.getNameHelper(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryWriterEClass, QQueryWriter.class, "QueryWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryWriterEClass, ecorePackage.getEString(), "writeQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLQueryModelPackage.getQueryStatement(), "statement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryWriterRegistryEClass, QQueryWriterRegistry.class, "QueryWriterRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryWriterRegistryEClass, this.getQueryWriter(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryParserEClass, QQueryParser.class, "QueryParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryParserEClass, this.getSQLQueryParseResult(), "parseQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		op = addEOperation(queryParserEClass, this.getSQLQueryParseResult(), "parseQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabaseCorePackage.getDatabaseException());

		initEClass(queryParserRegistryEClass, QQueryParserRegistry.class, "QueryParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryParserRegistryEClass, this.getQueryParser(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseCorePackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sqlObjectNameHelperEClass, ISQLObjectNameHelper.class, "SQLObjectNameHelper", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementWriterEClass, QStatementWriter.class, "StatementWriter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementWriter_NameHelper(), this.getNameHelper(), null, "nameHelper", null, 0, 1, QStatementWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementParserEClass, QStatementParser.class, "StatementParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(statementTypeEEnum, StatementType.class, "StatementType");
		addEEnumLiteral(statementTypeEEnum, StatementType.DML);
		addEEnumLiteral(statementTypeEEnum, StatementType.DDL);
		addEEnumLiteral(statementTypeEEnum, StatementType.DBL);

		// Initialize data types
		initEDataType(sqlQueryParseResultEDataType, SQLQueryParseResult.class, "SQLQueryParseResult", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabaseSyntaxPackageImpl
