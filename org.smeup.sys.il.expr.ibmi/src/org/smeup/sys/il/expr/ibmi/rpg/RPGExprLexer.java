// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g 2015-07-14 14:24:04

  package org.smeup.sys.il.expr.ibmi.rpg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RPGExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
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
	public static final int DATETIME=15;
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
	public static final int U=66;
	public static final int USER_FUNCTION=67;
	public static final int UnicodeEscape=68;
	public static final int V=69;
	public static final int W=70;
	public static final int WS=71;
	public static final int X=72;
	public static final int Y=73;
	public static final int Z=74;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g"; }

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:11:7: ( '(' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:11:9: '('
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:12:7: ( ')' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:12:9: ')'
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:13:7: ( ':' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:13:9: ':'
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
	// $ANTLR end "T__77"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:2: ( ( H I V A L ) | ( L O V A L ) | ( Z E R O S ) | ( Z E R O ) | ( B L A N K ) | ( B L A N K S ) | ( O N ) | ( O F F ) | ( O M I T ) | ( N U L L ) | ( S T A T U S ) | ( P A R M S ) | ( M S ) | ( Y E A R ) | ( N E X T ) )
			int alt1=15;
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
				alt1=2;
				}
				break;
			case 'Z':
			case 'z':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='E'||LA1_3=='e') ) {
					int LA1_11 = input.LA(3);
					if ( (LA1_11=='R'||LA1_11=='r') ) {
						int LA1_18 = input.LA(4);
						if ( (LA1_18=='O'||LA1_18=='o') ) {
							int LA1_20 = input.LA(5);
							if ( (LA1_20=='S'||LA1_20=='s') ) {
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 11, input);
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
					int LA1_12 = input.LA(3);
					if ( (LA1_12=='A'||LA1_12=='a') ) {
						int LA1_19 = input.LA(4);
						if ( (LA1_19=='N'||LA1_19=='n') ) {
							int LA1_21 = input.LA(5);
							if ( (LA1_21=='K'||LA1_21=='k') ) {
								int LA1_24 = input.LA(6);
								if ( (LA1_24=='S'||LA1_24=='s') ) {
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
										new NoViableAltException("", 1, 21, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 12, input);
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
					alt1=15;
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
				alt1=11;
				}
				break;
			case 'P':
			case 'p':
				{
				alt1=12;
				}
				break;
			case 'M':
			case 'm':
				{
				alt1=13;
				}
				break;
			case 'Y':
			case 'y':
				{
				alt1=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:4: ( H I V A L )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:4: ( H I V A L )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:216:6: H I V A L
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:218:3: ( L O V A L )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:218:3: ( L O V A L )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:218:5: L O V A L
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:220:3: ( Z E R O S )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:220:3: ( Z E R O S )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:220:5: Z E R O S
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:222:3: ( Z E R O )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:222:3: ( Z E R O )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:222:5: Z E R O
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:224:3: ( B L A N K )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:224:3: ( B L A N K )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:224:5: B L A N K
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:226:3: ( B L A N K S )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:226:3: ( B L A N K S )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:226:5: B L A N K S
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:228:3: ( O N )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:228:3: ( O N )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:228:5: O N
					{
					mO(); 

					mN(); 

					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:230:3: ( O F F )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:230:3: ( O F F )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:230:5: O F F
					{
					mO(); 

					mF(); 

					mF(); 

					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:232:3: ( O M I T )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:232:3: ( O M I T )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:232:5: O M I T
					{
					mO(); 

					mM(); 

					mI(); 

					mT(); 

					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:234:3: ( N U L L )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:234:3: ( N U L L )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:234:5: N U L L
					{
					mN(); 

					mU(); 

					mL(); 

					mL(); 

					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:236:3: ( S T A T U S )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:236:3: ( S T A T U S )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:236:5: S T A T U S
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:3: ( P A R M S )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:3: ( P A R M S )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:238:5: P A R M S
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:240:3: ( M S )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:240:3: ( M S )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:240:5: M S
					{
					mM(); 

					mS(); 

					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:242:3: ( Y E A R )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:242:3: ( Y E A R )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:242:5: Y E A R
					{
					mY(); 

					mE(); 

					mA(); 

					mR(); 

					}

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:244:3: ( N E X T )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:244:3: ( N E X T )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:244:5: N E X T
					{
					mN(); 

					mE(); 

					mX(); 

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
	// $ANTLR end "SPECIAL"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:5: ( '||' | ( O R ) )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:8: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:15: ( O R )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:15: ( O R )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:247:16: O R
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:6: ( '&&' | ( A N D ) )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:9: '&&'
					{
					match("&&"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:16: ( A N D )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:16: ( A N D )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:248:17: A N D
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:5: ( '!' | ( N O T ) )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:7: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:14: ( N O T )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:14: ( N O T )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:249:15: N O T
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:251:4: ( '=' | '==' )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:251:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:251:13: '=='
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:252:4: ( '!=' | '<>' )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:252:6: '!='
					{
					match("!="); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:252:13: '<>'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:253:4: ( '<' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:253:6: '<'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:254:6: ( '<=' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:254:8: '<='
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:255:4: ( '>' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:255:6: '>'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:256:6: ( '>=' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:256:8: '>='
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:258:6: ( '+' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:258:8: '+'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:259:7: ( '-' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:259:9: '-'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:260:6: ( '*' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:260:8: '*'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:261:5: ( '/' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:261:7: '/'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:262:5: ( '%' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:262:7: '%'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:266:9: ( '%' TERM )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:266:11: '%' TERM
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:281:5: ( MULT I N )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:282:2: MULT I N
			{
			mMULT(); 

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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:285:6: ( MULT I N ( '0' .. '9' ) ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:286:2: MULT I N ( '0' .. '9' ) ( '0' .. '9' )
			{
			mMULT(); 

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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:289:6: ( MULT I N U ( '1' .. '8' ) | MULT I N H ( '1' .. '8' ) | MULT I N M R | MULT I N O ( A | G | V | F ) | MULT I N L ( '1' .. '9' ) | MULT I N L R | MULT I N R T | MULT I N K A | MULT I N K B | MULT I N K C | MULT I N K D | MULT I N K E | MULT I N K F | MULT I N K G | MULT I N K H | MULT I N K I | MULT I N K L | MULT I N K M | MULT I N K N | MULT I N K P | MULT I N K Q | MULT I N K R | MULT I N K S | MULT I N K T | MULT I N K U | MULT I N K V | MULT I N K W | MULT I N K X | MULT I N K Y )
			int alt7=29;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='*') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='I'||LA7_1=='i') ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2=='N'||LA7_2=='n') ) {
						switch ( input.LA(4) ) {
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
							int LA7_8 = input.LA(5);
							if ( ((LA7_8 >= '1' && LA7_8 <= '9')) ) {
								alt7=5;
							}
							else if ( (LA7_8=='R'||LA7_8=='r') ) {
								alt7=6;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 8, input);
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
							switch ( input.LA(5) ) {
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
							case 'L':
							case 'l':
								{
								alt7=17;
								}
								break;
							case 'M':
							case 'm':
								{
								alt7=18;
								}
								break;
							case 'N':
							case 'n':
								{
								alt7=19;
								}
								break;
							case 'P':
							case 'p':
								{
								alt7=20;
								}
								break;
							case 'Q':
							case 'q':
								{
								alt7=21;
								}
								break;
							case 'R':
							case 'r':
								{
								alt7=22;
								}
								break;
							case 'S':
							case 's':
								{
								alt7=23;
								}
								break;
							case 'T':
							case 't':
								{
								alt7=24;
								}
								break;
							case 'U':
							case 'u':
								{
								alt7=25;
								}
								break;
							case 'V':
							case 'v':
								{
								alt7=26;
								}
								break;
							case 'W':
							case 'w':
								{
								alt7=27;
								}
								break;
							case 'X':
							case 'x':
								{
								alt7=28;
								}
								break;
							case 'Y':
							case 'y':
								{
								alt7=29;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 10, input);
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 3, input);
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:291:2: MULT I N U ( '1' .. '8' )
					{
					mMULT(); 

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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:293:2: MULT I N H ( '1' .. '8' )
					{
					mMULT(); 

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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:295:2: MULT I N M R
					{
					mMULT(); 

					mI(); 

					mN(); 

					mM(); 

					mR(); 

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:297:2: MULT I N O ( A | G | V | F )
					{
					mMULT(); 

					mI(); 

					mN(); 

					mO(); 

					if ( input.LA(1)=='A'||(input.LA(1) >= 'F' && input.LA(1) <= 'G')||input.LA(1)=='V'||input.LA(1)=='a'||(input.LA(1) >= 'f' && input.LA(1) <= 'g')||input.LA(1)=='v' ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:299:2: MULT I N L ( '1' .. '9' )
					{
					mMULT(); 

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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:301:2: MULT I N L R
					{
					mMULT(); 

					mI(); 

					mN(); 

					mL(); 

					mR(); 

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:303:2: MULT I N R T
					{
					mMULT(); 

					mI(); 

					mN(); 

					mR(); 

					mT(); 

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:305:2: MULT I N K A
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mA(); 

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:307:2: MULT I N K B
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mB(); 

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:309:2: MULT I N K C
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mC(); 

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:311:2: MULT I N K D
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mD(); 

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:313:2: MULT I N K E
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mE(); 

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:315:2: MULT I N K F
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mF(); 

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:317:2: MULT I N K G
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mG(); 

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:319:2: MULT I N K H
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mH(); 

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:321:2: MULT I N K I
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mI(); 

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:323:2: MULT I N K L
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mL(); 

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:325:2: MULT I N K M
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mM(); 

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:327:2: MULT I N K N
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mN(); 

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:329:2: MULT I N K P
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mP(); 

					}
					break;
				case 21 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:331:2: MULT I N K Q
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mQ(); 

					}
					break;
				case 22 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:333:2: MULT I N K R
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mR(); 

					}
					break;
				case 23 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:335:2: MULT I N K S
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mS(); 

					}
					break;
				case 24 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:337:2: MULT I N K T
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mT(); 

					}
					break;
				case 25 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:339:2: MULT I N K U
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mU(); 

					}
					break;
				case 26 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:341:2: MULT I N K V
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mV(); 

					}
					break;
				case 27 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:343:2: MULT I N K W
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mW(); 

					}
					break;
				case 28 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:345:2: MULT I N K X
					{
					mMULT(); 

					mI(); 

					mN(); 

					mK(); 

					mX(); 

					}
					break;
				case 29 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:347:2: MULT I N K Y
					{
					mMULT(); 

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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:351:5: ( A L L )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:352:2: A L L
			{
			mA(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			int _type = HEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:5: ( ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:9: ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\''
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:9: ( 'X\\'' | 'x\\'' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='X') ) {
				alt8=1;
			}
			else if ( (LA8_0=='x') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:10: 'X\\''
					{
					match("X'"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:16: 'x\\''
					{
					match("x'"); 

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:356:23: ( HexDigit )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:362:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:362:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:364:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\'') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='\'') ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '\uFFFF')) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:364:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:365:4: c=~ ( '\\'' | '\\r' | '\\n' )
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
					break loop10;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:374:2: ( ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:374:4: ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:374:4: ( '0' .. '9' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:378:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:378:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:378:4: ( '0' .. '9' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					break loop12;
				}
			}

			mDIGIT_SPECIAL(); 

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:378:30: ( '0' .. '9' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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

	// $ANTLR start "DATETIME"
	public final void mDATETIME() throws RecognitionException {
		try {
			int _type = DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:382:3: ( '#' (~ '#' )* '#' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:382:5: '#' (~ '#' )* '#'
			{
			match('#'); 
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:382:9: (~ '#' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\"')||(LA14_0 >= '$' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '\uFFFF') ) {
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

			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATETIME"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:386:2: ( ( T R U E ) | ( F A L S E ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='T'||LA15_0=='t') ) {
				alt15=1;
			}
			else if ( (LA15_0=='F'||LA15_0=='f') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:386:4: ( T R U E )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:386:4: ( T R U E )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:386:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:387:4: ( F A L S E )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:387:4: ( F A L S E )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:387:5: F A L S E
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:2: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:392:11: ( LETTER | DIGIT )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='$'||(LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')||LA16_0=='\u00A3'||LA16_0=='\u00A7') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
	// $ANTLR end "TERM"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:396:3: ( '.' )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:396:5: '.'
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:400:3: ( ( '0' .. '9' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:404:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '_' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:408:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:413:2: ( '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:413:4: '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			{
			match('\\'); 
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:414:4: ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			int alt17=6;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt17=1;
				}
				break;
			case 'r':
				{
				alt17=2;
				}
				break;
			case 't':
				{
				alt17=3;
				}
				break;
			case '\'':
				{
				alt17=4;
				}
				break;
			case '\\':
				{
				alt17=5;
				}
				break;
			case 'u':
				{
				alt17=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:415:5: 'n'
					{
					match('n'); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:416:4: 'r'
					{
					match('r'); 
					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:417:4: 't'
					{
					match('t'); 
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:418:4: '\\''
					{
					match('\''); 
					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:419:4: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:420:4: UnicodeEscape
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:425:6: ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:425:12: 'u' HexDigit HexDigit HexDigit HexDigit
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:429:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:432:3: ( ( ',' | '.' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:437:11: ( ( 'a' | 'A' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:438:11: ( ( 'b' | 'B' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:439:11: ( ( 'c' | 'C' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:440:11: ( ( 'd' | 'D' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:441:11: ( ( 'e' | 'E' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:442:11: ( ( 'f' | 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:443:11: ( ( 'g' | 'G' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:444:11: ( ( 'h' | 'H' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:445:11: ( ( 'i' | 'I' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:446:11: ( ( 'j' | 'J' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:447:11: ( ( 'k' | 'K' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:448:11: ( ( 'l' | 'L' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:449:11: ( ( 'm' | 'M' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:450:11: ( ( 'n' | 'N' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:451:11: ( ( 'o' | 'O' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:452:11: ( ( 'p' | 'P' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:453:11: ( ( 'q' | 'Q' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:454:11: ( ( 'r' | 'R' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:455:11: ( ( 's' | 'S' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:456:11: ( ( 't' | 'T' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:457:11: ( ( 'u' | 'U' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:458:11: ( ( 'v' | 'V' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:459:11: ( ( 'w' | 'W' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:460:11: ( ( 'x' | 'X' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:461:11: ( ( 'y' | 'Y' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:462:11: ( ( 'z' | 'Z' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:
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
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:468:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:468:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
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
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:8: ( T__75 | T__76 | T__77 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | HEX | STRING | INTEGER | FLOAT | DATETIME | BOOLEAN | TERM | POINT | WS )
		int alt18=32;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:10: T__75
				{
				mT__75(); 

				}
				break;
			case 2 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:16: T__76
				{
				mT__76(); 

				}
				break;
			case 3 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:22: T__77
				{
				mT__77(); 

				}
				break;
			case 4 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:28: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 5 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:36: OR
				{
				mOR(); 

				}
				break;
			case 6 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:39: AND
				{
				mAND(); 

				}
				break;
			case 7 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:43: NOT
				{
				mNOT(); 

				}
				break;
			case 8 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:47: EQ
				{
				mEQ(); 

				}
				break;
			case 9 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:50: NE
				{
				mNE(); 

				}
				break;
			case 10 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:53: LT
				{
				mLT(); 

				}
				break;
			case 11 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:56: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:61: GT
				{
				mGT(); 

				}
				break;
			case 13 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:64: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 14 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:69: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:74: MINUS
				{
				mMINUS(); 

				}
				break;
			case 16 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:80: MULT
				{
				mMULT(); 

				}
				break;
			case 17 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:85: DIV
				{
				mDIV(); 

				}
				break;
			case 18 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:89: MOD
				{
				mMOD(); 

				}
				break;
			case 19 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:93: BI_FUN
				{
				mBI_FUN(); 

				}
				break;
			case 20 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:100: IN
				{
				mIN(); 

				}
				break;
			case 21 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:103: INNR
				{
				mINNR(); 

				}
				break;
			case 22 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:108: INNU
				{
				mINNU(); 

				}
				break;
			case 23 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:113: ALL
				{
				mALL(); 

				}
				break;
			case 24 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:117: HEX
				{
				mHEX(); 

				}
				break;
			case 25 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:121: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:128: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 27 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:136: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 28 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:142: DATETIME
				{
				mDATETIME(); 

				}
				break;
			case 29 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:151: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 30 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:159: TERM
				{
				mTERM(); 

				}
				break;
			case 31 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:164: POINT
				{
				mPOINT(); 

				}
				break;
			case 32 :
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.il.expr.ibmi\\src\\org\\smeup\\sys\\il\\expr\\ibmi\\rpg\\RPGExpr.g:1:170: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\4\uffff\12\42\2\uffff\1\42\1\67\1\uffff\1\71\1\73\2\uffff\1\74\1\uffff"+
		"\1\76\2\42\1\uffff\1\101\1\102\1\uffff\2\42\3\uffff\4\42\1\111\2\42\1"+
		"\16\5\42\1\111\3\42\15\uffff\6\42\1\uffff\1\111\3\42\1\67\3\42\1\17\1"+
		"\141\1\142\4\42\1\111\1\42\3\111\2\42\1\111\4\uffff\1\155\1\42\4\111\1"+
		"\42\1\111\1\uffff\1\155\2\111";
	static final String DFA18_eofS =
		"\161\uffff";
	static final String DFA18_minS =
		"\1\11\3\uffff\1\111\1\117\1\105\1\114\1\106\1\105\1\124\1\101\1\123\1"+
		"\105\2\uffff\1\114\1\75\1\uffff\2\75\2\uffff\1\111\1\uffff\1\44\2\47\1"+
		"\uffff\1\54\1\60\1\uffff\1\122\1\101\3\uffff\2\126\1\122\1\101\1\44\1"+
		"\106\1\111\1\44\1\114\1\130\1\124\1\101\1\122\1\44\1\101\1\104\1\114\7"+
		"\uffff\1\116\5\uffff\1\125\1\114\2\101\1\117\1\116\1\uffff\1\44\1\124"+
		"\1\114\1\124\1\44\1\124\1\115\1\122\2\44\1\60\1\105\1\123\2\114\1\44\1"+
		"\113\3\44\1\125\1\123\1\44\4\uffff\1\44\1\105\4\44\1\123\1\44\1\uffff"+
		"\3\44";
	static final String DFA18_maxS =
		"\1\u00a7\3\uffff\1\151\1\157\1\145\1\154\1\162\1\165\1\164\1\141\1\163"+
		"\1\145\2\uffff\1\156\1\75\1\uffff\1\76\1\75\2\uffff\1\151\1\uffff\1\u00a7"+
		"\2\47\1\uffff\2\71\1\uffff\1\162\1\141\3\uffff\2\166\1\162\1\141\1\u00a7"+
		"\1\146\1\151\1\u00a7\1\154\1\170\1\164\1\141\1\162\1\u00a7\1\141\1\144"+
		"\1\154\7\uffff\1\156\5\uffff\1\165\1\154\2\141\1\157\1\156\1\uffff\1\u00a7"+
		"\1\164\1\154\1\164\1\u00a7\1\164\1\155\1\162\2\u00a7\1\165\1\145\1\163"+
		"\2\154\1\u00a7\1\153\3\u00a7\1\165\1\163\1\u00a7\4\uffff\1\u00a7\1\145"+
		"\4\u00a7\1\163\1\u00a7\1\uffff\3\u00a7";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\1\3\12\uffff\1\5\1\6\2\uffff\1\10\2\uffff\1\16\1\17\1"+
		"\uffff\1\21\3\uffff\1\31\2\uffff\1\34\2\uffff\1\36\1\33\1\40\21\uffff"+
		"\1\11\1\7\1\13\1\12\1\15\1\14\1\20\1\uffff\1\22\1\23\1\30\1\32\1\37\6"+
		"\uffff\1\4\27\uffff\1\27\1\24\1\25\1\26\10\uffff\1\35\3\uffff";
	static final String DFA18_specialS =
		"\161\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\44\1\uffff\2\44\22\uffff\1\44\1\21\1\uffff\1\37\1\42\1\31\1\17\1\34"+
			"\1\1\1\2\1\27\1\25\1\43\1\26\1\36\1\30\12\35\1\3\1\uffff\1\23\1\22\1"+
			"\24\2\uffff\1\20\1\7\3\42\1\41\1\42\1\4\3\42\1\5\1\14\1\11\1\10\1\13"+
			"\2\42\1\12\1\40\3\42\1\32\1\15\1\6\4\uffff\1\42\1\uffff\1\20\1\7\3\42"+
			"\1\41\1\42\1\4\3\42\1\5\1\14\1\11\1\10\1\13\2\42\1\12\1\40\3\42\1\33"+
			"\1\15\1\6\1\uffff\1\16\46\uffff\1\42\3\uffff\1\42",
			"",
			"",
			"",
			"\1\45\37\uffff\1\45",
			"\1\46\37\uffff\1\46",
			"\1\47\37\uffff\1\47",
			"\1\50\37\uffff\1\50",
			"\1\52\6\uffff\1\53\1\51\3\uffff\1\54\23\uffff\1\52\6\uffff\1\53\1\51"+
			"\3\uffff\1\54",
			"\1\56\11\uffff\1\57\5\uffff\1\55\17\uffff\1\56\11\uffff\1\57\5\uffff"+
			"\1\55",
			"\1\60\37\uffff\1\60",
			"\1\61\37\uffff\1\61",
			"\1\62\37\uffff\1\62",
			"\1\63\37\uffff\1\63",
			"",
			"",
			"\1\65\1\uffff\1\64\35\uffff\1\65\1\uffff\1\64",
			"\1\66",
			"",
			"\1\70\1\66",
			"\1\72",
			"",
			"",
			"\1\75\37\uffff\1\75",
			"",
			"\1\77\34\uffff\32\77\4\uffff\1\77\1\uffff\32\77\50\uffff\1\77\3\uffff"+
			"\1\77",
			"\1\100",
			"\1\100",
			"",
			"\1\43\1\uffff\1\43\1\uffff\12\35",
			"\12\43",
			"",
			"\1\103\37\uffff\1\103",
			"\1\104\37\uffff\1\104",
			"",
			"",
			"",
			"\1\105\37\uffff\1\105",
			"\1\106\37\uffff\1\106",
			"\1\107\37\uffff\1\107",
			"\1\110\37\uffff\1\110",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\112\37\uffff\1\112",
			"\1\113\37\uffff\1\113",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\114\37\uffff\1\114",
			"\1\115\37\uffff\1\115",
			"\1\116\37\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\120\37\uffff\1\120",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\121\37\uffff\1\121",
			"\1\122\37\uffff\1\122",
			"\1\123\37\uffff\1\123",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\124\37\uffff\1\124",
			"",
			"",
			"",
			"",
			"",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\136\37\uffff\1\136",
			"\1\137\37\uffff\1\137",
			"\1\140\37\uffff\1\140",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\12\143\16\uffff\1\144\2\uffff\3\144\1\uffff\1\144\2\uffff\1\144\2\uffff"+
			"\1\144\22\uffff\1\144\2\uffff\3\144\1\uffff\1\144\2\uffff\1\144\2\uffff"+
			"\1\144",
			"\1\145\37\uffff\1\145",
			"\1\146\37\uffff\1\146",
			"\1\147\37\uffff\1\147",
			"\1\150\37\uffff\1\150",
			"\1\42\13\uffff\12\42\7\uffff\22\42\1\151\7\42\4\uffff\1\42\1\uffff\22"+
			"\42\1\151\7\42\50\uffff\1\42\3\uffff\1\42",
			"\1\152\37\uffff\1\152",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\153\37\uffff\1\153",
			"\1\154\37\uffff\1\154",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"",
			"",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\156\37\uffff\1\156",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\22\42\1\157\7\42\4\uffff\1\42\1\uffff\22"+
			"\42\1\157\7\42\50\uffff\1\42\3\uffff\1\42",
			"\1\160\37\uffff\1\160",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42"
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__75 | T__76 | T__77 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | HEX | STRING | INTEGER | FLOAT | DATETIME | BOOLEAN | TERM | POINT | WS );";
		}
	}

}
