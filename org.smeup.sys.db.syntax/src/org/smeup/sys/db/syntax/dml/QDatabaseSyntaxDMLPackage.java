/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dml;

import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLFactory
 * @model kind="package"
 * @generated
 */
public interface QDatabaseSyntaxDMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/db/syntax/dml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db-syntax-dml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxDMLPackage eINSTANCE = org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQueryExpressionBodyImpl <em>Extended Query Expression Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dml.impl.ExtendedQueryExpressionBodyImpl
	 * @see org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl#getExtendedQueryExpressionBody()
	 * @generated
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__EANNOTATIONS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__NAME = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__DEPENDENCIES = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__DESCRIPTION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__LABEL = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COMMENTS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COMMENTS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__EXTENSIONS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__PRIVILEGES = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__PRIVILEGES;

	/**
	 * The feature id for the '<em><b>Table Joined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_RIGHT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__TABLE_JOINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Table Joined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_LEFT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__TABLE_JOINED_LEFT;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__QUERY_SELECT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__QUERY_SELECT;

	/**
	 * The feature id for the '<em><b>Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__NEST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__NEST;

	/**
	 * The feature id for the '<em><b>Merge Source Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__MERGE_SOURCE_TABLE = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__MERGE_SOURCE_TABLE;

	/**
	 * The feature id for the '<em><b>Column List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COLUMN_LIST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COLUMN_LIST;

	/**
	 * The feature id for the '<em><b>Table Correlation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__TABLE_CORRELATION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__TABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Result Table All Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__RESULT_TABLE_ALL_COLUMNS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__RESULT_TABLE_ALL_COLUMNS;

	/**
	 * The feature id for the '<em><b>Value Expr Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__VALUE_EXPR_COLUMNS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__VALUE_EXPR_COLUMNS;

	/**
	 * The feature id for the '<em><b>Merge Target Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__MERGE_TARGET_TABLE = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__MERGE_TARGET_TABLE;

	/**
	 * The feature id for the '<em><b>Row Fetch Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__ROW_FETCH_LIMIT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__ROW_FETCH_LIMIT;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__QUERY_EXPRESSION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__QUERY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Combined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_LEFT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COMBINED_LEFT;

	/**
	 * The feature id for the '<em><b>Combined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_RIGHT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__COMBINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Predicate Exists</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__PREDICATE_EXISTS = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__PREDICATE_EXISTS;

	/**
	 * The feature id for the '<em><b>Update Source Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__UPDATE_SOURCE_QUERY = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__UPDATE_SOURCE_QUERY;

	/**
	 * The feature id for the '<em><b>With Table Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__WITH_TABLE_SPECIFICATION = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__WITH_TABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Query Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__QUERY_NEST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__QUERY_NEST;

	/**
	 * The feature id for the '<em><b>Sort Spec List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__SORT_SPEC_LIST = SQLQueryModelPackage.QUERY_EXPRESSION_BODY__SORT_SPEC_LIST;

	/**
	 * The feature id for the '<em><b>Optimize Records Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER = SQLQueryModelPackage.QUERY_EXPRESSION_BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Query Expression Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT = SQLQueryModelPackage.QUERY_EXPRESSION_BODY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl <em>Extended Query Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl
	 * @see org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl#getExtendedQuerySelect()
	 * @generated
	 */
	int EXTENDED_QUERY_SELECT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__EANNOTATIONS = EXTENDED_QUERY_EXPRESSION_BODY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__NAME = EXTENDED_QUERY_EXPRESSION_BODY__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__DEPENDENCIES = EXTENDED_QUERY_EXPRESSION_BODY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__DESCRIPTION = EXTENDED_QUERY_EXPRESSION_BODY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__LABEL = EXTENDED_QUERY_EXPRESSION_BODY__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COMMENTS = EXTENDED_QUERY_EXPRESSION_BODY__COMMENTS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__EXTENSIONS = EXTENDED_QUERY_EXPRESSION_BODY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__PRIVILEGES = EXTENDED_QUERY_EXPRESSION_BODY__PRIVILEGES;

	/**
	 * The feature id for the '<em><b>Table Joined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__TABLE_JOINED_RIGHT = EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Table Joined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__TABLE_JOINED_LEFT = EXTENDED_QUERY_EXPRESSION_BODY__TABLE_JOINED_LEFT;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__QUERY_SELECT = EXTENDED_QUERY_EXPRESSION_BODY__QUERY_SELECT;

	/**
	 * The feature id for the '<em><b>Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__NEST = EXTENDED_QUERY_EXPRESSION_BODY__NEST;

	/**
	 * The feature id for the '<em><b>Merge Source Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__MERGE_SOURCE_TABLE = EXTENDED_QUERY_EXPRESSION_BODY__MERGE_SOURCE_TABLE;

	/**
	 * The feature id for the '<em><b>Column List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COLUMN_LIST = EXTENDED_QUERY_EXPRESSION_BODY__COLUMN_LIST;

	/**
	 * The feature id for the '<em><b>Table Correlation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__TABLE_CORRELATION = EXTENDED_QUERY_EXPRESSION_BODY__TABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Result Table All Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__RESULT_TABLE_ALL_COLUMNS = EXTENDED_QUERY_EXPRESSION_BODY__RESULT_TABLE_ALL_COLUMNS;

	/**
	 * The feature id for the '<em><b>Value Expr Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__VALUE_EXPR_COLUMNS = EXTENDED_QUERY_EXPRESSION_BODY__VALUE_EXPR_COLUMNS;

	/**
	 * The feature id for the '<em><b>Merge Target Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__MERGE_TARGET_TABLE = EXTENDED_QUERY_EXPRESSION_BODY__MERGE_TARGET_TABLE;

	/**
	 * The feature id for the '<em><b>Row Fetch Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__ROW_FETCH_LIMIT = EXTENDED_QUERY_EXPRESSION_BODY__ROW_FETCH_LIMIT;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__QUERY_EXPRESSION = EXTENDED_QUERY_EXPRESSION_BODY__QUERY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Combined Left</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COMBINED_LEFT = EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_LEFT;

	/**
	 * The feature id for the '<em><b>Combined Right</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__COMBINED_RIGHT = EXTENDED_QUERY_EXPRESSION_BODY__COMBINED_RIGHT;

	/**
	 * The feature id for the '<em><b>Predicate Exists</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__PREDICATE_EXISTS = EXTENDED_QUERY_EXPRESSION_BODY__PREDICATE_EXISTS;

	/**
	 * The feature id for the '<em><b>Update Source Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__UPDATE_SOURCE_QUERY = EXTENDED_QUERY_EXPRESSION_BODY__UPDATE_SOURCE_QUERY;

	/**
	 * The feature id for the '<em><b>With Table Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__WITH_TABLE_SPECIFICATION = EXTENDED_QUERY_EXPRESSION_BODY__WITH_TABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Query Nest</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__QUERY_NEST = EXTENDED_QUERY_EXPRESSION_BODY__QUERY_NEST;

	/**
	 * The feature id for the '<em><b>Sort Spec List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__SORT_SPEC_LIST = EXTENDED_QUERY_EXPRESSION_BODY__SORT_SPEC_LIST;

	/**
	 * The feature id for the '<em><b>Optimize Records Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__OPTIMIZE_RECORDS_NUMBER = EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__DISTINCT = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__HAVING_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__WHERE_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group By Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Select Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__SELECT_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__FROM_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Into Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT__INTO_CLAUSE = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Extended Query Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_QUERY_SELECT_FEATURE_COUNT = EXTENDED_QUERY_EXPRESSION_BODY_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dml.QExtendedQuerySelect <em>Extended Query Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Query Select</em>'.
	 * @see org.smeup.sys.db.syntax.dml.QExtendedQuerySelect
	 * @generated
	 */
	EClass getExtendedQuerySelect();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody <em>Extended Query Expression Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Query Expression Body</em>'.
	 * @see org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody
	 * @generated
	 */
	EClass getExtendedQueryExpressionBody();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody#getOptimizeRecordsNumber <em>Optimize Records Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimize Records Number</em>'.
	 * @see org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody#getOptimizeRecordsNumber()
	 * @see #getExtendedQueryExpressionBody()
	 * @generated
	 */
	EAttribute getExtendedQueryExpressionBody_OptimizeRecordsNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDatabaseSyntaxDMLFactory getDatabaseSyntaxDMLFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl <em>Extended Query Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl
		 * @see org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl#getExtendedQuerySelect()
		 * @generated
		 */
		EClass EXTENDED_QUERY_SELECT = eINSTANCE.getExtendedQuerySelect();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQueryExpressionBodyImpl <em>Extended Query Expression Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.db.syntax.dml.impl.ExtendedQueryExpressionBodyImpl
		 * @see org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLPackageImpl#getExtendedQueryExpressionBody()
		 * @generated
		 */
		EClass EXTENDED_QUERY_EXPRESSION_BODY = eINSTANCE.getExtendedQueryExpressionBody();

		/**
		 * The meta object literal for the '<em><b>Optimize Records Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_QUERY_EXPRESSION_BODY__OPTIMIZE_RECORDS_NUMBER = eINSTANCE.getExtendedQueryExpressionBody_OptimizeRecordsNumber();

	}

} //QDatabaseSyntaxDMLPackage
