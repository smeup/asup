grammar CLExpr;

options {
  	output=AST;
  	ASTLabelType=CommonTree;
	language=Java;
}

tokens
{
	//OR
	//AND
	//EQ
	//NE
	//LT
	//LTEQ
	//GT
	//GTEQ
	//NG
	//NL
	//CAT
	//BCAT
	//TCAT
	//PLUS
	//MINUS
	//MULT
	//DIV
	//NOT
	SIGN_MINUS;
	SIGN_PLUS;
	//BINARY_FUN
	//SST_FUN
	//SWITCH_FUN
	//SWITCH_VALUE
	//DATA_AREA

	//VAR
	//STRING
	//TERM
	//INTEGER
	//FLOAT
}

@lexer::header {
  package org.smeup.sys.il.expr.ibmi.cl;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
}

@parser::header {
  package org.smeup.sys.il.expr.ibmi.cl;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
}

@lexer::members {

	@Override
  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    	throw new MismatchedTokenException(ttype, input);
  	}

    @Override    
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String msg = "CLExprLexer error. Input: " + e.input.toString();
        msg += " " + getErrorHeader(e);
        msg += " Msg: " + getErrorMessage(e, tokenNames);
        throw new IntegratedLanguageExpressionRuntimeException(msg , e);
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
		String msg = "CLExprParser error. Input: " + e.input.toString();
        msg += " " + getErrorHeader(e);
        msg += " Msg: " + getErrorMessage(e, tokenNames);
        throw new IntegratedLanguageExpressionRuntimeException(msg , e);
    }	

   @Override
  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
    }
}



expression
  	:
  	logicalExpression  EOF!
  	;

logicalExpression
	:
	booleanAndExpression (OR^ booleanAndExpression )*
	;

booleanAndExpression
	:	equalityExpression (AND^ equalityExpression)*
	;

equalityExpression
	:	relationalExpression ((EQ|NE)^ relationalExpression)*
	;

relationalExpression
	:	concatExpression ( (LT|LTEQ|GT|GTEQ|NG|NL)^ concatExpression )*
	;

concatExpression
	:
		additiveExpression ( (CAT|BCAT|TCAT)^ additiveExpression )*
	;


additiveExpression
	:	multiplicativeExpression ( (PLUS|MINUS)^ multiplicativeExpression )*
	;

multiplicativeExpression
	:
		unaryExpression ( (MULT|DIV)^ unaryExpression )*
	;

unaryExpression
	:		
	 	primaryExpression
    	|	NOT^ primaryExpression
    	|	MINUS primaryExpression -> ^(SIGN_MINUS primaryExpression)
    	|	PLUS primaryExpression -> ^(SIGN_PLUS primaryExpression)
    ;

primaryExpression
	:	'('! logicalExpression ')'!
	|	value
	;


value	:

	VAR
	|
	BOOLEAN
	|
	STRING
	|
	TERM
	|
	MULT_TERM -> ^(TERM[$value.text])
	|
	INTEGER
	|
	FLOAT
	|
	DATA_AREA
	|
	binary_fun
	|
	sst_fun
	|
	switch_fun

	;
amp_term
	:
	'*' TERM -> ^(TERM[$amp_term.text])
	;	

binary_fun
	:
		BINARY_FUN '(' value? ')' -> ^(BINARY_FUN[$BINARY_FUN.text] value?)	
	;

sst_fun
	:
		SST_FUN '(' value value value ')' -> ^(SST_FUN["\%SST"] value value value)		
	;	

switch_fun
	:
		SWITCH_FUN '(' SWITCH_VALUE ')'	-> ^(SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE)	
	;

VAR	:
	'&' TERM
	;

BOOLEAN
	:	(T R U E)
	|	(F A L S E)
	;

STRING
	: '\''
   	{ StringBuilder b = new StringBuilder(); }
	( '\'' '\''         { b.appendCodePoint('\'');}
	| c=~('\''|'\r'|'\n')  { b.appendCodePoint(c);}
	)*
	'\''
	{ setText(b.toString()); }
  ;

OR 	: 	'!' | ('*' O R);
AND 	: 	'&' | ('*' A N D);
NOT	:	('*' N O T);
EQ	:	'='  | ('*' E Q);
GT	:	'>' | ('*' G T);
LT	:  	'<' | ('*' L T);
GTEQ	:	'*' G E;
LTEQ	:	'*' L E;
NE	    :  '^=' | '*' N E;
NG      :  '^>' | '*' N G;
NL      :  '^<' | '*' N L;

PLUS	:	'+';
MINUS	:	'-';
MULT	:	'*';
DIV	:	'/';

CAT     :	'!!' | ('*' C A T);
BCAT    :	'!>' | ('*' B C A T);
TCAT    :	'!<' | ('*' T C A T);

SWITCH_VALUE
	:
	('0'| X |'1')('0'| X |'1')('0'| X |'1')('0'| X |'1')('0'| X |'1')('0'| X |'1')('0'| X |'1')('0'| X |'1')
	;


TERM : LETTER (LETTER | DIGIT )*;

DATA_AREA
	:
	MULT L D A
	|
	MULT G D A
	|
	MULT P D A
	;

// Stringa che inizia per * e che non ricade in uno dei casi precedentemente trattati -> TERM
MULT_TERM 
	:
	MULT LETTER (LETTER | DIGIT )*
	;

INTEGER	:
	DIGIT+
	;

FLOAT
	:	('0'..'9')* DIGIT_SPECIAL ('0'..'9')+
	;

OPEN_BRACE
	:
	'('
	;

CLOSE_BRACE
	:
	')'
	;

BINARY_FUN
	:
	'%' B I N A R Y
	;

SST_FUN
	:
	'%' S S T
	|
	'%' S U B S T R I N G
	;

SWITCH_FUN
	:
	'%' S W I T C H
	;


fragment LETTER
  : ('a'..'z'
  | 'A'..'Z'
  | CHAR_SPECIAL) ;

fragment CHAR_SPECIAL
  :
  (
    '\u00A7'  //§
    | '_'
    | '.'
    | '/'
    | '\u00e0' //à
    | '\u00e8' //è
    | '\u00e9' //é
    | '\u00ec' //ì
    | '\u00f2' //ò
    | '\u00f9' //ù
    | '"'
    | '\u00a3' //£
    | '?'
    | '+'
    | '-'
    | ','
    | '$'
  )
  ;

fragment DIGIT
  :
   ('0'..'9')
  ;

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
	

