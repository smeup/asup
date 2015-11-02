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
package org.smeup.sys.il.expr.ibmi.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.e4.E4TestHelper;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QExpressionWriterRegistry;
import org.smeup.sys.il.expr.neutral.NeutralExprLexer;
import org.smeup.sys.il.expr.neutral.NeutralExprParser;

@Test(category = "IL.EXPR", object = "NWRI")
public class NeutralExprWriterTester {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	
	@Inject
	private QExpressionWriterRegistry expressionWriterRegistry;

	@Inject
	private QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
		QExpressionWriter rpgExpressionWriter = expressionWriterRegistry.lookup("RPG");
		QExpressionWriter normalizedExpressionWriter = expressionWriterRegistry.lookup("NRM");
		
		String preparedExpr = null;

		for (String expression : E4TestHelper.readTextResource(this, "/resources/rpg/expressions.txt")) {
			try{
				
				//Normalize expression for test input
				preparedExpr = rpgExpressionWriter.writeExpression(expressionParser.parseExpression(expression));
				
				// Build normalized expr
				String result = normalizedExpressionWriter.writeExpression(expressionParser.parseExpression(preparedExpr));
				
				// Parse normalized expr
				testAsserter.message("Inp:" + preparedExpr + " Norm:" + result);
				
			} catch(Exception exc) {
				testAsserter.fail("In: \"" + expression + "\" Norm: \"" + preparedExpr + "\" Error: \"" +exc.getMessage() + "\"");
			}
		}
	}
}