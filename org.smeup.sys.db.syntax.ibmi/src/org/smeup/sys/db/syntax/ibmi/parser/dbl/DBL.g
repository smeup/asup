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
grammar DBL;

options {
	language=Java;
	backtrack=true;
	memoize=true;
	output=AST;
	ASTLabelType=CommonTree;
}


tokens {
  ALIAS_NAME;
  ALL; 
  ALL_SQL;
  ALLOCATE_DESCRIPTOR_STATEMENT;
  ALLOW_READ;    
  AS_EXPRESSION;
  CLOSE_STATEMENT;
  COLUMN;
  COLUMNS_LIST;
  COLUMN_NAME;
  COUNT_VAL;
  COUNT_ROWS;
  //CURRENT
  DB_NAME;
  DEALLOCATE_DESCRIPTOR_STATEMENT;
  DECLARE_CURSOR_STATEMENT;
  DESCRIBE_STATEMENT;
  DESCRIPTOR;
  DESCRIPTOR_SCOPE;
  EMPTY_GROUPING_SET;
  EXECUTE_STATEMENT;
  EXECUTE_IMMEDIATE_STATEMENT;
  FETCH_POSITION;
  FETCH_STATEMENT;	
  FIELD_NAME;
  FIELD_DEF;
  FIELD_TYPE;
  FUNCTION;
  FUNC_ARGS;
  GET_DESCRIPTOR_STATEMENT;
  GROUP_BY;
  HEADER_INFO;
  INDEX_NAME;
  ISOLATION_LEVEL;
  ITEM;
  ITEM_INFO;
  MEMBER;
  MULTIPLE_ROW_FETCH;
  NEW_NAME;
  NO_COMMIT;
  NO_SCROLL;
  NULL_ORDER;
  OPEN_STATEMENT;
  ORDER;
  ORDER_BY;
  OR_REPLACE;
  PARAM;
  PARAMS; 
  PREPARE_STATEMENT;
  PROCEDURE_ARGS;
  PROCEDURE_NAME;
  READ_COMMITTED;
  READ_ONLY;
  READ_WRITE;
  READ_UNCOMMITTED;
  RELEASE_STATEMENT;
  REPEATABLE_READ; 
  ROLLBACK_STATEMENT;  
  RW_OPERATION;
  SEL_LIST;
  SET_DESCRIPTOR_STATEMENT;
  SET_OPTION;
  SET_OPTION_STATEMENT;  
  SET_TRANSACTION_STATEMENT;
  SET_QUALIFIER;
  SERVER_NAME;
  SHOW_TABLE;
  SHOW_FUNCTION;
  SINGLE_FETCH;
  SORT_KEY;
  SORT_SPECIFIERS;
  STATEMENT;
  STORE;
  STORE_TYPE;
  SYSTEM;
  SYSTEM_NAMES;	  
  TABLE_NAME;
  TABLE_DEF;
  TARGET_FIELDS;  
  QUALIFIED;
  FOR_COLUMN;
  NOT_NULL;
  USING_DESCRIPTOR;
  VALUES;
  VARIABLE;
  VIEW_NAME;
  WITH_DEFAULT;
  WITH_HOLD;
  WITH_MAX;
  WITHOUT_HOLD;
}

@header {
package org.smeup.sys.db.syntax.ibmi.parser.dbl;

import org.smeup.sys.db.syntax.DataBaseSyntaxRuntimeException;
}

@lexer::header {
package org.smeup.sys.db.syntax.ibmi.parser.dbl;
import org.smeup.sys.db.syntax.DataBaseSyntaxRuntimeException;
}

@lexer::members {

	@Override
  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    	throw new MismatchedTokenException(ttype, input);
  	}

    @Override    
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String msg = "Lexer error. Input: " + e.input.toString();
        msg += " " + getErrorHeader(e);
        msg += " Msg: " + getErrorMessage(e, tokenNames);
        throw new DataBaseSyntaxRuntimeException(msg , e);
    }	

   @Override
  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
    }

}


@parser::members {

   @Override
  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    	throw new MismatchedTokenException(ttype, input);
  	}

	@Override    
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String msg = "Parser error. Input: " + e.input.toString();
        msg += " " + getErrorHeader(e);
        msg += " Msg: " + getErrorMessage(e, tokenNames);
        throw new DataBaseSyntaxRuntimeException(msg , e);
    }	

   @Override
  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
    }
}


/*
===============================================================================
  Tokens for Case Insensitive Keywords
===============================================================================
*/
fragment A
	:	'A' | 'a';
fragment B
	:	'B' | 'b';
fragment C
	:	'C' | 'c';
fragment D
	:	'D' | 'd';
fragment E
	:	'E' | 'e';
fragment F
	:	'F' | 'f';
fragment G
	:	'G' | 'g';
fragment H
	:	'H' | 'h';
fragment I
	:	'I' | 'i';
fragment J
	:	'J' | 'j';
fragment K
	:	'K' | 'k';
fragment L
	:	'L' | 'l';
fragment M
	:	'M' | 'm';
fragment N
	:	'N' | 'n';
fragment O
	:	'O' | 'o';
fragment P
	:	'P' | 'p';
fragment Q
	:	'Q' | 'q';
fragment R
	:	'R' | 'r';
fragment S
	:	'S' | 's';
fragment T
	:	'T' | 't';
fragment U
	:	'U' | 'u';
fragment V
	:	'V' | 'v';
fragment W
	:	'W' | 'w';
fragment X
	:	'X' | 'x';
fragment Y
	:	'Y' | 'y';
fragment Z
	:	'Z' | 'z';
fragment MULT
	 :	'*' ;
		
/*
===============================================================================
  Reserved Keywords
===============================================================================
*/

AFTER	:	A F T E R;
AS : A S;
ALIAS	:	A L I A S;
ALL : A L L;
ALLOCATE : A L L O C A T E;	 
ALLOW	:	 A L L O W;
ALWBLK 	: A L W B L K;
ALWCPYDTA : A L W C P Y D T A;	
CLOSQLCSR : C L O S Q L C S R;
CNULRQD :	C N U L R Q D;
AND : A N D;
ANY	:	A N Y;
ASC : A S C;
BEFORE 	:	B E F O R E;
BOTH	:	 B O T H;
BY : B Y;
CALL: C A L L;
CASE : C A S E;
CASCADE	:	 C A S C A D E;
CHARACTER : C H A R A C T E R;
CLOSE	:	C L O S E;
COALESCE : C O A L E S C E;
COLUMN 	: C O L U M N;
COUNT : C O U N T;
CREATE : C R E A T E;
COMMIT	:	 C O M M I T;
COMMITTED	:	 C O M M I T T E D;
CONNECT :	 C O N N E C T;
CONNECTION	:	C O N N E C T I O N;
CROSS : C R O S S;
CUBE : C U B E;
CURRENT	:	 C U R R E N T;
CURSOR	:	 C U R S O R;
DATFMT 	:	D A T F M T;
DATSEP  :	D A T S E P;
DBGVIEW	:	D B G V I E W;
DEALLOCATE	:	D E A L L O C A T E;
DEFAULT	: D E F A U L T;	 
DECLARE	:	 D E C L A R E;
DECMPT  :	 D E C M P T;
DFTRDBCOL: 	D F T R D B C O L;
DESC : D E S C;
DESCRIBE : D E S C R I B E;
DESCRIPTOR : D E S C R I P T O R;	
DISTINCT : D I S T I N C T;
DISCONNECT : D I S C O N N E C T;
DLYPRP	: D L Y P R P;	
DROP : D R O P;
DYNAMIC	:	 D Y N A M I C;
DYNDFTCOL: D Y N D F T C O L;
DYNUSRPRF: D Y N U S R P R F;
END : E N D;
ELSE : E L S E;
EVENTF	:	E V E N T F;
EXCEPT : E X C E P T;
EXCLUSIVE:	 E X C L U S I V E;
EXECUTE	:	E X E C U T E;
EXTERNAL : E X T E R N A L;
FALSE : F A L S E;
FETCH	:	 F E T C H;
FIRST : F I R S T;
FOR 	:	 F O R;
FORMAT : F O R M A T;
FULL : F U L L;
FROM : F R O M;
GET 	:	G E T;
GLOBAL	:	G L O B A L;
GROUP : G R O U P;
HAVING : H A V I N G;
HOLD	:	 H O L D;
IN : I N;
INDEX : I N D E X;
INNER : I N N E R;
INSERT : I N S E R T;
INTERSECT : I N T E R S E C T;
INTO : I N T O;
IMMEDIATE : I M M E D I A T E;			
IS : I S;
ISOLATION : I S O L A T I O N;	
JOIN : J O I N;
LABELS	:	 L A B E L S;
LANGID	:	L A N G I D;
LAST : L A S T;
LEFT : L E F T;
LEVEL	:	 L E V E L;
LIKE : L I K E;
LIMIT : L I M I T;
LOCAL 	:	 L O C A L;
LOCATION : L O C A T I O N;
LOCK	:	 L O C K;
MAX	:	M A X;
MODE	:	 M O D E;
NAME	:	 N A M E;
NAMES	:	 N A M E S;
NAMING	:	N A M I N G;
NATIONAL : N A T I O N A L;
NATURAL : N A T U R A L;
NEXT	:	N E X T;
NO: N O;
NOT : N O T;
NULL : N U L L;
NULLIF : N U L L I F;
ON : O N;
ONLY: O N L Y;
OPEN	:	O P E N;
OPTION 	:	 O P T I O N;
OPTLOB	:	O P T L O B;
OR : O R;
ORDER : O R D E R;
OUTER : O U T E R;
OUTPUT	:	O U T P U T;
PRECISION : P R E C I S I O N;
PREPARE	:	P R E P A R E;
PRIOR	:	 P R I O R;
RDBCNNMTH: R D B C N N M T H;	
READ	:	 R E A D;
RELATIVE:	R E L A T I V E;
RELEASE	:	R E L E A S E;
RENAME	:	 R E N A M E;
REPEATABLE : R E P E A T A B L E;
REPLACE	:	 R E P L A C E;
RESET	:	 R E S E T;
RESTRICT:	 R E S T R I C T;
RIGHT : R I G H T;
ROLLBACK:	 R O L L B A C K;
ROLLUP : R O L L U P;
ROWS	:	R O W S;
SET : S E T;
SELECT : S E L E C T;
SCROLL	:	S C R O L L;
SHARE	:	 S H A R E;
SERIALIZABLE 	:	 S E R I A L I Z A B L E;
SYSTEM	:	S Y S T E M;
SQL	:	 S Q L;
SQLCURRULE	:	S Q L C U R R U L E;
SQLPATH	:	 S Q L P A T H;
SRTSEQ	:	S R T S E Q;
TABLE : T A B L E;
TGTRLS	:	T G T R L S;
THEN : T H E N;
TIMFMT	:	T I M F M T;
TIMSEP	:	T I M S E P;
TO	:	 T O;
TRANSACTION :	T R A N S A C T I O N;
TRUE : T R U E;
UNCOMMITTED	:	 U N C O M M I T T E D;
UNION : U N I O N;
UNIQUE : U N I Q U E;
UNKNOWN : U N K N O W N;
USING : U S I N G;
USER	:	U S E R;
USRPRF : U S R P R F;
VALUE	:	V A L U E;
VALUES : V A L U E S;
VARYING : V A R Y I N G;
WHEN : W H E N;
WHERE : W H E R E;
WITH : W I T H;
WITHOUT : W I T H O U T;
WORK	:	 W O R K;
WRITE: W R I T E;
VIEW : V I E W;
ZONE : Z O N E;


/*
Specials for set option
*/
S_ALL	:	 MULT A L L;
S_ALLREAD : MULT A L L R E A D;	
S_BLANK: MULT B L A N K;
S_CHG	:	 MULT C H G;
S_COLON	:	 MULT C O L O N;
S_COMMA	:	 MULT C O M M A;
S_CS: MULT C S;
S_CURLIB:	 MULT C U R L I B;
S_DASH	:	 MULT D A S H;
S_DB2	:	MULT D B '2';
S_DMY	:	 MULT D M Y;
S_DUW	:	 MULT D U W;
S_ENDACTGRP	:	MULT E N D A C T G R P;
S_ENDMOD:	MULT E N D M O D;
S_ENDPGM: MULT E N D P G M;
S_ENDSQL:	 MULT E N D S Q L;
S_ENDJOB: MULT E N D J O B;
S_EUR	:	 MULT E U R;
S_HEX	:	 MULT H E X;
S_HMS	:	 MULT H M S;
S_ISO	:	 MULT I S O;
S_JIS	:	 MULT J I S;
S_JUL	:	 MULT J U L;
S_JOB	:	 MULT J O B;
S_JOBRUN:	MULT J O B R U N;
S_LANGIDSHR	:	MULT L A N G I D S H R;
S_LANGIDUNQ	:	MULT L A N G I D U N Q;
S_LIBL: MULT L I B L;
S_LIST	:	 MULT L I S T;
S_MDY	:	 MULT M D Y;
S_NAMING:	MULT N A M I N G;
S_NO	:	MULT N O;
S_NONE	:	MULT N O N E;
S_OPTIMIZE	:	MULT O P T I M I Z E;
S_OWNER	:	 MULT O W N E R;
S_PERIOD	:	MULT P E R I O D;
S_PRINT	:	 MULT P R I N T;
S_READ: MULT R E A D;
S_RR: MULT R R;
S_RUW: MULT R U W;
S_SLASH	:	MULT S L A S H;
S_SOURCE:	MULT S O U R C E;
S_SQL: MULT S Q L;
S_STD: MULT S T D;
S_STMT	:	 MULT S T M T;
S_SYS	:	 MULT S Y S;
S_SYSVAL:	MULT S Y S V A L;
S_USA	:	 MULT U S A;
S_USER	:	 MULT U S E R;
S_YES	:	MULT Y E S;
S_YMD	:	MULT Y M D;


/*
===============================================================================
  Data Type Tokens
===============================================================================
*/
BOOLEAN : B O O L E A N;
BOOL : B O O L;
BIT : B I T;
VARBIT : V A R B I T;
INT1 : I N T '1';
INT2 : I N T '2';
INT4 : I N T '4';
INT8 : I N T '8';
TINYINT : T I N Y I N T; // alias for INT1
SMALLINT : S M A L L I N T; // alias for INT2
INT : I N T; // alias for INT4
INTEGER : I N T E G E R; // alias - INT4
BIGINT : B I G I N T; // alias for INT8
FLOAT4 : F L O A T '4';
FLOAT8 : F L O A T '8';
REAL : R E A L; // alias for FLOAT4
FLOAT : F L O A T; // alias for FLOAT8
DOUBLE : D O U B L E; // alias for FLOAT8
NUMERIC : N U M E R I C;
DECIMAL : D E C I M A L; // alias for number
DEC 	: D E C;	 
CHAR : C H A R;
VARCHAR : V A R C H A R;
NCHAR : N C H A R;
NVARCHAR : N V A R C H A R;
DATE : D A T E;
TIME : T I M E;
TIMETZ : T I M E T Z;
TIMESTAMP : T I M E S T A M P;
TIMESTAMPTZ : T I M E S T A M P T Z;
TEXT : T E X T;
BINARY : B I N A R Y;
VARBINARY : V A R B I N A R Y;
BLOB : B L O B;
BYTEA : B Y T E A; // alias for BLOB
INET4 : I N E T '4';
/*
===============================================================================
  <data types>
===============================================================================
*/
data_type
  : boolean_type
  | bit_type
  | varbit_type
  | binary_type
  | varbinary_type
  | blob_type
  | INET4
  | character_string_type
  | datetime_type
  | numeric_type
  ;
character_string_type
  : char_type
  | varchar_type
  | nchar_type
  | nvarchar_type
  | TEXT
  ;
numeric_type
  : int1_type
  | int2_type
  | int4_type
  | int8_type
  | float4_type
  | float_type
  | float8_type
  | number_type
  ;
datetime_type
  : DATE
  | TIME
  | timetz_type
  | TIMESTAMP
  | timestamptz_type
  ;
precision_param
  : LEFT_PAREN! NUMBER RIGHT_PAREN!
  | LEFT_PAREN! NUMBER COMMA! NUMBER RIGHT_PAREN!
  ;
type_length
  : LEFT_PAREN! NUMBER RIGHT_PAREN!
  ;
boolean_type
  : BOOLEAN
  | BOOL -> BOOLEAN
  ;
bit_type
  : BIT type_length? -> BIT
  ;
varbit_type
  : VARBIT type_length? -> VARBIT
  | BIT VARYING type_length? -> VARBIT
  ;
int1_type
  : INT1
  | TINYINT -> INT1
  ;
int2_type
  : INT2
  | SMALLINT -> INT2
  ;
int4_type
  : INT4
  | INT -> INT4
  | INTEGER -> INT4
  ;
int8_type
  : INT8
  | BIGINT -> INT8
  ;
float4_type
  : FLOAT4
  | REAL -> FLOAT4
  ;
float_type : FLOAT type_length? -> ^(FLOAT type_length?);
float8_type
  : FLOAT8
  | DOUBLE -> FLOAT8
  | DOUBLE PRECISION -> FLOAT8
  ;
number_type
  : NUMERIC (precision_param)? -> ^(NUMERIC precision_param)
  | DECIMAL (precision_param)? -> ^(NUMERIC precision_param)  
  | DEC     (precision_param)? -> ^(NUMERIC precision_param)  
  ;
char_type
  : CHAR type_length? -> CHAR
  | CHARACTER type_length? -> CHAR
  ;
varchar_type
  : VARCHAR type_length? -> VARCHAR
  | CHARACTER VARYING type_length? -> VARCHAR
  ;
nchar_type
  : NCHAR type_length? -> NCHAR
  | NATIONAL CHARACTER type_length? -> NCHAR
  ;
nvarchar_type
  : NVARCHAR type_length? -> NVARCHAR
  | NATIONAL CHARACTER VARYING type_length? -> NVARCHAR
  ;
timetz_type
  : TIMETZ
  | TIME WITH TIME ZONE -> TIMETZ
  ;
timestamptz_type
  : TIMESTAMPTZ
  | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ
  ;
binary_type
  : BINARY type_length?
  ;
varbinary_type
  : VARBINARY type_length?
  | BINARY VARYING type_length?
  ;
blob_type
  : BLOB
  | BYTEA -> BLOB
  ;

/*
===============================================================================
  SQL statement (Start Symbol)
===============================================================================
*/

sql
  : statement EOF
  ;
  
statement
  : 
  set_transaction_statement
  |
  execute_statement
  |
  execute_immediate_statement
  |
  open_statement
  |
  prepare_statement
  |
  declare_cursor_statement
  |
  describe_statement
  |
  fetch_statement
  |
  open_statement
  |
  close_statement
  |
  set_option_statement
  |
  allocate_descriptor
  |
  deallocate_descriptor
  |
  get_descriptor
  |
  set_descriptor
  
  ;  
  
  /* SET OPTIONS */
  set_option_statement
  	:
  	SET OPTION (options_assign) (',' options_assign)* -> ^(SET_OPTION_STATEMENT options_assign (options_assign)*)
  	;  
  
options_assign
  	:	
  	o=ALWBLK EQUAL v=(S_READ|S_NONE|S_ALLREAD)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=ALWCPYDTA EQUAL v=(S_YES|S_NO|S_OPTIMIZE)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=CLOSQLCSR EQUAL v=(S_ENDACTGRP|S_ENDMOD|S_ENDPGM|S_ENDSQL|S_ENDJOB)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=CNULRQD EQUAL v=(S_YES|S_NO)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=COMMIT EQUAL v=(S_CHG|S_NONE|S_CS|S_ALL|S_RR)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DATFMT EQUAL v=(S_JOB|S_ISO|S_EUR|S_USA|S_JIS|S_MDY|S_YMD|S_JUL)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DATSEP EQUAL v=(S_JOB|S_SLASH|'/'|S_PERIOD|'.'|S_COMMA|','|S_DASH|S_BLANK)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DECMPT EQUAL v=(S_PERIOD|S_COMMA|S_SYSVAL|S_JOB)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DBGVIEW EQUAL v=(S_NONE|S_SOURCE|S_STMT|S_LIST)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DFTRDBCOL EQUAL v=(S_NONE|Variable)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DLYPRP EQUAL v=(S_YES|S_NO)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DYNDFTCOL EQUAL v=(S_YES|S_NO)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=DYNUSRPRF EQUAL v=(S_OWNER|S_USER)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=EVENTF EQUAL v=(S_YES|S_NO)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=LANGID EQUAL v=(S_JOB|S_JOBRUN|Variable)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=NAMING EQUAL v=(S_SYS|S_SQL)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=OPTLOB EQUAL v=(S_YES|S_NO)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=OUTPUT EQUAL v=(S_NONE|S_PRINT)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=RDBCNNMTH EQUAL v=(S_DUW|S_RUW)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=SQLCURRULE EQUAL v=(S_DB2|S_STD)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=SQLPATH EQUAL v=(S_LIBL|Variable)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=CNULRQD EQUAL v=(S_YES|S_NO)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=SRTSEQ EQUAL v=(S_JOB|S_HEX|S_JOBRUN|S_LANGIDUNQ|S_LANGIDSHR|S_CURLIB|(S_LIBL)* Variable)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=TGTRLS EQUAL v=(Variable)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=TIMFMT EQUAL v=(S_HMS|S_ISO|S_EUR|S_USA|S_JIS)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=TIMSEP EQUAL v=(S_JOB|S_COLON|':'|S_PERIOD|'.'|S_COMMA|','|S_BLANK)-> ^(SET_OPTION[$o.text] $v)
  	|
  	o=USRPRF EQUAL v=(S_OWNER|S_USER|S_NAMING)-> ^(SET_OPTION[$o.text] $v)
  	
  	;	
  
 /* SET TRANSACTION */ 
 set_transaction_statement
	:
	SET TRANSACTION ISOLATION LEVEL i=isolation_level (COMMA r=read_operation)? ->
	
	^(SET_TRANSACTION_STATEMENT ^(ISOLATION_LEVEL $i) (^(RW_OPERATION $r))?) 
	;
 
isolation_level
	:
	SERIALIZABLE
	|
	no_commit
	|
	read_uncommitted
	|
	read_committed
	|
	repeatable_read	
	;	

no_commit
	:
	NO COMMIT -> ^(NO_COMMIT)	
	;				

read_uncommitted
	:
	READ UNCOMMITTED	-> ^(READ_UNCOMMITTED)
	;	

read_committed
	:
	READ COMMITTED	-> ^(READ_COMMITTED)
	;		

repeatable_read
	:	
	REPEATABLE READ -> ^(REPEATABLE_READ)
	;

read_operation
	:	
	read_only
	|
	read_write
	;	

read_only
	:
	READ ONLY -> ^(READ_ONLY)	
	;	

read_write
	:
	READ WRITE -> ^(READ_WRITE)	
	;	
 
 /* EXECUTE STATEMENT*/
 
 
 execute_statement
 	:
 	EXECUTE s=Identifier -> ^(EXECUTE_STATEMENT ^(STATEMENT $s))						    
	;	
	
execute_immediate_statement
 	:
 	EXECUTE IMMEDIATE v=Variable -> ^(EXECUTE_IMMEDIATE_STATEMENT ^(VARIABLE $v))
	;	

/* OPEN STATEMENT */ 
 
 open_statement
 	:
 	
 	/*
 	OPEN c=Identifier ((USING v1=Variable )|(USING DESCRIPTOR (v2=Variable|d=Identifier)))? 	-> {$v1 != null}? ^(OPEN_STATEMENT ^(CURSOR $c) ^(USING ^(VARIABLE $v1)))
 												-> {$v2 != null}? ^(OPEN_STATEMENT ^(CURSOR $c) ^(USING_DESCRIPTOR ^(VARIABLE $v2)))
 												-> {$d != null}? ^(OPEN_STATEMENT ^(CURSOR $c)  ^(USING_DESCRIPTOR ^(DESCRIPTOR $d)))
 												-> ^(OPEN_STATEMENT ^(CURSOR $c))
 	*/
 		
 	open_using
 	|
 	open_using_descriptor
 	;
 
 /* Caso OPEN DYN_CURSOR USING :HV_INT, :HV_VCHAR64*/
 open_using	
 	:
 	OPEN c=Identifier USING using_variable (COMMA using_variable)* -> ^(OPEN_STATEMENT ^(CURSOR $c) ^(USING using_variable (using_variable)*))
 	;

using_variable
	:
	Variable -> ^(VARIABLE Variable)
	;
 /*
 Casi	:	
 OPEN DYN_CURSOR USING DESCRIPTOR :SQLDA
 OPEN DYN_CURSOR USING DESCRIPTOR DESC
 OPEN SYN_CURSOR
 */
 open_using_descriptor
 	:
 	OPEN c=Identifier (USING DESCRIPTOR (v2=Variable|d=Descriptor_Name))? -> {$v2 != null}? ^(OPEN_STATEMENT ^(CURSOR $c) ^(USING_DESCRIPTOR ^(VARIABLE $v2))) 
 								      -> {$d != null}? 	^(OPEN_STATEMENT ^(CURSOR $c) ^(USING_DESCRIPTOR ^(DESCRIPTOR $d)))	
 								      -> ^(OPEN_STATEMENT ^(CURSOR $c))			
 	;	

/* PREPARE STATEMENT */ 	
 prepare_statement
 	:	
 	PREPARE s=Identifier (into_clause)? FROM v=Variable -> ^(PREPARE_STATEMENT ^(STATEMENT $s) (into_clause)? ^(FROM ^(VARIABLE $v)))
 	;
 
 /* DECLARE CURSOR STATEMENT */	
 declare_cursor_statement
 	:
 	DECLARE c=Identifier (d=DYNAMIC)? (sc=scroll)? CURSOR (h=hold)? FOR s=Identifier 
 	-> ^(DECLARE_CURSOR_STATEMENT ^(CURSOR $c) ($d)? ($sc)? ($h)? ^(FOR ^(STATEMENT $s))) 	
 	;

scroll
	:
	SCROLL -> ^(SCROLL)
	|
	NO SCROLL -> ^(NO_SCROLL)	
	; 

hold
	:
	WITH HOLD -> ^(WITH_HOLD)	
	|
	WITHOUT HOLD -> ^(WITHOUT_HOLD)	
	;
 	
/* DESCRIBE STATEMENT */
 describe_statement
 	:	
 	DESCRIBE s=Identifier into_clause -> ^(DESCRIBE_STATEMENT ^(STATEMENT $s) into_clause)
 	|
 	DESCRIBE s=Identifier using_clause -> ^(DESCRIBE_STATEMENT ^(STATEMENT $s) using_clause)
 	;
 	
 using_clause
 	:
 	USING (SQL)* DESCRIPTOR (s=descriptor_scope)* d= Descriptor_Name -> ^(USING ^(DESCRIPTOR $d) $s*)
 	;	
 	
/* FETCH STATEMENT*/ 
 fetch_statement
 	:
 	FETCH (fetch_position)? (FROM)? c=Identifier (fetch_into)? -> ^(FETCH_STATEMENT (fetch_position)? ^(CURSOR $c) (fetch_into)?)
 	;	
 
 fetch_position
 	:	p= (NEXT|PRIOR|FIRST|LAST|BEFORE|AFTER|CURRENT) -> ^(FETCH_POSITION $p)
 		|
 		RELATIVE (v=Variable|i=NUMBER) -> {$v != null}?^(FETCH_POSITION ^(RELATIVE ^(VARIABLE $v)))
 					       -> 	       ^(FETCH_POSITION ^(RELATIVE NUMBER))
 	;
 	
 fetch_into
 	:
 	single_fetch
 	|
 	multiple_row_fetch	
 	;	
 
 single_fetch
 	:
 	INTO into_variable  (',' into_variable)* -> ^(SINGLE_FETCH ^(INTO into_variable (into_variable)*))
 	|
 	INTO into_descriptor -> ^(SINGLE_FETCH ^(INTO into_descriptor))
 	;
 	
 into_variable
 	:
 	v=Variable -> ^(VARIABLE $v)
 	;	

 into_descriptor
 	:
 	SQL DESCRIPTOR v=Variable -> ^(DESCRIPTOR ^(VARIABLE $v)) 	
 	|
 	SQL DESCRIPTOR d=Descriptor_Name -> ^(DESCRIPTOR $d) 	
 	;	 	

 	
 multiple_row_fetch
 	:	
 	FOR (v=Variable|NUMBER) ROWS (mi=multiple_row)? INTO ds=Variable	-> {$v != null}?^(MULTIPLE_ROW_FETCH ^(FOR ^(VARIABLE $v)) ($mi)? ^(INTO ^(VARIABLE $ds)))
 										->		^(MULTIPLE_ROW_FETCH ^(FOR NUMBER) ($mi)? ^(INTO ^(VARIABLE $ds))) 	
 	;		
 	
 multiple_row
 	:
 	USING DESCRIPTOR v=Variable ->^(DESCRIPTOR ^(VARIABLE $v)) 	
 	|
 	USING DESCRIPTOR d=Descriptor_Name ->^(DESCRIPTOR $d) 	
 	;	
 	
 /*CLOSE STATEMENT*/
 close_statement
 	:
 	CLOSE c=Identifier -> ^(CLOSE_STATEMENT ^(CURSOR $c))	
 	;	 			
 
 
 /* SUB ITEMS*/
 into_clause
 	:
 	INTO (d=Identifier|v=Variable) (USING t=using_target)? 	-> {$d!=null}?	^(INTO ^(DESCRIPTOR $d) ^(USING $t)?) 	
								-> 		^(INTO ^(VARIABLE $v) ^(USING $t)?) 	
	;
 
 using_target
	:	
	NAMES|LABELS|ANY|BOTH|ALL|system_names
	;
	
system_names
	:
	SYSTEM NAMES -> ^(SYSTEM_NAMES)
	;	
	



table_elements
  : LEFT_PAREN field_element (COMMA field_element)* RIGHT_PAREN
    -> field_element+
  ;
  
field_element
  : Identifier (FOR COLUMN c=Identifier)? field_type (not_null)? (with_default)?-> ^(FIELD_DEF ^(FIELD_NAME Identifier) ^(FOR_COLUMN $c)? ^(FIELD_TYPE field_type) (not_null)? (with_default)?)
  ;
  
not_null:
	NOT NULL -> ^(NOT_NULL)	
  ;  
 
with_default:
	WITH DEFAULT -> ^(WITH_DEFAULT)	
  ;    
  
field_type
  : data_type
  ;

/* ALLOCATE DESCRIPTOR STATEMENT */

allocate_descriptor
	:
	ALLOCATE (SQL)* DESCRIPTOR (s=descriptor_scope)* d= Descriptor_Name (l=descriptor_limits)* -> ^(ALLOCATE_DESCRIPTOR_STATEMENT ^(DESCRIPTOR $d) $s* $l*)
	;

descriptor_scope
	:
	l=LOCAL -> ^(DESCRIPTOR_SCOPE $l)
	|
	g=GLOBAL -> ^(DESCRIPTOR_SCOPE $g)
	;

descriptor_limits
	:
	WITH MAX i=NUMBER -> ^(WITH_MAX $i)
	|
	WITH MAX v= Variable -> ^(WITH_MAX ^(VARIABLE $v))
	;	

/* DEALLOCATE DESCRIPTOR STATEMENT */

deallocate_descriptor
	:
	DEALLOCATE (SQL)* DESCRIPTOR (s=descriptor_scope)* d= Descriptor_Name -> ^(DEALLOCATE_DESCRIPTOR_STATEMENT ^(DESCRIPTOR $d) $s* )
	;	

/* GET DESCRIPTOR STATEMENT */

get_descriptor
	:
	GET (SQL)* DESCRIPTOR (s=descriptor_scope)* d= Descriptor_Name header_info -> ^(GET_DESCRIPTOR_STATEMENT ^(DESCRIPTOR $d) $s* header_info)
	;	
	
header_info
	:
	variable_assign (',' variable_assign)*-> ^(HEADER_INFO variable_assign variable_assign*)
	;	

variable_assign
	:
	v=Variable EQUAL variable_value -> ^(VALUES ^(VARIABLE $v) variable_value) 
	;	

variable_value

	:
	c = COUNT -> ^(VALUE $c)
	|
	i = Identifier -> ^(VALUE $i)
	;	
	
/* SET DESCRIPTOR STATEMENT */

set_descriptor
	:
	SET (SQL)* DESCRIPTOR (s=descriptor_scope)* d= Descriptor_Name value_settings -> ^(SET_DESCRIPTOR_STATEMENT ^(DESCRIPTOR $d) $s* value_settings)
	;		

value_settings
	:
	VALUE i=NUMBER ii = value_item_info -> ^(ITEM_INFO $i $ii)
	|
	VALUE v=Variable ii = value_item_info -> ^(ITEM_INFO ^(VARIABLE $v) $ii) 
	;

value_item_info
	:
	item_info_assign  (',' item_info_assign)* -> ^(VALUES item_info_assign item_info_assign*)
	;	

item_info_assign
	:
	i = Identifier EQUAL v = Variable -> ^(VALUE ^(ITEM $i) ^(VALUE ^(VARIABLE $v))) 
	;	
	

/*
===============================================================================
  <query_expression>
===============================================================================
*/
 

query_expression
  : query_expression_body
  ;
query_expression_body
  : non_join_query_expression
  | joined_table
  ;
non_join_query_expression
  : (non_join_query_term | joined_table (UNION | EXCEPT)^ (ALL|DISTINCT)? query_term)
    ((UNION | EXCEPT)^ (ALL|DISTINCT)? query_term)*
  ;
query_term
  : non_join_query_term
  | joined_table
  ;
non_join_query_term
  : ( non_join_query_primary | joined_table INTERSECT^ (ALL|DISTINCT)? query_primary)
    (INTERSECT^ (ALL|DISTINCT)? query_primary)*
  ;
query_primary
  : non_join_query_primary
  | joined_table
  ;
non_join_query_primary
  : simple_table
  | LEFT_PAREN non_join_query_expression RIGHT_PAREN
  ;
simple_table
  options {k=1;}
  : query_specification
  ;
query_specification
  : SELECT set_qualifier? select_list from_clause? where_clause? groupby_clause? having_clause?
    orderby_clause? limit_clause?
    -> ^(SELECT from_clause? set_qualifier? select_list where_clause? groupby_clause?
    having_clause? orderby_clause? limit_clause?)
  ;
select_list
  : MULTIPLY -> ^(SEL_LIST ALL)
  | derived_column (COMMA derived_column)* -> ^(SEL_LIST derived_column+)
  ;
set_qualifier
  : DISTINCT -> ^(SET_QUALIFIER DISTINCT)
  | ALL -> ^(SET_QUALIFIER ALL)
  ;
derived_column
  : boolean_value_expression as_clause? -> ^(COLUMN boolean_value_expression as_clause?)
  ;
  
column_reference
	:	b=Identifier -> ^(COLUMN_NAME $b )
	
	;
as_clause
  : (AS)? column_reference
  ;
column_reference_list
	:	column_reference (COMMA column_reference)* -> column_reference+
	;
table
  : Identifier
    |
    qualified_identifier
  ;

qualified_identifier
  : l=Identifier DIVIDE f=Identifier (LEFT_PAREN m=Identifier RIGHT_PAREN)? -> ^(QUALIFIED $l $f $m?) 
  ;	
 
member	:
	l=Identifier DIVIDE f=Identifier LEFT_PAREN m=Identifier RIGHT_PAREN -> ^(MEMBER $l $f $m)	
	;  	  
  
from_clause
  : FROM^ table_reference_list
  ;
table_reference_list
  :table_reference (COMMA table_reference)* -> table_reference+
  ;
table_reference
  : table_primary
  | joined_table
  ;
joined_table
  : table_primary (cross_join | qualified_join | natural_join | union_join)+
  ;
joined_table_prim
  : cross_join
  | qualified_join
  | natural_join
  | union_join
  ;
cross_join
  : CROSS JOIN r=table_primary -> ^(JOIN CROSS $r)
  ;
qualified_join
  : (t=join_type)? JOIN r=table_primary s=join_specification -> ^(JOIN $t? $r $s)
  ;
natural_join
  : NATURAL (t=join_type)? JOIN r=table_primary -> ^(JOIN NATURAL $t? $r)
  ;
union_join
  : UNION JOIN r=table_primary -> ^(JOIN UNION $r)
  ;
join_type
  : INNER
  | t=outer_join_type OUTER -> ^(OUTER $t)
  | t=outer_join_type -> ^(OUTER $t)
  ;
outer_join_type
  : LEFT
  | RIGHT
  | FULL
  ;
join_specification
  : join_condition
  | named_columns_join
  ;
join_condition
  : ON^ search_condition
  ;
named_columns_join
  : USING LEFT_PAREN f=column_reference_list RIGHT_PAREN -> ^(USING $f)
  ;
table_primary
  : table ((AS)? a=Identifier)? -> ^(TABLE table ($a)?)
  ;
where_clause
  : WHERE^ search_condition
  ;
/*
===============================================================================
  <routine invocation>
  Invoke an SQL-invoked routine.
===============================================================================
*/
routine_invocation
	: Identifier LEFT_PAREN funcArgs? RIGHT_PAREN -> ^(FUNCTION[$Identifier.text] funcArgs?)
	| COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^(COUNT_VAL funcArgs)
	| COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^(COUNT_ROWS)
	;
funcArgs
  : boolean_value_expression (COMMA boolean_value_expression)* -> boolean_value_expression+
  ;
/*
===============================================================================
  <groupby clause>
===============================================================================
*/
groupby_clause
  : GROUP BY g=grouping_element_list -> ^(GROUP_BY $g)
  ;
grouping_element_list
  : grouping_element (COMMA grouping_element)* -> grouping_element+
  ;
grouping_element
  : ordinary_grouping_set
  | rollup_list
  | cube_list
  | empty_grouping_set
  ;
ordinary_grouping_set
  : column_reference_list
  | LEFT_PAREN! column_reference_list RIGHT_PAREN!
  ;
rollup_list
  : ROLLUP LEFT_PAREN c=ordinary_grouping_set RIGHT_PAREN -> ^(ROLLUP $c)
  ;
cube_list
  : CUBE LEFT_PAREN c=ordinary_grouping_set RIGHT_PAREN -> ^(CUBE $c)
  ;
empty_grouping_set
  : LEFT_PAREN RIGHT_PAREN -> ^(EMPTY_GROUPING_SET)
  ;
having_clause
  : HAVING^ boolean_value_expression
  ;
/*
===============================================================================
  <orderby clause>
  Specify a comparison of two row values.
===============================================================================
*/
orderby_clause
  : ORDER BY sort_specifier_list -> ^(ORDER_BY sort_specifier_list)
  ;
sort_specifier_list
  : sort_specifier (COMMA sort_specifier)* -> ^(SORT_SPECIFIERS sort_specifier+)
  ;
sort_specifier
  : fn=column_reference a=order_specification? o=null_ordering? -> ^(SORT_KEY $fn $a? $o?)
  ;
order_specification
  : ASC -> ^(ORDER ASC)
  | DESC -> ^(ORDER DESC)
  ;
limit_clause
  : LIMIT e=numeric_value_expression -> ^(LIMIT $e)
  ;
null_ordering
  : NULL FIRST -> ^(NULL_ORDER FIRST)
  | NULL LAST -> ^(NULL_ORDER LAST)
  ;
/*
===============================================================================
  <set stmt>
  Specify a comparison of two row values.
===============================================================================
*/

search_condition
	:	boolean_value_expression
	;
param_clause
  : WITH LEFT_PAREN param (COMMA param)* RIGHT_PAREN -> ^(PARAMS param+)
  ;
param
  : k=Character_String_Literal EQUAL v=numeric_value_expression -> ^(PARAM $k $v)
  ;
method_specifier
  : USING m=Identifier -> ^(USING[$m.text])
  ;
/*
===============================================================================
  <boolean value expression>
===============================================================================
*/
boolean_value_expression
	:	and_predicate (OR^ and_predicate)*
	;
and_predicate
  :	boolean_factor (AND^ boolean_factor)*
	;
boolean_factor
  : boolean_test
  | NOT boolean_test -> ^(NOT boolean_test)
  ;
boolean_test
  : boolean_primary is_clause?
  ;
is_clause
  : IS NOT? t=truth_value -> ^(IS NOT? $t)
  ;
truth_value
  : TRUE | FALSE | UNKNOWN
  ;
boolean_primary
  : predicate
  | numeric_value_expression
  | LEFT_PAREN! boolean_value_expression RIGHT_PAREN!
  | case_expression
  ;
/*
===============================================================================
  <predicate>
===============================================================================
*/
predicate
  : comparison_predicate
  | in_predicate
  | like_predicate
  | null_predicate
  ;
/*
===============================================================================
  <comparison_predicate>
  Specify a comparison of two row values.
===============================================================================
*/
comparison_predicate
  options{k=1;}
	:	l=numeric_value_expression c=comp_op r=numeric_value_expression -> ^($c $l $r)
	;
comp_op
  : EQUAL
  | NOT_EQUAL
  | LTH
  | LEQ
  | GTH
  | GEQ
  ;
/*
===============================================================================
  <in_predicate>
  Specify a quantified comparison.
===============================================================================
*/
in_predicate : v=numeric_value_expression  NOT? IN a=in_predicate_value -> ^(IN $v $a NOT?);
in_predicate_value
  : LEFT_PAREN! in_value_list  RIGHT_PAREN!
	;
in_value_list
  : numeric_value_expression  ( COMMA numeric_value_expression  )* -> numeric_value_expression+;
/*
===============================================================================
  <like_predicate>
  Specify a pattern-match comparison.
===============================================================================
*/
like_predicate
  : f=column_reference NOT? LIKE s=Character_String_Literal -> ^(LIKE NOT? $f $s)
  ;
/*
===============================================================================
  <null_predicate>
  Specify a test for a null value.
===============================================================================
*/
null_predicate
  : f=numeric_value_expression IS (n=NOT)? NULL -> ^(IS $f NULL $n?)
  ;
/*
===============================================================================
  <numeric_value_expression>
  Specify a comparison of two row values.
===============================================================================
*/
numeric_value_expression
	:	term ((PLUS|MINUS)^ term)*
	;
term
  :	numeric_primary ((MULTIPLY|DIVIDE|MODULAR)^ numeric_primary)*
	;
array
  : LEFT_PAREN literal (COMMA literal )* RIGHT_PAREN -> literal+
  ;
numeric_primary
  :	literal
	| column_reference
	|	LEFT_PAREN! numeric_value_expression RIGHT_PAREN!
	| routine_invocation
	;
literal
  : string_value_expr
  | signed_numerical_literal
  | NULL
  ;
string_value_expr
  : Character_String_Literal
  ;
signed_numerical_literal
  : sign? unsigned_numerical_literal
  ;
unsigned_numerical_literal
  : NUMBER
  | REAL_NUMBER
  ;
sign
  : PLUS | MINUS
  ;
/*
===============================================================================
  case_expression
===============================================================================
*/
case_expression
  : case_specification
  ;
case_abbreviation
  : NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression  RIGHT_PAREN
  | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression  )+ RIGHT_PAREN
  ;
case_specification
  : simple_case
  | searched_case
  ;
simple_case
  : CASE numeric_value_expression ( simple_when_clause )+ ( else_clause  )? END
  ;
searched_case
  : CASE^ (searched_when_clause)+ (else_clause)? END!
  ;
simple_when_clause : WHEN numeric_value_expression THEN result ;
searched_when_clause
  : WHEN c=search_condition THEN r=result -> ^(WHEN $c $r)
  ;
else_clause
  : ELSE r=result -> ^(ELSE $r)
  ;
result
  : numeric_value_expression | NULL
  ;
// Operators
ASSIGN  : ':=';
EQUAL  : '=';
SEMI_COLON :  ';';
COMMA : ',';
NOT_EQUAL  : '<>' | '!=' | '~='| '^=' ;
LTH : '<' ;
LEQ : '<=';
GTH   : '>';
GEQ   : '>=';
LEFT_PAREN :  '(';  
RIGHT_PAREN : ')';
PLUS  : '+';
MINUS : '-';
MULTIPLY: '*';
DIVIDE  : '/';
MODULAR : '%';
DOT : '.';
NUMBER : Digit+;
fragment
Digit : '0'..'9';
REAL_NUMBER
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

Descriptor_Name
	: '\'' Identifier '\''
	;

/*
===============================================================================
 Identifiers
===============================================================================
*/
Identifier
  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|Digit|CHAR_SPECIAL)*
  ;
/*

/*
===============================================================================
 Variable
===============================================================================
*/
Variable
  : ':'('a'..'z'|'A'..'Z'|Digit|'_'|CHAR_SPECIAL)+ { setText(getText().substring(1)); }
  ;

/*
===============================================================================
 Literal
===============================================================================
*/
// Some Unicode Character Ranges
fragment
Control_Characters                  :   '\u0001' .. '\u001F';
fragment
Extended_Control_Characters         :   '\u0080' .. '\u009F';
Character_String_Literal
    : Quote ( ESC_SEQ | ~('\\'|Quote) )* Quote
      { setText(getText().substring(1, getText().length()-1)); }
    | Double_Quote ( ESC_SEQ | ~('\\'|Double_Quote) )* Double_Quote
      { setText(getText().substring(1, getText().length()-1)); }
    ;
Quote
  : '\'';
Double_Quote
  : '"';
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;
fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;
fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment
CHAR_SPECIAL
  :
  (
    '\u00A7'  //Â§
    | '$'
    | '_'
    | '.'    
    | '^'
    | '\u00e0' //Ã 
    | '\u00e8' //Ã¨
    | '\u00e9' //Ã©
    | '\u00ec' //Ã¬
    | '\u00f2' //Ã²
    | '\u00f9' //Ã¹
    | '"'
    | '?'      
    | '\u00a3' //Â£	
    | '&'
    | '*'    
    | '/'
    | '='
    | '>'
    | '<'	
    | '+'
    | '-' 	
    | '!'
    | '\\'
    | '%'
  )
  ;    
    
/*
===============================================================================
 Whitespace Tokens
===============================================================================
*/
Space : ' '
{
	$channel = HIDDEN;
};
White_Space :	( Control_Characters  | Extended_Control_Characters )+
{
	$channel = HIDDEN;
};
BAD : . {
  skip();
} ;
