/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QQualifiedTermExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.RelationalOperator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntegratedLanguageExpressionFactoryImpl extends EFactoryImpl implements QIntegratedLanguageExpressionFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static QIntegratedLanguageExpressionFactory init() {
		try {
			QIntegratedLanguageExpressionFactory theIntegratedLanguageExpressionFactory = (QIntegratedLanguageExpressionFactory) EPackage.Registry.INSTANCE
					.getEFactory(QIntegratedLanguageExpressionPackage.eNS_URI);
			if (theIntegratedLanguageExpressionFactory != null)
				return theIntegratedLanguageExpressionFactory;
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegratedLanguageExpressionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QIntegratedLanguageExpressionPackage.ARITHMETIC_EXPRESSION:
			return (EObject) createArithmeticExpression();
		case QIntegratedLanguageExpressionPackage.ASSIGNMENT_EXPRESSION:
			return (EObject) createAssignmentExpression();
		case QIntegratedLanguageExpressionPackage.ATOMIC_TERM_EXPRESSION:
			return (EObject) createAtomicTermExpression();
		case QIntegratedLanguageExpressionPackage.BOOLEAN_EXPRESSION:
			return (EObject) createBooleanExpression();
		case QIntegratedLanguageExpressionPackage.BLOCK_EXPRESSION:
			return (EObject) createBlockExpression();
		case QIntegratedLanguageExpressionPackage.FUNCTION_TERM_EXPRESSION:
			return (EObject) createFunctionTermExpression();
		case QIntegratedLanguageExpressionPackage.LOGICAL_EXPRESSION:
			return (EObject) createLogicalExpression();
		case QIntegratedLanguageExpressionPackage.QUALIFIED_TERM_EXPRESSION:
			return (EObject) createQualifiedTermExpression();
		case QIntegratedLanguageExpressionPackage.RELATIONAL_EXPRESSION:
			return (EObject) createRelationalExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QIntegratedLanguageExpressionPackage.ARITHMETIC_OPERATOR:
			return createArithmeticOperatorFromString(eDataType, initialValue);
		case QIntegratedLanguageExpressionPackage.ASSIGNMENT_OPERATOR:
			return createAssignmentOperatorFromString(eDataType, initialValue);
		case QIntegratedLanguageExpressionPackage.ATOMIC_TYPE:
			return createAtomicTypeFromString(eDataType, initialValue);
		case QIntegratedLanguageExpressionPackage.EXPRESSION_TYPE:
			return createExpressionTypeFromString(eDataType, initialValue);
		case QIntegratedLanguageExpressionPackage.LOGICAL_OPERATOR:
			return createLogicalOperatorFromString(eDataType, initialValue);
		case QIntegratedLanguageExpressionPackage.RELATIONAL_OPERATOR:
			return createRelationalOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QIntegratedLanguageExpressionPackage.ARITHMETIC_OPERATOR:
			return convertArithmeticOperatorToString(eDataType, instanceValue);
		case QIntegratedLanguageExpressionPackage.ASSIGNMENT_OPERATOR:
			return convertAssignmentOperatorToString(eDataType, instanceValue);
		case QIntegratedLanguageExpressionPackage.ATOMIC_TYPE:
			return convertAtomicTypeToString(eDataType, instanceValue);
		case QIntegratedLanguageExpressionPackage.EXPRESSION_TYPE:
			return convertExpressionTypeToString(eDataType, instanceValue);
		case QIntegratedLanguageExpressionPackage.LOGICAL_OPERATOR:
			return convertLogicalOperatorToString(eDataType, instanceValue);
		case QIntegratedLanguageExpressionPackage.RELATIONAL_OPERATOR:
			return convertRelationalOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QAssignmentExpression createAssignmentExpression() {
		AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QAtomicTermExpression createAtomicTermExpression() {
		AtomicTermExpressionImpl atomicTermExpression = new AtomicTermExpressionImpl();
		return atomicTermExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QBooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QBlockExpression createBlockExpression() {
		BlockExpressionImpl blockExpression = new BlockExpressionImpl();
		return blockExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QFunctionTermExpression createFunctionTermExpression() {
		FunctionTermExpressionImpl functionTermExpression = new FunctionTermExpressionImpl();
		return functionTermExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QLogicalExpression createLogicalExpression() {
		LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QQualifiedTermExpression createQualifiedTermExpression() {
		QualifiedTermExpressionImpl qualifiedTermExpression = new QualifiedTermExpressionImpl();
		return qualifiedTermExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QRelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssignmentOperator createAssignmentOperatorFromString(EDataType eDataType, String initialValue) {
		AssignmentOperator result = AssignmentOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssignmentOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AtomicType createAtomicTypeFromString(EDataType eDataType, String initialValue) {
		AtomicType result = AtomicType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAtomicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionType createExpressionTypeFromString(EDataType eDataType, String initialValue) {
		ExpressionType result = ExpressionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QIntegratedLanguageExpressionPackage getIntegratedLanguageExpressionPackage() {
		return (QIntegratedLanguageExpressionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageExpressionPackage getPackage() {
		return QIntegratedLanguageExpressionPackage.eINSTANCE;
	}

} // IntegratedLanguageExpressionFactoryImpl
