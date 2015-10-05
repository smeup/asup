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
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
}

@lexer::header {
  package org.smeup.sys.il.expr.ibmi.rpg;
}

@parser::members {

   @Override
  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    	throw new MismatchedTokenException(ttype, input);
  	}

   @Override
   public void reportError(RecognitionException e) {
      super.reportError(e);
      RuntimeException re = createException(e);
      recover(input, e);
      throw re;
   }

   @Override
  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
    }
    
    public RuntimeException createException(RecognitionException e) {
        String message = "";
        boolean addTokenAndLine = true;
        if (e instanceof NoViableAltException) {
            message = "Syntax error. ";
        } else if (e instanceof MissingTokenException) {
            message = "Missing token ";
        } else if (e instanceof UnwantedTokenException) {
            UnwantedTokenException ex = (UnwantedTokenException) e;
            ex.getUnexpectedToken().getText();
            message = "Unkown token '" + ex.getUnexpectedToken().getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();
            addTokenAndLine = false;
        } else {
            message = "Syntax error near ";
        }
        if (addTokenAndLine) {
            message = message + "'" + e.token.getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();
        }
        return new IntegratedLanguageExpressionRuntimeException(message,e);
    }
}

@rulecatch {
    catch (RecognitionException e) {
        RuntimeException re = createException(e);
        throw re;
    }
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
	| 	DATETIME
	|	BOOLEAN
	|	STRING
	|	HEX
	|	TERM
	|	(SPECIAL -> TERM)
	|	filler
	|	special
	|	bi_function
	|	usr_function
	|   indicator
	;
	
indicator
	:
		IN '(' logicalExpression ')' -> ^(BI_FUNCTION["*IN"] logicalExpression)  	// Caso *IN(nn)
		|
		INNR ->	^(BI_FUNCTION["*IN"] INTEGER[$INNR.text.substring(3)])	 			// Caso *INnn
		|
		INNU -> ^(INDICATOR[$INNU.text])				        					// Caso *INU0 - *INU8
		|
		IN -> ^(INDICATOR[$IN.text])												// Caso *IN
	;		
	
filler	:	
		MULT ALL STRING -> ^(BI_FUNCTION["*ALL"] STRING)
		|
		MULT ALL HEX -> ^(BI_FUNCTION["*ALL"] HEX)	
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
		( M S)
		|
		( Y E A R)
		|
		( Y E A R S)
		|
		( Y)
		|
		( M O N T H S)
		|
		( M)
		|
		( D A Y S)
		|
		( D)
		|
		( I S O)
		|
		( E U R)
		|
		( U S A)
		|
		( N E X T)
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

/*
INDICATOR : ('*IN' (LETTER | DIGIT )*)
	;

ARRAY_INDICATOR	: '*IN('
	;


ALL	: '*ALL'
	;
*/	

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
	A L L
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

DATETIME
 	:	'#' (~'#')* '#'
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
