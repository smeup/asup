/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.il.expr.BaseExpressionStringBuilder;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QRelationalExpression;

public class RPJExtendedExpressionStringBuilder extends BaseExpressionStringBuilder {

	// Override specific node visitor
	
	@Override
	public boolean visit(QRelationalExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case EQUAL:
			result.append(".qEquals(");
			break;
		case GREATER_THAN:
			result.append(".qGt(");
			break;
		case GREATER_THAN_EQUAL:
			result.append(".qGte(");
			break;
		case LESS_THAN:
			result.append(".qLt(");
			break;
		case LESS_THAN_EQUAL:
			result.append(".qLte(");
			break;
		case NOT_EQUAL:
			result.append(".qNe)");
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		result.append(")");

		return false;
	}

	@Override
	public boolean visit(QArithmeticExpression expression) {

		if (expression.getOperator() == ArithmeticOperator.SIGN_MINUS) {

			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: kdsf43g77q35n4v5");
			result.append(".qNegative()");
		} else if (expression.getOperator() == ArithmeticOperator.SIGN_PLUS) {

			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: kdsf43g77q35v5gt");
			result.append(".qPositive()");
		} else {
			expression.getLeftOperand().accept(this);

			switch (expression.getOperator()) {

			case DIVIDE:
				result.append(".qDiv(");
				break;
			case MINUS:
				result.append(".qMinus(");
				break;
			case MODULAR:
				result.append(".qModule(");
				break;
			case MULT:
				result.append(".qMult(");
				break;
			case PLUS:
				result.append(".qPlus(");
				break;
			case POWER:
				result.append(".qPow(");
				break;
			case SIGN_MINUS:
			case SIGN_PLUS:
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: mct8734034vn7q35n4v5");
			}

			if (expression.getRightOperand() != null)
				expression.getRightOperand().accept(this);

			result.append(")");
		}

		return false;

	}

	@Override
	public boolean visit(QAssignmentExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case ASSIGN:
			result.append(".eval(");
			break;
		case DIVIDE_ASSIGN:
			result.append(".evalDiv(");
			break;
		case MINUS_ASSIGN:
			result.append(".evalMinus(");
			break;
		case PLUS_ASSIGN:
			result.append(".evalPlus(");
			break;
		case POWER_ASSIGN:
			result.append(".evalPow(");
			break;
		case TIMES_ASSIGN:
			result.append(".evalTimes(");
			break;
		default:
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		result.append(")");

		return false;

	}

	@Override
	public boolean visit(QBlockExpression expression) {

		// result.append("(";
		expression.getExpression().accept(this);
		// result.append(")";

		return false;
	}

}