// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g 2015-10-31 11:20:07

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "AND", "ASSIGN", "ASSIGN_DIV", 
		"ASSIGN_MIN", "ASSIGN_PLU", "ASSIGN_POW", "ASSIGN_TIM", "AT_BOOL", "AT_DATE", 
		"AT_FLOAT", "AT_GENERIC", "AT_HEX", "AT_INDICATOR", "AT_INT", "AT_NAME", 
		"AT_SPECIAL", "AT_STRING", "AXT", "B", "BIFUN_MARK", "BI_FUN", "BLOCK", 
		"BLOCK_OPEN", "C", "CHAR_SPECIAL", "CLOSE_BRACE", "CLOSE_SQUARE", "D", 
		"DIGIT", "DIGIT_SPECIAL", "DIV", "E", "EQ", "EscapeSequence", "F", "FUN", 
		"FUN_START", "G", "GENERIC", "GT", "GTEQ", "H", "HexDigit", "I", "INDICATOR", 
		"J", "K", "L", "LETTER", "LT", "LTEQ", "M", "MINUS", "MOD", "MULT", "N", 
		"NE", "NOT", "O", "OPEN_BRACE", "OPEN_SQUARE", "OR", "P", "PLUS", "POW", 
		"Q", "QT", "R", "S", "SMINUS", "SPECIAL", "SPECIAL_START", "SPLUS", "T", 
		"TERM", "TIMES", "U", "UnicodeEscape", "V", "W", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int ALL=5;
	public static final int AND=6;
	public static final int ASSIGN=7;
	public static final int ASSIGN_DIV=8;
	public static final int ASSIGN_MIN=9;
	public static final int ASSIGN_PLU=10;
	public static final int ASSIGN_POW=11;
	public static final int ASSIGN_TIM=12;
	public static final int AT_BOOL=13;
	public static final int AT_DATE=14;
	public static final int AT_FLOAT=15;
	public static final int AT_GENERIC=16;
	public static final int AT_HEX=17;
	public static final int AT_INDICATOR=18;
	public static final int AT_INT=19;
	public static final int AT_NAME=20;
	public static final int AT_SPECIAL=21;
	public static final int AT_STRING=22;
	public static final int AXT=23;
	public static final int B=24;
	public static final int BIFUN_MARK=25;
	public static final int BI_FUN=26;
	public static final int BLOCK=27;
	public static final int BLOCK_OPEN=28;
	public static final int C=29;
	public static final int CHAR_SPECIAL=30;
	public static final int CLOSE_BRACE=31;
	public static final int CLOSE_SQUARE=32;
	public static final int D=33;
	public static final int DIGIT=34;
	public static final int DIGIT_SPECIAL=35;
	public static final int DIV=36;
	public static final int E=37;
	public static final int EQ=38;
	public static final int EscapeSequence=39;
	public static final int F=40;
	public static final int FUN=41;
	public static final int FUN_START=42;
	public static final int G=43;
	public static final int GENERIC=44;
	public static final int GT=45;
	public static final int GTEQ=46;
	public static final int H=47;
	public static final int HexDigit=48;
	public static final int I=49;
	public static final int INDICATOR=50;
	public static final int J=51;
	public static final int K=52;
	public static final int L=53;
	public static final int LETTER=54;
	public static final int LT=55;
	public static final int LTEQ=56;
	public static final int M=57;
	public static final int MINUS=58;
	public static final int MOD=59;
	public static final int MULT=60;
	public static final int N=61;
	public static final int NE=62;
	public static final int NOT=63;
	public static final int O=64;
	public static final int OPEN_BRACE=65;
	public static final int OPEN_SQUARE=66;
	public static final int OR=67;
	public static final int P=68;
	public static final int PLUS=69;
	public static final int POW=70;
	public static final int Q=71;
	public static final int QT=72;
	public static final int R=73;
	public static final int S=74;
	public static final int SMINUS=75;
	public static final int SPECIAL=76;
	public static final int SPECIAL_START=77;
	public static final int SPLUS=78;
	public static final int T=79;
	public static final int TERM=80;
	public static final int TIMES=81;
	public static final int U=82;
	public static final int UnicodeEscape=83;
	public static final int V=84;
	public static final int W=85;
	public static final int WS=86;
	public static final int X=87;
	public static final int Y=88;
	public static final int Z=89;

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:123:1: expression : logicalExpression ( ( ASSIGN | ASSIGN_DIV | ASSIGN_MIN | ASSIGN_PLU | ASSIGN_POW | ASSIGN_TIM ) ^ logicalExpression )* EOF !;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:2: ( logicalExpression ( ( ASSIGN | ASSIGN_DIV | ASSIGN_MIN | ASSIGN_PLU | ASSIGN_POW | ASSIGN_TIM ) ^ logicalExpression )* EOF !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:4: logicalExpression ( ( ASSIGN | ASSIGN_DIV | ASSIGN_MIN | ASSIGN_PLU | ASSIGN_POW | ASSIGN_TIM ) ^ logicalExpression )* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression102);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:22: ( ( ASSIGN | ASSIGN_DIV | ASSIGN_MIN | ASSIGN_PLU | ASSIGN_POW | ASSIGN_TIM ) ^ logicalExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ASSIGN && LA1_0 <= ASSIGN_TIM)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:124:23: ( ASSIGN | ASSIGN_DIV | ASSIGN_MIN | ASSIGN_PLU | ASSIGN_POW | ASSIGN_TIM ) ^ logicalExpression
					{
					set2=input.LT(1);
					set2=input.LT(1);
					if ( (input.LA(1) >= ASSIGN && input.LA(1) <= ASSIGN_TIM) ) {
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
					pushFollow(FOLLOW_logicalExpression_in_expression120);
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

			EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_expression124); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:127:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final NeutralExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		NeutralExprParser.logicalExpression_return retval = new NeutralExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR6=null;
		ParserRuleReturnScope booleanAndExpression5 =null;
		ParserRuleReturnScope booleanAndExpression7 =null;

		CommonTree OR6_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression136);
			booleanAndExpression5=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression5.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:25: ( OR ^ booleanAndExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:128:26: OR ^ booleanAndExpression
					{
					OR6=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR6_tree = (CommonTree)adaptor.create(OR6);
					root_0 = (CommonTree)adaptor.becomeRoot(OR6_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression142);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:131:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final NeutralExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		NeutralExprParser.booleanAndExpression_return retval = new NeutralExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND9=null;
		ParserRuleReturnScope equalityExpression8 =null;
		ParserRuleReturnScope equalityExpression10 =null;

		CommonTree AND9_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression156);
			equalityExpression8=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression8.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:23: ( AND ^ equalityExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==AND) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:132:24: AND ^ equalityExpression
					{
					AND9=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression159); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND9_tree = (CommonTree)adaptor.create(AND9);
					root_0 = (CommonTree)adaptor.becomeRoot(AND9_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression162);
					equalityExpression10=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression10.getTree());

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


	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:135:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final NeutralExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		NeutralExprParser.equalityExpression_return retval = new NeutralExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set12=null;
		ParserRuleReturnScope relationalExpression11 =null;
		ParserRuleReturnScope relationalExpression13 =null;

		CommonTree set12_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:136:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:136:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression175);
			relationalExpression11=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression11.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:136:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==EQ||LA4_0==NE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:136:26: ( EQ | NE ) ^ relationalExpression
					{
					set12=input.LT(1);
					set12=input.LT(1);
					if ( input.LA(1)==EQ||input.LA(1)==NE ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set12), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression185);
					relationalExpression13=relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression13.getTree());

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
	// $ANTLR end "equalityExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:139:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final NeutralExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		NeutralExprParser.relationalExpression_return retval = new NeutralExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set15=null;
		ParserRuleReturnScope additiveExpression14 =null;
		ParserRuleReturnScope additiveExpression16 =null;

		CommonTree set15_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:140:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:140:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression198);
			additiveExpression14=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression14.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:140:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= GT && LA5_0 <= GTEQ)||(LA5_0 >= LT && LA5_0 <= LTEQ)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:140:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
					{
					set15=input.LT(1);
					set15=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression213);
					additiveExpression16=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression16.getTree());

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
	// $ANTLR end "relationalExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:144:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final NeutralExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		NeutralExprParser.additiveExpression_return retval = new NeutralExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set18=null;
		ParserRuleReturnScope multiplicativeExpression17 =null;
		ParserRuleReturnScope multiplicativeExpression19 =null;

		CommonTree set18_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression228);
			multiplicativeExpression17=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression17.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:145:31: ( PLUS | MINUS ) ^ multiplicativeExpression
					{
					set18=input.LT(1);
					set18=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression239);
					multiplicativeExpression19=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression19.getTree());

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
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:148:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV | MOD | POW ) ^ unaryExpression )* ;
	public final NeutralExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		NeutralExprParser.multiplicativeExpression_return retval = new NeutralExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set21=null;
		ParserRuleReturnScope unaryExpression20 =null;
		ParserRuleReturnScope unaryExpression22 =null;

		CommonTree set21_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:149:2: ( unaryExpression ( ( MULT | DIV | MOD | POW ) ^ unaryExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:3: unaryExpression ( ( MULT | DIV | MOD | POW ) ^ unaryExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression255);
			unaryExpression20=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression20.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:19: ( ( MULT | DIV | MOD | POW ) ^ unaryExpression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DIV||(LA7_0 >= MOD && LA7_0 <= MULT)||LA7_0==POW) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:150:21: ( MULT | DIV | MOD | POW ) ^ unaryExpression
					{
					set21=input.LT(1);
					set21=input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT)||input.LA(1)==POW ) {
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
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression270);
					unaryExpression22=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression22.getTree());

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
	// $ANTLR end "multiplicativeExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:153:1: unaryExpression : ( primaryExpression | NOT ^ primaryExpression | SMINUS ^ primaryExpression | SPLUS ^ primaryExpression );
	public final NeutralExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		NeutralExprParser.unaryExpression_return retval = new NeutralExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT24=null;
		Token SMINUS26=null;
		Token SPLUS28=null;
		ParserRuleReturnScope primaryExpression23 =null;
		ParserRuleReturnScope primaryExpression25 =null;
		ParserRuleReturnScope primaryExpression27 =null;
		ParserRuleReturnScope primaryExpression29 =null;

		CommonTree NOT24_tree=null;
		CommonTree SMINUS26_tree=null;
		CommonTree SPLUS28_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:154:2: ( primaryExpression | NOT ^ primaryExpression | SMINUS ^ primaryExpression | SPLUS ^ primaryExpression )
			int alt8=4;
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
				alt8=1;
				}
				break;
			case NOT:
				{
				alt8=2;
				}
				break;
			case SMINUS:
				{
				alt8=3;
				}
				break;
			case SPLUS:
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:155:4: primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primaryExpression_in_unaryExpression286);
					primaryExpression23=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression23.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:156:8: NOT ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT24=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression295); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT24_tree = (CommonTree)adaptor.create(NOT24);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT24_tree, root_0);
					}

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression298);
					primaryExpression25=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression25.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:157:8: SMINUS ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					SMINUS26=(Token)match(input,SMINUS,FOLLOW_SMINUS_in_unaryExpression307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SMINUS26_tree = (CommonTree)adaptor.create(SMINUS26);
					root_0 = (CommonTree)adaptor.becomeRoot(SMINUS26_tree, root_0);
					}

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression310);
					primaryExpression27=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression27.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:158:8: SPLUS ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					SPLUS28=(Token)match(input,SPLUS,FOLLOW_SPLUS_in_unaryExpression320); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SPLUS28_tree = (CommonTree)adaptor.create(SPLUS28);
					root_0 = (CommonTree)adaptor.becomeRoot(SPLUS28_tree, root_0);
					}

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression323);
					primaryExpression29=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression29.getTree());

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:162:1: primaryExpression : ( block | atomic );
	public final NeutralExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		NeutralExprParser.primaryExpression_return retval = new NeutralExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope block30 =null;
		ParserRuleReturnScope atomic31 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:163:2: ( block | atomic )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BLOCK_OPEN) ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= AT_BOOL && LA9_0 <= AT_NAME)||LA9_0==AT_STRING||LA9_0==FUN_START||LA9_0==QT||LA9_0==SPECIAL_START) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:163:4: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_primaryExpression347);
					block30=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block30.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:165:3: atomic
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atomic_in_primaryExpression355);
					atomic31=atomic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic31.getTree());

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:168:1: block : BLOCK_OPEN ( logicalExpression )+ CLOSE_SQUARE -> ^( BLOCK ( logicalExpression )+ ) ;
	public final NeutralExprParser.block_return block() throws RecognitionException {
		NeutralExprParser.block_return retval = new NeutralExprParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BLOCK_OPEN32=null;
		Token CLOSE_SQUARE34=null;
		ParserRuleReturnScope logicalExpression33 =null;

		CommonTree BLOCK_OPEN32_tree=null;
		CommonTree CLOSE_SQUARE34_tree=null;
		RewriteRuleTokenStream stream_BLOCK_OPEN=new RewriteRuleTokenStream(adaptor,"token BLOCK_OPEN");
		RewriteRuleTokenStream stream_CLOSE_SQUARE=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:169:2: ( BLOCK_OPEN ( logicalExpression )+ CLOSE_SQUARE -> ^( BLOCK ( logicalExpression )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:169:4: BLOCK_OPEN ( logicalExpression )+ CLOSE_SQUARE
			{
			BLOCK_OPEN32=(Token)match(input,BLOCK_OPEN,FOLLOW_BLOCK_OPEN_in_block369); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BLOCK_OPEN.add(BLOCK_OPEN32);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:169:15: ( logicalExpression )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= AT_BOOL && LA10_0 <= AT_NAME)||LA10_0==AT_STRING||LA10_0==BLOCK_OPEN||LA10_0==FUN_START||LA10_0==NOT||LA10_0==QT||LA10_0==SMINUS||(LA10_0 >= SPECIAL_START && LA10_0 <= SPLUS)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:169:15: logicalExpression
					{
					pushFollow(FOLLOW_logicalExpression_in_block371);
					logicalExpression33=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression33.getTree());
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			CLOSE_SQUARE34=(Token)match(input,CLOSE_SQUARE,FOLLOW_CLOSE_SQUARE_in_block374); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_SQUARE.add(CLOSE_SQUARE34);

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
			// 169:47: -> ^( BLOCK ( logicalExpression )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:169:50: ^( BLOCK ( logicalExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:172:1: atomic : ( AT_BOOL | AT_DATE | AT_FLOAT | AT_HEX | AT_INDICATOR | AT_INT | AT_NAME | AT_STRING | AT_GENERIC | QT | special | function );
	public final NeutralExprParser.atomic_return atomic() throws RecognitionException {
		NeutralExprParser.atomic_return retval = new NeutralExprParser.atomic_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AT_BOOL35=null;
		Token AT_DATE36=null;
		Token AT_FLOAT37=null;
		Token AT_HEX38=null;
		Token AT_INDICATOR39=null;
		Token AT_INT40=null;
		Token AT_NAME41=null;
		Token AT_STRING42=null;
		Token AT_GENERIC43=null;
		Token QT44=null;
		ParserRuleReturnScope special45 =null;
		ParserRuleReturnScope function46 =null;

		CommonTree AT_BOOL35_tree=null;
		CommonTree AT_DATE36_tree=null;
		CommonTree AT_FLOAT37_tree=null;
		CommonTree AT_HEX38_tree=null;
		CommonTree AT_INDICATOR39_tree=null;
		CommonTree AT_INT40_tree=null;
		CommonTree AT_NAME41_tree=null;
		CommonTree AT_STRING42_tree=null;
		CommonTree AT_GENERIC43_tree=null;
		CommonTree QT44_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:173:2: ( AT_BOOL | AT_DATE | AT_FLOAT | AT_HEX | AT_INDICATOR | AT_INT | AT_NAME | AT_STRING | AT_GENERIC | QT | special | function )
			int alt11=12;
			switch ( input.LA(1) ) {
			case AT_BOOL:
				{
				alt11=1;
				}
				break;
			case AT_DATE:
				{
				alt11=2;
				}
				break;
			case AT_FLOAT:
				{
				alt11=3;
				}
				break;
			case AT_HEX:
				{
				alt11=4;
				}
				break;
			case AT_INDICATOR:
				{
				alt11=5;
				}
				break;
			case AT_INT:
				{
				alt11=6;
				}
				break;
			case AT_NAME:
				{
				alt11=7;
				}
				break;
			case AT_STRING:
				{
				alt11=8;
				}
				break;
			case AT_GENERIC:
				{
				alt11=9;
				}
				break;
			case QT:
				{
				alt11=10;
				}
				break;
			case SPECIAL_START:
				{
				alt11=11;
				}
				break;
			case FUN_START:
				{
				alt11=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:174:3: AT_BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_BOOL35=(Token)match(input,AT_BOOL,FOLLOW_AT_BOOL_in_atomic397); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_BOOL35_tree = (CommonTree)adaptor.create(AT_BOOL35);
					adaptor.addChild(root_0, AT_BOOL35_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:175:4: AT_DATE
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_DATE36=(Token)match(input,AT_DATE,FOLLOW_AT_DATE_in_atomic402); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_DATE36_tree = (CommonTree)adaptor.create(AT_DATE36);
					adaptor.addChild(root_0, AT_DATE36_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:176:5: AT_FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_FLOAT37=(Token)match(input,AT_FLOAT,FOLLOW_AT_FLOAT_in_atomic408); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_FLOAT37_tree = (CommonTree)adaptor.create(AT_FLOAT37);
					adaptor.addChild(root_0, AT_FLOAT37_tree);
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:177:4: AT_HEX
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_HEX38=(Token)match(input,AT_HEX,FOLLOW_AT_HEX_in_atomic413); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_HEX38_tree = (CommonTree)adaptor.create(AT_HEX38);
					adaptor.addChild(root_0, AT_HEX38_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:178:4: AT_INDICATOR
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_INDICATOR39=(Token)match(input,AT_INDICATOR,FOLLOW_AT_INDICATOR_in_atomic418); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_INDICATOR39_tree = (CommonTree)adaptor.create(AT_INDICATOR39);
					adaptor.addChild(root_0, AT_INDICATOR39_tree);
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:179:4: AT_INT
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_INT40=(Token)match(input,AT_INT,FOLLOW_AT_INT_in_atomic423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_INT40_tree = (CommonTree)adaptor.create(AT_INT40);
					adaptor.addChild(root_0, AT_INT40_tree);
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:180:4: AT_NAME
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_NAME41=(Token)match(input,AT_NAME,FOLLOW_AT_NAME_in_atomic428); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_NAME41_tree = (CommonTree)adaptor.create(AT_NAME41);
					adaptor.addChild(root_0, AT_NAME41_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:181:4: AT_STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_STRING42=(Token)match(input,AT_STRING,FOLLOW_AT_STRING_in_atomic433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_STRING42_tree = (CommonTree)adaptor.create(AT_STRING42);
					adaptor.addChild(root_0, AT_STRING42_tree);
					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:182:4: AT_GENERIC
					{
					root_0 = (CommonTree)adaptor.nil();


					AT_GENERIC43=(Token)match(input,AT_GENERIC,FOLLOW_AT_GENERIC_in_atomic438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_GENERIC43_tree = (CommonTree)adaptor.create(AT_GENERIC43);
					adaptor.addChild(root_0, AT_GENERIC43_tree);
					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:183:4: QT
					{
					root_0 = (CommonTree)adaptor.nil();


					QT44=(Token)match(input,QT,FOLLOW_QT_in_atomic443); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QT44_tree = (CommonTree)adaptor.create(QT44);
					adaptor.addChild(root_0, QT44_tree);
					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:184:5: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_atomic449);
					special45=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special45.getTree());

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:185:4: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_atomic454);
					function46=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function46.getTree());

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:188:1: special : SPECIAL_START s= SPECIAL CLOSE_BRACE CLOSE_BRACE -> AT_SPECIAL[$s.text] ;
	public final NeutralExprParser.special_return special() throws RecognitionException {
		NeutralExprParser.special_return retval = new NeutralExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token s=null;
		Token SPECIAL_START47=null;
		Token CLOSE_BRACE48=null;
		Token CLOSE_BRACE49=null;

		CommonTree s_tree=null;
		CommonTree SPECIAL_START47_tree=null;
		CommonTree CLOSE_BRACE48_tree=null;
		CommonTree CLOSE_BRACE49_tree=null;
		RewriteRuleTokenStream stream_SPECIAL_START=new RewriteRuleTokenStream(adaptor,"token SPECIAL_START");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:189:2: ( SPECIAL_START s= SPECIAL CLOSE_BRACE CLOSE_BRACE -> AT_SPECIAL[$s.text] )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:189:4: SPECIAL_START s= SPECIAL CLOSE_BRACE CLOSE_BRACE
			{
			SPECIAL_START47=(Token)match(input,SPECIAL_START,FOLLOW_SPECIAL_START_in_special465); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL_START.add(SPECIAL_START47);

			s=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special469); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(s);

			CLOSE_BRACE48=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_special471); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE48);

			CLOSE_BRACE49=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_special473); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE49);

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
			// 189:52: -> AT_SPECIAL[$s.text]
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:192:1: function : FUN_START n= function_name CLOSE_BRACE OPEN_SQUARE ( params )* CLOSE_SQUARE -> ^( FUN[$n.text] ( params )* ) ;
	public final NeutralExprParser.function_return function() throws RecognitionException {
		NeutralExprParser.function_return retval = new NeutralExprParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUN_START50=null;
		Token CLOSE_BRACE51=null;
		Token OPEN_SQUARE52=null;
		Token CLOSE_SQUARE54=null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope params53 =null;

		CommonTree FUN_START50_tree=null;
		CommonTree CLOSE_BRACE51_tree=null;
		CommonTree OPEN_SQUARE52_tree=null;
		CommonTree CLOSE_SQUARE54_tree=null;
		RewriteRuleTokenStream stream_OPEN_SQUARE=new RewriteRuleTokenStream(adaptor,"token OPEN_SQUARE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_FUN_START=new RewriteRuleTokenStream(adaptor,"token FUN_START");
		RewriteRuleTokenStream stream_CLOSE_SQUARE=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE");
		RewriteRuleSubtreeStream stream_function_name=new RewriteRuleSubtreeStream(adaptor,"rule function_name");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:2: ( FUN_START n= function_name CLOSE_BRACE OPEN_SQUARE ( params )* CLOSE_SQUARE -> ^( FUN[$n.text] ( params )* ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:5: FUN_START n= function_name CLOSE_BRACE OPEN_SQUARE ( params )* CLOSE_SQUARE
			{
			FUN_START50=(Token)match(input,FUN_START,FOLLOW_FUN_START_in_function491); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUN_START.add(FUN_START50);

			pushFollow(FOLLOW_function_name_in_function495);
			n=function_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_function_name.add(n.getTree());
			CLOSE_BRACE51=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function497); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE51);

			OPEN_SQUARE52=(Token)match(input,OPEN_SQUARE,FOLLOW_OPEN_SQUARE_in_function499); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPEN_SQUARE.add(OPEN_SQUARE52);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:55: ( params )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= AT_BOOL && LA12_0 <= AT_NAME)||LA12_0==AT_STRING||LA12_0==BLOCK_OPEN||LA12_0==FUN_START||LA12_0==NOT||LA12_0==QT||LA12_0==SMINUS||(LA12_0 >= SPECIAL_START && LA12_0 <= SPLUS)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:55: params
					{
					pushFollow(FOLLOW_params_in_function501);
					params53=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params53.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			CLOSE_SQUARE54=(Token)match(input,CLOSE_SQUARE,FOLLOW_CLOSE_SQUARE_in_function504); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_SQUARE.add(CLOSE_SQUARE54);

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
			// 193:76: -> ^( FUN[$n.text] ( params )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:79: ^( FUN[$n.text] ( params )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUN, (n!=null?input.toString(n.start,n.stop):null)), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:193:94: ( params )*
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:196:1: function_name : ( BI_FUN | TERM | INDICATOR | ALL | GENERIC );
	public final NeutralExprParser.function_name_return function_name() throws RecognitionException {
		NeutralExprParser.function_name_return retval = new NeutralExprParser.function_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set55=null;

		CommonTree set55_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:197:2: ( BI_FUN | TERM | INDICATOR | ALL | GENERIC )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set55=input.LT(1);
			if ( input.LA(1)==ALL||input.LA(1)==BI_FUN||input.LA(1)==GENERIC||input.LA(1)==INDICATOR||input.LA(1)==TERM ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set55));
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:210:1: params : logicalExpression ( logicalExpression )* ;
	public final NeutralExprParser.params_return params() throws RecognitionException {
		NeutralExprParser.params_return retval = new NeutralExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope logicalExpression56 =null;
		ParserRuleReturnScope logicalExpression57 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:211:2: ( logicalExpression ( logicalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:212:3: logicalExpression ( logicalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_params583);
			logicalExpression56=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression56.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:212:21: ( logicalExpression )*
			loop13:
			while (true) {
				int alt13=2;
				switch ( input.LA(1) ) {
				case BLOCK_OPEN:
					{
					int LA13_2 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_BOOL:
					{
					int LA13_3 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_DATE:
					{
					int LA13_4 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_FLOAT:
					{
					int LA13_5 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_HEX:
					{
					int LA13_6 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_INDICATOR:
					{
					int LA13_7 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_INT:
					{
					int LA13_8 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_NAME:
					{
					int LA13_9 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_STRING:
					{
					int LA13_10 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case AT_GENERIC:
					{
					int LA13_11 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case QT:
					{
					int LA13_12 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case SPECIAL_START:
					{
					int LA13_13 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case FUN_START:
					{
					int LA13_14 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case NOT:
					{
					int LA13_15 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case SMINUS:
					{
					int LA13_16 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				case SPLUS:
					{
					int LA13_17 = input.LA(2);
					if ( (synpred42_NeutralExpr()) ) {
						alt13=1;
					}

					}
					break;
				}
				switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:212:22: logicalExpression
					{
					pushFollow(FOLLOW_logicalExpression_in_params586);
					logicalExpression57=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression57.getTree());

					}
					break;

				default :
					break loop13;
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

	// $ANTLR start synpred42_NeutralExpr
	public final void synpred42_NeutralExpr_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:212:22: ( logicalExpression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr\\src\\org\\smeup\\sys\\il\\expr\\neutral\\NeutralExpr.g:212:22: logicalExpression
		{
		pushFollow(FOLLOW_logicalExpression_in_synpred42_NeutralExpr586);
		logicalExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred42_NeutralExpr

	// Delegated rules

	public final boolean synpred42_NeutralExpr() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_NeutralExpr_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_logicalExpression_in_expression102 = new BitSet(new long[]{0x0000000000001F80L});
	public static final BitSet FOLLOW_set_in_expression105 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_logicalExpression_in_expression120 = new BitSet(new long[]{0x0000000000001F80L});
	public static final BitSet FOLLOW_EOF_in_expression124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_logicalExpression139 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression156 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression159 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression162 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression175 = new BitSet(new long[]{0x4000004000000002L});
	public static final BitSet FOLLOW_set_in_equalityExpression178 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression185 = new BitSet(new long[]{0x4000004000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression198 = new BitSet(new long[]{0x0180600000000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression202 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression213 = new BitSet(new long[]{0x0180600000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression228 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_set_in_additiveExpression232 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression239 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression255 = new BitSet(new long[]{0x1800001000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression259 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression270 = new BitSet(new long[]{0x1800001000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression295 = new BitSet(new long[]{0x00000400105FE000L,0x0000000000002100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMINUS_in_unaryExpression307 = new BitSet(new long[]{0x00000400105FE000L,0x0000000000002100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPLUS_in_unaryExpression320 = new BitSet(new long[]{0x00000400105FE000L,0x0000000000002100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_primaryExpression347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomic_in_primaryExpression355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_OPEN_in_block369 = new BitSet(new long[]{0x80000400105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_logicalExpression_in_block371 = new BitSet(new long[]{0x80000401105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_CLOSE_SQUARE_in_block374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_BOOL_in_atomic397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_DATE_in_atomic402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_FLOAT_in_atomic408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_HEX_in_atomic413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_INDICATOR_in_atomic418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_INT_in_atomic423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_NAME_in_atomic428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_STRING_in_atomic433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_GENERIC_in_atomic438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QT_in_atomic443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_atomic449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_atomic454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_START_in_special465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SPECIAL_in_special469 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_special471 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_special473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_START_in_function491 = new BitSet(new long[]{0x0004100004000020L,0x0000000000010000L});
	public static final BitSet FOLLOW_function_name_in_function495 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_function497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OPEN_SQUARE_in_function499 = new BitSet(new long[]{0x80000401105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_params_in_function501 = new BitSet(new long[]{0x80000401105FE000L,0x0000000000006900L});
	public static final BitSet FOLLOW_CLOSE_SQUARE_in_function504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalExpression_in_params583 = new BitSet(new long[]{0x80000400105FE002L,0x0000000000006900L});
	public static final BitSet FOLLOW_logicalExpression_in_params586 = new BitSet(new long[]{0x80000400105FE002L,0x0000000000006900L});
	public static final BitSet FOLLOW_logicalExpression_in_synpred42_NeutralExpr586 = new BitSet(new long[]{0x0000000000000002L});
}
