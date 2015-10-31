grammar NeutralExpr;

options
{
	output=AST;
	ASTLabelType=CommonTree;
	backtrack=true;
	language=Java;
	
}

tokens
{	
	FUN;
	BLOCK;
	AT_SPECIAL;
}

@parser::header {
  package org.smeup.sys.il.expr.neutral;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
}

@lexer::header {
  package org.smeup.sys.il.expr.neutral;
  
  import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
}

@lexer::members {

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
	:	logicalExpression ((ASSIGN|ASSIGN_DIV|ASSIGN_MIN|ASSIGN_PLU|ASSIGN_POW|ASSIGN_TIM)^ logicalExpression)* EOF!
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
		unaryExpression ( (MULT|DIV|MOD|POW)^ unaryExpression)*
	;

unaryExpression
	:
	 	primaryExpression
    	|	NOT^ primaryExpression
    	|	SMINUS^ primaryExpression 
    	|	SPLUS^ primaryExpression  
   	;
   	
  	
primaryExpression
	:	block
		|
		atomic		
	;
	
block
	: BLOCK_OPEN logicalExpression+ CLOSE_SQUARE -> ^(BLOCK logicalExpression+)
	;	

atomic
	:
		AT_BOOL
	|	AT_DATE
	| 	AT_FLOAT
	|	AT_HEX
	|	AT_INDICATOR
	|	AT_INT
	|	AT_NAME
	|	AT_STRING
	|	AT_GENERIC
	|	QT
	| 	special
	|	function
	;

special
	:	SPECIAL_START s=SPECIAL CLOSE_BRACE CLOSE_BRACE -> AT_SPECIAL[$s.text]
	;
	
function
	: 	FUN_START n=function_name CLOSE_BRACE OPEN_SQUARE params* CLOSE_SQUARE -> ^(FUN[$n.text] params*)		
	;
	
function_name
	:	
		BI_FUN
		|
		TERM
		|
		INDICATOR
		|
		ALL
		|
		GENERIC
		
	;	

params
	:			
		logicalExpression (logicalExpression)*
	;
	

INDICATOR
	:	AXT I N
	;

ALL	
	:	AXT A L L
	;	
		
SPECIAL
	:	( AXT H I V A L)
		|
		( AXT L O V A L)
		|
		( AXT Z E R O S)
		|
		( AXT Z E R O)
		|
		( AXT B L A N K)
		|
		( AXT B L A N K S)
		|
		( AXT O N)
		|
		( AXT O F F)
		|
		( AXT O M I T)
		|
		( AXT N U L L)
		|
		( AXT S T A T U S)
		|
		( AXT P A R M S)
		|
		( AXT D )
		|
		( AXT M S)
		|
		( AXT Y E A R)
		|
		( AXT Y E A R S)
		|
		( AXT M O N T H S)
		|
		( AXT D A Y S)
		|
		( AXT N E X T)
		|
		( AXT I S O)
	;

OR 	: 	L E OPEN_BRACE O R CLOSE_BRACE;
AND 	: 	L E OPEN_BRACE A N D CLOSE_BRACE;
NOT	:	L E OPEN_BRACE N O T CLOSE_BRACE;

EQ	:	R E OPEN_BRACE E Q CLOSE_BRACE;
NE	:	R E OPEN_BRACE N E CLOSE_BRACE;
LT	:	R E OPEN_BRACE L T CLOSE_BRACE;
LTEQ	:	R E OPEN_BRACE L T E CLOSE_BRACE;
GT	:	R E OPEN_BRACE G T CLOSE_BRACE;
GTEQ	:	R E OPEN_BRACE G T E CLOSE_BRACE;

PLUS	:	A E OPEN_BRACE P L U S CLOSE_BRACE;
MINUS	:	A E OPEN_BRACE M I N U S CLOSE_BRACE;
MULT	:	A E OPEN_BRACE M U L T CLOSE_BRACE;
DIV	:	A E OPEN_BRACE D I V CLOSE_BRACE;
MOD	:	A E OPEN_BRACE M O D CLOSE_BRACE;
POW	:       A E OPEN_BRACE P O W CLOSE_BRACE;
TIMES	:       A E OPEN_BRACE T I M CLOSE_BRACE;
SMINUS  :	A E OPEN_BRACE S M I N U S CLOSE_BRACE; 
SPLUS  :	A E OPEN_BRACE S P L U S CLOSE_BRACE; 

ASSIGN		:	A S OPEN_BRACE A S S CLOSE_BRACE;
ASSIGN_DIV	:	A S OPEN_BRACE D I V CLOSE_BRACE;
ASSIGN_MIN	:	A S OPEN_BRACE M I N CLOSE_BRACE;
ASSIGN_PLU	:	A S OPEN_BRACE P L U S CLOSE_BRACE;
ASSIGN_POW	:	A S OPEN_BRACE P O W CLOSE_BRACE;
ASSIGN_TIM	:	A S OPEN_BRACE T I M E S CLOSE_BRACE;

BLOCK_OPEN	: 	B E OPEN_SQUARE;

AT_STRING	:	A T OPEN_BRACE S T R I N G CLOSE_BRACE;
AT_BOOL		:	A T OPEN_BRACE B O O L CLOSE_BRACE;	
AT_DATE		:	A T OPEN_BRACE D A T E CLOSE_BRACE;
AT_FLOAT	:	A T OPEN_BRACE F L O A T CLOSE_BRACE;
AT_HEX		:	A T OPEN_BRACE H E X CLOSE_BRACE;
AT_INDICATOR	:	A T OPEN_BRACE I N D I C A T O R CLOSE_BRACE;
AT_INT		:	A T OPEN_BRACE I N T CLOSE_BRACE;
AT_NAME		:	A T OPEN_BRACE N A M E CLOSE_BRACE;
AT_GENERIC 	:	A T OPEN_BRACE AXT AXT CLOSE_BRACE;

QT		:	Q T OPEN_BRACE CLOSE_BRACE;

SPECIAL_START	:	A T OPEN_BRACE S P E C I A L OPEN_BRACE;
FUN_START  	:	F T OPEN_BRACE;

GENERIC		: 	AXT AXT;
	
BI_FUN	
	:
	BIFUN_MARK TERM
	;	

TERM
	:
	LETTER (LETTER|DIGIT)*
	;	
	
CLOSE_BRACE
	: ')'
	;  

OPEN_SQUARE
	: '['
	;  	

CLOSE_SQUARE
	: ']'
	;  	

fragment OPEN_BRACE
	: '('
	;  	

fragment AXT
	:	'*'
	;  

fragment BIFUN_MARK
	:
	'%'
	;	

fragment CHAR_SPECIAL
  : ('\u00A3' | '\u00A7' | '$' | '_')
  ;

fragment LETTER
  : ('a'..'z'
  | 'A'..'Z'
  | CHAR_SPECIAL) ;
  
fragment DIGIT
	: ('0'..'9')
	;  

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
