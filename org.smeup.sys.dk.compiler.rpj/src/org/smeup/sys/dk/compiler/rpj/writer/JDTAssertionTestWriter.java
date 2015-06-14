/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 *   Giuliano Giancristofaro - Implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.RelationalOperator;


public class JDTAssertionTestWriter {

	private QCompilationUnit compilationUnit;
	private QExpressionParser expressionParser;

	private AST ast;
	
	public JDTAssertionTestWriter(AST ast, QCompilationUnit compilationUnit, QExpressionParser expressionParser) {
		this.ast = ast;
		this.expressionParser = expressionParser;
		this.compilationUnit = compilationUnit;
	}

	public void writeAssertion(QAnnotationTest qAnnotationTest, Block target, String message) {

		QPredicateExpression expression = expressionParser.parsePredicate(qAnnotationTest.getExpression());
		QRelationalExpression relationalExpression = null;
		if (expression instanceof QRelationalExpression) {
			relationalExpression = (QRelationalExpression) expression;
		} else 
			return;

		Expression leftExpression = buildExpression(ast, relationalExpression.getLeftOperand(), null);
		Expression rightExpression = buildExpression(ast, relationalExpression.getRightOperand(), null);

		String messageNormalized = "";
		if(qAnnotationTest.getMessage().isEmpty()){
			if(message.isEmpty()){
				messageNormalized = "Init " + leftExpression;
			}else{
				messageNormalized = normalizeMessage(message);
			}
		}else{
			messageNormalized = qAnnotationTest.getMessage();
		}
		
		
		QAtomicTermExpression atomicLeftExpr = null;
		if(relationalExpression.getLeftOperand() instanceof QAtomicTermExpression){
			atomicLeftExpr = (QAtomicTermExpression) relationalExpression.getLeftOperand();
			if(compilationUnit.getDataTerm(atomicLeftExpr.getValue(), true) != null)
				writeAssertionTrue(target, messageNormalized,buildExpression(ast, expressionParser.parseExpression(qAnnotationTest.getExpression()), null));
			else
				writeAssertionEquals(target, messageNormalized, leftExpression, rightExpression, relationalExpression.getOperator());
		}else{
			writeAssertionEquals(target, messageNormalized, leftExpression, rightExpression, relationalExpression.getOperator());
		}
	}
	
	@SuppressWarnings("unchecked")
	private void writeAssertionTrue(Block target, String message, Expression expression){
		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("testAsserter"));
		methodInvocation.setName(ast.newSimpleName("assertTrue"));
		
		StringLiteral literal = ast.newStringLiteral();
		literal.setLiteralValue(message);

		methodInvocation.arguments().add(literal);
		methodInvocation.arguments().add(expression);
		
		ExpressionStatement assertStatement = ast.newExpressionStatement(methodInvocation);
		target.statements().add(assertStatement);
}
	
	@SuppressWarnings("unchecked")
	private void writeAssertionEquals(Block target, String message, Expression leftExpression, Expression rightExpression, RelationalOperator operator){

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("testAsserter"));

		switch (operator) {
		case EQUAL:
			methodInvocation.setName(ast.newSimpleName("assertEquals"));
			break;
		case GREATER_THAN:
			break;
		case GREATER_THAN_EQUAL:
			break;
		case LESS_THAN:
			break;
		case LESS_THAN_EQUAL:
			break;
		case NOT_EQUAL:
			break;
	}
		
		StringLiteral literal = ast.newStringLiteral();
		literal.setLiteralValue(message);

		methodInvocation.arguments().add(literal);
		methodInvocation.arguments().add(leftExpression);
		methodInvocation.arguments().add(rightExpression);
		
		ExpressionStatement assertStatement = ast.newExpressionStatement(methodInvocation);
		target.statements().add(assertStatement);
	}
	

		// TODO bisognerebbe farne una classe
	private Expression buildExpression(AST ast, QExpression expression, Class<?> target) {
	
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_EXPRESSION);
	
		JDTExpressionStringBuilder builder = compilationUnit.getContext().make(JDTExpressionStringBuilder.class);
		builder.setTarget(target);
		expression.accept(builder);
		String value = builder.getResult();
	
		parser.setSource(value.toCharArray());
		ASTNode node = parser.createAST(null);
		if (node.getLength() == 0)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid java conversion: " + value);
	
		Expression jdtExpression = (Expression) node;
	
		return (Expression) ASTNode.copySubtree(ast, jdtExpression);
	}

	private String normalizeMessage(String message) {
		String newMessage = "";
		int pos =message.indexOf("("); 
		if(pos == -1){
			return message;
		}
		newMessage = message.substring(pos);
		return newMessage;
	}

}