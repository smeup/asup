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
package org.smeup.sys.il.expr.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.base.BaseTestHelper;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QExpressionWriterRegistry;

@Test(object = "NWRI")
public class NeutralExprWriterTester {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	
	@Inject
	private QExpressionWriterRegistry expressionWriterRegistry;

	@Inject
	public transient QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
		QExpressionWriter rpgExpressionWriter = expressionWriterRegistry.lookup("RPG");
		QExpressionWriter normalizedExpressionWriter = expressionWriterRegistry.lookup("NRM");
		
		String preparedExpr = null;

		for (String expression : BaseTestHelper.readTextResource(this, "/resources/rpg/expressions.txt")) {
			try{
				
				//Normalize expression for test input
				preparedExpr = rpgExpressionWriter.writeExpression(expressionParser.parseExpression(expression));
				
				// Build normalized expr
				normalizedExpressionWriter.writeExpression(expressionParser.parseExpression(preparedExpr));
				
			} catch(Exception exc) {
				testAsserter.fail("In: \"" + expression + "\" Norm: \"" + preparedExpr + "\" Error: \"" +exc.getMessage() + "\"");
			}
		}
	}
}