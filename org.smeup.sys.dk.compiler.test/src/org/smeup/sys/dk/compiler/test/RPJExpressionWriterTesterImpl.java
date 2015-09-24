package org.smeup.sys.dk.compiler.test;
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


import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.compiler.rpj.RPJExpressionStringBuilder;
import org.smeup.sys.dk.compiler.rpj.RPJExtendedExpressionStringBuilder;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;

public class RPJExpressionWriterTesterImpl extends E4TestProviderImpl{

		
	@Inject
	private QTestManager testManager;


	public void _testRPJWriter(CommandInterpreter interpreter){

		QContext testContext = testManager.prepareContext(this.getClass());
		QTestRunner testRunner = testManager.prepareRunner(testContext, WriteRPJ.class);
		QTestResult testResult;
		try {
			testResult = testRunner.call();
			printTestResult(testResult);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	@Test(category = "DBCOMPILER", object = "RPJWRITER")
	public static class WriteRPJ {

		@Inject
		private QTestAsserter testAsserter;
		
		@Inject
		private QExpressionParserRegistry expressionParserRegistry;
		
		@TestStarted
		public void main() {
			QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
			RPJExpressionStringBuilder strBuilder = new RPJExpressionStringBuilder();
			RPJExtendedExpressionStringBuilder strExtBuilder = new RPJExtendedExpressionStringBuilder();
			
			strBuilder.reset();
			strExtBuilder.reset();
			String testString = "A+B*C+D*E+F";
			QExpression parseExpression = expressionParser.parseExpression(testString);			
			parseExpression.accept(strBuilder);
			parseExpression.accept(strExtBuilder);	
			testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());
			testAsserter.assertEquals("Extended string builder result", "A.qPlus(B.qMult(C)).qPlus(D.qMult(E)).qPlus(F)", strExtBuilder.getResult());
			
			strBuilder.reset();
			strExtBuilder.reset();
			testString = "A = (B+C+D*E+F)*G";
			parseExpression = expressionParser.parseExpression(testString);						 			
			parseExpression.accept(strBuilder);
			parseExpression.accept(strExtBuilder);	
			testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());						
			testAsserter.assertEquals("Extended string builder result", "A.qEquals(B.qPlus(C).qPlus(D.qMult(E)).qPlus(F).qMult(G))", strExtBuilder.getResult());
			
			strBuilder.reset();
			strExtBuilder.reset();
			testString = "A*B*C*(D+E*F-G*H)";
			parseExpression = expressionParser.parseExpression(testString);						 			
			parseExpression.accept(strBuilder);
			parseExpression.accept(strExtBuilder);	
			testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());						
			testAsserter.assertEquals("Extended string builder result", "A.qMult(B).qMult(C).qMult(D.qPlus(E.qMult(F)).qMinus(G.qMult(H)))", strExtBuilder.getResult());
			
			strBuilder.reset();
			strExtBuilder.reset();
			testString= "(A+B)/(C*E+F)-G+H**L";
			parseExpression = expressionParser.parseExpression(testString);						 			
			parseExpression.accept(strBuilder);
			parseExpression.accept(strExtBuilder);	
			testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());						
			testAsserter.assertEquals("Extended string builder result", "A.qPlus(B).qDiv(C.qMult(E).qPlus(F)).qMinus(G).qPlus(H.qPow(L))", strExtBuilder.getResult());
			
		}
	}

}

