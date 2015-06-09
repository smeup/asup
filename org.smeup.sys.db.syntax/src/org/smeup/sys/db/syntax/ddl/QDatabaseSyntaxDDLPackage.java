/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;

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
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseSyntaxDDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ddl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/db/syntax/ddl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax-ddl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxDDLPackage eINSTANCE = org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.CallStatementImpl <em>Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.CallStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCallStatement()
	 * @generated
	 */
	int CALL_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__PROCEDURE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__PARMS = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.CommitStatementImpl <em>Commit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.CommitStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCommitStatement()
	 * @generated
	 */
	int COMMIT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_STATEMENT__HOLD = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Commit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl <em>Connect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getConnectStatement()
	 * @generated
	 */
	int CONNECT_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__PWD = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__RESET = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__TO = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__USER = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateAliasStatementImpl <em>Create Alias Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.CreateAliasStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateAliasStatement()
	 * @generated
	 */
	int CREATE_ALIAS_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT__ALIAS_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT__TABLE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Alias Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.CreateIndexStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateIndexStatement()
	 * @generated
	 */
	int CREATE_INDEX_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__INDEX_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__ON_TABLE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__SORT_BY = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__UNIQUE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Index Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.CreateTableStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateTableStatement()
	 * @generated
	 */
	int CREATE_TABLE_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__TABLE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__FIELDS = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateViewStatement()
	 * @generated
	 */
	int CREATE_VIEW_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT__VIEW_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT__FIELDS = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT__QUERY = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create View Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.DisconnectStatementImpl <em>Disconnect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.DisconnectStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getDisconnectStatement()
	 * @generated
	 */
	int DISCONNECT_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_STATEMENT__TARGET = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disconnect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.DropStatementImpl <em>Drop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.DropStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getDropStatement()
	 * @generated
	 */
	int DROP_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT__RANGE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT__TARGET_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT__TARGET = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl <em>Lock Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getLockTableStatement()
	 * @generated
	 */
	int LOCK_TABLE_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Allow Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT__ALLOW_READ = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Share Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT__SHARE_MODE = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT__TABLE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lock Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.ReleaseStatementImpl <em>Release Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.ReleaseStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getReleaseStatement()
	 * @generated
	 */
	int RELEASE_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STATEMENT__SERVER_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.RenameStatementImpl <em>Rename Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.RenameStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getRenameStatement()
	 * @generated
	 */
	int RENAME_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__NEW_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__SYSTEM = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__ORIGINAL_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__TARGET = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rename Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.RollbackStatementImpl <em>Rollback Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.RollbackStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getRollbackStatement()
	 * @generated
	 */
	int ROLLBACK_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_STATEMENT__HOLD = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rollback Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.impl.SetConnectionStatementImpl <em>Set Connection Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.impl.SetConnectionStatementImpl
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getSetConnectionStatement()
	 * @generated
	 */
	int SET_CONNECTION_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONNECTION_STATEMENT__DATABASE_NAME = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Connection Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONNECTION_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.DropRange <em>Drop Range</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.DropRange
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getDropRange()
	 * @generated
	 */
	int DROP_RANGE = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.TargetElement <em>Target Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.TargetElement
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 15;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.ShareMode <em>Share Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.ShareMode
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getShareMode()
	 * @generated
	 */
	int SHARE_MODE = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.ddl.TargetItem <em>Target Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.ddl.TargetItem
	 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getTargetItem()
	 * @generated
	 */
	int TARGET_ITEM = 17;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QCallStatement <em>Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCallStatement
	 * @generated
	 */
	EClass getCallStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCallStatement#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCallStatement#getProcedureName()
	 * @see #getCallStatement()
	 * @generated
	 */
	EReference getCallStatement_ProcedureName();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.syntax.ddl.QCallStatement#getParms <em>Parms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parms</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCallStatement#getParms()
	 * @see #getCallStatement()
	 * @generated
	 */
	EAttribute getCallStatement_Parms();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QCommitStatement <em>Commit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCommitStatement
	 * @generated
	 */
	EClass getCommitStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QCommitStatement#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCommitStatement#isHold()
	 * @see #getCommitStatement()
	 * @generated
	 */
	EAttribute getCommitStatement_Hold();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement <em>Connect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QConnectStatement
	 * @generated
	 */
	EClass getConnectStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QConnectStatement#getPwd()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#isReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QConnectStatement#isReset()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_Reset();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QConnectStatement#getTo()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_To();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QConnectStatement#getUser()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_User();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement <em>Create Alias Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Alias Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateAliasStatement
	 * @generated
	 */
	EClass getCreateAliasStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getAliasName()
	 * @see #getCreateAliasStatement()
	 * @generated
	 */
	EReference getCreateAliasStatement_AliasName();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getTableName()
	 * @see #getCreateAliasStatement()
	 * @generated
	 */
	EReference getCreateAliasStatement_TableName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement <em>Create Index Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Index Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateIndexStatement
	 * @generated
	 */
	EClass getCreateIndexStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getIndexName()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_IndexName();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getOnTable <em>On Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Table</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getOnTable()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_OnTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort By</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#getSortBy()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateIndexStatement#isUnique()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EAttribute getCreateIndexStatement_Unique();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QCreateTableStatement <em>Create Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Table Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateTableStatement
	 * @generated
	 */
	EClass getCreateTableStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateTableStatement#getTableName()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EReference getCreateTableStatement_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.db.syntax.ddl.QCreateTableStatement#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateTableStatement#getFields()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EReference getCreateTableStatement_Fields();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement <em>Create View Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create View Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateViewStatement
	 * @generated
	 */
	EClass getCreateViewStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getViewName()
	 * @see #getCreateViewStatement()
	 * @generated
	 */
	EReference getCreateViewStatement_ViewName();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fields</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getFields()
	 * @see #getCreateViewStatement()
	 * @generated
	 */
	EAttribute getCreateViewStatement_Fields();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getQuery()
	 * @see #getCreateViewStatement()
	 * @generated
	 */
	EAttribute getCreateViewStatement_Query();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QDisconnectStatement <em>Disconnect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QDisconnectStatement
	 * @generated
	 */
	EClass getDisconnectStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QDisconnectStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QDisconnectStatement#getTarget()
	 * @see #getDisconnectStatement()
	 * @generated
	 */
	EAttribute getDisconnectStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QDropStatement <em>Drop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QDropStatement
	 * @generated
	 */
	EClass getDropStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QDropStatement#getRange()
	 * @see #getDropStatement()
	 * @generated
	 */
	EAttribute getDropStatement_Range();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QDropStatement#getTargetName()
	 * @see #getDropStatement()
	 * @generated
	 */
	EReference getDropStatement_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QDropStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QDropStatement#getTarget()
	 * @see #getDropStatement()
	 * @generated
	 */
	EAttribute getDropStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement <em>Lock Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Table Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QLockTableStatement
	 * @generated
	 */
	EClass getLockTableStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#isAllowRead <em>Allow Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Read</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QLockTableStatement#isAllowRead()
	 * @see #getLockTableStatement()
	 * @generated
	 */
	EAttribute getLockTableStatement_AllowRead();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#getShareMode <em>Share Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Mode</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QLockTableStatement#getShareMode()
	 * @see #getLockTableStatement()
	 * @generated
	 */
	EAttribute getLockTableStatement_ShareMode();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QLockTableStatement#getTableName()
	 * @see #getLockTableStatement()
	 * @generated
	 */
	EReference getLockTableStatement_TableName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QReleaseStatement <em>Release Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QReleaseStatement
	 * @generated
	 */
	EClass getReleaseStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QReleaseStatement#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QReleaseStatement#getServerName()
	 * @see #getReleaseStatement()
	 * @generated
	 */
	EAttribute getReleaseStatement_ServerName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QRenameStatement <em>Rename Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRenameStatement
	 * @generated
	 */
	EClass getRenameStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QRenameStatement#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRenameStatement#getNewName()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EAttribute getRenameStatement_NewName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QRenameStatement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRenameStatement#getSystem()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EAttribute getRenameStatement_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.ddl.QRenameStatement#getOriginalName <em>Original Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRenameStatement#getOriginalName()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EReference getRenameStatement_OriginalName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QRenameStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRenameStatement#getTarget()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EAttribute getRenameStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QRollbackStatement <em>Rollback Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rollback Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRollbackStatement
	 * @generated
	 */
	EClass getRollbackStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QRollbackStatement#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QRollbackStatement#isHold()
	 * @see #getRollbackStatement()
	 * @generated
	 */
	EAttribute getRollbackStatement_Hold();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.ddl.QSetConnectionStatement <em>Set Connection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Connection Statement</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QSetConnectionStatement
	 * @generated
	 */
	EClass getSetConnectionStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.ddl.QSetConnectionStatement#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.QSetConnectionStatement#getDatabaseName()
	 * @see #getSetConnectionStatement()
	 * @generated
	 */
	EAttribute getSetConnectionStatement_DatabaseName();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.ddl.DropRange <em>Drop Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drop Range</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.DropRange
	 * @generated
	 */
	EEnum getDropRange();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.ddl.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Element</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.TargetElement
	 * @generated
	 */
	EEnum getTargetElement();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.ddl.ShareMode <em>Share Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Share Mode</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.ShareMode
	 * @generated
	 */
	EEnum getShareMode();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.ddl.TargetItem <em>Target Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Item</em>'.
	 * @see org.smeup.sys.db.syntax.ddl.TargetItem
	 * @generated
	 */
	EEnum getTargetItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseSyntaxDDLFactory getDatabaseSyntaxDDLFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.CallStatementImpl <em>Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.CallStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCallStatement()
		 * @generated
		 */
		EClass CALL_STATEMENT = eINSTANCE.getCallStatement();

		/**
		 * The meta object literal for the '<em><b>Procedure Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_STATEMENT__PROCEDURE_NAME = eINSTANCE.getCallStatement_ProcedureName();

		/**
		 * The meta object literal for the '<em><b>Parms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_STATEMENT__PARMS = eINSTANCE.getCallStatement_Parms();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.CommitStatementImpl <em>Commit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.CommitStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCommitStatement()
		 * @generated
		 */
		EClass COMMIT_STATEMENT = eINSTANCE.getCommitStatement();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT_STATEMENT__HOLD = eINSTANCE.getCommitStatement_Hold();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl <em>Connect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.ConnectStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getConnectStatement()
		 * @generated
		 */
		EClass CONNECT_STATEMENT = eINSTANCE.getConnectStatement();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__PWD = eINSTANCE.getConnectStatement_Pwd();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__RESET = eINSTANCE.getConnectStatement_Reset();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__TO = eINSTANCE.getConnectStatement_To();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__USER = eINSTANCE.getConnectStatement_User();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateAliasStatementImpl <em>Create Alias Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.CreateAliasStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateAliasStatement()
		 * @generated
		 */
		EClass CREATE_ALIAS_STATEMENT = eINSTANCE.getCreateAliasStatement();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ALIAS_STATEMENT__ALIAS_NAME = eINSTANCE.getCreateAliasStatement_AliasName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ALIAS_STATEMENT__TABLE_NAME = eINSTANCE.getCreateAliasStatement_TableName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.CreateIndexStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateIndexStatement()
		 * @generated
		 */
		EClass CREATE_INDEX_STATEMENT = eINSTANCE.getCreateIndexStatement();

		/**
		 * The meta object literal for the '<em><b>Index Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__INDEX_NAME = eINSTANCE.getCreateIndexStatement_IndexName();

		/**
		 * The meta object literal for the '<em><b>On Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__ON_TABLE = eINSTANCE.getCreateIndexStatement_OnTable();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__SORT_BY = eINSTANCE.getCreateIndexStatement_SortBy();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX_STATEMENT__UNIQUE = eINSTANCE.getCreateIndexStatement_Unique();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.CreateTableStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateTableStatement()
		 * @generated
		 */
		EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getCreateTableStatement_TableName();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE_STATEMENT__FIELDS = eINSTANCE.getCreateTableStatement_Fields();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.CreateViewStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getCreateViewStatement()
		 * @generated
		 */
		EClass CREATE_VIEW_STATEMENT = eINSTANCE.getCreateViewStatement();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_VIEW_STATEMENT__VIEW_NAME = eINSTANCE.getCreateViewStatement_ViewName();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW_STATEMENT__FIELDS = eINSTANCE.getCreateViewStatement_Fields();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW_STATEMENT__QUERY = eINSTANCE.getCreateViewStatement_Query();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.DisconnectStatementImpl <em>Disconnect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.DisconnectStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getDisconnectStatement()
		 * @generated
		 */
		EClass DISCONNECT_STATEMENT = eINSTANCE.getDisconnectStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECT_STATEMENT__TARGET = eINSTANCE.getDisconnectStatement_Target();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.DropStatementImpl <em>Drop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.DropStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getDropStatement()
		 * @generated
		 */
		EClass DROP_STATEMENT = eINSTANCE.getDropStatement();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_STATEMENT__RANGE = eINSTANCE.getDropStatement_Range();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_STATEMENT__TARGET_NAME = eINSTANCE.getDropStatement_TargetName();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_STATEMENT__TARGET = eINSTANCE.getDropStatement_Target();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl <em>Lock Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.LockTableStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getLockTableStatement()
		 * @generated
		 */
		EClass LOCK_TABLE_STATEMENT = eINSTANCE.getLockTableStatement();

		/**
		 * The meta object literal for the '<em><b>Allow Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_TABLE_STATEMENT__ALLOW_READ = eINSTANCE.getLockTableStatement_AllowRead();

		/**
		 * The meta object literal for the '<em><b>Share Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_TABLE_STATEMENT__SHARE_MODE = eINSTANCE.getLockTableStatement_ShareMode();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getLockTableStatement_TableName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.ReleaseStatementImpl <em>Release Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.ReleaseStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getReleaseStatement()
		 * @generated
		 */
		EClass RELEASE_STATEMENT = eINSTANCE.getReleaseStatement();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_STATEMENT__SERVER_NAME = eINSTANCE.getReleaseStatement_ServerName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.RenameStatementImpl <em>Rename Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.RenameStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getRenameStatement()
		 * @generated
		 */
		EClass RENAME_STATEMENT = eINSTANCE.getRenameStatement();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_STATEMENT__NEW_NAME = eINSTANCE.getRenameStatement_NewName();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_STATEMENT__SYSTEM = eINSTANCE.getRenameStatement_System();

		/**
		 * The meta object literal for the '<em><b>Original Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_STATEMENT__ORIGINAL_NAME = eINSTANCE.getRenameStatement_OriginalName();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_STATEMENT__TARGET = eINSTANCE.getRenameStatement_Target();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.RollbackStatementImpl <em>Rollback Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.RollbackStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getRollbackStatement()
		 * @generated
		 */
		EClass ROLLBACK_STATEMENT = eINSTANCE.getRollbackStatement();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLLBACK_STATEMENT__HOLD = eINSTANCE.getRollbackStatement_Hold();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.impl.SetConnectionStatementImpl <em>Set Connection Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.impl.SetConnectionStatementImpl
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getSetConnectionStatement()
		 * @generated
		 */
		EClass SET_CONNECTION_STATEMENT = eINSTANCE.getSetConnectionStatement();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_CONNECTION_STATEMENT__DATABASE_NAME = eINSTANCE.getSetConnectionStatement_DatabaseName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.DropRange <em>Drop Range</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.DropRange
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getDropRange()
		 * @generated
		 */
		EEnum DROP_RANGE = eINSTANCE.getDropRange();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.TargetElement <em>Target Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.TargetElement
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getTargetElement()
		 * @generated
		 */
		EEnum TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.ShareMode <em>Share Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.ShareMode
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getShareMode()
		 * @generated
		 */
		EEnum SHARE_MODE = eINSTANCE.getShareMode();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.ddl.TargetItem <em>Target Item</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.ddl.TargetItem
		 * @see org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl#getTargetItem()
		 * @generated
		 */
		EEnum TARGET_ITEM = eINSTANCE.getTargetItem();

	}

} //QDatabaseSyntaxDDLPackage
