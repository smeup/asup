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
package org.smeup.sys.il.expr.ibmi.cl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.smeup.sys.il.expr.ArithmeticOperator;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.expr.base.BaseExpressionHelper;

public class CLExpressionHelper implements BaseExpressionHelper {

	@Override
	public ExpressionType getExpressionType(Tree tree) {

		ExpressionType expressionType = null;

		switch (tree.getType()) {

		case CLExprLexer.PLUS:
		case CLExprLexer.MINUS:
		case CLExprLexer.MULT:
		case CLExprLexer.DIV:
		case CLExprLexer.SIGN_MINUS:
		case CLExprLexer.SIGN_PLUS:
			expressionType = ExpressionType.ARITHMETIC;
			break;

		case CLExprLexer.OR:
		case CLExprLexer.AND:
		case CLExprLexer.NOT:
			expressionType = ExpressionType.LOGICAL;
			break;

		case CLExprLexer.EQ:
		case CLExprLexer.NE:
		case CLExprLexer.LT:
		case CLExprLexer.LTEQ:
		case CLExprLexer.GT:
		case CLExprLexer.GTEQ:
			expressionType = ExpressionType.RELATIONAL;
			break;

		case CLExprLexer.INTEGER:
		case CLExprLexer.FLOAT:
		case CLExprLexer.STRING:
		case CLExprLexer.BOOLEAN:
		case CLExprLexer.TERM:
		case CLExprLexer.VAR:
		case CLExprLexer.DATA_AREA:
		case CLExprLexer.SWITCH_VALUE:				
			expressionType = ExpressionType.ATOMIC;
			break;

		case CLExprLexer.SST_FUN:
		case CLExprLexer.BINARY_FUN:
		case CLExprLexer.SWITCH_FUN:
		case CLExprLexer.CAT:
		case CLExprLexer.BCAT:
		case CLExprLexer.TCAT:
			expressionType = ExpressionType.FUNCTION;
			break;
		}

		return expressionType;
	}

	@Override
	public AtomicType getTermType(Tree node) {
		switch (node.getType()) {

		case CLExprLexer.INTEGER:
			return AtomicType.INTEGER;

		case CLExprLexer.FLOAT:
			return AtomicType.FLOATING;

		case CLExprLexer.BOOLEAN:
			return AtomicType.BOOLEAN;

		case CLExprLexer.STRING:
			return AtomicType.STRING;

		case CLExprLexer.TERM:
			return AtomicType.NAME;

		case CLExprLexer.VAR:
			return AtomicType.NAME;
		
		//TODO: corretto?	
		case CLExprLexer.DATA_AREA:
			return AtomicType.STRING;	
		
		case CLExprLexer.SWITCH_VALUE:	
			return AtomicType.STRING;
			
		default:
			System.err.println(node.getType());
			return null;

		}

	}

	@Override
	public ArithmeticOperator getArithmeticOperator(Tree node) {

		switch (node.getType()) {

		case CLExprLexer.PLUS:
			return ArithmeticOperator.PLUS;
		case CLExprLexer.MINUS:
			return ArithmeticOperator.MINUS;
		case CLExprLexer.MULT:
			return ArithmeticOperator.MULT;
		case CLExprLexer.DIV:
			return ArithmeticOperator.DIVIDE;
		case CLExprLexer.SIGN_MINUS:
			return ArithmeticOperator.SIGN_MINUS;
		case CLExprLexer.SIGN_PLUS:
			return ArithmeticOperator.SIGN_PLUS;
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	@Override
	public LogicalOperator getLogicalOperator(Tree node) {

		switch (node.getType()) {
		case CLExprLexer.AND:
			return LogicalOperator.AND;
		case CLExprLexer.OR:
			return LogicalOperator.OR;
		case CLExprLexer.NOT:
			return LogicalOperator.NOT;
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	@Override
	public RelationalOperator getRelationalOperator(Tree node) {

		switch (node.getType()) {
		case CLExprLexer.EQ:
			return RelationalOperator.EQUAL;
		case CLExprLexer.NE:
			return RelationalOperator.NOT_EQUAL;
		case CLExprLexer.LT:
			return RelationalOperator.LESS_THAN;
		case CLExprLexer.LTEQ:
			return RelationalOperator.LESS_THAN_EQUAL;
		case CLExprLexer.GT:
			return RelationalOperator.GREATER_THAN;
		case CLExprLexer.GTEQ:
			return RelationalOperator.GREATER_THAN_EQUAL;
		default:
			System.err.println(node.getType());
			return null;
		}
	}

	@Override
	public Tree parse(String expression) {
		CommonTree tree;
		CLExprLexer lex = new CLExprLexer(new ANTLRStringStream(expression));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		CLExprParser parser = new CLExprParser(tokens);

		try {
			tree = parser.expression().getTree();
		} catch (RecognitionException e) {
			throw new IntegratedLanguageExpressionRuntimeException(e);
		}

		return tree;
	}

	@Override
	public String normalizeText(String text) {
		return text;
	}

	@Override
	public String getFunctionName(Tree node) {
		String text = null;
		if (node.getType() == CLExprLexer.CAT)
			text = "%CAT";
		else if (node.getType() == CLExprLexer.BCAT)
			text = "%BCAT";
		else if (node.getType() == CLExprLexer.TCAT)
			text = "%TCAT";
		else if (node.getType() == CLExprLexer.SST_FUN)
			text = "%SUBST";
		else
			text = normalizeText(node.getText());
		return text;
	}

}