// $ANTLR 3.5.1 /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g 2016-05-19 08:52:54

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
	@Override public String getGrammarFileName() { return "/home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g"; }

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:191:5: ( '&' TERM )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:192:2: '&' TERM
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:196:2: ( ( T R U E ) | ( F A L S E ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:196:4: ( T R U E )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:196:4: ( T R U E )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:196:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:197:4: ( F A L S E )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:197:4: ( F A L S E )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:197:5: F A L S E
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

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:201:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:201:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:203:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:203:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:204:4: c=~ ( '\\'' | '\\r' | '\\n' )
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:210:5: ( '!' | ( '*' O R ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:210:8: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:210:14: ( '*' O R )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:210:14: ( '*' O R )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:210:15: '*' O R
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:211:6: ( '&' | ( '*' A N D ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:211:9: '&'
					{
					match('&'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:211:15: ( '*' A N D )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:211:15: ( '*' A N D )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:211:16: '*' A N D
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:212:5: ( ( '*' N O T ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:212:7: ( '*' N O T )
			{
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:212:7: ( '*' N O T )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:212:8: '*' N O T
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:213:4: ( '=' | ( '*' E Q ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:213:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:213:13: ( '*' E Q )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:213:13: ( '*' E Q )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:213:14: '*' E Q
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:214:4: ( '>' | ( '*' G T ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:214:6: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:214:12: ( '*' G T )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:214:12: ( '*' G T )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:214:13: '*' G T
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:215:4: ( '<' | ( '*' L T ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:215:8: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:215:14: ( '*' L T )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:215:14: ( '*' L T )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:215:15: '*' L T
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:216:6: ( '*' G E )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:216:8: '*' G E
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:217:6: ( '*' L E )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:217:8: '*' L E
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:218:8: ( '^=' | '*' N E )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:218:11: '^='
					{
					match("^="); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:218:18: '*' N E
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:219:9: ( '^>' | '*' N G )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:219:12: '^>'
					{
					match("^>"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:219:19: '*' N G
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:220:9: ( '^<' | '*' N L )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:220:12: '^<'
					{
					match("^<"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:220:19: '*' N L
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:222:6: ( '+' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:222:8: '+'
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:223:7: ( '-' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:223:9: '-'
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:224:6: ( '*' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:224:8: '*'
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:225:5: ( '/' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:225:7: '/'
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:227:9: ( '!!' | ( '*' C A T ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:227:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:227:18: ( '*' C A T )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:227:18: ( '*' C A T )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:227:19: '*' C A T
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:228:9: ( '!>' | ( '*' B C A T ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:228:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:228:18: ( '*' B C A T )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:228:18: ( '*' B C A T )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:228:19: '*' B C A T
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:229:9: ( '!<' | ( '*' T C A T ) )
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:229:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:229:18: ( '*' T C A T )
					{
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:229:18: ( '*' T C A T )
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:229:19: '*' T C A T
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

	// $ANTLR start "TERM"
	public final void mTERM() throws RecognitionException {
		try {
			int _type = TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:231:6: ( LETTER ( LETTER | DIGIT )* )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:231:8: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:231:15: ( LETTER | DIGIT )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\"'||LA14_0=='$'||(LA14_0 >= '+' && LA14_0 <= '9')||LA14_0=='?'||(LA14_0 >= 'A' && LA14_0 <= 'Z')||LA14_0=='_'||(LA14_0 >= 'a' && LA14_0 <= 'z')||LA14_0=='\u00A3'||LA14_0=='\u00A7'||LA14_0=='\u00E0'||(LA14_0 >= '\u00E8' && LA14_0 <= '\u00E9')||LA14_0=='\u00EC'||LA14_0=='\u00F2'||LA14_0=='\u00F9') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:233:9: ( ( DIGIT )+ )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:234:2: ( DIGIT )+
			{
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:234:2: ( DIGIT )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:238:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:238:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:238:4: ( '0' .. '9' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
					break loop16;
				}
			}

			mDIGIT_SPECIAL(); 

			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:238:30: ( '0' .. '9' )+
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
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:242:2: ( '(' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:243:2: '('
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:247:2: ( ')' )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:248:2: ')'
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

	// $ANTLR start "DATA_AREA"
	public final void mDATA_AREA() throws RecognitionException {
		try {
			int _type = DATA_AREA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:252:2: ( MULT L D A )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:253:2: MULT L D A
			{
			mMULT(); 

			mL(); 

			mD(); 

			mA(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATA_AREA"

	// $ANTLR start "BINARY_FUN"
	public final void mBINARY_FUN() throws RecognitionException {
		try {
			int _type = BINARY_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:257:2: ( '%' B I N A R Y )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:258:2: '%' B I N A R Y
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:262:2: ( '%' S S T | '%' S U B S T R I N G )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='%') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='S'||LA18_1=='s') ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2=='S'||LA18_2=='s') ) {
						alt18=1;
					}
					else if ( (LA18_2=='U'||LA18_2=='u') ) {
						alt18=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
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
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:263:2: '%' S S T
					{
					match('%'); 
					mS(); 

					mS(); 

					mT(); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:265:2: '%' S U B S T R I N G
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:269:2: ( '%' S W I T C H )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:270:2: '%' S W I T C H
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

	// $ANTLR start "SWITCH_VALUE"
	public final void mSWITCH_VALUE() throws RecognitionException {
		try {
			int _type = SWITCH_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:274:2: ( ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:275:2: ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' )
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:280:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:285:3: ( ( '\\u00A7' | '_' | '.' | '/' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '\\u00a3' | '?' | '+' | '-' | ',' | '$' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:308:3: ( ( '0' .. '9' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:313:3: ( ( ',' | '.' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:316:11: ( ( 'a' | 'A' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:317:11: ( ( 'b' | 'B' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:318:11: ( ( 'c' | 'C' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:319:11: ( ( 'd' | 'D' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:320:11: ( ( 'e' | 'E' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:321:11: ( ( 'f' | 'F' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:322:11: ( ( 'g' | 'G' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:323:11: ( ( 'h' | 'H' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:324:11: ( ( 'i' | 'I' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:325:11: ( ( 'j' | 'J' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:326:11: ( ( 'k' | 'K' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:327:11: ( ( 'l' | 'L' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:328:11: ( ( 'm' | 'M' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:329:11: ( ( 'n' | 'N' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:330:11: ( ( 'o' | 'O' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:331:11: ( ( 'p' | 'P' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:332:11: ( ( 'q' | 'Q' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:333:11: ( ( 'r' | 'R' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:334:11: ( ( 's' | 'S' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:335:11: ( ( 't' | 'T' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:336:11: ( ( 'u' | 'U' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:337:11: ( ( 'v' | 'V' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:338:11: ( ( 'w' | 'W' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:339:11: ( ( 'x' | 'X' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:340:11: ( ( 'y' | 'Y' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:341:11: ( ( 'z' | 'Z' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:
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
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:345:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:345:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
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
		// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:8: ( VAR | BOOLEAN | STRING | OR | AND | NOT | EQ | GT | LT | GTEQ | LTEQ | NE | NG | NL | PLUS | MINUS | MULT | DIV | CAT | BCAT | TCAT | TERM | INTEGER | FLOAT | OPEN_BRACE | CLOSE_BRACE | DATA_AREA | BINARY_FUN | SST_FUN | SWITCH_FUN | SWITCH_VALUE | WS )
		int alt19=32;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:10: VAR
				{
				mVAR(); 

				}
				break;
			case 2 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:14: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 3 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:22: STRING
				{
				mSTRING(); 

				}
				break;
			case 4 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:29: OR
				{
				mOR(); 

				}
				break;
			case 5 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:32: AND
				{
				mAND(); 

				}
				break;
			case 6 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:36: NOT
				{
				mNOT(); 

				}
				break;
			case 7 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:40: EQ
				{
				mEQ(); 

				}
				break;
			case 8 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:43: GT
				{
				mGT(); 

				}
				break;
			case 9 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:46: LT
				{
				mLT(); 

				}
				break;
			case 10 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:49: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 11 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:54: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:59: NE
				{
				mNE(); 

				}
				break;
			case 13 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:62: NG
				{
				mNG(); 

				}
				break;
			case 14 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:65: NL
				{
				mNL(); 

				}
				break;
			case 15 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:68: PLUS
				{
				mPLUS(); 

				}
				break;
			case 16 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:73: MINUS
				{
				mMINUS(); 

				}
				break;
			case 17 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:79: MULT
				{
				mMULT(); 

				}
				break;
			case 18 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:84: DIV
				{
				mDIV(); 

				}
				break;
			case 19 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:88: CAT
				{
				mCAT(); 

				}
				break;
			case 20 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:92: BCAT
				{
				mBCAT(); 

				}
				break;
			case 21 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:97: TCAT
				{
				mTCAT(); 

				}
				break;
			case 22 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:102: TERM
				{
				mTERM(); 

				}
				break;
			case 23 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:107: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 24 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:115: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 25 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:121: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 26 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:132: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 27 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:144: DATA_AREA
				{
				mDATA_AREA(); 

				}
				break;
			case 28 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:154: BINARY_FUN
				{
				mBINARY_FUN(); 

				}
				break;
			case 29 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:165: SST_FUN
				{
				mSST_FUN(); 

				}
				break;
			case 30 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:173: SWITCH_FUN
				{
				mSWITCH_FUN(); 

				}
				break;
			case 31 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:184: SWITCH_VALUE
				{
				mSWITCH_VALUE(); 

				}
				break;
			case 32 :
				// /home/jamiro/Dati/git_smeup/asup/org.smeup.sys.il.expr.ibmi/src/org/smeup/sys/il/expr/ibmi/cl/CLExpr.g:1:197: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA19_eotS =
		"\1\uffff\1\30\2\25\1\uffff\1\36\1\42\4\uffff\1\46\1\47\1\50\1\25\1\53"+
		"\1\25\3\uffff\1\53\4\uffff\2\25\16\uffff\1\25\1\53\3\uffff\1\25\2\uffff"+
		"\2\25\4\uffff\1\53\1\25\2\uffff\1\77\1\25\1\53\1\25\1\uffff\1\77\1\53"+
		"\1\25\1\53\1\25\1\53\1\25\1\53\1\uffff";
	static final String DFA19_eofS =
		"\111\uffff";
	static final String DFA19_minS =
		"\1\11\1\42\1\122\1\101\1\uffff\1\41\1\101\3\uffff\1\74\3\42\1\60\1\54"+
		"\1\60\2\uffff\1\102\1\54\4\uffff\1\125\1\114\4\uffff\2\105\1\104\7\uffff"+
		"\1\60\1\54\3\uffff\1\60\1\uffff\1\123\1\105\1\123\4\uffff\1\54\1\60\2"+
		"\uffff\1\42\1\105\1\54\1\60\1\uffff\1\42\1\54\1\60\1\54\1\60\1\54\1\60"+
		"\1\54\1\uffff";
	static final String DFA19_maxS =
		"\2\u00f9\1\162\1\141\1\uffff\1\76\1\164\3\uffff\1\76\3\u00f9\1\71\2\170"+
		"\2\uffff\1\163\1\71\4\uffff\1\165\1\154\4\uffff\1\157\2\164\7\uffff\1"+
		"\71\1\170\3\uffff\1\170\1\uffff\1\167\1\145\1\163\4\uffff\2\170\2\uffff"+
		"\1\u00f9\1\145\2\170\1\uffff\1\u00f9\6\170\1\71\1\uffff";
	static final String DFA19_acceptS =
		"\4\uffff\1\3\2\uffff\1\7\1\10\1\11\7\uffff\1\31\1\32\2\uffff\1\26\1\40"+
		"\1\1\1\5\2\uffff\1\23\1\24\1\25\1\4\3\uffff\1\21\1\14\1\15\1\16\1\17\1"+
		"\20\1\22\2\uffff\1\27\1\37\1\30\1\uffff\1\34\3\uffff\1\6\1\12\1\13\1\33"+
		"\2\uffff\1\35\1\36\4\uffff\1\2\10\uffff\1\26";
	static final String DFA19_specialS =
		"\111\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\26\1\uffff\2\26\22\uffff\1\26\1\5\1\25\1\uffff\1\25\1\23\1\1\1\4\1"+
			"\21\1\22\1\6\1\13\1\16\1\14\1\16\1\15\2\17\10\24\2\uffff\1\11\1\7\1\10"+
			"\1\25\1\uffff\5\25\1\3\15\25\1\2\3\25\1\20\2\25\3\uffff\1\12\1\25\1\uffff"+
			"\5\25\1\3\15\25\1\2\3\25\1\20\2\25\50\uffff\1\25\3\uffff\1\25\70\uffff"+
			"\1\25\7\uffff\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\27\1\uffff\1\27\6\uffff\5\27\17\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff\1\27\7\uffff"+
			"\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\1\31\37\uffff\1\31",
			"\1\32\37\uffff\1\32",
			"",
			"\1\33\32\uffff\1\35\1\uffff\1\34",
			"\1\30\1\34\1\33\1\uffff\1\7\1\uffff\1\40\4\uffff\1\41\1\uffff\1\37\1"+
			"\36\4\uffff\1\35\14\uffff\1\30\1\34\1\33\1\uffff\1\7\1\uffff\1\40\4\uffff"+
			"\1\41\1\uffff\1\37\1\36\4\uffff\1\35",
			"",
			"",
			"",
			"\1\45\1\43\1\44",
			"\1\25\1\uffff\1\25\6\uffff\17\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\25\1\uffff\1\25\6\uffff\17\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\25\1\uffff\1\25\6\uffff\17\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\12\51",
			"\1\55\1\uffff\1\55\1\uffff\2\52\10\24\36\uffff\1\54\37\uffff\1\54",
			"\2\56\46\uffff\1\56\37\uffff\1\56",
			"",
			"",
			"\1\57\20\uffff\1\60\16\uffff\1\57\20\uffff\1\60",
			"\1\55\1\uffff\1\55\1\uffff\12\24",
			"",
			"",
			"",
			"",
			"\1\61\37\uffff\1\61",
			"\1\62\37\uffff\1\62",
			"",
			"",
			"",
			"",
			"\1\43\1\uffff\1\44\4\uffff\1\45\2\uffff\1\63\25\uffff\1\43\1\uffff\1"+
			"\44\4\uffff\1\45\2\uffff\1\63",
			"\1\64\16\uffff\1\10\20\uffff\1\64\16\uffff\1\10",
			"\1\66\1\65\16\uffff\1\11\17\uffff\1\66\1\65\16\uffff\1\11",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\51",
			"\1\55\1\uffff\1\55\1\uffff\2\67\10\24\36\uffff\1\54\37\uffff\1\54",
			"",
			"",
			"",
			"\2\70\46\uffff\1\70\37\uffff\1\70",
			"",
			"\1\71\1\uffff\1\71\1\uffff\1\72\33\uffff\1\71\1\uffff\1\71\1\uffff\1"+
			"\72",
			"\1\73\37\uffff\1\73",
			"\1\74\37\uffff\1\74",
			"",
			"",
			"",
			"",
			"\1\55\1\uffff\1\55\1\uffff\2\75\10\24\36\uffff\1\54\37\uffff\1\54",
			"\2\76\46\uffff\1\76\37\uffff\1\76",
			"",
			"",
			"\1\25\1\uffff\1\25\6\uffff\17\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\100\37\uffff\1\100",
			"\1\55\1\uffff\1\55\1\uffff\2\101\10\24\36\uffff\1\54\37\uffff\1\54",
			"\2\102\46\uffff\1\102\37\uffff\1\102",
			"",
			"\1\25\1\uffff\1\25\6\uffff\17\25\5\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\55\1\uffff\1\55\1\uffff\2\103\10\24\36\uffff\1\54\37\uffff\1\54",
			"\2\104\46\uffff\1\104\37\uffff\1\104",
			"\1\55\1\uffff\1\55\1\uffff\2\105\10\24\36\uffff\1\54\37\uffff\1\54",
			"\2\106\46\uffff\1\106\37\uffff\1\106",
			"\1\55\1\uffff\1\55\1\uffff\2\107\10\24\36\uffff\1\54\37\uffff\1\54",
			"\2\110\46\uffff\1\110\37\uffff\1\110",
			"\1\55\1\uffff\1\55\1\uffff\12\24",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( VAR | BOOLEAN | STRING | OR | AND | NOT | EQ | GT | LT | GTEQ | LTEQ | NE | NG | NL | PLUS | MINUS | MULT | DIV | CAT | BCAT | TCAT | TERM | INTEGER | FLOAT | OPEN_BRACE | CLOSE_BRACE | DATA_AREA | BINARY_FUN | SST_FUN | SWITCH_FUN | SWITCH_VALUE | WS );";
		}
	}

}
