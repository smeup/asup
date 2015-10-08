package org.smeup.sys.dk.compiler.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.rpj.RPJExpressionStringBuilder;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;

@Test(category = "DKCOMPILER", object = "RPJ")
public class WriteRPJ {

	@Inject
	private QTestAsserter testAsserter;
	
	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	
	@TestStarted
	public void main() {
		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");
		RPJExpressionStringBuilder strBuilder = new RPJExpressionStringBuilder();
		
		
		strBuilder.reset();		
		String testString = "A+B*C+D*E+F";
		QExpression parseExpression = expressionParser.parseExpression(testString);			
		parseExpression.accept(strBuilder);			
		testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());
		
		
		strBuilder.reset();		
		testString = "A = (B+C+D*E+F)*G";
		parseExpression = expressionParser.parseExpression(testString);						 			
		parseExpression.accept(strBuilder);		
		testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());								
		
		strBuilder.reset();		
		testString = "A*B*C*(D+E*F-G*H)";
		parseExpression = expressionParser.parseExpression(testString);						 			
		parseExpression.accept(strBuilder);
		testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());						
		
		strBuilder.reset();
		testString= "(A+B)/(C*E+F)-G+H**L";
		parseExpression = expressionParser.parseExpression(testString);						 			
		parseExpression.accept(strBuilder);
		testAsserter.assertEquals("String builder result", testString, strBuilder.getResult());						
		
	}
}