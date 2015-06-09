/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.il.expr.base;

import org.antlr.runtime.tree.Tree;
import org.smeup.sys.il.expr.AssignmentOperator;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QCompoundTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;

public class BaseExpressionBuilder {

	private BaseExpressionHelper expressionHelper;

	private static final String[] ASS_STR_OP = { "**=", "*=", "+=", "-=", "/=", "=" };
	private static final AssignmentOperator[] ASS_OP = { AssignmentOperator.POWER_ASSIGN, AssignmentOperator.TIMES_ASSIGN, AssignmentOperator.PLUS_ASSIGN, AssignmentOperator.MINUS_ASSIGN,
		AssignmentOperator.DIVIDE_ASSIGN, AssignmentOperator.ASSIGN };

	public BaseExpressionBuilder(BaseExpressionHelper expressionHelper) {
		this.expressionHelper = expressionHelper;
	}

	public QExpression buildAsExpression(String expression) throws IntegratedLanguageExpressionRuntimeException {

		QExpression qExpression = null;

		Tree tree = this.expressionHelper.parse(expression);
		switch (this.expressionHelper.getExpressionType(tree)) {
		case ARITHMETIC:
			return buildAsArithmetic(tree);
		case ASSIGNMENT:
			return buildAsAssignment(expression);
		case ATOMIC:
		case COMPOUND:
			return buildAsTerm(tree);
		case BLOCK:
			return buildAsBlock(tree);
		case BOOLEAN:
		case LOGICAL:
		case RELATIONAL:
			return buildAsPredicate(tree);
		}

		return qExpression;
	}

	public QAssignmentExpression buildAsAssignment(String expression) throws IntegratedLanguageExpressionRuntimeException {

		QAssignmentExpression ast = QIntegratedLanguageExpressionFactory.eINSTANCE.createAssignmentExpression();

		String leftString = null;
		String rightString = null;

		// operator
		boolean found = false;
		for (int i = 0; i < ASS_STR_OP.length; i++) {

			int p = expression.indexOf(ASS_STR_OP[i]);

			if (p > 0) {
				ast.setOperator(ASS_OP[i]);

				leftString = expression.substring(0, p);
				rightString = expression.substring(p + ASS_STR_OP[i].length());

				found = true;

				break;
			}
		}

		if (!found)
			throw new IntegratedLanguageExpressionRuntimeException("Attempted to analyze as assignment an incompatible expression");

		// TODO remove and change parser
		if (leftString.startsWith("&"))
			leftString = removeFirstChar(leftString);

		// left side
		QTermExpression leftExpression = buildAsTerm(leftString);
		ast.setLeftOperand(leftExpression);

		// TODO remove and change parser
		if (rightString.startsWith("&"))
			rightString = removeFirstChar(rightString);

		Tree rightAntAst = expressionHelper.parse(rightString);
		ExpressionType rightExpType = expressionHelper.getExpressionType(rightAntAst);

		if (rightExpType == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid assignment expression: " + expression);

		QExpression rightExpression = null;

		// right side
		switch (rightExpType) {
		case ASSIGNMENT:
			throw new IntegratedLanguageExpressionRuntimeException("Invalid assignment expression: " + expression);
		case ARITHMETIC:
			rightExpression = buildAsArithmetic(rightAntAst);
			break;
		case ATOMIC:
		case COMPOUND:
			rightExpression = buildAsTerm(rightAntAst);
			break;
		case BLOCK:
			rightExpression = buildAsBlock(rightAntAst);
			break;
		case LOGICAL:
			rightExpression = buildAsPredicate(rightAntAst);
			break;
		case RELATIONAL:
			rightExpression = buildAsPredicate(rightAntAst);
			break;
		case BOOLEAN:
			rightExpression = buildAsPredicate(rightAntAst);
			break;
		}

		ast.setRightOperand(rightExpression);

		return ast;
	}

	public QPredicateExpression buildAsPredicate(String expression) throws IntegratedLanguageExpressionRuntimeException {

		Tree antAst = expressionHelper.parse(expression);
		QPredicateExpression predicateExpression = buildAsPredicate(antAst);

		return predicateExpression;
	}

	private QPredicateExpression buildAsPredicate(Tree node) throws IntegratedLanguageExpressionRuntimeException {

		switch (expressionHelper.getExpressionType(node)) {
		case ARITHMETIC:
		case ASSIGNMENT:
			throw new IntegratedLanguageExpressionRuntimeException("Attempted to analyze as predicate an incompatible expression: " + node);
		case BLOCK:
			return buildAsPredicate(node.getChild(0));
		case ATOMIC:
			QTermExpression termExpression = (QTermExpression) buildChildExpression(node);
			QBooleanExpression booleanExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBooleanExpression();
			booleanExpression.setOperand(termExpression);

			return booleanExpression;
		case COMPOUND:
			termExpression = (QTermExpression) buildChildExpression(node);
			booleanExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBooleanExpression();
			booleanExpression.setOperand(termExpression);

			return booleanExpression;
		case LOGICAL:
			return (QPredicateExpression) buildChildExpression(node);
		case RELATIONAL:
			return (QPredicateExpression) buildChildExpression(node);
		case BOOLEAN:
			return (QPredicateExpression) buildChildExpression(node);
		}

		throw new IntegratedLanguageExpressionRuntimeException("Attempted to analyze as predicate an incompatible expression: " + node);
	}

	public QArithmeticExpression buildAsArithmetic(String expression) throws IntegratedLanguageExpressionRuntimeException {

		Tree antAst = expressionHelper.parse(expression);
		return buildAsArithmetic(antAst);
	}

	public QArithmeticExpression buildAsArithmetic(Tree node) {

		switch (expressionHelper.getExpressionType(node)) {
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
		case ASSIGNMENT:
		case ATOMIC:
		case COMPOUND:
			throw new IntegratedLanguageExpressionRuntimeException("Attempted to analyze as arithmetic an incompatible expression: " + node);

		case ARITHMETIC:
			return (QArithmeticExpression) buildChildExpression(node);
		case BLOCK:
			return (QArithmeticExpression) buildAsBlock(node.getChild(0));
		}

		return null;
	}

	public QBlockExpression buildAsBlock(Tree node) {

		switch (expressionHelper.getExpressionType(node)) {
		case ARITHMETIC:
		case ASSIGNMENT:
		case ATOMIC:
		case COMPOUND:
		case LOGICAL:
		case RELATIONAL:
		case BOOLEAN:
			throw new IntegratedLanguageExpressionRuntimeException("Invalid block expression: " + node);
		case BLOCK:
			return (QBlockExpression) buildChildExpression(node);
		}

		throw new IntegratedLanguageExpressionRuntimeException("Attempted to analyze as block an incompatible expression: " + node);
	}

	public QTermExpression buildAsTerm(String expression) throws IntegratedLanguageExpressionRuntimeException {

		Tree antAst = expressionHelper.parse(expression);
		QTermExpression ast = buildAsTerm(antAst);

		return ast;
	}

	private QTermExpression buildAsTerm(Tree node) throws IntegratedLanguageExpressionRuntimeException {

		switch (expressionHelper.getExpressionType(node)) {
		case ARITHMETIC:
		case ASSIGNMENT:
		case LOGICAL:
		case RELATIONAL:
		case BLOCK:
			throw new IntegratedLanguageExpressionRuntimeException("Attempted to analyze as term an incompatible expression: " + node);

		case ATOMIC:
			return (QTermExpression) buildChildExpression(node);
		case COMPOUND:
			return (QTermExpression) buildChildExpression(node);
		case BOOLEAN:

			QTermExpression booleanExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createAtomicTermExpression();
			booleanExpression.setValue(node.getText());
			return booleanExpression;

		}

		throw new IntegratedLanguageExpressionRuntimeException("Invalid term expression: " + node);
	}

	public QExpression buildChildExpression(Tree node) {

		QExpression expression = null;

		ExpressionType expressionType = expressionHelper.getExpressionType(node);
		switch (expressionType) {
		case ARITHMETIC:
			QArithmeticExpression arithmeticExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createArithmeticExpression();

			if (node.getChild(0) != null)
				arithmeticExpression.setLeftOperand(buildChildExpression(node.getChild(0)));
			arithmeticExpression.setOperator(expressionHelper.getArithmeticOperator(node));
			if (node.getChild(1) != null)
				arithmeticExpression.setRightOperand(buildChildExpression(node.getChild(1)));

			expression = arithmeticExpression;
			break;

		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createAtomicTermExpression();

			atomicTermExpression.setType(expressionHelper.getTermType(node));
			atomicTermExpression.setFunction(expressionHelper.isFunction(node));
			atomicTermExpression.setSpecial(expressionHelper.isSpecial(node));
			String text = expressionHelper.normalizeText(node.getText());
			atomicTermExpression.setValue(text);

			expression = atomicTermExpression;
			break;
		case BLOCK:
			QBlockExpression blockExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBlockExpression();

			if (node.getChildCount() > 0)
				blockExpression.setExpression(buildChildExpression(node.getChild(0)));

			expression = blockExpression;
			break;
		case COMPOUND:
			QCompoundTermExpression compoundTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createCompoundTermExpression();

			compoundTermExpression.setFunction(expressionHelper.isFunction(node));
			compoundTermExpression.setSpecial(expressionHelper.isSpecial(node));
			compoundTermExpression.setValue(expressionHelper.getFunctionName(node));

			for (int i = 0; i < node.getChildCount(); i++)
				compoundTermExpression.getElements().add(buildChildExpression(node.getChild(i)));

			expression = compoundTermExpression;
			break;
		case LOGICAL:
			QLogicalExpression logicalExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createLogicalExpression();

			if (node.getChild(0) != null)
				logicalExpression.setLeftOperand(buildChildExpression(node.getChild(0)));
			logicalExpression.setOperator(expressionHelper.getLogicalOperator(node));
			if (node.getChild(1) != null)
				logicalExpression.setRightOperand(buildChildExpression(node.getChild(1)));

			expression = logicalExpression;
			break;
		case RELATIONAL:
			QRelationalExpression relationalExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createRelationalExpression();

			if (node.getChild(0) != null)
				relationalExpression.setLeftOperand(buildChildExpression(node.getChild(0)));
			relationalExpression.setOperator(expressionHelper.getRelationalOperator(node));
			if (node.getChild(1) != null)
				relationalExpression.setRightOperand(buildChildExpression(node.getChild(1)));

			expression = relationalExpression;
			break;
		case BOOLEAN:
			QBooleanExpression booleanExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBooleanExpression();
			if (node.getChild(0) != null)
				booleanExpression.setOperand(buildChildExpression(node.getChild(0)));
			else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid AST node: " + node);
		case ASSIGNMENT:
			throw new IntegratedLanguageExpressionRuntimeException("Invalid AST node: " + node);
		}

		return expression;
	}

	public static String removeFirstChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(1);
	}
}