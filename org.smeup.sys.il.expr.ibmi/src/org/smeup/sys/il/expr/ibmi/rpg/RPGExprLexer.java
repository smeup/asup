// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g 2017-03-10 16:38:54

  package org.smeup.sys.il.expr.ibmi.rpg;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RPGExprLexer extends Lexer {
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


		@Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

	    @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String msg = "RPGExprLexer error. Input: " + e.input.toString();
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

	public RPGExprLexer() {} 
	public RPGExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RPGExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g"; }

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:34:7: ( '(' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:34:9: '('
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
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:35:7: ( ')' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:35:9: ')'
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:36:7: ( ':' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:36:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:37:7: ( '[' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:37:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:38:7: ( ']' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:38:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:2: ( ( H I V A L ) | ( L O V A L ) | ( Z E R O S ) | ( Z E R O ) | ( B L A N K ) | ( B L A N K S ) | ( O N ) | ( O F F ) | ( O M I T ) | ( N U L L ) | ( S T A T U S ) | ( P A R M S ) | ( S I Z E ) | ( D ) | ( M S ) | ( Y E A R ) | ( Y E A R S ) | ( M O N T H S ) | ( D A Y S ) | ( N E X T ) | ( I S O ) | ( I S O '0' ) | ( E Q ) | ( L T ) | ( L E ) | ( G T ) | ( G E ) | ( N E ) | ( S E C O N D S ) )
			int alt1=29;
			switch ( input.LA(1) ) {
			case 'H':
			case 'h':
				{
				alt1=1;
				}
				break;
			case 'L':
			case 'l':
				{
				switch ( input.LA(2) ) {
				case 'O':
				case 'o':
					{
					alt1=2;
					}
					break;
				case 'T':
				case 't':
					{
					alt1=24;
					}
					break;
				case 'E':
				case 'e':
					{
					alt1=25;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'Z':
			case 'z':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='E'||LA1_3=='e') ) {
					int LA1_18 = input.LA(3);
					if ( (LA1_18=='R'||LA1_18=='r') ) {
						int LA1_36 = input.LA(4);
						if ( (LA1_36=='O'||LA1_36=='o') ) {
							int LA1_42 = input.LA(5);
							if ( (LA1_42=='S'||LA1_42=='s') ) {
								alt1=3;
							}

							else {
								alt1=4;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 18, input);
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
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'B':
			case 'b':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='L'||LA1_4=='l') ) {
					int LA1_19 = input.LA(3);
					if ( (LA1_19=='A'||LA1_19=='a') ) {
						int LA1_37 = input.LA(4);
						if ( (LA1_37=='N'||LA1_37=='n') ) {
							int LA1_43 = input.LA(5);
							if ( (LA1_43=='K'||LA1_43=='k') ) {
								int LA1_49 = input.LA(6);
								if ( (LA1_49=='S'||LA1_49=='s') ) {
									alt1=6;
								}

								else {
									alt1=5;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 43, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 37, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 19, input);
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
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'O':
			case 'o':
				{
				switch ( input.LA(2) ) {
				case 'N':
				case 'n':
					{
					alt1=7;
					}
					break;
				case 'F':
				case 'f':
					{
					alt1=8;
					}
					break;
				case 'M':
				case 'm':
					{
					alt1=9;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
			case 'n':
				{
				int LA1_6 = input.LA(2);
				if ( (LA1_6=='U'||LA1_6=='u') ) {
					alt1=10;
				}
				else if ( (LA1_6=='E'||LA1_6=='e') ) {
					int LA1_24 = input.LA(3);
					if ( (LA1_24=='X'||LA1_24=='x') ) {
						alt1=20;
					}

					else {
						alt1=28;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
			case 's':
				{
				switch ( input.LA(2) ) {
				case 'T':
				case 't':
					{
					alt1=11;
					}
					break;
				case 'I':
				case 'i':
					{
					alt1=13;
					}
					break;
				case 'E':
				case 'e':
					{
					alt1=29;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'P':
			case 'p':
				{
				alt1=12;
				}
				break;
			case 'D':
			case 'd':
				{
				int LA1_9 = input.LA(2);
				if ( (LA1_9=='A'||LA1_9=='a') ) {
					alt1=19;
				}

				else {
					alt1=14;
				}

				}
				break;
			case 'M':
			case 'm':
				{
				int LA1_10 = input.LA(2);
				if ( (LA1_10=='S'||LA1_10=='s') ) {
					alt1=15;
				}
				else if ( (LA1_10=='O'||LA1_10=='o') ) {
					alt1=18;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'Y':
			case 'y':
				{
				int LA1_11 = input.LA(2);
				if ( (LA1_11=='E'||LA1_11=='e') ) {
					int LA1_32 = input.LA(3);
					if ( (LA1_32=='A'||LA1_32=='a') ) {
						int LA1_40 = input.LA(4);
						if ( (LA1_40=='R'||LA1_40=='r') ) {
							int LA1_44 = input.LA(5);
							if ( (LA1_44=='S'||LA1_44=='s') ) {
								alt1=17;
							}

							else {
								alt1=16;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 40, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 32, input);
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
							new NoViableAltException("", 1, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'I':
			case 'i':
				{
				int LA1_12 = input.LA(2);
				if ( (LA1_12=='S'||LA1_12=='s') ) {
					int LA1_33 = input.LA(3);
					if ( (LA1_33=='O'||LA1_33=='o') ) {
						int LA1_41 = input.LA(4);
						if ( (LA1_41=='0') ) {
							alt1=22;
						}

						else {
							alt1=21;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 33, input);
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
							new NoViableAltException("", 1, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'E':
			case 'e':
				{
				alt1=23;
				}
				break;
			case 'G':
			case 'g':
				{
				int LA1_14 = input.LA(2);
				if ( (LA1_14=='T'||LA1_14=='t') ) {
					alt1=26;
				}
				else if ( (LA1_14=='E'||LA1_14=='e') ) {
					alt1=27;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:4: ( H I V A L )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:4: ( H I V A L )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:6: H I V A L
					{
					mH(); 

					mI(); 

					mV(); 

					mA(); 

					mL(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:240:3: ( L O V A L )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:240:3: ( L O V A L )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:240:5: L O V A L
					{
					mL(); 

					mO(); 

					mV(); 

					mA(); 

					mL(); 

					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:242:3: ( Z E R O S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:242:3: ( Z E R O S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:242:5: Z E R O S
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					mS(); 

					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:244:3: ( Z E R O )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:244:3: ( Z E R O )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:244:5: Z E R O
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:246:3: ( B L A N K )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:246:3: ( B L A N K )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:246:5: B L A N K
					{
					mB(); 

					mL(); 

					mA(); 

					mN(); 

					mK(); 

					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:3: ( B L A N K S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:3: ( B L A N K S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:5: B L A N K S
					{
					mB(); 

					mL(); 

					mA(); 

					mN(); 

					mK(); 

					mS(); 

					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:250:3: ( O N )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:250:3: ( O N )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:250:5: O N
					{
					mO(); 

					mN(); 

					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:252:3: ( O F F )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:252:3: ( O F F )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:252:5: O F F
					{
					mO(); 

					mF(); 

					mF(); 

					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:254:3: ( O M I T )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:254:3: ( O M I T )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:254:5: O M I T
					{
					mO(); 

					mM(); 

					mI(); 

					mT(); 

					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:256:3: ( N U L L )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:256:3: ( N U L L )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:256:5: N U L L
					{
					mN(); 

					mU(); 

					mL(); 

					mL(); 

					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:258:3: ( S T A T U S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:258:3: ( S T A T U S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:258:5: S T A T U S
					{
					mS(); 

					mT(); 

					mA(); 

					mT(); 

					mU(); 

					mS(); 

					}

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:260:3: ( P A R M S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:260:3: ( P A R M S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:260:5: P A R M S
					{
					mP(); 

					mA(); 

					mR(); 

					mM(); 

					mS(); 

					}

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:262:3: ( S I Z E )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:262:3: ( S I Z E )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:262:5: S I Z E
					{
					mS(); 

					mI(); 

					mZ(); 

					mE(); 

					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:264:3: ( D )
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
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:266:3: ( M S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:266:3: ( M S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:266:5: M S
					{
					mM(); 

					mS(); 

					}

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:268:3: ( Y E A R )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:268:3: ( Y E A R )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:268:5: Y E A R
					{
					mY(); 

					mE(); 

					mA(); 

					mR(); 

					}

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:270:3: ( Y E A R S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:270:3: ( Y E A R S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:270:5: Y E A R S
					{
					mY(); 

					mE(); 

					mA(); 

					mR(); 

					mS(); 

					}

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:272:3: ( M O N T H S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:272:3: ( M O N T H S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:272:5: M O N T H S
					{
					mM(); 

					mO(); 

					mN(); 

					mT(); 

					mH(); 

					mS(); 

					}

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:274:3: ( D A Y S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:274:3: ( D A Y S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:274:5: D A Y S
					{
					mD(); 

					mA(); 

					mY(); 

					mS(); 

					}

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:276:3: ( N E X T )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:276:3: ( N E X T )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:276:5: N E X T
					{
					mN(); 

					mE(); 

					mX(); 

					mT(); 

					}

					}
					break;
				case 21 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:278:3: ( I S O )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:278:3: ( I S O )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:278:4: I S O
					{
					mI(); 

					mS(); 

					mO(); 

					}

					}
					break;
				case 22 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:280:3: ( I S O '0' )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:280:3: ( I S O '0' )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:280:4: I S O '0'
					{
					mI(); 

					mS(); 

					mO(); 

					match('0'); 
					}

					}
					break;
				case 23 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:282:3: ( E Q )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:282:3: ( E Q )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:282:5: E Q
					{
					mE(); 

					mQ(); 

					}

					}
					break;
				case 24 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:284:3: ( L T )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:284:3: ( L T )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:284:5: L T
					{
					mL(); 

					mT(); 

					}

					}
					break;
				case 25 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:286:3: ( L E )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:286:3: ( L E )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:286:5: L E
					{
					mL(); 

					mE(); 

					}

					}
					break;
				case 26 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:3: ( G T )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:3: ( G T )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:5: G T
					{
					mG(); 

					mT(); 

					}

					}
					break;
				case 27 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:3: ( G E )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:3: ( G E )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:5: G E
					{
					mG(); 

					mE(); 

					}

					}
					break;
				case 28 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:292:3: ( N E )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:292:3: ( N E )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:292:5: N E
					{
					mN(); 

					mE(); 

					}

					}
					break;
				case 29 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:294:3: ( S E C O N D S )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:294:3: ( S E C O N D S )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:294:5: S E C O N D S
					{
					mS(); 

					mE(); 

					mC(); 

					mO(); 

					mN(); 

					mD(); 

					mS(); 

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
	// $ANTLR end "SPECIAL"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:5: ( '||' | ( O R ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='|') ) {
				alt2=1;
			}
			else if ( (LA2_0=='O'||LA2_0=='o') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:8: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:15: ( O R )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:15: ( O R )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:16: O R
					{
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:298:6: ( '&&' | ( A N D ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='&') ) {
				alt3=1;
			}
			else if ( (LA3_0=='A'||LA3_0=='a') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:298:9: '&&'
					{
					match("&&"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:298:16: ( A N D )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:298:16: ( A N D )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:298:17: A N D
					{
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:5: ( '!' | ( N O T ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!') ) {
				alt4=1;
			}
			else if ( (LA4_0=='N'||LA4_0=='n') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:7: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:14: ( N O T )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:14: ( N O T )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:15: N O T
					{
					mN(); 

					mO(); 

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
	// $ANTLR end "NOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:301:4: ( '=' | '==' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='=') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='=') ) {
					alt5=2;
				}

				else {
					alt5=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:301:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:301:13: '=='
					{
					match("=="); 

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

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:302:4: ( '!=' | '<>' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='!') ) {
				alt6=1;
			}
			else if ( (LA6_0=='<') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:302:6: '!='
					{
					match("!="); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:302:13: '<>'
					{
					match("<>"); 

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

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:303:4: ( '<' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:303:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:304:6: ( '<=' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:304:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:305:4: ( '>' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:305:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:306:6: ( '>=' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:306:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:308:6: ( '+' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:308:8: '+'
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:309:7: ( '-' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:309:9: '-'
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:310:6: ( '*' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:310:8: '*'
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:311:5: ( '/' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:311:7: '/'
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

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:312:5: ( '%' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:312:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "BI_FUN"
	public final void mBI_FUN() throws RecognitionException {
		try {
			int _type = BI_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:316:9: ( '%' TERM )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:316:11: '%' TERM
			{
			match('%'); 
			mTERM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BI_FUN"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:319:5: ( I N )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:320:2: I N
			{
			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INNR"
	public final void mINNR() throws RecognitionException {
		try {
			int _type = INNR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:323:6: ( I N ( '0' .. '9' ) ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:324:2: I N ( '0' .. '9' ) ( '0' .. '9' )
			{
			mI(); 

			mN(); 

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
	// $ANTLR end "INNR"

	// $ANTLR start "INNU"
	public final void mINNU() throws RecognitionException {
		try {
			int _type = INNU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:327:6: ( I N U ( '1' .. '8' ) | I N H ( '1' .. '8' ) | I N M R | I N O ( A | B | C | D | E | F | G | V ) | I N L ( '1' .. '9' ) | I N L R | I N R T | I N K A | I N K B | I N K C | I N K D | I N K E | I N K F | I N K G | I N K H | I N K I | I N K J | I N K K | I N K L | I N K M | I N K N | I N K P | I N K Q | I N K R | I N K S | I N K T | I N K U | I N K V | I N K W | I N K X | I N K Y )
			int alt7=31;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='I'||LA7_0=='i') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='N'||LA7_1=='n') ) {
					switch ( input.LA(3) ) {
					case 'U':
					case 'u':
						{
						alt7=1;
						}
						break;
					case 'H':
					case 'h':
						{
						alt7=2;
						}
						break;
					case 'M':
					case 'm':
						{
						alt7=3;
						}
						break;
					case 'O':
					case 'o':
						{
						alt7=4;
						}
						break;
					case 'L':
					case 'l':
						{
						int LA7_7 = input.LA(4);
						if ( ((LA7_7 >= '1' && LA7_7 <= '9')) ) {
							alt7=5;
						}
						else if ( (LA7_7=='R'||LA7_7=='r') ) {
							alt7=6;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'R':
					case 'r':
						{
						alt7=7;
						}
						break;
					case 'K':
					case 'k':
						{
						switch ( input.LA(4) ) {
						case 'A':
						case 'a':
							{
							alt7=8;
							}
							break;
						case 'B':
						case 'b':
							{
							alt7=9;
							}
							break;
						case 'C':
						case 'c':
							{
							alt7=10;
							}
							break;
						case 'D':
						case 'd':
							{
							alt7=11;
							}
							break;
						case 'E':
						case 'e':
							{
							alt7=12;
							}
							break;
						case 'F':
						case 'f':
							{
							alt7=13;
							}
							break;
						case 'G':
						case 'g':
							{
							alt7=14;
							}
							break;
						case 'H':
						case 'h':
							{
							alt7=15;
							}
							break;
						case 'I':
						case 'i':
							{
							alt7=16;
							}
							break;
						case 'J':
						case 'j':
							{
							alt7=17;
							}
							break;
						case 'K':
						case 'k':
							{
							alt7=18;
							}
							break;
						case 'L':
						case 'l':
							{
							alt7=19;
							}
							break;
						case 'M':
						case 'm':
							{
							alt7=20;
							}
							break;
						case 'N':
						case 'n':
							{
							alt7=21;
							}
							break;
						case 'P':
						case 'p':
							{
							alt7=22;
							}
							break;
						case 'Q':
						case 'q':
							{
							alt7=23;
							}
							break;
						case 'R':
						case 'r':
							{
							alt7=24;
							}
							break;
						case 'S':
						case 's':
							{
							alt7=25;
							}
							break;
						case 'T':
						case 't':
							{
							alt7=26;
							}
							break;
						case 'U':
						case 'u':
							{
							alt7=27;
							}
							break;
						case 'V':
						case 'v':
							{
							alt7=28;
							}
							break;
						case 'W':
						case 'w':
							{
							alt7=29;
							}
							break;
						case 'X':
						case 'x':
							{
							alt7=30;
							}
							break;
						case 'Y':
						case 'y':
							{
							alt7=31;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
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
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:329:2: I N U ( '1' .. '8' )
					{
					mI(); 

					mN(); 

					mU(); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '8') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:331:2: I N H ( '1' .. '8' )
					{
					mI(); 

					mN(); 

					mH(); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '8') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:333:2: I N M R
					{
					mI(); 

					mN(); 

					mM(); 

					mR(); 

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:335:2: I N O ( A | B | C | D | E | F | G | V )
					{
					mI(); 

					mN(); 

					mO(); 

					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'G')||input.LA(1)=='V'||(input.LA(1) >= 'a' && input.LA(1) <= 'g')||input.LA(1)=='v' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:337:2: I N L ( '1' .. '9' )
					{
					mI(); 

					mN(); 

					mL(); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:339:2: I N L R
					{
					mI(); 

					mN(); 

					mL(); 

					mR(); 

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:341:2: I N R T
					{
					mI(); 

					mN(); 

					mR(); 

					mT(); 

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:343:2: I N K A
					{
					mI(); 

					mN(); 

					mK(); 

					mA(); 

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:345:2: I N K B
					{
					mI(); 

					mN(); 

					mK(); 

					mB(); 

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:347:2: I N K C
					{
					mI(); 

					mN(); 

					mK(); 

					mC(); 

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:349:2: I N K D
					{
					mI(); 

					mN(); 

					mK(); 

					mD(); 

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:351:2: I N K E
					{
					mI(); 

					mN(); 

					mK(); 

					mE(); 

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:353:2: I N K F
					{
					mI(); 

					mN(); 

					mK(); 

					mF(); 

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:355:2: I N K G
					{
					mI(); 

					mN(); 

					mK(); 

					mG(); 

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:357:2: I N K H
					{
					mI(); 

					mN(); 

					mK(); 

					mH(); 

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:359:2: I N K I
					{
					mI(); 

					mN(); 

					mK(); 

					mI(); 

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:361:2: I N K J
					{
					mI(); 

					mN(); 

					mK(); 

					mJ(); 

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:363:2: I N K K
					{
					mI(); 

					mN(); 

					mK(); 

					mK(); 

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:365:2: I N K L
					{
					mI(); 

					mN(); 

					mK(); 

					mL(); 

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:367:2: I N K M
					{
					mI(); 

					mN(); 

					mK(); 

					mM(); 

					}
					break;
				case 21 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:369:2: I N K N
					{
					mI(); 

					mN(); 

					mK(); 

					mN(); 

					}
					break;
				case 22 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:371:2: I N K P
					{
					mI(); 

					mN(); 

					mK(); 

					mP(); 

					}
					break;
				case 23 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:373:2: I N K Q
					{
					mI(); 

					mN(); 

					mK(); 

					mQ(); 

					}
					break;
				case 24 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:375:2: I N K R
					{
					mI(); 

					mN(); 

					mK(); 

					mR(); 

					}
					break;
				case 25 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:377:2: I N K S
					{
					mI(); 

					mN(); 

					mK(); 

					mS(); 

					}
					break;
				case 26 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:379:2: I N K T
					{
					mI(); 

					mN(); 

					mK(); 

					mT(); 

					}
					break;
				case 27 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:381:2: I N K U
					{
					mI(); 

					mN(); 

					mK(); 

					mU(); 

					}
					break;
				case 28 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:383:2: I N K V
					{
					mI(); 

					mN(); 

					mK(); 

					mV(); 

					}
					break;
				case 29 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:385:2: I N K W
					{
					mI(); 

					mN(); 

					mK(); 

					mW(); 

					}
					break;
				case 30 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:387:2: I N K X
					{
					mI(); 

					mN(); 

					mK(); 

					mX(); 

					}
					break;
				case 31 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:389:2: I N K Y
					{
					mI(); 

					mN(); 

					mK(); 

					mY(); 

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
	// $ANTLR end "INNU"

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:393:5: ( A L L '\\'' (~ ( '\\'' | '\\r' | '\\n' | '\\t' ) )+ '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:394:2: A L L '\\'' (~ ( '\\'' | '\\r' | '\\n' | '\\t' ) )+ '\\''
			{
			mA(); 

			mL(); 

			mL(); 

			match('\''); 
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:394:13: (~ ( '\\'' | '\\r' | '\\n' | '\\t' ) )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "ALLX"
	public final void mALLX() throws RecognitionException {
		try {
			int _type = ALLX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:397:9: ( A L L HEX )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:398:2: A L L HEX
			{
			mA(); 

			mL(); 

			mL(); 

			mHEX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALLX"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			int _type = HEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:5: ( ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:9: ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:9: ( 'X\\'' | 'x\\'' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='X') ) {
				alt9=1;
			}
			else if ( (LA9_0=='x') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:10: 'X\\''
					{
					match("X'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:16: 'x\\''
					{
					match("x'"); 

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:23: ( HexDigit )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:407:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:407:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:409:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\'') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='\'') ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '\uFFFF')) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:409:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:410:4: c=~ ( '\\'' | '\\r' | '\\n' )
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
					break loop11;
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:419:2: ( ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:419:4: ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:419:4: ( '0' .. '9' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:423:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:423:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:423:4: ( '0' .. '9' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					break loop13;
				}
			}

			mDIGIT_SPECIAL(); 

			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:423:30: ( '0' .. '9' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:427:3: ( ( 'D\\'' | 'd\\'' ) DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:427:5: ( 'D\\'' | 'd\\'' ) DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:427:5: ( 'D\\'' | 'd\\'' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='D') ) {
				alt15=1;
			}
			else if ( (LA15_0=='d') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:427:6: 'D\\''
					{
					match("D'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:427:12: 'd\\''
					{
					match("d'"); 

					}
					break;

			}

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			match('-'); 
			mDIGIT(); 

			mDIGIT(); 

			match('-'); 
			mDIGIT(); 

			mDIGIT(); 

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:3: ( ( 'T\\'' | 't\\'' ) ( DIGIT )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:5: ( 'T\\'' | 't\\'' ) ( DIGIT )* '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:5: ( 'T\\'' | 't\\'' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='T') ) {
				alt16=1;
			}
			else if ( (LA16_0=='t') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:6: 'T\\''
					{
					match("T'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:12: 't\\''
					{
					match("t'"); 

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:19: ( DIGIT )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					break loop17;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME"

	// $ANTLR start "TIMESTAMP"
	public final void mTIMESTAMP() throws RecognitionException {
		try {
			int _type = TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:435:3: ( ( 'Z\\'' | 'z\\'' ) DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '.' DIGIT DIGIT '.' DIGIT DIGIT '.' DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:435:5: ( 'Z\\'' | 'z\\'' ) DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '.' DIGIT DIGIT '.' DIGIT DIGIT '.' DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:435:5: ( 'Z\\'' | 'z\\'' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='Z') ) {
				alt18=1;
			}
			else if ( (LA18_0=='z') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:435:6: 'Z\\''
					{
					match("Z'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:435:12: 'z\\''
					{
					match("z'"); 

					}
					break;

			}

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			match('-'); 
			mDIGIT(); 

			mDIGIT(); 

			match('-'); 
			mDIGIT(); 

			mDIGIT(); 

			match('-'); 
			mDIGIT(); 

			mDIGIT(); 

			match('.'); 
			mDIGIT(); 

			mDIGIT(); 

			match('.'); 
			mDIGIT(); 

			mDIGIT(); 

			match('.'); 
			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			mDIGIT(); 

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMESTAMP"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:440:2: ( ( T R U E ) | ( F A L S E ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='T'||LA19_0=='t') ) {
				alt19=1;
			}
			else if ( (LA19_0=='F'||LA19_0=='f') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:440:4: ( T R U E )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:440:4: ( T R U E )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:440:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:441:4: ( F A L S E )
					{
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:441:4: ( F A L S E )
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:441:5: F A L S E
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

	// $ANTLR start "TERM"
	public final void mTERM() throws RecognitionException {
		try {
			int _type = TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:446:2: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:446:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:446:11: ( LETTER | DIGIT )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='$'||(LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'Z')||LA20_0=='_'||(LA20_0 >= 'a' && LA20_0 <= 'z')||LA20_0=='\u00A3'||LA20_0=='\u00A7') ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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
					break loop20;
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

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:450:3: ( '.' )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:450:5: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:454:3: ( ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:458:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '_' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
			{
			if ( input.LA(1)=='$'||input.LA(1)=='_'||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:462:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:467:2: ( '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:467:4: '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			{
			match('\\'); 
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:468:4: ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			int alt21=6;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt21=1;
				}
				break;
			case 'r':
				{
				alt21=2;
				}
				break;
			case 't':
				{
				alt21=3;
				}
				break;
			case '\'':
				{
				alt21=4;
				}
				break;
			case '\\':
				{
				alt21=5;
				}
				break;
			case 'u':
				{
				alt21=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:469:5: 'n'
					{
					match('n'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:470:4: 'r'
					{
					match('r'); 
					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:471:4: 't'
					{
					match('t'); 
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:472:4: '\\''
					{
					match('\''); 
					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:473:4: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:474:4: UnicodeEscape
					{
					mUnicodeEscape(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "UnicodeEscape"
	public final void mUnicodeEscape() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:479:6: ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:479:12: 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('u'); 
			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscape"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:483:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HexDigit"

	// $ANTLR start "DIGIT_SPECIAL"
	public final void mDIGIT_SPECIAL() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:486:3: ( ( ',' | '.' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:491:11: ( ( 'a' | 'A' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:492:11: ( ( 'b' | 'B' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:493:11: ( ( 'c' | 'C' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:494:11: ( ( 'd' | 'D' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:495:11: ( ( 'e' | 'E' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:496:11: ( ( 'f' | 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:497:11: ( ( 'g' | 'G' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:498:11: ( ( 'h' | 'H' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:499:11: ( ( 'i' | 'I' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:500:11: ( ( 'j' | 'J' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:501:11: ( ( 'k' | 'K' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:502:11: ( ( 'l' | 'L' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:503:11: ( ( 'm' | 'M' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:504:11: ( ( 'n' | 'N' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:505:11: ( ( 'o' | 'O' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:506:11: ( ( 'p' | 'P' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:507:11: ( ( 'q' | 'Q' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:508:11: ( ( 'r' | 'R' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:509:11: ( ( 's' | 'S' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:510:11: ( ( 't' | 'T' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:511:11: ( ( 'u' | 'U' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:512:11: ( ( 'v' | 'V' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:513:11: ( ( 'w' | 'W' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:514:11: ( ( 'x' | 'X' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:515:11: ( ( 'y' | 'Y' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:516:11: ( ( 'z' | 'Z' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:522:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:522:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
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
		// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:8: ( T__79 | T__80 | T__81 | T__82 | T__83 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | ALLX | HEX | STRING | INTEGER | FLOAT | DATE | TIME | TIMESTAMP | BOOLEAN | TERM | POINT | WS )
		int alt22=37;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:10: T__79
				{
				mT__79(); 

				}
				break;
			case 2 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:16: T__80
				{
				mT__80(); 

				}
				break;
			case 3 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:22: T__81
				{
				mT__81(); 

				}
				break;
			case 4 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:28: T__82
				{
				mT__82(); 

				}
				break;
			case 5 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:34: T__83
				{
				mT__83(); 

				}
				break;
			case 6 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:40: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 7 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:48: OR
				{
				mOR(); 

				}
				break;
			case 8 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:51: AND
				{
				mAND(); 

				}
				break;
			case 9 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:55: NOT
				{
				mNOT(); 

				}
				break;
			case 10 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:59: EQ
				{
				mEQ(); 

				}
				break;
			case 11 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:62: NE
				{
				mNE(); 

				}
				break;
			case 12 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:65: LT
				{
				mLT(); 

				}
				break;
			case 13 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:68: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 14 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:73: GT
				{
				mGT(); 

				}
				break;
			case 15 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:76: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 16 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:81: PLUS
				{
				mPLUS(); 

				}
				break;
			case 17 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:86: MINUS
				{
				mMINUS(); 

				}
				break;
			case 18 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:92: MULT
				{
				mMULT(); 

				}
				break;
			case 19 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:97: DIV
				{
				mDIV(); 

				}
				break;
			case 20 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:101: MOD
				{
				mMOD(); 

				}
				break;
			case 21 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:105: BI_FUN
				{
				mBI_FUN(); 

				}
				break;
			case 22 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:112: IN
				{
				mIN(); 

				}
				break;
			case 23 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:115: INNR
				{
				mINNR(); 

				}
				break;
			case 24 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:120: INNU
				{
				mINNU(); 

				}
				break;
			case 25 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:125: ALL
				{
				mALL(); 

				}
				break;
			case 26 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:129: ALLX
				{
				mALLX(); 

				}
				break;
			case 27 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:134: HEX
				{
				mHEX(); 

				}
				break;
			case 28 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:138: STRING
				{
				mSTRING(); 

				}
				break;
			case 29 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:145: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 30 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:153: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 31 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:159: DATE
				{
				mDATE(); 

				}
				break;
			case 32 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:164: TIME
				{
				mTIME(); 

				}
				break;
			case 33 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:169: TIMESTAMP
				{
				mTIMESTAMP(); 

				}
				break;
			case 34 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:179: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 35 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:187: TERM
				{
				mTERM(); 

				}
				break;
			case 36 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:192: POINT
				{
				mPOINT(); 

				}
				break;
			case 37 :
				// C:\\Users\\darfores\\git\\asup_0_9_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:198: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA22_eotS =
		"\6\uffff\10\52\1\100\5\52\2\uffff\1\52\1\115\1\uffff\1\117\1\121\4\uffff"+
		"\1\122\2\52\1\uffff\1\125\1\126\1\100\4\52\3\uffff\2\52\2\100\1\uffff"+
		"\2\52\1\100\2\52\1\24\1\52\1\100\5\52\2\uffff\1\52\1\100\3\52\1\153\3"+
		"\100\2\52\14\uffff\6\52\1\100\3\52\1\115\7\52\1\100\1\uffff\10\52\1\25"+
		"\5\52\1\100\1\52\3\100\1\52\1\100\2\52\1\100\1\52\2\100\1\u00b5\37\u00b6"+
		"\1\uffff\2\52\1\u00b8\1\52\4\100\2\52\1\100\1\52\1\100\4\uffff\1\u00b8"+
		"\2\100\1\52\2\100";
	static final String DFA22_eofS =
		"\u00bf\uffff";
	static final String DFA22_minS =
		"\1\11\5\uffff\1\111\1\105\1\47\1\114\1\106\2\105\1\101\1\44\1\117\1\105"+
		"\1\116\1\121\1\105\2\uffff\1\114\1\75\1\uffff\2\75\4\uffff\1\44\2\47\1"+
		"\uffff\1\54\1\60\1\44\3\47\1\101\3\uffff\2\126\2\44\1\uffff\1\122\1\101"+
		"\1\44\1\106\1\111\1\44\1\114\1\44\1\124\1\101\1\132\1\103\1\122\2\uffff"+
		"\1\131\1\44\1\116\1\101\1\117\4\44\1\104\1\114\14\uffff\1\125\1\114\2"+
		"\101\1\117\1\116\1\44\1\124\1\114\1\124\1\44\1\124\1\105\1\117\1\115\1"+
		"\123\1\124\1\122\1\44\1\uffff\1\60\2\61\1\122\1\101\1\61\1\124\1\101\1"+
		"\44\1\47\1\105\1\123\2\114\1\44\1\113\3\44\1\125\1\44\1\116\1\123\1\44"+
		"\1\110\42\44\1\uffff\2\47\1\44\1\105\4\44\1\123\1\104\1\44\1\123\1\44"+
		"\4\uffff\3\44\1\123\2\44";
	static final String DFA22_maxS =
		"\1\u00a7\5\uffff\1\151\1\164\1\145\1\154\1\162\1\165\1\164\1\141\1\u00a7"+
		"\1\163\1\145\1\163\1\161\1\164\2\uffff\1\156\1\75\1\uffff\1\76\1\75\4"+
		"\uffff\1\u00a7\2\47\1\uffff\2\71\1\u00a7\2\162\1\145\1\141\3\uffff\2\166"+
		"\2\u00a7\1\uffff\1\162\1\141\1\u00a7\1\146\1\151\1\u00a7\1\154\1\u00a7"+
		"\1\164\1\141\1\172\1\143\1\162\2\uffff\1\171\1\u00a7\1\156\1\141\1\157"+
		"\4\u00a7\1\144\1\154\14\uffff\1\165\1\154\2\141\1\157\1\156\1\u00a7\1"+
		"\164\1\154\1\164\1\u00a7\1\164\1\145\1\157\1\155\1\163\1\164\1\162\1\u00a7"+
		"\1\uffff\1\71\2\70\1\162\1\166\1\162\1\164\1\171\1\u00a7\1\170\1\145\1"+
		"\163\2\154\1\u00a7\1\153\3\u00a7\1\165\1\u00a7\1\156\1\163\1\u00a7\1\150"+
		"\42\u00a7\1\uffff\2\47\1\u00a7\1\145\4\u00a7\1\163\1\144\1\u00a7\1\163"+
		"\1\u00a7\4\uffff\3\u00a7\1\163\2\u00a7";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\16\uffff\1\7\1\10\2\uffff\1\12\2\uffff\1"+
		"\20\1\21\1\22\1\23\3\uffff\1\34\7\uffff\1\43\1\36\1\45\4\uffff\1\41\15"+
		"\uffff\1\37\1\6\13\uffff\1\13\1\11\1\15\1\14\1\17\1\16\1\24\1\25\1\33"+
		"\1\35\1\44\1\40\23\uffff\1\26\73\uffff\1\31\15\uffff\1\27\1\30\1\32\1"+
		"\42\6\uffff";
	static final String DFA22_specialS =
		"\u00bf\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\54\1\uffff\2\54\22\uffff\1\54\1\27\2\uffff\1\52\1\37\1\25\1\42\1\1"+
			"\1\2\1\35\1\33\1\53\1\34\1\44\1\36\12\43\1\3\1\uffff\1\31\1\30\1\32\2"+
			"\uffff\1\26\1\11\1\52\1\16\1\22\1\51\1\23\1\6\1\21\2\52\1\7\1\17\1\13"+
			"\1\12\1\15\2\52\1\14\1\46\3\52\1\40\1\20\1\10\1\4\1\uffff\1\5\1\uffff"+
			"\1\52\1\uffff\1\26\1\11\1\52\1\45\1\22\1\51\1\23\1\6\1\21\2\52\1\7\1"+
			"\17\1\13\1\12\1\15\2\52\1\14\1\47\3\52\1\41\1\20\1\50\1\uffff\1\24\46"+
			"\uffff\1\52\3\uffff\1\52",
			"",
			"",
			"",
			"",
			"",
			"\1\55\37\uffff\1\55",
			"\1\60\11\uffff\1\56\4\uffff\1\57\20\uffff\1\60\11\uffff\1\56\4\uffff"+
			"\1\57",
			"\1\61\35\uffff\1\62\37\uffff\1\62",
			"\1\63\37\uffff\1\63",
			"\1\65\6\uffff\1\66\1\64\3\uffff\1\67\23\uffff\1\65\6\uffff\1\66\1\64"+
			"\3\uffff\1\67",
			"\1\71\11\uffff\1\72\5\uffff\1\70\17\uffff\1\71\11\uffff\1\72\5\uffff"+
			"\1\70",
			"\1\75\3\uffff\1\74\12\uffff\1\73\20\uffff\1\75\3\uffff\1\74\12\uffff"+
			"\1\73",
			"\1\76\37\uffff\1\76",
			"\1\52\2\uffff\1\77\10\uffff\12\52\7\uffff\1\101\31\52\4\uffff\1\52\1"+
			"\uffff\1\101\31\52\50\uffff\1\52\3\uffff\1\52",
			"\1\103\3\uffff\1\102\33\uffff\1\103\3\uffff\1\102",
			"\1\104\37\uffff\1\104",
			"\1\106\4\uffff\1\105\32\uffff\1\106\4\uffff\1\105",
			"\1\107\37\uffff\1\107",
			"\1\111\16\uffff\1\110\20\uffff\1\111\16\uffff\1\110",
			"",
			"",
			"\1\113\1\uffff\1\112\35\uffff\1\113\1\uffff\1\112",
			"\1\114",
			"",
			"\1\116\1\114",
			"\1\120",
			"",
			"",
			"",
			"",
			"\1\123\34\uffff\32\123\4\uffff\1\123\1\uffff\32\123\50\uffff\1\123\3"+
			"\uffff\1\123",
			"\1\124",
			"\1\124",
			"",
			"\1\53\1\uffff\1\53\1\uffff\12\43",
			"\12\53",
			"\1\52\2\uffff\1\77\10\uffff\12\52\7\uffff\1\101\31\52\4\uffff\1\52\1"+
			"\uffff\1\101\31\52\50\uffff\1\52\3\uffff\1\52",
			"\1\127\52\uffff\1\130\37\uffff\1\130",
			"\1\127\52\uffff\1\130\37\uffff\1\130",
			"\1\61\35\uffff\1\62\37\uffff\1\62",
			"\1\131\37\uffff\1\131",
			"",
			"",
			"",
			"\1\132\37\uffff\1\132",
			"\1\133\37\uffff\1\133",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\136\37\uffff\1\136",
			"\1\137\37\uffff\1\137",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\140\37\uffff\1\140",
			"\1\52\13\uffff\12\52\7\uffff\27\52\1\141\2\52\4\uffff\1\52\1\uffff\27"+
			"\52\1\141\2\52\50\uffff\1\52\3\uffff\1\52",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"\1\145\37\uffff\1\145",
			"\1\146\37\uffff\1\146",
			"",
			"",
			"\1\147\37\uffff\1\147",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\150\37\uffff\1\150",
			"\1\151\37\uffff\1\151",
			"\1\152\37\uffff\1\152",
			"\1\52\13\uffff\12\154\7\uffff\7\52\1\156\2\52\1\163\1\161\1\157\1\52"+
			"\1\160\2\52\1\162\2\52\1\155\5\52\4\uffff\1\52\1\uffff\7\52\1\156\2\52"+
			"\1\163\1\161\1\157\1\52\1\160\2\52\1\162\2\52\1\155\5\52\50\uffff\1\52"+
			"\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\164\37\uffff\1\164",
			"\1\165\37\uffff\1\165",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\166\37\uffff\1\166",
			"\1\167\37\uffff\1\167",
			"\1\170\37\uffff\1\170",
			"\1\171\37\uffff\1\171",
			"\1\172\37\uffff\1\172",
			"\1\173\37\uffff\1\173",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\174\37\uffff\1\174",
			"\1\175\37\uffff\1\175",
			"\1\176\37\uffff\1\176",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\177\37\uffff\1\177",
			"\1\u0080\37\uffff\1\u0080",
			"\1\u0081\37\uffff\1\u0081",
			"\1\u0082\37\uffff\1\u0082",
			"\1\u0083\37\uffff\1\u0083",
			"\1\u0084\37\uffff\1\u0084",
			"\1\u0085\37\uffff\1\u0085",
			"\1\52\13\uffff\1\u0086\11\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52"+
			"\50\uffff\1\52\3\uffff\1\52",
			"",
			"\12\u0087",
			"\10\u0088",
			"\10\u0089",
			"\1\u008a\37\uffff\1\u008a",
			"\7\u008b\16\uffff\1\u008b\12\uffff\7\u008b\16\uffff\1\u008b",
			"\11\u008c\30\uffff\1\u008d\37\uffff\1\u008d",
			"\1\u008e\37\uffff\1\u008e",
			"\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097"+
			"\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\uffff\1\u009d\1\u009e\1\u009f"+
			"\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\7\uffff\1\u008f"+
			"\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
			"\1\u0099\1\u009a\1\u009b\1\u009c\1\uffff\1\u009d\1\u009e\1\u009f\1\u00a0"+
			"\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00a7\60\uffff\1\u00a8\37\uffff\1\u00a9",
			"\1\u00aa\37\uffff\1\u00aa",
			"\1\u00ab\37\uffff\1\u00ab",
			"\1\u00ac\37\uffff\1\u00ac",
			"\1\u00ad\37\uffff\1\u00ad",
			"\1\52\13\uffff\12\52\7\uffff\22\52\1\u00ae\7\52\4\uffff\1\52\1\uffff"+
			"\22\52\1\u00ae\7\52\50\uffff\1\52\3\uffff\1\52",
			"\1\u00af\37\uffff\1\u00af",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00b0\37\uffff\1\u00b0",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00b1\37\uffff\1\u00b1",
			"\1\u00b2\37\uffff\1\u00b2",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00b3\37\uffff\1\u00b3",
			"\1\52\13\uffff\12\52\7\uffff\22\52\1\u00b4\7\52\4\uffff\1\52\1\uffff"+
			"\22\52\1\u00b4\7\52\50\uffff\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"",
			"\1\u00b7",
			"\1\u00b7",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00b9\37\uffff\1\u00b9",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\22\52\1\u00ba\7\52\4\uffff\1\52\1\uffff"+
			"\22\52\1\u00ba\7\52\50\uffff\1\52\3\uffff\1\52",
			"\1\u00bb\37\uffff\1\u00bb",
			"\1\u00bc\37\uffff\1\u00bc",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00bd\37\uffff\1\u00bd",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"",
			"",
			"",
			"",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00be\37\uffff\1\u00be",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52"
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__79 | T__80 | T__81 | T__82 | T__83 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | ALLX | HEX | STRING | INTEGER | FLOAT | DATE | TIME | TIMESTAMP | BOOLEAN | TERM | POINT | WS );";
		}
	}

}
