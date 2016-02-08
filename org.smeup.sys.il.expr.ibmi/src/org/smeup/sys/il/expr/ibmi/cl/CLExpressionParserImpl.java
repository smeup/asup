/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.il.expr.ibmi.cl;

import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.base.BaseExpressionBuilder;

public class CLExpressionParserImpl implements QExpressionParser {

	private BaseExpressionBuilder expressionBuilder;

	public CLExpressionParserImpl() {
		expressionBuilder = new BaseExpressionBuilder(new CLExpressionHelper());
	}

	@Override
	public QAssignmentExpression parseAssignment(String expression) {
		return expressionBuilder.buildAsAssignment(expression);
	}

	@Override
	public QPredicateExpression parsePredicate(String expression) {
		return expressionBuilder.buildAsPredicate(expression);
	}

	@Override
	public QArithmeticExpression parseArithmetic(String expression) {
		return expressionBuilder.buildAsArithmetic(expression);
	}

	@Override
	public QTermExpression parseTerm(String expression) {
		return expressionBuilder.buildAsTerm(expression);
	}

	@Override
	public QExpression parseExpression(String expression) {
		return expressionBuilder.buildAsExpression(expression);
	}
}
