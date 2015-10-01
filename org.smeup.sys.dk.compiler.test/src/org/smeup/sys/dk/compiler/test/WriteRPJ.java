package org.smeup.sys.dk.compiler.test;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.rpj.RPJExpressionStringBuilder;
import org.smeup.sys.dk.compiler.rpj.RPJExtendedExpressionStringBuilder;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;

@Test(category = "DKCOMPILER", object = "RPJWRITER")
public class WriteRPJ {

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