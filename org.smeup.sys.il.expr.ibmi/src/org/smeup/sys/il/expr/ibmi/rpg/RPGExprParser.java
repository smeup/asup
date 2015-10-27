// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g 2015-10-27 10:50:49

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:98:1: expression : logicalExpression EOF !;
	public final RPGExprParser.expression_return expression() throws RecognitionException {
		RPGExprParser.expression_return retval = new RPGExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:99:2: ( logicalExpression EOF !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:99:5: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression146);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression148); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:102:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final RPGExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		RPGExprParser.logicalExpression_return retval = new RPGExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:103:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:103:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression160);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:103:25: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:103:26: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression163); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression166);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:106:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final RPGExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		RPGExprParser.booleanAndExpression_return retval = new RPGExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:107:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:107:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression180);
			equalityExpression6=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression6.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:107:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:107:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression183); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression186);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:111:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final RPGExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		RPGExprParser.equalityExpression_return retval = new RPGExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:112:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:112:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression200);
			relationalExpression9=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression9.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:112:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:112:26: ( EQ | NE ) ^ relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression210);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:115:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final RPGExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		RPGExprParser.relationalExpression_return retval = new RPGExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope additiveExpression12 =null;
		ParserRuleReturnScope additiveExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:116:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:116:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression223);
			additiveExpression12=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression12.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:116:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:116:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression238);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:120:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final RPGExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		RPGExprParser.additiveExpression_return retval = new RPGExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope multiplicativeExpression15 =null;
		ParserRuleReturnScope multiplicativeExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:121:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:121:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression253);
			multiplicativeExpression15=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression15.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:121:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:121:31: ( PLUS | MINUS ) ^ multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression264);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:124:1: multiplicativeExpression : powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* ;
	public final RPGExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		RPGExprParser.multiplicativeExpression_return retval = new RPGExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope powerExpression18 =null;
		ParserRuleReturnScope powerExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:125:2: ( powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:126:3: powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression280);
			powerExpression18=powerExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression18.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:126:19: ( ( MULT | DIV | MOD ) ^ powerExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||(LA6_0 >= MOD && LA6_0 <= MULT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:126:21: ( MULT | DIV | MOD ) ^ powerExpression
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
					pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression293);
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


	public static class powerExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "powerExpression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:129:1: powerExpression : (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* ;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:2: ( (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:4: (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:4: (v1= unaryExpression -> unaryExpression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:5: v1= unaryExpression
			{
			pushFollow(FOLLOW_unaryExpression_in_powerExpression309);
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
			// 130:24: -> unaryExpression
			{
				adaptor.addChild(root_0, stream_unaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:44: ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:47: MULT MULT v2= unaryExpression
					{
					MULT21=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression319); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT21);

					MULT22=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression321); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT22);

					pushFollow(FOLLOW_unaryExpression_in_powerExpression325);
					v2=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(v2.getTree());
					}

					// AST REWRITE
					// elements: v2, v1
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
					// 130:78: -> ^( POW $v1 $v2)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:81: ^( POW $v1 $v2)
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:133:1: unaryExpression : ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) );
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:134:2: ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:135:4: qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_in_unaryExpression355);
					qualified23=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified23.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:136:8: NOT ^ qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT24=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression364); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT24_tree = (CommonTree)adaptor.create(NOT24);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT24_tree, root_0);
					}

					pushFollow(FOLLOW_qualified_in_unaryExpression367);
					qualified25=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified25.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:137:8: MINUS qualified
					{
					MINUS26=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression376); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS26);

					pushFollow(FOLLOW_qualified_in_unaryExpression378);
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
					// 137:24: -> ^( SIGN_MINUS qualified )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:137:27: ^( SIGN_MINUS qualified )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:138:8: PLUS qualified
					{
					PLUS28=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS28);

					pushFollow(FOLLOW_qualified_in_unaryExpression397);
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
					// 138:24: -> ^( SIGN_PLUS qualified )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:138:27: ^( SIGN_PLUS qualified )
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


	public static class qualified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:141:1: qualified : (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* ;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:142:2: ( (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:3: (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:3: (v= primaryExpression -> primaryExpression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:4: v= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_qualified429);
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
			// 143:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:46: ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==POINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:47: ( POINT vals+= primaryExpression )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:47: ( POINT vals+= primaryExpression )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:48: POINT vals+= primaryExpression
					{
					POINT30=(Token)match(input,POINT,FOLLOW_POINT_in_qualified438); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POINT.add(POINT30);

					pushFollow(FOLLOW_primaryExpression_in_qualified442);
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
					// 143:79: -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:143:82: ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:146:1: primaryExpression : ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value );
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
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:147:2: ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==78) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= ALL && LA10_0 <= ALLX)||LA10_0==BI_FUN||LA10_0==BOOLEAN||LA10_0==DATE||LA10_0==FLOAT||LA10_0==HEX||LA10_0==IN||(LA10_0 >= INNR && LA10_0 <= INTEGER)||LA10_0==MULT||LA10_0==SPECIAL||LA10_0==STRING||(LA10_0 >= TERM && LA10_0 <= TIMESTAMP)) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:147:4: '(' logicalExpression ')'
					{
					char_literal31=(Token)match(input,78,FOLLOW_78_in_primaryExpression475); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal31);

					pushFollow(FOLLOW_logicalExpression_in_primaryExpression477);
					logicalExpression32=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression32.getTree());
					char_literal33=(Token)match(input,79,FOLLOW_79_in_primaryExpression479); if (state.failed) return retval; 
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
					// 147:30: -> ^( BLOCK[$primaryExpression.text] logicalExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:147:33: ^( BLOCK[$primaryExpression.text] logicalExpression )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:149:3: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression496);
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


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:152:1: value : ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | ( SPECIAL -> TERM[$SPECIAL.text] ) | ( IN -> TERM[$IN.text] ) | ( INNR -> TERM[$INNR.text] ) | ( INNU -> TERM[$INNU.text] ) | ( ALL -> TERM[$ALL.text] ) | ( ALLX -> TERM[$ALLX.text] ) | filler | special | bi_function | usr_function | indicator | TERM );
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
		Token SPECIAL43=null;
		Token IN44=null;
		Token INNR45=null;
		Token INNU46=null;
		Token ALL47=null;
		Token ALLX48=null;
		Token TERM54=null;
		ParserRuleReturnScope filler49 =null;
		ParserRuleReturnScope special50 =null;
		ParserRuleReturnScope bi_function51 =null;
		ParserRuleReturnScope usr_function52 =null;
		ParserRuleReturnScope indicator53 =null;

		CommonTree INTEGER35_tree=null;
		CommonTree FLOAT36_tree=null;
		CommonTree DATE37_tree=null;
		CommonTree TIME38_tree=null;
		CommonTree TIMESTAMP39_tree=null;
		CommonTree BOOLEAN40_tree=null;
		CommonTree STRING41_tree=null;
		CommonTree HEX42_tree=null;
		CommonTree SPECIAL43_tree=null;
		CommonTree IN44_tree=null;
		CommonTree INNR45_tree=null;
		CommonTree INNU46_tree=null;
		CommonTree ALL47_tree=null;
		CommonTree ALLX48_tree=null;
		CommonTree TERM54_tree=null;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:153:2: ( INTEGER | FLOAT | DATE -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] ) | TIME -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] ) | TIMESTAMP -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] ) | BOOLEAN | STRING | HEX -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] ) | ( SPECIAL -> TERM[$SPECIAL.text] ) | ( IN -> TERM[$IN.text] ) | ( INNR -> TERM[$INNR.text] ) | ( INNU -> TERM[$INNU.text] ) | ( ALL -> TERM[$ALL.text] ) | ( ALLX -> TERM[$ALLX.text] ) | filler | special | bi_function | usr_function | indicator | TERM )
			int alt11=20;
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
			case SPECIAL:
				{
				alt11=9;
				}
				break;
			case IN:
				{
				alt11=10;
				}
				break;
			case INNR:
				{
				alt11=11;
				}
				break;
			case INNU:
				{
				alt11=12;
				}
				break;
			case ALL:
				{
				alt11=13;
				}
				break;
			case ALLX:
				{
				alt11=14;
				}
				break;
			case MULT:
				{
				switch ( input.LA(2) ) {
				case ALL:
				case ALLX:
					{
					alt11=15;
					}
					break;
				case SPECIAL:
					{
					alt11=16;
					}
					break;
				case IN:
				case INNR:
				case INNU:
					{
					alt11=19;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BI_FUN:
				{
				alt11=17;
				}
				break;
			case TERM:
				{
				int LA11_17 = input.LA(2);
				if ( (LA11_17==78) ) {
					alt11=18;
				}
				else if ( (LA11_17==EOF||LA11_17==AND||LA11_17==DIV||LA11_17==EQ||(LA11_17 >= GT && LA11_17 <= GTEQ)||(LA11_17 >= LT && LA11_17 <= LTEQ)||(LA11_17 >= MINUS && LA11_17 <= MULT)||LA11_17==NE||LA11_17==OR||(LA11_17 >= PLUS && LA11_17 <= POINT)||(LA11_17 >= 79 && LA11_17 <= 80)) ) {
					alt11=20;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 17, input);
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
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:154:3: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER35_tree = (CommonTree)adaptor.create(INTEGER35);
					adaptor.addChild(root_0, INTEGER35_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:155:4: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT36=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value516); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT36_tree = (CommonTree)adaptor.create(FLOAT36);
					adaptor.addChild(root_0, FLOAT36_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:156:5: DATE
					{
					DATE37=(Token)match(input,DATE,FOLLOW_DATE_in_value522); if (state.failed) return retval; 
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
					// 156:10: -> ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:156:13: ^( DATE[$DATE.text.substring(2, $DATE.text.length() -1 )] )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:157:4: TIME
					{
					TIME38=(Token)match(input,TIME,FOLLOW_TIME_in_value534); if (state.failed) return retval; 
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
					// 157:9: -> ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:157:12: ^( TIME[$TIME.text.substring(2, $TIME.text.length() -1 )] )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:158:4: TIMESTAMP
					{
					TIMESTAMP39=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_value546); if (state.failed) return retval; 
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
					// 158:14: -> ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:158:17: ^( TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )] )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:159:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN40=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value558); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN40_tree = (CommonTree)adaptor.create(BOOLEAN40);
					adaptor.addChild(root_0, BOOLEAN40_tree);
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:160:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING41=(Token)match(input,STRING,FOLLOW_STRING_in_value563); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING41_tree = (CommonTree)adaptor.create(STRING41);
					adaptor.addChild(root_0, STRING41_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:161:4: HEX
					{
					HEX42=(Token)match(input,HEX,FOLLOW_HEX_in_value568); if (state.failed) return retval; 
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
					// 161:8: -> ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:161:11: ^( HEX[$HEX.text.substring(2, $HEX.text.length() -1 )] )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:4: ( SPECIAL -> TERM[$SPECIAL.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:4: ( SPECIAL -> TERM[$SPECIAL.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:162:5: SPECIAL
					{
					SPECIAL43=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value581); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL43);

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
					// 162:13: -> TERM[$SPECIAL.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (SPECIAL43!=null?SPECIAL43.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:163:4: ( IN -> TERM[$IN.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:163:4: ( IN -> TERM[$IN.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:163:5: IN
					{
					IN44=(Token)match(input,IN,FOLLOW_IN_in_value593); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN44);

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
					// 163:8: -> TERM[$IN.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (IN44!=null?IN44.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:164:4: ( INNR -> TERM[$INNR.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:164:4: ( INNR -> TERM[$INNR.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:164:5: INNR
					{
					INNR45=(Token)match(input,INNR,FOLLOW_INNR_in_value605); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR45);

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
					// 164:10: -> TERM[$INNR.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (INNR45!=null?INNR45.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:165:4: ( INNU -> TERM[$INNU.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:165:4: ( INNU -> TERM[$INNU.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:165:5: INNU
					{
					INNU46=(Token)match(input,INNU,FOLLOW_INNU_in_value617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU46);

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
					// 165:10: -> TERM[$INNU.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (INNU46!=null?INNU46.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:4: ( ALL -> TERM[$ALL.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:4: ( ALL -> TERM[$ALL.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:166:5: ALL
					{
					ALL47=(Token)match(input,ALL,FOLLOW_ALL_in_value629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL47);

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
					// 166:9: -> TERM[$ALL.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (ALL47!=null?ALL47.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:4: ( ALLX -> TERM[$ALLX.text] )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:4: ( ALLX -> TERM[$ALLX.text] )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:167:5: ALLX
					{
					ALLX48=(Token)match(input,ALLX,FOLLOW_ALLX_in_value641); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALLX.add(ALLX48);

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
					// 167:10: -> TERM[$ALLX.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, (ALLX48!=null?ALLX48.getText():null)));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:168:4: filler
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filler_in_value652);
					filler49=filler();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, filler49.getTree());

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:169:4: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_value657);
					special50=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special50.getTree());

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:170:4: bi_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bi_function_in_value662);
					bi_function51=bi_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_function51.getTree());

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:171:4: usr_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_usr_function_in_value667);
					usr_function52=usr_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, usr_function52.getTree());

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:172:7: indicator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_indicator_in_value675);
					indicator53=indicator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indicator53.getTree());

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:173:4: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM54=(Token)match(input,TERM,FOLLOW_TERM_in_value680); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TERM54_tree = (CommonTree)adaptor.create(TERM54);
					adaptor.addChild(root_0, TERM54_tree);
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:177:1: indicator : ( MULT IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | MULT INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] ) | MULT INNU -> ^( INDICATOR[\"*\" + $INNU.text] ) | MULT IN -> ^( INDICATOR[\"*\" + $IN.text] ) );
	public final RPGExprParser.indicator_return indicator() throws RecognitionException {
		RPGExprParser.indicator_return retval = new RPGExprParser.indicator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT55=null;
		Token IN56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token MULT60=null;
		Token INNR61=null;
		Token MULT62=null;
		Token INNU63=null;
		Token MULT64=null;
		Token IN65=null;
		ParserRuleReturnScope logicalExpression58 =null;

		CommonTree MULT55_tree=null;
		CommonTree IN56_tree=null;
		CommonTree char_literal57_tree=null;
		CommonTree char_literal59_tree=null;
		CommonTree MULT60_tree=null;
		CommonTree INNR61_tree=null;
		CommonTree MULT62_tree=null;
		CommonTree INNU63_tree=null;
		CommonTree MULT64_tree=null;
		CommonTree IN65_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_INNR=new RewriteRuleTokenStream(adaptor,"token INNR");
		RewriteRuleTokenStream stream_INNU=new RewriteRuleTokenStream(adaptor,"token INNU");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:178:2: ( MULT IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | MULT INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] ) | MULT INNU -> ^( INDICATOR[\"*\" + $INNU.text] ) | MULT IN -> ^( INDICATOR[\"*\" + $IN.text] ) )
			int alt12=4;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==MULT) ) {
				switch ( input.LA(2) ) {
				case IN:
					{
					int LA12_2 = input.LA(3);
					if ( (LA12_2==78) ) {
						alt12=1;
					}
					else if ( (LA12_2==EOF||LA12_2==AND||LA12_2==DIV||LA12_2==EQ||(LA12_2 >= GT && LA12_2 <= GTEQ)||(LA12_2 >= LT && LA12_2 <= LTEQ)||(LA12_2 >= MINUS && LA12_2 <= MULT)||LA12_2==NE||LA12_2==OR||(LA12_2 >= PLUS && LA12_2 <= POINT)||(LA12_2 >= 79 && LA12_2 <= 80)) ) {
						alt12=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
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

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:179:3: MULT IN '(' logicalExpression ')'
					{
					MULT55=(Token)match(input,MULT,FOLLOW_MULT_in_indicator695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT55);

					IN56=(Token)match(input,IN,FOLLOW_IN_in_indicator697); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN56);

					char_literal57=(Token)match(input,78,FOLLOW_78_in_indicator699); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal57);

					pushFollow(FOLLOW_logicalExpression_in_indicator701);
					logicalExpression58=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression58.getTree());
					char_literal59=(Token)match(input,79,FOLLOW_79_in_indicator703); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal59);

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
					// 179:37: -> ^( BI_FUNCTION[\"*IN\"] logicalExpression )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:179:40: ^( BI_FUNCTION[\"*IN\"] logicalExpression )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:181:3: MULT INNR
					{
					MULT60=(Token)match(input,MULT,FOLLOW_MULT_in_indicator723); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT60);

					INNR61=(Token)match(input,INNR,FOLLOW_INNR_in_indicator725); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR61);

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
					// 181:13: -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:181:16: ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(2)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INTEGER, (INNR61!=null?INNR61.getText():null).substring(2)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:183:3: MULT INNU
					{
					MULT62=(Token)match(input,MULT,FOLLOW_MULT_in_indicator744); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT62);

					INNU63=(Token)match(input,INNU,FOLLOW_INNU_in_indicator746); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU63);

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
					// 183:13: -> ^( INDICATOR[\"*\" + $INNU.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:183:16: ^( INDICATOR[\"*\" + $INNU.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, "*" + (INNU63!=null?INNU63.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:185:3: MULT IN
					{
					MULT64=(Token)match(input,MULT,FOLLOW_MULT_in_indicator774); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT64);

					IN65=(Token)match(input,IN,FOLLOW_IN_in_indicator776); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN65);

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
					// 185:11: -> ^( INDICATOR[\"*\" + $IN.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:185:14: ^( INDICATOR[\"*\" + $IN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, "*" + (IN65!=null?IN65.getText():null)), root_1);
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:188:1: filler : ( MULT ALL -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] ) | MULT ALLX -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] ) );
	public final RPGExprParser.filler_return filler() throws RecognitionException {
		RPGExprParser.filler_return retval = new RPGExprParser.filler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT66=null;
		Token ALL67=null;
		Token MULT68=null;
		Token ALLX69=null;

		CommonTree MULT66_tree=null;
		CommonTree ALL67_tree=null;
		CommonTree MULT68_tree=null;
		CommonTree ALLX69_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_ALLX=new RewriteRuleTokenStream(adaptor,"token ALLX");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:188:8: ( MULT ALL -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] ) | MULT ALLX -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==MULT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==ALL) ) {
					alt13=1;
				}
				else if ( (LA13_1==ALLX) ) {
					alt13=2;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:189:3: MULT ALL
					{
					MULT66=(Token)match(input,MULT,FOLLOW_MULT_in_filler806); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT66);

					ALL67=(Token)match(input,ALL,FOLLOW_ALL_in_filler808); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL67);

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
					// 189:13: -> ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:189:16: ^( BI_FUNCTION[\"*ALL\"] STRING[$ALL.text.substring(4, $ALL.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING, (ALL67!=null?ALL67.getText():null).substring(4, (ALL67!=null?ALL67.getText():null).length()-1)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:191:3: MULT ALLX
					{
					MULT68=(Token)match(input,MULT,FOLLOW_MULT_in_filler830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT68);

					ALLX69=(Token)match(input,ALLX,FOLLOW_ALLX_in_filler832); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALLX.add(ALLX69);

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
					// 191:13: -> ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:191:16: ^( BI_FUNCTION[\"*ALL\"] HEX[$ALLX.text.substring(5, $ALLX.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(HEX, (ALLX69!=null?ALLX69.getText():null).substring(5, (ALLX69!=null?ALLX69.getText():null).length()-1)));
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:194:1: special : MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] ;
	public final RPGExprParser.special_return special() throws RecognitionException {
		RPGExprParser.special_return retval = new RPGExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT70=null;
		Token SPECIAL71=null;

		CommonTree MULT70_tree=null;
		CommonTree SPECIAL71_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:194:9: ( MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:195:3: MULT SPECIAL
			{
			MULT70=(Token)match(input,MULT,FOLLOW_MULT_in_special859); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MULT.add(MULT70);

			SPECIAL71=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special861); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL71);

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
			// 195:16: -> SP_VALUE[$MULT.text + $SPECIAL.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(SP_VALUE, (MULT70!=null?MULT70.getText():null) + (SPECIAL71!=null?SPECIAL71.getText():null)));
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


	public static class usr_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "usr_function"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:199:1: usr_function : ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) );
	public final RPGExprParser.usr_function_return usr_function() throws RecognitionException {
		RPGExprParser.usr_function_return retval = new RPGExprParser.usr_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TERM72=null;
		Token TERM74=null;
		ParserRuleReturnScope params73 =null;
		ParserRuleReturnScope empty75 =null;

		CommonTree TERM72_tree=null;
		CommonTree TERM74_tree=null;
		RewriteRuleTokenStream stream_TERM=new RewriteRuleTokenStream(adaptor,"token TERM");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
		RewriteRuleSubtreeStream stream_empty=new RewriteRuleSubtreeStream(adaptor,"rule empty");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:200:2: ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TERM) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==78) ) {
					int LA14_2 = input.LA(3);
					if ( (LA14_2==79) ) {
						alt14=2;
					}
					else if ( ((LA14_2 >= ALL && LA14_2 <= ALLX)||LA14_2==BI_FUN||LA14_2==BOOLEAN||LA14_2==DATE||LA14_2==FLOAT||LA14_2==HEX||LA14_2==IN||(LA14_2 >= INNR && LA14_2 <= INTEGER)||LA14_2==MINUS||LA14_2==MULT||LA14_2==NOT||LA14_2==PLUS||LA14_2==SPECIAL||LA14_2==STRING||(LA14_2 >= TERM && LA14_2 <= TIMESTAMP)||LA14_2==78) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:200:4: TERM params
					{
					TERM72=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function878); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM72);

					pushFollow(FOLLOW_params_in_usr_function880);
					params73=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params73.getTree());
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
					// 200:17: -> ^( USER_FUNCTION[$TERM.text] params )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:200:20: ^( USER_FUNCTION[$TERM.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM72!=null?TERM72.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:202:3: TERM empty
					{
					TERM74=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function898); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM74);

					pushFollow(FOLLOW_empty_in_usr_function900);
					empty75=empty();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_empty.add(empty75.getTree());
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
					// 202:14: -> ^( USER_FUNCTION[$TERM.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:202:17: ^( USER_FUNCTION[$TERM.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM74!=null?TERM74.getText():null)), root_1);
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:204:1: bi_function : ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) );
	public final RPGExprParser.bi_function_return bi_function() throws RecognitionException {
		RPGExprParser.bi_function_return retval = new RPGExprParser.bi_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BI_FUN76=null;
		Token BI_FUN78=null;
		Token char_literal79=null;
		Token char_literal80=null;
		ParserRuleReturnScope params77 =null;

		CommonTree BI_FUN76_tree=null;
		CommonTree BI_FUN78_tree=null;
		CommonTree char_literal79_tree=null;
		CommonTree char_literal80_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_BI_FUN=new RewriteRuleTokenStream(adaptor,"token BI_FUN");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:2: ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BI_FUN) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==78) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==79) ) {
						alt16=2;
					}
					else if ( ((LA16_2 >= ALL && LA16_2 <= ALLX)||LA16_2==BI_FUN||LA16_2==BOOLEAN||LA16_2==DATE||LA16_2==FLOAT||LA16_2==HEX||LA16_2==IN||(LA16_2 >= INNR && LA16_2 <= INTEGER)||LA16_2==MINUS||LA16_2==MULT||LA16_2==NOT||LA16_2==PLUS||LA16_2==SPECIAL||LA16_2==STRING||(LA16_2 >= TERM && LA16_2 <= TIMESTAMP)||LA16_2==78) ) {
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
				else if ( (LA16_1==EOF||LA16_1==AND||LA16_1==DIV||LA16_1==EQ||(LA16_1 >= GT && LA16_1 <= GTEQ)||(LA16_1 >= LT && LA16_1 <= LTEQ)||(LA16_1 >= MINUS && LA16_1 <= MULT)||LA16_1==NE||LA16_1==OR||(LA16_1 >= PLUS && LA16_1 <= POINT)||(LA16_1 >= 79 && LA16_1 <= 80)) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:5: BI_FUN ( params )?
					{
					BI_FUN76=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function918); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN76);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:12: ( params )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==78) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:13: params
							{
							pushFollow(FOLLOW_params_in_bi_function921);
							params77=params();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_params.add(params77.getTree());
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
					// 205:22: -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:25: ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN76!=null?BI_FUN76.getText():null)), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:205:53: ( params )?
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:207:3: BI_FUN '(' ')'
					{
					BI_FUN78=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function943); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN78);

					char_literal79=(Token)match(input,78,FOLLOW_78_in_bi_function945); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal79);

					char_literal80=(Token)match(input,79,FOLLOW_79_in_bi_function947); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal80);

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
					// 207:20: -> ^( BI_FUNCTION[$BI_FUN.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:207:23: ^( BI_FUNCTION[$BI_FUN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN78!=null?BI_FUN78.getText():null)), root_1);
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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:210:1: params : '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !;
	public final RPGExprParser.params_return params() throws RecognitionException {
		RPGExprParser.params_return retval = new RPGExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal81=null;
		Token char_literal83=null;
		Token char_literal85=null;
		ParserRuleReturnScope logicalExpression82 =null;
		ParserRuleReturnScope logicalExpression84 =null;

		CommonTree char_literal81_tree=null;
		CommonTree char_literal83_tree=null;
		CommonTree char_literal85_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:211:2: ( '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:212:3: '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal81=(Token)match(input,78,FOLLOW_78_in_params972); if (state.failed) return retval;
			pushFollow(FOLLOW_logicalExpression_in_params975);
			logicalExpression82=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression82.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:212:26: ( ':' ! logicalExpression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==80) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:212:27: ':' ! logicalExpression
					{
					char_literal83=(Token)match(input,80,FOLLOW_80_in_params978); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalExpression_in_params981);
					logicalExpression84=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression84.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			char_literal85=(Token)match(input,79,FOLLOW_79_in_params985); if (state.failed) return retval;
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


	public static class empty_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "empty"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:215:1: empty : '(' ')' ;
	public final RPGExprParser.empty_return empty() throws RecognitionException {
		RPGExprParser.empty_return retval = new RPGExprParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal86=null;
		Token char_literal87=null;

		CommonTree char_literal86_tree=null;
		CommonTree char_literal87_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:2: ( '(' ')' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:217:2: '(' ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal86=(Token)match(input,78,FOLLOW_78_in_empty999); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal86_tree = (CommonTree)adaptor.create(char_literal86);
			adaptor.addChild(root_0, char_literal86_tree);
			}

			char_literal87=(Token)match(input,79,FOLLOW_79_in_empty1001); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);
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
	// $ANTLR end "empty"

	// $ANTLR start synpred14_RPGExpr
	public final void synpred14_RPGExpr_fragment() throws RecognitionException {
		ParserRuleReturnScope v2 =null;


		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:45: ( ( MULT MULT v2= unaryExpression ) )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
		{
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:130:47: MULT MULT v2= unaryExpression
		{
		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr319); if (state.failed) return;

		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr321); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred14_RPGExpr325);
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



	public static final BitSet FOLLOW_logicalExpression_in_expression146 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression160 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression163 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression166 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression180 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression183 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression186 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression200 = new BitSet(new long[]{0x0001000000200002L});
	public static final BitSet FOLLOW_set_in_equalityExpression203 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression210 = new BitSet(new long[]{0x0001000000200002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression223 = new BitSet(new long[]{0x000006000C000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression227 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression238 = new BitSet(new long[]{0x000006000C000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression253 = new BitSet(new long[]{0x0020100000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression257 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression264 = new BitSet(new long[]{0x0020100000000002L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression280 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression284 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression293 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression309 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_MULT_in_powerExpression319 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_MULT_in_powerExpression321 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression325 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression364 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression376 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression395 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_qualified_in_unaryExpression397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified429 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_POINT_in_qualified438 = new BitSet(new long[]{0x4000401D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_primaryExpression_in_qualified442 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_78_in_primaryExpression475 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_primaryExpression479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_value522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_value534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_value546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_value593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNR_in_value605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNU_in_value617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_value629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLX_in_value641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filler_in_value652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_value657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bi_function_in_value662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usr_function_in_value667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indicator_in_value675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator695 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_indicator697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_indicator699 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_indicator701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_indicator703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator723 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_INNR_in_indicator725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator744 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INNU_in_indicator746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_indicator774 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_indicator776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler806 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler830 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALLX_in_filler832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_special859 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_in_special861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_params_in_usr_function880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_empty_in_usr_function900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_params_in_bi_function921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_bi_function945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_bi_function947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_params972 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_params975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
	public static final BitSet FOLLOW_80_in_params978 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_logicalExpression_in_params981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
	public static final BitSet FOLLOW_79_in_params985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_empty999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_empty1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr319 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr321 = new BitSet(new long[]{0x4022501D21011260L,0x000000000000401DL});
	public static final BitSet FOLLOW_unaryExpression_in_synpred14_RPGExpr325 = new BitSet(new long[]{0x0000000000000002L});
}
