/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import java.nio.Buffer;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.term.DataTermType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;

	@Override
	public boolean visit(QMethodExec statement) {

		if (statement.getObject() == null)
			return super.visit(statement);

		QTermExpression termExpression = expressionParser.parseTerm(statement.getObject());

		QNamedNode namedNode = compilationUnit.getNamedNode(termExpression.getValue(), true);
		if (namedNode == null)
			return super.visit(statement);

		if (!(namedNode instanceof QDataTerm<?>))
			return super.visit(statement);

		QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

		// unary
		if (dataTerm.getDataTermType().isUnary())
			return super.visit(statement);

		if (!statement.getMethod().equals("sum"))
			return super.visit(statement);

		statement.setMethod("%xfoot");
		statement.getParameters().add(0, statement.getObject());
		statement.setObject(null);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QEval statement) {

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());

		// function
		QTermExpression leftExpression = assignmentExpression.getLeftOperand();

		QDataTerm<?> dataTerm = null;

		if (leftExpression.getExpressionType() == ExpressionType.FUNCTION) {

			dataTerm = compilationUnit.getMethod(leftExpression.getValue());

			// first parameter as object method
			if (dataTerm != null) {
				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit((QFunctionTermExpression) leftExpression);
				assignmentExpression.setLeftOperand((QTermExpression) expressionParser.parseExpression(expressionStringBuilder.getResult()));

				expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(assignmentExpression);
				statement.setAssignment(expressionStringBuilder.getResult());

				return true;
			}

		}

		if(dataTerm == null)
			dataTerm = compilationUnit.getPrototype(leftExpression.getValue(), true);
		
		if (dataTerm == null)
			dataTerm = compilationUnit.getDataTerm(leftExpression.getValue(), true);

		if (dataTerm == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid data term: " + leftExpression.getValue());

		// unary
		if (dataTerm.getDataTermType().isUnary())
			return false;

		// multiple
		QExpression rightExpression = assignmentExpression.getRightOperand();
		switch (rightExpression.getExpressionType()) {
		case ARITHMETIC:
			QArithmeticExpression arithmeticExpression = (QArithmeticExpression) rightExpression;

			/*
			 * String result =
			 * normalizeArithmeticExpression(arithmeticExpression); if (result
			 * != null) { RPJExpressionStringBuilder expressionStringBuilder =
			 * new RPJExpressionStringBuilder();
			 * expressionStringBuilder.visit(assignmentExpression);
			 * statement.setAssignment(expressionStringBuilder.getResult());
			 * 
			 * statement.setAssignment(value); }
			 */

			// Mirandola
			// array element
			// if (leftExpression.isFunction())
			// return false;

			if (dataTerm.getDataTermType() == DataTermType.MULTIPLE_ATOMIC) {

				Class<?> argumentClass = ((QMultipleAtomicDataDef<?>) dataTerm.getDefinition()).getArgument().getJavaClass();

				if (argumentClass.equals(Buffer.class)) {
				} else if (argumentClass.equals(String.class)) {
					if (isConcatExpression(arithmeticExpression)) {

						RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(arithmeticExpression);
						assignmentExpression.setRightOperand(expressionParser.parseExpression("%all(" + expressionStringBuilder.getResult() + ")"));

						expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(assignmentExpression);
						statement.setAssignment(expressionStringBuilder.getResult());
					}
				} else if (argumentClass.equals(Integer.class)) {
				}
			}

			break;
		case ASSIGNMENT:
			break;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) rightExpression;
			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
				break;
			case DATETIME:
				break;
			case FLOATING:
				break;
			case HEXADECIMAL:
				break;
			case INDICATOR:
				break;
			case STRING:
				// search QArray<QNumeric>.eval("")
			case INTEGER:
				// search QArray<QNumeric>.eval(0)

				if (dataTerm.getDataTermType() == DataTermType.MULTIPLE_ATOMIC) {

					Class<?> argumentClass = ((QMultipleAtomicDataDef<?>) dataTerm.getDefinition()).getArgument().getJavaClass();

					if (argumentClass.equals(Buffer.class)) {
						if (isNumeric(atomicTermExpression.getValue()))
							checkSpecialInteger(atomicTermExpression, statement, assignmentExpression);
						else
							checkSpecialString(atomicTermExpression, statement, assignmentExpression);
					} else if (argumentClass.equals(String.class))
						checkSpecialString(atomicTermExpression, statement, assignmentExpression);
					else if (argumentClass.equals(Integer.class))
						checkSpecialInteger(atomicTermExpression, statement, assignmentExpression);
				}

				break;
			case NAME:
				break;
			case SPECIAL:
				break;
			}
			break;
		case BLOCK:
		case BOOLEAN:
		case QUALIFIED:
		case FUNCTION:
		case LOGICAL:
		case RELATIONAL:
			break;
		}

		return super.visit(statement);
	}

	private boolean isConcatExpression(QArithmeticExpression arithmeticExpression) {

		RPJArithmeticExpressionAnalyzer arithmeticExpressionAnalyzer = compilationUnit.getContext().make(RPJArithmeticExpressionAnalyzer.class);
		arithmeticExpression.accept(arithmeticExpressionAnalyzer);

		return arithmeticExpressionAnalyzer.isStringConcatExpression();
	}

	private void checkSpecialString(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		if (atomicTermExpression.getValue().isEmpty()) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*BLANKS");

			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
		}

	}

	private void checkSpecialInteger(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		int i = Integer.parseInt(atomicTermExpression.getValue());
		if (i == 0) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*ZEROS");

			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
		}

	}

	private boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private String normalizeRelationalExpression(QRelationalExpression relationalExpression) {

		QExpression leftExpression = relationalExpression.getLeftOperand();
		QExpression rightExpression = relationalExpression.getRightOperand();

		if (leftExpression.getExpressionType() == ExpressionType.ATOMIC) {
			QAtomicTermExpression atomicTermExpressionLeft = (QAtomicTermExpression) leftExpression;
			QAtomicTermExpression atomicTermExpressionRight = (QAtomicTermExpression) rightExpression;

			if (atomicTermExpressionLeft.getValue().equalsIgnoreCase("*BLANKS"))
				atomicTermExpressionLeft.toString();

			// special founded on left -> reverse operands (*BLANKS <> A -> A <>
			// *BLANKS)
			if (atomicTermExpressionLeft.getType() == AtomicType.SPECIAL) {
				relationalExpression.setLeftOperand(rightExpression);
				relationalExpression.setRightOperand(leftExpression);

				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(relationalExpression);
				return expressionStringBuilder.getResult();
			}
			// STRING founded on left -> reverse operands and operator
			if (atomicTermExpressionLeft.getType().equals(AtomicType.STRING) && !atomicTermExpressionRight.getType().equals(AtomicType.STRING)) {
				relationalExpression.setLeftOperand(rightExpression);
				relationalExpression.setRightOperand(leftExpression);
				// operator
				switch (relationalExpression.getOperator()) {
				case EQUAL:
					break;
				case GREATER_THAN:
					relationalExpression.setOperator(RelationalOperator.LESS_THAN);
					break;
				case GREATER_THAN_EQUAL:
					relationalExpression.setOperator(RelationalOperator.LESS_THAN_EQUAL);
					break;
				case LESS_THAN:
					relationalExpression.setOperator(RelationalOperator.GREATER_THAN);
					break;
				case LESS_THAN_EQUAL:
					relationalExpression.setOperator(RelationalOperator.GREATER_THAN_EQUAL);
					break;
				case NOT_EQUAL:
					break;
				}
				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(relationalExpression);
				return expressionStringBuilder.getResult();
			}

		}

		return null;
	}

	@Override
	public boolean visit(QIf statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QFor statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QUntil statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QWhile statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}
}
