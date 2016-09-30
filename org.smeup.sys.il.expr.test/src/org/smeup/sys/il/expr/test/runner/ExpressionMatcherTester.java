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
import java.util.StringTokenizer;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.base.BaseTestHelper;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;

@Test(object = "MTC")
public class ExpressionMatcherTester {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;

	@Inject
	public transient QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
		
		String input = null;
		String pattern = null;
		QExpression expression = null;
		StringTokenizer tokenizer = null;
				

		for (String line : BaseTestHelper.readTextResource(this, "/resources/neutral/expr_match.txt")) {
			
			tokenizer = new StringTokenizer(line, "##");
			input = tokenizer.nextToken();
			pattern = tokenizer.nextToken();
			boolean match = false;
			
			try {

				expression = expressionParser.parseExpression(input);
				match = expression.match(pattern);
				testAsserter.assertTrue("Expression: " + input + "Pattern: " + pattern, match);
				
			} catch (Exception exc){
					testAsserter.fail("Failed: " + input + "Msg: " + exc.getMessage());
			}
		}
	}
}