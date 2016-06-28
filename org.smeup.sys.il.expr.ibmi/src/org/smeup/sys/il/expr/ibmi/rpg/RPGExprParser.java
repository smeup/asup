// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g 2016-06-27 13:46:12

  package org.smeup.sys.il.expr.ibmi.rpg;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class RPGExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "ALLX", "AND", "ARRAY", 
		"B", "BI_FUN", "BI_FUNCTION", "BLOCK", "BOOLEAN", "C", "CHAR_SPECIAL", 
		"D", "DATE", "DIGIT", "DIGIT_SPECIAL", "DIV", "E", "EQ", "EscapeSequence", 
		"F", "FLOAT", "G", "GT", "GTEQ", "H", "HEX", "HexDigit", "I", "IN", "INDICATOR", 
		"INNR", "INNU", "INTEGER", "J", "K", "L", "LETTER", "LT", "LTEQ", "M", 
		"MINUS", "MOD", "MULT", "N", "NE", "NOT", "O", "OR", "P", "PLUS", "POINT", 
		"POW", "Q", "QUALIFIED", "R", "S", "SIGN_MINUS", "SIGN_PLUS", "SPECIAL", 
		"SP_VALUE", "STRING", "T", "TERM", "TIME", "TIMESTAMP", "U", "USER_FUNCTION", 
		"UnicodeEscape", "V", "W", "WS", "X", "Y", "Z", "'('", "')'", "':'", "'['", 
		"']'"
	};
	public static final int EOF=-1;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int A=4;
	public static final int ALL=5;
	public static final int ALLX=6;
	public static final int AND=7;
	public static final int ARRAY=8;
	public static final int B=9;
	public static final int BI_FUN=10;
	public static final int BI_FUNCTION=11;
	public static final int BLOCK=12;
	public static final int BOOLEAN=13;
	public static final int C=14;
	public static final int CHAR_SPECIAL=15;
	public static final int D=16;
	public static final int DATE=17;
	public static final int DIGIT=18;
	public static final int DIGIT_SPECIAL=19;
	public static final int DIV=20;
	public static final int E=21;
	public static final int EQ=22;
	public static final int EscapeSequence=23;
	public static final int F=24;
	public static final int FLOAT=25;
	public static final int G=26;
	public static final int GT=27;
	public static final int GTEQ=28;
	public static final int H=29;
	public static final int HEX=30;
	public static final int HexDigit=31;
	public static final int I=32;
	public static final int IN=33;
	public static final int INDICATOR=34;
	public static final int INNR=35;
	public static final int INNU=36;
	public static final int INTEGER=37;
	public static final int J=38;
	public static final int K=39;
	public static final int L=40;
	public static final int LETTER=41;
	public static final int LT=42;
	public static final int LTEQ=43;
	public static final int M=44;
	public static final int MINUS=45;
	public static final int MOD=46;
	public static final int MULT=47;
	public static final int N=48;
	public static final int NE=49;
	public static final int NOT=50;
	public static final int O=51;
	public static final int OR=52;
	public static final int P=53;
	public static final int PLUS=54;
	public static final int POINT=55;
	public static final int POW=56;
	public static final int Q=57;
	public static final int QUALIFIED=58;
	public static final int R=59;
	public static final int S=60;
	public static final int SIGN_MINUS=61;
	public static final int SIGN_PLUS=62;
	public static final int SPECIAL=63;
	public static final int SP_VALUE=64;
	public static final int STRING=65;
	public static final int T=66;
	public static final int TERM=67;
	public static final int TIME=68;
	public static final int TIMESTAMP=69;
	public static final int U=70;
	public static final int USER_FUNCTION=71;
	public static final int UnicodeEscape=72;
	public static final int V=73;
	public static final int W=74;
	public static final int WS=75;
	public static final int X=76;
	public static final int Y=77;
	public static final int Z=78;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RPGExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RPGExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return RPGExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g"; }



	   @Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

		@Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String msg = "RPGExprParser error. Input: " + e.input.toString();
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:96:1: expression : logicalExpression EOF !;
	public final RPGExprParser.expression_return expression() throws RecognitionException {
		RPGExprParser.expression_return retval = new RPGExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:97:2: ( logicalExpression EOF !)
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:97:5: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression154);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression156); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:100:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final RPGExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		RPGExprParser.logicalExpression_return retval = new RPGExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:101:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:101:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression168);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:101:25: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:101:26: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression171); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression174);
					booleanAndExpression5=booleanAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression5.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:104:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final RPGExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		RPGExprParser.booleanAndExpression_return retval = new RPGExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:105:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:105:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression188);
			equalityExpression6=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression6.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:105:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:105:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression194);
					equalityExpression8=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression8.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:109:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final RPGExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		RPGExprParser.equalityExpression_return retval = new RPGExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:110:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:110:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression208);
			relationalExpression9=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression9.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:110:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:110:26: ( EQ | NE ) ^ relationalExpression
					{
					set10=input.LT(1);
					set10=input.LT(1);
					if ( input.LA(1)==EQ||input.LA(1)==NE ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set10), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression218);
					relationalExpression11=relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression11.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:113:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final RPGExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		RPGExprParser.relationalExpression_return retval = new RPGExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope additiveExpression12 =null;
		ParserRuleReturnScope additiveExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:114:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:114:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression231);
			additiveExpression12=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression12.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:114:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:114:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
					{
					set13=input.LT(1);
					set13=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set13), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression246);
					additiveExpression14=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression14.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:118:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final RPGExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		RPGExprParser.additiveExpression_return retval = new RPGExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope multiplicativeExpression15 =null;
		ParserRuleReturnScope multiplicativeExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:119:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:119:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression261);
			multiplicativeExpression15=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression15.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:119:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:119:31: ( PLUS | MINUS ) ^ multiplicativeExpression
					{
					set16=input.LT(1);
					set16=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression272);
					multiplicativeExpression17=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression17.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:122:1: multiplicativeExpression : powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* ;
	public final RPGExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		RPGExprParser.multiplicativeExpression_return retval = new RPGExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope powerExpression18 =null;
		ParserRuleReturnScope powerExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:123:2: ( powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:124:3: powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression288);
			powerExpression18=powerExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression18.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:124:19: ( ( MULT | DIV | MOD ) ^ powerExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||(LA6_0 >= MOD && LA6_0 <= MULT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:124:21: ( MULT | DIV | MOD ) ^ powerExpression
					{
					set19=input.LT(1);
					set19=input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set19), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression301);
					powerExpression20=powerExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression20.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class powerExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "powerExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:1: powerExpression : (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* ;
	public final RPGExprParser.powerExpression_return powerExpression() throws RecognitionException {
		RPGExprParser.powerExpression_return retval = new RPGExprParser.powerExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT21=null;
		Token MULT22=null;
		ParserRuleReturnScope v1 =null;
		ParserRuleReturnScope v2 =null;

		CommonTree MULT21_tree=null;
		CommonTree MULT22_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:2: ( (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:4: (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:4: (v1= unaryExpression -> unaryExpression )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:5: v1= unaryExpression
			{
			pushFollow(FOLLOW_unaryExpression_in_powerExpression317);
			v1=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryExpression.add(v1.getTree());
			// AST REWRITE
			// elements: unaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 128:24: -> unaryExpression
			{
				adaptor.addChild(root_0, stream_unaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:44: ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==MULT) ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1==MULT) ) {
						switch ( input.LA(3) ) {
						case ALL:
							{
							int LA7_4 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

							}
							break;
						case ALLX:
							{
							int LA7_5 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

							}
							break;
						case SPECIAL:
							{
							int LA7_6 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

							}
							break;
						case IN:
							{
							int LA7_7 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

							}
							break;
						case INNR:
							{
							int LA7_8 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

							}
							break;
						case INNU:
							{
							int LA7_9 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

							}
							break;
						case BI_FUN:
						case BOOLEAN:
						case DATE:
						case FLOAT:
						case HEX:
						case INTEGER:
						case MINUS:
						case MULT:
						case NOT:
						case PLUS:
						case STRING:
						case TERM:
						case TIME:
						case TIMESTAMP:
						case 79:
						case 82:
							{
							alt7=1;
							}
							break;
						}
					}

				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:45: ( MULT MULT v2= unaryExpression )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:45: ( MULT MULT v2= unaryExpression )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:47: MULT MULT v2= unaryExpression
					{
					MULT21=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression327); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT21);

					MULT22=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression329); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT22);

					pushFollow(FOLLOW_unaryExpression_in_powerExpression333);
					v2=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(v2.getTree());
					}

					// AST REWRITE
					// elements: v1, v2
					// token labels: 
					// rule labels: v1, v2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.getTree():null);
					RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 128:78: -> ^( POW $v1 $v2)
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:81: ^( POW $v1 $v2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);
						adaptor.addChild(root_1, stream_v1.nextTree());
						adaptor.addChild(root_1, stream_v2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "powerExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:131:1: unaryExpression : ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) );
	public final RPGExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		RPGExprParser.unaryExpression_return retval = new RPGExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT24=null;
		Token MINUS26=null;
		Token PLUS28=null;
		ParserRuleReturnScope qualified23 =null;
		ParserRuleReturnScope qualified25 =null;
		ParserRuleReturnScope qualified27 =null;
		ParserRuleReturnScope qualified29 =null;

		CommonTree NOT24_tree=null;
		CommonTree MINUS26_tree=null;
		CommonTree PLUS28_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_qualified=new RewriteRuleSubtreeStream(adaptor,"rule qualified");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:132:2: ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) )
			int alt8=4;
			switch ( input.LA(1) ) {
			case ALL:
			case ALLX:
			case BI_FUN:
			case BOOLEAN:
			case DATE:
			case FLOAT:
			case HEX:
			case IN:
			case INNR:
			case INNU:
			case INTEGER:
			case MULT:
			case SPECIAL:
			case STRING:
			case TERM:
			case TIME:
			case TIMESTAMP:
			case 79:
			case 82:
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:133:4: qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_in_unaryExpression363);
					qualified23=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified23.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:134:8: NOT ^ qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT24=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression372); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT24_tree = (CommonTree)adaptor.create(NOT24);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT24_tree, root_0);
					}

					pushFollow(FOLLOW_qualified_in_unaryExpression375);
					qualified25=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified25.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:135:8: MINUS qualified
					{
					MINUS26=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression384); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS26);

					pushFollow(FOLLOW_qualified_in_unaryExpression386);
					qualified27=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualified.add(qualified27.getTree());
					// AST REWRITE
					// elements: qualified
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 135:24: -> ^( SIGN_MINUS qualified )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:135:27: ^( SIGN_MINUS qualified )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGN_MINUS, "SIGN_MINUS"), root_1);
						adaptor.addChild(root_1, stream_qualified.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:136:8: PLUS qualified
					{
					PLUS28=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS28);

					pushFollow(FOLLOW_qualified_in_unaryExpression405);
					qualified29=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualified.add(qualified29.getTree());
					// AST REWRITE
					// elements: qualified
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 136:24: -> ^( SIGN_PLUS qualified )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:136:27: ^( SIGN_PLUS qualified )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGN_PLUS, "SIGN_PLUS"), root_1);
						adaptor.addChild(root_1, stream_qualified.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class qualified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:139:1: qualified : (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* ;
	public final RPGExprParser.qualified_return qualified() throws RecognitionException {
		RPGExprParser.qualified_return retval = new RPGExprParser.qualified_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POINT30=null;
		List<Object> list_vals=null;
		ParserRuleReturnScope v =null;
		RuleReturnScope vals = null;
		CommonTree POINT30_tree=null;
		RewriteRuleTokenStream stream_POINT=new RewriteRuleTokenStream(adaptor,"token POINT");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:2: ( (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:3: (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:3: (v= primaryExpression -> primaryExpression )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:4: v= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_qualified437);
			v=primaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryExpression.add(v.getTree());
			// AST REWRITE
			// elements: primaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 141:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:46: ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==POINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:47: ( POINT vals+= primaryExpression )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:47: ( POINT vals+= primaryExpression )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:48: POINT vals+= primaryExpression
					{
					POINT30=(Token)match(input,POINT,FOLLOW_POINT_in_qualified446); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POINT.add(POINT30);

					pushFollow(FOLLOW_primaryExpression_in_qualified450);
					vals=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primaryExpression.add(vals.getTree());
					if (list_vals==null) list_vals=new ArrayList<Object>();
					list_vals.add(vals.getTree());
					}

					// AST REWRITE
					// elements: vals, v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: vals
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_vals=new RewriteRuleSubtreeStream(adaptor,"token vals",list_vals);
					root_0 = (CommonTree)adaptor.nil();
					// 141:79: -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:82: ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_1, stream_v.nextTree());
						if ( !(stream_vals.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_vals.hasNext() ) {
							adaptor.addChild(root_1, stream_vals.nextTree());
						}
						stream_vals.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "qualified"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:144:1: primaryExpression : ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | array | value );
	public final RPGExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		RPGExprParser.primaryExpression_return retval = new RPGExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope logicalExpression32 =null;
		ParserRuleReturnScope array34 =null;
		ParserRuleReturnScope value35 =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:145:2: ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | array | value )
			int alt10=3;
			switch ( input.LA(1) ) {
			case 79:
				{
				alt10=1;
				}
				break;
			case 82:
				{
				alt10=2;
				}
				break;
			case ALL:
			case ALLX:
			case BI_FUN:
			case BOOLEAN:
			case DATE:
			case FLOAT:
			case HEX:
			case IN:
			case INNR:
			case INNU:
			case INTEGER:
			case MULT:
			case SPECIAL:
			case STRING:
			case TERM:
			case TIME:
			case TIMESTAMP:
				{
				alt10=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:145:4: '(' logicalExpression ')'
					{
					char_literal31=(Token)match(input,79,FOLLOW_79_in_primaryExpression483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal31);

					pushFollow(FOLLOW_logicalExpression_in_primaryExpression485);
					logicalExpression32=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression32.getTree());
					char_literal33=(Token)match(input,80,FOLLOW_80_in_primaryExpression487); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(char_literal33);

					// AST REWRITE
					// elements: logicalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 145:30: -> ^( BLOCK[$primaryExpression.text] logicalExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:145:33: ^( BLOCK[$primaryExpression.text] logicalExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_1, stream_logicalExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:147:3: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_primaryExpression506);
					array34=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array34.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:149:3: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression514);
					value35=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value35.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:152:1: array : '[' value ( ':' value )* ']' -> ^( ARRAY value ( value )* ) ;
	public final RPGExprParser.array_return array() throws RecognitionException {
		RPGExprParser.array_return retval = new RPGExprParser.array_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		Token char_literal38=null;
		Token char_literal40=null;
		ParserRuleReturnScope value37 =null;
		ParserRuleReturnScope value39 =null;

		CommonTree char_literal36_tree=null;
		CommonTree char_literal38_tree=null;
		CommonTree char_literal40_tree=null;
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:2: ( '[' value ( ':' value )* ']' -> ^( ARRAY value ( value )* ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:154:2: '[' value ( ':' value )* ']'
			{
			char_literal36=(Token)match(input,82,FOLLOW_82_in_array526); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_82.add(char_literal36);

			pushFollow(FOLLOW_value_in_array528);
			value37=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_value.add(value37.getTree());
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:154:12: ( ':' value )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==81) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:154:13: ':' value
					{
					char_literal38=(Token)match(input,81,FOLLOW_81_in_array531); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(char_literal38);

					pushFollow(FOLLOW_value_in_array533);
					value39=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(value39.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			char_literal40=(Token)match(input,83,FOLLOW_83_in_array537); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_83.add(char_literal40);

			// AST REWRITE
			// elements: value, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 154:29: -> ^( ARRAY value ( value )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:154:32: ^( ARRAY value ( value )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_value.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:154:46: ( value )*
				while ( stream_value.hasNext() ) {
					adaptor.addChild(root_1, stream_value.nextTree());
				}
				stream_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "array"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:157:1: value : ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | ( SPECIAL -> TERM[$SPECIAL.text] ) | ( IN -> TERM[$IN.text] ) | ( INNR -> TERM[$INNR.text] ) | ( INNU -> TERM[$INNU.text] ) | ( ALL -> TERM[$ALL.text] ) | ( ALLX -> TERM[$ALLX.text] ) | filler | special | bi_function | usr_function | indicator | TERM );
	public final RPGExprParser.value_return value() throws RecognitionException {
		RPGExprParser.value_return retval = new RPGExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER41=null;
		Token FLOAT42=null;
		Token DATE43=null;
		Token TIME44=null;
		Token TIMESTAMP45=null;
		Token BOOLEAN46=null;
		Token STRING47=null;
		Token HEX48=null;
		Token SPECIAL49=null;
		Token IN50=null;
		Token INNR51=null;
		Token INNU52=null;
		Token ALL53=null;
		Token ALLX54=null;
		Token TERM60=null;
		ParserRuleReturnScope filler55 =null;
		ParserRuleReturnScope special56 =null;
		ParserRuleReturnScope bi_function57 =null;
		ParserRuleReturnScope usr_function58 =null;
		ParserRuleReturnScope indicator59 =null;

		CommonTree INTEGER41_tree=null;
		CommonTree FLOAT42_tree=null;
		CommonTree DATE43_tree=null;
		CommonTree TIME44_tree=null;
		CommonTree TIMESTAMP45_tree=null;
		CommonTree BOOLEAN46_tree=null;
		CommonTree STRING47_tree=null;
		CommonTree HEX48_tree=null;
		CommonTree SPECIAL49_tree=null;
		CommonTree IN50_tree=null;
		CommonTree INNR51_tree=null;
		CommonTree INNU52_tree=null;
		CommonTree ALL53_tree=null;
		CommonTree ALLX54_tree=null;
		CommonTree TERM60_tree=null;
		RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token TIMESTAMP");
		RewriteRuleTokenStream stream_ALLX=new RewriteRuleTokenStream(adaptor,"token ALLX");
		RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
		RewriteRuleTokenStream stream_HEX=new RewriteRuleTokenStream(adaptor,"token HEX");
		RewriteRuleTokenStream stream_INNR=new RewriteRuleTokenStream(adaptor,"token INNR");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");
		RewriteRuleTokenStream stream_INNU=new RewriteRuleTokenStream(adaptor,"token INNU");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:158:2: ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | ( SPECIAL -> TERM[$SPECIAL.text] ) | ( IN -> TERM[$IN.text] ) | ( INNR -> TERM[$INNR.text] ) | ( INNU -> TERM[$INNU.text] ) | ( ALL -> TERM[$ALL.text] ) | ( ALLX -> TERM[$ALLX.text] ) | filler | special | bi_function | usr_function | indicator | TERM )
			int alt12=20;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt12=1;
				}
				break;
			case FLOAT:
				{
				alt12=2;
				}
				break;
			case DATE:
				{
				alt12=3;
				}
				break;
			case TIME:
				{
				alt12=4;
				}
				break;
			case TIMESTAMP:
				{
				alt12=5;
				}
				break;
			case BOOLEAN:
				{
				alt12=6;
				}
				break;
			case STRING:
				{
				alt12=7;
				}
				break;
			case HEX:
				{
				alt12=8;
				}
				break;
			case SPECIAL:
				{
				int LA12_9 = input.LA(2);
				if ( (LA12_9==EOF||LA12_9==AND||LA12_9==DIV||LA12_9==EQ||(LA12_9 >= GT && LA12_9 <= GTEQ)||(LA12_9 >= LT && LA12_9 <= LTEQ)||(LA12_9 >= MINUS && LA12_9 <= MULT)||LA12_9==NE||LA12_9==OR||(LA12_9 >= PLUS && LA12_9 <= POINT)||(LA12_9 >= 80 && LA12_9 <= 81)||LA12_9==83) ) {
					alt12=9;
				}
				else if ( (LA12_9==79) ) {
					alt12=18;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IN:
				{
				int LA12_10 = input.LA(2);
				if ( (LA12_10==EOF||LA12_10==AND||LA12_10==DIV||LA12_10==EQ||(LA12_10 >= GT && LA12_10 <= GTEQ)||(LA12_10 >= LT && LA12_10 <= LTEQ)||(LA12_10 >= MINUS && LA12_10 <= MULT)||LA12_10==NE||LA12_10==OR||(LA12_10 >= PLUS && LA12_10 <= POINT)||(LA12_10 >= 80 && LA12_10 <= 81)||LA12_10==83) ) {
					alt12=10;
				}
				else if ( (LA12_10==79) ) {
					alt12=18;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INNR:
				{
				alt12=11;
				}
				break;
			case INNU:
				{
				alt12=12;
				}
				break;
			case ALL:
				{
				alt12=13;
				}
				break;
			case ALLX:
				{
				alt12=14;
				}
				break;
			case MULT:
				{
				switch ( input.LA(2) ) {
				case ALL:
				case ALLX:
					{
					alt12=15;
					}
					break;
				case SPECIAL:
					{
					alt12=16;
					}
					break;
				case IN:
				case INNR:
				case INNU:
					{
					alt12=19;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BI_FUN:
				{
				alt12=17;
				}
				break;
			case TERM:
				{
				int LA12_17 = input.LA(2);
				if ( (LA12_17==79) ) {
					alt12=18;
				}
				else if ( (LA12_17==EOF||LA12_17==AND||LA12_17==DIV||LA12_17==EQ||(LA12_17 >= GT && LA12_17 <= GTEQ)||(LA12_17 >= LT && LA12_17 <= LTEQ)||(LA12_17 >= MINUS && LA12_17 <= MULT)||LA12_17==NE||LA12_17==OR||(LA12_17 >= PLUS && LA12_17 <= POINT)||(LA12_17 >= 80 && LA12_17 <= 81)||LA12_17==83) ) {
					alt12=20;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:159:3: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER41=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value562); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER41_tree = (CommonTree)adaptor.create(INTEGER41);
					adaptor.addChild(root_0, INTEGER41_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:160:4: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT42=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value567); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT42_tree = (CommonTree)adaptor.create(FLOAT42);
					adaptor.addChild(root_0, FLOAT42_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:161:5: DATE
					{
					DATE43=(Token)match(input,DATE,FOLLOW_DATE_in_value573); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DATE.add(DATE43);

					// AST REWRITE
					// elements: DATE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 161:10: -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:161:13: ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DATE, (DATE43!=null?DATE43.getText():null).substring(2, (DATE43!=null?DATE43.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:4: TIME
					{
					TIME44=(Token)match(input,TIME,FOLLOW_TIME_in_value585); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME44);

					// AST REWRITE
					// elements: TIME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 162:9: -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:12: ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, (TIME44!=null?TIME44.getText():null).substring(2, (TIME44!=null?TIME44.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:163:4: TIMESTAMP
					{
					TIMESTAMP45=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_value597); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP45);

					// AST REWRITE
					// elements: TIMESTAMP
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 163:14: -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:163:17: ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMESTAMP, (TIMESTAMP45!=null?TIMESTAMP45.getText():null).substring(2, (TIMESTAMP45!=null?TIMESTAMP45.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:164:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN46=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value609); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN46_tree = (CommonTree)adaptor.create(BOOLEAN46);
					adaptor.addChild(root_0, BOOLEAN46_tree);
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:165:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING47=(Token)match(input,STRING,FOLLOW_STRING_in_value614); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING47_tree = (CommonTree)adaptor.create(STRING47);
					adaptor.addChild(root_0, STRING47_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:4: HEX
					{
					HEX48=(Token)match(input,HEX,FOLLOW_HEX_in_value619); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HEX.add(HEX48);

					// AST REWRITE
					// elements: HEX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 166:8: -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:11: ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HEX, (HEX48!=null?HEX48.getText():null).substring(2, (HEX48!=null?HEX48.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:4: ( SPECIAL -> TERM[$SPECIAL.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:4: ( SPECIAL -> TERM[$SPECIAL.text] )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:5: SPECIAL
					{
					SPECIAL49=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value632); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL49);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 167:13: -> TERM[$SPECIAL.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (SPECIAL49!=null?SPECIAL49.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:4: ( IN -> TERM[$IN.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:4: ( IN -> TERM[$IN.text] )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:5: IN
					{
					IN50=(Token)match(input,IN,FOLLOW_IN_in_value644); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN50);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 168:8: -> TERM[$IN.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (IN50!=null?IN50.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:4: ( INNR -> TERM[$INNR.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:4: ( INNR -> TERM[$INNR.text] )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:5: INNR
					{
					INNR51=(Token)match(input,INNR,FOLLOW_INNR_in_value656); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR51);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 169:10: -> TERM[$INNR.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (INNR51!=null?INNR51.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:4: ( INNU -> TERM[$INNU.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:4: ( INNU -> TERM[$INNU.text] )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:5: INNU
					{
					INNU52=(Token)match(input,INNU,FOLLOW_INNU_in_value668); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 170:10: -> TERM[$INNU.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (INNU52!=null?INNU52.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:4: ( ALL -> TERM[$ALL.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:4: ( ALL -> TERM[$ALL.text] )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:5: ALL
					{
					ALL53=(Token)match(input,ALL,FOLLOW_ALL_in_value680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL53);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 171:9: -> TERM[$ALL.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (ALL53!=null?ALL53.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:172:4: ( ALLX -> TERM[$ALLX.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:172:4: ( ALLX -> TERM[$ALLX.text] )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:172:5: ALLX
					{
					ALLX54=(Token)match(input,ALLX,FOLLOW_ALLX_in_value692); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALLX.add(ALLX54);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 172:10: -> TERM[$ALLX.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (ALLX54!=null?ALLX54.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:173:4: filler
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filler_in_value703);
					filler55=filler();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, filler55.getTree());

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:174:4: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_value708);
					special56=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special56.getTree());

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:175:4: bi_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bi_function_in_value713);
					bi_function57=bi_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_function57.getTree());

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:176:4: usr_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_usr_function_in_value718);
					usr_function58=usr_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, usr_function58.getTree());

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:177:7: indicator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_indicator_in_value726);
					indicator59=indicator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indicator59.getTree());

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:178:4: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM60=(Token)match(input,TERM,FOLLOW_TERM_in_value731); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TERM60_tree = (CommonTree)adaptor.create(TERM60);
					adaptor.addChild(root_0, TERM60_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class indicator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "indicator"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:182:1: indicator : ( MULT IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | MULT INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] ) | MULT INNU -> ^( INDICATOR[\"*\" + $INNU.text] ) | MULT IN -> ^( INDICATOR[\"*\" + $IN.text] ) );
	public final RPGExprParser.indicator_return indicator() throws RecognitionException {
		RPGExprParser.indicator_return retval = new RPGExprParser.indicator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT61=null;
		Token IN62=null;
		Token char_literal63=null;
		Token char_literal65=null;
		Token MULT66=null;
		Token INNR67=null;
		Token MULT68=null;
		Token INNU69=null;
		Token MULT70=null;
		Token IN71=null;
		ParserRuleReturnScope logicalExpression64 =null;

		CommonTree MULT61_tree=null;
		CommonTree IN62_tree=null;
		CommonTree char_literal63_tree=null;
		CommonTree char_literal65_tree=null;
		CommonTree MULT66_tree=null;
		CommonTree INNR67_tree=null;
		CommonTree MULT68_tree=null;
		CommonTree INNU69_tree=null;
		CommonTree MULT70_tree=null;
		CommonTree IN71_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_INNR=new RewriteRuleTokenStream(adaptor,"token INNR");
		RewriteRuleTokenStream stream_INNU=new RewriteRuleTokenStream(adaptor,"token INNU");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:183:2: ( MULT IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | MULT INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] ) | MULT INNU -> ^( INDICATOR[\"*\" + $INNU.text] ) | MULT IN -> ^( INDICATOR[\"*\" + $IN.text] ) )
			int alt13=4;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==MULT) ) {
				switch ( input.LA(2) ) {
				case IN:
					{
					int LA13_2 = input.LA(3);
					if ( (LA13_2==79) ) {
						alt13=1;
					}
					else if ( (LA13_2==EOF||LA13_2==AND||LA13_2==DIV||LA13_2==EQ||(LA13_2 >= GT && LA13_2 <= GTEQ)||(LA13_2 >= LT && LA13_2 <= LTEQ)||(LA13_2 >= MINUS && LA13_2 <= MULT)||LA13_2==NE||LA13_2==OR||(LA13_2 >= PLUS && LA13_2 <= POINT)||(LA13_2 >= 80 && LA13_2 <= 81)||LA13_2==83) ) {
						alt13=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case INNR:
					{
					alt13=2;
					}
					break;
				case INNU:
					{
					alt13=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:184:3: MULT IN '(' logicalExpression ')'
					{
					MULT61=(Token)match(input,MULT,FOLLOW_MULT_in_indicator746); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT61);

					IN62=(Token)match(input,IN,FOLLOW_IN_in_indicator748); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN62);

					char_literal63=(Token)match(input,79,FOLLOW_79_in_indicator750); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal63);

					pushFollow(FOLLOW_logicalExpression_in_indicator752);
					logicalExpression64=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression64.getTree());
					char_literal65=(Token)match(input,80,FOLLOW_80_in_indicator754); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(char_literal65);

					// AST REWRITE
					// elements: logicalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 184:37: -> ^( BI_FUNCTION[\"*IN\"] logicalExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:184:40: ^( BI_FUNCTION[\"*IN\"] logicalExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, stream_logicalExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:186:3: MULT INNR
					{
					MULT66=(Token)match(input,MULT,FOLLOW_MULT_in_indicator774); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT66);

					INNR67=(Token)match(input,INNR,FOLLOW_INNR_in_indicator776); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR67);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 186:13: -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:186:16: ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INTEGER, (INNR67!=null?INNR67.getText():null).substring(2)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:188:3: MULT INNU
					{
					MULT68=(Token)match(input,MULT,FOLLOW_MULT_in_indicator795); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT68);

					INNU69=(Token)match(input,INNU,FOLLOW_INNU_in_indicator797); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU69);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 188:13: -> ^( INDICATOR[\"*\" + $INNU.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:188:16: ^( INDICATOR[\"*\" + $INNU.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, "*" + (INNU69!=null?INNU69.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:190:3: MULT IN
					{
					MULT70=(Token)match(input,MULT,FOLLOW_MULT_in_indicator825); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT70);

					IN71=(Token)match(input,IN,FOLLOW_IN_in_indicator827); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN71);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 190:11: -> ^( INDICATOR[\"*\" + $IN.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:190:14: ^( INDICATOR[\"*\" + $IN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, "*" + (IN71!=null?IN71.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "indicator"


	public static class filler_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "filler"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:193:1: filler : ( MULT ALL -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] ) | MULT ALLX -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] ) );
	public final RPGExprParser.filler_return filler() throws RecognitionException {
		RPGExprParser.filler_return retval = new RPGExprParser.filler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT72=null;
		Token ALL73=null;
		Token MULT74=null;
		Token ALLX75=null;

		CommonTree MULT72_tree=null;
		CommonTree ALL73_tree=null;
		CommonTree MULT74_tree=null;
		CommonTree ALLX75_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_ALLX=new RewriteRuleTokenStream(adaptor,"token ALLX");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:193:8: ( MULT ALL -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] ) | MULT ALLX -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==MULT) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==ALL) ) {
					alt14=1;
				}
				else if ( (LA14_1==ALLX) ) {
					alt14=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:194:3: MULT ALL
					{
					MULT72=(Token)match(input,MULT,FOLLOW_MULT_in_filler857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT72);

					ALL73=(Token)match(input,ALL,FOLLOW_ALL_in_filler859); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL73);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 194:13: -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:194:16: ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING, (ALL73!=null?ALL73.getText():null).substring(4, (ALL73!=null?ALL73.getText():null).length()-1)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:196:3: MULT ALLX
					{
					MULT74=(Token)match(input,MULT,FOLLOW_MULT_in_filler881); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT74);

					ALLX75=(Token)match(input,ALLX,FOLLOW_ALLX_in_filler883); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALLX.add(ALLX75);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 196:13: -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:196:16: ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(HEX, (ALLX75!=null?ALLX75.getText():null).substring(5, (ALLX75!=null?ALLX75.getText():null).length()-1)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "filler"


	public static class special_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "special"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:199:1: special : MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] ;
	public final RPGExprParser.special_return special() throws RecognitionException {
		RPGExprParser.special_return retval = new RPGExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT76=null;
		Token SPECIAL77=null;

		CommonTree MULT76_tree=null;
		CommonTree SPECIAL77_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:199:9: ( MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:200:3: MULT SPECIAL
			{
			MULT76=(Token)match(input,MULT,FOLLOW_MULT_in_special910); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MULT.add(MULT76);

			SPECIAL77=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special912); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL77);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 200:16: -> SP_VALUE[$MULT.text + $SPECIAL.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(SP_VALUE, (MULT76!=null?MULT76.getText():null) + (SPECIAL77!=null?SPECIAL77.getText():null)));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "special"


	public static class usr_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "usr_function"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:204:1: usr_function : ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) | SPECIAL params -> ^( USER_FUNCTION[$SPECIAL.text] params ) | IN params -> ^( USER_FUNCTION[$IN.text] params ) );
	public final RPGExprParser.usr_function_return usr_function() throws RecognitionException {
		RPGExprParser.usr_function_return retval = new RPGExprParser.usr_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TERM78=null;
		Token TERM80=null;
		Token SPECIAL82=null;
		Token IN84=null;
		ParserRuleReturnScope params79 =null;
		ParserRuleReturnScope empty81 =null;
		ParserRuleReturnScope params83 =null;
		ParserRuleReturnScope params85 =null;

		CommonTree TERM78_tree=null;
		CommonTree TERM80_tree=null;
		CommonTree SPECIAL82_tree=null;
		CommonTree IN84_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_TERM=new RewriteRuleTokenStream(adaptor,"token TERM");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
		RewriteRuleSubtreeStream stream_empty=new RewriteRuleSubtreeStream(adaptor,"rule empty");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:2: ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) | SPECIAL params -> ^( USER_FUNCTION[$SPECIAL.text] params ) | IN params -> ^( USER_FUNCTION[$IN.text] params ) )
			int alt15=4;
			switch ( input.LA(1) ) {
			case TERM:
				{
				int LA15_1 = input.LA(2);
				if ( (LA15_1==79) ) {
					int LA15_4 = input.LA(3);
					if ( (LA15_4==80) ) {
						alt15=2;
					}
					else if ( ((LA15_4 >= ALL && LA15_4 <= ALLX)||LA15_4==BI_FUN||LA15_4==BOOLEAN||LA15_4==DATE||LA15_4==FLOAT||LA15_4==HEX||LA15_4==IN||(LA15_4 >= INNR && LA15_4 <= INTEGER)||LA15_4==MINUS||LA15_4==MULT||LA15_4==NOT||LA15_4==PLUS||LA15_4==SPECIAL||LA15_4==STRING||(LA15_4 >= TERM && LA15_4 <= TIMESTAMP)||LA15_4==79||LA15_4==82) ) {
						alt15=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SPECIAL:
				{
				alt15=3;
				}
				break;
			case IN:
				{
				alt15=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:4: TERM params
					{
					TERM78=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function929); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM78);

					pushFollow(FOLLOW_params_in_usr_function931);
					params79=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params79.getTree());
					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 205:17: -> ^( USER_FUNCTION[$TERM.text] params )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:20: ^( USER_FUNCTION[$TERM.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM78!=null?TERM78.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:207:3: TERM empty
					{
					TERM80=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function949); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM80);

					pushFollow(FOLLOW_empty_in_usr_function951);
					empty81=empty();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_empty.add(empty81.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 207:14: -> ^( USER_FUNCTION[$TERM.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:207:17: ^( USER_FUNCTION[$TERM.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM80!=null?TERM80.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:3: SPECIAL params
					{
					SPECIAL82=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_usr_function966); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL82);

					pushFollow(FOLLOW_params_in_usr_function968);
					params83=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params83.getTree());
					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 209:18: -> ^( USER_FUNCTION[$SPECIAL.text] params )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:21: ^( USER_FUNCTION[$SPECIAL.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (SPECIAL82!=null?SPECIAL82.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:211:3: IN params
					{
					IN84=(Token)match(input,IN,FOLLOW_IN_in_usr_function985); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN84);

					pushFollow(FOLLOW_params_in_usr_function987);
					params85=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params85.getTree());
					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 211:13: -> ^( USER_FUNCTION[$IN.text] params )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:211:16: ^( USER_FUNCTION[$IN.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (IN84!=null?IN84.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "usr_function"


	public static class bi_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bi_function"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:213:1: bi_function : ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) );
	public final RPGExprParser.bi_function_return bi_function() throws RecognitionException {
		RPGExprParser.bi_function_return retval = new RPGExprParser.bi_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BI_FUN86=null;
		Token BI_FUN88=null;
		Token char_literal89=null;
		Token char_literal90=null;
		ParserRuleReturnScope params87 =null;

		CommonTree BI_FUN86_tree=null;
		CommonTree BI_FUN88_tree=null;
		CommonTree char_literal89_tree=null;
		CommonTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_BI_FUN=new RewriteRuleTokenStream(adaptor,"token BI_FUN");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:2: ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BI_FUN) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==79) ) {
					int LA17_2 = input.LA(3);
					if ( (LA17_2==80) ) {
						alt17=2;
					}
					else if ( ((LA17_2 >= ALL && LA17_2 <= ALLX)||LA17_2==BI_FUN||LA17_2==BOOLEAN||LA17_2==DATE||LA17_2==FLOAT||LA17_2==HEX||LA17_2==IN||(LA17_2 >= INNR && LA17_2 <= INTEGER)||LA17_2==MINUS||LA17_2==MULT||LA17_2==NOT||LA17_2==PLUS||LA17_2==SPECIAL||LA17_2==STRING||(LA17_2 >= TERM && LA17_2 <= TIMESTAMP)||LA17_2==79||LA17_2==82) ) {
						alt17=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA17_1==EOF||LA17_1==AND||LA17_1==DIV||LA17_1==EQ||(LA17_1 >= GT && LA17_1 <= GTEQ)||(LA17_1 >= LT && LA17_1 <= LTEQ)||(LA17_1 >= MINUS && LA17_1 <= MULT)||LA17_1==NE||LA17_1==OR||(LA17_1 >= PLUS && LA17_1 <= POINT)||(LA17_1 >= 80 && LA17_1 <= 81)||LA17_1==83) ) {
					alt17=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:5: BI_FUN ( params )?
					{
					BI_FUN86=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function1007); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN86);

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:12: ( params )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==79) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:13: params
							{
							pushFollow(FOLLOW_params_in_bi_function1010);
							params87=params();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_params.add(params87.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 214:22: -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:25: ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN86!=null?BI_FUN86.getText():null)), root_1);
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:53: ( params )?
						if ( stream_params.hasNext() ) {
							adaptor.addChild(root_1, stream_params.nextTree());
						}
						stream_params.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:3: BI_FUN '(' ')'
					{
					BI_FUN88=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function1032); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN88);

					char_literal89=(Token)match(input,79,FOLLOW_79_in_bi_function1034); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal89);

					char_literal90=(Token)match(input,80,FOLLOW_80_in_bi_function1036); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(char_literal90);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 216:20: -> ^( BI_FUNCTION[$BI_FUN.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:23: ^( BI_FUNCTION[$BI_FUN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN88!=null?BI_FUN88.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "bi_function"


	public static class params_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "params"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:219:1: params : '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !;
	public final RPGExprParser.params_return params() throws RecognitionException {
		RPGExprParser.params_return retval = new RPGExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal91=null;
		Token char_literal93=null;
		Token char_literal95=null;
		ParserRuleReturnScope logicalExpression92 =null;
		ParserRuleReturnScope logicalExpression94 =null;

		CommonTree char_literal91_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree char_literal95_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:220:2: ( '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !)
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:221:3: '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal91=(Token)match(input,79,FOLLOW_79_in_params1061); if (state.failed) return retval;
			pushFollow(FOLLOW_logicalExpression_in_params1064);
			logicalExpression92=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression92.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:221:26: ( ':' ! logicalExpression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==81) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:221:27: ':' ! logicalExpression
					{
					char_literal93=(Token)match(input,81,FOLLOW_81_in_params1067); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalExpression_in_params1070);
					logicalExpression94=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression94.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

			char_literal95=(Token)match(input,80,FOLLOW_80_in_params1074); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "params"


	public static class empty_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "empty"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:224:1: empty : '(' ')' ;
	public final RPGExprParser.empty_return empty() throws RecognitionException {
		RPGExprParser.empty_return retval = new RPGExprParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal96=null;
		Token char_literal97=null;

		CommonTree char_literal96_tree=null;
		CommonTree char_literal97_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:225:2: ( '(' ')' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:226:2: '(' ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal96=(Token)match(input,79,FOLLOW_79_in_empty1088); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
			adaptor.addChild(root_0, char_literal96_tree);
			}

			char_literal97=(Token)match(input,80,FOLLOW_80_in_empty1090); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal97_tree = (CommonTree)adaptor.create(char_literal97);
			adaptor.addChild(root_0, char_literal97_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "empty"

	// $ANTLR start synpred14_RPGExpr
	public final void synpred14_RPGExpr_fragment() throws RecognitionException {
		ParserRuleReturnScope v2 =null;


		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:45: ( ( MULT MULT v2= unaryExpression ) )
		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:45: ( MULT MULT v2= unaryExpression )
		{
		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:45: ( MULT MULT v2= unaryExpression )
		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:128:47: MULT MULT v2= unaryExpression
		{
		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr327); if (state.failed) return;

		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr329); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred14_RPGExpr333);
		v2=unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred14_RPGExpr

	// Delegated rules

	public final boolean synpred14_RPGExpr() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_RPGExpr_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_logicalExpression_in_expression154 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression168 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression171 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression174 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression188 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression191 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression194 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression208 = new BitSet(new long[]{0x0002000000400002L});
	public static final BitSet FOLLOW_set_in_equalityExpression211 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression218 = new BitSet(new long[]{0x0002000000400002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression231 = new BitSet(new long[]{0x00000C0018000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression235 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression246 = new BitSet(new long[]{0x00000C0018000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression261 = new BitSet(new long[]{0x0040200000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression265 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression272 = new BitSet(new long[]{0x0040200000000002L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression288 = new BitSet(new long[]{0x0000C00000100002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression292 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression301 = new BitSet(new long[]{0x0000C00000100002L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression317 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_MULT_in_powerExpression327 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_MULT_in_powerExpression329 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression333 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression372 = new BitSet(new long[]{0x8000803A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression384 = new BitSet(new long[]{0x8000803A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression403 = new BitSet(new long[]{0x8000803A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified437 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_POINT_in_qualified446 = new BitSet(new long[]{0x8000803A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_primaryExpression_in_qualified450 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_79_in_primaryExpression483 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_primaryExpression487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_primaryExpression506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_array526 = new BitSet(new long[]{0x8000803A42022460L,0x000000000000003AL});
	public static final BitSet FOLLOW_value_in_array528 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
	public static final BitSet FOLLOW_81_in_array531 = new BitSet(new long[]{0x8000803A42022460L,0x000000000000003AL});
	public static final BitSet FOLLOW_value_in_array533 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
	public static final BitSet FOLLOW_83_in_array537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_value573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_value585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_value597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_value644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNR_in_value656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNU_in_value668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_value680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLX_in_value692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filler_in_value703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_value708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bi_function_in_value713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usr_function_in_value718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indicator_in_value726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator746 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IN_in_indicator748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_indicator750 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_logicalExpression_in_indicator752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_indicator754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator774 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INNR_in_indicator776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator795 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_INNU_in_indicator797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator825 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IN_in_indicator827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler857 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler881 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALLX_in_filler883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_special910 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_in_special912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_params_in_usr_function931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_empty_in_usr_function951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_usr_function966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_params_in_usr_function968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_usr_function985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_params_in_usr_function987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function1007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_params_in_bi_function1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_bi_function1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_bi_function1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_params1061 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_logicalExpression_in_params1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
	public static final BitSet FOLLOW_81_in_params1067 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_logicalExpression_in_params1070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
	public static final BitSet FOLLOW_80_in_params1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_empty1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_empty1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr327 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr329 = new BitSet(new long[]{0x8044A03A42022460L,0x000000000004803AL});
	public static final BitSet FOLLOW_unaryExpression_in_synpred14_RPGExpr333 = new BitSet(new long[]{0x0000000000000002L});
}
