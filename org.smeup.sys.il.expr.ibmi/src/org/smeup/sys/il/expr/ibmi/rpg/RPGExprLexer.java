// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g 2016-06-03 16:04:41

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

	public RPGExprLexer() {} 
	public RPGExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RPGExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g"; }

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:34:7: ( '(' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:34:9: '('
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:35:7: ( ')' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:35:9: ')'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:36:7: ( ':' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:36:9: ':'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:37:7: ( '[' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:37:9: '['
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:38:7: ( ']' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:38:9: ']'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:233:2: ( ( H I V A L ) | ( L O V A L ) | ( Z E R O S ) | ( Z E R O ) | ( B L A N K ) | ( B L A N K S ) | ( O N ) | ( O F F ) | ( O M I T ) | ( N U L L ) | ( S T A T U S ) | ( P A R M S ) | ( S I Z E ) | ( D ) | ( M S ) | ( Y E A R ) | ( Y E A R S ) | ( M O N T H S ) | ( D A Y S ) | ( N E X T ) | ( I S O ) | ( E Q ) | ( L T ) | ( L E ) | ( G T ) | ( G E ) | ( N E ) )
			int alt1=27;
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
					alt1=23;
					}
					break;
				case 'E':
				case 'e':
					{
					alt1=24;
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
						int LA1_34 = input.LA(4);
						if ( (LA1_34=='O'||LA1_34=='o') ) {
							int LA1_39 = input.LA(5);
							if ( (LA1_39=='S'||LA1_39=='s') ) {
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
									new NoViableAltException("", 1, 34, input);
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
						int LA1_35 = input.LA(4);
						if ( (LA1_35=='N'||LA1_35=='n') ) {
							int LA1_40 = input.LA(5);
							if ( (LA1_40=='K'||LA1_40=='k') ) {
								int LA1_44 = input.LA(6);
								if ( (LA1_44=='S'||LA1_44=='s') ) {
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 35, input);
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
						alt1=27;
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
				int LA1_7 = input.LA(2);
				if ( (LA1_7=='T'||LA1_7=='t') ) {
					alt1=11;
				}
				else if ( (LA1_7=='I'||LA1_7=='i') ) {
					alt1=13;
				}

				else {
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
					int LA1_31 = input.LA(3);
					if ( (LA1_31=='A'||LA1_31=='a') ) {
						int LA1_38 = input.LA(4);
						if ( (LA1_38=='R'||LA1_38=='r') ) {
							int LA1_41 = input.LA(5);
							if ( (LA1_41=='S'||LA1_41=='s') ) {
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
									new NoViableAltException("", 1, 38, input);
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
								new NoViableAltException("", 1, 31, input);
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
				alt1=21;
				}
				break;
			case 'E':
			case 'e':
				{
				alt1=22;
				}
				break;
			case 'G':
			case 'g':
				{
				int LA1_14 = input.LA(2);
				if ( (LA1_14=='T'||LA1_14=='t') ) {
					alt1=25;
				}
				else if ( (LA1_14=='E'||LA1_14=='e') ) {
					alt1=26;
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:233:4: ( H I V A L )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:233:4: ( H I V A L )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:233:6: H I V A L
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:235:3: ( L O V A L )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:235:3: ( L O V A L )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:235:5: L O V A L
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:237:3: ( Z E R O S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:237:3: ( Z E R O S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:237:5: Z E R O S
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:239:3: ( Z E R O )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:239:3: ( Z E R O )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:239:5: Z E R O
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:241:3: ( B L A N K )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:241:3: ( B L A N K )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:241:5: B L A N K
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:243:3: ( B L A N K S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:243:3: ( B L A N K S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:243:5: B L A N K S
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:245:3: ( O N )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:245:3: ( O N )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:245:5: O N
					{
					mO(); 

					mN(); 

					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:3: ( O F F )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:3: ( O F F )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:5: O F F
					{
					mO(); 

					mF(); 

					mF(); 

					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:3: ( O M I T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:3: ( O M I T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:5: O M I T
					{
					mO(); 

					mM(); 

					mI(); 

					mT(); 

					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:251:3: ( N U L L )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:251:3: ( N U L L )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:251:5: N U L L
					{
					mN(); 

					mU(); 

					mL(); 

					mL(); 

					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:253:3: ( S T A T U S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:253:3: ( S T A T U S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:253:5: S T A T U S
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:255:3: ( P A R M S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:255:3: ( P A R M S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:255:5: P A R M S
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:257:3: ( S I Z E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:257:3: ( S I Z E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:257:5: S I Z E
					{
					mS(); 

					mI(); 

					mZ(); 

					mE(); 

					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:259:3: ( D )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:261:3: ( M S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:261:3: ( M S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:261:5: M S
					{
					mM(); 

					mS(); 

					}

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:263:3: ( Y E A R )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:263:3: ( Y E A R )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:263:5: Y E A R
					{
					mY(); 

					mE(); 

					mA(); 

					mR(); 

					}

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:265:3: ( Y E A R S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:265:3: ( Y E A R S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:265:5: Y E A R S
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:267:3: ( M O N T H S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:267:3: ( M O N T H S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:267:5: M O N T H S
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:269:3: ( D A Y S )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:269:3: ( D A Y S )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:269:5: D A Y S
					{
					mD(); 

					mA(); 

					mY(); 

					mS(); 

					}

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:271:3: ( N E X T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:271:3: ( N E X T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:271:5: N E X T
					{
					mN(); 

					mE(); 

					mX(); 

					mT(); 

					}

					}
					break;
				case 21 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:273:3: ( I S O )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:273:3: ( I S O )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:273:4: I S O
					{
					mI(); 

					mS(); 

					mO(); 

					}

					}
					break;
				case 22 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:275:3: ( E Q )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:275:3: ( E Q )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:275:5: E Q
					{
					mE(); 

					mQ(); 

					}

					}
					break;
				case 23 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:277:3: ( L T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:277:3: ( L T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:277:5: L T
					{
					mL(); 

					mT(); 

					}

					}
					break;
				case 24 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:279:3: ( L E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:279:3: ( L E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:279:5: L E
					{
					mL(); 

					mE(); 

					}

					}
					break;
				case 25 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:281:3: ( G T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:281:3: ( G T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:281:5: G T
					{
					mG(); 

					mT(); 

					}

					}
					break;
				case 26 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:283:3: ( G E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:283:3: ( G E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:283:5: G E
					{
					mG(); 

					mE(); 

					}

					}
					break;
				case 27 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:285:3: ( N E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:285:3: ( N E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:285:5: N E
					{
					mN(); 

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
	// $ANTLR end "SPECIAL"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:5: ( '||' | ( O R ) )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:8: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:15: ( O R )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:15: ( O R )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:288:16: O R
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:289:6: ( '&&' | ( A N D ) )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:289:9: '&&'
					{
					match("&&"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:289:16: ( A N D )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:289:16: ( A N D )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:289:17: A N D
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:5: ( '!' | ( N O T ) )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:7: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:14: ( N O T )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:14: ( N O T )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:290:15: N O T
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:292:4: ( '=' | '==' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:292:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:292:13: '=='
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:293:4: ( '!=' | '<>' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:293:6: '!='
					{
					match("!="); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:293:13: '<>'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:294:4: ( '<' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:294:6: '<'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:295:6: ( '<=' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:295:8: '<='
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:296:4: ( '>' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:296:6: '>'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:6: ( '>=' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:8: '>='
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:6: ( '+' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:8: '+'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:300:7: ( '-' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:300:9: '-'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:301:6: ( '*' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:301:8: '*'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:302:5: ( '/' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:302:7: '/'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:303:5: ( '%' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:303:7: '%'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:307:9: ( '%' TERM )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:307:11: '%' TERM
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:310:5: ( I N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:311:2: I N
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:314:6: ( I N ( '0' .. '9' ) ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:315:2: I N ( '0' .. '9' ) ( '0' .. '9' )
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:318:6: ( I N U ( '1' .. '8' ) | I N H ( '1' .. '8' ) | I N M R | I N O ( A | B | C | D | E | F | G | V ) | I N L ( '1' .. '9' ) | I N L R | I N R T | I N K A | I N K B | I N K C | I N K D | I N K E | I N K F | I N K G | I N K H | I N K I | I N K J | I N K K | I N K L | I N K M | I N K N | I N K P | I N K Q | I N K R | I N K S | I N K T | I N K U | I N K V | I N K W | I N K X | I N K Y )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:320:2: I N U ( '1' .. '8' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:322:2: I N H ( '1' .. '8' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:324:2: I N M R
					{
					mI(); 

					mN(); 

					mM(); 

					mR(); 

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:326:2: I N O ( A | B | C | D | E | F | G | V )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:328:2: I N L ( '1' .. '9' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:330:2: I N L R
					{
					mI(); 

					mN(); 

					mL(); 

					mR(); 

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:332:2: I N R T
					{
					mI(); 

					mN(); 

					mR(); 

					mT(); 

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:334:2: I N K A
					{
					mI(); 

					mN(); 

					mK(); 

					mA(); 

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:336:2: I N K B
					{
					mI(); 

					mN(); 

					mK(); 

					mB(); 

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:338:2: I N K C
					{
					mI(); 

					mN(); 

					mK(); 

					mC(); 

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:340:2: I N K D
					{
					mI(); 

					mN(); 

					mK(); 

					mD(); 

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:342:2: I N K E
					{
					mI(); 

					mN(); 

					mK(); 

					mE(); 

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:344:2: I N K F
					{
					mI(); 

					mN(); 

					mK(); 

					mF(); 

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:346:2: I N K G
					{
					mI(); 

					mN(); 

					mK(); 

					mG(); 

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:348:2: I N K H
					{
					mI(); 

					mN(); 

					mK(); 

					mH(); 

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:350:2: I N K I
					{
					mI(); 

					mN(); 

					mK(); 

					mI(); 

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:352:2: I N K J
					{
					mI(); 

					mN(); 

					mK(); 

					mJ(); 

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:354:2: I N K K
					{
					mI(); 

					mN(); 

					mK(); 

					mK(); 

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:2: I N K L
					{
					mI(); 

					mN(); 

					mK(); 

					mL(); 

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:358:2: I N K M
					{
					mI(); 

					mN(); 

					mK(); 

					mM(); 

					}
					break;
				case 21 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:360:2: I N K N
					{
					mI(); 

					mN(); 

					mK(); 

					mN(); 

					}
					break;
				case 22 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:362:2: I N K P
					{
					mI(); 

					mN(); 

					mK(); 

					mP(); 

					}
					break;
				case 23 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:364:2: I N K Q
					{
					mI(); 

					mN(); 

					mK(); 

					mQ(); 

					}
					break;
				case 24 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:366:2: I N K R
					{
					mI(); 

					mN(); 

					mK(); 

					mR(); 

					}
					break;
				case 25 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:368:2: I N K S
					{
					mI(); 

					mN(); 

					mK(); 

					mS(); 

					}
					break;
				case 26 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:370:2: I N K T
					{
					mI(); 

					mN(); 

					mK(); 

					mT(); 

					}
					break;
				case 27 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:372:2: I N K U
					{
					mI(); 

					mN(); 

					mK(); 

					mU(); 

					}
					break;
				case 28 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:374:2: I N K V
					{
					mI(); 

					mN(); 

					mK(); 

					mV(); 

					}
					break;
				case 29 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:376:2: I N K W
					{
					mI(); 

					mN(); 

					mK(); 

					mW(); 

					}
					break;
				case 30 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:378:2: I N K X
					{
					mI(); 

					mN(); 

					mK(); 

					mX(); 

					}
					break;
				case 31 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:380:2: I N K Y
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:384:5: ( A L L '\\'' (~ ( '\\'' | '\\r' | '\\n' | '\\t' ) )+ '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:385:2: A L L '\\'' (~ ( '\\'' | '\\r' | '\\n' | '\\t' ) )+ '\\''
			{
			mA(); 

			mL(); 

			mL(); 

			match('\''); 
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:385:13: (~ ( '\\'' | '\\r' | '\\n' | '\\t' ) )+
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:388:9: ( A L L HEX )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:389:2: A L L HEX
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:5: ( ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:9: ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:9: ( 'X\\'' | 'x\\'' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:10: 'X\\''
					{
					match("X'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:16: 'x\\''
					{
					match("x'"); 

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:23: ( HexDigit )+
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:398:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:398:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:400:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:400:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:401:4: c=~ ( '\\'' | '\\r' | '\\n' )
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:410:2: ( ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:410:4: ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:410:4: ( '0' .. '9' )+
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:414:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:414:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:414:4: ( '0' .. '9' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:414:30: ( '0' .. '9' )+
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:3: ( ( 'D\\'' | 'd\\'' ) DIGIT DIGIT DIGIT DIGIT '-' DIGIT ( DIGIT )* '-' DIGIT ( DIGIT )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:5: ( 'D\\'' | 'd\\'' ) DIGIT DIGIT DIGIT DIGIT '-' DIGIT ( DIGIT )* '-' DIGIT ( DIGIT )* '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:5: ( 'D\\'' | 'd\\'' )
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:6: 'D\\''
					{
					match("D'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:12: 'd\\''
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

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:53: ( DIGIT )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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

			match('-'); 
			mDIGIT(); 

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:72: ( DIGIT )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
	// $ANTLR end "DATE"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:422:3: ( ( 'T\\'' | 't\\'' ) ( DIGIT )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:422:5: ( 'T\\'' | 't\\'' ) ( DIGIT )* '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:422:5: ( 'T\\'' | 't\\'' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='T') ) {
				alt18=1;
			}
			else if ( (LA18_0=='t') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:422:6: 'T\\''
					{
					match("T'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:422:12: 't\\''
					{
					match("t'"); 

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:422:19: ( DIGIT )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					break loop19;
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:426:3: ( ( 'Z\\'' | 'z\\'' ) ( DIGIT )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:426:5: ( 'Z\\'' | 'z\\'' ) ( DIGIT )* '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:426:5: ( 'Z\\'' | 'z\\'' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='Z') ) {
				alt20=1;
			}
			else if ( (LA20_0=='z') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:426:6: 'Z\\''
					{
					match("Z'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:426:12: 'z\\''
					{
					match("z'"); 

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:426:19: ( DIGIT )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					break loop21;
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
	// $ANTLR end "TIMESTAMP"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:2: ( ( T R U E ) | ( F A L S E ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='T'||LA22_0=='t') ) {
				alt22=1;
			}
			else if ( (LA22_0=='F'||LA22_0=='f') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:4: ( T R U E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:4: ( T R U E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:431:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:432:4: ( F A L S E )
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:432:4: ( F A L S E )
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:432:5: F A L S E
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:437:2: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:437:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:437:11: ( LETTER | DIGIT )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0=='$'||(LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')||LA23_0=='\u00A3'||LA23_0=='\u00A7') ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					break loop23;
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:441:3: ( '.' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:441:5: '.'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:445:3: ( ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:449:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '_' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:453:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:458:2: ( '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:458:4: '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			{
			match('\\'); 
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:459:4: ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			int alt24=6;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt24=1;
				}
				break;
			case 'r':
				{
				alt24=2;
				}
				break;
			case 't':
				{
				alt24=3;
				}
				break;
			case '\'':
				{
				alt24=4;
				}
				break;
			case '\\':
				{
				alt24=5;
				}
				break;
			case 'u':
				{
				alt24=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:460:5: 'n'
					{
					match('n'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:461:4: 'r'
					{
					match('r'); 
					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:462:4: 't'
					{
					match('t'); 
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:463:4: '\\''
					{
					match('\''); 
					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:464:4: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:465:4: UnicodeEscape
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:470:6: ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:470:12: 'u' HexDigit HexDigit HexDigit HexDigit
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:474:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:477:3: ( ( ',' | '.' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:482:11: ( ( 'a' | 'A' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:483:11: ( ( 'b' | 'B' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:484:11: ( ( 'c' | 'C' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:485:11: ( ( 'd' | 'D' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:486:11: ( ( 'e' | 'E' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:487:11: ( ( 'f' | 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:488:11: ( ( 'g' | 'G' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:489:11: ( ( 'h' | 'H' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:490:11: ( ( 'i' | 'I' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:491:11: ( ( 'j' | 'J' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:492:11: ( ( 'k' | 'K' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:493:11: ( ( 'l' | 'L' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:494:11: ( ( 'm' | 'M' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:495:11: ( ( 'n' | 'N' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:496:11: ( ( 'o' | 'O' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:497:11: ( ( 'p' | 'P' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:498:11: ( ( 'q' | 'Q' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:499:11: ( ( 'r' | 'R' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:500:11: ( ( 's' | 'S' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:501:11: ( ( 't' | 'T' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:502:11: ( ( 'u' | 'U' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:503:11: ( ( 'v' | 'V' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:504:11: ( ( 'w' | 'W' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:505:11: ( ( 'x' | 'X' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:506:11: ( ( 'y' | 'Y' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:507:11: ( ( 'z' | 'Z' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:513:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:513:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
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
		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:8: ( T__79 | T__80 | T__81 | T__82 | T__83 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | ALLX | HEX | STRING | INTEGER | FLOAT | DATE | TIME | TIMESTAMP | BOOLEAN | TERM | POINT | WS )
		int alt25=37;
		alt25 = dfa25.predict(input);
		switch (alt25) {
			case 1 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:10: T__79
				{
				mT__79(); 

				}
				break;
			case 2 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:16: T__80
				{
				mT__80(); 

				}
				break;
			case 3 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:22: T__81
				{
				mT__81(); 

				}
				break;
			case 4 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:28: T__82
				{
				mT__82(); 

				}
				break;
			case 5 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:34: T__83
				{
				mT__83(); 

				}
				break;
			case 6 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:40: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 7 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:48: OR
				{
				mOR(); 

				}
				break;
			case 8 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:51: AND
				{
				mAND(); 

				}
				break;
			case 9 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:55: NOT
				{
				mNOT(); 

				}
				break;
			case 10 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:59: EQ
				{
				mEQ(); 

				}
				break;
			case 11 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:62: NE
				{
				mNE(); 

				}
				break;
			case 12 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:65: LT
				{
				mLT(); 

				}
				break;
			case 13 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:68: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 14 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:73: GT
				{
				mGT(); 

				}
				break;
			case 15 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:76: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 16 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:81: PLUS
				{
				mPLUS(); 

				}
				break;
			case 17 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:86: MINUS
				{
				mMINUS(); 

				}
				break;
			case 18 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:92: MULT
				{
				mMULT(); 

				}
				break;
			case 19 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:97: DIV
				{
				mDIV(); 

				}
				break;
			case 20 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:101: MOD
				{
				mMOD(); 

				}
				break;
			case 21 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:105: BI_FUN
				{
				mBI_FUN(); 

				}
				break;
			case 22 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:112: IN
				{
				mIN(); 

				}
				break;
			case 23 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:115: INNR
				{
				mINNR(); 

				}
				break;
			case 24 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:120: INNU
				{
				mINNU(); 

				}
				break;
			case 25 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:125: ALL
				{
				mALL(); 

				}
				break;
			case 26 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:129: ALLX
				{
				mALLX(); 

				}
				break;
			case 27 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:134: HEX
				{
				mHEX(); 

				}
				break;
			case 28 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:138: STRING
				{
				mSTRING(); 

				}
				break;
			case 29 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:145: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 30 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:153: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 31 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:159: DATE
				{
				mDATE(); 

				}
				break;
			case 32 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:164: TIME
				{
				mTIME(); 

				}
				break;
			case 33 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:169: TIMESTAMP
				{
				mTIMESTAMP(); 

				}
				break;
			case 34 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:179: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 35 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:187: TERM
				{
				mTERM(); 

				}
				break;
			case 36 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:192: POINT
				{
				mPOINT(); 

				}
				break;
			case 37 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:198: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA25 dfa25 = new DFA25(this);
	static final String DFA25_eotS =
		"\6\uffff\10\52\1\77\5\52\2\uffff\1\52\1\114\1\uffff\1\116\1\120\4\uffff"+
		"\1\121\2\52\1\uffff\1\124\1\125\1\77\4\52\3\uffff\2\52\2\77\1\uffff\2"+
		"\52\1\77\2\52\1\24\1\52\1\77\4\52\2\uffff\1\52\1\77\3\52\1\151\3\77\2"+
		"\52\14\uffff\6\52\1\77\3\52\1\114\6\52\1\77\1\uffff\10\52\1\25\5\52\1"+
		"\77\1\52\3\77\1\52\1\77\1\52\1\77\1\52\1\77\1\u00b0\37\u00b1\1\uffff\2"+
		"\52\1\u00b3\1\52\4\77\1\52\1\77\1\52\1\77\4\uffff\1\u00b3\3\77";
	static final String DFA25_eofS =
		"\u00b8\uffff";
	static final String DFA25_minS =
		"\1\11\5\uffff\1\111\1\105\1\47\1\114\1\106\1\105\1\111\1\101\1\44\1\117"+
		"\1\105\1\116\1\121\1\105\2\uffff\1\114\1\75\1\uffff\2\75\4\uffff\1\44"+
		"\2\47\1\uffff\1\54\1\60\1\44\3\47\1\101\3\uffff\2\126\2\44\1\uffff\1\122"+
		"\1\101\1\44\1\106\1\111\1\44\1\114\1\44\1\124\1\101\1\132\1\122\2\uffff"+
		"\1\131\1\44\1\116\1\101\1\117\4\44\1\104\1\114\14\uffff\1\125\1\114\2"+
		"\101\1\117\1\116\1\44\1\124\1\114\1\124\1\44\1\124\1\105\1\115\1\123\1"+
		"\124\1\122\1\44\1\uffff\1\60\2\61\1\122\1\101\1\61\1\124\1\101\1\44\1"+
		"\47\1\105\1\123\2\114\1\44\1\113\3\44\1\125\1\44\1\123\1\44\1\110\41\44"+
		"\1\uffff\2\47\1\44\1\105\4\44\1\123\1\44\1\123\1\44\4\uffff\4\44";
	static final String DFA25_maxS =
		"\1\u00a7\5\uffff\1\151\1\164\1\145\1\154\1\162\1\165\1\164\1\141\1\u00a7"+
		"\1\163\1\145\1\163\1\161\1\164\2\uffff\1\156\1\75\1\uffff\1\76\1\75\4"+
		"\uffff\1\u00a7\2\47\1\uffff\2\71\1\u00a7\2\162\1\145\1\141\3\uffff\2\166"+
		"\2\u00a7\1\uffff\1\162\1\141\1\u00a7\1\146\1\151\1\u00a7\1\154\1\u00a7"+
		"\1\164\1\141\1\172\1\162\2\uffff\1\171\1\u00a7\1\156\1\141\1\157\4\u00a7"+
		"\1\144\1\154\14\uffff\1\165\1\154\2\141\1\157\1\156\1\u00a7\1\164\1\154"+
		"\1\164\1\u00a7\1\164\1\145\1\155\1\163\1\164\1\162\1\u00a7\1\uffff\1\71"+
		"\2\70\1\162\1\166\1\162\1\164\1\171\1\u00a7\1\170\1\145\1\163\2\154\1"+
		"\u00a7\1\153\3\u00a7\1\165\1\u00a7\1\163\1\u00a7\1\150\41\u00a7\1\uffff"+
		"\2\47\1\u00a7\1\145\4\u00a7\1\163\1\u00a7\1\163\1\u00a7\4\uffff\4\u00a7";
	static final String DFA25_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\16\uffff\1\7\1\10\2\uffff\1\12\2\uffff\1"+
		"\20\1\21\1\22\1\23\3\uffff\1\34\7\uffff\1\43\1\36\1\45\4\uffff\1\41\14"+
		"\uffff\1\37\1\6\13\uffff\1\13\1\11\1\15\1\14\1\17\1\16\1\24\1\25\1\33"+
		"\1\35\1\44\1\40\22\uffff\1\26\71\uffff\1\31\14\uffff\1\27\1\30\1\32\1"+
		"\42\4\uffff";
	static final String DFA25_specialS =
		"\u00b8\uffff}>";
	static final String[] DFA25_transitionS = {
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
			"\1\74\12\uffff\1\73\24\uffff\1\74\12\uffff\1\73",
			"\1\75\37\uffff\1\75",
			"\1\52\2\uffff\1\76\10\uffff\12\52\7\uffff\1\100\31\52\4\uffff\1\52\1"+
			"\uffff\1\100\31\52\50\uffff\1\52\3\uffff\1\52",
			"\1\102\3\uffff\1\101\33\uffff\1\102\3\uffff\1\101",
			"\1\103\37\uffff\1\103",
			"\1\105\4\uffff\1\104\32\uffff\1\105\4\uffff\1\104",
			"\1\106\37\uffff\1\106",
			"\1\110\16\uffff\1\107\20\uffff\1\110\16\uffff\1\107",
			"",
			"",
			"\1\112\1\uffff\1\111\35\uffff\1\112\1\uffff\1\111",
			"\1\113",
			"",
			"\1\115\1\113",
			"\1\117",
			"",
			"",
			"",
			"",
			"\1\122\34\uffff\32\122\4\uffff\1\122\1\uffff\32\122\50\uffff\1\122\3"+
			"\uffff\1\122",
			"\1\123",
			"\1\123",
			"",
			"\1\53\1\uffff\1\53\1\uffff\12\43",
			"\12\53",
			"\1\52\2\uffff\1\76\10\uffff\12\52\7\uffff\1\100\31\52\4\uffff\1\52\1"+
			"\uffff\1\100\31\52\50\uffff\1\52\3\uffff\1\52",
			"\1\126\52\uffff\1\127\37\uffff\1\127",
			"\1\126\52\uffff\1\127\37\uffff\1\127",
			"\1\61\35\uffff\1\62\37\uffff\1\62",
			"\1\130\37\uffff\1\130",
			"",
			"",
			"",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\135\37\uffff\1\135",
			"\1\136\37\uffff\1\136",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\137\37\uffff\1\137",
			"\1\52\13\uffff\12\52\7\uffff\27\52\1\140\2\52\4\uffff\1\52\1\uffff\27"+
			"\52\1\140\2\52\50\uffff\1\52\3\uffff\1\52",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"",
			"",
			"\1\145\37\uffff\1\145",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\146\37\uffff\1\146",
			"\1\147\37\uffff\1\147",
			"\1\150\37\uffff\1\150",
			"\1\52\13\uffff\12\152\7\uffff\7\52\1\154\2\52\1\161\1\157\1\155\1\52"+
			"\1\156\2\52\1\160\2\52\1\153\5\52\4\uffff\1\52\1\uffff\7\52\1\154\2\52"+
			"\1\161\1\157\1\155\1\52\1\156\2\52\1\160\2\52\1\153\5\52\50\uffff\1\52"+
			"\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\162\37\uffff\1\162",
			"\1\163\37\uffff\1\163",
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
			"\1\164\37\uffff\1\164",
			"\1\165\37\uffff\1\165",
			"\1\166\37\uffff\1\166",
			"\1\167\37\uffff\1\167",
			"\1\170\37\uffff\1\170",
			"\1\171\37\uffff\1\171",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\172\37\uffff\1\172",
			"\1\173\37\uffff\1\173",
			"\1\174\37\uffff\1\174",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\175\37\uffff\1\175",
			"\1\176\37\uffff\1\176",
			"\1\177\37\uffff\1\177",
			"\1\u0080\37\uffff\1\u0080",
			"\1\u0081\37\uffff\1\u0081",
			"\1\u0082\37\uffff\1\u0082",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"",
			"\12\u0083",
			"\10\u0084",
			"\10\u0085",
			"\1\u0086\37\uffff\1\u0086",
			"\7\u0087\16\uffff\1\u0087\12\uffff\7\u0087\16\uffff\1\u0087",
			"\11\u0088\30\uffff\1\u0089\37\uffff\1\u0089",
			"\1\u008a\37\uffff\1\u008a",
			"\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
			"\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\uffff\1\u0099\1\u009a\1\u009b"+
			"\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\7\uffff\1\u008b"+
			"\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
			"\1\u0095\1\u0096\1\u0097\1\u0098\1\uffff\1\u0099\1\u009a\1\u009b\1\u009c"+
			"\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00a3\60\uffff\1\u00a4\37\uffff\1\u00a5",
			"\1\u00a6\37\uffff\1\u00a6",
			"\1\u00a7\37\uffff\1\u00a7",
			"\1\u00a8\37\uffff\1\u00a8",
			"\1\u00a9\37\uffff\1\u00a9",
			"\1\52\13\uffff\12\52\7\uffff\22\52\1\u00aa\7\52\4\uffff\1\52\1\uffff"+
			"\22\52\1\u00aa\7\52\50\uffff\1\52\3\uffff\1\52",
			"\1\u00ab\37\uffff\1\u00ab",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00ac\37\uffff\1\u00ac",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00ad\37\uffff\1\u00ad",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00ae\37\uffff\1\u00ae",
			"\1\52\13\uffff\12\52\7\uffff\22\52\1\u00af\7\52\4\uffff\1\52\1\uffff"+
			"\22\52\1\u00af\7\52\50\uffff\1\52\3\uffff\1\52",
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
			"\1\u00b2",
			"\1\u00b2",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00b4\37\uffff\1\u00b4",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\52\13\uffff\12\52\7\uffff\22\52\1\u00b5\7\52\4\uffff\1\52\1\uffff"+
			"\22\52\1\u00b5\7\52\50\uffff\1\52\3\uffff\1\52",
			"\1\u00b6\37\uffff\1\u00b6",
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52",
			"\1\u00b7\37\uffff\1\u00b7",
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
			"\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52\50\uffff"+
			"\1\52\3\uffff\1\52"
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__79 | T__80 | T__81 | T__82 | T__83 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | ALLX | HEX | STRING | INTEGER | FLOAT | DATE | TIME | TIMESTAMP | BOOLEAN | TERM | POINT | WS );";
		}
	}

}
