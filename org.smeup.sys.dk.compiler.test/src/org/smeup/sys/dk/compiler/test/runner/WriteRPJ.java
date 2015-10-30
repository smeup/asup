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
package org.smeup.sys.dk.compiler.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QExpressionWriterRegistry;

@Test(category = "DK.COMPILER", object = "RPJ")
public class WriteRPJ {

	@Inject
	private QTestAsserter testAsserter;
	
	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	
	@Inject
	private QExpressionWriterRegistry expressionWriterRegistry;
		
	
	@TestStarted
	public void main() {
		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
		QExpressionWriter expressionWriter = expressionWriterRegistry.lookup("RPJ");
		
		String testString = "A+B*C+D*E+F";
		QExpression parseExpression = expressionParser.parseExpression(testString);					
		testAsserter.assertEquals("String builder result", testString, expressionWriter.writeExpression(parseExpression));
		
		testString = "A = (B+C+D*E+F)*G";
		parseExpression = expressionParser.parseExpression(testString);						 						
		testAsserter.assertEquals("String builder result", testString, expressionWriter.writeExpression(parseExpression));								
		
		testString = "A*B*C*(D+E*F-G*H)";
		parseExpression = expressionParser.parseExpression(testString);						 			
		testAsserter.assertEquals("String builder result", testString, expressionWriter.writeExpression(parseExpression));						
		
		testString= "(A+B)/(C*E+F)-G+H**L";
		parseExpression = expressionParser.parseExpression(testString);						 			
		testAsserter.assertEquals("String builder result", testString, expressionWriter.writeExpression(parseExpression));						
		
	}
}