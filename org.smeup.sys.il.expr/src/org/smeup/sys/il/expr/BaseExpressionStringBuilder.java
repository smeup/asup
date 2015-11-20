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
package org.smeup.sys.il.expr;

import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;


public class BaseExpressionStringBuilder extends ExpressionVisitorImpl {
	
	protected StringBuffer result = new StringBuffer();

	public String getResult() {
		return result.toString();
	}

	public BaseExpressionStringBuilder reset() {
		result = new StringBuffer();
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
			result.append(" and ");
			break;
		case NOT:
			result.append(" not ");
			expression.getLeftOperand().accept(this);
			break;
		case OR:
			expression.getLeftOperand().accept(this);
			result.append(" or ");
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
			result.append(" = ");
			break;
		case GREATER_THAN:
			result.append(" > ");
			break;
		case GREATER_THAN_EQUAL:
			result.append(" >= ");
			break;
		case LESS_THAN:
			result.append(" < ");
			break;
		case LESS_THAN_EQUAL:
			result.append(" >= ");
			break;
		case NOT_EQUAL:
			result.append(" <> ");
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		return false;
	}

	@Override
	public boolean visit(QArithmeticExpression expression) {

		if (expression.getOperator() == ArithmeticOperator.SIGN_MINUS) {
			result.append("-");
			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: kdsf43g77q35n4v5");
		} else if (expression.getOperator() == ArithmeticOperator.SIGN_PLUS) {
			result.append("+");
			expression.getLeftOperand().accept(this);
			if (expression.getRightOperand() != null)
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: kdsf43g77q35v5gt");
		} else {
			expression.getLeftOperand().accept(this);

			switch (expression.getOperator()) {

			case DIVIDE:
				result.append("/");
				break;
			case MINUS:
				result.append("-");
				break;
			case MODULAR:
				result.append("%");
				break;
			case MULT:
				result.append("*");
				break;
			case PLUS:
				result.append("+");
				break;
			case POWER:
				result.append("**");
				break;
			case SIGN_MINUS:
			case SIGN_PLUS:
				throw new IntegratedLanguageExpressionRuntimeException("Unexpected condition: mct8734034vn7q35n4v5");
			}

			if (expression.getRightOperand() != null)
				expression.getRightOperand().accept(this);
		}

		return false;

	}

	@Override
	public boolean visit(QAssignmentExpression expression) {

		expression.getLeftOperand().accept(this);

		switch (expression.getOperator()) {
		case ASSIGN:
			result.append(" = ");
			break;
		case DIVIDE_ASSIGN:
			result.append(" /= ");
			break;
		case MINUS_ASSIGN:
			result.append(" -= ");
			break;
		case PLUS_ASSIGN:
			result.append(" += ");
			break;
		case POWER_ASSIGN:
			result.append(" **= ");
			break;
		case TIMES_ASSIGN:
			result.append(" *= ");
			break;
		default:
			break;
		}

		if (expression.getRightOperand() != null)
			expression.getRightOperand().accept(this);

		return false;

	}

	@Override
	public boolean visit(QAtomicTermExpression expression) {

		if (expression.getType() == AtomicType.STRING) {
			String value = expression.getValue().replaceAll("\'", "\''");
			result.append("'" + value + "'");
		} else if (expression.getType() == AtomicType.HEXADECIMAL) {
			result.append("x'" + expression.getValue() + "'");
		} else
			result.append(expression.getValue());

		return false;
	}

	@Override
	public boolean visit(QBlockExpression expression) {

		result.append("(");
		expression.getExpression().accept(this);
		result.append(")");

		return false;
	}

	
	@Override
	public boolean visit(QFunctionTermExpression expression) {
		
		String functionName = expression.getValue();
				
		if (functionName.startsWith("*ALL")) {
			
			result.append("*ALL");
			for (QExpression child : expression.getElements()) {
				child.accept(this);
			}		
			
		} else {
		
			result.append(expression.getValue());
	
			result.append("(");
			boolean first = true;
			for (QExpression child : expression.getElements()) {
				if (!first)
					result.append(": ");
				child.accept(this);
				first = false;
			}
			result.append(")");
		}

		return false;
	}

	

	@Override
	public boolean visit(QQualifiedTermExpression expression) {

		result.append(" " + expression.getValue());

		if (!result.toString().contains("."))
			for (QExpression child : expression.getElements()) {
				result.append(".");
				child.accept(this);
			}

		return false;
	}

	public void visit(QPredicateExpression predicateExpression) {

		if (predicateExpression instanceof QRelationalExpression)
			visit((QRelationalExpression) predicateExpression);
		else if (predicateExpression instanceof QLogicalExpression)
			visit((QLogicalExpression) predicateExpression);
		else if (predicateExpression instanceof QBooleanExpression)
			visit((QBooleanExpression) predicateExpression);
	}

}