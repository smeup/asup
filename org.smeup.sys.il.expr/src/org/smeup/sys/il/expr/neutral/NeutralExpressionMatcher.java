/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial implementation
 */

package org.smeup.sys.il.expr.neutral;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.smeup.sys.il.expr.QExpression;

public class NeutralExpressionMatcher {
	
	//Singleton
	private static NeutralExpressionMatcher instance;

	public static NeutralExpressionMatcher getInstance() {
		
		if (instance == null) {
			instance = new NeutralExpressionMatcher();
		}
		
		return instance;		
	}
	
	public boolean match(QExpression expression, String pattern) {
		
		boolean result = false;

		// Build neutral input expression
		NeutralExpressionStringBuilder builder = new NeutralExpressionStringBuilder();
		expression.accept(builder);
		String input = builder.getResult();
		
		//Build neutral expression AST
		Tree neutralExprAST = parseNeutralExpr(input);
		
		if (neutralExprAST != null) {
			
			// Build neutral pattern AST
			Tree neutralPatternAST = parseNeutralExpr(pattern);
			
			if (neutralPatternAST != null) {
				
				// Compare input and pattern AST
				result = compareAST(neutralExprAST, neutralPatternAST);
			}
			
		} else {
			// Error parsing neutral in put expression. Coding error...
			System.out.println("Unexpcted condition: bqdefrtghyhvg56943534");
		}
		return result;
		
	}
	
	
	private Tree parseNeutralExpr(String expr) {
		
		CommonTree tree = null;
		
		NeutralExprLexer lex = new NeutralExprLexer(new ANTLRStringStream(expr));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		NeutralExprParser parser = new NeutralExprParser(tokens);

		try {
			tree = parser.expression().getTree();
			
		} catch (Exception e) {
			tree = null;
		}
		
		return tree;
	}
	
	
	private boolean compareAST(Tree neutralExprAST, Tree neutralPatternAST) {
		boolean result = false;
		
		result = compareNode(neutralExprAST.getChild(0), neutralPatternAST.getChild(0));
		
		return result;
	}


	private boolean compareNode(Tree node1, Tree node2) {

		boolean result = true;
		
		if (node1.getType() == node2.getType()) {
			
			switch (node1.getType()) {
			
			// Binary operators
			case NeutralExprLexer.AS_ASS:
			case NeutralExprLexer.AS_DIV:
			case NeutralExprLexer.AS_MIN:
			case NeutralExprLexer.AS_PLUS:
			case NeutralExprLexer.AS_POW:
			case NeutralExprLexer.AS_TIM:
			case NeutralExprLexer.LE_OR:	
			case NeutralExprLexer.LE_AND:
			case NeutralExprLexer.RE_EQ:
			case NeutralExprLexer.RE_NE:
			case NeutralExprLexer.RE_LT:
			case NeutralExprLexer.RE_LTEQ:
			case NeutralExprLexer.RE_GT:
			case NeutralExprLexer.RE_GTEQ:
			case NeutralExprLexer.AE_PLUS:
			case NeutralExprLexer.AE_MINUS:
			case NeutralExprLexer.AE_MULT:
			case NeutralExprLexer.AE_DIV:	
			case NeutralExprLexer.AE_MOD:	
			case NeutralExprLexer.AE_POW:	
				
				if (compareNode(node1.getChild(0), node2.getChild(0)) == false)	{			
					result = false;
				} 
				
				if (result) {
					if (compareNode(node1.getChild(1), node2.getChild(1)) == false) {
					
						result = false;
					}
				}
				
				break;
			
			//Unary operators
			case NeutralExprLexer.LE_NOT:
			case NeutralExprLexer.AE_SMINUS:
			case NeutralExprLexer.AE_SPLUS:
				
				if (compareNode(node1.getChild(0), node2.getChild(0)) == false){				
					
					result = false;
				}
			
				break;
			
			// Atomic

			case NeutralExprLexer.AT_BOOL:	
			case NeutralExprLexer.AT_DATE:
			case NeutralExprLexer.AT_FLOAT:
			case NeutralExprLexer.AT_HEX:
			case NeutralExprLexer.AT_INDICATOR:
			case NeutralExprLexer.AT_INT:
			case NeutralExprLexer.AT_NAME:
			case NeutralExprLexer.AT_STRING:
			case NeutralExprLexer.AT_SPECIAL:	
			case NeutralExprLexer.AT_GENERIC:
			
				result = true;
				
			break;
			
			// Multiple childs operators (block and functions)
			case NeutralExprLexer.BE:
			case NeutralExprLexer.FT:

				if (node1.getChildCount() == node2.getChildCount()) {
					
					boolean tmpResult = true;
					for (int i = 0; i < node1.getChildCount(); i++) {							
						if (compareNode(node1.getChild(i), node2.getChild(i)) == false) {
							tmpResult = false;
							break;
						}
					}
					
					if (tmpResult == false) {
						result = false;
					} 				
				}
				
				break;

			default:
				
				break;
			}
			
		} else {
			
			boolean tmpResult = false;
			
			if (node2.getType() == NeutralExprLexer.AT_GENERIC) {
				
				// Manage generics on atomic values
				
				switch (node1.getType()) {
				case NeutralExprLexer.AT_BOOL:	
				case NeutralExprLexer.AT_DATE:
				case NeutralExprLexer.AT_FLOAT:
				case NeutralExprLexer.AT_HEX:
				case NeutralExprLexer.AT_INDICATOR:
				case NeutralExprLexer.AT_INT:
				case NeutralExprLexer.AT_NAME:
				case NeutralExprLexer.AT_STRING:
				case NeutralExprLexer.AT_SPECIAL:	
					
					tmpResult = true;
					break;
				}
			} else  if (node2.getType() == NeutralExprLexer.LE_GENERIC) {
				
				// Manage generics on logic expression values
				switch (node1.getType()) {
				case NeutralExprLexer.LE_AND:	
				case NeutralExprLexer.LE_NOT:
				case NeutralExprLexer.LE_OR:

					tmpResult = true;
					break;
				} 
			} else  if (node2.getType() == NeutralExprLexer.RE_GENERIC) {
				
				// Manage generics on relational statement values
				switch (node1.getType()) {
				case NeutralExprLexer.RE_EQ:
				case NeutralExprLexer.RE_GT:
				case NeutralExprLexer.RE_GTEQ:
				case NeutralExprLexer.RE_LT:
				case NeutralExprLexer.RE_LTEQ:
				case NeutralExprLexer.RE_NE:	

					tmpResult = true;
					break;
				}								
	
			} else  if (node2.getType() == NeutralExprLexer.AE_GENERIC) {
				
				// Manage generics on aritmetic expression values
				switch (node1.getType()) {
				case NeutralExprLexer.AE_DIV:
				case NeutralExprLexer.AE_MINUS:
				case NeutralExprLexer.AE_MOD:
				case NeutralExprLexer.AE_MULT:
				case NeutralExprLexer.AE_PLUS:
				case NeutralExprLexer.AE_POW:
				case NeutralExprLexer.AE_SMINUS:
				case NeutralExprLexer.AE_SPLUS:
				case NeutralExprLexer.AE_TIM:	

					tmpResult = true;
					break;
				}								
	
			} else  if (node2.getType() == NeutralExprLexer.AS_GENERIC) {
				
				// Manage generics on assignment statement values
				switch (node1.getType()) {
				case NeutralExprLexer.AS_DIV:
				case NeutralExprLexer.AS_MIN:
				case NeutralExprLexer.AS_ASS:
				case NeutralExprLexer.AS_PLUS:
				case NeutralExprLexer.AS_POW:				
				case NeutralExprLexer.AS_TIM:	

					tmpResult = true;
					break;
				}								
	
			} else if (node2.getType() == NeutralExprLexer.FT) {
				
				// Manage generics on function nodes
				
				if (node2.getText().equals("GENERIC")) {
					
					if (node1.getChildCount() == node2.getChildCount()) {
						
						boolean tmp = true;
						for (int i = 0; i < node1.getChildCount(); i++) {							
							if (compareNode(node1.getChild(i), node2.getChild(i)) == false) {
								tmp = false;
								break;
							}
						}
						
						if (tmp) {
							tmpResult = true;
						} 				
					}
				}
			} 
			
			if (!tmpResult) {
				result = false;
			}
		}
		
		return result;	
	}
}
