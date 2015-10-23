grammar RPGExpr;

options
{
	output=AST;
	ASTLabelType=CommonTree;
	backtrack=true;
	language=Java;
}

tokens
{	
	SIGN_MINUS;
	SIGN_PLUS;
	BI_FUNCTION;
	USER_FUNCTION;
	SP_VALUE;
	//OR
	//AND
	//EQ
	//NE
	//LT
	//LTEQ
	//GT
	//GTEQ
	//PLUS
	//MINUS
	//MULT
	//DIV
	//MOD
	POW;
	//NOT
	QUALIFIED;
	BLOCK;
	INDICATOR;	
}

@parser::header {
  package org.smeup.sys.il.expr.ibmi.rpg;
}

@lexer::header {
  package org.smeup.sys.il.expr.ibmi.rpg;
}


expression
	: 	logicalExpression EOF!
	;

logicalExpression
	:	booleanAndExpression (OR^ booleanAndExpression )*
	;

booleanAndExpression
	:	equalityExpression (AND^ equalityExpression)*
	;


equalityExpression
	:	relationalExpression ((EQ|NE)^ relationalExpression)*
	;

relationalExpression
	:	additiveExpression ( (LT|LTEQ|GT|GTEQ)^ additiveExpression )*

	;

additiveExpression
	:	multiplicativeExpression ( (PLUS|MINUS)^ multiplicativeExpression )*
	;

multiplicativeExpression
	:
		powerExpression ( (MULT|DIV|MOD)^ powerExpression)*
	;

powerExpression
	:	(v1=unaryExpression -> unaryExpression) (( MULT MULT v2=unaryExpression ) -> ^(POW $v1 $v2))*
	;

unaryExpression
	:
	 	qualified
    	|	NOT^ qualified
    	|	MINUS qualified -> ^(SIGN_MINUS qualified)
    	|	PLUS qualified  -> ^(SIGN_PLUS qualified)
   	;
   	
qualified
	:
		(v=primaryExpression -> primaryExpression) ((POINT vals+=primaryExpression) -> ^(QUALIFIED[$qualified.text] $v $vals+))* 
	;   	

primaryExpression
	:	'(' logicalExpression ')' -> ^(BLOCK[$primaryExpression.text] logicalExpression)
		|
		value		
	;

value
	:
		INTEGER
	|	FLOAT
	| 	DATE -> ^(DATE[$DATE.text.substring(2, $DATE.text.length() -1 )])
	|	TIME -> ^(TIME[$TIME.text.substring(2, $TIME.text.length() -1 )])
	|	TIMESTAMP -> ^(TIMESTAMP[$TIMESTAMP.text.substring(2, $TIMESTAMP.text.length() -1 )])
	|	BOOLEAN
	|	STRING
	|	HEX -> ^(HEX[$HEX.text.substring(2, $HEX.text.length() -1 )])
	|	(SPECIAL -> TERM[$SPECIAL.text])
	|	filler
	|	special
	|	bi_function
	|	usr_function
	|   	indicator
	|	TERM
	;
	
indicator
	:
		IN '(' logicalExpression ')' -> ^(BI_FUNCTION["*IN"] logicalExpression)  	// Caso *IN(nn)
		|
		INNR ->	^(BI_FUNCTION["*IN"] INTEGER[$INNR.text.substring(3)])	 		// Caso *INnn
		|
		INNU -> ^(INDICATOR[$INNU.text])				        	// Caso *INU0 - *INU8
		|
		IN -> ^(INDICATOR[$IN.text])							// Caso *IN
	;		
	
filler	:	
		ALL -> ^(BI_FUNCTION["*ALL"] STRING[$ALL.text.substring(5, $ALL.text.length()-1)])
		|
		ALLX -> ^(BI_FUNCTION["*ALL"] HEX[$ALLX.text.substring(6, $ALLX.text.length()-1)])	
	;

special	:
		MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text]
	;


usr_function
	:	TERM params	 -> ^(USER_FUNCTION[$TERM.text] params)
		|
		TERM empty	-> ^(USER_FUNCTION[$TERM.text])
	;
bi_function
	: 	BI_FUN (params)? -> ^(BI_FUNCTION[$BI_FUN.text] (params)?)
		|
		BI_FUN '(' ')'   -> ^(BI_FUNCTION[$BI_FUN.text])
	;

params
	:			
		'('! logicalExpression (':'! logicalExpression)* ')'!
	;
	
empty
	:
	'(' ')'
	;	

	
	
		
SPECIAL
	:	( H I V A L)
		|
		( L O V A L)
		|
		( Z E R O S)
		|
		( Z E R O)
		|
		( B L A N K)
		|
		( B L A N K S)
		|
		( O N)
		|
		( O F F)
		|
		( O M I T)
		|
		( N U L L)
		|
		( S T A T U S)
		|
		( P A R M S)
		|
		( D )
		|
		( M S)
		|
		( Y E A R)
		|
		( Y E A R S)
		|
		( M O N T H S)
		|
		( D A Y S)
		|
		( N E X T)
		|
		(I S O)
	;

OR 	: 	'||' | (O R);
AND 	: 	'&&' | (A N D);
NOT	:	'!'  | (N O T);

EQ	:	'='  | '==';
NE	:	'!=' | '<>';
LT	:	'<';
LTEQ	:	'<=';
GT	:	'>';
GTEQ	:	'>=';

PLUS	:	'+';
MINUS	:	'-';
MULT	:	'*';
DIV	:	'/';
MOD	:	'%';
//POW	:	'**';


BI_FUN  :	'%'TERM
	;

IN 	:
	MULT I N
	;
	
INNR	:
	MULT I N ('0'..'9') ('0'..'9')
	;
	
INNU	:	
	
	MULT I N U ('1'..'8')
	|
	MULT I N H ('1'..'8')
	|
	MULT I N M R
	|
	MULT I N O (A | G | V | F)
	|
	MULT I N L ('1'..'9')
	|
	MULT I N L R
	|
	MULT I N R T
	|
	MULT I N K A
	|
	MULT I N K B
	|
	MULT I N K C
	|
	MULT I N K D
	|
	MULT I N K E
	|
	MULT I N K F
	|
	MULT I N K G
	|
	MULT I N K H
	|
	MULT I N K I
	|
	MULT I N K J
	|
	MULT I N K K
	|
	MULT I N K L
	|
	MULT I N K M
	|
	MULT I N K N
	|
	MULT I N K P
	|
	MULT I N K Q
	|
	MULT I N K R
	|
	MULT I N K S
	|
	MULT I N K T
	|
	MULT I N K U
	|
	MULT I N K V
	|
	MULT I N K W
	|	
	MULT I N K X
	|
	MULT I N K Y	
	
	;	

ALL	:
	MULT A L L '\'' ~('\''|'\r'|'\n'|'\t')+ '\''
	;	

ALLX    :
	MULT A L L HEX	
	;

HEX	:   ('X\''|'x\'') (HexDigit)+ '\''
	;


//NB: Gli apici interni alla stringa vanno duplicati
STRING
	: '\''
    	{ StringBuilder b = new StringBuilder(); }
	( '\'' '\''        { b.appendCodePoint('\'');}
	| c=~('\''|'\r'|'\n')  { b.appendCodePoint(c);}
	)*
	'\''
	{ setText(b.toString()); }
  ;



INTEGER
	:	('0'..'9')+
	;

FLOAT
	:	('0'..'9')* DIGIT_SPECIAL ('0'..'9')+
	;

DATE
 	:	('D\''|'d\'') (DIGIT)* '\''
        ;

TIME
 	:	('T\''|'t\'') (DIGIT)* '\''
        ;

TIMESTAMP
 	:	('Z\''|'z\'') (DIGIT)* '\''
        ;
        

BOOLEAN
	:	(T R U E)
	|	(F A L S E)
	;


TERM
	:	LETTER (LETTER | DIGIT)*
	;

POINT
  : '.'
  ;

fragment DIGIT
  : ('0'..'9')
  ;

fragment CHAR_SPECIAL
  : ('\u00A3' | '\u00A7' | '$' | '_')
  ;

fragment LETTER
  : ('a'..'z'
  | 'A'..'Z'
  | CHAR_SPECIAL) ;

fragment EscapeSequence
	:	'\\'
  	(
  		'n'
	|	'r'
	|	't'
	|	'\''
	|	'\\'
	|	UnicodeEscape
	)
  ;

fragment UnicodeEscape
    	:    	'u' HexDigit HexDigit HexDigit HexDigit
    	;

fragment HexDigit
	: 	('0'..'9'|'a'..'f'|'A'..'F') ;

fragment DIGIT_SPECIAL
  : (',' | '.')
  ;



fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');


/* Ignore white spaces */

WS
	:  (' '|'\t'|'\u000C'| '\n' | '\r') {$channel=HIDDEN;}
	;
