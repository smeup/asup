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

@Test(category = "DK.COMPILER",  object = "EXTRPJ")
public class WriteExtendedRPJ {

	@Inject
	private QTestAsserter testAsserter;
	
	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	@Inject
	private QExpressionWriterRegistry expressionWriterRegistry;
	
	@TestStarted
	public void main() {
		QExpressionParser expressionParser = expressionParserRegistry.lookup("RPG");		
		QExpressionWriter expressionWriter = expressionWriterRegistry.lookup("EXTRPJ");
		
		String testString = "A+B*C+D*E+F";
		QExpression parseExpression = expressionParser.parseExpression(testString);									
		testAsserter.assertEquals("Extended string builder result", "A.qPlus(B.qMult(C)).qPlus(D.qMult(E)).qPlus(F)", expressionWriter.writeExpression(parseExpression));
				
		testString = "A = (B+C+D*E+F)*G";
		parseExpression = expressionParser.parseExpression(testString);						 					
		testAsserter.assertEquals("Extended string builder result", "A.qEquals(B.qPlus(C).qPlus(D.qMult(E)).qPlus(F).qMult(G))", expressionWriter.writeExpression(parseExpression));
				
		testString = "A*B*C*(D+E*F-G*H)";
		parseExpression = expressionParser.parseExpression(testString);						 			
		testAsserter.assertEquals("Extended string builder result", "A.qMult(B).qMult(C).qMult(D.qPlus(E.qMult(F)).qMinus(G.qMult(H)))", expressionWriter.writeExpression(parseExpression));
				
		testString= "(A+B)/(C*E+F)-G+H**L";
		parseExpression = expressionParser.parseExpression(testString);						 			
		testAsserter.assertEquals("Extended string builder result", "A.qPlus(B).qDiv(C.qMult(E).qPlus(F)).qMinus(G).qPlus(H.qPow(L))", expressionWriter.writeExpression(parseExpression));
		
	}
}