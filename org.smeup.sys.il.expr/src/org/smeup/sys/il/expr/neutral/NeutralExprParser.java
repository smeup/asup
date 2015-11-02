// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g 2015-11-02 17:59:19

  package org.smeup.sys.il.expr.neutral;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NeutralExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AE_DIV", "AE_GENERIC", "AE_MINUS", 
		"AE_MOD", "AE_MULT", "AE_PLUS", "AE_POW", "AE_SMINUS", "AE_SPLUS", "AE_TIM", 
		"ALL", "AS_ASS", "AS_DIV", "AS_GENERIC", "AS_MIN", "AS_PLUS", "AS_POW", 
		"AS_TIM", "AT_BOOL", "AT_DATE", "AT_FLOAT", "AT_GENERIC", "AT_HEX", "AT_INDICATOR", 
		"AT_INT", "AT_NAME", "AT_SPECIAL", "AT_STRING", "AXT", "B", "BE", "BIFUN_MARK", 
		"BI_FUN", "BLOCK_OPEN", "C", "CHAR_SPECIAL", "CLOSE_BRACE", "CLOSE_SQUARE", 
		"D", "DIGIT", "DIGIT_SPECIAL", "E", "EscapeSequence", "F", "FT", "FUN_START", 
		"G", "GENERIC", "H", "HexDigit", "I", "INDICATOR", "J", "K", "L", "LETTER", 
		"LE_AND", "LE_GENERIC", "LE_NOT", "LE_OR", "M", "N", "O", "OPEN_BRACE", 
		"OPEN_SQUARE", "P", "Q", "QT", "R", "RE_EQ", "RE_GENERIC", "RE_GT", "RE_GTEQ", 
		"RE_LT", "RE_LTEQ", "RE_NE", "S", "SPECIAL", "SPECIAL_START", "T", "TERM", 
		"U", "UnicodeEscape", "V", "W", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AE_DIV=5;
	public static final int AE_GENERIC=6;
	public static final int AE_MINUS=7;
	public static final int AE_MOD=8;
	public static final int AE_MULT=9;
	public static final int AE_PLUS=10;
	public static final int AE_POW=11;
	public static final int AE_SMINUS=12;
	public static final int AE_SPLUS=13;
	public static final int AE_TIM=14;
	public static final int ALL=15;
	public static final int AS_ASS=16;
	public static final int AS_DIV=17;
	public static final int AS_GENERIC=18;
	public static final int AS_MIN=19;
	public static final int AS_PLUS=20;
	public static final int AS_POW=21;
	public static final int AS_TIM=22;
	public static final int AT_BOOL=23;
	public static final int AT_DATE=24;
	public static final int AT_FLOAT=25;
	public static final int AT_GENERIC=26;
	public static final int AT_HEX=27;
	public static final int AT_INDICATOR=28;
	public static final int AT_INT=29;
	public static final int AT_NAME=30;
	public static final int AT_SPECIAL=31;
	public static final int AT_STRING=32;
	public static final int AXT=33;
	public static final int B=34;
	public static final int BE=35;
	public static final int BIFUN_MARK=36;
	public static final int BI_FUN=37;
	public static final int BLOCK_OPEN=38;
	public static final int C=39;
	public static final int CHAR_SPECIAL=40;
	public static final int CLOSE_BRACE=41;
	public static final int CLOSE_SQUARE=42;
	public static final int D=43;
	public static final int DIGIT=44;
	public static final int DIGIT_SPECIAL=45;
	public static final int E=46;
	public static final int EscapeSequence=47;
	public static final int F=48;
	public static final int FT=49;
	public static final int FUN_START=50;
	public static final int G=51;
	public static final int GENERIC=52;
	public static final int H=53;
	public static final int HexDigit=54;
	public static final int I=55;
	public static final int INDICATOR=56;
	public static final int J=57;
	public static final int K=58;
	public static final int L=59;
	public static final int LETTER=60;
	public static final int LE_AND=61;
	public static final int LE_GENERIC=62;
	public static final int LE_NOT=63;
	public static final int LE_OR=64;
	public static final int M=65;
	public static final int N=66;
	public static final int O=67;
	public static final int OPEN_BRACE=68;
	public static final int OPEN_SQUARE=69;
	public static final int P=70;
	public static final int Q=71;
	public static final int QT=72;
	public static final int R=73;
	public static final int RE_EQ=74;
	public static final int RE_GENERIC=75;
	public static final int RE_GT=76;
	public static final int RE_GTEQ=77;
	public static final int RE_LT=78;
	public static final int RE_LTEQ=79;
	public static final int RE_NE=80;
	public static final int S=81;
	public static final int SPECIAL=82;
	public static final int SPECIAL_START=83;
	public static final int T=84;
	public static final int TERM=85;
	public static final int U=86;
	public static final int UnicodeEscape=87;
	public static final int V=88;
	public static final int W=89;
	public static final int WS=90;
	public static final int X=91;
	public static final int Y=92;
	public static final int Z=93;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NeutralExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeutralExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return NeutralExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g"; }



	   @Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

	   @Override
	   public void reportError(RecognitionException e) {
	      super.reportError(e);
	      RuntimeException re = createException(e);
	      recover(input, e);
	      throw re;
	   }

	   @Override
	  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    	throw e;
	    }
	    
	    public RuntimeException createException(RecognitionException e) {
	        String message = "";
	        boolean addTokenAndLine = true;
	        if (e instanceof NoViableAltException) {
	            message = "Syntax error. ";
	        } else if (e instanceof MissingTokenException) {
	            message = "Missing token ";
	        } else if (e instanceof UnwantedTokenException) {
	            UnwantedTokenException ex = (UnwantedTokenException) e;
	            ex.getUnexpectedToken().getText();
	            message = "Unkown token '" + ex.getUnexpectedToken().getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();
	            addTokenAndLine = false;
	        } else {
	            message = "Syntax error near ";
	        }
	        if (addTokenAndLine) {
	            message = message + "'" + e.token.getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();
	        }
	        return new IntegratedLanguageExpressionRuntimeException(message,e);
	    }


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:123:1: expression : logicalExpression ( ( AS_ASS | AS_DIV | AS_MIN | AS_PLUS | AS_POW | AS_TIM | AS_GENERIC ) ^ logicalExpression )* EOF !;
	public final NeutralExprParser.expression_return expression() throws RecognitionException {
		NeutralExprParser.expression_return retval = new NeutralExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set2=null;
		Token EOF4=null;
		ParserRuleReturnScope logicalExpression1 =null;
		ParserRuleReturnScope logicalExpression3 =null;

		CommonTree set2_tree=null;
		CommonTree EOF4_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:2: ( logicalExpression ( ( AS_ASS | AS_DIV | AS_MIN | AS_PLUS | AS_POW | AS_TIM | AS_GENERIC ) ^ logicalExpression )* EOF !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:4: logicalExpression ( ( AS_ASS | AS_DIV | AS_MIN | AS_PLUS | AS_POW | AS_TIM | AS_GENERIC ) ^ logicalExpression )* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression102);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:22: ( ( AS_ASS | AS_DIV | AS_MIN | AS_PLUS | AS_POW | AS_TIM | AS_GENERIC ) ^ logicalExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AS_ASS && LA1_0 <= AS_TIM)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:23: ( AS_ASS | AS_DIV | AS_MIN | AS_PLUS | AS_POW | AS_TIM | AS_GENERIC ) ^ logicalExpression
					{
					set2=input.LT(1);
					set2=input.LT(1);
					if ( (input.LA(1) >= AS_ASS && input.LA(1) <= AS_TIM) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set2), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicalExpression_in_expression122);
					logicalExpression3=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_expression126); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:127:1: logicalExpression : booleanAndExpression ( LE_OR ^ booleanAndExpression )* ;
	public final NeutralExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		NeutralExprParser.logicalExpression_return retval = new NeutralExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LE_OR6=null;
		ParserRuleReturnScope booleanAndExpression5 =null;
		ParserRuleReturnScope booleanAndExpression7 =null;

		CommonTree LE_OR6_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:2: ( booleanAndExpression ( LE_OR ^ booleanAndExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:4: booleanAndExpression ( LE_OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression138);
			booleanAndExpression5=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression5.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:25: ( LE_OR ^ booleanAndExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==LE_OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:26: LE_OR ^ booleanAndExpression
					{
					LE_OR6=(Token)match(input,LE_OR,FOLLOW_LE_OR_in_logicalExpression141); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE_OR6_tree = (CommonTree)adaptor.create(LE_OR6);
					root_0 = (CommonTree)adaptor.becomeRoot(LE_OR6_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression144);
					booleanAndExpression7=booleanAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression7.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:131:1: booleanAndExpression : booleanGenExpression ( LE_AND ^ booleanGenExpression )* ;
	public final NeutralExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		NeutralExprParser.booleanAndExpression_return retval = new NeutralExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LE_AND9=null;
		ParserRuleReturnScope booleanGenExpression8 =null;
		ParserRuleReturnScope booleanGenExpression10 =null;

		CommonTree LE_AND9_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:2: ( booleanGenExpression ( LE_AND ^ booleanGenExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:4: booleanGenExpression ( LE_AND ^ booleanGenExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanGenExpression_in_booleanAndExpression158);
			booleanGenExpression8=booleanGenExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanGenExpression8.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:25: ( LE_AND ^ booleanGenExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==LE_AND) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:26: LE_AND ^ booleanGenExpression
					{
					LE_AND9=(Token)match(input,LE_AND,FOLLOW_LE_AND_in_booleanAndExpression161); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE_AND9_tree = (CommonTree)adaptor.create(LE_AND9);
					root_0 = (CommonTree)adaptor.becomeRoot(LE_AND9_tree, root_0);
					}

					pushFollow(FOLLOW_booleanGenExpression_in_booleanAndExpression164);
					booleanGenExpression10=booleanGenExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanGenExpression10.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanAndExpression"


	public static class booleanGenExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "booleanGenExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:135:1: booleanGenExpression : equalityExpression ( LE_GENERIC ^ equalityExpression )* ;
	public final NeutralExprParser.booleanGenExpression_return booleanGenExpression() throws RecognitionException {
		NeutralExprParser.booleanGenExpression_return retval = new NeutralExprParser.booleanGenExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LE_GENERIC12=null;
		ParserRuleReturnScope equalityExpression11 =null;
		ParserRuleReturnScope equalityExpression13 =null;

		CommonTree LE_GENERIC12_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:136:2: ( equalityExpression ( LE_GENERIC ^ equalityExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:137:3: equalityExpression ( LE_GENERIC ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanGenExpression180);
			equalityExpression11=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression11.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:137:22: ( LE_GENERIC ^ equalityExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==LE_GENERIC) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:137:23: LE_GENERIC ^ equalityExpression
					{
					LE_GENERIC12=(Token)match(input,LE_GENERIC,FOLLOW_LE_GENERIC_in_booleanGenExpression183); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE_GENERIC12_tree = (CommonTree)adaptor.create(LE_GENERIC12);
					root_0 = (CommonTree)adaptor.becomeRoot(LE_GENERIC12_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanGenExpression186);
					equalityExpression13=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression13.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanGenExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:140:1: equalityExpression : relationalExpression ( ( RE_EQ | RE_NE ) ^ relationalExpression )* ;
	public final NeutralExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		NeutralExprParser.equalityExpression_return retval = new NeutralExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set15=null;
		ParserRuleReturnScope relationalExpression14 =null;
		ParserRuleReturnScope relationalExpression16 =null;

		CommonTree set15_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:141:2: ( relationalExpression ( ( RE_EQ | RE_NE ) ^ relationalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:141:4: relationalExpression ( ( RE_EQ | RE_NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression200);
			relationalExpression14=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression14.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:141:25: ( ( RE_EQ | RE_NE ) ^ relationalExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==RE_EQ||LA5_0==RE_NE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:141:26: ( RE_EQ | RE_NE ) ^ relationalExpression
					{
					set15=input.LT(1);
					set15=input.LT(1);
					if ( input.LA(1)==RE_EQ||input.LA(1)==RE_NE ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set15), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression210);
					relationalExpression16=relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression16.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:144:1: relationalExpression : additiveExpression ( ( RE_LT | RE_LTEQ | RE_GT | RE_GTEQ | RE_GENERIC ) ^ additiveExpression )* ;
	public final NeutralExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		NeutralExprParser.relationalExpression_return retval = new NeutralExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set18=null;
		ParserRuleReturnScope additiveExpression17 =null;
		ParserRuleReturnScope additiveExpression19 =null;

		CommonTree set18_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:2: ( additiveExpression ( ( RE_LT | RE_LTEQ | RE_GT | RE_GTEQ | RE_GENERIC ) ^ additiveExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:4: additiveExpression ( ( RE_LT | RE_LTEQ | RE_GT | RE_GTEQ | RE_GENERIC ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression223);
			additiveExpression17=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression17.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:23: ( ( RE_LT | RE_LTEQ | RE_GT | RE_GTEQ | RE_GENERIC ) ^ additiveExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= RE_GENERIC && LA6_0 <= RE_LTEQ)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:25: ( RE_LT | RE_LTEQ | RE_GT | RE_GTEQ | RE_GENERIC ) ^ additiveExpression
					{
					set18=input.LT(1);
					set18=input.LT(1);
					if ( (input.LA(1) >= RE_GENERIC && input.LA(1) <= RE_LTEQ) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set18), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression240);
					additiveExpression19=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression19.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:149:1: additiveExpression : multiplicativeExpression ( ( AE_PLUS | AE_MINUS ) ^ multiplicativeExpression )* ;
	public final NeutralExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		NeutralExprParser.additiveExpression_return retval = new NeutralExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set21=null;
		ParserRuleReturnScope multiplicativeExpression20 =null;
		ParserRuleReturnScope multiplicativeExpression22 =null;

		CommonTree set21_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:2: ( multiplicativeExpression ( ( AE_PLUS | AE_MINUS ) ^ multiplicativeExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:4: multiplicativeExpression ( ( AE_PLUS | AE_MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression255);
			multiplicativeExpression20=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression20.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:29: ( ( AE_PLUS | AE_MINUS ) ^ multiplicativeExpression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AE_MINUS||LA7_0==AE_PLUS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:31: ( AE_PLUS | AE_MINUS ) ^ multiplicativeExpression
					{
					set21=input.LT(1);
					set21=input.LT(1);
					if ( input.LA(1)==AE_MINUS||input.LA(1)==AE_PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set21), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression266);
					multiplicativeExpression22=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression22.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:153:1: multiplicativeExpression : unaryExpression ( ( AE_MULT | AE_DIV | AE_MOD | AE_POW | AE_GENERIC ) ^ unaryExpression )* ;
	public final NeutralExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		NeutralExprParser.multiplicativeExpression_return retval = new NeutralExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set24=null;
		ParserRuleReturnScope unaryExpression23 =null;
		ParserRuleReturnScope unaryExpression25 =null;

		CommonTree set24_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:154:2: ( unaryExpression ( ( AE_MULT | AE_DIV | AE_MOD | AE_POW | AE_GENERIC ) ^ unaryExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:155:3: unaryExpression ( ( AE_MULT | AE_DIV | AE_MOD | AE_POW | AE_GENERIC ) ^ unaryExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression282);
			unaryExpression23=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression23.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:155:19: ( ( AE_MULT | AE_DIV | AE_MOD | AE_POW | AE_GENERIC ) ^ unaryExpression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= AE_DIV && LA8_0 <= AE_GENERIC)||(LA8_0 >= AE_MOD && LA8_0 <= AE_MULT)||LA8_0==AE_POW) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:155:21: ( AE_MULT | AE_DIV | AE_MOD | AE_POW | AE_GENERIC ) ^ unaryExpression
					{
					set24=input.LT(1);
					set24=input.LT(1);
					if ( (input.LA(1) >= AE_DIV && input.LA(1) <= AE_GENERIC)||(input.LA(1) >= AE_MOD && input.LA(1) <= AE_MULT)||input.LA(1)==AE_POW ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set24), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression299);
					unaryExpression25=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression25.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:158:1: unaryExpression : ( primaryExpression | LE_NOT primaryExpression | AE_SMINUS ^ primaryExpression | AE_SPLUS ^ primaryExpression );
	public final NeutralExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		NeutralExprParser.unaryExpression_return retval = new NeutralExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LE_NOT27=null;
		Token AE_SMINUS29=null;
		Token AE_SPLUS31=null;
		ParserRuleReturnScope primaryExpression26 =null;
		ParserRuleReturnScope primaryExpression28 =null;
		ParserRuleReturnScope primaryExpression30 =null;
		ParserRuleReturnScope primaryExpression32 =null;

		CommonTree LE_NOT27_tree=null;
		CommonTree AE_SMINUS29_tree=null;
		CommonTree AE_SPLUS31_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:159:2: ( primaryExpression | LE_NOT primaryExpression | AE_SMINUS ^ primaryExpression | AE_SPLUS ^ primaryExpression )
			int alt9=4;
			switch ( input.LA(1) ) {
			case AT_BOOL:
			case AT_DATE:
			case AT_FLOAT:
			case AT_GENERIC:
			case AT_HEX:
			case AT_INDICATOR:
			case AT_INT:
			case AT_NAME:
			case AT_STRING:
			case BLOCK_OPEN:
			case FUN_START:
			case QT:
			case SPECIAL_START:
				{
				alt9=1;
				}
				break;
			case LE_NOT:
				{
				alt9=2;
				}
				break;
			case AE_SMINUS:
				{
				alt9=3;
				}
				break;
			case AE_SPLUS:
				{
				alt9=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:160:4: primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primaryExpression_in_unaryExpression315);
					primaryExpression26=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression26.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:161:4: LE_NOT primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					LE_NOT27=(Token)match(input,LE_NOT,FOLLOW_LE_NOT_in_unaryExpression320); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE_NOT27_tree = (CommonTree)adaptor.create(LE_NOT27);
					adaptor.addChild(root_0, LE_NOT27_tree);
					}

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression322);
					primaryExpression28=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression28.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:162:8: AE_SMINUS ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					AE_SMINUS29=(Token)match(input,AE_SMINUS,FOLLOW_AE_SMINUS_in_unaryExpression333); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AE_SMINUS29_tree = (CommonTree)adaptor.create(AE_SMINUS29);
					root_0 = (CommonTree)adaptor.becomeRoot(AE_SMINUS29_tree, root_0);
					}

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression336);
					primaryExpression30=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression30.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:163:8: AE_SPLUS ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					AE_SPLUS31=(Token)match(input,AE_SPLUS,FOLLOW_AE_SPLUS_in_unaryExpression346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AE_SPLUS31_tree = (CommonTree)adaptor.create(AE_SPLUS31);
					root_0 = (CommonTree)adaptor.becomeRoot(AE_SPLUS31_tree, root_0);
					}

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression349);
					primaryExpression32=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression32.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:167:1: primaryExpression : ( block | atomic );
	public final NeutralExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		NeutralExprParser.primaryExpression_return retval = new NeutralExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope block33 =null;
		ParserRuleReturnScope atomic34 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:168:2: ( block | atomic )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BLOCK_OPEN) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= AT_BOOL && LA10_0 <= AT_NAME)||LA10_0==AT_STRING||LA10_0==FUN_START||LA10_0==QT||LA10_0==SPECIAL_START) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:168:4: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_primaryExpression373);
					block33=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block33.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:170:3: atomic
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atomic_in_primaryExpression381);
					atomic34=atomic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic34.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:173:1: block : BLOCK_OPEN ( logicalExpression )+ CLOSE_SQUARE -> ^( BE ( logicalExpression )+ ) ;
	public final NeutralExprParser.block_return block() throws RecognitionException {
		NeutralExprParser.block_return retval = new NeutralExprParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BLOCK_OPEN35=null;
		Token CLOSE_SQUARE37=null;
		ParserRuleReturnScope logicalExpression36 =null;

		CommonTree BLOCK_OPEN35_tree=null;
		CommonTree CLOSE_SQUARE37_tree=null;
		RewriteRuleTokenStream stream_BLOCK_OPEN=new RewriteRuleTokenStream(adaptor,"token BLOCK_OPEN");
		RewriteRuleTokenStream stream_CLOSE_SQUARE=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:174:2: ( BLOCK_OPEN ( logicalExpression )+ CLOSE_SQUARE -> ^( BE ( logicalExpression )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:174:4: BLOCK_OPEN ( logicalExpression )+ CLOSE_SQUARE
			{
			BLOCK_OPEN35=(Token)match(input,BLOCK_OPEN,FOLLOW_BLOCK_OPEN_in_block395); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BLOCK_OPEN.add(BLOCK_OPEN35);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:174:15: ( logicalExpression )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= AE_SMINUS && LA11_0 <= AE_SPLUS)||(LA11_0 >= AT_BOOL && LA11_0 <= AT_NAME)||LA11_0==AT_STRING||LA11_0==BLOCK_OPEN||LA11_0==FUN_START||LA11_0==LE_NOT||LA11_0==QT||LA11_0==SPECIAL_START) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:174:15: logicalExpression
					{
					pushFollow(FOLLOW_logicalExpression_in_block397);
					logicalExpression36=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression36.getTree());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			CLOSE_SQUARE37=(Token)match(input,CLOSE_SQUARE,FOLLOW_CLOSE_SQUARE_in_block400); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_SQUARE.add(CLOSE_SQUARE37);

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
			// 174:47: -> ^( BE ( logicalExpression )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:174:50: ^( BE ( logicalExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BE, "BE"), root_1);
				if ( !(stream_logicalExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logicalExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_logicalExpression.nextTree());
				}
				stream_logicalExpression.reset();

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class atomic_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomic"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:177:1: atomic : ( AT_BOOL | AT_DATE | AT_FLOAT | AT_HEX | AT_INDICATOR | AT_INT | AT_NAME | AT_STRING | AT_GENERIC | QT | special | function );
	public final NeutralExprParser.atomic_return atomic() throws RecognitionException {
		NeutralExprParser.atomic_return retval = new NeutralExprParser.atomic_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AT_BOOL38=null;
		Token AT_DATE39=null;
		Token AT_FLOAT40=null;
		Token AT_HEX41=null;
		Token AT_INDICATOR42=null;
		Token AT_INT43=null;
		Token AT_NAME44=null;
		Token AT_STRING45=null;
		Token AT_GENERIC46=null;
		Token QT47=null;
		ParserRuleReturnScope special48 =null;
		ParserRuleReturnScope function49 =null;

		CommonTree AT_BOOL38_tree=null;
		CommonTree AT_DATE39_tree=null;
		CommonTree AT_FLOAT40_tree=null;
		CommonTree AT_HEX41_tree=null;
		CommonTree AT_INDICATOR42_tree=null;
		CommonTree AT_INT43_tree=null;
		CommonTree AT_NAME44_tree=null;
		CommonTree AT_STRING45_tree=null;
		CommonTree AT_GENERIC46_tree=null;
		CommonTree QT47_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:178:2: ( AT_BOOL | AT_DATE | AT_FLOAT | AT_HEX | AT_INDICATOR | AT_INT | AT_NAME | AT_STRING | AT_GENERIC | QT | special | function )
			int alt12=12;
			switch ( input.LA(1) ) {
			case AT_BOOL:
				{
				alt12=1;
				}
				break;
			case AT_DATE:
				{
				alt12=2;
				}
				break;
			case AT_FLOAT:
				{
				alt12=3;
				}
				break;
			case AT_HEX:
				{
				alt12=4;
				}
				break;
			case AT_INDICATOR:
				{
				alt12=5;
				}
				break;
			case AT_INT:
				{
				alt12=6;
				}
				break;
			case AT_NAME:
				{
				alt12=7;
				}
				break;
			case AT_STRING:
				{
				alt12=8;
				}
				break;
			case AT_GENERIC:
				{
				alt12=9;
				}
				break;
			case QT:
				{
				alt12=10;
				}
				break;
			case SPECIAL_START:
				{
				alt12=11;
				}
				break;
			case FUN_START:
				{
				alt12=12;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:179:3: AT_BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_BOOL38=(Token)match(input,AT_BOOL,FOLLOW_AT_BOOL_in_atomic423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_BOOL38_tree = (CommonTree)adaptor.create(AT_BOOL38);
					adaptor.addChild(root_0, AT_BOOL38_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:180:4: AT_DATE
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_DATE39=(Token)match(input,AT_DATE,FOLLOW_AT_DATE_in_atomic428); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_DATE39_tree = (CommonTree)adaptor.create(AT_DATE39);
					adaptor.addChild(root_0, AT_DATE39_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:181:5: AT_FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_FLOAT40=(Token)match(input,AT_FLOAT,FOLLOW_AT_FLOAT_in_atomic434); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_FLOAT40_tree = (CommonTree)adaptor.create(AT_FLOAT40);
					adaptor.addChild(root_0, AT_FLOAT40_tree);
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:182:4: AT_HEX
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_HEX41=(Token)match(input,AT_HEX,FOLLOW_AT_HEX_in_atomic439); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_HEX41_tree = (CommonTree)adaptor.create(AT_HEX41);
					adaptor.addChild(root_0, AT_HEX41_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:183:4: AT_INDICATOR
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_INDICATOR42=(Token)match(input,AT_INDICATOR,FOLLOW_AT_INDICATOR_in_atomic444); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_INDICATOR42_tree = (CommonTree)adaptor.create(AT_INDICATOR42);
					adaptor.addChild(root_0, AT_INDICATOR42_tree);
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:184:4: AT_INT
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_INT43=(Token)match(input,AT_INT,FOLLOW_AT_INT_in_atomic449); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_INT43_tree = (CommonTree)adaptor.create(AT_INT43);
					adaptor.addChild(root_0, AT_INT43_tree);
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:185:4: AT_NAME
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_NAME44=(Token)match(input,AT_NAME,FOLLOW_AT_NAME_in_atomic454); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_NAME44_tree = (CommonTree)adaptor.create(AT_NAME44);
					adaptor.addChild(root_0, AT_NAME44_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:186:4: AT_STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_STRING45=(Token)match(input,AT_STRING,FOLLOW_AT_STRING_in_atomic459); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_STRING45_tree = (CommonTree)adaptor.create(AT_STRING45);
					adaptor.addChild(root_0, AT_STRING45_tree);
					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:187:4: AT_GENERIC
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_GENERIC46=(Token)match(input,AT_GENERIC,FOLLOW_AT_GENERIC_in_atomic464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_GENERIC46_tree = (CommonTree)adaptor.create(AT_GENERIC46);
					adaptor.addChild(root_0, AT_GENERIC46_tree);
					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:188:4: QT
					{
					root_0 = (CommonTree)adaptor.nil();


					QT47=(Token)match(input,QT,FOLLOW_QT_in_atomic469); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QT47_tree = (CommonTree)adaptor.create(QT47);
					adaptor.addChild(root_0, QT47_tree);
					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:189:5: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_atomic475);
					special48=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special48.getTree());

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:190:4: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_atomic480);
					function49=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomic"


	public static class special_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "special"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:1: special : SPECIAL_START s= SPECIAL CLOSE_BRACE CLOSE_BRACE -> AT_SPECIAL[$s.text] ;
	public final NeutralExprParser.special_return special() throws RecognitionException {
		NeutralExprParser.special_return retval = new NeutralExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token s=null;
		Token SPECIAL_START50=null;
		Token CLOSE_BRACE51=null;
		Token CLOSE_BRACE52=null;

		CommonTree s_tree=null;
		CommonTree SPECIAL_START50_tree=null;
		CommonTree CLOSE_BRACE51_tree=null;
		CommonTree CLOSE_BRACE52_tree=null;
		RewriteRuleTokenStream stream_SPECIAL_START=new RewriteRuleTokenStream(adaptor,"token SPECIAL_START");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:194:2: ( SPECIAL_START s= SPECIAL CLOSE_BRACE CLOSE_BRACE -> AT_SPECIAL[$s.text] )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:194:4: SPECIAL_START s= SPECIAL CLOSE_BRACE CLOSE_BRACE
			{
			SPECIAL_START50=(Token)match(input,SPECIAL_START,FOLLOW_SPECIAL_START_in_special491); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL_START.add(SPECIAL_START50);

			s=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special495); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(s);

			CLOSE_BRACE51=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_special497); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE51);

			CLOSE_BRACE52=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_special499); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE52);

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
			// 194:52: -> AT_SPECIAL[$s.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(AT_SPECIAL, (s!=null?s.getText():null)));
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "special"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:197:1: function : FUN_START n= function_name CLOSE_BRACE OPEN_SQUARE ( params )* CLOSE_SQUARE -> ^( FT[$n.text] ( params )* ) ;
	public final NeutralExprParser.function_return function() throws RecognitionException {
		NeutralExprParser.function_return retval = new NeutralExprParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUN_START53=null;
		Token CLOSE_BRACE54=null;
		Token OPEN_SQUARE55=null;
		Token CLOSE_SQUARE57=null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope params56 =null;

		CommonTree FUN_START53_tree=null;
		CommonTree CLOSE_BRACE54_tree=null;
		CommonTree OPEN_SQUARE55_tree=null;
		CommonTree CLOSE_SQUARE57_tree=null;
		RewriteRuleTokenStream stream_OPEN_SQUARE=new RewriteRuleTokenStream(adaptor,"token OPEN_SQUARE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_FUN_START=new RewriteRuleTokenStream(adaptor,"token FUN_START");
		RewriteRuleTokenStream stream_CLOSE_SQUARE=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE");
		RewriteRuleSubtreeStream stream_function_name=new RewriteRuleSubtreeStream(adaptor,"rule function_name");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:198:2: ( FUN_START n= function_name CLOSE_BRACE OPEN_SQUARE ( params )* CLOSE_SQUARE -> ^( FT[$n.text] ( params )* ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:198:5: FUN_START n= function_name CLOSE_BRACE OPEN_SQUARE ( params )* CLOSE_SQUARE
			{
			FUN_START53=(Token)match(input,FUN_START,FOLLOW_FUN_START_in_function517); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUN_START.add(FUN_START53);

			pushFollow(FOLLOW_function_name_in_function521);
			n=function_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_function_name.add(n.getTree());
			CLOSE_BRACE54=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function523); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE54);

			OPEN_SQUARE55=(Token)match(input,OPEN_SQUARE,FOLLOW_OPEN_SQUARE_in_function525); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPEN_SQUARE.add(OPEN_SQUARE55);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:198:55: ( params )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= AE_SMINUS && LA13_0 <= AE_SPLUS)||(LA13_0 >= AT_BOOL && LA13_0 <= AT_NAME)||LA13_0==AT_STRING||LA13_0==BLOCK_OPEN||LA13_0==FUN_START||LA13_0==LE_NOT||LA13_0==QT||LA13_0==SPECIAL_START) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:198:55: params
					{
					pushFollow(FOLLOW_params_in_function527);
					params56=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params56.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			CLOSE_SQUARE57=(Token)match(input,CLOSE_SQUARE,FOLLOW_CLOSE_SQUARE_in_function530); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_SQUARE.add(CLOSE_SQUARE57);

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
			// 198:76: -> ^( FT[$n.text] ( params )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:198:79: ^( FT[$n.text] ( params )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FT, (n!=null?input.toString(n.start,n.stop):null)), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:198:93: ( params )*
				while ( stream_params.hasNext() ) {
					adaptor.addChild(root_1, stream_params.nextTree());
				}
				stream_params.reset();

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class function_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_name"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:201:1: function_name : ( BI_FUN | TERM | INDICATOR | ALL | GENERIC );
	public final NeutralExprParser.function_name_return function_name() throws RecognitionException {
		NeutralExprParser.function_name_return retval = new NeutralExprParser.function_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set58=null;

		CommonTree set58_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:202:2: ( BI_FUN | TERM | INDICATOR | ALL | GENERIC )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set58=input.LT(1);
			if ( input.LA(1)==ALL||input.LA(1)==BI_FUN||input.LA(1)==GENERIC||input.LA(1)==INDICATOR||input.LA(1)==TERM ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set58));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_name"


	public static class params_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "params"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:215:1: params : logicalExpression ( logicalExpression )* ;
	public final NeutralExprParser.params_return params() throws RecognitionException {
		NeutralExprParser.params_return retval = new NeutralExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope logicalExpression59 =null;
		ParserRuleReturnScope logicalExpression60 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:216:2: ( logicalExpression ( logicalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:217:3: logicalExpression ( logicalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_params609);
			logicalExpression59=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression59.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:217:21: ( logicalExpression )*
			loop14:
			while (true) {
				int alt14=2;
				switch ( input.LA(1) ) {
				case BLOCK_OPEN:
					{
					int LA14_2 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_BOOL:
					{
					int LA14_3 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_DATE:
					{
					int LA14_4 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_FLOAT:
					{
					int LA14_5 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_HEX:
					{
					int LA14_6 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_INDICATOR:
					{
					int LA14_7 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_INT:
					{
					int LA14_8 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_NAME:
					{
					int LA14_9 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_STRING:
					{
					int LA14_10 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AT_GENERIC:
					{
					int LA14_11 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case QT:
					{
					int LA14_12 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case SPECIAL_START:
					{
					int LA14_13 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case FUN_START:
					{
					int LA14_14 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case LE_NOT:
					{
					int LA14_15 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AE_SMINUS:
					{
					int LA14_16 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				case AE_SPLUS:
					{
					int LA14_17 = input.LA(2);
					if ( (synpred46_NeutralExpr()) ) {
						alt14=1;
					}

					}
					break;
				}
				switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:217:22: logicalExpression
					{
					pushFollow(FOLLOW_logicalExpression_in_params612);
					logicalExpression60=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression60.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "params"

	// $ANTLR start synpred46_NeutralExpr
	public final void synpred46_NeutralExpr_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:217:22: ( logicalExpression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:217:22: logicalExpression
		{
		pushFollow(FOLLOW_logicalExpression_in_synpred46_NeutralExpr612);
		logicalExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred46_NeutralExpr

	// Delegated rules

	public final boolean synpred46_NeutralExpr() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_NeutralExpr_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_logicalExpression_in_expression102 = new BitSet(new long[]{0x00000000007F0000L});
	public static final BitSet FOLLOW_set_in_expression105 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_logicalExpression_in_expression122 = new BitSet(new long[]{0x00000000007F0000L});
	public static final BitSet FOLLOW_EOF_in_expression126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LE_OR_in_logicalExpression141 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_booleanGenExpression_in_booleanAndExpression158 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LE_AND_in_booleanAndExpression161 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_booleanGenExpression_in_booleanAndExpression164 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanGenExpression180 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LE_GENERIC_in_booleanGenExpression183 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanGenExpression186 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010400L});
	public static final BitSet FOLLOW_set_in_equalityExpression203 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010400L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression223 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F800L});
	public static final BitSet FOLLOW_set_in_relationalExpression227 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression240 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F800L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression255 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_set_in_additiveExpression259 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression266 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression282 = new BitSet(new long[]{0x0000000000000B62L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression286 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression299 = new BitSet(new long[]{0x0000000000000B62L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_NOT_in_unaryExpression320 = new BitSet(new long[]{0x000400417F800000L,0x0000000000080100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AE_SMINUS_in_unaryExpression333 = new BitSet(new long[]{0x000400417F800000L,0x0000000000080100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AE_SPLUS_in_unaryExpression346 = new BitSet(new long[]{0x000400417F800000L,0x0000000000080100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_primaryExpression373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomic_in_primaryExpression381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_OPEN_in_block395 = new BitSet(new long[]{0x800400417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_logicalExpression_in_block397 = new BitSet(new long[]{0x800404417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_CLOSE_SQUARE_in_block400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_BOOL_in_atomic423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_DATE_in_atomic428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_FLOAT_in_atomic434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_HEX_in_atomic439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_INDICATOR_in_atomic444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_INT_in_atomic449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_NAME_in_atomic454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_STRING_in_atomic459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_GENERIC_in_atomic464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QT_in_atomic469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_atomic475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_atomic480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_START_in_special491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_SPECIAL_in_special495 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_special497 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_special499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_START_in_function517 = new BitSet(new long[]{0x0110002000008000L,0x0000000000200000L});
	public static final BitSet FOLLOW_function_name_in_function521 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_function523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_OPEN_SQUARE_in_function525 = new BitSet(new long[]{0x800404417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_params_in_function527 = new BitSet(new long[]{0x800404417F803000L,0x0000000000080100L});
	public static final BitSet FOLLOW_CLOSE_SQUARE_in_function530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalExpression_in_params609 = new BitSet(new long[]{0x800400417F803002L,0x0000000000080100L});
	public static final BitSet FOLLOW_logicalExpression_in_params612 = new BitSet(new long[]{0x800400417F803002L,0x0000000000080100L});
	public static final BitSet FOLLOW_logicalExpression_in_synpred46_NeutralExpr612 = new BitSet(new long[]{0x0000000000000002L});
}
