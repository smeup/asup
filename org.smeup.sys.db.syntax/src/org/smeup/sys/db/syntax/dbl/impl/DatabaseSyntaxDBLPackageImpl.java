/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

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
import org.smeup.sys.db.syntax.dbl.CursorType;
import org.smeup.sys.db.syntax.dbl.DescriptorScope;
import org.smeup.sys.db.syntax.dbl.FetchPosition;
import org.smeup.sys.db.syntax.dbl.IsolationLevel;
import org.smeup.sys.db.syntax.dbl.OpenUsingType;
import org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QCloseStatement;
import org.smeup.sys.db.syntax.dbl.QConditionInfoClause;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLFactory;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement;
import org.smeup.sys.db.syntax.dbl.QDeclareStatementStatement;
import org.smeup.sys.db.syntax.dbl.QDescribeStatement;
import org.smeup.sys.db.syntax.dbl.QExecuteImmediateStatement;
import org.smeup.sys.db.syntax.dbl.QExecuteStatement;
import org.smeup.sys.db.syntax.dbl.QFetchStatement;
import org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement;
import org.smeup.sys.db.syntax.dbl.QIntoClause;
import org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause;
import org.smeup.sys.db.syntax.dbl.QOpenStatement;
import org.smeup.sys.db.syntax.dbl.QOption;
import org.smeup.sys.db.syntax.dbl.QPrepareStatement;
import org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QSetOptionStatement;
import org.smeup.sys.db.syntax.dbl.QSetTransactionStatement;
import org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause;
import org.smeup.sys.db.syntax.dbl.RWOperation;
import org.smeup.sys.db.syntax.dbl.UsingType;
import org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage;
import org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLPackageImpl;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage;
import org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl;
import org.smeup.sys.db.syntax.impl.DatabaseSyntaxPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxDBLPackageImpl extends EPackageImpl implements QDatabaseSyntaxDBLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocateDescriptorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deallocateDescriptorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareCursorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareStatementStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeImmediateStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fetchStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDescriptorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDiagnosticsStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intoClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleRowFetchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleRowFetchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setDescriptorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTransactionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOptionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prepareStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionInfoClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cursorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum descriptorScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isolationLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rwOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openUsingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usingTypeEEnum = null;

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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseSyntaxDBLPackageImpl() {
		super(eNS_URI, QDatabaseSyntaxDBLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDatabaseSyntaxDBLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatabaseSyntaxDBLPackage init() {
		if (isInited) return (QDatabaseSyntaxDBLPackage)EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDBLPackage.eNS_URI);

		// Obtain or create and register package
		DatabaseSyntaxDBLPackageImpl theDatabaseSyntaxDBLPackage = (DatabaseSyntaxDBLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabaseSyntaxDBLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabaseSyntaxDBLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QDatabaseCorePackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DatabaseSyntaxPackageImpl theDatabaseSyntaxPackage = (DatabaseSyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) instanceof DatabaseSyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxPackage.eNS_URI) : QDatabaseSyntaxPackage.eINSTANCE);
		DatabaseSyntaxDDLPackageImpl theDatabaseSyntaxDDLPackage = (DatabaseSyntaxDDLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI) instanceof DatabaseSyntaxDDLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDDLPackage.eNS_URI) : QDatabaseSyntaxDDLPackage.eINSTANCE);
		DatabaseSyntaxDMLPackageImpl theDatabaseSyntaxDMLPackage = (DatabaseSyntaxDMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI) instanceof DatabaseSyntaxDMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatabaseSyntaxDMLPackage.eNS_URI) : QDatabaseSyntaxDMLPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseSyntaxDBLPackage.createPackageContents();
		theDatabaseSyntaxPackage.createPackageContents();
		theDatabaseSyntaxDDLPackage.createPackageContents();
		theDatabaseSyntaxDMLPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseSyntaxDBLPackage.initializePackageContents();
		theDatabaseSyntaxPackage.initializePackageContents();
		theDatabaseSyntaxDDLPackage.initializePackageContents();
		theDatabaseSyntaxDMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseSyntaxDBLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatabaseSyntaxDBLPackage.eNS_URI, theDatabaseSyntaxDBLPackage);
		return theDatabaseSyntaxDBLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocateDescriptorStatement() {
		return allocateDescriptorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocateDescriptorStatement_DescriptorName() {
		return (EAttribute)allocateDescriptorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocateDescriptorStatement_DescriptorScope() {
		return (EAttribute)allocateDescriptorStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocateDescriptorStatement_WithMax() {
		return (EAttribute)allocateDescriptorStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeallocateDescriptorStatement() {
		return deallocateDescriptorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeallocateDescriptorStatement_DescriptorName() {
		return (EAttribute)deallocateDescriptorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeallocateDescriptorStatement_DescriptorScope() {
		return (EAttribute)deallocateDescriptorStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareCursorStatement() {
		return declareCursorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareCursorStatement_CursorName() {
		return (EAttribute)declareCursorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareCursorStatement_CursorType() {
		return (EAttribute)declareCursorStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareCursorStatement_ForQuery() {
		return (EAttribute)declareCursorStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareCursorStatement_ForStatementName() {
		return (EAttribute)declareCursorStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareCursorStatement_Hold() {
		return (EAttribute)declareCursorStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareStatementStatement() {
		return declareStatementStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclareStatementStatement_Statements() {
		return (EAttribute)declareStatementStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribeStatement() {
		return describeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescribeStatement_Into() {
		return (EReference)describeStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribeStatement_StatementName() {
		return (EAttribute)describeStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteImmediateStatement() {
		return executeImmediateStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteImmediateStatement_Variable() {
		return (EAttribute)executeImmediateStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteStatement() {
		return executeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteStatement_StatementName() {
		return (EAttribute)executeStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteStatement_Using() {
		return (EAttribute)executeStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteStatement_UsingType() {
		return (EAttribute)executeStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFetchStatement() {
		return fetchStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchStatement_CursorName() {
		return (EAttribute)fetchStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchStatement_Position() {
		return (EAttribute)fetchStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchStatement_RelativePosition() {
		return (EAttribute)fetchStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFetchStatement_MultipleRowClause() {
		return (EReference)fetchStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFetchStatement_SingleRowClause() {
		return (EReference)fetchStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDescriptorStatement() {
		return getDescriptorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDescriptorStatement_DescriptorName() {
		return (EAttribute)getDescriptorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDescriptorStatement_DescriptorScope() {
		return (EAttribute)getDescriptorStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDescriptorStatement_Value() {
		return (EAttribute)getDescriptorStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetDescriptorStatement_Variables() {
		return (EReference)getDescriptorStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDiagnosticsStatement() {
		return getDiagnosticsStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetDiagnosticsStatement_ConditionInfo() {
		return (EReference)getDiagnosticsStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntoClause() {
		return intoClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntoClause_DescriptorName() {
		return (EAttribute)intoClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntoClause_Using() {
		return (EAttribute)intoClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleRowFetchClause() {
		return singleRowFetchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleRowFetchClause_Into() {
		return (EAttribute)singleRowFetchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleRowFetchClause_UsingDescriptor() {
		return (EAttribute)singleRowFetchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleRowFetchClause() {
		return multipleRowFetchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleRowFetchClause_Into() {
		return (EAttribute)multipleRowFetchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleRowFetchClause_RowsNumber() {
		return (EAttribute)multipleRowFetchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleRowFetchClause_UsingDescriptor() {
		return (EAttribute)multipleRowFetchClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleRowFetchClause_Descriptor() {
		return (EAttribute)multipleRowFetchClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetDescriptorStatement() {
		return setDescriptorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetDescriptorStatement_DescriptorName() {
		return (EAttribute)setDescriptorStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetDescriptorStatement_Value() {
		return (EAttribute)setDescriptorStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetDescriptorStatement_Items() {
		return (EReference)setDescriptorStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTransactionStatement() {
		return setTransactionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTransactionStatement_IsolationLevel() {
		return (EAttribute)setTransactionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTransactionStatement_RwOperation() {
		return (EAttribute)setTransactionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOptionStatement() {
		return setOptionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetOptionStatement_Options() {
		return (EReference)setOptionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStatement() {
		return openStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStatement_Cursor() {
		return (EAttribute)openStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStatement_Using() {
		return (EAttribute)openStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStatement_UsingType() {
		return (EAttribute)openStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrepareStatement() {
		return prepareStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrepareStatement_From() {
		return (EAttribute)prepareStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrepareStatement_Into() {
		return (EReference)prepareStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrepareStatement_StatementName() {
		return (EAttribute)prepareStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseStatement() {
		return closeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloseStatement_Cursor() {
		return (EAttribute)closeStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionInfoClause() {
		return conditionInfoClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionInfoClause_Condition() {
		return (EAttribute)conditionInfoClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionInfoClause_ConditionItems() {
		return (EReference)conditionInfoClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCursorType() {
		return cursorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDescriptorScope() {
		return descriptorScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchPosition() {
		return fetchPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsolationLevel() {
		return isolationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRWOperation() {
		return rwOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpenUsingType() {
		return openUsingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsingType() {
		return usingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxDBLFactory getDatabaseSyntaxDBLFactory() {
		return (QDatabaseSyntaxDBLFactory)getEFactoryInstance();
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
		allocateDescriptorStatementEClass = createEClass(ALLOCATE_DESCRIPTOR_STATEMENT);
		createEAttribute(allocateDescriptorStatementEClass, ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME);
		createEAttribute(allocateDescriptorStatementEClass, ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE);
		createEAttribute(allocateDescriptorStatementEClass, ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX);

		closeStatementEClass = createEClass(CLOSE_STATEMENT);
		createEAttribute(closeStatementEClass, CLOSE_STATEMENT__CURSOR);

		conditionInfoClauseEClass = createEClass(CONDITION_INFO_CLAUSE);
		createEAttribute(conditionInfoClauseEClass, CONDITION_INFO_CLAUSE__CONDITION);
		createEReference(conditionInfoClauseEClass, CONDITION_INFO_CLAUSE__CONDITION_ITEMS);

		deallocateDescriptorStatementEClass = createEClass(DEALLOCATE_DESCRIPTOR_STATEMENT);
		createEAttribute(deallocateDescriptorStatementEClass, DEALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME);
		createEAttribute(deallocateDescriptorStatementEClass, DEALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE);

		declareCursorStatementEClass = createEClass(DECLARE_CURSOR_STATEMENT);
		createEAttribute(declareCursorStatementEClass, DECLARE_CURSOR_STATEMENT__CURSOR_NAME);
		createEAttribute(declareCursorStatementEClass, DECLARE_CURSOR_STATEMENT__CURSOR_TYPE);
		createEAttribute(declareCursorStatementEClass, DECLARE_CURSOR_STATEMENT__FOR_QUERY);
		createEAttribute(declareCursorStatementEClass, DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME);
		createEAttribute(declareCursorStatementEClass, DECLARE_CURSOR_STATEMENT__HOLD);

		declareStatementStatementEClass = createEClass(DECLARE_STATEMENT_STATEMENT);
		createEAttribute(declareStatementStatementEClass, DECLARE_STATEMENT_STATEMENT__STATEMENTS);

		describeStatementEClass = createEClass(DESCRIBE_STATEMENT);
		createEReference(describeStatementEClass, DESCRIBE_STATEMENT__INTO);
		createEAttribute(describeStatementEClass, DESCRIBE_STATEMENT__STATEMENT_NAME);

		executeImmediateStatementEClass = createEClass(EXECUTE_IMMEDIATE_STATEMENT);
		createEAttribute(executeImmediateStatementEClass, EXECUTE_IMMEDIATE_STATEMENT__VARIABLE);

		executeStatementEClass = createEClass(EXECUTE_STATEMENT);
		createEAttribute(executeStatementEClass, EXECUTE_STATEMENT__STATEMENT_NAME);
		createEAttribute(executeStatementEClass, EXECUTE_STATEMENT__USING);
		createEAttribute(executeStatementEClass, EXECUTE_STATEMENT__USING_TYPE);

		fetchStatementEClass = createEClass(FETCH_STATEMENT);
		createEAttribute(fetchStatementEClass, FETCH_STATEMENT__CURSOR_NAME);
		createEAttribute(fetchStatementEClass, FETCH_STATEMENT__POSITION);
		createEAttribute(fetchStatementEClass, FETCH_STATEMENT__RELATIVE_POSITION);
		createEReference(fetchStatementEClass, FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE);
		createEReference(fetchStatementEClass, FETCH_STATEMENT__SINGLE_ROW_CLAUSE);

		getDescriptorStatementEClass = createEClass(GET_DESCRIPTOR_STATEMENT);
		createEAttribute(getDescriptorStatementEClass, GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME);
		createEAttribute(getDescriptorStatementEClass, GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE);
		createEAttribute(getDescriptorStatementEClass, GET_DESCRIPTOR_STATEMENT__VALUE);
		createEReference(getDescriptorStatementEClass, GET_DESCRIPTOR_STATEMENT__VARIABLES);

		getDiagnosticsStatementEClass = createEClass(GET_DIAGNOSTICS_STATEMENT);
		createEReference(getDiagnosticsStatementEClass, GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO);

		intoClauseEClass = createEClass(INTO_CLAUSE);
		createEAttribute(intoClauseEClass, INTO_CLAUSE__DESCRIPTOR_NAME);
		createEAttribute(intoClauseEClass, INTO_CLAUSE__USING);

		singleRowFetchClauseEClass = createEClass(SINGLE_ROW_FETCH_CLAUSE);
		createEAttribute(singleRowFetchClauseEClass, SINGLE_ROW_FETCH_CLAUSE__INTO);
		createEAttribute(singleRowFetchClauseEClass, SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR);

		multipleRowFetchClauseEClass = createEClass(MULTIPLE_ROW_FETCH_CLAUSE);
		createEAttribute(multipleRowFetchClauseEClass, MULTIPLE_ROW_FETCH_CLAUSE__INTO);
		createEAttribute(multipleRowFetchClauseEClass, MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER);
		createEAttribute(multipleRowFetchClauseEClass, MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR);
		createEAttribute(multipleRowFetchClauseEClass, MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR);

		setDescriptorStatementEClass = createEClass(SET_DESCRIPTOR_STATEMENT);
		createEAttribute(setDescriptorStatementEClass, SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME);
		createEAttribute(setDescriptorStatementEClass, SET_DESCRIPTOR_STATEMENT__VALUE);
		createEReference(setDescriptorStatementEClass, SET_DESCRIPTOR_STATEMENT__ITEMS);

		setTransactionStatementEClass = createEClass(SET_TRANSACTION_STATEMENT);
		createEAttribute(setTransactionStatementEClass, SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL);
		createEAttribute(setTransactionStatementEClass, SET_TRANSACTION_STATEMENT__RW_OPERATION);

		setOptionStatementEClass = createEClass(SET_OPTION_STATEMENT);
		createEReference(setOptionStatementEClass, SET_OPTION_STATEMENT__OPTIONS);

		openStatementEClass = createEClass(OPEN_STATEMENT);
		createEAttribute(openStatementEClass, OPEN_STATEMENT__CURSOR);
		createEAttribute(openStatementEClass, OPEN_STATEMENT__USING);
		createEAttribute(openStatementEClass, OPEN_STATEMENT__USING_TYPE);

		prepareStatementEClass = createEClass(PREPARE_STATEMENT);
		createEAttribute(prepareStatementEClass, PREPARE_STATEMENT__FROM);
		createEReference(prepareStatementEClass, PREPARE_STATEMENT__INTO);
		createEAttribute(prepareStatementEClass, PREPARE_STATEMENT__STATEMENT_NAME);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__VALUE);

		// Create enums
		cursorTypeEEnum = createEEnum(CURSOR_TYPE);
		descriptorScopeEEnum = createEEnum(DESCRIPTOR_SCOPE);
		fetchPositionEEnum = createEEnum(FETCH_POSITION);
		isolationLevelEEnum = createEEnum(ISOLATION_LEVEL);
		rwOperationEEnum = createEEnum(RW_OPERATION);
		openUsingTypeEEnum = createEEnum(OPEN_USING_TYPE);
		usingTypeEEnum = createEEnum(USING_TYPE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocateDescriptorStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		closeStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		deallocateDescriptorStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		declareCursorStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		declareStatementStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		describeStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		executeImmediateStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		executeStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		fetchStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		getDescriptorStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		getDiagnosticsStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		setDescriptorStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		setTransactionStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		setOptionStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		openStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());
		prepareStatementEClass.getESuperTypes().add(theDatabaseSyntaxPackage.getBindingStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(allocateDescriptorStatementEClass, QAllocateDescriptorStatement.class, "AllocateDescriptorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocateDescriptorStatement_DescriptorName(), theEcorePackage.getEString(), "descriptorName", null, 1, 1, QAllocateDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocateDescriptorStatement_DescriptorScope(), this.getDescriptorScope(), "descriptorScope", null, 1, 1, QAllocateDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocateDescriptorStatement_WithMax(), theEcorePackage.getEString(), "withMax", null, 0, 1, QAllocateDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closeStatementEClass, QCloseStatement.class, "CloseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloseStatement_Cursor(), theEcorePackage.getEString(), "cursor", null, 0, 1, QCloseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionInfoClauseEClass, QConditionInfoClause.class, "ConditionInfoClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionInfoClause_Condition(), theEcorePackage.getEString(), "condition", null, 1, 1, QConditionInfoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionInfoClause_ConditionItems(), this.getOption(), null, "conditionItems", null, 0, -1, QConditionInfoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deallocateDescriptorStatementEClass, QDeallocateDescriptorStatement.class, "DeallocateDescriptorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeallocateDescriptorStatement_DescriptorName(), theEcorePackage.getEString(), "descriptorName", null, 1, 1, QDeallocateDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeallocateDescriptorStatement_DescriptorScope(), this.getDescriptorScope(), "descriptorScope", null, 1, 1, QDeallocateDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declareCursorStatementEClass, QDeclareCursorStatement.class, "DeclareCursorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclareCursorStatement_CursorName(), theEcorePackage.getEString(), "cursorName", null, 1, 1, QDeclareCursorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeclareCursorStatement_CursorType(), this.getCursorType(), "cursorType", null, 0, 1, QDeclareCursorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeclareCursorStatement_ForQuery(), theEcorePackage.getEString(), "forQuery", null, 0, 1, QDeclareCursorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeclareCursorStatement_ForStatementName(), theEcorePackage.getEString(), "forStatementName", null, 0, 1, QDeclareCursorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeclareCursorStatement_Hold(), theEcorePackage.getEBoolean(), "hold", null, 0, 1, QDeclareCursorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declareStatementStatementEClass, QDeclareStatementStatement.class, "DeclareStatementStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclareStatementStatement_Statements(), theEcorePackage.getEString(), "statements", null, 0, -1, QDeclareStatementStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describeStatementEClass, QDescribeStatement.class, "DescribeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescribeStatement_Into(), this.getIntoClause(), null, "into", null, 0, 1, QDescribeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribeStatement_StatementName(), theEcorePackage.getEString(), "statementName", null, 0, 1, QDescribeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executeImmediateStatementEClass, QExecuteImmediateStatement.class, "ExecuteImmediateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecuteImmediateStatement_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, QExecuteImmediateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executeStatementEClass, QExecuteStatement.class, "ExecuteStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecuteStatement_StatementName(), theEcorePackage.getEString(), "statementName", null, 0, 1, QExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteStatement_Using(), theEcorePackage.getEString(), "using", null, 0, -1, QExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecuteStatement_UsingType(), this.getOpenUsingType(), "usingType", null, 0, 1, QExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fetchStatementEClass, QFetchStatement.class, "FetchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFetchStatement_CursorName(), theEcorePackage.getEString(), "cursorName", null, 1, 1, QFetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchStatement_Position(), this.getFetchPosition(), "position", null, 0, 1, QFetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchStatement_RelativePosition(), theEcorePackage.getEString(), "relativePosition", null, 0, 1, QFetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFetchStatement_MultipleRowClause(), this.getMultipleRowFetchClause(), null, "multipleRowClause", null, 0, 1, QFetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFetchStatement_SingleRowClause(), this.getSingleRowFetchClause(), null, "singleRowClause", null, 0, 1, QFetchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDescriptorStatementEClass, QGetDescriptorStatement.class, "GetDescriptorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetDescriptorStatement_DescriptorName(), theEcorePackage.getEString(), "descriptorName", null, 1, 1, QGetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetDescriptorStatement_DescriptorScope(), this.getDescriptorScope(), "descriptorScope", null, 1, 1, QGetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetDescriptorStatement_Value(), theEcorePackage.getEString(), "value", null, 0, 1, QGetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetDescriptorStatement_Variables(), this.getOption(), null, "variables", null, 0, -1, QGetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDiagnosticsStatementEClass, QGetDiagnosticsStatement.class, "GetDiagnosticsStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetDiagnosticsStatement_ConditionInfo(), this.getConditionInfoClause(), null, "conditionInfo", null, 0, 1, QGetDiagnosticsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intoClauseEClass, QIntoClause.class, "IntoClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntoClause_DescriptorName(), theEcorePackage.getEString(), "descriptorName", null, 1, 1, QIntoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntoClause_Using(), this.getUsingType(), "using", null, 0, 1, QIntoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleRowFetchClauseEClass, QSingleRowFetchClause.class, "SingleRowFetchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleRowFetchClause_Into(), theEcorePackage.getEString(), "into", null, 1, -1, QSingleRowFetchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleRowFetchClause_UsingDescriptor(), theEcorePackage.getEBoolean(), "usingDescriptor", "false", 0, 1, QSingleRowFetchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleRowFetchClauseEClass, QMultipleRowFetchClause.class, "MultipleRowFetchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleRowFetchClause_Into(), theEcorePackage.getEString(), "into", null, 0, 1, QMultipleRowFetchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleRowFetchClause_RowsNumber(), theEcorePackage.getEString(), "rowsNumber", null, 1, 1, QMultipleRowFetchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleRowFetchClause_UsingDescriptor(), theEcorePackage.getEBoolean(), "usingDescriptor", "false", 0, 1, QMultipleRowFetchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleRowFetchClause_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, QMultipleRowFetchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setDescriptorStatementEClass, QSetDescriptorStatement.class, "SetDescriptorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetDescriptorStatement_DescriptorName(), theEcorePackage.getEString(), "descriptorName", null, 1, 1, QSetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetDescriptorStatement_Value(), theEcorePackage.getEString(), "value", null, 0, 1, QSetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetDescriptorStatement_Items(), this.getOption(), null, "items", null, 0, -1, QSetDescriptorStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTransactionStatementEClass, QSetTransactionStatement.class, "SetTransactionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetTransactionStatement_IsolationLevel(), this.getIsolationLevel(), "isolationLevel", null, 0, 1, QSetTransactionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTransactionStatement_RwOperation(), this.getRWOperation(), "rwOperation", null, 0, 1, QSetTransactionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setOptionStatementEClass, QSetOptionStatement.class, "SetOptionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOptionStatement_Options(), this.getOption(), null, "options", null, 0, -1, QSetOptionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openStatementEClass, QOpenStatement.class, "OpenStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStatement_Cursor(), theEcorePackage.getEString(), "cursor", null, 0, 1, QOpenStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStatement_Using(), theEcorePackage.getEString(), "using", null, 0, -1, QOpenStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStatement_UsingType(), this.getOpenUsingType(), "usingType", null, 0, 1, QOpenStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prepareStatementEClass, QPrepareStatement.class, "PrepareStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrepareStatement_From(), theEcorePackage.getEString(), "from", null, 1, 1, QPrepareStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrepareStatement_Into(), this.getIntoClause(), null, "into", null, 0, 1, QPrepareStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrepareStatement_StatementName(), theEcorePackage.getEString(), "statementName", null, 0, 1, QPrepareStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, QOption.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), theEcorePackage.getEString(), "name", null, 0, 1, QOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), theEcorePackage.getEString(), "value", null, 0, 1, QOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cursorTypeEEnum, CursorType.class, "CursorType");
		addEEnumLiteral(cursorTypeEEnum, CursorType.NOTSCROLL);
		addEEnumLiteral(cursorTypeEEnum, CursorType.SCROLL);
		addEEnumLiteral(cursorTypeEEnum, CursorType.DYNSCROLL);

		initEEnum(descriptorScopeEEnum, DescriptorScope.class, "DescriptorScope");
		addEEnumLiteral(descriptorScopeEEnum, DescriptorScope.NONE);
		addEEnumLiteral(descriptorScopeEEnum, DescriptorScope.LOCAL);
		addEEnumLiteral(descriptorScopeEEnum, DescriptorScope.GLOBAL);

		initEEnum(fetchPositionEEnum, FetchPosition.class, "FetchPosition");
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.NEXT);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.PRIOR);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.FIRST);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.LAST);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.BEFORE);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.AFTER);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.CURRENT);
		addEEnumLiteral(fetchPositionEEnum, FetchPosition.RELATIVE);

		initEEnum(isolationLevelEEnum, IsolationLevel.class, "IsolationLevel");
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.NONE);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.SERIALIZABLE);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.NO_COMMIT);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.READ_UNCOMMITTED);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.READ_COMMITTED);
		addEEnumLiteral(isolationLevelEEnum, IsolationLevel.REPEATABLE_READ);

		initEEnum(rwOperationEEnum, RWOperation.class, "RWOperation");
		addEEnumLiteral(rwOperationEEnum, RWOperation.READ_ONLY);
		addEEnumLiteral(rwOperationEEnum, RWOperation.READ_WRITE);

		initEEnum(openUsingTypeEEnum, OpenUsingType.class, "OpenUsingType");
		addEEnumLiteral(openUsingTypeEEnum, OpenUsingType.NONE);
		addEEnumLiteral(openUsingTypeEEnum, OpenUsingType.DESCRIPTOR);
		addEEnumLiteral(openUsingTypeEEnum, OpenUsingType.VARIABLE);

		initEEnum(usingTypeEEnum, UsingType.class, "UsingType");
		addEEnumLiteral(usingTypeEEnum, UsingType.NONE);
		addEEnumLiteral(usingTypeEEnum, UsingType.NAMES);
		addEEnumLiteral(usingTypeEEnum, UsingType.SYSTEM_NAMES);
		addEEnumLiteral(usingTypeEEnum, UsingType.LABELS);
		addEEnumLiteral(usingTypeEEnum, UsingType.ANY);
		addEEnumLiteral(usingTypeEEnum, UsingType.BOTH);
		addEEnumLiteral(usingTypeEEnum, UsingType.ALL);
	}

} //DatabaseSyntaxDBLPackageImpl
