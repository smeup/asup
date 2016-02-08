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

@Test(category = "IL.EXPR", object = "CL")
public class CLExpressionTester {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;

	@Inject
	private QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		QExpressionParser expressionParser = expressionParserRegistry.lookup("CL");

		for (String expression : E4TestHelper.readTextResource(this, "/resources/cl/expressions.txt")){
			try {
				testAsserter.assertNotNull("Parse " + expression, expressionParser.parseExpression(expression.trim()));
			} catch(Exception exc) {
				testAsserter.fail("Cannot parse expression \"" + expression + " Error message: " + exc.getMessage());
			}
		}
	}
}