// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g 2015-10-26 15:12:54

package org.smeup.sys.db.syntax.ibmi.parser.dbl;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@SuppressWarnings("all")
public class DBLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AFTER", "ALIAS", "ALIAS_NAME", 
		"ALL", "ALLOW", "ALLOW_READ", "ALL_SQL", "ALWBLK", "ALWCPYDTA", "AND", 
		"ANY", "AS", "ASC", "ASSIGN", "AS_EXPRESSION", "B", "BAD", "BEFORE", "BIGINT", 
		"BINARY", "BIT", "BLOB", "BOOL", "BOOLEAN", "BOTH", "BY", "BYTEA", "C", 
		"CALL", "CASCADE", "CASE", "CHAR", "CHARACTER", "CHAR_SPECIAL", "CLOSE", 
		"CLOSE_STATEMENT", "CLOSQLCSR", "CNULRQD", "COALESCE", "COLUMN", "COLUMNS_LIST", 
		"COLUMN_NAME", "COMMA", "COMMENT", "COMMIT", "COMMITTED", "CONNECT", "CONNECTION", 
		"COUNT", "COUNT_ROWS", "COUNT_VAL", "CREATE", "CROSS", "CUBE", "CURRENT", 
		"CURSOR", "Character_String_Literal", "Control_Characters", "D", "DATE", 
		"DATFMT", "DATSEP", "DBGVIEW", "DB_NAME", "DEC", "DECIMAL", "DECLARE", 
		"DECLARE_CURSOR_STATEMENT", "DECMPT", "DEFAULT", "DESC", "DESCRIBE", "DESCRIBE_STATEMENT", 
		"DESCRIPTOR", "DFTRDBCOL", "DISCONNECT", "DISTINCT", "DIVIDE", "DLYPRP", 
		"DOT", "DOUBLE", "DROP", "DYNAMIC", "DYNDFTCOL", "DYNUSRPRF", "Digit", 
		"Double_Quote", "E", "ELSE", "EMPTY_GROUPING_SET", "END", "EQUAL", "ESC_SEQ", 
		"EVENTF", "EXCEPT", "EXCLUSIVE", "EXECUTE", "EXECUTE_IMMEDIATE_STATEMENT", 
		"EXECUTE_STATEMENT", "EXPONENT", "EXTERNAL", "Extended_Control_Characters", 
		"F", "FALSE", "FETCH", "FETCH_POSITION", "FETCH_STATEMENT", "FIELD_DEF", 
		"FIELD_NAME", "FIELD_TYPE", "FIRST", "FLOAT", "FLOAT4", "FLOAT8", "FOR", 
		"FORMAT", "FOR_COLUMN", "FROM", "FULL", "FUNCTION", "FUNC_ARGS", "G", 
		"GEQ", "GROUP", "GROUP_BY", "GTH", "H", "HAVING", "HEX_DIGIT", "HOLD", 
		"I", "IMMEDIATE", "IN", "INDEX", "INDEX_NAME", "INET4", "INNER", "INSERT", 
		"INT", "INT1", "INT2", "INT4", "INT8", "INTEGER", "INTERSECT", "INTO", 
		"IS", "ISOLATION", "ISOLATION_LEVEL", "Identifier", "J", "JOIN", "K", 
		"L", "LABELS", "LANGID", "LAST", "LEFT", "LEFT_PAREN", "LEQ", "LEVEL", 
		"LIKE", "LIMIT", "LOCATION", "LOCK", "LTH", "M", "MEMBER", "MINUS", "MODE", 
		"MODULAR", "MULT", "MULTIPLE_ROW_FETCH", "MULTIPLY", "N", "NAME", "NAMES", 
		"NAMING", "NATIONAL", "NATURAL", "NCHAR", "NEW_NAME", "NEXT", "NO", "NOT", 
		"NOT_EQUAL", "NOT_NULL", "NO_COMMIT", "NO_SCROLL", "NULL", "NULLIF", "NULL_ORDER", 
		"NUMBER", "NUMERIC", "NVARCHAR", "O", "OCTAL_ESC", "ON", "ONLY", "OPEN", 
		"OPEN_STATEMENT", "OPTION", "OPTLOB", "OR", "ORDER", "ORDER_BY", "OR_REPLACE", 
		"OUTER", "OUTPUT", "P", "PARAM", "PARAMS", "PLUS", "PRECISION", "PREPARE", 
		"PREPARE_STATEMENT", "PRIOR", "PROCEDURE_ARGS", "PROCEDURE_NAME", "Q", 
		"QUALIFIED", "Quote", "R", "RDBCNNMTH", "READ", "READ_COMMITTED", "READ_ONLY", 
		"READ_UNCOMMITTED", "READ_WRITE", "REAL", "REAL_NUMBER", "RELATIVE", "RELEASE", 
		"RELEASE_STATEMENT", "RENAME", "REPEATABLE", "REPEATABLE_READ", "REPLACE", 
		"RESET", "RESTRICT", "RIGHT", "RIGHT_PAREN", "ROLLBACK", "ROLLBACK_STATEMENT", 
		"ROLLUP", "ROWS", "RW_OPERATION", "S", "SCROLL", "SELECT", "SEL_LIST", 
		"SEMI_COLON", "SERIALIZABLE", "SERVER_NAME", "SET", "SET_OPTION", "SET_OPTION_STATEMENT", 
		"SET_QUALIFIER", "SET_TRANSACTION_STATEMENT", "SHARE", "SHOW_FUNCTION", 
		"SHOW_TABLE", "SINGLE_FETCH", "SMALLINT", "SORT_KEY", "SORT_SPECIFIERS", 
		"SQL", "SQLCURRULE", "SQLPATH", "SRTSEQ", "STATEMENT", "STORE", "STORE_TYPE", 
		"SYSTEM", "SYSTEM_NAMES", "S_ALL", "S_ALLREAD", "S_BLANK", "S_CHG", "S_COLON", 
		"S_COMMA", "S_CS", "S_CURLIB", "S_DASH", "S_DB2", "S_DMY", "S_DUW", "S_ENDACTGRP", 
		"S_ENDJOB", "S_ENDMOD", "S_ENDPGM", "S_ENDSQL", "S_EUR", "S_HEX", "S_HMS", 
		"S_ISO", "S_JIS", "S_JOB", "S_JOBRUN", "S_JUL", "S_LANGIDSHR", "S_LANGIDUNQ", 
		"S_LIBL", "S_LIST", "S_MDY", "S_NAMING", "S_NO", "S_NONE", "S_OPTIMIZE", 
		"S_OWNER", "S_PERIOD", "S_PRINT", "S_READ", "S_RR", "S_RUW", "S_SLASH", 
		"S_SOURCE", "S_SQL", "S_STD", "S_STMT", "S_SYS", "S_SYSVAL", "S_USA", 
		"S_USER", "S_YES", "S_YMD", "Space", "T", "TABLE", "TABLE_DEF", "TABLE_NAME", 
		"TARGET_FIELDS", "TEXT", "TGTRLS", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPTZ", 
		"TIMETZ", "TIMFMT", "TIMSEP", "TINYINT", "TO", "TRANSACTION", "TRUE", 
		"U", "UNCOMMITTED", "UNICODE_ESC", "UNION", "UNIQUE", "UNKNOWN", "USER", 
		"USING", "USING_DESCRIPTOR", "USRPRF", "V", "VALUES", "VARBINARY", "VARBIT", 
		"VARCHAR", "VARIABLE", "VARYING", "VIEW", "VIEW_NAME", "Variable", "W", 
		"WHEN", "WHERE", "WITH", "WITHOUT", "WITHOUT_HOLD", "WITH_DEFAULT", "WITH_HOLD", 
		"WORK", "WRITE", "White_Space", "X", "Y", "Z", "ZONE", "':'"
	};
	public static final int EOF=-1;
	public static final int T__385=385;
	public static final int A=4;
	public static final int AFTER=5;
	public static final int ALIAS=6;
	public static final int ALIAS_NAME=7;
	public static final int ALL=8;
	public static final int ALLOW=9;
	public static final int ALLOW_READ=10;
	public static final int ALL_SQL=11;
	public static final int ALWBLK=12;
	public static final int ALWCPYDTA=13;
	public static final int AND=14;
	public static final int ANY=15;
	public static final int AS=16;
	public static final int ASC=17;
	public static final int ASSIGN=18;
	public static final int AS_EXPRESSION=19;
	public static final int B=20;
	public static final int BAD=21;
	public static final int BEFORE=22;
	public static final int BIGINT=23;
	public static final int BINARY=24;
	public static final int BIT=25;
	public static final int BLOB=26;
	public static final int BOOL=27;
	public static final int BOOLEAN=28;
	public static final int BOTH=29;
	public static final int BY=30;
	public static final int BYTEA=31;
	public static final int C=32;
	public static final int CALL=33;
	public static final int CASCADE=34;
	public static final int CASE=35;
	public static final int CHAR=36;
	public static final int CHARACTER=37;
	public static final int CHAR_SPECIAL=38;
	public static final int CLOSE=39;
	public static final int CLOSE_STATEMENT=40;
	public static final int CLOSQLCSR=41;
	public static final int CNULRQD=42;
	public static final int COALESCE=43;
	public static final int COLUMN=44;
	public static final int COLUMNS_LIST=45;
	public static final int COLUMN_NAME=46;
	public static final int COMMA=47;
	public static final int COMMENT=48;
	public static final int COMMIT=49;
	public static final int COMMITTED=50;
	public static final int CONNECT=51;
	public static final int CONNECTION=52;
	public static final int COUNT=53;
	public static final int COUNT_ROWS=54;
	public static final int COUNT_VAL=55;
	public static final int CREATE=56;
	public static final int CROSS=57;
	public static final int CUBE=58;
	public static final int CURRENT=59;
	public static final int CURSOR=60;
	public static final int Character_String_Literal=61;
	public static final int Control_Characters=62;
	public static final int D=63;
	public static final int DATE=64;
	public static final int DATFMT=65;
	public static final int DATSEP=66;
	public static final int DBGVIEW=67;
	public static final int DB_NAME=68;
	public static final int DEC=69;
	public static final int DECIMAL=70;
	public static final int DECLARE=71;
	public static final int DECLARE_CURSOR_STATEMENT=72;
	public static final int DECMPT=73;
	public static final int DEFAULT=74;
	public static final int DESC=75;
	public static final int DESCRIBE=76;
	public static final int DESCRIBE_STATEMENT=77;
	public static final int DESCRIPTOR=78;
	public static final int DFTRDBCOL=79;
	public static final int DISCONNECT=80;
	public static final int DISTINCT=81;
	public static final int DIVIDE=82;
	public static final int DLYPRP=83;
	public static final int DOT=84;
	public static final int DOUBLE=85;
	public static final int DROP=86;
	public static final int DYNAMIC=87;
	public static final int DYNDFTCOL=88;
	public static final int DYNUSRPRF=89;
	public static final int Digit=90;
	public static final int Double_Quote=91;
	public static final int E=92;
	public static final int ELSE=93;
	public static final int EMPTY_GROUPING_SET=94;
	public static final int END=95;
	public static final int EQUAL=96;
	public static final int ESC_SEQ=97;
	public static final int EVENTF=98;
	public static final int EXCEPT=99;
	public static final int EXCLUSIVE=100;
	public static final int EXECUTE=101;
	public static final int EXECUTE_IMMEDIATE_STATEMENT=102;
	public static final int EXECUTE_STATEMENT=103;
	public static final int EXPONENT=104;
	public static final int EXTERNAL=105;
	public static final int Extended_Control_Characters=106;
	public static final int F=107;
	public static final int FALSE=108;
	public static final int FETCH=109;
	public static final int FETCH_POSITION=110;
	public static final int FETCH_STATEMENT=111;
	public static final int FIELD_DEF=112;
	public static final int FIELD_NAME=113;
	public static final int FIELD_TYPE=114;
	public static final int FIRST=115;
	public static final int FLOAT=116;
	public static final int FLOAT4=117;
	public static final int FLOAT8=118;
	public static final int FOR=119;
	public static final int FORMAT=120;
	public static final int FOR_COLUMN=121;
	public static final int FROM=122;
	public static final int FULL=123;
	public static final int FUNCTION=124;
	public static final int FUNC_ARGS=125;
	public static final int G=126;
	public static final int GEQ=127;
	public static final int GROUP=128;
	public static final int GROUP_BY=129;
	public static final int GTH=130;
	public static final int H=131;
	public static final int HAVING=132;
	public static final int HEX_DIGIT=133;
	public static final int HOLD=134;
	public static final int I=135;
	public static final int IMMEDIATE=136;
	public static final int IN=137;
	public static final int INDEX=138;
	public static final int INDEX_NAME=139;
	public static final int INET4=140;
	public static final int INNER=141;
	public static final int INSERT=142;
	public static final int INT=143;
	public static final int INT1=144;
	public static final int INT2=145;
	public static final int INT4=146;
	public static final int INT8=147;
	public static final int INTEGER=148;
	public static final int INTERSECT=149;
	public static final int INTO=150;
	public static final int IS=151;
	public static final int ISOLATION=152;
	public static final int ISOLATION_LEVEL=153;
	public static final int Identifier=154;
	public static final int J=155;
	public static final int JOIN=156;
	public static final int K=157;
	public static final int L=158;
	public static final int LABELS=159;
	public static final int LANGID=160;
	public static final int LAST=161;
	public static final int LEFT=162;
	public static final int LEFT_PAREN=163;
	public static final int LEQ=164;
	public static final int LEVEL=165;
	public static final int LIKE=166;
	public static final int LIMIT=167;
	public static final int LOCATION=168;
	public static final int LOCK=169;
	public static final int LTH=170;
	public static final int M=171;
	public static final int MEMBER=172;
	public static final int MINUS=173;
	public static final int MODE=174;
	public static final int MODULAR=175;
	public static final int MULT=176;
	public static final int MULTIPLE_ROW_FETCH=177;
	public static final int MULTIPLY=178;
	public static final int N=179;
	public static final int NAME=180;
	public static final int NAMES=181;
	public static final int NAMING=182;
	public static final int NATIONAL=183;
	public static final int NATURAL=184;
	public static final int NCHAR=185;
	public static final int NEW_NAME=186;
	public static final int NEXT=187;
	public static final int NO=188;
	public static final int NOT=189;
	public static final int NOT_EQUAL=190;
	public static final int NOT_NULL=191;
	public static final int NO_COMMIT=192;
	public static final int NO_SCROLL=193;
	public static final int NULL=194;
	public static final int NULLIF=195;
	public static final int NULL_ORDER=196;
	public static final int NUMBER=197;
	public static final int NUMERIC=198;
	public static final int NVARCHAR=199;
	public static final int O=200;
	public static final int OCTAL_ESC=201;
	public static final int ON=202;
	public static final int ONLY=203;
	public static final int OPEN=204;
	public static final int OPEN_STATEMENT=205;
	public static final int OPTION=206;
	public static final int OPTLOB=207;
	public static final int OR=208;
	public static final int ORDER=209;
	public static final int ORDER_BY=210;
	public static final int OR_REPLACE=211;
	public static final int OUTER=212;
	public static final int OUTPUT=213;
	public static final int P=214;
	public static final int PARAM=215;
	public static final int PARAMS=216;
	public static final int PLUS=217;
	public static final int PRECISION=218;
	public static final int PREPARE=219;
	public static final int PREPARE_STATEMENT=220;
	public static final int PRIOR=221;
	public static final int PROCEDURE_ARGS=222;
	public static final int PROCEDURE_NAME=223;
	public static final int Q=224;
	public static final int QUALIFIED=225;
	public static final int Quote=226;
	public static final int R=227;
	public static final int RDBCNNMTH=228;
	public static final int READ=229;
	public static final int READ_COMMITTED=230;
	public static final int READ_ONLY=231;
	public static final int READ_UNCOMMITTED=232;
	public static final int READ_WRITE=233;
	public static final int REAL=234;
	public static final int REAL_NUMBER=235;
	public static final int RELATIVE=236;
	public static final int RELEASE=237;
	public static final int RELEASE_STATEMENT=238;
	public static final int RENAME=239;
	public static final int REPEATABLE=240;
	public static final int REPEATABLE_READ=241;
	public static final int REPLACE=242;
	public static final int RESET=243;
	public static final int RESTRICT=244;
	public static final int RIGHT=245;
	public static final int RIGHT_PAREN=246;
	public static final int ROLLBACK=247;
	public static final int ROLLBACK_STATEMENT=248;
	public static final int ROLLUP=249;
	public static final int ROWS=250;
	public static final int RW_OPERATION=251;
	public static final int S=252;
	public static final int SCROLL=253;
	public static final int SELECT=254;
	public static final int SEL_LIST=255;
	public static final int SEMI_COLON=256;
	public static final int SERIALIZABLE=257;
	public static final int SERVER_NAME=258;
	public static final int SET=259;
	public static final int SET_OPTION=260;
	public static final int SET_OPTION_STATEMENT=261;
	public static final int SET_QUALIFIER=262;
	public static final int SET_TRANSACTION_STATEMENT=263;
	public static final int SHARE=264;
	public static final int SHOW_FUNCTION=265;
	public static final int SHOW_TABLE=266;
	public static final int SINGLE_FETCH=267;
	public static final int SMALLINT=268;
	public static final int SORT_KEY=269;
	public static final int SORT_SPECIFIERS=270;
	public static final int SQL=271;
	public static final int SQLCURRULE=272;
	public static final int SQLPATH=273;
	public static final int SRTSEQ=274;
	public static final int STATEMENT=275;
	public static final int STORE=276;
	public static final int STORE_TYPE=277;
	public static final int SYSTEM=278;
	public static final int SYSTEM_NAMES=279;
	public static final int S_ALL=280;
	public static final int S_ALLREAD=281;
	public static final int S_BLANK=282;
	public static final int S_CHG=283;
	public static final int S_COLON=284;
	public static final int S_COMMA=285;
	public static final int S_CS=286;
	public static final int S_CURLIB=287;
	public static final int S_DASH=288;
	public static final int S_DB2=289;
	public static final int S_DMY=290;
	public static final int S_DUW=291;
	public static final int S_ENDACTGRP=292;
	public static final int S_ENDJOB=293;
	public static final int S_ENDMOD=294;
	public static final int S_ENDPGM=295;
	public static final int S_ENDSQL=296;
	public static final int S_EUR=297;
	public static final int S_HEX=298;
	public static final int S_HMS=299;
	public static final int S_ISO=300;
	public static final int S_JIS=301;
	public static final int S_JOB=302;
	public static final int S_JOBRUN=303;
	public static final int S_JUL=304;
	public static final int S_LANGIDSHR=305;
	public static final int S_LANGIDUNQ=306;
	public static final int S_LIBL=307;
	public static final int S_LIST=308;
	public static final int S_MDY=309;
	public static final int S_NAMING=310;
	public static final int S_NO=311;
	public static final int S_NONE=312;
	public static final int S_OPTIMIZE=313;
	public static final int S_OWNER=314;
	public static final int S_PERIOD=315;
	public static final int S_PRINT=316;
	public static final int S_READ=317;
	public static final int S_RR=318;
	public static final int S_RUW=319;
	public static final int S_SLASH=320;
	public static final int S_SOURCE=321;
	public static final int S_SQL=322;
	public static final int S_STD=323;
	public static final int S_STMT=324;
	public static final int S_SYS=325;
	public static final int S_SYSVAL=326;
	public static final int S_USA=327;
	public static final int S_USER=328;
	public static final int S_YES=329;
	public static final int S_YMD=330;
	public static final int Space=331;
	public static final int T=332;
	public static final int TABLE=333;
	public static final int TABLE_DEF=334;
	public static final int TABLE_NAME=335;
	public static final int TARGET_FIELDS=336;
	public static final int TEXT=337;
	public static final int TGTRLS=338;
	public static final int THEN=339;
	public static final int TIME=340;
	public static final int TIMESTAMP=341;
	public static final int TIMESTAMPTZ=342;
	public static final int TIMETZ=343;
	public static final int TIMFMT=344;
	public static final int TIMSEP=345;
	public static final int TINYINT=346;
	public static final int TO=347;
	public static final int TRANSACTION=348;
	public static final int TRUE=349;
	public static final int U=350;
	public static final int UNCOMMITTED=351;
	public static final int UNICODE_ESC=352;
	public static final int UNION=353;
	public static final int UNIQUE=354;
	public static final int UNKNOWN=355;
	public static final int USER=356;
	public static final int USING=357;
	public static final int USING_DESCRIPTOR=358;
	public static final int USRPRF=359;
	public static final int V=360;
	public static final int VALUES=361;
	public static final int VARBINARY=362;
	public static final int VARBIT=363;
	public static final int VARCHAR=364;
	public static final int VARIABLE=365;
	public static final int VARYING=366;
	public static final int VIEW=367;
	public static final int VIEW_NAME=368;
	public static final int Variable=369;
	public static final int W=370;
	public static final int WHEN=371;
	public static final int WHERE=372;
	public static final int WITH=373;
	public static final int WITHOUT=374;
	public static final int WITHOUT_HOLD=375;
	public static final int WITH_DEFAULT=376;
	public static final int WITH_HOLD=377;
	public static final int WORK=378;
	public static final int WRITE=379;
	public static final int White_Space=380;
	public static final int X=381;
	public static final int Y=382;
	public static final int Z=383;
	public static final int ZONE=384;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DBLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DBLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[469+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DBLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g"; }


	public static class data_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "data_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:459:1: data_type : ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type );
	public final DBLParser.data_type_return data_type() throws RecognitionException {
		DBLParser.data_type_return retval = new DBLParser.data_type_return();
		retval.start = input.LT(1);
		int data_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INET47=null;
		ParserRuleReturnScope boolean_type1 =null;
		ParserRuleReturnScope bit_type2 =null;
		ParserRuleReturnScope varbit_type3 =null;
		ParserRuleReturnScope binary_type4 =null;
		ParserRuleReturnScope varbinary_type5 =null;
		ParserRuleReturnScope blob_type6 =null;
		ParserRuleReturnScope character_string_type8 =null;
		ParserRuleReturnScope datetime_type9 =null;
		ParserRuleReturnScope numeric_type10 =null;

		CommonTree INET47_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:460:3: ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type )
			int alt1=10;
			switch ( input.LA(1) ) {
			case BOOL:
			case BOOLEAN:
				{
				alt1=1;
				}
				break;
			case BIT:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==VARYING) ) {
					alt1=3;
				}
				else if ( (LA1_2==EOF||LA1_2==COMMA||LA1_2==LEFT_PAREN||LA1_2==NOT||LA1_2==RIGHT_PAREN||LA1_2==WITH) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case VARBIT:
				{
				alt1=3;
				}
				break;
			case BINARY:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==VARYING) ) {
					alt1=5;
				}
				else if ( (LA1_4==EOF||LA1_4==COMMA||LA1_4==LEFT_PAREN||LA1_4==NOT||LA1_4==RIGHT_PAREN||LA1_4==WITH) ) {
					alt1=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case VARBINARY:
				{
				alt1=5;
				}
				break;
			case BLOB:
			case BYTEA:
				{
				alt1=6;
				}
				break;
			case INET4:
				{
				alt1=7;
				}
				break;
			case CHAR:
			case CHARACTER:
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
			case TEXT:
			case VARCHAR:
				{
				alt1=8;
				}
				break;
			case DATE:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TIMETZ:
				{
				alt1=9;
				}
				break;
			case BIGINT:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case FLOAT4:
			case FLOAT8:
			case INT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case INTEGER:
			case NUMERIC:
			case REAL:
			case SMALLINT:
			case TINYINT:
				{
				alt1=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:460:5: boolean_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_type_in_data_type4925);
					boolean_type1=boolean_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type1.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:461:5: bit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bit_type_in_data_type4931);
					bit_type2=bit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bit_type2.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:462:5: varbit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbit_type_in_data_type4937);
					varbit_type3=varbit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbit_type3.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:463:5: binary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binary_type_in_data_type4943);
					binary_type4=binary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_type4.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:464:5: varbinary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbinary_type_in_data_type4949);
					varbinary_type5=varbinary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbinary_type5.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:465:5: blob_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_blob_type_in_data_type4955);
					blob_type6=blob_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blob_type6.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:466:5: INET4
					{
					root_0 = (CommonTree)adaptor.nil();


					INET47=(Token)match(input,INET4,FOLLOW_INET4_in_data_type4961); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INET47_tree = (CommonTree)adaptor.create(INET47);
					adaptor.addChild(root_0, INET47_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:467:5: character_string_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_character_string_type_in_data_type4967);
					character_string_type8=character_string_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, character_string_type8.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:468:5: datetime_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_datetime_type_in_data_type4973);
					datetime_type9=datetime_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_type9.getTree());

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:469:5: numeric_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_type_in_data_type4979);
					numeric_type10=numeric_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type10.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, data_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "data_type"


	public static class character_string_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "character_string_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:471:1: character_string_type : ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT );
	public final DBLParser.character_string_type_return character_string_type() throws RecognitionException {
		DBLParser.character_string_type_return retval = new DBLParser.character_string_type_return();
		retval.start = input.LT(1);
		int character_string_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TEXT15=null;
		ParserRuleReturnScope char_type11 =null;
		ParserRuleReturnScope varchar_type12 =null;
		ParserRuleReturnScope nchar_type13 =null;
		ParserRuleReturnScope nvarchar_type14 =null;

		CommonTree TEXT15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:472:3: ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT )
			int alt2=5;
			switch ( input.LA(1) ) {
			case CHAR:
				{
				alt2=1;
				}
				break;
			case CHARACTER:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VARYING) ) {
					alt2=2;
				}
				else if ( (LA2_2==EOF||LA2_2==COMMA||LA2_2==LEFT_PAREN||LA2_2==NOT||LA2_2==RIGHT_PAREN||LA2_2==WITH) ) {
					alt2=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARCHAR:
				{
				alt2=2;
				}
				break;
			case NCHAR:
				{
				alt2=3;
				}
				break;
			case NATIONAL:
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5==CHARACTER) ) {
					int LA2_8 = input.LA(3);
					if ( (LA2_8==VARYING) ) {
						alt2=4;
					}
					else if ( (LA2_8==EOF||LA2_8==COMMA||LA2_8==LEFT_PAREN||LA2_8==NOT||LA2_8==RIGHT_PAREN||LA2_8==WITH) ) {
						alt2=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 8, input);
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
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NVARCHAR:
				{
				alt2=4;
				}
				break;
			case TEXT:
				{
				alt2=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:472:5: char_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_char_type_in_character_string_type4991);
					char_type11=char_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_type11.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:473:5: varchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varchar_type_in_character_string_type4997);
					varchar_type12=varchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar_type12.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:474:5: nchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nchar_type_in_character_string_type5003);
					nchar_type13=nchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nchar_type13.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:475:5: nvarchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nvarchar_type_in_character_string_type5009);
					nvarchar_type14=nvarchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nvarchar_type14.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:476:5: TEXT
					{
					root_0 = (CommonTree)adaptor.nil();


					TEXT15=(Token)match(input,TEXT,FOLLOW_TEXT_in_character_string_type5015); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXT15_tree = (CommonTree)adaptor.create(TEXT15);
					adaptor.addChild(root_0, TEXT15_tree);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, character_string_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "character_string_type"


	public static class numeric_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "numeric_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:478:1: numeric_type : ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type );
	public final DBLParser.numeric_type_return numeric_type() throws RecognitionException {
		DBLParser.numeric_type_return retval = new DBLParser.numeric_type_return();
		retval.start = input.LT(1);
		int numeric_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope int1_type16 =null;
		ParserRuleReturnScope int2_type17 =null;
		ParserRuleReturnScope int4_type18 =null;
		ParserRuleReturnScope int8_type19 =null;
		ParserRuleReturnScope float4_type20 =null;
		ParserRuleReturnScope float_type21 =null;
		ParserRuleReturnScope float8_type22 =null;
		ParserRuleReturnScope number_type23 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:479:3: ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type )
			int alt3=8;
			switch ( input.LA(1) ) {
			case INT1:
			case TINYINT:
				{
				alt3=1;
				}
				break;
			case INT2:
			case SMALLINT:
				{
				alt3=2;
				}
				break;
			case INT:
			case INT4:
			case INTEGER:
				{
				alt3=3;
				}
				break;
			case BIGINT:
			case INT8:
				{
				alt3=4;
				}
				break;
			case FLOAT4:
			case REAL:
				{
				alt3=5;
				}
				break;
			case FLOAT:
				{
				alt3=6;
				}
				break;
			case DOUBLE:
			case FLOAT8:
				{
				alt3=7;
				}
				break;
			case DEC:
			case DECIMAL:
			case NUMERIC:
				{
				alt3=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:479:5: int1_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int1_type_in_numeric_type5027);
					int1_type16=int1_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int1_type16.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:480:5: int2_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int2_type_in_numeric_type5033);
					int2_type17=int2_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int2_type17.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:481:5: int4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int4_type_in_numeric_type5039);
					int4_type18=int4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int4_type18.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:482:5: int8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int8_type_in_numeric_type5045);
					int8_type19=int8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int8_type19.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:483:5: float4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float4_type_in_numeric_type5051);
					float4_type20=float4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float4_type20.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:484:5: float_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_type_in_numeric_type5057);
					float_type21=float_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float_type21.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:485:5: float8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float8_type_in_numeric_type5063);
					float8_type22=float8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float8_type22.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:486:5: number_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_type_in_numeric_type5069);
					number_type23=number_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number_type23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, numeric_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numeric_type"


	public static class datetime_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "datetime_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:488:1: datetime_type : ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type );
	public final DBLParser.datetime_type_return datetime_type() throws RecognitionException {
		DBLParser.datetime_type_return retval = new DBLParser.datetime_type_return();
		retval.start = input.LT(1);
		int datetime_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DATE24=null;
		Token TIME25=null;
		Token TIMESTAMP27=null;
		ParserRuleReturnScope timetz_type26 =null;
		ParserRuleReturnScope timestamptz_type28 =null;

		CommonTree DATE24_tree=null;
		CommonTree TIME25_tree=null;
		CommonTree TIMESTAMP27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:489:3: ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type )
			int alt4=5;
			switch ( input.LA(1) ) {
			case DATE:
				{
				alt4=1;
				}
				break;
			case TIME:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==WITH) ) {
					int LA4_6 = input.LA(3);
					if ( (LA4_6==TIME) ) {
						alt4=3;
					}
					else if ( (LA4_6==DEFAULT) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_2==EOF||LA4_2==COMMA||LA4_2==NOT||LA4_2==RIGHT_PAREN) ) {
					alt4=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TIMETZ:
				{
				alt4=3;
				}
				break;
			case TIMESTAMP:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==WITH) ) {
					int LA4_8 = input.LA(3);
					if ( (LA4_8==TIME) ) {
						alt4=5;
					}
					else if ( (LA4_8==DEFAULT) ) {
						alt4=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_4==EOF||LA4_4==COMMA||LA4_4==NOT||LA4_4==RIGHT_PAREN) ) {
					alt4=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TIMESTAMPTZ:
				{
				alt4=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:489:5: DATE
					{
					root_0 = (CommonTree)adaptor.nil();


					DATE24=(Token)match(input,DATE,FOLLOW_DATE_in_datetime_type5081); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DATE24_tree = (CommonTree)adaptor.create(DATE24);
					adaptor.addChild(root_0, DATE24_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:490:5: TIME
					{
					root_0 = (CommonTree)adaptor.nil();


					TIME25=(Token)match(input,TIME,FOLLOW_TIME_in_datetime_type5087); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIME25_tree = (CommonTree)adaptor.create(TIME25);
					adaptor.addChild(root_0, TIME25_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:491:5: timetz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timetz_type_in_datetime_type5093);
					timetz_type26=timetz_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timetz_type26.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:492:5: TIMESTAMP
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMP27=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_datetime_type5099); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMP27_tree = (CommonTree)adaptor.create(TIMESTAMP27);
					adaptor.addChild(root_0, TIMESTAMP27_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:493:5: timestamptz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timestamptz_type_in_datetime_type5105);
					timestamptz_type28=timestamptz_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamptz_type28.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, datetime_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "datetime_type"


	public static class precision_param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precision_param"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:495:1: precision_param : ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !);
	public final DBLParser.precision_param_return precision_param() throws RecognitionException {
		DBLParser.precision_param_return retval = new DBLParser.precision_param_return();
		retval.start = input.LT(1);
		int precision_param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN29=null;
		Token NUMBER30=null;
		Token RIGHT_PAREN31=null;
		Token LEFT_PAREN32=null;
		Token NUMBER33=null;
		Token COMMA34=null;
		Token NUMBER35=null;
		Token RIGHT_PAREN36=null;

		CommonTree LEFT_PAREN29_tree=null;
		CommonTree NUMBER30_tree=null;
		CommonTree RIGHT_PAREN31_tree=null;
		CommonTree LEFT_PAREN32_tree=null;
		CommonTree NUMBER33_tree=null;
		CommonTree COMMA34_tree=null;
		CommonTree NUMBER35_tree=null;
		CommonTree RIGHT_PAREN36_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:496:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LEFT_PAREN) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==NUMBER) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==RIGHT_PAREN) ) {
						alt5=1;
					}
					else if ( (LA5_2==COMMA) ) {
						alt5=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:496:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param5117); if (state.failed) return retval;
					NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param5120); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER30_tree = (CommonTree)adaptor.create(NUMBER30);
					adaptor.addChild(root_0, NUMBER30_tree);
					}

					RIGHT_PAREN31=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param5122); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:497:5: LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN32=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param5129); if (state.failed) return retval;
					NUMBER33=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param5132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER33_tree = (CommonTree)adaptor.create(NUMBER33);
					adaptor.addChild(root_0, NUMBER33_tree);
					}

					COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_precision_param5134); if (state.failed) return retval;
					NUMBER35=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param5137); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER35_tree = (CommonTree)adaptor.create(NUMBER35);
					adaptor.addChild(root_0, NUMBER35_tree);
					}

					RIGHT_PAREN36=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param5139); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, precision_param_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "precision_param"


	public static class type_length_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_length"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:499:1: type_length : LEFT_PAREN ! NUMBER RIGHT_PAREN !;
	public final DBLParser.type_length_return type_length() throws RecognitionException {
		DBLParser.type_length_return retval = new DBLParser.type_length_return();
		retval.start = input.LT(1);
		int type_length_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN37=null;
		Token NUMBER38=null;
		Token RIGHT_PAREN39=null;

		CommonTree LEFT_PAREN37_tree=null;
		CommonTree NUMBER38_tree=null;
		CommonTree RIGHT_PAREN39_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:500:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:500:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN37=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_length5152); if (state.failed) return retval;
			NUMBER38=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_type_length5155); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER38_tree = (CommonTree)adaptor.create(NUMBER38);
			adaptor.addChild(root_0, NUMBER38_tree);
			}

			RIGHT_PAREN39=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_length5157); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, type_length_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type_length"


	public static class boolean_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:502:1: boolean_type : ( BOOLEAN | BOOL -> BOOLEAN );
	public final DBLParser.boolean_type_return boolean_type() throws RecognitionException {
		DBLParser.boolean_type_return retval = new DBLParser.boolean_type_return();
		retval.start = input.LT(1);
		int boolean_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BOOLEAN40=null;
		Token BOOL41=null;

		CommonTree BOOLEAN40_tree=null;
		CommonTree BOOL41_tree=null;
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:503:3: ( BOOLEAN | BOOL -> BOOLEAN )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BOOLEAN) ) {
				alt6=1;
			}
			else if ( (LA6_0==BOOL) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:503:5: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN40=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type5170); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN40_tree = (CommonTree)adaptor.create(BOOLEAN40);
					adaptor.addChild(root_0, BOOLEAN40_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:504:5: BOOL
					{
					BOOL41=(Token)match(input,BOOL,FOLLOW_BOOL_in_boolean_type5176); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOOL.add(BOOL41);

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
					// 504:10: -> BOOLEAN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, boolean_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_type"


	public static class bit_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bit_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:506:1: bit_type : BIT ( type_length )? -> BIT ;
	public final DBLParser.bit_type_return bit_type() throws RecognitionException {
		DBLParser.bit_type_return retval = new DBLParser.bit_type_return();
		retval.start = input.LT(1);
		int bit_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BIT42=null;
		ParserRuleReturnScope type_length43 =null;

		CommonTree BIT42_tree=null;
		RewriteRuleTokenStream stream_BIT=new RewriteRuleTokenStream(adaptor,"token BIT");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:507:3: ( BIT ( type_length )? -> BIT )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:507:5: BIT ( type_length )?
			{
			BIT42=(Token)match(input,BIT,FOLLOW_BIT_in_bit_type5192); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BIT.add(BIT42);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:507:9: ( type_length )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:507:9: type_length
					{
					pushFollow(FOLLOW_type_length_in_bit_type5194);
					type_length43=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_length.add(type_length43.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: BIT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 507:22: -> BIT
			{
				adaptor.addChild(root_0, stream_BIT.nextNode());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, bit_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bit_type"


	public static class varbit_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varbit_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:509:1: varbit_type : ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT );
	public final DBLParser.varbit_type_return varbit_type() throws RecognitionException {
		DBLParser.varbit_type_return retval = new DBLParser.varbit_type_return();
		retval.start = input.LT(1);
		int varbit_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VARBIT44=null;
		Token BIT46=null;
		Token VARYING47=null;
		ParserRuleReturnScope type_length45 =null;
		ParserRuleReturnScope type_length48 =null;

		CommonTree VARBIT44_tree=null;
		CommonTree BIT46_tree=null;
		CommonTree VARYING47_tree=null;
		RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
		RewriteRuleTokenStream stream_BIT=new RewriteRuleTokenStream(adaptor,"token BIT");
		RewriteRuleTokenStream stream_VARBIT=new RewriteRuleTokenStream(adaptor,"token VARBIT");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:510:3: ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARBIT) ) {
				alt10=1;
			}
			else if ( (LA10_0==BIT) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:510:5: VARBIT ( type_length )?
					{
					VARBIT44=(Token)match(input,VARBIT,FOLLOW_VARBIT_in_varbit_type5211); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARBIT.add(VARBIT44);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:510:12: ( type_length )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LEFT_PAREN) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:510:12: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type5213);
							type_length45=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length45.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: VARBIT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 510:25: -> VARBIT
					{
						adaptor.addChild(root_0, stream_VARBIT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:511:5: BIT VARYING ( type_length )?
					{
					BIT46=(Token)match(input,BIT,FOLLOW_BIT_in_varbit_type5224); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIT.add(BIT46);

					VARYING47=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbit_type5226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING47);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:511:17: ( type_length )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LEFT_PAREN) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:511:17: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type5228);
							type_length48=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length48.getTree());
							}
							break;

					}

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
					// 511:30: -> VARBIT
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(VARBIT, "VARBIT"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, varbit_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varbit_type"


	public static class int1_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int1_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:513:1: int1_type : ( INT1 | TINYINT -> INT1 );
	public final DBLParser.int1_type_return int1_type() throws RecognitionException {
		DBLParser.int1_type_return retval = new DBLParser.int1_type_return();
		retval.start = input.LT(1);
		int int1_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT149=null;
		Token TINYINT50=null;

		CommonTree INT149_tree=null;
		CommonTree TINYINT50_tree=null;
		RewriteRuleTokenStream stream_TINYINT=new RewriteRuleTokenStream(adaptor,"token TINYINT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:514:3: ( INT1 | TINYINT -> INT1 )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT1) ) {
				alt11=1;
			}
			else if ( (LA11_0==TINYINT) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:514:5: INT1
					{
					root_0 = (CommonTree)adaptor.nil();


					INT149=(Token)match(input,INT1,FOLLOW_INT1_in_int1_type5245); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT149_tree = (CommonTree)adaptor.create(INT149);
					adaptor.addChild(root_0, INT149_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:515:5: TINYINT
					{
					TINYINT50=(Token)match(input,TINYINT,FOLLOW_TINYINT_in_int1_type5251); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TINYINT.add(TINYINT50);

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
					// 515:13: -> INT1
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT1, "INT1"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, int1_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int1_type"


	public static class int2_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int2_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:517:1: int2_type : ( INT2 | SMALLINT -> INT2 );
	public final DBLParser.int2_type_return int2_type() throws RecognitionException {
		DBLParser.int2_type_return retval = new DBLParser.int2_type_return();
		retval.start = input.LT(1);
		int int2_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT251=null;
		Token SMALLINT52=null;

		CommonTree INT251_tree=null;
		CommonTree SMALLINT52_tree=null;
		RewriteRuleTokenStream stream_SMALLINT=new RewriteRuleTokenStream(adaptor,"token SMALLINT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:518:3: ( INT2 | SMALLINT -> INT2 )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT2) ) {
				alt12=1;
			}
			else if ( (LA12_0==SMALLINT) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:518:5: INT2
					{
					root_0 = (CommonTree)adaptor.nil();


					INT251=(Token)match(input,INT2,FOLLOW_INT2_in_int2_type5267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT251_tree = (CommonTree)adaptor.create(INT251);
					adaptor.addChild(root_0, INT251_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:519:5: SMALLINT
					{
					SMALLINT52=(Token)match(input,SMALLINT,FOLLOW_SMALLINT_in_int2_type5273); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SMALLINT.add(SMALLINT52);

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
					// 519:14: -> INT2
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT2, "INT2"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, int2_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int2_type"


	public static class int4_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int4_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:521:1: int4_type : ( INT4 | INT -> INT4 | INTEGER -> INT4 );
	public final DBLParser.int4_type_return int4_type() throws RecognitionException {
		DBLParser.int4_type_return retval = new DBLParser.int4_type_return();
		retval.start = input.LT(1);
		int int4_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT453=null;
		Token INT54=null;
		Token INTEGER55=null;

		CommonTree INT453_tree=null;
		CommonTree INT54_tree=null;
		CommonTree INTEGER55_tree=null;
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:522:3: ( INT4 | INT -> INT4 | INTEGER -> INT4 )
			int alt13=3;
			switch ( input.LA(1) ) {
			case INT4:
				{
				alt13=1;
				}
				break;
			case INT:
				{
				alt13=2;
				}
				break;
			case INTEGER:
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:522:5: INT4
					{
					root_0 = (CommonTree)adaptor.nil();


					INT453=(Token)match(input,INT4,FOLLOW_INT4_in_int4_type5289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT453_tree = (CommonTree)adaptor.create(INT453);
					adaptor.addChild(root_0, INT453_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:523:5: INT
					{
					INT54=(Token)match(input,INT,FOLLOW_INT_in_int4_type5295); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT54);

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
					// 523:9: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:524:5: INTEGER
					{
					INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_int4_type5305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER.add(INTEGER55);

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
					// 524:13: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, int4_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int4_type"


	public static class int8_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int8_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:526:1: int8_type : ( INT8 | BIGINT -> INT8 );
	public final DBLParser.int8_type_return int8_type() throws RecognitionException {
		DBLParser.int8_type_return retval = new DBLParser.int8_type_return();
		retval.start = input.LT(1);
		int int8_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT856=null;
		Token BIGINT57=null;

		CommonTree INT856_tree=null;
		CommonTree BIGINT57_tree=null;
		RewriteRuleTokenStream stream_BIGINT=new RewriteRuleTokenStream(adaptor,"token BIGINT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:527:3: ( INT8 | BIGINT -> INT8 )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==INT8) ) {
				alt14=1;
			}
			else if ( (LA14_0==BIGINT) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:527:5: INT8
					{
					root_0 = (CommonTree)adaptor.nil();


					INT856=(Token)match(input,INT8,FOLLOW_INT8_in_int8_type5321); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT856_tree = (CommonTree)adaptor.create(INT856);
					adaptor.addChild(root_0, INT856_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:528:5: BIGINT
					{
					BIGINT57=(Token)match(input,BIGINT,FOLLOW_BIGINT_in_int8_type5327); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIGINT.add(BIGINT57);

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
					// 528:12: -> INT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT8, "INT8"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, int8_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int8_type"


	public static class float4_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float4_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:530:1: float4_type : ( FLOAT4 | REAL -> FLOAT4 );
	public final DBLParser.float4_type_return float4_type() throws RecognitionException {
		DBLParser.float4_type_return retval = new DBLParser.float4_type_return();
		retval.start = input.LT(1);
		int float4_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FLOAT458=null;
		Token REAL59=null;

		CommonTree FLOAT458_tree=null;
		CommonTree REAL59_tree=null;
		RewriteRuleTokenStream stream_REAL=new RewriteRuleTokenStream(adaptor,"token REAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:531:3: ( FLOAT4 | REAL -> FLOAT4 )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==FLOAT4) ) {
				alt15=1;
			}
			else if ( (LA15_0==REAL) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:531:5: FLOAT4
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT458=(Token)match(input,FLOAT4,FOLLOW_FLOAT4_in_float4_type5343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT458_tree = (CommonTree)adaptor.create(FLOAT458);
					adaptor.addChild(root_0, FLOAT458_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:532:5: REAL
					{
					REAL59=(Token)match(input,REAL,FOLLOW_REAL_in_float4_type5349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REAL.add(REAL59);

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
					// 532:10: -> FLOAT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT4, "FLOAT4"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, float4_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "float4_type"


	public static class float_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:1: float_type : FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) ;
	public final DBLParser.float_type_return float_type() throws RecognitionException {
		DBLParser.float_type_return retval = new DBLParser.float_type_return();
		retval.start = input.LT(1);
		int float_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FLOAT60=null;
		ParserRuleReturnScope type_length61 =null;

		CommonTree FLOAT60_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:12: ( FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:14: FLOAT ( type_length )?
			{
			FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_float_type5363); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT60);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:20: ( type_length )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LEFT_PAREN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:20: type_length
					{
					pushFollow(FOLLOW_type_length_in_float_type5365);
					type_length61=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_length.add(type_length61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: type_length, FLOAT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 534:33: -> ^( FLOAT ( type_length )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:36: ^( FLOAT ( type_length )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FLOAT.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:534:44: ( type_length )?
				if ( stream_type_length.hasNext() ) {
					adaptor.addChild(root_1, stream_type_length.nextTree());
				}
				stream_type_length.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, float_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "float_type"


	public static class float8_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float8_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:535:1: float8_type : ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 );
	public final DBLParser.float8_type_return float8_type() throws RecognitionException {
		DBLParser.float8_type_return retval = new DBLParser.float8_type_return();
		retval.start = input.LT(1);
		int float8_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FLOAT862=null;
		Token DOUBLE63=null;
		Token DOUBLE64=null;
		Token PRECISION65=null;

		CommonTree FLOAT862_tree=null;
		CommonTree DOUBLE63_tree=null;
		CommonTree DOUBLE64_tree=null;
		CommonTree PRECISION65_tree=null;
		RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
		RewriteRuleTokenStream stream_PRECISION=new RewriteRuleTokenStream(adaptor,"token PRECISION");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:536:3: ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==FLOAT8) ) {
				alt17=1;
			}
			else if ( (LA17_0==DOUBLE) ) {
				int LA17_2 = input.LA(2);
				if ( (LA17_2==PRECISION) ) {
					alt17=3;
				}
				else if ( (LA17_2==EOF||LA17_2==COMMA||LA17_2==NOT||LA17_2==RIGHT_PAREN||LA17_2==WITH) ) {
					alt17=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:536:5: FLOAT8
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT862=(Token)match(input,FLOAT8,FOLLOW_FLOAT8_in_float8_type5384); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT862_tree = (CommonTree)adaptor.create(FLOAT862);
					adaptor.addChild(root_0, FLOAT862_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:537:5: DOUBLE
					{
					DOUBLE63=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type5390); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(DOUBLE63);

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
					// 537:12: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:538:5: DOUBLE PRECISION
					{
					DOUBLE64=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type5400); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(DOUBLE64);

					PRECISION65=(Token)match(input,PRECISION,FOLLOW_PRECISION_in_float8_type5402); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PRECISION.add(PRECISION65);

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
					// 538:22: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, float8_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "float8_type"


	public static class number_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "number_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:540:1: number_type : ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) );
	public final DBLParser.number_type_return number_type() throws RecognitionException {
		DBLParser.number_type_return retval = new DBLParser.number_type_return();
		retval.start = input.LT(1);
		int number_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NUMERIC66=null;
		Token DECIMAL68=null;
		Token DEC70=null;
		ParserRuleReturnScope precision_param67 =null;
		ParserRuleReturnScope precision_param69 =null;
		ParserRuleReturnScope precision_param71 =null;

		CommonTree NUMERIC66_tree=null;
		CommonTree DECIMAL68_tree=null;
		CommonTree DEC70_tree=null;
		RewriteRuleTokenStream stream_NUMERIC=new RewriteRuleTokenStream(adaptor,"token NUMERIC");
		RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
		RewriteRuleTokenStream stream_DECIMAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL");
		RewriteRuleSubtreeStream stream_precision_param=new RewriteRuleSubtreeStream(adaptor,"rule precision_param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:541:3: ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) )
			int alt21=3;
			switch ( input.LA(1) ) {
			case NUMERIC:
				{
				alt21=1;
				}
				break;
			case DECIMAL:
				{
				alt21=2;
				}
				break;
			case DEC:
				{
				alt21=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:541:5: NUMERIC ( precision_param )?
					{
					NUMERIC66=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number_type5418); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMERIC.add(NUMERIC66);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:541:13: ( precision_param )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LEFT_PAREN) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:541:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type5421);
							precision_param67=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param67.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NUMERIC, precision_param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 541:32: -> ^( NUMERIC precision_param )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:541:35: ^( NUMERIC precision_param )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NUMERIC.nextNode(), root_1);
						adaptor.addChild(root_1, stream_precision_param.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:542:5: DECIMAL ( precision_param )?
					{
					DECIMAL68=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_number_type5437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECIMAL.add(DECIMAL68);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:542:13: ( precision_param )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LEFT_PAREN) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:542:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type5440);
							precision_param69=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param69.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: precision_param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 542:32: -> ^( NUMERIC precision_param )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:542:35: ^( NUMERIC precision_param )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMERIC, "NUMERIC"), root_1);
						adaptor.addChild(root_1, stream_precision_param.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:543:5: DEC ( precision_param )?
					{
					DEC70=(Token)match(input,DEC,FOLLOW_DEC_in_number_type5458); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(DEC70);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:543:13: ( precision_param )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LEFT_PAREN) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:543:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type5465);
							precision_param71=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param71.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: precision_param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 543:32: -> ^( NUMERIC precision_param )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:543:35: ^( NUMERIC precision_param )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMERIC, "NUMERIC"), root_1);
						adaptor.addChild(root_1, stream_precision_param.nextTree());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, number_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "number_type"


	public static class char_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "char_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:545:1: char_type : ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR );
	public final DBLParser.char_type_return char_type() throws RecognitionException {
		DBLParser.char_type_return retval = new DBLParser.char_type_return();
		retval.start = input.LT(1);
		int char_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CHAR72=null;
		Token CHARACTER74=null;
		ParserRuleReturnScope type_length73 =null;
		ParserRuleReturnScope type_length75 =null;

		CommonTree CHAR72_tree=null;
		CommonTree CHARACTER74_tree=null;
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:546:3: ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CHAR) ) {
				alt24=1;
			}
			else if ( (LA24_0==CHARACTER) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:546:5: CHAR ( type_length )?
					{
					CHAR72=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_type5489); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHAR.add(CHAR72);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:546:10: ( type_length )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LEFT_PAREN) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:546:10: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type5491);
							type_length73=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length73.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: CHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 546:23: -> CHAR
					{
						adaptor.addChild(root_0, stream_CHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:547:5: CHARACTER ( type_length )?
					{
					CHARACTER74=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_char_type5502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER74);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:547:15: ( type_length )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LEFT_PAREN) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:547:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type5504);
							type_length75=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length75.getTree());
							}
							break;

					}

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
					// 547:28: -> CHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(CHAR, "CHAR"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, char_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "char_type"


	public static class varchar_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varchar_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:549:1: varchar_type : ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR );
	public final DBLParser.varchar_type_return varchar_type() throws RecognitionException {
		DBLParser.varchar_type_return retval = new DBLParser.varchar_type_return();
		retval.start = input.LT(1);
		int varchar_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VARCHAR76=null;
		Token CHARACTER78=null;
		Token VARYING79=null;
		ParserRuleReturnScope type_length77 =null;
		ParserRuleReturnScope type_length80 =null;

		CommonTree VARCHAR76_tree=null;
		CommonTree CHARACTER78_tree=null;
		CommonTree VARYING79_tree=null;
		RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
		RewriteRuleTokenStream stream_VARCHAR=new RewriteRuleTokenStream(adaptor,"token VARCHAR");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:550:3: ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==VARCHAR) ) {
				alt27=1;
			}
			else if ( (LA27_0==CHARACTER) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:550:5: VARCHAR ( type_length )?
					{
					VARCHAR76=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_varchar_type5521); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARCHAR.add(VARCHAR76);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:550:13: ( type_length )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LEFT_PAREN) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:550:13: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type5523);
							type_length77=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length77.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: VARCHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 550:26: -> VARCHAR
					{
						adaptor.addChild(root_0, stream_VARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:551:5: CHARACTER VARYING ( type_length )?
					{
					CHARACTER78=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_varchar_type5534); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER78);

					VARYING79=(Token)match(input,VARYING,FOLLOW_VARYING_in_varchar_type5536); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING79);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:551:23: ( type_length )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LEFT_PAREN) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:551:23: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type5538);
							type_length80=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length80.getTree());
							}
							break;

					}

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
					// 551:36: -> VARCHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(VARCHAR, "VARCHAR"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, varchar_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varchar_type"


	public static class nchar_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nchar_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:553:1: nchar_type : ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR );
	public final DBLParser.nchar_type_return nchar_type() throws RecognitionException {
		DBLParser.nchar_type_return retval = new DBLParser.nchar_type_return();
		retval.start = input.LT(1);
		int nchar_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NCHAR81=null;
		Token NATIONAL83=null;
		Token CHARACTER84=null;
		ParserRuleReturnScope type_length82 =null;
		ParserRuleReturnScope type_length85 =null;

		CommonTree NCHAR81_tree=null;
		CommonTree NATIONAL83_tree=null;
		CommonTree CHARACTER84_tree=null;
		RewriteRuleTokenStream stream_NATIONAL=new RewriteRuleTokenStream(adaptor,"token NATIONAL");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleTokenStream stream_NCHAR=new RewriteRuleTokenStream(adaptor,"token NCHAR");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:554:3: ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==NCHAR) ) {
				alt30=1;
			}
			else if ( (LA30_0==NATIONAL) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:554:5: NCHAR ( type_length )?
					{
					NCHAR81=(Token)match(input,NCHAR,FOLLOW_NCHAR_in_nchar_type5555); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCHAR.add(NCHAR81);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:554:11: ( type_length )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LEFT_PAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:554:11: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type5557);
							type_length82=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length82.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NCHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 554:24: -> NCHAR
					{
						adaptor.addChild(root_0, stream_NCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:555:5: NATIONAL CHARACTER ( type_length )?
					{
					NATIONAL83=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nchar_type5568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL83);

					CHARACTER84=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nchar_type5570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER84);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:555:24: ( type_length )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LEFT_PAREN) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:555:24: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type5572);
							type_length85=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length85.getTree());
							}
							break;

					}

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
					// 555:37: -> NCHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(NCHAR, "NCHAR"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, nchar_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nchar_type"


	public static class nvarchar_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nvarchar_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:557:1: nvarchar_type : ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR );
	public final DBLParser.nvarchar_type_return nvarchar_type() throws RecognitionException {
		DBLParser.nvarchar_type_return retval = new DBLParser.nvarchar_type_return();
		retval.start = input.LT(1);
		int nvarchar_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NVARCHAR86=null;
		Token NATIONAL88=null;
		Token CHARACTER89=null;
		Token VARYING90=null;
		ParserRuleReturnScope type_length87 =null;
		ParserRuleReturnScope type_length91 =null;

		CommonTree NVARCHAR86_tree=null;
		CommonTree NATIONAL88_tree=null;
		CommonTree CHARACTER89_tree=null;
		CommonTree VARYING90_tree=null;
		RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
		RewriteRuleTokenStream stream_NATIONAL=new RewriteRuleTokenStream(adaptor,"token NATIONAL");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleTokenStream stream_NVARCHAR=new RewriteRuleTokenStream(adaptor,"token NVARCHAR");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:558:3: ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==NVARCHAR) ) {
				alt33=1;
			}
			else if ( (LA33_0==NATIONAL) ) {
				alt33=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:558:5: NVARCHAR ( type_length )?
					{
					NVARCHAR86=(Token)match(input,NVARCHAR,FOLLOW_NVARCHAR_in_nvarchar_type5589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NVARCHAR.add(NVARCHAR86);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:558:14: ( type_length )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LEFT_PAREN) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:558:14: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type5591);
							type_length87=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length87.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NVARCHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 558:27: -> NVARCHAR
					{
						adaptor.addChild(root_0, stream_NVARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:559:5: NATIONAL CHARACTER VARYING ( type_length )?
					{
					NATIONAL88=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nvarchar_type5602); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL88);

					CHARACTER89=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nvarchar_type5604); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER89);

					VARYING90=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar_type5606); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING90);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:559:32: ( type_length )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==LEFT_PAREN) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:559:32: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type5608);
							type_length91=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length91.getTree());
							}
							break;

					}

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
					// 559:45: -> NVARCHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(NVARCHAR, "NVARCHAR"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, nvarchar_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nvarchar_type"


	public static class timetz_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "timetz_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:561:1: timetz_type : ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ );
	public final DBLParser.timetz_type_return timetz_type() throws RecognitionException {
		DBLParser.timetz_type_return retval = new DBLParser.timetz_type_return();
		retval.start = input.LT(1);
		int timetz_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TIMETZ92=null;
		Token TIME93=null;
		Token WITH94=null;
		Token TIME95=null;
		Token ZONE96=null;

		CommonTree TIMETZ92_tree=null;
		CommonTree TIME93_tree=null;
		CommonTree WITH94_tree=null;
		CommonTree TIME95_tree=null;
		CommonTree ZONE96_tree=null;
		RewriteRuleTokenStream stream_ZONE=new RewriteRuleTokenStream(adaptor,"token ZONE");
		RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:562:3: ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==TIMETZ) ) {
				alt34=1;
			}
			else if ( (LA34_0==TIME) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:562:5: TIMETZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMETZ92=(Token)match(input,TIMETZ,FOLLOW_TIMETZ_in_timetz_type5625); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMETZ92_tree = (CommonTree)adaptor.create(TIMETZ92);
					adaptor.addChild(root_0, TIMETZ92_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:563:5: TIME WITH TIME ZONE
					{
					TIME93=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type5631); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME93);

					WITH94=(Token)match(input,WITH,FOLLOW_WITH_in_timetz_type5633); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH94);

					TIME95=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type5635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME95);

					ZONE96=(Token)match(input,ZONE,FOLLOW_ZONE_in_timetz_type5637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ZONE.add(ZONE96);

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
					// 563:25: -> TIMETZ
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TIMETZ, "TIMETZ"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, timetz_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "timetz_type"


	public static class timestamptz_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "timestamptz_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:565:1: timestamptz_type : ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ );
	public final DBLParser.timestamptz_type_return timestamptz_type() throws RecognitionException {
		DBLParser.timestamptz_type_return retval = new DBLParser.timestamptz_type_return();
		retval.start = input.LT(1);
		int timestamptz_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TIMESTAMPTZ97=null;
		Token TIMESTAMP98=null;
		Token WITH99=null;
		Token TIME100=null;
		Token ZONE101=null;

		CommonTree TIMESTAMPTZ97_tree=null;
		CommonTree TIMESTAMP98_tree=null;
		CommonTree WITH99_tree=null;
		CommonTree TIME100_tree=null;
		CommonTree ZONE101_tree=null;
		RewriteRuleTokenStream stream_ZONE=new RewriteRuleTokenStream(adaptor,"token ZONE");
		RewriteRuleTokenStream stream_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token TIMESTAMP");
		RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:566:3: ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==TIMESTAMPTZ) ) {
				alt35=1;
			}
			else if ( (LA35_0==TIMESTAMP) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:566:5: TIMESTAMPTZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMPTZ97=(Token)match(input,TIMESTAMPTZ,FOLLOW_TIMESTAMPTZ_in_timestamptz_type5653); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMPTZ97_tree = (CommonTree)adaptor.create(TIMESTAMPTZ97);
					adaptor.addChild(root_0, TIMESTAMPTZ97_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:567:5: TIMESTAMP WITH TIME ZONE
					{
					TIMESTAMP98=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamptz_type5659); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP98);

					WITH99=(Token)match(input,WITH,FOLLOW_WITH_in_timestamptz_type5661); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH99);

					TIME100=(Token)match(input,TIME,FOLLOW_TIME_in_timestamptz_type5663); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME100);

					ZONE101=(Token)match(input,ZONE,FOLLOW_ZONE_in_timestamptz_type5665); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ZONE.add(ZONE101);

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
					// 567:30: -> TIMESTAMPTZ
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TIMESTAMPTZ, "TIMESTAMPTZ"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, timestamptz_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "timestamptz_type"


	public static class binary_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binary_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:569:1: binary_type : BINARY ( type_length )? ;
	public final DBLParser.binary_type_return binary_type() throws RecognitionException {
		DBLParser.binary_type_return retval = new DBLParser.binary_type_return();
		retval.start = input.LT(1);
		int binary_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BINARY102=null;
		ParserRuleReturnScope type_length103 =null;

		CommonTree BINARY102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:570:3: ( BINARY ( type_length )? )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:570:5: BINARY ( type_length )?
			{
			root_0 = (CommonTree)adaptor.nil();


			BINARY102=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary_type5681); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BINARY102_tree = (CommonTree)adaptor.create(BINARY102);
			adaptor.addChild(root_0, BINARY102_tree);
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:570:12: ( type_length )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==LEFT_PAREN) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:570:12: type_length
					{
					pushFollow(FOLLOW_type_length_in_binary_type5683);
					type_length103=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_length103.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, binary_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "binary_type"


	public static class varbinary_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varbinary_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:572:1: varbinary_type : ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? );
	public final DBLParser.varbinary_type_return varbinary_type() throws RecognitionException {
		DBLParser.varbinary_type_return retval = new DBLParser.varbinary_type_return();
		retval.start = input.LT(1);
		int varbinary_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VARBINARY104=null;
		Token BINARY106=null;
		Token VARYING107=null;
		ParserRuleReturnScope type_length105 =null;
		ParserRuleReturnScope type_length108 =null;

		CommonTree VARBINARY104_tree=null;
		CommonTree BINARY106_tree=null;
		CommonTree VARYING107_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:573:3: ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==VARBINARY) ) {
				alt39=1;
			}
			else if ( (LA39_0==BINARY) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:573:5: VARBINARY ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					VARBINARY104=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_varbinary_type5696); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARBINARY104_tree = (CommonTree)adaptor.create(VARBINARY104);
					adaptor.addChild(root_0, VARBINARY104_tree);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:573:15: ( type_length )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LEFT_PAREN) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:573:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type5698);
							type_length105=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type_length105.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:574:5: BINARY VARYING ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					BINARY106=(Token)match(input,BINARY,FOLLOW_BINARY_in_varbinary_type5705); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BINARY106_tree = (CommonTree)adaptor.create(BINARY106);
					adaptor.addChild(root_0, BINARY106_tree);
					}

					VARYING107=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbinary_type5707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARYING107_tree = (CommonTree)adaptor.create(VARYING107);
					adaptor.addChild(root_0, VARYING107_tree);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:574:20: ( type_length )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==LEFT_PAREN) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:574:20: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type5709);
							type_length108=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type_length108.getTree());

							}
							break;

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, varbinary_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varbinary_type"


	public static class blob_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blob_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:576:1: blob_type : ( BLOB | BYTEA -> BLOB );
	public final DBLParser.blob_type_return blob_type() throws RecognitionException {
		DBLParser.blob_type_return retval = new DBLParser.blob_type_return();
		retval.start = input.LT(1);
		int blob_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BLOB109=null;
		Token BYTEA110=null;

		CommonTree BLOB109_tree=null;
		CommonTree BYTEA110_tree=null;
		RewriteRuleTokenStream stream_BYTEA=new RewriteRuleTokenStream(adaptor,"token BYTEA");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:577:3: ( BLOB | BYTEA -> BLOB )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==BLOB) ) {
				alt40=1;
			}
			else if ( (LA40_0==BYTEA) ) {
				alt40=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:577:5: BLOB
					{
					root_0 = (CommonTree)adaptor.nil();


					BLOB109=(Token)match(input,BLOB,FOLLOW_BLOB_in_blob_type5722); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BLOB109_tree = (CommonTree)adaptor.create(BLOB109);
					adaptor.addChild(root_0, BLOB109_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:578:5: BYTEA
					{
					BYTEA110=(Token)match(input,BYTEA,FOLLOW_BYTEA_in_blob_type5728); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BYTEA.add(BYTEA110);

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
					// 578:11: -> BLOB
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(BLOB, "BLOB"));
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, blob_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "blob_type"


	public static class sql_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sql"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:587:1: sql : statement EOF ;
	public final DBLParser.sql_return sql() throws RecognitionException {
		DBLParser.sql_return retval = new DBLParser.sql_return();
		retval.start = input.LT(1);
		int sql_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EOF112=null;
		ParserRuleReturnScope statement111 =null;

		CommonTree EOF112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:588:3: ( statement EOF )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:588:5: statement EOF
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_sql5748);
			statement111=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

			EOF112=(Token)match(input,EOF,FOLLOW_EOF_in_sql5750); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOF112_tree = (CommonTree)adaptor.create(EOF112);
			adaptor.addChild(root_0, EOF112_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, sql_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sql"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:591:1: statement : ( set_transaction_statement | execute_statement | execute_immediate_statement | open_statement | prepare_statement | declare_cursor_statement | describe_statement | fetch_statement | open_statement | close_statement | set_option_statement );
	public final DBLParser.statement_return statement() throws RecognitionException {
		DBLParser.statement_return retval = new DBLParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope set_transaction_statement113 =null;
		ParserRuleReturnScope execute_statement114 =null;
		ParserRuleReturnScope execute_immediate_statement115 =null;
		ParserRuleReturnScope open_statement116 =null;
		ParserRuleReturnScope prepare_statement117 =null;
		ParserRuleReturnScope declare_cursor_statement118 =null;
		ParserRuleReturnScope describe_statement119 =null;
		ParserRuleReturnScope fetch_statement120 =null;
		ParserRuleReturnScope open_statement121 =null;
		ParserRuleReturnScope close_statement122 =null;
		ParserRuleReturnScope set_option_statement123 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:592:3: ( set_transaction_statement | execute_statement | execute_immediate_statement | open_statement | prepare_statement | declare_cursor_statement | describe_statement | fetch_statement | open_statement | close_statement | set_option_statement )
			int alt41=11;
			switch ( input.LA(1) ) {
			case SET:
				{
				int LA41_1 = input.LA(2);
				if ( (LA41_1==TRANSACTION) ) {
					alt41=1;
				}
				else if ( (LA41_1==OPTION) ) {
					alt41=11;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EXECUTE:
				{
				int LA41_2 = input.LA(2);
				if ( (LA41_2==Identifier) ) {
					alt41=2;
				}
				else if ( (LA41_2==IMMEDIATE) ) {
					alt41=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OPEN:
				{
				int LA41_3 = input.LA(2);
				if ( (LA41_3==Identifier) ) {
					int LA41_13 = input.LA(3);
					if ( (synpred67_DBL()) ) {
						alt41=4;
					}
					else if ( (synpred72_DBL()) ) {
						alt41=9;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 13, input);
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
							new NoViableAltException("", 41, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PREPARE:
				{
				alt41=5;
				}
				break;
			case DECLARE:
				{
				alt41=6;
				}
				break;
			case DESCRIBE:
				{
				alt41=7;
				}
				break;
			case FETCH:
				{
				alt41=8;
				}
				break;
			case CLOSE:
				{
				alt41=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:593:3: set_transaction_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_transaction_statement_in_statement5768);
					set_transaction_statement113=set_transaction_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_transaction_statement113.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:595:3: execute_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_execute_statement_in_statement5776);
					execute_statement114=execute_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, execute_statement114.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:597:3: execute_immediate_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_execute_immediate_statement_in_statement5784);
					execute_immediate_statement115=execute_immediate_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, execute_immediate_statement115.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:599:3: open_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_open_statement_in_statement5792);
					open_statement116=open_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, open_statement116.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:601:3: prepare_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_prepare_statement_in_statement5800);
					prepare_statement117=prepare_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prepare_statement117.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:603:3: declare_cursor_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declare_cursor_statement_in_statement5808);
					declare_cursor_statement118=declare_cursor_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declare_cursor_statement118.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:605:3: describe_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_describe_statement_in_statement5816);
					describe_statement119=describe_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, describe_statement119.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:607:3: fetch_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fetch_statement_in_statement5824);
					fetch_statement120=fetch_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fetch_statement120.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:609:3: open_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_open_statement_in_statement5832);
					open_statement121=open_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, open_statement121.getTree());

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:611:3: close_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_close_statement_in_statement5840);
					close_statement122=close_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, close_statement122.getTree());

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:613:3: set_option_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_option_statement_in_statement5848);
					set_option_statement123=set_option_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_option_statement123.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class set_option_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_option_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:618:3: set_option_statement : SET OPTION ( options_assign ) ( ',' options_assign )* -> ^( SET_OPTION_STATEMENT options_assign ( options_assign )* ) ;
	public final DBLParser.set_option_statement_return set_option_statement() throws RecognitionException {
		DBLParser.set_option_statement_return retval = new DBLParser.set_option_statement_return();
		retval.start = input.LT(1);
		int set_option_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SET124=null;
		Token OPTION125=null;
		Token char_literal127=null;
		ParserRuleReturnScope options_assign126 =null;
		ParserRuleReturnScope options_assign128 =null;

		CommonTree SET124_tree=null;
		CommonTree OPTION125_tree=null;
		CommonTree char_literal127_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_OPTION=new RewriteRuleTokenStream(adaptor,"token OPTION");
		RewriteRuleSubtreeStream stream_options_assign=new RewriteRuleSubtreeStream(adaptor,"rule options_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:619:4: ( SET OPTION ( options_assign ) ( ',' options_assign )* -> ^( SET_OPTION_STATEMENT options_assign ( options_assign )* ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:4: SET OPTION ( options_assign ) ( ',' options_assign )*
			{
			SET124=(Token)match(input,SET,FOLLOW_SET_in_set_option_statement5878); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET124);

			OPTION125=(Token)match(input,OPTION,FOLLOW_OPTION_in_set_option_statement5880); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPTION.add(OPTION125);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:15: ( options_assign )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:16: options_assign
			{
			pushFollow(FOLLOW_options_assign_in_set_option_statement5883);
			options_assign126=options_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_options_assign.add(options_assign126.getTree());
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:32: ( ',' options_assign )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==COMMA) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:33: ',' options_assign
					{
					char_literal127=(Token)match(input,COMMA,FOLLOW_COMMA_in_set_option_statement5887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(char_literal127);

					pushFollow(FOLLOW_options_assign_in_set_option_statement5889);
					options_assign128=options_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_options_assign.add(options_assign128.getTree());
					}
					break;

				default :
					break loop42;
				}
			}

			// AST REWRITE
			// elements: options_assign, options_assign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 620:54: -> ^( SET_OPTION_STATEMENT options_assign ( options_assign )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:57: ^( SET_OPTION_STATEMENT options_assign ( options_assign )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION_STATEMENT, "SET_OPTION_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_options_assign.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:620:95: ( options_assign )*
				while ( stream_options_assign.hasNext() ) {
					adaptor.addChild(root_1, stream_options_assign.nextTree());
				}
				stream_options_assign.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, set_option_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_option_statement"


	public static class options_assign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "options_assign"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:623:1: options_assign : (o= ALWBLK EQUAL v= ( S_READ | S_NONE | S_ALLREAD ) -> ^( SET_OPTION[$o.text] $v) |o= ALWCPYDTA EQUAL v= ( S_YES | S_NO | S_OPTIMIZE ) -> ^( SET_OPTION[$o.text] $v) |o= CLOSQLCSR EQUAL v= ( S_ENDACTGRP | S_ENDMOD | S_ENDPGM | S_ENDSQL | S_ENDJOB ) -> ^( SET_OPTION[$o.text] $v) |o= CNULRQD EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= COMMIT EQUAL v= ( S_CHG | S_NONE | S_CS | S_ALL | S_RR ) -> ^( SET_OPTION[$o.text] $v) |o= DATFMT EQUAL v= ( S_JOB | S_ISO | S_EUR | S_USA | S_JIS | S_MDY | S_YMD | S_JUL ) -> ^( SET_OPTION[$o.text] $v) |o= DATSEP EQUAL v= ( S_JOB | S_SLASH | '/' | S_PERIOD | '.' | S_COMMA | ',' | S_DASH | S_BLANK ) -> ^( SET_OPTION[$o.text] $v) |o= DECMPT EQUAL v= ( S_PERIOD | S_COMMA | S_SYSVAL | S_JOB ) -> ^( SET_OPTION[$o.text] $v) |o= DBGVIEW EQUAL v= ( S_NONE | S_SOURCE | S_STMT | S_LIST ) -> ^( SET_OPTION[$o.text] $v) |o= DFTRDBCOL EQUAL v= ( S_NONE | Variable ) -> ^( SET_OPTION[$o.text] $v) |o= DLYPRP EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= DYNDFTCOL EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= DYNUSRPRF EQUAL v= ( S_OWNER | S_USER ) -> ^( SET_OPTION[$o.text] $v) |o= EVENTF EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= LANGID EQUAL v= ( S_JOB | S_JOBRUN | Variable ) -> ^( SET_OPTION[$o.text] $v) |o= NAMING EQUAL v= ( S_SYS | S_SQL ) -> ^( SET_OPTION[$o.text] $v) |o= OPTLOB EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= OUTPUT EQUAL v= ( S_NONE | S_PRINT ) -> ^( SET_OPTION[$o.text] $v) |o= RDBCNNMTH EQUAL v= ( S_DUW | S_RUW ) -> ^( SET_OPTION[$o.text] $v) |o= SQLCURRULE EQUAL v= ( S_DB2 | S_STD ) -> ^( SET_OPTION[$o.text] $v) |o= SQLPATH EQUAL v= ( S_LIBL | Variable ) -> ^( SET_OPTION[$o.text] $v) |o= CNULRQD EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= SRTSEQ EQUAL v= ( S_JOB | S_HEX | S_JOBRUN | S_LANGIDUNQ | S_LANGIDSHR | S_CURLIB | ( S_LIBL )* Variable ) -> ^( SET_OPTION[$o.text] $v) |o= TGTRLS EQUAL v= ( Variable ) -> ^( SET_OPTION[$o.text] $v) |o= TIMFMT EQUAL v= ( S_HMS | S_ISO | S_EUR | S_USA | S_JIS ) -> ^( SET_OPTION[$o.text] $v) |o= TIMSEP EQUAL v= ( S_JOB | S_COLON | ':' | S_PERIOD | '.' | S_COMMA | ',' | S_BLANK ) -> ^( SET_OPTION[$o.text] $v) |o= USRPRF EQUAL v= ( S_OWNER | S_USER | S_NAMING ) -> ^( SET_OPTION[$o.text] $v) );
	public final DBLParser.options_assign_return options_assign() throws RecognitionException {
		DBLParser.options_assign_return retval = new DBLParser.options_assign_return();
		retval.start = input.LT(1);
		int options_assign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token o=null;
		Token v=null;
		Token EQUAL129=null;
		Token EQUAL130=null;
		Token EQUAL131=null;
		Token EQUAL132=null;
		Token EQUAL133=null;
		Token EQUAL134=null;
		Token EQUAL135=null;
		Token EQUAL136=null;
		Token EQUAL137=null;
		Token EQUAL138=null;
		Token EQUAL139=null;
		Token EQUAL140=null;
		Token EQUAL141=null;
		Token EQUAL142=null;
		Token EQUAL143=null;
		Token EQUAL144=null;
		Token EQUAL145=null;
		Token EQUAL146=null;
		Token EQUAL147=null;
		Token EQUAL148=null;
		Token EQUAL149=null;
		Token EQUAL150=null;
		Token EQUAL151=null;
		Token EQUAL152=null;
		Token EQUAL153=null;
		Token EQUAL154=null;
		Token EQUAL155=null;

		CommonTree o_tree=null;
		CommonTree v_tree=null;
		CommonTree EQUAL129_tree=null;
		CommonTree EQUAL130_tree=null;
		CommonTree EQUAL131_tree=null;
		CommonTree EQUAL132_tree=null;
		CommonTree EQUAL133_tree=null;
		CommonTree EQUAL134_tree=null;
		CommonTree EQUAL135_tree=null;
		CommonTree EQUAL136_tree=null;
		CommonTree EQUAL137_tree=null;
		CommonTree EQUAL138_tree=null;
		CommonTree EQUAL139_tree=null;
		CommonTree EQUAL140_tree=null;
		CommonTree EQUAL141_tree=null;
		CommonTree EQUAL142_tree=null;
		CommonTree EQUAL143_tree=null;
		CommonTree EQUAL144_tree=null;
		CommonTree EQUAL145_tree=null;
		CommonTree EQUAL146_tree=null;
		CommonTree EQUAL147_tree=null;
		CommonTree EQUAL148_tree=null;
		CommonTree EQUAL149_tree=null;
		CommonTree EQUAL150_tree=null;
		CommonTree EQUAL151_tree=null;
		CommonTree EQUAL152_tree=null;
		CommonTree EQUAL153_tree=null;
		CommonTree EQUAL154_tree=null;
		CommonTree EQUAL155_tree=null;
		RewriteRuleTokenStream stream_S_SYSVAL=new RewriteRuleTokenStream(adaptor,"token S_SYSVAL");
		RewriteRuleTokenStream stream_DYNDFTCOL=new RewriteRuleTokenStream(adaptor,"token DYNDFTCOL");
		RewriteRuleTokenStream stream_S_READ=new RewriteRuleTokenStream(adaptor,"token S_READ");
		RewriteRuleTokenStream stream_S_DASH=new RewriteRuleTokenStream(adaptor,"token S_DASH");
		RewriteRuleTokenStream stream_S_SLASH=new RewriteRuleTokenStream(adaptor,"token S_SLASH");
		RewriteRuleTokenStream stream_SRTSEQ=new RewriteRuleTokenStream(adaptor,"token SRTSEQ");
		RewriteRuleTokenStream stream_S_NO=new RewriteRuleTokenStream(adaptor,"token S_NO");
		RewriteRuleTokenStream stream_S_LIST=new RewriteRuleTokenStream(adaptor,"token S_LIST");
		RewriteRuleTokenStream stream_TIMFMT=new RewriteRuleTokenStream(adaptor,"token TIMFMT");
		RewriteRuleTokenStream stream_S_RR=new RewriteRuleTokenStream(adaptor,"token S_RR");
		RewriteRuleTokenStream stream_S_EUR=new RewriteRuleTokenStream(adaptor,"token S_EUR");
		RewriteRuleTokenStream stream_S_MDY=new RewriteRuleTokenStream(adaptor,"token S_MDY");
		RewriteRuleTokenStream stream_S_JOB=new RewriteRuleTokenStream(adaptor,"token S_JOB");
		RewriteRuleTokenStream stream_S_ALLREAD=new RewriteRuleTokenStream(adaptor,"token S_ALLREAD");
		RewriteRuleTokenStream stream_S_SOURCE=new RewriteRuleTokenStream(adaptor,"token S_SOURCE");
		RewriteRuleTokenStream stream_S_LANGIDUNQ=new RewriteRuleTokenStream(adaptor,"token S_LANGIDUNQ");
		RewriteRuleTokenStream stream_EVENTF=new RewriteRuleTokenStream(adaptor,"token EVENTF");
		RewriteRuleTokenStream stream_DECMPT=new RewriteRuleTokenStream(adaptor,"token DECMPT");
		RewriteRuleTokenStream stream_S_ENDPGM=new RewriteRuleTokenStream(adaptor,"token S_ENDPGM");
		RewriteRuleTokenStream stream_TGTRLS=new RewriteRuleTokenStream(adaptor,"token TGTRLS");
		RewriteRuleTokenStream stream_DATSEP=new RewriteRuleTokenStream(adaptor,"token DATSEP");
		RewriteRuleTokenStream stream_S_NONE=new RewriteRuleTokenStream(adaptor,"token S_NONE");
		RewriteRuleTokenStream stream_OUTPUT=new RewriteRuleTokenStream(adaptor,"token OUTPUT");
		RewriteRuleTokenStream stream_S_ENDMOD=new RewriteRuleTokenStream(adaptor,"token S_ENDMOD");
		RewriteRuleTokenStream stream_S_ALL=new RewriteRuleTokenStream(adaptor,"token S_ALL");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_S_STD=new RewriteRuleTokenStream(adaptor,"token S_STD");
		RewriteRuleTokenStream stream_S_JOBRUN=new RewriteRuleTokenStream(adaptor,"token S_JOBRUN");
		RewriteRuleTokenStream stream_S_CHG=new RewriteRuleTokenStream(adaptor,"token S_CHG");
		RewriteRuleTokenStream stream_S_CURLIB=new RewriteRuleTokenStream(adaptor,"token S_CURLIB");
		RewriteRuleTokenStream stream_S_HEX=new RewriteRuleTokenStream(adaptor,"token S_HEX");
		RewriteRuleTokenStream stream_S_USER=new RewriteRuleTokenStream(adaptor,"token S_USER");
		RewriteRuleTokenStream stream_S_JIS=new RewriteRuleTokenStream(adaptor,"token S_JIS");
		RewriteRuleTokenStream stream_S_DB2=new RewriteRuleTokenStream(adaptor,"token S_DB2");
		RewriteRuleTokenStream stream_S_RUW=new RewriteRuleTokenStream(adaptor,"token S_RUW");
		RewriteRuleTokenStream stream_S_STMT=new RewriteRuleTokenStream(adaptor,"token S_STMT");
		RewriteRuleTokenStream stream_DFTRDBCOL=new RewriteRuleTokenStream(adaptor,"token DFTRDBCOL");
		RewriteRuleTokenStream stream_S_NAMING=new RewriteRuleTokenStream(adaptor,"token S_NAMING");
		RewriteRuleTokenStream stream_S_HMS=new RewriteRuleTokenStream(adaptor,"token S_HMS");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_S_ISO=new RewriteRuleTokenStream(adaptor,"token S_ISO");
		RewriteRuleTokenStream stream_S_COLON=new RewriteRuleTokenStream(adaptor,"token S_COLON");
		RewriteRuleTokenStream stream_TIMSEP=new RewriteRuleTokenStream(adaptor,"token TIMSEP");
		RewriteRuleTokenStream stream_S_DUW=new RewriteRuleTokenStream(adaptor,"token S_DUW");
		RewriteRuleTokenStream stream_S_JUL=new RewriteRuleTokenStream(adaptor,"token S_JUL");
		RewriteRuleTokenStream stream_S_USA=new RewriteRuleTokenStream(adaptor,"token S_USA");
		RewriteRuleTokenStream stream_DYNUSRPRF=new RewriteRuleTokenStream(adaptor,"token DYNUSRPRF");
		RewriteRuleTokenStream stream_S_PERIOD=new RewriteRuleTokenStream(adaptor,"token S_PERIOD");
		RewriteRuleTokenStream stream_CNULRQD=new RewriteRuleTokenStream(adaptor,"token CNULRQD");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
		RewriteRuleTokenStream stream_S_BLANK=new RewriteRuleTokenStream(adaptor,"token S_BLANK");
		RewriteRuleTokenStream stream_DATFMT=new RewriteRuleTokenStream(adaptor,"token DATFMT");
		RewriteRuleTokenStream stream_USRPRF=new RewriteRuleTokenStream(adaptor,"token USRPRF");
		RewriteRuleTokenStream stream_NAMING=new RewriteRuleTokenStream(adaptor,"token NAMING");
		RewriteRuleTokenStream stream_S_COMMA=new RewriteRuleTokenStream(adaptor,"token S_COMMA");
		RewriteRuleTokenStream stream_S_LANGIDSHR=new RewriteRuleTokenStream(adaptor,"token S_LANGIDSHR");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LANGID=new RewriteRuleTokenStream(adaptor,"token LANGID");
		RewriteRuleTokenStream stream_SQLPATH=new RewriteRuleTokenStream(adaptor,"token SQLPATH");
		RewriteRuleTokenStream stream_S_ENDSQL=new RewriteRuleTokenStream(adaptor,"token S_ENDSQL");
		RewriteRuleTokenStream stream_S_OWNER=new RewriteRuleTokenStream(adaptor,"token S_OWNER");
		RewriteRuleTokenStream stream_S_YES=new RewriteRuleTokenStream(adaptor,"token S_YES");
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_SQLCURRULE=new RewriteRuleTokenStream(adaptor,"token SQLCURRULE");
		RewriteRuleTokenStream stream_ALWCPYDTA=new RewriteRuleTokenStream(adaptor,"token ALWCPYDTA");
		RewriteRuleTokenStream stream_S_OPTIMIZE=new RewriteRuleTokenStream(adaptor,"token S_OPTIMIZE");
		RewriteRuleTokenStream stream_S_PRINT=new RewriteRuleTokenStream(adaptor,"token S_PRINT");
		RewriteRuleTokenStream stream_385=new RewriteRuleTokenStream(adaptor,"token 385");
		RewriteRuleTokenStream stream_OPTLOB=new RewriteRuleTokenStream(adaptor,"token OPTLOB");
		RewriteRuleTokenStream stream_CLOSQLCSR=new RewriteRuleTokenStream(adaptor,"token CLOSQLCSR");
		RewriteRuleTokenStream stream_S_LIBL=new RewriteRuleTokenStream(adaptor,"token S_LIBL");
		RewriteRuleTokenStream stream_S_ENDJOB=new RewriteRuleTokenStream(adaptor,"token S_ENDJOB");
		RewriteRuleTokenStream stream_RDBCNNMTH=new RewriteRuleTokenStream(adaptor,"token RDBCNNMTH");
		RewriteRuleTokenStream stream_DBGVIEW=new RewriteRuleTokenStream(adaptor,"token DBGVIEW");
		RewriteRuleTokenStream stream_ALWBLK=new RewriteRuleTokenStream(adaptor,"token ALWBLK");
		RewriteRuleTokenStream stream_S_YMD=new RewriteRuleTokenStream(adaptor,"token S_YMD");
		RewriteRuleTokenStream stream_S_CS=new RewriteRuleTokenStream(adaptor,"token S_CS");
		RewriteRuleTokenStream stream_S_ENDACTGRP=new RewriteRuleTokenStream(adaptor,"token S_ENDACTGRP");
		RewriteRuleTokenStream stream_S_SQL=new RewriteRuleTokenStream(adaptor,"token S_SQL");
		RewriteRuleTokenStream stream_DLYPRP=new RewriteRuleTokenStream(adaptor,"token DLYPRP");
		RewriteRuleTokenStream stream_S_SYS=new RewriteRuleTokenStream(adaptor,"token S_SYS");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:624:4: (o= ALWBLK EQUAL v= ( S_READ | S_NONE | S_ALLREAD ) -> ^( SET_OPTION[$o.text] $v) |o= ALWCPYDTA EQUAL v= ( S_YES | S_NO | S_OPTIMIZE ) -> ^( SET_OPTION[$o.text] $v) |o= CLOSQLCSR EQUAL v= ( S_ENDACTGRP | S_ENDMOD | S_ENDPGM | S_ENDSQL | S_ENDJOB ) -> ^( SET_OPTION[$o.text] $v) |o= CNULRQD EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= COMMIT EQUAL v= ( S_CHG | S_NONE | S_CS | S_ALL | S_RR ) -> ^( SET_OPTION[$o.text] $v) |o= DATFMT EQUAL v= ( S_JOB | S_ISO | S_EUR | S_USA | S_JIS | S_MDY | S_YMD | S_JUL ) -> ^( SET_OPTION[$o.text] $v) |o= DATSEP EQUAL v= ( S_JOB | S_SLASH | '/' | S_PERIOD | '.' | S_COMMA | ',' | S_DASH | S_BLANK ) -> ^( SET_OPTION[$o.text] $v) |o= DECMPT EQUAL v= ( S_PERIOD | S_COMMA | S_SYSVAL | S_JOB ) -> ^( SET_OPTION[$o.text] $v) |o= DBGVIEW EQUAL v= ( S_NONE | S_SOURCE | S_STMT | S_LIST ) -> ^( SET_OPTION[$o.text] $v) |o= DFTRDBCOL EQUAL v= ( S_NONE | Variable ) -> ^( SET_OPTION[$o.text] $v) |o= DLYPRP EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= DYNDFTCOL EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= DYNUSRPRF EQUAL v= ( S_OWNER | S_USER ) -> ^( SET_OPTION[$o.text] $v) |o= EVENTF EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= LANGID EQUAL v= ( S_JOB | S_JOBRUN | Variable ) -> ^( SET_OPTION[$o.text] $v) |o= NAMING EQUAL v= ( S_SYS | S_SQL ) -> ^( SET_OPTION[$o.text] $v) |o= OPTLOB EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= OUTPUT EQUAL v= ( S_NONE | S_PRINT ) -> ^( SET_OPTION[$o.text] $v) |o= RDBCNNMTH EQUAL v= ( S_DUW | S_RUW ) -> ^( SET_OPTION[$o.text] $v) |o= SQLCURRULE EQUAL v= ( S_DB2 | S_STD ) -> ^( SET_OPTION[$o.text] $v) |o= SQLPATH EQUAL v= ( S_LIBL | Variable ) -> ^( SET_OPTION[$o.text] $v) |o= CNULRQD EQUAL v= ( S_YES | S_NO ) -> ^( SET_OPTION[$o.text] $v) |o= SRTSEQ EQUAL v= ( S_JOB | S_HEX | S_JOBRUN | S_LANGIDUNQ | S_LANGIDSHR | S_CURLIB | ( S_LIBL )* Variable ) -> ^( SET_OPTION[$o.text] $v) |o= TGTRLS EQUAL v= ( Variable ) -> ^( SET_OPTION[$o.text] $v) |o= TIMFMT EQUAL v= ( S_HMS | S_ISO | S_EUR | S_USA | S_JIS ) -> ^( SET_OPTION[$o.text] $v) |o= TIMSEP EQUAL v= ( S_JOB | S_COLON | ':' | S_PERIOD | '.' | S_COMMA | ',' | S_BLANK ) -> ^( SET_OPTION[$o.text] $v) |o= USRPRF EQUAL v= ( S_OWNER | S_USER | S_NAMING ) -> ^( SET_OPTION[$o.text] $v) )
			int alt70=27;
			switch ( input.LA(1) ) {
			case ALWBLK:
				{
				alt70=1;
				}
				break;
			case ALWCPYDTA:
				{
				alt70=2;
				}
				break;
			case CLOSQLCSR:
				{
				alt70=3;
				}
				break;
			case CNULRQD:
				{
				int LA70_4 = input.LA(2);
				if ( (LA70_4==EQUAL) ) {
					int LA70_27 = input.LA(3);
					if ( (LA70_27==S_YES) ) {
						int LA70_28 = input.LA(4);
						if ( (synpred87_DBL()) ) {
							alt70=4;
						}
						else if ( (synpred144_DBL()) ) {
							alt70=22;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 70, 28, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA70_27==S_NO) ) {
						int LA70_29 = input.LA(4);
						if ( (synpred87_DBL()) ) {
							alt70=4;
						}
						else if ( (synpred144_DBL()) ) {
							alt70=22;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 70, 29, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 70, 27, input);
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
							new NoViableAltException("", 70, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMIT:
				{
				alt70=5;
				}
				break;
			case DATFMT:
				{
				alt70=6;
				}
				break;
			case DATSEP:
				{
				alt70=7;
				}
				break;
			case DECMPT:
				{
				alt70=8;
				}
				break;
			case DBGVIEW:
				{
				alt70=9;
				}
				break;
			case DFTRDBCOL:
				{
				alt70=10;
				}
				break;
			case DLYPRP:
				{
				alt70=11;
				}
				break;
			case DYNDFTCOL:
				{
				alt70=12;
				}
				break;
			case DYNUSRPRF:
				{
				alt70=13;
				}
				break;
			case EVENTF:
				{
				alt70=14;
				}
				break;
			case LANGID:
				{
				alt70=15;
				}
				break;
			case NAMING:
				{
				alt70=16;
				}
				break;
			case OPTLOB:
				{
				alt70=17;
				}
				break;
			case OUTPUT:
				{
				alt70=18;
				}
				break;
			case RDBCNNMTH:
				{
				alt70=19;
				}
				break;
			case SQLCURRULE:
				{
				alt70=20;
				}
				break;
			case SQLPATH:
				{
				alt70=21;
				}
				break;
			case SRTSEQ:
				{
				alt70=23;
				}
				break;
			case TGTRLS:
				{
				alt70=24;
				}
				break;
			case TIMFMT:
				{
				alt70=25;
				}
				break;
			case TIMSEP:
				{
				alt70=26;
				}
				break;
			case USRPRF:
				{
				alt70=27;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:625:4: o= ALWBLK EQUAL v= ( S_READ | S_NONE | S_ALLREAD )
					{
					o=(Token)match(input,ALWBLK,FOLLOW_ALWBLK_in_options_assign5929); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALWBLK.add(o);

					EQUAL129=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign5931); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL129);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:625:21: ( S_READ | S_NONE | S_ALLREAD )
					int alt43=3;
					switch ( input.LA(1) ) {
					case S_READ:
						{
						alt43=1;
						}
						break;
					case S_NONE:
						{
						alt43=2;
						}
						break;
					case S_ALLREAD:
						{
						alt43=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}
					switch (alt43) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:625:22: S_READ
							{
							v=(Token)match(input,S_READ,FOLLOW_S_READ_in_options_assign5936); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_READ.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:625:29: S_NONE
							{
							v=(Token)match(input,S_NONE,FOLLOW_S_NONE_in_options_assign5938); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NONE.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:625:36: S_ALLREAD
							{
							v=(Token)match(input,S_ALLREAD,FOLLOW_S_ALLREAD_in_options_assign5940); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ALLREAD.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 625:46: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:625:49: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:627:4: o= ALWCPYDTA EQUAL v= ( S_YES | S_NO | S_OPTIMIZE )
					{
					o=(Token)match(input,ALWCPYDTA,FOLLOW_ALWCPYDTA_in_options_assign5962); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALWCPYDTA.add(o);

					EQUAL130=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign5964); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL130);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:627:24: ( S_YES | S_NO | S_OPTIMIZE )
					int alt44=3;
					switch ( input.LA(1) ) {
					case S_YES:
						{
						alt44=1;
						}
						break;
					case S_NO:
						{
						alt44=2;
						}
						break;
					case S_OPTIMIZE:
						{
						alt44=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}
					switch (alt44) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:627:25: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign5969); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:627:31: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign5971); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:627:36: S_OPTIMIZE
							{
							v=(Token)match(input,S_OPTIMIZE,FOLLOW_S_OPTIMIZE_in_options_assign5973); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_OPTIMIZE.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 627:47: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:627:50: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:4: o= CLOSQLCSR EQUAL v= ( S_ENDACTGRP | S_ENDMOD | S_ENDPGM | S_ENDSQL | S_ENDJOB )
					{
					o=(Token)match(input,CLOSQLCSR,FOLLOW_CLOSQLCSR_in_options_assign5995); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLOSQLCSR.add(o);

					EQUAL131=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign5997); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL131);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:24: ( S_ENDACTGRP | S_ENDMOD | S_ENDPGM | S_ENDSQL | S_ENDJOB )
					int alt45=5;
					switch ( input.LA(1) ) {
					case S_ENDACTGRP:
						{
						alt45=1;
						}
						break;
					case S_ENDMOD:
						{
						alt45=2;
						}
						break;
					case S_ENDPGM:
						{
						alt45=3;
						}
						break;
					case S_ENDSQL:
						{
						alt45=4;
						}
						break;
					case S_ENDJOB:
						{
						alt45=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}
					switch (alt45) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:25: S_ENDACTGRP
							{
							v=(Token)match(input,S_ENDACTGRP,FOLLOW_S_ENDACTGRP_in_options_assign6002); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ENDACTGRP.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:37: S_ENDMOD
							{
							v=(Token)match(input,S_ENDMOD,FOLLOW_S_ENDMOD_in_options_assign6004); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ENDMOD.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:46: S_ENDPGM
							{
							v=(Token)match(input,S_ENDPGM,FOLLOW_S_ENDPGM_in_options_assign6006); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ENDPGM.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:55: S_ENDSQL
							{
							v=(Token)match(input,S_ENDSQL,FOLLOW_S_ENDSQL_in_options_assign6008); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ENDSQL.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:64: S_ENDJOB
							{
							v=(Token)match(input,S_ENDJOB,FOLLOW_S_ENDJOB_in_options_assign6010); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ENDJOB.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 629:73: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:629:76: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:4: o= CNULRQD EQUAL v= ( S_YES | S_NO )
					{
					o=(Token)match(input,CNULRQD,FOLLOW_CNULRQD_in_options_assign6032); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CNULRQD.add(o);

					EQUAL132=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6034); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL132);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:22: ( S_YES | S_NO )
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==S_YES) ) {
						alt46=1;
					}
					else if ( (LA46_0==S_NO) ) {
						alt46=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}

					switch (alt46) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:23: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign6039); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:29: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign6041); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 631:34: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:37: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:4: o= COMMIT EQUAL v= ( S_CHG | S_NONE | S_CS | S_ALL | S_RR )
					{
					o=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_options_assign6063); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMIT.add(o);

					EQUAL133=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6065); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL133);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:21: ( S_CHG | S_NONE | S_CS | S_ALL | S_RR )
					int alt47=5;
					switch ( input.LA(1) ) {
					case S_CHG:
						{
						alt47=1;
						}
						break;
					case S_NONE:
						{
						alt47=2;
						}
						break;
					case S_CS:
						{
						alt47=3;
						}
						break;
					case S_ALL:
						{
						alt47=4;
						}
						break;
					case S_RR:
						{
						alt47=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}
					switch (alt47) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:22: S_CHG
							{
							v=(Token)match(input,S_CHG,FOLLOW_S_CHG_in_options_assign6070); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_CHG.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:28: S_NONE
							{
							v=(Token)match(input,S_NONE,FOLLOW_S_NONE_in_options_assign6072); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NONE.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:35: S_CS
							{
							v=(Token)match(input,S_CS,FOLLOW_S_CS_in_options_assign6074); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_CS.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:40: S_ALL
							{
							v=(Token)match(input,S_ALL,FOLLOW_S_ALL_in_options_assign6076); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ALL.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:46: S_RR
							{
							v=(Token)match(input,S_RR,FOLLOW_S_RR_in_options_assign6078); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_RR.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 633:51: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:633:54: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:4: o= DATFMT EQUAL v= ( S_JOB | S_ISO | S_EUR | S_USA | S_JIS | S_MDY | S_YMD | S_JUL )
					{
					o=(Token)match(input,DATFMT,FOLLOW_DATFMT_in_options_assign6100); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DATFMT.add(o);

					EQUAL134=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL134);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:21: ( S_JOB | S_ISO | S_EUR | S_USA | S_JIS | S_MDY | S_YMD | S_JUL )
					int alt48=8;
					switch ( input.LA(1) ) {
					case S_JOB:
						{
						alt48=1;
						}
						break;
					case S_ISO:
						{
						alt48=2;
						}
						break;
					case S_EUR:
						{
						alt48=3;
						}
						break;
					case S_USA:
						{
						alt48=4;
						}
						break;
					case S_JIS:
						{
						alt48=5;
						}
						break;
					case S_MDY:
						{
						alt48=6;
						}
						break;
					case S_YMD:
						{
						alt48=7;
						}
						break;
					case S_JUL:
						{
						alt48=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}
					switch (alt48) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:22: S_JOB
							{
							v=(Token)match(input,S_JOB,FOLLOW_S_JOB_in_options_assign6107); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOB.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:28: S_ISO
							{
							v=(Token)match(input,S_ISO,FOLLOW_S_ISO_in_options_assign6109); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ISO.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:34: S_EUR
							{
							v=(Token)match(input,S_EUR,FOLLOW_S_EUR_in_options_assign6111); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_EUR.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:40: S_USA
							{
							v=(Token)match(input,S_USA,FOLLOW_S_USA_in_options_assign6113); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_USA.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:46: S_JIS
							{
							v=(Token)match(input,S_JIS,FOLLOW_S_JIS_in_options_assign6115); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JIS.add(v);

							}
							break;
						case 6 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:52: S_MDY
							{
							v=(Token)match(input,S_MDY,FOLLOW_S_MDY_in_options_assign6117); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_MDY.add(v);

							}
							break;
						case 7 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:58: S_YMD
							{
							v=(Token)match(input,S_YMD,FOLLOW_S_YMD_in_options_assign6119); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YMD.add(v);

							}
							break;
						case 8 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:64: S_JUL
							{
							v=(Token)match(input,S_JUL,FOLLOW_S_JUL_in_options_assign6121); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JUL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 635:70: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:635:73: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:4: o= DATSEP EQUAL v= ( S_JOB | S_SLASH | '/' | S_PERIOD | '.' | S_COMMA | ',' | S_DASH | S_BLANK )
					{
					o=(Token)match(input,DATSEP,FOLLOW_DATSEP_in_options_assign6143); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DATSEP.add(o);

					EQUAL135=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6145); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL135);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:21: ( S_JOB | S_SLASH | '/' | S_PERIOD | '.' | S_COMMA | ',' | S_DASH | S_BLANK )
					int alt49=9;
					switch ( input.LA(1) ) {
					case S_JOB:
						{
						alt49=1;
						}
						break;
					case S_SLASH:
						{
						alt49=2;
						}
						break;
					case DIVIDE:
						{
						alt49=3;
						}
						break;
					case S_PERIOD:
						{
						alt49=4;
						}
						break;
					case DOT:
						{
						alt49=5;
						}
						break;
					case S_COMMA:
						{
						alt49=6;
						}
						break;
					case COMMA:
						{
						alt49=7;
						}
						break;
					case S_DASH:
						{
						alt49=8;
						}
						break;
					case S_BLANK:
						{
						alt49=9;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}
					switch (alt49) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:22: S_JOB
							{
							v=(Token)match(input,S_JOB,FOLLOW_S_JOB_in_options_assign6150); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOB.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:28: S_SLASH
							{
							v=(Token)match(input,S_SLASH,FOLLOW_S_SLASH_in_options_assign6152); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_SLASH.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:36: '/'
							{
							v=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_options_assign6154); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DIVIDE.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:40: S_PERIOD
							{
							v=(Token)match(input,S_PERIOD,FOLLOW_S_PERIOD_in_options_assign6156); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_PERIOD.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:49: '.'
							{
							v=(Token)match(input,DOT,FOLLOW_DOT_in_options_assign6158); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(v);

							}
							break;
						case 6 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:53: S_COMMA
							{
							v=(Token)match(input,S_COMMA,FOLLOW_S_COMMA_in_options_assign6160); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_COMMA.add(v);

							}
							break;
						case 7 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:61: ','
							{
							v=(Token)match(input,COMMA,FOLLOW_COMMA_in_options_assign6162); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(v);

							}
							break;
						case 8 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:65: S_DASH
							{
							v=(Token)match(input,S_DASH,FOLLOW_S_DASH_in_options_assign6164); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_DASH.add(v);

							}
							break;
						case 9 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:72: S_BLANK
							{
							v=(Token)match(input,S_BLANK,FOLLOW_S_BLANK_in_options_assign6166); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_BLANK.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 637:80: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:637:83: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:4: o= DECMPT EQUAL v= ( S_PERIOD | S_COMMA | S_SYSVAL | S_JOB )
					{
					o=(Token)match(input,DECMPT,FOLLOW_DECMPT_in_options_assign6188); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECMPT.add(o);

					EQUAL136=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6190); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL136);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:21: ( S_PERIOD | S_COMMA | S_SYSVAL | S_JOB )
					int alt50=4;
					switch ( input.LA(1) ) {
					case S_PERIOD:
						{
						alt50=1;
						}
						break;
					case S_COMMA:
						{
						alt50=2;
						}
						break;
					case S_SYSVAL:
						{
						alt50=3;
						}
						break;
					case S_JOB:
						{
						alt50=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:22: S_PERIOD
							{
							v=(Token)match(input,S_PERIOD,FOLLOW_S_PERIOD_in_options_assign6195); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_PERIOD.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:31: S_COMMA
							{
							v=(Token)match(input,S_COMMA,FOLLOW_S_COMMA_in_options_assign6197); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_COMMA.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:39: S_SYSVAL
							{
							v=(Token)match(input,S_SYSVAL,FOLLOW_S_SYSVAL_in_options_assign6199); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_SYSVAL.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:48: S_JOB
							{
							v=(Token)match(input,S_JOB,FOLLOW_S_JOB_in_options_assign6201); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOB.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 639:54: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:639:57: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:4: o= DBGVIEW EQUAL v= ( S_NONE | S_SOURCE | S_STMT | S_LIST )
					{
					o=(Token)match(input,DBGVIEW,FOLLOW_DBGVIEW_in_options_assign6223); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DBGVIEW.add(o);

					EQUAL137=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6225); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL137);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:22: ( S_NONE | S_SOURCE | S_STMT | S_LIST )
					int alt51=4;
					switch ( input.LA(1) ) {
					case S_NONE:
						{
						alt51=1;
						}
						break;
					case S_SOURCE:
						{
						alt51=2;
						}
						break;
					case S_STMT:
						{
						alt51=3;
						}
						break;
					case S_LIST:
						{
						alt51=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:23: S_NONE
							{
							v=(Token)match(input,S_NONE,FOLLOW_S_NONE_in_options_assign6230); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NONE.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:30: S_SOURCE
							{
							v=(Token)match(input,S_SOURCE,FOLLOW_S_SOURCE_in_options_assign6232); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_SOURCE.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:39: S_STMT
							{
							v=(Token)match(input,S_STMT,FOLLOW_S_STMT_in_options_assign6234); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_STMT.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:46: S_LIST
							{
							v=(Token)match(input,S_LIST,FOLLOW_S_LIST_in_options_assign6236); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_LIST.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 641:53: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:641:56: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:643:4: o= DFTRDBCOL EQUAL v= ( S_NONE | Variable )
					{
					o=(Token)match(input,DFTRDBCOL,FOLLOW_DFTRDBCOL_in_options_assign6258); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DFTRDBCOL.add(o);

					EQUAL138=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6260); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL138);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:643:24: ( S_NONE | Variable )
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==S_NONE) ) {
						alt52=1;
					}
					else if ( (LA52_0==Variable) ) {
						alt52=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						throw nvae;
					}

					switch (alt52) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:643:25: S_NONE
							{
							v=(Token)match(input,S_NONE,FOLLOW_S_NONE_in_options_assign6265); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NONE.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:643:32: Variable
							{
							v=(Token)match(input,Variable,FOLLOW_Variable_in_options_assign6267); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 643:41: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:643:44: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 11 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:645:4: o= DLYPRP EQUAL v= ( S_YES | S_NO )
					{
					o=(Token)match(input,DLYPRP,FOLLOW_DLYPRP_in_options_assign6289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DLYPRP.add(o);

					EQUAL139=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6291); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL139);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:645:21: ( S_YES | S_NO )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==S_YES) ) {
						alt53=1;
					}
					else if ( (LA53_0==S_NO) ) {
						alt53=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:645:22: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign6296); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:645:28: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign6298); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 645:33: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:645:36: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 12 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:647:4: o= DYNDFTCOL EQUAL v= ( S_YES | S_NO )
					{
					o=(Token)match(input,DYNDFTCOL,FOLLOW_DYNDFTCOL_in_options_assign6320); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DYNDFTCOL.add(o);

					EQUAL140=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6322); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL140);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:647:24: ( S_YES | S_NO )
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==S_YES) ) {
						alt54=1;
					}
					else if ( (LA54_0==S_NO) ) {
						alt54=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						throw nvae;
					}

					switch (alt54) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:647:25: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign6327); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:647:31: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign6329); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 647:36: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:647:39: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 13 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:649:4: o= DYNUSRPRF EQUAL v= ( S_OWNER | S_USER )
					{
					o=(Token)match(input,DYNUSRPRF,FOLLOW_DYNUSRPRF_in_options_assign6351); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DYNUSRPRF.add(o);

					EQUAL141=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6353); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL141);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:649:24: ( S_OWNER | S_USER )
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==S_OWNER) ) {
						alt55=1;
					}
					else if ( (LA55_0==S_USER) ) {
						alt55=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}

					switch (alt55) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:649:25: S_OWNER
							{
							v=(Token)match(input,S_OWNER,FOLLOW_S_OWNER_in_options_assign6358); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_OWNER.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:649:33: S_USER
							{
							v=(Token)match(input,S_USER,FOLLOW_S_USER_in_options_assign6360); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_USER.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 649:40: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:649:43: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 14 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:651:4: o= EVENTF EQUAL v= ( S_YES | S_NO )
					{
					o=(Token)match(input,EVENTF,FOLLOW_EVENTF_in_options_assign6382); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EVENTF.add(o);

					EQUAL142=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6384); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL142);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:651:21: ( S_YES | S_NO )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==S_YES) ) {
						alt56=1;
					}
					else if ( (LA56_0==S_NO) ) {
						alt56=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 56, 0, input);
						throw nvae;
					}

					switch (alt56) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:651:22: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign6389); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:651:28: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign6391); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 651:33: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:651:36: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 15 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:653:4: o= LANGID EQUAL v= ( S_JOB | S_JOBRUN | Variable )
					{
					o=(Token)match(input,LANGID,FOLLOW_LANGID_in_options_assign6413); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LANGID.add(o);

					EQUAL143=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6415); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL143);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:653:21: ( S_JOB | S_JOBRUN | Variable )
					int alt57=3;
					switch ( input.LA(1) ) {
					case S_JOB:
						{
						alt57=1;
						}
						break;
					case S_JOBRUN:
						{
						alt57=2;
						}
						break;
					case Variable:
						{
						alt57=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:653:22: S_JOB
							{
							v=(Token)match(input,S_JOB,FOLLOW_S_JOB_in_options_assign6420); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOB.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:653:28: S_JOBRUN
							{
							v=(Token)match(input,S_JOBRUN,FOLLOW_S_JOBRUN_in_options_assign6422); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOBRUN.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:653:37: Variable
							{
							v=(Token)match(input,Variable,FOLLOW_Variable_in_options_assign6424); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 653:46: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:653:49: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 16 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:655:4: o= NAMING EQUAL v= ( S_SYS | S_SQL )
					{
					o=(Token)match(input,NAMING,FOLLOW_NAMING_in_options_assign6446); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAMING.add(o);

					EQUAL144=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6448); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL144);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:655:21: ( S_SYS | S_SQL )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==S_SYS) ) {
						alt58=1;
					}
					else if ( (LA58_0==S_SQL) ) {
						alt58=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:655:22: S_SYS
							{
							v=(Token)match(input,S_SYS,FOLLOW_S_SYS_in_options_assign6453); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_SYS.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:655:28: S_SQL
							{
							v=(Token)match(input,S_SQL,FOLLOW_S_SQL_in_options_assign6455); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_SQL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 655:34: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:655:37: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 17 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:657:4: o= OPTLOB EQUAL v= ( S_YES | S_NO )
					{
					o=(Token)match(input,OPTLOB,FOLLOW_OPTLOB_in_options_assign6477); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OPTLOB.add(o);

					EQUAL145=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6479); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL145);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:657:21: ( S_YES | S_NO )
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==S_YES) ) {
						alt59=1;
					}
					else if ( (LA59_0==S_NO) ) {
						alt59=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:657:22: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign6484); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:657:28: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign6486); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 657:33: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:657:36: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 18 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:659:4: o= OUTPUT EQUAL v= ( S_NONE | S_PRINT )
					{
					o=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_options_assign6508); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTPUT.add(o);

					EQUAL146=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6510); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL146);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:659:21: ( S_NONE | S_PRINT )
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==S_NONE) ) {
						alt60=1;
					}
					else if ( (LA60_0==S_PRINT) ) {
						alt60=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 60, 0, input);
						throw nvae;
					}

					switch (alt60) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:659:22: S_NONE
							{
							v=(Token)match(input,S_NONE,FOLLOW_S_NONE_in_options_assign6515); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NONE.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:659:29: S_PRINT
							{
							v=(Token)match(input,S_PRINT,FOLLOW_S_PRINT_in_options_assign6517); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_PRINT.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 659:37: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:659:40: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 19 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:661:4: o= RDBCNNMTH EQUAL v= ( S_DUW | S_RUW )
					{
					o=(Token)match(input,RDBCNNMTH,FOLLOW_RDBCNNMTH_in_options_assign6539); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RDBCNNMTH.add(o);

					EQUAL147=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL147);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:661:24: ( S_DUW | S_RUW )
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==S_DUW) ) {
						alt61=1;
					}
					else if ( (LA61_0==S_RUW) ) {
						alt61=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 61, 0, input);
						throw nvae;
					}

					switch (alt61) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:661:25: S_DUW
							{
							v=(Token)match(input,S_DUW,FOLLOW_S_DUW_in_options_assign6546); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_DUW.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:661:31: S_RUW
							{
							v=(Token)match(input,S_RUW,FOLLOW_S_RUW_in_options_assign6548); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_RUW.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 661:37: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:661:40: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 20 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:663:4: o= SQLCURRULE EQUAL v= ( S_DB2 | S_STD )
					{
					o=(Token)match(input,SQLCURRULE,FOLLOW_SQLCURRULE_in_options_assign6570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SQLCURRULE.add(o);

					EQUAL148=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6572); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL148);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:663:25: ( S_DB2 | S_STD )
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==S_DB2) ) {
						alt62=1;
					}
					else if ( (LA62_0==S_STD) ) {
						alt62=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 62, 0, input);
						throw nvae;
					}

					switch (alt62) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:663:26: S_DB2
							{
							v=(Token)match(input,S_DB2,FOLLOW_S_DB2_in_options_assign6577); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_DB2.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:663:32: S_STD
							{
							v=(Token)match(input,S_STD,FOLLOW_S_STD_in_options_assign6579); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_STD.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 663:38: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:663:41: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 21 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:665:4: o= SQLPATH EQUAL v= ( S_LIBL | Variable )
					{
					o=(Token)match(input,SQLPATH,FOLLOW_SQLPATH_in_options_assign6601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SQLPATH.add(o);

					EQUAL149=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6603); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL149);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:665:22: ( S_LIBL | Variable )
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==S_LIBL) ) {
						alt63=1;
					}
					else if ( (LA63_0==Variable) ) {
						alt63=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						throw nvae;
					}

					switch (alt63) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:665:23: S_LIBL
							{
							v=(Token)match(input,S_LIBL,FOLLOW_S_LIBL_in_options_assign6608); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_LIBL.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:665:30: Variable
							{
							v=(Token)match(input,Variable,FOLLOW_Variable_in_options_assign6610); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 665:39: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:665:42: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 22 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:4: o= CNULRQD EQUAL v= ( S_YES | S_NO )
					{
					o=(Token)match(input,CNULRQD,FOLLOW_CNULRQD_in_options_assign6632); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CNULRQD.add(o);

					EQUAL150=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6634); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL150);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:22: ( S_YES | S_NO )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==S_YES) ) {
						alt64=1;
					}
					else if ( (LA64_0==S_NO) ) {
						alt64=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:23: S_YES
							{
							v=(Token)match(input,S_YES,FOLLOW_S_YES_in_options_assign6639); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_YES.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:29: S_NO
							{
							v=(Token)match(input,S_NO,FOLLOW_S_NO_in_options_assign6641); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NO.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 667:34: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:37: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 23 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:4: o= SRTSEQ EQUAL v= ( S_JOB | S_HEX | S_JOBRUN | S_LANGIDUNQ | S_LANGIDSHR | S_CURLIB | ( S_LIBL )* Variable )
					{
					o=(Token)match(input,SRTSEQ,FOLLOW_SRTSEQ_in_options_assign6663); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SRTSEQ.add(o);

					EQUAL151=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6665); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL151);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:21: ( S_JOB | S_HEX | S_JOBRUN | S_LANGIDUNQ | S_LANGIDSHR | S_CURLIB | ( S_LIBL )* Variable )
					int alt66=7;
					switch ( input.LA(1) ) {
					case S_JOB:
						{
						alt66=1;
						}
						break;
					case S_HEX:
						{
						alt66=2;
						}
						break;
					case S_JOBRUN:
						{
						alt66=3;
						}
						break;
					case S_LANGIDUNQ:
						{
						alt66=4;
						}
						break;
					case S_LANGIDSHR:
						{
						alt66=5;
						}
						break;
					case S_CURLIB:
						{
						alt66=6;
						}
						break;
					case S_LIBL:
					case Variable:
						{
						alt66=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}
					switch (alt66) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:22: S_JOB
							{
							v=(Token)match(input,S_JOB,FOLLOW_S_JOB_in_options_assign6670); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOB.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:28: S_HEX
							{
							v=(Token)match(input,S_HEX,FOLLOW_S_HEX_in_options_assign6672); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_HEX.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:34: S_JOBRUN
							{
							v=(Token)match(input,S_JOBRUN,FOLLOW_S_JOBRUN_in_options_assign6674); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOBRUN.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:43: S_LANGIDUNQ
							{
							v=(Token)match(input,S_LANGIDUNQ,FOLLOW_S_LANGIDUNQ_in_options_assign6676); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_LANGIDUNQ.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:55: S_LANGIDSHR
							{
							v=(Token)match(input,S_LANGIDSHR,FOLLOW_S_LANGIDSHR_in_options_assign6678); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_LANGIDSHR.add(v);

							}
							break;
						case 6 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:67: S_CURLIB
							{
							v=(Token)match(input,S_CURLIB,FOLLOW_S_CURLIB_in_options_assign6680); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_CURLIB.add(v);

							}
							break;
						case 7 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:76: ( S_LIBL )* Variable
							{
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:76: ( S_LIBL )*
							loop65:
							while (true) {
								int alt65=2;
								int LA65_0 = input.LA(1);
								if ( (LA65_0==S_LIBL) ) {
									alt65=1;
								}

								switch (alt65) {
								case 1 :
									// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:77: S_LIBL
									{
									v=(Token)match(input,S_LIBL,FOLLOW_S_LIBL_in_options_assign6683); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_S_LIBL.add(v);

									}
									break;

								default :
									break loop65;
								}
							}

							v=(Token)match(input,Variable,FOLLOW_Variable_in_options_assign6687); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 669:95: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:669:98: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 24 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:671:4: o= TGTRLS EQUAL v= ( Variable )
					{
					o=(Token)match(input,TGTRLS,FOLLOW_TGTRLS_in_options_assign6709); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TGTRLS.add(o);

					EQUAL152=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6711); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL152);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:671:21: ( Variable )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:671:22: Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_options_assign6716); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 671:31: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:671:34: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 25 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:4: o= TIMFMT EQUAL v= ( S_HMS | S_ISO | S_EUR | S_USA | S_JIS )
					{
					o=(Token)match(input,TIMFMT,FOLLOW_TIMFMT_in_options_assign6738); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMFMT.add(o);

					EQUAL153=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6740); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL153);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:21: ( S_HMS | S_ISO | S_EUR | S_USA | S_JIS )
					int alt67=5;
					switch ( input.LA(1) ) {
					case S_HMS:
						{
						alt67=1;
						}
						break;
					case S_ISO:
						{
						alt67=2;
						}
						break;
					case S_EUR:
						{
						alt67=3;
						}
						break;
					case S_USA:
						{
						alt67=4;
						}
						break;
					case S_JIS:
						{
						alt67=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 67, 0, input);
						throw nvae;
					}
					switch (alt67) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:22: S_HMS
							{
							v=(Token)match(input,S_HMS,FOLLOW_S_HMS_in_options_assign6745); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_HMS.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:28: S_ISO
							{
							v=(Token)match(input,S_ISO,FOLLOW_S_ISO_in_options_assign6747); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_ISO.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:34: S_EUR
							{
							v=(Token)match(input,S_EUR,FOLLOW_S_EUR_in_options_assign6749); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_EUR.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:40: S_USA
							{
							v=(Token)match(input,S_USA,FOLLOW_S_USA_in_options_assign6751); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_USA.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:46: S_JIS
							{
							v=(Token)match(input,S_JIS,FOLLOW_S_JIS_in_options_assign6753); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JIS.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 673:52: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:673:55: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 26 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:4: o= TIMSEP EQUAL v= ( S_JOB | S_COLON | ':' | S_PERIOD | '.' | S_COMMA | ',' | S_BLANK )
					{
					o=(Token)match(input,TIMSEP,FOLLOW_TIMSEP_in_options_assign6775); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMSEP.add(o);

					EQUAL154=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6777); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL154);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:21: ( S_JOB | S_COLON | ':' | S_PERIOD | '.' | S_COMMA | ',' | S_BLANK )
					int alt68=8;
					switch ( input.LA(1) ) {
					case S_JOB:
						{
						alt68=1;
						}
						break;
					case S_COLON:
						{
						alt68=2;
						}
						break;
					case 385:
						{
						alt68=3;
						}
						break;
					case S_PERIOD:
						{
						alt68=4;
						}
						break;
					case DOT:
						{
						alt68=5;
						}
						break;
					case S_COMMA:
						{
						alt68=6;
						}
						break;
					case COMMA:
						{
						alt68=7;
						}
						break;
					case S_BLANK:
						{
						alt68=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);
						throw nvae;
					}
					switch (alt68) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:22: S_JOB
							{
							v=(Token)match(input,S_JOB,FOLLOW_S_JOB_in_options_assign6782); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_JOB.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:28: S_COLON
							{
							v=(Token)match(input,S_COLON,FOLLOW_S_COLON_in_options_assign6784); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_COLON.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:36: ':'
							{
							v=(Token)match(input,385,FOLLOW_385_in_options_assign6786); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_385.add(v);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:40: S_PERIOD
							{
							v=(Token)match(input,S_PERIOD,FOLLOW_S_PERIOD_in_options_assign6788); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_PERIOD.add(v);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:49: '.'
							{
							v=(Token)match(input,DOT,FOLLOW_DOT_in_options_assign6790); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(v);

							}
							break;
						case 6 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:53: S_COMMA
							{
							v=(Token)match(input,S_COMMA,FOLLOW_S_COMMA_in_options_assign6792); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_COMMA.add(v);

							}
							break;
						case 7 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:61: ','
							{
							v=(Token)match(input,COMMA,FOLLOW_COMMA_in_options_assign6794); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(v);

							}
							break;
						case 8 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:65: S_BLANK
							{
							v=(Token)match(input,S_BLANK,FOLLOW_S_BLANK_in_options_assign6796); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_BLANK.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 675:73: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:675:76: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 27 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:677:4: o= USRPRF EQUAL v= ( S_OWNER | S_USER | S_NAMING )
					{
					o=(Token)match(input,USRPRF,FOLLOW_USRPRF_in_options_assign6818); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USRPRF.add(o);

					EQUAL155=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_options_assign6820); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL155);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:677:21: ( S_OWNER | S_USER | S_NAMING )
					int alt69=3;
					switch ( input.LA(1) ) {
					case S_OWNER:
						{
						alt69=1;
						}
						break;
					case S_USER:
						{
						alt69=2;
						}
						break;
					case S_NAMING:
						{
						alt69=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 69, 0, input);
						throw nvae;
					}
					switch (alt69) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:677:22: S_OWNER
							{
							v=(Token)match(input,S_OWNER,FOLLOW_S_OWNER_in_options_assign6825); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_OWNER.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:677:30: S_USER
							{
							v=(Token)match(input,S_USER,FOLLOW_S_USER_in_options_assign6827); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_USER.add(v);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:677:37: S_NAMING
							{
							v=(Token)match(input,S_NAMING,FOLLOW_S_NAMING_in_options_assign6829); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_S_NAMING.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 677:46: -> ^( SET_OPTION[$o.text] $v)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:677:49: ^( SET_OPTION[$o.text] $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_OPTION, (o!=null?o.getText():null)), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, options_assign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "options_assign"


	public static class set_transaction_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_transaction_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:682:2: set_transaction_statement : SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) ;
	public final DBLParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
		DBLParser.set_transaction_statement_return retval = new DBLParser.set_transaction_statement_return();
		retval.start = input.LT(1);
		int set_transaction_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SET156=null;
		Token TRANSACTION157=null;
		Token ISOLATION158=null;
		Token LEVEL159=null;
		Token COMMA160=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope r =null;

		CommonTree SET156_tree=null;
		CommonTree TRANSACTION157_tree=null;
		CommonTree ISOLATION158_tree=null;
		CommonTree LEVEL159_tree=null;
		CommonTree COMMA160_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_ISOLATION=new RewriteRuleTokenStream(adaptor,"token ISOLATION");
		RewriteRuleTokenStream stream_TRANSACTION=new RewriteRuleTokenStream(adaptor,"token TRANSACTION");
		RewriteRuleTokenStream stream_LEVEL=new RewriteRuleTokenStream(adaptor,"token LEVEL");
		RewriteRuleSubtreeStream stream_isolation_level=new RewriteRuleSubtreeStream(adaptor,"rule isolation_level");
		RewriteRuleSubtreeStream stream_read_operation=new RewriteRuleSubtreeStream(adaptor,"rule read_operation");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:683:2: ( SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:684:2: SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )?
			{
			SET156=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement6865); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET156);

			TRANSACTION157=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement6867); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TRANSACTION.add(TRANSACTION157);

			ISOLATION158=(Token)match(input,ISOLATION,FOLLOW_ISOLATION_in_set_transaction_statement6869); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ISOLATION.add(ISOLATION158);

			LEVEL159=(Token)match(input,LEVEL,FOLLOW_LEVEL_in_set_transaction_statement6871); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEVEL.add(LEVEL159);

			pushFollow(FOLLOW_isolation_level_in_set_transaction_statement6875);
			i=isolation_level();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_isolation_level.add(i.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:684:52: ( COMMA r= read_operation )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==COMMA) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:684:53: COMMA r= read_operation
					{
					COMMA160=(Token)match(input,COMMA,FOLLOW_COMMA_in_set_transaction_statement6878); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA160);

					pushFollow(FOLLOW_read_operation_in_set_transaction_statement6882);
					r=read_operation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_read_operation.add(r.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: r, i
			// token labels: 
			// rule labels: r, i, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 684:78: -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:686:2: ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_TRANSACTION_STATEMENT, "SET_TRANSACTION_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:686:30: ^( ISOLATION_LEVEL $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ISOLATION_LEVEL, "ISOLATION_LEVEL"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:686:52: ( ^( RW_OPERATION $r) )?
				if ( stream_r.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:686:53: ^( RW_OPERATION $r)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RW_OPERATION, "RW_OPERATION"), root_2);
					adaptor.addChild(root_2, stream_r.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_r.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, set_transaction_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_transaction_statement"


	public static class isolation_level_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "isolation_level"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:689:1: isolation_level : ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read );
	public final DBLParser.isolation_level_return isolation_level() throws RecognitionException {
		DBLParser.isolation_level_return retval = new DBLParser.isolation_level_return();
		retval.start = input.LT(1);
		int isolation_level_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SERIALIZABLE161=null;
		ParserRuleReturnScope no_commit162 =null;
		ParserRuleReturnScope read_uncommitted163 =null;
		ParserRuleReturnScope read_committed164 =null;
		ParserRuleReturnScope repeatable_read165 =null;

		CommonTree SERIALIZABLE161_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:690:2: ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read )
			int alt72=5;
			switch ( input.LA(1) ) {
			case SERIALIZABLE:
				{
				alt72=1;
				}
				break;
			case NO:
				{
				alt72=2;
				}
				break;
			case READ:
				{
				int LA72_3 = input.LA(2);
				if ( (LA72_3==UNCOMMITTED) ) {
					alt72=3;
				}
				else if ( (LA72_3==COMMITTED) ) {
					alt72=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case REPEATABLE:
				{
				alt72=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:691:2: SERIALIZABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					SERIALIZABLE161=(Token)match(input,SERIALIZABLE,FOLLOW_SERIALIZABLE_in_isolation_level6924); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SERIALIZABLE161_tree = (CommonTree)adaptor.create(SERIALIZABLE161);
					adaptor.addChild(root_0, SERIALIZABLE161_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:693:2: no_commit
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_no_commit_in_isolation_level6930);
					no_commit162=no_commit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, no_commit162.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:695:2: read_uncommitted
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_uncommitted_in_isolation_level6936);
					read_uncommitted163=read_uncommitted();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_uncommitted163.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:697:2: read_committed
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_committed_in_isolation_level6942);
					read_committed164=read_committed();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_committed164.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:699:2: repeatable_read
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repeatable_read_in_isolation_level6948);
					repeatable_read165=repeatable_read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatable_read165.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, isolation_level_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "isolation_level"


	public static class no_commit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "no_commit"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:702:1: no_commit : NO COMMIT -> ^( NO_COMMIT ) ;
	public final DBLParser.no_commit_return no_commit() throws RecognitionException {
		DBLParser.no_commit_return retval = new DBLParser.no_commit_return();
		retval.start = input.LT(1);
		int no_commit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NO166=null;
		Token COMMIT167=null;

		CommonTree NO166_tree=null;
		CommonTree COMMIT167_tree=null;
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:703:2: ( NO COMMIT -> ^( NO_COMMIT ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:704:2: NO COMMIT
			{
			NO166=(Token)match(input,NO,FOLLOW_NO_in_no_commit6962); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NO.add(NO166);

			COMMIT167=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_no_commit6964); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMIT.add(COMMIT167);

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
			// 704:12: -> ^( NO_COMMIT )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:704:15: ^( NO_COMMIT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NO_COMMIT, "NO_COMMIT"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, no_commit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "no_commit"


	public static class read_uncommitted_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_uncommitted"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:707:1: read_uncommitted : READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) ;
	public final DBLParser.read_uncommitted_return read_uncommitted() throws RecognitionException {
		DBLParser.read_uncommitted_return retval = new DBLParser.read_uncommitted_return();
		retval.start = input.LT(1);
		int read_uncommitted_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ168=null;
		Token UNCOMMITTED169=null;

		CommonTree READ168_tree=null;
		CommonTree UNCOMMITTED169_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_UNCOMMITTED=new RewriteRuleTokenStream(adaptor,"token UNCOMMITTED");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:708:2: ( READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:709:2: READ UNCOMMITTED
			{
			READ168=(Token)match(input,READ,FOLLOW_READ_in_read_uncommitted6987); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ168);

			UNCOMMITTED169=(Token)match(input,UNCOMMITTED,FOLLOW_UNCOMMITTED_in_read_uncommitted6989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNCOMMITTED.add(UNCOMMITTED169);

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
			// 709:19: -> ^( READ_UNCOMMITTED )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:709:22: ^( READ_UNCOMMITTED )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_UNCOMMITTED, "READ_UNCOMMITTED"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, read_uncommitted_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_uncommitted"


	public static class read_committed_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_committed"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:712:1: read_committed : READ COMMITTED -> ^( READ_COMMITTED ) ;
	public final DBLParser.read_committed_return read_committed() throws RecognitionException {
		DBLParser.read_committed_return retval = new DBLParser.read_committed_return();
		retval.start = input.LT(1);
		int read_committed_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ170=null;
		Token COMMITTED171=null;

		CommonTree READ170_tree=null;
		CommonTree COMMITTED171_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_COMMITTED=new RewriteRuleTokenStream(adaptor,"token COMMITTED");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:713:2: ( READ COMMITTED -> ^( READ_COMMITTED ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:714:2: READ COMMITTED
			{
			READ170=(Token)match(input,READ,FOLLOW_READ_in_read_committed7008); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ170);

			COMMITTED171=(Token)match(input,COMMITTED,FOLLOW_COMMITTED_in_read_committed7010); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMITTED.add(COMMITTED171);

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
			// 714:17: -> ^( READ_COMMITTED )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:714:20: ^( READ_COMMITTED )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_COMMITTED, "READ_COMMITTED"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, read_committed_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_committed"


	public static class repeatable_read_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "repeatable_read"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:717:1: repeatable_read : REPEATABLE READ -> ^( REPEATABLE_READ ) ;
	public final DBLParser.repeatable_read_return repeatable_read() throws RecognitionException {
		DBLParser.repeatable_read_return retval = new DBLParser.repeatable_read_return();
		retval.start = input.LT(1);
		int repeatable_read_StartIndex = input.index();

		CommonTree root_0 = null;

		Token REPEATABLE172=null;
		Token READ173=null;

		CommonTree REPEATABLE172_tree=null;
		CommonTree READ173_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_REPEATABLE=new RewriteRuleTokenStream(adaptor,"token REPEATABLE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:718:2: ( REPEATABLE READ -> ^( REPEATABLE_READ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:719:2: REPEATABLE READ
			{
			REPEATABLE172=(Token)match(input,REPEATABLE,FOLLOW_REPEATABLE_in_repeatable_read7031); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPEATABLE.add(REPEATABLE172);

			READ173=(Token)match(input,READ,FOLLOW_READ_in_repeatable_read7033); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ173);

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
			// 719:18: -> ^( REPEATABLE_READ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:719:21: ^( REPEATABLE_READ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPEATABLE_READ, "REPEATABLE_READ"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, repeatable_read_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "repeatable_read"


	public static class read_operation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_operation"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:722:1: read_operation : ( read_only | read_write );
	public final DBLParser.read_operation_return read_operation() throws RecognitionException {
		DBLParser.read_operation_return retval = new DBLParser.read_operation_return();
		retval.start = input.LT(1);
		int read_operation_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope read_only174 =null;
		ParserRuleReturnScope read_write175 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:723:2: ( read_only | read_write )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==READ) ) {
				int LA73_1 = input.LA(2);
				if ( (LA73_1==ONLY) ) {
					alt73=1;
				}
				else if ( (LA73_1==WRITE) ) {
					alt73=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:724:2: read_only
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_only_in_read_operation7052);
					read_only174=read_only();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_only174.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:726:2: read_write
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_write_in_read_operation7058);
					read_write175=read_write();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_write175.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, read_operation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_operation"


	public static class read_only_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_only"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:729:1: read_only : READ ONLY -> ^( READ_ONLY ) ;
	public final DBLParser.read_only_return read_only() throws RecognitionException {
		DBLParser.read_only_return retval = new DBLParser.read_only_return();
		retval.start = input.LT(1);
		int read_only_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ176=null;
		Token ONLY177=null;

		CommonTree READ176_tree=null;
		CommonTree ONLY177_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_ONLY=new RewriteRuleTokenStream(adaptor,"token ONLY");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:730:2: ( READ ONLY -> ^( READ_ONLY ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:731:2: READ ONLY
			{
			READ176=(Token)match(input,READ,FOLLOW_READ_in_read_only7071); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ176);

			ONLY177=(Token)match(input,ONLY,FOLLOW_ONLY_in_read_only7073); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ONLY.add(ONLY177);

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
			// 731:12: -> ^( READ_ONLY )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:731:15: ^( READ_ONLY )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_ONLY, "READ_ONLY"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, read_only_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_only"


	public static class read_write_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_write"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:734:1: read_write : READ WRITE -> ^( READ_WRITE ) ;
	public final DBLParser.read_write_return read_write() throws RecognitionException {
		DBLParser.read_write_return retval = new DBLParser.read_write_return();
		retval.start = input.LT(1);
		int read_write_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ178=null;
		Token WRITE179=null;

		CommonTree READ178_tree=null;
		CommonTree WRITE179_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:735:2: ( READ WRITE -> ^( READ_WRITE ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:736:2: READ WRITE
			{
			READ178=(Token)match(input,READ,FOLLOW_READ_in_read_write7093); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ178);

			WRITE179=(Token)match(input,WRITE,FOLLOW_WRITE_in_read_write7095); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WRITE.add(WRITE179);

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
			// 736:13: -> ^( READ_WRITE )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:736:16: ^( READ_WRITE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_WRITE, "READ_WRITE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, read_write_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_write"


	public static class execute_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "execute_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:742:2: execute_statement : EXECUTE s= Identifier -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) ) ;
	public final DBLParser.execute_statement_return execute_statement() throws RecognitionException {
		DBLParser.execute_statement_return retval = new DBLParser.execute_statement_return();
		retval.start = input.LT(1);
		int execute_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token EXECUTE180=null;

		CommonTree s_tree=null;
		CommonTree EXECUTE180_tree=null;
		RewriteRuleTokenStream stream_EXECUTE=new RewriteRuleTokenStream(adaptor,"token EXECUTE");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:743:3: ( EXECUTE s= Identifier -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:744:3: EXECUTE s= Identifier
			{
			EXECUTE180=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_statement7126); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXECUTE.add(EXECUTE180);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_execute_statement7130); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 744:24: -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:744:27: ^( EXECUTE_STATEMENT ^( STATEMENT $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE_STATEMENT, "EXECUTE_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:744:47: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, execute_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "execute_statement"


	public static class execute_immediate_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "execute_immediate_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:747:1: execute_immediate_statement : EXECUTE IMMEDIATE v= Variable -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) ) ;
	public final DBLParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
		DBLParser.execute_immediate_statement_return retval = new DBLParser.execute_immediate_statement_return();
		retval.start = input.LT(1);
		int execute_immediate_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token EXECUTE181=null;
		Token IMMEDIATE182=null;

		CommonTree v_tree=null;
		CommonTree EXECUTE181_tree=null;
		CommonTree IMMEDIATE182_tree=null;
		RewriteRuleTokenStream stream_EXECUTE=new RewriteRuleTokenStream(adaptor,"token EXECUTE");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_IMMEDIATE=new RewriteRuleTokenStream(adaptor,"token IMMEDIATE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:748:3: ( EXECUTE IMMEDIATE v= Variable -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:749:3: EXECUTE IMMEDIATE v= Variable
			{
			EXECUTE181=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement7169); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXECUTE.add(EXECUTE181);

			IMMEDIATE182=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement7171); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IMMEDIATE.add(IMMEDIATE182);

			v=(Token)match(input,Variable,FOLLOW_Variable_in_execute_immediate_statement7175); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(v);

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 749:32: -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:749:35: ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE_IMMEDIATE_STATEMENT, "EXECUTE_IMMEDIATE_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:749:65: ^( VARIABLE $v)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_v.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, execute_immediate_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "execute_immediate_statement"


	public static class open_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "open_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:754:2: open_statement : OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )? -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) ) -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) ) -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) ) -> ^( OPEN_STATEMENT ^( CURSOR $c) ) ;
	public final DBLParser.open_statement_return open_statement() throws RecognitionException {
		DBLParser.open_statement_return retval = new DBLParser.open_statement_return();
		retval.start = input.LT(1);
		int open_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token v1=null;
		Token v2=null;
		Token d=null;
		Token OPEN183=null;
		Token USING184=null;
		Token USING185=null;
		Token DESCRIPTOR186=null;

		CommonTree c_tree=null;
		CommonTree v1_tree=null;
		CommonTree v2_tree=null;
		CommonTree d_tree=null;
		CommonTree OPEN183_tree=null;
		CommonTree USING184_tree=null;
		CommonTree USING185_tree=null;
		CommonTree DESCRIPTOR186_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token DESCRIPTOR");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:755:3: ( OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )? -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) ) -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) ) -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) ) -> ^( OPEN_STATEMENT ^( CURSOR $c) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:3: OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )?
			{
			OPEN183=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement7210); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPEN.add(OPEN183);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_open_statement7214); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:21: ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )?
			int alt75=3;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==USING) ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1==Variable) ) {
					alt75=1;
				}
				else if ( (LA75_1==DESCRIPTOR) ) {
					alt75=2;
				}
			}
			switch (alt75) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:22: ( USING v1= Variable )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:22: ( USING v1= Variable )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:23: USING v1= Variable
					{
					USING184=(Token)match(input,USING,FOLLOW_USING_in_open_statement7218); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING184);

					v1=(Token)match(input,Variable,FOLLOW_Variable_in_open_statement7222); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v1);

					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:42: ( USING DESCRIPTOR (v2= Variable |d= Identifier ) )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:42: ( USING DESCRIPTOR (v2= Variable |d= Identifier ) )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:43: USING DESCRIPTOR (v2= Variable |d= Identifier )
					{
					USING185=(Token)match(input,USING,FOLLOW_USING_in_open_statement7226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING185);

					DESCRIPTOR186=(Token)match(input,DESCRIPTOR,FOLLOW_DESCRIPTOR_in_open_statement7228); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESCRIPTOR.add(DESCRIPTOR186);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:60: (v2= Variable |d= Identifier )
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==Variable) ) {
						alt74=1;
					}
					else if ( (LA74_0==Identifier) ) {
						alt74=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 74, 0, input);
						throw nvae;
					}

					switch (alt74) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:61: v2= Variable
							{
							v2=(Token)match(input,Variable,FOLLOW_Variable_in_open_statement7233); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v2);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:73: d= Identifier
							{
							d=(Token)match(input,Identifier,FOLLOW_Identifier_in_open_statement7237); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(d);

							}
							break;

					}

					}

					}
					break;

			}

			// AST REWRITE
			// elements: d, c, c, v1, DESCRIPTOR, c, v2, c, USING
			// token labels: c, d, v1, v2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleTokenStream stream_v1=new RewriteRuleTokenStream(adaptor,"token v1",v1);
			RewriteRuleTokenStream stream_v2=new RewriteRuleTokenStream(adaptor,"token v2",v2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 756:91: -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) )
			if (v1 != null) {
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:109: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:126: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:139: ^( USING ^( VARIABLE $v1) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:756:147: ^( VARIABLE $v1)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v1.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 757:14: -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) )
			if (v2 != null) {
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:757:32: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:757:49: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:757:62: ^( USING_DESCRIPTOR ^( VARIABLE $v2) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING_DESCRIPTOR, "USING_DESCRIPTOR"), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:757:81: ^( VARIABLE $v2)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v2.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 758:14: -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) )
			if (d != null) {
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:758:31: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:758:48: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:758:62: ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING_DESCRIPTOR, "USING_DESCRIPTOR"), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:758:81: ^( DESCRIPTOR $d)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_DESCRIPTOR.nextNode(), root_3);
				adaptor.addChild(root_3, stream_d.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 759:14: -> ^( OPEN_STATEMENT ^( CURSOR $c) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:759:17: ^( OPEN_STATEMENT ^( CURSOR $c) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:759:34: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, open_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "open_statement"


	public static class prepare_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prepare_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:764:2: prepare_statement : PREPARE s= Identifier ( into_clause )? FROM v= Variable -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) ) ;
	public final DBLParser.prepare_statement_return prepare_statement() throws RecognitionException {
		DBLParser.prepare_statement_return retval = new DBLParser.prepare_statement_return();
		retval.start = input.LT(1);
		int prepare_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token v=null;
		Token PREPARE187=null;
		Token FROM189=null;
		ParserRuleReturnScope into_clause188 =null;

		CommonTree s_tree=null;
		CommonTree v_tree=null;
		CommonTree PREPARE187_tree=null;
		CommonTree FROM189_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_PREPARE=new RewriteRuleTokenStream(adaptor,"token PREPARE");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleSubtreeStream stream_into_clause=new RewriteRuleSubtreeStream(adaptor,"rule into_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:765:3: ( PREPARE s= Identifier ( into_clause )? FROM v= Variable -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:3: PREPARE s= Identifier ( into_clause )? FROM v= Variable
			{
			PREPARE187=(Token)match(input,PREPARE,FOLLOW_PREPARE_in_prepare_statement7408); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PREPARE.add(PREPARE187);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_prepare_statement7412); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:24: ( into_clause )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==INTO) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:25: into_clause
					{
					pushFollow(FOLLOW_into_clause_in_prepare_statement7415);
					into_clause188=into_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_into_clause.add(into_clause188.getTree());
					}
					break;

			}

			FROM189=(Token)match(input,FROM,FOLLOW_FROM_in_prepare_statement7419); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FROM.add(FROM189);

			v=(Token)match(input,Variable,FOLLOW_Variable_in_prepare_statement7423); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(v);

			// AST REWRITE
			// elements: into_clause, s, FROM, v
			// token labels: s, v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 766:55: -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:58: ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREPARE_STATEMENT, "PREPARE_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:78: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:94: ( into_clause )?
				if ( stream_into_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_into_clause.nextTree());
				}
				stream_into_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:109: ^( FROM ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:766:116: ^( VARIABLE $v)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, prepare_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prepare_statement"


	public static class declare_cursor_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declare_cursor_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:770:2: declare_cursor_statement : DECLARE c= Identifier (d= DYNAMIC )? (sc= scroll )? CURSOR (h= hold )? FOR s= Identifier -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) ) ;
	public final DBLParser.declare_cursor_statement_return declare_cursor_statement() throws RecognitionException {
		DBLParser.declare_cursor_statement_return retval = new DBLParser.declare_cursor_statement_return();
		retval.start = input.LT(1);
		int declare_cursor_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token d=null;
		Token s=null;
		Token DECLARE190=null;
		Token CURSOR191=null;
		Token FOR192=null;
		ParserRuleReturnScope sc =null;
		ParserRuleReturnScope h =null;

		CommonTree c_tree=null;
		CommonTree d_tree=null;
		CommonTree s_tree=null;
		CommonTree DECLARE190_tree=null;
		CommonTree CURSOR191_tree=null;
		CommonTree FOR192_tree=null;
		RewriteRuleTokenStream stream_DECLARE=new RewriteRuleTokenStream(adaptor,"token DECLARE");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_DYNAMIC=new RewriteRuleTokenStream(adaptor,"token DYNAMIC");
		RewriteRuleTokenStream stream_CURSOR=new RewriteRuleTokenStream(adaptor,"token CURSOR");
		RewriteRuleSubtreeStream stream_scroll=new RewriteRuleSubtreeStream(adaptor,"rule scroll");
		RewriteRuleSubtreeStream stream_hold=new RewriteRuleSubtreeStream(adaptor,"rule hold");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:771:3: ( DECLARE c= Identifier (d= DYNAMIC )? (sc= scroll )? CURSOR (h= hold )? FOR s= Identifier -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:3: DECLARE c= Identifier (d= DYNAMIC )? (sc= scroll )? CURSOR (h= hold )? FOR s= Identifier
			{
			DECLARE190=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declare_cursor_statement7473); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DECLARE.add(DECLARE190);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_declare_cursor_statement7477); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:24: (d= DYNAMIC )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DYNAMIC) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:25: d= DYNAMIC
					{
					d=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declare_cursor_statement7482); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DYNAMIC.add(d);

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:37: (sc= scroll )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==NO||LA78_0==SCROLL) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:38: sc= scroll
					{
					pushFollow(FOLLOW_scroll_in_declare_cursor_statement7489);
					sc=scroll();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scroll.add(sc.getTree());
					}
					break;

			}

			CURSOR191=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_declare_cursor_statement7493); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CURSOR.add(CURSOR191);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:57: (h= hold )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( ((LA79_0 >= WITH && LA79_0 <= WITHOUT)) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:772:58: h= hold
					{
					pushFollow(FOLLOW_hold_in_declare_cursor_statement7498);
					h=hold();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hold.add(h.getTree());
					}
					break;

			}

			FOR192=(Token)match(input,FOR,FOLLOW_FOR_in_declare_cursor_statement7502); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR192);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_declare_cursor_statement7506); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: FOR, CURSOR, s, c, h, d, sc
			// token labels: s, c, d
			// rule labels: sc, h, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleSubtreeStream stream_sc=new RewriteRuleSubtreeStream(adaptor,"rule sc",sc!=null?sc.getTree():null);
			RewriteRuleSubtreeStream stream_h=new RewriteRuleSubtreeStream(adaptor,"rule h",h!=null?h.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 773:3: -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:6: ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_CURSOR_STATEMENT, "DECLARE_CURSOR_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:33: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_CURSOR.nextNode(), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:46: ( $d)?
				if ( stream_d.hasNext() ) {
					adaptor.addChild(root_1, stream_d.nextNode());
				}
				stream_d.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:52: ( $sc)?
				if ( stream_sc.hasNext() ) {
					adaptor.addChild(root_1, stream_sc.nextTree());
				}
				stream_sc.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:59: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextTree());
				}
				stream_h.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:65: ^( FOR ^( STATEMENT $s) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:773:71: ^( STATEMENT $s)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_3);
				adaptor.addChild(root_3, stream_s.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, declare_cursor_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "declare_cursor_statement"


	public static class scroll_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "scroll"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:776:1: scroll : ( SCROLL -> ^( SCROLL ) | NO SCROLL -> ^( NO_SCROLL ) );
	public final DBLParser.scroll_return scroll() throws RecognitionException {
		DBLParser.scroll_return retval = new DBLParser.scroll_return();
		retval.start = input.LT(1);
		int scroll_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SCROLL193=null;
		Token NO194=null;
		Token SCROLL195=null;

		CommonTree SCROLL193_tree=null;
		CommonTree NO194_tree=null;
		CommonTree SCROLL195_tree=null;
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");
		RewriteRuleTokenStream stream_SCROLL=new RewriteRuleTokenStream(adaptor,"token SCROLL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:777:2: ( SCROLL -> ^( SCROLL ) | NO SCROLL -> ^( NO_SCROLL ) )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==SCROLL) ) {
				alt80=1;
			}
			else if ( (LA80_0==NO) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:778:2: SCROLL
					{
					SCROLL193=(Token)match(input,SCROLL,FOLLOW_SCROLL_in_scroll7566); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCROLL.add(SCROLL193);

					// AST REWRITE
					// elements: SCROLL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 778:9: -> ^( SCROLL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:778:12: ^( SCROLL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SCROLL.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:780:2: NO SCROLL
					{
					NO194=(Token)match(input,NO,FOLLOW_NO_in_scroll7578); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NO.add(NO194);

					SCROLL195=(Token)match(input,SCROLL,FOLLOW_SCROLL_in_scroll7580); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCROLL.add(SCROLL195);

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
					// 780:12: -> ^( NO_SCROLL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:780:15: ^( NO_SCROLL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NO_SCROLL, "NO_SCROLL"), root_1);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, scroll_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "scroll"


	public static class hold_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hold"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:783:1: hold : ( WITH HOLD -> ^( WITH_HOLD ) | WITHOUT HOLD -> ^( WITHOUT_HOLD ) );
	public final DBLParser.hold_return hold() throws RecognitionException {
		DBLParser.hold_return retval = new DBLParser.hold_return();
		retval.start = input.LT(1);
		int hold_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH196=null;
		Token HOLD197=null;
		Token WITHOUT198=null;
		Token HOLD199=null;

		CommonTree WITH196_tree=null;
		CommonTree HOLD197_tree=null;
		CommonTree WITHOUT198_tree=null;
		CommonTree HOLD199_tree=null;
		RewriteRuleTokenStream stream_WITHOUT=new RewriteRuleTokenStream(adaptor,"token WITHOUT");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:784:2: ( WITH HOLD -> ^( WITH_HOLD ) | WITHOUT HOLD -> ^( WITHOUT_HOLD ) )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==WITH) ) {
				alt81=1;
			}
			else if ( (LA81_0==WITHOUT) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:785:2: WITH HOLD
					{
					WITH196=(Token)match(input,WITH,FOLLOW_WITH_in_hold7600); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH196);

					HOLD197=(Token)match(input,HOLD,FOLLOW_HOLD_in_hold7602); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(HOLD197);

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
					// 785:12: -> ^( WITH_HOLD )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:785:15: ^( WITH_HOLD )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH_HOLD, "WITH_HOLD"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:787:2: WITHOUT HOLD
					{
					WITHOUT198=(Token)match(input,WITHOUT,FOLLOW_WITHOUT_in_hold7615); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITHOUT.add(WITHOUT198);

					HOLD199=(Token)match(input,HOLD,FOLLOW_HOLD_in_hold7617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(HOLD199);

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
					// 787:15: -> ^( WITHOUT_HOLD )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:787:18: ^( WITHOUT_HOLD )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITHOUT_HOLD, "WITHOUT_HOLD"), root_1);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, hold_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "hold"


	public static class describe_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "describe_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:791:2: describe_statement : DESCRIBE s= Identifier into_clause -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause ) ;
	public final DBLParser.describe_statement_return describe_statement() throws RecognitionException {
		DBLParser.describe_statement_return retval = new DBLParser.describe_statement_return();
		retval.start = input.LT(1);
		int describe_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token DESCRIBE200=null;
		ParserRuleReturnScope into_clause201 =null;

		CommonTree s_tree=null;
		CommonTree DESCRIBE200_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
		RewriteRuleSubtreeStream stream_into_clause=new RewriteRuleSubtreeStream(adaptor,"rule into_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:792:3: ( DESCRIBE s= Identifier into_clause -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:793:3: DESCRIBE s= Identifier into_clause
			{
			DESCRIBE200=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describe_statement7644); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE200);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_describe_statement7648); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			pushFollow(FOLLOW_into_clause_in_describe_statement7650);
			into_clause201=into_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_into_clause.add(into_clause201.getTree());
			// AST REWRITE
			// elements: s, into_clause
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 793:37: -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:793:39: ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DESCRIBE_STATEMENT, "DESCRIBE_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:793:60: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_into_clause.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, describe_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "describe_statement"


	public static class fetch_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fetch_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:796:2: fetch_statement : FETCH ( fetch_position )? ( FROM )? c= Identifier ( fetch_into )? -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? ) ;
	public final DBLParser.fetch_statement_return fetch_statement() throws RecognitionException {
		DBLParser.fetch_statement_return retval = new DBLParser.fetch_statement_return();
		retval.start = input.LT(1);
		int fetch_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token FETCH202=null;
		Token FROM204=null;
		ParserRuleReturnScope fetch_position203 =null;
		ParserRuleReturnScope fetch_into205 =null;

		CommonTree c_tree=null;
		CommonTree FETCH202_tree=null;
		CommonTree FROM204_tree=null;
		RewriteRuleTokenStream stream_FETCH=new RewriteRuleTokenStream(adaptor,"token FETCH");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleSubtreeStream stream_fetch_position=new RewriteRuleSubtreeStream(adaptor,"rule fetch_position");
		RewriteRuleSubtreeStream stream_fetch_into=new RewriteRuleSubtreeStream(adaptor,"rule fetch_into");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:797:3: ( FETCH ( fetch_position )? ( FROM )? c= Identifier ( fetch_into )? -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:3: FETCH ( fetch_position )? ( FROM )? c= Identifier ( fetch_into )?
			{
			FETCH202=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement7682); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FETCH.add(FETCH202);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:9: ( fetch_position )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==AFTER||LA82_0==BEFORE||LA82_0==CURRENT||LA82_0==FIRST||LA82_0==LAST||LA82_0==NEXT||LA82_0==PRIOR||LA82_0==RELATIVE) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:10: fetch_position
					{
					pushFollow(FOLLOW_fetch_position_in_fetch_statement7685);
					fetch_position203=fetch_position();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fetch_position.add(fetch_position203.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:27: ( FROM )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==FROM) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:28: FROM
					{
					FROM204=(Token)match(input,FROM,FOLLOW_FROM_in_fetch_statement7690); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FROM.add(FROM204);

					}
					break;

			}

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_fetch_statement7696); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:48: ( fetch_into )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==FOR||LA84_0==INTO) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:49: fetch_into
					{
					pushFollow(FOLLOW_fetch_into_in_fetch_statement7699);
					fetch_into205=fetch_into();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fetch_into.add(fetch_into205.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: fetch_position, c, fetch_into
			// token labels: c
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 798:62: -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:65: ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_STATEMENT, "FETCH_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:83: ( fetch_position )?
				if ( stream_fetch_position.hasNext() ) {
					adaptor.addChild(root_1, stream_fetch_position.nextTree());
				}
				stream_fetch_position.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:101: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:798:114: ( fetch_into )?
				if ( stream_fetch_into.hasNext() ) {
					adaptor.addChild(root_1, stream_fetch_into.nextTree());
				}
				stream_fetch_into.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, fetch_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fetch_statement"


	public static class fetch_position_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fetch_position"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:801:2: fetch_position : (p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT ) -> ^( FETCH_POSITION $p) | RELATIVE (v= Variable |i= NUMBER ) -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) ) -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) ) );
	public final DBLParser.fetch_position_return fetch_position() throws RecognitionException {
		DBLParser.fetch_position_return retval = new DBLParser.fetch_position_return();
		retval.start = input.LT(1);
		int fetch_position_StartIndex = input.index();

		CommonTree root_0 = null;

		Token p=null;
		Token v=null;
		Token i=null;
		Token RELATIVE206=null;

		CommonTree p_tree=null;
		CommonTree v_tree=null;
		CommonTree i_tree=null;
		CommonTree RELATIVE206_tree=null;
		RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_RELATIVE=new RewriteRuleTokenStream(adaptor,"token RELATIVE");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_PRIOR=new RewriteRuleTokenStream(adaptor,"token PRIOR");
		RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");
		RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:3: (p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT ) -> ^( FETCH_POSITION $p) | RELATIVE (v= Variable |i= NUMBER ) -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) ) -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) ) )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==AFTER||LA87_0==BEFORE||LA87_0==CURRENT||LA87_0==FIRST||LA87_0==LAST||LA87_0==NEXT||LA87_0==PRIOR) ) {
				alt87=1;
			}
			else if ( (LA87_0==RELATIVE) ) {
				alt87=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:5: p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT )
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:8: ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT )
					int alt85=7;
					switch ( input.LA(1) ) {
					case NEXT:
						{
						alt85=1;
						}
						break;
					case PRIOR:
						{
						alt85=2;
						}
						break;
					case FIRST:
						{
						alt85=3;
						}
						break;
					case LAST:
						{
						alt85=4;
						}
						break;
					case BEFORE:
						{
						alt85=5;
						}
						break;
					case AFTER:
						{
						alt85=6;
						}
						break;
					case CURRENT:
						{
						alt85=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 85, 0, input);
						throw nvae;
					}
					switch (alt85) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:9: NEXT
							{
							p=(Token)match(input,NEXT,FOLLOW_NEXT_in_fetch_position7744); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEXT.add(p);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:14: PRIOR
							{
							p=(Token)match(input,PRIOR,FOLLOW_PRIOR_in_fetch_position7746); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_PRIOR.add(p);

							}
							break;
						case 3 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:20: FIRST
							{
							p=(Token)match(input,FIRST,FOLLOW_FIRST_in_fetch_position7748); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIRST.add(p);

							}
							break;
						case 4 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:26: LAST
							{
							p=(Token)match(input,LAST,FOLLOW_LAST_in_fetch_position7750); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LAST.add(p);

							}
							break;
						case 5 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:31: BEFORE
							{
							p=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_fetch_position7752); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_BEFORE.add(p);

							}
							break;
						case 6 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:38: AFTER
							{
							p=(Token)match(input,AFTER,FOLLOW_AFTER_in_fetch_position7754); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AFTER.add(p);

							}
							break;
						case 7 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:44: CURRENT
							{
							p=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_fetch_position7756); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_CURRENT.add(p);

							}
							break;

					}

					// AST REWRITE
					// elements: p
					// token labels: p
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 802:53: -> ^( FETCH_POSITION $p)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:802:56: ^( FETCH_POSITION $p)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						adaptor.addChild(root_1, stream_p.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:4: RELATIVE (v= Variable |i= NUMBER )
					{
					RELATIVE206=(Token)match(input,RELATIVE,FOLLOW_RELATIVE_in_fetch_position7776); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELATIVE.add(RELATIVE206);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:13: (v= Variable |i= NUMBER )
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==Variable) ) {
						alt86=1;
					}
					else if ( (LA86_0==NUMBER) ) {
						alt86=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 86, 0, input);
						throw nvae;
					}

					switch (alt86) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:14: v= Variable
							{
							v=(Token)match(input,Variable,FOLLOW_Variable_in_fetch_position7781); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;
						case 2 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:25: i= NUMBER
							{
							i=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fetch_position7785); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NUMBER.add(i);

							}
							break;

					}

					// AST REWRITE
					// elements: RELATIVE, v, NUMBER, RELATIVE
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 804:35: -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) )
					if (v != null) {
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:51: ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:68: ^( RELATIVE ^( VARIABLE $v) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE.nextNode(), root_2);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:804:79: ^( VARIABLE $v)
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
						adaptor.addChild(root_3, stream_v.nextNode());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 805:14: -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:805:25: ^( FETCH_POSITION ^( RELATIVE NUMBER ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:805:42: ^( RELATIVE NUMBER )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE.nextNode(), root_2);
						adaptor.addChild(root_2, stream_NUMBER.nextNode());
						adaptor.addChild(root_1, root_2);
						}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, fetch_position_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fetch_position"


	public static class fetch_into_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fetch_into"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:808:2: fetch_into : ( single_fetch | multiple_row_fetch );
	public final DBLParser.fetch_into_return fetch_into() throws RecognitionException {
		DBLParser.fetch_into_return retval = new DBLParser.fetch_into_return();
		retval.start = input.LT(1);
		int fetch_into_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope single_fetch207 =null;
		ParserRuleReturnScope multiple_row_fetch208 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:809:3: ( single_fetch | multiple_row_fetch )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==INTO) ) {
				alt88=1;
			}
			else if ( (LA88_0==FOR) ) {
				alt88=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:810:3: single_fetch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_single_fetch_in_fetch_into7855);
					single_fetch207=single_fetch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_fetch207.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:812:3: multiple_row_fetch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_multiple_row_fetch_in_fetch_into7863);
					multiple_row_fetch208=multiple_row_fetch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiple_row_fetch208.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, fetch_into_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fetch_into"


	public static class single_fetch_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "single_fetch"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:815:2: single_fetch : INTO into_variable ( ',' into_variable )* -> ^( SINGLE_FETCH ^( INTO into_variable ( into_variable )* ) ) ;
	public final DBLParser.single_fetch_return single_fetch() throws RecognitionException {
		DBLParser.single_fetch_return retval = new DBLParser.single_fetch_return();
		retval.start = input.LT(1);
		int single_fetch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTO209=null;
		Token char_literal211=null;
		ParserRuleReturnScope into_variable210 =null;
		ParserRuleReturnScope into_variable212 =null;

		CommonTree INTO209_tree=null;
		CommonTree char_literal211_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleSubtreeStream stream_into_variable=new RewriteRuleSubtreeStream(adaptor,"rule into_variable");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:816:3: ( INTO into_variable ( ',' into_variable )* -> ^( SINGLE_FETCH ^( INTO into_variable ( into_variable )* ) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:817:3: INTO into_variable ( ',' into_variable )*
			{
			INTO209=(Token)match(input,INTO,FOLLOW_INTO_in_single_fetch7882); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO209);

			pushFollow(FOLLOW_into_variable_in_single_fetch7884);
			into_variable210=into_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_into_variable.add(into_variable210.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:817:23: ( ',' into_variable )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==COMMA) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:817:24: ',' into_variable
					{
					char_literal211=(Token)match(input,COMMA,FOLLOW_COMMA_in_single_fetch7888); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(char_literal211);

					pushFollow(FOLLOW_into_variable_in_single_fetch7890);
					into_variable212=into_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_into_variable.add(into_variable212.getTree());
					}
					break;

				default :
					break loop89;
				}
			}

			// AST REWRITE
			// elements: into_variable, INTO, into_variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 817:44: -> ^( SINGLE_FETCH ^( INTO into_variable ( into_variable )* ) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:817:47: ^( SINGLE_FETCH ^( INTO into_variable ( into_variable )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SINGLE_FETCH, "SINGLE_FETCH"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:817:62: ^( INTO into_variable ( into_variable )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				adaptor.addChild(root_2, stream_into_variable.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:817:83: ( into_variable )*
				while ( stream_into_variable.hasNext() ) {
					adaptor.addChild(root_2, stream_into_variable.nextTree());
				}
				stream_into_variable.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, single_fetch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "single_fetch"


	public static class into_variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "into_variable"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:820:2: into_variable : v= Variable -> ^( VARIABLE $v) ;
	public final DBLParser.into_variable_return into_variable() throws RecognitionException {
		DBLParser.into_variable_return retval = new DBLParser.into_variable_return();
		retval.start = input.LT(1);
		int into_variable_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;

		CommonTree v_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:821:3: (v= Variable -> ^( VARIABLE $v) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:822:3: v= Variable
			{
			v=(Token)match(input,Variable,FOLLOW_Variable_in_into_variable7929); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(v);

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 822:14: -> ^( VARIABLE $v)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:822:17: ^( VARIABLE $v)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, into_variable_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "into_variable"


	public static class multiple_row_fetch_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiple_row_fetch"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:826:2: multiple_row_fetch : FOR (v= Variable | NUMBER ) ROWS (mi= multiple_row )? INTO ds= Variable -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) ;
	public final DBLParser.multiple_row_fetch_return multiple_row_fetch() throws RecognitionException {
		DBLParser.multiple_row_fetch_return retval = new DBLParser.multiple_row_fetch_return();
		retval.start = input.LT(1);
		int multiple_row_fetch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token ds=null;
		Token FOR213=null;
		Token NUMBER214=null;
		Token ROWS215=null;
		Token INTO216=null;
		ParserRuleReturnScope mi =null;

		CommonTree v_tree=null;
		CommonTree ds_tree=null;
		CommonTree FOR213_tree=null;
		CommonTree NUMBER214_tree=null;
		CommonTree ROWS215_tree=null;
		CommonTree INTO216_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_ROWS=new RewriteRuleTokenStream(adaptor,"token ROWS");
		RewriteRuleSubtreeStream stream_multiple_row=new RewriteRuleSubtreeStream(adaptor,"rule multiple_row");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:827:3: ( FOR (v= Variable | NUMBER ) ROWS (mi= multiple_row )? INTO ds= Variable -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:3: FOR (v= Variable | NUMBER ) ROWS (mi= multiple_row )? INTO ds= Variable
			{
			FOR213=(Token)match(input,FOR,FOLLOW_FOR_in_multiple_row_fetch7959); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR213);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:7: (v= Variable | NUMBER )
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==Variable) ) {
				alt90=1;
			}
			else if ( (LA90_0==NUMBER) ) {
				alt90=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}

			switch (alt90) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:8: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_fetch7964); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:19: NUMBER
					{
					NUMBER214=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_multiple_row_fetch7966); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER214);

					}
					break;

			}

			ROWS215=(Token)match(input,ROWS,FOLLOW_ROWS_in_multiple_row_fetch7969); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROWS.add(ROWS215);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:32: (mi= multiple_row )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==USING) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:33: mi= multiple_row
					{
					pushFollow(FOLLOW_multiple_row_in_multiple_row_fetch7974);
					mi=multiple_row();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiple_row.add(mi.getTree());
					}
					break;

			}

			INTO216=(Token)match(input,INTO,FOLLOW_INTO_in_multiple_row_fetch7978); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO216);

			ds=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_fetch7982); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(ds);

			// AST REWRITE
			// elements: ds, FOR, NUMBER, INTO, mi, INTO, FOR, mi, ds, v
			// token labels: v, ds
			// rule labels: mi, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_ds=new RewriteRuleTokenStream(adaptor,"token ds",ds);
			RewriteRuleSubtreeStream stream_mi=new RewriteRuleSubtreeStream(adaptor,"rule mi",mi!=null?mi.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 828:68: -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
			if (v != null) {
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:84: ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTIPLE_ROW_FETCH, "MULTIPLE_ROW_FETCH"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:105: ^( FOR ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:111: ^( VARIABLE $v)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:127: ( $mi)?
				if ( stream_mi.hasNext() ) {
					adaptor.addChild(root_1, stream_mi.nextTree());
				}
				stream_mi.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:134: ^( INTO ^( VARIABLE $ds) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:828:141: ^( VARIABLE $ds)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_ds.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 829:12: -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:829:16: ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTIPLE_ROW_FETCH, "MULTIPLE_ROW_FETCH"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:829:37: ^( FOR NUMBER )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				adaptor.addChild(root_2, stream_NUMBER.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:829:51: ( $mi)?
				if ( stream_mi.hasNext() ) {
					adaptor.addChild(root_1, stream_mi.nextTree());
				}
				stream_mi.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:829:58: ^( INTO ^( VARIABLE $ds) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:829:65: ^( VARIABLE $ds)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_ds.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, multiple_row_fetch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiple_row_fetch"


	public static class multiple_row_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiple_row"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:832:2: multiple_row : USING DESCRIPTOR d= Variable -> ^( DESCRIPTOR ^( VARIABLE $d) ) ;
	public final DBLParser.multiple_row_return multiple_row() throws RecognitionException {
		DBLParser.multiple_row_return retval = new DBLParser.multiple_row_return();
		retval.start = input.LT(1);
		int multiple_row_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token USING217=null;
		Token DESCRIPTOR218=null;

		CommonTree d_tree=null;
		CommonTree USING217_tree=null;
		CommonTree DESCRIPTOR218_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token DESCRIPTOR");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:833:3: ( USING DESCRIPTOR d= Variable -> ^( DESCRIPTOR ^( VARIABLE $d) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:834:3: USING DESCRIPTOR d= Variable
			{
			USING217=(Token)match(input,USING,FOLLOW_USING_in_multiple_row8080); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING217);

			DESCRIPTOR218=(Token)match(input,DESCRIPTOR,FOLLOW_DESCRIPTOR_in_multiple_row8082); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DESCRIPTOR.add(DESCRIPTOR218);

			d=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row8086); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(d);

			// AST REWRITE
			// elements: d, DESCRIPTOR
			// token labels: d
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 834:31: -> ^( DESCRIPTOR ^( VARIABLE $d) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:834:33: ^( DESCRIPTOR ^( VARIABLE $d) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_DESCRIPTOR.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:834:46: ^( VARIABLE $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_d.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, multiple_row_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiple_row"


	public static class close_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "close_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:838:2: close_statement : CLOSE c= Identifier -> ^( CLOSE_STATEMENT ^( CURSOR $c) ) ;
	public final DBLParser.close_statement_return close_statement() throws RecognitionException {
		DBLParser.close_statement_return retval = new DBLParser.close_statement_return();
		retval.start = input.LT(1);
		int close_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token CLOSE219=null;

		CommonTree c_tree=null;
		CommonTree CLOSE219_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:839:3: ( CLOSE c= Identifier -> ^( CLOSE_STATEMENT ^( CURSOR $c) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:840:3: CLOSE c= Identifier
			{
			CLOSE219=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement8122); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE.add(CLOSE219);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_close_statement8126); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// AST REWRITE
			// elements: c
			// token labels: c
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 840:22: -> ^( CLOSE_STATEMENT ^( CURSOR $c) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:840:25: ^( CLOSE_STATEMENT ^( CURSOR $c) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLOSE_STATEMENT, "CLOSE_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:840:43: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, close_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "close_statement"


	public static class into_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "into_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:845:2: into_clause : INTO (d= Identifier |v= Variable ) ( USING t= using_target )? -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? ) -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? ) ;
	public final DBLParser.into_clause_return into_clause() throws RecognitionException {
		DBLParser.into_clause_return retval = new DBLParser.into_clause_return();
		retval.start = input.LT(1);
		int into_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token v=null;
		Token INTO220=null;
		Token USING221=null;
		ParserRuleReturnScope t =null;

		CommonTree d_tree=null;
		CommonTree v_tree=null;
		CommonTree INTO220_tree=null;
		CommonTree USING221_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_using_target=new RewriteRuleSubtreeStream(adaptor,"rule using_target");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:846:3: ( INTO (d= Identifier |v= Variable ) ( USING t= using_target )? -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? ) -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:3: INTO (d= Identifier |v= Variable ) ( USING t= using_target )?
			{
			INTO220=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause8167); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO220);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:8: (d= Identifier |v= Variable )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==Identifier) ) {
				alt92=1;
			}
			else if ( (LA92_0==Variable) ) {
				alt92=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:9: d= Identifier
					{
					d=(Token)match(input,Identifier,FOLLOW_Identifier_in_into_clause8172); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(d);

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:22: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_into_clause8176); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:34: ( USING t= using_target )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==USING) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:35: USING t= using_target
					{
					USING221=(Token)match(input,USING,FOLLOW_USING_in_into_clause8180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING221);

					pushFollow(FOLLOW_using_target_in_into_clause8184);
					t=using_target();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_using_target.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: INTO, v, t, USING, t, d, INTO, USING
			// token labels: d, v
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 847:59: -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? )
			if (d!=null) {
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:74: ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:81: ^( DESCRIPTOR $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DESCRIPTOR, "DESCRIPTOR"), root_2);
				adaptor.addChild(root_2, stream_d.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:98: ( ^( USING $t) )?
				if ( stream_USING.hasNext()||stream_t.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:847:98: ^( USING $t)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
					adaptor.addChild(root_2, stream_t.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_USING.reset();
				stream_t.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 848:9: -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:848:14: ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:848:21: ^( VARIABLE $v)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_v.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:848:36: ( ^( USING $t) )?
				if ( stream_t.hasNext()||stream_USING.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:848:36: ^( USING $t)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
					adaptor.addChild(root_2, stream_t.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_t.reset();
				stream_USING.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, into_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "into_clause"


	public static class using_target_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "using_target"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:851:2: using_target : ( NAMES | LABELS | ANY | BOTH | ALL | system_names );
	public final DBLParser.using_target_return using_target() throws RecognitionException {
		DBLParser.using_target_return retval = new DBLParser.using_target_return();
		retval.start = input.LT(1);
		int using_target_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NAMES222=null;
		Token LABELS223=null;
		Token ANY224=null;
		Token BOTH225=null;
		Token ALL226=null;
		ParserRuleReturnScope system_names227 =null;

		CommonTree NAMES222_tree=null;
		CommonTree LABELS223_tree=null;
		CommonTree ANY224_tree=null;
		CommonTree BOTH225_tree=null;
		CommonTree ALL226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:852:2: ( NAMES | LABELS | ANY | BOTH | ALL | system_names )
			int alt94=6;
			switch ( input.LA(1) ) {
			case NAMES:
				{
				alt94=1;
				}
				break;
			case LABELS:
				{
				alt94=2;
				}
				break;
			case ANY:
				{
				alt94=3;
				}
				break;
			case BOTH:
				{
				alt94=4;
				}
				break;
			case ALL:
				{
				alt94=5;
				}
				break;
			case SYSTEM:
				{
				alt94=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:853:2: NAMES
					{
					root_0 = (CommonTree)adaptor.nil();


					NAMES222=(Token)match(input,NAMES,FOLLOW_NAMES_in_using_target8260); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAMES222_tree = (CommonTree)adaptor.create(NAMES222);
					adaptor.addChild(root_0, NAMES222_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:853:8: LABELS
					{
					root_0 = (CommonTree)adaptor.nil();


					LABELS223=(Token)match(input,LABELS,FOLLOW_LABELS_in_using_target8262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LABELS223_tree = (CommonTree)adaptor.create(LABELS223);
					adaptor.addChild(root_0, LABELS223_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:853:15: ANY
					{
					root_0 = (CommonTree)adaptor.nil();


					ANY224=(Token)match(input,ANY,FOLLOW_ANY_in_using_target8264); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ANY224_tree = (CommonTree)adaptor.create(ANY224);
					adaptor.addChild(root_0, ANY224_tree);
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:853:19: BOTH
					{
					root_0 = (CommonTree)adaptor.nil();


					BOTH225=(Token)match(input,BOTH,FOLLOW_BOTH_in_using_target8266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOTH225_tree = (CommonTree)adaptor.create(BOTH225);
					adaptor.addChild(root_0, BOTH225_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:853:24: ALL
					{
					root_0 = (CommonTree)adaptor.nil();


					ALL226=(Token)match(input,ALL,FOLLOW_ALL_in_using_target8268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ALL226_tree = (CommonTree)adaptor.create(ALL226);
					adaptor.addChild(root_0, ALL226_tree);
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:853:28: system_names
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_system_names_in_using_target8270);
					system_names227=system_names();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, system_names227.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, using_target_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "using_target"


	public static class system_names_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "system_names"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:856:1: system_names : SYSTEM NAMES -> ^( SYSTEM_NAMES ) ;
	public final DBLParser.system_names_return system_names() throws RecognitionException {
		DBLParser.system_names_return retval = new DBLParser.system_names_return();
		retval.start = input.LT(1);
		int system_names_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SYSTEM228=null;
		Token NAMES229=null;

		CommonTree SYSTEM228_tree=null;
		CommonTree NAMES229_tree=null;
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_NAMES=new RewriteRuleTokenStream(adaptor,"token NAMES");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:857:2: ( SYSTEM NAMES -> ^( SYSTEM_NAMES ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:858:2: SYSTEM NAMES
			{
			SYSTEM228=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_system_names8283); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM228);

			NAMES229=(Token)match(input,NAMES,FOLLOW_NAMES_in_system_names8285); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAMES.add(NAMES229);

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
			// 858:15: -> ^( SYSTEM_NAMES )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:858:18: ^( SYSTEM_NAMES )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYSTEM_NAMES, "SYSTEM_NAMES"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, system_names_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "system_names"


	public static class table_elements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_elements"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:864:1: table_elements : LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ ;
	public final DBLParser.table_elements_return table_elements() throws RecognitionException {
		DBLParser.table_elements_return retval = new DBLParser.table_elements_return();
		retval.start = input.LT(1);
		int table_elements_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN230=null;
		Token COMMA232=null;
		Token RIGHT_PAREN234=null;
		ParserRuleReturnScope field_element231 =null;
		ParserRuleReturnScope field_element233 =null;

		CommonTree LEFT_PAREN230_tree=null;
		CommonTree COMMA232_tree=null;
		CommonTree RIGHT_PAREN234_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_field_element=new RewriteRuleSubtreeStream(adaptor,"rule field_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:865:3: ( LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:865:5: LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN
			{
			LEFT_PAREN230=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_elements8308); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN230);

			pushFollow(FOLLOW_field_element_in_table_elements8310);
			field_element231=field_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_element.add(field_element231.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:865:30: ( COMMA field_element )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==COMMA) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:865:31: COMMA field_element
					{
					COMMA232=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_elements8313); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA232);

					pushFollow(FOLLOW_field_element_in_table_elements8315);
					field_element233=field_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field_element.add(field_element233.getTree());
					}
					break;

				default :
					break loop95;
				}
			}

			RIGHT_PAREN234=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_elements8319); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN234);

			// AST REWRITE
			// elements: field_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 866:5: -> ( field_element )+
			{
				if ( !(stream_field_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_field_element.hasNext() ) {
					adaptor.addChild(root_0, stream_field_element.nextTree());
				}
				stream_field_element.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, table_elements_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_elements"


	public static class field_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_element"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:869:1: field_element : Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) ;
	public final DBLParser.field_element_return field_element() throws RecognitionException {
		DBLParser.field_element_return retval = new DBLParser.field_element_return();
		retval.start = input.LT(1);
		int field_element_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token Identifier235=null;
		Token FOR236=null;
		Token COLUMN237=null;
		ParserRuleReturnScope field_type238 =null;
		ParserRuleReturnScope not_null239 =null;
		ParserRuleReturnScope with_default240 =null;

		CommonTree c_tree=null;
		CommonTree Identifier235_tree=null;
		CommonTree FOR236_tree=null;
		CommonTree COLUMN237_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleSubtreeStream stream_with_default=new RewriteRuleSubtreeStream(adaptor,"rule with_default");
		RewriteRuleSubtreeStream stream_not_null=new RewriteRuleSubtreeStream(adaptor,"rule not_null");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:3: ( Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:5: Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )?
			{
			Identifier235=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element8343); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier235);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:16: ( FOR COLUMN c= Identifier )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==FOR) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:17: FOR COLUMN c= Identifier
					{
					FOR236=(Token)match(input,FOR,FOLLOW_FOR_in_field_element8346); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR.add(FOR236);

					COLUMN237=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_field_element8348); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN237);

					c=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element8352); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(c);

					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field_element8356);
			field_type238=field_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_type.add(field_type238.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:54: ( not_null )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==NOT) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:55: not_null
					{
					pushFollow(FOLLOW_not_null_in_field_element8359);
					not_null239=not_null();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_not_null.add(not_null239.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:66: ( with_default )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==WITH) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:67: with_default
					{
					pushFollow(FOLLOW_with_default_in_field_element8364);
					with_default240=with_default();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_with_default.add(with_default240.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: Identifier, c, with_default, not_null, field_type
			// token labels: c
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 870:81: -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:84: ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_DEF, "FIELD_DEF"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:96: ^( FIELD_NAME Identifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_NAME, "FIELD_NAME"), root_2);
				adaptor.addChild(root_2, stream_Identifier.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:121: ( ^( FOR_COLUMN $c) )?
				if ( stream_c.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:121: ^( FOR_COLUMN $c)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_COLUMN, "FOR_COLUMN"), root_2);
					adaptor.addChild(root_2, stream_c.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_c.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:139: ^( FIELD_TYPE field_type )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_TYPE, "FIELD_TYPE"), root_2);
				adaptor.addChild(root_2, stream_field_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:164: ( not_null )?
				if ( stream_not_null.hasNext() ) {
					adaptor.addChild(root_1, stream_not_null.nextTree());
				}
				stream_not_null.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:870:176: ( with_default )?
				if ( stream_with_default.hasNext() ) {
					adaptor.addChild(root_1, stream_with_default.nextTree());
				}
				stream_with_default.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, field_element_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "field_element"


	public static class not_null_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "not_null"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:873:1: not_null : NOT NULL -> ^( NOT_NULL ) ;
	public final DBLParser.not_null_return not_null() throws RecognitionException {
		DBLParser.not_null_return retval = new DBLParser.not_null_return();
		retval.start = input.LT(1);
		int not_null_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT241=null;
		Token NULL242=null;

		CommonTree NOT241_tree=null;
		CommonTree NULL242_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:873:9: ( NOT NULL -> ^( NOT_NULL ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:874:2: NOT NULL
			{
			NOT241=(Token)match(input,NOT,FOLLOW_NOT_in_not_null8414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NOT.add(NOT241);

			NULL242=(Token)match(input,NULL,FOLLOW_NULL_in_not_null8416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL242);

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
			// 874:11: -> ^( NOT_NULL )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:874:14: ^( NOT_NULL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, not_null_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "not_null"


	public static class with_default_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "with_default"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:877:1: with_default : WITH DEFAULT -> ^( WITH_DEFAULT ) ;
	public final DBLParser.with_default_return with_default() throws RecognitionException {
		DBLParser.with_default_return retval = new DBLParser.with_default_return();
		retval.start = input.LT(1);
		int with_default_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH243=null;
		Token DEFAULT244=null;

		CommonTree WITH243_tree=null;
		CommonTree DEFAULT244_tree=null;
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:877:13: ( WITH DEFAULT -> ^( WITH_DEFAULT ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:878:2: WITH DEFAULT
			{
			WITH243=(Token)match(input,WITH,FOLLOW_WITH_in_with_default8437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH243);

			DEFAULT244=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_with_default8439); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT244);

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
			// 878:15: -> ^( WITH_DEFAULT )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:878:18: ^( WITH_DEFAULT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH_DEFAULT, "WITH_DEFAULT"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, with_default_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "with_default"


	public static class field_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:881:1: field_type : data_type ;
	public final DBLParser.field_type_return field_type() throws RecognitionException {
		DBLParser.field_type_return retval = new DBLParser.field_type_return();
		retval.start = input.LT(1);
		int field_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope data_type245 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:882:3: ( data_type )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:882:5: data_type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_data_type_in_field_type8465);
			data_type245=data_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type245.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, field_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class query_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:895:1: query_expression : query_expression_body ;
	public final DBLParser.query_expression_return query_expression() throws RecognitionException {
		DBLParser.query_expression_return retval = new DBLParser.query_expression_return();
		retval.start = input.LT(1);
		int query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_expression_body246 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:896:3: ( query_expression_body )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:896:5: query_expression_body
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_expression_body_in_query_expression8486);
			query_expression_body246=query_expression_body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_expression_body246.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, query_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_expression"


	public static class query_expression_body_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_expression_body"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:898:1: query_expression_body : ( non_join_query_expression | joined_table );
	public final DBLParser.query_expression_body_return query_expression_body() throws RecognitionException {
		DBLParser.query_expression_body_return retval = new DBLParser.query_expression_body_return();
		retval.start = input.LT(1);
		int query_expression_body_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_expression247 =null;
		ParserRuleReturnScope joined_table248 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:899:3: ( non_join_query_expression | joined_table )
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LEFT_PAREN||LA99_0==SELECT) ) {
				alt99=1;
			}
			else if ( (LA99_0==Identifier) ) {
				int LA99_3 = input.LA(2);
				if ( (synpred210_DBL()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}

			switch (alt99) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:899:5: non_join_query_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_expression_in_query_expression_body8498);
					non_join_query_expression247=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression247.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:900:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_expression_body8504);
					joined_table248=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table248.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, query_expression_body_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_expression_body"


	public static class non_join_query_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "non_join_query_expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:902:1: non_join_query_expression : ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* ;
	public final DBLParser.non_join_query_expression_return non_join_query_expression() throws RecognitionException {
		DBLParser.non_join_query_expression_return retval = new DBLParser.non_join_query_expression_return();
		retval.start = input.LT(1);
		int non_join_query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set251=null;
		Token set252=null;
		Token set254=null;
		Token set255=null;
		ParserRuleReturnScope non_join_query_term249 =null;
		ParserRuleReturnScope joined_table250 =null;
		ParserRuleReturnScope query_term253 =null;
		ParserRuleReturnScope query_term256 =null;

		CommonTree set251_tree=null;
		CommonTree set252_tree=null;
		CommonTree set254_tree=null;
		CommonTree set255_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:3: ( ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LEFT_PAREN||LA101_0==SELECT) ) {
				alt101=1;
			}
			else if ( (LA101_0==Identifier) ) {
				int LA101_3 = input.LA(2);
				if ( (synpred211_DBL()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}

			switch (alt101) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:6: non_join_query_term
					{
					pushFollow(FOLLOW_non_join_query_term_in_non_join_query_expression8517);
					non_join_query_term249=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term249.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:28: joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_expression8521);
					joined_table250=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table250.getTree());

					set251=input.LT(1);
					set251=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set251), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:59: ( ALL | DISTINCT )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==ALL||LA100_0==DISTINCT) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
							{
							set252=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set252));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_term_in_non_join_query_expression8539);
					query_term253=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term253.getTree());

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:904:5: ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==EXCEPT||LA103_0==UNION) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:904:6: ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					set254=input.LT(1);
					set254=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set254), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:904:24: ( ALL | DISTINCT )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==ALL||LA102_0==DISTINCT) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
							{
							set255=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set255));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_term_in_non_join_query_expression8563);
					query_term256=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term256.getTree());

					}
					break;

				default :
					break loop103;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, non_join_query_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "non_join_query_expression"


	public static class query_term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_term"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:906:1: query_term : ( non_join_query_term | joined_table );
	public final DBLParser.query_term_return query_term() throws RecognitionException {
		DBLParser.query_term_return retval = new DBLParser.query_term_return();
		retval.start = input.LT(1);
		int query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_term257 =null;
		ParserRuleReturnScope joined_table258 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:907:3: ( non_join_query_term | joined_table )
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LEFT_PAREN||LA104_0==SELECT) ) {
				alt104=1;
			}
			else if ( (LA104_0==Identifier) ) {
				int LA104_3 = input.LA(2);
				if ( (synpred219_DBL()) ) {
					alt104=1;
				}
				else if ( (true) ) {
					alt104=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}

			switch (alt104) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:907:5: non_join_query_term
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_term_in_query_term8577);
					non_join_query_term257=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term257.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:908:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_term8583);
					joined_table258=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table258.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, query_term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_term"


	public static class non_join_query_term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "non_join_query_term"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:910:1: non_join_query_term : ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* ;
	public final DBLParser.non_join_query_term_return non_join_query_term() throws RecognitionException {
		DBLParser.non_join_query_term_return retval = new DBLParser.non_join_query_term_return();
		retval.start = input.LT(1);
		int non_join_query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTERSECT261=null;
		Token set262=null;
		Token INTERSECT264=null;
		Token set265=null;
		ParserRuleReturnScope non_join_query_primary259 =null;
		ParserRuleReturnScope joined_table260 =null;
		ParserRuleReturnScope query_primary263 =null;
		ParserRuleReturnScope query_primary266 =null;

		CommonTree INTERSECT261_tree=null;
		CommonTree set262_tree=null;
		CommonTree INTERSECT264_tree=null;
		CommonTree set265_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:911:3: ( ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:911:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:911:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary )
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LEFT_PAREN||LA106_0==SELECT) ) {
				alt106=1;
			}
			else if ( (LA106_0==Identifier) ) {
				alt106=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}

			switch (alt106) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:911:7: non_join_query_primary
					{
					pushFollow(FOLLOW_non_join_query_primary_in_non_join_query_term8597);
					non_join_query_primary259=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary259.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:911:32: joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_term8601);
					joined_table260=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table260.getTree());

					INTERSECT261=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term8603); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT261_tree = (CommonTree)adaptor.create(INTERSECT261);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT261_tree, root_0);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:911:56: ( ALL | DISTINCT )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==ALL||LA105_0==DISTINCT) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
							{
							set262=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set262));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_primary_in_non_join_query_term8613);
					query_primary263=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary263.getTree());

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:912:5: ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==INTERSECT) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:912:6: INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					INTERSECT264=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term8621); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT264_tree = (CommonTree)adaptor.create(INTERSECT264);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT264_tree, root_0);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:912:17: ( ALL | DISTINCT )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==ALL||LA107_0==DISTINCT) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
							{
							set265=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set265));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_primary_in_non_join_query_term8631);
					query_primary266=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary266.getTree());

					}
					break;

				default :
					break loop108;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, non_join_query_term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "non_join_query_term"


	public static class query_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_primary"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:914:1: query_primary : ( non_join_query_primary | joined_table );
	public final DBLParser.query_primary_return query_primary() throws RecognitionException {
		DBLParser.query_primary_return retval = new DBLParser.query_primary_return();
		retval.start = input.LT(1);
		int query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_primary267 =null;
		ParserRuleReturnScope joined_table268 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:915:3: ( non_join_query_primary | joined_table )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==LEFT_PAREN||LA109_0==SELECT) ) {
				alt109=1;
			}
			else if ( (LA109_0==Identifier) ) {
				alt109=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:915:5: non_join_query_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_primary_in_query_primary8645);
					non_join_query_primary267=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary267.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:916:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_primary8651);
					joined_table268=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table268.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, query_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_primary"


	public static class non_join_query_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "non_join_query_primary"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:918:1: non_join_query_primary : ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN );
	public final DBLParser.non_join_query_primary_return non_join_query_primary() throws RecognitionException {
		DBLParser.non_join_query_primary_return retval = new DBLParser.non_join_query_primary_return();
		retval.start = input.LT(1);
		int non_join_query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN270=null;
		Token RIGHT_PAREN272=null;
		ParserRuleReturnScope simple_table269 =null;
		ParserRuleReturnScope non_join_query_expression271 =null;

		CommonTree LEFT_PAREN270_tree=null;
		CommonTree RIGHT_PAREN272_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:919:3: ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==SELECT) ) {
				alt110=1;
			}
			else if ( (LA110_0==LEFT_PAREN) ) {
				alt110=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:919:5: simple_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_table_in_non_join_query_primary8663);
					simple_table269=simple_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_table269.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:920:5: LEFT_PAREN non_join_query_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN270=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_non_join_query_primary8669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN270_tree = (CommonTree)adaptor.create(LEFT_PAREN270);
					adaptor.addChild(root_0, LEFT_PAREN270_tree);
					}

					pushFollow(FOLLOW_non_join_query_expression_in_non_join_query_primary8671);
					non_join_query_expression271=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression271.getTree());

					RIGHT_PAREN272=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_non_join_query_primary8673); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN272_tree = (CommonTree)adaptor.create(RIGHT_PAREN272);
					adaptor.addChild(root_0, RIGHT_PAREN272_tree);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, non_join_query_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "non_join_query_primary"


	public static class simple_table_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_table"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:922:1: simple_table options {k=1; } : query_specification ;
	public final DBLParser.simple_table_return simple_table() throws RecognitionException {
		DBLParser.simple_table_return retval = new DBLParser.simple_table_return();
		retval.start = input.LT(1);
		int simple_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_specification273 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:924:3: ( query_specification )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:924:5: query_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_specification_in_simple_table8694);
			query_specification273=query_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_specification273.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, simple_table_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_table"


	public static class query_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_specification"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:926:1: query_specification : SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) ;
	public final DBLParser.query_specification_return query_specification() throws RecognitionException {
		DBLParser.query_specification_return retval = new DBLParser.query_specification_return();
		retval.start = input.LT(1);
		int query_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SELECT274=null;
		ParserRuleReturnScope set_qualifier275 =null;
		ParserRuleReturnScope select_list276 =null;
		ParserRuleReturnScope from_clause277 =null;
		ParserRuleReturnScope where_clause278 =null;
		ParserRuleReturnScope groupby_clause279 =null;
		ParserRuleReturnScope having_clause280 =null;
		ParserRuleReturnScope orderby_clause281 =null;
		ParserRuleReturnScope limit_clause282 =null;

		CommonTree SELECT274_tree=null;
		RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
		RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
		RewriteRuleSubtreeStream stream_groupby_clause=new RewriteRuleSubtreeStream(adaptor,"rule groupby_clause");
		RewriteRuleSubtreeStream stream_having_clause=new RewriteRuleSubtreeStream(adaptor,"rule having_clause");
		RewriteRuleSubtreeStream stream_orderby_clause=new RewriteRuleSubtreeStream(adaptor,"rule orderby_clause");
		RewriteRuleSubtreeStream stream_limit_clause=new RewriteRuleSubtreeStream(adaptor,"rule limit_clause");
		RewriteRuleSubtreeStream stream_set_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule set_qualifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:3: ( SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:5: SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )?
			{
			SELECT274=(Token)match(input,SELECT,FOLLOW_SELECT_in_query_specification8706); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SELECT.add(SELECT274);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:12: ( set_qualifier )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==ALL||LA111_0==DISTINCT) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:12: set_qualifier
					{
					pushFollow(FOLLOW_set_qualifier_in_query_specification8708);
					set_qualifier275=set_qualifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_set_qualifier.add(set_qualifier275.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_select_list_in_query_specification8711);
			select_list276=select_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_list.add(select_list276.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:39: ( from_clause )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==FROM) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:39: from_clause
					{
					pushFollow(FOLLOW_from_clause_in_query_specification8713);
					from_clause277=from_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from_clause.add(from_clause277.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:52: ( where_clause )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==WHERE) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:52: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_query_specification8716);
					where_clause278=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause278.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:66: ( groupby_clause )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==GROUP) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:66: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_query_specification8719);
					groupby_clause279=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause279.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:82: ( having_clause )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==HAVING) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:927:82: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_query_specification8722);
					having_clause280=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause280.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:928:5: ( orderby_clause )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==ORDER) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:928:5: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_query_specification8729);
					orderby_clause281=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause281.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:928:21: ( limit_clause )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==LIMIT) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:928:21: limit_clause
					{
					pushFollow(FOLLOW_limit_clause_in_query_specification8732);
					limit_clause282=limit_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_limit_clause.add(limit_clause282.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: from_clause, orderby_clause, SELECT, where_clause, groupby_clause, set_qualifier, limit_clause, having_clause, select_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 929:5: -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:929:8: ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:929:17: ( from_clause )?
				if ( stream_from_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_from_clause.nextTree());
				}
				stream_from_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:929:30: ( set_qualifier )?
				if ( stream_set_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_set_qualifier.nextTree());
				}
				stream_set_qualifier.reset();

				adaptor.addChild(root_1, stream_select_list.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:929:57: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:929:71: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:930:5: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:930:20: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:930:36: ( limit_clause )?
				if ( stream_limit_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_limit_clause.nextTree());
				}
				stream_limit_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, query_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_specification"


	public static class select_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "select_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:932:1: select_list : ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) );
	public final DBLParser.select_list_return select_list() throws RecognitionException {
		DBLParser.select_list_return retval = new DBLParser.select_list_return();
		retval.start = input.LT(1);
		int select_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token MULTIPLY283=null;
		Token COMMA285=null;
		ParserRuleReturnScope derived_column284 =null;
		ParserRuleReturnScope derived_column286 =null;

		CommonTree MULTIPLY283_tree=null;
		CommonTree COMMA285_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleSubtreeStream stream_derived_column=new RewriteRuleSubtreeStream(adaptor,"rule derived_column");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:933:3: ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) )
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==MULTIPLY) ) {
				alt119=1;
			}
			else if ( (LA119_0==CASE||LA119_0==COUNT||LA119_0==Character_String_Literal||LA119_0==Identifier||LA119_0==LEFT_PAREN||LA119_0==MINUS||LA119_0==NOT||LA119_0==NULL||LA119_0==NUMBER||LA119_0==PLUS||LA119_0==REAL_NUMBER) ) {
				alt119=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:933:5: MULTIPLY
					{
					MULTIPLY283=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_select_list8782); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY283);

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
					// 933:14: -> ^( SEL_LIST ALL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:933:17: ^( SEL_LIST ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEL_LIST, "SEL_LIST"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ALL, "ALL"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:934:5: derived_column ( COMMA derived_column )*
					{
					pushFollow(FOLLOW_derived_column_in_select_list8796);
					derived_column284=derived_column();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_derived_column.add(derived_column284.getTree());
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:934:20: ( COMMA derived_column )*
					loop118:
					while (true) {
						int alt118=2;
						int LA118_0 = input.LA(1);
						if ( (LA118_0==COMMA) ) {
							alt118=1;
						}

						switch (alt118) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:934:21: COMMA derived_column
							{
							COMMA285=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list8799); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA285);

							pushFollow(FOLLOW_derived_column_in_select_list8801);
							derived_column286=derived_column();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_derived_column.add(derived_column286.getTree());
							}
							break;

						default :
							break loop118;
						}
					}

					// AST REWRITE
					// elements: derived_column
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 934:44: -> ^( SEL_LIST ( derived_column )+ )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:934:47: ^( SEL_LIST ( derived_column )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEL_LIST, "SEL_LIST"), root_1);
						if ( !(stream_derived_column.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_derived_column.hasNext() ) {
							adaptor.addChild(root_1, stream_derived_column.nextTree());
						}
						stream_derived_column.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, select_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "select_list"


	public static class set_qualifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_qualifier"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:936:1: set_qualifier : ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) );
	public final DBLParser.set_qualifier_return set_qualifier() throws RecognitionException {
		DBLParser.set_qualifier_return retval = new DBLParser.set_qualifier_return();
		retval.start = input.LT(1);
		int set_qualifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISTINCT287=null;
		Token ALL288=null;

		CommonTree DISTINCT287_tree=null;
		CommonTree ALL288_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:937:3: ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) )
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==DISTINCT) ) {
				alt120=1;
			}
			else if ( (LA120_0==ALL) ) {
				alt120=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}

			switch (alt120) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:937:5: DISTINCT
					{
					DISTINCT287=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_set_qualifier8824); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT287);

					// AST REWRITE
					// elements: DISTINCT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 937:14: -> ^( SET_QUALIFIER DISTINCT )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:937:17: ^( SET_QUALIFIER DISTINCT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_QUALIFIER, "SET_QUALIFIER"), root_1);
						adaptor.addChild(root_1, stream_DISTINCT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:938:5: ALL
					{
					ALL288=(Token)match(input,ALL,FOLLOW_ALL_in_set_qualifier8838); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL288);

					// AST REWRITE
					// elements: ALL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 938:9: -> ^( SET_QUALIFIER ALL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:938:12: ^( SET_QUALIFIER ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_QUALIFIER, "SET_QUALIFIER"), root_1);
						adaptor.addChild(root_1, stream_ALL.nextNode());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, set_qualifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_qualifier"


	public static class derived_column_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "derived_column"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:940:1: derived_column : boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) ;
	public final DBLParser.derived_column_return derived_column() throws RecognitionException {
		DBLParser.derived_column_return retval = new DBLParser.derived_column_return();
		retval.start = input.LT(1);
		int derived_column_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression289 =null;
		ParserRuleReturnScope as_clause290 =null;

		RewriteRuleSubtreeStream stream_as_clause=new RewriteRuleSubtreeStream(adaptor,"rule as_clause");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:941:3: ( boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:941:5: boolean_value_expression ( as_clause )?
			{
			pushFollow(FOLLOW_boolean_value_expression_in_derived_column8858);
			boolean_value_expression289=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression289.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:941:30: ( as_clause )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==AS||LA121_0==Identifier) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:941:30: as_clause
					{
					pushFollow(FOLLOW_as_clause_in_derived_column8860);
					as_clause290=as_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as_clause.add(as_clause290.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: as_clause, boolean_value_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 941:41: -> ^( COLUMN boolean_value_expression ( as_clause )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:941:44: ^( COLUMN boolean_value_expression ( as_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);
				adaptor.addChild(root_1, stream_boolean_value_expression.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:941:78: ( as_clause )?
				if ( stream_as_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_as_clause.nextTree());
				}
				stream_as_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, derived_column_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "derived_column"


	public static class column_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_reference"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:944:1: column_reference : b= Identifier -> ^( COLUMN_NAME $b) ;
	public final DBLParser.column_reference_return column_reference() throws RecognitionException {
		DBLParser.column_reference_return retval = new DBLParser.column_reference_return();
		retval.start = input.LT(1);
		int column_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		Token b=null;

		CommonTree b_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:945:2: (b= Identifier -> ^( COLUMN_NAME $b) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:945:4: b= Identifier
			{
			b=(Token)match(input,Identifier,FOLLOW_Identifier_in_column_reference8888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(b);

			// AST REWRITE
			// elements: b
			// token labels: b
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 945:17: -> ^( COLUMN_NAME $b)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:945:20: ^( COLUMN_NAME $b)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN_NAME, "COLUMN_NAME"), root_1);
				adaptor.addChild(root_1, stream_b.nextNode());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, column_reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "column_reference"


	public static class as_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "as_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:948:1: as_clause : ( AS )? column_reference ;
	public final DBLParser.as_clause_return as_clause() throws RecognitionException {
		DBLParser.as_clause_return retval = new DBLParser.as_clause_return();
		retval.start = input.LT(1);
		int as_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AS291=null;
		ParserRuleReturnScope column_reference292 =null;

		CommonTree AS291_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:949:3: ( ( AS )? column_reference )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:949:5: ( AS )? column_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:949:5: ( AS )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==AS) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:949:6: AS
					{
					AS291=(Token)match(input,AS,FOLLOW_AS_in_as_clause8912); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AS291_tree = (CommonTree)adaptor.create(AS291);
					adaptor.addChild(root_0, AS291_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_column_reference_in_as_clause8916);
			column_reference292=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference292.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, as_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "as_clause"


	public static class column_reference_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_reference_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:951:1: column_reference_list : column_reference ( COMMA column_reference )* -> ( column_reference )+ ;
	public final DBLParser.column_reference_list_return column_reference_list() throws RecognitionException {
		DBLParser.column_reference_list_return retval = new DBLParser.column_reference_list_return();
		retval.start = input.LT(1);
		int column_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA294=null;
		ParserRuleReturnScope column_reference293 =null;
		ParserRuleReturnScope column_reference295 =null;

		CommonTree COMMA294_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:952:2: ( column_reference ( COMMA column_reference )* -> ( column_reference )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:952:4: column_reference ( COMMA column_reference )*
			{
			pushFollow(FOLLOW_column_reference_in_column_reference_list8927);
			column_reference293=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(column_reference293.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:952:21: ( COMMA column_reference )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==COMMA) ) {
					int LA123_2 = input.LA(2);
					if ( (LA123_2==Identifier) ) {
						int LA123_3 = input.LA(3);
						if ( (synpred240_DBL()) ) {
							alt123=1;
						}

					}

				}

				switch (alt123) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:952:22: COMMA column_reference
					{
					COMMA294=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_reference_list8930); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA294);

					pushFollow(FOLLOW_column_reference_in_column_reference_list8932);
					column_reference295=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference.add(column_reference295.getTree());
					}
					break;

				default :
					break loop123;
				}
			}

			// AST REWRITE
			// elements: column_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 952:47: -> ( column_reference )+
			{
				if ( !(stream_column_reference.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_column_reference.hasNext() ) {
					adaptor.addChild(root_0, stream_column_reference.nextTree());
				}
				stream_column_reference.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, column_reference_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "column_reference_list"


	public static class table_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:954:1: table : ( Identifier | qualified_identifier );
	public final DBLParser.table_return table() throws RecognitionException {
		DBLParser.table_return retval = new DBLParser.table_return();
		retval.start = input.LT(1);
		int table_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier296=null;
		ParserRuleReturnScope qualified_identifier297 =null;

		CommonTree Identifier296_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:955:3: ( Identifier | qualified_identifier )
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==Identifier) ) {
				int LA124_1 = input.LA(2);
				if ( (LA124_1==DIVIDE) ) {
					alt124=2;
				}
				else if ( (LA124_1==EOF||LA124_1==AS||LA124_1==COMMA||LA124_1==CROSS||LA124_1==EXCEPT||LA124_1==FULL||LA124_1==GROUP||LA124_1==HAVING||LA124_1==INNER||LA124_1==INTERSECT||LA124_1==Identifier||LA124_1==JOIN||LA124_1==LEFT||LA124_1==LIMIT||LA124_1==NATURAL||LA124_1==ON||LA124_1==ORDER||(LA124_1 >= RIGHT && LA124_1 <= RIGHT_PAREN)||LA124_1==UNION||LA124_1==USING||LA124_1==WHERE) ) {
					alt124=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}

			switch (alt124) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:955:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier296=(Token)match(input,Identifier,FOLLOW_Identifier_in_table8950); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier296_tree = (CommonTree)adaptor.create(Identifier296);
					adaptor.addChild(root_0, Identifier296_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:957:5: qualified_identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_identifier_in_table8962);
					qualified_identifier297=qualified_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_identifier297.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, table_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table"


	public static class qualified_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified_identifier"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:960:1: qualified_identifier : l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) ;
	public final DBLParser.qualified_identifier_return qualified_identifier() throws RecognitionException {
		DBLParser.qualified_identifier_return retval = new DBLParser.qualified_identifier_return();
		retval.start = input.LT(1);
		int qualified_identifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE298=null;
		Token LEFT_PAREN299=null;
		Token RIGHT_PAREN300=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE298_tree=null;
		CommonTree LEFT_PAREN299_tree=null;
		CommonTree RIGHT_PAREN300_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:961:3: (l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:961:5: l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier8977); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE298=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_qualified_identifier8979); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE298);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier8983); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:961:38: ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==LEFT_PAREN) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:961:39: LEFT_PAREN m= Identifier RIGHT_PAREN
					{
					LEFT_PAREN299=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_qualified_identifier8986); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN299);

					m=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier8990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(m);

					RIGHT_PAREN300=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_qualified_identifier8992); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN300);

					}
					break;

			}

			// AST REWRITE
			// elements: l, f, m
			// token labels: f, l, m
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
			RewriteRuleTokenStream stream_m=new RewriteRuleTokenStream(adaptor,"token m",m);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 961:77: -> ^( QUALIFIED $l $f ( $m)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:961:80: ^( QUALIFIED $l $f ( $m)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
				adaptor.addChild(root_1, stream_l.nextNode());
				adaptor.addChild(root_1, stream_f.nextNode());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:961:99: ( $m)?
				if ( stream_m.hasNext() ) {
					adaptor.addChild(root_1, stream_m.nextNode());
				}
				stream_m.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, qualified_identifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualified_identifier"


	public static class member_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:964:1: member : l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) ;
	public final DBLParser.member_return member() throws RecognitionException {
		DBLParser.member_return retval = new DBLParser.member_return();
		retval.start = input.LT(1);
		int member_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE301=null;
		Token LEFT_PAREN302=null;
		Token RIGHT_PAREN303=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE301_tree=null;
		CommonTree LEFT_PAREN302_tree=null;
		CommonTree RIGHT_PAREN303_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:964:8: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:965:2: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_member9027); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE301=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_member9029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE301);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_member9033); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			LEFT_PAREN302=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_member9035); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN302);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_member9039); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			RIGHT_PAREN303=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_member9041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN303);

			// AST REWRITE
			// elements: l, f, m
			// token labels: f, l, m
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
			RewriteRuleTokenStream stream_m=new RewriteRuleTokenStream(adaptor,"token m",m);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 965:71: -> ^( MEMBER $l $f $m)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:965:74: ^( MEMBER $l $f $m)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMBER, "MEMBER"), root_1);
				adaptor.addChild(root_1, stream_l.nextNode());
				adaptor.addChild(root_1, stream_f.nextNode());
				adaptor.addChild(root_1, stream_m.nextNode());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, member_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "member"


	public static class from_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "from_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:968:1: from_clause : FROM ^ table_reference_list ;
	public final DBLParser.from_clause_return from_clause() throws RecognitionException {
		DBLParser.from_clause_return retval = new DBLParser.from_clause_return();
		retval.start = input.LT(1);
		int from_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FROM304=null;
		ParserRuleReturnScope table_reference_list305 =null;

		CommonTree FROM304_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:969:3: ( FROM ^ table_reference_list )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:969:5: FROM ^ table_reference_list
			{
			root_0 = (CommonTree)adaptor.nil();


			FROM304=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause9076); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FROM304_tree = (CommonTree)adaptor.create(FROM304);
			root_0 = (CommonTree)adaptor.becomeRoot(FROM304_tree, root_0);
			}

			pushFollow(FOLLOW_table_reference_list_in_from_clause9079);
			table_reference_list305=table_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference_list305.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, from_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "from_clause"


	public static class table_reference_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_reference_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:971:1: table_reference_list : table_reference ( COMMA table_reference )* -> ( table_reference )+ ;
	public final DBLParser.table_reference_list_return table_reference_list() throws RecognitionException {
		DBLParser.table_reference_list_return retval = new DBLParser.table_reference_list_return();
		retval.start = input.LT(1);
		int table_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA307=null;
		ParserRuleReturnScope table_reference306 =null;
		ParserRuleReturnScope table_reference308 =null;

		CommonTree COMMA307_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_table_reference=new RewriteRuleSubtreeStream(adaptor,"rule table_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:972:3: ( table_reference ( COMMA table_reference )* -> ( table_reference )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:972:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_reference_list9090);
			table_reference306=table_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_reference.add(table_reference306.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:972:20: ( COMMA table_reference )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==COMMA) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:972:21: COMMA table_reference
					{
					COMMA307=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_reference_list9093); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA307);

					pushFollow(FOLLOW_table_reference_in_table_reference_list9095);
					table_reference308=table_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_reference.add(table_reference308.getTree());
					}
					break;

				default :
					break loop126;
				}
			}

			// AST REWRITE
			// elements: table_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 972:45: -> ( table_reference )+
			{
				if ( !(stream_table_reference.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_table_reference.hasNext() ) {
					adaptor.addChild(root_0, stream_table_reference.nextTree());
				}
				stream_table_reference.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, table_reference_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_reference_list"


	public static class table_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_reference"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:974:1: table_reference : ( table_primary | joined_table );
	public final DBLParser.table_reference_return table_reference() throws RecognitionException {
		DBLParser.table_reference_return retval = new DBLParser.table_reference_return();
		retval.start = input.LT(1);
		int table_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary309 =null;
		ParserRuleReturnScope joined_table310 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:975:3: ( table_primary | joined_table )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case DIVIDE:
					{
					int LA127_2 = input.LA(3);
					if ( (LA127_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case LEFT_PAREN:
							{
							int LA127_9 = input.LA(5);
							if ( (LA127_9==Identifier) ) {
								int LA127_10 = input.LA(6);
								if ( (LA127_10==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case AS:
										{
										int LA127_3 = input.LA(8);
										if ( (LA127_3==Identifier) ) {
											switch ( input.LA(9) ) {
											case EOF:
											case COMMA:
											case EXCEPT:
											case GROUP:
											case HAVING:
											case INTERSECT:
											case LIMIT:
											case ORDER:
											case RIGHT_PAREN:
											case WHERE:
												{
												alt127=1;
												}
												break;
											case UNION:
												{
												int LA127_6 = input.LA(10);
												if ( (LA127_6==JOIN) ) {
													alt127=2;
												}
												else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
													alt127=1;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 127, 6, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

												}
												break;
											case CROSS:
											case FULL:
											case INNER:
											case JOIN:
											case LEFT:
											case NATURAL:
											case RIGHT:
												{
												alt127=2;
												}
												break;
											default:
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 127, 4, input);
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
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 127, 3, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

										}
										break;
									case Identifier:
										{
										switch ( input.LA(8) ) {
										case EOF:
										case COMMA:
										case EXCEPT:
										case GROUP:
										case HAVING:
										case INTERSECT:
										case LIMIT:
										case ORDER:
										case RIGHT_PAREN:
										case WHERE:
											{
											alt127=1;
											}
											break;
										case UNION:
											{
											int LA127_6 = input.LA(9);
											if ( (LA127_6==JOIN) ) {
												alt127=2;
											}
											else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
												alt127=1;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 127, 6, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

											}
											break;
										case CROSS:
										case FULL:
										case INNER:
										case JOIN:
										case LEFT:
										case NATURAL:
										case RIGHT:
											{
											alt127=2;
											}
											break;
										default:
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 127, 4, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case EOF:
									case COMMA:
									case EXCEPT:
									case GROUP:
									case HAVING:
									case INTERSECT:
									case LIMIT:
									case ORDER:
									case RIGHT_PAREN:
									case WHERE:
										{
										alt127=1;
										}
										break;
									case UNION:
										{
										int LA127_6 = input.LA(8);
										if ( (LA127_6==JOIN) ) {
											alt127=2;
										}
										else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
											alt127=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 127, 6, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

										}
										break;
									case CROSS:
									case FULL:
									case INNER:
									case JOIN:
									case LEFT:
									case NATURAL:
									case RIGHT:
										{
										alt127=2;
										}
										break;
									default:
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 127, 11, input);
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 127, 10, input);
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 127, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case AS:
							{
							int LA127_3 = input.LA(5);
							if ( (LA127_3==Identifier) ) {
								switch ( input.LA(6) ) {
								case EOF:
								case COMMA:
								case EXCEPT:
								case GROUP:
								case HAVING:
								case INTERSECT:
								case LIMIT:
								case ORDER:
								case RIGHT_PAREN:
								case WHERE:
									{
									alt127=1;
									}
									break;
								case UNION:
									{
									int LA127_6 = input.LA(7);
									if ( (LA127_6==JOIN) ) {
										alt127=2;
									}
									else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
										alt127=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 127, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case CROSS:
								case FULL:
								case INNER:
								case JOIN:
								case LEFT:
								case NATURAL:
								case RIGHT:
									{
									alt127=2;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 127, 4, input);
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 127, 3, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case Identifier:
							{
							switch ( input.LA(5) ) {
							case EOF:
							case COMMA:
							case EXCEPT:
							case GROUP:
							case HAVING:
							case INTERSECT:
							case LIMIT:
							case ORDER:
							case RIGHT_PAREN:
							case WHERE:
								{
								alt127=1;
								}
								break;
							case UNION:
								{
								int LA127_6 = input.LA(6);
								if ( (LA127_6==JOIN) ) {
									alt127=2;
								}
								else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
									alt127=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 127, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case CROSS:
							case FULL:
							case INNER:
							case JOIN:
							case LEFT:
							case NATURAL:
							case RIGHT:
								{
								alt127=2;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 127, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case EOF:
						case COMMA:
						case EXCEPT:
						case GROUP:
						case HAVING:
						case INTERSECT:
						case LIMIT:
						case ORDER:
						case RIGHT_PAREN:
						case WHERE:
							{
							alt127=1;
							}
							break;
						case UNION:
							{
							int LA127_6 = input.LA(5);
							if ( (LA127_6==JOIN) ) {
								alt127=2;
							}
							else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
								alt127=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 127, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case CROSS:
						case FULL:
						case INNER:
						case JOIN:
						case LEFT:
						case NATURAL:
						case RIGHT:
							{
							alt127=2;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 127, 8, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 127, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AS:
					{
					int LA127_3 = input.LA(3);
					if ( (LA127_3==Identifier) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case COMMA:
						case EXCEPT:
						case GROUP:
						case HAVING:
						case INTERSECT:
						case LIMIT:
						case ORDER:
						case RIGHT_PAREN:
						case WHERE:
							{
							alt127=1;
							}
							break;
						case UNION:
							{
							int LA127_6 = input.LA(5);
							if ( (LA127_6==JOIN) ) {
								alt127=2;
							}
							else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
								alt127=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 127, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case CROSS:
						case FULL:
						case INNER:
						case JOIN:
						case LEFT:
						case NATURAL:
						case RIGHT:
							{
							alt127=2;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 127, 4, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 127, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case Identifier:
					{
					switch ( input.LA(3) ) {
					case EOF:
					case COMMA:
					case EXCEPT:
					case GROUP:
					case HAVING:
					case INTERSECT:
					case LIMIT:
					case ORDER:
					case RIGHT_PAREN:
					case WHERE:
						{
						alt127=1;
						}
						break;
					case UNION:
						{
						int LA127_6 = input.LA(4);
						if ( (LA127_6==JOIN) ) {
							alt127=2;
						}
						else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
							alt127=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 127, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case CROSS:
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case NATURAL:
					case RIGHT:
						{
						alt127=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 127, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case EOF:
				case COMMA:
				case EXCEPT:
				case GROUP:
				case HAVING:
				case INTERSECT:
				case LIMIT:
				case ORDER:
				case RIGHT_PAREN:
				case WHERE:
					{
					alt127=1;
					}
					break;
				case UNION:
					{
					int LA127_6 = input.LA(3);
					if ( (LA127_6==JOIN) ) {
						alt127=2;
					}
					else if ( (LA127_6==ALL||LA127_6==DISTINCT||LA127_6==Identifier||LA127_6==LEFT_PAREN||LA127_6==SELECT) ) {
						alt127=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 127, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case CROSS:
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case NATURAL:
				case RIGHT:
					{
					alt127=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 127, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:975:5: table_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_table_primary_in_table_reference9114);
					table_primary309=table_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary309.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:976:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_table_reference9120);
					joined_table310=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table310.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, table_reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_reference"


	public static class joined_table_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joined_table"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:978:1: joined_table : table_primary ( cross_join | qualified_join | natural_join | union_join )+ ;
	public final DBLParser.joined_table_return joined_table() throws RecognitionException {
		DBLParser.joined_table_return retval = new DBLParser.joined_table_return();
		retval.start = input.LT(1);
		int joined_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary311 =null;
		ParserRuleReturnScope cross_join312 =null;
		ParserRuleReturnScope qualified_join313 =null;
		ParserRuleReturnScope natural_join314 =null;
		ParserRuleReturnScope union_join315 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:3: ( table_primary ( cross_join | qualified_join | natural_join | union_join )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:5: table_primary ( cross_join | qualified_join | natural_join | union_join )+
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_table_primary_in_joined_table9132);
			table_primary311=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary311.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:19: ( cross_join | qualified_join | natural_join | union_join )+
			int cnt128=0;
			loop128:
			while (true) {
				int alt128=5;
				switch ( input.LA(1) ) {
				case UNION:
					{
					int LA128_2 = input.LA(2);
					if ( (LA128_2==JOIN) ) {
						alt128=4;
					}

					}
					break;
				case CROSS:
					{
					alt128=1;
					}
					break;
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case RIGHT:
					{
					alt128=2;
					}
					break;
				case NATURAL:
					{
					alt128=3;
					}
					break;
				}
				switch (alt128) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:20: cross_join
					{
					pushFollow(FOLLOW_cross_join_in_joined_table9135);
					cross_join312=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join312.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:33: qualified_join
					{
					pushFollow(FOLLOW_qualified_join_in_joined_table9139);
					qualified_join313=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join313.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:50: natural_join
					{
					pushFollow(FOLLOW_natural_join_in_joined_table9143);
					natural_join314=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join314.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:979:65: union_join
					{
					pushFollow(FOLLOW_union_join_in_joined_table9147);
					union_join315=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join315.getTree());

					}
					break;

				default :
					if ( cnt128 >= 1 ) break loop128;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(128, input);
					throw eee;
				}
				cnt128++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, joined_table_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "joined_table"


	public static class joined_table_prim_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joined_table_prim"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:981:1: joined_table_prim : ( cross_join | qualified_join | natural_join | union_join );
	public final DBLParser.joined_table_prim_return joined_table_prim() throws RecognitionException {
		DBLParser.joined_table_prim_return retval = new DBLParser.joined_table_prim_return();
		retval.start = input.LT(1);
		int joined_table_prim_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope cross_join316 =null;
		ParserRuleReturnScope qualified_join317 =null;
		ParserRuleReturnScope natural_join318 =null;
		ParserRuleReturnScope union_join319 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:982:3: ( cross_join | qualified_join | natural_join | union_join )
			int alt129=4;
			switch ( input.LA(1) ) {
			case CROSS:
				{
				alt129=1;
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				{
				alt129=2;
				}
				break;
			case NATURAL:
				{
				alt129=3;
				}
				break;
			case UNION:
				{
				alt129=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:982:5: cross_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cross_join_in_joined_table_prim9161);
					cross_join316=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join316.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:983:5: qualified_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_join_in_joined_table_prim9167);
					qualified_join317=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join317.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:984:5: natural_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_natural_join_in_joined_table_prim9173);
					natural_join318=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join318.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:985:5: union_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_join_in_joined_table_prim9179);
					union_join319=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join319.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, joined_table_prim_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "joined_table_prim"


	public static class cross_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cross_join"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:987:1: cross_join : CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) ;
	public final DBLParser.cross_join_return cross_join() throws RecognitionException {
		DBLParser.cross_join_return retval = new DBLParser.cross_join_return();
		retval.start = input.LT(1);
		int cross_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CROSS320=null;
		Token JOIN321=null;
		ParserRuleReturnScope r =null;

		CommonTree CROSS320_tree=null;
		CommonTree JOIN321_tree=null;
		RewriteRuleTokenStream stream_CROSS=new RewriteRuleTokenStream(adaptor,"token CROSS");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:988:3: ( CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:988:5: CROSS JOIN r= table_primary
			{
			CROSS320=(Token)match(input,CROSS,FOLLOW_CROSS_in_cross_join9191); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CROSS.add(CROSS320);

			JOIN321=(Token)match(input,JOIN,FOLLOW_JOIN_in_cross_join9193); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN321);

			pushFollow(FOLLOW_table_primary_in_cross_join9197);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: r, JOIN, CROSS
			// token labels: 
			// rule labels: r, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 988:32: -> ^( JOIN CROSS $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:988:35: ^( JOIN CROSS $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_CROSS.nextNode());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, cross_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cross_join"


	public static class qualified_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified_join"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:990:1: qualified_join : (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) ;
	public final DBLParser.qualified_join_return qualified_join() throws RecognitionException {
		DBLParser.qualified_join_return retval = new DBLParser.qualified_join_return();
		retval.start = input.LT(1);
		int qualified_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token JOIN322=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope s =null;

		CommonTree JOIN322_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");
		RewriteRuleSubtreeStream stream_join_specification=new RewriteRuleSubtreeStream(adaptor,"rule join_specification");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:991:3: ( (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:991:5: (t= join_type )? JOIN r= table_primary s= join_specification
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:991:5: (t= join_type )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==FULL||LA130_0==INNER||LA130_0==LEFT||LA130_0==RIGHT) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:991:6: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_qualified_join9223);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN322=(Token)match(input,JOIN,FOLLOW_JOIN_in_qualified_join9227); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN322);

			pushFollow(FOLLOW_table_primary_in_qualified_join9231);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			pushFollow(FOLLOW_join_specification_in_qualified_join9235);
			s=join_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_specification.add(s.getTree());
			// AST REWRITE
			// elements: t, JOIN, r, s
			// token labels: 
			// rule labels: r, s, t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 991:62: -> ^( JOIN ( $t)? $r $s)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:991:65: ^( JOIN ( $t)? $r $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:991:73: ( $t)?
				if ( stream_t.hasNext() ) {
					adaptor.addChild(root_1, stream_t.nextTree());
				}
				stream_t.reset();

				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_1, stream_s.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, qualified_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualified_join"


	public static class natural_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "natural_join"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:993:1: natural_join : NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) ;
	public final DBLParser.natural_join_return natural_join() throws RecognitionException {
		DBLParser.natural_join_return retval = new DBLParser.natural_join_return();
		retval.start = input.LT(1);
		int natural_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NATURAL323=null;
		Token JOIN324=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;

		CommonTree NATURAL323_tree=null;
		CommonTree JOIN324_tree=null;
		RewriteRuleTokenStream stream_NATURAL=new RewriteRuleTokenStream(adaptor,"token NATURAL");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:994:3: ( NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:994:5: NATURAL (t= join_type )? JOIN r= table_primary
			{
			NATURAL323=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_natural_join9263); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NATURAL.add(NATURAL323);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:994:13: (t= join_type )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==FULL||LA131_0==INNER||LA131_0==LEFT||LA131_0==RIGHT) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:994:14: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_natural_join9268);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN324=(Token)match(input,JOIN,FOLLOW_JOIN_in_natural_join9272); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN324);

			pushFollow(FOLLOW_table_primary_in_natural_join9276);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: r, JOIN, NATURAL, t
			// token labels: 
			// rule labels: r, t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 994:49: -> ^( JOIN NATURAL ( $t)? $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:994:52: ^( JOIN NATURAL ( $t)? $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_NATURAL.nextNode());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:994:68: ( $t)?
				if ( stream_t.hasNext() ) {
					adaptor.addChild(root_1, stream_t.nextTree());
				}
				stream_t.reset();

				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, natural_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "natural_join"


	public static class union_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "union_join"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:996:1: union_join : UNION JOIN r= table_primary -> ^( JOIN UNION $r) ;
	public final DBLParser.union_join_return union_join() throws RecognitionException {
		DBLParser.union_join_return retval = new DBLParser.union_join_return();
		retval.start = input.LT(1);
		int union_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token UNION325=null;
		Token JOIN326=null;
		ParserRuleReturnScope r =null;

		CommonTree UNION325_tree=null;
		CommonTree JOIN326_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:997:3: ( UNION JOIN r= table_primary -> ^( JOIN UNION $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:997:5: UNION JOIN r= table_primary
			{
			UNION325=(Token)match(input,UNION,FOLLOW_UNION_in_union_join9303); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNION.add(UNION325);

			JOIN326=(Token)match(input,JOIN,FOLLOW_JOIN_in_union_join9305); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN326);

			pushFollow(FOLLOW_table_primary_in_union_join9309);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: r, UNION, JOIN
			// token labels: 
			// rule labels: r, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 997:32: -> ^( JOIN UNION $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:997:35: ^( JOIN UNION $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_UNION.nextNode());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, union_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "union_join"


	public static class join_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:999:1: join_type : ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) );
	public final DBLParser.join_type_return join_type() throws RecognitionException {
		DBLParser.join_type_return retval = new DBLParser.join_type_return();
		retval.start = input.LT(1);
		int join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INNER327=null;
		Token OUTER328=null;
		ParserRuleReturnScope t =null;

		CommonTree INNER327_tree=null;
		CommonTree OUTER328_tree=null;
		RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
		RewriteRuleSubtreeStream stream_outer_join_type=new RewriteRuleSubtreeStream(adaptor,"rule outer_join_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1000:3: ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) )
			int alt132=3;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==INNER) ) {
				alt132=1;
			}
			else if ( (LA132_0==FULL||LA132_0==LEFT||LA132_0==RIGHT) ) {
				int LA132_2 = input.LA(2);
				if ( (LA132_2==OUTER) ) {
					alt132=2;
				}
				else if ( (LA132_2==EOF||LA132_2==JOIN) ) {
					alt132=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 132, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1000:5: INNER
					{
					root_0 = (CommonTree)adaptor.nil();


					INNER327=(Token)match(input,INNER,FOLLOW_INNER_in_join_type9332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INNER327_tree = (CommonTree)adaptor.create(INNER327);
					adaptor.addChild(root_0, INNER327_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1001:5: t= outer_join_type OUTER
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type9340);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					OUTER328=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_type9342); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTER.add(OUTER328);

					// AST REWRITE
					// elements: t, OUTER
					// token labels: 
					// rule labels: t, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1001:29: -> ^( OUTER $t)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1001:32: ^( OUTER $t)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_OUTER.nextNode(), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1002:5: t= outer_join_type
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type9359);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					// AST REWRITE
					// elements: t
					// token labels: 
					// rule labels: t, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1002:23: -> ^( OUTER $t)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1002:26: ^( OUTER $t)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OUTER, "OUTER"), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, join_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "join_type"


	public static class outer_join_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "outer_join_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1004:1: outer_join_type : ( LEFT | RIGHT | FULL );
	public final DBLParser.outer_join_type_return outer_join_type() throws RecognitionException {
		DBLParser.outer_join_type_return retval = new DBLParser.outer_join_type_return();
		retval.start = input.LT(1);
		int outer_join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set329=null;

		CommonTree set329_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1005:3: ( LEFT | RIGHT | FULL )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set329=input.LT(1);
			if ( input.LA(1)==FULL||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set329));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, outer_join_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "outer_join_type"


	public static class join_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_specification"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1009:1: join_specification : ( join_condition | named_columns_join );
	public final DBLParser.join_specification_return join_specification() throws RecognitionException {
		DBLParser.join_specification_return retval = new DBLParser.join_specification_return();
		retval.start = input.LT(1);
		int join_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope join_condition330 =null;
		ParserRuleReturnScope named_columns_join331 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1010:3: ( join_condition | named_columns_join )
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==ON) ) {
				alt133=1;
			}
			else if ( (LA133_0==USING) ) {
				alt133=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}

			switch (alt133) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1010:5: join_condition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_join_condition_in_join_specification9404);
					join_condition330=join_condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join_condition330.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1011:5: named_columns_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_named_columns_join_in_join_specification9410);
					named_columns_join331=named_columns_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, named_columns_join331.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, join_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "join_specification"


	public static class join_condition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_condition"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1013:1: join_condition : ON ^ search_condition ;
	public final DBLParser.join_condition_return join_condition() throws RecognitionException {
		DBLParser.join_condition_return retval = new DBLParser.join_condition_return();
		retval.start = input.LT(1);
		int join_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ON332=null;
		ParserRuleReturnScope search_condition333 =null;

		CommonTree ON332_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1014:3: ( ON ^ search_condition )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1014:5: ON ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			ON332=(Token)match(input,ON,FOLLOW_ON_in_join_condition9422); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON332_tree = (CommonTree)adaptor.create(ON332);
			root_0 = (CommonTree)adaptor.becomeRoot(ON332_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_join_condition9425);
			search_condition333=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition333.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, join_condition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "join_condition"


	public static class named_columns_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "named_columns_join"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1016:1: named_columns_join : USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) ;
	public final DBLParser.named_columns_join_return named_columns_join() throws RecognitionException {
		DBLParser.named_columns_join_return retval = new DBLParser.named_columns_join_return();
		retval.start = input.LT(1);
		int named_columns_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token USING334=null;
		Token LEFT_PAREN335=null;
		Token RIGHT_PAREN336=null;
		ParserRuleReturnScope f =null;

		CommonTree USING334_tree=null;
		CommonTree LEFT_PAREN335_tree=null;
		CommonTree RIGHT_PAREN336_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1017:3: ( USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1017:5: USING LEFT_PAREN f= column_reference_list RIGHT_PAREN
			{
			USING334=(Token)match(input,USING,FOLLOW_USING_in_named_columns_join9437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING334);

			LEFT_PAREN335=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_named_columns_join9439); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN335);

			pushFollow(FOLLOW_column_reference_list_in_named_columns_join9443);
			f=column_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference_list.add(f.getTree());
			RIGHT_PAREN336=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_named_columns_join9445); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN336);

			// AST REWRITE
			// elements: f, USING
			// token labels: 
			// rule labels: f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1017:58: -> ^( USING $f)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1017:61: ^( USING $f)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, named_columns_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "named_columns_join"


	public static class table_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_primary"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1019:1: table_primary : table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) ;
	public final DBLParser.table_primary_return table_primary() throws RecognitionException {
		DBLParser.table_primary_return retval = new DBLParser.table_primary_return();
		retval.start = input.LT(1);
		int table_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token AS338=null;
		ParserRuleReturnScope table337 =null;

		CommonTree a_tree=null;
		CommonTree AS338_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:3: ( table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:5: table ( ( AS )? a= Identifier )?
			{
			pushFollow(FOLLOW_table_in_table_primary9466);
			table337=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table337.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:11: ( ( AS )? a= Identifier )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==AS||LA135_0==Identifier) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:12: ( AS )? a= Identifier
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:12: ( AS )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==AS) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:13: AS
							{
							AS338=(Token)match(input,AS,FOLLOW_AS_in_table_primary9470); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS338);

							}
							break;

					}

					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_table_primary9476); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(a);

					}
					break;

			}

			// AST REWRITE
			// elements: table, a
			// token labels: a
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1020:33: -> ^( TABLE table ( $a)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:36: ^( TABLE table ( $a)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_1);
				adaptor.addChild(root_1, stream_table.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1020:50: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextNode());
				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, table_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_primary"


	public static class where_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1022:1: where_clause : WHERE ^ search_condition ;
	public final DBLParser.where_clause_return where_clause() throws RecognitionException {
		DBLParser.where_clause_return retval = new DBLParser.where_clause_return();
		retval.start = input.LT(1);
		int where_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHERE339=null;
		ParserRuleReturnScope search_condition340 =null;

		CommonTree WHERE339_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1023:3: ( WHERE ^ search_condition )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1023:5: WHERE ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			WHERE339=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause9504); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE339_tree = (CommonTree)adaptor.create(WHERE339);
			root_0 = (CommonTree)adaptor.becomeRoot(WHERE339_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_where_clause9507);
			search_condition340=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition340.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, where_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "where_clause"


	public static class routine_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "routine_invocation"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1031:1: routine_invocation : ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) );
	public final DBLParser.routine_invocation_return routine_invocation() throws RecognitionException {
		DBLParser.routine_invocation_return retval = new DBLParser.routine_invocation_return();
		retval.start = input.LT(1);
		int routine_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier341=null;
		Token LEFT_PAREN342=null;
		Token RIGHT_PAREN344=null;
		Token COUNT345=null;
		Token LEFT_PAREN346=null;
		Token RIGHT_PAREN348=null;
		Token COUNT349=null;
		Token LEFT_PAREN350=null;
		Token MULTIPLY351=null;
		Token RIGHT_PAREN352=null;
		ParserRuleReturnScope funcArgs343 =null;
		ParserRuleReturnScope funcArgs347 =null;

		CommonTree Identifier341_tree=null;
		CommonTree LEFT_PAREN342_tree=null;
		CommonTree RIGHT_PAREN344_tree=null;
		CommonTree COUNT345_tree=null;
		CommonTree LEFT_PAREN346_tree=null;
		CommonTree RIGHT_PAREN348_tree=null;
		CommonTree COUNT349_tree=null;
		CommonTree LEFT_PAREN350_tree=null;
		CommonTree MULTIPLY351_tree=null;
		CommonTree RIGHT_PAREN352_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1032:2: ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) )
			int alt137=3;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==Identifier) ) {
				alt137=1;
			}
			else if ( (LA137_0==COUNT) ) {
				int LA137_2 = input.LA(2);
				if ( (LA137_2==LEFT_PAREN) ) {
					int LA137_3 = input.LA(3);
					if ( (LA137_3==MULTIPLY) ) {
						alt137=3;
					}
					else if ( (LA137_3==CASE||LA137_3==COUNT||LA137_3==Character_String_Literal||LA137_3==Identifier||LA137_3==LEFT_PAREN||LA137_3==MINUS||LA137_3==NOT||LA137_3==NULL||LA137_3==NUMBER||LA137_3==PLUS||LA137_3==REAL_NUMBER) ) {
						alt137=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 137, 3, input);
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
							new NoViableAltException("", 137, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				throw nvae;
			}

			switch (alt137) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1032:4: Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN
					{
					Identifier341=(Token)match(input,Identifier,FOLLOW_Identifier_in_routine_invocation9520); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier341);

					LEFT_PAREN342=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation9522); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN342);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1032:26: ( funcArgs )?
					int alt136=2;
					int LA136_0 = input.LA(1);
					if ( (LA136_0==CASE||LA136_0==COUNT||LA136_0==Character_String_Literal||LA136_0==Identifier||LA136_0==LEFT_PAREN||LA136_0==MINUS||LA136_0==NOT||LA136_0==NULL||LA136_0==NUMBER||LA136_0==PLUS||LA136_0==REAL_NUMBER) ) {
						alt136=1;
					}
					switch (alt136) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1032:26: funcArgs
							{
							pushFollow(FOLLOW_funcArgs_in_routine_invocation9524);
							funcArgs343=funcArgs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs343.getTree());
							}
							break;

					}

					RIGHT_PAREN344=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation9527); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN344);

					// AST REWRITE
					// elements: funcArgs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1032:48: -> ^( FUNCTION[$Identifier.text] ( funcArgs )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1032:51: ^( FUNCTION[$Identifier.text] ( funcArgs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (Identifier341!=null?Identifier341.getText():null)), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1032:80: ( funcArgs )?
						if ( stream_funcArgs.hasNext() ) {
							adaptor.addChild(root_1, stream_funcArgs.nextTree());
						}
						stream_funcArgs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1033:4: COUNT LEFT_PAREN funcArgs RIGHT_PAREN
					{
					COUNT345=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation9542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT345);

					LEFT_PAREN346=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation9544); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN346);

					pushFollow(FOLLOW_funcArgs_in_routine_invocation9546);
					funcArgs347=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs347.getTree());
					RIGHT_PAREN348=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation9548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN348);

					// AST REWRITE
					// elements: funcArgs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1033:42: -> ^( COUNT_VAL funcArgs )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1033:45: ^( COUNT_VAL funcArgs )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COUNT_VAL, "COUNT_VAL"), root_1);
						adaptor.addChild(root_1, stream_funcArgs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1034:4: COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN
					{
					COUNT349=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation9561); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT349);

					LEFT_PAREN350=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation9563); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN350);

					MULTIPLY351=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_routine_invocation9565); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY351);

					RIGHT_PAREN352=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation9567); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN352);

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
					// 1034:42: -> ^( COUNT_ROWS )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1034:45: ^( COUNT_ROWS )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COUNT_ROWS, "COUNT_ROWS"), root_1);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, routine_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "routine_invocation"


	public static class funcArgs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "funcArgs"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1036:1: funcArgs : boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ ;
	public final DBLParser.funcArgs_return funcArgs() throws RecognitionException {
		DBLParser.funcArgs_return retval = new DBLParser.funcArgs_return();
		retval.start = input.LT(1);
		int funcArgs_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA354=null;
		ParserRuleReturnScope boolean_value_expression353 =null;
		ParserRuleReturnScope boolean_value_expression355 =null;

		CommonTree COMMA354_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1037:3: ( boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1037:5: boolean_value_expression ( COMMA boolean_value_expression )*
			{
			pushFollow(FOLLOW_boolean_value_expression_in_funcArgs9584);
			boolean_value_expression353=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression353.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1037:30: ( COMMA boolean_value_expression )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==COMMA) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1037:31: COMMA boolean_value_expression
					{
					COMMA354=(Token)match(input,COMMA,FOLLOW_COMMA_in_funcArgs9587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA354);

					pushFollow(FOLLOW_boolean_value_expression_in_funcArgs9589);
					boolean_value_expression355=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression355.getTree());
					}
					break;

				default :
					break loop138;
				}
			}

			// AST REWRITE
			// elements: boolean_value_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1037:64: -> ( boolean_value_expression )+
			{
				if ( !(stream_boolean_value_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_boolean_value_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_boolean_value_expression.nextTree());
				}
				stream_boolean_value_expression.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, funcArgs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "funcArgs"


	public static class groupby_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "groupby_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1044:1: groupby_clause : GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) ;
	public final DBLParser.groupby_clause_return groupby_clause() throws RecognitionException {
		DBLParser.groupby_clause_return retval = new DBLParser.groupby_clause_return();
		retval.start = input.LT(1);
		int groupby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token GROUP356=null;
		Token BY357=null;
		ParserRuleReturnScope g =null;

		CommonTree GROUP356_tree=null;
		CommonTree BY357_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_grouping_element_list=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1045:3: ( GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1045:5: GROUP BY g= grouping_element_list
			{
			GROUP356=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause9610); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(GROUP356);

			BY357=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause9612); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY357);

			pushFollow(FOLLOW_grouping_element_list_in_groupby_clause9616);
			g=grouping_element_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element_list.add(g.getTree());
			// AST REWRITE
			// elements: g
			// token labels: 
			// rule labels: g, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_g=new RewriteRuleSubtreeStream(adaptor,"rule g",g!=null?g.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1045:38: -> ^( GROUP_BY $g)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1045:41: ^( GROUP_BY $g)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP_BY, "GROUP_BY"), root_1);
				adaptor.addChild(root_1, stream_g.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, groupby_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "groupby_clause"


	public static class grouping_element_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "grouping_element_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1047:1: grouping_element_list : grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ ;
	public final DBLParser.grouping_element_list_return grouping_element_list() throws RecognitionException {
		DBLParser.grouping_element_list_return retval = new DBLParser.grouping_element_list_return();
		retval.start = input.LT(1);
		int grouping_element_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA359=null;
		ParserRuleReturnScope grouping_element358 =null;
		ParserRuleReturnScope grouping_element360 =null;

		CommonTree COMMA359_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_grouping_element=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1048:3: ( grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1048:5: grouping_element ( COMMA grouping_element )*
			{
			pushFollow(FOLLOW_grouping_element_in_grouping_element_list9637);
			grouping_element358=grouping_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element358.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1048:22: ( COMMA grouping_element )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==COMMA) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1048:23: COMMA grouping_element
					{
					COMMA359=(Token)match(input,COMMA,FOLLOW_COMMA_in_grouping_element_list9640); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA359);

					pushFollow(FOLLOW_grouping_element_in_grouping_element_list9642);
					grouping_element360=grouping_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element360.getTree());
					}
					break;

				default :
					break loop139;
				}
			}

			// AST REWRITE
			// elements: grouping_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1048:48: -> ( grouping_element )+
			{
				if ( !(stream_grouping_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_grouping_element.hasNext() ) {
					adaptor.addChild(root_0, stream_grouping_element.nextTree());
				}
				stream_grouping_element.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, grouping_element_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "grouping_element_list"


	public static class grouping_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "grouping_element"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1050:1: grouping_element : ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set );
	public final DBLParser.grouping_element_return grouping_element() throws RecognitionException {
		DBLParser.grouping_element_return retval = new DBLParser.grouping_element_return();
		retval.start = input.LT(1);
		int grouping_element_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ordinary_grouping_set361 =null;
		ParserRuleReturnScope rollup_list362 =null;
		ParserRuleReturnScope cube_list363 =null;
		ParserRuleReturnScope empty_grouping_set364 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1051:3: ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set )
			int alt140=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt140=1;
				}
				break;
			case LEFT_PAREN:
				{
				int LA140_2 = input.LA(2);
				if ( (LA140_2==RIGHT_PAREN) ) {
					alt140=4;
				}
				else if ( (LA140_2==Identifier) ) {
					alt140=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 140, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ROLLUP:
				{
				alt140=2;
				}
				break;
			case CUBE:
				{
				alt140=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}
			switch (alt140) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1051:5: ordinary_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_element9661);
					ordinary_grouping_set361=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinary_grouping_set361.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1052:5: rollup_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollup_list_in_grouping_element9667);
					rollup_list362=rollup_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollup_list362.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1053:5: cube_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cube_list_in_grouping_element9673);
					cube_list363=cube_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cube_list363.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1054:5: empty_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_empty_grouping_set_in_grouping_element9679);
					empty_grouping_set364=empty_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_grouping_set364.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, grouping_element_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "grouping_element"


	public static class ordinary_grouping_set_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ordinary_grouping_set"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1056:1: ordinary_grouping_set : ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !);
	public final DBLParser.ordinary_grouping_set_return ordinary_grouping_set() throws RecognitionException {
		DBLParser.ordinary_grouping_set_return retval = new DBLParser.ordinary_grouping_set_return();
		retval.start = input.LT(1);
		int ordinary_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN366=null;
		Token RIGHT_PAREN368=null;
		ParserRuleReturnScope column_reference_list365 =null;
		ParserRuleReturnScope column_reference_list367 =null;

		CommonTree LEFT_PAREN366_tree=null;
		CommonTree RIGHT_PAREN368_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1057:3: ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !)
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==Identifier) ) {
				alt141=1;
			}
			else if ( (LA141_0==LEFT_PAREN) ) {
				alt141=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}

			switch (alt141) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1057:5: column_reference_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set9691);
					column_reference_list365=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list365.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1058:5: LEFT_PAREN ! column_reference_list RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN366=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_ordinary_grouping_set9697); if (state.failed) return retval;
					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set9700);
					column_reference_list367=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list367.getTree());

					RIGHT_PAREN368=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set9702); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, ordinary_grouping_set_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ordinary_grouping_set"


	public static class rollup_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rollup_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1060:1: rollup_list : ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) ;
	public final DBLParser.rollup_list_return rollup_list() throws RecognitionException {
		DBLParser.rollup_list_return retval = new DBLParser.rollup_list_return();
		retval.start = input.LT(1);
		int rollup_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ROLLUP369=null;
		Token LEFT_PAREN370=null;
		Token RIGHT_PAREN371=null;
		ParserRuleReturnScope c =null;

		CommonTree ROLLUP369_tree=null;
		CommonTree LEFT_PAREN370_tree=null;
		CommonTree RIGHT_PAREN371_tree=null;
		RewriteRuleTokenStream stream_ROLLUP=new RewriteRuleTokenStream(adaptor,"token ROLLUP");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1061:3: ( ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1061:5: ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			ROLLUP369=(Token)match(input,ROLLUP,FOLLOW_ROLLUP_in_rollup_list9715); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLUP.add(ROLLUP369);

			LEFT_PAREN370=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_rollup_list9717); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN370);

			pushFollow(FOLLOW_ordinary_grouping_set_in_rollup_list9721);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN371=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_rollup_list9723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN371);

			// AST REWRITE
			// elements: ROLLUP, c
			// token labels: 
			// rule labels: c, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1061:59: -> ^( ROLLUP $c)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1061:62: ^( ROLLUP $c)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ROLLUP.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, rollup_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rollup_list"


	public static class cube_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cube_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1063:1: cube_list : CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) ;
	public final DBLParser.cube_list_return cube_list() throws RecognitionException {
		DBLParser.cube_list_return retval = new DBLParser.cube_list_return();
		retval.start = input.LT(1);
		int cube_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CUBE372=null;
		Token LEFT_PAREN373=null;
		Token RIGHT_PAREN374=null;
		ParserRuleReturnScope c =null;

		CommonTree CUBE372_tree=null;
		CommonTree LEFT_PAREN373_tree=null;
		CommonTree RIGHT_PAREN374_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CUBE=new RewriteRuleTokenStream(adaptor,"token CUBE");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1064:3: ( CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1064:5: CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			CUBE372=(Token)match(input,CUBE,FOLLOW_CUBE_in_cube_list9744); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CUBE.add(CUBE372);

			LEFT_PAREN373=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cube_list9746); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN373);

			pushFollow(FOLLOW_ordinary_grouping_set_in_cube_list9750);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN374=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cube_list9752); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN374);

			// AST REWRITE
			// elements: CUBE, c
			// token labels: 
			// rule labels: c, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1064:57: -> ^( CUBE $c)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1064:60: ^( CUBE $c)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_CUBE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, cube_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cube_list"


	public static class empty_grouping_set_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "empty_grouping_set"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1066:1: empty_grouping_set : LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) ;
	public final DBLParser.empty_grouping_set_return empty_grouping_set() throws RecognitionException {
		DBLParser.empty_grouping_set_return retval = new DBLParser.empty_grouping_set_return();
		retval.start = input.LT(1);
		int empty_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN375=null;
		Token RIGHT_PAREN376=null;

		CommonTree LEFT_PAREN375_tree=null;
		CommonTree RIGHT_PAREN376_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1067:3: ( LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1067:5: LEFT_PAREN RIGHT_PAREN
			{
			LEFT_PAREN375=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_empty_grouping_set9773); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN375);

			RIGHT_PAREN376=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_empty_grouping_set9775); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN376);

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
			// 1067:28: -> ^( EMPTY_GROUPING_SET )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1067:31: ^( EMPTY_GROUPING_SET )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_GROUPING_SET, "EMPTY_GROUPING_SET"), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, empty_grouping_set_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "empty_grouping_set"


	public static class having_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "having_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1069:1: having_clause : HAVING ^ boolean_value_expression ;
	public final DBLParser.having_clause_return having_clause() throws RecognitionException {
		DBLParser.having_clause_return retval = new DBLParser.having_clause_return();
		retval.start = input.LT(1);
		int having_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token HAVING377=null;
		ParserRuleReturnScope boolean_value_expression378 =null;

		CommonTree HAVING377_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1070:3: ( HAVING ^ boolean_value_expression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1070:5: HAVING ^ boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			HAVING377=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause9793); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			HAVING377_tree = (CommonTree)adaptor.create(HAVING377);
			root_0 = (CommonTree)adaptor.becomeRoot(HAVING377_tree, root_0);
			}

			pushFollow(FOLLOW_boolean_value_expression_in_having_clause9796);
			boolean_value_expression378=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression378.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, having_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "having_clause"


	public static class orderby_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "orderby_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1078:1: orderby_clause : ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) ;
	public final DBLParser.orderby_clause_return orderby_clause() throws RecognitionException {
		DBLParser.orderby_clause_return retval = new DBLParser.orderby_clause_return();
		retval.start = input.LT(1);
		int orderby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ORDER379=null;
		Token BY380=null;
		ParserRuleReturnScope sort_specifier_list381 =null;

		CommonTree ORDER379_tree=null;
		CommonTree BY380_tree=null;
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1079:3: ( ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1079:5: ORDER BY sort_specifier_list
			{
			ORDER379=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause9810); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(ORDER379);

			BY380=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause9812); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY380);

			pushFollow(FOLLOW_sort_specifier_list_in_orderby_clause9814);
			sort_specifier_list381=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(sort_specifier_list381.getTree());
			// AST REWRITE
			// elements: sort_specifier_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1079:34: -> ^( ORDER_BY sort_specifier_list )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1079:37: ^( ORDER_BY sort_specifier_list )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDER_BY, "ORDER_BY"), root_1);
				adaptor.addChild(root_1, stream_sort_specifier_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, orderby_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "orderby_clause"


	public static class sort_specifier_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sort_specifier_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1081:1: sort_specifier_list : sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) ;
	public final DBLParser.sort_specifier_list_return sort_specifier_list() throws RecognitionException {
		DBLParser.sort_specifier_list_return retval = new DBLParser.sort_specifier_list_return();
		retval.start = input.LT(1);
		int sort_specifier_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA383=null;
		ParserRuleReturnScope sort_specifier382 =null;
		ParserRuleReturnScope sort_specifier384 =null;

		CommonTree COMMA383_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_sort_specifier=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1082:3: ( sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1082:5: sort_specifier ( COMMA sort_specifier )*
			{
			pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list9834);
			sort_specifier382=sort_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier382.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1082:20: ( COMMA sort_specifier )*
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==COMMA) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1082:21: COMMA sort_specifier
					{
					COMMA383=(Token)match(input,COMMA,FOLLOW_COMMA_in_sort_specifier_list9837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA383);

					pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list9839);
					sort_specifier384=sort_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier384.getTree());
					}
					break;

				default :
					break loop142;
				}
			}

			// AST REWRITE
			// elements: sort_specifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1082:44: -> ^( SORT_SPECIFIERS ( sort_specifier )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1082:47: ^( SORT_SPECIFIERS ( sort_specifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_SPECIFIERS, "SORT_SPECIFIERS"), root_1);
				if ( !(stream_sort_specifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_sort_specifier.hasNext() ) {
					adaptor.addChild(root_1, stream_sort_specifier.nextTree());
				}
				stream_sort_specifier.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, sort_specifier_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sort_specifier_list"


	public static class sort_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sort_specifier"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1084:1: sort_specifier : fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) ;
	public final DBLParser.sort_specifier_return sort_specifier() throws RecognitionException {
		DBLParser.sort_specifier_return retval = new DBLParser.sort_specifier_return();
		retval.start = input.LT(1);
		int sort_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope fn =null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope o =null;

		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");
		RewriteRuleSubtreeStream stream_null_ordering=new RewriteRuleSubtreeStream(adaptor,"rule null_ordering");
		RewriteRuleSubtreeStream stream_order_specification=new RewriteRuleSubtreeStream(adaptor,"rule order_specification");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:3: (fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:5: fn= column_reference (a= order_specification )? (o= null_ordering )?
			{
			pushFollow(FOLLOW_column_reference_in_sort_specifier9864);
			fn=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(fn.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:26: (a= order_specification )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==ASC||LA143_0==DESC) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:26: a= order_specification
					{
					pushFollow(FOLLOW_order_specification_in_sort_specifier9868);
					a=order_specification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_order_specification.add(a.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:49: (o= null_ordering )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==NULL) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:49: o= null_ordering
					{
					pushFollow(FOLLOW_null_ordering_in_sort_specifier9873);
					o=null_ordering();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_null_ordering.add(o.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: fn, o, a
			// token labels: 
			// rule labels: a, fn, retval, o
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_fn=new RewriteRuleSubtreeStream(adaptor,"rule fn",fn!=null?fn.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1085:65: -> ^( SORT_KEY $fn ( $a)? ( $o)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:68: ^( SORT_KEY $fn ( $a)? ( $o)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_KEY, "SORT_KEY"), root_1);
				adaptor.addChild(root_1, stream_fn.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:84: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1085:88: ( $o)?
				if ( stream_o.hasNext() ) {
					adaptor.addChild(root_1, stream_o.nextTree());
				}
				stream_o.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, sort_specifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sort_specifier"


	public static class order_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "order_specification"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1087:1: order_specification : ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) );
	public final DBLParser.order_specification_return order_specification() throws RecognitionException {
		DBLParser.order_specification_return retval = new DBLParser.order_specification_return();
		retval.start = input.LT(1);
		int order_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASC385=null;
		Token DESC386=null;

		CommonTree ASC385_tree=null;
		CommonTree DESC386_tree=null;
		RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1088:3: ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==ASC) ) {
				alt145=1;
			}
			else if ( (LA145_0==DESC) ) {
				alt145=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1088:5: ASC
					{
					ASC385=(Token)match(input,ASC,FOLLOW_ASC_in_order_specification9903); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASC.add(ASC385);

					// AST REWRITE
					// elements: ASC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1088:9: -> ^( ORDER ASC )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1088:12: ^( ORDER ASC )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDER, "ORDER"), root_1);
						adaptor.addChild(root_1, stream_ASC.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1089:5: DESC
					{
					DESC386=(Token)match(input,DESC,FOLLOW_DESC_in_order_specification9917); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESC.add(DESC386);

					// AST REWRITE
					// elements: DESC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1089:10: -> ^( ORDER DESC )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1089:13: ^( ORDER DESC )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDER, "ORDER"), root_1);
						adaptor.addChild(root_1, stream_DESC.nextNode());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, order_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "order_specification"


	public static class limit_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "limit_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1091:1: limit_clause : LIMIT e= numeric_value_expression -> ^( LIMIT $e) ;
	public final DBLParser.limit_clause_return limit_clause() throws RecognitionException {
		DBLParser.limit_clause_return retval = new DBLParser.limit_clause_return();
		retval.start = input.LT(1);
		int limit_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LIMIT387=null;
		ParserRuleReturnScope e =null;

		CommonTree LIMIT387_tree=null;
		RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1092:3: ( LIMIT e= numeric_value_expression -> ^( LIMIT $e) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1092:5: LIMIT e= numeric_value_expression
			{
			LIMIT387=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limit_clause9937); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT387);

			pushFollow(FOLLOW_numeric_value_expression_in_limit_clause9941);
			e=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(e.getTree());
			// AST REWRITE
			// elements: LIMIT, e
			// token labels: 
			// rule labels: e, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1092:38: -> ^( LIMIT $e)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1092:41: ^( LIMIT $e)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_e.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, limit_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "limit_clause"


	public static class null_ordering_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "null_ordering"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1094:1: null_ordering : ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) );
	public final DBLParser.null_ordering_return null_ordering() throws RecognitionException {
		DBLParser.null_ordering_return retval = new DBLParser.null_ordering_return();
		retval.start = input.LT(1);
		int null_ordering_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL388=null;
		Token FIRST389=null;
		Token NULL390=null;
		Token LAST391=null;

		CommonTree NULL388_tree=null;
		CommonTree FIRST389_tree=null;
		CommonTree NULL390_tree=null;
		CommonTree LAST391_tree=null;
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1095:3: ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==NULL) ) {
				int LA146_1 = input.LA(2);
				if ( (LA146_1==FIRST) ) {
					alt146=1;
				}
				else if ( (LA146_1==LAST) ) {
					alt146=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 146, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}

			switch (alt146) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1095:5: NULL FIRST
					{
					NULL388=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering9962); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL388);

					FIRST389=(Token)match(input,FIRST,FOLLOW_FIRST_in_null_ordering9964); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIRST.add(FIRST389);

					// AST REWRITE
					// elements: FIRST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1095:16: -> ^( NULL_ORDER FIRST )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1095:19: ^( NULL_ORDER FIRST )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NULL_ORDER, "NULL_ORDER"), root_1);
						adaptor.addChild(root_1, stream_FIRST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1096:5: NULL LAST
					{
					NULL390=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering9978); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL390);

					LAST391=(Token)match(input,LAST,FOLLOW_LAST_in_null_ordering9980); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LAST.add(LAST391);

					// AST REWRITE
					// elements: LAST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1096:15: -> ^( NULL_ORDER LAST )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1096:18: ^( NULL_ORDER LAST )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NULL_ORDER, "NULL_ORDER"), root_1);
						adaptor.addChild(root_1, stream_LAST.nextNode());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 113, null_ordering_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "null_ordering"


	public static class search_condition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "search_condition"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1105:1: search_condition : boolean_value_expression ;
	public final DBLParser.search_condition_return search_condition() throws RecognitionException {
		DBLParser.search_condition_return retval = new DBLParser.search_condition_return();
		retval.start = input.LT(1);
		int search_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression392 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1106:2: ( boolean_value_expression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1106:4: boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_value_expression_in_search_condition10002);
			boolean_value_expression392=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression392.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 114, search_condition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "search_condition"


	public static class param_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1108:1: param_clause : WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) ;
	public final DBLParser.param_clause_return param_clause() throws RecognitionException {
		DBLParser.param_clause_return retval = new DBLParser.param_clause_return();
		retval.start = input.LT(1);
		int param_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH393=null;
		Token LEFT_PAREN394=null;
		Token COMMA396=null;
		Token RIGHT_PAREN398=null;
		ParserRuleReturnScope param395 =null;
		ParserRuleReturnScope param397 =null;

		CommonTree WITH393_tree=null;
		CommonTree LEFT_PAREN394_tree=null;
		CommonTree COMMA396_tree=null;
		CommonTree RIGHT_PAREN398_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1109:3: ( WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1109:5: WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN
			{
			WITH393=(Token)match(input,WITH,FOLLOW_WITH_in_param_clause10013); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH393);

			LEFT_PAREN394=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_param_clause10015); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN394);

			pushFollow(FOLLOW_param_in_param_clause10017);
			param395=param();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_param.add(param395.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1109:27: ( COMMA param )*
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==COMMA) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1109:28: COMMA param
					{
					COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_clause10020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA396);

					pushFollow(FOLLOW_param_in_param_clause10022);
					param397=param();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param.add(param397.getTree());
					}
					break;

				default :
					break loop147;
				}
			}

			RIGHT_PAREN398=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_param_clause10026); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN398);

			// AST REWRITE
			// elements: param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1109:54: -> ^( PARAMS ( param )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1109:57: ^( PARAMS ( param )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_1);
				if ( !(stream_param.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_param.hasNext() ) {
					adaptor.addChild(root_1, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 115, param_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "param_clause"


	public static class param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1111:1: param : k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) ;
	public final DBLParser.param_return param() throws RecognitionException {
		DBLParser.param_return retval = new DBLParser.param_return();
		retval.start = input.LT(1);
		int param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token k=null;
		Token EQUAL399=null;
		ParserRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree EQUAL399_tree=null;
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1112:3: (k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1112:5: k= Character_String_Literal EQUAL v= numeric_value_expression
			{
			k=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_param10049); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(k);

			EQUAL399=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_param10051); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL399);

			pushFollow(FOLLOW_numeric_value_expression_in_param10055);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// AST REWRITE
			// elements: k, v
			// token labels: k
			// rule labels: v, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1112:65: -> ^( PARAM $k $v)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1112:68: ^( PARAM $k $v)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
				adaptor.addChild(root_1, stream_k.nextNode());
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 116, param_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "param"


	public static class method_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_specifier"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1114:1: method_specifier : USING m= Identifier -> ^( USING[$m.text] ) ;
	public final DBLParser.method_specifier_return method_specifier() throws RecognitionException {
		DBLParser.method_specifier_return retval = new DBLParser.method_specifier_return();
		retval.start = input.LT(1);
		int method_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token m=null;
		Token USING400=null;

		CommonTree m_tree=null;
		CommonTree USING400_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1115:3: ( USING m= Identifier -> ^( USING[$m.text] ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1115:5: USING m= Identifier
			{
			USING400=(Token)match(input,USING,FOLLOW_USING_in_method_specifier10079); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING400);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_method_specifier10083); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			// AST REWRITE
			// elements: USING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1115:24: -> ^( USING[$m.text] )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1115:27: ^( USING[$m.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING, (m!=null?m.getText():null)), root_1);
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 117, method_specifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "method_specifier"


	public static class boolean_value_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_value_expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1122:1: boolean_value_expression : and_predicate ( OR ^ and_predicate )* ;
	public final DBLParser.boolean_value_expression_return boolean_value_expression() throws RecognitionException {
		DBLParser.boolean_value_expression_return retval = new DBLParser.boolean_value_expression_return();
		retval.start = input.LT(1);
		int boolean_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR402=null;
		ParserRuleReturnScope and_predicate401 =null;
		ParserRuleReturnScope and_predicate403 =null;

		CommonTree OR402_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1123:2: ( and_predicate ( OR ^ and_predicate )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1123:4: and_predicate ( OR ^ and_predicate )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_predicate_in_boolean_value_expression10103);
			and_predicate401=and_predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate401.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1123:18: ( OR ^ and_predicate )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==OR) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1123:19: OR ^ and_predicate
					{
					OR402=(Token)match(input,OR,FOLLOW_OR_in_boolean_value_expression10106); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR402_tree = (CommonTree)adaptor.create(OR402);
					root_0 = (CommonTree)adaptor.becomeRoot(OR402_tree, root_0);
					}

					pushFollow(FOLLOW_and_predicate_in_boolean_value_expression10109);
					and_predicate403=and_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate403.getTree());

					}
					break;

				default :
					break loop148;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 118, boolean_value_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_value_expression"


	public static class and_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "and_predicate"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1125:1: and_predicate : boolean_factor ( AND ^ boolean_factor )* ;
	public final DBLParser.and_predicate_return and_predicate() throws RecognitionException {
		DBLParser.and_predicate_return retval = new DBLParser.and_predicate_return();
		retval.start = input.LT(1);
		int and_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AND405=null;
		ParserRuleReturnScope boolean_factor404 =null;
		ParserRuleReturnScope boolean_factor406 =null;

		CommonTree AND405_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1126:3: ( boolean_factor ( AND ^ boolean_factor )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1126:5: boolean_factor ( AND ^ boolean_factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_and_predicate10122);
			boolean_factor404=boolean_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor404.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1126:20: ( AND ^ boolean_factor )*
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==AND) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1126:21: AND ^ boolean_factor
					{
					AND405=(Token)match(input,AND,FOLLOW_AND_in_and_predicate10125); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND405_tree = (CommonTree)adaptor.create(AND405);
					root_0 = (CommonTree)adaptor.becomeRoot(AND405_tree, root_0);
					}

					pushFollow(FOLLOW_boolean_factor_in_and_predicate10128);
					boolean_factor406=boolean_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor406.getTree());

					}
					break;

				default :
					break loop149;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 119, and_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "and_predicate"


	public static class boolean_factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_factor"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1128:1: boolean_factor : ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) );
	public final DBLParser.boolean_factor_return boolean_factor() throws RecognitionException {
		DBLParser.boolean_factor_return retval = new DBLParser.boolean_factor_return();
		retval.start = input.LT(1);
		int boolean_factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT408=null;
		ParserRuleReturnScope boolean_test407 =null;
		ParserRuleReturnScope boolean_test409 =null;

		CommonTree NOT408_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_boolean_test=new RewriteRuleSubtreeStream(adaptor,"rule boolean_test");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1129:3: ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) )
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==CASE||LA150_0==COUNT||LA150_0==Character_String_Literal||LA150_0==Identifier||LA150_0==LEFT_PAREN||LA150_0==MINUS||LA150_0==NULL||LA150_0==NUMBER||LA150_0==PLUS||LA150_0==REAL_NUMBER) ) {
				alt150=1;
			}
			else if ( (LA150_0==NOT) ) {
				alt150=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1129:5: boolean_test
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_test_in_boolean_factor10141);
					boolean_test407=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_test407.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1130:5: NOT boolean_test
					{
					NOT408=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_factor10147); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT408);

					pushFollow(FOLLOW_boolean_test_in_boolean_factor10149);
					boolean_test409=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_test.add(boolean_test409.getTree());
					// AST REWRITE
					// elements: NOT, boolean_test
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1130:22: -> ^( NOT boolean_test )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1130:25: ^( NOT boolean_test )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_boolean_test.nextTree());
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 120, boolean_factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_factor"


	public static class boolean_test_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_test"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1132:1: boolean_test : boolean_primary ( is_clause )? ;
	public final DBLParser.boolean_test_return boolean_test() throws RecognitionException {
		DBLParser.boolean_test_return retval = new DBLParser.boolean_test_return();
		retval.start = input.LT(1);
		int boolean_test_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_primary410 =null;
		ParserRuleReturnScope is_clause411 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1133:3: ( boolean_primary ( is_clause )? )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1133:5: boolean_primary ( is_clause )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_primary_in_boolean_test10169);
			boolean_primary410=boolean_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_primary410.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1133:21: ( is_clause )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==IS) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1133:21: is_clause
					{
					pushFollow(FOLLOW_is_clause_in_boolean_test10171);
					is_clause411=is_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, is_clause411.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 121, boolean_test_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_test"


	public static class is_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "is_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1135:1: is_clause : IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) ;
	public final DBLParser.is_clause_return is_clause() throws RecognitionException {
		DBLParser.is_clause_return retval = new DBLParser.is_clause_return();
		retval.start = input.LT(1);
		int is_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IS412=null;
		Token NOT413=null;
		ParserRuleReturnScope t =null;

		CommonTree IS412_tree=null;
		CommonTree NOT413_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_truth_value=new RewriteRuleSubtreeStream(adaptor,"rule truth_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1136:3: ( IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1136:5: IS ( NOT )? t= truth_value
			{
			IS412=(Token)match(input,IS,FOLLOW_IS_in_is_clause10184); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS412);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1136:8: ( NOT )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==NOT) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1136:8: NOT
					{
					NOT413=(Token)match(input,NOT,FOLLOW_NOT_in_is_clause10186); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT413);

					}
					break;

			}

			pushFollow(FOLLOW_truth_value_in_is_clause10191);
			t=truth_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_truth_value.add(t.getTree());
			// AST REWRITE
			// elements: t, IS, NOT
			// token labels: 
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1136:27: -> ^( IS ( NOT )? $t)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1136:30: ^( IS ( NOT )? $t)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1136:35: ( NOT )?
				if ( stream_NOT.hasNext() ) {
					adaptor.addChild(root_1, stream_NOT.nextNode());
				}
				stream_NOT.reset();

				adaptor.addChild(root_1, stream_t.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 122, is_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "is_clause"


	public static class truth_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "truth_value"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1138:1: truth_value : ( TRUE | FALSE | UNKNOWN );
	public final DBLParser.truth_value_return truth_value() throws RecognitionException {
		DBLParser.truth_value_return retval = new DBLParser.truth_value_return();
		retval.start = input.LT(1);
		int truth_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set414=null;

		CommonTree set414_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1139:3: ( TRUE | FALSE | UNKNOWN )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set414=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE||input.LA(1)==UNKNOWN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set414));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 123, truth_value_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "truth_value"


	public static class boolean_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_primary"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1141:1: boolean_primary : ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression );
	public final DBLParser.boolean_primary_return boolean_primary() throws RecognitionException {
		DBLParser.boolean_primary_return retval = new DBLParser.boolean_primary_return();
		retval.start = input.LT(1);
		int boolean_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN417=null;
		Token RIGHT_PAREN419=null;
		ParserRuleReturnScope predicate415 =null;
		ParserRuleReturnScope numeric_value_expression416 =null;
		ParserRuleReturnScope boolean_value_expression418 =null;
		ParserRuleReturnScope case_expression420 =null;

		CommonTree LEFT_PAREN417_tree=null;
		CommonTree RIGHT_PAREN419_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1142:3: ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression )
			int alt153=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA153_1 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA153_2 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA153_3 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL:
				{
				int LA153_4 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA153_5 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA153_6 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}
				else if ( (synpred285_DBL()) ) {
					alt153=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA153_7 = input.LA(2);
				if ( (synpred283_DBL()) ) {
					alt153=1;
				}
				else if ( (synpred284_DBL()) ) {
					alt153=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CASE:
				{
				alt153=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}
			switch (alt153) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1142:5: predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_boolean_primary10235);
					predicate415=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate415.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1143:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_boolean_primary10241);
					numeric_value_expression416=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression416.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1144:5: LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN417=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_primary10247); if (state.failed) return retval;
					pushFollow(FOLLOW_boolean_value_expression_in_boolean_primary10250);
					boolean_value_expression418=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression418.getTree());

					RIGHT_PAREN419=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_primary10252); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1145:5: case_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_primary10259);
					case_expression420=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression420.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 124, boolean_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_primary"


	public static class predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1152:1: predicate : ( comparison_predicate | in_predicate | like_predicate | null_predicate );
	public final DBLParser.predicate_return predicate() throws RecognitionException {
		DBLParser.predicate_return retval = new DBLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison_predicate421 =null;
		ParserRuleReturnScope in_predicate422 =null;
		ParserRuleReturnScope like_predicate423 =null;
		ParserRuleReturnScope null_predicate424 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1153:3: ( comparison_predicate | in_predicate | like_predicate | null_predicate )
			int alt154=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA154_1 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA154_2 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA154_3 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			case NULL:
				{
				int LA154_4 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			case Identifier:
				{
				int LA154_5 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (synpred288_DBL()) ) {
					alt154=3;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA154_6 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			case COUNT:
				{
				int LA154_7 = input.LA(2);
				if ( (synpred286_DBL()) ) {
					alt154=1;
				}
				else if ( (synpred287_DBL()) ) {
					alt154=2;
				}
				else if ( (true) ) {
					alt154=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}
			switch (alt154) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1153:5: comparison_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_comparison_predicate_in_predicate10273);
					comparison_predicate421=comparison_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_predicate421.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1154:5: in_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_in_predicate_in_predicate10279);
					in_predicate422=in_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_predicate422.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1155:5: like_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_like_predicate_in_predicate10285);
					like_predicate423=like_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_predicate423.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1156:5: null_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_null_predicate_in_predicate10291);
					null_predicate424=null_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_predicate424.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 125, predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class comparison_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comparison_predicate"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1164:1: comparison_predicate options {k=1; } : l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) ;
	public final DBLParser.comparison_predicate_return comparison_predicate() throws RecognitionException {
		DBLParser.comparison_predicate_return retval = new DBLParser.comparison_predicate_return();
		retval.start = input.LT(1);
		int comparison_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope l =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");
		RewriteRuleSubtreeStream stream_comp_op=new RewriteRuleSubtreeStream(adaptor,"rule comp_op");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1166:2: (l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1166:4: l= numeric_value_expression c= comp_op r= numeric_value_expression
			{
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate10315);
			l=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(l.getTree());
			pushFollow(FOLLOW_comp_op_in_comparison_predicate10319);
			c=comp_op();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_comp_op.add(c.getTree());
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate10323);
			r=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(r.getTree());
			// AST REWRITE
			// elements: c, l, r
			// token labels: 
			// rule labels: r, c, l, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1166:68: -> ^( $c $l $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1166:71: ^( $c $l $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
				adaptor.addChild(root_1, stream_l.nextTree());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 126, comparison_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison_predicate"


	public static class comp_op_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comp_op"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1168:1: comp_op : ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ );
	public final DBLParser.comp_op_return comp_op() throws RecognitionException {
		DBLParser.comp_op_return retval = new DBLParser.comp_op_return();
		retval.start = input.LT(1);
		int comp_op_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set425=null;

		CommonTree set425_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1169:3: ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set425=input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==GEQ||input.LA(1)==GTH||input.LA(1)==LEQ||input.LA(1)==LTH||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set425));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 127, comp_op_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comp_op"


	public static class in_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_predicate"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:1: in_predicate : v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) ;
	public final DBLParser.in_predicate_return in_predicate() throws RecognitionException {
		DBLParser.in_predicate_return retval = new DBLParser.in_predicate_return();
		retval.start = input.LT(1);
		int in_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT426=null;
		Token IN427=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope a =null;

		CommonTree NOT426_tree=null;
		CommonTree IN427_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");
		RewriteRuleSubtreeStream stream_in_predicate_value=new RewriteRuleSubtreeStream(adaptor,"rule in_predicate_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:14: (v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:16: v= numeric_value_expression ( NOT )? IN a= in_predicate_value
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_predicate10391);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:44: ( NOT )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==NOT) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:44: NOT
					{
					NOT426=(Token)match(input,NOT,FOLLOW_NOT_in_in_predicate10394); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT426);

					}
					break;

			}

			IN427=(Token)match(input,IN,FOLLOW_IN_in_in_predicate10397); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(IN427);

			pushFollow(FOLLOW_in_predicate_value_in_in_predicate10401);
			a=in_predicate_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_in_predicate_value.add(a.getTree());
			// AST REWRITE
			// elements: NOT, a, IN, v
			// token labels: 
			// rule labels: a, v, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1182:73: -> ^( IN $v $a ( NOT )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:76: ^( IN $v $a ( NOT )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_a.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1182:87: ( NOT )?
				if ( stream_NOT.hasNext() ) {
					adaptor.addChild(root_1, stream_NOT.nextNode());
				}
				stream_NOT.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 128, in_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "in_predicate"


	public static class in_predicate_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_predicate_value"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1183:1: in_predicate_value : LEFT_PAREN ! in_value_list RIGHT_PAREN !;
	public final DBLParser.in_predicate_value_return in_predicate_value() throws RecognitionException {
		DBLParser.in_predicate_value_return retval = new DBLParser.in_predicate_value_return();
		retval.start = input.LT(1);
		int in_predicate_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN428=null;
		Token RIGHT_PAREN430=null;
		ParserRuleReturnScope in_value_list429 =null;

		CommonTree LEFT_PAREN428_tree=null;
		CommonTree RIGHT_PAREN430_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1184:3: ( LEFT_PAREN ! in_value_list RIGHT_PAREN !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1184:5: LEFT_PAREN ! in_value_list RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN428=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value10425); if (state.failed) return retval;
			pushFollow(FOLLOW_in_value_list_in_in_predicate_value10428);
			in_value_list429=in_value_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, in_value_list429.getTree());

			RIGHT_PAREN430=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value10431); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 129, in_predicate_value_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "in_predicate_value"


	public static class in_value_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_value_list"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1186:1: in_value_list : numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ ;
	public final DBLParser.in_value_list_return in_value_list() throws RecognitionException {
		DBLParser.in_value_list_return retval = new DBLParser.in_value_list_return();
		retval.start = input.LT(1);
		int in_value_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA432=null;
		ParserRuleReturnScope numeric_value_expression431 =null;
		ParserRuleReturnScope numeric_value_expression433 =null;

		CommonTree COMMA432_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1187:3: ( numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1187:5: numeric_value_expression ( COMMA numeric_value_expression )*
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_value_list10443);
			numeric_value_expression431=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression431.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1187:31: ( COMMA numeric_value_expression )*
			loop156:
			while (true) {
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==COMMA) ) {
					alt156=1;
				}

				switch (alt156) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1187:33: COMMA numeric_value_expression
					{
					COMMA432=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list10448); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA432);

					pushFollow(FOLLOW_numeric_value_expression_in_in_value_list10450);
					numeric_value_expression433=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression433.getTree());
					}
					break;

				default :
					break loop156;
				}
			}

			// AST REWRITE
			// elements: numeric_value_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1187:68: -> ( numeric_value_expression )+
			{
				if ( !(stream_numeric_value_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_numeric_value_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_numeric_value_expression.nextTree());
				}
				stream_numeric_value_expression.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 130, in_value_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "in_value_list"


	public static class like_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "like_predicate"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1194:1: like_predicate : f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) ;
	public final DBLParser.like_predicate_return like_predicate() throws RecognitionException {
		DBLParser.like_predicate_return retval = new DBLParser.like_predicate_return();
		retval.start = input.LT(1);
		int like_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token NOT434=null;
		Token LIKE435=null;
		ParserRuleReturnScope f =null;

		CommonTree s_tree=null;
		CommonTree NOT434_tree=null;
		CommonTree LIKE435_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1195:3: (f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1195:5: f= column_reference ( NOT )? LIKE s= Character_String_Literal
			{
			pushFollow(FOLLOW_column_reference_in_like_predicate10472);
			f=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(f.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1195:24: ( NOT )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==NOT) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1195:24: NOT
					{
					NOT434=(Token)match(input,NOT,FOLLOW_NOT_in_like_predicate10474); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT434);

					}
					break;

			}

			LIKE435=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate10477); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIKE.add(LIKE435);

			s=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_like_predicate10481); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(s);

			// AST REWRITE
			// elements: s, LIKE, f, NOT
			// token labels: s
			// rule labels: f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1195:61: -> ^( LIKE ( NOT )? $f $s)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1195:64: ^( LIKE ( NOT )? $f $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIKE.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1195:71: ( NOT )?
				if ( stream_NOT.hasNext() ) {
					adaptor.addChild(root_1, stream_NOT.nextNode());
				}
				stream_NOT.reset();

				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 131, like_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "like_predicate"


	public static class null_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "null_predicate"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1203:1: null_predicate : f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) ;
	public final DBLParser.null_predicate_return null_predicate() throws RecognitionException {
		DBLParser.null_predicate_return retval = new DBLParser.null_predicate_return();
		retval.start = input.LT(1);
		int null_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token IS436=null;
		Token NULL437=null;
		ParserRuleReturnScope f =null;

		CommonTree n_tree=null;
		CommonTree IS436_tree=null;
		CommonTree NULL437_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1204:3: (f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1204:5: f= numeric_value_expression IS (n= NOT )? NULL
			{
			pushFollow(FOLLOW_numeric_value_expression_in_null_predicate10512);
			f=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(f.getTree());
			IS436=(Token)match(input,IS,FOLLOW_IS_in_null_predicate10514); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS436);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1204:35: (n= NOT )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==NOT) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1204:36: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate10519); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(n);

					}
					break;

			}

			NULL437=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate10523); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL437);

			// AST REWRITE
			// elements: f, NULL, IS, n
			// token labels: n
			// rule labels: f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1204:49: -> ^( IS $f NULL ( $n)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1204:52: ^( IS $f NULL ( $n)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_NULL.nextNode());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1204:66: ( $n)?
				if ( stream_n.hasNext() ) {
					adaptor.addChild(root_1, stream_n.nextNode());
				}
				stream_n.reset();

				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 132, null_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "null_predicate"


	public static class numeric_value_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "numeric_value_expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1212:1: numeric_value_expression : term ( ( PLUS | MINUS ) ^ term )* ;
	public final DBLParser.numeric_value_expression_return numeric_value_expression() throws RecognitionException {
		DBLParser.numeric_value_expression_return retval = new DBLParser.numeric_value_expression_return();
		retval.start = input.LT(1);
		int numeric_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set439=null;
		ParserRuleReturnScope term438 =null;
		ParserRuleReturnScope term440 =null;

		CommonTree set439_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1213:2: ( term ( ( PLUS | MINUS ) ^ term )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1213:4: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_term_in_numeric_value_expression10551);
			term438=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term438.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1213:9: ( ( PLUS | MINUS ) ^ term )*
			loop159:
			while (true) {
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==MINUS||LA159_0==PLUS) ) {
					alt159=1;
				}

				switch (alt159) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1213:10: ( PLUS | MINUS ) ^ term
					{
					set439=input.LT(1);
					set439=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set439), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numeric_value_expression10561);
					term440=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term440.getTree());

					}
					break;

				default :
					break loop159;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 133, numeric_value_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numeric_value_expression"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1215:1: term : numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* ;
	public final DBLParser.term_return term() throws RecognitionException {
		DBLParser.term_return retval = new DBLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set442=null;
		ParserRuleReturnScope numeric_primary441 =null;
		ParserRuleReturnScope numeric_primary443 =null;

		CommonTree set442_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1216:3: ( numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1216:5: numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_numeric_primary_in_term10574);
			numeric_primary441=numeric_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary441.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1216:21: ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			loop160:
			while (true) {
				int alt160=2;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==DIVIDE||LA160_0==MODULAR||LA160_0==MULTIPLY) ) {
					alt160=1;
				}

				switch (alt160) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1216:22: ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary
					{
					set442=input.LT(1);
					set442=input.LT(1);
					if ( input.LA(1)==DIVIDE||input.LA(1)==MODULAR||input.LA(1)==MULTIPLY ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set442), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_primary_in_term10586);
					numeric_primary443=numeric_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary443.getTree());

					}
					break;

				default :
					break loop160;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 134, term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "term"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1218:1: array : LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ ;
	public final DBLParser.array_return array() throws RecognitionException {
		DBLParser.array_return retval = new DBLParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN444=null;
		Token COMMA446=null;
		Token RIGHT_PAREN448=null;
		ParserRuleReturnScope literal445 =null;
		ParserRuleReturnScope literal447 =null;

		CommonTree LEFT_PAREN444_tree=null;
		CommonTree COMMA446_tree=null;
		CommonTree RIGHT_PAREN448_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1219:3: ( LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1219:5: LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN
			{
			LEFT_PAREN444=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_array10599); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN444);

			pushFollow(FOLLOW_literal_in_array10601);
			literal445=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_literal.add(literal445.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1219:24: ( COMMA literal )*
			loop161:
			while (true) {
				int alt161=2;
				int LA161_0 = input.LA(1);
				if ( (LA161_0==COMMA) ) {
					alt161=1;
				}

				switch (alt161) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1219:25: COMMA literal
					{
					COMMA446=(Token)match(input,COMMA,FOLLOW_COMMA_in_array10604); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA446);

					pushFollow(FOLLOW_literal_in_array10606);
					literal447=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal447.getTree());
					}
					break;

				default :
					break loop161;
				}
			}

			RIGHT_PAREN448=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_array10611); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN448);

			// AST REWRITE
			// elements: literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1219:54: -> ( literal )+
			{
				if ( !(stream_literal.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_literal.hasNext() ) {
					adaptor.addChild(root_0, stream_literal.nextTree());
				}
				stream_literal.reset();

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 135, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class numeric_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "numeric_primary"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1221:1: numeric_primary : ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation );
	public final DBLParser.numeric_primary_return numeric_primary() throws RecognitionException {
		DBLParser.numeric_primary_return retval = new DBLParser.numeric_primary_return();
		retval.start = input.LT(1);
		int numeric_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN451=null;
		Token RIGHT_PAREN453=null;
		ParserRuleReturnScope literal449 =null;
		ParserRuleReturnScope column_reference450 =null;
		ParserRuleReturnScope numeric_value_expression452 =null;
		ParserRuleReturnScope routine_invocation454 =null;

		CommonTree LEFT_PAREN451_tree=null;
		CommonTree RIGHT_PAREN453_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1222:3: ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation )
			int alt162=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
			case MINUS:
			case NULL:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt162=1;
				}
				break;
			case Identifier:
				{
				int LA162_2 = input.LA(2);
				if ( (LA162_2==LEFT_PAREN) ) {
					alt162=4;
				}
				else if ( (LA162_2==EOF||LA162_2==AND||LA162_2==AS||LA162_2==COMMA||LA162_2==CROSS||LA162_2==DIVIDE||LA162_2==ELSE||(LA162_2 >= END && LA162_2 <= EQUAL)||LA162_2==EXCEPT||(LA162_2 >= FROM && LA162_2 <= FULL)||(LA162_2 >= GEQ && LA162_2 <= GROUP)||LA162_2==GTH||LA162_2==HAVING||LA162_2==IN||LA162_2==INNER||LA162_2==INTERSECT||LA162_2==IS||LA162_2==Identifier||LA162_2==JOIN||LA162_2==LEFT||LA162_2==LEQ||LA162_2==LIMIT||LA162_2==LTH||LA162_2==MINUS||LA162_2==MODULAR||LA162_2==MULTIPLY||LA162_2==NATURAL||(LA162_2 >= NOT && LA162_2 <= NOT_EQUAL)||(LA162_2 >= OR && LA162_2 <= ORDER)||LA162_2==PLUS||(LA162_2 >= RIGHT && LA162_2 <= RIGHT_PAREN)||LA162_2==THEN||LA162_2==UNION||(LA162_2 >= WHEN && LA162_2 <= WHERE)) ) {
					alt162=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 162, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				alt162=3;
				}
				break;
			case COUNT:
				{
				alt162=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 162, 0, input);
				throw nvae;
			}
			switch (alt162) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1222:5: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_numeric_primary10628);
					literal449=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal449.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1223:4: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_numeric_primary10633);
					column_reference450=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference450.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1224:4: LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN451=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_numeric_primary10638); if (state.failed) return retval;
					pushFollow(FOLLOW_numeric_value_expression_in_numeric_primary10641);
					numeric_value_expression452=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression452.getTree());

					RIGHT_PAREN453=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_numeric_primary10643); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1225:4: routine_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_routine_invocation_in_numeric_primary10649);
					routine_invocation454=routine_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, routine_invocation454.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 136, numeric_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numeric_primary"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1227:1: literal : ( string_value_expr | signed_numerical_literal | NULL );
	public final DBLParser.literal_return literal() throws RecognitionException {
		DBLParser.literal_return retval = new DBLParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL457=null;
		ParserRuleReturnScope string_value_expr455 =null;
		ParserRuleReturnScope signed_numerical_literal456 =null;

		CommonTree NULL457_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1228:3: ( string_value_expr | signed_numerical_literal | NULL )
			int alt163=3;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				alt163=1;
				}
				break;
			case MINUS:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt163=2;
				}
				break;
			case NULL:
				{
				alt163=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 163, 0, input);
				throw nvae;
			}
			switch (alt163) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1228:5: string_value_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_value_expr_in_literal10660);
					string_value_expr455=string_value_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value_expr455.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1229:5: signed_numerical_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signed_numerical_literal_in_literal10666);
					signed_numerical_literal456=signed_numerical_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, signed_numerical_literal456.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1230:5: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL457=(Token)match(input,NULL,FOLLOW_NULL_in_literal10672); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL457_tree = (CommonTree)adaptor.create(NULL457);
					adaptor.addChild(root_0, NULL457_tree);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 137, literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class string_value_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string_value_expr"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1232:1: string_value_expr : Character_String_Literal ;
	public final DBLParser.string_value_expr_return string_value_expr() throws RecognitionException {
		DBLParser.string_value_expr_return retval = new DBLParser.string_value_expr_return();
		retval.start = input.LT(1);
		int string_value_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Character_String_Literal458=null;

		CommonTree Character_String_Literal458_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1233:3: ( Character_String_Literal )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1233:5: Character_String_Literal
			{
			root_0 = (CommonTree)adaptor.nil();


			Character_String_Literal458=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_string_value_expr10684); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Character_String_Literal458_tree = (CommonTree)adaptor.create(Character_String_Literal458);
			adaptor.addChild(root_0, Character_String_Literal458_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 138, string_value_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "string_value_expr"


	public static class signed_numerical_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "signed_numerical_literal"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1235:1: signed_numerical_literal : ( sign )? unsigned_numerical_literal ;
	public final DBLParser.signed_numerical_literal_return signed_numerical_literal() throws RecognitionException {
		DBLParser.signed_numerical_literal_return retval = new DBLParser.signed_numerical_literal_return();
		retval.start = input.LT(1);
		int signed_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope sign459 =null;
		ParserRuleReturnScope unsigned_numerical_literal460 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1236:3: ( ( sign )? unsigned_numerical_literal )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1236:5: ( sign )? unsigned_numerical_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1236:5: ( sign )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==MINUS||LA164_0==PLUS) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1236:5: sign
					{
					pushFollow(FOLLOW_sign_in_signed_numerical_literal10696);
					sign459=sign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sign459.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal10699);
			unsigned_numerical_literal460=unsigned_numerical_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unsigned_numerical_literal460.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 139, signed_numerical_literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "signed_numerical_literal"


	public static class unsigned_numerical_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsigned_numerical_literal"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1238:1: unsigned_numerical_literal : ( NUMBER | REAL_NUMBER );
	public final DBLParser.unsigned_numerical_literal_return unsigned_numerical_literal() throws RecognitionException {
		DBLParser.unsigned_numerical_literal_return retval = new DBLParser.unsigned_numerical_literal_return();
		retval.start = input.LT(1);
		int unsigned_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set461=null;

		CommonTree set461_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1239:3: ( NUMBER | REAL_NUMBER )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set461=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==REAL_NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set461));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 140, unsigned_numerical_literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unsigned_numerical_literal"


	public static class sign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sign"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1242:1: sign : ( PLUS | MINUS );
	public final DBLParser.sign_return sign() throws RecognitionException {
		DBLParser.sign_return retval = new DBLParser.sign_return();
		retval.start = input.LT(1);
		int sign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set462=null;

		CommonTree set462_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1243:3: ( PLUS | MINUS )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set462=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set462));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 141, sign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sign"


	public static class case_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "case_expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1250:1: case_expression : case_specification ;
	public final DBLParser.case_expression_return case_expression() throws RecognitionException {
		DBLParser.case_expression_return retval = new DBLParser.case_expression_return();
		retval.start = input.LT(1);
		int case_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope case_specification463 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1251:3: ( case_specification )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1251:5: case_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_case_specification_in_case_expression10747);
			case_specification463=case_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_specification463.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 142, case_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "case_expression"


	public static class case_abbreviation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "case_abbreviation"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1253:1: case_abbreviation : ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN );
	public final DBLParser.case_abbreviation_return case_abbreviation() throws RecognitionException {
		DBLParser.case_abbreviation_return retval = new DBLParser.case_abbreviation_return();
		retval.start = input.LT(1);
		int case_abbreviation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULLIF464=null;
		Token LEFT_PAREN465=null;
		Token COMMA467=null;
		Token RIGHT_PAREN469=null;
		Token COALESCE470=null;
		Token LEFT_PAREN471=null;
		Token COMMA473=null;
		Token RIGHT_PAREN475=null;
		ParserRuleReturnScope numeric_value_expression466 =null;
		ParserRuleReturnScope boolean_value_expression468 =null;
		ParserRuleReturnScope numeric_value_expression472 =null;
		ParserRuleReturnScope boolean_value_expression474 =null;

		CommonTree NULLIF464_tree=null;
		CommonTree LEFT_PAREN465_tree=null;
		CommonTree COMMA467_tree=null;
		CommonTree RIGHT_PAREN469_tree=null;
		CommonTree COALESCE470_tree=null;
		CommonTree LEFT_PAREN471_tree=null;
		CommonTree COMMA473_tree=null;
		CommonTree RIGHT_PAREN475_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1254:3: ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN )
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==NULLIF) ) {
				alt166=1;
			}
			else if ( (LA166_0==COALESCE) ) {
				alt166=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}

			switch (alt166) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1254:5: NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					NULLIF464=(Token)match(input,NULLIF,FOLLOW_NULLIF_in_case_abbreviation10759); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULLIF464_tree = (CommonTree)adaptor.create(NULLIF464);
					adaptor.addChild(root_0, NULLIF464_tree);
					}

					LEFT_PAREN465=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation10761); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN465_tree = (CommonTree)adaptor.create(LEFT_PAREN465);
					adaptor.addChild(root_0, LEFT_PAREN465_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation10763);
					numeric_value_expression466=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression466.getTree());

					COMMA467=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation10765); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA467_tree = (CommonTree)adaptor.create(COMMA467);
					adaptor.addChild(root_0, COMMA467_tree);
					}

					pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation10767);
					boolean_value_expression468=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression468.getTree());

					RIGHT_PAREN469=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation10770); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN469_tree = (CommonTree)adaptor.create(RIGHT_PAREN469);
					adaptor.addChild(root_0, RIGHT_PAREN469_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1255:5: COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					COALESCE470=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation10776); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COALESCE470_tree = (CommonTree)adaptor.create(COALESCE470);
					adaptor.addChild(root_0, COALESCE470_tree);
					}

					LEFT_PAREN471=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation10778); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN471_tree = (CommonTree)adaptor.create(LEFT_PAREN471);
					adaptor.addChild(root_0, LEFT_PAREN471_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation10780);
					numeric_value_expression472=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression472.getTree());

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1255:50: ( COMMA boolean_value_expression )+
					int cnt165=0;
					loop165:
					while (true) {
						int alt165=2;
						int LA165_0 = input.LA(1);
						if ( (LA165_0==COMMA) ) {
							alt165=1;
						}

						switch (alt165) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1255:52: COMMA boolean_value_expression
							{
							COMMA473=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation10784); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA473_tree = (CommonTree)adaptor.create(COMMA473);
							adaptor.addChild(root_0, COMMA473_tree);
							}

							pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation10786);
							boolean_value_expression474=boolean_value_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression474.getTree());

							}
							break;

						default :
							if ( cnt165 >= 1 ) break loop165;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(165, input);
							throw eee;
						}
						cnt165++;
					}

					RIGHT_PAREN475=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation10792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN475_tree = (CommonTree)adaptor.create(RIGHT_PAREN475);
					adaptor.addChild(root_0, RIGHT_PAREN475_tree);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 143, case_abbreviation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "case_abbreviation"


	public static class case_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "case_specification"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1257:1: case_specification : ( simple_case | searched_case );
	public final DBLParser.case_specification_return case_specification() throws RecognitionException {
		DBLParser.case_specification_return retval = new DBLParser.case_specification_return();
		retval.start = input.LT(1);
		int case_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope simple_case476 =null;
		ParserRuleReturnScope searched_case477 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1258:3: ( simple_case | searched_case )
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==CASE) ) {
				int LA167_1 = input.LA(2);
				if ( (LA167_1==COUNT||LA167_1==Character_String_Literal||LA167_1==Identifier||LA167_1==LEFT_PAREN||LA167_1==MINUS||LA167_1==NULL||LA167_1==NUMBER||LA167_1==PLUS||LA167_1==REAL_NUMBER) ) {
					alt167=1;
				}
				else if ( (LA167_1==WHEN) ) {
					alt167=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 167, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}

			switch (alt167) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1258:5: simple_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_case_in_case_specification10804);
					simple_case476=simple_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case476.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1259:5: searched_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_searched_case_in_case_specification10810);
					searched_case477=searched_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_case477.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 144, case_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "case_specification"


	public static class simple_case_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_case"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1261:1: simple_case : CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END ;
	public final DBLParser.simple_case_return simple_case() throws RecognitionException {
		DBLParser.simple_case_return retval = new DBLParser.simple_case_return();
		retval.start = input.LT(1);
		int simple_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE478=null;
		Token END482=null;
		ParserRuleReturnScope numeric_value_expression479 =null;
		ParserRuleReturnScope simple_when_clause480 =null;
		ParserRuleReturnScope else_clause481 =null;

		CommonTree CASE478_tree=null;
		CommonTree END482_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1262:3: ( CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1262:5: CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE478=(Token)match(input,CASE,FOLLOW_CASE_in_simple_case10822); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE478_tree = (CommonTree)adaptor.create(CASE478);
			adaptor.addChild(root_0, CASE478_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_case10824);
			numeric_value_expression479=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression479.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1262:35: ( simple_when_clause )+
			int cnt168=0;
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==WHEN) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1262:37: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case10828);
					simple_when_clause480=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause480.getTree());

					}
					break;

				default :
					if ( cnt168 >= 1 ) break loop168;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(168, input);
					throw eee;
				}
				cnt168++;
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1262:59: ( else_clause )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==ELSE) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1262:61: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_simple_case10835);
					else_clause481=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause481.getTree());

					}
					break;

			}

			END482=(Token)match(input,END,FOLLOW_END_in_simple_case10841); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END482_tree = (CommonTree)adaptor.create(END482);
			adaptor.addChild(root_0, END482_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 145, simple_case_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_case"


	public static class searched_case_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "searched_case"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1264:1: searched_case : CASE ^ ( searched_when_clause )+ ( else_clause )? END !;
	public final DBLParser.searched_case_return searched_case() throws RecognitionException {
		DBLParser.searched_case_return retval = new DBLParser.searched_case_return();
		retval.start = input.LT(1);
		int searched_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE483=null;
		Token END486=null;
		ParserRuleReturnScope searched_when_clause484 =null;
		ParserRuleReturnScope else_clause485 =null;

		CommonTree CASE483_tree=null;
		CommonTree END486_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1265:3: ( CASE ^ ( searched_when_clause )+ ( else_clause )? END !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1265:5: CASE ^ ( searched_when_clause )+ ( else_clause )? END !
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE483=(Token)match(input,CASE,FOLLOW_CASE_in_searched_case10853); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE483_tree = (CommonTree)adaptor.create(CASE483);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE483_tree, root_0);
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1265:11: ( searched_when_clause )+
			int cnt170=0;
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==WHEN) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1265:12: searched_when_clause
					{
					pushFollow(FOLLOW_searched_when_clause_in_searched_case10857);
					searched_when_clause484=searched_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_when_clause484.getTree());

					}
					break;

				default :
					if ( cnt170 >= 1 ) break loop170;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(170, input);
					throw eee;
				}
				cnt170++;
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1265:35: ( else_clause )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==ELSE) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1265:36: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_searched_case10862);
					else_clause485=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause485.getTree());

					}
					break;

			}

			END486=(Token)match(input,END,FOLLOW_END_in_searched_case10866); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 146, searched_case_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "searched_case"


	public static class simple_when_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_when_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1267:1: simple_when_clause : WHEN numeric_value_expression THEN result ;
	public final DBLParser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		DBLParser.simple_when_clause_return retval = new DBLParser.simple_when_clause_return();
		retval.start = input.LT(1);
		int simple_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN487=null;
		Token THEN489=null;
		ParserRuleReturnScope numeric_value_expression488 =null;
		ParserRuleReturnScope result490 =null;

		CommonTree WHEN487_tree=null;
		CommonTree THEN489_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1267:20: ( WHEN numeric_value_expression THEN result )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1267:22: WHEN numeric_value_expression THEN result
			{
			root_0 = (CommonTree)adaptor.nil();


			WHEN487=(Token)match(input,WHEN,FOLLOW_WHEN_in_simple_when_clause10877); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN487_tree = (CommonTree)adaptor.create(WHEN487);
			adaptor.addChild(root_0, WHEN487_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_when_clause10879);
			numeric_value_expression488=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression488.getTree());

			THEN489=(Token)match(input,THEN,FOLLOW_THEN_in_simple_when_clause10881); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN489_tree = (CommonTree)adaptor.create(THEN489);
			adaptor.addChild(root_0, THEN489_tree);
			}

			pushFollow(FOLLOW_result_in_simple_when_clause10883);
			result490=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result490.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 147, simple_when_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_when_clause"


	public static class searched_when_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "searched_when_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1268:1: searched_when_clause : WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) ;
	public final DBLParser.searched_when_clause_return searched_when_clause() throws RecognitionException {
		DBLParser.searched_when_clause_return retval = new DBLParser.searched_when_clause_return();
		retval.start = input.LT(1);
		int searched_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN491=null;
		Token THEN492=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		CommonTree WHEN491_tree=null;
		CommonTree THEN492_tree=null;
		RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");
		RewriteRuleSubtreeStream stream_search_condition=new RewriteRuleSubtreeStream(adaptor,"rule search_condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1269:3: ( WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1269:5: WHEN c= search_condition THEN r= result
			{
			WHEN491=(Token)match(input,WHEN,FOLLOW_WHEN_in_searched_when_clause10893); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHEN.add(WHEN491);

			pushFollow(FOLLOW_search_condition_in_searched_when_clause10897);
			c=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_search_condition.add(c.getTree());
			THEN492=(Token)match(input,THEN,FOLLOW_THEN_in_searched_when_clause10899); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_THEN.add(THEN492);

			pushFollow(FOLLOW_result_in_searched_when_clause10903);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: WHEN, r, c
			// token labels: 
			// rule labels: r, c, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1269:43: -> ^( WHEN $c $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1269:46: ^( WHEN $c $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_WHEN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 148, searched_when_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "searched_when_clause"


	public static class else_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "else_clause"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1271:1: else_clause : ELSE r= result -> ^( ELSE $r) ;
	public final DBLParser.else_clause_return else_clause() throws RecognitionException {
		DBLParser.else_clause_return retval = new DBLParser.else_clause_return();
		retval.start = input.LT(1);
		int else_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ELSE493=null;
		ParserRuleReturnScope r =null;

		CommonTree ELSE493_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1272:3: ( ELSE r= result -> ^( ELSE $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1272:5: ELSE r= result
			{
			ELSE493=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_clause10927); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELSE.add(ELSE493);

			pushFollow(FOLLOW_result_in_else_clause10931);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: r, ELSE
			// token labels: 
			// rule labels: r, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1272:19: -> ^( ELSE $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1272:22: ^( ELSE $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 149, else_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "else_clause"


	public static class result_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "result"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1274:1: result : ( numeric_value_expression | NULL );
	public final DBLParser.result_return result() throws RecognitionException {
		DBLParser.result_return retval = new DBLParser.result_return();
		retval.start = input.LT(1);
		int result_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL495=null;
		ParserRuleReturnScope numeric_value_expression494 =null;

		CommonTree NULL495_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1275:3: ( numeric_value_expression | NULL )
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==COUNT||LA172_0==Character_String_Literal||LA172_0==Identifier||LA172_0==LEFT_PAREN||LA172_0==MINUS||LA172_0==NUMBER||LA172_0==PLUS||LA172_0==REAL_NUMBER) ) {
				alt172=1;
			}
			else if ( (LA172_0==NULL) ) {
				int LA172_2 = input.LA(2);
				if ( (synpred319_DBL()) ) {
					alt172=1;
				}
				else if ( (true) ) {
					alt172=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}

			switch (alt172) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1275:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_result10952);
					numeric_value_expression494=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression494.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1275:32: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL495=(Token)match(input,NULL,FOLLOW_NULL_in_result10956); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL495_tree = (CommonTree)adaptor.create(NULL495);
					adaptor.addChild(root_0, NULL495_tree);
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

		    catch (RecognitionException exc) {
		        throw exc;        
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 150, result_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "result"

	// $ANTLR start synpred67_DBL
	public final void synpred67_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:599:3: ( open_statement )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:599:3: open_statement
		{
		pushFollow(FOLLOW_open_statement_in_synpred67_DBL5792);
		open_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred67_DBL

	// $ANTLR start synpred72_DBL
	public final void synpred72_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:609:3: ( open_statement )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:609:3: open_statement
		{
		pushFollow(FOLLOW_open_statement_in_synpred72_DBL5832);
		open_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred72_DBL

	// $ANTLR start synpred87_DBL
	public final void synpred87_DBL_fragment() throws RecognitionException {
		Token o=null;
		Token v=null;


		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:4: (o= CNULRQD EQUAL v= ( S_YES | S_NO ) )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:631:4: o= CNULRQD EQUAL v= ( S_YES | S_NO )
		{
		o=(Token)match(input,CNULRQD,FOLLOW_CNULRQD_in_synpred87_DBL6032); if (state.failed) return;

		match(input,EQUAL,FOLLOW_EQUAL_in_synpred87_DBL6034); if (state.failed) return;

		v=input.LT(1);
		if ( input.LA(1)==S_NO||input.LA(1)==S_YES ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred87_DBL

	// $ANTLR start synpred144_DBL
	public final void synpred144_DBL_fragment() throws RecognitionException {
		Token o=null;
		Token v=null;


		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:4: (o= CNULRQD EQUAL v= ( S_YES | S_NO ) )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:667:4: o= CNULRQD EQUAL v= ( S_YES | S_NO )
		{
		o=(Token)match(input,CNULRQD,FOLLOW_CNULRQD_in_synpred144_DBL6632); if (state.failed) return;

		match(input,EQUAL,FOLLOW_EQUAL_in_synpred144_DBL6634); if (state.failed) return;

		v=input.LT(1);
		if ( input.LA(1)==S_NO||input.LA(1)==S_YES ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred144_DBL

	// $ANTLR start synpred210_DBL
	public final void synpred210_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:899:5: ( non_join_query_expression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:899:5: non_join_query_expression
		{
		pushFollow(FOLLOW_non_join_query_expression_in_synpred210_DBL8498);
		non_join_query_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred210_DBL

	// $ANTLR start synpred211_DBL
	public final void synpred211_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:6: ( non_join_query_term )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:903:6: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred211_DBL8517);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred211_DBL

	// $ANTLR start synpred219_DBL
	public final void synpred219_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:907:5: ( non_join_query_term )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:907:5: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred219_DBL8577);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred219_DBL

	// $ANTLR start synpred240_DBL
	public final void synpred240_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:952:22: ( COMMA column_reference )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:952:22: COMMA column_reference
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred240_DBL8930); if (state.failed) return;

		pushFollow(FOLLOW_column_reference_in_synpred240_DBL8932);
		column_reference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred240_DBL

	// $ANTLR start synpred283_DBL
	public final void synpred283_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1142:5: ( predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1142:5: predicate
		{
		pushFollow(FOLLOW_predicate_in_synpred283_DBL10235);
		predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred283_DBL

	// $ANTLR start synpred284_DBL
	public final void synpred284_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1143:5: ( numeric_value_expression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1143:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred284_DBL10241);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred284_DBL

	// $ANTLR start synpred285_DBL
	public final void synpred285_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1144:5: ( LEFT_PAREN boolean_value_expression RIGHT_PAREN )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1144:5: LEFT_PAREN boolean_value_expression RIGHT_PAREN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred285_DBL10247); if (state.failed) return;

		pushFollow(FOLLOW_boolean_value_expression_in_synpred285_DBL10250);
		boolean_value_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred285_DBL10252); if (state.failed) return;

		}

	}
	// $ANTLR end synpred285_DBL

	// $ANTLR start synpred286_DBL
	public final void synpred286_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1153:5: ( comparison_predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1153:5: comparison_predicate
		{
		pushFollow(FOLLOW_comparison_predicate_in_synpred286_DBL10273);
		comparison_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred286_DBL

	// $ANTLR start synpred287_DBL
	public final void synpred287_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1154:5: ( in_predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1154:5: in_predicate
		{
		pushFollow(FOLLOW_in_predicate_in_synpred287_DBL10279);
		in_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred287_DBL

	// $ANTLR start synpred288_DBL
	public final void synpred288_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1155:5: ( like_predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1155:5: like_predicate
		{
		pushFollow(FOLLOW_like_predicate_in_synpred288_DBL10285);
		like_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred288_DBL

	// $ANTLR start synpred319_DBL
	public final void synpred319_DBL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1275:5: ( numeric_value_expression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\dbl\\DBL.g:1275:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred319_DBL10952);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred319_DBL

	// Delegated rules

	public final boolean synpred219_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred219_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred287_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred287_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred144_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred144_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred319_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred319_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred211_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred211_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred283_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred283_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred285_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred285_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred240_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred240_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred210_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred210_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred284_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred284_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred288_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred288_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred286_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred286_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_boolean_type_in_data_type4925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_type_in_data_type4931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbit_type_in_data_type4937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_type_in_data_type4943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbinary_type_in_data_type4949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blob_type_in_data_type4955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INET4_in_data_type4961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_string_type_in_data_type4967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_type_in_data_type4973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_type_in_data_type4979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_type_in_character_string_type4991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varchar_type_in_character_string_type4997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nchar_type_in_character_string_type5003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nvarchar_type_in_character_string_type5009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_character_string_type5015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int1_type_in_numeric_type5027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int2_type_in_numeric_type5033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int4_type_in_numeric_type5039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int8_type_in_numeric_type5045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float4_type_in_numeric_type5051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_type_in_numeric_type5057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float8_type_in_numeric_type5063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_type_in_numeric_type5069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_datetime_type5081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_datetime_type5087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timetz_type_in_datetime_type5093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_datetime_type5099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamptz_type_in_datetime_type5105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param5117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param5120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param5122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param5129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param5132 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_COMMA_in_precision_param5134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param5137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param5139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_type_length5152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_type_length5155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_type_length5157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_boolean_type5170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_boolean_type5176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_bit_type5192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_bit_type5194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBIT_in_varbit_type5211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type5213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_varbit_type5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VARYING_in_varbit_type5226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type5228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT1_in_int1_type5245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TINYINT_in_int1_type5251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT2_in_int2_type5267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALLINT_in_int2_type5273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT4_in_int4_type5289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int4_type5295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_int4_type5305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT8_in_int8_type5321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIGINT_in_int8_type5327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT4_in_float4_type5343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_float4_type5349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_float_type5363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_float_type5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT8_in_float8_type5384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type5390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type5400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_PRECISION_in_float8_type5402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number_type5418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_precision_param_in_number_type5421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_number_type5437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_precision_param_in_number_type5440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_number_type5458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_precision_param_in_number_type5465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_char_type5489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_char_type5491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_char_type5502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_char_type5504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHAR_in_varchar_type5521 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type5523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_varchar_type5534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VARYING_in_varchar_type5536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type5538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCHAR_in_nchar_type5555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type5557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nchar_type5568 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nchar_type5570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type5572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NVARCHAR_in_nvarchar_type5589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type5591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nvarchar_type5602 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nvarchar_type5604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VARYING_in_nvarchar_type5606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type5608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMETZ_in_timetz_type5625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timetz_type5631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_WITH_in_timetz_type5633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_TIME_in_timetz_type5635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ZONE_in_timetz_type5637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMPTZ_in_timestamptz_type5653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_timestamptz_type5659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_WITH_in_timestamptz_type5661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_TIME_in_timestamptz_type5663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ZONE_in_timestamptz_type5665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_binary_type5681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_binary_type5683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBINARY_in_varbinary_type5696 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type5698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_varbinary_type5705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VARYING_in_varbinary_type5707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type5709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOB_in_blob_type5722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTEA_in_blob_type5728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_sql5748 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_sql5750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_transaction_statement_in_statement5768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_statement_in_statement5776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_immediate_statement_in_statement5784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_statement5792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prepare_statement_in_statement5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare_cursor_statement_in_statement5808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_describe_statement_in_statement5816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fetch_statement_in_statement5824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_statement5832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_close_statement_in_statement5840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_option_statement_in_statement5848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_option_statement5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_OPTION_in_set_option_statement5880 = new BitSet(new long[]{0x0002060000003000L,0x000000040308820EL,0x0040000100000000L,0x0000001000208000L,0x0000000000070000L,0x0000008003040000L});
	public static final BitSet FOLLOW_options_assign_in_set_option_statement5883 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_set_option_statement5887 = new BitSet(new long[]{0x0002060000003000L,0x000000040308820EL,0x0040000100000000L,0x0000001000208000L,0x0000000000070000L,0x0000008003040000L});
	public static final BitSet FOLLOW_options_assign_in_set_option_statement5889 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_ALWBLK_in_options_assign5929 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign5931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2100000002000000L});
	public static final BitSet FOLLOW_S_READ_in_options_assign5936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NONE_in_options_assign5938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ALLREAD_in_options_assign5940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALWCPYDTA_in_options_assign5962 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign5964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0280000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign5969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign5971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_OPTIMIZE_in_options_assign5973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLOSQLCSR_in_options_assign5995 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign5997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000001F000000000L});
	public static final BitSet FOLLOW_S_ENDACTGRP_in_options_assign6002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ENDMOD_in_options_assign6004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ENDPGM_in_options_assign6006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ENDSQL_in_options_assign6008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ENDJOB_in_options_assign6010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CNULRQD_in_options_assign6032 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign6039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign6041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMIT_in_options_assign6063 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4100000049000000L});
	public static final BitSet FOLLOW_S_CHG_in_options_assign6070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NONE_in_options_assign6072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_CS_in_options_assign6074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ALL_in_options_assign6076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_RR_in_options_assign6078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATFMT_in_options_assign6100 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0021720000000000L,0x0000000000000480L});
	public static final BitSet FOLLOW_S_JOB_in_options_assign6107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ISO_in_options_assign6109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_EUR_in_options_assign6111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_USA_in_options_assign6113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_JIS_in_options_assign6115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_MDY_in_options_assign6117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_YMD_in_options_assign6119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_JUL_in_options_assign6121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATSEP_in_options_assign6143 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6145 = new BitSet(new long[]{0x0000800000000000L,0x0000000000140000L,0x0000000000000000L,0x0000000000000000L,0x0800400124000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_S_JOB_in_options_assign6150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_SLASH_in_options_assign6152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_options_assign6154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_PERIOD_in_options_assign6156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_options_assign6158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_COMMA_in_options_assign6160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_options_assign6162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_DASH_in_options_assign6164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_BLANK_in_options_assign6166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECMPT_in_options_assign6188 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800400020000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_S_PERIOD_in_options_assign6195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_COMMA_in_options_assign6197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_SYSVAL_in_options_assign6199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_JOB_in_options_assign6201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DBGVIEW_in_options_assign6223 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0110000000000000L,0x0000000000000012L});
	public static final BitSet FOLLOW_S_NONE_in_options_assign6230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_SOURCE_in_options_assign6232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_STMT_in_options_assign6234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_LIST_in_options_assign6236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DFTRDBCOL_in_options_assign6258 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_S_NONE_in_options_assign6265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_options_assign6267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DLYPRP_in_options_assign6289 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign6296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign6298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DYNDFTCOL_in_options_assign6320 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign6327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign6329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DYNUSRPRF_in_options_assign6351 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_S_OWNER_in_options_assign6358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_USER_in_options_assign6360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVENTF_in_options_assign6382 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign6389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign6391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LANGID_in_options_assign6413 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000C00000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_S_JOB_in_options_assign6420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_JOBRUN_in_options_assign6422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_options_assign6424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMING_in_options_assign6446 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
	public static final BitSet FOLLOW_S_SYS_in_options_assign6453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_SQL_in_options_assign6455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPTLOB_in_options_assign6477 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign6484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign6486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OUTPUT_in_options_assign6508 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1100000000000000L});
	public static final BitSet FOLLOW_S_NONE_in_options_assign6515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_PRINT_in_options_assign6517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RDBCNNMTH_in_options_assign6539 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000800000000L});
	public static final BitSet FOLLOW_S_DUW_in_options_assign6546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_RUW_in_options_assign6548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQLCURRULE_in_options_assign6570 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_S_DB2_in_options_assign6577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_STD_in_options_assign6579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQLPATH_in_options_assign6601 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_S_LIBL_in_options_assign6608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_options_assign6610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CNULRQD_in_options_assign6632 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_S_YES_in_options_assign6639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NO_in_options_assign6641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SRTSEQ_in_options_assign6663 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000EC40080000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_S_JOB_in_options_assign6670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_HEX_in_options_assign6672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_JOBRUN_in_options_assign6674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_LANGIDUNQ_in_options_assign6676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_LANGIDSHR_in_options_assign6678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_CURLIB_in_options_assign6680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_LIBL_in_options_assign6683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_options_assign6687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TGTRLS_in_options_assign6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_options_assign6716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMFMT_in_options_assign6738 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00003A0000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_S_HMS_in_options_assign6745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_ISO_in_options_assign6747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_EUR_in_options_assign6749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_USA_in_options_assign6751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_JIS_in_options_assign6753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMSEP_in_options_assign6775 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6777 = new BitSet(new long[]{0x0000800000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000000000L,0x0800400034000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_S_JOB_in_options_assign6782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_COLON_in_options_assign6784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_385_in_options_assign6786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_PERIOD_in_options_assign6788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_options_assign6790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_COMMA_in_options_assign6792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_options_assign6794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_BLANK_in_options_assign6796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USRPRF_in_options_assign6818 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_options_assign6820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0440000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_S_OWNER_in_options_assign6825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_USER_in_options_assign6827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_NAMING_in_options_assign6829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_transaction_statement6865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement6867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ISOLATION_in_set_transaction_statement6869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LEVEL_in_set_transaction_statement6871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0001002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_isolation_level_in_set_transaction_statement6875 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_set_transaction_statement6878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_read_operation_in_set_transaction_statement6882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERIALIZABLE_in_isolation_level6924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_no_commit_in_isolation_level6930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_uncommitted_in_isolation_level6936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_committed_in_isolation_level6942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatable_read_in_isolation_level6948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_no_commit6962 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_COMMIT_in_no_commit6964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_uncommitted6987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_UNCOMMITTED_in_read_uncommitted6989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_committed7008 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_COMMITTED_in_read_committed7010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEATABLE_in_repeatable_read7031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_READ_in_repeatable_read7033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_only_in_read_operation7052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_write_in_read_operation7058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_only7071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ONLY_in_read_only7073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_write7093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_WRITE_in_read_write7095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute_statement7126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_execute_statement7130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement7169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement7171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_execute_immediate_statement7175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_in_open_statement7210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_open_statement7214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_USING_in_open_statement7218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_open_statement7222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_open_statement7226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_DESCRIPTOR_in_open_statement7228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_open_statement7233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_open_statement7237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREPARE_in_prepare_statement7408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_prepare_statement7412 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_into_clause_in_prepare_statement7415 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_FROM_in_prepare_statement7419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_prepare_statement7423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_in_declare_cursor_statement7473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_declare_cursor_statement7477 = new BitSet(new long[]{0x1000000000000000L,0x0000000000800000L,0x1000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_DYNAMIC_in_declare_cursor_statement7482 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x1000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_scroll_in_declare_cursor_statement7489 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_CURSOR_in_declare_cursor_statement7493 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0060000000000000L});
	public static final BitSet FOLLOW_hold_in_declare_cursor_statement7498 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_FOR_in_declare_cursor_statement7502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_declare_cursor_statement7506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCROLL_in_scroll7566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_scroll7578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_SCROLL_in_scroll7580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_hold7600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_HOLD_in_hold7602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHOUT_in_hold7615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_HOLD_in_hold7617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCRIBE_in_describe_statement7644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_describe_statement7648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_into_clause_in_describe_statement7650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FETCH_in_fetch_statement7682 = new BitSet(new long[]{0x0800000000400020L,0x0408000000000000L,0x0800000204000000L,0x0000100020000000L});
	public static final BitSet FOLLOW_fetch_position_in_fetch_statement7685 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_FROM_in_fetch_statement7690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_fetch_statement7696 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_fetch_into_in_fetch_statement7699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_fetch_position7744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIOR_in_fetch_position7746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_fetch_position7748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_fetch_position7750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEFORE_in_fetch_position7752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AFTER_in_fetch_position7754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_in_fetch_position7756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELATIVE_in_fetch_position7776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_fetch_position7781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_fetch_position7785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_fetch_in_fetch_into7855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiple_row_fetch_in_fetch_into7863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_single_fetch7882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_into_variable_in_single_fetch7884 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_single_fetch7888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_into_variable_in_single_fetch7890 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_Variable_in_into_variable7929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_multiple_row_fetch7959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_fetch7964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_multiple_row_fetch7966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_ROWS_in_multiple_row_fetch7969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_multiple_row_in_multiple_row_fetch7974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_INTO_in_multiple_row_fetch7978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_fetch7982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_multiple_row8080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_DESCRIPTOR_in_multiple_row8082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row8086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLOSE_in_close_statement8122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_close_statement8126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_into_clause8167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_into_clause8172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_Variable_in_into_clause8176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_USING_in_into_clause8180 = new BitSet(new long[]{0x0000000020008100L,0x0000000000000000L,0x0020000080000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_using_target_in_into_clause8184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMES_in_using_target8260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABELS_in_using_target8262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANY_in_using_target8264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOTH_in_using_target8266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_using_target8268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_system_names_in_using_target8270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYSTEM_in_system_names8283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_NAMES_in_system_names8285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_table_elements8308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_field_element_in_table_elements8310 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_COMMA_in_table_elements8313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_field_element_in_table_elements8315 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_table_elements8319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_field_element8343 = new BitSet(new long[]{0x000000309F800000L,0x00F0000000200061L,0x02800000001F9000L,0x00000400000000C0L,0x0000000000001000L,0x00001C0004F20000L});
	public static final BitSet FOLLOW_FOR_in_field_element8346 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_COLUMN_in_field_element8348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_field_element8352 = new BitSet(new long[]{0x000000309F800000L,0x0070000000200061L,0x02800000001F9000L,0x00000400000000C0L,0x0000000000001000L,0x00001C0004F20000L});
	public static final BitSet FOLLOW_field_type_in_field_element8356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_not_null_in_field_element8359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_with_default_in_field_element8364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_not_null8414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_NULL_in_not_null8416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_with_default8437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_DEFAULT_in_with_default8439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_field_type8465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_expression_body_in_query_expression8486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_query_expression_body8498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_expression_body8504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_non_join_query_expression8517 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_expression8521 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression8523 = new BitSet(new long[]{0x0000000000000100L,0x0000000000020000L,0x0000000804000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression8539 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression8547 = new BitSet(new long[]{0x0000000000000100L,0x0000000000020000L,0x0000000804000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression8563 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_non_join_query_term_in_query_term8577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_term8583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_primary_in_non_join_query_term8597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_term8601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term8603 = new BitSet(new long[]{0x0000000000000100L,0x0000000000020000L,0x0000000804000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term8613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term8621 = new BitSet(new long[]{0x0000000000000100L,0x0000000000020000L,0x0000000804000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term8631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_non_join_query_primary_in_query_primary8645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_primary8651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_table_in_non_join_query_primary8663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_non_join_query_primary8669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000804000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_non_join_query_expression_in_non_join_query_primary8671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_non_join_query_primary8673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_specification_in_simple_table8694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_query_specification8706 = new BitSet(new long[]{0x2020000800000100L,0x0000000000020000L,0x2004200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_set_qualifier_in_query_specification8708 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2004200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_select_list_in_query_specification8711 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L,0x0000008000000011L,0x0000000000020000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_from_clause_in_query_specification8713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000011L,0x0000000000020000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_where_clause_in_query_specification8716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000011L,0x0000000000020000L});
	public static final BitSet FOLLOW_groupby_clause_in_query_specification8719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000010L,0x0000000000020000L});
	public static final BitSet FOLLOW_having_clause_in_query_specification8722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_orderby_clause_in_query_specification8729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_limit_clause_in_query_specification8732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_select_list8782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_column_in_select_list8796 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_select_list8799 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_derived_column_in_select_list8801 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_set_qualifier8824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_set_qualifier8838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_derived_column8858 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_as_clause_in_derived_column8860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_column_reference8888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_as_clause8912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_in_as_clause8916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list8927 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_column_reference_list8930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list8932 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_Identifier_in_table8950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_identifier_in_table8962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier8977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_DIVIDE_in_qualified_identifier8979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier8983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_qualified_identifier8986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier8990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_qualified_identifier8992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_member9027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_DIVIDE_in_member9029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_member9033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_member9035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_member9039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_member9041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause9076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_table_reference_list_in_from_clause9079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list9090 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_table_reference_list9093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list9095 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_table_primary_in_table_reference9114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_table_reference9120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_primary_in_joined_table9132 = new BitSet(new long[]{0x0200000000000000L,0x0800000000000000L,0x0100000410002000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table9135 = new BitSet(new long[]{0x0200000000000002L,0x0800000000000000L,0x0100000410002000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table9139 = new BitSet(new long[]{0x0200000000000002L,0x0800000000000000L,0x0100000410002000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_natural_join_in_joined_table9143 = new BitSet(new long[]{0x0200000000000002L,0x0800000000000000L,0x0100000410002000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_union_join_in_joined_table9147 = new BitSet(new long[]{0x0200000000000002L,0x0800000000000000L,0x0100000410002000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table_prim9161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table_prim9167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_natural_join_in_joined_table_prim9173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_join_in_joined_table_prim9179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CROSS_in_cross_join9191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_JOIN_in_cross_join9193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_table_primary_in_cross_join9197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_type_in_qualified_join9223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_JOIN_in_qualified_join9227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_table_primary_in_qualified_join9231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_join_specification_in_qualified_join9235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATURAL_in_natural_join9263 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000410002000L,0x0020000000000000L});
	public static final BitSet FOLLOW_join_type_in_natural_join9268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_JOIN_in_natural_join9272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_table_primary_in_natural_join9276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union_join9303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_JOIN_in_union_join9305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_table_primary_in_union_join9309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNER_in_join_type9332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type9340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_OUTER_in_join_type9342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type9359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_condition_in_join_specification9404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_named_columns_join_in_join_specification9410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition9422 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_search_condition_in_join_condition9425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_named_columns_join9437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_named_columns_join9439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_list_in_named_columns_join9443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_named_columns_join9445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_in_table_primary9466 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_AS_in_table_primary9470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_table_primary9476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause9504 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_search_condition_in_where_clause9507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_routine_invocation9520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation9522 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0040080002000024L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation9524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation9527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation9542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation9544 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation9546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation9548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation9561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation9563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_MULTIPLY_in_routine_invocation9565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation9567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs9584 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_funcArgs9587 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs9589 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause9610 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_BY_in_groupby_clause9612 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000804000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_grouping_element_list_in_groupby_clause9616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list9637 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_grouping_element_list9640 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000804000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list9642 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_element9661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollup_list_in_grouping_element9667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cube_list_in_grouping_element9673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_grouping_set_in_grouping_element9679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set9691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_ordinary_grouping_set9697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set9700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set9702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLUP_in_rollup_list9715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_rollup_list9717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000804000000L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_rollup_list9721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_rollup_list9723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUBE_in_cube_list9744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_cube_list9746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000804000000L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_cube_list9750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_cube_list9752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_empty_grouping_set9773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_empty_grouping_set9775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause9793 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_value_expression_in_having_clause9796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause9810 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_BY_in_orderby_clause9812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_sort_specifier_list_in_orderby_clause9814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list9834 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_sort_specifier_list9837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list9839 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specifier9864 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_order_specification_in_sort_specifier9868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_null_ordering_in_sort_specifier9873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASC_in_order_specification9903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESC_in_order_specification9917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIMIT_in_limit_clause9937 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_limit_clause9941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering9962 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_FIRST_in_null_ordering9964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering9978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LAST_in_null_ordering9980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_search_condition10002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_param_clause10013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_param_clause10015 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause10017 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_COMMA_in_param_clause10020 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause10022 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_param_clause10026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_param10049 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_param10051 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_param10055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_method_specifier10079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_method_specifier10083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression10103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_OR_in_boolean_value_expression10106 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression10109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate10122 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_AND_in_and_predicate10125 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate10128 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor10141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_boolean_factor10147 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor10149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_test10169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_is_clause_in_boolean_test10171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_is_clause10184 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000820000000L});
	public static final BitSet FOLLOW_NOT_in_is_clause10186 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000820000000L});
	public static final BitSet FOLLOW_truth_value_in_is_clause10191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_boolean_primary10235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_boolean_primary10241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_primary10247 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_value_expression_in_boolean_primary10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_primary10252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_primary10259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_predicate10273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_predicate10279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_predicate10285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_predicate_in_predicate10291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate10315 = new BitSet(new long[]{0x0000000000000000L,0x8000000100000000L,0x4000041000000004L});
	public static final BitSet FOLLOW_comp_op_in_comparison_predicate10319 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate10323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_predicate10391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000200L});
	public static final BitSet FOLLOW_NOT_in_in_predicate10394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_IN_in_in_predicate10397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_predicate_value_in_in_predicate10401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value10425 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate_value10428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value10431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list10443 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMA_in_in_value_list10448 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list10450 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate10472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000004000000000L});
	public static final BitSet FOLLOW_NOT_in_like_predicate10474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate10477 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_like_predicate10481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_null_predicate10512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_IS_in_null_predicate10514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_NOT_in_null_predicate10519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_NULL_in_null_predicate10523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression10551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_set_in_numeric_value_expression10554 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression10561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_numeric_primary_in_term10574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L,0x0004800000000000L});
	public static final BitSet FOLLOW_set_in_term10577 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_primary_in_term10586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L,0x0004800000000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_array10599 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_literal_in_array10601 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_COMMA_in_array10604 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_literal_in_array10606 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_array10611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_numeric_primary10628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_numeric_primary10633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_numeric_primary10638 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_numeric_primary10641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_numeric_primary10643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routine_invocation_in_numeric_primary10649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_value_expr_in_literal10660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signed_numerical_literal_in_literal10666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal10672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_string_value_expr10684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_signed_numerical_literal10696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000020L});
	public static final BitSet FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal10699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_specification_in_case_expression10747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLIF_in_case_abbreviation10759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation10761 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation10763 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation10765 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation10767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation10770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COALESCE_in_case_abbreviation10776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation10778 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation10780 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation10784 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation10786 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation10792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_in_case_specification10804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_searched_case_in_case_specification10810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_simple_case10822 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_case10824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case10828 = new BitSet(new long[]{0x0000000000000000L,0x00000000A0000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_else_clause_in_simple_case10835 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_END_in_simple_case10841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_searched_case10853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_searched_when_clause_in_searched_case10857 = new BitSet(new long[]{0x0000000000000000L,0x00000000A0000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_else_clause_in_searched_case10862 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_END_in_searched_case10866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_simple_when_clause10877 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_when_clause10879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_THEN_in_simple_when_clause10881 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_result_in_simple_when_clause10883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_searched_when_clause10893 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_search_condition_in_searched_when_clause10897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_THEN_in_searched_when_clause10899 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_result_in_searched_when_clause10903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_clause10927 = new BitSet(new long[]{0x2020000000000000L,0x0000000000000000L,0x0000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_result_in_else_clause10931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_result10952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_result10956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_synpred67_DBL5792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_synpred72_DBL5832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CNULRQD_in_synpred87_DBL6032 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred87_DBL6034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_synpred87_DBL6038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CNULRQD_in_synpred144_DBL6632 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred144_DBL6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_synpred144_DBL6638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_synpred210_DBL8498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred211_DBL8517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred219_DBL8577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred240_DBL8930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_in_synpred240_DBL8932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred283_DBL10235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred284_DBL10241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred285_DBL10247 = new BitSet(new long[]{0x2020000800000000L,0x0000000000000000L,0x2000200804000000L,0x0000080002000024L});
	public static final BitSet FOLLOW_boolean_value_expression_in_synpred285_DBL10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred285_DBL10252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_synpred286_DBL10273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_synpred287_DBL10279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_synpred288_DBL10285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred319_DBL10952 = new BitSet(new long[]{0x0000000000000002L});
}
