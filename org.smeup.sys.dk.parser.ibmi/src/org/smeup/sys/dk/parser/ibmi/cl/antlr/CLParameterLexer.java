// $ANTLR 3.5.1 /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g 2015-05-26 20:06:43

  package org.smeup.sys.dk.parser.ibmi.cl.antlr;
  
  import org.antlr.runtime.*;
import org.smeup.sys.dk.parser.ibmi.cl.util.LexerHelper;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CLParameterLexer extends Lexer {
	public static final int EOF=-1;
	public static final int A=4;
	public static final int APOS=5;
	public static final int ASTERISK=6;
	public static final int B=7;
	public static final int BCAT=8;
	public static final int BINARY=9;
	public static final int C=10;
	public static final int CAT=11;
	public static final int CHAR_SPECIAL=12;
	public static final int CLOSE_BRACE=13;
	public static final int COMMENT=14;
	public static final int CR=15;
	public static final int D=16;
	public static final int E=17;
	public static final int ESCAPE=18;
	public static final int F=19;
	public static final int FILTER=20;
	public static final int FUNCTION=21;
	public static final int G=22;
	public static final int H=23;
	public static final int HEX=24;
	public static final int I=25;
	public static final int J=26;
	public static final int K=27;
	public static final int L=28;
	public static final int LIST=29;
	public static final int M=30;
	public static final int N=31;
	public static final int O=32;
	public static final int OPEN_BRACE=33;
	public static final int P=34;
	public static final int Q=35;
	public static final int R=36;
	public static final int S=37;
	public static final int SPECIAL=38;
	public static final int SST=39;
	public static final int STRING=40;
	public static final int SWITCH=41;
	public static final int T=42;
	public static final int TCAT=43;
	public static final int TOKEN=44;
	public static final int U=45;
	public static final int V=46;
	public static final int VALUE=47;
	public static final int VARIABLE=48;
	public static final int W=49;
	public static final int WS=50;
	public static final int X=51;
	public static final int Y=52;
	public static final int Z=53;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CLParameterLexer() {} 
	public CLParameterLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLParameterLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g"; }

	// $ANTLR start "CAT"
	public final void mCAT() throws RecognitionException {
		try {
			int _type = CAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:127:9: ( '!!' | '*CAT' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='!') ) {
				alt1=1;
			}
			else if ( (LA1_0=='*') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:127:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:127:18: '*CAT'
					{
					match("*CAT"); 

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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:129:9: ( '!>' | '*BCAT' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!') ) {
				alt2=1;
			}
			else if ( (LA2_0=='*') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:129:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:129:18: '*BCAT'
					{
					match("*BCAT"); 

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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:131:9: ( '!<' | '*TCAT' )
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
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:131:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:131:18: '*TCAT'
					{
					match("*TCAT"); 

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

	// $ANTLR start "SST"
	public final void mSST() throws RecognitionException {
		try {
			int _type = SST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:6: ( ( '%' S S T ) | ( '%' S U B S T R I N G ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='%') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='S'||LA4_1=='s') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='S'||LA4_2=='s') ) {
						alt4=1;
					}
					else if ( (LA4_2=='U'||LA4_2=='u') ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
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
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:8: ( '%' S S T )
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:8: ( '%' S S T )
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:9: '%' S S T
					{
					match('%'); 
					mS(); 

					mS(); 

					mT(); 

					}

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:22: ( '%' S U B S T R I N G )
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:22: ( '%' S U B S T R I N G )
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:133:23: '%' S U B S T R I N G
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
	// $ANTLR end "SST"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:135:9: ( '%' S W I T C H )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:135:11: '%' S W I T C H
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
	// $ANTLR end "SWITCH"

	// $ANTLR start "BINARY"
	public final void mBINARY() throws RecognitionException {
		try {
			int _type = BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:9: ( ( '%' B I N ) | ( '%' B I N A R Y ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='%') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='B'||LA5_1=='b') ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2=='I'||LA5_2=='i') ) {
						int LA5_3 = input.LA(4);
						if ( (LA5_3=='N'||LA5_3=='n') ) {
							int LA5_4 = input.LA(5);
							if ( (LA5_4=='A'||LA5_4=='a') ) {
								alt5=2;
							}

							else {
								alt5=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
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
								new NoViableAltException("", 5, 2, input);
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
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:11: ( '%' B I N )
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:11: ( '%' B I N )
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:12: '%' B I N
					{
					match('%'); 
					mB(); 

					mI(); 

					mN(); 

					}

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:25: ( '%' B I N A R Y )
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:25: ( '%' B I N A R Y )
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:137:26: '%' B I N A R Y
					{
					match('%'); 
					mB(); 

					mI(); 

					mN(); 

					mA(); 

					mR(); 

					mY(); 

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
	// $ANTLR end "BINARY"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:139:8: ( APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' | ASTERISK | OPEN_BRACE | CLOSE_BRACE | ESCAPE )+ APOS )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:4: APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' | ASTERISK | OPEN_BRACE | CLOSE_BRACE | ESCAPE )+ APOS
			{
			mAPOS(); 

			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' | ASTERISK | OPEN_BRACE | CLOSE_BRACE | ESCAPE )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=12;
				switch ( input.LA(1) ) {
				case '\'':
					{
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='\'') ) {
						alt6=11;
					}

					}
					break;
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt6=1;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt6=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt6=3;
					}
					break;
				case '!':
				case '\"':
				case '$':
				case '+':
				case ',':
				case '-':
				case '.':
				case '/':
				case ':':
				case '<':
				case '=':
				case '>':
				case '?':
				case '\\':
				case '^':
				case '_':
				case '\u00A3':
				case '\u00A7':
				case '\u00E0':
				case '\u00E8':
				case '\u00E9':
				case '\u00EC':
				case '\u00F2':
				case '\u00F9':
					{
					alt6=4;
					}
					break;
				case ' ':
					{
					alt6=5;
					}
					break;
				case '%':
					{
					alt6=6;
					}
					break;
				case '&':
					{
					alt6=7;
					}
					break;
				case '*':
					{
					alt6=8;
					}
					break;
				case '(':
					{
					alt6=9;
					}
					break;
				case ')':
					{
					alt6=10;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:10: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:19: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:28: '0' .. '9'
					{
					matchRange('0','9'); 
					}
					break;
				case 4 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:37: CHAR_SPECIAL
					{
					mCHAR_SPECIAL(); 

					}
					break;
				case 5 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:50: ' '
					{
					match(' '); 
					}
					break;
				case 6 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:54: '%'
					{
					match('%'); 
					}
					break;
				case 7 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:58: '&'
					{
					match('&'); 
					}
					break;
				case 8 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:62: ASTERISK
					{
					mASTERISK(); 

					}
					break;
				case 9 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:71: OPEN_BRACE
					{
					mOPEN_BRACE(); 

					}
					break;
				case 10 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:82: CLOSE_BRACE
					{
					mCLOSE_BRACE(); 

					}
					break;
				case 11 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:140:94: ESCAPE
					{
					mESCAPE(); 

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			mAPOS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "TOKEN"
	public final void mTOKEN() throws RecognitionException {
		try {
			int _type = TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:143:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+ )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:144:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			{
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:144:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '!' && LA7_0 <= '\"')||LA7_0=='$'||(LA7_0 >= '+' && LA7_0 <= ':')||(LA7_0 >= '<' && LA7_0 <= '?')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='\\'||(LA7_0 >= '^' && LA7_0 <= '_')||(LA7_0 >= 'a' && LA7_0 <= 'z')||LA7_0=='\u00A3'||LA7_0=='\u00A7'||LA7_0=='\u00E0'||(LA7_0 >= '\u00E8' && LA7_0 <= '\u00E9')||LA7_0=='\u00EC'||LA7_0=='\u00F2'||LA7_0=='\u00F9') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
					{
					if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= ':')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOKEN"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:147:9: ( '&' TOKEN )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:148:4: '&' TOKEN
			{
			match('&'); 
			mTOKEN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:151:9: ( ASTERISK TOKEN )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:152:4: ASTERISK TOKEN
			{
			mASTERISK(); 

			mTOKEN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL"

	// $ANTLR start "FILTER"
	public final void mFILTER() throws RecognitionException {
		try {
			int _type = FILTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:155:8: ( TOKEN ASTERISK )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:156:2: TOKEN ASTERISK
			{
			mTOKEN(); 

			mASTERISK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILTER"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:159:9: ( '*' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:160:2: '*'
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
	// $ANTLR end "ASTERISK"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			int _type = HEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:164:5: ( 'X' APOS ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ APOS )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:165:2: 'X' APOS ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ APOS
			{
			match('X'); 
			mAPOS(); 

			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:165:11: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'F')||(LA8_0 >= 'a' && LA8_0 <= 'f')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			mAPOS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:169:3: ( '(' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:170:3: '('
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:174:3: ( ')' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:175:3: ')'
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

	// $ANTLR start "ESCAPE"
	public final void mESCAPE() throws RecognitionException {
		try {
			int _type = ESCAPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:179:2: ( APOS APOS )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:180:2: APOS APOS
			{
			mAPOS(); 

			mAPOS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESCAPE"

	// $ANTLR start "APOS"
	public final void mAPOS() throws RecognitionException {
		try {
			int _type = APOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:183:6: ( '\\'' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:184:2: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:188:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='/') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='/') ) {
					alt12=1;
				}
				else if ( (LA12_1=='*') ) {
					alt12=2;
				}

				else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:188:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:188:14: (~ ( '\\n' | '\\r' ) )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop9;
						}
					}

					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:188:28: ( '\\r' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='\r') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:188:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:189:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:189:14: ( options {greedy=false; } : . )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0=='*') ) {
							int LA11_1 = input.LA(2);
							if ( (LA11_1=='/') ) {
								alt11=2;
							}
							else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
								alt11=1;
							}

						}
						else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:189:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop11;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "CR"
	public final void mCR() throws RecognitionException {
		try {
			int _type = CR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:192:4: ( ( '\\r' )? '\\n' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:193:3: ( '\\r' )? '\\n'
			{
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:193:3: ( '\\r' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\r') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:193:4: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:196:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:196:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:204:11: ( ( 'a' | 'A' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:205:11: ( ( 'b' | 'B' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:206:11: ( ( 'c' | 'C' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:207:11: ( ( 'd' | 'D' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:208:11: ( ( 'e' | 'E' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:209:11: ( ( 'f' | 'F' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:210:11: ( ( 'g' | 'G' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:211:11: ( ( 'h' | 'H' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:212:11: ( ( 'i' | 'I' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:213:11: ( ( 'j' | 'J' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:214:11: ( ( 'k' | 'K' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:215:11: ( ( 'l' | 'L' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:216:11: ( ( 'm' | 'M' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:217:11: ( ( 'n' | 'N' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:218:11: ( ( 'o' | 'O' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:219:11: ( ( 'p' | 'P' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:220:11: ( ( 'q' | 'Q' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:221:11: ( ( 'r' | 'R' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:222:11: ( ( 's' | 'S' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:223:11: ( ( 't' | 'T' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:224:11: ( ( 'u' | 'U' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:225:11: ( ( 'v' | 'V' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:226:11: ( ( 'w' | 'W' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:227:11: ( ( 'x' | 'X' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:228:11: ( ( 'y' | 'Y' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:229:11: ( ( 'z' | 'Z' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
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

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:234:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | ',' | '\\u00a3' | '!' | '=' | '>' | '<' | '+' | '-' | '/' | '\\\\' | ':' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||input.LA(1)==':'||(input.LA(1) >= '<' && input.LA(1) <= '?')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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

	@Override
	public void mTokens() throws RecognitionException {
		// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:8: ( CAT | BCAT | TCAT | SST | SWITCH | BINARY | STRING | TOKEN | VARIABLE | SPECIAL | FILTER | ASTERISK | HEX | OPEN_BRACE | CLOSE_BRACE | ESCAPE | APOS | COMMENT | CR | WS )
		int alt14=20;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:10: CAT
				{
				mCAT(); 

				}
				break;
			case 2 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:14: BCAT
				{
				mBCAT(); 

				}
				break;
			case 3 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:19: TCAT
				{
				mTCAT(); 

				}
				break;
			case 4 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:24: SST
				{
				mSST(); 

				}
				break;
			case 5 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:28: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 6 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:35: BINARY
				{
				mBINARY(); 

				}
				break;
			case 7 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:42: STRING
				{
				mSTRING(); 

				}
				break;
			case 8 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:49: TOKEN
				{
				mTOKEN(); 

				}
				break;
			case 9 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:55: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 10 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:64: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 11 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:72: FILTER
				{
				mFILTER(); 

				}
				break;
			case 12 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:79: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 13 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:88: HEX
				{
				mHEX(); 

				}
				break;
			case 14 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:92: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 15 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:103: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 16 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:115: ESCAPE
				{
				mESCAPE(); 

				}
				break;
			case 17 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:122: APOS
				{
				mAPOS(); 

				}
				break;
			case 18 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:127: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 19 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:135: CR
				{
				mCR(); 

				}
				break;
			case 20 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.7.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CLParameter.g:1:138: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\1\uffff\1\21\1\26\1\uffff\1\32\1\21\1\uffff\1\21\2\uffff\1\21\1\15\2"+
		"\uffff\1\41\1\42\1\43\2\uffff\3\27\6\uffff\1\51\1\uffff\1\21\1\22\4\uffff"+
		"\3\27\3\uffff\1\21\1\uffff\1\22\1\41\2\27\1\42\1\43";
	static final String DFA14_eofS =
		"\62\uffff";
	static final String DFA14_minS =
		"\1\11\2\41\1\102\1\40\1\41\1\uffff\1\41\2\uffff\1\41\1\12\2\uffff\3\41"+
		"\2\uffff\1\101\2\103\2\uffff\1\123\3\uffff\1\47\1\uffff\2\0\4\uffff\1"+
		"\124\2\101\3\uffff\1\0\1\uffff\1\0\1\41\2\124\2\41";
	static final String DFA14_maxS =
		"\3\u00f9\1\163\2\u00f9\1\uffff\1\u00f9\2\uffff\1\u00f9\1\12\2\uffff\3"+
		"\u00f9\2\uffff\1\101\2\103\2\uffff\1\167\3\uffff\1\47\1\uffff\2\uffff"+
		"\4\uffff\1\124\2\101\3\uffff\1\uffff\1\uffff\1\uffff\1\u00f9\2\124\2\u00f9";
	static final String DFA14_acceptS =
		"\6\uffff\1\11\1\uffff\1\16\1\17\2\uffff\1\23\1\24\3\uffff\1\10\1\13\3"+
		"\uffff\1\14\1\12\1\uffff\1\6\1\21\1\7\1\uffff\1\15\2\uffff\1\23\1\1\1"+
		"\2\1\3\3\uffff\1\4\1\5\1\20\1\uffff\1\22\6\uffff";
	static final String DFA14_specialS =
		"\36\uffff\1\1\1\2\12\uffff\1\3\1\uffff\1\0\5\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\15\1\14\2\uffff\1\13\22\uffff\1\15\1\1\1\12\1\uffff\1\12\1\3\1\6\1"+
			"\4\1\10\1\11\1\2\4\12\1\7\13\12\1\uffff\4\12\1\uffff\27\12\1\5\2\12\1"+
			"\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70"+
			"\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\1\16\1\12\1\uffff\1\12\5\uffff\1\22\20\12\1\uffff\1\20\1\12\1\17\1"+
			"\12\1\uffff\32\12\1\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1"+
			"\12\3\uffff\1\12\70\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12"+
			"\6\uffff\1\12",
			"\2\27\1\uffff\1\27\6\uffff\20\27\1\uffff\4\27\1\uffff\1\27\1\24\1\23"+
			"\20\27\1\25\6\27\1\uffff\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27"+
			"\3\uffff\1\27\70\uffff\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6"+
			"\uffff\1\27",
			"\1\31\20\uffff\1\30\16\uffff\1\31\20\uffff\1\30",
			"\3\33\1\uffff\3\33\1\34\23\33\1\uffff\4\33\1\uffff\32\33\1\uffff\1\33"+
			"\1\uffff\2\33\1\uffff\32\33\50\uffff\1\33\3\uffff\1\33\70\uffff\1\33"+
			"\7\uffff\2\33\2\uffff\1\33\5\uffff\1\33\6\uffff\1\33",
			"\2\12\1\uffff\1\12\2\uffff\1\35\2\uffff\1\22\20\12\1\uffff\4\12\1\uffff"+
			"\32\12\1\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff"+
			"\1\12\70\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1"+
			"\12",
			"",
			"\2\12\1\uffff\1\12\5\uffff\1\37\4\12\1\36\13\12\1\uffff\4\12\1\uffff"+
			"\32\12\1\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff"+
			"\1\12\70\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1"+
			"\12",
			"",
			"",
			"\2\12\1\uffff\1\12\5\uffff\1\22\20\12\1\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\1\40",
			"",
			"",
			"\2\12\1\uffff\1\12\5\uffff\1\22\20\12\1\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\2\12\1\uffff\1\12\5\uffff\1\22\20\12\1\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\2\12\1\uffff\1\12\5\uffff\1\22\20\12\1\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"",
			"",
			"\1\44",
			"\1\45",
			"\1\46",
			"",
			"",
			"\1\47\1\uffff\1\47\1\uffff\1\50\33\uffff\1\47\1\uffff\1\47\1\uffff\1"+
			"\50",
			"",
			"",
			"",
			"\1\33",
			"",
			"\41\53\2\52\1\53\1\52\5\53\1\54\20\52\1\53\4\52\1\53\32\52\1\53\1\52"+
			"\1\53\2\52\1\53\32\52\50\53\1\52\3\53\1\52\70\53\1\52\7\53\2\52\2\53"+
			"\1\52\5\53\1\52\6\53\1\52\uff06\53",
			"\0\53",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"\41\53\2\52\1\53\1\52\5\53\1\54\20\52\1\53\4\52\1\53\32\52\1\53\1\52"+
			"\1\53\2\52\1\53\32\52\50\53\1\52\3\53\1\52\70\53\1\52\7\53\2\52\2\53"+
			"\1\52\5\53\1\52\6\53\1\52\uff06\53",
			"",
			"\0\53",
			"\2\27\1\uffff\1\27\6\uffff\20\27\1\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\1\60",
			"\1\61",
			"\2\27\1\uffff\1\27\6\uffff\20\27\1\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\2\27\1\uffff\1\27\6\uffff\20\27\1\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CAT | BCAT | TCAT | SST | SWITCH | BINARY | STRING | TOKEN | VARIABLE | SPECIAL | FILTER | ASTERISK | HEX | OPEN_BRACE | CLOSE_BRACE | ESCAPE | APOS | COMMENT | CR | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_44 = input.LA(1);
						s = -1;
						if ( ((LA14_44 >= '\u0000' && LA14_44 <= '\uFFFF')) ) {s = 43;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA14_30 = input.LA(1);
						s = -1;
						if ( ((LA14_30 >= '!' && LA14_30 <= '\"')||LA14_30=='$'||(LA14_30 >= '+' && LA14_30 <= ':')||(LA14_30 >= '<' && LA14_30 <= '?')||(LA14_30 >= 'A' && LA14_30 <= 'Z')||LA14_30=='\\'||(LA14_30 >= '^' && LA14_30 <= '_')||(LA14_30 >= 'a' && LA14_30 <= 'z')||LA14_30=='\u00A3'||LA14_30=='\u00A7'||LA14_30=='\u00E0'||(LA14_30 >= '\u00E8' && LA14_30 <= '\u00E9')||LA14_30=='\u00EC'||LA14_30=='\u00F2'||LA14_30=='\u00F9') ) {s = 42;}
						else if ( ((LA14_30 >= '\u0000' && LA14_30 <= ' ')||LA14_30=='#'||(LA14_30 >= '%' && LA14_30 <= ')')||LA14_30==';'||LA14_30=='@'||LA14_30=='['||LA14_30==']'||LA14_30=='`'||(LA14_30 >= '{' && LA14_30 <= '\u00A2')||(LA14_30 >= '\u00A4' && LA14_30 <= '\u00A6')||(LA14_30 >= '\u00A8' && LA14_30 <= '\u00DF')||(LA14_30 >= '\u00E1' && LA14_30 <= '\u00E7')||(LA14_30 >= '\u00EA' && LA14_30 <= '\u00EB')||(LA14_30 >= '\u00ED' && LA14_30 <= '\u00F1')||(LA14_30 >= '\u00F3' && LA14_30 <= '\u00F8')||(LA14_30 >= '\u00FA' && LA14_30 <= '\uFFFF')) ) {s = 43;}
						else if ( (LA14_30=='*') ) {s = 44;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA14_31 = input.LA(1);
						s = -1;
						if ( ((LA14_31 >= '\u0000' && LA14_31 <= '\uFFFF')) ) {s = 43;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA14_42 = input.LA(1);
						s = -1;
						if ( ((LA14_42 >= '\u0000' && LA14_42 <= ' ')||LA14_42=='#'||(LA14_42 >= '%' && LA14_42 <= ')')||LA14_42==';'||LA14_42=='@'||LA14_42=='['||LA14_42==']'||LA14_42=='`'||(LA14_42 >= '{' && LA14_42 <= '\u00A2')||(LA14_42 >= '\u00A4' && LA14_42 <= '\u00A6')||(LA14_42 >= '\u00A8' && LA14_42 <= '\u00DF')||(LA14_42 >= '\u00E1' && LA14_42 <= '\u00E7')||(LA14_42 >= '\u00EA' && LA14_42 <= '\u00EB')||(LA14_42 >= '\u00ED' && LA14_42 <= '\u00F1')||(LA14_42 >= '\u00F3' && LA14_42 <= '\u00F8')||(LA14_42 >= '\u00FA' && LA14_42 <= '\uFFFF')) ) {s = 43;}
						else if ( ((LA14_42 >= '!' && LA14_42 <= '\"')||LA14_42=='$'||(LA14_42 >= '+' && LA14_42 <= ':')||(LA14_42 >= '<' && LA14_42 <= '?')||(LA14_42 >= 'A' && LA14_42 <= 'Z')||LA14_42=='\\'||(LA14_42 >= '^' && LA14_42 <= '_')||(LA14_42 >= 'a' && LA14_42 <= 'z')||LA14_42=='\u00A3'||LA14_42=='\u00A7'||LA14_42=='\u00E0'||(LA14_42 >= '\u00E8' && LA14_42 <= '\u00E9')||LA14_42=='\u00EC'||LA14_42=='\u00F2'||LA14_42=='\u00F9') ) {s = 42;}
						else if ( (LA14_42=='*') ) {s = 44;}
						else s = 17;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
