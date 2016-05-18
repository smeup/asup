// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g 2016-05-18 12:19:56

  package org.smeup.sys.il.expr.ibmi.cl;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CLExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "B", "BCAT", "BINARY_FUN", 
		"BOOLEAN", "C", "CAT", "CHAR_SPECIAL", "CLOSE_BRACE", "D", "DATA_AREA", 
		"DIGIT", "DIGIT_SPECIAL", "DIV", "E", "EQ", "F", "FLOAT", "G", "GT", "GTEQ", 
		"H", "I", "INTEGER", "J", "K", "L", "LETTER", "LT", "LTEQ", "M", "MINUS", 
		"MULT", "N", "NE", "NG", "NL", "NOT", "O", "OPEN_BRACE", "OR", "P", "PLUS", 
		"Q", "R", "S", "SIGN_MINUS", "SIGN_PLUS", "SST_FUN", "STRING", "SWITCH_FUN", 
		"SWITCH_VALUE", "T", "TCAT", "TERM", "U", "V", "VAR", "W", "WS", "X", 
		"Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AND=5;
	public static final int B=6;
	public static final int BCAT=7;
	public static final int BINARY_FUN=8;
	public static final int BOOLEAN=9;
	public static final int C=10;
	public static final int CAT=11;
	public static final int CHAR_SPECIAL=12;
	public static final int CLOSE_BRACE=13;
	public static final int D=14;
	public static final int DATA_AREA=15;
	public static final int DIGIT=16;
	public static final int DIGIT_SPECIAL=17;
	public static final int DIV=18;
	public static final int E=19;
	public static final int EQ=20;
	public static final int F=21;
	public static final int FLOAT=22;
	public static final int G=23;
	public static final int GT=24;
	public static final int GTEQ=25;
	public static final int H=26;
	public static final int I=27;
	public static final int INTEGER=28;
	public static final int J=29;
	public static final int K=30;
	public static final int L=31;
	public static final int LETTER=32;
	public static final int LT=33;
	public static final int LTEQ=34;
	public static final int M=35;
	public static final int MINUS=36;
	public static final int MULT=37;
	public static final int N=38;
	public static final int NE=39;
	public static final int NG=40;
	public static final int NL=41;
	public static final int NOT=42;
	public static final int O=43;
	public static final int OPEN_BRACE=44;
	public static final int OR=45;
	public static final int P=46;
	public static final int PLUS=47;
	public static final int Q=48;
	public static final int R=49;
	public static final int S=50;
	public static final int SIGN_MINUS=51;
	public static final int SIGN_PLUS=52;
	public static final int SST_FUN=53;
	public static final int STRING=54;
	public static final int SWITCH_FUN=55;
	public static final int SWITCH_VALUE=56;
	public static final int T=57;
	public static final int TCAT=58;
	public static final int TERM=59;
	public static final int U=60;
	public static final int V=61;
	public static final int VAR=62;
	public static final int W=63;
	public static final int WS=64;
	public static final int X=65;
	public static final int Y=66;
	public static final int Z=67;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CLExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CLExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g"; }



	   @Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

		@Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String msg = "Parser error. Input: " + e.input.toString();
	        msg += " " + getErrorHeader(e);
	        msg += " Msg: " + getErrorMessage(e, tokenNames);
	        throw new IntegratedLanguageExpressionRuntimeException(msg , e);
	    }	

	   @Override
	  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    	throw e;
	    }


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:101:1: expression : logicalExpression EOF !;
	public final CLExprParser.expression_return expression() throws RecognitionException {
		CLExprParser.expression_return retval = new CLExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:102:4: ( logicalExpression EOF !)
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:103:4: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression150);
			logicalExpression1=logicalExpression();
			state._fsp--;

			adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression153); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:106:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final CLExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		CLExprParser.logicalExpression_return retval = new CLExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:107:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:108:2: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression168);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;

			adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:108:23: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:108:24: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression171); 
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression174);
					booleanAndExpression5=booleanAndExpression();
					state._fsp--;

					adaptor.addChild(root_0, booleanAndExpression5.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalExpression"


	public static class booleanAndExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "booleanAndExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:111:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final CLExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		CLExprParser.booleanAndExpression_return retval = new CLExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:112:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:112:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression188);
			equalityExpression6=equalityExpression();
			state._fsp--;

			adaptor.addChild(root_0, equalityExpression6.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:112:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:112:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression191); 
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression194);
					equalityExpression8=equalityExpression();
					state._fsp--;

					adaptor.addChild(root_0, equalityExpression8.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanAndExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:115:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final CLExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		CLExprParser.equalityExpression_return retval = new CLExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:116:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:116:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression207);
			relationalExpression9=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, relationalExpression9.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:116:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:116:26: ( EQ | NE ) ^ relationalExpression
					{
					set10=input.LT(1);
					set10=input.LT(1);
					if ( input.LA(1)==EQ||input.LA(1)==NE ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set10), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression217);
					relationalExpression11=relationalExpression();
					state._fsp--;

					adaptor.addChild(root_0, relationalExpression11.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:119:1: relationalExpression : concatExpression ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )* ;
	public final CLExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		CLExprParser.relationalExpression_return retval = new CLExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope concatExpression12 =null;
		ParserRuleReturnScope concatExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:120:2: ( concatExpression ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:120:4: concatExpression ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_concatExpression_in_relationalExpression230);
			concatExpression12=concatExpression();
			state._fsp--;

			adaptor.addChild(root_0, concatExpression12.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:120:21: ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)||(LA4_0 >= NG && LA4_0 <= NL)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:120:23: ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression
					{
					set13=input.LT(1);
					set13=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ)||(input.LA(1) >= NG && input.LA(1) <= NL) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set13), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_concatExpression_in_relationalExpression249);
					concatExpression14=concatExpression();
					state._fsp--;

					adaptor.addChild(root_0, concatExpression14.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class concatExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "concatExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:123:1: concatExpression : additiveExpression ( ( CAT | BCAT | TCAT ) ^ additiveExpression )* ;
	public final CLExprParser.concatExpression_return concatExpression() throws RecognitionException {
		CLExprParser.concatExpression_return retval = new CLExprParser.concatExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope additiveExpression15 =null;
		ParserRuleReturnScope additiveExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:124:2: ( additiveExpression ( ( CAT | BCAT | TCAT ) ^ additiveExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:125:3: additiveExpression ( ( CAT | BCAT | TCAT ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_concatExpression265);
			additiveExpression15=additiveExpression();
			state._fsp--;

			adaptor.addChild(root_0, additiveExpression15.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:125:22: ( ( CAT | BCAT | TCAT ) ^ additiveExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==BCAT||LA5_0==CAT||LA5_0==TCAT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:125:24: ( CAT | BCAT | TCAT ) ^ additiveExpression
					{
					set16=input.LT(1);
					set16=input.LT(1);
					if ( input.LA(1)==BCAT||input.LA(1)==CAT||input.LA(1)==TCAT ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_concatExpression278);
					additiveExpression17=additiveExpression();
					state._fsp--;

					adaptor.addChild(root_0, additiveExpression17.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concatExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:129:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final CLExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		CLExprParser.additiveExpression_return retval = new CLExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope multiplicativeExpression18 =null;
		ParserRuleReturnScope multiplicativeExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:130:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:130:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression293);
			multiplicativeExpression18=multiplicativeExpression();
			state._fsp--;

			adaptor.addChild(root_0, multiplicativeExpression18.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:130:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:130:31: ( PLUS | MINUS ) ^ multiplicativeExpression
					{
					set19=input.LT(1);
					set19=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set19), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression304);
					multiplicativeExpression20=multiplicativeExpression();
					state._fsp--;

					adaptor.addChild(root_0, multiplicativeExpression20.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:133:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV ) ^ unaryExpression )* ;
	public final CLExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		CLExprParser.multiplicativeExpression_return retval = new CLExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set22=null;
		ParserRuleReturnScope unaryExpression21 =null;
		ParserRuleReturnScope unaryExpression23 =null;

		CommonTree set22_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:134:2: ( unaryExpression ( ( MULT | DIV ) ^ unaryExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:135:3: unaryExpression ( ( MULT | DIV ) ^ unaryExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression320);
			unaryExpression21=unaryExpression();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpression21.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:135:19: ( ( MULT | DIV ) ^ unaryExpression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DIV||LA7_0==MULT) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:135:21: ( MULT | DIV ) ^ unaryExpression
					{
					set22=input.LT(1);
					set22=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set22), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression331);
					unaryExpression23=unaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpression23.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:138:1: unaryExpression : ( primaryExpression | NOT ^ primaryExpression | MINUS primaryExpression -> ^( SIGN_MINUS primaryExpression ) | PLUS primaryExpression -> ^( SIGN_PLUS primaryExpression ) );
	public final CLExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		CLExprParser.unaryExpression_return retval = new CLExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT25=null;
		Token MINUS27=null;
		Token PLUS29=null;
		ParserRuleReturnScope primaryExpression24 =null;
		ParserRuleReturnScope primaryExpression26 =null;
		ParserRuleReturnScope primaryExpression28 =null;
		ParserRuleReturnScope primaryExpression30 =null;

		CommonTree NOT25_tree=null;
		CommonTree MINUS27_tree=null;
		CommonTree PLUS29_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:139:2: ( primaryExpression | NOT ^ primaryExpression | MINUS primaryExpression -> ^( SIGN_MINUS primaryExpression ) | PLUS primaryExpression -> ^( SIGN_PLUS primaryExpression ) )
			int alt8=4;
			switch ( input.LA(1) ) {
			case BINARY_FUN:
			case BOOLEAN:
			case DATA_AREA:
			case FLOAT:
			case INTEGER:
			case OPEN_BRACE:
			case SST_FUN:
			case STRING:
			case SWITCH_FUN:
			case TERM:
			case VAR:
				{
				alt8=1;
				}
				break;
			case NOT:
				{
				alt8=2;
				}
				break;
			case MINUS:
				{
				alt8=3;
				}
				break;
			case PLUS:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:140:4: primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primaryExpression_in_unaryExpression350);
					primaryExpression24=primaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, primaryExpression24.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:141:8: NOT ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT25=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression359); 
					NOT25_tree = (CommonTree)adaptor.create(NOT25);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT25_tree, root_0);

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression362);
					primaryExpression26=primaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, primaryExpression26.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:142:8: MINUS primaryExpression
					{
					MINUS27=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression371);  
					stream_MINUS.add(MINUS27);

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression373);
					primaryExpression28=primaryExpression();
					state._fsp--;

					stream_primaryExpression.add(primaryExpression28.getTree());
					// AST REWRITE
					// elements: primaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 142:32: -> ^( SIGN_MINUS primaryExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:142:35: ^( SIGN_MINUS primaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGN_MINUS, "SIGN_MINUS"), root_1);
						adaptor.addChild(root_1, stream_primaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:143:8: PLUS primaryExpression
					{
					PLUS29=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression390);  
					stream_PLUS.add(PLUS29);

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression392);
					primaryExpression30=primaryExpression();
					state._fsp--;

					stream_primaryExpression.add(primaryExpression30.getTree());
					// AST REWRITE
					// elements: primaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 143:31: -> ^( SIGN_PLUS primaryExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:143:34: ^( SIGN_PLUS primaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGN_PLUS, "SIGN_PLUS"), root_1);
						adaptor.addChild(root_1, stream_primaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:146:1: primaryExpression : ( '(' ! logicalExpression ')' !| value );
	public final CLExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		CLExprParser.primaryExpression_return retval = new CLExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope logicalExpression32 =null;
		ParserRuleReturnScope value34 =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal33_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:147:2: ( '(' ! logicalExpression ')' !| value )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==OPEN_BRACE) ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= BINARY_FUN && LA9_0 <= BOOLEAN)||LA9_0==DATA_AREA||LA9_0==FLOAT||LA9_0==INTEGER||(LA9_0 >= SST_FUN && LA9_0 <= SWITCH_FUN)||LA9_0==TERM||LA9_0==VAR) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:147:4: '(' ! logicalExpression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal31=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_primaryExpression414); 
					pushFollow(FOLLOW_logicalExpression_in_primaryExpression417);
					logicalExpression32=logicalExpression();
					state._fsp--;

					adaptor.addChild(root_0, logicalExpression32.getTree());

					char_literal33=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_primaryExpression419); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:148:4: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression425);
					value34=value();
					state._fsp--;

					adaptor.addChild(root_0, value34.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:152:1: value : ( VAR | BOOLEAN | STRING | TERM | INTEGER | FLOAT | DATA_AREA | binary_fun | sst_fun | switch_fun );
	public final CLExprParser.value_return value() throws RecognitionException {
		CLExprParser.value_return retval = new CLExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VAR35=null;
		Token BOOLEAN36=null;
		Token STRING37=null;
		Token TERM38=null;
		Token INTEGER39=null;
		Token FLOAT40=null;
		Token DATA_AREA41=null;
		ParserRuleReturnScope binary_fun42 =null;
		ParserRuleReturnScope sst_fun43 =null;
		ParserRuleReturnScope switch_fun44 =null;

		CommonTree VAR35_tree=null;
		CommonTree BOOLEAN36_tree=null;
		CommonTree STRING37_tree=null;
		CommonTree TERM38_tree=null;
		CommonTree INTEGER39_tree=null;
		CommonTree FLOAT40_tree=null;
		CommonTree DATA_AREA41_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:152:7: ( VAR | BOOLEAN | STRING | TERM | INTEGER | FLOAT | DATA_AREA | binary_fun | sst_fun | switch_fun )
			int alt10=10;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt10=1;
				}
				break;
			case BOOLEAN:
				{
				alt10=2;
				}
				break;
			case STRING:
				{
				alt10=3;
				}
				break;
			case TERM:
				{
				alt10=4;
				}
				break;
			case INTEGER:
				{
				alt10=5;
				}
				break;
			case FLOAT:
				{
				alt10=6;
				}
				break;
			case DATA_AREA:
				{
				alt10=7;
				}
				break;
			case BINARY_FUN:
				{
				alt10=8;
				}
				break;
			case SST_FUN:
				{
				alt10=9;
				}
				break;
			case SWITCH_FUN:
				{
				alt10=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:154:2: VAR
					{
					root_0 = (CommonTree)adaptor.nil();


					VAR35=(Token)match(input,VAR,FOLLOW_VAR_in_value438); 
					VAR35_tree = (CommonTree)adaptor.create(VAR35);
					adaptor.addChild(root_0, VAR35_tree);

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:156:2: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN36=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value444); 
					BOOLEAN36_tree = (CommonTree)adaptor.create(BOOLEAN36);
					adaptor.addChild(root_0, BOOLEAN36_tree);

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:158:2: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING37=(Token)match(input,STRING,FOLLOW_STRING_in_value450); 
					STRING37_tree = (CommonTree)adaptor.create(STRING37);
					adaptor.addChild(root_0, STRING37_tree);

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:160:2: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM38=(Token)match(input,TERM,FOLLOW_TERM_in_value456); 
					TERM38_tree = (CommonTree)adaptor.create(TERM38);
					adaptor.addChild(root_0, TERM38_tree);

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:162:2: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER39=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value462); 
					INTEGER39_tree = (CommonTree)adaptor.create(INTEGER39);
					adaptor.addChild(root_0, INTEGER39_tree);

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:164:2: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT40=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value468); 
					FLOAT40_tree = (CommonTree)adaptor.create(FLOAT40);
					adaptor.addChild(root_0, FLOAT40_tree);

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:166:2: DATA_AREA
					{
					root_0 = (CommonTree)adaptor.nil();


					DATA_AREA41=(Token)match(input,DATA_AREA,FOLLOW_DATA_AREA_in_value474); 
					DATA_AREA41_tree = (CommonTree)adaptor.create(DATA_AREA41);
					adaptor.addChild(root_0, DATA_AREA41_tree);

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:168:2: binary_fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binary_fun_in_value480);
					binary_fun42=binary_fun();
					state._fsp--;

					adaptor.addChild(root_0, binary_fun42.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:170:2: sst_fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sst_fun_in_value486);
					sst_fun43=sst_fun();
					state._fsp--;

					adaptor.addChild(root_0, sst_fun43.getTree());

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:172:2: switch_fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switch_fun_in_value492);
					switch_fun44=switch_fun();
					state._fsp--;

					adaptor.addChild(root_0, switch_fun44.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class binary_fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binary_fun"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:176:1: binary_fun : BINARY_FUN '(' ( value )? ')' -> ^( BINARY_FUN[$BINARY_FUN.text] ( value )? ) ;
	public final CLExprParser.binary_fun_return binary_fun() throws RecognitionException {
		CLExprParser.binary_fun_return retval = new CLExprParser.binary_fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BINARY_FUN45=null;
		Token char_literal46=null;
		Token char_literal48=null;
		ParserRuleReturnScope value47 =null;

		CommonTree BINARY_FUN45_tree=null;
		CommonTree char_literal46_tree=null;
		CommonTree char_literal48_tree=null;
		RewriteRuleTokenStream stream_BINARY_FUN=new RewriteRuleTokenStream(adaptor,"token BINARY_FUN");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:177:2: ( BINARY_FUN '(' ( value )? ')' -> ^( BINARY_FUN[$BINARY_FUN.text] ( value )? ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:178:3: BINARY_FUN '(' ( value )? ')'
			{
			BINARY_FUN45=(Token)match(input,BINARY_FUN,FOLLOW_BINARY_FUN_in_binary_fun506);  
			stream_BINARY_FUN.add(BINARY_FUN45);

			char_literal46=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_binary_fun508);  
			stream_OPEN_BRACE.add(char_literal46);

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:178:18: ( value )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= BINARY_FUN && LA11_0 <= BOOLEAN)||LA11_0==DATA_AREA||LA11_0==FLOAT||LA11_0==INTEGER||(LA11_0 >= SST_FUN && LA11_0 <= SWITCH_FUN)||LA11_0==TERM||LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:178:18: value
					{
					pushFollow(FOLLOW_value_in_binary_fun510);
					value47=value();
					state._fsp--;

					stream_value.add(value47.getTree());
					}
					break;

			}

			char_literal48=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_binary_fun513);  
			stream_CLOSE_BRACE.add(char_literal48);

			// AST REWRITE
			// elements: BINARY_FUN, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 178:29: -> ^( BINARY_FUN[$BINARY_FUN.text] ( value )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:178:32: ^( BINARY_FUN[$BINARY_FUN.text] ( value )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BINARY_FUN, (BINARY_FUN45!=null?BINARY_FUN45.getText():null)), root_1);
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:178:63: ( value )?
				if ( stream_value.hasNext() ) {
					adaptor.addChild(root_1, stream_value.nextTree());
				}
				stream_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binary_fun"


	public static class sst_fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sst_fun"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:181:1: sst_fun : SST_FUN '(' value value value ')' -> ^( SST_FUN[\"\\%SST\"] value value value ) ;
	public final CLExprParser.sst_fun_return sst_fun() throws RecognitionException {
		CLExprParser.sst_fun_return retval = new CLExprParser.sst_fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SST_FUN49=null;
		Token char_literal50=null;
		Token char_literal54=null;
		ParserRuleReturnScope value51 =null;
		ParserRuleReturnScope value52 =null;
		ParserRuleReturnScope value53 =null;

		CommonTree SST_FUN49_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal54_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_SST_FUN=new RewriteRuleTokenStream(adaptor,"token SST_FUN");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:182:2: ( SST_FUN '(' value value value ')' -> ^( SST_FUN[\"\\%SST\"] value value value ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:183:3: SST_FUN '(' value value value ')'
			{
			SST_FUN49=(Token)match(input,SST_FUN,FOLLOW_SST_FUN_in_sst_fun537);  
			stream_SST_FUN.add(SST_FUN49);

			char_literal50=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_sst_fun539);  
			stream_OPEN_BRACE.add(char_literal50);

			pushFollow(FOLLOW_value_in_sst_fun541);
			value51=value();
			state._fsp--;

			stream_value.add(value51.getTree());
			pushFollow(FOLLOW_value_in_sst_fun543);
			value52=value();
			state._fsp--;

			stream_value.add(value52.getTree());
			pushFollow(FOLLOW_value_in_sst_fun545);
			value53=value();
			state._fsp--;

			stream_value.add(value53.getTree());
			char_literal54=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_sst_fun547);  
			stream_CLOSE_BRACE.add(char_literal54);

			// AST REWRITE
			// elements: value, SST_FUN, value, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 183:37: -> ^( SST_FUN[\"\\%SST\"] value value value )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:183:40: ^( SST_FUN[\"\\%SST\"] value value value )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SST_FUN, "%SST"), root_1);
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sst_fun"


	public static class switch_fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switch_fun"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:186:1: switch_fun : SWITCH_FUN '(' SWITCH_VALUE ')' -> ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE ) ;
	public final CLExprParser.switch_fun_return switch_fun() throws RecognitionException {
		CLExprParser.switch_fun_return retval = new CLExprParser.switch_fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SWITCH_FUN55=null;
		Token char_literal56=null;
		Token SWITCH_VALUE57=null;
		Token char_literal58=null;

		CommonTree SWITCH_FUN55_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree SWITCH_VALUE57_tree=null;
		CommonTree char_literal58_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_SWITCH_VALUE=new RewriteRuleTokenStream(adaptor,"token SWITCH_VALUE");
		RewriteRuleTokenStream stream_SWITCH_FUN=new RewriteRuleTokenStream(adaptor,"token SWITCH_FUN");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:187:2: ( SWITCH_FUN '(' SWITCH_VALUE ')' -> ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:188:3: SWITCH_FUN '(' SWITCH_VALUE ')'
			{
			SWITCH_FUN55=(Token)match(input,SWITCH_FUN,FOLLOW_SWITCH_FUN_in_switch_fun576);  
			stream_SWITCH_FUN.add(SWITCH_FUN55);

			char_literal56=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_switch_fun578);  
			stream_OPEN_BRACE.add(char_literal56);

			SWITCH_VALUE57=(Token)match(input,SWITCH_VALUE,FOLLOW_SWITCH_VALUE_in_switch_fun580);  
			stream_SWITCH_VALUE.add(SWITCH_VALUE57);

			char_literal58=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_switch_fun582);  
			stream_CLOSE_BRACE.add(char_literal58);

			// AST REWRITE
			// elements: SWITCH_VALUE, SWITCH_FUN
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 188:35: -> ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:188:38: ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_FUN, (SWITCH_FUN55!=null?SWITCH_FUN55.getText():null)), root_1);
				adaptor.addChild(root_1, stream_SWITCH_VALUE.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switch_fun"

	// Delegated rules



	public static final BitSet FOLLOW_logicalExpression_in_expression150 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression168 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression171 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression174 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression188 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression191 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression194 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression207 = new BitSet(new long[]{0x0000008000100002L});
	public static final BitSet FOLLOW_set_in_equalityExpression210 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression217 = new BitSet(new long[]{0x0000008000100002L});
	public static final BitSet FOLLOW_concatExpression_in_relationalExpression230 = new BitSet(new long[]{0x0000030603000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression234 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_concatExpression_in_relationalExpression249 = new BitSet(new long[]{0x0000030603000002L});
	public static final BitSet FOLLOW_additiveExpression_in_concatExpression265 = new BitSet(new long[]{0x0400000000000882L});
	public static final BitSet FOLLOW_set_in_concatExpression269 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_additiveExpression_in_concatExpression278 = new BitSet(new long[]{0x0400000000000882L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression293 = new BitSet(new long[]{0x0000801000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression297 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression304 = new BitSet(new long[]{0x0000801000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression320 = new BitSet(new long[]{0x0000002000040002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression324 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression331 = new BitSet(new long[]{0x0000002000040002L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression359 = new BitSet(new long[]{0x48E0100010408300L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression371 = new BitSet(new long[]{0x48E0100010408300L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression390 = new BitSet(new long[]{0x48E0100010408300L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_primaryExpression414 = new BitSet(new long[]{0x48E0941010408300L});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression417 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_primaryExpression419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_value438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATA_AREA_in_value474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_fun_in_value480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sst_fun_in_value486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_fun_in_value492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_FUN_in_binary_fun506 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_binary_fun508 = new BitSet(new long[]{0x48E000001040A300L});
	public static final BitSet FOLLOW_value_in_binary_fun510 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_binary_fun513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SST_FUN_in_sst_fun537 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_sst_fun539 = new BitSet(new long[]{0x48E0000010408300L});
	public static final BitSet FOLLOW_value_in_sst_fun541 = new BitSet(new long[]{0x48E0000010408300L});
	public static final BitSet FOLLOW_value_in_sst_fun543 = new BitSet(new long[]{0x48E0000010408300L});
	public static final BitSet FOLLOW_value_in_sst_fun545 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_sst_fun547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_FUN_in_switch_fun576 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_switch_fun578 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_SWITCH_VALUE_in_switch_fun580 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_switch_fun582 = new BitSet(new long[]{0x0000000000000002L});
}
