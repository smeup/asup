/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

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
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseSyntaxDBLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/db/syntax/dbl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax-dbl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxDBLPackage eINSTANCE = org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl <em>Declare Cursor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeclareCursorStatement()
	 * @generated
	 */
	int DECLARE_CURSOR_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_CURSOR_STATEMENT__CURSOR_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_CURSOR_STATEMENT__CURSOR_TYPE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_CURSOR_STATEMENT__FOR_QUERY = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_CURSOR_STATEMENT__HOLD = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Declare Cursor Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_CURSOR_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl <em>Describe Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDescribeStatement()
	 * @generated
	 */
	int DESCRIBE_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Into</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT__INTO = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT__STATEMENT_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Describe Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteImmediateStatementImpl <em>Execute Immediate Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.ExecuteImmediateStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getExecuteImmediateStatement()
	 * @generated
	 */
	int EXECUTE_IMMEDIATE_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_IMMEDIATE_STATEMENT__VARIABLE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execute Immediate Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_IMMEDIATE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getExecuteStatement()
	 * @generated
	 */
	int EXECUTE_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT__STATEMENT_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execute Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl <em>Fetch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getFetchStatement()
	 * @generated
	 */
	int FETCH_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_STATEMENT__CURSOR_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_STATEMENT__POSITION = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relative Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_STATEMENT__RELATIVE_POSITION = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiple Row Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Single Row Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_STATEMENT__SINGLE_ROW_CLAUSE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fetch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.IntoClauseImpl <em>Into Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.IntoClauseImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getIntoClause()
	 * @generated
	 */
	int INTO_CLAUSE = 5;

	/**
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO_CLAUSE__DESCRIPTOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO_CLAUSE__USING = 1;

	/**
	 * The number of structural features of the '<em>Into Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl <em>Single Row Fetch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSingleRowFetchClause()
	 * @generated
	 */
	int SINGLE_ROW_FETCH_CLAUSE = 6;

	/**
	 * The feature id for the '<em><b>Into</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROW_FETCH_CLAUSE__INTO = 0;

	/**
	 * The feature id for the '<em><b>Using Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR = 1;

	/**
	 * The number of structural features of the '<em>Single Row Fetch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ROW_FETCH_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl <em>Multiple Row Fetch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getMultipleRowFetchClause()
	 * @generated
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>Into</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE__INTO = 0;

	/**
	 * The feature id for the '<em><b>Rows Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Using Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR = 3;

	/**
	 * The number of structural features of the '<em>Multiple Row Fetch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl <em>Set Transaction Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetTransactionStatement()
	 * @generated
	 */
	int SET_TRANSACTION_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Isolation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rw Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TRANSACTION_STATEMENT__RW_OPERATION = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Transaction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TRANSACTION_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetOptionStatementImpl <em>Set Option Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SetOptionStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetOptionStatement()
	 * @generated
	 */
	int SET_OPTION_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPTION_STATEMENT__OPTIONS = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Option Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPTION_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl <em>Open Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOpenStatement()
	 * @generated
	 */
	int OPEN_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT__CURSOR = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT__USING = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Using Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT__USING_TYPE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Open Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl <em>Prepare Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getPrepareStatement()
	 * @generated
	 */
	int PREPARE_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_STATEMENT__FROM = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Into</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_STATEMENT__INTO = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_STATEMENT__STATEMENT_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Prepare Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.CloseStatementImpl <em>Close Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.CloseStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getCloseStatement()
	 * @generated
	 */
	int CLOSE_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_STATEMENT__CURSOR = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Close Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.OptionImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.CursorType <em>Cursor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.CursorType
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getCursorType()
	 * @generated
	 */
	int CURSOR_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.FetchPosition <em>Fetch Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.FetchPosition
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getFetchPosition()
	 * @generated
	 */
	int FETCH_POSITION = 15;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.IsolationLevel
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getIsolationLevel()
	 * @generated
	 */
	int ISOLATION_LEVEL = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.RWOperation <em>RW Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.RWOperation
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getRWOperation()
	 * @generated
	 */
	int RW_OPERATION = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.OpenUsingType <em>Open Using Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.OpenUsingType
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOpenUsingType()
	 * @generated
	 */
	int OPEN_USING_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.UsingType <em>Using Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.UsingType
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getUsingType()
	 * @generated
	 */
	int USING_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement <em>Declare Cursor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Cursor Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement
	 * @generated
	 */
	EClass getDeclareCursorStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorName <em>Cursor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorName()
	 * @see #getDeclareCursorStatement()
	 * @generated
	 */
	EAttribute getDeclareCursorStatement_CursorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorType <em>Cursor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Type</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorType()
	 * @see #getDeclareCursorStatement()
	 * @generated
	 */
	EAttribute getDeclareCursorStatement_CursorType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForQuery <em>For Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Query</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForQuery()
	 * @see #getDeclareCursorStatement()
	 * @generated
	 */
	EAttribute getDeclareCursorStatement_ForQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForStatementName <em>For Statement Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Statement Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForStatementName()
	 * @see #getDeclareCursorStatement()
	 * @generated
	 */
	EAttribute getDeclareCursorStatement_ForStatementName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#isHold()
	 * @see #getDeclareCursorStatement()
	 * @generated
	 */
	EAttribute getDeclareCursorStatement_Hold();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement <em>Describe Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDescribeStatement
	 * @generated
	 */
	EClass getDescribeStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getInto <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Into</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDescribeStatement#getInto()
	 * @see #getDescribeStatement()
	 * @generated
	 */
	EReference getDescribeStatement_Into();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getStatementName <em>Statement Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDescribeStatement#getStatementName()
	 * @see #getDescribeStatement()
	 * @generated
	 */
	EAttribute getDescribeStatement_StatementName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QExecuteImmediateStatement <em>Execute Immediate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Immediate Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QExecuteImmediateStatement
	 * @generated
	 */
	EClass getExecuteImmediateStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QExecuteImmediateStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QExecuteImmediateStatement#getVariable()
	 * @see #getExecuteImmediateStatement()
	 * @generated
	 */
	EAttribute getExecuteImmediateStatement_Variable();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QExecuteStatement <em>Execute Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QExecuteStatement
	 * @generated
	 */
	EClass getExecuteStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QExecuteStatement#getStatementName <em>Statement Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QExecuteStatement#getStatementName()
	 * @see #getExecuteStatement()
	 * @generated
	 */
	EAttribute getExecuteStatement_StatementName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QFetchStatement <em>Fetch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fetch Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QFetchStatement
	 * @generated
	 */
	EClass getFetchStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QFetchStatement#getCursorName <em>Cursor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QFetchStatement#getCursorName()
	 * @see #getFetchStatement()
	 * @generated
	 */
	EAttribute getFetchStatement_CursorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QFetchStatement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QFetchStatement#getPosition()
	 * @see #getFetchStatement()
	 * @generated
	 */
	EAttribute getFetchStatement_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QFetchStatement#getRelativePosition <em>Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Position</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QFetchStatement#getRelativePosition()
	 * @see #getFetchStatement()
	 * @generated
	 */
	EAttribute getFetchStatement_RelativePosition();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.dbl.QFetchStatement#getMultipleRowClause <em>Multiple Row Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiple Row Clause</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QFetchStatement#getMultipleRowClause()
	 * @see #getFetchStatement()
	 * @generated
	 */
	EReference getFetchStatement_MultipleRowClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.dbl.QFetchStatement#getSingleRowClause <em>Single Row Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Row Clause</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QFetchStatement#getSingleRowClause()
	 * @see #getFetchStatement()
	 * @generated
	 */
	EReference getFetchStatement_SingleRowClause();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QIntoClause <em>Into Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Into Clause</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QIntoClause
	 * @generated
	 */
	EClass getIntoClause();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QIntoClause#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QIntoClause#getDescriptorName()
	 * @see #getIntoClause()
	 * @generated
	 */
	EAttribute getIntoClause_DescriptorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QIntoClause#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QIntoClause#getUsing()
	 * @see #getIntoClause()
	 * @generated
	 */
	EAttribute getIntoClause_Using();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause <em>Single Row Fetch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Row Fetch Clause</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause
	 * @generated
	 */
	EClass getSingleRowFetchClause();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#getInto <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Into</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#getInto()
	 * @see #getSingleRowFetchClause()
	 * @generated
	 */
	EAttribute getSingleRowFetchClause_Into();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#isUsingDescriptor <em>Using Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using Descriptor</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#isUsingDescriptor()
	 * @see #getSingleRowFetchClause()
	 * @generated
	 */
	EAttribute getSingleRowFetchClause_UsingDescriptor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause <em>Multiple Row Fetch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Row Fetch Clause</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause
	 * @generated
	 */
	EClass getMultipleRowFetchClause();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getInto <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Into</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getInto()
	 * @see #getMultipleRowFetchClause()
	 * @generated
	 */
	EAttribute getMultipleRowFetchClause_Into();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getRowsNumber <em>Rows Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows Number</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getRowsNumber()
	 * @see #getMultipleRowFetchClause()
	 * @generated
	 */
	EAttribute getMultipleRowFetchClause_RowsNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#isUsingDescriptor <em>Using Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using Descriptor</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#isUsingDescriptor()
	 * @see #getMultipleRowFetchClause()
	 * @generated
	 */
	EAttribute getMultipleRowFetchClause_UsingDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getDescriptor()
	 * @see #getMultipleRowFetchClause()
	 * @generated
	 */
	EAttribute getMultipleRowFetchClause_Descriptor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QSetTransactionStatement <em>Set Transaction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Transaction Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetTransactionStatement
	 * @generated
	 */
	EClass getSetTransactionStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QSetTransactionStatement#getIsolationLevel <em>Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolation Level</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetTransactionStatement#getIsolationLevel()
	 * @see #getSetTransactionStatement()
	 * @generated
	 */
	EAttribute getSetTransactionStatement_IsolationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QSetTransactionStatement#getRwOperation <em>Rw Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Operation</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetTransactionStatement#getRwOperation()
	 * @see #getSetTransactionStatement()
	 * @generated
	 */
	EAttribute getSetTransactionStatement_RwOperation();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QSetOptionStatement <em>Set Option Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Option Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetOptionStatement
	 * @generated
	 */
	EClass getSetOptionStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.smeup.sys.db.syntax.dbl.QSetOptionStatement#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetOptionStatement#getOptions()
	 * @see #getSetOptionStatement()
	 * @generated
	 */
	EReference getSetOptionStatement_Options();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement <em>Open Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOpenStatement
	 * @generated
	 */
	EClass getOpenStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOpenStatement#getCursor()
	 * @see #getOpenStatement()
	 * @generated
	 */
	EAttribute getOpenStatement_Cursor();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsing()
	 * @see #getOpenStatement()
	 * @generated
	 */
	EAttribute getOpenStatement_Using();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsingType <em>Using Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using Type</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsingType()
	 * @see #getOpenStatement()
	 * @generated
	 */
	EAttribute getOpenStatement_UsingType();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement <em>Prepare Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepare Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QPrepareStatement
	 * @generated
	 */
	EClass getPrepareStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QPrepareStatement#getFrom()
	 * @see #getPrepareStatement()
	 * @generated
	 */
	EAttribute getPrepareStatement_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getInto <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Into</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QPrepareStatement#getInto()
	 * @see #getPrepareStatement()
	 * @generated
	 */
	EReference getPrepareStatement_Into();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getStatementName <em>Statement Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QPrepareStatement#getStatementName()
	 * @see #getPrepareStatement()
	 * @generated
	 */
	EAttribute getPrepareStatement_StatementName();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QCloseStatement <em>Close Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QCloseStatement
	 * @generated
	 */
	EClass getCloseStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QCloseStatement#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QCloseStatement#getCursor()
	 * @see #getCloseStatement()
	 * @generated
	 */
	EAttribute getCloseStatement_Cursor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOption
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QOption#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOption#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QOption#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.CursorType <em>Cursor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cursor Type</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.CursorType
	 * @generated
	 */
	EEnum getCursorType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.FetchPosition <em>Fetch Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Position</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.FetchPosition
	 * @generated
	 */
	EEnum getFetchPosition();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Isolation Level</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.IsolationLevel
	 * @generated
	 */
	EEnum getIsolationLevel();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.RWOperation <em>RW Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RW Operation</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.RWOperation
	 * @generated
	 */
	EEnum getRWOperation();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.OpenUsingType <em>Open Using Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Open Using Type</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.OpenUsingType
	 * @generated
	 */
	EEnum getOpenUsingType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.UsingType <em>Using Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Using Type</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.UsingType
	 * @generated
	 */
	EEnum getUsingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseSyntaxDBLFactory getDatabaseSyntaxDBLFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl <em>Declare Cursor Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeclareCursorStatement()
		 * @generated
		 */
		EClass DECLARE_CURSOR_STATEMENT = eINSTANCE.getDeclareCursorStatement();

		/**
		 * The meta object literal for the '<em><b>Cursor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_CURSOR_STATEMENT__CURSOR_NAME = eINSTANCE.getDeclareCursorStatement_CursorName();

		/**
		 * The meta object literal for the '<em><b>Cursor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_CURSOR_STATEMENT__CURSOR_TYPE = eINSTANCE.getDeclareCursorStatement_CursorType();

		/**
		 * The meta object literal for the '<em><b>For Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_CURSOR_STATEMENT__FOR_QUERY = eINSTANCE.getDeclareCursorStatement_ForQuery();

		/**
		 * The meta object literal for the '<em><b>For Statement Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_CURSOR_STATEMENT__FOR_STATEMENT_NAME = eINSTANCE.getDeclareCursorStatement_ForStatementName();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_CURSOR_STATEMENT__HOLD = eINSTANCE.getDeclareCursorStatement_Hold();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl <em>Describe Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDescribeStatement()
		 * @generated
		 */
		EClass DESCRIBE_STATEMENT = eINSTANCE.getDescribeStatement();

		/**
		 * The meta object literal for the '<em><b>Into</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBE_STATEMENT__INTO = eINSTANCE.getDescribeStatement_Into();

		/**
		 * The meta object literal for the '<em><b>Statement Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_STATEMENT__STATEMENT_NAME = eINSTANCE.getDescribeStatement_StatementName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteImmediateStatementImpl <em>Execute Immediate Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.ExecuteImmediateStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getExecuteImmediateStatement()
		 * @generated
		 */
		EClass EXECUTE_IMMEDIATE_STATEMENT = eINSTANCE.getExecuteImmediateStatement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_IMMEDIATE_STATEMENT__VARIABLE = eINSTANCE.getExecuteImmediateStatement_Variable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getExecuteStatement()
		 * @generated
		 */
		EClass EXECUTE_STATEMENT = eINSTANCE.getExecuteStatement();

		/**
		 * The meta object literal for the '<em><b>Statement Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_STATEMENT__STATEMENT_NAME = eINSTANCE.getExecuteStatement_StatementName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl <em>Fetch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getFetchStatement()
		 * @generated
		 */
		EClass FETCH_STATEMENT = eINSTANCE.getFetchStatement();

		/**
		 * The meta object literal for the '<em><b>Cursor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_STATEMENT__CURSOR_NAME = eINSTANCE.getFetchStatement_CursorName();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_STATEMENT__POSITION = eINSTANCE.getFetchStatement_Position();

		/**
		 * The meta object literal for the '<em><b>Relative Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_STATEMENT__RELATIVE_POSITION = eINSTANCE.getFetchStatement_RelativePosition();

		/**
		 * The meta object literal for the '<em><b>Multiple Row Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FETCH_STATEMENT__MULTIPLE_ROW_CLAUSE = eINSTANCE.getFetchStatement_MultipleRowClause();

		/**
		 * The meta object literal for the '<em><b>Single Row Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FETCH_STATEMENT__SINGLE_ROW_CLAUSE = eINSTANCE.getFetchStatement_SingleRowClause();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.IntoClauseImpl <em>Into Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.IntoClauseImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getIntoClause()
		 * @generated
		 */
		EClass INTO_CLAUSE = eINSTANCE.getIntoClause();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTO_CLAUSE__DESCRIPTOR_NAME = eINSTANCE.getIntoClause_DescriptorName();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTO_CLAUSE__USING = eINSTANCE.getIntoClause_Using();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl <em>Single Row Fetch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSingleRowFetchClause()
		 * @generated
		 */
		EClass SINGLE_ROW_FETCH_CLAUSE = eINSTANCE.getSingleRowFetchClause();

		/**
		 * The meta object literal for the '<em><b>Into</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ROW_FETCH_CLAUSE__INTO = eINSTANCE.getSingleRowFetchClause_Into();

		/**
		 * The meta object literal for the '<em><b>Using Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR = eINSTANCE.getSingleRowFetchClause_UsingDescriptor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl <em>Multiple Row Fetch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getMultipleRowFetchClause()
		 * @generated
		 */
		EClass MULTIPLE_ROW_FETCH_CLAUSE = eINSTANCE.getMultipleRowFetchClause();

		/**
		 * The meta object literal for the '<em><b>Into</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_ROW_FETCH_CLAUSE__INTO = eINSTANCE.getMultipleRowFetchClause_Into();

		/**
		 * The meta object literal for the '<em><b>Rows Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_ROW_FETCH_CLAUSE__ROWS_NUMBER = eINSTANCE.getMultipleRowFetchClause_RowsNumber();

		/**
		 * The meta object literal for the '<em><b>Using Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_ROW_FETCH_CLAUSE__USING_DESCRIPTOR = eINSTANCE.getMultipleRowFetchClause_UsingDescriptor();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_ROW_FETCH_CLAUSE__DESCRIPTOR = eINSTANCE.getMultipleRowFetchClause_Descriptor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl <em>Set Transaction Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetTransactionStatement()
		 * @generated
		 */
		EClass SET_TRANSACTION_STATEMENT = eINSTANCE.getSetTransactionStatement();

		/**
		 * The meta object literal for the '<em><b>Isolation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TRANSACTION_STATEMENT__ISOLATION_LEVEL = eINSTANCE.getSetTransactionStatement_IsolationLevel();

		/**
		 * The meta object literal for the '<em><b>Rw Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TRANSACTION_STATEMENT__RW_OPERATION = eINSTANCE.getSetTransactionStatement_RwOperation();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetOptionStatementImpl <em>Set Option Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.SetOptionStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetOptionStatement()
		 * @generated
		 */
		EClass SET_OPTION_STATEMENT = eINSTANCE.getSetOptionStatement();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OPTION_STATEMENT__OPTIONS = eINSTANCE.getSetOptionStatement_Options();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl <em>Open Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOpenStatement()
		 * @generated
		 */
		EClass OPEN_STATEMENT = eINSTANCE.getOpenStatement();

		/**
		 * The meta object literal for the '<em><b>Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STATEMENT__CURSOR = eINSTANCE.getOpenStatement_Cursor();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STATEMENT__USING = eINSTANCE.getOpenStatement_Using();

		/**
		 * The meta object literal for the '<em><b>Using Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STATEMENT__USING_TYPE = eINSTANCE.getOpenStatement_UsingType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl <em>Prepare Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getPrepareStatement()
		 * @generated
		 */
		EClass PREPARE_STATEMENT = eINSTANCE.getPrepareStatement();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPARE_STATEMENT__FROM = eINSTANCE.getPrepareStatement_From();

		/**
		 * The meta object literal for the '<em><b>Into</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARE_STATEMENT__INTO = eINSTANCE.getPrepareStatement_Into();

		/**
		 * The meta object literal for the '<em><b>Statement Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPARE_STATEMENT__STATEMENT_NAME = eINSTANCE.getPrepareStatement_StatementName();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.CloseStatementImpl <em>Close Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.CloseStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getCloseStatement()
		 * @generated
		 */
		EClass CLOSE_STATEMENT = eINSTANCE.getCloseStatement();

		/**
		 * The meta object literal for the '<em><b>Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE_STATEMENT__CURSOR = eINSTANCE.getCloseStatement_Cursor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.OptionImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.CursorType <em>Cursor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.CursorType
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getCursorType()
		 * @generated
		 */
		EEnum CURSOR_TYPE = eINSTANCE.getCursorType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.FetchPosition <em>Fetch Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.FetchPosition
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getFetchPosition()
		 * @generated
		 */
		EEnum FETCH_POSITION = eINSTANCE.getFetchPosition();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.IsolationLevel
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getIsolationLevel()
		 * @generated
		 */
		EEnum ISOLATION_LEVEL = eINSTANCE.getIsolationLevel();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.RWOperation <em>RW Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.RWOperation
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getRWOperation()
		 * @generated
		 */
		EEnum RW_OPERATION = eINSTANCE.getRWOperation();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.OpenUsingType <em>Open Using Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.OpenUsingType
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOpenUsingType()
		 * @generated
		 */
		EEnum OPEN_USING_TYPE = eINSTANCE.getOpenUsingType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.UsingType <em>Using Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.UsingType
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getUsingType()
		 * @generated
		 */
		EEnum USING_TYPE = eINSTANCE.getUsingType();

	}

} //QDatabaseSyntaxDBLPackage
