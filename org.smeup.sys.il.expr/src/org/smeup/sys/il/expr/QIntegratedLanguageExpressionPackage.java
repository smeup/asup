/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/expr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-expr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageExpressionPackage eINSTANCE = org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.RelationalExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.ArithmeticOperator
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 18;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.ExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__FACETS = QIntegratedLanguageCorePackage.NODE__FACETS;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.AssignmentExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAssignmentExpression()
	 * @generated
	 */
	int ASSIGNMENT_EXPRESSION = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.QExpressionParser <em>Expression Parser</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.QExpressionParser
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionParser()
	 * @generated
	 */
	int EXPRESSION_PARSER = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.ExpressionVisitorImpl <em>Expression Visitor</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.ExpressionVisitorImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionVisitor()
	 * @generated
	 */
	int EXPRESSION_VISITOR = 11;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.PredicateExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getPredicateExpression()
	 * @generated
	 */
	int PREDICATE_EXPRESSION = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.LogicalExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 13;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.TermExpressionImpl <em>Term Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.TermExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getTermExpression()
	 * @generated
	 */
	int TERM_EXPRESSION = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.AtomicTermExpressionImpl <em>Atomic Term Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.AtomicTermExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAtomicTermExpression()
	 * @generated
	 */
	int ATOMIC_TERM_EXPRESSION = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.CompoundTermExpressionImpl <em>Compound Term Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.CompoundTermExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getCompoundTermExpression()
	 * @generated
	 */
	int COMPOUND_TERM_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__FACETS = EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__FACETS = EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_EXPRESSION__FACETS = EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERM_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION__FACETS = TERM_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION__VALUE = TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION__TYPE = TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Term Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION_FEATURE_COUNT = TERM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__FACETS = EXPRESSION__FACETS;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.BlockExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getBlockExpression()
	 * @generated
	 */
	int BLOCK_EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Predicate Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.BooleanExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__FACETS = PREDICATE_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__FACETS = EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION__FACETS = TERM_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION__VALUE = TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION__ELEMENTS = TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Term Expression</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION_FEATURE_COUNT = TERM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Parser</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.QExpressionParserRegistry <em>Expression Parser Registry</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.QExpressionParserRegistry
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionParserRegistry()
	 * @generated
	 */
	int EXPRESSION_PARSER_REGISTRY = 8;

	/**
	 * The number of structural features of the '<em>Expression Parser Registry</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARSER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.QExpressionWriter <em>Expression Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.expr.QExpressionWriter
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionWriter()
	 * @generated
	 */
	int EXPRESSION_WRITER = 9;

	/**
	 * The number of structural features of the '<em>Expression Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_WRITER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.QExpressionWriterRegistry <em>Expression Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.expr.QExpressionWriterRegistry
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionWriterRegistry()
	 * @generated
	 */
	int EXPRESSION_WRITER_REGISTRY = 10;

	/**
	 * The number of structural features of the '<em>Expression Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_WRITER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Visitor</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.FunctionTermExpressionImpl <em>Function Term Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.FunctionTermExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getFunctionTermExpression()
	 * @generated
	 */
	int FUNCTION_TERM_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION__FACETS = COMPOUND_TERM_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION__VALUE = COMPOUND_TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION__ELEMENTS = COMPOUND_TERM_EXPRESSION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Function Term Expression</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION_FEATURE_COUNT = COMPOUND_TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__FACETS = PREDICATE_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__LEFT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OPERATOR = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__RIGHT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.impl.QualifiedTermExpressionImpl <em>Qualified Term Expression</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.impl.QualifiedTermExpressionImpl
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getQualifiedTermExpression()
	 * @generated
	 */
	int QUALIFIED_TERM_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION__FACETS = COMPOUND_TERM_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION__VALUE = COMPOUND_TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION__ELEMENTS = COMPOUND_TERM_EXPRESSION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Qualified Term Expression</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION_FEATURE_COUNT = COMPOUND_TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__FACETS = PREDICATE_EXPRESSION__FACETS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.AssignmentOperator <em>Assignment Operator</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.AssignmentOperator
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 19;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.AtomicType
	 * <em>Atomic Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.expr.AtomicType
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAtomicType()
	 * @generated
	 */
	int ATOMIC_TYPE = 20;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.ExpressionType <em>Expression Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.ExpressionType
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.LogicalOperator
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.expr.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.expr.RelationalOperator
	 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 23;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see org.smeup.sys.il.expr.QArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.expr.QArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.smeup.sys.il.expr.QArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QArithmeticExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.smeup.sys.il.expr.QArithmeticExpression#getLeftOperand()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QArithmeticExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.smeup.sys.il.expr.QArithmeticExpression#getRightOperand()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QAssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Assignment Expression</em>'.
	 * @see org.smeup.sys.il.expr.QAssignmentExpression
	 * @generated
	 */
	EClass getAssignmentExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.expr.QAssignmentExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.smeup.sys.il.expr.QAssignmentExpression#getOperator()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EAttribute getAssignmentExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QAssignmentExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.smeup.sys.il.expr.QAssignmentExpression#getLeftOperand()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QAssignmentExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.smeup.sys.il.expr.QAssignmentExpression#getRightOperand()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QAtomicTermExpression <em>Atomic Term Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Atomic Term Expression</em>'.
	 * @see org.smeup.sys.il.expr.QAtomicTermExpression
	 * @generated
	 */
	EClass getAtomicTermExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.expr.QAtomicTermExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.expr.QAtomicTermExpression#getType()
	 * @see #getAtomicTermExpression()
	 * @generated
	 */
	EAttribute getAtomicTermExpression_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.expr.QBooleanExpression
	 * <em>Boolean Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.smeup.sys.il.expr.QBooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QBooleanExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.smeup.sys.il.expr.QBooleanExpression#getOperand()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QBlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Expression</em>'.
	 * @see org.smeup.sys.il.expr.QBlockExpression
	 * @generated
	 */
	EClass getBlockExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QBlockExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.smeup.sys.il.expr.QBlockExpression#getExpression()
	 * @see #getBlockExpression()
	 * @generated
	 */
	EReference getBlockExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QCompoundTermExpression <em>Compound Term Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Compound Term Expression</em>'.
	 * @see org.smeup.sys.il.expr.QCompoundTermExpression
	 * @generated
	 */
	EClass getCompoundTermExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.expr.QCompoundTermExpression#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.smeup.sys.il.expr.QCompoundTermExpression#getElements()
	 * @see #getCompoundTermExpression()
	 * @generated
	 */
	EReference getCompoundTermExpression_Elements();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.expr.QExpression <em>Expression</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.smeup.sys.il.expr.QExpression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.expr.QExpressionParser
	 * <em>Expression Parser</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Expression Parser</em>'.
	 * @see org.smeup.sys.il.expr.QExpressionParser
	 * @generated
	 */
	EClass getExpressionParser();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QExpressionParserRegistry <em>Expression Parser Registry</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Expression Parser Registry</em>'.
	 * @see org.smeup.sys.il.expr.QExpressionParserRegistry
	 * @generated
	 */
	EClass getExpressionParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QExpressionWriter <em>Expression Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Writer</em>'.
	 * @see org.smeup.sys.il.expr.QExpressionWriter
	 * @generated
	 */
	EClass getExpressionWriter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QExpressionWriterRegistry <em>Expression Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Writer Registry</em>'.
	 * @see org.smeup.sys.il.expr.QExpressionWriterRegistry
	 * @generated
	 */
	EClass getExpressionWriterRegistry();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.expr.QExpressionVisitor
	 * <em>Expression Visitor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Expression Visitor</em>'.
	 * @see org.smeup.sys.il.expr.QExpressionVisitor
	 * @generated
	 */
	EClass getExpressionVisitor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QFunctionTermExpression <em>Function Term Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Function Term Expression</em>'.
	 * @see org.smeup.sys.il.expr.QFunctionTermExpression
	 * @generated
	 */
	EClass getFunctionTermExpression();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.expr.QLogicalExpression
	 * <em>Logical Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see org.smeup.sys.il.expr.QLogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.expr.QLogicalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.smeup.sys.il.expr.QLogicalExpression#getOperator()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QLogicalExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.smeup.sys.il.expr.QLogicalExpression#getLeftOperand()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QLogicalExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.smeup.sys.il.expr.QLogicalExpression#getRightOperand()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QPredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expression</em>'.
	 * @see org.smeup.sys.il.expr.QPredicateExpression
	 * @generated
	 */
	EClass getPredicateExpression();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QQualifiedTermExpression <em>Qualified Term Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Qualified Term Expression</em>'.
	 * @see org.smeup.sys.il.expr.QQualifiedTermExpression
	 * @generated
	 */
	EClass getQualifiedTermExpression();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QRelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see org.smeup.sys.il.expr.QRelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.expr.QRelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.smeup.sys.il.expr.QRelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QRelationalExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.smeup.sys.il.expr.QRelationalExpression#getLeftOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.expr.QRelationalExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.smeup.sys.il.expr.QRelationalExpression#getRightOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.expr.QTermExpression <em>Term Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Expression</em>'.
	 * @see org.smeup.sys.il.expr.QTermExpression
	 * @generated
	 */
	EClass getTermExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.expr.QTermExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.il.expr.QTermExpression#getValue()
	 * @see #getTermExpression()
	 * @generated
	 */
	EAttribute getTermExpression_Value();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.expr.ArithmeticOperator
	 * <em>Arithmetic Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see org.smeup.sys.il.expr.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.expr.AssignmentOperator
	 * <em>Assignment Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Assignment Operator</em>'.
	 * @see org.smeup.sys.il.expr.AssignmentOperator
	 * @generated
	 */
	EEnum getAssignmentOperator();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.expr.AtomicType <em>Atomic Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Atomic Type</em>'.
	 * @see org.smeup.sys.il.expr.AtomicType
	 * @generated
	 */
	EEnum getAtomicType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.expr.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Type</em>'.
	 * @see org.smeup.sys.il.expr.ExpressionType
	 * @generated
	 */
	EEnum getExpressionType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.expr.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see org.smeup.sys.il.expr.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.expr.RelationalOperator
	 * <em>Relational Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see org.smeup.sys.il.expr.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageExpressionFactory getIntegratedLanguageExpressionFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.ArithmeticExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__LEFT_OPERAND = eINSTANCE.getArithmeticExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getArithmeticExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.AssignmentExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAssignmentExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_EXPRESSION__OPERATOR = eINSTANCE.getAssignmentExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__LEFT_OPERAND = eINSTANCE.getAssignmentExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getAssignmentExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.AtomicTermExpressionImpl <em>Atomic Term Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.AtomicTermExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAtomicTermExpression()
		 * @generated
		 */
		EClass ATOMIC_TERM_EXPRESSION = eINSTANCE.getAtomicTermExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TERM_EXPRESSION__TYPE = eINSTANCE.getAtomicTermExpression_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.BooleanExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__OPERAND = eINSTANCE.getBooleanExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.BlockExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getBlockExpression()
		 * @generated
		 */
		EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_EXPRESSION__EXPRESSION = eINSTANCE.getBlockExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.CompoundTermExpressionImpl <em>Compound Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.CompoundTermExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getCompoundTermExpression()
		 * @generated
		 */
		EClass COMPOUND_TERM_EXPRESSION = eINSTANCE.getCompoundTermExpression();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TERM_EXPRESSION__ELEMENTS = eINSTANCE.getCompoundTermExpression_Elements();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.ExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.QExpressionParser <em>Expression Parser</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.QExpressionParser
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionParser()
		 * @generated
		 */
		EClass EXPRESSION_PARSER = eINSTANCE.getExpressionParser();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.QExpressionParserRegistry <em>Expression Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.QExpressionParserRegistry
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionParserRegistry()
		 * @generated
		 */
		EClass EXPRESSION_PARSER_REGISTRY = eINSTANCE.getExpressionParserRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.QExpressionWriter <em>Expression Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.QExpressionWriter
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionWriter()
		 * @generated
		 */
		EClass EXPRESSION_WRITER = eINSTANCE.getExpressionWriter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.QExpressionWriterRegistry <em>Expression Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.QExpressionWriterRegistry
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionWriterRegistry()
		 * @generated
		 */
		EClass EXPRESSION_WRITER_REGISTRY = eINSTANCE.getExpressionWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.ExpressionVisitorImpl <em>Expression Visitor</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.ExpressionVisitorImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionVisitor()
		 * @generated
		 */
		EClass EXPRESSION_VISITOR = eINSTANCE.getExpressionVisitor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.FunctionTermExpressionImpl <em>Function Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.FunctionTermExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getFunctionTermExpression()
		 * @generated
		 */
		EClass FUNCTION_TERM_EXPRESSION = eINSTANCE.getFunctionTermExpression();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.LogicalExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__OPERATOR = eINSTANCE.getLogicalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getLogicalExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getLogicalExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.PredicateExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getPredicateExpression()
		 * @generated
		 */
		EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.QualifiedTermExpressionImpl <em>Qualified Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.QualifiedTermExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getQualifiedTermExpression()
		 * @generated
		 */
		EClass QUALIFIED_TERM_EXPRESSION = eINSTANCE.getQualifiedTermExpression();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.RelationalExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getRelationalExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getRelationalExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.impl.TermExpressionImpl <em>Term Expression</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.impl.TermExpressionImpl
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getTermExpression()
		 * @generated
		 */
		EClass TERM_EXPRESSION = eINSTANCE.getTermExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_EXPRESSION__VALUE = eINSTANCE.getTermExpression_Value();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.ArithmeticOperator
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.AssignmentOperator <em>Assignment Operator</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.AssignmentOperator
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.AtomicType <em>Atomic Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.AtomicType
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getAtomicType()
		 * @generated
		 */
		EEnum ATOMIC_TYPE = eINSTANCE.getAtomicType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.ExpressionType <em>Expression Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.expr.ExpressionType
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getExpressionType()
		 * @generated
		 */
		EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.LogicalOperator
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.expr.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.expr.RelationalOperator
		 * @see org.smeup.sys.il.expr.impl.IntegratedLanguageExpressionPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

	}

} // QIntegratedLanguageExpressionPackage
