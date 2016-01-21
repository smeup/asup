// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g 2016-01-20 17:17:08

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "ALLX", "AND", "B", 
		"BI_FUN", "BI_FUNCTION", "BLOCK", "BOOLEAN", "C", "CHAR_SPECIAL", "D", 
		"DATE", "DIGIT", "DIGIT_SPECIAL", "DIV", "E", "EQ", "EscapeSequence", 
		"F", "FLOAT", "G", "GT", "GTEQ", "H", "HEX", "HexDigit", "I", "IN", "INDICATOR", 
		"INNR", "INNU", "INTEGER", "J", "K", "L", "LETTER", "LT", "LTEQ", "M", 
		"MINUS", "MOD", "MULT", "N", "NE", "NOT", "O", "OR", "P", "PLUS", "POINT", 
		"POW", "Q", "QUALIFIED", "R", "S", "SIGN_MINUS", "SIGN_PLUS", "SPECIAL", 
		"SP_VALUE", "STRING", "T", "TERM", "TIME", "TIMESTAMP", "U", "USER_FUNCTION", 
		"UnicodeEscape", "V", "W", "WS", "X", "Y", "Z", "'('", "')'", "':'"
	};
	public static final int EOF=-1;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int A=4;
	public static final int ALL=5;
	public static final int ALLX=6;
	public static final int AND=7;
	public static final int B=8;
	public static final int BI_FUN=9;
	public static final int BI_FUNCTION=10;
	public static final int BLOCK=11;
	public static final int BOOLEAN=12;
	public static final int C=13;
	public static final int CHAR_SPECIAL=14;
	public static final int D=15;
	public static final int DATE=16;
	public static final int DIGIT=17;
	public static final int DIGIT_SPECIAL=18;
	public static final int DIV=19;
	public static final int E=20;
	public static final int EQ=21;
	public static final int EscapeSequence=22;
	public static final int F=23;
	public static final int FLOAT=24;
	public static final int G=25;
	public static final int GT=26;
	public static final int GTEQ=27;
	public static final int H=28;
	public static final int HEX=29;
	public static final int HexDigit=30;
	public static final int I=31;
	public static final int IN=32;
	public static final int INDICATOR=33;
	public static final int INNR=34;
	public static final int INNU=35;
	public static final int INTEGER=36;
	public static final int J=37;
	public static final int K=38;
	public static final int L=39;
	public static final int LETTER=40;
	public static final int LT=41;
	public static final int LTEQ=42;
	public static final int M=43;
	public static final int MINUS=44;
	public static final int MOD=45;
	public static final int MULT=46;
	public static final int N=47;
	public static final int NE=48;
	public static final int NOT=49;
	public static final int O=50;
	public static final int OR=51;
	public static final int P=52;
	public static final int PLUS=53;
	public static final int POINT=54;
	public static final int POW=55;
	public static final int Q=56;
	public static final int QUALIFIED=57;
	public static final int R=58;
	public static final int S=59;
	public static final int SIGN_MINUS=60;
	public static final int SIGN_PLUS=61;
	public static final int SPECIAL=62;
	public static final int SP_VALUE=63;
	public static final int STRING=64;
	public static final int T=65;
	public static final int TERM=66;
	public static final int TIME=67;
	public static final int TIMESTAMP=68;
	public static final int U=69;
	public static final int USER_FUNCTION=70;
	public static final int UnicodeEscape=71;
	public static final int V=72;
	public static final int W=73;
	public static final int WS=74;
	public static final int X=75;
	public static final int Y=76;
	public static final int Z=77;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g"; }



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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:95:1: expression : logicalExpression EOF !;
	public final RPGExprParser.expression_return expression() throws RecognitionException {
		RPGExprParser.expression_return retval = new RPGExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:96:2: ( logicalExpression EOF !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:96:5: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression150);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression152); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:99:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final RPGExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		RPGExprParser.logicalExpression_return retval = new RPGExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:100:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:100:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression164);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:100:25: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:100:26: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression167); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression170);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:103:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final RPGExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		RPGExprParser.booleanAndExpression_return retval = new RPGExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:104:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:104:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression184);
			equalityExpression6=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression6.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:104:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:104:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression187); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression190);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:108:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final RPGExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		RPGExprParser.equalityExpression_return retval = new RPGExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:109:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:109:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression204);
			relationalExpression9=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression9.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:109:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:109:26: ( EQ | NE ) ^ relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression214);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:112:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final RPGExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		RPGExprParser.relationalExpression_return retval = new RPGExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope additiveExpression12 =null;
		ParserRuleReturnScope additiveExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:113:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:113:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression227);
			additiveExpression12=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression12.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:113:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:113:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression242);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:117:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final RPGExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		RPGExprParser.additiveExpression_return retval = new RPGExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope multiplicativeExpression15 =null;
		ParserRuleReturnScope multiplicativeExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:118:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:118:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression257);
			multiplicativeExpression15=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression15.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:118:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:118:31: ( PLUS | MINUS ) ^ multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression268);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:121:1: multiplicativeExpression : powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* ;
	public final RPGExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		RPGExprParser.multiplicativeExpression_return retval = new RPGExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope powerExpression18 =null;
		ParserRuleReturnScope powerExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:122:2: ( powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:123:3: powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression284);
			powerExpression18=powerExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression18.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:123:19: ( ( MULT | DIV | MOD ) ^ powerExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||(LA6_0 >= MOD && LA6_0 <= MULT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:123:21: ( MULT | DIV | MOD ) ^ powerExpression
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
					pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression297);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:126:1: powerExpression : (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* ;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:2: ( (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:4: (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:4: (v1= unaryExpression -> unaryExpression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:5: v1= unaryExpression
			{
			pushFollow(FOLLOW_unaryExpression_in_powerExpression313);
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
			// 127:24: -> unaryExpression
			{
				adaptor.addChild(root_0, stream_unaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:44: ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
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
						case 78:
							{
							alt7=1;
							}
							break;
						}
					}

				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:45: ( MULT MULT v2= unaryExpression )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:45: ( MULT MULT v2= unaryExpression )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:47: MULT MULT v2= unaryExpression
					{
					MULT21=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression323); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT21);

					MULT22=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression325); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT22);

					pushFollow(FOLLOW_unaryExpression_in_powerExpression329);
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
					// 127:78: -> ^( POW $v1 $v2)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:81: ^( POW $v1 $v2)
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:1: unaryExpression : ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) );
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:131:2: ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) )
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
			case 78:
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:132:4: qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_in_unaryExpression359);
					qualified23=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified23.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:133:8: NOT ^ qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT24=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression368); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT24_tree = (CommonTree)adaptor.create(NOT24);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT24_tree, root_0);
					}

					pushFollow(FOLLOW_qualified_in_unaryExpression371);
					qualified25=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified25.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:134:8: MINUS qualified
					{
					MINUS26=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression380); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS26);

					pushFollow(FOLLOW_qualified_in_unaryExpression382);
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
					// 134:24: -> ^( SIGN_MINUS qualified )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:134:27: ^( SIGN_MINUS qualified )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:135:8: PLUS qualified
					{
					PLUS28=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS28);

					pushFollow(FOLLOW_qualified_in_unaryExpression401);
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
					// 135:24: -> ^( SIGN_PLUS qualified )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:135:27: ^( SIGN_PLUS qualified )
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:138:1: qualified : (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* ;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:139:2: ( (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:3: (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:3: (v= primaryExpression -> primaryExpression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:4: v= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_qualified433);
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
			// 140:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:46: ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==POINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:47: ( POINT vals+= primaryExpression )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:47: ( POINT vals+= primaryExpression )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:48: POINT vals+= primaryExpression
					{
					POINT30=(Token)match(input,POINT,FOLLOW_POINT_in_qualified442); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POINT.add(POINT30);

					pushFollow(FOLLOW_primaryExpression_in_qualified446);
					vals=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primaryExpression.add(vals.getTree());
					if (list_vals==null) list_vals=new ArrayList<Object>();
					list_vals.add(vals.getTree());
					}

					// AST REWRITE
					// elements: v, vals
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
					// 140:79: -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:140:82: ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:1: primaryExpression : ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | array | value );
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
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:144:2: ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | array | value )
			int alt10=3;
			switch ( input.LA(1) ) {
			case 78:
				{
				alt10=1;
				}
				break;
			case INTEGER:
				{
				int LA10_2 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case FLOAT:
				{
				int LA10_3 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case DATE:
				{
				int LA10_4 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case TIME:
				{
				int LA10_5 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case TIMESTAMP:
				{
				int LA10_6 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA10_7 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case STRING:
				{
				int LA10_8 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case HEX:
				{
				int LA10_9 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case SPECIAL:
				{
				int LA10_10 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case IN:
				{
				int LA10_11 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case INNR:
				{
				int LA10_12 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case INNU:
				{
				int LA10_13 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case ALL:
				{
				int LA10_14 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case ALLX:
				{
				int LA10_15 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case MULT:
				{
				int LA10_16 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case BI_FUN:
				{
				int LA10_17 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

				}
				break;
			case TERM:
				{
				int LA10_18 = input.LA(2);
				if ( (synpred20_RPGExpr()) ) {
					alt10=2;
				}
				else if ( (true) ) {
					alt10=3;
				}

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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:144:4: '(' logicalExpression ')'
					{
					char_literal31=(Token)match(input,78,FOLLOW_78_in_primaryExpression479); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal31);

					pushFollow(FOLLOW_logicalExpression_in_primaryExpression481);
					logicalExpression32=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression32.getTree());
					char_literal33=(Token)match(input,79,FOLLOW_79_in_primaryExpression483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal33);

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
					// 144:30: -> ^( BLOCK[$primaryExpression.text] logicalExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:144:33: ^( BLOCK[$primaryExpression.text] logicalExpression )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:146:3: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_primaryExpression502);
					array34=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array34.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:148:3: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression511);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:151:1: array : value ( value )+ -> ^( BI_FUNCTION[\"\\%ARRAY\"] value ( value )+ ) ;
	public final RPGExprParser.array_return array() throws RecognitionException {
		RPGExprParser.array_return retval = new RPGExprParser.array_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope value36 =null;
		ParserRuleReturnScope value37 =null;

		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:152:2: ( value ( value )+ -> ^( BI_FUNCTION[\"\\%ARRAY\"] value ( value )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:2: value ( value )+
			{
			pushFollow(FOLLOW_value_in_array523);
			value36=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_value.add(value36.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:8: ( value )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MULT) ) {
					switch ( input.LA(2) ) {
					case ALL:
						{
						int LA11_4 = input.LA(3);
						if ( (synpred21_RPGExpr()) ) {
							alt11=1;
						}

						}
						break;
					case ALLX:
						{
						int LA11_5 = input.LA(3);
						if ( (synpred21_RPGExpr()) ) {
							alt11=1;
						}

						}
						break;
					case SPECIAL:
						{
						int LA11_6 = input.LA(3);
						if ( (synpred21_RPGExpr()) ) {
							alt11=1;
						}

						}
						break;
					case IN:
						{
						int LA11_7 = input.LA(3);
						if ( (synpred21_RPGExpr()) ) {
							alt11=1;
						}

						}
						break;
					case INNR:
						{
						int LA11_8 = input.LA(3);
						if ( (synpred21_RPGExpr()) ) {
							alt11=1;
						}

						}
						break;
					case INNU:
						{
						int LA11_9 = input.LA(3);
						if ( (synpred21_RPGExpr()) ) {
							alt11=1;
						}

						}
						break;
					}
				}
				else if ( ((LA11_0 >= ALL && LA11_0 <= ALLX)||LA11_0==BI_FUN||LA11_0==BOOLEAN||LA11_0==DATE||LA11_0==FLOAT||LA11_0==HEX||LA11_0==IN||(LA11_0 >= INNR && LA11_0 <= INTEGER)||LA11_0==SPECIAL||LA11_0==STRING||(LA11_0 >= TERM && LA11_0 <= TIMESTAMP)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:8: value
					{
					pushFollow(FOLLOW_value_in_array525);
					value37=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(value37.getTree());
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
			// 153:15: -> ^( BI_FUNCTION[\"\\%ARRAY\"] value ( value )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:18: ^( BI_FUNCTION[\"\\%ARRAY\"] value ( value )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "%ARRAY"), root_1);
				adaptor.addChild(root_1, stream_value.nextTree());
				if ( !(stream_value.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:156:1: value : ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | ( SPECIAL -> TERM[$SPECIAL.text] ) | ( IN -> TERM[$IN.text] ) | ( INNR -> TERM[$INNR.text] ) | ( INNU -> TERM[$INNU.text] ) | ( ALL -> TERM[$ALL.text] ) | ( ALLX -> TERM[$ALLX.text] ) | filler | special | bi_function | usr_function | indicator | TERM );
	public final RPGExprParser.value_return value() throws RecognitionException {
		RPGExprParser.value_return retval = new RPGExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER38=null;
		Token FLOAT39=null;
		Token DATE40=null;
		Token TIME41=null;
		Token TIMESTAMP42=null;
		Token BOOLEAN43=null;
		Token STRING44=null;
		Token HEX45=null;
		Token SPECIAL46=null;
		Token IN47=null;
		Token INNR48=null;
		Token INNU49=null;
		Token ALL50=null;
		Token ALLX51=null;
		Token TERM57=null;
		ParserRuleReturnScope filler52 =null;
		ParserRuleReturnScope special53 =null;
		ParserRuleReturnScope bi_function54 =null;
		ParserRuleReturnScope usr_function55 =null;
		ParserRuleReturnScope indicator56 =null;

		CommonTree INTEGER38_tree=null;
		CommonTree FLOAT39_tree=null;
		CommonTree DATE40_tree=null;
		CommonTree TIME41_tree=null;
		CommonTree TIMESTAMP42_tree=null;
		CommonTree BOOLEAN43_tree=null;
		CommonTree STRING44_tree=null;
		CommonTree HEX45_tree=null;
		CommonTree SPECIAL46_tree=null;
		CommonTree IN47_tree=null;
		CommonTree INNR48_tree=null;
		CommonTree INNU49_tree=null;
		CommonTree ALL50_tree=null;
		CommonTree ALLX51_tree=null;
		CommonTree TERM57_tree=null;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:157:2: ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | ( SPECIAL -> TERM[$SPECIAL.text] ) | ( IN -> TERM[$IN.text] ) | ( INNR -> TERM[$INNR.text] ) | ( INNU -> TERM[$INNU.text] ) | ( ALL -> TERM[$ALL.text] ) | ( ALLX -> TERM[$ALLX.text] ) | filler | special | bi_function | usr_function | indicator | TERM )
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
				alt12=9;
				}
				break;
			case IN:
				{
				alt12=10;
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
				if ( (LA12_17==78) ) {
					alt12=18;
				}
				else if ( (LA12_17==EOF||(LA12_17 >= ALL && LA12_17 <= AND)||LA12_17==BI_FUN||LA12_17==BOOLEAN||LA12_17==DATE||LA12_17==DIV||LA12_17==EQ||LA12_17==FLOAT||(LA12_17 >= GT && LA12_17 <= GTEQ)||LA12_17==HEX||LA12_17==IN||(LA12_17 >= INNR && LA12_17 <= INTEGER)||(LA12_17 >= LT && LA12_17 <= LTEQ)||(LA12_17 >= MINUS && LA12_17 <= MULT)||LA12_17==NE||LA12_17==OR||(LA12_17 >= PLUS && LA12_17 <= POINT)||LA12_17==SPECIAL||LA12_17==STRING||(LA12_17 >= TERM && LA12_17 <= TIMESTAMP)||(LA12_17 >= 79 && LA12_17 <= 80)) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:158:3: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER38=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value552); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER38_tree = (CommonTree)adaptor.create(INTEGER38);
					adaptor.addChild(root_0, INTEGER38_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:159:4: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT39=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value557); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT39_tree = (CommonTree)adaptor.create(FLOAT39);
					adaptor.addChild(root_0, FLOAT39_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:160:5: DATE
					{
					DATE40=(Token)match(input,DATE,FOLLOW_DATE_in_value563); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DATE.add(DATE40);

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
					// 160:10: -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:160:13: ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DATE, (DATE40!=null?DATE40.getText():null).substring(2, (DATE40!=null?DATE40.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:161:4: TIME
					{
					TIME41=(Token)match(input,TIME,FOLLOW_TIME_in_value575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME41);

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
					// 161:9: -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:161:12: ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, (TIME41!=null?TIME41.getText():null).substring(2, (TIME41!=null?TIME41.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:4: TIMESTAMP
					{
					TIMESTAMP42=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_value587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP42);

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
					// 162:14: -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:17: ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMESTAMP, (TIMESTAMP42!=null?TIMESTAMP42.getText():null).substring(2, (TIMESTAMP42!=null?TIMESTAMP42.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:163:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN43=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value599); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN43_tree = (CommonTree)adaptor.create(BOOLEAN43);
					adaptor.addChild(root_0, BOOLEAN43_tree);
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:164:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING44=(Token)match(input,STRING,FOLLOW_STRING_in_value604); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING44_tree = (CommonTree)adaptor.create(STRING44);
					adaptor.addChild(root_0, STRING44_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:165:4: HEX
					{
					HEX45=(Token)match(input,HEX,FOLLOW_HEX_in_value609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HEX.add(HEX45);

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
					// 165:8: -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:165:11: ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HEX, (HEX45!=null?HEX45.getText():null).substring(2, (HEX45!=null?HEX45.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:4: ( SPECIAL -> TERM[$SPECIAL.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:4: ( SPECIAL -> TERM[$SPECIAL.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:5: SPECIAL
					{
					SPECIAL46=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL46);

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
					// 166:13: -> TERM[$SPECIAL.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (SPECIAL46!=null?SPECIAL46.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:4: ( IN -> TERM[$IN.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:4: ( IN -> TERM[$IN.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:5: IN
					{
					IN47=(Token)match(input,IN,FOLLOW_IN_in_value634); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN47);

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
					// 167:8: -> TERM[$IN.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (IN47!=null?IN47.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:4: ( INNR -> TERM[$INNR.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:4: ( INNR -> TERM[$INNR.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:5: INNR
					{
					INNR48=(Token)match(input,INNR,FOLLOW_INNR_in_value646); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR48);

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
					// 168:10: -> TERM[$INNR.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (INNR48!=null?INNR48.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:4: ( INNU -> TERM[$INNU.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:4: ( INNU -> TERM[$INNU.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:5: INNU
					{
					INNU49=(Token)match(input,INNU,FOLLOW_INNU_in_value658); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU49);

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
					// 169:10: -> TERM[$INNU.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (INNU49!=null?INNU49.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:4: ( ALL -> TERM[$ALL.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:4: ( ALL -> TERM[$ALL.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:5: ALL
					{
					ALL50=(Token)match(input,ALL,FOLLOW_ALL_in_value670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL50);

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
					// 170:9: -> TERM[$ALL.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (ALL50!=null?ALL50.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:4: ( ALLX -> TERM[$ALLX.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:4: ( ALLX -> TERM[$ALLX.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:5: ALLX
					{
					ALLX51=(Token)match(input,ALLX,FOLLOW_ALLX_in_value682); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALLX.add(ALLX51);

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
					// 171:10: -> TERM[$ALLX.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (ALLX51!=null?ALLX51.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:172:4: filler
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filler_in_value693);
					filler52=filler();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, filler52.getTree());

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:173:4: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_value698);
					special53=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special53.getTree());

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:174:4: bi_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bi_function_in_value703);
					bi_function54=bi_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_function54.getTree());

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:175:4: usr_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_usr_function_in_value708);
					usr_function55=usr_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, usr_function55.getTree());

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:176:7: indicator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_indicator_in_value716);
					indicator56=indicator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indicator56.getTree());

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:177:4: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM57=(Token)match(input,TERM,FOLLOW_TERM_in_value721); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TERM57_tree = (CommonTree)adaptor.create(TERM57);
					adaptor.addChild(root_0, TERM57_tree);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:181:1: indicator : ( MULT IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | MULT INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] ) | MULT INNU -> ^( INDICATOR[\"*\" + $INNU.text] ) | MULT IN -> ^( INDICATOR[\"*\" + $IN.text] ) );
	public final RPGExprParser.indicator_return indicator() throws RecognitionException {
		RPGExprParser.indicator_return retval = new RPGExprParser.indicator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT58=null;
		Token IN59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token MULT63=null;
		Token INNR64=null;
		Token MULT65=null;
		Token INNU66=null;
		Token MULT67=null;
		Token IN68=null;
		ParserRuleReturnScope logicalExpression61 =null;

		CommonTree MULT58_tree=null;
		CommonTree IN59_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree MULT63_tree=null;
		CommonTree INNR64_tree=null;
		CommonTree MULT65_tree=null;
		CommonTree INNU66_tree=null;
		CommonTree MULT67_tree=null;
		CommonTree IN68_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_INNR=new RewriteRuleTokenStream(adaptor,"token INNR");
		RewriteRuleTokenStream stream_INNU=new RewriteRuleTokenStream(adaptor,"token INNU");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:182:2: ( MULT IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | MULT INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] ) | MULT INNU -> ^( INDICATOR[\"*\" + $INNU.text] ) | MULT IN -> ^( INDICATOR[\"*\" + $IN.text] ) )
			int alt13=4;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==MULT) ) {
				switch ( input.LA(2) ) {
				case IN:
					{
					int LA13_2 = input.LA(3);
					if ( (LA13_2==78) ) {
						alt13=1;
					}
					else if ( (LA13_2==EOF||(LA13_2 >= ALL && LA13_2 <= AND)||LA13_2==BI_FUN||LA13_2==BOOLEAN||LA13_2==DATE||LA13_2==DIV||LA13_2==EQ||LA13_2==FLOAT||(LA13_2 >= GT && LA13_2 <= GTEQ)||LA13_2==HEX||LA13_2==IN||(LA13_2 >= INNR && LA13_2 <= INTEGER)||(LA13_2 >= LT && LA13_2 <= LTEQ)||(LA13_2 >= MINUS && LA13_2 <= MULT)||LA13_2==NE||LA13_2==OR||(LA13_2 >= PLUS && LA13_2 <= POINT)||LA13_2==SPECIAL||LA13_2==STRING||(LA13_2 >= TERM && LA13_2 <= TIMESTAMP)||(LA13_2 >= 79 && LA13_2 <= 80)) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:183:3: MULT IN '(' logicalExpression ')'
					{
					MULT58=(Token)match(input,MULT,FOLLOW_MULT_in_indicator736); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT58);

					IN59=(Token)match(input,IN,FOLLOW_IN_in_indicator738); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN59);

					char_literal60=(Token)match(input,78,FOLLOW_78_in_indicator740); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal60);

					pushFollow(FOLLOW_logicalExpression_in_indicator742);
					logicalExpression61=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression61.getTree());
					char_literal62=(Token)match(input,79,FOLLOW_79_in_indicator744); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal62);

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
					// 183:37: -> ^( BI_FUNCTION[\"*IN\"] logicalExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:183:40: ^( BI_FUNCTION[\"*IN\"] logicalExpression )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:185:3: MULT INNR
					{
					MULT63=(Token)match(input,MULT,FOLLOW_MULT_in_indicator764); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT63);

					INNR64=(Token)match(input,INNR,FOLLOW_INNR_in_indicator766); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR64);

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
					// 185:13: -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:185:16: ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INTEGER, (INNR64!=null?INNR64.getText():null).substring(2)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:187:3: MULT INNU
					{
					MULT65=(Token)match(input,MULT,FOLLOW_MULT_in_indicator785); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT65);

					INNU66=(Token)match(input,INNU,FOLLOW_INNU_in_indicator787); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU66);

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
					// 187:13: -> ^( INDICATOR[\"*\" + $INNU.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:187:16: ^( INDICATOR[\"*\" + $INNU.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, "*" + (INNU66!=null?INNU66.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:189:3: MULT IN
					{
					MULT67=(Token)match(input,MULT,FOLLOW_MULT_in_indicator815); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT67);

					IN68=(Token)match(input,IN,FOLLOW_IN_in_indicator817); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN68);

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
					// 189:11: -> ^( INDICATOR[\"*\" + $IN.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:189:14: ^( INDICATOR[\"*\" + $IN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, "*" + (IN68!=null?IN68.getText():null)), root_1);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:192:1: filler : ( MULT ALL -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] ) | MULT ALLX -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] ) );
	public final RPGExprParser.filler_return filler() throws RecognitionException {
		RPGExprParser.filler_return retval = new RPGExprParser.filler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT69=null;
		Token ALL70=null;
		Token MULT71=null;
		Token ALLX72=null;

		CommonTree MULT69_tree=null;
		CommonTree ALL70_tree=null;
		CommonTree MULT71_tree=null;
		CommonTree ALLX72_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_ALLX=new RewriteRuleTokenStream(adaptor,"token ALLX");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:192:8: ( MULT ALL -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] ) | MULT ALLX -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] ) )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:193:3: MULT ALL
					{
					MULT69=(Token)match(input,MULT,FOLLOW_MULT_in_filler847); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT69);

					ALL70=(Token)match(input,ALL,FOLLOW_ALL_in_filler849); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL70);

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
					// 193:13: -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:193:16: ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING, (ALL70!=null?ALL70.getText():null).substring(4, (ALL70!=null?ALL70.getText():null).length()-1)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:195:3: MULT ALLX
					{
					MULT71=(Token)match(input,MULT,FOLLOW_MULT_in_filler871); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT71);

					ALLX72=(Token)match(input,ALLX,FOLLOW_ALLX_in_filler873); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALLX.add(ALLX72);

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
					// 195:13: -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:195:16: ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(HEX, (ALLX72!=null?ALLX72.getText():null).substring(5, (ALLX72!=null?ALLX72.getText():null).length()-1)));
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:198:1: special : MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] ;
	public final RPGExprParser.special_return special() throws RecognitionException {
		RPGExprParser.special_return retval = new RPGExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT73=null;
		Token SPECIAL74=null;

		CommonTree MULT73_tree=null;
		CommonTree SPECIAL74_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:198:9: ( MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:199:3: MULT SPECIAL
			{
			MULT73=(Token)match(input,MULT,FOLLOW_MULT_in_special900); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MULT.add(MULT73);

			SPECIAL74=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special902); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL74);

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
			// 199:16: -> SP_VALUE[$MULT.text + $SPECIAL.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(SP_VALUE, (MULT73!=null?MULT73.getText():null) + (SPECIAL74!=null?SPECIAL74.getText():null)));
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:203:1: usr_function : ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) );
	public final RPGExprParser.usr_function_return usr_function() throws RecognitionException {
		RPGExprParser.usr_function_return retval = new RPGExprParser.usr_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TERM75=null;
		Token TERM77=null;
		ParserRuleReturnScope params76 =null;
		ParserRuleReturnScope empty78 =null;

		CommonTree TERM75_tree=null;
		CommonTree TERM77_tree=null;
		RewriteRuleTokenStream stream_TERM=new RewriteRuleTokenStream(adaptor,"token TERM");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
		RewriteRuleSubtreeStream stream_empty=new RewriteRuleSubtreeStream(adaptor,"rule empty");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:204:2: ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==TERM) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==78) ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2==79) ) {
						alt15=2;
					}
					else if ( ((LA15_2 >= ALL && LA15_2 <= ALLX)||LA15_2==BI_FUN||LA15_2==BOOLEAN||LA15_2==DATE||LA15_2==FLOAT||LA15_2==HEX||LA15_2==IN||(LA15_2 >= INNR && LA15_2 <= INTEGER)||LA15_2==MINUS||LA15_2==MULT||LA15_2==NOT||LA15_2==PLUS||LA15_2==SPECIAL||LA15_2==STRING||(LA15_2 >= TERM && LA15_2 <= TIMESTAMP)||LA15_2==78) ) {
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
								new NoViableAltException("", 15, 2, input);
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

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:204:4: TERM params
					{
					TERM75=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function919); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM75);

					pushFollow(FOLLOW_params_in_usr_function921);
					params76=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params76.getTree());
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
					// 204:17: -> ^( USER_FUNCTION[$TERM.text] params )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:204:20: ^( USER_FUNCTION[$TERM.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM75!=null?TERM75.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:206:3: TERM empty
					{
					TERM77=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function939); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM77);

					pushFollow(FOLLOW_empty_in_usr_function941);
					empty78=empty();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_empty.add(empty78.getTree());
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
					// 206:14: -> ^( USER_FUNCTION[$TERM.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:206:17: ^( USER_FUNCTION[$TERM.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM77!=null?TERM77.getText():null)), root_1);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:208:1: bi_function : ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) );
	public final RPGExprParser.bi_function_return bi_function() throws RecognitionException {
		RPGExprParser.bi_function_return retval = new RPGExprParser.bi_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BI_FUN79=null;
		Token BI_FUN81=null;
		Token char_literal82=null;
		Token char_literal83=null;
		ParserRuleReturnScope params80 =null;

		CommonTree BI_FUN79_tree=null;
		CommonTree BI_FUN81_tree=null;
		CommonTree char_literal82_tree=null;
		CommonTree char_literal83_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_BI_FUN=new RewriteRuleTokenStream(adaptor,"token BI_FUN");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:2: ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BI_FUN) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==78) ) {
					int LA17_2 = input.LA(3);
					if ( (LA17_2==79) ) {
						alt17=2;
					}
					else if ( ((LA17_2 >= ALL && LA17_2 <= ALLX)||LA17_2==BI_FUN||LA17_2==BOOLEAN||LA17_2==DATE||LA17_2==FLOAT||LA17_2==HEX||LA17_2==IN||(LA17_2 >= INNR && LA17_2 <= INTEGER)||LA17_2==MINUS||LA17_2==MULT||LA17_2==NOT||LA17_2==PLUS||LA17_2==SPECIAL||LA17_2==STRING||(LA17_2 >= TERM && LA17_2 <= TIMESTAMP)||LA17_2==78) ) {
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
				else if ( (LA17_1==EOF||(LA17_1 >= ALL && LA17_1 <= AND)||LA17_1==BI_FUN||LA17_1==BOOLEAN||LA17_1==DATE||LA17_1==DIV||LA17_1==EQ||LA17_1==FLOAT||(LA17_1 >= GT && LA17_1 <= GTEQ)||LA17_1==HEX||LA17_1==IN||(LA17_1 >= INNR && LA17_1 <= INTEGER)||(LA17_1 >= LT && LA17_1 <= LTEQ)||(LA17_1 >= MINUS && LA17_1 <= MULT)||LA17_1==NE||LA17_1==OR||(LA17_1 >= PLUS && LA17_1 <= POINT)||LA17_1==SPECIAL||LA17_1==STRING||(LA17_1 >= TERM && LA17_1 <= TIMESTAMP)||(LA17_1 >= 79 && LA17_1 <= 80)) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:5: BI_FUN ( params )?
					{
					BI_FUN79=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function959); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN79);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:12: ( params )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==78) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:13: params
							{
							pushFollow(FOLLOW_params_in_bi_function962);
							params80=params();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_params.add(params80.getTree());
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
					// 209:22: -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:25: ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN79!=null?BI_FUN79.getText():null)), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:209:53: ( params )?
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:211:3: BI_FUN '(' ')'
					{
					BI_FUN81=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function984); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN81);

					char_literal82=(Token)match(input,78,FOLLOW_78_in_bi_function986); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal82);

					char_literal83=(Token)match(input,79,FOLLOW_79_in_bi_function988); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal83);

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
					// 211:20: -> ^( BI_FUNCTION[$BI_FUN.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:211:23: ^( BI_FUNCTION[$BI_FUN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN81!=null?BI_FUN81.getText():null)), root_1);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:214:1: params : '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !;
	public final RPGExprParser.params_return params() throws RecognitionException {
		RPGExprParser.params_return retval = new RPGExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal84=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope logicalExpression85 =null;
		ParserRuleReturnScope logicalExpression87 =null;

		CommonTree char_literal84_tree=null;
		CommonTree char_literal86_tree=null;
		CommonTree char_literal88_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:215:2: ( '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:3: '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal84=(Token)match(input,78,FOLLOW_78_in_params1013); if (state.failed) return retval;
			pushFollow(FOLLOW_logicalExpression_in_params1016);
			logicalExpression85=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression85.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:26: ( ':' ! logicalExpression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==80) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:27: ':' ! logicalExpression
					{
					char_literal86=(Token)match(input,80,FOLLOW_80_in_params1019); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalExpression_in_params1022);
					logicalExpression87=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression87.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

			char_literal88=(Token)match(input,79,FOLLOW_79_in_params1026); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:219:1: empty : '(' ')' ;
	public final RPGExprParser.empty_return empty() throws RecognitionException {
		RPGExprParser.empty_return retval = new RPGExprParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal89=null;
		Token char_literal90=null;

		CommonTree char_literal89_tree=null;
		CommonTree char_literal90_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:220:2: ( '(' ')' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:221:2: '(' ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal89=(Token)match(input,78,FOLLOW_78_in_empty1040); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal89_tree = (CommonTree)adaptor.create(char_literal89);
			adaptor.addChild(root_0, char_literal89_tree);
			}

			char_literal90=(Token)match(input,79,FOLLOW_79_in_empty1042); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal90_tree = (CommonTree)adaptor.create(char_literal90);
			adaptor.addChild(root_0, char_literal90_tree);
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


		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:45: ( ( MULT MULT v2= unaryExpression ) )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:45: ( MULT MULT v2= unaryExpression )
		{
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:45: ( MULT MULT v2= unaryExpression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:127:47: MULT MULT v2= unaryExpression
		{
		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr323); if (state.failed) return;

		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr325); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred14_RPGExpr329);
		v2=unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred14_RPGExpr

	// $ANTLR start synpred20_RPGExpr
	public final void synpred20_RPGExpr_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:146:3: ( array )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:146:3: array
		{
		pushFollow(FOLLOW_array_in_synpred20_RPGExpr502);
		array();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_RPGExpr

	// $ANTLR start synpred21_RPGExpr
	public final void synpred21_RPGExpr_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:8: ( value )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:8: value
		{
		pushFollow(FOLLOW_value_in_synpred21_RPGExpr525);
		value();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_RPGExpr

	// Delegated rules

	public final boolean synpred21_RPGExpr() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_RPGExpr_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_RPGExpr() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_RPGExpr_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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



	public static final BitSet FOLLOW_logicalExpression_in_expression150 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression164 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression167 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression170 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression184 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression187 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression190 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression204 = new BitSet(new long[]{0x0001000000200002L});
	public static final BitSet FOLLOW_set_in_equalityExpression207 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression214 = new BitSet(new long[]{0x0001000000200002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression227 = new BitSet(new long[]{0x000006000C000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression231 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression242 = new BitSet(new long[]{0x000006000C000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression257 = new BitSet(new long[]{0x0020100000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression261 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression268 = new BitSet(new long[]{0x0020100000000002L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression284 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression288 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression297 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression313 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_MULT_in_powerExpression323 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_MULT_in_powerExpression325 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression329 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression368 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression380 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression399 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified433 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_POINT_in_qualified442 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_primaryExpression_in_qualified446 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_78_in_primaryExpression479 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_primaryExpression483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_primaryExpression502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_array523 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000001DL});
	public static final BitSet FOLLOW_value_in_array525 = new BitSet(new long[]{0x4000401D21011262L,0x000000000000001DL});
	public static final BitSet FOLLOW_INTEGER_in_value552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_value563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_value575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_value587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_value634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNR_in_value646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNU_in_value658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_value670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLX_in_value682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filler_in_value693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_value698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bi_function_in_value703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usr_function_in_value708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indicator_in_value716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator736 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_indicator738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_indicator740 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_indicator742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_indicator744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator764 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_INNR_in_indicator766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator785 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INNU_in_indicator787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator815 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_indicator817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler847 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler871 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALLX_in_filler873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_special900 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_in_special902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_params_in_usr_function921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_empty_in_usr_function941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_params_in_bi_function962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_bi_function986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_bi_function988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_params1013 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_params1016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
	public static final BitSet FOLLOW_80_in_params1019 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_params1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
	public static final BitSet FOLLOW_79_in_params1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_empty1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_empty1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr323 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr325 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_unaryExpression_in_synpred14_RPGExpr329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_synpred20_RPGExpr502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_synpred21_RPGExpr525 = new BitSet(new long[]{0x0000000000000002L});
}
