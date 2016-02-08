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
package org.smeup.sys.il.expr.ibmi.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.e4.E4TestHelper;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QExpressionWriterRegistry;

@Test(category = "IL.EXPR", object = "M2T")
public class ExpressionModelTester {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	
	@Inject
	private QExpressionWriterRegistry expressionWriterRegistry;

	@Inject
	private QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
		QExpressionWriter expressionWriter = expressionWriterRegistry.lookup("RPG");
		
		String normalizedExpr = null;

		for (String expression : E4TestHelper.readTextResource(this, "/resources/rpg/expressions.txt")) {
			try{
				
				//Normalize expression for test input
				normalizedExpr = expressionWriter.writeExpression(expressionParser.parseExpression(expression));
				
				// Test: T2M -> M2T from normalized expression
				String result = expressionWriter.writeExpression(expressionParser.parseExpression(normalizedExpr));
				
				testAsserter.assertEquals("String builder result", normalizedExpr, result);
				
			} catch(Exception exc) {
				testAsserter.fail("In: \"" + expression + "\" Norm: \"" + normalizedExpr + "\" Error: \"" +exc.getMessage() + "\"");
			}
		}
	}
}