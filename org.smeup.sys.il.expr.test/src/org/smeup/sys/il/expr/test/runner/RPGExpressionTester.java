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

@Test(object = "RPG")
public class RPGExpressionTester {

	@Inject
	private QExpressionParserRegistry expressionParserRegistry;

	@Inject
	public transient QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");

		for (String expression : BaseTestHelper.readTextResource(this, "/resources/rpg/expressions.txt")) {
			try{
				testAsserter.assertNotNull("Parse " + expression, expressionParser.parseExpression(expression));
			} catch(Exception exc) {
				testAsserter.fail("Cannot parse expression \"" + expression + "\"");
			}
		}
	}
}