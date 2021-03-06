/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl <em>Allocate Descriptor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getAllocateDescriptorStatement()
	 * @generated
	 */
	int ALLOCATE_DESCRIPTOR_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptor Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>With Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Allocate Descriptor Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_DESCRIPTOR_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeallocateDescriptorStatementImpl <em>Deallocate Descriptor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.DeallocateDescriptorStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeallocateDescriptorStatement()
	 * @generated
	 */
	int DEALLOCATE_DESCRIPTOR_STATEMENT = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl <em>Declare Cursor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.DeclareCursorStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeclareCursorStatement()
	 * @generated
	 */
	int DECLARE_CURSOR_STATEMENT = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl <em>Describe Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.DescribeStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDescribeStatement()
	 * @generated
	 */
	int DESCRIBE_STATEMENT = 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteImmediateStatementImpl <em>Execute Immediate Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.ExecuteImmediateStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getExecuteImmediateStatement()
	 * @generated
	 */
	int EXECUTE_IMMEDIATE_STATEMENT = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.ExecuteStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getExecuteStatement()
	 * @generated
	 */
	int EXECUTE_STATEMENT = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl <em>Fetch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.FetchStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getFetchStatement()
	 * @generated
	 */
	int FETCH_STATEMENT = 9;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl <em>Get Descriptor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getGetDescriptorStatement()
	 * @generated
	 */
	int GET_DESCRIPTOR_STATEMENT = 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl <em>Single Row Fetch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SingleRowFetchClauseImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSingleRowFetchClause()
	 * @generated
	 */
	int SINGLE_ROW_FETCH_CLAUSE = 20;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl <em>Multiple Row Fetch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.MultipleRowFetchClauseImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getMultipleRowFetchClause()
	 * @generated
	 */
	int MULTIPLE_ROW_FETCH_CLAUSE = 13;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl <em>Set Descriptor Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetDescriptorStatement()
	 * @generated
	 */
	int SET_DESCRIPTOR_STATEMENT = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl <em>Set Transaction Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SetTransactionStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetTransactionStatement()
	 * @generated
	 */
	int SET_TRANSACTION_STATEMENT = 19;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetOptionStatementImpl <em>Set Option Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.SetOptionStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetOptionStatement()
	 * @generated
	 */
	int SET_OPTION_STATEMENT = 18;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl <em>Open Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.OpenStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOpenStatement()
	 * @generated
	 */
	int OPEN_STATEMENT = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl <em>Prepare Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.PrepareStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getPrepareStatement()
	 * @generated
	 */
	int PREPARE_STATEMENT = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.CloseStatementImpl <em>Close Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.CloseStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getCloseStatement()
	 * @generated
	 */
	int CLOSE_STATEMENT = 1;

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
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.ConditionInfoClauseImpl <em>Condition Info Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.ConditionInfoClauseImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getConditionInfoClause()
	 * @generated
	 */
	int CONDITION_INFO_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INFO_CLAUSE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Condition Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INFO_CLAUSE__CONDITION_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Condition Info Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INFO_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptor Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deallocate Descriptor Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALLOCATE_DESCRIPTOR_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeclareStatementStatementImpl <em>Declare Statement Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.DeclareStatementStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeclareStatementStatement()
	 * @generated
	 */
	int DECLARE_STATEMENT_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_STATEMENT_STATEMENT__STATEMENTS = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declare Statement Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_STATEMENT_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Into</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT__INTO = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT__USING = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT__STATEMENT_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Describe Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT__STATEMENT_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT__USING = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Using Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT__USING_TYPE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execute Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptor Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DESCRIPTOR_STATEMENT__INDEX = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DESCRIPTOR_STATEMENT__OPTIONS = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Descriptor Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DESCRIPTOR_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.GetDiagnosticsStatementImpl <em>Get Diagnostics Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.GetDiagnosticsStatementImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getGetDiagnosticsStatement()
	 * @generated
	 */
	int GET_DIAGNOSTICS_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Condition Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Diagnostics Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.IntoImpl <em>Into</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.IntoImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getInto()
	 * @generated
	 */
	int INTO = 12;

	/**
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO__DESCRIPTOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO__USING = 1;

	/**
	 * The number of structural features of the '<em>Into</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTO_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STATEMENT__CURSOR = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute list.
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
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.OptionImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 15;

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
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DESCRIPTOR_STATEMENT__INDEX = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DESCRIPTOR_STATEMENT__OPTIONS = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Descriptor Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DESCRIPTOR_STATEMENT_FEATURE_COUNT = QDatabaseSyntaxPackage.BINDING_STATEMENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.impl.UsingImpl <em>Using</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.impl.UsingImpl
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getUsing()
	 * @generated
	 */
	int USING = 21;

	/**
	 * The feature id for the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING__DESCRIPTOR_NAME = 0;

	/**
	 * The number of structural features of the '<em>Using</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.CursorType <em>Cursor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.CursorType
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getCursorType()
	 * @generated
	 */
	int CURSOR_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.DescriptorScope <em>Descriptor Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.DescriptorScope
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDescriptorScope()
	 * @generated
	 */
	int DESCRIPTOR_SCOPE = 23;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.FetchPosition <em>Fetch Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.FetchPosition
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getFetchPosition()
	 * @generated
	 */
	int FETCH_POSITION = 24;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.IsolationLevel <em>Isolation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.IsolationLevel
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getIsolationLevel()
	 * @generated
	 */
	int ISOLATION_LEVEL = 25;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.RWOperation <em>RW Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.RWOperation
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getRWOperation()
	 * @generated
	 */
	int RW_OPERATION = 27;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.OpenUsingType <em>Open Using Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.OpenUsingType
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getOpenUsingType()
	 * @generated
	 */
	int OPEN_USING_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dbl.UsingType <em>Using Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dbl.UsingType
	 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getUsingType()
	 * @generated
	 */
	int USING_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement <em>Allocate Descriptor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate Descriptor Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement
	 * @generated
	 */
	EClass getAllocateDescriptorStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement#getDescriptorName()
	 * @see #getAllocateDescriptorStatement()
	 * @generated
	 */
	EAttribute getAllocateDescriptorStatement_DescriptorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement#getDescriptorScope <em>Descriptor Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Scope</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement#getDescriptorScope()
	 * @see #getAllocateDescriptorStatement()
	 * @generated
	 */
	EAttribute getAllocateDescriptorStatement_DescriptorScope();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement#getWithMax <em>With Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Max</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement#getWithMax()
	 * @see #getAllocateDescriptorStatement()
	 * @generated
	 */
	EAttribute getAllocateDescriptorStatement_WithMax();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement <em>Deallocate Descriptor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deallocate Descriptor Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement
	 * @generated
	 */
	EClass getDeallocateDescriptorStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement#getDescriptorName()
	 * @see #getDeallocateDescriptorStatement()
	 * @generated
	 */
	EAttribute getDeallocateDescriptorStatement_DescriptorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement#getDescriptorScope <em>Descriptor Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Scope</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement#getDescriptorScope()
	 * @see #getDeallocateDescriptorStatement()
	 * @generated
	 */
	EAttribute getDeallocateDescriptorStatement_DescriptorScope();

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
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QDeclareStatementStatement <em>Declare Statement Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Statement Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareStatementStatement
	 * @generated
	 */
	EClass getDeclareStatementStatement();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.syntax.dbl.QDeclareStatementStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Statements</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDeclareStatementStatement#getStatements()
	 * @see #getDeclareStatementStatement()
	 * @generated
	 */
	EAttribute getDeclareStatementStatement_Statements();

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
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Using</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QDescribeStatement#getUsing()
	 * @see #getDescribeStatement()
	 * @generated
	 */
	EReference getDescribeStatement_Using();

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
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.syntax.dbl.QExecuteStatement#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Using</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QExecuteStatement#getUsing()
	 * @see #getExecuteStatement()
	 * @generated
	 */
	EAttribute getExecuteStatement_Using();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QExecuteStatement#getUsingType <em>Using Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using Type</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QExecuteStatement#getUsingType()
	 * @see #getExecuteStatement()
	 * @generated
	 */
	EAttribute getExecuteStatement_UsingType();

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
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement <em>Get Descriptor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Descriptor Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement
	 * @generated
	 */
	EClass getGetDescriptorStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorName()
	 * @see #getGetDescriptorStatement()
	 * @generated
	 */
	EAttribute getGetDescriptorStatement_DescriptorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorScope <em>Descriptor Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Scope</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getDescriptorScope()
	 * @see #getGetDescriptorStatement()
	 * @generated
	 */
	EAttribute getGetDescriptorStatement_DescriptorScope();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getIndex()
	 * @see #getGetDescriptorStatement()
	 * @generated
	 */
	EAttribute getGetDescriptorStatement_Index();

	/**
	 * Returns the meta object for the reference list '{@link org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement#getOptions()
	 * @see #getGetDescriptorStatement()
	 * @generated
	 */
	EReference getGetDescriptorStatement_Options();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement <em>Get Diagnostics Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Diagnostics Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement
	 * @generated
	 */
	EClass getGetDiagnosticsStatement();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement#getConditionInfo <em>Condition Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition Info</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement#getConditionInfo()
	 * @see #getGetDiagnosticsStatement()
	 * @generated
	 */
	EReference getGetDiagnosticsStatement_ConditionInfo();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QInto <em>Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Into</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QInto
	 * @generated
	 */
	EClass getInto();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QInto#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QInto#getDescriptorName()
	 * @see #getInto()
	 * @generated
	 */
	EAttribute getInto_DescriptorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QInto#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QInto#getUsing()
	 * @see #getInto()
	 * @generated
	 */
	EAttribute getInto_Using();

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
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QUsing
	 * @generated
	 */
	EClass getUsing();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QUsing#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QUsing#getDescriptorName()
	 * @see #getUsing()
	 * @generated
	 */
	EAttribute getUsing_DescriptorName();

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
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement <em>Set Descriptor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Descriptor Statement</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement
	 * @generated
	 */
	EClass getSetDescriptorStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getDescriptorName <em>Descriptor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor Name</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getDescriptorName()
	 * @see #getSetDescriptorStatement()
	 * @generated
	 */
	EAttribute getSetDescriptorStatement_DescriptorName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getIndex()
	 * @see #getSetDescriptorStatement()
	 * @generated
	 */
	EAttribute getSetDescriptorStatement_Index();

	/**
	 * Returns the meta object for the reference list '{@link org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement#getOptions()
	 * @see #getSetDescriptorStatement()
	 * @generated
	 */
	EReference getSetDescriptorStatement_Options();

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
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Using</em>'.
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
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dbl.QConditionInfoClause <em>Condition Info Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Info Clause</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QConditionInfoClause
	 * @generated
	 */
	EClass getConditionInfoClause();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dbl.QConditionInfoClause#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QConditionInfoClause#getCondition()
	 * @see #getConditionInfoClause()
	 * @generated
	 */
	EAttribute getConditionInfoClause_Condition();

	/**
	 * Returns the meta object for the reference list '{@link org.smeup.sys.db.syntax.dbl.QConditionInfoClause#getConditionItems <em>Condition Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Items</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.QConditionInfoClause#getConditionItems()
	 * @see #getConditionInfoClause()
	 * @generated
	 */
	EReference getConditionInfoClause_ConditionItems();

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
	 * Returns the meta object for enum '{@link org.smeup.sys.db.syntax.dbl.DescriptorScope <em>Descriptor Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Descriptor Scope</em>'.
	 * @see org.smeup.sys.db.syntax.dbl.DescriptorScope
	 * @generated
	 */
	EEnum getDescriptorScope();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl <em>Allocate Descriptor Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getAllocateDescriptorStatement()
		 * @generated
		 */
		EClass ALLOCATE_DESCRIPTOR_STATEMENT = eINSTANCE.getAllocateDescriptorStatement();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = eINSTANCE.getAllocateDescriptorStatement_DescriptorName();

		/**
		 * The meta object literal for the '<em><b>Descriptor Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE = eINSTANCE.getAllocateDescriptorStatement_DescriptorScope();

		/**
		 * The meta object literal for the '<em><b>With Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX = eINSTANCE.getAllocateDescriptorStatement_WithMax();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeallocateDescriptorStatementImpl <em>Deallocate Descriptor Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.DeallocateDescriptorStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeallocateDescriptorStatement()
		 * @generated
		 */
		EClass DEALLOCATE_DESCRIPTOR_STATEMENT = eINSTANCE.getDeallocateDescriptorStatement();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = eINSTANCE.getDeallocateDescriptorStatement_DescriptorName();

		/**
		 * The meta object literal for the '<em><b>Descriptor Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE = eINSTANCE.getDeallocateDescriptorStatement_DescriptorScope();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.DeclareStatementStatementImpl <em>Declare Statement Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.DeclareStatementStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDeclareStatementStatement()
		 * @generated
		 */
		EClass DECLARE_STATEMENT_STATEMENT = eINSTANCE.getDeclareStatementStatement();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_STATEMENT_STATEMENT__STATEMENTS = eINSTANCE.getDeclareStatementStatement_Statements();

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
		 * The meta object literal for the '<em><b>Using</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBE_STATEMENT__USING = eINSTANCE.getDescribeStatement_Using();

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
		 * The meta object literal for the '<em><b>Using</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_STATEMENT__USING = eINSTANCE.getExecuteStatement_Using();

		/**
		 * The meta object literal for the '<em><b>Using Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_STATEMENT__USING_TYPE = eINSTANCE.getExecuteStatement_UsingType();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl <em>Get Descriptor Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getGetDescriptorStatement()
		 * @generated
		 */
		EClass GET_DESCRIPTOR_STATEMENT = eINSTANCE.getGetDescriptorStatement();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = eINSTANCE.getGetDescriptorStatement_DescriptorName();

		/**
		 * The meta object literal for the '<em><b>Descriptor Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE = eINSTANCE.getGetDescriptorStatement_DescriptorScope();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DESCRIPTOR_STATEMENT__INDEX = eINSTANCE.getGetDescriptorStatement_Index();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_DESCRIPTOR_STATEMENT__OPTIONS = eINSTANCE.getGetDescriptorStatement_Options();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.GetDiagnosticsStatementImpl <em>Get Diagnostics Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.GetDiagnosticsStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getGetDiagnosticsStatement()
		 * @generated
		 */
		EClass GET_DIAGNOSTICS_STATEMENT = eINSTANCE.getGetDiagnosticsStatement();

		/**
		 * The meta object literal for the '<em><b>Condition Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_DIAGNOSTICS_STATEMENT__CONDITION_INFO = eINSTANCE.getGetDiagnosticsStatement_ConditionInfo();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.IntoImpl <em>Into</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.IntoImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getInto()
		 * @generated
		 */
		EClass INTO = eINSTANCE.getInto();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTO__DESCRIPTOR_NAME = eINSTANCE.getInto_DescriptorName();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTO__USING = eINSTANCE.getInto_Using();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.UsingImpl <em>Using</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.UsingImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getUsing()
		 * @generated
		 */
		EClass USING = eINSTANCE.getUsing();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USING__DESCRIPTOR_NAME = eINSTANCE.getUsing_DescriptorName();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl <em>Set Descriptor Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getSetDescriptorStatement()
		 * @generated
		 */
		EClass SET_DESCRIPTOR_STATEMENT = eINSTANCE.getSetDescriptorStatement();

		/**
		 * The meta object literal for the '<em><b>Descriptor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME = eINSTANCE.getSetDescriptorStatement_DescriptorName();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_DESCRIPTOR_STATEMENT__INDEX = eINSTANCE.getSetDescriptorStatement_Index();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_DESCRIPTOR_STATEMENT__OPTIONS = eINSTANCE.getSetDescriptorStatement_Options();

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
		 * The meta object literal for the '<em><b>Using</b></em>' attribute list feature.
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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.impl.ConditionInfoClauseImpl <em>Condition Info Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.impl.ConditionInfoClauseImpl
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getConditionInfoClause()
		 * @generated
		 */
		EClass CONDITION_INFO_CLAUSE = eINSTANCE.getConditionInfoClause();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_INFO_CLAUSE__CONDITION = eINSTANCE.getConditionInfoClause_Condition();

		/**
		 * The meta object literal for the '<em><b>Condition Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_INFO_CLAUSE__CONDITION_ITEMS = eINSTANCE.getConditionInfoClause_ConditionItems();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dbl.DescriptorScope <em>Descriptor Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dbl.DescriptorScope
		 * @see org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLPackageImpl#getDescriptorScope()
		 * @generated
		 */
		EEnum DESCRIPTOR_SCOPE = eINSTANCE.getDescriptorScope();

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
