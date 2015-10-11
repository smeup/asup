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

import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QBooleanExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QQualifiedTermExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;

public class RPJExtendedExpressionStringBuilder extends ExpressionVisitorImpl {

	String result = "";

	public String getResult() {
		return result;
	}

	public RPJExtendedExpressionStringBuilder reset() {
		result = "";
		return this;
	}

	@Override
	public boolean visit(QBooleanExpression expression) {
		expression.getOperand().accept(this);
		return false;
	}

	@Override
	public boolean visit(QLogicalExpression expression) {

		switch (expression.getOperator()) {
		case AND:
			expression.getLeftOperand().accept(this);
			result += " and ";
			break;
		case NOT:
			result += " not ";
			expression.getLeftOperand().accept(this);
			break;
		case OR:
			expression.getLeftOperand().accept(this);
			result += " or ";
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		return false;
	}

	@Override
	public boolean visit(QRelationalExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case EQUAL:
			result += ".qEquals(";
			break;
		case GREATER_THAN:
			result += ".qGt(";
			break;
		case GREATER_THAN_EQUAL:
			result += ".qGte(";
			break;
		case LESS_THAN:
			result += ".qLt(";
			break;
		case LESS_THAN_EQUAL:
			result += ".qLte(";
			break;
		case NOT_EQUAL:
			result += ".qNe)";
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		result += ")";

		return false;
	}

	@Override
	public boolean visit(QArithmeticExpression expression) {

		if (expression.getOperator() == ArithmeticOperator.SIGN_MINUS) {

			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: kdsf43g77q35n4v5");
			result += ".qNegative()";
		} else if (expression.getOperator() == ArithmeticOperator.SIGN_PLUS) {

			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: kdsf43g77q35v5gt");
			result += ".qPositive()";
		} else {
			expression.getLeftOperand().accept(this);

			switch (expression.getOperator()) {

			case DIVIDE:
				result += ".qDiv(";
				break;
			case MINUS:
				result += ".qMinus(";
				break;
			case MODULAR:
				result += ".qModule(";
				break;
			case MULT:
				result += ".qMult(";
				break;
			case PLUS:
				result += ".qPlus(";
				break;
			case POWER:
				result += ".qPow(";
				break;
			case SIGN_MINUS:
			case SIGN_PLUS:
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: mct8734034vn7q35n4v5");
			}

			if (expression.getRightOperand() != null)
				expression.getRightOperand().accept(this);

			result += ")";
		}

		return false;

	}

	@Override
	public boolean visit(QAssignmentExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case ASSIGN:
			result += ".eval(";
			break;
		case DIVIDE_ASSIGN:
			result += ".evalDiv(";
			break;
		case MINUS_ASSIGN:
			result += ".evalMinus(";
			break;
		case PLUS_ASSIGN:
			result += ".evalPlus(";
			break;
		case POWER_ASSIGN:
			result += ".evalPow(";
			break;
		case TIMES_ASSIGN:
			result += ".evalTimes(";
			break;
		default:
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		result += ")";

		return false;

	}

	@Override
	public boolean visit(QAtomicTermExpression expression) {

		if (expression.getType() == AtomicType.STRING) {
			String value = expression.getValue().replaceAll("\'", "\''");
			result += "'" + value + "'";
		} else if (expression.getType() == AtomicType.HEXADECIMAL) {
			result += "x'" + expression.getValue() + "'";
		} else
			result += expression.getValue();

		// Mirandola
		// if (expression.isFunction())
		// result += "()";

		return false;
	}

	@Override
	public boolean visit(QBlockExpression expression) {

		// result += "(";
		expression.getExpression().accept(this);
		// result += ")";

		return false;
	}

	@Override
	public boolean visit(QFunctionTermExpression expression) {

		result += expression.getValue();

		if (!expression.getElements().isEmpty()) {
			boolean first = true;
			result += "(";
			for (QExpression child : expression.getElements()) {
				if (!first)
					result += ": ";
				child.accept(this);
				first = false;
			}
			result += ")";
		}

		return false;
	}

	@Override
	public boolean visit(QQualifiedTermExpression expression) {

		result += " " + expression.getValue();

		if (!result.contains("."))
			for (QExpression child : expression.getElements()) {
				result += ".";
				child.accept(this);
			}

		return false;
	}
}