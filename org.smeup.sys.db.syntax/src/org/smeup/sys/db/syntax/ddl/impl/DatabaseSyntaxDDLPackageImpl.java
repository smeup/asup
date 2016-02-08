/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.db.syntax.QDatabaseSyntaxPackage;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl;
import org.smeup.sys.db.syntax.ddl.DropRange;
import org.smeup.sys.db.syntax.ddl.QCallStatement;
import org.smeup.sys.db.syntax.ddl.QCommitStatement;
import org.smeup.sys.db.syntax.ddl.QConnectStatement;
import org.smeup.sys.db.syntax.ddl.QCreateAliasStatement;
import org.smeup.sys.db.syntax.ddl.QCreateIndexStatement;
import org.smeup.sys.db.syntax.ddl.QCreateTableStatement;
import org.smeup.sys.db.syntax.ddl.QCreateViewStatement;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLFactory;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.ddl.QDisconnectStatement;
import org.smeup.sys.db.syntax.ddl.QDropStatement;
import org.smeup.sys.db.syntax.ddl.QLockTableStatement;
import org.smeup.sys.db.syntax.ddl.QReleaseStatement;
import org.smeup.sys.db.syntax.ddl.QRenameStatement;
import org.smeup.sys.db.syntax.ddl.QRollbackStatement;
import org.smeup.sys.db.syntax.ddl.QSetConnectionStatement;
import org.smeup.sys.db.syntax.ddl.ShareMode;
import org.smeup.sys.db.syntax.ddl.TargetElement;
import org.smeup.sys.db.syntax.ddl.TargetItem;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage;
import org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl;
import org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxDDLPackageImpl extends EPackageImpl implements QDatabaseSyntaxDDLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAliasStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createIndexStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTableStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createViewStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockTableStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rollbackStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setConnectionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dropRangeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shareModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetItemEEnum = null;

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
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseSyntaxDDLPackageImpl() {
		super(eNS_URI, QDatabaseSyntaxDDLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDatabaseSyntaxDDLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseSyntaxDDLPackage init() {
		if (isInited) return (QDatabaseSyntaxDDLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI);

		// Obtain or create and register package
		DatabaseSyntaxDDLPackageImpl theDatabaseSyntaxDDLPackage = (DatabaseSyntaxDDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseSyntaxDDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseSyntaxDDLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) : QDatabaseSyntaxPackage.eINSTANCE);
		DatabaseSyntaxDMLPackageImpl theDatabaseSyntaxDMLPackage = (DatabaseSyntaxDMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI) instanceof DatabaseSyntaxDMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI) : QDatabaseSyntaxDMLPackage.eINSTANCE);
		DatabaseSyntaxDBLPackageImpl theDatabaseSyntaxDBLPackage = (DatabaseSyntaxDBLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI) instanceof DatabaseSyntaxDBLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI) : QDatabaseSyntaxDBLPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseSyntaxDDLPackage.createPackageContents();
		theDatabaseSyntaxPackage.createPackageContents();
		theDatabaseSyntaxDMLPackage.createPackageContents();
		theDatabaseSyntaxDBLPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseSyntaxDDLPackage.initializePackageContents();
		theDatabaseSyntaxPackage.initializePackageContents();
		theDatabaseSyntaxDMLPackage.initializePackageContents();
		theDatabaseSyntaxDBLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseSyntaxDDLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseSyntaxDDLPackage.eNS_URI, theDatabaseSyntaxDDLPackage);
		return theDatabaseSyntaxDDLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallStatement() {
		return callStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallStatement_ProcedureName() {
		return (EReference)callStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallStatement_Parms() {
		return (EAttribute)callStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitStatement() {
		return commitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitStatement_Hold() {
		return (EAttribute)commitStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectStatement() {
		return connectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectStatement_Pwd() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectStatement_Reset() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectStatement_To() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectStatement_User() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAliasStatement() {
		return createAliasStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateAliasStatement_AliasName() {
		return (EReference)createAliasStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateAliasStatement_TableName() {
		return (EReference)createAliasStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateIndexStatement() {
		return createIndexStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateIndexStatement_IndexName() {
		return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateIndexStatement_OnTable() {
		return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateIndexStatement_SortBy() {
		return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateIndexStatement_Unique() {
		return (EAttribute)createIndexStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTableStatement() {
		return createTableStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateTableStatement_TableName() {
		return (EReference)createTableStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateTableStatement_Fields() {
		return (EReference)createTableStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateViewStatement() {
		return createViewStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateViewStatement_ViewName() {
		return (EReference)createViewStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateViewStatement_Fields() {
		return (EAttribute)createViewStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateViewStatement_Query() {
		return (EAttribute)createViewStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectStatement() {
		return disconnectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectStatement_Target() {
		return (EAttribute)disconnectStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropStatement() {
		return dropStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropStatement_Range() {
		return (EAttribute)dropStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropStatement_TargetName() {
		return (EReference)dropStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropStatement_Target() {
		return (EAttribute)dropStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLockTableStatement() {
		return lockTableStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLockTableStatement_AllowRead() {
		return (EAttribute)lockTableStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLockTableStatement_ShareMode() {
		return (EAttribute)lockTableStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLockTableStatement_TableName() {
		return (EReference)lockTableStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseStatement() {
		return releaseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseStatement_ServerName() {
		return (EAttribute)releaseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameStatement() {
		return renameStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameStatement_NewName() {
		return (EAttribute)renameStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameStatement_System() {
		return (EAttribute)renameStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameStatement_OriginalName() {
		return (EReference)renameStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameStatement_Target() {
		return (EAttribute)renameStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRollbackStatement() {
		return rollbackStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRollbackStatement_Hold() {
		return (EAttribute)rollbackStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetConnectionStatement() {
		return setConnectionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetConnectionStatement_DatabaseName() {
		return (EAttribute)setConnectionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDropRange() {
		return dropRangeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetElement() {
		return targetElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShareMode() {
		return shareModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetItem() {
		return targetItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxDDLFactory getDatabaseSyntaxDDLFactory() {
		return (QDatabaseSyntaxDDLFactory)getEFactoryInstance();
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
		callStatementEClass = createEClass(CALL_STATEMENT);
		createEReference(callStatementEClass, CALL_STATEMENT__PROCEDURE_NAME);
		createEAttribute(callStatementEClass, CALL_STATEMENT__PARMS);

		commitStatementEClass = createEClass(COMMIT_STATEMENT);
		createEAttribute(commitStatementEClass, COMMIT_STATEMENT__HOLD);

		connectStatementEClass = createEClass(CONNECT_STATEMENT);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__PWD);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__RESET);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__TO);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__USER);

		createAliasStatementEClass = createEClass(CREATE_ALIAS_STATEMENT);
		createEReference(createAliasStatementEClass, CREATE_ALIAS_STATEMENT__ALIAS_NAME);
		createEReference(createAliasStatementEClass, CREATE_ALIAS_STATEMENT__TABLE_NAME);

		createIndexStatementEClass = createEClass(CREATE_INDEX_STATEMENT);
		createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__INDEX_NAME);
		createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__ON_TABLE);
		createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__SORT_BY);
		createEAttribute(createIndexStatementEClass, CREATE_INDEX_STATEMENT__UNIQUE);

		createTableStatementEClass = createEClass(CREATE_TABLE_STATEMENT);
		createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__TABLE_NAME);
		createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__FIELDS);

		createViewStatementEClass = createEClass(CREATE_VIEW_STATEMENT);
		createEReference(createViewStatementEClass, CREATE_VIEW_STATEMENT__VIEW_NAME);
		createEAttribute(createViewStatementEClass, CREATE_VIEW_STATEMENT__FIELDS);
		createEAttribute(createViewStatementEClass, CREATE_VIEW_STATEMENT__QUERY);

		disconnectStatementEClass = createEClass(DISCONNECT_STATEMENT);
		createEAttribute(disconnectStatementEClass, DISCONNECT_STATEMENT__TARGET);

		dropStatementEClass = createEClass(DROP_STATEMENT);
		createEAttribute(dropStatementEClass, DROP_STATEMENT__RANGE);
		createEReference(dropStatementEClass, DROP_STATEMENT__TARGET_NAME);
		createEAttribute(dropStatementEClass, DROP_STATEMENT__TARGET);

		lockTableStatementEClass = createEClass(LOCK_TABLE_STATEMENT);
		createEAttribute(lockTableStatementEClass, LOCK_TABLE_STATEMENT__ALLOW_READ);
		createEAttribute(lockTableStatementEClass, LOCK_TABLE_STATEMENT__SHARE_MODE);
		createEReference(lockTableStatementEClass, LOCK_TABLE_STATEMENT__TABLE_NAME);

		releaseStatementEClass = createEClass(RELEASE_STATEMENT);
		createEAttribute(releaseStatementEClass, RELEASE_STATEMENT__SERVER_NAME);

		renameStatementEClass = createEClass(RENAME_STATEMENT);
		createEAttribute(renameStatementEClass, RENAME_STATEMENT__NEW_NAME);
		createEAttribute(renameStatementEClass, RENAME_STATEMENT__SYSTEM);
		createEReference(renameStatementEClass, RENAME_STATEMENT__ORIGINAL_NAME);
		createEAttribute(renameStatementEClass, RENAME_STATEMENT__TARGET);

		rollbackStatementEClass = createEClass(ROLLBACK_STATEMENT);
		createEAttribute(rollbackStatementEClass, ROLLBACK_STATEMENT__HOLD);

		setConnectionStatementEClass = createEClass(SET_CONNECTION_STATEMENT);
		createEAttribute(setConnectionStatementEClass, SET_CONNECTION_STATEMENT__DATABASE_NAME);

		// Create enums
		dropRangeEEnum = createEEnum(DROP_RANGE);
		targetElementEEnum = createEEnum(TARGET_ELEMENT);
		shareModeEEnum = createEEnum(SHARE_MODE);
		targetItemEEnum = createEEnum(TARGET_ITEM);
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
		QDatabaseSyntaxPackage theDatabaseSyntaxPackage = (QDatabaseSyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI);
		QDatabaseCorePackage theDatabaseCorePackage = (QDatabaseCorePackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		commitStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		connectStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		createAliasStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		createIndexStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		createTableStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		createViewStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		disconnectStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		dropStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		lockTableStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		releaseStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		renameStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		rollbackStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());
		setConnectionStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getDefinitionStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(callStatementEClass, QCallStatement.class, "CallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallStatement_ProcedureName(), theDatabaseCorePackage.getQualifiedName(), null, "procedureName", null, 0, 1, QCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallStatement_Parms(), theEcorePackage.getEString(), "parms", null, 0, -1, QCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commitStatementEClass, QCommitStatement.class, "CommitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommitStatement_Hold(), theEcorePackage.getEBoolean(), "hold", null, 0, 1, QCommitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectStatementEClass, QConnectStatement.class, "ConnectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectStatement_Pwd(), theEcorePackage.getEString(), "pwd", null, 0, 1, QConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectStatement_Reset(), theEcorePackage.getEBoolean(), "reset", null, 0, 1, QConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectStatement_To(), theEcorePackage.getEString(), "to", null, 0, 1, QConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectStatement_User(), theEcorePackage.getEString(), "user", null, 0, 1, QConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createAliasStatementEClass, QCreateAliasStatement.class, "CreateAliasStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateAliasStatement_AliasName(), theDatabaseCorePackage.getQualifiedName(), null, "aliasName", null, 0, 1, QCreateAliasStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateAliasStatement_TableName(), theDatabaseCorePackage.getQualifiedName(), null, "tableName", null, 0, 1, QCreateAliasStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createIndexStatementEClass, QCreateIndexStatement.class, "CreateIndexStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateIndexStatement_IndexName(), theDatabaseCorePackage.getQualifiedName(), null, "indexName", null, 0, 1, QCreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateIndexStatement_OnTable(), theDatabaseCorePackage.getQualifiedName(), null, "onTable", null, 0, 1, QCreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateIndexStatement_SortBy(), theDatabaseCorePackage.getIndexDef(), null, "sortBy", null, 0, 1, QCreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateIndexStatement_Unique(), theEcorePackage.getEBoolean(), "unique", null, 0, 1, QCreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTableStatementEClass, QCreateTableStatement.class, "CreateTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateTableStatement_TableName(), theDatabaseCorePackage.getQualifiedName(), null, "tableName", null, 0, 1, QCreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateTableStatement_Fields(), theDatabaseCorePackage.getTableColumnDef(), null, "fields", null, 1, -1, QCreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createViewStatementEClass, QCreateViewStatement.class, "CreateViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateViewStatement_ViewName(), theDatabaseCorePackage.getQualifiedName(), null, "viewName", null, 0, 1, QCreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateViewStatement_Fields(), ecorePackage.getEString(), "fields", null, 1, -1, QCreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateViewStatement_Query(), theEcorePackage.getEString(), "query", null, 0, 1, QCreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disconnectStatementEClass, QDisconnectStatement.class, "DisconnectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisconnectStatement_Target(), this.getTargetItem(), "target", null, 0, 1, QDisconnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropStatementEClass, QDropStatement.class, "DropStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropStatement_Range(), this.getDropRange(), "range", null, 0, 1, QDropStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropStatement_TargetName(), theDatabaseCorePackage.getQualifiedName(), null, "targetName", null, 0, 1, QDropStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropStatement_Target(), this.getTargetElement(), "target", null, 0, 1, QDropStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lockTableStatementEClass, QLockTableStatement.class, "LockTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLockTableStatement_AllowRead(), theEcorePackage.getEBoolean(), "allowRead", null, 0, 1, QLockTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLockTableStatement_ShareMode(), this.getShareMode(), "shareMode", null, 0, 1, QLockTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLockTableStatement_TableName(), theDatabaseCorePackage.getQualifiedName(), null, "tableName", null, 0, 1, QLockTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseStatementEClass, QReleaseStatement.class, "ReleaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseStatement_ServerName(), theEcorePackage.getEString(), "serverName", null, 0, 1, QReleaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameStatementEClass, QRenameStatement.class, "RenameStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameStatement_NewName(), theEcorePackage.getEString(), "newName", null, 0, 1, QRenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameStatement_System(), theEcorePackage.getEString(), "system", null, 0, 1, QRenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameStatement_OriginalName(), theDatabaseCorePackage.getQualifiedName(), null, "originalName", null, 0, 1, QRenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameStatement_Target(), this.getTargetElement(), "target", null, 0, 1, QRenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rollbackStatementEClass, QRollbackStatement.class, "RollbackStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRollbackStatement_Hold(), theEcorePackage.getEBoolean(), "hold", null, 0, 1, QRollbackStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setConnectionStatementEClass, QSetConnectionStatement.class, "SetConnectionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetConnectionStatement_DatabaseName(), theEcorePackage.getEString(), "databaseName", null, 0, 1, QSetConnectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dropRangeEEnum, DropRange.class, "DropRange");
		addEEnumLiteral(dropRangeEEnum, DropRange.RESTRICT);
		addEEnumLiteral(dropRangeEEnum, DropRange.CASCADE);

		initEEnum(targetElementEEnum, TargetElement.class, "TargetElement");
		addEEnumLiteral(targetElementEEnum, TargetElement.ALIAS);
		addEEnumLiteral(targetElementEEnum, TargetElement.INDEX);
		addEEnumLiteral(targetElementEEnum, TargetElement.VIEW);
		addEEnumLiteral(targetElementEEnum, TargetElement.TABLE);

		initEEnum(shareModeEEnum, ShareMode.class, "ShareMode");
		addEEnumLiteral(shareModeEEnum, ShareMode.SHARE);
		addEEnumLiteral(shareModeEEnum, ShareMode.EXCLUSIVE);

		initEEnum(targetItemEEnum, TargetItem.class, "TargetItem");
		addEEnumLiteral(targetItemEEnum, TargetItem.ALL);
		addEEnumLiteral(targetItemEEnum, TargetItem.CURRENT);
		addEEnumLiteral(targetItemEEnum, TargetItem.ALLSQL);
	}

} //DatabaseSyntaxDDLPackageImpl
