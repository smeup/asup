/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;

import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;

import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;

import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;

import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;

import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;

import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;

import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osgi.service.jdbc.DataSourceFactory;

import org.smeup.sys.db.core.DatabaseCoreException;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QCatalogGenerationStrategy;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.db.core.QConnectionDescription;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.core.QDatabaseCoreFactory;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QDatabaseObjectDef;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;

import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;

import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseCorePackageImpl extends EPackageImpl implements QDatabaseCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogGenerationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseObjectDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexColumnDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseResultSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statementBatchResultEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseCoreExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseCoreRuntimeExceptionEDataType = null;

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
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseCorePackageImpl() {
		super(eNS_URI, QDatabaseCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDatabaseCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseCorePackage init() {
		if (isInited) return (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);

		// Obtain or create and register package
		DatabaseCorePackageImpl theDatabaseCorePackage = (DatabaseCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		SQLSchemaPackage.eINSTANCE.eClass();
		SQLConstraintsPackage.eINSTANCE.eClass();
		SQLDataTypesPackage.eINSTANCE.eClass();
		SQLExpressionsPackage.eINSTANCE.eClass();
		SQLRoutinesPackage.eINSTANCE.eClass();
		SQLStatementsPackage.eINSTANCE.eClass();
		SQLTablesPackage.eINSTANCE.eClass();
		SQLAccessControlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatabaseCorePackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseCorePackage.eNS_URI, theDatabaseCorePackage);
		return theDatabaseCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogContainer() {
		return catalogContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogContainer_Name() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogContainer_Active() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogContainer_ConnectionConfig() {
		return (EReference)catalogContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogContainer_SupportsGuestAccess() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogContainer_GenerationStrategy() {
		return (EReference)catalogContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogGenerationStrategy() {
		return catalogGenerationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogGenerationStrategy_CreateIndexOnView() {
		return (EAttribute)catalogGenerationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogGenerationStrategy_CreateRelativeRecordNumber() {
		return (EAttribute)catalogGenerationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogMetaData() {
		return catalogMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionConfig() {
		return connectionConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionConfig_Credentials() {
		return (EReference)connectionConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Vendor() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Version() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Url() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Catalog() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionConfig_Persistent() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionCredentials() {
		return connectionCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionDescription() {
		return connectionDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionDescription_Schemas() {
		return (EAttribute)connectionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseContainer() {
		return databaseContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContainer_CatalogContainers() {
		return (EReference)databaseContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContainer_DefaultCatalogContainer() {
		return (EReference)databaseContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseContainer_Vendor() {
		return (EAttribute)databaseContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseContainer_Version() {
		return (EAttribute)databaseContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseObjectDef() {
		return databaseObjectDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseObjectDef_Label() {
		return (EAttribute)databaseObjectDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseManager() {
		return databaseManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceFactory() {
		return dataSourceFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexDef() {
		return indexDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexDef_Clustered() {
		return (EAttribute)indexDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexDef_Columns() {
		return (EReference)indexDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexDef_Unique() {
		return (EAttribute)indexDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexColumnDef() {
		return indexColumnDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumnDef_Name() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumnDef_Ordering() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexColumnDef_Sequence() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreparedStatement() {
		return preparedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedName() {
		return qualifiedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedName_Qualifiers() {
		return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaDef() {
		return schemaDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableDef() {
		return tableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableDef_Columns() {
		return (EReference)tableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumnDef() {
		return tableColumnDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Default() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableColumnDef_Definition() {
		return (EReference)tableColumnDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Name() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumnDef_Nullable() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewDef() {
		return viewDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDef_QuerySelect() {
		return (EAttribute)viewDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderingType() {
		return orderingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatabaseException() {
		return databaseExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatabaseResultSet() {
		return databaseResultSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatementBatchResult() {
		return statementBatchResultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatabaseCoreException() {
		return databaseCoreExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatabaseCoreRuntimeException() {
		return databaseCoreRuntimeExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseCoreFactory getDatabaseCoreFactory() {
		return (QDatabaseCoreFactory)getEFactoryInstance();
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
		catalogContainerEClass = createEClass(CATALOG_CONTAINER);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__NAME);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__ACTIVE);
		createEReference(catalogContainerEClass, CATALOG_CONTAINER__CONNECTION_CONFIG);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS);
		createEReference(catalogContainerEClass, CATALOG_CONTAINER__GENERATION_STRATEGY);

		catalogGenerationStrategyEClass = createEClass(CATALOG_GENERATION_STRATEGY);
		createEAttribute(catalogGenerationStrategyEClass, CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW);
		createEAttribute(catalogGenerationStrategyEClass, CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER);

		catalogMetaDataEClass = createEClass(CATALOG_META_DATA);

		connectionEClass = createEClass(CONNECTION);

		connectionConfigEClass = createEClass(CONNECTION_CONFIG);
		createEReference(connectionConfigEClass, CONNECTION_CONFIG__CREDENTIALS);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__VENDOR);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__VERSION);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__URL);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__CATALOG);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__PERSISTENT);

		connectionCredentialsEClass = createEClass(CONNECTION_CREDENTIALS);

		connectionDescriptionEClass = createEClass(CONNECTION_DESCRIPTION);
		createEAttribute(connectionDescriptionEClass, CONNECTION_DESCRIPTION__SCHEMAS);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);

		databaseContainerEClass = createEClass(DATABASE_CONTAINER);
		createEReference(databaseContainerEClass, DATABASE_CONTAINER__CATALOG_CONTAINERS);
		createEReference(databaseContainerEClass, DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER);
		createEAttribute(databaseContainerEClass, DATABASE_CONTAINER__VENDOR);
		createEAttribute(databaseContainerEClass, DATABASE_CONTAINER__VERSION);

		databaseObjectDefEClass = createEClass(DATABASE_OBJECT_DEF);
		createEAttribute(databaseObjectDefEClass, DATABASE_OBJECT_DEF__LABEL);

		databaseManagerEClass = createEClass(DATABASE_MANAGER);

		dataSourceFactoryEClass = createEClass(DATA_SOURCE_FACTORY);

		indexDefEClass = createEClass(INDEX_DEF);
		createEAttribute(indexDefEClass, INDEX_DEF__CLUSTERED);
		createEReference(indexDefEClass, INDEX_DEF__COLUMNS);
		createEAttribute(indexDefEClass, INDEX_DEF__UNIQUE);

		indexColumnDefEClass = createEClass(INDEX_COLUMN_DEF);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__NAME);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__ORDERING);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__SEQUENCE);

		preparedStatementEClass = createEClass(PREPARED_STATEMENT);

		qualifiedNameEClass = createEClass(QUALIFIED_NAME);
		createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__QUALIFIERS);

		schemaDefEClass = createEClass(SCHEMA_DEF);

		statementEClass = createEClass(STATEMENT);

		tableDefEClass = createEClass(TABLE_DEF);
		createEReference(tableDefEClass, TABLE_DEF__COLUMNS);

		tableColumnDefEClass = createEClass(TABLE_COLUMN_DEF);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__DEFAULT);
		createEReference(tableColumnDefEClass, TABLE_COLUMN_DEF__DEFINITION);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__NAME);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__NULLABLE);

		viewDefEClass = createEClass(VIEW_DEF);
		createEAttribute(viewDefEClass, VIEW_DEF__QUERY_SELECT);

		// Create enums
		orderingTypeEEnum = createEEnum(ORDERING_TYPE);

		// Create data types
		databaseExceptionEDataType = createEDataType(DATABASE_EXCEPTION);
		databaseResultSetEDataType = createEDataType(DATABASE_RESULT_SET);
		statementBatchResultEDataType = createEDataType(STATEMENT_BATCH_RESULT);
		databaseCoreExceptionEDataType = createEDataType(DATABASE_CORE_EXCEPTION);
		databaseCoreRuntimeExceptionEDataType = createEDataType(DATABASE_CORE_RUNTIME_EXCEPTION);
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
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		SQLTablesPackage theSQLTablesPackage = (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		QIntegratedLanguageCoreJavaPackage theIntegratedLanguageCoreJavaPackage = (QIntegratedLanguageCoreJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);
		QIntegratedLanguageDataDefPackage theIntegratedLanguageDataDefPackage = (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		connectionCredentialsEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getCredentials());
		databaseContainerEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		indexDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		indexColumnDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		preparedStatementEClass.getESuperTypes().add(this.getStatement());
		schemaDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		statementEClass.getESuperTypes().add(theIntegratedLanguageCoreJavaPackage.getJavaCloseable());
		tableDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		tableColumnDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		viewDefEClass.getESuperTypes().add(this.getTableDef());

		// Initialize classes and features; add operations and parameters
		initEClass(catalogContainerEClass, QCatalogContainer.class, "CatalogContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogContainer_Active(), ecorePackage.getEBoolean(), "active", "true", 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogContainer_ConnectionConfig(), this.getConnectionConfig(), null, "connectionConfig", null, 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogContainer_SupportsGuestAccess(), ecorePackage.getEBoolean(), "supportsGuestAccess", "false", 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogContainer_GenerationStrategy(), this.getCatalogGenerationStrategy(), null, "generationStrategy", null, 1, 1, QCatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(catalogContainerEClass, null, "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "C");
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(catalogContainerEClass, null, "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "C");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		addEOperation(catalogContainerEClass, this.getCatalogMetaData(), "getMetaData", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(catalogContainerEClass, theIntegratedLanguageCoreCtxPackage.getContext(), "getCatalogContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLConstraintsPackage.getIndex(), "loadIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLSchemaPackage.getSchema(), "loadSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLTablesPackage.getTable(), "loadTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLTablesPackage.getViewTable(), "loadView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(catalogGenerationStrategyEClass, QCatalogGenerationStrategy.class, "CatalogGenerationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogGenerationStrategy_CreateIndexOnView(), ecorePackage.getEBoolean(), "createIndexOnView", "false", 1, 1, QCatalogGenerationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogGenerationStrategy_CreateRelativeRecordNumber(), ecorePackage.getEBoolean(), "createRelativeRecordNumber", "false", 1, 1, QCatalogGenerationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogMetaDataEClass, QCatalogMetaData.class, "CatalogMetaData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(catalogMetaDataEClass, theSQLConstraintsPackage.getIndex(), "getIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLSchemaPackage.getSchema(), "getSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(catalogMetaDataEClass, theSQLSchemaPackage.getSchema(), "getSchemas", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getTable(), "getTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getTable(), "getTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectionDescription(), "connectionDescription", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getViewTable(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionEClass, QConnection.class, "Connection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatement(), "stmt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatabaseResultSet(), "rs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "updatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, ecorePackage.getEString(), "getCatalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		addEOperation(connectionEClass, this.getCatalogGenerationStrategy(), "getCatalogGenerationStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectionEClass, this.getCatalogMetaData(), "getCatalogMetaData", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectionEClass, this.getConnectionDescription(), "getConnectionDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "updatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, null, "setCatalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionEClass, ecorePackage.getEString(), "translate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		initEClass(connectionConfigEClass, QConnectionConfig.class, "ConnectionConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionConfig_Credentials(), this.getConnectionCredentials(), null, "credentials", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Vendor(), ecorePackage.getEString(), "vendor", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Version(), ecorePackage.getEString(), "version", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Url(), ecorePackage.getEString(), "url", null, 1, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, QConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionCredentialsEClass, QConnectionCredentials.class, "ConnectionCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionDescriptionEClass, QConnectionDescription.class, "ConnectionDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionDescription_Schemas(), ecorePackage.getEString(), "schemas", null, 0, -1, QConnectionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionManagerEClass, QConnectionManager.class, "ConnectionManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		initEClass(databaseContainerEClass, QDatabaseContainer.class, "DatabaseContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseContainer_CatalogContainers(), this.getCatalogContainer(), null, "catalogContainers", null, 1, -1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseContainer_DefaultCatalogContainer(), this.getCatalogContainer(), null, "defaultCatalogContainer", null, 1, 1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseContainer_Vendor(), ecorePackage.getEString(), "vendor", null, 1, 1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseContainer_Version(), ecorePackage.getEString(), "version", null, 1, 1, QDatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseObjectDefEClass, QDatabaseObjectDef.class, "DatabaseObjectDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseObjectDef_Label(), ecorePackage.getEString(), "label", null, 0, 1, QDatabaseObjectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseManagerEClass, QDatabaseManager.class, "DatabaseManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(databaseManagerEClass, theSQLConstraintsPackage.getIndex(), "createIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndexDef(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, theSQLSchemaPackage.getSchema(), "createSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchemaDef(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, theSQLTablesPackage.getTable(), "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, theSQLTablesPackage.getViewTable(), "createView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getViewDef(), "view", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "ignoreFailOnNonEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, ecorePackage.getEBoolean(), "hasLogicals", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		addEOperation(databaseManagerEClass, ecorePackage.getEBoolean(), "isStarted", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(databaseManagerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSourceFactoryEClass, DataSourceFactory.class, "DataSourceFactory", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexDefEClass, QIndexDef.class, "IndexDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexDef_Clustered(), ecorePackage.getEBoolean(), "clustered", null, 0, 1, QIndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexDef_Columns(), this.getIndexColumnDef(), null, "columns", null, 0, -1, QIndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexDef_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, QIndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexColumnDefEClass, QIndexColumnDef.class, "IndexColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexColumnDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, QIndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumnDef_Ordering(), this.getOrderingType(), "ordering", null, 1, 1, QIndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumnDef_Sequence(), ecorePackage.getEInt(), "sequence", null, 1, 1, QIndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preparedStatementEClass, QPreparedStatement.class, "PreparedStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(preparedStatementEClass, null, "addBatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "clearParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, ecorePackage.getEBoolean(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, this.getDatabaseResultSet(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, ecorePackage.getEInt(), "executeUpdate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		initEClass(qualifiedNameEClass, QQualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedName_Qualifiers(), theEcorePackage.getEString(), "qualifiers", null, 1, 3, QQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(qualifiedNameEClass, theEcorePackage.getEString(), "getFirstQualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(qualifiedNameEClass, theEcorePackage.getEString(), "getLastQualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(schemaDefEClass, QSchemaDef.class, "SchemaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, QStatement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(statementEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementEClass, ecorePackage.getEBoolean(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, this.getDatabaseResultSet(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, ecorePackage.getEInt(), "executeUpdate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, null, "addBatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, null, "clearBatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(statementEClass, this.getStatementBatchResult(), "executeBatch", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		initEClass(tableDefEClass, QTableDef.class, "TableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableDef_Columns(), this.getTableColumnDef(), null, "columns", null, 0, -1, QTableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnDefEClass, QTableColumnDef.class, "TableColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumnDef_Default(), theEcorePackage.getEBoolean(), "default", null, 0, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getTableColumnDef_Definition(), g1, null, "definition", null, 1, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, QTableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewDefEClass, QViewDef.class, "ViewDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDef_QuerySelect(), ecorePackage.getEString(), "querySelect", null, 0, 1, QViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderingTypeEEnum, OrderingType.class, "OrderingType");
		addEEnumLiteral(orderingTypeEEnum, OrderingType.ASCEND);
		addEEnumLiteral(orderingTypeEEnum, OrderingType.DESCEND);

		// Initialize data types
		initEDataType(databaseExceptionEDataType, SQLException.class, "DatabaseException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(databaseResultSetEDataType, ResultSet.class, "DatabaseResultSet", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statementBatchResultEDataType, int[].class, "StatementBatchResult", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(databaseCoreExceptionEDataType, DatabaseCoreException.class, "DatabaseCoreException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(databaseCoreRuntimeExceptionEDataType, DatabaseCoreRuntimeException.class, "DatabaseCoreRuntimeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabaseCorePackageImpl
