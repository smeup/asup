// $ANTLR 3.5.1 /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g 2015-10-10 23:11:39

  package org.smeup.sys.il.expr.ibmi.rpg;


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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "AND", "B", "BI_FUN", 
		"BI_FUNCTION", "BLOCK", "BOOLEAN", "C", "CHAR_SPECIAL", "D", "DATE", "DIGIT", 
		"DIGIT_SPECIAL", "DIV", "E", "EQ", "EscapeSequence", "F", "FLOAT", "G", 
		"GT", "GTEQ", "H", "HEX", "HexDigit", "I", "IN", "INDICATOR", "INNR", 
		"INNU", "INTEGER", "J", "K", "L", "LETTER", "LT", "LTEQ", "M", "MINUS", 
		"MOD", "MULT", "N", "NE", "NOT", "O", "OR", "P", "PLUS", "POINT", "POW", 
		"Q", "QUALIFIED", "R", "S", "SIGN_MINUS", "SIGN_PLUS", "SPECIAL", "SP_VALUE", 
		"STRING", "T", "TERM", "TIME", "TIMESTAMP", "U", "USER_FUNCTION", "UnicodeEscape", 
		"V", "W", "WS", "X", "Y", "Z", "'('", "')'", "':'"
	};
	public static final int EOF=-1;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int A=4;
	public static final int ALL=5;
	public static final int AND=6;
	public static final int B=7;
	public static final int BI_FUN=8;
	public static final int BI_FUNCTION=9;
	public static final int BLOCK=10;
	public static final int BOOLEAN=11;
	public static final int C=12;
	public static final int CHAR_SPECIAL=13;
	public static final int D=14;
	public static final int DATE=15;
	public static final int DIGIT=16;
	public static final int DIGIT_SPECIAL=17;
	public static final int DIV=18;
	public static final int E=19;
	public static final int EQ=20;
	public static final int EscapeSequence=21;
	public static final int F=22;
	public static final int FLOAT=23;
	public static final int G=24;
	public static final int GT=25;
	public static final int GTEQ=26;
	public static final int H=27;
	public static final int HEX=28;
	public static final int HexDigit=29;
	public static final int I=30;
	public static final int IN=31;
	public static final int INDICATOR=32;
	public static final int INNR=33;
	public static final int INNU=34;
	public static final int INTEGER=35;
	public static final int J=36;
	public static final int K=37;
	public static final int L=38;
	public static final int LETTER=39;
	public static final int LT=40;
	public static final int LTEQ=41;
	public static final int M=42;
	public static final int MINUS=43;
	public static final int MOD=44;
	public static final int MULT=45;
	public static final int N=46;
	public static final int NE=47;
	public static final int NOT=48;
	public static final int O=49;
	public static final int OR=50;
	public static final int P=51;
	public static final int PLUS=52;
	public static final int POINT=53;
	public static final int POW=54;
	public static final int Q=55;
	public static final int QUALIFIED=56;
	public static final int R=57;
	public static final int S=58;
	public static final int SIGN_MINUS=59;
	public static final int SIGN_PLUS=60;
	public static final int SPECIAL=61;
	public static final int SP_VALUE=62;
	public static final int STRING=63;
	public static final int T=64;
	public static final int TERM=65;
	public static final int TIME=66;
	public static final int TIMESTAMP=67;
	public static final int U=68;
	public static final int USER_FUNCTION=69;
	public static final int UnicodeEscape=70;
	public static final int V=71;
	public static final int W=72;
	public static final int WS=73;
	public static final int X=74;
	public static final int Y=75;
	public static final int Z=76;

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
	@Override public String getGrammarFileName() { return "/home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g"; }


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:47:1: expression : logicalExpression EOF !;
	public final RPGExprParser.expression_return expression() throws RecognitionException {
		RPGExprParser.expression_return retval = new RPGExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:48:2: ( logicalExpression EOF !)
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:48:5: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression131);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression133); if (state.failed) return retval;
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:51:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final RPGExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		RPGExprParser.logicalExpression_return retval = new RPGExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:52:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:52:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression145);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:52:25: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:52:26: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression148); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression151);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:55:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final RPGExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		RPGExprParser.booleanAndExpression_return retval = new RPGExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:56:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:56:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression165);
			equalityExpression6=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression6.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:56:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:56:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression168); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression171);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:60:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final RPGExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		RPGExprParser.equalityExpression_return retval = new RPGExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:61:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:61:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression185);
			relationalExpression9=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression9.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:61:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:61:26: ( EQ | NE ) ^ relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression195);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:64:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final RPGExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		RPGExprParser.relationalExpression_return retval = new RPGExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope additiveExpression12 =null;
		ParserRuleReturnScope additiveExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:65:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:65:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression208);
			additiveExpression12=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression12.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:65:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:65:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression223);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:69:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final RPGExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		RPGExprParser.additiveExpression_return retval = new RPGExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope multiplicativeExpression15 =null;
		ParserRuleReturnScope multiplicativeExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:70:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:70:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression238);
			multiplicativeExpression15=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression15.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:70:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:70:31: ( PLUS | MINUS ) ^ multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression249);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:73:1: multiplicativeExpression : powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* ;
	public final RPGExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		RPGExprParser.multiplicativeExpression_return retval = new RPGExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope powerExpression18 =null;
		ParserRuleReturnScope powerExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:74:2: ( powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:75:3: powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression265);
			powerExpression18=powerExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression18.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:75:19: ( ( MULT | DIV | MOD ) ^ powerExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||(LA6_0 >= MOD && LA6_0 <= MULT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:75:21: ( MULT | DIV | MOD ) ^ powerExpression
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
					pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression278);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:78:1: powerExpression : (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* ;
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:2: ( (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:4: (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			{
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:4: (v1= unaryExpression -> unaryExpression )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:5: v1= unaryExpression
			{
			pushFollow(FOLLOW_unaryExpression_in_powerExpression294);
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
			// 79:24: -> unaryExpression
			{
				adaptor.addChild(root_0, stream_unaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:44: ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==MULT) ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1==MULT) ) {
						int LA7_3 = input.LA(3);
						if ( (LA7_3==SPECIAL) ) {
							int LA7_4 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

						}
						else if ( (LA7_3==BI_FUN||LA7_3==BOOLEAN||LA7_3==DATE||LA7_3==FLOAT||LA7_3==HEX||LA7_3==IN||(LA7_3 >= INNR && LA7_3 <= INTEGER)||LA7_3==MINUS||LA7_3==MULT||LA7_3==NOT||LA7_3==PLUS||LA7_3==STRING||(LA7_3 >= TERM && LA7_3 <= TIMESTAMP)||LA7_3==77) ) {
							alt7=1;
						}

					}

				}

				switch (alt7) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:45: ( MULT MULT v2= unaryExpression )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:45: ( MULT MULT v2= unaryExpression )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:47: MULT MULT v2= unaryExpression
					{
					MULT21=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression304); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT21);

					MULT22=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression306); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT22);

					pushFollow(FOLLOW_unaryExpression_in_powerExpression310);
					v2=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(v2.getTree());
					}

					// AST REWRITE
					// elements: v2, v1
					// token labels: 
					// rule labels: v1, retval, v2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 79:78: -> ^( POW $v1 $v2)
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:81: ^( POW $v1 $v2)
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:82:1: unaryExpression : ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) );
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
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_qualified=new RewriteRuleSubtreeStream(adaptor,"rule qualified");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:83:2: ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) )
			int alt8=4;
			switch ( input.LA(1) ) {
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
			case 77:
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:84:4: qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_in_unaryExpression340);
					qualified23=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified23.getTree());

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:85:8: NOT ^ qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT24=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression349); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT24_tree = (CommonTree)adaptor.create(NOT24);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT24_tree, root_0);
					}

					pushFollow(FOLLOW_qualified_in_unaryExpression352);
					qualified25=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified25.getTree());

					}
					break;
				case 3 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:86:8: MINUS qualified
					{
					MINUS26=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression361); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS26);

					pushFollow(FOLLOW_qualified_in_unaryExpression363);
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
					// 86:24: -> ^( SIGN_MINUS qualified )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:86:27: ^( SIGN_MINUS qualified )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:87:8: PLUS qualified
					{
					PLUS28=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression380); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS28);

					pushFollow(FOLLOW_qualified_in_unaryExpression382);
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
					// 87:24: -> ^( SIGN_PLUS qualified )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:87:27: ^( SIGN_PLUS qualified )
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:90:1: qualified : (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* ;
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:91:2: ( (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:3: (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			{
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:3: (v= primaryExpression -> primaryExpression )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:4: v= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_qualified414);
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
			// 92:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:46: ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==POINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:47: ( POINT vals+= primaryExpression )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:47: ( POINT vals+= primaryExpression )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:48: POINT vals+= primaryExpression
					{
					POINT30=(Token)match(input,POINT,FOLLOW_POINT_in_qualified423); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POINT.add(POINT30);

					pushFollow(FOLLOW_primaryExpression_in_qualified427);
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
					// 92:79: -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:92:82: ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:95:1: primaryExpression : ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value );
	public final RPGExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		RPGExprParser.primaryExpression_return retval = new RPGExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope logicalExpression32 =null;
		ParserRuleReturnScope value34 =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:96:2: ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==77) ) {
				alt10=1;
			}
			else if ( (LA10_0==BI_FUN||LA10_0==BOOLEAN||LA10_0==DATE||LA10_0==FLOAT||LA10_0==HEX||LA10_0==IN||(LA10_0 >= INNR && LA10_0 <= INTEGER)||LA10_0==MULT||LA10_0==SPECIAL||LA10_0==STRING||(LA10_0 >= TERM && LA10_0 <= TIMESTAMP)) ) {
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:96:4: '(' logicalExpression ')'
					{
					char_literal31=(Token)match(input,77,FOLLOW_77_in_primaryExpression460); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal31);

					pushFollow(FOLLOW_logicalExpression_in_primaryExpression462);
					logicalExpression32=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression32.getTree());
					char_literal33=(Token)match(input,78,FOLLOW_78_in_primaryExpression464); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal33);

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
					// 96:30: -> ^( BLOCK[$primaryExpression.text] logicalExpression )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:96:33: ^( BLOCK[$primaryExpression.text] logicalExpression )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:98:3: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression481);
					value34=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value34.getTree());

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


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:101:1: value : ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | TERM | ( SPECIAL -> TERM ) | filler | special | bi_function | usr_function | indicator );
	public final RPGExprParser.value_return value() throws RecognitionException {
		RPGExprParser.value_return retval = new RPGExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER35=null;
		Token FLOAT36=null;
		Token DATE37=null;
		Token TIME38=null;
		Token TIMESTAMP39=null;
		Token BOOLEAN40=null;
		Token STRING41=null;
		Token HEX42=null;
		Token TERM43=null;
		Token SPECIAL44=null;
		ParserRuleReturnScope filler45 =null;
		ParserRuleReturnScope special46 =null;
		ParserRuleReturnScope bi_function47 =null;
		ParserRuleReturnScope usr_function48 =null;
		ParserRuleReturnScope indicator49 =null;

		CommonTree INTEGER35_tree=null;
		CommonTree FLOAT36_tree=null;
		CommonTree DATE37_tree=null;
		CommonTree TIME38_tree=null;
		CommonTree TIMESTAMP39_tree=null;
		CommonTree BOOLEAN40_tree=null;
		CommonTree STRING41_tree=null;
		CommonTree HEX42_tree=null;
		CommonTree TERM43_tree=null;
		CommonTree SPECIAL44_tree=null;
		RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");
		RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");
		RewriteRuleTokenStream stream_HEX=new RewriteRuleTokenStream(adaptor,"token HEX");
		RewriteRuleTokenStream stream_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token TIMESTAMP");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:102:2: ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | TERM | ( SPECIAL -> TERM ) | filler | special | bi_function | usr_function | indicator )
			int alt11=15;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt11=1;
				}
				break;
			case FLOAT:
				{
				alt11=2;
				}
				break;
			case DATE:
				{
				alt11=3;
				}
				break;
			case TIME:
				{
				alt11=4;
				}
				break;
			case TIMESTAMP:
				{
				alt11=5;
				}
				break;
			case BOOLEAN:
				{
				alt11=6;
				}
				break;
			case STRING:
				{
				alt11=7;
				}
				break;
			case HEX:
				{
				alt11=8;
				}
				break;
			case TERM:
				{
				int LA11_9 = input.LA(2);
				if ( (LA11_9==EOF||LA11_9==AND||LA11_9==DIV||LA11_9==EQ||(LA11_9 >= GT && LA11_9 <= GTEQ)||(LA11_9 >= LT && LA11_9 <= LTEQ)||(LA11_9 >= MINUS && LA11_9 <= MULT)||LA11_9==NE||LA11_9==OR||(LA11_9 >= PLUS && LA11_9 <= POINT)||(LA11_9 >= 78 && LA11_9 <= 79)) ) {
					alt11=9;
				}
				else if ( (LA11_9==77) ) {
					alt11=14;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SPECIAL:
				{
				alt11=10;
				}
				break;
			case MULT:
				{
				int LA11_11 = input.LA(2);
				if ( (LA11_11==ALL) ) {
					alt11=11;
				}
				else if ( (LA11_11==SPECIAL) ) {
					alt11=12;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BI_FUN:
				{
				alt11=13;
				}
				break;
			case IN:
			case INNR:
			case INNU:
				{
				alt11=15;
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:103:3: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value496); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER35_tree = (CommonTree)adaptor.create(INTEGER35);
					adaptor.addChild(root_0, INTEGER35_tree);
					}

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:104:4: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT36=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value501); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT36_tree = (CommonTree)adaptor.create(FLOAT36);
					adaptor.addChild(root_0, FLOAT36_tree);
					}

					}
					break;
				case 3 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:105:5: DATE
					{
					DATE37=(Token)match(input,DATE,FOLLOW_DATE_in_value507); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DATE.add(DATE37);

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
					// 105:10: -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:105:13: ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DATE, (DATE37!=null?DATE37.getText():null).substring(2, (DATE37!=null?DATE37.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:106:4: TIME
					{
					TIME38=(Token)match(input,TIME,FOLLOW_TIME_in_value519); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME38);

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
					// 106:9: -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:106:12: ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, (TIME38!=null?TIME38.getText():null).substring(2, (TIME38!=null?TIME38.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:107:4: TIMESTAMP
					{
					TIMESTAMP39=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_value531); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP39);

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
					// 107:14: -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:107:17: ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMESTAMP, (TIMESTAMP39!=null?TIMESTAMP39.getText():null).substring(2, (TIMESTAMP39!=null?TIMESTAMP39.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:108:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN40=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN40_tree = (CommonTree)adaptor.create(BOOLEAN40);
					adaptor.addChild(root_0, BOOLEAN40_tree);
					}

					}
					break;
				case 7 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:109:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING41=(Token)match(input,STRING,FOLLOW_STRING_in_value548); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING41_tree = (CommonTree)adaptor.create(STRING41);
					adaptor.addChild(root_0, STRING41_tree);
					}

					}
					break;
				case 8 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:110:4: HEX
					{
					HEX42=(Token)match(input,HEX,FOLLOW_HEX_in_value553); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HEX.add(HEX42);

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
					// 110:8: -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:110:11: ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HEX, (HEX42!=null?HEX42.getText():null).substring(2, (HEX42!=null?HEX42.getText():null).length() -1 )), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:111:4: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM43=(Token)match(input,TERM,FOLLOW_TERM_in_value565); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TERM43_tree = (CommonTree)adaptor.create(TERM43);
					adaptor.addChild(root_0, TERM43_tree);
					}

					}
					break;
				case 10 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:112:4: ( SPECIAL -> TERM )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:112:4: ( SPECIAL -> TERM )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:112:5: SPECIAL
					{
					SPECIAL44=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value571); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL44);

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
					// 112:13: -> TERM
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, "TERM"));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 11 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:113:4: filler
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filler_in_value581);
					filler45=filler();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, filler45.getTree());

					}
					break;
				case 12 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:114:4: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_value586);
					special46=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special46.getTree());

					}
					break;
				case 13 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:115:4: bi_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bi_function_in_value591);
					bi_function47=bi_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_function47.getTree());

					}
					break;
				case 14 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:116:4: usr_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_usr_function_in_value596);
					usr_function48=usr_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, usr_function48.getTree());

					}
					break;
				case 15 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:117:6: indicator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_indicator_in_value603);
					indicator49=indicator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indicator49.getTree());

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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:120:1: indicator : ( IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] ) | INNU -> ^( INDICATOR[$INNU.text] ) | IN -> ^( INDICATOR[$IN.text] ) );
	public final RPGExprParser.indicator_return indicator() throws RecognitionException {
		RPGExprParser.indicator_return retval = new RPGExprParser.indicator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IN50=null;
		Token char_literal51=null;
		Token char_literal53=null;
		Token INNR54=null;
		Token INNU55=null;
		Token IN56=null;
		ParserRuleReturnScope logicalExpression52 =null;

		CommonTree IN50_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree char_literal53_tree=null;
		CommonTree INNR54_tree=null;
		CommonTree INNU55_tree=null;
		CommonTree IN56_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_INNR=new RewriteRuleTokenStream(adaptor,"token INNR");
		RewriteRuleTokenStream stream_INNU=new RewriteRuleTokenStream(adaptor,"token INNU");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:121:2: ( IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] ) | INNU -> ^( INDICATOR[$INNU.text] ) | IN -> ^( INDICATOR[$IN.text] ) )
			int alt12=4;
			switch ( input.LA(1) ) {
			case IN:
				{
				int LA12_1 = input.LA(2);
				if ( (LA12_1==77) ) {
					alt12=1;
				}
				else if ( (LA12_1==EOF||LA12_1==AND||LA12_1==DIV||LA12_1==EQ||(LA12_1 >= GT && LA12_1 <= GTEQ)||(LA12_1 >= LT && LA12_1 <= LTEQ)||(LA12_1 >= MINUS && LA12_1 <= MULT)||LA12_1==NE||LA12_1==OR||(LA12_1 >= PLUS && LA12_1 <= POINT)||(LA12_1 >= 78 && LA12_1 <= 79)) ) {
					alt12=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INNR:
				{
				alt12=2;
				}
				break;
			case INNU:
				{
				alt12=3;
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:122:3: IN '(' logicalExpression ')'
					{
					IN50=(Token)match(input,IN,FOLLOW_IN_in_indicator617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN50);

					char_literal51=(Token)match(input,77,FOLLOW_77_in_indicator619); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal51);

					pushFollow(FOLLOW_logicalExpression_in_indicator621);
					logicalExpression52=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression52.getTree());
					char_literal53=(Token)match(input,78,FOLLOW_78_in_indicator623); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal53);

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
					// 122:32: -> ^( BI_FUNCTION[\"*IN\"] logicalExpression )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:122:35: ^( BI_FUNCTION[\"*IN\"] logicalExpression )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:124:3: INNR
					{
					INNR54=(Token)match(input,INNR,FOLLOW_INNR_in_indicator643); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR54);

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
					// 124:8: -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:124:11: ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INTEGER, (INNR54!=null?INNR54.getText():null).substring(3)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:126:3: INNU
					{
					INNU55=(Token)match(input,INNU,FOLLOW_INNU_in_indicator666); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU55);

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
					// 126:8: -> ^( INDICATOR[$INNU.text] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:126:11: ^( INDICATOR[$INNU.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, (INNU55!=null?INNU55.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:128:3: IN
					{
					IN56=(Token)match(input,IN,FOLLOW_IN_in_indicator698); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN56);

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
					// 128:6: -> ^( INDICATOR[$IN.text] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:128:9: ^( INDICATOR[$IN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, (IN56!=null?IN56.getText():null)), root_1);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:131:1: filler : ( MULT ALL STRING -> ^( BI_FUNCTION[\"*ALL\"] STRING ) | MULT ALL HEX -> ^( BI_FUNCTION[\"*ALL\"] HEX ) );
	public final RPGExprParser.filler_return filler() throws RecognitionException {
		RPGExprParser.filler_return retval = new RPGExprParser.filler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT57=null;
		Token ALL58=null;
		Token STRING59=null;
		Token MULT60=null;
		Token ALL61=null;
		Token HEX62=null;

		CommonTree MULT57_tree=null;
		CommonTree ALL58_tree=null;
		CommonTree STRING59_tree=null;
		CommonTree MULT60_tree=null;
		CommonTree ALL61_tree=null;
		CommonTree HEX62_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_HEX=new RewriteRuleTokenStream(adaptor,"token HEX");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:131:8: ( MULT ALL STRING -> ^( BI_FUNCTION[\"*ALL\"] STRING ) | MULT ALL HEX -> ^( BI_FUNCTION[\"*ALL\"] HEX ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==MULT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==ALL) ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2==STRING) ) {
						alt13=1;
					}
					else if ( (LA13_2==HEX) ) {
						alt13=2;
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

				else {
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:132:3: MULT ALL STRING
					{
					MULT57=(Token)match(input,MULT,FOLLOW_MULT_in_filler733); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT57);

					ALL58=(Token)match(input,ALL,FOLLOW_ALL_in_filler735); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL58);

					STRING59=(Token)match(input,STRING,FOLLOW_STRING_in_filler737); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(STRING59);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:19: -> ^( BI_FUNCTION[\"*ALL\"] STRING )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:132:22: ^( BI_FUNCTION[\"*ALL\"] STRING )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:134:3: MULT ALL HEX
					{
					MULT60=(Token)match(input,MULT,FOLLOW_MULT_in_filler754); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT60);

					ALL61=(Token)match(input,ALL,FOLLOW_ALL_in_filler756); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL61);

					HEX62=(Token)match(input,HEX,FOLLOW_HEX_in_filler758); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HEX.add(HEX62);

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
					// 134:16: -> ^( BI_FUNCTION[\"*ALL\"] HEX )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:134:19: ^( BI_FUNCTION[\"*ALL\"] HEX )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, stream_HEX.nextNode());
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:137:1: special : MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] ;
	public final RPGExprParser.special_return special() throws RecognitionException {
		RPGExprParser.special_return retval = new RPGExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT63=null;
		Token SPECIAL64=null;

		CommonTree MULT63_tree=null;
		CommonTree SPECIAL64_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:137:9: ( MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:138:3: MULT SPECIAL
			{
			MULT63=(Token)match(input,MULT,FOLLOW_MULT_in_special780); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MULT.add(MULT63);

			SPECIAL64=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special782); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL64);

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
			// 138:16: -> SP_VALUE[$MULT.text + $SPECIAL.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(SP_VALUE, (MULT63!=null?MULT63.getText():null) + (SPECIAL64!=null?SPECIAL64.getText():null)));
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:142:1: usr_function : ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) );
	public final RPGExprParser.usr_function_return usr_function() throws RecognitionException {
		RPGExprParser.usr_function_return retval = new RPGExprParser.usr_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TERM65=null;
		Token TERM67=null;
		ParserRuleReturnScope params66 =null;
		ParserRuleReturnScope empty68 =null;

		CommonTree TERM65_tree=null;
		CommonTree TERM67_tree=null;
		RewriteRuleTokenStream stream_TERM=new RewriteRuleTokenStream(adaptor,"token TERM");
		RewriteRuleSubtreeStream stream_empty=new RewriteRuleSubtreeStream(adaptor,"rule empty");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:143:2: ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TERM) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==77) ) {
					int LA14_2 = input.LA(3);
					if ( (LA14_2==78) ) {
						alt14=2;
					}
					else if ( (LA14_2==BI_FUN||LA14_2==BOOLEAN||LA14_2==DATE||LA14_2==FLOAT||LA14_2==HEX||LA14_2==IN||(LA14_2 >= INNR && LA14_2 <= INTEGER)||LA14_2==MINUS||LA14_2==MULT||LA14_2==NOT||LA14_2==PLUS||LA14_2==SPECIAL||LA14_2==STRING||(LA14_2 >= TERM && LA14_2 <= TIMESTAMP)||LA14_2==77) ) {
						alt14=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 2, input);
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:143:4: TERM params
					{
					TERM65=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function799); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM65);

					pushFollow(FOLLOW_params_in_usr_function801);
					params66=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params66.getTree());
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
					// 143:17: -> ^( USER_FUNCTION[$TERM.text] params )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:143:20: ^( USER_FUNCTION[$TERM.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM65!=null?TERM65.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:145:3: TERM empty
					{
					TERM67=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function819); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM67);

					pushFollow(FOLLOW_empty_in_usr_function821);
					empty68=empty();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_empty.add(empty68.getTree());
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
					// 145:14: -> ^( USER_FUNCTION[$TERM.text] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:145:17: ^( USER_FUNCTION[$TERM.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM67!=null?TERM67.getText():null)), root_1);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:147:1: bi_function : ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) );
	public final RPGExprParser.bi_function_return bi_function() throws RecognitionException {
		RPGExprParser.bi_function_return retval = new RPGExprParser.bi_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BI_FUN69=null;
		Token BI_FUN71=null;
		Token char_literal72=null;
		Token char_literal73=null;
		ParserRuleReturnScope params70 =null;

		CommonTree BI_FUN69_tree=null;
		CommonTree BI_FUN71_tree=null;
		CommonTree char_literal72_tree=null;
		CommonTree char_literal73_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_BI_FUN=new RewriteRuleTokenStream(adaptor,"token BI_FUN");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:148:2: ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BI_FUN) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==77) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==78) ) {
						alt16=2;
					}
					else if ( (LA16_2==BI_FUN||LA16_2==BOOLEAN||LA16_2==DATE||LA16_2==FLOAT||LA16_2==HEX||LA16_2==IN||(LA16_2 >= INNR && LA16_2 <= INTEGER)||LA16_2==MINUS||LA16_2==MULT||LA16_2==NOT||LA16_2==PLUS||LA16_2==SPECIAL||LA16_2==STRING||(LA16_2 >= TERM && LA16_2 <= TIMESTAMP)||LA16_2==77) ) {
						alt16=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA16_1==EOF||LA16_1==AND||LA16_1==DIV||LA16_1==EQ||(LA16_1 >= GT && LA16_1 <= GTEQ)||(LA16_1 >= LT && LA16_1 <= LTEQ)||(LA16_1 >= MINUS && LA16_1 <= MULT)||LA16_1==NE||LA16_1==OR||(LA16_1 >= PLUS && LA16_1 <= POINT)||(LA16_1 >= 78 && LA16_1 <= 79)) ) {
					alt16=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:148:5: BI_FUN ( params )?
					{
					BI_FUN69=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function839); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN69);

					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:148:12: ( params )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==77) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:148:13: params
							{
							pushFollow(FOLLOW_params_in_bi_function842);
							params70=params();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_params.add(params70.getTree());
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
					// 148:22: -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:148:25: ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN69!=null?BI_FUN69.getText():null)), root_1);
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:148:53: ( params )?
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:150:3: BI_FUN '(' ')'
					{
					BI_FUN71=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function864); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN71);

					char_literal72=(Token)match(input,77,FOLLOW_77_in_bi_function866); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal72);

					char_literal73=(Token)match(input,78,FOLLOW_78_in_bi_function868); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal73);

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
					// 150:20: -> ^( BI_FUNCTION[$BI_FUN.text] )
					{
						// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:150:23: ^( BI_FUNCTION[$BI_FUN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN71!=null?BI_FUN71.getText():null)), root_1);
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:153:1: params : '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !;
	public final RPGExprParser.params_return params() throws RecognitionException {
		RPGExprParser.params_return retval = new RPGExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal74=null;
		Token char_literal76=null;
		Token char_literal78=null;
		ParserRuleReturnScope logicalExpression75 =null;
		ParserRuleReturnScope logicalExpression77 =null;

		CommonTree char_literal74_tree=null;
		CommonTree char_literal76_tree=null;
		CommonTree char_literal78_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:154:2: ( '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !)
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:155:3: '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal74=(Token)match(input,77,FOLLOW_77_in_params893); if (state.failed) return retval;
			pushFollow(FOLLOW_logicalExpression_in_params896);
			logicalExpression75=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression75.getTree());

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:155:26: ( ':' ! logicalExpression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==79) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:155:27: ':' ! logicalExpression
					{
					char_literal76=(Token)match(input,79,FOLLOW_79_in_params899); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalExpression_in_params902);
					logicalExpression77=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression77.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			char_literal78=(Token)match(input,78,FOLLOW_78_in_params906); if (state.failed) return retval;
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
	// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:158:1: empty : '(' ')' ;
	public final RPGExprParser.empty_return empty() throws RecognitionException {
		RPGExprParser.empty_return retval = new RPGExprParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal79=null;
		Token char_literal80=null;

		CommonTree char_literal79_tree=null;
		CommonTree char_literal80_tree=null;

		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:159:2: ( '(' ')' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:160:2: '(' ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal79=(Token)match(input,77,FOLLOW_77_in_empty920); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
			adaptor.addChild(root_0, char_literal79_tree);
			}

			char_literal80=(Token)match(input,78,FOLLOW_78_in_empty922); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal80_tree = (CommonTree)adaptor.create(char_literal80);
			adaptor.addChild(root_0, char_literal80_tree);
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


		// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:45: ( ( MULT MULT v2= unaryExpression ) )
		// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:45: ( MULT MULT v2= unaryExpression )
		{
		// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:45: ( MULT MULT v2= unaryExpression )
		// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/rpg/RPGExpr.g:79:47: MULT MULT v2= unaryExpression
		{
		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr304); if (state.failed) return;

		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr306); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred14_RPGExpr310);
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



	public static final BitSet FOLLOW_logicalExpression_in_expression131 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression145 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression148 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression151 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression165 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression168 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression171 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression185 = new BitSet(new long[]{0x0000800000100002L});
	public static final BitSet FOLLOW_set_in_equalityExpression188 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression195 = new BitSet(new long[]{0x0000800000100002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression208 = new BitSet(new long[]{0x0000030006000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression212 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression223 = new BitSet(new long[]{0x0000030006000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression238 = new BitSet(new long[]{0x0010080000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression242 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression249 = new BitSet(new long[]{0x0010080000000002L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression265 = new BitSet(new long[]{0x0000300000040002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression269 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression278 = new BitSet(new long[]{0x0000300000040002L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression294 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_MULT_in_powerExpression304 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_MULT_in_powerExpression306 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression310 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression349 = new BitSet(new long[]{0xA000200E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression361 = new BitSet(new long[]{0xA000200E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression380 = new BitSet(new long[]{0xA000200E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified414 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_POINT_in_qualified423 = new BitSet(new long[]{0xA000200E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_primaryExpression_in_qualified427 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_77_in_primaryExpression460 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_primaryExpression464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_value507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_value519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_value531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filler_in_value581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_value586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bi_function_in_value591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usr_function_in_value596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indicator_in_value603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_indicator617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_indicator619 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_logicalExpression_in_indicator621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_indicator623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNR_in_indicator643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNU_in_indicator666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_indicator698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler733 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler735 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_filler737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler754 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler756 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_HEX_in_filler758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_special780 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_in_special782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_params_in_usr_function801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_empty_in_usr_function821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_params_in_bi_function842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_bi_function866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_bi_function868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_params893 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_logicalExpression_in_params896 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
	public static final BitSet FOLLOW_79_in_params899 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_logicalExpression_in_params902 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
	public static final BitSet FOLLOW_78_in_params906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_empty920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_empty922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr304 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr306 = new BitSet(new long[]{0xA011280E90808900L,0x000000000000200EL});
	public static final BitSet FOLLOW_unaryExpression_in_synpred14_RPGExpr310 = new BitSet(new long[]{0x0000000000000002L});
}
