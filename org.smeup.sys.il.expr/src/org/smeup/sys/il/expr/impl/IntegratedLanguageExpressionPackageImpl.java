/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.AssignmentOperator;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QCompoundTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QExpressionVisitor;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageExpressionPackageImpl extends EPackageImpl implements QIntegratedLanguageExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTermExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTermExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assignmentOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum atomicTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

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
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageExpressionPackageImpl() {
		super(eNS_URI, QIntegratedLanguageExpressionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageExpressionPackage init() {
		if (isInited) return (QIntegratedLanguageExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageExpressionPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageExpressionPackageImpl theIntegratedLanguageExpressionPackage = (IntegratedLanguageExpressionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageExpressionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageExpressionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageExpressionPackage.eNS_URI, theIntegratedLanguageExpressionPackage);
		return theIntegratedLanguageExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticExpression_LeftOperand() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArithmeticExpression_Operator() {
		return (EAttribute)arithmeticExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticExpression_RightOperand() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentExpression() {
		return assignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentExpression_LeftOperand() {
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignmentExpression_Operator() {
		return (EAttribute)assignmentExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentExpression_RightOperand() {
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomicTermExpression() {
		return atomicTermExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicTermExpression_Type() {
		return (EAttribute)atomicTermExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanExpression_Operand() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockExpression() {
		return blockExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockExpression_Expression() {
		return (EReference)blockExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundTermExpression() {
		return compoundTermExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundTermExpression_Elements() {
		return (EReference)compoundTermExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionParser() {
		return expressionParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionParserRegistry() {
		return expressionParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionVisitor() {
		return expressionVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalExpression_LeftOperand() {
		return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalExpression_Operator() {
		return (EAttribute)logicalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalExpression_RightOperand() {
		return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateExpression() {
		return predicateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationalExpression_LeftOperand() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationalExpression_Operator() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationalExpression_RightOperand() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTermExpression() {
		return termExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermExpression_Function() {
		return (EAttribute)termExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermExpression_Special() {
		return (EAttribute)termExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermExpression_Value() {
		return (EAttribute)termExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssignmentOperator() {
		return assignmentOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAtomicType() {
		return atomicTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExpressionType() {
		return expressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageExpressionFactory getIntegratedLanguageExpressionFactory() {
		return (QIntegratedLanguageExpressionFactory)getEFactoryInstance();
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
		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__LEFT_OPERAND);
		createEAttribute(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__OPERATOR);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__RIGHT_OPERAND);

		assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__LEFT_OPERAND);
		createEAttribute(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__OPERATOR);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__RIGHT_OPERAND);

		atomicTermExpressionEClass = createEClass(ATOMIC_TERM_EXPRESSION);
		createEAttribute(atomicTermExpressionEClass, ATOMIC_TERM_EXPRESSION__TYPE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__OPERAND);

		blockExpressionEClass = createEClass(BLOCK_EXPRESSION);
		createEReference(blockExpressionEClass, BLOCK_EXPRESSION__EXPRESSION);

		compoundTermExpressionEClass = createEClass(COMPOUND_TERM_EXPRESSION);
		createEReference(compoundTermExpressionEClass, COMPOUND_TERM_EXPRESSION__ELEMENTS);

		expressionEClass = createEClass(EXPRESSION);

		expressionParserEClass = createEClass(EXPRESSION_PARSER);

		expressionParserRegistryEClass = createEClass(EXPRESSION_PARSER_REGISTRY);

		expressionVisitorEClass = createEClass(EXPRESSION_VISITOR);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);
		createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__LEFT_OPERAND);
		createEAttribute(logicalExpressionEClass, LOGICAL_EXPRESSION__OPERATOR);
		createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__RIGHT_OPERAND);

		predicateExpressionEClass = createEClass(PREDICATE_EXPRESSION);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT_OPERAND);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OPERATOR);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT_OPERAND);

		termExpressionEClass = createEClass(TERM_EXPRESSION);
		createEAttribute(termExpressionEClass, TERM_EXPRESSION__FUNCTION);
		createEAttribute(termExpressionEClass, TERM_EXPRESSION__SPECIAL);
		createEAttribute(termExpressionEClass, TERM_EXPRESSION__VALUE);

		// Create enums
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		assignmentOperatorEEnum = createEEnum(ASSIGNMENT_OPERATOR);
		atomicTypeEEnum = createEEnum(ATOMIC_TYPE);
		expressionTypeEEnum = createEEnum(EXPRESSION_TYPE);
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arithmeticExpressionEClass.getESuperTypes().add(this.getExpression());
		assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
		atomicTermExpressionEClass.getESuperTypes().add(this.getTermExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		blockExpressionEClass.getESuperTypes().add(this.getExpression());
		compoundTermExpressionEClass.getESuperTypes().add(this.getTermExpression());
		expressionEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNode());
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getExpressionParser());
		g1.getETypeArguments().add(g2);
		expressionParserRegistryEClass.getEGenericSuperTypes().add(g1);
		logicalExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		predicateExpressionEClass.getESuperTypes().add(this.getExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		termExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(arithmeticExpressionEClass, QArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, QArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticExpression_Operator(), this.getArithmeticOperator(), "operator", null, 1, 1, QArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, QArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentExpressionEClass, QAssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentExpression_LeftOperand(), this.getTermExpression(), null, "leftOperand", null, 1, 1, QAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignmentExpression_Operator(), this.getAssignmentOperator(), "operator", null, 1, 1, QAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, QAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicTermExpressionEClass, QAtomicTermExpression.class, "AtomicTermExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicTermExpression_Type(), this.getAtomicType(), "type", null, 1, 1, QAtomicTermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, QBooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, QBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockExpressionEClass, QBlockExpression.class, "BlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, QBlockExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundTermExpressionEClass, QCompoundTermExpression.class, "CompoundTermExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundTermExpression_Elements(), this.getExpression(), null, "elements", null, 0, -1, QCompoundTermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, QExpression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(expressionEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExpressionVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(expressionEClass, this.getExpressionType(), "getExpressionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionParserEClass, QExpressionParser.class, "ExpressionParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(expressionParserEClass, this.getExpression(), "parseExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionParserEClass, this.getArithmeticExpression(), "parseArithmetic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionParserEClass, this.getAssignmentExpression(), "parseAssignment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionParserEClass, this.getPredicateExpression(), "parsePredicate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionParserEClass, this.getTermExpression(), "parseTerm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionParserRegistryEClass, QExpressionParserRegistry.class, "ExpressionParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionVisitorEClass, QExpressionVisitor.class, "ExpressionVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getArithmeticExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignmentExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAtomicTermExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBlockExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBooleanExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompoundTermExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLogicalExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelationalExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getArithmeticExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignmentExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAtomicTermExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBlockExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBooleanExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompoundTermExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLogicalExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(expressionVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelationalExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(logicalExpressionEClass, QLogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, QLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalExpression_Operator(), this.getLogicalOperator(), "operator", null, 0, 1, QLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, QLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateExpressionEClass, QPredicateExpression.class, "PredicateExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionEClass, QRelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, QRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalExpression_Operator(), this.getRelationalOperator(), "operator", null, 1, 1, QRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, QRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termExpressionEClass, QTermExpression.class, "TermExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermExpression_Function(), ecorePackage.getEBoolean(), "function", null, 0, 1, QTermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermExpression_Special(), ecorePackage.getEBoolean(), "special", null, 0, 1, QTermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermExpression_Value(), ecorePackage.getEString(), "value", "", 0, 1, QTermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.PLUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MINUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULT);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVIDE);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MODULAR);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.POWER);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.SIGN_MINUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.SIGN_PLUS);

		initEEnum(assignmentOperatorEEnum, AssignmentOperator.class, "AssignmentOperator");
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.ASSIGN);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.PLUS_ASSIGN);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.MINUS_ASSIGN);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.TIMES_ASSIGN);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.DIVIDE_ASSIGN);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.POWER_ASSIGN);

		initEEnum(atomicTypeEEnum, AtomicType.class, "AtomicType");
		addEEnumLiteral(atomicTypeEEnum, AtomicType.BOOLEAN);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.DATETIME);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.FLOATING);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.HEXADECIMAL);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.INDICATOR);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.INTEGER);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.NAME);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.SPECIAL);
		addEEnumLiteral(atomicTypeEEnum, AtomicType.STRING);

		initEEnum(expressionTypeEEnum, ExpressionType.class, "ExpressionType");
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ARITHMETIC);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ASSIGNMENT);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.LOGICAL);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.RELATIONAL);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.BOOLEAN);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ATOMIC);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.COMPOUND);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.BLOCK);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NOT);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NOT_EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN_EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageExpressionPackageImpl
