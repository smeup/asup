/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.core.QDatabaseCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/db/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDatabaseCorePackage eINSTANCE = org.smeup.sys.db.core.impl.DatabaseCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.CatalogContainerImpl <em>Catalog Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.CatalogContainerImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getCatalogContainer()
	 * @generated
	 */
	int CATALOG_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Connection Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__CONNECTION_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Supports Guest Access</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Generation Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__GENERATION_STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Catalog Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.CatalogGenerationStrategyImpl <em>Catalog Generation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.CatalogGenerationStrategyImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getCatalogGenerationStrategy()
	 * @generated
	 */
	int CATALOG_GENERATION_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Create Index On View</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Create Relative Record Number</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Catalog Generation Strategy</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.CatalogMetaDataImpl <em>Catalog Meta Data</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.CatalogMetaDataImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getCatalogMetaData()
	 * @generated
	 */
	int CATALOG_META_DATA = 2;

	/**
	 * The number of structural features of the '<em>Catalog Meta Data</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_META_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.QConnection
	 * <em>Connection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.db.core.QConnection
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.CONTEXT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.ConnectionConfigImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnectionConfig()
	 * @generated
	 */
	int CONNECTION_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__CREDENTIALS = 0;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VENDOR = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__URL = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PERSISTENT = 5;

	/**
	 * The number of structural features of the '<em>Connection Config</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.ConnectionCredentialsImpl <em>Connection Credentials</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.ConnectionCredentialsImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnectionCredentials()
	 * @generated
	 */
	int CONNECTION_CREDENTIALS = 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__USER = QRuntimeAuthenticationPackage.AUTHENTICATION_USER_PASSWORD__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__PASSWORD = QRuntimeAuthenticationPackage.AUTHENTICATION_USER_PASSWORD__PASSWORD;

	/**
	 * The number of structural features of the '<em>Connection Credentials</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS_FEATURE_COUNT = QRuntimeAuthenticationPackage.AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.ConnectionManagerImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.DatabaseContainerImpl <em>Database Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.DatabaseContainerImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseContainer()
	 * @generated
	 */
	int DATABASE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Catalog Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__CATALOG_CONTAINERS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Catalog Container</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__VENDOR = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__VERSION = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.DatabaseObjectDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseObjectDef()
	 * @generated
	 */
	int DATABASE_OBJECT_DEF = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_DEF__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Database Object Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_DEF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.QDatabaseManager <em>Database Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.QDatabaseManager
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
	 * @generated
	 */
	int DATABASE_MANAGER = 9;

	/**
	 * The number of structural features of the '<em>Database Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osgi.service.jdbc.DataSourceFactory <em>Data Source Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.osgi.service.jdbc.DataSourceFactory
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDataSourceFactory()
	 * @generated
	 */
	int DATA_SOURCE_FACTORY = 10;

	/**
	 * The number of structural features of the '<em>Data Source Factory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.IndexDefImpl <em>Index Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.IndexDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getIndexDef()
	 * @generated
	 */
	int INDEX_DEF = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Clustered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__CLUSTERED = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__UNIQUE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.IndexColumnDefImpl <em>Index Column Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.IndexColumnDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getIndexColumnDef()
	 * @generated
	 */
	int INDEX_COLUMN_DEF = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__ORDERING = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__SEQUENCE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Column Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.QPreparedStatement <em>Prepared Statement</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.QPreparedStatement
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getPreparedStatement()
	 * @generated
	 */
	int PREPARED_STATEMENT = 13;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.QualifiedNameImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.SchemaDefImpl
	 * <em>Schema Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.db.core.impl.SchemaDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getSchemaDef()
	 * @generated
	 */
	int SCHEMA_DEF = 15;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.QStatement <em>Statement</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.QStatement
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 16;

	/**
	 * The number of structural features of the '<em>Statement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = QMachineInterfaceCorePackage.JAVA_CLOSEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prepared Statement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__QUALIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Qualified Name</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The number of structural features of the '<em>Schema Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.TableDefImpl <em>Table Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.TableDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getTableDef()
	 * @generated
	 */
	int TABLE_DEF = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.TableColumnDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getTableColumnDef()
	 * @generated
	 */
	int TABLE_COLUMN_DEF = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DEFAULT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DEFINITION = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NULLABLE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table Column Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.QTableProvider <em>Table Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.QTableProvider
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getTableProvider()
	 * @generated
	 */
	int TABLE_PROVIDER = 19;

	/**
	 * The number of structural features of the '<em>Table Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.impl.ViewDefImpl <em>View Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.ViewDefImpl
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getViewDef()
	 * @generated
	 */
	int VIEW_DEF = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__LABEL = TABLE_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__COLUMNS = TABLE_DEF__COLUMNS;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__QUERY_SELECT = TABLE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF_FEATURE_COUNT = TABLE_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.core.OrderingType
	 * <em>Ordering Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.db.core.OrderingType
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 21;

	/**
	 * The meta object id for the '<em>Database Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.sql.SQLException
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseException()
	 * @generated
	 */
	int DATABASE_EXCEPTION = 22;

	/**
	 * The meta object id for the '<em>Database Result Set</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.sql.ResultSet
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSet()
	 * @generated
	 */
	int DATABASE_RESULT_SET = 25;

	/**
	 * The meta object id for the '<em>Database Result Set Meta Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.ResultSetMetaData
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSetMetaData()
	 * @generated
	 */
	int DATABASE_RESULT_SET_META_DATA = 26;

	/**
	 * The meta object id for the '<em>Statement Batch Result</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getStatementBatchResult()
	 * @generated
	 */
	int STATEMENT_BATCH_RESULT = 27;

	/**
	 * The meta object id for the '<em>Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.db.core.DatabaseCoreException
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseCoreException()
	 * @generated
	 */
	int DATABASE_CORE_EXCEPTION = 23;

	/**
	 * The meta object id for the '<em>Runtime Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.db.core.DatabaseCoreRuntimeException
	 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseCoreRuntimeException()
	 * @generated
	 */
	int DATABASE_CORE_RUNTIME_EXCEPTION = 24;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QCatalogContainer <em>Catalog Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Container</em>'.
	 * @see org.smeup.sys.db.core.QCatalogContainer
	 * @generated
	 */
	EClass getCatalogContainer();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.db.core.QCatalogContainer#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.db.core.QCatalogContainer#getName()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QCatalogContainer#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.smeup.sys.db.core.QCatalogContainer#isActive()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_Active();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.db.core.QCatalogContainer#getConnectionConfig
	 * <em>Connection Config</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Connection Config</em>'.
	 * @see org.smeup.sys.db.core.QCatalogContainer#getConnectionConfig()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EReference getCatalogContainer_ConnectionConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QCatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Guest Access</em>'.
	 * @see org.smeup.sys.db.core.QCatalogContainer#isSupportsGuestAccess()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_SupportsGuestAccess();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.db.core.QCatalogContainer#getGenerationStrategy
	 * <em>Generation Strategy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Generation Strategy</em>'.
	 * @see org.smeup.sys.db.core.QCatalogContainer#getGenerationStrategy()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EReference getCatalogContainer_GenerationStrategy();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QCatalogGenerationStrategy <em>Catalog Generation Strategy</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Catalog Generation Strategy</em>'.
	 * @see org.smeup.sys.db.core.QCatalogGenerationStrategy
	 * @generated
	 */
	EClass getCatalogGenerationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QCatalogGenerationStrategy#isCreateIndexOnView <em>Create Index On View</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Index On View</em>'.
	 * @see org.smeup.sys.db.core.QCatalogGenerationStrategy#isCreateIndexOnView()
	 * @see #getCatalogGenerationStrategy()
	 * @generated
	 */
	EAttribute getCatalogGenerationStrategy_CreateIndexOnView();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QCatalogGenerationStrategy#isCreateRelativeRecordNumber <em>Create Relative Record Number</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Relative Record Number</em>'.
	 * @see org.smeup.sys.db.core.QCatalogGenerationStrategy#isCreateRelativeRecordNumber()
	 * @see #getCatalogGenerationStrategy()
	 * @generated
	 */
	EAttribute getCatalogGenerationStrategy_CreateRelativeRecordNumber();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QCatalogMetaData <em>Catalog Meta Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Meta Data</em>'.
	 * @see org.smeup.sys.db.core.QCatalogMetaData
	 * @generated
	 */
	EClass getCatalogMetaData();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.smeup.sys.db.core.QConnection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QConnectionConfig <em>Connection Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Config</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig
	 * @generated
	 */
	EClass getConnectionConfig();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.db.core.QConnectionConfig#getUrl <em>Url</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig#getUrl()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QConnectionConfig#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig#getCatalog()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QConnectionConfig#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig#isPersistent()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QConnectionConfig#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig#getVendor()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QConnectionConfig#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig#getVersion()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.core.QConnectionConfig#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see org.smeup.sys.db.core.QConnectionConfig#getCredentials()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EReference getConnectionConfig_Credentials();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QConnectionCredentials <em>Connection Credentials</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Connection Credentials</em>'.
	 * @see org.smeup.sys.db.core.QConnectionCredentials
	 * @generated
	 */
	EClass getConnectionCredentials();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see org.smeup.sys.db.core.QConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QDatabaseContainer <em>Database Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Container</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseContainer
	 * @generated
	 */
	EClass getDatabaseContainer();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.smeup.sys.db.core.QDatabaseContainer#getCatalogContainers
	 * <em>Catalog Containers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Catalog Containers</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseContainer#getCatalogContainers()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EReference getDatabaseContainer_CatalogContainers();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QDatabaseContainer#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseContainer#getVendor()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EAttribute getDatabaseContainer_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QDatabaseContainer#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseContainer#getVersion()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EAttribute getDatabaseContainer_Version();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.db.core.QDatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the reference '<em>Default Catalog Container</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseContainer#getDefaultCatalogContainer()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EReference getDatabaseContainer_DefaultCatalogContainer();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QDatabaseObjectDef <em>Database Object Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Object Def</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseObjectDef
	 * @generated
	 */
	EClass getDatabaseObjectDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QDatabaseObjectDef#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseObjectDef#getLabel()
	 * @see #getDatabaseObjectDef()
	 * @generated
	 */
	EAttribute getDatabaseObjectDef_Label();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QDatabaseManager <em>Database Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Manager</em>'.
	 * @see org.smeup.sys.db.core.QDatabaseManager
	 * @generated
	 */
	EClass getDatabaseManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.osgi.service.jdbc.DataSourceFactory
	 * <em>Data Source Factory</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Data Source Factory</em>'.
	 * @see org.osgi.service.jdbc.DataSourceFactory
	 * @model instanceClass="org.osgi.service.jdbc.DataSourceFactory"
	 * @generated
	 */
	EClass getDataSourceFactory();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QIndexDef <em>Index Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Def</em>'.
	 * @see org.smeup.sys.db.core.QIndexDef
	 * @generated
	 */
	EClass getIndexDef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.db.core.QIndexDef#isClustered <em>Clustered</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Clustered</em>'.
	 * @see org.smeup.sys.db.core.QIndexDef#isClustered()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Clustered();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.smeup.sys.db.core.QIndexDef#getColumns <em>Columns</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Columns</em>'.
	 * @see org.smeup.sys.db.core.QIndexDef#getColumns()
	 * @see #getIndexDef()
	 * @generated
	 */
	EReference getIndexDef_Columns();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.db.core.QIndexDef#isUnique <em>Unique</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.smeup.sys.db.core.QIndexDef#isUnique()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Unique();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.db.core.QIndexColumnDef <em>Index Column Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Index Column Def</em>'.
	 * @see org.smeup.sys.db.core.QIndexColumnDef
	 * @generated
	 */
	EClass getIndexColumnDef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.db.core.QIndexColumnDef#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.db.core.QIndexColumnDef#getName()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QIndexColumnDef#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.smeup.sys.db.core.QIndexColumnDef#getOrdering()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QIndexColumnDef#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.smeup.sys.db.core.QIndexColumnDef#getSequence()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Sequence();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QPreparedStatement <em>Prepared Statement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepared Statement</em>'.
	 * @see org.smeup.sys.db.core.QPreparedStatement
	 * @generated
	 */
	EClass getPreparedStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.db.core.QQualifiedName <em>Qualified Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Qualified Name</em>'.
	 * @see org.smeup.sys.db.core.QQualifiedName
	 * @generated
	 */
	EClass getQualifiedName();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.core.QQualifiedName#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifiers</em>'.
	 * @see org.smeup.sys.db.core.QQualifiedName#getQualifiers()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EAttribute getQualifiedName_Qualifiers();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QSchemaDef <em>Schema Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Def</em>'.
	 * @see org.smeup.sys.db.core.QSchemaDef
	 * @generated
	 */
	EClass getSchemaDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.smeup.sys.db.core.QStatement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QTableDef <em>Table Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Def</em>'.
	 * @see org.smeup.sys.db.core.QTableDef
	 * @generated
	 */
	EClass getTableDef();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.smeup.sys.db.core.QTableDef#getColumns <em>Columns</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Columns</em>'.
	 * @see org.smeup.sys.db.core.QTableDef#getColumns()
	 * @see #getTableDef()
	 * @generated
	 */
	EReference getTableDef_Columns();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.db.core.QTableColumnDef <em>Table Column Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Table Column Def</em>'.
	 * @see org.smeup.sys.db.core.QTableColumnDef
	 * @generated
	 */
	EClass getTableColumnDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QTableColumnDef#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.smeup.sys.db.core.QTableColumnDef#isDefault()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Default();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.core.QTableColumnDef#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.smeup.sys.db.core.QTableColumnDef#getDefinition()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EReference getTableColumnDef_Definition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.db.core.QTableColumnDef#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.db.core.QTableColumnDef#getName()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QTableColumnDef#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.smeup.sys.db.core.QTableColumnDef#isNullable()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Nullable();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QTableProvider <em>Table Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Provider</em>'.
	 * @see org.smeup.sys.db.core.QTableProvider
	 * @generated
	 */
	EClass getTableProvider();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.core.QViewDef <em>View Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Def</em>'.
	 * @see org.smeup.sys.db.core.QViewDef
	 * @generated
	 */
	EClass getViewDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.core.QViewDef#getQuerySelect <em>Query Select</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Select</em>'.
	 * @see org.smeup.sys.db.core.QViewDef#getQuerySelect()
	 * @see #getViewDef()
	 * @generated
	 */
	EAttribute getViewDef_QuerySelect();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.core.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ordering Type</em>'.
	 * @see org.smeup.sys.db.core.OrderingType
	 * @generated
	 */
	EEnum getOrderingType();

	/**
	 * Returns the meta object for data type '{@link java.sql.SQLException
	 * <em>Database Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Database Exception</em>'.
	 * @see java.sql.SQLException
	 * @model instanceClass="java.sql.SQLException" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseException();

	/**
	 * Returns the meta object for data type '{@link java.sql.ResultSet
	 * <em>Database Result Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Database Result Set</em>'.
	 * @see java.sql.ResultSet
	 * @model instanceClass="java.sql.ResultSet" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseResultSet();

	/**
	 * Returns the meta object for data type '{@link java.sql.ResultSetMetaData <em>Database Result Set Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Database Result Set Meta Data</em>'.
	 * @see java.sql.ResultSetMetaData
	 * @model instanceClass="java.sql.ResultSetMetaData" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseResultSetMetaData();

	/**
	 * Returns the meta object for data type '<em>Statement Batch Result</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Statement Batch Result</em>'.
	 * @model instanceClass="int[]" serializeable="false"
	 * @generated
	 */
	EDataType getStatementBatchResult();

	/**
	 * Returns the meta object for data type '
	 * {@link org.smeup.sys.db.core.DatabaseCoreException <em>Exception</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.smeup.sys.db.core.DatabaseCoreException
	 * @model instanceClass="org.smeup.sys.db.core.DatabaseCoreException"
	 * @generated
	 */
	EDataType getDatabaseCoreException();

	/**
	 * Returns the meta object for data type '
	 * {@link org.smeup.sys.db.core.DatabaseCoreRuntimeException
	 * <em>Runtime Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Runtime Exception</em>'.
	 * @see org.smeup.sys.db.core.DatabaseCoreRuntimeException
	 * @model instanceClass="org.smeup.sys.db.core.DatabaseCoreRuntimeException"
	 * @generated
	 */
	EDataType getDatabaseCoreRuntimeException();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseCoreFactory getDatabaseCoreFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.CatalogContainerImpl <em>Catalog Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.CatalogContainerImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getCatalogContainer()
		 * @generated
		 */
		EClass CATALOG_CONTAINER = eINSTANCE.getCatalogContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__NAME = eINSTANCE.getCatalogContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__ACTIVE = eINSTANCE.getCatalogContainer_Active();

		/**
		 * The meta object literal for the '<em><b>Connection Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTAINER__CONNECTION_CONFIG = eINSTANCE.getCatalogContainer_ConnectionConfig();

		/**
		 * The meta object literal for the '
		 * <em><b>Supports Guest Access</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS = eINSTANCE.getCatalogContainer_SupportsGuestAccess();

		/**
		 * The meta object literal for the '<em><b>Generation Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTAINER__GENERATION_STRATEGY = eINSTANCE.getCatalogContainer_GenerationStrategy();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.CatalogGenerationStrategyImpl <em>Catalog Generation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.CatalogGenerationStrategyImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getCatalogGenerationStrategy()
		 * @generated
		 */
		EClass CATALOG_GENERATION_STRATEGY = eINSTANCE.getCatalogGenerationStrategy();

		/**
		 * The meta object literal for the '<em><b>Create Index On View</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW = eINSTANCE.getCatalogGenerationStrategy_CreateIndexOnView();

		/**
		 * The meta object literal for the '<em><b>Create Relative Record Number</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER = eINSTANCE.getCatalogGenerationStrategy_CreateRelativeRecordNumber();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.CatalogMetaDataImpl <em>Catalog Meta Data</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.CatalogMetaDataImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getCatalogMetaData()
		 * @generated
		 */
		EClass CATALOG_META_DATA = eINSTANCE.getCatalogMetaData();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.QConnection <em>Connection</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.QConnection
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.ConnectionConfigImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnectionConfig()
		 * @generated
		 */
		EClass CONNECTION_CONFIG = eINSTANCE.getConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__URL = eINSTANCE.getConnectionConfig_Url();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__CATALOG = eINSTANCE.getConnectionConfig_Catalog();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PERSISTENT = eINSTANCE.getConnectionConfig_Persistent();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VENDOR = eINSTANCE.getConnectionConfig_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VERSION = eINSTANCE.getConnectionConfig_Version();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONFIG__CREDENTIALS = eINSTANCE.getConnectionConfig_Credentials();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.ConnectionCredentialsImpl <em>Connection Credentials</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.ConnectionCredentialsImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnectionCredentials()
		 * @generated
		 */
		EClass CONNECTION_CREDENTIALS = eINSTANCE.getConnectionCredentials();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.ConnectionManagerImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.DatabaseContainerImpl <em>Database Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.DatabaseContainerImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseContainer()
		 * @generated
		 */
		EClass DATABASE_CONTAINER = eINSTANCE.getDatabaseContainer();

		/**
		 * The meta object literal for the '<em><b>Catalog Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTAINER__CATALOG_CONTAINERS = eINSTANCE.getDatabaseContainer_CatalogContainers();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTAINER__VENDOR = eINSTANCE.getDatabaseContainer_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTAINER__VERSION = eINSTANCE.getDatabaseContainer_Version();

		/**
		 * The meta object literal for the '
		 * <em><b>Default Catalog Container</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER = eINSTANCE.getDatabaseContainer_DefaultCatalogContainer();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.DatabaseObjectDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseObjectDef()
		 * @generated
		 */
		EClass DATABASE_OBJECT_DEF = eINSTANCE.getDatabaseObjectDef();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_OBJECT_DEF__LABEL = eINSTANCE.getDatabaseObjectDef_Label();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.QDatabaseManager <em>Database Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.QDatabaseManager
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseManager()
		 * @generated
		 */
		EClass DATABASE_MANAGER = eINSTANCE.getDatabaseManager();

		/**
		 * The meta object literal for the '{@link org.osgi.service.jdbc.DataSourceFactory <em>Data Source Factory</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.osgi.service.jdbc.DataSourceFactory
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDataSourceFactory()
		 * @generated
		 */
		EClass DATA_SOURCE_FACTORY = eINSTANCE.getDataSourceFactory();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.IndexDefImpl <em>Index Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.IndexDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getIndexDef()
		 * @generated
		 */
		EClass INDEX_DEF = eINSTANCE.getIndexDef();

		/**
		 * The meta object literal for the '<em><b>Clustered</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__CLUSTERED = eINSTANCE.getIndexDef_Clustered();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_DEF__COLUMNS = eINSTANCE.getIndexDef_Columns();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__UNIQUE = eINSTANCE.getIndexDef_Unique();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.IndexColumnDefImpl <em>Index Column Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.IndexColumnDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getIndexColumnDef()
		 * @generated
		 */
		EClass INDEX_COLUMN_DEF = eINSTANCE.getIndexColumnDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__NAME = eINSTANCE.getIndexColumnDef_Name();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__ORDERING = eINSTANCE.getIndexColumnDef_Ordering();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__SEQUENCE = eINSTANCE.getIndexColumnDef_Sequence();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.QPreparedStatement <em>Prepared Statement</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.QPreparedStatement
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getPreparedStatement()
		 * @generated
		 */
		EClass PREPARED_STATEMENT = eINSTANCE.getPreparedStatement();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.QualifiedNameImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getQualifiedName()
		 * @generated
		 */
		EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME__QUALIFIERS = eINSTANCE.getQualifiedName_Qualifiers();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.SchemaDefImpl <em>Schema Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.SchemaDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getSchemaDef()
		 * @generated
		 */
		EClass SCHEMA_DEF = eINSTANCE.getSchemaDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.QStatement
		 * <em>Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.smeup.sys.db.core.QStatement
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.TableDefImpl <em>Table Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.TableDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getTableDef()
		 * @generated
		 */
		EClass TABLE_DEF = eINSTANCE.getTableDef();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DEF__COLUMNS = eINSTANCE.getTableDef_Columns();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.TableColumnDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getTableColumnDef()
		 * @generated
		 */
		EClass TABLE_COLUMN_DEF = eINSTANCE.getTableColumnDef();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__DEFAULT = eINSTANCE.getTableColumnDef_Default();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN_DEF__DEFINITION = eINSTANCE.getTableColumnDef_Definition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__NAME = eINSTANCE.getTableColumnDef_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__NULLABLE = eINSTANCE.getTableColumnDef_Nullable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.QTableProvider <em>Table Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.QTableProvider
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getTableProvider()
		 * @generated
		 */
		EClass TABLE_PROVIDER = eINSTANCE.getTableProvider();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.impl.ViewDefImpl <em>View Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.ViewDefImpl
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getViewDef()
		 * @generated
		 */
		EClass VIEW_DEF = eINSTANCE.getViewDef();

		/**
		 * The meta object literal for the '<em><b>Query Select</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEF__QUERY_SELECT = eINSTANCE.getViewDef_QuerySelect();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.core.OrderingType <em>Ordering Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.OrderingType
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getOrderingType()
		 * @generated
		 */
		EEnum ORDERING_TYPE = eINSTANCE.getOrderingType();

		/**
		 * The meta object literal for the '<em>Database Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.sql.SQLException
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseException()
		 * @generated
		 */
		EDataType DATABASE_EXCEPTION = eINSTANCE.getDatabaseException();

		/**
		 * The meta object literal for the '<em>Database Result Set</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.sql.ResultSet
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSet()
		 * @generated
		 */
		EDataType DATABASE_RESULT_SET = eINSTANCE.getDatabaseResultSet();

		/**
		 * The meta object literal for the '<em>Database Result Set Meta Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.ResultSetMetaData
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseResultSetMetaData()
		 * @generated
		 */
		EDataType DATABASE_RESULT_SET_META_DATA = eINSTANCE.getDatabaseResultSetMetaData();

		/**
		 * The meta object literal for the '<em>Statement Batch Result</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getStatementBatchResult()
		 * @generated
		 */
		EDataType STATEMENT_BATCH_RESULT = eINSTANCE.getStatementBatchResult();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.smeup.sys.db.core.DatabaseCoreException
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseCoreException()
		 * @generated
		 */
		EDataType DATABASE_CORE_EXCEPTION = eINSTANCE.getDatabaseCoreException();

		/**
		 * The meta object literal for the '<em>Runtime Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.db.core.DatabaseCoreRuntimeException
		 * @see org.smeup.sys.db.core.impl.DatabaseCorePackageImpl#getDatabaseCoreRuntimeException()
		 * @generated
		 */
		EDataType DATABASE_CORE_RUNTIME_EXCEPTION = eINSTANCE.getDatabaseCoreRuntimeException();

	}

} // QDatabaseCorePackage
