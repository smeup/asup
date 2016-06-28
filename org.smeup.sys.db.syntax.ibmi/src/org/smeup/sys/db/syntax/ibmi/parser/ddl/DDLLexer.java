// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g 2016-06-27 13:45:27

package org.smeup.sys.db.syntax.ibmi.parser.ddl;

import org.smeup.sys.db.syntax.DataBaseSyntaxRuntimeException;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DDLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__280=280;
	public static final int T__281=281;
	public static final int A=4;
	public static final int ALIAS=5;
	public static final int ALIAS_NAME=6;
	public static final int ALL=7;
	public static final int ALLOW=8;
	public static final int ALLOW_READ=9;
	public static final int ALL_SQL=10;
	public static final int AND=11;
	public static final int AS=12;
	public static final int ASC=13;
	public static final int ASSIGN=14;
	public static final int AS_EXPRESSION=15;
	public static final int B=16;
	public static final int BAD=17;
	public static final int BIGINT=18;
	public static final int BINARY=19;
	public static final int BIT=20;
	public static final int BLOB=21;
	public static final int BOOL=22;
	public static final int BOOLEAN=23;
	public static final int BY=24;
	public static final int BYTEA=25;
	public static final int C=26;
	public static final int CALL=27;
	public static final int CASCADE=28;
	public static final int CASE=29;
	public static final int CHAR=30;
	public static final int CHARACTER=31;
	public static final int CHAR_SPECIAL=32;
	public static final int COALESCE=33;
	public static final int COLUMN=34;
	public static final int COLUMNS_LIST=35;
	public static final int COLUMN_NAME=36;
	public static final int COMMA=37;
	public static final int COMMENT=38;
	public static final int COMMIT=39;
	public static final int COMMITTED=40;
	public static final int COMMIT_STATEMENT=41;
	public static final int CONNECT=42;
	public static final int CONNECTION=43;
	public static final int CONNECT_STATEMENT=44;
	public static final int COUNT=45;
	public static final int COUNT_ROWS=46;
	public static final int COUNT_VAL=47;
	public static final int CREATE=48;
	public static final int CREATE_ALIAS_STATEMENT=49;
	public static final int CREATE_INDEX_STATEMENT=50;
	public static final int CREATE_TABLE_STATEMENT=51;
	public static final int CREATE_VIEW_STATEMENT=52;
	public static final int CROSS=53;
	public static final int CUBE=54;
	public static final int CURRENT=55;
	public static final int Character_String_Literal=56;
	public static final int Control_Characters=57;
	public static final int D=58;
	public static final int DATE=59;
	public static final int DB_NAME=60;
	public static final int DEC=61;
	public static final int DECIMAL=62;
	public static final int DEFAULT=63;
	public static final int DESC=64;
	public static final int DESC_TABLE=65;
	public static final int DISCONNECT=66;
	public static final int DISCONNECT_STATEMENT=67;
	public static final int DISTINCT=68;
	public static final int DIVIDE=69;
	public static final int DOT=70;
	public static final int DOUBLE=71;
	public static final int DROP=72;
	public static final int DROP_ALIAS_STATEMENT=73;
	public static final int DROP_INDEX_STATEMENT=74;
	public static final int DROP_TABLE_STATEMENT=75;
	public static final int DROP_VIEW_STATEMENT=76;
	public static final int Digit=77;
	public static final int Double_Quote=78;
	public static final int E=79;
	public static final int ELSE=80;
	public static final int EMPTY_GROUPING_SET=81;
	public static final int END=82;
	public static final int EQUAL=83;
	public static final int ESC_SEQ=84;
	public static final int EXCEPT=85;
	public static final int EXCLUSIVE=86;
	public static final int EXPONENT=87;
	public static final int EXTERNAL=88;
	public static final int Extended_Control_Characters=89;
	public static final int F=90;
	public static final int FALSE=91;
	public static final int FIELD_DEF=92;
	public static final int FIELD_NAME=93;
	public static final int FIELD_TYPE=94;
	public static final int FIRST=95;
	public static final int FLOAT=96;
	public static final int FLOAT4=97;
	public static final int FLOAT8=98;
	public static final int FOR=99;
	public static final int FORMAT=100;
	public static final int FOR_COLUMN=101;
	public static final int FROM=102;
	public static final int FULL=103;
	public static final int FUNCTION=104;
	public static final int FUNC_ARGS=105;
	public static final int G=106;
	public static final int GEQ=107;
	public static final int GROUP=108;
	public static final int GROUP_BY=109;
	public static final int GTH=110;
	public static final int H=111;
	public static final int HAVING=112;
	public static final int HEX_DIGIT=113;
	public static final int HOLD=114;
	public static final int I=115;
	public static final int IN=116;
	public static final int INDEX=117;
	public static final int INDEX_NAME=118;
	public static final int INET4=119;
	public static final int INNER=120;
	public static final int INSERT=121;
	public static final int INT=122;
	public static final int INT1=123;
	public static final int INT2=124;
	public static final int INT4=125;
	public static final int INT8=126;
	public static final int INTEGER=127;
	public static final int INTERSECT=128;
	public static final int INTO=129;
	public static final int IS=130;
	public static final int ISOLATION=131;
	public static final int ISOLATION_LEVEL=132;
	public static final int Identifier=133;
	public static final int J=134;
	public static final int JOIN=135;
	public static final int K=136;
	public static final int L=137;
	public static final int LAST=138;
	public static final int LEFT=139;
	public static final int LEFT_PAREN=140;
	public static final int LEQ=141;
	public static final int LEVEL=142;
	public static final int LIKE=143;
	public static final int LIMIT=144;
	public static final int LOCATION=145;
	public static final int LOCK=146;
	public static final int LOCK_TABLE_STATEMENT=147;
	public static final int LTH=148;
	public static final int M=149;
	public static final int MEMBER=150;
	public static final int MINUS=151;
	public static final int MODE=152;
	public static final int MODULAR=153;
	public static final int MULTIPLY=154;
	public static final int N=155;
	public static final int NAME=156;
	public static final int NATIONAL=157;
	public static final int NATURAL=158;
	public static final int NCHAR=159;
	public static final int NEW_NAME=160;
	public static final int NO=161;
	public static final int NOT=162;
	public static final int NOT_EQUAL=163;
	public static final int NOT_NULL=164;
	public static final int NO_COMMIT=165;
	public static final int NULL=166;
	public static final int NULLIF=167;
	public static final int NULL_ORDER=168;
	public static final int NUMBER=169;
	public static final int NUMERIC=170;
	public static final int NVARCHAR=171;
	public static final int O=172;
	public static final int OCTAL_ESC=173;
	public static final int ON=174;
	public static final int ONLY=175;
	public static final int OR=176;
	public static final int ORDER=177;
	public static final int ORDER_BY=178;
	public static final int OR_REPLACE=179;
	public static final int OUTER=180;
	public static final int P=181;
	public static final int PARAM=182;
	public static final int PARAMS=183;
	public static final int PLUS=184;
	public static final int PRECISION=185;
	public static final int PROCEDURE_ARGS=186;
	public static final int PROCEDURE_CALL_STATEMENT=187;
	public static final int PROCEDURE_NAME=188;
	public static final int Q=189;
	public static final int QUALIFIED=190;
	public static final int Quote=191;
	public static final int R=192;
	public static final int READ=193;
	public static final int READ_COMMITTED=194;
	public static final int READ_ONLY=195;
	public static final int READ_UNCOMMITTED=196;
	public static final int READ_WRITE=197;
	public static final int REAL=198;
	public static final int REAL_NUMBER=199;
	public static final int RELEASE=200;
	public static final int RELEASE_STATEMENT=201;
	public static final int RENAME=202;
	public static final int RENAME_INDEX_STATEMENT=203;
	public static final int RENAME_TABLE_STATEMENT=204;
	public static final int REPEATABLE=205;
	public static final int REPEATABLE_READ=206;
	public static final int REPLACE=207;
	public static final int RESET=208;
	public static final int RESTRICT=209;
	public static final int RIGHT=210;
	public static final int RIGHT_PAREN=211;
	public static final int ROLLBACK=212;
	public static final int ROLLBACK_STATEMENT=213;
	public static final int ROLLUP=214;
	public static final int RW_OPERATION=215;
	public static final int S=216;
	public static final int SELECT=217;
	public static final int SEL_LIST=218;
	public static final int SEMI_COLON=219;
	public static final int SERIALIZABLE=220;
	public static final int SERVER_NAME=221;
	public static final int SET=222;
	public static final int SET_CONNECTION_STATEMENT=223;
	public static final int SET_QUALIFIER=224;
	public static final int SET_TRANSACTION_STATEMENT=225;
	public static final int SHARE=226;
	public static final int SHOW_FUNCTION=227;
	public static final int SHOW_TABLE=228;
	public static final int SMALLINT=229;
	public static final int SORT_KEY=230;
	public static final int SORT_SPECIFIERS=231;
	public static final int SQL=232;
	public static final int STORE=233;
	public static final int STORE_TYPE=234;
	public static final int SYSTEM=235;
	public static final int Space=236;
	public static final int T=237;
	public static final int TABLE=238;
	public static final int TABLE_DEF=239;
	public static final int TABLE_NAME=240;
	public static final int TARGET_FIELDS=241;
	public static final int TEXT=242;
	public static final int THEN=243;
	public static final int TIME=244;
	public static final int TIMESTAMP=245;
	public static final int TIMESTAMPTZ=246;
	public static final int TIMETZ=247;
	public static final int TINYINT=248;
	public static final int TO=249;
	public static final int TRANSACTION=250;
	public static final int TRUE=251;
	public static final int U=252;
	public static final int UNCOMMITTED=253;
	public static final int UNICODE_ESC=254;
	public static final int UNION=255;
	public static final int UNIQUE=256;
	public static final int UNKNOWN=257;
	public static final int USER=258;
	public static final int USING=259;
	public static final int V=260;
	public static final int VALUES=261;
	public static final int VARBINARY=262;
	public static final int VARBIT=263;
	public static final int VARCHAR=264;
	public static final int VARYING=265;
	public static final int VIEW=266;
	public static final int VIEW_NAME=267;
	public static final int W=268;
	public static final int WHEN=269;
	public static final int WHERE=270;
	public static final int WITH=271;
	public static final int WITH_DEFAULT=272;
	public static final int WORK=273;
	public static final int WRITE=274;
	public static final int White_Space=275;
	public static final int X=276;
	public static final int Y=277;
	public static final int Z=278;
	public static final int ZONE=279;


		@Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

	    @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String msg = "DDLLexer error. Input: " + e.input.toString();
	        msg += " " + getErrorHeader(e);
	        msg += " Msg: " + getErrorMessage(e, tokenNames);
	        throw new DataBaseSyntaxRuntimeException(msg , e);
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

	public DDLLexer() {} 
	public DDLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DDLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g"; }

	// $ANTLR start "T__280"
	public final void mT__280() throws RecognitionException {
		try {
			int _type = T__280;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:35:8: ( 'into' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:35:10: 'into'
			{
			match("into"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__280"

	// $ANTLR start "T__281"
	public final void mT__281() throws RecognitionException {
		try {
			int _type = T__281;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:36:8: ( 'values' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:36:10: 'values'
			{
			match("values"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__281"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:171:2: ( 'A' | 'a' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:173:2: ( 'B' | 'b' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:175:2: ( 'C' | 'c' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:177:2: ( 'D' | 'd' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:179:2: ( 'E' | 'e' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:181:2: ( 'F' | 'f' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:183:2: ( 'G' | 'g' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:185:2: ( 'H' | 'h' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:187:2: ( 'I' | 'i' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:189:2: ( 'J' | 'j' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:191:2: ( 'K' | 'k' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:193:2: ( 'L' | 'l' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:195:2: ( 'M' | 'm' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:197:2: ( 'N' | 'n' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:199:2: ( 'O' | 'o' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:201:2: ( 'P' | 'p' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:203:2: ( 'Q' | 'q' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:205:2: ( 'R' | 'r' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:207:2: ( 'S' | 's' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:209:2: ( 'T' | 't' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:211:2: ( 'U' | 'u' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:213:2: ( 'V' | 'v' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:215:2: ( 'W' | 'w' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:217:2: ( 'X' | 'x' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:219:2: ( 'Y' | 'y' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:221:2: ( 'Z' | 'z' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:227:4: ( A S )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:227:6: A S
			{
			mA(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "ALIAS"
	public final void mALIAS() throws RecognitionException {
		try {
			int _type = ALIAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:228:7: ( A L I A S )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:228:9: A L I A S
			{
			mA(); 

			mL(); 

			mI(); 

			mA(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALIAS"

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:229:5: ( A L L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:229:7: A L L
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

	// $ANTLR start "ALLOW"
	public final void mALLOW() throws RecognitionException {
		try {
			int _type = ALLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:230:7: ( A L L O W )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:230:10: A L L O W
			{
			mA(); 

			mL(); 

			mL(); 

			mO(); 

			mW(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALLOW"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:231:5: ( A N D )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:231:7: A N D
			{
			mA(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ASC"
	public final void mASC() throws RecognitionException {
		try {
			int _type = ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:232:5: ( A S C )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:232:7: A S C
			{
			mA(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASC"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:233:4: ( B Y )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:233:6: B Y
			{
			mB(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "CALL"
	public final void mCALL() throws RecognitionException {
		try {
			int _type = CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:234:5: ( C A L L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:234:7: C A L L
			{
			mC(); 

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
	// $ANTLR end "CALL"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:235:6: ( C A S E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:235:8: C A S E
			{
			mC(); 

			mA(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CASCADE"
	public final void mCASCADE() throws RecognitionException {
		try {
			int _type = CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:236:9: ( C A S C A D E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:236:12: C A S C A D E
			{
			mC(); 

			mA(); 

			mS(); 

			mC(); 

			mA(); 

			mD(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASCADE"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:237:11: ( C H A R A C T E R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:237:13: C H A R A C T E R
			{
			mC(); 

			mH(); 

			mA(); 

			mR(); 

			mA(); 

			mC(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "COALESCE"
	public final void mCOALESCE() throws RecognitionException {
		try {
			int _type = COALESCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:238:10: ( C O A L E S C E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:238:12: C O A L E S C E
			{
			mC(); 

			mO(); 

			mA(); 

			mL(); 

			mE(); 

			mS(); 

			mC(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COALESCE"

	// $ANTLR start "COLUMN"
	public final void mCOLUMN() throws RecognitionException {
		try {
			int _type = COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:239:9: ( C O L U M N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:239:11: C O L U M N
			{
			mC(); 

			mO(); 

			mL(); 

			mU(); 

			mM(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLUMN"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:240:7: ( C O U N T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:240:9: C O U N T
			{
			mC(); 

			mO(); 

			mU(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:241:8: ( C R E A T E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:241:10: C R E A T E
			{
			mC(); 

			mR(); 

			mE(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREATE"

	// $ANTLR start "COMMIT"
	public final void mCOMMIT() throws RecognitionException {
		try {
			int _type = COMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:242:8: ( C O M M I T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:242:11: C O M M I T
			{
			mC(); 

			mO(); 

			mM(); 

			mM(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMIT"

	// $ANTLR start "COMMITTED"
	public final void mCOMMITTED() throws RecognitionException {
		try {
			int _type = COMMITTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:243:11: ( C O M M I T T E D )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:243:14: C O M M I T T E D
			{
			mC(); 

			mO(); 

			mM(); 

			mM(); 

			mI(); 

			mT(); 

			mT(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMITTED"

	// $ANTLR start "CONNECT"
	public final void mCONNECT() throws RecognitionException {
		try {
			int _type = CONNECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:244:9: ( C O N N E C T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:244:12: C O N N E C T
			{
			mC(); 

			mO(); 

			mN(); 

			mN(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONNECT"

	// $ANTLR start "CONNECTION"
	public final void mCONNECTION() throws RecognitionException {
		try {
			int _type = CONNECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:245:12: ( C O N N E C T I O N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:245:14: C O N N E C T I O N
			{
			mC(); 

			mO(); 

			mN(); 

			mN(); 

			mE(); 

			mC(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONNECTION"

	// $ANTLR start "CROSS"
	public final void mCROSS() throws RecognitionException {
		try {
			int _type = CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:246:7: ( C R O S S )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:246:9: C R O S S
			{
			mC(); 

			mR(); 

			mO(); 

			mS(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CROSS"

	// $ANTLR start "CUBE"
	public final void mCUBE() throws RecognitionException {
		try {
			int _type = CUBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:247:6: ( C U B E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:247:8: C U B E
			{
			mC(); 

			mU(); 

			mB(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CUBE"

	// $ANTLR start "CURRENT"
	public final void mCURRENT() throws RecognitionException {
		try {
			int _type = CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:248:9: ( C U R R E N T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:248:12: C U R R E N T
			{
			mC(); 

			mU(); 

			mR(); 

			mR(); 

			mE(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURRENT"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:249:9: ( D E F A U L T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:249:11: D E F A U L T
			{
			mD(); 

			mE(); 

			mF(); 

			mA(); 

			mU(); 

			mL(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DESC"
	public final void mDESC() throws RecognitionException {
		try {
			int _type = DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:250:6: ( D E S C )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:250:8: D E S C
			{
			mD(); 

			mE(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESC"

	// $ANTLR start "DISTINCT"
	public final void mDISTINCT() throws RecognitionException {
		try {
			int _type = DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:251:10: ( D I S T I N C T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:251:12: D I S T I N C T
			{
			mD(); 

			mI(); 

			mS(); 

			mT(); 

			mI(); 

			mN(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISTINCT"

	// $ANTLR start "DISCONNECT"
	public final void mDISCONNECT() throws RecognitionException {
		try {
			int _type = DISCONNECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:252:12: ( D I S C O N N E C T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:252:14: D I S C O N N E C T
			{
			mD(); 

			mI(); 

			mS(); 

			mC(); 

			mO(); 

			mN(); 

			mN(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISCONNECT"

	// $ANTLR start "DROP"
	public final void mDROP() throws RecognitionException {
		try {
			int _type = DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:253:6: ( D R O P )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:253:8: D R O P
			{
			mD(); 

			mR(); 

			mO(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROP"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:254:5: ( E N D )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:254:7: E N D
			{
			mE(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:255:6: ( E L S E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:255:8: E L S E
			{
			mE(); 

			mL(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "EXCEPT"
	public final void mEXCEPT() throws RecognitionException {
		try {
			int _type = EXCEPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:256:8: ( E X C E P T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:256:10: E X C E P T
			{
			mE(); 

			mX(); 

			mC(); 

			mE(); 

			mP(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCEPT"

	// $ANTLR start "EXCLUSIVE"
	public final void mEXCLUSIVE() throws RecognitionException {
		try {
			int _type = EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:257:10: ( E X C L U S I V E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:257:13: E X C L U S I V E
			{
			mE(); 

			mX(); 

			mC(); 

			mL(); 

			mU(); 

			mS(); 

			mI(); 

			mV(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCLUSIVE"

	// $ANTLR start "EXTERNAL"
	public final void mEXTERNAL() throws RecognitionException {
		try {
			int _type = EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:258:10: ( E X T E R N A L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:258:12: E X T E R N A L
			{
			mE(); 

			mX(); 

			mT(); 

			mE(); 

			mR(); 

			mN(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTERNAL"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:259:7: ( F A L S E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:259:9: F A L S E
			{
			mF(); 

			mA(); 

			mL(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FIRST"
	public final void mFIRST() throws RecognitionException {
		try {
			int _type = FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:260:7: ( F I R S T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:260:9: F I R S T
			{
			mF(); 

			mI(); 

			mR(); 

			mS(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIRST"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:261:6: ( F O R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:261:9: F O R
			{
			mF(); 

			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FORMAT"
	public final void mFORMAT() throws RecognitionException {
		try {
			int _type = FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:262:8: ( F O R M A T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:262:10: F O R M A T
			{
			mF(); 

			mO(); 

			mR(); 

			mM(); 

			mA(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORMAT"

	// $ANTLR start "FULL"
	public final void mFULL() throws RecognitionException {
		try {
			int _type = FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:263:6: ( F U L L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:263:8: F U L L
			{
			mF(); 

			mU(); 

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
	// $ANTLR end "FULL"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:264:6: ( F R O M )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:264:8: F R O M
			{
			mF(); 

			mR(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "GROUP"
	public final void mGROUP() throws RecognitionException {
		try {
			int _type = GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:265:7: ( G R O U P )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:265:9: G R O U P
			{
			mG(); 

			mR(); 

			mO(); 

			mU(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP"

	// $ANTLR start "HAVING"
	public final void mHAVING() throws RecognitionException {
		try {
			int _type = HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:266:8: ( H A V I N G )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:266:10: H A V I N G
			{
			mH(); 

			mA(); 

			mV(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HAVING"

	// $ANTLR start "HOLD"
	public final void mHOLD() throws RecognitionException {
		try {
			int _type = HOLD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:267:6: ( H O L D )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:267:9: H O L D
			{
			mH(); 

			mO(); 

			mL(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOLD"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:268:4: ( I N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:268:6: I N
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

	// $ANTLR start "INDEX"
	public final void mINDEX() throws RecognitionException {
		try {
			int _type = INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:269:7: ( I N D E X )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:269:9: I N D E X
			{
			mI(); 

			mN(); 

			mD(); 

			mE(); 

			mX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEX"

	// $ANTLR start "INNER"
	public final void mINNER() throws RecognitionException {
		try {
			int _type = INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:270:7: ( I N N E R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:270:9: I N N E R
			{
			mI(); 

			mN(); 

			mN(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INNER"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:271:8: ( I N S E R T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:271:10: I N S E R T
			{
			mI(); 

			mN(); 

			mS(); 

			mE(); 

			mR(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERT"

	// $ANTLR start "INTERSECT"
	public final void mINTERSECT() throws RecognitionException {
		try {
			int _type = INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:272:11: ( I N T E R S E C T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:272:13: I N T E R S E C T
			{
			mI(); 

			mN(); 

			mT(); 

			mE(); 

			mR(); 

			mS(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERSECT"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:273:6: ( I N T O )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:273:8: I N T O
			{
			mI(); 

			mN(); 

			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTO"

	// $ANTLR start "IS"
	public final void mIS() throws RecognitionException {
		try {
			int _type = IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:274:4: ( I S )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:274:6: I S
			{
			mI(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS"

	// $ANTLR start "ISOLATION"
	public final void mISOLATION() throws RecognitionException {
		try {
			int _type = ISOLATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:275:11: ( I S O L A T I O N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:275:13: I S O L A T I O N
			{
			mI(); 

			mS(); 

			mO(); 

			mL(); 

			mA(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISOLATION"

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:276:6: ( J O I N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:276:8: J O I N
			{
			mJ(); 

			mO(); 

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
	// $ANTLR end "JOIN"

	// $ANTLR start "LAST"
	public final void mLAST() throws RecognitionException {
		try {
			int _type = LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:277:6: ( L A S T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:277:8: L A S T
			{
			mL(); 

			mA(); 

			mS(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAST"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:278:6: ( L E F T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:278:8: L E F T
			{
			mL(); 

			mE(); 

			mF(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT"

	// $ANTLR start "LEVEL"
	public final void mLEVEL() throws RecognitionException {
		try {
			int _type = LEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:279:7: ( L E V E L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:279:10: L E V E L
			{
			mL(); 

			mE(); 

			mV(); 

			mE(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEVEL"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:280:6: ( L I K E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:280:8: L I K E
			{
			mL(); 

			mI(); 

			mK(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIKE"

	// $ANTLR start "LIMIT"
	public final void mLIMIT() throws RecognitionException {
		try {
			int _type = LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:281:7: ( L I M I T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:281:9: L I M I T
			{
			mL(); 

			mI(); 

			mM(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIMIT"

	// $ANTLR start "LOCATION"
	public final void mLOCATION() throws RecognitionException {
		try {
			int _type = LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:282:10: ( L O C A T I O N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:282:12: L O C A T I O N
			{
			mL(); 

			mO(); 

			mC(); 

			mA(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCATION"

	// $ANTLR start "LOCK"
	public final void mLOCK() throws RecognitionException {
		try {
			int _type = LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:283:6: ( L O C K )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:283:9: L O C K
			{
			mL(); 

			mO(); 

			mC(); 

			mK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCK"

	// $ANTLR start "MODE"
	public final void mMODE() throws RecognitionException {
		try {
			int _type = MODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:284:6: ( M O D E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:284:9: M O D E
			{
			mM(); 

			mO(); 

			mD(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODE"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:285:6: ( N A M E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:285:9: N A M E
			{
			mN(); 

			mA(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "NATIONAL"
	public final void mNATIONAL() throws RecognitionException {
		try {
			int _type = NATIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:286:10: ( N A T I O N A L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:286:12: N A T I O N A L
			{
			mN(); 

			mA(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIONAL"

	// $ANTLR start "NATURAL"
	public final void mNATURAL() throws RecognitionException {
		try {
			int _type = NATURAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:287:9: ( N A T U R A L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:287:11: N A T U R A L
			{
			mN(); 

			mA(); 

			mT(); 

			mU(); 

			mR(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATURAL"

	// $ANTLR start "NO"
	public final void mNO() throws RecognitionException {
		try {
			int _type = NO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:288:3: ( N O )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:288:5: N O
			{
			mN(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NO"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:289:5: ( N O T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:289:7: N O T
			{
			mN(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:290:6: ( N U L L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:290:8: N U L L
			{
			mN(); 

			mU(); 

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
	// $ANTLR end "NULL"

	// $ANTLR start "NULLIF"
	public final void mNULLIF() throws RecognitionException {
		try {
			int _type = NULLIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:291:8: ( N U L L I F )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:291:10: N U L L I F
			{
			mN(); 

			mU(); 

			mL(); 

			mL(); 

			mI(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULLIF"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:292:4: ( O N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:292:6: O N
			{
			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "ONLY"
	public final void mONLY() throws RecognitionException {
		try {
			int _type = ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:293:5: ( O N L Y )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:293:7: O N L Y
			{
			mO(); 

			mN(); 

			mL(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONLY"

	// $ANTLR start "OUTER"
	public final void mOUTER() throws RecognitionException {
		try {
			int _type = OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:294:7: ( O U T E R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:294:9: O U T E R
			{
			mO(); 

			mU(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTER"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:295:4: ( O R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:295:6: O R
			{
			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:296:7: ( O R D E R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:296:9: O R D E R
			{
			mO(); 

			mR(); 

			mD(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDER"

	// $ANTLR start "PRECISION"
	public final void mPRECISION() throws RecognitionException {
		try {
			int _type = PRECISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:297:11: ( P R E C I S I ON )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:297:13: P R E C I S I ON
			{
			mP(); 

			mR(); 

			mE(); 

			mC(); 

			mI(); 

			mS(); 

			mI(); 

			mON(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRECISION"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:298:6: ( R E A D )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:298:9: R E A D
			{
			mR(); 

			mE(); 

			mA(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RELEASE"
	public final void mRELEASE() throws RecognitionException {
		try {
			int _type = RELEASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:299:9: ( R E L E A S E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:299:11: R E L E A S E
			{
			mR(); 

			mE(); 

			mL(); 

			mE(); 

			mA(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELEASE"

	// $ANTLR start "RENAME"
	public final void mRENAME() throws RecognitionException {
		try {
			int _type = RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:300:8: ( R E N A M E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:300:11: R E N A M E
			{
			mR(); 

			mE(); 

			mN(); 

			mA(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RENAME"

	// $ANTLR start "REPEATABLE"
	public final void mREPEATABLE() throws RecognitionException {
		try {
			int _type = REPEATABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:301:12: ( R E P E A T A B L E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:301:14: R E P E A T A B L E
			{
			mR(); 

			mE(); 

			mP(); 

			mE(); 

			mA(); 

			mT(); 

			mA(); 

			mB(); 

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
	// $ANTLR end "REPEATABLE"

	// $ANTLR start "REPLACE"
	public final void mREPLACE() throws RecognitionException {
		try {
			int _type = REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:302:9: ( R E P L A C E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:302:12: R E P L A C E
			{
			mR(); 

			mE(); 

			mP(); 

			mL(); 

			mA(); 

			mC(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPLACE"

	// $ANTLR start "RESET"
	public final void mRESET() throws RecognitionException {
		try {
			int _type = RESET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:303:7: ( R E S E T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:303:10: R E S E T
			{
			mR(); 

			mE(); 

			mS(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESET"

	// $ANTLR start "RESTRICT"
	public final void mRESTRICT() throws RecognitionException {
		try {
			int _type = RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:304:9: ( R E S T R I C T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:304:12: R E S T R I C T
			{
			mR(); 

			mE(); 

			mS(); 

			mT(); 

			mR(); 

			mI(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESTRICT"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:305:7: ( R I G H T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:305:9: R I G H T
			{
			mR(); 

			mI(); 

			mG(); 

			mH(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT"

	// $ANTLR start "ROLLBACK"
	public final void mROLLBACK() throws RecognitionException {
		try {
			int _type = ROLLBACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:306:9: ( R O L L B A C K )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:306:12: R O L L B A C K
			{
			mR(); 

			mO(); 

			mL(); 

			mL(); 

			mB(); 

			mA(); 

			mC(); 

			mK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROLLBACK"

	// $ANTLR start "ROLLUP"
	public final void mROLLUP() throws RecognitionException {
		try {
			int _type = ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:307:8: ( R O L L U P )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:307:10: R O L L U P
			{
			mR(); 

			mO(); 

			mL(); 

			mL(); 

			mU(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROLLUP"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:308:5: ( S E T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:308:7: S E T
			{
			mS(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:309:8: ( S E L E C T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:309:10: S E L E C T
			{
			mS(); 

			mE(); 

			mL(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SHARE"
	public final void mSHARE() throws RecognitionException {
		try {
			int _type = SHARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:310:7: ( S H A R E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:310:10: S H A R E
			{
			mS(); 

			mH(); 

			mA(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHARE"

	// $ANTLR start "SERIALIZABLE"
	public final void mSERIALIZABLE() throws RecognitionException {
		try {
			int _type = SERIALIZABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:311:15: ( S E R I A L I Z A B L E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:311:18: S E R I A L I Z A B L E
			{
			mS(); 

			mE(); 

			mR(); 

			mI(); 

			mA(); 

			mL(); 

			mI(); 

			mZ(); 

			mA(); 

			mB(); 

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
	// $ANTLR end "SERIALIZABLE"

	// $ANTLR start "SYSTEM"
	public final void mSYSTEM() throws RecognitionException {
		try {
			int _type = SYSTEM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:312:8: ( S Y S T E M )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:312:10: S Y S T E M
			{
			mS(); 

			mY(); 

			mS(); 

			mT(); 

			mE(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYSTEM"

	// $ANTLR start "SQL"
	public final void mSQL() throws RecognitionException {
		try {
			int _type = SQL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:313:5: ( S Q L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:313:8: S Q L
			{
			mS(); 

			mQ(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL"

	// $ANTLR start "TABLE"
	public final void mTABLE() throws RecognitionException {
		try {
			int _type = TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:314:7: ( T A B L E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:314:9: T A B L E
			{
			mT(); 

			mA(); 

			mB(); 

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
	// $ANTLR end "TABLE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:315:6: ( T H E N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:315:8: T H E N
			{
			mT(); 

			mH(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:316:4: ( T O )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:316:7: T O
			{
			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "TRANSACTION"
	public final void mTRANSACTION() throws RecognitionException {
		try {
			int _type = TRANSACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:317:13: ( T R A N S A C T I O N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:317:15: T R A N S A C T I O N
			{
			mT(); 

			mR(); 

			mA(); 

			mN(); 

			mS(); 

			mA(); 

			mC(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSACTION"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:318:6: ( T R U E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:318:8: T R U E
			{
			mT(); 

			mR(); 

			mU(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "UNCOMMITTED"
	public final void mUNCOMMITTED() throws RecognitionException {
		try {
			int _type = UNCOMMITTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:319:13: ( U N C O M M I T T E D )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:319:16: U N C O M M I T T E D
			{
			mU(); 

			mN(); 

			mC(); 

			mO(); 

			mM(); 

			mM(); 

			mI(); 

			mT(); 

			mT(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNCOMMITTED"

	// $ANTLR start "UNION"
	public final void mUNION() throws RecognitionException {
		try {
			int _type = UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:320:7: ( U N I O N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:320:9: U N I O N
			{
			mU(); 

			mN(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION"

	// $ANTLR start "UNIQUE"
	public final void mUNIQUE() throws RecognitionException {
		try {
			int _type = UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:321:8: ( U N I Q U E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:321:10: U N I Q U E
			{
			mU(); 

			mN(); 

			mI(); 

			mQ(); 

			mU(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIQUE"

	// $ANTLR start "UNKNOWN"
	public final void mUNKNOWN() throws RecognitionException {
		try {
			int _type = UNKNOWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:322:9: ( U N K N O W N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:322:11: U N K N O W N
			{
			mU(); 

			mN(); 

			mK(); 

			mN(); 

			mO(); 

			mW(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNKNOWN"

	// $ANTLR start "USING"
	public final void mUSING() throws RecognitionException {
		try {
			int _type = USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:323:7: ( U S I N G )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:323:9: U S I N G
			{
			mU(); 

			mS(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USING"

	// $ANTLR start "USER"
	public final void mUSER() throws RecognitionException {
		try {
			int _type = USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:324:6: ( U S E R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:324:8: U S E R
			{
			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USER"

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:325:8: ( V A L U E S )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:325:10: V A L U E S
			{
			mV(); 

			mA(); 

			mL(); 

			mU(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUES"

	// $ANTLR start "VARYING"
	public final void mVARYING() throws RecognitionException {
		try {
			int _type = VARYING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:326:9: ( V A R Y I N G )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:326:11: V A R Y I N G
			{
			mV(); 

			mA(); 

			mR(); 

			mY(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARYING"

	// $ANTLR start "WHEN"
	public final void mWHEN() throws RecognitionException {
		try {
			int _type = WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:327:6: ( W H E N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:327:8: W H E N
			{
			mW(); 

			mH(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHEN"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:328:7: ( W H E R E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:328:9: W H E R E
			{
			mW(); 

			mH(); 

			mE(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:329:6: ( W I T H )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:329:8: W I T H
			{
			mW(); 

			mI(); 

			mT(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "WORK"
	public final void mWORK() throws RecognitionException {
		try {
			int _type = WORK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:330:6: ( W O R K )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:330:9: W O R K
			{
			mW(); 

			mO(); 

			mR(); 

			mK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORK"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:331:6: ( W R I T E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:331:8: W R I T E
			{
			mW(); 

			mR(); 

			mI(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "VIEW"
	public final void mVIEW() throws RecognitionException {
		try {
			int _type = VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:332:6: ( V I E W )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:332:8: V I E W
			{
			mV(); 

			mI(); 

			mE(); 

			mW(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIEW"

	// $ANTLR start "ZONE"
	public final void mZONE() throws RecognitionException {
		try {
			int _type = ZONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:333:6: ( Z O N E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:333:8: Z O N E
			{
			mZ(); 

			mO(); 

			mN(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZONE"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:339:9: ( B O O L E A N )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:339:11: B O O L E A N
			{
			mB(); 

			mO(); 

			mO(); 

			mL(); 

			mE(); 

			mA(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:340:6: ( B O O L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:340:8: B O O L
			{
			mB(); 

			mO(); 

			mO(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "BIT"
	public final void mBIT() throws RecognitionException {
		try {
			int _type = BIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:341:5: ( B I T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:341:7: B I T
			{
			mB(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT"

	// $ANTLR start "VARBIT"
	public final void mVARBIT() throws RecognitionException {
		try {
			int _type = VARBIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:342:8: ( V A R B I T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:342:10: V A R B I T
			{
			mV(); 

			mA(); 

			mR(); 

			mB(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARBIT"

	// $ANTLR start "INT1"
	public final void mINT1() throws RecognitionException {
		try {
			int _type = INT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:343:6: ( I N T '1' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:343:8: I N T '1'
			{
			mI(); 

			mN(); 

			mT(); 

			match('1'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT1"

	// $ANTLR start "INT2"
	public final void mINT2() throws RecognitionException {
		try {
			int _type = INT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:344:6: ( I N T '2' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:344:8: I N T '2'
			{
			mI(); 

			mN(); 

			mT(); 

			match('2'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT2"

	// $ANTLR start "INT4"
	public final void mINT4() throws RecognitionException {
		try {
			int _type = INT4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:345:6: ( I N T '4' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:345:8: I N T '4'
			{
			mI(); 

			mN(); 

			mT(); 

			match('4'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT4"

	// $ANTLR start "INT8"
	public final void mINT8() throws RecognitionException {
		try {
			int _type = INT8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:346:6: ( I N T '8' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:346:8: I N T '8'
			{
			mI(); 

			mN(); 

			mT(); 

			match('8'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT8"

	// $ANTLR start "TINYINT"
	public final void mTINYINT() throws RecognitionException {
		try {
			int _type = TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:347:9: ( T I N Y I N T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:347:11: T I N Y I N T
			{
			mT(); 

			mI(); 

			mN(); 

			mY(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TINYINT"

	// $ANTLR start "SMALLINT"
	public final void mSMALLINT() throws RecognitionException {
		try {
			int _type = SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:348:10: ( S M A L L I N T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:348:12: S M A L L I N T
			{
			mS(); 

			mM(); 

			mA(); 

			mL(); 

			mL(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLINT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:349:5: ( I N T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:349:7: I N T
			{
			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:350:9: ( I N T E G E R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:350:11: I N T E G E R
			{
			mI(); 

			mN(); 

			mT(); 

			mE(); 

			mG(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "BIGINT"
	public final void mBIGINT() throws RecognitionException {
		try {
			int _type = BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:351:8: ( B I G I N T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:351:10: B I G I N T
			{
			mB(); 

			mI(); 

			mG(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIGINT"

	// $ANTLR start "FLOAT4"
	public final void mFLOAT4() throws RecognitionException {
		try {
			int _type = FLOAT4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:352:8: ( F L O A T '4' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:352:10: F L O A T '4'
			{
			mF(); 

			mL(); 

			mO(); 

			mA(); 

			mT(); 

			match('4'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT4"

	// $ANTLR start "FLOAT8"
	public final void mFLOAT8() throws RecognitionException {
		try {
			int _type = FLOAT8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:353:8: ( F L O A T '8' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:353:10: F L O A T '8'
			{
			mF(); 

			mL(); 

			mO(); 

			mA(); 

			mT(); 

			match('8'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT8"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:354:6: ( R E A L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:354:8: R E A L
			{
			mR(); 

			mE(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:355:7: ( F L O A T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:355:9: F L O A T
			{
			mF(); 

			mL(); 

			mO(); 

			mA(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:356:8: ( D O U B L E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:356:10: D O U B L E
			{
			mD(); 

			mO(); 

			mU(); 

			mB(); 

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
	// $ANTLR end "DOUBLE"

	// $ANTLR start "NUMERIC"
	public final void mNUMERIC() throws RecognitionException {
		try {
			int _type = NUMERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:357:9: ( N U M E R I C )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:357:11: N U M E R I C
			{
			mN(); 

			mU(); 

			mM(); 

			mE(); 

			mR(); 

			mI(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERIC"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			int _type = DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:358:9: ( D E C I M A L )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:358:11: D E C I M A L
			{
			mD(); 

			mE(); 

			mC(); 

			mI(); 

			mM(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:359:6: ( D E C )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:359:8: D E C
			{
			mD(); 

			mE(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:360:6: ( C H A R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:360:8: C H A R
			{
			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VARCHAR"
	public final void mVARCHAR() throws RecognitionException {
		try {
			int _type = VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:361:9: ( V A R C H A R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:361:11: V A R C H A R
			{
			mV(); 

			mA(); 

			mR(); 

			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARCHAR"

	// $ANTLR start "NCHAR"
	public final void mNCHAR() throws RecognitionException {
		try {
			int _type = NCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:362:7: ( N C H A R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:362:9: N C H A R
			{
			mN(); 

			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NCHAR"

	// $ANTLR start "NVARCHAR"
	public final void mNVARCHAR() throws RecognitionException {
		try {
			int _type = NVARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:363:10: ( N V A R C H A R )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:363:12: N V A R C H A R
			{
			mN(); 

			mV(); 

			mA(); 

			mR(); 

			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NVARCHAR"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:364:6: ( D A T E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:364:8: D A T E
			{
			mD(); 

			mA(); 

			mT(); 

			mE(); 

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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:365:6: ( T I M E )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:365:8: T I M E
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME"

	// $ANTLR start "TIMETZ"
	public final void mTIMETZ() throws RecognitionException {
		try {
			int _type = TIMETZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:366:8: ( T I M E T Z )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:366:10: T I M E T Z
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mT(); 

			mZ(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMETZ"

	// $ANTLR start "TIMESTAMP"
	public final void mTIMESTAMP() throws RecognitionException {
		try {
			int _type = TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:367:11: ( T I M E S T A M P )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:367:13: T I M E S T A M P
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mS(); 

			mT(); 

			mA(); 

			mM(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMESTAMP"

	// $ANTLR start "TIMESTAMPTZ"
	public final void mTIMESTAMPTZ() throws RecognitionException {
		try {
			int _type = TIMESTAMPTZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:368:13: ( T I M E S T A M P T Z )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:368:15: T I M E S T A M P T Z
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mS(); 

			mT(); 

			mA(); 

			mM(); 

			mP(); 

			mT(); 

			mZ(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMESTAMPTZ"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:369:6: ( T E X T )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:369:8: T E X T
			{
			mT(); 

			mE(); 

			mX(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "BINARY"
	public final void mBINARY() throws RecognitionException {
		try {
			int _type = BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:370:8: ( B I N A R Y )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:370:10: B I N A R Y
			{
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
	// $ANTLR end "BINARY"

	// $ANTLR start "VARBINARY"
	public final void mVARBINARY() throws RecognitionException {
		try {
			int _type = VARBINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:371:11: ( V A R B I N A R Y )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:371:13: V A R B I N A R Y
			{
			mV(); 

			mA(); 

			mR(); 

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
	// $ANTLR end "VARBINARY"

	// $ANTLR start "BLOB"
	public final void mBLOB() throws RecognitionException {
		try {
			int _type = BLOB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:372:6: ( B L O B )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:372:8: B L O B
			{
			mB(); 

			mL(); 

			mO(); 

			mB(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLOB"

	// $ANTLR start "BYTEA"
	public final void mBYTEA() throws RecognitionException {
		try {
			int _type = BYTEA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:373:7: ( B Y T E A )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:373:9: B Y T E A
			{
			mB(); 

			mY(); 

			mT(); 

			mE(); 

			mA(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTEA"

	// $ANTLR start "INET4"
	public final void mINET4() throws RecognitionException {
		try {
			int _type = INET4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:374:7: ( I N E T '4' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:374:9: I N E T '4'
			{
			mI(); 

			mN(); 

			mE(); 

			mT(); 

			match('4'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INET4"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1201:9: ( ':=' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1201:11: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1202:8: ( '=' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1202:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "SEMI_COLON"
	public final void mSEMI_COLON() throws RecognitionException {
		try {
			int _type = SEMI_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1203:12: ( ';' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1203:15: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI_COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1204:7: ( ',' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1204:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "NOT_EQUAL"
	public final void mNOT_EQUAL() throws RecognitionException {
		try {
			int _type = NOT_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1205:12: ( '<>' | '!=' | '~=' | '^=' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case '<':
				{
				alt1=1;
				}
				break;
			case '!':
				{
				alt1=2;
				}
				break;
			case '~':
				{
				alt1=3;
				}
				break;
			case '^':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1205:14: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1205:21: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1205:28: '~='
					{
					match("~="); 

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1205:34: '^='
					{
					match("^="); 

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
	// $ANTLR end "NOT_EQUAL"

	// $ANTLR start "LTH"
	public final void mLTH() throws RecognitionException {
		try {
			int _type = LTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1206:5: ( '<' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1206:7: '<'
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
	// $ANTLR end "LTH"

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1207:5: ( '<=' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1207:7: '<='
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
	// $ANTLR end "LEQ"

	// $ANTLR start "GTH"
	public final void mGTH() throws RecognitionException {
		try {
			int _type = GTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1208:7: ( '>' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1208:9: '>'
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
	// $ANTLR end "GTH"

	// $ANTLR start "GEQ"
	public final void mGEQ() throws RecognitionException {
		try {
			int _type = GEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1209:7: ( '>=' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1209:9: '>='
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
	// $ANTLR end "GEQ"

	// $ANTLR start "LEFT_PAREN"
	public final void mLEFT_PAREN() throws RecognitionException {
		try {
			int _type = LEFT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1210:12: ( '(' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1210:15: '('
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
	// $ANTLR end "LEFT_PAREN"

	// $ANTLR start "RIGHT_PAREN"
	public final void mRIGHT_PAREN() throws RecognitionException {
		try {
			int _type = RIGHT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1211:13: ( ')' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1211:15: ')'
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
	// $ANTLR end "RIGHT_PAREN"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1212:7: ( '+' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1212:9: '+'
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1213:7: ( '-' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1213:9: '-'
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

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1214:9: ( '*' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1214:11: '*'
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
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1215:9: ( '/' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1215:11: '/'
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
	// $ANTLR end "DIVIDE"

	// $ANTLR start "MODULAR"
	public final void mMODULAR() throws RecognitionException {
		try {
			int _type = MODULAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1216:9: ( '%' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1216:11: '%'
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
	// $ANTLR end "MODULAR"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1217:5: ( '.' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1217:7: '.'
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
	// $ANTLR end "DOT"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1218:8: ( ( Digit )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1218:10: ( Digit )+
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1218:10: ( Digit )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
	// $ANTLR end "NUMBER"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1221:7: ( '0' .. '9' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
	// $ANTLR end "Digit"

	// $ANTLR start "REAL_NUMBER"
	public final void mREAL_NUMBER() throws RecognitionException {
		try {
			int _type = REAL_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1222:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1222:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1222:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1222:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
							break loop4;
						}
					}

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1222:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1222:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1223:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1223:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1223:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1223:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1224:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1224:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

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
	// $ANTLR end "REAL_NUMBER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1227:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1227:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1227:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
							break loop10;
						}
					}

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1227:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1227:28: '\\r'
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1228:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1228:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1228:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
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

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1236:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' ) ( 'a' .. 'z' | 'A' .. 'Z' | Digit | CHAR_SPECIAL )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1236:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' ) ( 'a' .. 'z' | 'A' .. 'Z' | Digit | CHAR_SPECIAL )*
			{
			if ( input.LA(1)==':'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1236:33: ( 'a' .. 'z' | 'A' .. 'Z' | Digit | CHAR_SPECIAL )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '!' && LA14_0 <= '\"')||(LA14_0 >= '$' && LA14_0 <= '&')||(LA14_0 >= '*' && LA14_0 <= '+')||(LA14_0 >= '-' && LA14_0 <= '.')||(LA14_0 >= '0' && LA14_0 <= ':')||(LA14_0 >= '<' && LA14_0 <= '?')||(LA14_0 >= 'A' && LA14_0 <= 'Z')||LA14_0=='\\'||(LA14_0 >= '^' && LA14_0 <= '_')||(LA14_0 >= 'a' && LA14_0 <= 'z')||LA14_0=='\u00A3'||LA14_0=='\u00A7'||LA14_0=='\u00E0'||(LA14_0 >= '\u00E8' && LA14_0 <= '\u00E9')||LA14_0=='\u00EC'||LA14_0=='\u00F2'||LA14_0=='\u00F9') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
					{
					if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
	// $ANTLR end "Identifier"

	// $ANTLR start "Control_Characters"
	public final void mControl_Characters() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1246:37: ( '\\u0001' .. '\\u001F' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			if ( (input.LA(1) >= '\u0001' && input.LA(1) <= '\u001F') ) {
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
	// $ANTLR end "Control_Characters"

	// $ANTLR start "Extended_Control_Characters"
	public final void mExtended_Control_Characters() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1248:37: ( '\\u0080' .. '\\u009F' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			if ( (input.LA(1) >= '\u0080' && input.LA(1) <= '\u009F') ) {
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
	// $ANTLR end "Extended_Control_Characters"

	// $ANTLR start "Character_String_Literal"
	public final void mCharacter_String_Literal() throws RecognitionException {
		try {
			int _type = Character_String_Literal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1249:5: ( Quote ( ESC_SEQ |~ ( '\\\\' | Quote ) )* Quote | Double_Quote ( ESC_SEQ |~ ( '\\\\' | Double_Quote ) )* Double_Quote )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\'') ) {
				alt17=1;
			}
			else if ( (LA17_0=='\"') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1249:7: Quote ( ESC_SEQ |~ ( '\\\\' | Quote ) )* Quote
					{
					mQuote(); 

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1249:13: ( ESC_SEQ |~ ( '\\\\' | Quote ) )*
					loop15:
					while (true) {
						int alt15=3;
						int LA15_0 = input.LA(1);
						if ( (LA15_0=='\\') ) {
							alt15=1;
						}
						else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
							alt15=2;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1249:15: ESC_SEQ
							{
							mESC_SEQ(); 

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1249:25: ~ ( '\\\\' | Quote )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
							break loop15;
						}
					}

					mQuote(); 

					 setText(getText().substring(1, getText().length()-1)); 
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1251:7: Double_Quote ( ESC_SEQ |~ ( '\\\\' | Double_Quote ) )* Double_Quote
					{
					mDouble_Quote(); 

					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1251:20: ( ESC_SEQ |~ ( '\\\\' | Double_Quote ) )*
					loop16:
					while (true) {
						int alt16=3;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='\\') ) {
							alt16=1;
						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
							alt16=2;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1251:22: ESC_SEQ
							{
							mESC_SEQ(); 

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1251:32: ~ ( '\\\\' | Double_Quote )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

					mDouble_Quote(); 

					 setText(getText().substring(1, getText().length()-1)); 
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
	// $ANTLR end "Character_String_Literal"

	// $ANTLR start "Quote"
	public final void mQuote() throws RecognitionException {
		try {
			int _type = Quote;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1255:3: ( '\\'' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1255:5: '\\''
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
	// $ANTLR end "Quote"

	// $ANTLR start "Double_Quote"
	public final void mDouble_Quote() throws RecognitionException {
		try {
			int _type = Double_Quote;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1257:3: ( '\"' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1257:5: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Double_Quote"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1260:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1260:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1260:22: ( '+' | '-' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='+'||LA18_0=='-') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1260:33: ( '0' .. '9' )+
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1262:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
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
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1265:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt20=1;
					}
					break;
				case 'u':
					{
					alt20=2;
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
					{
					alt20=3;
					}
					break;
				default:
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1265:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1266:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1267:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1271:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				int LA21_1 = input.LA(2);
				if ( ((LA21_1 >= '0' && LA21_1 <= '3')) ) {
					int LA21_2 = input.LA(3);
					if ( ((LA21_2 >= '0' && LA21_2 <= '7')) ) {
						int LA21_4 = input.LA(4);
						if ( ((LA21_4 >= '0' && LA21_4 <= '7')) ) {
							alt21=1;
						}

						else {
							alt21=2;
						}

					}

					else {
						alt21=3;
					}

				}
				else if ( ((LA21_1 >= '4' && LA21_1 <= '7')) ) {
					int LA21_3 = input.LA(3);
					if ( ((LA21_3 >= '0' && LA21_3 <= '7')) ) {
						alt21=2;
					}

					else {
						alt21=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1271:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1272:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1273:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1277:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1277:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1282:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | '\\u00a3' | '&' | '*' | '=' | '>' | '<' | '+' | '-' | '!' | '\\\\' | '%' | ':' ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||input.LA(1)==':'||(input.LA(1) >= '<' && input.LA(1) <= '?')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1316:7: ( ' ' )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1316:9: ' '
			{
			match(' '); 

				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "White_Space"
	public final void mWhite_Space() throws RecognitionException {
		try {
			int _type = White_Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1320:13: ( ( Control_Characters | Extended_Control_Characters )+ )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1320:15: ( Control_Characters | Extended_Control_Characters )+
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1320:15: ( Control_Characters | Extended_Control_Characters )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '\u0001' && LA22_0 <= '\u001F')||(LA22_0 >= '\u0080' && LA22_0 <= '\u009F')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
					{
					if ( (input.LA(1) >= '\u0001' && input.LA(1) <= '\u001F')||(input.LA(1) >= '\u0080' && input.LA(1) <= '\u009F') ) {
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
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}


				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "White_Space"

	// $ANTLR start "BAD"
	public final void mBAD() throws RecognitionException {
		try {
			int _type = BAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1324:5: ( . )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1324:7: .
			{
			matchAny(); 

			  skip();

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BAD"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:8: ( T__280 | T__281 | AS | ALIAS | ALL | ALLOW | AND | ASC | BY | CALL | CASE | CASCADE | CHARACTER | COALESCE | COLUMN | COUNT | CREATE | COMMIT | COMMITTED | CONNECT | CONNECTION | CROSS | CUBE | CURRENT | DEFAULT | DESC | DISTINCT | DISCONNECT | DROP | END | ELSE | EXCEPT | EXCLUSIVE | EXTERNAL | FALSE | FIRST | FOR | FORMAT | FULL | FROM | GROUP | HAVING | HOLD | IN | INDEX | INNER | INSERT | INTERSECT | INTO | IS | ISOLATION | JOIN | LAST | LEFT | LEVEL | LIKE | LIMIT | LOCATION | LOCK | MODE | NAME | NATIONAL | NATURAL | NO | NOT | NULL | NULLIF | ON | ONLY | OUTER | OR | ORDER | PRECISION | READ | RELEASE | RENAME | REPEATABLE | REPLACE | RESET | RESTRICT | RIGHT | ROLLBACK | ROLLUP | SET | SELECT | SHARE | SERIALIZABLE | SYSTEM | SQL | TABLE | THEN | TO | TRANSACTION | TRUE | UNCOMMITTED | UNION | UNIQUE | UNKNOWN | USING | USER | VALUES | VARYING | WHEN | WHERE | WITH | WORK | WRITE | VIEW | ZONE | BOOLEAN | BOOL | BIT | VARBIT | INT1 | INT2 | INT4 | INT8 | TINYINT | SMALLINT | INT | INTEGER | BIGINT | FLOAT4 | FLOAT8 | REAL | FLOAT | DOUBLE | NUMERIC | DECIMAL | DEC | CHAR | VARCHAR | NCHAR | NVARCHAR | DATE | TIME | TIMETZ | TIMESTAMP | TIMESTAMPTZ | TEXT | BINARY | VARBINARY | BLOB | BYTEA | INET4 | ASSIGN | EQUAL | SEMI_COLON | COMMA | NOT_EQUAL | LTH | LEQ | GTH | GEQ | LEFT_PAREN | RIGHT_PAREN | PLUS | MINUS | MULTIPLY | DIVIDE | MODULAR | DOT | NUMBER | REAL_NUMBER | COMMENT | Identifier | Character_String_Literal | Quote | Double_Quote | Space | White_Space | BAD )
		int alt23=172;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:10: T__280
				{
				mT__280(); 

				}
				break;
			case 2 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:17: T__281
				{
				mT__281(); 

				}
				break;
			case 3 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:24: AS
				{
				mAS(); 

				}
				break;
			case 4 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:27: ALIAS
				{
				mALIAS(); 

				}
				break;
			case 5 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:33: ALL
				{
				mALL(); 

				}
				break;
			case 6 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:37: ALLOW
				{
				mALLOW(); 

				}
				break;
			case 7 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:43: AND
				{
				mAND(); 

				}
				break;
			case 8 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:47: ASC
				{
				mASC(); 

				}
				break;
			case 9 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:51: BY
				{
				mBY(); 

				}
				break;
			case 10 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:54: CALL
				{
				mCALL(); 

				}
				break;
			case 11 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:59: CASE
				{
				mCASE(); 

				}
				break;
			case 12 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:64: CASCADE
				{
				mCASCADE(); 

				}
				break;
			case 13 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:72: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 14 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:82: COALESCE
				{
				mCOALESCE(); 

				}
				break;
			case 15 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:91: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 16 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:98: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 17 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:104: CREATE
				{
				mCREATE(); 

				}
				break;
			case 18 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:111: COMMIT
				{
				mCOMMIT(); 

				}
				break;
			case 19 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:118: COMMITTED
				{
				mCOMMITTED(); 

				}
				break;
			case 20 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:128: CONNECT
				{
				mCONNECT(); 

				}
				break;
			case 21 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:136: CONNECTION
				{
				mCONNECTION(); 

				}
				break;
			case 22 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:147: CROSS
				{
				mCROSS(); 

				}
				break;
			case 23 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:153: CUBE
				{
				mCUBE(); 

				}
				break;
			case 24 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:158: CURRENT
				{
				mCURRENT(); 

				}
				break;
			case 25 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:166: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 26 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:174: DESC
				{
				mDESC(); 

				}
				break;
			case 27 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:179: DISTINCT
				{
				mDISTINCT(); 

				}
				break;
			case 28 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:188: DISCONNECT
				{
				mDISCONNECT(); 

				}
				break;
			case 29 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:199: DROP
				{
				mDROP(); 

				}
				break;
			case 30 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:204: END
				{
				mEND(); 

				}
				break;
			case 31 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:208: ELSE
				{
				mELSE(); 

				}
				break;
			case 32 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:213: EXCEPT
				{
				mEXCEPT(); 

				}
				break;
			case 33 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:220: EXCLUSIVE
				{
				mEXCLUSIVE(); 

				}
				break;
			case 34 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:230: EXTERNAL
				{
				mEXTERNAL(); 

				}
				break;
			case 35 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:239: FALSE
				{
				mFALSE(); 

				}
				break;
			case 36 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:245: FIRST
				{
				mFIRST(); 

				}
				break;
			case 37 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:251: FOR
				{
				mFOR(); 

				}
				break;
			case 38 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:255: FORMAT
				{
				mFORMAT(); 

				}
				break;
			case 39 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:262: FULL
				{
				mFULL(); 

				}
				break;
			case 40 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:267: FROM
				{
				mFROM(); 

				}
				break;
			case 41 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:272: GROUP
				{
				mGROUP(); 

				}
				break;
			case 42 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:278: HAVING
				{
				mHAVING(); 

				}
				break;
			case 43 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:285: HOLD
				{
				mHOLD(); 

				}
				break;
			case 44 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:290: IN
				{
				mIN(); 

				}
				break;
			case 45 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:293: INDEX
				{
				mINDEX(); 

				}
				break;
			case 46 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:299: INNER
				{
				mINNER(); 

				}
				break;
			case 47 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:305: INSERT
				{
				mINSERT(); 

				}
				break;
			case 48 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:312: INTERSECT
				{
				mINTERSECT(); 

				}
				break;
			case 49 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:322: INTO
				{
				mINTO(); 

				}
				break;
			case 50 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:327: IS
				{
				mIS(); 

				}
				break;
			case 51 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:330: ISOLATION
				{
				mISOLATION(); 

				}
				break;
			case 52 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:340: JOIN
				{
				mJOIN(); 

				}
				break;
			case 53 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:345: LAST
				{
				mLAST(); 

				}
				break;
			case 54 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:350: LEFT
				{
				mLEFT(); 

				}
				break;
			case 55 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:355: LEVEL
				{
				mLEVEL(); 

				}
				break;
			case 56 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:361: LIKE
				{
				mLIKE(); 

				}
				break;
			case 57 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:366: LIMIT
				{
				mLIMIT(); 

				}
				break;
			case 58 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:372: LOCATION
				{
				mLOCATION(); 

				}
				break;
			case 59 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:381: LOCK
				{
				mLOCK(); 

				}
				break;
			case 60 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:386: MODE
				{
				mMODE(); 

				}
				break;
			case 61 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:391: NAME
				{
				mNAME(); 

				}
				break;
			case 62 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:396: NATIONAL
				{
				mNATIONAL(); 

				}
				break;
			case 63 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:405: NATURAL
				{
				mNATURAL(); 

				}
				break;
			case 64 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:413: NO
				{
				mNO(); 

				}
				break;
			case 65 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:416: NOT
				{
				mNOT(); 

				}
				break;
			case 66 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:420: NULL
				{
				mNULL(); 

				}
				break;
			case 67 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:425: NULLIF
				{
				mNULLIF(); 

				}
				break;
			case 68 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:432: ON
				{
				mON(); 

				}
				break;
			case 69 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:435: ONLY
				{
				mONLY(); 

				}
				break;
			case 70 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:440: OUTER
				{
				mOUTER(); 

				}
				break;
			case 71 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:446: OR
				{
				mOR(); 

				}
				break;
			case 72 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:449: ORDER
				{
				mORDER(); 

				}
				break;
			case 73 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:455: PRECISION
				{
				mPRECISION(); 

				}
				break;
			case 74 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:465: READ
				{
				mREAD(); 

				}
				break;
			case 75 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:470: RELEASE
				{
				mRELEASE(); 

				}
				break;
			case 76 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:478: RENAME
				{
				mRENAME(); 

				}
				break;
			case 77 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:485: REPEATABLE
				{
				mREPEATABLE(); 

				}
				break;
			case 78 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:496: REPLACE
				{
				mREPLACE(); 

				}
				break;
			case 79 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:504: RESET
				{
				mRESET(); 

				}
				break;
			case 80 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:510: RESTRICT
				{
				mRESTRICT(); 

				}
				break;
			case 81 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:519: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 82 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:525: ROLLBACK
				{
				mROLLBACK(); 

				}
				break;
			case 83 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:534: ROLLUP
				{
				mROLLUP(); 

				}
				break;
			case 84 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:541: SET
				{
				mSET(); 

				}
				break;
			case 85 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:545: SELECT
				{
				mSELECT(); 

				}
				break;
			case 86 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:552: SHARE
				{
				mSHARE(); 

				}
				break;
			case 87 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:558: SERIALIZABLE
				{
				mSERIALIZABLE(); 

				}
				break;
			case 88 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:571: SYSTEM
				{
				mSYSTEM(); 

				}
				break;
			case 89 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:578: SQL
				{
				mSQL(); 

				}
				break;
			case 90 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:582: TABLE
				{
				mTABLE(); 

				}
				break;
			case 91 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:588: THEN
				{
				mTHEN(); 

				}
				break;
			case 92 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:593: TO
				{
				mTO(); 

				}
				break;
			case 93 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:596: TRANSACTION
				{
				mTRANSACTION(); 

				}
				break;
			case 94 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:608: TRUE
				{
				mTRUE(); 

				}
				break;
			case 95 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:613: UNCOMMITTED
				{
				mUNCOMMITTED(); 

				}
				break;
			case 96 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:625: UNION
				{
				mUNION(); 

				}
				break;
			case 97 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:631: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 98 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:638: UNKNOWN
				{
				mUNKNOWN(); 

				}
				break;
			case 99 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:646: USING
				{
				mUSING(); 

				}
				break;
			case 100 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:652: USER
				{
				mUSER(); 

				}
				break;
			case 101 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:657: VALUES
				{
				mVALUES(); 

				}
				break;
			case 102 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:664: VARYING
				{
				mVARYING(); 

				}
				break;
			case 103 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:672: WHEN
				{
				mWHEN(); 

				}
				break;
			case 104 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:677: WHERE
				{
				mWHERE(); 

				}
				break;
			case 105 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:683: WITH
				{
				mWITH(); 

				}
				break;
			case 106 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:688: WORK
				{
				mWORK(); 

				}
				break;
			case 107 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:693: WRITE
				{
				mWRITE(); 

				}
				break;
			case 108 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:699: VIEW
				{
				mVIEW(); 

				}
				break;
			case 109 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:704: ZONE
				{
				mZONE(); 

				}
				break;
			case 110 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:709: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 111 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:717: BOOL
				{
				mBOOL(); 

				}
				break;
			case 112 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:722: BIT
				{
				mBIT(); 

				}
				break;
			case 113 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:726: VARBIT
				{
				mVARBIT(); 

				}
				break;
			case 114 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:733: INT1
				{
				mINT1(); 

				}
				break;
			case 115 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:738: INT2
				{
				mINT2(); 

				}
				break;
			case 116 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:743: INT4
				{
				mINT4(); 

				}
				break;
			case 117 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:748: INT8
				{
				mINT8(); 

				}
				break;
			case 118 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:753: TINYINT
				{
				mTINYINT(); 

				}
				break;
			case 119 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:761: SMALLINT
				{
				mSMALLINT(); 

				}
				break;
			case 120 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:770: INT
				{
				mINT(); 

				}
				break;
			case 121 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:774: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 122 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:782: BIGINT
				{
				mBIGINT(); 

				}
				break;
			case 123 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:789: FLOAT4
				{
				mFLOAT4(); 

				}
				break;
			case 124 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:796: FLOAT8
				{
				mFLOAT8(); 

				}
				break;
			case 125 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:803: REAL
				{
				mREAL(); 

				}
				break;
			case 126 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:808: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 127 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:814: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 128 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:821: NUMERIC
				{
				mNUMERIC(); 

				}
				break;
			case 129 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:829: DECIMAL
				{
				mDECIMAL(); 

				}
				break;
			case 130 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:837: DEC
				{
				mDEC(); 

				}
				break;
			case 131 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:841: CHAR
				{
				mCHAR(); 

				}
				break;
			case 132 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:846: VARCHAR
				{
				mVARCHAR(); 

				}
				break;
			case 133 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:854: NCHAR
				{
				mNCHAR(); 

				}
				break;
			case 134 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:860: NVARCHAR
				{
				mNVARCHAR(); 

				}
				break;
			case 135 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:869: DATE
				{
				mDATE(); 

				}
				break;
			case 136 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:874: TIME
				{
				mTIME(); 

				}
				break;
			case 137 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:879: TIMETZ
				{
				mTIMETZ(); 

				}
				break;
			case 138 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:886: TIMESTAMP
				{
				mTIMESTAMP(); 

				}
				break;
			case 139 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:896: TIMESTAMPTZ
				{
				mTIMESTAMPTZ(); 

				}
				break;
			case 140 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:908: TEXT
				{
				mTEXT(); 

				}
				break;
			case 141 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:913: BINARY
				{
				mBINARY(); 

				}
				break;
			case 142 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:920: VARBINARY
				{
				mVARBINARY(); 

				}
				break;
			case 143 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:930: BLOB
				{
				mBLOB(); 

				}
				break;
			case 144 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:935: BYTEA
				{
				mBYTEA(); 

				}
				break;
			case 145 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:941: INET4
				{
				mINET4(); 

				}
				break;
			case 146 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:947: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 147 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:954: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 148 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:960: SEMI_COLON
				{
				mSEMI_COLON(); 

				}
				break;
			case 149 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:971: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 150 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:977: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 151 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:987: LTH
				{
				mLTH(); 

				}
				break;
			case 152 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:991: LEQ
				{
				mLEQ(); 

				}
				break;
			case 153 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:995: GTH
				{
				mGTH(); 

				}
				break;
			case 154 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:999: GEQ
				{
				mGEQ(); 

				}
				break;
			case 155 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1003: LEFT_PAREN
				{
				mLEFT_PAREN(); 

				}
				break;
			case 156 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1014: RIGHT_PAREN
				{
				mRIGHT_PAREN(); 

				}
				break;
			case 157 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1026: PLUS
				{
				mPLUS(); 

				}
				break;
			case 158 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1031: MINUS
				{
				mMINUS(); 

				}
				break;
			case 159 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1037: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 160 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1046: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 161 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1053: MODULAR
				{
				mMODULAR(); 

				}
				break;
			case 162 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1061: DOT
				{
				mDOT(); 

				}
				break;
			case 163 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1065: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 164 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1072: REAL_NUMBER
				{
				mREAL_NUMBER(); 

				}
				break;
			case 165 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1084: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 166 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1092: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 167 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1103: Character_String_Literal
				{
				mCharacter_String_Literal(); 

				}
				break;
			case 168 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1128: Quote
				{
				mQuote(); 

				}
				break;
			case 169 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1134: Double_Quote
				{
				mDouble_Quote(); 

				}
				break;
			case 170 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1147: Space
				{
				mSpace(); 

				}
				break;
			case 171 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1153: White_Space
				{
				mWhite_Space(); 

				}
				break;
			case 172 :
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1:1165: BAD
				{
				mBAD(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
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
			return "1221:1: REAL_NUMBER : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\1\uffff\31\62\3\uffff\1\177\3\60\1\u0081\5\uffff\1\u0088\1\uffff\1\u008a"+
		"\1\u008c\1\uffff\1\u008e\1\u0090\3\uffff\1\u0094\1\uffff\1\u0094\1\u009a"+
		"\3\62\1\u00a0\2\62\1\u00a5\40\62\1\u00d6\3\62\1\u00dc\1\62\1\u00df\13"+
		"\62\1\u00f2\12\62\1\u0102\23\uffff\1\u008c\5\uffff\1\u0104\1\uffff\3\62"+
		"\1\u0104\1\62\1\uffff\5\62\1\uffff\1\u0116\1\62\1\u0118\1\u011a\1\uffff"+
		"\2\62\1\u011d\21\62\1\u0130\4\62\1\u0137\5\62\1\u013e\20\62\1\uffff\1"+
		"\u0152\4\62\1\uffff\2\62\1\uffff\11\62\1\u0165\4\62\1\u016a\3\62\1\uffff"+
		"\17\62\1\uffff\1\u017f\1\uffff\1\62\1\u0182\1\u0183\1\u0184\1\u0185\1"+
		"\u0186\12\62\1\u0191\1\uffff\1\62\1\uffff\1\62\1\uffff\1\62\1\u0195\1"+
		"\uffff\2\62\1\u0199\1\u019a\1\u019b\1\62\1\u019d\7\62\1\u01a6\2\62\1\u01a9"+
		"\1\uffff\3\62\1\u01ad\1\62\1\u01af\1\uffff\1\u01b0\5\62\1\uffff\1\62\1"+
		"\u01b7\1\u01b8\3\62\1\u01bc\1\u01bd\1\u01be\1\u01bf\1\62\1\u01c1\2\62"+
		"\1\u01c4\1\u01c5\1\u01c6\2\62\1\uffff\1\u01c9\3\62\1\u01ce\3\62\1\u01d2"+
		"\1\u01d3\10\62\1\uffff\4\62\1\uffff\2\62\1\u01e3\1\62\1\u01e5\1\62\1\u01e7"+
		"\1\u01ea\5\62\1\u01f0\1\u01f1\1\62\1\u01f3\1\u01f4\1\62\1\u01f6\1\uffff"+
		"\2\62\5\uffff\1\u01f9\1\u01fa\1\62\1\u01fc\6\62\1\uffff\1\u0204\1\u0205"+
		"\1\u0206\1\uffff\3\62\3\uffff\1\62\1\uffff\3\62\1\u020e\3\62\1\u0212\1"+
		"\uffff\2\62\1\uffff\3\62\1\uffff\1\62\2\uffff\3\62\1\u021c\1\u021d\1\62"+
		"\2\uffff\1\u021f\1\u0222\1\62\4\uffff\1\u0224\1\uffff\1\u0225\1\62\3\uffff"+
		"\2\62\1\uffff\2\62\1\u022b\1\62\1\uffff\1\u022d\1\u022e\1\62\2\uffff\4"+
		"\62\1\u0234\1\62\1\u0236\4\62\1\u023b\2\62\1\u023e\1\uffff\1\62\1\uffff"+
		"\1\62\1\uffff\2\62\1\uffff\1\62\1\u0244\2\62\1\u0247\2\uffff\1\u0248\2"+
		"\uffff\1\u0249\1\uffff\2\62\2\uffff\1\u024c\1\uffff\1\62\1\u024e\1\u024f"+
		"\1\62\1\u0251\2\62\3\uffff\1\62\1\u0255\1\u0256\3\62\1\u025a\1\uffff\1"+
		"\u025b\1\62\1\u025e\1\uffff\5\62\1\u0264\1\u0265\2\62\2\uffff\1\u0268"+
		"\1\uffff\1\u0269\1\u026a\1\uffff\1\u026b\2\uffff\3\62\1\u026f\1\62\1\uffff"+
		"\1\62\2\uffff\2\62\1\u0274\2\62\1\uffff\1\62\1\uffff\1\62\1\u0279\1\u027a"+
		"\1\62\1\uffff\1\u027c\1\62\1\uffff\2\62\1\u0280\2\62\1\uffff\1\u0283\1"+
		"\62\3\uffff\1\62\1\u0286\1\uffff\1\62\2\uffff\1\u0288\1\uffff\1\62\1\u028a"+
		"\1\u028b\2\uffff\1\u028c\2\62\2\uffff\1\62\1\u0290\1\uffff\1\u0292\1\u0293"+
		"\1\u0294\2\62\2\uffff\2\62\4\uffff\2\62\1\u029b\1\uffff\1\u029c\2\62\1"+
		"\u029f\1\uffff\1\62\1\u02a1\2\62\2\uffff\1\62\1\uffff\2\62\1\u02a7\1\uffff"+
		"\2\62\1\uffff\1\u02aa\1\62\1\uffff\1\62\1\uffff\1\62\3\uffff\1\62\1\u02af"+
		"\1\62\1\uffff\1\62\3\uffff\1\u02b2\2\62\1\u02b5\1\u02b6\1\u02b7\2\uffff"+
		"\1\u02b8\1\62\1\uffff\1\62\1\uffff\1\u02bb\1\u02bc\1\62\1\u02be\1\62\1"+
		"\uffff\2\62\1\uffff\1\u02c2\1\u02c3\1\u02c4\1\u02c5\1\uffff\1\u02c6\1"+
		"\62\1\uffff\1\62\1\u02c9\4\uffff\1\u02ca\1\62\2\uffff\1\62\1\uffff\1\62"+
		"\1\u02ce\1\62\5\uffff\1\u02d1\1\u02d2\2\uffff\1\u02d3\2\62\1\uffff\2\62"+
		"\3\uffff\1\62\1\u02d9\1\u02da\1\u02db\1\u02dc\4\uffff";
	static final String DFA23_eofS =
		"\u02dd\uffff";
	static final String DFA23_minS =
		"\1\0\1\116\1\101\1\114\1\111\2\101\1\114\1\101\1\122\1\101\1\116\1\117"+
		"\1\101\1\117\1\101\1\116\1\122\2\105\1\101\1\116\1\101\1\110\1\117\1\75"+
		"\3\uffff\5\75\5\uffff\1\52\1\uffff\1\60\1\56\1\uffff\2\0\3\uffff\1\41"+
		"\1\uffff\2\41\2\114\1\105\1\41\1\111\1\104\1\41\1\117\1\107\1\117\1\114"+
		"\2\101\1\105\1\102\1\103\1\123\1\117\1\125\1\124\1\104\1\123\1\103\1\114"+
		"\2\122\1\114\3\117\1\126\1\114\1\111\1\123\1\106\1\113\1\103\1\104\1\115"+
		"\1\41\1\114\1\110\1\101\1\41\1\124\1\41\1\105\1\101\1\107\2\114\1\101"+
		"\1\123\1\114\1\101\1\102\1\105\1\41\1\101\1\115\1\130\1\103\2\105\1\124"+
		"\1\122\1\111\1\116\1\41\23\uffff\1\56\5\uffff\1\41\1\uffff\3\105\1\41"+
		"\1\124\1\uffff\1\114\2\125\1\102\1\127\1\uffff\1\41\1\101\2\41\1\uffff"+
		"\1\105\1\114\1\41\1\111\1\101\1\102\1\114\1\103\1\122\1\114\1\125\1\116"+
		"\1\115\1\116\1\101\1\123\1\105\1\122\1\101\1\103\1\41\1\103\1\120\1\102"+
		"\1\105\1\41\3\105\2\123\1\41\1\114\1\115\1\101\1\125\1\111\1\104\1\116"+
		"\2\124\2\105\1\111\1\101\2\105\1\111\1\uffff\1\41\1\114\1\105\1\101\1"+
		"\122\1\uffff\1\131\1\105\1\uffff\1\105\1\103\1\104\1\105\1\101\2\105\1"+
		"\110\1\114\1\41\1\105\1\111\1\122\1\124\1\41\2\114\1\116\1\uffff\1\116"+
		"\1\105\1\131\1\105\1\124\2\117\2\116\1\122\1\116\1\110\1\113\1\124\1\105"+
		"\1\uffff\1\41\1\uffff\1\107\5\41\1\130\2\122\1\64\1\101\2\105\2\111\1"+
		"\110\1\41\1\uffff\1\123\1\uffff\1\127\1\uffff\1\101\1\41\1\uffff\1\116"+
		"\1\122\3\41\1\101\1\41\1\105\1\115\1\124\1\111\1\105\1\124\1\123\1\41"+
		"\1\105\1\125\1\41\1\uffff\1\115\1\111\1\117\1\41\1\114\1\41\1\uffff\1"+
		"\41\1\120\1\125\1\122\1\105\1\124\1\uffff\1\101\2\41\1\124\1\120\1\116"+
		"\4\41\1\114\1\41\2\124\3\41\1\117\1\122\1\uffff\1\41\2\122\1\103\1\41"+
		"\2\122\1\111\2\41\1\101\1\115\2\101\1\124\1\122\1\124\1\102\1\uffff\1"+
		"\103\1\101\2\105\1\uffff\1\114\1\105\1\41\1\123\1\41\1\111\2\41\1\115"+
		"\1\116\1\125\1\117\1\107\2\41\1\105\2\41\1\105\1\41\1\uffff\1\123\1\105"+
		"\5\uffff\2\41\1\124\1\41\1\124\2\123\2\116\1\101\1\uffff\3\41\1\uffff"+
		"\1\101\1\124\1\131\3\uffff\1\104\1\uffff\1\103\1\123\1\116\1\41\1\124"+
		"\1\103\1\105\1\41\1\uffff\1\116\1\114\1\uffff\1\101\2\116\1\uffff\1\105"+
		"\2\uffff\1\124\1\123\1\116\2\41\1\124\2\uffff\2\41\1\107\4\uffff\1\41"+
		"\1\uffff\1\41\1\111\3\uffff\1\116\1\101\1\uffff\1\106\1\111\1\41\1\110"+
		"\1\uffff\2\41\1\123\2\uffff\1\123\1\105\1\124\1\103\1\41\1\111\1\41\1"+
		"\101\1\120\1\124\1\114\1\41\1\115\1\111\1\41\1\uffff\1\101\1\uffff\1\116"+
		"\1\uffff\1\132\1\124\1\uffff\1\115\1\41\1\105\1\127\1\41\2\uffff\1\41"+
		"\2\uffff\1\41\1\uffff\1\105\1\122\2\uffff\1\41\1\uffff\1\111\2\41\1\107"+
		"\1\41\1\101\1\122\3\uffff\1\116\2\41\1\105\1\124\1\103\1\41\1\uffff\1"+
		"\41\1\124\1\41\1\uffff\2\124\1\114\1\103\1\116\2\41\1\111\1\101\2\uffff"+
		"\1\41\1\uffff\2\41\1\uffff\1\41\2\uffff\1\117\1\101\1\114\1\41\1\103\1"+
		"\uffff\1\101\2\uffff\1\111\1\105\1\41\1\101\1\105\1\uffff\1\103\1\uffff"+
		"\1\103\2\41\1\111\1\uffff\1\41\1\116\1\uffff\1\103\1\124\1\41\1\101\1"+
		"\111\1\uffff\1\41\1\116\3\uffff\1\103\1\41\1\uffff\1\117\2\uffff\1\41"+
		"\1\uffff\1\122\2\41\2\uffff\1\41\2\105\2\uffff\1\105\1\41\1\uffff\3\41"+
		"\1\124\1\105\2\uffff\1\126\1\114\4\uffff\1\116\1\114\1\41\1\uffff\1\41"+
		"\1\122\1\117\1\41\1\uffff\1\102\1\41\1\124\1\113\2\uffff\1\132\1\uffff"+
		"\2\124\1\41\1\uffff\1\115\1\124\1\uffff\1\41\1\124\1\uffff\1\116\1\uffff"+
		"\1\131\3\uffff\1\122\1\41\1\104\1\uffff\1\117\3\uffff\1\41\1\103\1\105"+
		"\3\41\2\uffff\1\41\1\116\1\uffff\1\114\1\uffff\2\41\1\101\1\41\1\111\1"+
		"\uffff\1\120\1\124\1\uffff\4\41\1\uffff\1\41\1\116\1\uffff\1\124\1\41"+
		"\4\uffff\1\41\1\105\2\uffff\1\102\1\uffff\1\117\1\41\1\105\5\uffff\2\41"+
		"\2\uffff\1\41\1\114\1\116\1\uffff\1\132\1\104\3\uffff\1\105\4\41\4\uffff";
	static final String DFA23_maxS =
		"\1\uffff\1\163\1\151\1\163\1\171\1\165\1\162\1\170\1\165\1\162\1\157\1"+
		"\163\3\157\1\166\1\165\1\162\1\157\1\171\1\162\1\163\1\151\1\162\1\157"+
		"\1\75\3\uffff\1\76\4\75\5\uffff\1\57\1\uffff\1\71\1\145\1\uffff\2\uffff"+
		"\3\uffff\1\u00f9\1\uffff\2\u00f9\2\162\1\145\1\u00f9\1\154\1\144\1\u00f9"+
		"\1\157\1\164\1\157\1\163\1\141\1\165\1\157\1\162\2\163\1\157\1\165\1\164"+
		"\1\144\1\163\1\164\1\154\2\162\1\154\3\157\1\166\1\154\1\151\1\163\1\166"+
		"\1\155\1\143\1\144\1\164\1\u00f9\1\155\1\150\1\141\1\u00f9\1\164\1\u00f9"+
		"\1\145\1\163\1\147\1\154\1\164\1\141\1\163\1\154\1\141\1\142\1\145\1\u00f9"+
		"\1\165\1\156\1\170\1\153\1\151\1\145\1\164\1\162\1\151\1\156\1\u00f9\23"+
		"\uffff\1\145\5\uffff\1\u00f9\1\uffff\3\145\1\u00f9\1\164\1\uffff\1\154"+
		"\2\165\1\171\1\167\1\uffff\1\u00f9\1\141\2\u00f9\1\uffff\1\145\1\154\1"+
		"\u00f9\1\151\1\141\1\142\1\154\1\145\1\162\1\154\1\165\1\156\1\155\1\156"+
		"\1\141\1\163\1\145\1\162\1\141\1\143\1\u00f9\1\164\1\160\1\142\1\145\1"+
		"\u00f9\1\145\1\154\1\145\2\163\1\u00f9\1\154\1\155\1\141\1\165\1\151\1"+
		"\144\1\156\2\164\2\145\1\151\1\153\2\145\1\165\1\uffff\1\u00f9\1\154\1"+
		"\145\1\141\1\162\1\uffff\1\171\1\145\1\uffff\1\145\1\143\1\154\1\145\1"+
		"\141\1\154\1\164\1\150\1\154\1\u00f9\1\145\1\151\1\162\1\164\1\u00f9\2"+
		"\154\1\156\1\uffff\1\156\1\145\1\171\1\145\1\164\1\157\1\161\2\156\2\162"+
		"\1\150\1\153\1\164\1\145\1\uffff\1\u00f9\1\uffff\1\162\5\u00f9\1\170\2"+
		"\162\1\64\1\141\2\145\2\151\1\150\1\u00f9\1\uffff\1\163\1\uffff\1\167"+
		"\1\uffff\1\141\1\u00f9\1\uffff\1\156\1\162\3\u00f9\1\141\1\u00f9\1\145"+
		"\1\155\1\164\1\151\1\145\1\164\1\163\1\u00f9\1\145\1\165\1\u00f9\1\uffff"+
		"\1\155\1\151\1\157\1\u00f9\1\154\1\u00f9\1\uffff\1\u00f9\1\160\1\165\1"+
		"\162\1\145\1\164\1\uffff\1\141\2\u00f9\1\164\1\160\1\156\4\u00f9\1\154"+
		"\1\u00f9\2\164\3\u00f9\1\157\1\162\1\uffff\1\u00f9\2\162\1\143\1\u00f9"+
		"\2\162\1\151\2\u00f9\1\141\1\155\2\141\1\164\1\162\1\164\1\165\1\uffff"+
		"\1\143\1\141\2\145\1\uffff\1\154\1\145\1\u00f9\1\163\1\u00f9\1\151\2\u00f9"+
		"\1\155\1\156\1\165\1\157\1\147\2\u00f9\1\145\2\u00f9\1\145\1\u00f9\1\uffff"+
		"\1\163\1\145\5\uffff\2\u00f9\1\164\1\u00f9\1\164\2\163\1\156\1\164\1\141"+
		"\1\uffff\3\u00f9\1\uffff\1\141\1\164\1\171\3\uffff\1\144\1\uffff\1\143"+
		"\1\163\1\156\1\u00f9\1\164\1\143\1\145\1\u00f9\1\uffff\1\156\1\154\1\uffff"+
		"\1\141\2\156\1\uffff\1\145\2\uffff\1\164\1\163\1\156\2\u00f9\1\164\2\uffff"+
		"\2\u00f9\1\147\4\uffff\1\u00f9\1\uffff\1\u00f9\1\151\3\uffff\1\156\1\141"+
		"\1\uffff\1\146\1\151\1\u00f9\1\150\1\uffff\2\u00f9\1\163\2\uffff\1\163"+
		"\1\145\1\164\1\143\1\u00f9\1\151\1\u00f9\1\141\1\160\1\164\1\154\1\u00f9"+
		"\1\155\1\151\1\u00f9\1\uffff\1\141\1\uffff\1\156\1\uffff\1\172\1\164\1"+
		"\uffff\1\155\1\u00f9\1\145\1\167\1\u00f9\2\uffff\1\u00f9\2\uffff\1\u00f9"+
		"\1\uffff\1\145\1\162\2\uffff\1\u00f9\1\uffff\1\151\2\u00f9\1\147\1\u00f9"+
		"\1\141\1\162\3\uffff\1\156\2\u00f9\1\145\1\164\1\143\1\u00f9\1\uffff\1"+
		"\u00f9\1\164\1\u00f9\1\uffff\2\164\1\154\1\143\1\156\2\u00f9\1\151\1\141"+
		"\2\uffff\1\u00f9\1\uffff\2\u00f9\1\uffff\1\u00f9\2\uffff\1\157\1\141\1"+
		"\154\1\u00f9\1\143\1\uffff\1\141\2\uffff\1\151\1\145\1\u00f9\1\141\1\145"+
		"\1\uffff\1\143\1\uffff\1\143\2\u00f9\1\151\1\uffff\1\u00f9\1\156\1\uffff"+
		"\1\143\1\164\1\u00f9\1\141\1\151\1\uffff\1\u00f9\1\156\3\uffff\1\143\1"+
		"\u00f9\1\uffff\1\157\2\uffff\1\u00f9\1\uffff\1\162\2\u00f9\2\uffff\1\u00f9"+
		"\2\145\2\uffff\1\145\1\u00f9\1\uffff\3\u00f9\1\164\1\145\2\uffff\1\166"+
		"\1\154\4\uffff\1\156\1\154\1\u00f9\1\uffff\1\u00f9\1\162\1\157\1\u00f9"+
		"\1\uffff\1\142\1\u00f9\1\164\1\153\2\uffff\1\172\1\uffff\2\164\1\u00f9"+
		"\1\uffff\1\155\1\164\1\uffff\1\u00f9\1\164\1\uffff\1\156\1\uffff\1\171"+
		"\3\uffff\1\162\1\u00f9\1\144\1\uffff\1\157\3\uffff\1\u00f9\1\143\1\145"+
		"\3\u00f9\2\uffff\1\u00f9\1\156\1\uffff\1\154\1\uffff\2\u00f9\1\141\1\u00f9"+
		"\1\151\1\uffff\1\160\1\164\1\uffff\4\u00f9\1\uffff\1\u00f9\1\156\1\uffff"+
		"\1\164\1\u00f9\4\uffff\1\u00f9\1\145\2\uffff\1\142\1\uffff\1\157\1\u00f9"+
		"\1\145\5\uffff\2\u00f9\2\uffff\1\u00f9\1\154\1\156\1\uffff\1\172\1\144"+
		"\3\uffff\1\145\4\u00f9\4\uffff";
	static final String DFA23_acceptS =
		"\32\uffff\1\u0093\1\u0094\1\u0095\5\uffff\1\u009b\1\u009c\1\u009d\1\u009e"+
		"\1\u009f\1\uffff\1\u00a1\2\uffff\1\u00a6\2\uffff\1\u00aa\1\u00ab\1\u00ac"+
		"\1\uffff\1\u00a6\107\uffff\1\u0093\1\u0094\1\u0095\1\u0096\1\u0098\1\u0097"+
		"\1\u009a\1\u0099\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a5\1\u00a0"+
		"\1\u00a1\1\u00a2\1\u00a4\1\u00a3\1\uffff\1\u00a8\1\u00a7\1\u00a9\1\u00aa"+
		"\1\u00ab\1\uffff\1\54\5\uffff\1\62\5\uffff\1\3\4\uffff\1\11\60\uffff\1"+
		"\100\5\uffff\1\104\2\uffff\1\107\22\uffff\1\134\17\uffff\1\u0092\1\uffff"+
		"\1\170\21\uffff\1\10\1\uffff\1\5\1\uffff\1\7\2\uffff\1\160\22\uffff\1"+
		"\u0082\6\uffff\1\36\6\uffff\1\45\23\uffff\1\101\22\uffff\1\124\4\uffff"+
		"\1\131\24\uffff\1\1\2\uffff\1\61\1\162\1\163\1\164\1\165\12\uffff\1\154"+
		"\3\uffff\1\157\3\uffff\1\u008f\1\12\1\13\1\uffff\1\u0083\10\uffff\1\27"+
		"\2\uffff\1\32\3\uffff\1\35\1\uffff\1\u0087\1\37\6\uffff\1\47\1\50\3\uffff"+
		"\1\53\1\64\1\65\1\66\1\uffff\1\70\2\uffff\1\73\1\74\1\75\2\uffff\1\102"+
		"\4\uffff\1\105\3\uffff\1\112\1\175\17\uffff\1\133\1\uffff\1\136\1\uffff"+
		"\1\u0088\2\uffff\1\u008c\5\uffff\1\144\1\147\1\uffff\1\151\1\152\1\uffff"+
		"\1\155\2\uffff\1\55\1\56\1\uffff\1\u0091\7\uffff\1\4\1\6\1\u0090\7\uffff"+
		"\1\20\3\uffff\1\26\11\uffff\1\43\1\44\1\uffff\1\176\2\uffff\1\51\1\uffff"+
		"\1\67\1\71\5\uffff\1\u0085\1\uffff\1\106\1\110\5\uffff\1\117\1\uffff\1"+
		"\121\4\uffff\1\126\2\uffff\1\132\5\uffff\1\140\2\uffff\1\143\1\150\1\153"+
		"\2\uffff\1\57\1\uffff\1\2\1\145\1\uffff\1\161\3\uffff\1\172\1\u008d\3"+
		"\uffff\1\17\1\22\2\uffff\1\21\5\uffff\1\177\1\40\2\uffff\1\46\1\173\1"+
		"\174\1\52\3\uffff\1\103\4\uffff\1\114\4\uffff\1\123\1\125\1\uffff\1\130"+
		"\3\uffff\1\u0089\2\uffff\1\141\2\uffff\1\171\1\uffff\1\146\1\uffff\1\u0084"+
		"\1\156\1\14\3\uffff\1\24\1\uffff\1\30\1\31\1\u0081\6\uffff\1\77\1\u0080"+
		"\2\uffff\1\113\1\uffff\1\116\5\uffff\1\166\2\uffff\1\142\4\uffff\1\16"+
		"\2\uffff\1\33\2\uffff\1\42\1\72\1\76\1\u0086\2\uffff\1\120\1\122\1\uffff"+
		"\1\167\3\uffff\1\60\1\63\1\u008e\1\15\1\23\2\uffff\1\41\1\111\3\uffff"+
		"\1\u008a\2\uffff\1\25\1\34\1\115\5\uffff\1\135\1\u008b\1\137\1\127";
	static final String DFA23_specialS =
		"\1\0\53\uffff\1\1\1\2\u02af\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\60\37\57\1\56\1\36\1\55\2\60\1\50\1\60\1\54\1\42\1\43\1\46\1\44\1"+
			"\34\1\45\1\51\1\47\12\52\1\31\1\33\1\35\1\32\1\41\2\60\1\3\1\4\1\5\1"+
			"\6\1\7\1\10\1\11\1\12\1\13\1\14\1\53\1\15\1\16\1\17\1\20\1\21\1\53\1"+
			"\22\1\23\1\24\1\25\1\26\1\27\2\53\1\30\3\60\1\40\1\53\1\60\1\3\1\4\1"+
			"\5\1\6\1\7\1\10\1\11\1\12\1\1\1\14\1\53\1\15\1\16\1\17\1\20\1\21\1\53"+
			"\1\22\1\23\1\24\1\25\1\2\1\27\2\53\1\30\3\60\1\37\1\60\40\57\uff60\60",
			"\1\63\4\uffff\1\64\32\uffff\1\61\4\uffff\1\64",
			"\1\66\7\uffff\1\67\27\uffff\1\65\7\uffff\1\67",
			"\1\71\1\uffff\1\72\4\uffff\1\70\30\uffff\1\71\1\uffff\1\72\4\uffff\1"+
			"\70",
			"\1\75\2\uffff\1\76\2\uffff\1\74\11\uffff\1\73\17\uffff\1\75\2\uffff"+
			"\1\76\2\uffff\1\74\11\uffff\1\73",
			"\1\77\6\uffff\1\100\6\uffff\1\101\2\uffff\1\102\2\uffff\1\103\13\uffff"+
			"\1\77\6\uffff\1\100\6\uffff\1\101\2\uffff\1\102\2\uffff\1\103",
			"\1\110\3\uffff\1\104\3\uffff\1\105\5\uffff\1\107\2\uffff\1\106\16\uffff"+
			"\1\110\3\uffff\1\104\3\uffff\1\105\5\uffff\1\107\2\uffff\1\106",
			"\1\112\1\uffff\1\111\11\uffff\1\113\23\uffff\1\112\1\uffff\1\111\11"+
			"\uffff\1\113",
			"\1\114\7\uffff\1\115\2\uffff\1\121\2\uffff\1\116\2\uffff\1\120\2\uffff"+
			"\1\117\13\uffff\1\114\7\uffff\1\115\2\uffff\1\121\2\uffff\1\116\2\uffff"+
			"\1\120\2\uffff\1\117",
			"\1\122\37\uffff\1\122",
			"\1\123\15\uffff\1\124\21\uffff\1\123\15\uffff\1\124",
			"\1\63\4\uffff\1\64\32\uffff\1\63\4\uffff\1\64",
			"\1\125\37\uffff\1\125",
			"\1\126\3\uffff\1\127\3\uffff\1\130\5\uffff\1\131\21\uffff\1\126\3\uffff"+
			"\1\127\3\uffff\1\130\5\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\133\1\uffff\1\136\13\uffff\1\134\5\uffff\1\135\1\137\12\uffff\1\133"+
			"\1\uffff\1\136\13\uffff\1\134\5\uffff\1\135\1\137",
			"\1\140\3\uffff\1\142\2\uffff\1\141\30\uffff\1\140\3\uffff\1\142\2\uffff"+
			"\1\141",
			"\1\143\37\uffff\1\143",
			"\1\144\3\uffff\1\145\5\uffff\1\146\25\uffff\1\144\3\uffff\1\145\5\uffff"+
			"\1\146",
			"\1\147\2\uffff\1\150\4\uffff\1\153\3\uffff\1\152\7\uffff\1\151\13\uffff"+
			"\1\147\2\uffff\1\150\4\uffff\1\153\3\uffff\1\152\7\uffff\1\151",
			"\1\154\3\uffff\1\161\2\uffff\1\155\1\160\5\uffff\1\156\2\uffff\1\157"+
			"\16\uffff\1\154\3\uffff\1\161\2\uffff\1\155\1\160\5\uffff\1\156\2\uffff"+
			"\1\157",
			"\1\162\4\uffff\1\163\32\uffff\1\162\4\uffff\1\163",
			"\1\66\7\uffff\1\67\27\uffff\1\66\7\uffff\1\67",
			"\1\164\1\165\5\uffff\1\166\2\uffff\1\167\25\uffff\1\164\1\165\5\uffff"+
			"\1\166\2\uffff\1\167",
			"\1\170\37\uffff\1\170",
			"\1\171",
			"",
			"",
			"",
			"\1\176\1\175",
			"\1\175",
			"\1\175",
			"\1\175",
			"\1\u0080",
			"",
			"",
			"",
			"",
			"",
			"\1\u0087\4\uffff\1\u0087",
			"",
			"\12\u008b",
			"\1\u008b\1\uffff\12\u008d\13\uffff\1\u008b\37\uffff\1\u008b",
			"",
			"\0\u008f",
			"\0\u008f",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\3\62\1\u0095\1\u0099\10\62\1\u0096\4\62\1\u0097\1\u0098\6"+
			"\62\1\uffff\1\62\1\uffff\2\62\1\uffff\3\62\1\u0095\1\u0099\10\62\1\u0096"+
			"\4\62\1\u0097\1\u0093\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7"+
			"\uffff\2\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\3\62\1\u0095\1\u0099\10\62\1\u0096\4\62\1\u0097\1\u0098\6"+
			"\62\1\uffff\1\62\1\uffff\2\62\1\uffff\3\62\1\u0095\1\u0099\10\62\1\u0096"+
			"\4\62\1\u0097\1\u0098\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7"+
			"\uffff\2\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\16\62\1\u009b\13\62\1\uffff\1\62\1\uffff\2\62\1\uffff\16"+
			"\62\1\u009b\13\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u009d\5\uffff\1\u009e\31\uffff\1\u009c\5\uffff\1\u009e",
			"\1\u009d\5\uffff\1\u009e\31\uffff\1\u009d\5\uffff\1\u009e",
			"\1\u009f\37\uffff\1\u009f",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\2\62\1\u00a1\27\62\1\uffff\1\62\1\uffff\2\62\1\uffff\2\62"+
			"\1\u00a1\27\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62"+
			"\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u00a2\2\uffff\1\u00a3\34\uffff\1\u00a2\2\uffff\1\u00a3",
			"\1\u00a4\37\uffff\1\u00a4",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\23\62\1\u00a6\6\62\1\uffff\1\62\1\uffff\2\62\1\uffff\23\62"+
			"\1\u00a6\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2"+
			"\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u00a7\37\uffff\1\u00a7",
			"\1\u00a9\6\uffff\1\u00aa\5\uffff\1\u00a8\22\uffff\1\u00a9\6\uffff\1"+
			"\u00aa\5\uffff\1\u00a8",
			"\1\u00ab\37\uffff\1\u00ab",
			"\1\u00ac\6\uffff\1\u00ad\30\uffff\1\u00ac\6\uffff\1\u00ad",
			"\1\u00ae\37\uffff\1\u00ae",
			"\1\u00af\12\uffff\1\u00b0\1\u00b2\1\u00b3\6\uffff\1\u00b1\13\uffff\1"+
			"\u00af\12\uffff\1\u00b0\1\u00b2\1\u00b3\6\uffff\1\u00b1",
			"\1\u00b4\11\uffff\1\u00b5\25\uffff\1\u00b4\11\uffff\1\u00b5",
			"\1\u00b6\17\uffff\1\u00b7\17\uffff\1\u00b6\17\uffff\1\u00b7",
			"\1\u00ba\2\uffff\1\u00b8\14\uffff\1\u00b9\17\uffff\1\u00ba\2\uffff\1"+
			"\u00b8\14\uffff\1\u00b9",
			"\1\u00bb\37\uffff\1\u00bb",
			"\1\u00bc\37\uffff\1\u00bc",
			"\1\u00bd\37\uffff\1\u00bd",
			"\1\u00be\37\uffff\1\u00be",
			"\1\u00bf\37\uffff\1\u00bf",
			"\1\u00c0\37\uffff\1\u00c0",
			"\1\u00c1\20\uffff\1\u00c2\16\uffff\1\u00c1\20\uffff\1\u00c2",
			"\1\u00c3\37\uffff\1\u00c3",
			"\1\u00c4\37\uffff\1\u00c4",
			"\1\u00c5\37\uffff\1\u00c5",
			"\1\u00c6\37\uffff\1\u00c6",
			"\1\u00c7\37\uffff\1\u00c7",
			"\1\u00c8\37\uffff\1\u00c8",
			"\1\u00c9\37\uffff\1\u00c9",
			"\1\u00ca\37\uffff\1\u00ca",
			"\1\u00cb\37\uffff\1\u00cb",
			"\1\u00cc\37\uffff\1\u00cc",
			"\1\u00cd\37\uffff\1\u00cd",
			"\1\u00ce\17\uffff\1\u00cf\17\uffff\1\u00ce\17\uffff\1\u00cf",
			"\1\u00d0\1\uffff\1\u00d1\35\uffff\1\u00d0\1\uffff\1\u00d1",
			"\1\u00d2\37\uffff\1\u00d2",
			"\1\u00d3\37\uffff\1\u00d3",
			"\1\u00d4\6\uffff\1\u00d5\30\uffff\1\u00d4\6\uffff\1\u00d5",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\23\62\1\u00d7\6\62\1\uffff\1\62\1\uffff\2\62\1\uffff\23\62"+
			"\1\u00d7\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2"+
			"\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u00d8\1\u00d9\36\uffff\1\u00d8\1\u00d9",
			"\1\u00da\37\uffff\1\u00da",
			"\1\u00db\37\uffff\1\u00db",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\13\62\1\u00dd\16\62\1\uffff\1\62\1\uffff\2\62\1\uffff\13"+
			"\62\1\u00dd\16\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u00de\37\uffff\1\u00de",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\3\62\1\u00e0\26\62\1\uffff\1\62\1\uffff\2\62\1\uffff\3\62"+
			"\1\u00e0\26\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62"+
			"\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u00e1\37\uffff\1\u00e1",
			"\1\u00e2\12\uffff\1\u00e3\1\uffff\1\u00e4\1\uffff\1\u00e5\2\uffff\1"+
			"\u00e6\15\uffff\1\u00e2\12\uffff\1\u00e3\1\uffff\1\u00e4\1\uffff\1\u00e5"+
			"\2\uffff\1\u00e6",
			"\1\u00e7\37\uffff\1\u00e7",
			"\1\u00e8\37\uffff\1\u00e8",
			"\1\u00ea\5\uffff\1\u00eb\1\uffff\1\u00e9\27\uffff\1\u00ea\5\uffff\1"+
			"\u00eb\1\uffff\1\u00e9",
			"\1\u00ec\37\uffff\1\u00ec",
			"\1\u00ed\37\uffff\1\u00ed",
			"\1\u00ee\37\uffff\1\u00ee",
			"\1\u00ef\37\uffff\1\u00ef",
			"\1\u00f0\37\uffff\1\u00f0",
			"\1\u00f1\37\uffff\1\u00f1",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u00f3\23\uffff\1\u00f4\13\uffff\1\u00f3\23\uffff\1\u00f4",
			"\1\u00f6\1\u00f5\36\uffff\1\u00f6\1\u00f5",
			"\1\u00f7\37\uffff\1\u00f7",
			"\1\u00f8\5\uffff\1\u00f9\1\uffff\1\u00fa\27\uffff\1\u00f8\5\uffff\1"+
			"\u00f9\1\uffff\1\u00fa",
			"\1\u00fc\3\uffff\1\u00fb\33\uffff\1\u00fc\3\uffff\1\u00fb",
			"\1\u00fd\37\uffff\1\u00fd",
			"\1\u00fe\37\uffff\1\u00fe",
			"\1\u00ff\37\uffff\1\u00ff",
			"\1\u0100\37\uffff\1\u0100",
			"\1\u0101\37\uffff\1\u0101",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u008b\1\uffff\12\u008d\13\uffff\1\u008b\37\uffff\1\u008b",
			"",
			"",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\1\62\1\u0107\1"+
			"\u0108\1\62\1\u0109\3\62\1\u010a\2\62\1\uffff\4\62\1\uffff\4\62\1\u0105"+
			"\11\62\1\u0106\13\62\1\uffff\1\62\1\uffff\2\62\1\uffff\4\62\1\u0105\11"+
			"\62\1\u0103\13\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"",
			"\1\u010b\37\uffff\1\u010b",
			"\1\u010c\37\uffff\1\u010c",
			"\1\u010d\37\uffff\1\u010d",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\1\62\1\u0107\1"+
			"\u0108\1\62\1\u0109\3\62\1\u010a\2\62\1\uffff\4\62\1\uffff\4\62\1\u0105"+
			"\11\62\1\u0106\13\62\1\uffff\1\62\1\uffff\2\62\1\uffff\4\62\1\u0105\11"+
			"\62\1\u0106\13\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u010e\37\uffff\1\u010e",
			"",
			"\1\u010f\37\uffff\1\u010f",
			"\1\u0111\37\uffff\1\u0110",
			"\1\u0111\37\uffff\1\u0111",
			"\1\u0113\1\u0114\25\uffff\1\u0112\10\uffff\1\u0113\1\u0114\25\uffff"+
			"\1\u0112",
			"\1\u0115\37\uffff\1\u0115",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0117\37\uffff\1\u0117",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\16\62\1\u0119\13\62\1\uffff\1\62\1\uffff\2\62\1\uffff\16"+
			"\62\1\u0119\13\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u011b\37\uffff\1\u011b",
			"\1\u011c\37\uffff\1\u011c",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u011e\37\uffff\1\u011e",
			"\1\u011f\37\uffff\1\u011f",
			"\1\u0120\37\uffff\1\u0120",
			"\1\u0121\37\uffff\1\u0121",
			"\1\u0123\1\uffff\1\u0122\35\uffff\1\u0123\1\uffff\1\u0122",
			"\1\u0124\37\uffff\1\u0124",
			"\1\u0125\37\uffff\1\u0125",
			"\1\u0126\37\uffff\1\u0126",
			"\1\u0127\37\uffff\1\u0127",
			"\1\u0128\37\uffff\1\u0128",
			"\1\u0129\37\uffff\1\u0129",
			"\1\u012a\37\uffff\1\u012a",
			"\1\u012b\37\uffff\1\u012b",
			"\1\u012c\37\uffff\1\u012c",
			"\1\u012d\37\uffff\1\u012d",
			"\1\u012e\37\uffff\1\u012e",
			"\1\u012f\37\uffff\1\u012f",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\10\62\1\u0131\21\62\1\uffff\1\62\1\uffff\2\62\1\uffff\10"+
			"\62\1\u0131\21\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u0133\20\uffff\1\u0132\16\uffff\1\u0133\20\uffff\1\u0132",
			"\1\u0134\37\uffff\1\u0134",
			"\1\u0135\37\uffff\1\u0135",
			"\1\u0136\37\uffff\1\u0136",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0138\37\uffff\1\u0138",
			"\1\u0139\6\uffff\1\u013a\30\uffff\1\u0139\6\uffff\1\u013a",
			"\1\u013b\37\uffff\1\u013b",
			"\1\u013c\37\uffff\1\u013c",
			"\1\u013d\37\uffff\1\u013d",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\14\62\1\u013f\15\62\1\uffff\1\62\1\uffff\2\62\1\uffff\14"+
			"\62\1\u013f\15\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u0140\37\uffff\1\u0140",
			"\1\u0141\37\uffff\1\u0141",
			"\1\u0142\37\uffff\1\u0142",
			"\1\u0143\37\uffff\1\u0143",
			"\1\u0144\37\uffff\1\u0144",
			"\1\u0145\37\uffff\1\u0145",
			"\1\u0146\37\uffff\1\u0146",
			"\1\u0147\37\uffff\1\u0147",
			"\1\u0148\37\uffff\1\u0148",
			"\1\u0149\37\uffff\1\u0149",
			"\1\u014a\37\uffff\1\u014a",
			"\1\u014b\37\uffff\1\u014b",
			"\1\u014c\11\uffff\1\u014d\25\uffff\1\u014c\11\uffff\1\u014d",
			"\1\u014e\37\uffff\1\u014e",
			"\1\u014f\37\uffff\1\u014f",
			"\1\u0150\13\uffff\1\u0151\23\uffff\1\u0150\13\uffff\1\u0151",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0153\37\uffff\1\u0153",
			"\1\u0154\37\uffff\1\u0154",
			"\1\u0155\37\uffff\1\u0155",
			"\1\u0156\37\uffff\1\u0156",
			"",
			"\1\u0157\37\uffff\1\u0157",
			"\1\u0158\37\uffff\1\u0158",
			"",
			"\1\u0159\37\uffff\1\u0159",
			"\1\u015a\37\uffff\1\u015a",
			"\1\u015b\7\uffff\1\u015c\27\uffff\1\u015b\7\uffff\1\u015c",
			"\1\u015d\37\uffff\1\u015d",
			"\1\u015e\37\uffff\1\u015e",
			"\1\u015f\6\uffff\1\u0160\30\uffff\1\u015f\6\uffff\1\u0160",
			"\1\u0161\16\uffff\1\u0162\20\uffff\1\u0161\16\uffff\1\u0162",
			"\1\u0163\37\uffff\1\u0163",
			"\1\u0164\37\uffff\1\u0164",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0166\37\uffff\1\u0166",
			"\1\u0167\37\uffff\1\u0167",
			"\1\u0168\37\uffff\1\u0168",
			"\1\u0169\37\uffff\1\u0169",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u016b\37\uffff\1\u016b",
			"\1\u016c\37\uffff\1\u016c",
			"\1\u016d\37\uffff\1\u016d",
			"",
			"\1\u016e\37\uffff\1\u016e",
			"\1\u016f\37\uffff\1\u016f",
			"\1\u0170\37\uffff\1\u0170",
			"\1\u0171\37\uffff\1\u0171",
			"\1\u0172\37\uffff\1\u0172",
			"\1\u0173\37\uffff\1\u0173",
			"\1\u0174\1\uffff\1\u0175\35\uffff\1\u0174\1\uffff\1\u0175",
			"\1\u0176\37\uffff\1\u0176",
			"\1\u0177\37\uffff\1\u0177",
			"\1\u0178\37\uffff\1\u0178",
			"\1\u0179\3\uffff\1\u017a\33\uffff\1\u0179\3\uffff\1\u017a",
			"\1\u017b\37\uffff\1\u017b",
			"\1\u017c\37\uffff\1\u017c",
			"\1\u017d\37\uffff\1\u017d",
			"\1\u017e\37\uffff\1\u017e",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u0181\12\uffff\1\u0180\24\uffff\1\u0181\12\uffff\1\u0180",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0187\37\uffff\1\u0187",
			"\1\u0188\37\uffff\1\u0188",
			"\1\u0189\37\uffff\1\u0189",
			"\1\u018a",
			"\1\u018b\37\uffff\1\u018b",
			"\1\u018d\37\uffff\1\u018c",
			"\1\u018d\37\uffff\1\u018d",
			"\1\u018e\37\uffff\1\u018e",
			"\1\u018f\37\uffff\1\u018f",
			"\1\u0190\37\uffff\1\u0190",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u0192\37\uffff\1\u0192",
			"",
			"\1\u0193\37\uffff\1\u0193",
			"",
			"\1\u0194\37\uffff\1\u0194",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\4\62\1\u0196\25\62\1\uffff\1\62\1\uffff\2\62\1\uffff\4\62"+
			"\1\u0196\25\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62"+
			"\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"",
			"\1\u0197\37\uffff\1\u0197",
			"\1\u0198\37\uffff\1\u0198",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u019c\37\uffff\1\u019c",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\1\u019e\31\62\1\uffff\1\62\1\uffff\2\62\1\uffff\1\u019e\31"+
			"\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62"+
			"\5\uffff\1\62\6\uffff\1\62",
			"\1\u019f\37\uffff\1\u019f",
			"\1\u01a0\37\uffff\1\u01a0",
			"\1\u01a1\37\uffff\1\u01a1",
			"\1\u01a2\37\uffff\1\u01a2",
			"\1\u01a3\37\uffff\1\u01a3",
			"\1\u01a4\37\uffff\1\u01a4",
			"\1\u01a5\37\uffff\1\u01a5",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01a7\37\uffff\1\u01a7",
			"\1\u01a8\37\uffff\1\u01a8",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u01aa\37\uffff\1\u01aa",
			"\1\u01ab\37\uffff\1\u01ab",
			"\1\u01ac\37\uffff\1\u01ac",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01ae\37\uffff\1\u01ae",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01b1\37\uffff\1\u01b1",
			"\1\u01b2\37\uffff\1\u01b2",
			"\1\u01b3\37\uffff\1\u01b3",
			"\1\u01b4\37\uffff\1\u01b4",
			"\1\u01b5\37\uffff\1\u01b5",
			"",
			"\1\u01b6\37\uffff\1\u01b6",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01b9\37\uffff\1\u01b9",
			"\1\u01ba\37\uffff\1\u01ba",
			"\1\u01bb\37\uffff\1\u01bb",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01c0\37\uffff\1\u01c0",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01c2\37\uffff\1\u01c2",
			"\1\u01c3\37\uffff\1\u01c3",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01c7\37\uffff\1\u01c7",
			"\1\u01c8\37\uffff\1\u01c8",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\10\62\1\u01ca\21\62\1\uffff\1\62\1\uffff\2\62\1\uffff\10"+
			"\62\1\u01ca\21\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u01cb\37\uffff\1\u01cb",
			"\1\u01cc\37\uffff\1\u01cc",
			"\1\u01cd\37\uffff\1\u01cd",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01cf\37\uffff\1\u01cf",
			"\1\u01d0\37\uffff\1\u01d0",
			"\1\u01d1\37\uffff\1\u01d1",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01d4\37\uffff\1\u01d4",
			"\1\u01d5\37\uffff\1\u01d5",
			"\1\u01d6\37\uffff\1\u01d6",
			"\1\u01d7\37\uffff\1\u01d7",
			"\1\u01d8\37\uffff\1\u01d8",
			"\1\u01d9\37\uffff\1\u01d9",
			"\1\u01da\37\uffff\1\u01da",
			"\1\u01db\22\uffff\1\u01dc\14\uffff\1\u01db\22\uffff\1\u01dc",
			"",
			"\1\u01dd\37\uffff\1\u01dd",
			"\1\u01de\37\uffff\1\u01de",
			"\1\u01df\37\uffff\1\u01df",
			"\1\u01e0\37\uffff\1\u01e0",
			"",
			"\1\u01e1\37\uffff\1\u01e1",
			"\1\u01e2\37\uffff\1\u01e2",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01e4\37\uffff\1\u01e4",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01e6\37\uffff\1\u01e6",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\22\62\1\u01e9\1\u01e8\6\62\1\uffff\1\62\1\uffff\2\62\1\uffff"+
			"\22\62\1\u01e9\1\u01e8\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62"+
			"\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01eb\37\uffff\1\u01eb",
			"\1\u01ec\37\uffff\1\u01ec",
			"\1\u01ed\37\uffff\1\u01ed",
			"\1\u01ee\37\uffff\1\u01ee",
			"\1\u01ef\37\uffff\1\u01ef",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01f2\37\uffff\1\u01f2",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01f5\37\uffff\1\u01f5",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u01f7\37\uffff\1\u01f7",
			"\1\u01f8\37\uffff\1\u01f8",
			"",
			"",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01fb\37\uffff\1\u01fb",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u01fd\37\uffff\1\u01fd",
			"\1\u01ff\37\uffff\1\u01fe",
			"\1\u01ff\37\uffff\1\u01ff",
			"\1\u0200\37\uffff\1\u0200",
			"\1\u0202\5\uffff\1\u0201\31\uffff\1\u0202\5\uffff\1\u0201",
			"\1\u0203\37\uffff\1\u0203",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u0207\37\uffff\1\u0207",
			"\1\u0208\37\uffff\1\u0208",
			"\1\u0209\37\uffff\1\u0209",
			"",
			"",
			"",
			"\1\u020a\37\uffff\1\u020a",
			"",
			"\1\u020b\37\uffff\1\u020b",
			"\1\u020c\37\uffff\1\u020c",
			"\1\u020d\37\uffff\1\u020d",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u020f\37\uffff\1\u020f",
			"\1\u0210\37\uffff\1\u0210",
			"\1\u0211\37\uffff\1\u0211",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u0213\37\uffff\1\u0213",
			"\1\u0214\37\uffff\1\u0214",
			"",
			"\1\u0215\37\uffff\1\u0215",
			"\1\u0216\37\uffff\1\u0216",
			"\1\u0217\37\uffff\1\u0217",
			"",
			"\1\u0218\37\uffff\1\u0218",
			"",
			"",
			"\1\u0219\37\uffff\1\u0219",
			"\1\u021a\37\uffff\1\u021a",
			"\1\u021b\37\uffff\1\u021b",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u021e\37\uffff\1\u021e",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\4\62\1\u0220\3"+
			"\62\1\u0221\2\62\1\uffff\4\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62"+
			"\1\uffff\32\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62"+
			"\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0223\37\uffff\1\u0223",
			"",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0226\37\uffff\1\u0226",
			"",
			"",
			"",
			"\1\u0227\37\uffff\1\u0227",
			"\1\u0228\37\uffff\1\u0228",
			"",
			"\1\u0229\37\uffff\1\u0229",
			"\1\u022a\37\uffff\1\u022a",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u022c\37\uffff\1\u022c",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u022f\37\uffff\1\u022f",
			"",
			"",
			"\1\u0230\37\uffff\1\u0230",
			"\1\u0231\37\uffff\1\u0231",
			"\1\u0232\37\uffff\1\u0232",
			"\1\u0233\37\uffff\1\u0233",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0235\37\uffff\1\u0235",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0237\37\uffff\1\u0237",
			"\1\u0238\37\uffff\1\u0238",
			"\1\u0239\37\uffff\1\u0239",
			"\1\u023a\37\uffff\1\u023a",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u023c\37\uffff\1\u023c",
			"\1\u023d\37\uffff\1\u023d",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u023f\37\uffff\1\u023f",
			"",
			"\1\u0240\37\uffff\1\u0240",
			"",
			"\1\u0241\37\uffff\1\u0241",
			"\1\u0242\37\uffff\1\u0242",
			"",
			"\1\u0243\37\uffff\1\u0243",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0245\37\uffff\1\u0245",
			"\1\u0246\37\uffff\1\u0246",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u024a\37\uffff\1\u024a",
			"\1\u024b\37\uffff\1\u024b",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u024d\37\uffff\1\u024d",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0250\37\uffff\1\u0250",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0252\37\uffff\1\u0252",
			"\1\u0253\37\uffff\1\u0253",
			"",
			"",
			"",
			"\1\u0254\37\uffff\1\u0254",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0257\37\uffff\1\u0257",
			"\1\u0258\37\uffff\1\u0258",
			"\1\u0259\37\uffff\1\u0259",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\23\62\1\u025c\6\62\1\uffff\1\62\1\uffff\2\62\1\uffff\23\62"+
			"\1\u025c\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2"+
			"\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u025d\37\uffff\1\u025d",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u025f\37\uffff\1\u025f",
			"\1\u0260\37\uffff\1\u0260",
			"\1\u0261\37\uffff\1\u0261",
			"\1\u0262\37\uffff\1\u0262",
			"\1\u0263\37\uffff\1\u0263",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0266\37\uffff\1\u0266",
			"\1\u0267\37\uffff\1\u0267",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"\1\u026c\37\uffff\1\u026c",
			"\1\u026d\37\uffff\1\u026d",
			"\1\u026e\37\uffff\1\u026e",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0270\37\uffff\1\u0270",
			"",
			"\1\u0271\37\uffff\1\u0271",
			"",
			"",
			"\1\u0272\37\uffff\1\u0272",
			"\1\u0273\37\uffff\1\u0273",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0275\37\uffff\1\u0275",
			"\1\u0276\37\uffff\1\u0276",
			"",
			"\1\u0277\37\uffff\1\u0277",
			"",
			"\1\u0278\37\uffff\1\u0278",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u027b\37\uffff\1\u027b",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u027d\37\uffff\1\u027d",
			"",
			"\1\u027e\37\uffff\1\u027e",
			"\1\u027f\37\uffff\1\u027f",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0281\37\uffff\1\u0281",
			"\1\u0282\37\uffff\1\u0282",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0284\37\uffff\1\u0284",
			"",
			"",
			"",
			"\1\u0285\37\uffff\1\u0285",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u0287\37\uffff\1\u0287",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u0289\37\uffff\1\u0289",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u028d\37\uffff\1\u028d",
			"\1\u028e\37\uffff\1\u028e",
			"",
			"",
			"\1\u028f\37\uffff\1\u028f",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\10\62\1\u0291\21\62\1\uffff\1\62\1\uffff\2\62\1\uffff\10"+
			"\62\1\u0291\21\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2"+
			"\62\2\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u0295\37\uffff\1\u0295",
			"\1\u0296\37\uffff\1\u0296",
			"",
			"",
			"\1\u0297\37\uffff\1\u0297",
			"\1\u0298\37\uffff\1\u0298",
			"",
			"",
			"",
			"",
			"\1\u0299\37\uffff\1\u0299",
			"\1\u029a\37\uffff\1\u029a",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u029d\37\uffff\1\u029d",
			"\1\u029e\37\uffff\1\u029e",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u02a0\37\uffff\1\u02a0",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02a2\37\uffff\1\u02a2",
			"\1\u02a3\37\uffff\1\u02a3",
			"",
			"",
			"\1\u02a4\37\uffff\1\u02a4",
			"",
			"\1\u02a5\37\uffff\1\u02a5",
			"\1\u02a6\37\uffff\1\u02a6",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\1\u02a8\37\uffff\1\u02a8",
			"\1\u02a9\37\uffff\1\u02a9",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02ab\37\uffff\1\u02ab",
			"",
			"\1\u02ac\37\uffff\1\u02ac",
			"",
			"\1\u02ad\37\uffff\1\u02ad",
			"",
			"",
			"",
			"\1\u02ae\37\uffff\1\u02ae",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02b0\37\uffff\1\u02b0",
			"",
			"\1\u02b1\37\uffff\1\u02b1",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02b3\37\uffff\1\u02b3",
			"\1\u02b4\37\uffff\1\u02b4",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02b9\37\uffff\1\u02b9",
			"",
			"\1\u02ba\37\uffff\1\u02ba",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02bd\37\uffff\1\u02bd",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02bf\37\uffff\1\u02bf",
			"",
			"\1\u02c0\37\uffff\1\u02c0",
			"\1\u02c1\37\uffff\1\u02c1",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02c7\37\uffff\1\u02c7",
			"",
			"\1\u02c8\37\uffff\1\u02c8",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02cb\37\uffff\1\u02cb",
			"",
			"",
			"\1\u02cc\37\uffff\1\u02cc",
			"",
			"\1\u02cd\37\uffff\1\u02cd",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\23\62\1\u02cf\6\62\1\uffff\1\62\1\uffff\2\62\1\uffff\23\62"+
			"\1\u02cf\6\62\50\uffff\1\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2"+
			"\uffff\1\62\5\uffff\1\62\6\uffff\1\62",
			"\1\u02d0\37\uffff\1\u02d0",
			"",
			"",
			"",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\1\u02d4\37\uffff\1\u02d4",
			"\1\u02d5\37\uffff\1\u02d5",
			"",
			"\1\u02d6\37\uffff\1\u02d6",
			"\1\u02d7\37\uffff\1\u02d7",
			"",
			"",
			"",
			"\1\u02d8\37\uffff\1\u02d8",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"\2\62\1\uffff\3\62\3\uffff\2\62\1\uffff\2\62\1\uffff\13\62\1\uffff\4"+
			"\62\1\uffff\32\62\1\uffff\1\62\1\uffff\2\62\1\uffff\32\62\50\uffff\1"+
			"\62\3\uffff\1\62\70\uffff\1\62\7\uffff\2\62\2\uffff\1\62\5\uffff\1\62"+
			"\6\uffff\1\62",
			"",
			"",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__280 | T__281 | AS | ALIAS | ALL | ALLOW | AND | ASC | BY | CALL | CASE | CASCADE | CHARACTER | COALESCE | COLUMN | COUNT | CREATE | COMMIT | COMMITTED | CONNECT | CONNECTION | CROSS | CUBE | CURRENT | DEFAULT | DESC | DISTINCT | DISCONNECT | DROP | END | ELSE | EXCEPT | EXCLUSIVE | EXTERNAL | FALSE | FIRST | FOR | FORMAT | FULL | FROM | GROUP | HAVING | HOLD | IN | INDEX | INNER | INSERT | INTERSECT | INTO | IS | ISOLATION | JOIN | LAST | LEFT | LEVEL | LIKE | LIMIT | LOCATION | LOCK | MODE | NAME | NATIONAL | NATURAL | NO | NOT | NULL | NULLIF | ON | ONLY | OUTER | OR | ORDER | PRECISION | READ | RELEASE | RENAME | REPEATABLE | REPLACE | RESET | RESTRICT | RIGHT | ROLLBACK | ROLLUP | SET | SELECT | SHARE | SERIALIZABLE | SYSTEM | SQL | TABLE | THEN | TO | TRANSACTION | TRUE | UNCOMMITTED | UNION | UNIQUE | UNKNOWN | USING | USER | VALUES | VARYING | WHEN | WHERE | WITH | WORK | WRITE | VIEW | ZONE | BOOLEAN | BOOL | BIT | VARBIT | INT1 | INT2 | INT4 | INT8 | TINYINT | SMALLINT | INT | INTEGER | BIGINT | FLOAT4 | FLOAT8 | REAL | FLOAT | DOUBLE | NUMERIC | DECIMAL | DEC | CHAR | VARCHAR | NCHAR | NVARCHAR | DATE | TIME | TIMETZ | TIMESTAMP | TIMESTAMPTZ | TEXT | BINARY | VARBINARY | BLOB | BYTEA | INET4 | ASSIGN | EQUAL | SEMI_COLON | COMMA | NOT_EQUAL | LTH | LEQ | GTH | GEQ | LEFT_PAREN | RIGHT_PAREN | PLUS | MINUS | MULTIPLY | DIVIDE | MODULAR | DOT | NUMBER | REAL_NUMBER | COMMENT | Identifier | Character_String_Literal | Quote | Double_Quote | Space | White_Space | BAD );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_0 = input.LA(1);
						s = -1;
						if ( (LA23_0=='i') ) {s = 1;}
						else if ( (LA23_0=='v') ) {s = 2;}
						else if ( (LA23_0=='A'||LA23_0=='a') ) {s = 3;}
						else if ( (LA23_0=='B'||LA23_0=='b') ) {s = 4;}
						else if ( (LA23_0=='C'||LA23_0=='c') ) {s = 5;}
						else if ( (LA23_0=='D'||LA23_0=='d') ) {s = 6;}
						else if ( (LA23_0=='E'||LA23_0=='e') ) {s = 7;}
						else if ( (LA23_0=='F'||LA23_0=='f') ) {s = 8;}
						else if ( (LA23_0=='G'||LA23_0=='g') ) {s = 9;}
						else if ( (LA23_0=='H'||LA23_0=='h') ) {s = 10;}
						else if ( (LA23_0=='I') ) {s = 11;}
						else if ( (LA23_0=='J'||LA23_0=='j') ) {s = 12;}
						else if ( (LA23_0=='L'||LA23_0=='l') ) {s = 13;}
						else if ( (LA23_0=='M'||LA23_0=='m') ) {s = 14;}
						else if ( (LA23_0=='N'||LA23_0=='n') ) {s = 15;}
						else if ( (LA23_0=='O'||LA23_0=='o') ) {s = 16;}
						else if ( (LA23_0=='P'||LA23_0=='p') ) {s = 17;}
						else if ( (LA23_0=='R'||LA23_0=='r') ) {s = 18;}
						else if ( (LA23_0=='S'||LA23_0=='s') ) {s = 19;}
						else if ( (LA23_0=='T'||LA23_0=='t') ) {s = 20;}
						else if ( (LA23_0=='U'||LA23_0=='u') ) {s = 21;}
						else if ( (LA23_0=='V') ) {s = 22;}
						else if ( (LA23_0=='W'||LA23_0=='w') ) {s = 23;}
						else if ( (LA23_0=='Z'||LA23_0=='z') ) {s = 24;}
						else if ( (LA23_0==':') ) {s = 25;}
						else if ( (LA23_0=='=') ) {s = 26;}
						else if ( (LA23_0==';') ) {s = 27;}
						else if ( (LA23_0==',') ) {s = 28;}
						else if ( (LA23_0=='<') ) {s = 29;}
						else if ( (LA23_0=='!') ) {s = 30;}
						else if ( (LA23_0=='~') ) {s = 31;}
						else if ( (LA23_0=='^') ) {s = 32;}
						else if ( (LA23_0=='>') ) {s = 33;}
						else if ( (LA23_0=='(') ) {s = 34;}
						else if ( (LA23_0==')') ) {s = 35;}
						else if ( (LA23_0=='+') ) {s = 36;}
						else if ( (LA23_0=='-') ) {s = 37;}
						else if ( (LA23_0=='*') ) {s = 38;}
						else if ( (LA23_0=='/') ) {s = 39;}
						else if ( (LA23_0=='%') ) {s = 40;}
						else if ( (LA23_0=='.') ) {s = 41;}
						else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {s = 42;}
						else if ( (LA23_0=='K'||LA23_0=='Q'||(LA23_0 >= 'X' && LA23_0 <= 'Y')||LA23_0=='_'||LA23_0=='k'||LA23_0=='q'||(LA23_0 >= 'x' && LA23_0 <= 'y')) ) {s = 43;}
						else if ( (LA23_0=='\'') ) {s = 44;}
						else if ( (LA23_0=='\"') ) {s = 45;}
						else if ( (LA23_0==' ') ) {s = 46;}
						else if ( ((LA23_0 >= '\u0001' && LA23_0 <= '\u001F')||(LA23_0 >= '\u0080' && LA23_0 <= '\u009F')) ) {s = 47;}
						else if ( (LA23_0=='\u0000'||(LA23_0 >= '#' && LA23_0 <= '$')||LA23_0=='&'||(LA23_0 >= '?' && LA23_0 <= '@')||(LA23_0 >= '[' && LA23_0 <= ']')||LA23_0=='`'||(LA23_0 >= '{' && LA23_0 <= '}')||LA23_0=='\u007F'||(LA23_0 >= '\u00A0' && LA23_0 <= '\uFFFF')) ) {s = 48;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_44 = input.LA(1);
						s = -1;
						if ( ((LA23_44 >= '\u0000' && LA23_44 <= '\uFFFF')) ) {s = 143;}
						else s = 142;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_45 = input.LA(1);
						s = -1;
						if ( ((LA23_45 >= '\u0000' && LA23_45 <= '\uFFFF')) ) {s = 143;}
						else s = 144;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
