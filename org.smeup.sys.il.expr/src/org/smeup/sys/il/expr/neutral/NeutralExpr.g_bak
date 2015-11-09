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
	FT;
	BE;
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
	:	logicalExpression ((AS_ASS|AS_DIV|AS_MIN|AS_PLUS|AS_POW|AS_TIM|AS_GENERIC)^ logicalExpression)* EOF!
	;

logicalExpression
	:	booleanAndExpression (LE_OR^ booleanAndExpression )*
	;

booleanAndExpression
	:	booleanGenExpression (LE_AND^ booleanGenExpression)*
	;

booleanGenExpression
	:	
		equalityExpression (LE_GENERIC^ equalityExpression)*
	;	

equalityExpression
	:	relationalExpression ((RE_EQ|RE_NE)^ relationalExpression)*
	;

relationalExpression
	:	additiveExpression ( (RE_LT|RE_LTEQ|RE_GT|RE_GTEQ|RE_GENERIC)^ additiveExpression )*

	;

additiveExpression
	:	multiplicativeExpression ( (AE_PLUS|AE_MINUS)^ multiplicativeExpression )*
	;

multiplicativeExpression
	:
		unaryExpression ( (AE_MULT|AE_DIV|AE_MOD|AE_POW|AE_GENERIC)^ unaryExpression)*
	;

unaryExpression
	:
	 	primaryExpression
	|	LE_NOT primaryExpression 	
    	|	AE_SMINUS^ primaryExpression 
    	|	AE_SPLUS^ primaryExpression  
   	;
   	
  	
primaryExpression
	:	block
		|
		atomic		
	;
	
block
	: BLOCK_OPEN logicalExpression+ CLOSE_SQUARE -> ^(BE logicalExpression+)
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
	: 	FUN_START n=function_name CLOSE_BRACE OPEN_SQUARE params* CLOSE_SQUARE -> ^(FT[$n.text] params*)		
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

LE_OR 			:L E OPEN_BRACE O R CLOSE_BRACE;
LE_AND 			:L E OPEN_BRACE A N D CLOSE_BRACE;
LE_NOT			:L E OPEN_BRACE N O T CLOSE_BRACE;
LE_GENERIC		:L E OPEN_BRACE AXT AXT CLOSE_BRACE;	

RE_EQ			:R E OPEN_BRACE E Q CLOSE_BRACE;
RE_NE			:R E OPEN_BRACE N E CLOSE_BRACE;
RE_LT			:R E OPEN_BRACE L T CLOSE_BRACE;
RE_LTEQ			:R E OPEN_BRACE L T E CLOSE_BRACE;
RE_GT			:R E OPEN_BRACE G T CLOSE_BRACE;
RE_GTEQ			:R E OPEN_BRACE G T E CLOSE_BRACE;
RE_GENERIC		:R E OPEN_BRACE AXT AXT CLOSE_BRACE;

AE_PLUS			:A E OPEN_BRACE P L U S CLOSE_BRACE;
AE_MINUS		:A E OPEN_BRACE M I N U S CLOSE_BRACE;
AE_MULT			:A E OPEN_BRACE M U L T CLOSE_BRACE;
AE_DIV			:A E OPEN_BRACE D I V CLOSE_BRACE;
AE_MOD			:A E OPEN_BRACE M O D CLOSE_BRACE;
AE_POW			:A E OPEN_BRACE P O W CLOSE_BRACE;
AE_TIM			:A E OPEN_BRACE T I M CLOSE_BRACE;
AE_SMINUS  		:A E OPEN_BRACE S M I N U S CLOSE_BRACE; 
AE_SPLUS  		:A E OPEN_BRACE S P L U S CLOSE_BRACE; 
AE_GENERIC		:A E OPEN_BRACE AXT AXT CLOSE_BRACE;	

AS_ASS			:A S OPEN_BRACE A S S CLOSE_BRACE;
AS_DIV			:A S OPEN_BRACE D I V CLOSE_BRACE;
AS_MIN			:A S OPEN_BRACE M I N CLOSE_BRACE;
AS_PLUS			:A S OPEN_BRACE P L U S CLOSE_BRACE;
AS_POW			:A S OPEN_BRACE P O W CLOSE_BRACE;
AS_TIM			:A S OPEN_BRACE T I M E S CLOSE_BRACE;
AS_GENERIC		:A S OPEN_BRACE AXT AXT CLOSE_BRACE;

BLOCK_OPEN		:B E OPEN_SQUARE;

AT_STRING		:A T OPEN_BRACE S T R I N G CLOSE_BRACE;
AT_BOOL			:A T OPEN_BRACE B O O L CLOSE_BRACE;	
AT_DATE			:A T OPEN_BRACE D A T E CLOSE_BRACE;
AT_FLOAT		:A T OPEN_BRACE F L O A T CLOSE_BRACE;
AT_HEX			:A T OPEN_BRACE H E X CLOSE_BRACE;
AT_INDICATOR		:A T OPEN_BRACE I N D I C A T O R CLOSE_BRACE;
AT_INT			:A T OPEN_BRACE I N T CLOSE_BRACE;
AT_NAME			:A T OPEN_BRACE N A M E CLOSE_BRACE;
AT_GENERIC 		:A T OPEN_BRACE AXT AXT CLOSE_BRACE;

QT			:Q T OPEN_BRACE CLOSE_BRACE;

SPECIAL_START		:A T OPEN_BRACE S P E C I A L OPEN_BRACE;
FUN_START  		:F T OPEN_BRACE;

GENERIC			:AXT AXT;
	
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
