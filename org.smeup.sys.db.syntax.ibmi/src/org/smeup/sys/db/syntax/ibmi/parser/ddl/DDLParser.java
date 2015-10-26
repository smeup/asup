// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g 2015-10-26 17:24:04

package org.smeup.sys.db.syntax.ibmi.parser.ddl;
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
public class DDLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALIAS", "ALIAS_NAME", "ALL", 
		"ALLOW", "ALLOW_READ", "ALL_SQL", "AND", "AS", "ASC", "ASSIGN", "AS_EXPRESSION", 
		"B", "BAD", "BIGINT", "BINARY", "BIT", "BLOB", "BOOL", "BOOLEAN", "BY", 
		"BYTEA", "C", "CALL", "CASCADE", "CASE", "CHAR", "CHARACTER", "CHAR_SPECIAL", 
		"COALESCE", "COLUMN", "COLUMNS_LIST", "COLUMN_NAME", "COMMA", "COMMENT", 
		"COMMIT", "COMMITTED", "COMMIT_STATEMENT", "CONNECT", "CONNECTION", "CONNECT_STATEMENT", 
		"COUNT", "COUNT_ROWS", "COUNT_VAL", "CREATE", "CREATE_ALIAS_STATEMENT", 
		"CREATE_INDEX_STATEMENT", "CREATE_TABLE_STATEMENT", "CREATE_VIEW_STATEMENT", 
		"CROSS", "CUBE", "CURRENT", "Character_String_Literal", "Control_Characters", 
		"D", "DATE", "DB_NAME", "DEC", "DECIMAL", "DEFAULT", "DESC", "DESC_TABLE", 
		"DISCONNECT", "DISCONNECT_STATEMENT", "DISTINCT", "DIVIDE", "DOT", "DOUBLE", 
		"DROP", "DROP_ALIAS_STATEMENT", "DROP_INDEX_STATEMENT", "DROP_TABLE_STATEMENT", 
		"DROP_VIEW_STATEMENT", "Digit", "Double_Quote", "E", "ELSE", "EMPTY_GROUPING_SET", 
		"END", "EQUAL", "ESC_SEQ", "EXCEPT", "EXCLUSIVE", "EXPONENT", "EXTERNAL", 
		"Extended_Control_Characters", "F", "FALSE", "FIELD_DEF", "FIELD_NAME", 
		"FIELD_TYPE", "FIRST", "FLOAT", "FLOAT4", "FLOAT8", "FOR", "FORMAT", "FOR_COLUMN", 
		"FROM", "FULL", "FUNCTION", "FUNC_ARGS", "G", "GEQ", "GROUP", "GROUP_BY", 
		"GTH", "H", "HAVING", "HEX_DIGIT", "HOLD", "I", "IN", "INDEX", "INDEX_NAME", 
		"INET4", "INNER", "INSERT", "INT", "INT1", "INT2", "INT4", "INT8", "INTEGER", 
		"INTERSECT", "INTO", "IS", "ISOLATION", "ISOLATION_LEVEL", "Identifier", 
		"J", "JOIN", "K", "L", "LAST", "LEFT", "LEFT_PAREN", "LEQ", "LEVEL", "LIKE", 
		"LIMIT", "LOCATION", "LOCK", "LOCK_TABLE_STATEMENT", "LTH", "M", "MEMBER", 
		"MINUS", "MODE", "MODULAR", "MULTIPLY", "N", "NAME", "NATIONAL", "NATURAL", 
		"NCHAR", "NEW_NAME", "NO", "NOT", "NOT_EQUAL", "NOT_NULL", "NO_COMMIT", 
		"NULL", "NULLIF", "NULL_ORDER", "NUMBER", "NUMERIC", "NVARCHAR", "O", 
		"OCTAL_ESC", "ON", "ONLY", "OR", "ORDER", "ORDER_BY", "OR_REPLACE", "OUTER", 
		"P", "PARAM", "PARAMS", "PLUS", "PRECISION", "PROCEDURE_ARGS", "PROCEDURE_CALL_STATEMENT", 
		"PROCEDURE_NAME", "Q", "QUALIFIED", "Quote", "R", "READ", "READ_COMMITTED", 
		"READ_ONLY", "READ_UNCOMMITTED", "READ_WRITE", "REAL", "REAL_NUMBER", 
		"RELEASE", "RELEASE_STATEMENT", "RENAME", "RENAME_INDEX_STATEMENT", "RENAME_TABLE_STATEMENT", 
		"REPEATABLE", "REPEATABLE_READ", "REPLACE", "RESET", "RESTRICT", "RIGHT", 
		"RIGHT_PAREN", "ROLLBACK", "ROLLBACK_STATEMENT", "ROLLUP", "RW_OPERATION", 
		"S", "SELECT", "SEL_LIST", "SEMI_COLON", "SERIALIZABLE", "SERVER_NAME", 
		"SET", "SET_CONNECTION_STATEMENT", "SET_QUALIFIER", "SET_TRANSACTION_STATEMENT", 
		"SHARE", "SHOW_FUNCTION", "SHOW_TABLE", "SMALLINT", "SORT_KEY", "SORT_SPECIFIERS", 
		"SQL", "STORE", "STORE_TYPE", "SYSTEM", "Space", "T", "TABLE", "TABLE_DEF", 
		"TABLE_NAME", "TARGET_FIELDS", "TEXT", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPTZ", 
		"TIMETZ", "TINYINT", "TO", "TRANSACTION", "TRUE", "U", "UNCOMMITTED", 
		"UNICODE_ESC", "UNION", "UNIQUE", "UNKNOWN", "USER", "USING", "V", "VALUES", 
		"VARBINARY", "VARBIT", "VARCHAR", "VARYING", "VIEW", "VIEW_NAME", "W", 
		"WHEN", "WHERE", "WITH", "WITH_DEFAULT", "WORK", "WRITE", "White_Space", 
		"X", "Y", "Z", "ZONE", "'into'", "'values'"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DDLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DDLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[389+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DDLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g"; }


	public static class data_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "data_type"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:340:1: data_type : ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type );
	public final DDLParser.data_type_return data_type() throws RecognitionException {
		DDLParser.data_type_return retval = new DDLParser.data_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:341:3: ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:341:5: boolean_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_type_in_data_type3149);
					boolean_type1=boolean_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type1.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:342:5: bit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bit_type_in_data_type3155);
					bit_type2=bit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bit_type2.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:343:5: varbit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbit_type_in_data_type3161);
					varbit_type3=varbit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbit_type3.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:344:5: binary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binary_type_in_data_type3167);
					binary_type4=binary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_type4.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:345:5: varbinary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbinary_type_in_data_type3173);
					varbinary_type5=varbinary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbinary_type5.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:346:5: blob_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_blob_type_in_data_type3179);
					blob_type6=blob_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blob_type6.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:347:5: INET4
					{
					root_0 = (CommonTree)adaptor.nil();


					INET47=(Token)match(input,INET4,FOLLOW_INET4_in_data_type3185); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INET47_tree = (CommonTree)adaptor.create(INET47);
					adaptor.addChild(root_0, INET47_tree);
					}

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:348:5: character_string_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_character_string_type_in_data_type3191);
					character_string_type8=character_string_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, character_string_type8.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:349:5: datetime_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_datetime_type_in_data_type3197);
					datetime_type9=datetime_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_type9.getTree());

					}
					break;
				case 10 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:350:5: numeric_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_type_in_data_type3203);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:352:1: character_string_type : ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT );
	public final DDLParser.character_string_type_return character_string_type() throws RecognitionException {
		DDLParser.character_string_type_return retval = new DDLParser.character_string_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:353:3: ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:353:5: char_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_char_type_in_character_string_type3215);
					char_type11=char_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_type11.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:354:5: varchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varchar_type_in_character_string_type3221);
					varchar_type12=varchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar_type12.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:355:5: nchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nchar_type_in_character_string_type3227);
					nchar_type13=nchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nchar_type13.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:356:5: nvarchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nvarchar_type_in_character_string_type3233);
					nvarchar_type14=nvarchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nvarchar_type14.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:357:5: TEXT
					{
					root_0 = (CommonTree)adaptor.nil();


					TEXT15=(Token)match(input,TEXT,FOLLOW_TEXT_in_character_string_type3239); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:359:1: numeric_type : ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type );
	public final DDLParser.numeric_type_return numeric_type() throws RecognitionException {
		DDLParser.numeric_type_return retval = new DDLParser.numeric_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:360:3: ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:360:5: int1_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int1_type_in_numeric_type3251);
					int1_type16=int1_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int1_type16.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:361:5: int2_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int2_type_in_numeric_type3257);
					int2_type17=int2_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int2_type17.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:362:5: int4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int4_type_in_numeric_type3263);
					int4_type18=int4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int4_type18.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:363:5: int8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int8_type_in_numeric_type3269);
					int8_type19=int8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int8_type19.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:364:5: float4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float4_type_in_numeric_type3275);
					float4_type20=float4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float4_type20.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:365:5: float_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_type_in_numeric_type3281);
					float_type21=float_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float_type21.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:366:5: float8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float8_type_in_numeric_type3287);
					float8_type22=float8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float8_type22.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:367:5: number_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_type_in_numeric_type3293);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:369:1: datetime_type : ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type );
	public final DDLParser.datetime_type_return datetime_type() throws RecognitionException {
		DDLParser.datetime_type_return retval = new DDLParser.datetime_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:370:3: ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:370:5: DATE
					{
					root_0 = (CommonTree)adaptor.nil();


					DATE24=(Token)match(input,DATE,FOLLOW_DATE_in_datetime_type3305); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DATE24_tree = (CommonTree)adaptor.create(DATE24);
					adaptor.addChild(root_0, DATE24_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:371:5: TIME
					{
					root_0 = (CommonTree)adaptor.nil();


					TIME25=(Token)match(input,TIME,FOLLOW_TIME_in_datetime_type3311); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIME25_tree = (CommonTree)adaptor.create(TIME25);
					adaptor.addChild(root_0, TIME25_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:372:5: timetz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timetz_type_in_datetime_type3317);
					timetz_type26=timetz_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timetz_type26.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:373:5: TIMESTAMP
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMP27=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_datetime_type3323); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMP27_tree = (CommonTree)adaptor.create(TIMESTAMP27);
					adaptor.addChild(root_0, TIMESTAMP27_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:374:5: timestamptz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timestamptz_type_in_datetime_type3329);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:376:1: precision_param : ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !);
	public final DDLParser.precision_param_return precision_param() throws RecognitionException {
		DDLParser.precision_param_return retval = new DDLParser.precision_param_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:377:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !)
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:377:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param3341); if (state.failed) return retval;
					NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3344); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER30_tree = (CommonTree)adaptor.create(NUMBER30);
					adaptor.addChild(root_0, NUMBER30_tree);
					}

					RIGHT_PAREN31=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param3346); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:378:5: LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN32=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param3353); if (state.failed) return retval;
					NUMBER33=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER33_tree = (CommonTree)adaptor.create(NUMBER33);
					adaptor.addChild(root_0, NUMBER33_tree);
					}

					COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_precision_param3358); if (state.failed) return retval;
					NUMBER35=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3361); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER35_tree = (CommonTree)adaptor.create(NUMBER35);
					adaptor.addChild(root_0, NUMBER35_tree);
					}

					RIGHT_PAREN36=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param3363); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:380:1: type_length : LEFT_PAREN ! NUMBER RIGHT_PAREN !;
	public final DDLParser.type_length_return type_length() throws RecognitionException {
		DDLParser.type_length_return retval = new DDLParser.type_length_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:381:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:381:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN37=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_length3376); if (state.failed) return retval;
			NUMBER38=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_type_length3379); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER38_tree = (CommonTree)adaptor.create(NUMBER38);
			adaptor.addChild(root_0, NUMBER38_tree);
			}

			RIGHT_PAREN39=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_length3381); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:383:1: boolean_type : ( BOOLEAN | BOOL -> BOOLEAN );
	public final DDLParser.boolean_type_return boolean_type() throws RecognitionException {
		DDLParser.boolean_type_return retval = new DDLParser.boolean_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:384:3: ( BOOLEAN | BOOL -> BOOLEAN )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:384:5: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN40=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN40_tree = (CommonTree)adaptor.create(BOOLEAN40);
					adaptor.addChild(root_0, BOOLEAN40_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:385:5: BOOL
					{
					BOOL41=(Token)match(input,BOOL,FOLLOW_BOOL_in_boolean_type3400); if (state.failed) return retval; 
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
					// 385:10: -> BOOLEAN
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:387:1: bit_type : BIT ( type_length )? -> BIT ;
	public final DDLParser.bit_type_return bit_type() throws RecognitionException {
		DDLParser.bit_type_return retval = new DDLParser.bit_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:388:3: ( BIT ( type_length )? -> BIT )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:388:5: BIT ( type_length )?
			{
			BIT42=(Token)match(input,BIT,FOLLOW_BIT_in_bit_type3416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BIT.add(BIT42);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:388:9: ( type_length )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:388:9: type_length
					{
					pushFollow(FOLLOW_type_length_in_bit_type3418);
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
			// 388:22: -> BIT
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:390:1: varbit_type : ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT );
	public final DDLParser.varbit_type_return varbit_type() throws RecognitionException {
		DDLParser.varbit_type_return retval = new DDLParser.varbit_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:391:3: ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:391:5: VARBIT ( type_length )?
					{
					VARBIT44=(Token)match(input,VARBIT,FOLLOW_VARBIT_in_varbit_type3435); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARBIT.add(VARBIT44);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:391:12: ( type_length )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LEFT_PAREN) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:391:12: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type3437);
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
					// 391:25: -> VARBIT
					{
						adaptor.addChild(root_0, stream_VARBIT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:392:5: BIT VARYING ( type_length )?
					{
					BIT46=(Token)match(input,BIT,FOLLOW_BIT_in_varbit_type3448); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIT.add(BIT46);

					VARYING47=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbit_type3450); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING47);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:392:17: ( type_length )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LEFT_PAREN) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:392:17: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type3452);
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
					// 392:30: -> VARBIT
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:394:1: int1_type : ( INT1 | TINYINT -> INT1 );
	public final DDLParser.int1_type_return int1_type() throws RecognitionException {
		DDLParser.int1_type_return retval = new DDLParser.int1_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:395:3: ( INT1 | TINYINT -> INT1 )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:395:5: INT1
					{
					root_0 = (CommonTree)adaptor.nil();


					INT149=(Token)match(input,INT1,FOLLOW_INT1_in_int1_type3469); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT149_tree = (CommonTree)adaptor.create(INT149);
					adaptor.addChild(root_0, INT149_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:396:5: TINYINT
					{
					TINYINT50=(Token)match(input,TINYINT,FOLLOW_TINYINT_in_int1_type3475); if (state.failed) return retval; 
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
					// 396:13: -> INT1
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:398:1: int2_type : ( INT2 | SMALLINT -> INT2 );
	public final DDLParser.int2_type_return int2_type() throws RecognitionException {
		DDLParser.int2_type_return retval = new DDLParser.int2_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:399:3: ( INT2 | SMALLINT -> INT2 )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:399:5: INT2
					{
					root_0 = (CommonTree)adaptor.nil();


					INT251=(Token)match(input,INT2,FOLLOW_INT2_in_int2_type3491); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT251_tree = (CommonTree)adaptor.create(INT251);
					adaptor.addChild(root_0, INT251_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:400:5: SMALLINT
					{
					SMALLINT52=(Token)match(input,SMALLINT,FOLLOW_SMALLINT_in_int2_type3497); if (state.failed) return retval; 
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
					// 400:14: -> INT2
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:402:1: int4_type : ( INT4 | INT -> INT4 | INTEGER -> INT4 );
	public final DDLParser.int4_type_return int4_type() throws RecognitionException {
		DDLParser.int4_type_return retval = new DDLParser.int4_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:403:3: ( INT4 | INT -> INT4 | INTEGER -> INT4 )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:403:5: INT4
					{
					root_0 = (CommonTree)adaptor.nil();


					INT453=(Token)match(input,INT4,FOLLOW_INT4_in_int4_type3513); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT453_tree = (CommonTree)adaptor.create(INT453);
					adaptor.addChild(root_0, INT453_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:404:5: INT
					{
					INT54=(Token)match(input,INT,FOLLOW_INT_in_int4_type3519); if (state.failed) return retval; 
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
					// 404:9: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:405:5: INTEGER
					{
					INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_int4_type3529); if (state.failed) return retval; 
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
					// 405:13: -> INT4
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:407:1: int8_type : ( INT8 | BIGINT -> INT8 );
	public final DDLParser.int8_type_return int8_type() throws RecognitionException {
		DDLParser.int8_type_return retval = new DDLParser.int8_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:408:3: ( INT8 | BIGINT -> INT8 )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:408:5: INT8
					{
					root_0 = (CommonTree)adaptor.nil();


					INT856=(Token)match(input,INT8,FOLLOW_INT8_in_int8_type3545); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT856_tree = (CommonTree)adaptor.create(INT856);
					adaptor.addChild(root_0, INT856_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:409:5: BIGINT
					{
					BIGINT57=(Token)match(input,BIGINT,FOLLOW_BIGINT_in_int8_type3551); if (state.failed) return retval; 
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
					// 409:12: -> INT8
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:411:1: float4_type : ( FLOAT4 | REAL -> FLOAT4 );
	public final DDLParser.float4_type_return float4_type() throws RecognitionException {
		DDLParser.float4_type_return retval = new DDLParser.float4_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:412:3: ( FLOAT4 | REAL -> FLOAT4 )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:412:5: FLOAT4
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT458=(Token)match(input,FLOAT4,FOLLOW_FLOAT4_in_float4_type3567); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT458_tree = (CommonTree)adaptor.create(FLOAT458);
					adaptor.addChild(root_0, FLOAT458_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:413:5: REAL
					{
					REAL59=(Token)match(input,REAL,FOLLOW_REAL_in_float4_type3573); if (state.failed) return retval; 
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
					// 413:10: -> FLOAT4
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:1: float_type : FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) ;
	public final DDLParser.float_type_return float_type() throws RecognitionException {
		DDLParser.float_type_return retval = new DDLParser.float_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:12: ( FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:14: FLOAT ( type_length )?
			{
			FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_float_type3587); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT60);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:20: ( type_length )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LEFT_PAREN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:20: type_length
					{
					pushFollow(FOLLOW_type_length_in_float_type3589);
					type_length61=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_length.add(type_length61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: FLOAT, type_length
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 415:33: -> ^( FLOAT ( type_length )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:36: ^( FLOAT ( type_length )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FLOAT.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:415:44: ( type_length )?
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:416:1: float8_type : ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 );
	public final DDLParser.float8_type_return float8_type() throws RecognitionException {
		DDLParser.float8_type_return retval = new DDLParser.float8_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:417:3: ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:417:5: FLOAT8
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT862=(Token)match(input,FLOAT8,FOLLOW_FLOAT8_in_float8_type3608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT862_tree = (CommonTree)adaptor.create(FLOAT862);
					adaptor.addChild(root_0, FLOAT862_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:418:5: DOUBLE
					{
					DOUBLE63=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type3614); if (state.failed) return retval; 
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
					// 418:12: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:419:5: DOUBLE PRECISION
					{
					DOUBLE64=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type3624); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(DOUBLE64);

					PRECISION65=(Token)match(input,PRECISION,FOLLOW_PRECISION_in_float8_type3626); if (state.failed) return retval; 
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
					// 419:22: -> FLOAT8
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:421:1: number_type : ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) );
	public final DDLParser.number_type_return number_type() throws RecognitionException {
		DDLParser.number_type_return retval = new DDLParser.number_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:422:3: ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:422:5: NUMERIC ( precision_param )?
					{
					NUMERIC66=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number_type3642); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMERIC.add(NUMERIC66);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:422:13: ( precision_param )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LEFT_PAREN) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:422:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type3645);
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
					// 422:32: -> ^( NUMERIC precision_param )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:422:35: ^( NUMERIC precision_param )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:423:5: DECIMAL ( precision_param )?
					{
					DECIMAL68=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_number_type3661); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECIMAL.add(DECIMAL68);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:423:13: ( precision_param )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LEFT_PAREN) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:423:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type3664);
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
					// 423:32: -> ^( NUMERIC precision_param )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:423:35: ^( NUMERIC precision_param )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:424:5: DEC ( precision_param )?
					{
					DEC70=(Token)match(input,DEC,FOLLOW_DEC_in_number_type3682); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(DEC70);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:424:13: ( precision_param )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LEFT_PAREN) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:424:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type3689);
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
					// 424:32: -> ^( NUMERIC precision_param )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:424:35: ^( NUMERIC precision_param )
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:426:1: char_type : ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR );
	public final DDLParser.char_type_return char_type() throws RecognitionException {
		DDLParser.char_type_return retval = new DDLParser.char_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:427:3: ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:427:5: CHAR ( type_length )?
					{
					CHAR72=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_type3713); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHAR.add(CHAR72);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:427:10: ( type_length )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LEFT_PAREN) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:427:10: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type3715);
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
					// 427:23: -> CHAR
					{
						adaptor.addChild(root_0, stream_CHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:428:5: CHARACTER ( type_length )?
					{
					CHARACTER74=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_char_type3726); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER74);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:428:15: ( type_length )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LEFT_PAREN) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:428:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type3728);
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
					// 428:28: -> CHAR
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:430:1: varchar_type : ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR );
	public final DDLParser.varchar_type_return varchar_type() throws RecognitionException {
		DDLParser.varchar_type_return retval = new DDLParser.varchar_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:431:3: ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:431:5: VARCHAR ( type_length )?
					{
					VARCHAR76=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_varchar_type3745); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARCHAR.add(VARCHAR76);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:431:13: ( type_length )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LEFT_PAREN) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:431:13: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type3747);
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
					// 431:26: -> VARCHAR
					{
						adaptor.addChild(root_0, stream_VARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:432:5: CHARACTER VARYING ( type_length )?
					{
					CHARACTER78=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_varchar_type3758); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER78);

					VARYING79=(Token)match(input,VARYING,FOLLOW_VARYING_in_varchar_type3760); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING79);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:432:23: ( type_length )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LEFT_PAREN) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:432:23: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type3762);
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
					// 432:36: -> VARCHAR
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:434:1: nchar_type : ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR );
	public final DDLParser.nchar_type_return nchar_type() throws RecognitionException {
		DDLParser.nchar_type_return retval = new DDLParser.nchar_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:435:3: ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:435:5: NCHAR ( type_length )?
					{
					NCHAR81=(Token)match(input,NCHAR,FOLLOW_NCHAR_in_nchar_type3779); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCHAR.add(NCHAR81);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:435:11: ( type_length )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LEFT_PAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:435:11: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type3781);
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
					// 435:24: -> NCHAR
					{
						adaptor.addChild(root_0, stream_NCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:436:5: NATIONAL CHARACTER ( type_length )?
					{
					NATIONAL83=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nchar_type3792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL83);

					CHARACTER84=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nchar_type3794); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER84);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:436:24: ( type_length )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LEFT_PAREN) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:436:24: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type3796);
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
					// 436:37: -> NCHAR
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:438:1: nvarchar_type : ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR );
	public final DDLParser.nvarchar_type_return nvarchar_type() throws RecognitionException {
		DDLParser.nvarchar_type_return retval = new DDLParser.nvarchar_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:439:3: ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:439:5: NVARCHAR ( type_length )?
					{
					NVARCHAR86=(Token)match(input,NVARCHAR,FOLLOW_NVARCHAR_in_nvarchar_type3813); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NVARCHAR.add(NVARCHAR86);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:439:14: ( type_length )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LEFT_PAREN) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:439:14: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type3815);
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
					// 439:27: -> NVARCHAR
					{
						adaptor.addChild(root_0, stream_NVARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:440:5: NATIONAL CHARACTER VARYING ( type_length )?
					{
					NATIONAL88=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nvarchar_type3826); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL88);

					CHARACTER89=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nvarchar_type3828); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER89);

					VARYING90=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar_type3830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING90);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:440:32: ( type_length )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==LEFT_PAREN) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:440:32: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type3832);
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
					// 440:45: -> NVARCHAR
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:442:1: timetz_type : ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ );
	public final DDLParser.timetz_type_return timetz_type() throws RecognitionException {
		DDLParser.timetz_type_return retval = new DDLParser.timetz_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:443:3: ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:443:5: TIMETZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMETZ92=(Token)match(input,TIMETZ,FOLLOW_TIMETZ_in_timetz_type3849); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMETZ92_tree = (CommonTree)adaptor.create(TIMETZ92);
					adaptor.addChild(root_0, TIMETZ92_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:444:5: TIME WITH TIME ZONE
					{
					TIME93=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type3855); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME93);

					WITH94=(Token)match(input,WITH,FOLLOW_WITH_in_timetz_type3857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH94);

					TIME95=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type3859); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME95);

					ZONE96=(Token)match(input,ZONE,FOLLOW_ZONE_in_timetz_type3861); if (state.failed) return retval; 
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
					// 444:25: -> TIMETZ
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:446:1: timestamptz_type : ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ );
	public final DDLParser.timestamptz_type_return timestamptz_type() throws RecognitionException {
		DDLParser.timestamptz_type_return retval = new DDLParser.timestamptz_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:447:3: ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:447:5: TIMESTAMPTZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMPTZ97=(Token)match(input,TIMESTAMPTZ,FOLLOW_TIMESTAMPTZ_in_timestamptz_type3877); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMPTZ97_tree = (CommonTree)adaptor.create(TIMESTAMPTZ97);
					adaptor.addChild(root_0, TIMESTAMPTZ97_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:448:5: TIMESTAMP WITH TIME ZONE
					{
					TIMESTAMP98=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamptz_type3883); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP98);

					WITH99=(Token)match(input,WITH,FOLLOW_WITH_in_timestamptz_type3885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH99);

					TIME100=(Token)match(input,TIME,FOLLOW_TIME_in_timestamptz_type3887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME100);

					ZONE101=(Token)match(input,ZONE,FOLLOW_ZONE_in_timestamptz_type3889); if (state.failed) return retval; 
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
					// 448:30: -> TIMESTAMPTZ
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:450:1: binary_type : BINARY ( type_length )? ;
	public final DDLParser.binary_type_return binary_type() throws RecognitionException {
		DDLParser.binary_type_return retval = new DDLParser.binary_type_return();
		retval.start = input.LT(1);
		int binary_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BINARY102=null;
		ParserRuleReturnScope type_length103 =null;

		CommonTree BINARY102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:451:3: ( BINARY ( type_length )? )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:451:5: BINARY ( type_length )?
			{
			root_0 = (CommonTree)adaptor.nil();


			BINARY102=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary_type3905); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BINARY102_tree = (CommonTree)adaptor.create(BINARY102);
			adaptor.addChild(root_0, BINARY102_tree);
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:451:12: ( type_length )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==LEFT_PAREN) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:451:12: type_length
					{
					pushFollow(FOLLOW_type_length_in_binary_type3907);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:453:1: varbinary_type : ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? );
	public final DDLParser.varbinary_type_return varbinary_type() throws RecognitionException {
		DDLParser.varbinary_type_return retval = new DDLParser.varbinary_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:454:3: ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:454:5: VARBINARY ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					VARBINARY104=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_varbinary_type3920); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARBINARY104_tree = (CommonTree)adaptor.create(VARBINARY104);
					adaptor.addChild(root_0, VARBINARY104_tree);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:454:15: ( type_length )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LEFT_PAREN) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:454:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type3922);
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:455:5: BINARY VARYING ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					BINARY106=(Token)match(input,BINARY,FOLLOW_BINARY_in_varbinary_type3929); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BINARY106_tree = (CommonTree)adaptor.create(BINARY106);
					adaptor.addChild(root_0, BINARY106_tree);
					}

					VARYING107=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbinary_type3931); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARYING107_tree = (CommonTree)adaptor.create(VARYING107);
					adaptor.addChild(root_0, VARYING107_tree);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:455:20: ( type_length )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==LEFT_PAREN) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:455:20: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type3933);
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:457:1: blob_type : ( BLOB | BYTEA -> BLOB );
	public final DDLParser.blob_type_return blob_type() throws RecognitionException {
		DDLParser.blob_type_return retval = new DDLParser.blob_type_return();
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

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:458:3: ( BLOB | BYTEA -> BLOB )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:458:5: BLOB
					{
					root_0 = (CommonTree)adaptor.nil();


					BLOB109=(Token)match(input,BLOB,FOLLOW_BLOB_in_blob_type3946); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BLOB109_tree = (CommonTree)adaptor.create(BLOB109);
					adaptor.addChild(root_0, BLOB109_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:459:5: BYTEA
					{
					BYTEA110=(Token)match(input,BYTEA,FOLLOW_BYTEA_in_blob_type3952); if (state.failed) return retval; 
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
					// 459:11: -> BLOB
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:466:1: sql : statement EOF ;
	public final DDLParser.sql_return sql() throws RecognitionException {
		DDLParser.sql_return retval = new DDLParser.sql_return();
		retval.start = input.LT(1);
		int sql_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EOF112=null;
		ParserRuleReturnScope statement111 =null;

		CommonTree EOF112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:467:3: ( statement EOF )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:467:5: statement EOF
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_sql3970);
			statement111=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

			EOF112=(Token)match(input,EOF,FOLLOW_EOF_in_sql3972); if (state.failed) return retval;
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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:469:1: statement : (| schema_statement | index_statement | transaction_statement | control_statement | connection_statement );
	public final DDLParser.statement_return statement() throws RecognitionException {
		DDLParser.statement_return retval = new DDLParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope schema_statement113 =null;
		ParserRuleReturnScope index_statement114 =null;
		ParserRuleReturnScope transaction_statement115 =null;
		ParserRuleReturnScope control_statement116 =null;
		ParserRuleReturnScope connection_statement117 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:470:3: (| schema_statement | index_statement | transaction_statement | control_statement | connection_statement )
			int alt41=6;
			switch ( input.LA(1) ) {
			case EOF:
				{
				alt41=1;
				}
				break;
			case CREATE:
				{
				int LA41_2 = input.LA(2);
				if ( (LA41_2==ALIAS||LA41_2==EXTERNAL||LA41_2==OR||LA41_2==TABLE||LA41_2==VIEW) ) {
					alt41=2;
				}
				else if ( (LA41_2==INDEX||LA41_2==UNIQUE) ) {
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
			case DROP:
				{
				int LA41_3 = input.LA(2);
				if ( (LA41_3==ALIAS||LA41_3==TABLE||LA41_3==VIEW) ) {
					alt41=2;
				}
				else if ( (LA41_3==INDEX) ) {
					alt41=3;
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
			case RENAME:
				{
				int LA41_4 = input.LA(2);
				if ( (LA41_4==TABLE) ) {
					alt41=2;
				}
				else if ( (LA41_4==INDEX) ) {
					alt41=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMIT:
			case LOCK:
			case RELEASE:
			case ROLLBACK:
				{
				alt41=4;
				}
				break;
			case SET:
				{
				int LA41_6 = input.LA(2);
				if ( (LA41_6==TRANSACTION) ) {
					alt41=4;
				}
				else if ( (LA41_6==CONNECTION) ) {
					alt41=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CALL:
				{
				alt41=5;
				}
				break;
			case CONNECT:
			case DISCONNECT:
				{
				alt41=6;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:471:3: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:471:5: schema_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_schema_statement_in_statement3989);
					schema_statement113=schema_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, schema_statement113.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:472:5: index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_index_statement_in_statement3995);
					index_statement114=index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, index_statement114.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:473:5: transaction_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_transaction_statement_in_statement4001);
					transaction_statement115=transaction_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, transaction_statement115.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:474:5: control_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_control_statement_in_statement4007);
					control_statement116=control_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, control_statement116.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:475:5: connection_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_connection_statement_in_statement4013);
					connection_statement117=connection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, connection_statement117.getTree());

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


	public static class schema_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "schema_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:491:1: schema_statement : ( create_table_statement | create_view_statement | create_alias_statement | drop_alias_statement | drop_table_statement | drop_view_statement | rename_table_statement );
	public final DDLParser.schema_statement_return schema_statement() throws RecognitionException {
		DDLParser.schema_statement_return retval = new DDLParser.schema_statement_return();
		retval.start = input.LT(1);
		int schema_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope create_table_statement118 =null;
		ParserRuleReturnScope create_view_statement119 =null;
		ParserRuleReturnScope create_alias_statement120 =null;
		ParserRuleReturnScope drop_alias_statement121 =null;
		ParserRuleReturnScope drop_table_statement122 =null;
		ParserRuleReturnScope drop_view_statement123 =null;
		ParserRuleReturnScope rename_table_statement124 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:492:3: ( create_table_statement | create_view_statement | create_alias_statement | drop_alias_statement | drop_table_statement | drop_view_statement | rename_table_statement )
			int alt42=7;
			switch ( input.LA(1) ) {
			case CREATE:
				{
				switch ( input.LA(2) ) {
				case EXTERNAL:
				case TABLE:
					{
					alt42=1;
					}
					break;
				case VIEW:
					{
					alt42=2;
					}
					break;
				case ALIAS:
				case OR:
					{
					alt42=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case DROP:
				{
				switch ( input.LA(2) ) {
				case ALIAS:
					{
					alt42=4;
					}
					break;
				case TABLE:
					{
					alt42=5;
					}
					break;
				case VIEW:
					{
					alt42=6;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RENAME:
				{
				alt42=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:492:5: create_table_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_table_statement_in_schema_statement4038);
					create_table_statement118=create_table_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_table_statement118.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:493:5: create_view_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_view_statement_in_schema_statement4044);
					create_view_statement119=create_view_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_view_statement119.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:494:5: create_alias_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_alias_statement_in_schema_statement4050);
					create_alias_statement120=create_alias_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_alias_statement120.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:495:5: drop_alias_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_alias_statement_in_schema_statement4056);
					drop_alias_statement121=drop_alias_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_alias_statement121.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:496:5: drop_table_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_table_statement_in_schema_statement4062);
					drop_table_statement122=drop_table_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_table_statement122.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:497:5: drop_view_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_view_statement_in_schema_statement4068);
					drop_view_statement123=drop_view_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_view_statement123.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:498:5: rename_table_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rename_table_statement_in_schema_statement4075);
					rename_table_statement124=rename_table_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rename_table_statement124.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 29, schema_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "schema_statement"


	public static class index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "index_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:501:1: index_statement : ( create_index_statement | drop_index_statement | rename_index_statement );
	public final DDLParser.index_statement_return index_statement() throws RecognitionException {
		DDLParser.index_statement_return retval = new DDLParser.index_statement_return();
		retval.start = input.LT(1);
		int index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope create_index_statement125 =null;
		ParserRuleReturnScope drop_index_statement126 =null;
		ParserRuleReturnScope rename_index_statement127 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:502:3: ( create_index_statement | drop_index_statement | rename_index_statement )
			int alt43=3;
			switch ( input.LA(1) ) {
			case CREATE:
				{
				alt43=1;
				}
				break;
			case DROP:
				{
				alt43=2;
				}
				break;
			case RENAME:
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:503:3: create_index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_index_statement_in_index_statement4093);
					create_index_statement125=create_index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_index_statement125.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:505:3: drop_index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_index_statement_in_index_statement4101);
					drop_index_statement126=drop_index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_index_statement126.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:507:3: rename_index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rename_index_statement_in_index_statement4111);
					rename_index_statement127=rename_index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rename_index_statement127.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 30, index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "index_statement"


	public static class transaction_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "transaction_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:510:1: transaction_statement : ( commit_statement | lock_statement | release_statement | rollback_statement | set_transaction_statement );
	public final DDLParser.transaction_statement_return transaction_statement() throws RecognitionException {
		DDLParser.transaction_statement_return retval = new DDLParser.transaction_statement_return();
		retval.start = input.LT(1);
		int transaction_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope commit_statement128 =null;
		ParserRuleReturnScope lock_statement129 =null;
		ParserRuleReturnScope release_statement130 =null;
		ParserRuleReturnScope rollback_statement131 =null;
		ParserRuleReturnScope set_transaction_statement132 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:511:2: ( commit_statement | lock_statement | release_statement | rollback_statement | set_transaction_statement )
			int alt44=5;
			switch ( input.LA(1) ) {
			case COMMIT:
				{
				alt44=1;
				}
				break;
			case LOCK:
				{
				alt44=2;
				}
				break;
			case RELEASE:
				{
				alt44=3;
				}
				break;
			case ROLLBACK:
				{
				alt44=4;
				}
				break;
			case SET:
				{
				alt44=5;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:512:2: commit_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_commit_statement_in_transaction_statement4126);
					commit_statement128=commit_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commit_statement128.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:514:2: lock_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_lock_statement_in_transaction_statement4135);
					lock_statement129=lock_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lock_statement129.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:516:2: release_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_release_statement_in_transaction_statement4141);
					release_statement130=release_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, release_statement130.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:518:2: rollback_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollback_statement_in_transaction_statement4147);
					rollback_statement131=rollback_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollback_statement131.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:520:2: set_transaction_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_transaction_statement_in_transaction_statement4154);
					set_transaction_statement132=set_transaction_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_transaction_statement132.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 31, transaction_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "transaction_statement"


	public static class connection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "connection_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:523:1: connection_statement : ( connect_statement | disconnect_statement | set_connection_statement );
	public final DDLParser.connection_statement_return connection_statement() throws RecognitionException {
		DDLParser.connection_statement_return retval = new DDLParser.connection_statement_return();
		retval.start = input.LT(1);
		int connection_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope connect_statement133 =null;
		ParserRuleReturnScope disconnect_statement134 =null;
		ParserRuleReturnScope set_connection_statement135 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:524:2: ( connect_statement | disconnect_statement | set_connection_statement )
			int alt45=3;
			switch ( input.LA(1) ) {
			case CONNECT:
				{
				alt45=1;
				}
				break;
			case DISCONNECT:
				{
				alt45=2;
				}
				break;
			case SET:
				{
				alt45=3;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:525:2: connect_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_connect_statement_in_connection_statement4166);
					connect_statement133=connect_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, connect_statement133.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:527:2: disconnect_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_disconnect_statement_in_connection_statement4172);
					disconnect_statement134=disconnect_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, disconnect_statement134.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:529:2: set_connection_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_connection_statement_in_connection_statement4178);
					set_connection_statement135=set_connection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_connection_statement135.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 32, connection_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "connection_statement"


	public static class control_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "control_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:532:1: control_statement : call_procedure ;
	public final DDLParser.control_statement_return control_statement() throws RecognitionException {
		DDLParser.control_statement_return retval = new DDLParser.control_statement_return();
		retval.start = input.LT(1);
		int control_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope call_procedure136 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:533:2: ( call_procedure )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:534:2: call_procedure
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_call_procedure_in_control_statement4191);
			call_procedure136=call_procedure();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, call_procedure136.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 33, control_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "control_statement"


	public static class create_index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_index_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:538:1: create_index_statement : CREATE (u= UNIQUE )? INDEX n= table ON t= table (m= method_specifier )? LEFT_PAREN s= sort_specifier_list RIGHT_PAREN (p= param_clause )? -> ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s) ;
	public final DDLParser.create_index_statement_return create_index_statement() throws RecognitionException {
		DDLParser.create_index_statement_return retval = new DDLParser.create_index_statement_return();
		retval.start = input.LT(1);
		int create_index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token u=null;
		Token CREATE137=null;
		Token INDEX138=null;
		Token ON139=null;
		Token LEFT_PAREN140=null;
		Token RIGHT_PAREN141=null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope m =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope p =null;

		CommonTree u_tree=null;
		CommonTree CREATE137_tree=null;
		CommonTree INDEX138_tree=null;
		CommonTree ON139_tree=null;
		CommonTree LEFT_PAREN140_tree=null;
		CommonTree RIGHT_PAREN141_tree=null;
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
		RewriteRuleSubtreeStream stream_method_specifier=new RewriteRuleSubtreeStream(adaptor,"rule method_specifier");
		RewriteRuleSubtreeStream stream_param_clause=new RewriteRuleSubtreeStream(adaptor,"rule param_clause");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:539:2: ( CREATE (u= UNIQUE )? INDEX n= table ON t= table (m= method_specifier )? LEFT_PAREN s= sort_specifier_list RIGHT_PAREN (p= param_clause )? -> ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:540:2: CREATE (u= UNIQUE )? INDEX n= table ON t= table (m= method_specifier )? LEFT_PAREN s= sort_specifier_list RIGHT_PAREN (p= param_clause )?
			{
			CREATE137=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_statement4210); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE137);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:540:9: (u= UNIQUE )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==UNIQUE) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:540:10: u= UNIQUE
					{
					u=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_statement4215); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UNIQUE.add(u);

					}
					break;

			}

			INDEX138=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_statement4219); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX138);

			pushFollow(FOLLOW_table_in_create_index_statement4223);
			n=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(n.getTree());
			ON139=(Token)match(input,ON,FOLLOW_ON_in_create_index_statement4225); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ON.add(ON139);

			pushFollow(FOLLOW_table_in_create_index_statement4229);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:540:46: (m= method_specifier )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==USING) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:540:47: m= method_specifier
					{
					pushFollow(FOLLOW_method_specifier_in_create_index_statement4234);
					m=method_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_method_specifier.add(m.getTree());
					}
					break;

			}

			LEFT_PAREN140=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_create_index_statement4242); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN140);

			pushFollow(FOLLOW_sort_specifier_list_in_create_index_statement4246);
			s=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(s.getTree());
			RIGHT_PAREN141=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_create_index_statement4248); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN141);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:541:51: (p= param_clause )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==WITH) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:541:51: p= param_clause
					{
					pushFollow(FOLLOW_param_clause_in_create_index_statement4252);
					p=param_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param_clause.add(p.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: t, p, s, u, ON, n
			// token labels: u
			// rule labels: p, s, t, n, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
			RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 542:5: -> ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:542:8: ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_INDEX_STATEMENT, "CREATE_INDEX_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:542:34: ( $u)?
				if ( stream_u.hasNext() ) {
					adaptor.addChild(root_1, stream_u.nextNode());
				}
				stream_u.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:542:37: ( ^( INDEX_NAME $n) )?
				if ( stream_n.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:542:37: ^( INDEX_NAME $n)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_2);
					adaptor.addChild(root_2, stream_n.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_n.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:542:55: ^( ON $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_ON.nextNode(), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:542:65: ( $p)?
				if ( stream_p.hasNext() ) {
					adaptor.addChild(root_1, stream_p.nextTree());
				}
				stream_p.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 34, create_index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_index_statement"


	public static class drop_index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_index_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:545:1: drop_index_statement : DROP INDEX i= table -> ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) ) ;
	public final DDLParser.drop_index_statement_return drop_index_statement() throws RecognitionException {
		DDLParser.drop_index_statement_return retval = new DDLParser.drop_index_statement_return();
		retval.start = input.LT(1);
		int drop_index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP142=null;
		Token INDEX143=null;
		ParserRuleReturnScope i =null;

		CommonTree DROP142_tree=null;
		CommonTree INDEX143_tree=null;
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:546:2: ( DROP INDEX i= table -> ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:547:2: DROP INDEX i= table
			{
			DROP142=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_statement4305); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DROP.add(DROP142);

			INDEX143=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_statement4307); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX143);

			pushFollow(FOLLOW_table_in_drop_index_statement4311);
			i=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(i.getTree());
			// AST REWRITE
			// elements: i
			// token labels: 
			// rule labels: i, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 547:21: -> ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:547:24: ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_INDEX_STATEMENT, "DROP_INDEX_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:547:47: ^( INDEX_NAME $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 35, drop_index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_index_statement"


	public static class create_table_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_table_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:551:1: create_table_statement : ( CREATE EXTERNAL TABLE t= table def= table_elements USING f= Identifier (p= param_clause )? ( LOCATION path= Character_String_Literal ) -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) ) | CREATE TABLE t= table (def= table_elements )? ( USING s= Identifier )? (p= param_clause )? ( AS q= query_expression )? -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? ) );
	public final DDLParser.create_table_statement_return create_table_statement() throws RecognitionException {
		DDLParser.create_table_statement_return retval = new DDLParser.create_table_statement_return();
		retval.start = input.LT(1);
		int create_table_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token f=null;
		Token path=null;
		Token s=null;
		Token CREATE144=null;
		Token EXTERNAL145=null;
		Token TABLE146=null;
		Token USING147=null;
		Token LOCATION148=null;
		Token CREATE149=null;
		Token TABLE150=null;
		Token USING151=null;
		Token AS152=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope def =null;
		ParserRuleReturnScope p =null;
		ParserRuleReturnScope q =null;

		CommonTree f_tree=null;
		CommonTree path_tree=null;
		CommonTree s_tree=null;
		CommonTree CREATE144_tree=null;
		CommonTree EXTERNAL145_tree=null;
		CommonTree TABLE146_tree=null;
		CommonTree USING147_tree=null;
		CommonTree LOCATION148_tree=null;
		CommonTree CREATE149_tree=null;
		CommonTree TABLE150_tree=null;
		CommonTree USING151_tree=null;
		CommonTree AS152_tree=null;
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_LOCATION=new RewriteRuleTokenStream(adaptor,"token LOCATION");
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token EXTERNAL");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleSubtreeStream stream_param_clause=new RewriteRuleSubtreeStream(adaptor,"rule param_clause");
		RewriteRuleSubtreeStream stream_table_elements=new RewriteRuleSubtreeStream(adaptor,"rule table_elements");
		RewriteRuleSubtreeStream stream_query_expression=new RewriteRuleSubtreeStream(adaptor,"rule query_expression");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:552:3: ( CREATE EXTERNAL TABLE t= table def= table_elements USING f= Identifier (p= param_clause )? ( LOCATION path= Character_String_Literal ) -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) ) | CREATE TABLE t= table (def= table_elements )? ( USING s= Identifier )? (p= param_clause )? ( AS q= query_expression )? -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? ) )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CREATE) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==EXTERNAL) ) {
					alt54=1;
				}
				else if ( (LA54_1==TABLE) ) {
					alt54=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:552:5: CREATE EXTERNAL TABLE t= table def= table_elements USING f= Identifier (p= param_clause )? ( LOCATION path= Character_String_Literal )
					{
					CREATE144=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_statement4340); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CREATE.add(CREATE144);

					EXTERNAL145=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_table_statement4342); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EXTERNAL.add(EXTERNAL145);

					TABLE146=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_statement4344); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE146);

					pushFollow(FOLLOW_table_in_create_table_statement4348);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					pushFollow(FOLLOW_table_elements_in_create_table_statement4352);
					def=table_elements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_elements.add(def.getTree());
					USING147=(Token)match(input,USING,FOLLOW_USING_in_create_table_statement4354); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING147);

					f=(Token)match(input,Identifier,FOLLOW_Identifier_in_create_table_statement4358); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(f);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:553:6: (p= param_clause )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==WITH) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:553:6: p= param_clause
							{
							pushFollow(FOLLOW_param_clause_in_create_table_statement4366);
							p=param_clause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_param_clause.add(p.getTree());
							}
							break;

					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:553:21: ( LOCATION path= Character_String_Literal )
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:553:22: LOCATION path= Character_String_Literal
					{
					LOCATION148=(Token)match(input,LOCATION,FOLLOW_LOCATION_in_create_table_statement4370); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCATION.add(LOCATION148);

					path=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_create_table_statement4374); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Character_String_Literal.add(path);

					}

					// AST REWRITE
					// elements: f, EXTERNAL, USING, def, p, path, t, LOCATION
					// token labels: path, f
					// rule labels: p, def, t, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_path=new RewriteRuleTokenStream(adaptor,"token path",path);
					RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);
					RewriteRuleSubtreeStream stream_def=new RewriteRuleSubtreeStream(adaptor,"rule def",def!=null?def.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 554:7: -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:554:10: ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_TABLE_STATEMENT, "CREATE_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:554:35: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_EXTERNAL.nextNode());
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:554:61: ^( TABLE_DEF $def)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_DEF, "TABLE_DEF"), root_2);
						adaptor.addChild(root_2, stream_def.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:554:79: ^( USING $f)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
						adaptor.addChild(root_2, stream_f.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:554:92: ( $p)?
						if ( stream_p.hasNext() ) {
							adaptor.addChild(root_1, stream_p.nextTree());
						}
						stream_p.reset();

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:555:10: ^( LOCATION $path)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_LOCATION.nextNode(), root_2);
						adaptor.addChild(root_2, stream_path.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:556:5: CREATE TABLE t= table (def= table_elements )? ( USING s= Identifier )? (p= param_clause )? ( AS q= query_expression )?
					{
					CREATE149=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_statement4436); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CREATE.add(CREATE149);

					TABLE150=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_statement4438); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE150);

					pushFollow(FOLLOW_table_in_create_table_statement4442);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:556:26: (def= table_elements )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==LEFT_PAREN) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:556:27: def= table_elements
							{
							pushFollow(FOLLOW_table_elements_in_create_table_statement4447);
							def=table_elements();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_table_elements.add(def.getTree());
							}
							break;

					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:556:48: ( USING s= Identifier )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==USING) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:556:49: USING s= Identifier
							{
							USING151=(Token)match(input,USING,FOLLOW_USING_in_create_table_statement4452); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_USING.add(USING151);

							s=(Token)match(input,Identifier,FOLLOW_Identifier_in_create_table_statement4456); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(s);

							}
							break;

					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:557:5: (p= param_clause )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WITH) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:557:6: p= param_clause
							{
							pushFollow(FOLLOW_param_clause_in_create_table_statement4467);
							p=param_clause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_param_clause.add(p.getTree());
							}
							break;

					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:557:23: ( AS q= query_expression )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==AS) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:557:24: AS q= query_expression
							{
							AS152=(Token)match(input,AS,FOLLOW_AS_in_create_table_statement4472); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS152);

							pushFollow(FOLLOW_query_expression_in_create_table_statement4476);
							q=query_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_query_expression.add(q.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: t, AS, USING, def, s, p, q
					// token labels: s
					// rule labels: p, q, t, def, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);
					RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_def=new RewriteRuleSubtreeStream(adaptor,"rule def",def!=null?def.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 558:7: -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:10: ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_TABLE_STATEMENT, "CREATE_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:35: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:52: ( ^( TABLE_DEF $def) )?
						if ( stream_def.hasNext() ) {
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:52: ^( TABLE_DEF $def)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_DEF, "TABLE_DEF"), root_2);
							adaptor.addChild(root_2, stream_def.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_def.reset();

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:71: ( ^( USING $s) )?
						if ( stream_USING.hasNext()||stream_s.hasNext() ) {
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:71: ^( USING $s)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
							adaptor.addChild(root_2, stream_s.nextNode());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_USING.reset();
						stream_s.reset();

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:85: ( $p)?
						if ( stream_p.hasNext() ) {
							adaptor.addChild(root_1, stream_p.nextTree());
						}
						stream_p.reset();

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:88: ( ^( AS $q) )?
						if ( stream_AS.hasNext()||stream_q.hasNext() ) {
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:558:88: ^( AS $q)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_AS.nextNode(), root_2);
							adaptor.addChild(root_2, stream_q.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_AS.reset();
						stream_q.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 36, create_table_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_table_statement"


	public static class table_elements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_elements"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:560:1: table_elements : LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ ;
	public final DDLParser.table_elements_return table_elements() throws RecognitionException {
		DDLParser.table_elements_return retval = new DDLParser.table_elements_return();
		retval.start = input.LT(1);
		int table_elements_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN153=null;
		Token COMMA155=null;
		Token RIGHT_PAREN157=null;
		ParserRuleReturnScope field_element154 =null;
		ParserRuleReturnScope field_element156 =null;

		CommonTree LEFT_PAREN153_tree=null;
		CommonTree COMMA155_tree=null;
		CommonTree RIGHT_PAREN157_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_field_element=new RewriteRuleSubtreeStream(adaptor,"rule field_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:561:3: ( LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:561:5: LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN
			{
			LEFT_PAREN153=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_elements4537); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN153);

			pushFollow(FOLLOW_field_element_in_table_elements4539);
			field_element154=field_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_element.add(field_element154.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:561:30: ( COMMA field_element )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==COMMA) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:561:31: COMMA field_element
					{
					COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_elements4542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA155);

					pushFollow(FOLLOW_field_element_in_table_elements4544);
					field_element156=field_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field_element.add(field_element156.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			RIGHT_PAREN157=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_elements4548); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN157);

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
			// 562:5: -> ( field_element )+
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
			if ( state.backtracking>0 ) { memoize(input, 37, table_elements_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:565:1: field_element : Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) ;
	public final DDLParser.field_element_return field_element() throws RecognitionException {
		DDLParser.field_element_return retval = new DDLParser.field_element_return();
		retval.start = input.LT(1);
		int field_element_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token Identifier158=null;
		Token FOR159=null;
		Token COLUMN160=null;
		ParserRuleReturnScope field_type161 =null;
		ParserRuleReturnScope not_null162 =null;
		ParserRuleReturnScope with_default163 =null;

		CommonTree c_tree=null;
		CommonTree Identifier158_tree=null;
		CommonTree FOR159_tree=null;
		CommonTree COLUMN160_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleSubtreeStream stream_with_default=new RewriteRuleSubtreeStream(adaptor,"rule with_default");
		RewriteRuleSubtreeStream stream_not_null=new RewriteRuleSubtreeStream(adaptor,"rule not_null");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:3: ( Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:5: Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )?
			{
			Identifier158=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element4572); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier158);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:16: ( FOR COLUMN c= Identifier )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==FOR) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:17: FOR COLUMN c= Identifier
					{
					FOR159=(Token)match(input,FOR,FOLLOW_FOR_in_field_element4575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR.add(FOR159);

					COLUMN160=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_field_element4577); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN160);

					c=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element4581); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(c);

					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field_element4585);
			field_type161=field_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_type.add(field_type161.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:54: ( not_null )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==NOT) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:55: not_null
					{
					pushFollow(FOLLOW_not_null_in_field_element4588);
					not_null162=not_null();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_not_null.add(not_null162.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:66: ( with_default )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==WITH) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:67: with_default
					{
					pushFollow(FOLLOW_with_default_in_field_element4593);
					with_default163=with_default();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_with_default.add(with_default163.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: Identifier, with_default, c, field_type, not_null
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
			// 566:81: -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:84: ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_DEF, "FIELD_DEF"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:96: ^( FIELD_NAME Identifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_NAME, "FIELD_NAME"), root_2);
				adaptor.addChild(root_2, stream_Identifier.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:121: ( ^( FOR_COLUMN $c) )?
				if ( stream_c.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:121: ^( FOR_COLUMN $c)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_COLUMN, "FOR_COLUMN"), root_2);
					adaptor.addChild(root_2, stream_c.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_c.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:139: ^( FIELD_TYPE field_type )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_TYPE, "FIELD_TYPE"), root_2);
				adaptor.addChild(root_2, stream_field_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:164: ( not_null )?
				if ( stream_not_null.hasNext() ) {
					adaptor.addChild(root_1, stream_not_null.nextTree());
				}
				stream_not_null.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:566:176: ( with_default )?
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
			if ( state.backtracking>0 ) { memoize(input, 38, field_element_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:569:1: not_null : NOT NULL -> ^( NOT_NULL ) ;
	public final DDLParser.not_null_return not_null() throws RecognitionException {
		DDLParser.not_null_return retval = new DDLParser.not_null_return();
		retval.start = input.LT(1);
		int not_null_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT164=null;
		Token NULL165=null;

		CommonTree NOT164_tree=null;
		CommonTree NULL165_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:569:9: ( NOT NULL -> ^( NOT_NULL ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:570:2: NOT NULL
			{
			NOT164=(Token)match(input,NOT,FOLLOW_NOT_in_not_null4643); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NOT.add(NOT164);

			NULL165=(Token)match(input,NULL,FOLLOW_NULL_in_not_null4645); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL165);

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
			// 570:11: -> ^( NOT_NULL )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:570:14: ^( NOT_NULL )
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
			if ( state.backtracking>0 ) { memoize(input, 39, not_null_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:573:1: with_default : WITH DEFAULT -> ^( WITH_DEFAULT ) ;
	public final DDLParser.with_default_return with_default() throws RecognitionException {
		DDLParser.with_default_return retval = new DDLParser.with_default_return();
		retval.start = input.LT(1);
		int with_default_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH166=null;
		Token DEFAULT167=null;

		CommonTree WITH166_tree=null;
		CommonTree DEFAULT167_tree=null;
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:573:13: ( WITH DEFAULT -> ^( WITH_DEFAULT ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:574:2: WITH DEFAULT
			{
			WITH166=(Token)match(input,WITH,FOLLOW_WITH_in_with_default4666); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH166);

			DEFAULT167=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_with_default4668); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT167);

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
			// 574:15: -> ^( WITH_DEFAULT )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:574:18: ^( WITH_DEFAULT )
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
			if ( state.backtracking>0 ) { memoize(input, 40, with_default_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:577:1: field_type : data_type ;
	public final DDLParser.field_type_return field_type() throws RecognitionException {
		DDLParser.field_type_return retval = new DDLParser.field_type_return();
		retval.start = input.LT(1);
		int field_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope data_type168 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:578:3: ( data_type )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:578:5: data_type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_data_type_in_field_type4694);
			data_type168=data_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type168.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 41, field_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class create_view_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_view_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:581:1: create_view_statement : CREATE VIEW t= table (col= ordinary_grouping_set )? -> ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? ) ;
	public final DDLParser.create_view_statement_return create_view_statement() throws RecognitionException {
		DDLParser.create_view_statement_return retval = new DDLParser.create_view_statement_return();
		retval.start = input.LT(1);
		int create_view_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CREATE169=null;
		Token VIEW170=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope col =null;

		CommonTree CREATE169_tree=null;
		CommonTree VIEW170_tree=null;
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:582:3: ( CREATE VIEW t= table (col= ordinary_grouping_set )? -> ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:3: CREATE VIEW t= table (col= ordinary_grouping_set )?
			{
			CREATE169=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_statement4710); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE169);

			VIEW170=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_statement4712); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VIEW.add(VIEW170);

			pushFollow(FOLLOW_table_in_create_view_statement4716);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:23: (col= ordinary_grouping_set )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Identifier||LA59_0==LEFT_PAREN) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:24: col= ordinary_grouping_set
					{
					pushFollow(FOLLOW_ordinary_grouping_set_in_create_view_statement4721);
					col=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(col.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: col, t
			// token labels: 
			// rule labels: col, t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_col=new RewriteRuleSubtreeStream(adaptor,"rule col",col!=null?col.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 583:78: -> ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:81: ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_VIEW_STATEMENT, "CREATE_VIEW_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:105: ^( VIEW_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:121: ( ^( COLUMNS_LIST $col) )?
				if ( stream_col.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:583:121: ^( COLUMNS_LIST $col)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMNS_LIST, "COLUMNS_LIST"), root_2);
					adaptor.addChild(root_2, stream_col.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_col.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 42, create_view_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_view_statement"


	public static class create_alias_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_alias_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:586:1: create_alias_statement : CREATE ( or_replace )? ALIAS t= table FOR m= table -> ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) ) ;
	public final DDLParser.create_alias_statement_return create_alias_statement() throws RecognitionException {
		DDLParser.create_alias_statement_return retval = new DDLParser.create_alias_statement_return();
		retval.start = input.LT(1);
		int create_alias_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CREATE171=null;
		Token ALIAS173=null;
		Token FOR174=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope m =null;
		ParserRuleReturnScope or_replace172 =null;

		CommonTree CREATE171_tree=null;
		CommonTree ALIAS173_tree=null;
		CommonTree FOR174_tree=null;
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_ALIAS=new RewriteRuleTokenStream(adaptor,"token ALIAS");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleSubtreeStream stream_or_replace=new RewriteRuleSubtreeStream(adaptor,"rule or_replace");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:2: ( CREATE ( or_replace )? ALIAS t= table FOR m= table -> ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:4: CREATE ( or_replace )? ALIAS t= table FOR m= table
			{
			CREATE171=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_alias_statement4769); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE171);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:11: ( or_replace )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==OR) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:12: or_replace
					{
					pushFollow(FOLLOW_or_replace_in_create_alias_statement4772);
					or_replace172=or_replace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_or_replace.add(or_replace172.getTree());
					}
					break;

			}

			ALIAS173=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_create_alias_statement4776); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ALIAS.add(ALIAS173);

			pushFollow(FOLLOW_table_in_create_alias_statement4780);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			FOR174=(Token)match(input,FOR,FOLLOW_FOR_in_create_alias_statement4782); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR174);

			pushFollow(FOLLOW_table_in_create_alias_statement4786);
			m=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(m.getTree());
			// AST REWRITE
			// elements: m, or_replace, t
			// token labels: 
			// rule labels: t, m, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 587:51: -> ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:54: ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_ALIAS_STATEMENT, "CREATE_ALIAS_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:79: ( or_replace )?
				if ( stream_or_replace.hasNext() ) {
					adaptor.addChild(root_1, stream_or_replace.nextTree());
				}
				stream_or_replace.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:93: ^( ALIAS_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALIAS_NAME, "ALIAS_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:587:110: ^( TABLE_NAME $m)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
				adaptor.addChild(root_2, stream_m.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 43, create_alias_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_alias_statement"


	public static class or_replace_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "or_replace"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:591:1: or_replace : OR REPLACE -> ^( OR_REPLACE ) ;
	public final DDLParser.or_replace_return or_replace() throws RecognitionException {
		DDLParser.or_replace_return retval = new DDLParser.or_replace_return();
		retval.start = input.LT(1);
		int or_replace_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR175=null;
		Token REPLACE176=null;

		CommonTree OR175_tree=null;
		CommonTree REPLACE176_tree=null;
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleTokenStream stream_REPLACE=new RewriteRuleTokenStream(adaptor,"token REPLACE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:592:2: ( OR REPLACE -> ^( OR_REPLACE ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:593:2: OR REPLACE
			{
			OR175=(Token)match(input,OR,FOLLOW_OR_in_or_replace4829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OR.add(OR175);

			REPLACE176=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_or_replace4831); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPLACE.add(REPLACE176);

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
			// 593:13: -> ^( OR_REPLACE )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:593:16: ^( OR_REPLACE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OR_REPLACE, "OR_REPLACE"), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 44, or_replace_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "or_replace"


	public static class drop_alias_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_alias_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:596:1: drop_alias_statement : DROP ALIAS t= table -> ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) ) ;
	public final DDLParser.drop_alias_statement_return drop_alias_statement() throws RecognitionException {
		DDLParser.drop_alias_statement_return retval = new DDLParser.drop_alias_statement_return();
		retval.start = input.LT(1);
		int drop_alias_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP177=null;
		Token ALIAS178=null;
		ParserRuleReturnScope t =null;

		CommonTree DROP177_tree=null;
		CommonTree ALIAS178_tree=null;
		RewriteRuleTokenStream stream_ALIAS=new RewriteRuleTokenStream(adaptor,"token ALIAS");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:597:2: ( DROP ALIAS t= table -> ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:598:2: DROP ALIAS t= table
			{
			DROP177=(Token)match(input,DROP,FOLLOW_DROP_in_drop_alias_statement4850); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DROP.add(DROP177);

			ALIAS178=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_drop_alias_statement4852); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ALIAS.add(ALIAS178);

			pushFollow(FOLLOW_table_in_drop_alias_statement4856);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
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
			// 598:21: -> ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:598:24: ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_ALIAS_STATEMENT, "DROP_ALIAS_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:598:47: ^( ALIAS_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALIAS_NAME, "ALIAS_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 45, drop_alias_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_alias_statement"


	public static class commit_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "commit_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:601:1: commit_statement : COMMIT ( WORK )? (h= HOLD )? -> ^( COMMIT_STATEMENT ( $h)? ) ;
	public final DDLParser.commit_statement_return commit_statement() throws RecognitionException {
		DDLParser.commit_statement_return retval = new DDLParser.commit_statement_return();
		retval.start = input.LT(1);
		int commit_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token h=null;
		Token COMMIT179=null;
		Token WORK180=null;

		CommonTree h_tree=null;
		CommonTree COMMIT179_tree=null;
		CommonTree WORK180_tree=null;
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");
		RewriteRuleTokenStream stream_WORK=new RewriteRuleTokenStream(adaptor,"token WORK");
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:602:2: ( COMMIT ( WORK )? (h= HOLD )? -> ^( COMMIT_STATEMENT ( $h)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:2: COMMIT ( WORK )? (h= HOLD )?
			{
			COMMIT179=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement4883); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMIT.add(COMMIT179);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:10: ( WORK )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WORK) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:11: WORK
					{
					WORK180=(Token)match(input,WORK,FOLLOW_WORK_in_commit_statement4887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WORK.add(WORK180);

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:18: (h= HOLD )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==HOLD) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:19: h= HOLD
					{
					h=(Token)match(input,HOLD,FOLLOW_HOLD_in_commit_statement4894); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(h);

					}
					break;

			}

			// AST REWRITE
			// elements: h
			// token labels: h
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_h=new RewriteRuleTokenStream(adaptor,"token h",h);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 603:28: -> ^( COMMIT_STATEMENT ( $h)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:31: ^( COMMIT_STATEMENT ( $h)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMIT_STATEMENT, "COMMIT_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:603:51: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextNode());
				}
				stream_h.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 46, commit_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "commit_statement"


	public static class connect_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "connect_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:605:1: connect_statement : ( CONNECT ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )? -> ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? ) | CONNECT RESET -> ^( CONNECT_STATEMENT RESET ) );
	public final DDLParser.connect_statement_return connect_statement() throws RecognitionException {
		DDLParser.connect_statement_return retval = new DDLParser.connect_statement_return();
		retval.start = input.LT(1);
		int connect_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token u=null;
		Token p=null;
		Token CONNECT181=null;
		Token TO182=null;
		Token USER183=null;
		Token USING184=null;
		Token CONNECT185=null;
		Token RESET186=null;

		CommonTree s_tree=null;
		CommonTree u_tree=null;
		CommonTree p_tree=null;
		CommonTree CONNECT181_tree=null;
		CommonTree TO182_tree=null;
		CommonTree USER183_tree=null;
		CommonTree USING184_tree=null;
		CommonTree CONNECT185_tree=null;
		CommonTree RESET186_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_RESET=new RewriteRuleTokenStream(adaptor,"token RESET");
		RewriteRuleTokenStream stream_USER=new RewriteRuleTokenStream(adaptor,"token USER");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:2: ( CONNECT ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )? -> ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? ) | CONNECT RESET -> ^( CONNECT_STATEMENT RESET ) )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==CONNECT) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==RESET) ) {
					alt64=2;
				}
				else if ( (LA64_1==EOF||LA64_1==TO) ) {
					alt64=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:4: CONNECT ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )?
					{
					CONNECT181=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connect_statement4918); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT181);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:12: ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==TO) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:13: TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal )
							{
							TO182=(Token)match(input,TO,FOLLOW_TO_in_connect_statement4921); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TO.add(TO182);

							s=(Token)match(input,Identifier,FOLLOW_Identifier_in_connect_statement4926); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(s);

							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:30: ( USER u= Identifier USING p= Character_String_Literal )
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:31: USER u= Identifier USING p= Character_String_Literal
							{
							USER183=(Token)match(input,USER,FOLLOW_USER_in_connect_statement4929); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_USER.add(USER183);

							u=(Token)match(input,Identifier,FOLLOW_Identifier_in_connect_statement4933); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(u);

							USING184=(Token)match(input,USING,FOLLOW_USING_in_connect_statement4935); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_USING.add(USING184);

							p=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_connect_statement4939); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Character_String_Literal.add(p);

							}

							}
							break;

					}

					// AST REWRITE
					// elements: TO, USER, s, USING, u, p
					// token labels: p, s, u
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 606:85: -> ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:88: ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONNECT_STATEMENT, "CONNECT_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:108: ( ^( TO $s) ^( USER $u) ^( USING $p) )?
						if ( stream_TO.hasNext()||stream_USER.hasNext()||stream_s.hasNext()||stream_USING.hasNext()||stream_u.hasNext()||stream_p.hasNext() ) {
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:109: ^( TO $s)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_TO.nextNode(), root_2);
							adaptor.addChild(root_2, stream_s.nextNode());
							adaptor.addChild(root_1, root_2);
							}

							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:118: ^( USER $u)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_USER.nextNode(), root_2);
							adaptor.addChild(root_2, stream_u.nextNode());
							adaptor.addChild(root_1, root_2);
							}

							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:606:129: ^( USING $p)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
							adaptor.addChild(root_2, stream_p.nextNode());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_TO.reset();
						stream_USER.reset();
						stream_s.reset();
						stream_USING.reset();
						stream_u.reset();
						stream_p.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:608:5: CONNECT RESET
					{
					CONNECT185=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connect_statement4984); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT185);

					RESET186=(Token)match(input,RESET,FOLLOW_RESET_in_connect_statement4986); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RESET.add(RESET186);

					// AST REWRITE
					// elements: RESET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 608:19: -> ^( CONNECT_STATEMENT RESET )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:608:22: ^( CONNECT_STATEMENT RESET )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONNECT_STATEMENT, "CONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_RESET.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 47, connect_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "connect_statement"


	public static class disconnect_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "disconnect_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:611:1: disconnect_statement : ( DISCONNECT -> ^( DISCONNECT_STATEMENT ) | DISCONNECT ALL -> ^( DISCONNECT_STATEMENT ALL ) | DISCONNECT CURRENT -> ^( DISCONNECT_STATEMENT CURRENT ) );
	public final DDLParser.disconnect_statement_return disconnect_statement() throws RecognitionException {
		DDLParser.disconnect_statement_return retval = new DDLParser.disconnect_statement_return();
		retval.start = input.LT(1);
		int disconnect_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISCONNECT187=null;
		Token DISCONNECT188=null;
		Token ALL189=null;
		Token DISCONNECT190=null;
		Token CURRENT191=null;

		CommonTree DISCONNECT187_tree=null;
		CommonTree DISCONNECT188_tree=null;
		CommonTree ALL189_tree=null;
		CommonTree DISCONNECT190_tree=null;
		CommonTree CURRENT191_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_DISCONNECT=new RewriteRuleTokenStream(adaptor,"token DISCONNECT");
		RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:612:2: ( DISCONNECT -> ^( DISCONNECT_STATEMENT ) | DISCONNECT ALL -> ^( DISCONNECT_STATEMENT ALL ) | DISCONNECT CURRENT -> ^( DISCONNECT_STATEMENT CURRENT ) )
			int alt65=3;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==DISCONNECT) ) {
				switch ( input.LA(2) ) {
				case ALL:
					{
					alt65=2;
					}
					break;
				case CURRENT:
					{
					alt65=3;
					}
					break;
				case EOF:
					{
					alt65=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:612:4: DISCONNECT
					{
					DISCONNECT187=(Token)match(input,DISCONNECT,FOLLOW_DISCONNECT_in_disconnect_statement5006); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISCONNECT.add(DISCONNECT187);

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
					// 612:15: -> ^( DISCONNECT_STATEMENT )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:612:18: ^( DISCONNECT_STATEMENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISCONNECT_STATEMENT, "DISCONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:614:4: DISCONNECT ALL
					{
					DISCONNECT188=(Token)match(input,DISCONNECT,FOLLOW_DISCONNECT_in_disconnect_statement5022); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISCONNECT.add(DISCONNECT188);

					ALL189=(Token)match(input,ALL,FOLLOW_ALL_in_disconnect_statement5024); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL189);

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
					// 614:19: -> ^( DISCONNECT_STATEMENT ALL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:614:22: ^( DISCONNECT_STATEMENT ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISCONNECT_STATEMENT, "DISCONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_ALL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:616:4: DISCONNECT CURRENT
					{
					DISCONNECT190=(Token)match(input,DISCONNECT,FOLLOW_DISCONNECT_in_disconnect_statement5042); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISCONNECT.add(DISCONNECT190);

					CURRENT191=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_disconnect_statement5044); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CURRENT.add(CURRENT191);

					// AST REWRITE
					// elements: CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 616:23: -> ^( DISCONNECT_STATEMENT CURRENT )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:616:26: ^( DISCONNECT_STATEMENT CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISCONNECT_STATEMENT, "DISCONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_CURRENT.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 48, disconnect_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "disconnect_statement"


	public static class drop_table_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_table_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:619:1: drop_table_statement : ( DROP TABLE t= table -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) ) | DROP TABLE t= table restrict -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict ) | DROP TABLE t= table cascade -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade ) );
	public final DDLParser.drop_table_statement_return drop_table_statement() throws RecognitionException {
		DDLParser.drop_table_statement_return retval = new DDLParser.drop_table_statement_return();
		retval.start = input.LT(1);
		int drop_table_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP192=null;
		Token TABLE193=null;
		Token DROP194=null;
		Token TABLE195=null;
		Token DROP197=null;
		Token TABLE198=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope restrict196 =null;
		ParserRuleReturnScope cascade199 =null;

		CommonTree DROP192_tree=null;
		CommonTree TABLE193_tree=null;
		CommonTree DROP194_tree=null;
		CommonTree TABLE195_tree=null;
		CommonTree DROP197_tree=null;
		CommonTree TABLE198_tree=null;
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_cascade=new RewriteRuleSubtreeStream(adaptor,"rule cascade");
		RewriteRuleSubtreeStream stream_restrict=new RewriteRuleSubtreeStream(adaptor,"rule restrict");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:620:3: ( DROP TABLE t= table -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) ) | DROP TABLE t= table restrict -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict ) | DROP TABLE t= table cascade -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade ) )
			int alt66=3;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==DROP) ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1==TABLE) ) {
					int LA66_2 = input.LA(3);
					if ( (LA66_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case DIVIDE:
							{
							int LA66_4 = input.LA(5);
							if ( (LA66_4==Identifier) ) {
								switch ( input.LA(6) ) {
								case LEFT_PAREN:
									{
									int LA66_11 = input.LA(7);
									if ( (LA66_11==Identifier) ) {
										int LA66_13 = input.LA(8);
										if ( (LA66_13==RIGHT_PAREN) ) {
											switch ( input.LA(9) ) {
											case EOF:
												{
												alt66=1;
												}
												break;
											case RESTRICT:
												{
												alt66=2;
												}
												break;
											case CASCADE:
												{
												alt66=3;
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
														new NoViableAltException("", 66, 14, input);
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
													new NoViableAltException("", 66, 13, input);
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 66, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case EOF:
									{
									alt66=1;
									}
									break;
								case RESTRICT:
									{
									alt66=2;
									}
									break;
								case CASCADE:
									{
									alt66=3;
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
											new NoViableAltException("", 66, 9, input);
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
										new NoViableAltException("", 66, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case LEFT_PAREN:
							{
							int LA66_5 = input.LA(5);
							if ( (LA66_5==Identifier) ) {
								int LA66_10 = input.LA(6);
								if ( (LA66_10==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case EOF:
										{
										alt66=1;
										}
										break;
									case RESTRICT:
										{
										alt66=2;
										}
										break;
									case CASCADE:
										{
										alt66=3;
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
												new NoViableAltException("", 66, 12, input);
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
											new NoViableAltException("", 66, 10, input);
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
										new NoViableAltException("", 66, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case EOF:
							{
							alt66=1;
							}
							break;
						case RESTRICT:
							{
							alt66=2;
							}
							break;
						case CASCADE:
							{
							alt66=3;
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
									new NoViableAltException("", 66, 3, input);
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
								new NoViableAltException("", 66, 2, input);
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
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:621:2: DROP TABLE t= table
					{
					DROP192=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_statement5068); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP192);

					TABLE193=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_statement5070); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE193);

					pushFollow(FOLLOW_table_in_drop_table_statement5074);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
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
					// 621:22: -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:621:25: ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_TABLE_STATEMENT, "DROP_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:621:48: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:623:2: DROP TABLE t= table restrict
					{
					DROP194=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_statement5094); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP194);

					TABLE195=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_statement5096); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE195);

					pushFollow(FOLLOW_table_in_drop_table_statement5100);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					pushFollow(FOLLOW_restrict_in_drop_table_statement5102);
					restrict196=restrict();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrict.add(restrict196.getTree());
					// AST REWRITE
					// elements: t, restrict
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
					// 623:30: -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:623:33: ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_TABLE_STATEMENT, "DROP_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:623:56: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_restrict.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:625:2: DROP TABLE t= table cascade
					{
					DROP197=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_statement5123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP197);

					TABLE198=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_statement5125); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE198);

					pushFollow(FOLLOW_table_in_drop_table_statement5129);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					pushFollow(FOLLOW_cascade_in_drop_table_statement5131);
					cascade199=cascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cascade.add(cascade199.getTree());
					// AST REWRITE
					// elements: t, cascade
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
					// 625:29: -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:625:32: ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_TABLE_STATEMENT, "DROP_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:625:55: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_cascade.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 49, drop_table_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_table_statement"


	public static class drop_view_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_view_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:630:1: drop_view_statement : ( DROP VIEW v= table -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) ) | DROP VIEW v= table restrict -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict ) | DROP VIEW v= table cascade -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade ) );
	public final DDLParser.drop_view_statement_return drop_view_statement() throws RecognitionException {
		DDLParser.drop_view_statement_return retval = new DDLParser.drop_view_statement_return();
		retval.start = input.LT(1);
		int drop_view_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP200=null;
		Token VIEW201=null;
		Token DROP202=null;
		Token VIEW203=null;
		Token DROP205=null;
		Token VIEW206=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope restrict204 =null;
		ParserRuleReturnScope cascade207 =null;

		CommonTree DROP200_tree=null;
		CommonTree VIEW201_tree=null;
		CommonTree DROP202_tree=null;
		CommonTree VIEW203_tree=null;
		CommonTree DROP205_tree=null;
		CommonTree VIEW206_tree=null;
		RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_cascade=new RewriteRuleSubtreeStream(adaptor,"rule cascade");
		RewriteRuleSubtreeStream stream_restrict=new RewriteRuleSubtreeStream(adaptor,"rule restrict");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:631:3: ( DROP VIEW v= table -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) ) | DROP VIEW v= table restrict -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict ) | DROP VIEW v= table cascade -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade ) )
			int alt67=3;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==DROP) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==VIEW) ) {
					int LA67_2 = input.LA(3);
					if ( (LA67_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case DIVIDE:
							{
							int LA67_4 = input.LA(5);
							if ( (LA67_4==Identifier) ) {
								switch ( input.LA(6) ) {
								case LEFT_PAREN:
									{
									int LA67_11 = input.LA(7);
									if ( (LA67_11==Identifier) ) {
										int LA67_13 = input.LA(8);
										if ( (LA67_13==RIGHT_PAREN) ) {
											switch ( input.LA(9) ) {
											case EOF:
												{
												alt67=1;
												}
												break;
											case RESTRICT:
												{
												alt67=2;
												}
												break;
											case CASCADE:
												{
												alt67=3;
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
														new NoViableAltException("", 67, 14, input);
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
													new NoViableAltException("", 67, 13, input);
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 67, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case EOF:
									{
									alt67=1;
									}
									break;
								case RESTRICT:
									{
									alt67=2;
									}
									break;
								case CASCADE:
									{
									alt67=3;
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
											new NoViableAltException("", 67, 9, input);
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
										new NoViableAltException("", 67, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case LEFT_PAREN:
							{
							int LA67_5 = input.LA(5);
							if ( (LA67_5==Identifier) ) {
								int LA67_10 = input.LA(6);
								if ( (LA67_10==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case EOF:
										{
										alt67=1;
										}
										break;
									case RESTRICT:
										{
										alt67=2;
										}
										break;
									case CASCADE:
										{
										alt67=3;
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
												new NoViableAltException("", 67, 12, input);
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
											new NoViableAltException("", 67, 10, input);
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
										new NoViableAltException("", 67, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case EOF:
							{
							alt67=1;
							}
							break;
						case RESTRICT:
							{
							alt67=2;
							}
							break;
						case CASCADE:
							{
							alt67=3;
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
									new NoViableAltException("", 67, 3, input);
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
								new NoViableAltException("", 67, 2, input);
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
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:632:2: DROP VIEW v= table
					{
					DROP200=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_statement5165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP200);

					VIEW201=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_statement5167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW201);

					pushFollow(FOLLOW_table_in_drop_view_statement5171);
					v=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(v.getTree());
					// AST REWRITE
					// elements: v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 632:21: -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:632:24: ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_VIEW_STATEMENT, "DROP_VIEW_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:632:46: ^( VIEW_NAME $v)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
						adaptor.addChild(root_2, stream_v.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:634:2: DROP VIEW v= table restrict
					{
					DROP202=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_statement5191); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP202);

					VIEW203=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_statement5193); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW203);

					pushFollow(FOLLOW_table_in_drop_view_statement5197);
					v=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(v.getTree());
					pushFollow(FOLLOW_restrict_in_drop_view_statement5199);
					restrict204=restrict();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrict.add(restrict204.getTree());
					// AST REWRITE
					// elements: restrict, v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 634:29: -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:634:32: ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_VIEW_STATEMENT, "DROP_VIEW_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:634:54: ^( VIEW_NAME $v)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
						adaptor.addChild(root_2, stream_v.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_restrict.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:636:2: DROP VIEW v= table cascade
					{
					DROP205=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_statement5220); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP205);

					VIEW206=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_statement5222); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW206);

					pushFollow(FOLLOW_table_in_drop_view_statement5226);
					v=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(v.getTree());
					pushFollow(FOLLOW_cascade_in_drop_view_statement5228);
					cascade207=cascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cascade.add(cascade207.getTree());
					// AST REWRITE
					// elements: v, cascade
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 636:28: -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:636:31: ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_VIEW_STATEMENT, "DROP_VIEW_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:636:53: ^( VIEW_NAME $v)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
						adaptor.addChild(root_2, stream_v.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_cascade.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 50, drop_view_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_view_statement"


	public static class restrict_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "restrict"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:640:1: restrict : RESTRICT -> ^( RESTRICT ) ;
	public final DDLParser.restrict_return restrict() throws RecognitionException {
		DDLParser.restrict_return retval = new DDLParser.restrict_return();
		retval.start = input.LT(1);
		int restrict_StartIndex = input.index();

		CommonTree root_0 = null;

		Token RESTRICT208=null;

		CommonTree RESTRICT208_tree=null;
		RewriteRuleTokenStream stream_RESTRICT=new RewriteRuleTokenStream(adaptor,"token RESTRICT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:640:9: ( RESTRICT -> ^( RESTRICT ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:641:2: RESTRICT
			{
			RESTRICT208=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_restrict5265); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RESTRICT.add(RESTRICT208);

			// AST REWRITE
			// elements: RESTRICT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 641:11: -> ^( RESTRICT )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:641:14: ^( RESTRICT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_RESTRICT.nextNode(), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 51, restrict_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "restrict"


	public static class cascade_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cascade"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:644:1: cascade : CASCADE -> ^( CASCADE ) ;
	public final DDLParser.cascade_return cascade() throws RecognitionException {
		DDLParser.cascade_return retval = new DDLParser.cascade_return();
		retval.start = input.LT(1);
		int cascade_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASCADE209=null;

		CommonTree CASCADE209_tree=null;
		RewriteRuleTokenStream stream_CASCADE=new RewriteRuleTokenStream(adaptor,"token CASCADE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:644:8: ( CASCADE -> ^( CASCADE ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:645:2: CASCADE
			{
			CASCADE209=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_cascade5284); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CASCADE.add(CASCADE209);

			// AST REWRITE
			// elements: CASCADE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 645:11: -> ^( CASCADE )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:645:14: ^( CASCADE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_CASCADE.nextNode(), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 52, cascade_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cascade"


	public static class lock_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lock_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:648:1: lock_statement : ( LOCK TABLE t= table IN SHARE MODE -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) ) | LOCK TABLE t= table IN EXCLUSIVE MODE ( allow_read )? -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? ) );
	public final DDLParser.lock_statement_return lock_statement() throws RecognitionException {
		DDLParser.lock_statement_return retval = new DDLParser.lock_statement_return();
		retval.start = input.LT(1);
		int lock_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LOCK210=null;
		Token TABLE211=null;
		Token IN212=null;
		Token SHARE213=null;
		Token MODE214=null;
		Token LOCK215=null;
		Token TABLE216=null;
		Token IN217=null;
		Token EXCLUSIVE218=null;
		Token MODE219=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope allow_read220 =null;

		CommonTree LOCK210_tree=null;
		CommonTree TABLE211_tree=null;
		CommonTree IN212_tree=null;
		CommonTree SHARE213_tree=null;
		CommonTree MODE214_tree=null;
		CommonTree LOCK215_tree=null;
		CommonTree TABLE216_tree=null;
		CommonTree IN217_tree=null;
		CommonTree EXCLUSIVE218_tree=null;
		CommonTree MODE219_tree=null;
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_EXCLUSIVE=new RewriteRuleTokenStream(adaptor,"token EXCLUSIVE");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_MODE=new RewriteRuleTokenStream(adaptor,"token MODE");
		RewriteRuleTokenStream stream_LOCK=new RewriteRuleTokenStream(adaptor,"token LOCK");
		RewriteRuleTokenStream stream_SHARE=new RewriteRuleTokenStream(adaptor,"token SHARE");
		RewriteRuleSubtreeStream stream_allow_read=new RewriteRuleSubtreeStream(adaptor,"rule allow_read");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:649:2: ( LOCK TABLE t= table IN SHARE MODE -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) ) | LOCK TABLE t= table IN EXCLUSIVE MODE ( allow_read )? -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? ) )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LOCK) ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1==TABLE) ) {
					int LA69_2 = input.LA(3);
					if ( (LA69_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case DIVIDE:
							{
							int LA69_4 = input.LA(5);
							if ( (LA69_4==Identifier) ) {
								int LA69_7 = input.LA(6);
								if ( (LA69_7==LEFT_PAREN) ) {
									int LA69_11 = input.LA(7);
									if ( (LA69_11==Identifier) ) {
										int LA69_13 = input.LA(8);
										if ( (LA69_13==RIGHT_PAREN) ) {
											int LA69_14 = input.LA(9);
											if ( (LA69_14==IN) ) {
												int LA69_6 = input.LA(10);
												if ( (LA69_6==SHARE) ) {
													alt69=1;
												}
												else if ( (LA69_6==EXCLUSIVE) ) {
													alt69=2;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 69, 6, input);
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
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 69, 14, input);
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
													new NoViableAltException("", 69, 13, input);
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 69, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA69_7==IN) ) {
									int LA69_6 = input.LA(7);
									if ( (LA69_6==SHARE) ) {
										alt69=1;
									}
									else if ( (LA69_6==EXCLUSIVE) ) {
										alt69=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 69, 6, input);
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
											new NoViableAltException("", 69, 7, input);
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
										new NoViableAltException("", 69, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case LEFT_PAREN:
							{
							int LA69_5 = input.LA(5);
							if ( (LA69_5==Identifier) ) {
								int LA69_8 = input.LA(6);
								if ( (LA69_8==RIGHT_PAREN) ) {
									int LA69_12 = input.LA(7);
									if ( (LA69_12==IN) ) {
										int LA69_6 = input.LA(8);
										if ( (LA69_6==SHARE) ) {
											alt69=1;
										}
										else if ( (LA69_6==EXCLUSIVE) ) {
											alt69=2;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 69, 6, input);
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 69, 12, input);
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
											new NoViableAltException("", 69, 8, input);
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
										new NoViableAltException("", 69, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case IN:
							{
							int LA69_6 = input.LA(5);
							if ( (LA69_6==SHARE) ) {
								alt69=1;
							}
							else if ( (LA69_6==EXCLUSIVE) ) {
								alt69=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 69, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

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
									new NoViableAltException("", 69, 3, input);
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
								new NoViableAltException("", 69, 2, input);
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
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:650:2: LOCK TABLE t= table IN SHARE MODE
					{
					LOCK210=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_statement5303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCK.add(LOCK210);

					TABLE211=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_statement5305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE211);

					pushFollow(FOLLOW_table_in_lock_statement5309);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					IN212=(Token)match(input,IN,FOLLOW_IN_in_lock_statement5311); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN212);

					SHARE213=(Token)match(input,SHARE,FOLLOW_SHARE_in_lock_statement5313); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SHARE.add(SHARE213);

					MODE214=(Token)match(input,MODE,FOLLOW_MODE_in_lock_statement5315); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODE.add(MODE214);

					// AST REWRITE
					// elements: t, SHARE
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
					// 650:35: -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:650:38: ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCK_TABLE_STATEMENT, "LOCK_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:650:61: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:650:78: ^( SHARE )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_SHARE.nextNode(), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:2: LOCK TABLE t= table IN EXCLUSIVE MODE ( allow_read )?
					{
					LOCK215=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_statement5339); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCK.add(LOCK215);

					TABLE216=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_statement5341); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE216);

					pushFollow(FOLLOW_table_in_lock_statement5345);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					IN217=(Token)match(input,IN,FOLLOW_IN_in_lock_statement5347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN217);

					EXCLUSIVE218=(Token)match(input,EXCLUSIVE,FOLLOW_EXCLUSIVE_in_lock_statement5349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EXCLUSIVE.add(EXCLUSIVE218);

					MODE219=(Token)match(input,MODE,FOLLOW_MODE_in_lock_statement5351); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODE.add(MODE219);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:39: ( allow_read )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==ALLOW) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:40: allow_read
							{
							pushFollow(FOLLOW_allow_read_in_lock_statement5354);
							allow_read220=allow_read();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_allow_read.add(allow_read220.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: allow_read, t, EXCLUSIVE
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
					// 652:53: -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:56: ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCK_TABLE_STATEMENT, "LOCK_TABLE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:79: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:96: ^( EXCLUSIVE )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EXCLUSIVE.nextNode(), root_2);
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:652:109: ( allow_read )?
						if ( stream_allow_read.hasNext() ) {
							adaptor.addChild(root_1, stream_allow_read.nextTree());
						}
						stream_allow_read.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 53, lock_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "lock_statement"


	public static class allow_read_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "allow_read"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:655:1: allow_read : ALLOW READ -> ^( ALLOW_READ ) ;
	public final DDLParser.allow_read_return allow_read() throws RecognitionException {
		DDLParser.allow_read_return retval = new DDLParser.allow_read_return();
		retval.start = input.LT(1);
		int allow_read_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ALLOW221=null;
		Token READ222=null;

		CommonTree ALLOW221_tree=null;
		CommonTree READ222_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_ALLOW=new RewriteRuleTokenStream(adaptor,"token ALLOW");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:656:2: ( ALLOW READ -> ^( ALLOW_READ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:657:2: ALLOW READ
			{
			ALLOW221=(Token)match(input,ALLOW,FOLLOW_ALLOW_in_allow_read5392); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ALLOW.add(ALLOW221);

			READ222=(Token)match(input,READ,FOLLOW_READ_in_allow_read5394); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ222);

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
			// 657:13: -> ^( ALLOW_READ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:657:16: ^( ALLOW_READ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOW_READ, "ALLOW_READ"), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 54, allow_read_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allow_read"


	public static class rename_table_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rename_table_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:660:1: rename_table_statement : RENAME TABLE t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) ;
	public final DDLParser.rename_table_statement_return rename_table_statement() throws RecognitionException {
		DDLParser.rename_table_statement_return retval = new DDLParser.rename_table_statement_return();
		retval.start = input.LT(1);
		int rename_table_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token s=null;
		Token RENAME223=null;
		Token TABLE224=null;
		Token TO225=null;
		Token FOR226=null;
		Token SYSTEM227=null;
		Token NAME228=null;
		ParserRuleReturnScope t =null;

		CommonTree n_tree=null;
		CommonTree s_tree=null;
		CommonTree RENAME223_tree=null;
		CommonTree TABLE224_tree=null;
		CommonTree TO225_tree=null;
		CommonTree FOR226_tree=null;
		CommonTree SYSTEM227_tree=null;
		CommonTree NAME228_tree=null;
		RewriteRuleTokenStream stream_RENAME=new RewriteRuleTokenStream(adaptor,"token RENAME");
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:661:2: ( RENAME TABLE t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:662:2: RENAME TABLE t= table TO n= Identifier FOR SYSTEM NAME s= Identifier
			{
			RENAME223=(Token)match(input,RENAME,FOLLOW_RENAME_in_rename_table_statement5413); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RENAME.add(RENAME223);

			TABLE224=(Token)match(input,TABLE,FOLLOW_TABLE_in_rename_table_statement5415); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TABLE.add(TABLE224);

			pushFollow(FOLLOW_table_in_rename_table_statement5419);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			TO225=(Token)match(input,TO,FOLLOW_TO_in_rename_table_statement5421); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TO.add(TO225);

			n=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_table_statement5425); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(n);

			FOR226=(Token)match(input,FOR,FOLLOW_FOR_in_rename_table_statement5427); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR226);

			SYSTEM227=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_rename_table_statement5429); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM227);

			NAME228=(Token)match(input,NAME,FOLLOW_NAME_in_rename_table_statement5431); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME228);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_table_statement5435); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: SYSTEM, s, t, n
			// token labels: s, n
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 662:68: -> ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:662:71: ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RENAME_TABLE_STATEMENT, "RENAME_TABLE_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:662:96: ^( TABLE_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:662:113: ^( NEW_NAME $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW_NAME, "NEW_NAME"), root_2);
				adaptor.addChild(root_2, stream_n.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:662:128: ^( SYSTEM $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_SYSTEM.nextNode(), root_2);
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
			if ( state.backtracking>0 ) { memoize(input, 55, rename_table_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rename_table_statement"


	public static class rename_index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rename_index_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:665:1: rename_index_statement : RENAME INDEX t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) ;
	public final DDLParser.rename_index_statement_return rename_index_statement() throws RecognitionException {
		DDLParser.rename_index_statement_return retval = new DDLParser.rename_index_statement_return();
		retval.start = input.LT(1);
		int rename_index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token s=null;
		Token RENAME229=null;
		Token INDEX230=null;
		Token TO231=null;
		Token FOR232=null;
		Token SYSTEM233=null;
		Token NAME234=null;
		ParserRuleReturnScope t =null;

		CommonTree n_tree=null;
		CommonTree s_tree=null;
		CommonTree RENAME229_tree=null;
		CommonTree INDEX230_tree=null;
		CommonTree TO231_tree=null;
		CommonTree FOR232_tree=null;
		CommonTree SYSTEM233_tree=null;
		CommonTree NAME234_tree=null;
		RewriteRuleTokenStream stream_RENAME=new RewriteRuleTokenStream(adaptor,"token RENAME");
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:666:2: ( RENAME INDEX t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:667:2: RENAME INDEX t= table TO n= Identifier FOR SYSTEM NAME s= Identifier
			{
			RENAME229=(Token)match(input,RENAME,FOLLOW_RENAME_in_rename_index_statement5475); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RENAME.add(RENAME229);

			INDEX230=(Token)match(input,INDEX,FOLLOW_INDEX_in_rename_index_statement5477); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX230);

			pushFollow(FOLLOW_table_in_rename_index_statement5481);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			TO231=(Token)match(input,TO,FOLLOW_TO_in_rename_index_statement5483); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TO.add(TO231);

			n=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_index_statement5487); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(n);

			FOR232=(Token)match(input,FOR,FOLLOW_FOR_in_rename_index_statement5489); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR232);

			SYSTEM233=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_rename_index_statement5491); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM233);

			NAME234=(Token)match(input,NAME,FOLLOW_NAME_in_rename_index_statement5493); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME234);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_index_statement5497); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: n, SYSTEM, s, t
			// token labels: s, n
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 667:68: -> ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:667:71: ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RENAME_INDEX_STATEMENT, "RENAME_INDEX_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:667:96: ^( INDEX_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:667:113: ^( NEW_NAME $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW_NAME, "NEW_NAME"), root_2);
				adaptor.addChild(root_2, stream_n.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:667:128: ^( SYSTEM $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_SYSTEM.nextNode(), root_2);
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
			if ( state.backtracking>0 ) { memoize(input, 56, rename_index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rename_index_statement"


	public static class rollback_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rollback_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:671:1: rollback_statement : ROLLBACK (h= HOLD )? -> ^( ROLLBACK_STATEMENT ( $h)? ) ;
	public final DDLParser.rollback_statement_return rollback_statement() throws RecognitionException {
		DDLParser.rollback_statement_return retval = new DDLParser.rollback_statement_return();
		retval.start = input.LT(1);
		int rollback_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token h=null;
		Token ROLLBACK235=null;

		CommonTree h_tree=null;
		CommonTree ROLLBACK235_tree=null;
		RewriteRuleTokenStream stream_ROLLBACK=new RewriteRuleTokenStream(adaptor,"token ROLLBACK");
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:672:2: ( ROLLBACK (h= HOLD )? -> ^( ROLLBACK_STATEMENT ( $h)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:673:2: ROLLBACK (h= HOLD )?
			{
			ROLLBACK235=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement5540); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLBACK.add(ROLLBACK235);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:673:11: (h= HOLD )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==HOLD) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:673:12: h= HOLD
					{
					h=(Token)match(input,HOLD,FOLLOW_HOLD_in_rollback_statement5545); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(h);

					}
					break;

			}

			// AST REWRITE
			// elements: h
			// token labels: h
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_h=new RewriteRuleTokenStream(adaptor,"token h",h);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 673:21: -> ^( ROLLBACK_STATEMENT ( $h)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:673:24: ^( ROLLBACK_STATEMENT ( $h)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROLLBACK_STATEMENT, "ROLLBACK_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:673:45: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextNode());
				}
				stream_h.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 57, rollback_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rollback_statement"


	public static class release_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "release_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:676:1: release_statement : ( RELEASE s= Identifier -> ^( RELEASE_STATEMENT ^( SERVER_NAME $s) ) | RELEASE a= ALL -> ^( RELEASE_STATEMENT ^( SERVER_NAME $a) ) | RELEASE ALL SQL -> ^( RELEASE_STATEMENT ^( SERVER_NAME ALL_SQL ) ) | RELEASE c= CURRENT -> ^( RELEASE_STATEMENT ^( SERVER_NAME $c) ) );
	public final DDLParser.release_statement_return release_statement() throws RecognitionException {
		DDLParser.release_statement_return retval = new DDLParser.release_statement_return();
		retval.start = input.LT(1);
		int release_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token a=null;
		Token c=null;
		Token RELEASE236=null;
		Token RELEASE237=null;
		Token RELEASE238=null;
		Token ALL239=null;
		Token SQL240=null;
		Token RELEASE241=null;

		CommonTree s_tree=null;
		CommonTree a_tree=null;
		CommonTree c_tree=null;
		CommonTree RELEASE236_tree=null;
		CommonTree RELEASE237_tree=null;
		CommonTree RELEASE238_tree=null;
		CommonTree ALL239_tree=null;
		CommonTree SQL240_tree=null;
		CommonTree RELEASE241_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RELEASE=new RewriteRuleTokenStream(adaptor,"token RELEASE");
		RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");
		RewriteRuleTokenStream stream_SQL=new RewriteRuleTokenStream(adaptor,"token SQL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:677:2: ( RELEASE s= Identifier -> ^( RELEASE_STATEMENT ^( SERVER_NAME $s) ) | RELEASE a= ALL -> ^( RELEASE_STATEMENT ^( SERVER_NAME $a) ) | RELEASE ALL SQL -> ^( RELEASE_STATEMENT ^( SERVER_NAME ALL_SQL ) ) | RELEASE c= CURRENT -> ^( RELEASE_STATEMENT ^( SERVER_NAME $c) ) )
			int alt71=4;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==RELEASE) ) {
				switch ( input.LA(2) ) {
				case Identifier:
					{
					alt71=1;
					}
					break;
				case ALL:
					{
					int LA71_3 = input.LA(3);
					if ( (LA71_3==SQL) ) {
						alt71=3;
					}
					else if ( (LA71_3==EOF) ) {
						alt71=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 71, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case CURRENT:
					{
					alt71=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:677:4: RELEASE s= Identifier
					{
					RELEASE236=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5571); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE236);

					s=(Token)match(input,Identifier,FOLLOW_Identifier_in_release_statement5575); if (state.failed) return retval; 
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
					// 677:24: -> ^( RELEASE_STATEMENT ^( SERVER_NAME $s) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:677:27: ^( RELEASE_STATEMENT ^( SERVER_NAME $s) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:677:47: ^( SERVER_NAME $s)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SERVER_NAME, "SERVER_NAME"), root_2);
						adaptor.addChild(root_2, stream_s.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:679:4: RELEASE a= ALL
					{
					RELEASE237=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5597); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE237);

					a=(Token)match(input,ALL,FOLLOW_ALL_in_release_statement5601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(a);

					// AST REWRITE
					// elements: a
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
					// 679:19: -> ^( RELEASE_STATEMENT ^( SERVER_NAME $a) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:679:22: ^( RELEASE_STATEMENT ^( SERVER_NAME $a) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:679:42: ^( SERVER_NAME $a)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SERVER_NAME, "SERVER_NAME"), root_2);
						adaptor.addChild(root_2, stream_a.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:681:4: RELEASE ALL SQL
					{
					RELEASE238=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5625); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE238);

					ALL239=(Token)match(input,ALL,FOLLOW_ALL_in_release_statement5627); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL239);

					SQL240=(Token)match(input,SQL,FOLLOW_SQL_in_release_statement5629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SQL.add(SQL240);

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
					// 681:22: -> ^( RELEASE_STATEMENT ^( SERVER_NAME ALL_SQL ) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:681:25: ^( RELEASE_STATEMENT ^( SERVER_NAME ALL_SQL ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:681:45: ^( SERVER_NAME ALL_SQL )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SERVER_NAME, "SERVER_NAME"), root_2);
						adaptor.addChild(root_2, (CommonTree)adaptor.create(ALL_SQL, "ALL_SQL"));
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:683:4: RELEASE c= CURRENT
					{
					RELEASE241=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5653); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE241);

					c=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_release_statement5657); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CURRENT.add(c);

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
					// 683:22: -> ^( RELEASE_STATEMENT ^( SERVER_NAME $c) )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:683:25: ^( RELEASE_STATEMENT ^( SERVER_NAME $c) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:683:45: ^( SERVER_NAME $c)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SERVER_NAME, "SERVER_NAME"), root_2);
						adaptor.addChild(root_2, stream_c.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 58, release_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "release_statement"


	public static class set_connection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_connection_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:688:1: set_connection_statement : SET CONNECTION d= Identifier -> ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) ) ;
	public final DDLParser.set_connection_statement_return set_connection_statement() throws RecognitionException {
		DDLParser.set_connection_statement_return retval = new DDLParser.set_connection_statement_return();
		retval.start = input.LT(1);
		int set_connection_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token SET242=null;
		Token CONNECTION243=null;

		CommonTree d_tree=null;
		CommonTree SET242_tree=null;
		CommonTree CONNECTION243_tree=null;
		RewriteRuleTokenStream stream_CONNECTION=new RewriteRuleTokenStream(adaptor,"token CONNECTION");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:689:2: ( SET CONNECTION d= Identifier -> ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:690:2: SET CONNECTION d= Identifier
			{
			SET242=(Token)match(input,SET,FOLLOW_SET_in_set_connection_statement5686); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET242);

			CONNECTION243=(Token)match(input,CONNECTION,FOLLOW_CONNECTION_in_set_connection_statement5688); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CONNECTION.add(CONNECTION243);

			d=(Token)match(input,Identifier,FOLLOW_Identifier_in_set_connection_statement5692); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(d);

			// AST REWRITE
			// elements: d
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
			// 690:30: -> ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:690:33: ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_CONNECTION_STATEMENT, "SET_CONNECTION_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:690:60: ^( DB_NAME $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DB_NAME, "DB_NAME"), root_2);
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
			if ( state.backtracking>0 ) { memoize(input, 59, set_connection_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_connection_statement"


	public static class set_transaction_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_transaction_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:693:1: set_transaction_statement : SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) ;
	public final DDLParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
		DDLParser.set_transaction_statement_return retval = new DDLParser.set_transaction_statement_return();
		retval.start = input.LT(1);
		int set_transaction_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SET244=null;
		Token TRANSACTION245=null;
		Token ISOLATION246=null;
		Token LEVEL247=null;
		Token COMMA248=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope r =null;

		CommonTree SET244_tree=null;
		CommonTree TRANSACTION245_tree=null;
		CommonTree ISOLATION246_tree=null;
		CommonTree LEVEL247_tree=null;
		CommonTree COMMA248_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_ISOLATION=new RewriteRuleTokenStream(adaptor,"token ISOLATION");
		RewriteRuleTokenStream stream_TRANSACTION=new RewriteRuleTokenStream(adaptor,"token TRANSACTION");
		RewriteRuleTokenStream stream_LEVEL=new RewriteRuleTokenStream(adaptor,"token LEVEL");
		RewriteRuleSubtreeStream stream_isolation_level=new RewriteRuleSubtreeStream(adaptor,"rule isolation_level");
		RewriteRuleSubtreeStream stream_read_operation=new RewriteRuleSubtreeStream(adaptor,"rule read_operation");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:694:2: ( SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:695:2: SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )?
			{
			SET244=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement5718); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET244);

			TRANSACTION245=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement5720); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TRANSACTION.add(TRANSACTION245);

			ISOLATION246=(Token)match(input,ISOLATION,FOLLOW_ISOLATION_in_set_transaction_statement5722); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ISOLATION.add(ISOLATION246);

			LEVEL247=(Token)match(input,LEVEL,FOLLOW_LEVEL_in_set_transaction_statement5724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEVEL.add(LEVEL247);

			pushFollow(FOLLOW_isolation_level_in_set_transaction_statement5728);
			i=isolation_level();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_isolation_level.add(i.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:695:52: ( COMMA r= read_operation )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==COMMA) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:695:53: COMMA r= read_operation
					{
					COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_set_transaction_statement5731); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA248);

					pushFollow(FOLLOW_read_operation_in_set_transaction_statement5735);
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
			// 695:78: -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:697:2: ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_TRANSACTION_STATEMENT, "SET_TRANSACTION_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:697:30: ^( ISOLATION_LEVEL $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ISOLATION_LEVEL, "ISOLATION_LEVEL"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:697:52: ( ^( RW_OPERATION $r) )?
				if ( stream_r.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:697:53: ^( RW_OPERATION $r)
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
			if ( state.backtracking>0 ) { memoize(input, 60, set_transaction_statement_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:700:1: isolation_level : ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read );
	public final DDLParser.isolation_level_return isolation_level() throws RecognitionException {
		DDLParser.isolation_level_return retval = new DDLParser.isolation_level_return();
		retval.start = input.LT(1);
		int isolation_level_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SERIALIZABLE249=null;
		ParserRuleReturnScope no_commit250 =null;
		ParserRuleReturnScope read_uncommitted251 =null;
		ParserRuleReturnScope read_committed252 =null;
		ParserRuleReturnScope repeatable_read253 =null;

		CommonTree SERIALIZABLE249_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:701:2: ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read )
			int alt73=5;
			switch ( input.LA(1) ) {
			case SERIALIZABLE:
				{
				alt73=1;
				}
				break;
			case NO:
				{
				alt73=2;
				}
				break;
			case READ:
				{
				int LA73_3 = input.LA(2);
				if ( (LA73_3==UNCOMMITTED) ) {
					alt73=3;
				}
				else if ( (LA73_3==COMMITTED) ) {
					alt73=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case REPEATABLE:
				{
				alt73=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:702:2: SERIALIZABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					SERIALIZABLE249=(Token)match(input,SERIALIZABLE,FOLLOW_SERIALIZABLE_in_isolation_level5776); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SERIALIZABLE249_tree = (CommonTree)adaptor.create(SERIALIZABLE249);
					adaptor.addChild(root_0, SERIALIZABLE249_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:704:2: no_commit
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_no_commit_in_isolation_level5782);
					no_commit250=no_commit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, no_commit250.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:706:2: read_uncommitted
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_uncommitted_in_isolation_level5788);
					read_uncommitted251=read_uncommitted();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_uncommitted251.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:708:2: read_committed
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_committed_in_isolation_level5794);
					read_committed252=read_committed();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_committed252.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:710:2: repeatable_read
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repeatable_read_in_isolation_level5800);
					repeatable_read253=repeatable_read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatable_read253.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 61, isolation_level_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:713:1: no_commit : NO COMMIT -> ^( NO_COMMIT ) ;
	public final DDLParser.no_commit_return no_commit() throws RecognitionException {
		DDLParser.no_commit_return retval = new DDLParser.no_commit_return();
		retval.start = input.LT(1);
		int no_commit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NO254=null;
		Token COMMIT255=null;

		CommonTree NO254_tree=null;
		CommonTree COMMIT255_tree=null;
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:714:2: ( NO COMMIT -> ^( NO_COMMIT ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:715:2: NO COMMIT
			{
			NO254=(Token)match(input,NO,FOLLOW_NO_in_no_commit5814); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NO.add(NO254);

			COMMIT255=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_no_commit5816); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMIT.add(COMMIT255);

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
			// 715:12: -> ^( NO_COMMIT )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:715:15: ^( NO_COMMIT )
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
			if ( state.backtracking>0 ) { memoize(input, 62, no_commit_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:718:1: read_uncommitted : READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) ;
	public final DDLParser.read_uncommitted_return read_uncommitted() throws RecognitionException {
		DDLParser.read_uncommitted_return retval = new DDLParser.read_uncommitted_return();
		retval.start = input.LT(1);
		int read_uncommitted_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ256=null;
		Token UNCOMMITTED257=null;

		CommonTree READ256_tree=null;
		CommonTree UNCOMMITTED257_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_UNCOMMITTED=new RewriteRuleTokenStream(adaptor,"token UNCOMMITTED");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:719:2: ( READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:720:2: READ UNCOMMITTED
			{
			READ256=(Token)match(input,READ,FOLLOW_READ_in_read_uncommitted5839); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ256);

			UNCOMMITTED257=(Token)match(input,UNCOMMITTED,FOLLOW_UNCOMMITTED_in_read_uncommitted5841); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNCOMMITTED.add(UNCOMMITTED257);

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
			// 720:19: -> ^( READ_UNCOMMITTED )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:720:22: ^( READ_UNCOMMITTED )
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
			if ( state.backtracking>0 ) { memoize(input, 63, read_uncommitted_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:723:1: read_committed : READ COMMITTED -> ^( READ_COMMITTED ) ;
	public final DDLParser.read_committed_return read_committed() throws RecognitionException {
		DDLParser.read_committed_return retval = new DDLParser.read_committed_return();
		retval.start = input.LT(1);
		int read_committed_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ258=null;
		Token COMMITTED259=null;

		CommonTree READ258_tree=null;
		CommonTree COMMITTED259_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_COMMITTED=new RewriteRuleTokenStream(adaptor,"token COMMITTED");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:724:2: ( READ COMMITTED -> ^( READ_COMMITTED ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:725:2: READ COMMITTED
			{
			READ258=(Token)match(input,READ,FOLLOW_READ_in_read_committed5860); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ258);

			COMMITTED259=(Token)match(input,COMMITTED,FOLLOW_COMMITTED_in_read_committed5862); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMITTED.add(COMMITTED259);

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
			// 725:17: -> ^( READ_COMMITTED )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:725:20: ^( READ_COMMITTED )
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
			if ( state.backtracking>0 ) { memoize(input, 64, read_committed_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:728:1: repeatable_read : REPEATABLE READ -> ^( REPEATABLE_READ ) ;
	public final DDLParser.repeatable_read_return repeatable_read() throws RecognitionException {
		DDLParser.repeatable_read_return retval = new DDLParser.repeatable_read_return();
		retval.start = input.LT(1);
		int repeatable_read_StartIndex = input.index();

		CommonTree root_0 = null;

		Token REPEATABLE260=null;
		Token READ261=null;

		CommonTree REPEATABLE260_tree=null;
		CommonTree READ261_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_REPEATABLE=new RewriteRuleTokenStream(adaptor,"token REPEATABLE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:729:2: ( REPEATABLE READ -> ^( REPEATABLE_READ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:730:2: REPEATABLE READ
			{
			REPEATABLE260=(Token)match(input,REPEATABLE,FOLLOW_REPEATABLE_in_repeatable_read5883); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPEATABLE.add(REPEATABLE260);

			READ261=(Token)match(input,READ,FOLLOW_READ_in_repeatable_read5885); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ261);

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
			// 730:18: -> ^( REPEATABLE_READ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:730:21: ^( REPEATABLE_READ )
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
			if ( state.backtracking>0 ) { memoize(input, 65, repeatable_read_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:733:1: read_operation : ( read_only | read_write );
	public final DDLParser.read_operation_return read_operation() throws RecognitionException {
		DDLParser.read_operation_return retval = new DDLParser.read_operation_return();
		retval.start = input.LT(1);
		int read_operation_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope read_only262 =null;
		ParserRuleReturnScope read_write263 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:734:2: ( read_only | read_write )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==READ) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==ONLY) ) {
					alt74=1;
				}
				else if ( (LA74_1==WRITE) ) {
					alt74=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:735:2: read_only
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_only_in_read_operation5904);
					read_only262=read_only();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_only262.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:737:2: read_write
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_write_in_read_operation5910);
					read_write263=read_write();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_write263.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, read_operation_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:740:1: read_only : READ ONLY -> ^( READ_ONLY ) ;
	public final DDLParser.read_only_return read_only() throws RecognitionException {
		DDLParser.read_only_return retval = new DDLParser.read_only_return();
		retval.start = input.LT(1);
		int read_only_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ264=null;
		Token ONLY265=null;

		CommonTree READ264_tree=null;
		CommonTree ONLY265_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_ONLY=new RewriteRuleTokenStream(adaptor,"token ONLY");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:741:2: ( READ ONLY -> ^( READ_ONLY ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:742:2: READ ONLY
			{
			READ264=(Token)match(input,READ,FOLLOW_READ_in_read_only5923); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ264);

			ONLY265=(Token)match(input,ONLY,FOLLOW_ONLY_in_read_only5925); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ONLY.add(ONLY265);

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
			// 742:12: -> ^( READ_ONLY )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:742:15: ^( READ_ONLY )
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
			if ( state.backtracking>0 ) { memoize(input, 67, read_only_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:745:1: read_write : READ WRITE -> ^( READ_WRITE ) ;
	public final DDLParser.read_write_return read_write() throws RecognitionException {
		DDLParser.read_write_return retval = new DDLParser.read_write_return();
		retval.start = input.LT(1);
		int read_write_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ266=null;
		Token WRITE267=null;

		CommonTree READ266_tree=null;
		CommonTree WRITE267_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:746:2: ( READ WRITE -> ^( READ_WRITE ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:747:2: READ WRITE
			{
			READ266=(Token)match(input,READ,FOLLOW_READ_in_read_write5945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ266);

			WRITE267=(Token)match(input,WRITE,FOLLOW_WRITE_in_read_write5947); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WRITE.add(WRITE267);

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
			// 747:13: -> ^( READ_WRITE )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:747:16: ^( READ_WRITE )
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
			if ( state.backtracking>0 ) { memoize(input, 68, read_write_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_write"


	public static class call_procedure_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "call_procedure"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:751:1: call_procedure : CALL i= qualified_identifier ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN ) -> ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) ) ;
	public final DDLParser.call_procedure_return call_procedure() throws RecognitionException {
		DDLParser.call_procedure_return retval = new DDLParser.call_procedure_return();
		retval.start = input.LT(1);
		int call_procedure_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CALL268=null;
		Token LEFT_PAREN269=null;
		Token RIGHT_PAREN271=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope funcArgs270 =null;

		CommonTree CALL268_tree=null;
		CommonTree LEFT_PAREN269_tree=null;
		CommonTree RIGHT_PAREN271_tree=null;
		RewriteRuleTokenStream stream_CALL=new RewriteRuleTokenStream(adaptor,"token CALL");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");
		RewriteRuleSubtreeStream stream_qualified_identifier=new RewriteRuleSubtreeStream(adaptor,"rule qualified_identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:752:2: ( CALL i= qualified_identifier ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN ) -> ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:2: CALL i= qualified_identifier ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN )
			{
			CALL268=(Token)match(input,CALL,FOLLOW_CALL_in_call_procedure5970); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CALL.add(CALL268);

			pushFollow(FOLLOW_qualified_identifier_in_call_procedure5974);
			i=qualified_identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualified_identifier.add(i.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:30: ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:31: LEFT_PAREN ( funcArgs )? RIGHT_PAREN
			{
			LEFT_PAREN269=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_call_procedure5977); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN269);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:42: ( funcArgs )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==CASE||LA75_0==COUNT||LA75_0==Character_String_Literal||LA75_0==Identifier||LA75_0==LEFT_PAREN||LA75_0==MINUS||LA75_0==NOT||LA75_0==NULL||LA75_0==NUMBER||LA75_0==PLUS||LA75_0==REAL_NUMBER) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:42: funcArgs
					{
					pushFollow(FOLLOW_funcArgs_in_call_procedure5979);
					funcArgs270=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs270.getTree());
					}
					break;

			}

			RIGHT_PAREN271=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_call_procedure5982); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN271);

			}

			// AST REWRITE
			// elements: i, funcArgs
			// token labels: 
			// rule labels: i, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 753:65: -> ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:68: ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_CALL_STATEMENT, "PROCEDURE_CALL_STATEMENT"), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:95: ^( PROCEDURE_NAME $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_NAME, "PROCEDURE_NAME"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:116: ^( PROCEDURE_ARGS ( funcArgs )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_ARGS, "PROCEDURE_ARGS"), root_2);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:753:133: ( funcArgs )?
				if ( stream_funcArgs.hasNext() ) {
					adaptor.addChild(root_2, stream_funcArgs.nextTree());
				}
				stream_funcArgs.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 69, call_procedure_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call_procedure"


	public static class insert_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insert_statement"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:757:1: insert_statement : INSERT 'into' table ( LEFT_PAREN column_reference_list RIGHT_PAREN )? 'values' array -> ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? ) ;
	public final DDLParser.insert_statement_return insert_statement() throws RecognitionException {
		DDLParser.insert_statement_return retval = new DDLParser.insert_statement_return();
		retval.start = input.LT(1);
		int insert_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INSERT272=null;
		Token string_literal273=null;
		Token LEFT_PAREN275=null;
		Token RIGHT_PAREN277=null;
		Token string_literal278=null;
		ParserRuleReturnScope table274 =null;
		ParserRuleReturnScope column_reference_list276 =null;
		ParserRuleReturnScope array279 =null;

		CommonTree INSERT272_tree=null;
		CommonTree string_literal273_tree=null;
		CommonTree LEFT_PAREN275_tree=null;
		CommonTree RIGHT_PAREN277_tree=null;
		CommonTree string_literal278_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_280=new RewriteRuleTokenStream(adaptor,"token 280");
		RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
		RewriteRuleTokenStream stream_281=new RewriteRuleTokenStream(adaptor,"token 281");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");
		RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:758:3: ( INSERT 'into' table ( LEFT_PAREN column_reference_list RIGHT_PAREN )? 'values' array -> ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:758:5: INSERT 'into' table ( LEFT_PAREN column_reference_list RIGHT_PAREN )? 'values' array
			{
			INSERT272=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement6016); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INSERT.add(INSERT272);

			string_literal273=(Token)match(input,280,FOLLOW_280_in_insert_statement6018); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_280.add(string_literal273);

			pushFollow(FOLLOW_table_in_insert_statement6020);
			table274=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table274.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:758:25: ( LEFT_PAREN column_reference_list RIGHT_PAREN )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LEFT_PAREN) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:758:26: LEFT_PAREN column_reference_list RIGHT_PAREN
					{
					LEFT_PAREN275=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_insert_statement6023); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN275);

					pushFollow(FOLLOW_column_reference_list_in_insert_statement6025);
					column_reference_list276=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference_list.add(column_reference_list276.getTree());
					RIGHT_PAREN277=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_insert_statement6027); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN277);

					}
					break;

			}

			string_literal278=(Token)match(input,281,FOLLOW_281_in_insert_statement6031); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_281.add(string_literal278);

			pushFollow(FOLLOW_array_in_insert_statement6033);
			array279=array();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_array.add(array279.getTree());
			// AST REWRITE
			// elements: table, array, INSERT, column_reference_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 759:3: -> ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:759:6: ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INSERT.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:759:15: ^( TABLE table )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_2);
				adaptor.addChild(root_2, stream_table.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:759:30: ^( VALUES array )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUES, "VALUES"), root_2);
				adaptor.addChild(root_2, stream_array.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:759:46: ( ^( TARGET_FIELDS column_reference_list ) )?
				if ( stream_column_reference_list.hasNext() ) {
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:759:46: ^( TARGET_FIELDS column_reference_list )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TARGET_FIELDS, "TARGET_FIELDS"), root_2);
					adaptor.addChild(root_2, stream_column_reference_list.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_column_reference_list.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 70, insert_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "insert_statement"


	public static class query_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_expression"
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:773:1: query_expression : query_expression_body ;
	public final DDLParser.query_expression_return query_expression() throws RecognitionException {
		DDLParser.query_expression_return retval = new DDLParser.query_expression_return();
		retval.start = input.LT(1);
		int query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_expression_body280 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:774:3: ( query_expression_body )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:774:5: query_expression_body
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_expression_body_in_query_expression6080);
			query_expression_body280=query_expression_body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_expression_body280.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 71, query_expression_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:776:1: query_expression_body : ( non_join_query_expression | joined_table );
	public final DDLParser.query_expression_body_return query_expression_body() throws RecognitionException {
		DDLParser.query_expression_body_return retval = new DDLParser.query_expression_body_return();
		retval.start = input.LT(1);
		int query_expression_body_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_expression281 =null;
		ParserRuleReturnScope joined_table282 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:777:3: ( non_join_query_expression | joined_table )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==LEFT_PAREN||LA77_0==SELECT) ) {
				alt77=1;
			}
			else if ( (LA77_0==Identifier) ) {
				int LA77_3 = input.LA(2);
				if ( (synpred122_DDL()) ) {
					alt77=1;
				}
				else if ( (true) ) {
					alt77=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:777:5: non_join_query_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_expression_in_query_expression_body6092);
					non_join_query_expression281=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression281.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:778:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_expression_body6098);
					joined_table282=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table282.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 72, query_expression_body_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:780:1: non_join_query_expression : ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* ;
	public final DDLParser.non_join_query_expression_return non_join_query_expression() throws RecognitionException {
		DDLParser.non_join_query_expression_return retval = new DDLParser.non_join_query_expression_return();
		retval.start = input.LT(1);
		int non_join_query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set285=null;
		Token set286=null;
		Token set288=null;
		Token set289=null;
		ParserRuleReturnScope non_join_query_term283 =null;
		ParserRuleReturnScope joined_table284 =null;
		ParserRuleReturnScope query_term287 =null;
		ParserRuleReturnScope query_term290 =null;

		CommonTree set285_tree=null;
		CommonTree set286_tree=null;
		CommonTree set288_tree=null;
		CommonTree set289_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:3: ( ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==LEFT_PAREN||LA79_0==SELECT) ) {
				alt79=1;
			}
			else if ( (LA79_0==Identifier) ) {
				int LA79_3 = input.LA(2);
				if ( (synpred123_DDL()) ) {
					alt79=1;
				}
				else if ( (true) ) {
					alt79=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:6: non_join_query_term
					{
					pushFollow(FOLLOW_non_join_query_term_in_non_join_query_expression6111);
					non_join_query_term283=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term283.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:28: joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_expression6115);
					joined_table284=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table284.getTree());

					set285=input.LT(1);
					set285=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set285), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:59: ( ALL | DISTINCT )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==ALL||LA78_0==DISTINCT) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
							{
							set286=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set286));
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

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6133);
					query_term287=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term287.getTree());

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:782:5: ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==EXCEPT||LA81_0==UNION) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:782:6: ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					set288=input.LT(1);
					set288=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set288), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:782:24: ( ALL | DISTINCT )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==ALL||LA80_0==DISTINCT) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
							{
							set289=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set289));
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

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6157);
					query_term290=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term290.getTree());

					}
					break;

				default :
					break loop81;
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
			if ( state.backtracking>0 ) { memoize(input, 73, non_join_query_expression_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:784:1: query_term : ( non_join_query_term | joined_table );
	public final DDLParser.query_term_return query_term() throws RecognitionException {
		DDLParser.query_term_return retval = new DDLParser.query_term_return();
		retval.start = input.LT(1);
		int query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_term291 =null;
		ParserRuleReturnScope joined_table292 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:785:3: ( non_join_query_term | joined_table )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LEFT_PAREN||LA82_0==SELECT) ) {
				alt82=1;
			}
			else if ( (LA82_0==Identifier) ) {
				int LA82_3 = input.LA(2);
				if ( (synpred131_DDL()) ) {
					alt82=1;
				}
				else if ( (true) ) {
					alt82=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:785:5: non_join_query_term
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_term_in_query_term6171);
					non_join_query_term291=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term291.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:786:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_term6177);
					joined_table292=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table292.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 74, query_term_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:788:1: non_join_query_term : ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* ;
	public final DDLParser.non_join_query_term_return non_join_query_term() throws RecognitionException {
		DDLParser.non_join_query_term_return retval = new DDLParser.non_join_query_term_return();
		retval.start = input.LT(1);
		int non_join_query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTERSECT295=null;
		Token set296=null;
		Token INTERSECT298=null;
		Token set299=null;
		ParserRuleReturnScope non_join_query_primary293 =null;
		ParserRuleReturnScope joined_table294 =null;
		ParserRuleReturnScope query_primary297 =null;
		ParserRuleReturnScope query_primary300 =null;

		CommonTree INTERSECT295_tree=null;
		CommonTree set296_tree=null;
		CommonTree INTERSECT298_tree=null;
		CommonTree set299_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:789:3: ( ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:789:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:789:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==LEFT_PAREN||LA84_0==SELECT) ) {
				alt84=1;
			}
			else if ( (LA84_0==Identifier) ) {
				alt84=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:789:7: non_join_query_primary
					{
					pushFollow(FOLLOW_non_join_query_primary_in_non_join_query_term6191);
					non_join_query_primary293=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary293.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:789:32: joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_term6195);
					joined_table294=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table294.getTree());

					INTERSECT295=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6197); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT295_tree = (CommonTree)adaptor.create(INTERSECT295);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT295_tree, root_0);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:789:56: ( ALL | DISTINCT )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==ALL||LA83_0==DISTINCT) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
							{
							set296=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set296));
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

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6207);
					query_primary297=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary297.getTree());

					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:790:5: ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==INTERSECT) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:790:6: INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					INTERSECT298=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6215); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT298_tree = (CommonTree)adaptor.create(INTERSECT298);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT298_tree, root_0);
					}

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:790:17: ( ALL | DISTINCT )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==ALL||LA85_0==DISTINCT) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
							{
							set299=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set299));
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

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6225);
					query_primary300=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary300.getTree());

					}
					break;

				default :
					break loop86;
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
			if ( state.backtracking>0 ) { memoize(input, 75, non_join_query_term_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:792:1: query_primary : ( non_join_query_primary | joined_table );
	public final DDLParser.query_primary_return query_primary() throws RecognitionException {
		DDLParser.query_primary_return retval = new DDLParser.query_primary_return();
		retval.start = input.LT(1);
		int query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_primary301 =null;
		ParserRuleReturnScope joined_table302 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:793:3: ( non_join_query_primary | joined_table )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LEFT_PAREN||LA87_0==SELECT) ) {
				alt87=1;
			}
			else if ( (LA87_0==Identifier) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:793:5: non_join_query_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_primary_in_query_primary6239);
					non_join_query_primary301=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary301.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:794:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_primary6245);
					joined_table302=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table302.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 76, query_primary_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:796:1: non_join_query_primary : ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN );
	public final DDLParser.non_join_query_primary_return non_join_query_primary() throws RecognitionException {
		DDLParser.non_join_query_primary_return retval = new DDLParser.non_join_query_primary_return();
		retval.start = input.LT(1);
		int non_join_query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN304=null;
		Token RIGHT_PAREN306=null;
		ParserRuleReturnScope simple_table303 =null;
		ParserRuleReturnScope non_join_query_expression305 =null;

		CommonTree LEFT_PAREN304_tree=null;
		CommonTree RIGHT_PAREN306_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:797:3: ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==SELECT) ) {
				alt88=1;
			}
			else if ( (LA88_0==LEFT_PAREN) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:797:5: simple_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_table_in_non_join_query_primary6257);
					simple_table303=simple_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_table303.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:798:5: LEFT_PAREN non_join_query_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN304=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_non_join_query_primary6263); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN304_tree = (CommonTree)adaptor.create(LEFT_PAREN304);
					adaptor.addChild(root_0, LEFT_PAREN304_tree);
					}

					pushFollow(FOLLOW_non_join_query_expression_in_non_join_query_primary6265);
					non_join_query_expression305=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression305.getTree());

					RIGHT_PAREN306=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_non_join_query_primary6267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN306_tree = (CommonTree)adaptor.create(RIGHT_PAREN306);
					adaptor.addChild(root_0, RIGHT_PAREN306_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 77, non_join_query_primary_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:800:1: simple_table options {k=1; } : query_specification ;
	public final DDLParser.simple_table_return simple_table() throws RecognitionException {
		DDLParser.simple_table_return retval = new DDLParser.simple_table_return();
		retval.start = input.LT(1);
		int simple_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_specification307 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:802:3: ( query_specification )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:802:5: query_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_specification_in_simple_table6288);
			query_specification307=query_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_specification307.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 78, simple_table_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:804:1: query_specification : SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) ;
	public final DDLParser.query_specification_return query_specification() throws RecognitionException {
		DDLParser.query_specification_return retval = new DDLParser.query_specification_return();
		retval.start = input.LT(1);
		int query_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SELECT308=null;
		ParserRuleReturnScope set_qualifier309 =null;
		ParserRuleReturnScope select_list310 =null;
		ParserRuleReturnScope from_clause311 =null;
		ParserRuleReturnScope where_clause312 =null;
		ParserRuleReturnScope groupby_clause313 =null;
		ParserRuleReturnScope having_clause314 =null;
		ParserRuleReturnScope orderby_clause315 =null;
		ParserRuleReturnScope limit_clause316 =null;

		CommonTree SELECT308_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:3: ( SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:5: SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )?
			{
			SELECT308=(Token)match(input,SELECT,FOLLOW_SELECT_in_query_specification6300); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SELECT.add(SELECT308);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:12: ( set_qualifier )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==ALL||LA89_0==DISTINCT) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:12: set_qualifier
					{
					pushFollow(FOLLOW_set_qualifier_in_query_specification6302);
					set_qualifier309=set_qualifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_set_qualifier.add(set_qualifier309.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_select_list_in_query_specification6305);
			select_list310=select_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_list.add(select_list310.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:39: ( from_clause )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==FROM) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:39: from_clause
					{
					pushFollow(FOLLOW_from_clause_in_query_specification6307);
					from_clause311=from_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from_clause.add(from_clause311.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:52: ( where_clause )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==WHERE) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:52: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_query_specification6310);
					where_clause312=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause312.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:66: ( groupby_clause )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==GROUP) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:66: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_query_specification6313);
					groupby_clause313=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause313.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:82: ( having_clause )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==HAVING) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:805:82: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_query_specification6316);
					having_clause314=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause314.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:806:5: ( orderby_clause )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==ORDER) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:806:5: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_query_specification6323);
					orderby_clause315=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause315.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:806:21: ( limit_clause )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==LIMIT) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:806:21: limit_clause
					{
					pushFollow(FOLLOW_limit_clause_in_query_specification6326);
					limit_clause316=limit_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_limit_clause.add(limit_clause316.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: SELECT, set_qualifier, where_clause, having_clause, groupby_clause, from_clause, select_list, orderby_clause, limit_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 807:5: -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:807:8: ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:807:17: ( from_clause )?
				if ( stream_from_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_from_clause.nextTree());
				}
				stream_from_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:807:30: ( set_qualifier )?
				if ( stream_set_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_set_qualifier.nextTree());
				}
				stream_set_qualifier.reset();

				adaptor.addChild(root_1, stream_select_list.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:807:57: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:807:71: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:808:5: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:808:20: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:808:36: ( limit_clause )?
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
			if ( state.backtracking>0 ) { memoize(input, 79, query_specification_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:810:1: select_list : ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) );
	public final DDLParser.select_list_return select_list() throws RecognitionException {
		DDLParser.select_list_return retval = new DDLParser.select_list_return();
		retval.start = input.LT(1);
		int select_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token MULTIPLY317=null;
		Token COMMA319=null;
		ParserRuleReturnScope derived_column318 =null;
		ParserRuleReturnScope derived_column320 =null;

		CommonTree MULTIPLY317_tree=null;
		CommonTree COMMA319_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleSubtreeStream stream_derived_column=new RewriteRuleSubtreeStream(adaptor,"rule derived_column");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:811:3: ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==MULTIPLY) ) {
				alt97=1;
			}
			else if ( (LA97_0==CASE||LA97_0==COUNT||LA97_0==Character_String_Literal||LA97_0==Identifier||LA97_0==LEFT_PAREN||LA97_0==MINUS||LA97_0==NOT||LA97_0==NULL||LA97_0==NUMBER||LA97_0==PLUS||LA97_0==REAL_NUMBER) ) {
				alt97=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:811:5: MULTIPLY
					{
					MULTIPLY317=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_select_list6376); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY317);

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
					// 811:14: -> ^( SEL_LIST ALL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:811:17: ^( SEL_LIST ALL )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:812:5: derived_column ( COMMA derived_column )*
					{
					pushFollow(FOLLOW_derived_column_in_select_list6390);
					derived_column318=derived_column();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_derived_column.add(derived_column318.getTree());
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:812:20: ( COMMA derived_column )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==COMMA) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:812:21: COMMA derived_column
							{
							COMMA319=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list6393); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA319);

							pushFollow(FOLLOW_derived_column_in_select_list6395);
							derived_column320=derived_column();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_derived_column.add(derived_column320.getTree());
							}
							break;

						default :
							break loop96;
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
					// 812:44: -> ^( SEL_LIST ( derived_column )+ )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:812:47: ^( SEL_LIST ( derived_column )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 80, select_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:814:1: set_qualifier : ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) );
	public final DDLParser.set_qualifier_return set_qualifier() throws RecognitionException {
		DDLParser.set_qualifier_return retval = new DDLParser.set_qualifier_return();
		retval.start = input.LT(1);
		int set_qualifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISTINCT321=null;
		Token ALL322=null;

		CommonTree DISTINCT321_tree=null;
		CommonTree ALL322_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:815:3: ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==DISTINCT) ) {
				alt98=1;
			}
			else if ( (LA98_0==ALL) ) {
				alt98=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:815:5: DISTINCT
					{
					DISTINCT321=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_set_qualifier6418); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT321);

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
					// 815:14: -> ^( SET_QUALIFIER DISTINCT )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:815:17: ^( SET_QUALIFIER DISTINCT )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:816:5: ALL
					{
					ALL322=(Token)match(input,ALL,FOLLOW_ALL_in_set_qualifier6432); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL322);

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
					// 816:9: -> ^( SET_QUALIFIER ALL )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:816:12: ^( SET_QUALIFIER ALL )
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
			if ( state.backtracking>0 ) { memoize(input, 81, set_qualifier_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:818:1: derived_column : boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) ;
	public final DDLParser.derived_column_return derived_column() throws RecognitionException {
		DDLParser.derived_column_return retval = new DDLParser.derived_column_return();
		retval.start = input.LT(1);
		int derived_column_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression323 =null;
		ParserRuleReturnScope as_clause324 =null;

		RewriteRuleSubtreeStream stream_as_clause=new RewriteRuleSubtreeStream(adaptor,"rule as_clause");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:819:3: ( boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:819:5: boolean_value_expression ( as_clause )?
			{
			pushFollow(FOLLOW_boolean_value_expression_in_derived_column6452);
			boolean_value_expression323=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression323.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:819:30: ( as_clause )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==AS||LA99_0==Identifier) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:819:30: as_clause
					{
					pushFollow(FOLLOW_as_clause_in_derived_column6454);
					as_clause324=as_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as_clause.add(as_clause324.getTree());
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
			// 819:41: -> ^( COLUMN boolean_value_expression ( as_clause )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:819:44: ^( COLUMN boolean_value_expression ( as_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);
				adaptor.addChild(root_1, stream_boolean_value_expression.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:819:78: ( as_clause )?
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
			if ( state.backtracking>0 ) { memoize(input, 82, derived_column_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:822:1: column_reference : b= Identifier -> ^( COLUMN_NAME $b) ;
	public final DDLParser.column_reference_return column_reference() throws RecognitionException {
		DDLParser.column_reference_return retval = new DDLParser.column_reference_return();
		retval.start = input.LT(1);
		int column_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		Token b=null;

		CommonTree b_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:823:2: (b= Identifier -> ^( COLUMN_NAME $b) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:823:4: b= Identifier
			{
			b=(Token)match(input,Identifier,FOLLOW_Identifier_in_column_reference6482); if (state.failed) return retval; 
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
			// 823:17: -> ^( COLUMN_NAME $b)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:823:20: ^( COLUMN_NAME $b)
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
			if ( state.backtracking>0 ) { memoize(input, 83, column_reference_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:826:1: as_clause : ( AS )? column_reference ;
	public final DDLParser.as_clause_return as_clause() throws RecognitionException {
		DDLParser.as_clause_return retval = new DDLParser.as_clause_return();
		retval.start = input.LT(1);
		int as_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AS325=null;
		ParserRuleReturnScope column_reference326 =null;

		CommonTree AS325_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:827:3: ( ( AS )? column_reference )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:827:5: ( AS )? column_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:827:5: ( AS )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==AS) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:827:6: AS
					{
					AS325=(Token)match(input,AS,FOLLOW_AS_in_as_clause6506); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AS325_tree = (CommonTree)adaptor.create(AS325);
					adaptor.addChild(root_0, AS325_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_column_reference_in_as_clause6510);
			column_reference326=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference326.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 84, as_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:829:1: column_reference_list : column_reference ( COMMA column_reference )* -> ( column_reference )+ ;
	public final DDLParser.column_reference_list_return column_reference_list() throws RecognitionException {
		DDLParser.column_reference_list_return retval = new DDLParser.column_reference_list_return();
		retval.start = input.LT(1);
		int column_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA328=null;
		ParserRuleReturnScope column_reference327 =null;
		ParserRuleReturnScope column_reference329 =null;

		CommonTree COMMA328_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:830:2: ( column_reference ( COMMA column_reference )* -> ( column_reference )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:830:4: column_reference ( COMMA column_reference )*
			{
			pushFollow(FOLLOW_column_reference_in_column_reference_list6521);
			column_reference327=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(column_reference327.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:830:21: ( COMMA column_reference )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==COMMA) ) {
					int LA101_2 = input.LA(2);
					if ( (LA101_2==Identifier) ) {
						int LA101_3 = input.LA(3);
						if ( (synpred152_DDL()) ) {
							alt101=1;
						}

					}

				}

				switch (alt101) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:830:22: COMMA column_reference
					{
					COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_reference_list6524); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA328);

					pushFollow(FOLLOW_column_reference_in_column_reference_list6526);
					column_reference329=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference.add(column_reference329.getTree());
					}
					break;

				default :
					break loop101;
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
			// 830:47: -> ( column_reference )+
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
			if ( state.backtracking>0 ) { memoize(input, 85, column_reference_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:832:1: table : ( Identifier | qualified_identifier );
	public final DDLParser.table_return table() throws RecognitionException {
		DDLParser.table_return retval = new DDLParser.table_return();
		retval.start = input.LT(1);
		int table_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier330=null;
		ParserRuleReturnScope qualified_identifier331 =null;

		CommonTree Identifier330_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:833:3: ( Identifier | qualified_identifier )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case DIVIDE:
					{
					alt102=2;
					}
					break;
				case LEFT_PAREN:
					{
					int LA102_3 = input.LA(3);
					if ( (LA102_3==Identifier) ) {
						int LA102_5 = input.LA(4);
						if ( (LA102_5==RIGHT_PAREN) ) {
							int LA102_6 = input.LA(5);
							if ( (synpred153_DDL()) ) {
								alt102=1;
							}
							else if ( (true) ) {
								alt102=2;
							}

						}
						else if ( (LA102_5==ASC||(LA102_5 >= BIGINT && LA102_5 <= BOOLEAN)||LA102_5==BYTEA||(LA102_5 >= CHAR && LA102_5 <= CHARACTER)||LA102_5==COMMA||LA102_5==DATE||(LA102_5 >= DEC && LA102_5 <= DECIMAL)||LA102_5==DESC||LA102_5==DOUBLE||(LA102_5 >= FLOAT && LA102_5 <= FOR)||LA102_5==INET4||(LA102_5 >= INT && LA102_5 <= INTEGER)||LA102_5==NATIONAL||LA102_5==NCHAR||LA102_5==NULL||(LA102_5 >= NUMERIC && LA102_5 <= NVARCHAR)||LA102_5==REAL||LA102_5==SMALLINT||LA102_5==TEXT||(LA102_5 >= TIME && LA102_5 <= TINYINT)||(LA102_5 >= VARBINARY && LA102_5 <= VARCHAR)) ) {
							alt102=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 102, 5, input);
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
								new NoViableAltException("", 102, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
				case AS:
				case CASCADE:
				case COMMA:
				case CROSS:
				case EXCEPT:
				case FOR:
				case FULL:
				case GROUP:
				case HAVING:
				case IN:
				case INNER:
				case INTERSECT:
				case Identifier:
				case JOIN:
				case LEFT:
				case LIMIT:
				case NATURAL:
				case ON:
				case ORDER:
				case RESTRICT:
				case RIGHT:
				case RIGHT_PAREN:
				case TO:
				case UNION:
				case USING:
				case WHERE:
				case WITH:
				case 281:
					{
					alt102=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:833:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier330=(Token)match(input,Identifier,FOLLOW_Identifier_in_table6544); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier330_tree = (CommonTree)adaptor.create(Identifier330);
					adaptor.addChild(root_0, Identifier330_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:835:5: qualified_identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_identifier_in_table6556);
					qualified_identifier331=qualified_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_identifier331.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 86, table_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:838:1: qualified_identifier : (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( QUALIFIED $l $f $m) |l= Identifier DIVIDE f= Identifier -> ^( QUALIFIED $l $f) |l= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( QUALIFIED $l $m) );
	public final DDLParser.qualified_identifier_return qualified_identifier() throws RecognitionException {
		DDLParser.qualified_identifier_return retval = new DDLParser.qualified_identifier_return();
		retval.start = input.LT(1);
		int qualified_identifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE332=null;
		Token LEFT_PAREN333=null;
		Token RIGHT_PAREN334=null;
		Token DIVIDE335=null;
		Token LEFT_PAREN336=null;
		Token RIGHT_PAREN337=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE332_tree=null;
		CommonTree LEFT_PAREN333_tree=null;
		CommonTree RIGHT_PAREN334_tree=null;
		CommonTree DIVIDE335_tree=null;
		CommonTree LEFT_PAREN336_tree=null;
		CommonTree RIGHT_PAREN337_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:839:3: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( QUALIFIED $l $f $m) |l= Identifier DIVIDE f= Identifier -> ^( QUALIFIED $l $f) |l= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( QUALIFIED $l $m) )
			int alt103=3;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==Identifier) ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1==DIVIDE) ) {
					int LA103_2 = input.LA(3);
					if ( (LA103_2==Identifier) ) {
						int LA103_4 = input.LA(4);
						if ( (LA103_4==LEFT_PAREN) ) {
							int LA103_5 = input.LA(5);
							if ( (LA103_5==Identifier) ) {
								int LA103_7 = input.LA(6);
								if ( (LA103_7==RIGHT_PAREN) ) {
									int LA103_8 = input.LA(7);
									if ( (synpred154_DDL()) ) {
										alt103=1;
									}
									else if ( (synpred155_DDL()) ) {
										alt103=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 103, 8, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA103_7==AND||LA103_7==ASC||(LA103_7 >= BIGINT && LA103_7 <= BOOLEAN)||LA103_7==BYTEA||(LA103_7 >= CHAR && LA103_7 <= CHARACTER)||LA103_7==COMMA||LA103_7==DATE||(LA103_7 >= DEC && LA103_7 <= DECIMAL)||LA103_7==DESC||LA103_7==DIVIDE||LA103_7==DOUBLE||LA103_7==EQUAL||(LA103_7 >= FLOAT && LA103_7 <= FOR)||LA103_7==GEQ||LA103_7==GTH||LA103_7==IN||LA103_7==INET4||(LA103_7 >= INT && LA103_7 <= INTEGER)||LA103_7==IS||(LA103_7 >= LEFT_PAREN && LA103_7 <= LEQ)||LA103_7==LIKE||LA103_7==LTH||LA103_7==MINUS||(LA103_7 >= MODULAR && LA103_7 <= MULTIPLY)||LA103_7==NATIONAL||LA103_7==NCHAR||(LA103_7 >= NOT && LA103_7 <= NOT_EQUAL)||LA103_7==NULL||(LA103_7 >= NUMERIC && LA103_7 <= NVARCHAR)||LA103_7==OR||LA103_7==PLUS||LA103_7==REAL||LA103_7==SMALLINT||LA103_7==TEXT||(LA103_7 >= TIME && LA103_7 <= TINYINT)||(LA103_7 >= VARBINARY && LA103_7 <= VARCHAR)) ) {
									alt103=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 103, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA103_5==CASE||LA103_5==COUNT||LA103_5==Character_String_Literal||LA103_5==LEFT_PAREN||LA103_5==MINUS||LA103_5==NOT||LA103_5==NULL||LA103_5==NUMBER||LA103_5==PLUS||LA103_5==REAL_NUMBER||LA103_5==RIGHT_PAREN) ) {
								alt103=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 103, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA103_4==EOF||LA103_4==AS||LA103_4==CASCADE||LA103_4==COMMA||LA103_4==CROSS||LA103_4==EXCEPT||LA103_4==FOR||LA103_4==FULL||LA103_4==GROUP||LA103_4==HAVING||LA103_4==IN||LA103_4==INNER||LA103_4==INTERSECT||LA103_4==Identifier||LA103_4==JOIN||LA103_4==LEFT||LA103_4==LIMIT||LA103_4==NATURAL||LA103_4==ON||LA103_4==ORDER||(LA103_4 >= RESTRICT && LA103_4 <= RIGHT_PAREN)||LA103_4==TO||LA103_4==UNION||LA103_4==USING||(LA103_4 >= WHERE && LA103_4 <= WITH)||LA103_4==281) ) {
							alt103=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 103, 4, input);
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
								new NoViableAltException("", 103, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA103_1==LEFT_PAREN) ) {
					alt103=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}

			switch (alt103) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:839:5: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
					{
					l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6571); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(l);

					DIVIDE332=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_qualified_identifier6573); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE332);

					f=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6577); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(f);

					LEFT_PAREN333=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_qualified_identifier6579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN333);

					m=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6583); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(m);

					RIGHT_PAREN334=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_qualified_identifier6585); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN334);

					// AST REWRITE
					// elements: m, l, f
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
					// 839:74: -> ^( QUALIFIED $l $f $m)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:839:77: ^( QUALIFIED $l $f $m)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
						adaptor.addChild(root_1, stream_l.nextNode());
						adaptor.addChild(root_1, stream_f.nextNode());
						adaptor.addChild(root_1, stream_m.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:841:5: l= Identifier DIVIDE f= Identifier
					{
					l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(l);

					DIVIDE335=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_qualified_identifier6616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE335);

					f=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6620); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(f);

					// AST REWRITE
					// elements: l, f
					// token labels: f, l
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
					RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 841:38: -> ^( QUALIFIED $l $f)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:841:41: ^( QUALIFIED $l $f)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
						adaptor.addChild(root_1, stream_l.nextNode());
						adaptor.addChild(root_1, stream_f.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:843:5: l= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
					{
					l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6647); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(l);

					LEFT_PAREN336=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_qualified_identifier6649); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN336);

					m=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6653); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(m);

					RIGHT_PAREN337=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_qualified_identifier6655); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN337);

					// AST REWRITE
					// elements: m, l
					// token labels: l, m
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
					RewriteRuleTokenStream stream_m=new RewriteRuleTokenStream(adaptor,"token m",m);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 843:54: -> ^( QUALIFIED $l $m)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:843:57: ^( QUALIFIED $l $m)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
						adaptor.addChild(root_1, stream_l.nextNode());
						adaptor.addChild(root_1, stream_m.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 87, qualified_identifier_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:847:1: member : l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) ;
	public final DDLParser.member_return member() throws RecognitionException {
		DDLParser.member_return retval = new DDLParser.member_return();
		retval.start = input.LT(1);
		int member_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE338=null;
		Token LEFT_PAREN339=null;
		Token RIGHT_PAREN340=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE338_tree=null;
		CommonTree LEFT_PAREN339_tree=null;
		CommonTree RIGHT_PAREN340_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:847:8: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:848:2: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6692); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE338=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_member6694); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE338);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6698); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			LEFT_PAREN339=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_member6700); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN339);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6704); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			RIGHT_PAREN340=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_member6706); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN340);

			// AST REWRITE
			// elements: m, f, l
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
			// 848:71: -> ^( MEMBER $l $f $m)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:848:74: ^( MEMBER $l $f $m)
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
			if ( state.backtracking>0 ) { memoize(input, 88, member_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:851:1: from_clause : FROM ^ table_reference_list ;
	public final DDLParser.from_clause_return from_clause() throws RecognitionException {
		DDLParser.from_clause_return retval = new DDLParser.from_clause_return();
		retval.start = input.LT(1);
		int from_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FROM341=null;
		ParserRuleReturnScope table_reference_list342 =null;

		CommonTree FROM341_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:852:3: ( FROM ^ table_reference_list )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:852:5: FROM ^ table_reference_list
			{
			root_0 = (CommonTree)adaptor.nil();


			FROM341=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause6741); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FROM341_tree = (CommonTree)adaptor.create(FROM341);
			root_0 = (CommonTree)adaptor.becomeRoot(FROM341_tree, root_0);
			}

			pushFollow(FOLLOW_table_reference_list_in_from_clause6744);
			table_reference_list342=table_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference_list342.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 89, from_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:854:1: table_reference_list : table_reference ( COMMA table_reference )* -> ( table_reference )+ ;
	public final DDLParser.table_reference_list_return table_reference_list() throws RecognitionException {
		DDLParser.table_reference_list_return retval = new DDLParser.table_reference_list_return();
		retval.start = input.LT(1);
		int table_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA344=null;
		ParserRuleReturnScope table_reference343 =null;
		ParserRuleReturnScope table_reference345 =null;

		CommonTree COMMA344_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_table_reference=new RewriteRuleSubtreeStream(adaptor,"rule table_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:855:3: ( table_reference ( COMMA table_reference )* -> ( table_reference )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:855:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_reference_list6755);
			table_reference343=table_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_reference.add(table_reference343.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:855:20: ( COMMA table_reference )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==COMMA) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:855:21: COMMA table_reference
					{
					COMMA344=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_reference_list6758); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA344);

					pushFollow(FOLLOW_table_reference_in_table_reference_list6760);
					table_reference345=table_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_reference.add(table_reference345.getTree());
					}
					break;

				default :
					break loop104;
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
			// 855:45: -> ( table_reference )+
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
			if ( state.backtracking>0 ) { memoize(input, 90, table_reference_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:857:1: table_reference : ( table_primary | joined_table );
	public final DDLParser.table_reference_return table_reference() throws RecognitionException {
		DDLParser.table_reference_return retval = new DDLParser.table_reference_return();
		retval.start = input.LT(1);
		int table_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary346 =null;
		ParserRuleReturnScope joined_table347 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:858:3: ( table_primary | joined_table )
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case DIVIDE:
					{
					int LA105_2 = input.LA(3);
					if ( (LA105_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case LEFT_PAREN:
							{
							int LA105_11 = input.LA(5);
							if ( (LA105_11==Identifier) ) {
								int LA105_13 = input.LA(6);
								if ( (LA105_13==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case AS:
										{
										int LA105_4 = input.LA(8);
										if ( (LA105_4==Identifier) ) {
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
												alt105=1;
												}
												break;
											case UNION:
												{
												int LA105_7 = input.LA(10);
												if ( (LA105_7==JOIN) ) {
													alt105=2;
												}
												else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
													alt105=1;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 105, 7, input);
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
												alt105=2;
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
														new NoViableAltException("", 105, 5, input);
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
													new NoViableAltException("", 105, 4, input);
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
											alt105=1;
											}
											break;
										case UNION:
											{
											int LA105_7 = input.LA(9);
											if ( (LA105_7==JOIN) ) {
												alt105=2;
											}
											else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
												alt105=1;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 105, 7, input);
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
											alt105=2;
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
													new NoViableAltException("", 105, 5, input);
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
										alt105=1;
										}
										break;
									case UNION:
										{
										int LA105_7 = input.LA(8);
										if ( (LA105_7==JOIN) ) {
											alt105=2;
										}
										else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
											alt105=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 105, 7, input);
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
										alt105=2;
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
												new NoViableAltException("", 105, 14, input);
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
											new NoViableAltException("", 105, 13, input);
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
										new NoViableAltException("", 105, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case AS:
							{
							int LA105_4 = input.LA(5);
							if ( (LA105_4==Identifier) ) {
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
									alt105=1;
									}
									break;
								case UNION:
									{
									int LA105_7 = input.LA(7);
									if ( (LA105_7==JOIN) ) {
										alt105=2;
									}
									else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
										alt105=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 105, 7, input);
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
									alt105=2;
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
											new NoViableAltException("", 105, 5, input);
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
										new NoViableAltException("", 105, 4, input);
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
								alt105=1;
								}
								break;
							case UNION:
								{
								int LA105_7 = input.LA(6);
								if ( (LA105_7==JOIN) ) {
									alt105=2;
								}
								else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
									alt105=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 105, 7, input);
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
								alt105=2;
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
										new NoViableAltException("", 105, 5, input);
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
							alt105=1;
							}
							break;
						case UNION:
							{
							int LA105_7 = input.LA(5);
							if ( (LA105_7==JOIN) ) {
								alt105=2;
							}
							else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
								alt105=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 7, input);
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
							alt105=2;
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
									new NoViableAltException("", 105, 9, input);
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
								new NoViableAltException("", 105, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LEFT_PAREN:
					{
					int LA105_3 = input.LA(3);
					if ( (LA105_3==Identifier) ) {
						int LA105_10 = input.LA(4);
						if ( (LA105_10==RIGHT_PAREN) ) {
							switch ( input.LA(5) ) {
							case AS:
								{
								int LA105_4 = input.LA(6);
								if ( (LA105_4==Identifier) ) {
									switch ( input.LA(7) ) {
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
										alt105=1;
										}
										break;
									case UNION:
										{
										int LA105_7 = input.LA(8);
										if ( (LA105_7==JOIN) ) {
											alt105=2;
										}
										else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
											alt105=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 105, 7, input);
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
										alt105=2;
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
												new NoViableAltException("", 105, 5, input);
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
											new NoViableAltException("", 105, 4, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case Identifier:
								{
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
									alt105=1;
									}
									break;
								case UNION:
									{
									int LA105_7 = input.LA(7);
									if ( (LA105_7==JOIN) ) {
										alt105=2;
									}
									else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
										alt105=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 105, 7, input);
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
									alt105=2;
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
											new NoViableAltException("", 105, 5, input);
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
								alt105=1;
								}
								break;
							case UNION:
								{
								int LA105_7 = input.LA(6);
								if ( (LA105_7==JOIN) ) {
									alt105=2;
								}
								else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
									alt105=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 105, 7, input);
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
								alt105=2;
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
										new NoViableAltException("", 105, 12, input);
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 105, 10, input);
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
								new NoViableAltException("", 105, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AS:
					{
					int LA105_4 = input.LA(3);
					if ( (LA105_4==Identifier) ) {
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
							alt105=1;
							}
							break;
						case UNION:
							{
							int LA105_7 = input.LA(5);
							if ( (LA105_7==JOIN) ) {
								alt105=2;
							}
							else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
								alt105=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 7, input);
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
							alt105=2;
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
									new NoViableAltException("", 105, 5, input);
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
								new NoViableAltException("", 105, 4, input);
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
						alt105=1;
						}
						break;
					case UNION:
						{
						int LA105_7 = input.LA(4);
						if ( (LA105_7==JOIN) ) {
							alt105=2;
						}
						else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
							alt105=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 105, 7, input);
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
						alt105=2;
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
								new NoViableAltException("", 105, 5, input);
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
					alt105=1;
					}
					break;
				case UNION:
					{
					int LA105_7 = input.LA(3);
					if ( (LA105_7==JOIN) ) {
						alt105=2;
					}
					else if ( (LA105_7==ALL||LA105_7==DISTINCT||LA105_7==Identifier||LA105_7==LEFT_PAREN||LA105_7==SELECT) ) {
						alt105=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 7, input);
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
					alt105=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:858:5: table_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_table_primary_in_table_reference6779);
					table_primary346=table_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary346.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:859:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_table_reference6785);
					joined_table347=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table347.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 91, table_reference_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:861:1: joined_table : table_primary ( cross_join | qualified_join | natural_join | union_join )+ ;
	public final DDLParser.joined_table_return joined_table() throws RecognitionException {
		DDLParser.joined_table_return retval = new DDLParser.joined_table_return();
		retval.start = input.LT(1);
		int joined_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary348 =null;
		ParserRuleReturnScope cross_join349 =null;
		ParserRuleReturnScope qualified_join350 =null;
		ParserRuleReturnScope natural_join351 =null;
		ParserRuleReturnScope union_join352 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:3: ( table_primary ( cross_join | qualified_join | natural_join | union_join )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:5: table_primary ( cross_join | qualified_join | natural_join | union_join )+
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_table_primary_in_joined_table6797);
			table_primary348=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary348.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:19: ( cross_join | qualified_join | natural_join | union_join )+
			int cnt106=0;
			loop106:
			while (true) {
				int alt106=5;
				switch ( input.LA(1) ) {
				case UNION:
					{
					int LA106_2 = input.LA(2);
					if ( (LA106_2==JOIN) ) {
						alt106=4;
					}

					}
					break;
				case CROSS:
					{
					alt106=1;
					}
					break;
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case RIGHT:
					{
					alt106=2;
					}
					break;
				case NATURAL:
					{
					alt106=3;
					}
					break;
				}
				switch (alt106) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:20: cross_join
					{
					pushFollow(FOLLOW_cross_join_in_joined_table6800);
					cross_join349=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join349.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:33: qualified_join
					{
					pushFollow(FOLLOW_qualified_join_in_joined_table6804);
					qualified_join350=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join350.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:50: natural_join
					{
					pushFollow(FOLLOW_natural_join_in_joined_table6808);
					natural_join351=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join351.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:862:65: union_join
					{
					pushFollow(FOLLOW_union_join_in_joined_table6812);
					union_join352=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join352.getTree());

					}
					break;

				default :
					if ( cnt106 >= 1 ) break loop106;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(106, input);
					throw eee;
				}
				cnt106++;
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
			if ( state.backtracking>0 ) { memoize(input, 92, joined_table_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:864:1: joined_table_prim : ( cross_join | qualified_join | natural_join | union_join );
	public final DDLParser.joined_table_prim_return joined_table_prim() throws RecognitionException {
		DDLParser.joined_table_prim_return retval = new DDLParser.joined_table_prim_return();
		retval.start = input.LT(1);
		int joined_table_prim_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope cross_join353 =null;
		ParserRuleReturnScope qualified_join354 =null;
		ParserRuleReturnScope natural_join355 =null;
		ParserRuleReturnScope union_join356 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:865:3: ( cross_join | qualified_join | natural_join | union_join )
			int alt107=4;
			switch ( input.LA(1) ) {
			case CROSS:
				{
				alt107=1;
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				{
				alt107=2;
				}
				break;
			case NATURAL:
				{
				alt107=3;
				}
				break;
			case UNION:
				{
				alt107=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:865:5: cross_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cross_join_in_joined_table_prim6826);
					cross_join353=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join353.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:866:5: qualified_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_join_in_joined_table_prim6832);
					qualified_join354=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join354.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:867:5: natural_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_natural_join_in_joined_table_prim6838);
					natural_join355=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join355.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:868:5: union_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_join_in_joined_table_prim6844);
					union_join356=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join356.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 93, joined_table_prim_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:870:1: cross_join : CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) ;
	public final DDLParser.cross_join_return cross_join() throws RecognitionException {
		DDLParser.cross_join_return retval = new DDLParser.cross_join_return();
		retval.start = input.LT(1);
		int cross_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CROSS357=null;
		Token JOIN358=null;
		ParserRuleReturnScope r =null;

		CommonTree CROSS357_tree=null;
		CommonTree JOIN358_tree=null;
		RewriteRuleTokenStream stream_CROSS=new RewriteRuleTokenStream(adaptor,"token CROSS");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:871:3: ( CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:871:5: CROSS JOIN r= table_primary
			{
			CROSS357=(Token)match(input,CROSS,FOLLOW_CROSS_in_cross_join6856); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CROSS.add(CROSS357);

			JOIN358=(Token)match(input,JOIN,FOLLOW_JOIN_in_cross_join6858); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN358);

			pushFollow(FOLLOW_table_primary_in_cross_join6862);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: r, CROSS, JOIN
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
			// 871:32: -> ^( JOIN CROSS $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:871:35: ^( JOIN CROSS $r)
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
			if ( state.backtracking>0 ) { memoize(input, 94, cross_join_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:873:1: qualified_join : (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) ;
	public final DDLParser.qualified_join_return qualified_join() throws RecognitionException {
		DDLParser.qualified_join_return retval = new DDLParser.qualified_join_return();
		retval.start = input.LT(1);
		int qualified_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token JOIN359=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope s =null;

		CommonTree JOIN359_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");
		RewriteRuleSubtreeStream stream_join_specification=new RewriteRuleSubtreeStream(adaptor,"rule join_specification");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:874:3: ( (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:874:5: (t= join_type )? JOIN r= table_primary s= join_specification
			{
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:874:5: (t= join_type )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==FULL||LA108_0==INNER||LA108_0==LEFT||LA108_0==RIGHT) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:874:6: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_qualified_join6888);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN359=(Token)match(input,JOIN,FOLLOW_JOIN_in_qualified_join6892); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN359);

			pushFollow(FOLLOW_table_primary_in_qualified_join6896);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			pushFollow(FOLLOW_join_specification_in_qualified_join6900);
			s=join_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_specification.add(s.getTree());
			// AST REWRITE
			// elements: r, t, JOIN, s
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
			// 874:62: -> ^( JOIN ( $t)? $r $s)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:874:65: ^( JOIN ( $t)? $r $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:874:73: ( $t)?
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
			if ( state.backtracking>0 ) { memoize(input, 95, qualified_join_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:876:1: natural_join : NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) ;
	public final DDLParser.natural_join_return natural_join() throws RecognitionException {
		DDLParser.natural_join_return retval = new DDLParser.natural_join_return();
		retval.start = input.LT(1);
		int natural_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NATURAL360=null;
		Token JOIN361=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;

		CommonTree NATURAL360_tree=null;
		CommonTree JOIN361_tree=null;
		RewriteRuleTokenStream stream_NATURAL=new RewriteRuleTokenStream(adaptor,"token NATURAL");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:877:3: ( NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:877:5: NATURAL (t= join_type )? JOIN r= table_primary
			{
			NATURAL360=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_natural_join6928); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NATURAL.add(NATURAL360);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:877:13: (t= join_type )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==FULL||LA109_0==INNER||LA109_0==LEFT||LA109_0==RIGHT) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:877:14: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_natural_join6933);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN361=(Token)match(input,JOIN,FOLLOW_JOIN_in_natural_join6937); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN361);

			pushFollow(FOLLOW_table_primary_in_natural_join6941);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: t, r, JOIN, NATURAL
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
			// 877:49: -> ^( JOIN NATURAL ( $t)? $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:877:52: ^( JOIN NATURAL ( $t)? $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_NATURAL.nextNode());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:877:68: ( $t)?
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
			if ( state.backtracking>0 ) { memoize(input, 96, natural_join_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:879:1: union_join : UNION JOIN r= table_primary -> ^( JOIN UNION $r) ;
	public final DDLParser.union_join_return union_join() throws RecognitionException {
		DDLParser.union_join_return retval = new DDLParser.union_join_return();
		retval.start = input.LT(1);
		int union_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token UNION362=null;
		Token JOIN363=null;
		ParserRuleReturnScope r =null;

		CommonTree UNION362_tree=null;
		CommonTree JOIN363_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:880:3: ( UNION JOIN r= table_primary -> ^( JOIN UNION $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:880:5: UNION JOIN r= table_primary
			{
			UNION362=(Token)match(input,UNION,FOLLOW_UNION_in_union_join6968); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNION.add(UNION362);

			JOIN363=(Token)match(input,JOIN,FOLLOW_JOIN_in_union_join6970); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN363);

			pushFollow(FOLLOW_table_primary_in_union_join6974);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: JOIN, r, UNION
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
			// 880:32: -> ^( JOIN UNION $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:880:35: ^( JOIN UNION $r)
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
			if ( state.backtracking>0 ) { memoize(input, 97, union_join_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:882:1: join_type : ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) );
	public final DDLParser.join_type_return join_type() throws RecognitionException {
		DDLParser.join_type_return retval = new DDLParser.join_type_return();
		retval.start = input.LT(1);
		int join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INNER364=null;
		Token OUTER365=null;
		ParserRuleReturnScope t =null;

		CommonTree INNER364_tree=null;
		CommonTree OUTER365_tree=null;
		RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
		RewriteRuleSubtreeStream stream_outer_join_type=new RewriteRuleSubtreeStream(adaptor,"rule outer_join_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:883:3: ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) )
			int alt110=3;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==INNER) ) {
				alt110=1;
			}
			else if ( (LA110_0==FULL||LA110_0==LEFT||LA110_0==RIGHT) ) {
				int LA110_2 = input.LA(2);
				if ( (LA110_2==OUTER) ) {
					alt110=2;
				}
				else if ( (LA110_2==EOF||LA110_2==JOIN) ) {
					alt110=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:883:5: INNER
					{
					root_0 = (CommonTree)adaptor.nil();


					INNER364=(Token)match(input,INNER,FOLLOW_INNER_in_join_type6997); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INNER364_tree = (CommonTree)adaptor.create(INNER364);
					adaptor.addChild(root_0, INNER364_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:884:5: t= outer_join_type OUTER
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type7005);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					OUTER365=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_type7007); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTER.add(OUTER365);

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
					// 884:29: -> ^( OUTER $t)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:884:32: ^( OUTER $t)
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:885:5: t= outer_join_type
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type7024);
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
					// 885:23: -> ^( OUTER $t)
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:885:26: ^( OUTER $t)
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
			if ( state.backtracking>0 ) { memoize(input, 98, join_type_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:887:1: outer_join_type : ( LEFT | RIGHT | FULL );
	public final DDLParser.outer_join_type_return outer_join_type() throws RecognitionException {
		DDLParser.outer_join_type_return retval = new DDLParser.outer_join_type_return();
		retval.start = input.LT(1);
		int outer_join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set366=null;

		CommonTree set366_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:888:3: ( LEFT | RIGHT | FULL )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set366=input.LT(1);
			if ( input.LA(1)==FULL||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set366));
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
			if ( state.backtracking>0 ) { memoize(input, 99, outer_join_type_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:892:1: join_specification : ( join_condition | named_columns_join );
	public final DDLParser.join_specification_return join_specification() throws RecognitionException {
		DDLParser.join_specification_return retval = new DDLParser.join_specification_return();
		retval.start = input.LT(1);
		int join_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope join_condition367 =null;
		ParserRuleReturnScope named_columns_join368 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:893:3: ( join_condition | named_columns_join )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==ON) ) {
				alt111=1;
			}
			else if ( (LA111_0==USING) ) {
				alt111=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:893:5: join_condition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_join_condition_in_join_specification7069);
					join_condition367=join_condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join_condition367.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:894:5: named_columns_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_named_columns_join_in_join_specification7075);
					named_columns_join368=named_columns_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, named_columns_join368.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 100, join_specification_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:896:1: join_condition : ON ^ search_condition ;
	public final DDLParser.join_condition_return join_condition() throws RecognitionException {
		DDLParser.join_condition_return retval = new DDLParser.join_condition_return();
		retval.start = input.LT(1);
		int join_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ON369=null;
		ParserRuleReturnScope search_condition370 =null;

		CommonTree ON369_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:897:3: ( ON ^ search_condition )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:897:5: ON ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			ON369=(Token)match(input,ON,FOLLOW_ON_in_join_condition7087); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON369_tree = (CommonTree)adaptor.create(ON369);
			root_0 = (CommonTree)adaptor.becomeRoot(ON369_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_join_condition7090);
			search_condition370=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition370.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 101, join_condition_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:899:1: named_columns_join : USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) ;
	public final DDLParser.named_columns_join_return named_columns_join() throws RecognitionException {
		DDLParser.named_columns_join_return retval = new DDLParser.named_columns_join_return();
		retval.start = input.LT(1);
		int named_columns_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token USING371=null;
		Token LEFT_PAREN372=null;
		Token RIGHT_PAREN373=null;
		ParserRuleReturnScope f =null;

		CommonTree USING371_tree=null;
		CommonTree LEFT_PAREN372_tree=null;
		CommonTree RIGHT_PAREN373_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:900:3: ( USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:900:5: USING LEFT_PAREN f= column_reference_list RIGHT_PAREN
			{
			USING371=(Token)match(input,USING,FOLLOW_USING_in_named_columns_join7102); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING371);

			LEFT_PAREN372=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_named_columns_join7104); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN372);

			pushFollow(FOLLOW_column_reference_list_in_named_columns_join7108);
			f=column_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference_list.add(f.getTree());
			RIGHT_PAREN373=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_named_columns_join7110); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN373);

			// AST REWRITE
			// elements: USING, f
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
			// 900:58: -> ^( USING $f)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:900:61: ^( USING $f)
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
			if ( state.backtracking>0 ) { memoize(input, 102, named_columns_join_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:902:1: table_primary : table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) ;
	public final DDLParser.table_primary_return table_primary() throws RecognitionException {
		DDLParser.table_primary_return retval = new DDLParser.table_primary_return();
		retval.start = input.LT(1);
		int table_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token AS375=null;
		ParserRuleReturnScope table374 =null;

		CommonTree a_tree=null;
		CommonTree AS375_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:3: ( table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:5: table ( ( AS )? a= Identifier )?
			{
			pushFollow(FOLLOW_table_in_table_primary7131);
			table374=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table374.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:11: ( ( AS )? a= Identifier )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==AS||LA113_0==Identifier) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:12: ( AS )? a= Identifier
					{
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:12: ( AS )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==AS) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:13: AS
							{
							AS375=(Token)match(input,AS,FOLLOW_AS_in_table_primary7135); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS375);

							}
							break;

					}

					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_table_primary7141); if (state.failed) return retval; 
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
			// 903:33: -> ^( TABLE table ( $a)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:36: ^( TABLE table ( $a)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_1);
				adaptor.addChild(root_1, stream_table.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:903:50: ( $a)?
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
			if ( state.backtracking>0 ) { memoize(input, 103, table_primary_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:905:1: where_clause : WHERE ^ search_condition ;
	public final DDLParser.where_clause_return where_clause() throws RecognitionException {
		DDLParser.where_clause_return retval = new DDLParser.where_clause_return();
		retval.start = input.LT(1);
		int where_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHERE376=null;
		ParserRuleReturnScope search_condition377 =null;

		CommonTree WHERE376_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:906:3: ( WHERE ^ search_condition )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:906:5: WHERE ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			WHERE376=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause7169); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE376_tree = (CommonTree)adaptor.create(WHERE376);
			root_0 = (CommonTree)adaptor.becomeRoot(WHERE376_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_where_clause7172);
			search_condition377=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition377.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 104, where_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:914:1: routine_invocation : ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) );
	public final DDLParser.routine_invocation_return routine_invocation() throws RecognitionException {
		DDLParser.routine_invocation_return retval = new DDLParser.routine_invocation_return();
		retval.start = input.LT(1);
		int routine_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier378=null;
		Token LEFT_PAREN379=null;
		Token RIGHT_PAREN381=null;
		Token COUNT382=null;
		Token LEFT_PAREN383=null;
		Token RIGHT_PAREN385=null;
		Token COUNT386=null;
		Token LEFT_PAREN387=null;
		Token MULTIPLY388=null;
		Token RIGHT_PAREN389=null;
		ParserRuleReturnScope funcArgs380 =null;
		ParserRuleReturnScope funcArgs384 =null;

		CommonTree Identifier378_tree=null;
		CommonTree LEFT_PAREN379_tree=null;
		CommonTree RIGHT_PAREN381_tree=null;
		CommonTree COUNT382_tree=null;
		CommonTree LEFT_PAREN383_tree=null;
		CommonTree RIGHT_PAREN385_tree=null;
		CommonTree COUNT386_tree=null;
		CommonTree LEFT_PAREN387_tree=null;
		CommonTree MULTIPLY388_tree=null;
		CommonTree RIGHT_PAREN389_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:915:2: ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) )
			int alt115=3;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==Identifier) ) {
				alt115=1;
			}
			else if ( (LA115_0==COUNT) ) {
				int LA115_2 = input.LA(2);
				if ( (LA115_2==LEFT_PAREN) ) {
					int LA115_3 = input.LA(3);
					if ( (LA115_3==MULTIPLY) ) {
						alt115=3;
					}
					else if ( (LA115_3==CASE||LA115_3==COUNT||LA115_3==Character_String_Literal||LA115_3==Identifier||LA115_3==LEFT_PAREN||LA115_3==MINUS||LA115_3==NOT||LA115_3==NULL||LA115_3==NUMBER||LA115_3==PLUS||LA115_3==REAL_NUMBER) ) {
						alt115=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 115, 3, input);
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
							new NoViableAltException("", 115, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}

			switch (alt115) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:915:4: Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN
					{
					Identifier378=(Token)match(input,Identifier,FOLLOW_Identifier_in_routine_invocation7185); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier378);

					LEFT_PAREN379=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7187); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN379);

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:915:26: ( funcArgs )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==CASE||LA114_0==COUNT||LA114_0==Character_String_Literal||LA114_0==Identifier||LA114_0==LEFT_PAREN||LA114_0==MINUS||LA114_0==NOT||LA114_0==NULL||LA114_0==NUMBER||LA114_0==PLUS||LA114_0==REAL_NUMBER) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:915:26: funcArgs
							{
							pushFollow(FOLLOW_funcArgs_in_routine_invocation7189);
							funcArgs380=funcArgs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs380.getTree());
							}
							break;

					}

					RIGHT_PAREN381=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7192); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN381);

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
					// 915:48: -> ^( FUNCTION[$Identifier.text] ( funcArgs )? )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:915:51: ^( FUNCTION[$Identifier.text] ( funcArgs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (Identifier378!=null?Identifier378.getText():null)), root_1);
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:915:80: ( funcArgs )?
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:916:4: COUNT LEFT_PAREN funcArgs RIGHT_PAREN
					{
					COUNT382=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7207); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT382);

					LEFT_PAREN383=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7209); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN383);

					pushFollow(FOLLOW_funcArgs_in_routine_invocation7211);
					funcArgs384=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs384.getTree());
					RIGHT_PAREN385=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7213); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN385);

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
					// 916:42: -> ^( COUNT_VAL funcArgs )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:916:45: ^( COUNT_VAL funcArgs )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:917:4: COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN
					{
					COUNT386=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT386);

					LEFT_PAREN387=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7228); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN387);

					MULTIPLY388=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_routine_invocation7230); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY388);

					RIGHT_PAREN389=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7232); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN389);

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
					// 917:42: -> ^( COUNT_ROWS )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:917:45: ^( COUNT_ROWS )
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
			if ( state.backtracking>0 ) { memoize(input, 105, routine_invocation_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:919:1: funcArgs : boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ ;
	public final DDLParser.funcArgs_return funcArgs() throws RecognitionException {
		DDLParser.funcArgs_return retval = new DDLParser.funcArgs_return();
		retval.start = input.LT(1);
		int funcArgs_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA391=null;
		ParserRuleReturnScope boolean_value_expression390 =null;
		ParserRuleReturnScope boolean_value_expression392 =null;

		CommonTree COMMA391_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:920:3: ( boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:920:5: boolean_value_expression ( COMMA boolean_value_expression )*
			{
			pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7249);
			boolean_value_expression390=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression390.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:920:30: ( COMMA boolean_value_expression )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==COMMA) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:920:31: COMMA boolean_value_expression
					{
					COMMA391=(Token)match(input,COMMA,FOLLOW_COMMA_in_funcArgs7252); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA391);

					pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7254);
					boolean_value_expression392=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression392.getTree());
					}
					break;

				default :
					break loop116;
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
			// 920:64: -> ( boolean_value_expression )+
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
			if ( state.backtracking>0 ) { memoize(input, 106, funcArgs_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:927:1: groupby_clause : GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) ;
	public final DDLParser.groupby_clause_return groupby_clause() throws RecognitionException {
		DDLParser.groupby_clause_return retval = new DDLParser.groupby_clause_return();
		retval.start = input.LT(1);
		int groupby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token GROUP393=null;
		Token BY394=null;
		ParserRuleReturnScope g =null;

		CommonTree GROUP393_tree=null;
		CommonTree BY394_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_grouping_element_list=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:928:3: ( GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:928:5: GROUP BY g= grouping_element_list
			{
			GROUP393=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause7275); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(GROUP393);

			BY394=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause7277); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY394);

			pushFollow(FOLLOW_grouping_element_list_in_groupby_clause7281);
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
			// 928:38: -> ^( GROUP_BY $g)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:928:41: ^( GROUP_BY $g)
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
			if ( state.backtracking>0 ) { memoize(input, 107, groupby_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:930:1: grouping_element_list : grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ ;
	public final DDLParser.grouping_element_list_return grouping_element_list() throws RecognitionException {
		DDLParser.grouping_element_list_return retval = new DDLParser.grouping_element_list_return();
		retval.start = input.LT(1);
		int grouping_element_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA396=null;
		ParserRuleReturnScope grouping_element395 =null;
		ParserRuleReturnScope grouping_element397 =null;

		CommonTree COMMA396_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_grouping_element=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:931:3: ( grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:931:5: grouping_element ( COMMA grouping_element )*
			{
			pushFollow(FOLLOW_grouping_element_in_grouping_element_list7302);
			grouping_element395=grouping_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element395.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:931:22: ( COMMA grouping_element )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==COMMA) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:931:23: COMMA grouping_element
					{
					COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_grouping_element_list7305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA396);

					pushFollow(FOLLOW_grouping_element_in_grouping_element_list7307);
					grouping_element397=grouping_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element397.getTree());
					}
					break;

				default :
					break loop117;
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
			// 931:48: -> ( grouping_element )+
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
			if ( state.backtracking>0 ) { memoize(input, 108, grouping_element_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:933:1: grouping_element : ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set );
	public final DDLParser.grouping_element_return grouping_element() throws RecognitionException {
		DDLParser.grouping_element_return retval = new DDLParser.grouping_element_return();
		retval.start = input.LT(1);
		int grouping_element_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ordinary_grouping_set398 =null;
		ParserRuleReturnScope rollup_list399 =null;
		ParserRuleReturnScope cube_list400 =null;
		ParserRuleReturnScope empty_grouping_set401 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:934:3: ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set )
			int alt118=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt118=1;
				}
				break;
			case LEFT_PAREN:
				{
				int LA118_2 = input.LA(2);
				if ( (LA118_2==RIGHT_PAREN) ) {
					alt118=4;
				}
				else if ( (LA118_2==Identifier) ) {
					alt118=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 118, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ROLLUP:
				{
				alt118=2;
				}
				break;
			case CUBE:
				{
				alt118=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:934:5: ordinary_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_element7326);
					ordinary_grouping_set398=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinary_grouping_set398.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:935:5: rollup_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollup_list_in_grouping_element7332);
					rollup_list399=rollup_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollup_list399.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:936:5: cube_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cube_list_in_grouping_element7338);
					cube_list400=cube_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cube_list400.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:937:5: empty_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_empty_grouping_set_in_grouping_element7344);
					empty_grouping_set401=empty_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_grouping_set401.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 109, grouping_element_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:939:1: ordinary_grouping_set : ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !);
	public final DDLParser.ordinary_grouping_set_return ordinary_grouping_set() throws RecognitionException {
		DDLParser.ordinary_grouping_set_return retval = new DDLParser.ordinary_grouping_set_return();
		retval.start = input.LT(1);
		int ordinary_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN403=null;
		Token RIGHT_PAREN405=null;
		ParserRuleReturnScope column_reference_list402 =null;
		ParserRuleReturnScope column_reference_list404 =null;

		CommonTree LEFT_PAREN403_tree=null;
		CommonTree RIGHT_PAREN405_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:940:3: ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !)
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==Identifier) ) {
				alt119=1;
			}
			else if ( (LA119_0==LEFT_PAREN) ) {
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:940:5: column_reference_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7356);
					column_reference_list402=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list402.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:941:5: LEFT_PAREN ! column_reference_list RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN403=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7362); if (state.failed) return retval;
					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7365);
					column_reference_list404=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list404.getTree());

					RIGHT_PAREN405=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7367); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 110, ordinary_grouping_set_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:943:1: rollup_list : ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) ;
	public final DDLParser.rollup_list_return rollup_list() throws RecognitionException {
		DDLParser.rollup_list_return retval = new DDLParser.rollup_list_return();
		retval.start = input.LT(1);
		int rollup_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ROLLUP406=null;
		Token LEFT_PAREN407=null;
		Token RIGHT_PAREN408=null;
		ParserRuleReturnScope c =null;

		CommonTree ROLLUP406_tree=null;
		CommonTree LEFT_PAREN407_tree=null;
		CommonTree RIGHT_PAREN408_tree=null;
		RewriteRuleTokenStream stream_ROLLUP=new RewriteRuleTokenStream(adaptor,"token ROLLUP");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:944:3: ( ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:944:5: ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			ROLLUP406=(Token)match(input,ROLLUP,FOLLOW_ROLLUP_in_rollup_list7380); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLUP.add(ROLLUP406);

			LEFT_PAREN407=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_rollup_list7382); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN407);

			pushFollow(FOLLOW_ordinary_grouping_set_in_rollup_list7386);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN408=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_rollup_list7388); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN408);

			// AST REWRITE
			// elements: c, ROLLUP
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
			// 944:59: -> ^( ROLLUP $c)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:944:62: ^( ROLLUP $c)
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
			if ( state.backtracking>0 ) { memoize(input, 111, rollup_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:946:1: cube_list : CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) ;
	public final DDLParser.cube_list_return cube_list() throws RecognitionException {
		DDLParser.cube_list_return retval = new DDLParser.cube_list_return();
		retval.start = input.LT(1);
		int cube_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CUBE409=null;
		Token LEFT_PAREN410=null;
		Token RIGHT_PAREN411=null;
		ParserRuleReturnScope c =null;

		CommonTree CUBE409_tree=null;
		CommonTree LEFT_PAREN410_tree=null;
		CommonTree RIGHT_PAREN411_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CUBE=new RewriteRuleTokenStream(adaptor,"token CUBE");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:947:3: ( CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:947:5: CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			CUBE409=(Token)match(input,CUBE,FOLLOW_CUBE_in_cube_list7409); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CUBE.add(CUBE409);

			LEFT_PAREN410=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cube_list7411); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN410);

			pushFollow(FOLLOW_ordinary_grouping_set_in_cube_list7415);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN411=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cube_list7417); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN411);

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
			// 947:57: -> ^( CUBE $c)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:947:60: ^( CUBE $c)
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
			if ( state.backtracking>0 ) { memoize(input, 112, cube_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:949:1: empty_grouping_set : LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) ;
	public final DDLParser.empty_grouping_set_return empty_grouping_set() throws RecognitionException {
		DDLParser.empty_grouping_set_return retval = new DDLParser.empty_grouping_set_return();
		retval.start = input.LT(1);
		int empty_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN412=null;
		Token RIGHT_PAREN413=null;

		CommonTree LEFT_PAREN412_tree=null;
		CommonTree RIGHT_PAREN413_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:950:3: ( LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:950:5: LEFT_PAREN RIGHT_PAREN
			{
			LEFT_PAREN412=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_empty_grouping_set7438); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN412);

			RIGHT_PAREN413=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_empty_grouping_set7440); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN413);

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
			// 950:28: -> ^( EMPTY_GROUPING_SET )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:950:31: ^( EMPTY_GROUPING_SET )
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
			if ( state.backtracking>0 ) { memoize(input, 113, empty_grouping_set_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:952:1: having_clause : HAVING ^ boolean_value_expression ;
	public final DDLParser.having_clause_return having_clause() throws RecognitionException {
		DDLParser.having_clause_return retval = new DDLParser.having_clause_return();
		retval.start = input.LT(1);
		int having_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token HAVING414=null;
		ParserRuleReturnScope boolean_value_expression415 =null;

		CommonTree HAVING414_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:953:3: ( HAVING ^ boolean_value_expression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:953:5: HAVING ^ boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			HAVING414=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause7458); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			HAVING414_tree = (CommonTree)adaptor.create(HAVING414);
			root_0 = (CommonTree)adaptor.becomeRoot(HAVING414_tree, root_0);
			}

			pushFollow(FOLLOW_boolean_value_expression_in_having_clause7461);
			boolean_value_expression415=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression415.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 114, having_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:961:1: orderby_clause : ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) ;
	public final DDLParser.orderby_clause_return orderby_clause() throws RecognitionException {
		DDLParser.orderby_clause_return retval = new DDLParser.orderby_clause_return();
		retval.start = input.LT(1);
		int orderby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ORDER416=null;
		Token BY417=null;
		ParserRuleReturnScope sort_specifier_list418 =null;

		CommonTree ORDER416_tree=null;
		CommonTree BY417_tree=null;
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:962:3: ( ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:962:5: ORDER BY sort_specifier_list
			{
			ORDER416=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause7475); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(ORDER416);

			BY417=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause7477); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY417);

			pushFollow(FOLLOW_sort_specifier_list_in_orderby_clause7479);
			sort_specifier_list418=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(sort_specifier_list418.getTree());
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
			// 962:34: -> ^( ORDER_BY sort_specifier_list )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:962:37: ^( ORDER_BY sort_specifier_list )
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
			if ( state.backtracking>0 ) { memoize(input, 115, orderby_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:964:1: sort_specifier_list : sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) ;
	public final DDLParser.sort_specifier_list_return sort_specifier_list() throws RecognitionException {
		DDLParser.sort_specifier_list_return retval = new DDLParser.sort_specifier_list_return();
		retval.start = input.LT(1);
		int sort_specifier_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA420=null;
		ParserRuleReturnScope sort_specifier419 =null;
		ParserRuleReturnScope sort_specifier421 =null;

		CommonTree COMMA420_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_sort_specifier=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:965:3: ( sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:965:5: sort_specifier ( COMMA sort_specifier )*
			{
			pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7499);
			sort_specifier419=sort_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier419.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:965:20: ( COMMA sort_specifier )*
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==COMMA) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:965:21: COMMA sort_specifier
					{
					COMMA420=(Token)match(input,COMMA,FOLLOW_COMMA_in_sort_specifier_list7502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA420);

					pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7504);
					sort_specifier421=sort_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier421.getTree());
					}
					break;

				default :
					break loop120;
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
			// 965:44: -> ^( SORT_SPECIFIERS ( sort_specifier )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:965:47: ^( SORT_SPECIFIERS ( sort_specifier )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 116, sort_specifier_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:967:1: sort_specifier : fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) ;
	public final DDLParser.sort_specifier_return sort_specifier() throws RecognitionException {
		DDLParser.sort_specifier_return retval = new DDLParser.sort_specifier_return();
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:3: (fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:5: fn= column_reference (a= order_specification )? (o= null_ordering )?
			{
			pushFollow(FOLLOW_column_reference_in_sort_specifier7529);
			fn=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(fn.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:26: (a= order_specification )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==ASC||LA121_0==DESC) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:26: a= order_specification
					{
					pushFollow(FOLLOW_order_specification_in_sort_specifier7533);
					a=order_specification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_order_specification.add(a.getTree());
					}
					break;

			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:49: (o= null_ordering )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==NULL) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:49: o= null_ordering
					{
					pushFollow(FOLLOW_null_ordering_in_sort_specifier7538);
					o=null_ordering();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_null_ordering.add(o.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: a, fn, o
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
			// 968:65: -> ^( SORT_KEY $fn ( $a)? ( $o)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:68: ^( SORT_KEY $fn ( $a)? ( $o)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_KEY, "SORT_KEY"), root_1);
				adaptor.addChild(root_1, stream_fn.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:84: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:968:88: ( $o)?
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
			if ( state.backtracking>0 ) { memoize(input, 117, sort_specifier_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:970:1: order_specification : ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) );
	public final DDLParser.order_specification_return order_specification() throws RecognitionException {
		DDLParser.order_specification_return retval = new DDLParser.order_specification_return();
		retval.start = input.LT(1);
		int order_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASC422=null;
		Token DESC423=null;

		CommonTree ASC422_tree=null;
		CommonTree DESC423_tree=null;
		RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:971:3: ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) )
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==ASC) ) {
				alt123=1;
			}
			else if ( (LA123_0==DESC) ) {
				alt123=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}

			switch (alt123) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:971:5: ASC
					{
					ASC422=(Token)match(input,ASC,FOLLOW_ASC_in_order_specification7568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASC.add(ASC422);

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
					// 971:9: -> ^( ORDER ASC )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:971:12: ^( ORDER ASC )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:972:5: DESC
					{
					DESC423=(Token)match(input,DESC,FOLLOW_DESC_in_order_specification7582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESC.add(DESC423);

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
					// 972:10: -> ^( ORDER DESC )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:972:13: ^( ORDER DESC )
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
			if ( state.backtracking>0 ) { memoize(input, 118, order_specification_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:974:1: limit_clause : LIMIT e= numeric_value_expression -> ^( LIMIT $e) ;
	public final DDLParser.limit_clause_return limit_clause() throws RecognitionException {
		DDLParser.limit_clause_return retval = new DDLParser.limit_clause_return();
		retval.start = input.LT(1);
		int limit_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LIMIT424=null;
		ParserRuleReturnScope e =null;

		CommonTree LIMIT424_tree=null;
		RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:975:3: ( LIMIT e= numeric_value_expression -> ^( LIMIT $e) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:975:5: LIMIT e= numeric_value_expression
			{
			LIMIT424=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limit_clause7602); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT424);

			pushFollow(FOLLOW_numeric_value_expression_in_limit_clause7606);
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
			// 975:38: -> ^( LIMIT $e)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:975:41: ^( LIMIT $e)
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
			if ( state.backtracking>0 ) { memoize(input, 119, limit_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:977:1: null_ordering : ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) );
	public final DDLParser.null_ordering_return null_ordering() throws RecognitionException {
		DDLParser.null_ordering_return retval = new DDLParser.null_ordering_return();
		retval.start = input.LT(1);
		int null_ordering_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL425=null;
		Token FIRST426=null;
		Token NULL427=null;
		Token LAST428=null;

		CommonTree NULL425_tree=null;
		CommonTree FIRST426_tree=null;
		CommonTree NULL427_tree=null;
		CommonTree LAST428_tree=null;
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:978:3: ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) )
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==NULL) ) {
				int LA124_1 = input.LA(2);
				if ( (LA124_1==FIRST) ) {
					alt124=1;
				}
				else if ( (LA124_1==LAST) ) {
					alt124=2;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:978:5: NULL FIRST
					{
					NULL425=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7627); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL425);

					FIRST426=(Token)match(input,FIRST,FOLLOW_FIRST_in_null_ordering7629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIRST.add(FIRST426);

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
					// 978:16: -> ^( NULL_ORDER FIRST )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:978:19: ^( NULL_ORDER FIRST )
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:979:5: NULL LAST
					{
					NULL427=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7643); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL427);

					LAST428=(Token)match(input,LAST,FOLLOW_LAST_in_null_ordering7645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LAST.add(LAST428);

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
					// 979:15: -> ^( NULL_ORDER LAST )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:979:18: ^( NULL_ORDER LAST )
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
			if ( state.backtracking>0 ) { memoize(input, 120, null_ordering_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:988:1: search_condition : boolean_value_expression ;
	public final DDLParser.search_condition_return search_condition() throws RecognitionException {
		DDLParser.search_condition_return retval = new DDLParser.search_condition_return();
		retval.start = input.LT(1);
		int search_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression429 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:989:2: ( boolean_value_expression )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:989:4: boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_value_expression_in_search_condition7667);
			boolean_value_expression429=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression429.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 121, search_condition_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:991:1: param_clause : WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) ;
	public final DDLParser.param_clause_return param_clause() throws RecognitionException {
		DDLParser.param_clause_return retval = new DDLParser.param_clause_return();
		retval.start = input.LT(1);
		int param_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH430=null;
		Token LEFT_PAREN431=null;
		Token COMMA433=null;
		Token RIGHT_PAREN435=null;
		ParserRuleReturnScope param432 =null;
		ParserRuleReturnScope param434 =null;

		CommonTree WITH430_tree=null;
		CommonTree LEFT_PAREN431_tree=null;
		CommonTree COMMA433_tree=null;
		CommonTree RIGHT_PAREN435_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:992:3: ( WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:992:5: WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN
			{
			WITH430=(Token)match(input,WITH,FOLLOW_WITH_in_param_clause7678); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH430);

			LEFT_PAREN431=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_param_clause7680); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN431);

			pushFollow(FOLLOW_param_in_param_clause7682);
			param432=param();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_param.add(param432.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:992:27: ( COMMA param )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==COMMA) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:992:28: COMMA param
					{
					COMMA433=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_clause7685); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA433);

					pushFollow(FOLLOW_param_in_param_clause7687);
					param434=param();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param.add(param434.getTree());
					}
					break;

				default :
					break loop125;
				}
			}

			RIGHT_PAREN435=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_param_clause7691); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN435);

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
			// 992:54: -> ^( PARAMS ( param )+ )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:992:57: ^( PARAMS ( param )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 122, param_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:994:1: param : k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) ;
	public final DDLParser.param_return param() throws RecognitionException {
		DDLParser.param_return retval = new DDLParser.param_return();
		retval.start = input.LT(1);
		int param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token k=null;
		Token EQUAL436=null;
		ParserRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree EQUAL436_tree=null;
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:995:3: (k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:995:5: k= Character_String_Literal EQUAL v= numeric_value_expression
			{
			k=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_param7714); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(k);

			EQUAL436=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_param7716); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL436);

			pushFollow(FOLLOW_numeric_value_expression_in_param7720);
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
			// 995:65: -> ^( PARAM $k $v)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:995:68: ^( PARAM $k $v)
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
			if ( state.backtracking>0 ) { memoize(input, 123, param_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:997:1: method_specifier : USING m= Identifier -> ^( USING[$m.text] ) ;
	public final DDLParser.method_specifier_return method_specifier() throws RecognitionException {
		DDLParser.method_specifier_return retval = new DDLParser.method_specifier_return();
		retval.start = input.LT(1);
		int method_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token m=null;
		Token USING437=null;

		CommonTree m_tree=null;
		CommonTree USING437_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:998:3: ( USING m= Identifier -> ^( USING[$m.text] ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:998:5: USING m= Identifier
			{
			USING437=(Token)match(input,USING,FOLLOW_USING_in_method_specifier7744); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING437);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_method_specifier7748); if (state.failed) return retval; 
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
			// 998:24: -> ^( USING[$m.text] )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:998:27: ^( USING[$m.text] )
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
			if ( state.backtracking>0 ) { memoize(input, 124, method_specifier_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1005:1: boolean_value_expression : and_predicate ( OR ^ and_predicate )* ;
	public final DDLParser.boolean_value_expression_return boolean_value_expression() throws RecognitionException {
		DDLParser.boolean_value_expression_return retval = new DDLParser.boolean_value_expression_return();
		retval.start = input.LT(1);
		int boolean_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR439=null;
		ParserRuleReturnScope and_predicate438 =null;
		ParserRuleReturnScope and_predicate440 =null;

		CommonTree OR439_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1006:2: ( and_predicate ( OR ^ and_predicate )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1006:4: and_predicate ( OR ^ and_predicate )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7768);
			and_predicate438=and_predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate438.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1006:18: ( OR ^ and_predicate )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==OR) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1006:19: OR ^ and_predicate
					{
					OR439=(Token)match(input,OR,FOLLOW_OR_in_boolean_value_expression7771); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR439_tree = (CommonTree)adaptor.create(OR439);
					root_0 = (CommonTree)adaptor.becomeRoot(OR439_tree, root_0);
					}

					pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7774);
					and_predicate440=and_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate440.getTree());

					}
					break;

				default :
					break loop126;
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
			if ( state.backtracking>0 ) { memoize(input, 125, boolean_value_expression_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1008:1: and_predicate : boolean_factor ( AND ^ boolean_factor )* ;
	public final DDLParser.and_predicate_return and_predicate() throws RecognitionException {
		DDLParser.and_predicate_return retval = new DDLParser.and_predicate_return();
		retval.start = input.LT(1);
		int and_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AND442=null;
		ParserRuleReturnScope boolean_factor441 =null;
		ParserRuleReturnScope boolean_factor443 =null;

		CommonTree AND442_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1009:3: ( boolean_factor ( AND ^ boolean_factor )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1009:5: boolean_factor ( AND ^ boolean_factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_and_predicate7787);
			boolean_factor441=boolean_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor441.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1009:20: ( AND ^ boolean_factor )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==AND) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1009:21: AND ^ boolean_factor
					{
					AND442=(Token)match(input,AND,FOLLOW_AND_in_and_predicate7790); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND442_tree = (CommonTree)adaptor.create(AND442);
					root_0 = (CommonTree)adaptor.becomeRoot(AND442_tree, root_0);
					}

					pushFollow(FOLLOW_boolean_factor_in_and_predicate7793);
					boolean_factor443=boolean_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor443.getTree());

					}
					break;

				default :
					break loop127;
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
			if ( state.backtracking>0 ) { memoize(input, 126, and_predicate_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1011:1: boolean_factor : ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) );
	public final DDLParser.boolean_factor_return boolean_factor() throws RecognitionException {
		DDLParser.boolean_factor_return retval = new DDLParser.boolean_factor_return();
		retval.start = input.LT(1);
		int boolean_factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT445=null;
		ParserRuleReturnScope boolean_test444 =null;
		ParserRuleReturnScope boolean_test446 =null;

		CommonTree NOT445_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_boolean_test=new RewriteRuleSubtreeStream(adaptor,"rule boolean_test");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1012:3: ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==CASE||LA128_0==COUNT||LA128_0==Character_String_Literal||LA128_0==Identifier||LA128_0==LEFT_PAREN||LA128_0==MINUS||LA128_0==NULL||LA128_0==NUMBER||LA128_0==PLUS||LA128_0==REAL_NUMBER) ) {
				alt128=1;
			}
			else if ( (LA128_0==NOT) ) {
				alt128=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1012:5: boolean_test
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_test_in_boolean_factor7806);
					boolean_test444=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_test444.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1013:5: NOT boolean_test
					{
					NOT445=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_factor7812); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT445);

					pushFollow(FOLLOW_boolean_test_in_boolean_factor7814);
					boolean_test446=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_test.add(boolean_test446.getTree());
					// AST REWRITE
					// elements: boolean_test, NOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1013:22: -> ^( NOT boolean_test )
					{
						// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1013:25: ^( NOT boolean_test )
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
			if ( state.backtracking>0 ) { memoize(input, 127, boolean_factor_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1015:1: boolean_test : boolean_primary ( is_clause )? ;
	public final DDLParser.boolean_test_return boolean_test() throws RecognitionException {
		DDLParser.boolean_test_return retval = new DDLParser.boolean_test_return();
		retval.start = input.LT(1);
		int boolean_test_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_primary447 =null;
		ParserRuleReturnScope is_clause448 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1016:3: ( boolean_primary ( is_clause )? )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1016:5: boolean_primary ( is_clause )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_primary_in_boolean_test7834);
			boolean_primary447=boolean_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_primary447.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1016:21: ( is_clause )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==IS) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1016:21: is_clause
					{
					pushFollow(FOLLOW_is_clause_in_boolean_test7836);
					is_clause448=is_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, is_clause448.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 128, boolean_test_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1018:1: is_clause : IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) ;
	public final DDLParser.is_clause_return is_clause() throws RecognitionException {
		DDLParser.is_clause_return retval = new DDLParser.is_clause_return();
		retval.start = input.LT(1);
		int is_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IS449=null;
		Token NOT450=null;
		ParserRuleReturnScope t =null;

		CommonTree IS449_tree=null;
		CommonTree NOT450_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_truth_value=new RewriteRuleSubtreeStream(adaptor,"rule truth_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1019:3: ( IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1019:5: IS ( NOT )? t= truth_value
			{
			IS449=(Token)match(input,IS,FOLLOW_IS_in_is_clause7849); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS449);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1019:8: ( NOT )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==NOT) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1019:8: NOT
					{
					NOT450=(Token)match(input,NOT,FOLLOW_NOT_in_is_clause7851); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT450);

					}
					break;

			}

			pushFollow(FOLLOW_truth_value_in_is_clause7856);
			t=truth_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_truth_value.add(t.getTree());
			// AST REWRITE
			// elements: NOT, IS, t
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
			// 1019:27: -> ^( IS ( NOT )? $t)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1019:30: ^( IS ( NOT )? $t)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1019:35: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 129, is_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1021:1: truth_value : ( TRUE | FALSE | UNKNOWN );
	public final DDLParser.truth_value_return truth_value() throws RecognitionException {
		DDLParser.truth_value_return retval = new DDLParser.truth_value_return();
		retval.start = input.LT(1);
		int truth_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set451=null;

		CommonTree set451_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1022:3: ( TRUE | FALSE | UNKNOWN )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set451=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE||input.LA(1)==UNKNOWN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set451));
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
			if ( state.backtracking>0 ) { memoize(input, 130, truth_value_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1024:1: boolean_primary : ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression );
	public final DDLParser.boolean_primary_return boolean_primary() throws RecognitionException {
		DDLParser.boolean_primary_return retval = new DDLParser.boolean_primary_return();
		retval.start = input.LT(1);
		int boolean_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN454=null;
		Token RIGHT_PAREN456=null;
		ParserRuleReturnScope predicate452 =null;
		ParserRuleReturnScope numeric_value_expression453 =null;
		ParserRuleReturnScope boolean_value_expression455 =null;
		ParserRuleReturnScope case_expression457 =null;

		CommonTree LEFT_PAREN454_tree=null;
		CommonTree RIGHT_PAREN456_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1025:3: ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression )
			int alt131=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA131_1 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 1, input);
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
				int LA131_2 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 2, input);
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
				int LA131_3 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL:
				{
				int LA131_4 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA131_5 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA131_6 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}
				else if ( (synpred198_DDL()) ) {
					alt131=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA131_7 = input.LA(2);
				if ( (synpred196_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred197_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CASE:
				{
				alt131=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}
			switch (alt131) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1025:5: predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_boolean_primary7900);
					predicate452=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate452.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1026:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_boolean_primary7906);
					numeric_value_expression453=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression453.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1027:5: LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN454=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_primary7912); if (state.failed) return retval;
					pushFollow(FOLLOW_boolean_value_expression_in_boolean_primary7915);
					boolean_value_expression455=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression455.getTree());

					RIGHT_PAREN456=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_primary7917); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1028:5: case_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_primary7924);
					case_expression457=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression457.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 131, boolean_primary_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1035:1: predicate : ( comparison_predicate | in_predicate | like_predicate | null_predicate );
	public final DDLParser.predicate_return predicate() throws RecognitionException {
		DDLParser.predicate_return retval = new DDLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison_predicate458 =null;
		ParserRuleReturnScope in_predicate459 =null;
		ParserRuleReturnScope like_predicate460 =null;
		ParserRuleReturnScope null_predicate461 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1036:3: ( comparison_predicate | in_predicate | like_predicate | null_predicate )
			int alt132=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA132_1 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA132_2 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA132_3 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case NULL:
				{
				int LA132_4 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case Identifier:
				{
				int LA132_5 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (synpred201_DDL()) ) {
					alt132=3;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA132_6 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case COUNT:
				{
				int LA132_7 = input.LA(2);
				if ( (synpred199_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred200_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}
			switch (alt132) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1036:5: comparison_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_comparison_predicate_in_predicate7938);
					comparison_predicate458=comparison_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_predicate458.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1037:5: in_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_in_predicate_in_predicate7944);
					in_predicate459=in_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_predicate459.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1038:5: like_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_like_predicate_in_predicate7950);
					like_predicate460=like_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_predicate460.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1039:5: null_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_null_predicate_in_predicate7956);
					null_predicate461=null_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_predicate461.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 132, predicate_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1047:1: comparison_predicate options {k=1; } : l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) ;
	public final DDLParser.comparison_predicate_return comparison_predicate() throws RecognitionException {
		DDLParser.comparison_predicate_return retval = new DDLParser.comparison_predicate_return();
		retval.start = input.LT(1);
		int comparison_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope l =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");
		RewriteRuleSubtreeStream stream_comp_op=new RewriteRuleSubtreeStream(adaptor,"rule comp_op");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1049:2: (l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1049:4: l= numeric_value_expression c= comp_op r= numeric_value_expression
			{
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7980);
			l=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(l.getTree());
			pushFollow(FOLLOW_comp_op_in_comparison_predicate7984);
			c=comp_op();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_comp_op.add(c.getTree());
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7988);
			r=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(r.getTree());
			// AST REWRITE
			// elements: r, l, c
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
			// 1049:68: -> ^( $c $l $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1049:71: ^( $c $l $r)
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
			if ( state.backtracking>0 ) { memoize(input, 133, comparison_predicate_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1051:1: comp_op : ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ );
	public final DDLParser.comp_op_return comp_op() throws RecognitionException {
		DDLParser.comp_op_return retval = new DDLParser.comp_op_return();
		retval.start = input.LT(1);
		int comp_op_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set462=null;

		CommonTree set462_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1052:3: ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set462=input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==GEQ||input.LA(1)==GTH||input.LA(1)==LEQ||input.LA(1)==LTH||input.LA(1)==NOT_EQUAL ) {
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
			if ( state.backtracking>0 ) { memoize(input, 134, comp_op_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:1: in_predicate : v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) ;
	public final DDLParser.in_predicate_return in_predicate() throws RecognitionException {
		DDLParser.in_predicate_return retval = new DDLParser.in_predicate_return();
		retval.start = input.LT(1);
		int in_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT463=null;
		Token IN464=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope a =null;

		CommonTree NOT463_tree=null;
		CommonTree IN464_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");
		RewriteRuleSubtreeStream stream_in_predicate_value=new RewriteRuleSubtreeStream(adaptor,"rule in_predicate_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:14: (v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:16: v= numeric_value_expression ( NOT )? IN a= in_predicate_value
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_predicate8056);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:44: ( NOT )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==NOT) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:44: NOT
					{
					NOT463=(Token)match(input,NOT,FOLLOW_NOT_in_in_predicate8059); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT463);

					}
					break;

			}

			IN464=(Token)match(input,IN,FOLLOW_IN_in_in_predicate8062); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(IN464);

			pushFollow(FOLLOW_in_predicate_value_in_in_predicate8066);
			a=in_predicate_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_in_predicate_value.add(a.getTree());
			// AST REWRITE
			// elements: IN, a, NOT, v
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
			// 1065:73: -> ^( IN $v $a ( NOT )? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:76: ^( IN $v $a ( NOT )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_a.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1065:87: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 135, in_predicate_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1066:1: in_predicate_value : LEFT_PAREN ! in_value_list RIGHT_PAREN !;
	public final DDLParser.in_predicate_value_return in_predicate_value() throws RecognitionException {
		DDLParser.in_predicate_value_return retval = new DDLParser.in_predicate_value_return();
		retval.start = input.LT(1);
		int in_predicate_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN465=null;
		Token RIGHT_PAREN467=null;
		ParserRuleReturnScope in_value_list466 =null;

		CommonTree LEFT_PAREN465_tree=null;
		CommonTree RIGHT_PAREN467_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1067:3: ( LEFT_PAREN ! in_value_list RIGHT_PAREN !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1067:5: LEFT_PAREN ! in_value_list RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN465=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value8090); if (state.failed) return retval;
			pushFollow(FOLLOW_in_value_list_in_in_predicate_value8093);
			in_value_list466=in_value_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, in_value_list466.getTree());

			RIGHT_PAREN467=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value8096); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 136, in_predicate_value_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1069:1: in_value_list : numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ ;
	public final DDLParser.in_value_list_return in_value_list() throws RecognitionException {
		DDLParser.in_value_list_return retval = new DDLParser.in_value_list_return();
		retval.start = input.LT(1);
		int in_value_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA469=null;
		ParserRuleReturnScope numeric_value_expression468 =null;
		ParserRuleReturnScope numeric_value_expression470 =null;

		CommonTree COMMA469_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1070:3: ( numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1070:5: numeric_value_expression ( COMMA numeric_value_expression )*
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_value_list8108);
			numeric_value_expression468=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression468.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1070:31: ( COMMA numeric_value_expression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==COMMA) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1070:33: COMMA numeric_value_expression
					{
					COMMA469=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list8113); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA469);

					pushFollow(FOLLOW_numeric_value_expression_in_in_value_list8115);
					numeric_value_expression470=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression470.getTree());
					}
					break;

				default :
					break loop134;
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
			// 1070:68: -> ( numeric_value_expression )+
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
			if ( state.backtracking>0 ) { memoize(input, 137, in_value_list_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1077:1: like_predicate : f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) ;
	public final DDLParser.like_predicate_return like_predicate() throws RecognitionException {
		DDLParser.like_predicate_return retval = new DDLParser.like_predicate_return();
		retval.start = input.LT(1);
		int like_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token NOT471=null;
		Token LIKE472=null;
		ParserRuleReturnScope f =null;

		CommonTree s_tree=null;
		CommonTree NOT471_tree=null;
		CommonTree LIKE472_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1078:3: (f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1078:5: f= column_reference ( NOT )? LIKE s= Character_String_Literal
			{
			pushFollow(FOLLOW_column_reference_in_like_predicate8137);
			f=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(f.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1078:24: ( NOT )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==NOT) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1078:24: NOT
					{
					NOT471=(Token)match(input,NOT,FOLLOW_NOT_in_like_predicate8139); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT471);

					}
					break;

			}

			LIKE472=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate8142); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIKE.add(LIKE472);

			s=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_like_predicate8146); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(s);

			// AST REWRITE
			// elements: LIKE, NOT, s, f
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
			// 1078:61: -> ^( LIKE ( NOT )? $f $s)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1078:64: ^( LIKE ( NOT )? $f $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIKE.nextNode(), root_1);
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1078:71: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 138, like_predicate_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1086:1: null_predicate : f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) ;
	public final DDLParser.null_predicate_return null_predicate() throws RecognitionException {
		DDLParser.null_predicate_return retval = new DDLParser.null_predicate_return();
		retval.start = input.LT(1);
		int null_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token IS473=null;
		Token NULL474=null;
		ParserRuleReturnScope f =null;

		CommonTree n_tree=null;
		CommonTree IS473_tree=null;
		CommonTree NULL474_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1087:3: (f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1087:5: f= numeric_value_expression IS (n= NOT )? NULL
			{
			pushFollow(FOLLOW_numeric_value_expression_in_null_predicate8177);
			f=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(f.getTree());
			IS473=(Token)match(input,IS,FOLLOW_IS_in_null_predicate8179); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS473);

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1087:35: (n= NOT )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==NOT) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1087:36: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate8184); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(n);

					}
					break;

			}

			NULL474=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate8188); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL474);

			// AST REWRITE
			// elements: f, n, NULL, IS
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
			// 1087:49: -> ^( IS $f NULL ( $n)? )
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1087:52: ^( IS $f NULL ( $n)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_NULL.nextNode());
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1087:66: ( $n)?
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
			if ( state.backtracking>0 ) { memoize(input, 139, null_predicate_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1095:1: numeric_value_expression : term ( ( PLUS | MINUS ) ^ term )* ;
	public final DDLParser.numeric_value_expression_return numeric_value_expression() throws RecognitionException {
		DDLParser.numeric_value_expression_return retval = new DDLParser.numeric_value_expression_return();
		retval.start = input.LT(1);
		int numeric_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set476=null;
		ParserRuleReturnScope term475 =null;
		ParserRuleReturnScope term477 =null;

		CommonTree set476_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1096:2: ( term ( ( PLUS | MINUS ) ^ term )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1096:4: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_term_in_numeric_value_expression8216);
			term475=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term475.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1096:9: ( ( PLUS | MINUS ) ^ term )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==MINUS||LA137_0==PLUS) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1096:10: ( PLUS | MINUS ) ^ term
					{
					set476=input.LT(1);
					set476=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set476), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numeric_value_expression8226);
					term477=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term477.getTree());

					}
					break;

				default :
					break loop137;
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
			if ( state.backtracking>0 ) { memoize(input, 140, numeric_value_expression_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1098:1: term : numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* ;
	public final DDLParser.term_return term() throws RecognitionException {
		DDLParser.term_return retval = new DDLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set479=null;
		ParserRuleReturnScope numeric_primary478 =null;
		ParserRuleReturnScope numeric_primary480 =null;

		CommonTree set479_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1099:3: ( numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1099:5: numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_numeric_primary_in_term8239);
			numeric_primary478=numeric_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary478.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1099:21: ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==DIVIDE||(LA138_0 >= MODULAR && LA138_0 <= MULTIPLY)) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1099:22: ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary
					{
					set479=input.LT(1);
					set479=input.LT(1);
					if ( input.LA(1)==DIVIDE||(input.LA(1) >= MODULAR && input.LA(1) <= MULTIPLY) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set479), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_primary_in_term8251);
					numeric_primary480=numeric_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary480.getTree());

					}
					break;

				default :
					break loop138;
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
			if ( state.backtracking>0 ) { memoize(input, 141, term_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1101:1: array : LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ ;
	public final DDLParser.array_return array() throws RecognitionException {
		DDLParser.array_return retval = new DDLParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN481=null;
		Token COMMA483=null;
		Token RIGHT_PAREN485=null;
		ParserRuleReturnScope literal482 =null;
		ParserRuleReturnScope literal484 =null;

		CommonTree LEFT_PAREN481_tree=null;
		CommonTree COMMA483_tree=null;
		CommonTree RIGHT_PAREN485_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1102:3: ( LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1102:5: LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN
			{
			LEFT_PAREN481=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_array8264); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN481);

			pushFollow(FOLLOW_literal_in_array8266);
			literal482=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_literal.add(literal482.getTree());
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1102:24: ( COMMA literal )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==COMMA) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1102:25: COMMA literal
					{
					COMMA483=(Token)match(input,COMMA,FOLLOW_COMMA_in_array8269); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA483);

					pushFollow(FOLLOW_literal_in_array8271);
					literal484=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal484.getTree());
					}
					break;

				default :
					break loop139;
				}
			}

			RIGHT_PAREN485=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_array8276); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN485);

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
			// 1102:54: -> ( literal )+
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
			if ( state.backtracking>0 ) { memoize(input, 142, array_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1104:1: numeric_primary : ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation );
	public final DDLParser.numeric_primary_return numeric_primary() throws RecognitionException {
		DDLParser.numeric_primary_return retval = new DDLParser.numeric_primary_return();
		retval.start = input.LT(1);
		int numeric_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN488=null;
		Token RIGHT_PAREN490=null;
		ParserRuleReturnScope literal486 =null;
		ParserRuleReturnScope column_reference487 =null;
		ParserRuleReturnScope numeric_value_expression489 =null;
		ParserRuleReturnScope routine_invocation491 =null;

		CommonTree LEFT_PAREN488_tree=null;
		CommonTree RIGHT_PAREN490_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1105:3: ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation )
			int alt140=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
			case MINUS:
			case NULL:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt140=1;
				}
				break;
			case Identifier:
				{
				int LA140_2 = input.LA(2);
				if ( (LA140_2==LEFT_PAREN) ) {
					alt140=4;
				}
				else if ( (LA140_2==EOF||(LA140_2 >= AND && LA140_2 <= AS)||LA140_2==COMMA||LA140_2==CROSS||LA140_2==DIVIDE||LA140_2==ELSE||(LA140_2 >= END && LA140_2 <= EQUAL)||LA140_2==EXCEPT||(LA140_2 >= FROM && LA140_2 <= FULL)||(LA140_2 >= GEQ && LA140_2 <= GROUP)||LA140_2==GTH||LA140_2==HAVING||LA140_2==IN||LA140_2==INNER||LA140_2==INTERSECT||LA140_2==IS||LA140_2==Identifier||LA140_2==JOIN||LA140_2==LEFT||LA140_2==LEQ||LA140_2==LIMIT||LA140_2==LTH||LA140_2==MINUS||(LA140_2 >= MODULAR && LA140_2 <= MULTIPLY)||LA140_2==NATURAL||(LA140_2 >= NOT && LA140_2 <= NOT_EQUAL)||(LA140_2 >= OR && LA140_2 <= ORDER)||LA140_2==PLUS||(LA140_2 >= RIGHT && LA140_2 <= RIGHT_PAREN)||LA140_2==THEN||LA140_2==UNION||(LA140_2 >= WHEN && LA140_2 <= WHERE)) ) {
					alt140=2;
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
			case LEFT_PAREN:
				{
				alt140=3;
				}
				break;
			case COUNT:
				{
				alt140=4;
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
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1105:5: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_numeric_primary8293);
					literal486=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal486.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1106:4: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_numeric_primary8298);
					column_reference487=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference487.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1107:4: LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN488=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_numeric_primary8303); if (state.failed) return retval;
					pushFollow(FOLLOW_numeric_value_expression_in_numeric_primary8306);
					numeric_value_expression489=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression489.getTree());

					RIGHT_PAREN490=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_numeric_primary8308); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1108:4: routine_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_routine_invocation_in_numeric_primary8314);
					routine_invocation491=routine_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, routine_invocation491.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 143, numeric_primary_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1110:1: literal : ( string_value_expr | signed_numerical_literal | NULL );
	public final DDLParser.literal_return literal() throws RecognitionException {
		DDLParser.literal_return retval = new DDLParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL494=null;
		ParserRuleReturnScope string_value_expr492 =null;
		ParserRuleReturnScope signed_numerical_literal493 =null;

		CommonTree NULL494_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1111:3: ( string_value_expr | signed_numerical_literal | NULL )
			int alt141=3;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				alt141=1;
				}
				break;
			case MINUS:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt141=2;
				}
				break;
			case NULL:
				{
				alt141=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}
			switch (alt141) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1111:5: string_value_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_value_expr_in_literal8325);
					string_value_expr492=string_value_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value_expr492.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1112:5: signed_numerical_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signed_numerical_literal_in_literal8331);
					signed_numerical_literal493=signed_numerical_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, signed_numerical_literal493.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1113:5: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL494=(Token)match(input,NULL,FOLLOW_NULL_in_literal8337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL494_tree = (CommonTree)adaptor.create(NULL494);
					adaptor.addChild(root_0, NULL494_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 144, literal_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1115:1: string_value_expr : Character_String_Literal ;
	public final DDLParser.string_value_expr_return string_value_expr() throws RecognitionException {
		DDLParser.string_value_expr_return retval = new DDLParser.string_value_expr_return();
		retval.start = input.LT(1);
		int string_value_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Character_String_Literal495=null;

		CommonTree Character_String_Literal495_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1116:3: ( Character_String_Literal )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1116:5: Character_String_Literal
			{
			root_0 = (CommonTree)adaptor.nil();


			Character_String_Literal495=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_string_value_expr8349); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Character_String_Literal495_tree = (CommonTree)adaptor.create(Character_String_Literal495);
			adaptor.addChild(root_0, Character_String_Literal495_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 145, string_value_expr_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1118:1: signed_numerical_literal : ( sign )? unsigned_numerical_literal ;
	public final DDLParser.signed_numerical_literal_return signed_numerical_literal() throws RecognitionException {
		DDLParser.signed_numerical_literal_return retval = new DDLParser.signed_numerical_literal_return();
		retval.start = input.LT(1);
		int signed_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope sign496 =null;
		ParserRuleReturnScope unsigned_numerical_literal497 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1119:3: ( ( sign )? unsigned_numerical_literal )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1119:5: ( sign )? unsigned_numerical_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1119:5: ( sign )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==MINUS||LA142_0==PLUS) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1119:5: sign
					{
					pushFollow(FOLLOW_sign_in_signed_numerical_literal8361);
					sign496=sign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sign496.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8364);
			unsigned_numerical_literal497=unsigned_numerical_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unsigned_numerical_literal497.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 146, signed_numerical_literal_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1121:1: unsigned_numerical_literal : ( NUMBER | REAL_NUMBER );
	public final DDLParser.unsigned_numerical_literal_return unsigned_numerical_literal() throws RecognitionException {
		DDLParser.unsigned_numerical_literal_return retval = new DDLParser.unsigned_numerical_literal_return();
		retval.start = input.LT(1);
		int unsigned_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set498=null;

		CommonTree set498_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1122:3: ( NUMBER | REAL_NUMBER )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set498=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==REAL_NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set498));
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
			if ( state.backtracking>0 ) { memoize(input, 147, unsigned_numerical_literal_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1125:1: sign : ( PLUS | MINUS );
	public final DDLParser.sign_return sign() throws RecognitionException {
		DDLParser.sign_return retval = new DDLParser.sign_return();
		retval.start = input.LT(1);
		int sign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set499=null;

		CommonTree set499_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1126:3: ( PLUS | MINUS )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set499=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set499));
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
			if ( state.backtracking>0 ) { memoize(input, 148, sign_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1133:1: case_expression : case_specification ;
	public final DDLParser.case_expression_return case_expression() throws RecognitionException {
		DDLParser.case_expression_return retval = new DDLParser.case_expression_return();
		retval.start = input.LT(1);
		int case_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope case_specification500 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1134:3: ( case_specification )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1134:5: case_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_case_specification_in_case_expression8412);
			case_specification500=case_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_specification500.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 149, case_expression_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1136:1: case_abbreviation : ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN );
	public final DDLParser.case_abbreviation_return case_abbreviation() throws RecognitionException {
		DDLParser.case_abbreviation_return retval = new DDLParser.case_abbreviation_return();
		retval.start = input.LT(1);
		int case_abbreviation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULLIF501=null;
		Token LEFT_PAREN502=null;
		Token COMMA504=null;
		Token RIGHT_PAREN506=null;
		Token COALESCE507=null;
		Token LEFT_PAREN508=null;
		Token COMMA510=null;
		Token RIGHT_PAREN512=null;
		ParserRuleReturnScope numeric_value_expression503 =null;
		ParserRuleReturnScope boolean_value_expression505 =null;
		ParserRuleReturnScope numeric_value_expression509 =null;
		ParserRuleReturnScope boolean_value_expression511 =null;

		CommonTree NULLIF501_tree=null;
		CommonTree LEFT_PAREN502_tree=null;
		CommonTree COMMA504_tree=null;
		CommonTree RIGHT_PAREN506_tree=null;
		CommonTree COALESCE507_tree=null;
		CommonTree LEFT_PAREN508_tree=null;
		CommonTree COMMA510_tree=null;
		CommonTree RIGHT_PAREN512_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1137:3: ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN )
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==NULLIF) ) {
				alt144=1;
			}
			else if ( (LA144_0==COALESCE) ) {
				alt144=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}

			switch (alt144) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1137:5: NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					NULLIF501=(Token)match(input,NULLIF,FOLLOW_NULLIF_in_case_abbreviation8424); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULLIF501_tree = (CommonTree)adaptor.create(NULLIF501);
					adaptor.addChild(root_0, NULLIF501_tree);
					}

					LEFT_PAREN502=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8426); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN502_tree = (CommonTree)adaptor.create(LEFT_PAREN502);
					adaptor.addChild(root_0, LEFT_PAREN502_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8428);
					numeric_value_expression503=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression503.getTree());

					COMMA504=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8430); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA504_tree = (CommonTree)adaptor.create(COMMA504);
					adaptor.addChild(root_0, COMMA504_tree);
					}

					pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8432);
					boolean_value_expression505=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression505.getTree());

					RIGHT_PAREN506=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8435); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN506_tree = (CommonTree)adaptor.create(RIGHT_PAREN506);
					adaptor.addChild(root_0, RIGHT_PAREN506_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1138:5: COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					COALESCE507=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation8441); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COALESCE507_tree = (CommonTree)adaptor.create(COALESCE507);
					adaptor.addChild(root_0, COALESCE507_tree);
					}

					LEFT_PAREN508=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8443); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN508_tree = (CommonTree)adaptor.create(LEFT_PAREN508);
					adaptor.addChild(root_0, LEFT_PAREN508_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8445);
					numeric_value_expression509=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression509.getTree());

					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1138:50: ( COMMA boolean_value_expression )+
					int cnt143=0;
					loop143:
					while (true) {
						int alt143=2;
						int LA143_0 = input.LA(1);
						if ( (LA143_0==COMMA) ) {
							alt143=1;
						}

						switch (alt143) {
						case 1 :
							// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1138:52: COMMA boolean_value_expression
							{
							COMMA510=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8449); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA510_tree = (CommonTree)adaptor.create(COMMA510);
							adaptor.addChild(root_0, COMMA510_tree);
							}

							pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8451);
							boolean_value_expression511=boolean_value_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression511.getTree());

							}
							break;

						default :
							if ( cnt143 >= 1 ) break loop143;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(143, input);
							throw eee;
						}
						cnt143++;
					}

					RIGHT_PAREN512=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8457); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN512_tree = (CommonTree)adaptor.create(RIGHT_PAREN512);
					adaptor.addChild(root_0, RIGHT_PAREN512_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 150, case_abbreviation_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1140:1: case_specification : ( simple_case | searched_case );
	public final DDLParser.case_specification_return case_specification() throws RecognitionException {
		DDLParser.case_specification_return retval = new DDLParser.case_specification_return();
		retval.start = input.LT(1);
		int case_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope simple_case513 =null;
		ParserRuleReturnScope searched_case514 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1141:3: ( simple_case | searched_case )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==CASE) ) {
				int LA145_1 = input.LA(2);
				if ( (LA145_1==COUNT||LA145_1==Character_String_Literal||LA145_1==Identifier||LA145_1==LEFT_PAREN||LA145_1==MINUS||LA145_1==NULL||LA145_1==NUMBER||LA145_1==PLUS||LA145_1==REAL_NUMBER) ) {
					alt145=1;
				}
				else if ( (LA145_1==WHEN) ) {
					alt145=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1141:5: simple_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_case_in_case_specification8469);
					simple_case513=simple_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case513.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1142:5: searched_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_searched_case_in_case_specification8475);
					searched_case514=searched_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_case514.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 151, case_specification_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1144:1: simple_case : CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END ;
	public final DDLParser.simple_case_return simple_case() throws RecognitionException {
		DDLParser.simple_case_return retval = new DDLParser.simple_case_return();
		retval.start = input.LT(1);
		int simple_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE515=null;
		Token END519=null;
		ParserRuleReturnScope numeric_value_expression516 =null;
		ParserRuleReturnScope simple_when_clause517 =null;
		ParserRuleReturnScope else_clause518 =null;

		CommonTree CASE515_tree=null;
		CommonTree END519_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1145:3: ( CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1145:5: CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE515=(Token)match(input,CASE,FOLLOW_CASE_in_simple_case8487); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE515_tree = (CommonTree)adaptor.create(CASE515);
			adaptor.addChild(root_0, CASE515_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_case8489);
			numeric_value_expression516=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression516.getTree());

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1145:35: ( simple_when_clause )+
			int cnt146=0;
			loop146:
			while (true) {
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==WHEN) ) {
					alt146=1;
				}

				switch (alt146) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1145:37: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case8493);
					simple_when_clause517=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause517.getTree());

					}
					break;

				default :
					if ( cnt146 >= 1 ) break loop146;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(146, input);
					throw eee;
				}
				cnt146++;
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1145:59: ( else_clause )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==ELSE) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1145:61: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_simple_case8500);
					else_clause518=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause518.getTree());

					}
					break;

			}

			END519=(Token)match(input,END,FOLLOW_END_in_simple_case8506); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END519_tree = (CommonTree)adaptor.create(END519);
			adaptor.addChild(root_0, END519_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 152, simple_case_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1147:1: searched_case : CASE ^ ( searched_when_clause )+ ( else_clause )? END !;
	public final DDLParser.searched_case_return searched_case() throws RecognitionException {
		DDLParser.searched_case_return retval = new DDLParser.searched_case_return();
		retval.start = input.LT(1);
		int searched_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE520=null;
		Token END523=null;
		ParserRuleReturnScope searched_when_clause521 =null;
		ParserRuleReturnScope else_clause522 =null;

		CommonTree CASE520_tree=null;
		CommonTree END523_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1148:3: ( CASE ^ ( searched_when_clause )+ ( else_clause )? END !)
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1148:5: CASE ^ ( searched_when_clause )+ ( else_clause )? END !
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE520=(Token)match(input,CASE,FOLLOW_CASE_in_searched_case8518); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE520_tree = (CommonTree)adaptor.create(CASE520);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE520_tree, root_0);
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1148:11: ( searched_when_clause )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==WHEN) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1148:12: searched_when_clause
					{
					pushFollow(FOLLOW_searched_when_clause_in_searched_case8522);
					searched_when_clause521=searched_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_when_clause521.getTree());

					}
					break;

				default :
					if ( cnt148 >= 1 ) break loop148;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(148, input);
					throw eee;
				}
				cnt148++;
			}

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1148:35: ( else_clause )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==ELSE) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1148:36: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_searched_case8527);
					else_clause522=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause522.getTree());

					}
					break;

			}

			END523=(Token)match(input,END,FOLLOW_END_in_searched_case8531); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 153, searched_case_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1150:1: simple_when_clause : WHEN numeric_value_expression THEN result ;
	public final DDLParser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		DDLParser.simple_when_clause_return retval = new DDLParser.simple_when_clause_return();
		retval.start = input.LT(1);
		int simple_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN524=null;
		Token THEN526=null;
		ParserRuleReturnScope numeric_value_expression525 =null;
		ParserRuleReturnScope result527 =null;

		CommonTree WHEN524_tree=null;
		CommonTree THEN526_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1150:20: ( WHEN numeric_value_expression THEN result )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1150:22: WHEN numeric_value_expression THEN result
			{
			root_0 = (CommonTree)adaptor.nil();


			WHEN524=(Token)match(input,WHEN,FOLLOW_WHEN_in_simple_when_clause8542); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN524_tree = (CommonTree)adaptor.create(WHEN524);
			adaptor.addChild(root_0, WHEN524_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_when_clause8544);
			numeric_value_expression525=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression525.getTree());

			THEN526=(Token)match(input,THEN,FOLLOW_THEN_in_simple_when_clause8546); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN526_tree = (CommonTree)adaptor.create(THEN526);
			adaptor.addChild(root_0, THEN526_tree);
			}

			pushFollow(FOLLOW_result_in_simple_when_clause8548);
			result527=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result527.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 154, simple_when_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1151:1: searched_when_clause : WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) ;
	public final DDLParser.searched_when_clause_return searched_when_clause() throws RecognitionException {
		DDLParser.searched_when_clause_return retval = new DDLParser.searched_when_clause_return();
		retval.start = input.LT(1);
		int searched_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN528=null;
		Token THEN529=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		CommonTree WHEN528_tree=null;
		CommonTree THEN529_tree=null;
		RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");
		RewriteRuleSubtreeStream stream_search_condition=new RewriteRuleSubtreeStream(adaptor,"rule search_condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1152:3: ( WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1152:5: WHEN c= search_condition THEN r= result
			{
			WHEN528=(Token)match(input,WHEN,FOLLOW_WHEN_in_searched_when_clause8558); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHEN.add(WHEN528);

			pushFollow(FOLLOW_search_condition_in_searched_when_clause8562);
			c=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_search_condition.add(c.getTree());
			THEN529=(Token)match(input,THEN,FOLLOW_THEN_in_searched_when_clause8564); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_THEN.add(THEN529);

			pushFollow(FOLLOW_result_in_searched_when_clause8568);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: r, WHEN, c
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
			// 1152:43: -> ^( WHEN $c $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1152:46: ^( WHEN $c $r)
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
			if ( state.backtracking>0 ) { memoize(input, 155, searched_when_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1154:1: else_clause : ELSE r= result -> ^( ELSE $r) ;
	public final DDLParser.else_clause_return else_clause() throws RecognitionException {
		DDLParser.else_clause_return retval = new DDLParser.else_clause_return();
		retval.start = input.LT(1);
		int else_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ELSE530=null;
		ParserRuleReturnScope r =null;

		CommonTree ELSE530_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1155:3: ( ELSE r= result -> ^( ELSE $r) )
			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1155:5: ELSE r= result
			{
			ELSE530=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_clause8592); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELSE.add(ELSE530);

			pushFollow(FOLLOW_result_in_else_clause8596);
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
			// 1155:19: -> ^( ELSE $r)
			{
				// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1155:22: ^( ELSE $r)
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
			if ( state.backtracking>0 ) { memoize(input, 156, else_clause_StartIndex); }

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
	// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1157:1: result : ( numeric_value_expression | NULL );
	public final DDLParser.result_return result() throws RecognitionException {
		DDLParser.result_return retval = new DDLParser.result_return();
		retval.start = input.LT(1);
		int result_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL532=null;
		ParserRuleReturnScope numeric_value_expression531 =null;

		CommonTree NULL532_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return retval; }

			// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1158:3: ( numeric_value_expression | NULL )
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==COUNT||LA150_0==Character_String_Literal||LA150_0==Identifier||LA150_0==LEFT_PAREN||LA150_0==MINUS||LA150_0==NUMBER||LA150_0==PLUS||LA150_0==REAL_NUMBER) ) {
				alt150=1;
			}
			else if ( (LA150_0==NULL) ) {
				int LA150_2 = input.LA(2);
				if ( (synpred232_DDL()) ) {
					alt150=1;
				}
				else if ( (true) ) {
					alt150=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1158:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_result8617);
					numeric_value_expression531=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression531.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1158:32: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL532=(Token)match(input,NULL,FOLLOW_NULL_in_result8621); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL532_tree = (CommonTree)adaptor.create(NULL532);
					adaptor.addChild(root_0, NULL532_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 157, result_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "result"

	// $ANTLR start synpred122_DDL
	public final void synpred122_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:777:5: ( non_join_query_expression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:777:5: non_join_query_expression
		{
		pushFollow(FOLLOW_non_join_query_expression_in_synpred122_DDL6092);
		non_join_query_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred122_DDL

	// $ANTLR start synpred123_DDL
	public final void synpred123_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:6: ( non_join_query_term )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:781:6: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred123_DDL6111);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred123_DDL

	// $ANTLR start synpred131_DDL
	public final void synpred131_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:785:5: ( non_join_query_term )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:785:5: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred131_DDL6171);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred131_DDL

	// $ANTLR start synpred152_DDL
	public final void synpred152_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:830:22: ( COMMA column_reference )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:830:22: COMMA column_reference
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred152_DDL6524); if (state.failed) return;

		pushFollow(FOLLOW_column_reference_in_synpred152_DDL6526);
		column_reference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred152_DDL

	// $ANTLR start synpred153_DDL
	public final void synpred153_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:833:5: ( Identifier )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:833:5: Identifier
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred153_DDL6544); if (state.failed) return;

		}

	}
	// $ANTLR end synpred153_DDL

	// $ANTLR start synpred154_DDL
	public final void synpred154_DDL_fragment() throws RecognitionException {
		Token l=null;
		Token f=null;
		Token m=null;


		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:839:5: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:839:5: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
		{
		l=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred154_DDL6571); if (state.failed) return;

		match(input,DIVIDE,FOLLOW_DIVIDE_in_synpred154_DDL6573); if (state.failed) return;

		f=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred154_DDL6577); if (state.failed) return;

		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred154_DDL6579); if (state.failed) return;

		m=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred154_DDL6583); if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred154_DDL6585); if (state.failed) return;

		}

	}
	// $ANTLR end synpred154_DDL

	// $ANTLR start synpred155_DDL
	public final void synpred155_DDL_fragment() throws RecognitionException {
		Token l=null;
		Token f=null;


		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:841:5: (l= Identifier DIVIDE f= Identifier )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:841:5: l= Identifier DIVIDE f= Identifier
		{
		l=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred155_DDL6614); if (state.failed) return;

		match(input,DIVIDE,FOLLOW_DIVIDE_in_synpred155_DDL6616); if (state.failed) return;

		f=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred155_DDL6620); if (state.failed) return;

		}

	}
	// $ANTLR end synpred155_DDL

	// $ANTLR start synpred196_DDL
	public final void synpred196_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1025:5: ( predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1025:5: predicate
		{
		pushFollow(FOLLOW_predicate_in_synpred196_DDL7900);
		predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred196_DDL

	// $ANTLR start synpred197_DDL
	public final void synpred197_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1026:5: ( numeric_value_expression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1026:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred197_DDL7906);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred197_DDL

	// $ANTLR start synpred198_DDL
	public final void synpred198_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1027:5: ( LEFT_PAREN boolean_value_expression RIGHT_PAREN )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1027:5: LEFT_PAREN boolean_value_expression RIGHT_PAREN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred198_DDL7912); if (state.failed) return;

		pushFollow(FOLLOW_boolean_value_expression_in_synpred198_DDL7915);
		boolean_value_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred198_DDL7917); if (state.failed) return;

		}

	}
	// $ANTLR end synpred198_DDL

	// $ANTLR start synpred199_DDL
	public final void synpred199_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1036:5: ( comparison_predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1036:5: comparison_predicate
		{
		pushFollow(FOLLOW_comparison_predicate_in_synpred199_DDL7938);
		comparison_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred199_DDL

	// $ANTLR start synpred200_DDL
	public final void synpred200_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1037:5: ( in_predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1037:5: in_predicate
		{
		pushFollow(FOLLOW_in_predicate_in_synpred200_DDL7944);
		in_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred200_DDL

	// $ANTLR start synpred201_DDL
	public final void synpred201_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1038:5: ( like_predicate )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1038:5: like_predicate
		{
		pushFollow(FOLLOW_like_predicate_in_synpred201_DDL7950);
		like_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred201_DDL

	// $ANTLR start synpred232_DDL
	public final void synpred232_DDL_fragment() throws RecognitionException {
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1158:5: ( numeric_value_expression )
		// C:\\Users\\darfores\\git\\asup_0_7_0\\org.smeup.sys.db.syntax.ibmi\\src\\org\\smeup\\sys\\db\\syntax\\ibmi\\parser\\ddl\\DDL.g:1158:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred232_DDL8617);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred232_DDL

	// Delegated rules

	public final boolean synpred131_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred131_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred155_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred155_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred196_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred196_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred198_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred198_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred153_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred153_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred201_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred201_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred123_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred123_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred154_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred154_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred199_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred199_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred197_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred197_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred122_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred152_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred152_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred200_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred232_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred232_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_boolean_type_in_data_type3149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_type_in_data_type3155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbit_type_in_data_type3161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_type_in_data_type3167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbinary_type_in_data_type3173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blob_type_in_data_type3179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INET4_in_data_type3185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_string_type_in_data_type3191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_type_in_data_type3197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_type_in_data_type3203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_type_in_character_string_type3215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varchar_type_in_character_string_type3221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nchar_type_in_character_string_type3227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nvarchar_type_in_character_string_type3233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_character_string_type3239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int1_type_in_numeric_type3251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int2_type_in_numeric_type3257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int4_type_in_numeric_type3263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int8_type_in_numeric_type3269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float4_type_in_numeric_type3275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_type_in_numeric_type3281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float8_type_in_numeric_type3287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_type_in_numeric_type3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_datetime_type3305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_datetime_type3311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timetz_type_in_datetime_type3317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_datetime_type3323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamptz_type_in_datetime_type3329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3356 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_COMMA_in_precision_param3358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_type_length3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_NUMBER_in_type_length3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_type_length3381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_boolean_type3400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_bit_type3416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_bit_type3418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBIT_in_varbit_type3435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_varbit_type3448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VARYING_in_varbit_type3450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT1_in_int1_type3469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TINYINT_in_int1_type3475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT2_in_int2_type3491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALLINT_in_int2_type3497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT4_in_int4_type3513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int4_type3519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_int4_type3529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT8_in_int8_type3545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIGINT_in_int8_type3551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT4_in_float4_type3567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_float4_type3573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_float_type3587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_float_type3589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT8_in_float8_type3608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type3614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type3624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_PRECISION_in_float8_type3626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number_type3642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_precision_param_in_number_type3645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_number_type3661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_precision_param_in_number_type3664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_number_type3682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_precision_param_in_number_type3689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_char_type3713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_char_type3715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_char_type3726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_char_type3728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHAR_in_varchar_type3745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type3747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_varchar_type3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VARYING_in_varchar_type3760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type3762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCHAR_in_nchar_type3779 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type3781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nchar_type3792 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nchar_type3794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NVARCHAR_in_nvarchar_type3813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type3815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nvarchar_type3826 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nvarchar_type3828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VARYING_in_nvarchar_type3830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type3832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMETZ_in_timetz_type3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timetz_type3855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_WITH_in_timetz_type3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_TIME_in_timetz_type3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_ZONE_in_timetz_type3861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMPTZ_in_timestamptz_type3877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_timestamptz_type3883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_WITH_in_timestamptz_type3885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_TIME_in_timestamptz_type3887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_ZONE_in_timestamptz_type3889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_binary_type3905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_binary_type3907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBINARY_in_varbinary_type3920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type3922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_varbinary_type3929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VARYING_in_varbinary_type3931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type3933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOB_in_blob_type3946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTEA_in_blob_type3952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_sql3970 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_sql3972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_statement_in_statement3989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_statement_in_statement3995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transaction_statement_in_statement4001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_control_statement_in_statement4007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connection_statement_in_statement4013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_table_statement_in_schema_statement4038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_view_statement_in_schema_statement4044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_alias_statement_in_schema_statement4050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_alias_statement_in_schema_statement4056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_table_statement_in_schema_statement4062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_view_statement_in_schema_statement4068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rename_table_statement_in_schema_statement4075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_index_statement_in_index_statement4093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_index_statement_in_index_statement4101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rename_index_statement_in_index_statement4111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commit_statement_in_transaction_statement4126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lock_statement_in_transaction_statement4135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_release_statement_in_transaction_statement4141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollback_statement_in_transaction_statement4147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_transaction_statement_in_transaction_statement4154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connect_statement_in_connection_statement4166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disconnect_statement_in_connection_statement4172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_connection_statement_in_connection_statement4178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_procedure_in_control_statement4191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_index_statement4210 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_UNIQUE_in_create_index_statement4215 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_INDEX_in_create_index_statement4219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_index_statement4223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_ON_in_create_index_statement4225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_index_statement4229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_method_specifier_in_create_index_statement4234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_create_index_statement4242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_sort_specifier_list_in_create_index_statement4246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_create_index_statement4248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_param_clause_in_create_index_statement4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_index_statement4305 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_INDEX_in_drop_index_statement4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_index_statement4311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_table_statement4340 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_EXTERNAL_in_create_table_statement4342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_create_table_statement4344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_table_statement4348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_elements_in_create_table_statement4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_USING_in_create_table_statement4354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_create_table_statement4358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_param_clause_in_create_table_statement4366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LOCATION_in_create_table_statement4370 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_create_table_statement4374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_table_statement4436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_create_table_statement4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_table_statement4442 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000008008L});
	public static final BitSet FOLLOW_table_elements_in_create_table_statement4447 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008008L});
	public static final BitSet FOLLOW_USING_in_create_table_statement4452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_create_table_statement4456 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_param_clause_in_create_table_statement4467 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_AS_in_create_table_statement4472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L,0x0000000002000000L});
	public static final BitSet FOLLOW_query_expression_in_create_table_statement4476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_table_elements4537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_field_element_in_table_elements4539 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_table_elements4542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_field_element_in_table_elements4544 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_table_elements4548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_field_element4572 = new BitSet(new long[]{0x68000000C2FC0000L,0xFC80000F00000080L,0x00000C00A0000000L,0x01F4002000000040L,0x00000000000001C0L});
	public static final BitSet FOLLOW_FOR_in_field_element4575 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_COLUMN_in_field_element4577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_field_element4581 = new BitSet(new long[]{0x68000000C2FC0000L,0xFC80000700000080L,0x00000C00A0000000L,0x01F4002000000040L,0x00000000000001C0L});
	public static final BitSet FOLLOW_field_type_in_field_element4585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_not_null_in_field_element4588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_with_default_in_field_element4593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_not_null4643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_NULL_in_not_null4645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_with_default4666 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_DEFAULT_in_with_default4668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_field_type4694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_view_statement4710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VIEW_in_create_view_statement4712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_view_statement4716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001020L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_create_view_statement4721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_alias_statement4769 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_or_replace_in_create_alias_statement4772 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALIAS_in_create_alias_statement4776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_alias_statement4780 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_FOR_in_create_alias_statement4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_create_alias_statement4786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_or_replace4829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_REPLACE_in_or_replace4831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_alias_statement4850 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALIAS_in_drop_alias_statement4852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_alias_statement4856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMIT_in_commit_statement4883 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_WORK_in_commit_statement4887 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_HOLD_in_commit_statement4894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONNECT_in_connect_statement4918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_TO_in_connect_statement4921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_connect_statement4926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_USER_in_connect_statement4929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_connect_statement4933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_USING_in_connect_statement4935 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_connect_statement4939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONNECT_in_connect_statement4984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_RESET_in_connect_statement4986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISCONNECT_in_disconnect_statement5006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISCONNECT_in_disconnect_statement5022 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ALL_in_disconnect_statement5024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISCONNECT_in_disconnect_statement5042 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_CURRENT_in_disconnect_statement5044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table_statement5068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_drop_table_statement5070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_table_statement5074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table_statement5094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_drop_table_statement5096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_table_statement5100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_restrict_in_drop_table_statement5102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table_statement5123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_drop_table_statement5125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_table_statement5129 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_cascade_in_drop_table_statement5131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_view_statement5165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VIEW_in_drop_view_statement5167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_view_statement5171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_view_statement5191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VIEW_in_drop_view_statement5193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_view_statement5197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_restrict_in_drop_view_statement5199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_view_statement5220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VIEW_in_drop_view_statement5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_drop_view_statement5226 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_cascade_in_drop_view_statement5228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESTRICT_in_restrict5265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASCADE_in_cascade5284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCK_in_lock_statement5303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_lock_statement5305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_lock_statement5309 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_IN_in_lock_statement5311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_SHARE_in_lock_statement5313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_MODE_in_lock_statement5315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCK_in_lock_statement5339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_lock_statement5341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_lock_statement5345 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_IN_in_lock_statement5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_EXCLUSIVE_in_lock_statement5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_MODE_in_lock_statement5351 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_allow_read_in_lock_statement5354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLOW_in_allow_read5392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_allow_read5394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RENAME_in_rename_table_statement5413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TABLE_in_rename_table_statement5415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_rename_table_statement5419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_TO_in_rename_table_statement5421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_rename_table_statement5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_FOR_in_rename_table_statement5427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_SYSTEM_in_rename_table_statement5429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_NAME_in_rename_table_statement5431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_rename_table_statement5435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RENAME_in_rename_index_statement5475 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_INDEX_in_rename_index_statement5477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_rename_index_statement5481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_TO_in_rename_index_statement5483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_rename_index_statement5487 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_FOR_in_rename_index_statement5489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_SYSTEM_in_rename_index_statement5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_NAME_in_rename_index_statement5493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_rename_index_statement5497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement5540 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_HOLD_in_rollback_statement5545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_release_statement5575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5597 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ALL_in_release_statement5601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5625 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ALL_in_release_statement5627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SQL_in_release_statement5629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5653 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_CURRENT_in_release_statement5657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_connection_statement5686 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_CONNECTION_in_set_connection_statement5688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_set_connection_statement5692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_transaction_statement5718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement5720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_ISOLATION_in_set_transaction_statement5722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LEVEL_in_set_transaction_statement5724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L,0x0000000010002002L});
	public static final BitSet FOLLOW_isolation_level_in_set_transaction_statement5728 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_set_transaction_statement5731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_read_operation_in_set_transaction_statement5735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERIALIZABLE_in_isolation_level5776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_no_commit_in_isolation_level5782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_uncommitted_in_isolation_level5788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_committed_in_isolation_level5794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatable_read_in_isolation_level5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_no_commit5814 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_COMMIT_in_no_commit5816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_uncommitted5839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_UNCOMMITTED_in_read_uncommitted5841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_committed5860 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COMMITTED_in_read_committed5862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEATABLE_in_repeatable_read5883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_repeatable_read5885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_only_in_read_operation5904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_write_in_read_operation5910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_only5923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_ONLY_in_read_only5925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_write5945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_WRITE_in_read_write5947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_call_procedure5970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_qualified_identifier_in_call_procedure5974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_call_procedure5977 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000080080L});
	public static final BitSet FOLLOW_funcArgs_in_call_procedure5979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_call_procedure5982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_statement6016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_280_in_insert_statement6018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_in_insert_statement6020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_insert_statement6023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_column_reference_list_in_insert_statement6025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_insert_statement6027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_281_in_insert_statement6031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_array_in_insert_statement6033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_expression_body_in_query_expression6080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_query_expression_body6092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_expression_body6098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_non_join_query_expression6111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_expression6115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6117 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000010L,0x0000000000001020L,0x0000000002000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6141 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000010L,0x0000000000001020L,0x0000000002000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_non_join_query_term_in_query_term6171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_term6177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_primary_in_non_join_query_term6191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_term6195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6197 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000010L,0x0000000000001020L,0x0000000002000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6215 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000010L,0x0000000000001020L,0x0000000002000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_non_join_query_primary_in_query_primary6239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_primary6245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_table_in_non_join_query_primary6257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_non_join_query_primary6263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L,0x0000000002000000L});
	public static final BitSet FOLLOW_non_join_query_expression_in_non_join_query_primary6265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_non_join_query_primary6267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_specification_in_simple_table6288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_query_specification6300 = new BitSet(new long[]{0x0100200020000080L,0x0000000000000010L,0x0100024404801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_qualifier_in_query_specification6302 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024404801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_select_list_in_query_specification6305 = new BitSet(new long[]{0x0000000000000002L,0x0001104000000000L,0x0002000000010000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_from_clause_in_query_specification6307 = new BitSet(new long[]{0x0000000000000002L,0x0001100000000000L,0x0002000000010000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_where_clause_in_query_specification6310 = new BitSet(new long[]{0x0000000000000002L,0x0001100000000000L,0x0002000000010000L});
	public static final BitSet FOLLOW_groupby_clause_in_query_specification6313 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L,0x0002000000010000L});
	public static final BitSet FOLLOW_having_clause_in_query_specification6316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000010000L});
	public static final BitSet FOLLOW_orderby_clause_in_query_specification6323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_limit_clause_in_query_specification6326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_select_list6376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_column_in_select_list6390 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_select_list6393 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_derived_column_in_select_list6395 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_set_qualifier6418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_set_qualifier6432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_derived_column6452 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_as_clause_in_derived_column6454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_column_reference6482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_as_clause6506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_column_reference_in_as_clause6510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6521 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_column_reference_list6524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6526 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_Identifier_in_table6544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_identifier_in_table6556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIVIDE_in_qualified_identifier6573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_qualified_identifier6579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_qualified_identifier6585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIVIDE_in_qualified_identifier6616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_qualified_identifier6649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_qualified_identifier6655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_member6692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIVIDE_in_member6694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_member6698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_member6700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_member6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_member6706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause6741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_reference_list_in_from_clause6744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6755 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_table_reference_list6758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6760 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_table_primary_in_table_reference6779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_table_reference6785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_primary_in_joined_table6797 = new BitSet(new long[]{0x0020000000000000L,0x0100008000000000L,0x0000000040000880L,0x8000000000040000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table6800 = new BitSet(new long[]{0x0020000000000002L,0x0100008000000000L,0x0000000040000880L,0x8000000000040000L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table6804 = new BitSet(new long[]{0x0020000000000002L,0x0100008000000000L,0x0000000040000880L,0x8000000000040000L});
	public static final BitSet FOLLOW_natural_join_in_joined_table6808 = new BitSet(new long[]{0x0020000000000002L,0x0100008000000000L,0x0000000040000880L,0x8000000000040000L});
	public static final BitSet FOLLOW_union_join_in_joined_table6812 = new BitSet(new long[]{0x0020000000000002L,0x0100008000000000L,0x0000000040000880L,0x8000000000040000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table_prim6826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table_prim6832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_natural_join_in_joined_table_prim6838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_join_in_joined_table_prim6844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CROSS_in_cross_join6856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_JOIN_in_cross_join6858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_primary_in_cross_join6862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_type_in_qualified_join6888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_JOIN_in_qualified_join6892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_primary_in_qualified_join6896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_join_specification_in_qualified_join6900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATURAL_in_natural_join6928 = new BitSet(new long[]{0x0000000000000000L,0x0100008000000000L,0x0000000000000880L,0x0000000000040000L});
	public static final BitSet FOLLOW_join_type_in_natural_join6933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_JOIN_in_natural_join6937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_primary_in_natural_join6941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union_join6968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_JOIN_in_union_join6970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_table_primary_in_union_join6974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNER_in_join_type6997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type7005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_OUTER_in_join_type7007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type7024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_condition_in_join_specification7069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_named_columns_join_in_join_specification7075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition7087 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_search_condition_in_join_condition7090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_named_columns_join7102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_named_columns_join7104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_column_reference_list_in_named_columns_join7108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_named_columns_join7110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_in_table_primary7131 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_AS_in_table_primary7135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_table_primary7141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause7169 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_search_condition_in_where_clause7172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_routine_invocation7185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7187 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000080080L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7209 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_MULTIPLY_in_routine_invocation7230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7249 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_funcArgs7252 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7254 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause7275 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_BY_in_groupby_clause7277 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000001020L,0x0000000000400000L});
	public static final BitSet FOLLOW_grouping_element_list_in_groupby_clause7281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7302 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_grouping_element_list7305 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000001020L,0x0000000000400000L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7307 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_element7326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollup_list_in_grouping_element7332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cube_list_in_grouping_element7338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_grouping_set_in_grouping_element7344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLUP_in_rollup_list7380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_rollup_list7382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_rollup_list7386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_rollup_list7388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUBE_in_cube_list7409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_cube_list7411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_cube_list7415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_cube_list7417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_empty_grouping_set7438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_empty_grouping_set7440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause7458 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_value_expression_in_having_clause7461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause7475 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_BY_in_orderby_clause7477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_sort_specifier_list_in_orderby_clause7479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7499 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_sort_specifier_list7502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7504 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specifier7529 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000001L,0x0000004000000000L});
	public static final BitSet FOLLOW_order_specification_in_sort_specifier7533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_null_ordering_in_sort_specifier7538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASC_in_order_specification7568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESC_in_order_specification7582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIMIT_in_limit_clause7602 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_limit_clause7606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7627 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_FIRST_in_null_ordering7629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LAST_in_null_ordering7645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_search_condition7667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_param_clause7678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_param_clause7680 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7682 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_param_clause7685 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7687 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_param_clause7691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_param7714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_EQUAL_in_param7716 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_param7720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_method_specifier7744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_method_specifier7748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_OR_in_boolean_value_expression7771 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7787 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AND_in_and_predicate7790 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7793 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_boolean_factor7812 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_test7834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_is_clause_in_boolean_test7836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_is_clause7849 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000400000000L,0x0800000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_is_clause7851 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_truth_value_in_is_clause7856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_boolean_primary7900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_boolean_primary7906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_primary7912 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_value_expression_in_boolean_primary7915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_primary7917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_primary7924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_predicate7938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_predicate7944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_predicate7950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_predicate_in_predicate7956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7980 = new BitSet(new long[]{0x0000000000000000L,0x0000480000080000L,0x0000000800102000L});
	public static final BitSet FOLLOW_comp_op_in_comparison_predicate7984 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_predicate8056 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_NOT_in_in_predicate8059 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_IN_in_in_predicate8062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_in_predicate_value_in_in_predicate8066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value8090 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate_value8093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value8096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list8108 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_COMMA_in_in_value_list8113 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list8115 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate8137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400008000L});
	public static final BitSet FOLLOW_NOT_in_like_predicate8139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate8142 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_like_predicate8146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_null_predicate8177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_IS_in_null_predicate8179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004400000000L});
	public static final BitSet FOLLOW_NOT_in_null_predicate8184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_NULL_in_null_predicate8188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0100000000800000L});
	public static final BitSet FOLLOW_set_in_numeric_value_expression8219 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0100000000800000L});
	public static final BitSet FOLLOW_numeric_primary_in_term8239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000006000000L});
	public static final BitSet FOLLOW_set_in_term8242 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_primary_in_term8251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000006000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_array8264 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0100024000800000L,0x0000000000000080L});
	public static final BitSet FOLLOW_literal_in_array8266 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_array8269 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0100024000800000L,0x0000000000000080L});
	public static final BitSet FOLLOW_literal_in_array8271 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_array8276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_numeric_primary8293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_numeric_primary8298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_numeric_primary8303 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_numeric_primary8306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_numeric_primary8308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routine_invocation_in_numeric_primary8314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_value_expr_in_literal8325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signed_numerical_literal_in_literal8331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal8337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_string_value_expr8349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_signed_numerical_literal8361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_specification_in_case_expression8412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLIF_in_case_abbreviation8424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8426 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8428 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8430 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COALESCE_in_case_abbreviation8441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8443 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8445 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8449 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8451 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_in_case_specification8469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_searched_case_in_case_specification8475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_simple_case8487 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_case8489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case8493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_else_clause_in_simple_case8500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_simple_case8506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_searched_case8518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_searched_when_clause_in_searched_case8522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_else_clause_in_searched_case8527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_searched_case8531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_simple_when_clause8542 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_when_clause8544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_THEN_in_simple_when_clause8546 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_result_in_simple_when_clause8548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_searched_when_clause8558 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_search_condition_in_searched_when_clause8562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_THEN_in_searched_when_clause8564 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_result_in_searched_when_clause8568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_clause8592 = new BitSet(new long[]{0x0100200000000000L,0x0000000000000000L,0x0100024000801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_result_in_else_clause8596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_result8617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_result8621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_synpred122_DDL6092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred123_DDL6111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred131_DDL6171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred152_DDL6524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_column_reference_in_synpred152_DDL6526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred153_DDL6544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred154_DDL6571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIVIDE_in_synpred154_DDL6573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_synpred154_DDL6577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred154_DDL6579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_synpred154_DDL6583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred154_DDL6585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred155_DDL6614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIVIDE_in_synpred155_DDL6616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_synpred155_DDL6620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred196_DDL7900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred197_DDL7906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred198_DDL7912 = new BitSet(new long[]{0x0100200020000000L,0x0000000000000000L,0x0100024400801020L,0x0000000000000080L});
	public static final BitSet FOLLOW_boolean_value_expression_in_synpred198_DDL7915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred198_DDL7917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_synpred199_DDL7938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_synpred200_DDL7944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_synpred201_DDL7950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred232_DDL8617 = new BitSet(new long[]{0x0000000000000002L});
}
