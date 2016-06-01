// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g 2016-05-31 13:15:37

  package org.smeup.sys.il.expr.ibmi.cl;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CLExprLexer extends Lexer {
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
	public static final int MULT_TERM=38;
	public static final int N=39;
	public static final int NE=40;
	public static final int NG=41;
	public static final int NL=42;
	public static final int NOT=43;
	public static final int O=44;
	public static final int OPEN_BRACE=45;
	public static final int OR=46;
	public static final int P=47;
	public static final int PLUS=48;
	public static final int Q=49;
	public static final int R=50;
	public static final int S=51;
	public static final int SIGN_MINUS=52;
	public static final int SIGN_PLUS=53;
	public static final int SST_FUN=54;
	public static final int STRING=55;
	public static final int SWITCH_FUN=56;
	public static final int SWITCH_VALUE=57;
	public static final int T=58;
	public static final int TCAT=59;
	public static final int TERM=60;
	public static final int U=61;
	public static final int V=62;
	public static final int VAR=63;
	public static final int W=64;
	public static final int WS=65;
	public static final int X=66;
	public static final int Y=67;
	public static final int Z=68;


		@Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

	    @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String msg = "Lexer error. Input: " + e.input.toString();
	        msg += " " + getErrorHeader(e);
	        msg += " Msg: " + getErrorMessage(e, tokenNames);
	        throw new IntegratedLanguageExpressionRuntimeException(msg , e);
	    }	

	   @Override
	  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    	throw e;
	    }



	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CLExprLexer() {} 
	public CLExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g"; }

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:198:5: ( '&' TERM )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:199:2: '&' TERM
			{
			match('&'); 
			mTERM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:203:2: ( ( T R U E ) | ( F A L S E ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='T'||LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='F'||LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:203:4: ( T R U E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:203:4: ( T R U E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:203:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:204:4: ( F A L S E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:204:4: ( F A L S E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:204:5: F A L S E
					{
					mF(); 

					mA(); 

					mL(); 

					mS(); 

					mE(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:208:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:208:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:210:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\'') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='\'') ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:210:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:211:4: c=~ ( '\\'' | '\\r' | '\\n' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c);
					}
					break;

				default :
					break loop2;
				}
			}

			match('\''); 
			 setText(b.toString()); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:217:5: ( '!' | ( '*' O R ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='!') ) {
				alt3=1;
			}
			else if ( (LA3_0=='*') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:217:8: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:217:14: ( '*' O R )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:217:14: ( '*' O R )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:217:15: '*' O R
					{
					match('*'); 
					mO(); 

					mR(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:218:6: ( '&' | ( '*' A N D ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='&') ) {
				alt4=1;
			}
			else if ( (LA4_0=='*') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:218:9: '&'
					{
					match('&'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:218:15: ( '*' A N D )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:218:15: ( '*' A N D )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:218:16: '*' A N D
					{
					match('*'); 
					mA(); 

					mN(); 

					mD(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:219:5: ( ( '*' N O T ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:219:7: ( '*' N O T )
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:219:7: ( '*' N O T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:219:8: '*' N O T
			{
			match('*'); 
			mN(); 

			mO(); 

			mT(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:220:4: ( '=' | ( '*' E Q ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='=') ) {
				alt5=1;
			}
			else if ( (LA5_0=='*') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:220:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:220:13: ( '*' E Q )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:220:13: ( '*' E Q )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:220:14: '*' E Q
					{
					match('*'); 
					mE(); 

					mQ(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:221:4: ( '>' | ( '*' G T ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='>') ) {
				alt6=1;
			}
			else if ( (LA6_0=='*') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:221:6: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:221:12: ( '*' G T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:221:12: ( '*' G T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:221:13: '*' G T
					{
					match('*'); 
					mG(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:222:4: ( '<' | ( '*' L T ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='<') ) {
				alt7=1;
			}
			else if ( (LA7_0=='*') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:222:8: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:222:14: ( '*' L T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:222:14: ( '*' L T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:222:15: '*' L T
					{
					match('*'); 
					mL(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:223:6: ( '*' G E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:223:8: '*' G E
			{
			match('*'); 
			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:224:6: ( '*' L E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:224:8: '*' L E
			{
			match('*'); 
			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:225:8: ( '^=' | '*' N E )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='^') ) {
				alt8=1;
			}
			else if ( (LA8_0=='*') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:225:11: '^='
					{
					match("^="); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:225:18: '*' N E
					{
					match('*'); 
					mN(); 

					mE(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "NG"
	public final void mNG() throws RecognitionException {
		try {
			int _type = NG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:226:9: ( '^>' | '*' N G )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='^') ) {
				alt9=1;
			}
			else if ( (LA9_0=='*') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:226:12: '^>'
					{
					match("^>"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:226:19: '*' N G
					{
					match('*'); 
					mN(); 

					mG(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NG"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:227:9: ( '^<' | '*' N L )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='^') ) {
				alt10=1;
			}
			else if ( (LA10_0=='*') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:227:12: '^<'
					{
					match("^<"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:227:19: '*' N L
					{
					match('*'); 
					mN(); 

					mL(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:229:6: ( '+' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:229:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:230:7: ( '-' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:230:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:231:6: ( '*' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:231:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:232:5: ( '/' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:232:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "CAT"
	public final void mCAT() throws RecognitionException {
		try {
			int _type = CAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:234:9: ( '!!' | ( '*' C A T ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='!') ) {
				alt11=1;
			}
			else if ( (LA11_0=='*') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:234:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:234:18: ( '*' C A T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:234:18: ( '*' C A T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:234:19: '*' C A T
					{
					match('*'); 
					mC(); 

					mA(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAT"

	// $ANTLR start "BCAT"
	public final void mBCAT() throws RecognitionException {
		try {
			int _type = BCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:235:9: ( '!>' | ( '*' B C A T ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='!') ) {
				alt12=1;
			}
			else if ( (LA12_0=='*') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:235:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:235:18: ( '*' B C A T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:235:18: ( '*' B C A T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:235:19: '*' B C A T
					{
					match('*'); 
					mB(); 

					mC(); 

					mA(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BCAT"

	// $ANTLR start "TCAT"
	public final void mTCAT() throws RecognitionException {
		try {
			int _type = TCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:236:9: ( '!<' | ( '*' T C A T ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='!') ) {
				alt13=1;
			}
			else if ( (LA13_0=='*') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:236:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:236:18: ( '*' T C A T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:236:18: ( '*' T C A T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:236:19: '*' T C A T
					{
					match('*'); 
					mT(); 

					mC(); 

					mA(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TCAT"

	// $ANTLR start "SWITCH_VALUE"
	public final void mSWITCH_VALUE() throws RecognitionException {
		try {
			int _type = SWITCH_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:239:2: ( ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:240:2: ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_VALUE"

	// $ANTLR start "TERM"
	public final void mTERM() throws RecognitionException {
		try {
			int _type = TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:244:6: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:244:8: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:244:15: ( LETTER | DIGIT )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\"'||LA14_0=='$'||(LA14_0 >= '+' && LA14_0 <= '9')||LA14_0=='?'||(LA14_0 >= 'A' && LA14_0 <= 'Z')||LA14_0=='_'||(LA14_0 >= 'a' && LA14_0 <= 'z')||LA14_0=='\u00A3'||LA14_0=='\u00A7'||LA14_0=='\u00E0'||(LA14_0 >= '\u00E8' && LA14_0 <= '\u00E9')||LA14_0=='\u00EC'||LA14_0=='\u00F2'||LA14_0=='\u00F9') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
					{
					if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERM"

	// $ANTLR start "DATA_AREA"
	public final void mDATA_AREA() throws RecognitionException {
		try {
			int _type = DATA_AREA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:247:2: ( MULT L D A | MULT G D A | MULT P D A )
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='*') ) {
				switch ( input.LA(2) ) {
				case 'L':
				case 'l':
					{
					alt15=1;
					}
					break;
				case 'G':
				case 'g':
					{
					alt15=2;
					}
					break;
				case 'P':
				case 'p':
					{
					alt15=3;
					}
					break;
				default:
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
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:248:2: MULT L D A
					{
					mMULT(); 

					mL(); 

					mD(); 

					mA(); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:250:2: MULT G D A
					{
					mMULT(); 

					mG(); 

					mD(); 

					mA(); 

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:252:2: MULT P D A
					{
					mMULT(); 

					mP(); 

					mD(); 

					mA(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATA_AREA"

	// $ANTLR start "MULT_TERM"
	public final void mMULT_TERM() throws RecognitionException {
		try {
			int _type = MULT_TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:257:2: ( MULT LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:258:2: MULT LETTER ( LETTER | DIGIT )*
			{
			mMULT(); 

			mLETTER(); 

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:258:14: ( LETTER | DIGIT )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\"'||LA16_0=='$'||(LA16_0 >= '+' && LA16_0 <= '9')||LA16_0=='?'||(LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')||LA16_0=='\u00A3'||LA16_0=='\u00A7'||LA16_0=='\u00E0'||(LA16_0 >= '\u00E8' && LA16_0 <= '\u00E9')||LA16_0=='\u00EC'||LA16_0=='\u00F2'||LA16_0=='\u00F9') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
					{
					if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT_TERM"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:261:9: ( ( DIGIT )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:262:2: ( DIGIT )+
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:262:2: ( DIGIT )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:266:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:266:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:266:4: ( '0' .. '9' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			}

			mDIGIT_SPECIAL(); 

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:266:30: ( '0' .. '9' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:270:2: ( '(' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:271:2: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_BRACE"

	// $ANTLR start "CLOSE_BRACE"
	public final void mCLOSE_BRACE() throws RecognitionException {
		try {
			int _type = CLOSE_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:275:2: ( ')' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:276:2: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_BRACE"

	// $ANTLR start "BINARY_FUN"
	public final void mBINARY_FUN() throws RecognitionException {
		try {
			int _type = BINARY_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:280:2: ( '%' B I N A R Y )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:281:2: '%' B I N A R Y
			{
			match('%'); 
			mB(); 

			mI(); 

			mN(); 

			mA(); 

			mR(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINARY_FUN"

	// $ANTLR start "SST_FUN"
	public final void mSST_FUN() throws RecognitionException {
		try {
			int _type = SST_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:285:2: ( '%' S S T | '%' S U B S T R I N G )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='%') ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1=='S'||LA20_1=='s') ) {
					int LA20_2 = input.LA(3);
					if ( (LA20_2=='S'||LA20_2=='s') ) {
						alt20=1;
					}
					else if ( (LA20_2=='U'||LA20_2=='u') ) {
						alt20=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:286:2: '%' S S T
					{
					match('%'); 
					mS(); 

					mS(); 

					mT(); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:288:2: '%' S U B S T R I N G
					{
					match('%'); 
					mS(); 

					mU(); 

					mB(); 

					mS(); 

					mT(); 

					mR(); 

					mI(); 

					mN(); 

					mG(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SST_FUN"

	// $ANTLR start "SWITCH_FUN"
	public final void mSWITCH_FUN() throws RecognitionException {
		try {
			int _type = SWITCH_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:292:2: ( '%' S W I T C H )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:293:2: '%' S W I T C H
			{
			match('%'); 
			mS(); 

			mW(); 

			mI(); 

			mT(); 

			mC(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_FUN"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:298:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:303:3: ( ( '\\u00A7' | '_' | '.' | '/' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '\\u00a3' | '?' | '+' | '-' | ',' | '$' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||input.LA(1)=='?'||input.LA(1)=='_'||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_SPECIAL"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:326:3: ( ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "DIGIT_SPECIAL"
	public final void mDIGIT_SPECIAL() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:331:3: ( ( ',' | '.' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)==','||input.LA(1)=='.' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT_SPECIAL"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:334:11: ( ( 'a' | 'A' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:335:11: ( ( 'b' | 'B' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:336:11: ( ( 'c' | 'C' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:337:11: ( ( 'd' | 'D' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:338:11: ( ( 'e' | 'E' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:339:11: ( ( 'f' | 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:340:11: ( ( 'g' | 'G' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:341:11: ( ( 'h' | 'H' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:342:11: ( ( 'i' | 'I' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:343:11: ( ( 'j' | 'J' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:344:11: ( ( 'k' | 'K' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:345:11: ( ( 'l' | 'L' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:346:11: ( ( 'm' | 'M' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:347:11: ( ( 'n' | 'N' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:348:11: ( ( 'o' | 'O' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:349:11: ( ( 'p' | 'P' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:350:11: ( ( 'q' | 'Q' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:351:11: ( ( 'r' | 'R' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:352:11: ( ( 's' | 'S' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:353:11: ( ( 't' | 'T' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:354:11: ( ( 'u' | 'U' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:355:11: ( ( 'v' | 'V' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:356:11: ( ( 'w' | 'W' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:357:11: ( ( 'x' | 'X' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:358:11: ( ( 'y' | 'Y' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:359:11: ( ( 'z' | 'Z' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:363:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:363:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:8: ( VAR | BOOLEAN | STRING | OR | AND | NOT | EQ | GT | LT | GTEQ | LTEQ | NE | NG | NL | PLUS | MINUS | MULT | DIV | CAT | BCAT | TCAT | SWITCH_VALUE | TERM | DATA_AREA | MULT_TERM | INTEGER | FLOAT | OPEN_BRACE | CLOSE_BRACE | BINARY_FUN | SST_FUN | SWITCH_FUN | WS )
		int alt21=33;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:10: VAR
				{
				mVAR(); 

				}
				break;
			case 2 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:14: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 3 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:22: STRING
				{
				mSTRING(); 

				}
				break;
			case 4 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:29: OR
				{
				mOR(); 

				}
				break;
			case 5 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:32: AND
				{
				mAND(); 

				}
				break;
			case 6 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:36: NOT
				{
				mNOT(); 

				}
				break;
			case 7 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:40: EQ
				{
				mEQ(); 

				}
				break;
			case 8 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:43: GT
				{
				mGT(); 

				}
				break;
			case 9 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:46: LT
				{
				mLT(); 

				}
				break;
			case 10 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:49: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 11 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:54: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:59: NE
				{
				mNE(); 

				}
				break;
			case 13 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:62: NG
				{
				mNG(); 

				}
				break;
			case 14 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:65: NL
				{
				mNL(); 

				}
				break;
			case 15 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:68: PLUS
				{
				mPLUS(); 

				}
				break;
			case 16 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:73: MINUS
				{
				mMINUS(); 

				}
				break;
			case 17 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:79: MULT
				{
				mMULT(); 

				}
				break;
			case 18 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:84: DIV
				{
				mDIV(); 

				}
				break;
			case 19 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:88: CAT
				{
				mCAT(); 

				}
				break;
			case 20 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:92: BCAT
				{
				mBCAT(); 

				}
				break;
			case 21 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:97: TCAT
				{
				mTCAT(); 

				}
				break;
			case 22 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:102: SWITCH_VALUE
				{
				mSWITCH_VALUE(); 

				}
				break;
			case 23 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:115: TERM
				{
				mTERM(); 

				}
				break;
			case 24 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:120: DATA_AREA
				{
				mDATA_AREA(); 

				}
				break;
			case 25 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:130: MULT_TERM
				{
				mMULT_TERM(); 

				}
				break;
			case 26 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:140: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 27 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:148: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 28 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:154: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 29 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:165: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 30 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:177: BINARY_FUN
				{
				mBINARY_FUN(); 

				}
				break;
			case 31 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:188: SST_FUN
				{
				mSST_FUN(); 

				}
				break;
			case 32 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:196: SWITCH_FUN
				{
				mSWITCH_FUN(); 

				}
				break;
			case 33 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\cl\\CLExpr.g:1:207: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA21_eotS =
		"\1\uffff\1\30\2\22\1\uffff\1\36\1\45\4\uffff\1\56\1\57\1\60\1\22\1\63"+
		"\1\22\1\63\7\uffff\2\22\4\uffff\6\52\1\uffff\4\52\7\uffff\1\22\1\63\3"+
		"\uffff\1\22\2\uffff\2\22\1\36\2\52\1\53\1\54\1\55\1\7\1\10\1\124\1\52"+
		"\1\11\1\126\5\52\1\22\1\63\2\uffff\1\136\1\22\1\30\1\140\1\uffff\1\141"+
		"\1\uffff\1\141\1\33\2\52\1\141\1\22\1\63\1\uffff\1\136\2\uffff\1\34\1"+
		"\35\1\22\1\63\1\22\1\63\1\22\1\63\2\64";
	static final String DFA21_eofS =
		"\154\uffff";
	static final String DFA21_minS =
		"\1\11\1\42\1\122\1\101\1\uffff\1\41\1\42\3\uffff\1\74\3\42\1\60\1\54\1"+
		"\60\1\54\3\uffff\1\102\3\uffff\1\125\1\114\4\uffff\1\122\1\116\1\105\1"+
		"\121\2\104\1\uffff\1\101\2\103\1\104\7\uffff\1\60\1\54\3\uffff\1\60\1"+
		"\uffff\1\123\1\105\1\123\1\42\1\104\1\124\6\42\1\101\2\42\1\101\1\124"+
		"\3\101\1\60\1\54\2\uffff\1\42\1\105\2\42\1\uffff\1\42\1\uffff\2\42\2\124"+
		"\1\42\1\60\1\54\1\uffff\1\42\2\uffff\2\42\1\60\1\54\1\60\1\54\1\60\1\54"+
		"\1\42\1\54";
	static final String DFA21_maxS =
		"\2\u00f9\1\162\1\141\1\uffff\1\76\1\u00f9\3\uffff\1\76\3\u00f9\2\170\2"+
		"\71\3\uffff\1\163\3\uffff\1\165\1\154\4\uffff\1\162\1\156\1\157\1\161"+
		"\2\164\1\uffff\1\141\2\143\1\144\7\uffff\2\170\3\uffff\1\71\1\uffff\1"+
		"\167\1\145\1\163\1\u00f9\1\144\1\164\6\u00f9\1\141\2\u00f9\1\141\1\164"+
		"\3\141\2\170\2\uffff\1\u00f9\1\145\2\u00f9\1\uffff\1\u00f9\1\uffff\2\u00f9"+
		"\2\164\1\u00f9\2\170\1\uffff\1\u00f9\2\uffff\2\u00f9\6\170\1\u00f9\1\71";
	static final String DFA21_acceptS =
		"\4\uffff\1\3\2\uffff\1\7\1\10\1\11\10\uffff\1\27\1\34\1\35\1\uffff\1\41"+
		"\1\1\1\5\2\uffff\1\23\1\24\1\25\1\4\6\uffff\1\21\4\uffff\1\31\1\14\1\15"+
		"\1\16\1\17\1\20\1\22\2\uffff\1\32\1\26\1\33\1\uffff\1\36\26\uffff\1\37"+
		"\1\40\4\uffff\1\12\1\uffff\1\13\7\uffff\1\2\1\uffff\1\6\1\30\12\uffff";
	static final String DFA21_specialS =
		"\154\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\26\1\uffff\2\26\22\uffff\1\26\1\5\1\22\1\uffff\1\22\1\25\1\1\1\4\1"+
			"\23\1\24\1\6\1\13\1\20\1\14\1\20\1\15\2\17\10\21\2\uffff\1\11\1\7\1\10"+
			"\1\22\1\uffff\5\22\1\3\15\22\1\2\3\22\1\16\2\22\3\uffff\1\12\1\22\1\uffff"+
			"\5\22\1\3\15\22\1\2\3\22\1\16\2\22\50\uffff\1\22\3\uffff\1\22\70\uffff"+
			"\1\22\7\uffff\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"\1\27\1\uffff\1\27\6\uffff\5\27\17\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff\1\27\7\uffff"+
			"\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\1\31\37\uffff\1\31",
			"\1\32\37\uffff\1\32",
			"",
			"\1\33\32\uffff\1\35\1\uffff\1\34",
			"\1\52\1\uffff\1\52\6\uffff\5\52\17\uffff\1\52\1\uffff\1\40\1\47\1\46"+
			"\1\52\1\42\1\52\1\43\4\52\1\44\1\52\1\41\1\37\1\51\3\52\1\50\6\52\4\uffff"+
			"\1\52\1\uffff\1\40\1\47\1\46\1\52\1\42\1\52\1\43\4\52\1\44\1\52\1\41"+
			"\1\37\1\51\3\52\1\50\6\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7"+
			"\uffff\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"",
			"",
			"",
			"\1\55\1\53\1\54",
			"\1\22\1\uffff\1\22\6\uffff\17\22\5\uffff\1\22\1\uffff\32\22\4\uffff"+
			"\1\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"\1\22\1\uffff\1\22\6\uffff\17\22\5\uffff\1\22\1\uffff\32\22\4\uffff"+
			"\1\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"\1\22\1\uffff\1\22\6\uffff\17\22\5\uffff\1\22\1\uffff\32\22\4\uffff"+
			"\1\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"\2\61\46\uffff\1\61\37\uffff\1\61",
			"\1\65\1\uffff\1\65\1\uffff\2\62\10\21\36\uffff\1\64\37\uffff\1\64",
			"\12\66",
			"\1\65\1\uffff\1\65\1\uffff\12\21",
			"",
			"",
			"",
			"\1\67\20\uffff\1\70\16\uffff\1\67\20\uffff\1\70",
			"",
			"",
			"",
			"\1\71\37\uffff\1\71",
			"\1\72\37\uffff\1\72",
			"",
			"",
			"",
			"",
			"\1\73\37\uffff\1\73",
			"\1\74\37\uffff\1\74",
			"\1\76\1\uffff\1\77\4\uffff\1\100\2\uffff\1\75\25\uffff\1\76\1\uffff"+
			"\1\77\4\uffff\1\100\2\uffff\1\75",
			"\1\101\37\uffff\1\101",
			"\1\104\1\103\16\uffff\1\102\17\uffff\1\104\1\103\16\uffff\1\102",
			"\1\107\1\106\16\uffff\1\105\17\uffff\1\107\1\106\16\uffff\1\105",
			"",
			"\1\110\37\uffff\1\110",
			"\1\111\37\uffff\1\111",
			"\1\112\37\uffff\1\112",
			"\1\113\37\uffff\1\113",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\2\114\46\uffff\1\114\37\uffff\1\114",
			"\1\65\1\uffff\1\65\1\uffff\2\115\10\21\36\uffff\1\64\37\uffff\1\64",
			"",
			"",
			"",
			"\12\66",
			"",
			"\1\116\1\uffff\1\116\1\uffff\1\117\33\uffff\1\116\1\uffff\1\116\1\uffff"+
			"\1\117",
			"\1\120\37\uffff\1\120",
			"\1\121\37\uffff\1\121",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\122\37\uffff\1\122",
			"\1\123\37\uffff\1\123",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\125\37\uffff\1\125",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\127\37\uffff\1\127",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\133\37\uffff\1\133",
			"\2\134\46\uffff\1\134\37\uffff\1\134",
			"\1\65\1\uffff\1\65\1\uffff\2\135\10\21\36\uffff\1\64\37\uffff\1\64",
			"",
			"",
			"\1\22\1\uffff\1\22\6\uffff\17\22\5\uffff\1\22\1\uffff\32\22\4\uffff"+
			"\1\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"\1\137\37\uffff\1\137",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\2\144\46\uffff\1\144\37\uffff\1\144",
			"\1\65\1\uffff\1\65\1\uffff\2\145\10\21\36\uffff\1\64\37\uffff\1\64",
			"",
			"\1\22\1\uffff\1\22\6\uffff\17\22\5\uffff\1\22\1\uffff\32\22\4\uffff"+
			"\1\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"",
			"",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\1\52\1\uffff\1\52\6\uffff\17\52\5\uffff\1\52\1\uffff\32\52\4\uffff"+
			"\1\52\1\uffff\32\52\50\uffff\1\52\3\uffff\1\52\70\uffff\1\52\7\uffff"+
			"\2\52\2\uffff\1\52\5\uffff\1\52\6\uffff\1\52",
			"\2\146\46\uffff\1\146\37\uffff\1\146",
			"\1\65\1\uffff\1\65\1\uffff\2\147\10\21\36\uffff\1\64\37\uffff\1\64",
			"\2\150\46\uffff\1\150\37\uffff\1\150",
			"\1\65\1\uffff\1\65\1\uffff\2\151\10\21\36\uffff\1\64\37\uffff\1\64",
			"\2\152\46\uffff\1\152\37\uffff\1\152",
			"\1\65\1\uffff\1\65\1\uffff\2\153\10\21\36\uffff\1\64\37\uffff\1\64",
			"\1\22\1\uffff\1\22\6\uffff\17\22\5\uffff\1\22\1\uffff\32\22\4\uffff"+
			"\1\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"\1\65\1\uffff\1\65\1\uffff\12\21"
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( VAR | BOOLEAN | STRING | OR | AND | NOT | EQ | GT | LT | GTEQ | LTEQ | NE | NG | NL | PLUS | MINUS | MULT | DIV | CAT | BCAT | TCAT | SWITCH_VALUE | TERM | DATA_AREA | MULT_TERM | INTEGER | FLOAT | OPEN_BRACE | CLOSE_BRACE | BINARY_FUN | SST_FUN | SWITCH_FUN | WS );";
		}
	}

}
