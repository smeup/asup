// $ANTLR 3.5.1 /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g 2015-05-26 20:06:35

  package org.smeup.sys.dk.parser.ibmi.cl.antlr;

  import org.antlr.runtime.*;
import org.smeup.sys.dk.parser.ibmi.cl.util.LexerHelper;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int APOS=4;
	public static final int CHAR_SPECIAL=5;
	public static final int CL=6;
	public static final int CLOSE_BRACE=7;
	public static final int CMD_NAME=8;
	public static final int COMMAND=9;
	public static final int COMMENT=10;
	public static final int CR=11;
	public static final int ESCAPE=12;
	public static final int FUN=13;
	public static final int LABEL=14;
	public static final int OPEN_BRACE=15;
	public static final int PAR=16;
	public static final int PAREN=17;
	public static final int PAR_NAME=18;
	public static final int PAR_VALUE=19;
	public static final int POS_PAR=20;
	public static final int ROW=21;
	public static final int STRING=22;
	public static final int TOKEN=23;
	public static final int WS=24;

	  int openBraces = 0;
	  int closeBraces = 0;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CLLexer() {} 
	public CLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g"; }

	// $ANTLR start "LABEL"
	public final void mLABEL() throws RecognitionException {
		try {
			int _type = LABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:155:7: ( TOKEN ':' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:155:9: TOKEN ':'
			{
			mTOKEN(); 

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LABEL"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:158:5: ( '%' TOKEN )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:159:4: '%' TOKEN
			{
			match('%'); 
			mTOKEN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:162:8: ({...}? => APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | ':' | ESCAPE )+ APOS )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:4: {...}? => APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | ':' | ESCAPE )+ APOS
			{
			if ( !(((openBraces - closeBraces) == 0)) ) {
				throw new FailedPredicateException(input, "STRING", "(openBraces - closeBraces) == 0");
			}
			mAPOS(); 

			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:46: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | ':' | ESCAPE )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=9;
				switch ( input.LA(1) ) {
				case '\'':
					{
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='\'') ) {
						alt1=8;
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
					alt1=1;
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
					alt1=2;
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
					alt1=3;
					}
					break;
				case '!':
				case '\"':
				case '$':
				case '&':
				case '*':
				case '+':
				case ',':
				case '-':
				case '.':
				case '/':
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
					alt1=4;
					}
					break;
				case ' ':
					{
					alt1=5;
					}
					break;
				case '%':
					{
					alt1=6;
					}
					break;
				case ':':
					{
					alt1=7;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:47: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:56: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:65: '0' .. '9'
					{
					matchRange('0','9'); 
					}
					break;
				case 4 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:74: CHAR_SPECIAL
					{
					mCHAR_SPECIAL(); 

					}
					break;
				case 5 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:87: ' '
					{
					match(' '); 
					}
					break;
				case 6 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:91: '%'
					{
					match('%'); 
					}
					break;
				case 7 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:95: ':'
					{
					match(':'); 
					}
					break;
				case 8 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:163:99: ESCAPE
					{
					mESCAPE(); 

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:166:6: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+ )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:166:8: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			{
			if ( !(((openBraces - closeBraces) == 0)) ) {
				throw new FailedPredicateException(input, "TOKEN", "(openBraces - closeBraces) == 0");
			}
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:166:44: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '!' && LA2_0 <= '\"')||LA2_0=='$'||LA2_0=='&'||(LA2_0 >= '*' && LA2_0 <= '9')||(LA2_0 >= '<' && LA2_0 <= '?')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='\\'||(LA2_0 >= '^' && LA2_0 <= '_')||(LA2_0 >= 'a' && LA2_0 <= 'z')||LA2_0=='\u00A3'||LA2_0=='\u00A7'||LA2_0=='\u00E0'||(LA2_0 >= '\u00E8' && LA2_0 <= '\u00E9')||LA2_0=='\u00EC'||LA2_0=='\u00F2'||LA2_0=='\u00F9') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:
					{
					if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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

	// $ANTLR start "PAREN"
	public final void mPAREN() throws RecognitionException {
		try {
			int _type = PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:6: ( OPEN_BRACE ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | APOS | ' ' | PAREN | '%' | ':' )* CLOSE_BRACE )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:8: OPEN_BRACE ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | APOS | ' ' | PAREN | '%' | ':' )* CLOSE_BRACE
			{
			mOPEN_BRACE(); 

			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | APOS | ' ' | PAREN | '%' | ':' )*
			loop3:
			while (true) {
				int alt3=10;
				switch ( input.LA(1) ) {
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
					alt3=1;
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
					alt3=2;
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
					alt3=3;
					}
					break;
				case '!':
				case '\"':
				case '$':
				case '&':
				case '*':
				case '+':
				case ',':
				case '-':
				case '.':
				case '/':
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
					alt3=4;
					}
					break;
				case '\'':
					{
					alt3=5;
					}
					break;
				case ' ':
					{
					alt3=6;
					}
					break;
				case '(':
					{
					alt3=7;
					}
					break;
				case '%':
					{
					alt3=8;
					}
					break;
				case ':':
					{
					alt3=9;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:20: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:29: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:38: '0' .. '9'
					{
					matchRange('0','9'); 
					}
					break;
				case 4 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:47: CHAR_SPECIAL
					{
					mCHAR_SPECIAL(); 

					}
					break;
				case 5 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:60: APOS
					{
					mAPOS(); 

					}
					break;
				case 6 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:65: ' '
					{
					match(' '); 
					}
					break;
				case 7 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:69: PAREN
					{
					mPAREN(); 

					}
					break;
				case 8 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:75: '%'
					{
					match('%'); 
					}
					break;
				case 9 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:169:79: ':'
					{
					match(':'); 
					}
					break;

				default :
					break loop3;
				}
			}

			mCLOSE_BRACE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAREN"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:173:3: ( '(' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:174:3: '('
			{
			match('('); 
			openBraces++;
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:178:3: ( ')' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:179:3: ')'
			{
			match(')'); 
			closeBraces++;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_BRACE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:183:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='/') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='/') ) {
					alt7=1;
				}
				else if ( (LA7_1=='*') ) {
					alt7=2;
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
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:183:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:183:14: (~ ( '\\n' | '\\r' ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:
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
							break loop4;
						}
					}

					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:183:28: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:183:28: '\\r'
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
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:184:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:184:14: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='*') ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1=='/') ) {
								alt6=2;
							}
							else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:184:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:187:4: ( ( '\\r' )? '\\n' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:188:3: ( '\\r' )? '\\n'
			{
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:188:3: ( '\\r' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\r') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:188:4: '\\r'
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:191:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
	// $ANTLR end "WS"

	// $ANTLR start "ESCAPE"
	public final void mESCAPE() throws RecognitionException {
		try {
			int _type = ESCAPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:199:8: ( APOS APOS )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:200:2: APOS APOS
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
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:203:6: ( '\\'' )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:204:2: '\\''
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

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:210:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | ',' | '\\u00a3' | '&' | '*' | '/' | '=' | '>' | '<' | '+' | '-' | '!' | '\\\\' ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '/')||(input.LA(1) >= '<' && input.LA(1) <= '?')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
		// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:8: ( LABEL | FUN | STRING | TOKEN | PAREN | OPEN_BRACE | CLOSE_BRACE | COMMENT | CR | WS | ESCAPE | APOS )
		int alt9=12;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:10: LABEL
				{
				mLABEL(); 

				}
				break;
			case 2 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:16: FUN
				{
				mFUN(); 

				}
				break;
			case 3 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:20: STRING
				{
				mSTRING(); 

				}
				break;
			case 4 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:27: TOKEN
				{
				mTOKEN(); 

				}
				break;
			case 5 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:33: PAREN
				{
				mPAREN(); 

				}
				break;
			case 6 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:39: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 7 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:50: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 8 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:62: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 9 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:70: CR
				{
				mCR(); 

				}
				break;
			case 10 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:73: WS
				{
				mWS(); 

				}
				break;
			case 11 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:76: ESCAPE
				{
				mESCAPE(); 

				}
				break;
			case 12 :
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:1:83: APOS
				{
				mAPOS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\1\14\1\uffff\1\16\1\21\1\uffff\1\14\1\11\2\uffff\2\14\4\uffff"+
		"\1\32\3\uffff\1\15\1\uffff\2\14\1\15\1\14\1\uffff\1\34\1\uffff";
	static final String DFA9_eofS =
		"\35\uffff";
	static final String DFA9_minS =
		"\1\11\1\41\1\uffff\2\40\1\uffff\1\41\1\12\2\uffff\2\0\4\uffff\1\47\3\uffff"+
		"\1\0\1\uffff\4\0\1\uffff\2\0";
	static final String DFA9_maxS =
		"\2\u00f9\1\uffff\2\u00f9\1\uffff\1\u00f9\1\12\2\uffff\2\uffff\4\uffff"+
		"\1\47\3\uffff\1\uffff\1\uffff\4\uffff\1\uffff\1\uffff\1\0";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\2\uffff\1\7\2\uffff\1\11\1\12\2\uffff\1\4\1\1\1\14\1\3\1"+
		"\uffff\1\6\1\5\1\11\1\uffff\1\10\4\uffff\1\13\2\uffff";
	static final String DFA9_specialS =
		"\1\5\1\2\1\uffff\1\3\2\uffff\1\15\3\uffff\1\4\1\13\4\uffff\1\12\3\uffff"+
		"\1\0\1\uffff\1\1\1\6\1\7\1\10\1\uffff\1\11\1\14}>";
	static final String[] DFA9_transitionS = {
			"\1\11\1\10\2\uffff\1\7\22\uffff\1\11\2\6\1\uffff\1\6\1\2\1\6\1\3\1\4"+
			"\1\5\5\6\1\1\12\6\2\uffff\4\6\1\uffff\32\6\1\uffff\1\6\1\uffff\2\6\1"+
			"\uffff\32\6\50\uffff\1\6\3\uffff\1\6\70\uffff\1\6\7\uffff\2\6\2\uffff"+
			"\1\6\5\uffff\1\6\6\uffff\1\6",
			"\2\6\1\uffff\1\6\1\uffff\1\6\3\uffff\1\13\4\6\1\12\12\6\1\15\1\uffff"+
			"\4\6\1\uffff\32\6\1\uffff\1\6\1\uffff\2\6\1\uffff\32\6\50\uffff\1\6\3"+
			"\uffff\1\6\70\uffff\1\6\7\uffff\2\6\2\uffff\1\6\5\uffff\1\6\6\uffff\1"+
			"\6",
			"",
			"\3\17\1\uffff\3\17\1\20\2\uffff\21\17\1\uffff\4\17\1\uffff\32\17\1\uffff"+
			"\1\17\1\uffff\2\17\1\uffff\32\17\50\uffff\1\17\3\uffff\1\17\70\uffff"+
			"\1\17\7\uffff\2\17\2\uffff\1\17\5\uffff\1\17\6\uffff\1\17",
			"\3\22\1\uffff\27\22\1\uffff\4\22\1\uffff\32\22\1\uffff\1\22\1\uffff"+
			"\2\22\1\uffff\32\22\50\uffff\1\22\3\uffff\1\22\70\uffff\1\22\7\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\1\22\6\uffff\1\22",
			"",
			"\2\6\1\uffff\1\6\1\uffff\1\6\3\uffff\20\6\1\15\1\uffff\4\6\1\uffff\32"+
			"\6\1\uffff\1\6\1\uffff\2\6\1\uffff\32\6\50\uffff\1\6\3\uffff\1\6\70\uffff"+
			"\1\6\7\uffff\2\6\2\uffff\1\6\5\uffff\1\6\6\uffff\1\6",
			"\1\23",
			"",
			"",
			"\41\25\2\26\1\25\1\26\1\25\1\26\3\25\20\26\1\24\1\25\4\26\1\25\32\26"+
			"\1\25\1\26\1\25\2\26\1\25\32\26\50\25\1\26\3\25\1\26\70\25\1\26\7\25"+
			"\2\26\2\25\1\26\5\25\1\26\6\25\1\26\uff06\25",
			"\41\25\2\31\1\25\1\31\1\25\1\31\3\25\1\27\17\31\1\30\1\25\4\31\1\25"+
			"\32\31\1\25\1\31\1\25\2\31\1\25\32\31\50\25\1\31\3\25\1\31\70\25\1\31"+
			"\7\25\2\31\2\25\1\31\5\25\1\31\6\25\1\31\uff06\25",
			"",
			"",
			"",
			"",
			"\1\17",
			"",
			"",
			"",
			"\0\25",
			"",
			"\41\25\2\26\1\25\1\26\1\25\1\26\3\25\20\26\1\24\1\25\4\26\1\25\32\26"+
			"\1\25\1\26\1\25\2\26\1\25\32\26\50\25\1\26\3\25\1\26\70\25\1\26\7\25"+
			"\2\26\2\25\1\26\5\25\1\26\6\25\1\26\uff06\25",
			"\41\25\2\31\1\25\1\31\1\25\1\31\3\25\1\27\4\31\1\33\12\31\1\30\1\25"+
			"\4\31\1\25\32\31\1\25\1\31\1\25\2\31\1\25\32\31\50\25\1\31\3\25\1\31"+
			"\70\25\1\31\7\25\2\31\2\25\1\31\5\25\1\31\6\25\1\31\uff06\25",
			"\0\25",
			"\41\25\2\31\1\25\1\31\1\25\1\31\3\25\1\27\17\31\1\30\1\25\4\31\1\25"+
			"\32\31\1\25\1\31\1\25\2\31\1\25\32\31\50\25\1\31\3\25\1\31\70\25\1\31"+
			"\7\25\2\31\2\25\1\31\5\25\1\31\6\25\1\31\uff06\25",
			"",
			"\41\25\2\31\1\25\1\31\1\25\1\31\3\25\1\27\17\31\1\30\1\25\4\31\1\25"+
			"\32\31\1\25\1\31\1\25\2\31\1\25\32\31\50\25\1\31\3\25\1\31\70\25\1\31"+
			"\7\25\2\31\2\25\1\31\5\25\1\31\6\25\1\31\uff06\25",
			"\1\uffff"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( LABEL | FUN | STRING | TOKEN | PAREN | OPEN_BRACE | CLOSE_BRACE | COMMENT | CR | WS | ESCAPE | APOS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_20 = input.LA(1);
						 
						int index9_20 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA9_20 >= '\u0000' && LA9_20 <= '\uFFFF')) ) {s = 21;}
						else s = 13;
						 
						input.seek(index9_20);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_22 = input.LA(1);
						 
						int index9_22 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA9_22 >= '\u0000' && LA9_22 <= ' ')||LA9_22=='#'||LA9_22=='%'||(LA9_22 >= '\'' && LA9_22 <= ')')||LA9_22==';'||LA9_22=='@'||LA9_22=='['||LA9_22==']'||LA9_22=='`'||(LA9_22 >= '{' && LA9_22 <= '\u00A2')||(LA9_22 >= '\u00A4' && LA9_22 <= '\u00A6')||(LA9_22 >= '\u00A8' && LA9_22 <= '\u00DF')||(LA9_22 >= '\u00E1' && LA9_22 <= '\u00E7')||(LA9_22 >= '\u00EA' && LA9_22 <= '\u00EB')||(LA9_22 >= '\u00ED' && LA9_22 <= '\u00F1')||(LA9_22 >= '\u00F3' && LA9_22 <= '\u00F8')||(LA9_22 >= '\u00FA' && LA9_22 <= '\uFFFF')) ) {s = 21;}
						else if ( (LA9_22==':') ) {s = 20;}
						else if ( ((LA9_22 >= '!' && LA9_22 <= '\"')||LA9_22=='$'||LA9_22=='&'||(LA9_22 >= '*' && LA9_22 <= '9')||(LA9_22 >= '<' && LA9_22 <= '?')||(LA9_22 >= 'A' && LA9_22 <= 'Z')||LA9_22=='\\'||(LA9_22 >= '^' && LA9_22 <= '_')||(LA9_22 >= 'a' && LA9_22 <= 'z')||LA9_22=='\u00A3'||LA9_22=='\u00A7'||LA9_22=='\u00E0'||(LA9_22 >= '\u00E8' && LA9_22 <= '\u00E9')||LA9_22=='\u00EC'||LA9_22=='\u00F2'||LA9_22=='\u00F9') ) {s = 22;}
						else s = 12;
						 
						input.seek(index9_22);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_1 = input.LA(1);
						 
						int index9_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_1=='/') ) {s = 10;}
						else if ( (LA9_1=='*') ) {s = 11;}
						else if ( (LA9_1==':') && (((openBraces - closeBraces) == 0))) {s = 13;}
						else if ( ((LA9_1 >= '!' && LA9_1 <= '\"')||LA9_1=='$'||LA9_1=='&'||(LA9_1 >= '+' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '9')||(LA9_1 >= '<' && LA9_1 <= '?')||(LA9_1 >= 'A' && LA9_1 <= 'Z')||LA9_1=='\\'||(LA9_1 >= '^' && LA9_1 <= '_')||(LA9_1 >= 'a' && LA9_1 <= 'z')||LA9_1=='\u00A3'||LA9_1=='\u00A7'||LA9_1=='\u00E0'||(LA9_1 >= '\u00E8' && LA9_1 <= '\u00E9')||LA9_1=='\u00EC'||LA9_1=='\u00F2'||LA9_1=='\u00F9') && (((openBraces - closeBraces) == 0))) {s = 6;}
						else s = 12;
						 
						input.seek(index9_1);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA9_3 = input.LA(1);
						 
						int index9_3 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA9_3 >= ' ' && LA9_3 <= '\"')||(LA9_3 >= '$' && LA9_3 <= '&')||(LA9_3 >= '*' && LA9_3 <= ':')||(LA9_3 >= '<' && LA9_3 <= '?')||(LA9_3 >= 'A' && LA9_3 <= 'Z')||LA9_3=='\\'||(LA9_3 >= '^' && LA9_3 <= '_')||(LA9_3 >= 'a' && LA9_3 <= 'z')||LA9_3=='\u00A3'||LA9_3=='\u00A7'||LA9_3=='\u00E0'||(LA9_3 >= '\u00E8' && LA9_3 <= '\u00E9')||LA9_3=='\u00EC'||LA9_3=='\u00F2'||LA9_3=='\u00F9') && (((openBraces - closeBraces) == 0))) {s = 15;}
						else if ( (LA9_3=='\'') ) {s = 16;}
						else s = 14;
						 
						input.seek(index9_3);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA9_10 = input.LA(1);
						 
						int index9_10 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_10==':') ) {s = 20;}
						else if ( ((LA9_10 >= '\u0000' && LA9_10 <= ' ')||LA9_10=='#'||LA9_10=='%'||(LA9_10 >= '\'' && LA9_10 <= ')')||LA9_10==';'||LA9_10=='@'||LA9_10=='['||LA9_10==']'||LA9_10=='`'||(LA9_10 >= '{' && LA9_10 <= '\u00A2')||(LA9_10 >= '\u00A4' && LA9_10 <= '\u00A6')||(LA9_10 >= '\u00A8' && LA9_10 <= '\u00DF')||(LA9_10 >= '\u00E1' && LA9_10 <= '\u00E7')||(LA9_10 >= '\u00EA' && LA9_10 <= '\u00EB')||(LA9_10 >= '\u00ED' && LA9_10 <= '\u00F1')||(LA9_10 >= '\u00F3' && LA9_10 <= '\u00F8')||(LA9_10 >= '\u00FA' && LA9_10 <= '\uFFFF')) ) {s = 21;}
						else if ( ((LA9_10 >= '!' && LA9_10 <= '\"')||LA9_10=='$'||LA9_10=='&'||(LA9_10 >= '*' && LA9_10 <= '9')||(LA9_10 >= '<' && LA9_10 <= '?')||(LA9_10 >= 'A' && LA9_10 <= 'Z')||LA9_10=='\\'||(LA9_10 >= '^' && LA9_10 <= '_')||(LA9_10 >= 'a' && LA9_10 <= 'z')||LA9_10=='\u00A3'||LA9_10=='\u00A7'||LA9_10=='\u00E0'||(LA9_10 >= '\u00E8' && LA9_10 <= '\u00E9')||LA9_10=='\u00EC'||LA9_10=='\u00F2'||LA9_10=='\u00F9') ) {s = 22;}
						else s = 12;
						 
						input.seek(index9_10);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA9_0 = input.LA(1);
						 
						int index9_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_0=='/') ) {s = 1;}
						else if ( (LA9_0=='%') ) {s = 2;}
						else if ( (LA9_0=='\'') ) {s = 3;}
						else if ( (LA9_0=='(') ) {s = 4;}
						else if ( (LA9_0==')') ) {s = 5;}
						else if ( ((LA9_0 >= '!' && LA9_0 <= '\"')||LA9_0=='$'||LA9_0=='&'||(LA9_0 >= '*' && LA9_0 <= '.')||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= '<' && LA9_0 <= '?')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='\\'||(LA9_0 >= '^' && LA9_0 <= '_')||(LA9_0 >= 'a' && LA9_0 <= 'z')||LA9_0=='\u00A3'||LA9_0=='\u00A7'||LA9_0=='\u00E0'||(LA9_0 >= '\u00E8' && LA9_0 <= '\u00E9')||LA9_0=='\u00EC'||LA9_0=='\u00F2'||LA9_0=='\u00F9') && (((openBraces - closeBraces) == 0))) {s = 6;}
						else if ( (LA9_0=='\r') ) {s = 7;}
						else if ( (LA9_0=='\n') ) {s = 8;}
						else if ( (LA9_0=='\t'||LA9_0==' ') ) {s = 9;}
						 
						input.seek(index9_0);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA9_23 = input.LA(1);
						 
						int index9_23 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_23=='/') ) {s = 27;}
						else if ( (LA9_23=='*') ) {s = 23;}
						else if ( (LA9_23==':') ) {s = 24;}
						else if ( ((LA9_23 >= '!' && LA9_23 <= '\"')||LA9_23=='$'||LA9_23=='&'||(LA9_23 >= '+' && LA9_23 <= '.')||(LA9_23 >= '0' && LA9_23 <= '9')||(LA9_23 >= '<' && LA9_23 <= '?')||(LA9_23 >= 'A' && LA9_23 <= 'Z')||LA9_23=='\\'||(LA9_23 >= '^' && LA9_23 <= '_')||(LA9_23 >= 'a' && LA9_23 <= 'z')||LA9_23=='\u00A3'||LA9_23=='\u00A7'||LA9_23=='\u00E0'||(LA9_23 >= '\u00E8' && LA9_23 <= '\u00E9')||LA9_23=='\u00EC'||LA9_23=='\u00F2'||LA9_23=='\u00F9') ) {s = 25;}
						else if ( ((LA9_23 >= '\u0000' && LA9_23 <= ' ')||LA9_23=='#'||LA9_23=='%'||(LA9_23 >= '\'' && LA9_23 <= ')')||LA9_23==';'||LA9_23=='@'||LA9_23=='['||LA9_23==']'||LA9_23=='`'||(LA9_23 >= '{' && LA9_23 <= '\u00A2')||(LA9_23 >= '\u00A4' && LA9_23 <= '\u00A6')||(LA9_23 >= '\u00A8' && LA9_23 <= '\u00DF')||(LA9_23 >= '\u00E1' && LA9_23 <= '\u00E7')||(LA9_23 >= '\u00EA' && LA9_23 <= '\u00EB')||(LA9_23 >= '\u00ED' && LA9_23 <= '\u00F1')||(LA9_23 >= '\u00F3' && LA9_23 <= '\u00F8')||(LA9_23 >= '\u00FA' && LA9_23 <= '\uFFFF')) ) {s = 21;}
						else s = 12;
						 
						input.seek(index9_23);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA9_24 = input.LA(1);
						 
						int index9_24 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA9_24 >= '\u0000' && LA9_24 <= '\uFFFF')) ) {s = 21;}
						else s = 13;
						 
						input.seek(index9_24);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA9_25 = input.LA(1);
						 
						int index9_25 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_25=='*') ) {s = 23;}
						else if ( (LA9_25==':') ) {s = 24;}
						else if ( ((LA9_25 >= '!' && LA9_25 <= '\"')||LA9_25=='$'||LA9_25=='&'||(LA9_25 >= '+' && LA9_25 <= '9')||(LA9_25 >= '<' && LA9_25 <= '?')||(LA9_25 >= 'A' && LA9_25 <= 'Z')||LA9_25=='\\'||(LA9_25 >= '^' && LA9_25 <= '_')||(LA9_25 >= 'a' && LA9_25 <= 'z')||LA9_25=='\u00A3'||LA9_25=='\u00A7'||LA9_25=='\u00E0'||(LA9_25 >= '\u00E8' && LA9_25 <= '\u00E9')||LA9_25=='\u00EC'||LA9_25=='\u00F2'||LA9_25=='\u00F9') ) {s = 25;}
						else if ( ((LA9_25 >= '\u0000' && LA9_25 <= ' ')||LA9_25=='#'||LA9_25=='%'||(LA9_25 >= '\'' && LA9_25 <= ')')||LA9_25==';'||LA9_25=='@'||LA9_25=='['||LA9_25==']'||LA9_25=='`'||(LA9_25 >= '{' && LA9_25 <= '\u00A2')||(LA9_25 >= '\u00A4' && LA9_25 <= '\u00A6')||(LA9_25 >= '\u00A8' && LA9_25 <= '\u00DF')||(LA9_25 >= '\u00E1' && LA9_25 <= '\u00E7')||(LA9_25 >= '\u00EA' && LA9_25 <= '\u00EB')||(LA9_25 >= '\u00ED' && LA9_25 <= '\u00F1')||(LA9_25 >= '\u00F3' && LA9_25 <= '\u00F8')||(LA9_25 >= '\u00FA' && LA9_25 <= '\uFFFF')) ) {s = 21;}
						else s = 12;
						 
						input.seek(index9_25);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA9_27 = input.LA(1);
						s = -1;
						if ( (LA9_27=='*') ) {s = 23;}
						else if ( (LA9_27==':') ) {s = 24;}
						else if ( ((LA9_27 >= '!' && LA9_27 <= '\"')||LA9_27=='$'||LA9_27=='&'||(LA9_27 >= '+' && LA9_27 <= '9')||(LA9_27 >= '<' && LA9_27 <= '?')||(LA9_27 >= 'A' && LA9_27 <= 'Z')||LA9_27=='\\'||(LA9_27 >= '^' && LA9_27 <= '_')||(LA9_27 >= 'a' && LA9_27 <= 'z')||LA9_27=='\u00A3'||LA9_27=='\u00A7'||LA9_27=='\u00E0'||(LA9_27 >= '\u00E8' && LA9_27 <= '\u00E9')||LA9_27=='\u00EC'||LA9_27=='\u00F2'||LA9_27=='\u00F9') ) {s = 25;}
						else if ( ((LA9_27 >= '\u0000' && LA9_27 <= ' ')||LA9_27=='#'||LA9_27=='%'||(LA9_27 >= '\'' && LA9_27 <= ')')||LA9_27==';'||LA9_27=='@'||LA9_27=='['||LA9_27==']'||LA9_27=='`'||(LA9_27 >= '{' && LA9_27 <= '\u00A2')||(LA9_27 >= '\u00A4' && LA9_27 <= '\u00A6')||(LA9_27 >= '\u00A8' && LA9_27 <= '\u00DF')||(LA9_27 >= '\u00E1' && LA9_27 <= '\u00E7')||(LA9_27 >= '\u00EA' && LA9_27 <= '\u00EB')||(LA9_27 >= '\u00ED' && LA9_27 <= '\u00F1')||(LA9_27 >= '\u00F3' && LA9_27 <= '\u00F8')||(LA9_27 >= '\u00FA' && LA9_27 <= '\uFFFF')) ) {s = 21;}
						else s = 28;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA9_16 = input.LA(1);
						 
						int index9_16 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_16=='\'') && (((openBraces - closeBraces) == 0))) {s = 15;}
						else s = 26;
						 
						input.seek(index9_16);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA9_11 = input.LA(1);
						 
						int index9_11 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_11=='*') ) {s = 23;}
						else if ( (LA9_11==':') ) {s = 24;}
						else if ( ((LA9_11 >= '!' && LA9_11 <= '\"')||LA9_11=='$'||LA9_11=='&'||(LA9_11 >= '+' && LA9_11 <= '9')||(LA9_11 >= '<' && LA9_11 <= '?')||(LA9_11 >= 'A' && LA9_11 <= 'Z')||LA9_11=='\\'||(LA9_11 >= '^' && LA9_11 <= '_')||(LA9_11 >= 'a' && LA9_11 <= 'z')||LA9_11=='\u00A3'||LA9_11=='\u00A7'||LA9_11=='\u00E0'||(LA9_11 >= '\u00E8' && LA9_11 <= '\u00E9')||LA9_11=='\u00EC'||LA9_11=='\u00F2'||LA9_11=='\u00F9') ) {s = 25;}
						else if ( ((LA9_11 >= '\u0000' && LA9_11 <= ' ')||LA9_11=='#'||LA9_11=='%'||(LA9_11 >= '\'' && LA9_11 <= ')')||LA9_11==';'||LA9_11=='@'||LA9_11=='['||LA9_11==']'||LA9_11=='`'||(LA9_11 >= '{' && LA9_11 <= '\u00A2')||(LA9_11 >= '\u00A4' && LA9_11 <= '\u00A6')||(LA9_11 >= '\u00A8' && LA9_11 <= '\u00DF')||(LA9_11 >= '\u00E1' && LA9_11 <= '\u00E7')||(LA9_11 >= '\u00EA' && LA9_11 <= '\u00EB')||(LA9_11 >= '\u00ED' && LA9_11 <= '\u00F1')||(LA9_11 >= '\u00F3' && LA9_11 <= '\u00F8')||(LA9_11 >= '\u00FA' && LA9_11 <= '\uFFFF')) ) {s = 21;}
						else s = 12;
						 
						input.seek(index9_11);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA9_28 = input.LA(1);
						 
						int index9_28 = input.index();
						input.rewind();
						s = -1;
						if ( (((openBraces - closeBraces) == 0)) ) {s = 12;}
						else if ( (true) ) {s = 21;}
						 
						input.seek(index9_28);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA9_6 = input.LA(1);
						 
						int index9_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_6==':') && (((openBraces - closeBraces) == 0))) {s = 13;}
						else if ( ((LA9_6 >= '!' && LA9_6 <= '\"')||LA9_6=='$'||LA9_6=='&'||(LA9_6 >= '*' && LA9_6 <= '9')||(LA9_6 >= '<' && LA9_6 <= '?')||(LA9_6 >= 'A' && LA9_6 <= 'Z')||LA9_6=='\\'||(LA9_6 >= '^' && LA9_6 <= '_')||(LA9_6 >= 'a' && LA9_6 <= 'z')||LA9_6=='\u00A3'||LA9_6=='\u00A7'||LA9_6=='\u00E0'||(LA9_6 >= '\u00E8' && LA9_6 <= '\u00E9')||LA9_6=='\u00EC'||LA9_6=='\u00F2'||LA9_6=='\u00F9') && (((openBraces - closeBraces) == 0))) {s = 6;}
						else s = 12;
						 
						input.seek(index9_6);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
