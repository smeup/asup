grammar CLParameter;

options {
  	output=AST;
  	ASTLabelType=CommonTree;
	language=Java;	
}


tokens
{
	LIST;
	//TOKEN
	//VARIABLE
	//SPECIAL
	//STRING
	//FILTER
	//HEX
	FUNCTION;	
	VALUE;	
}


@lexer::header {
  package org.smeup.sys.dk.parser.ibmi.cl.antlr;
  
  import org.smeup.sys.dk.parser.ibmi.cl.util.LexerHelper;
}

@parser::header {
  package org.smeup.sys.dk.parser.ibmi.cl.antlr;
  
  import org.smeup.sys.dk.parser.ibmi.cl.util.CLParserHelper;
}

@parser::members {

   public CLParserHelper hlp = new CLParserHelper(this);
   
   @Override
  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    	throw new MismatchedTokenException(ttype, input);
  	}

   @Override
   public void reportError(RecognitionException e) {
      super.reportError(e);
      RuntimeException re = hlp.createException(e);
      recover(input, e);
      throw re;
   }
   
   @Override
  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
    }
  

}

@rulecatch {
    catch (RecognitionException e) {
        RuntimeException re = hlp.createException(e);
        throw re;
    }
}

parse
  :
  (elem)* -> ^(LIST[$parse.text] (elem)*) 
  ;
  
elem	
 :
    composite|list
 ;	 
 
  
  composite
  :      
   value (operator value)* -> ^(VALUE[$composite.text] value (operator value)*)
  ;	   
   
list
  : 
  OPEN_BRACE (elem)* CLOSE_BRACE -> ^(LIST[$list.text]  (elem)*)    
  ;
  

value
  :
  ASTERISK -> ^(TOKEN[$ASTERISK.text])
  |
  TOKEN
  |
  VARIABLE
  |
  SPECIAL  
  |
  FILTER
  |
  HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)]
  |
  STRING -> ^(STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace("''", "'")])
  |  
  ESCAPE -> ^(STRING["''"])
  |
  function
  ;
  
operator:
	CAT
	|
	BCAT
	|
	TCAT	
	;
  
function:
  SST list	-> ^(FUNCTION["\%SST"] list)
  |
  BINARY list	-> ^(FUNCTION["\%BIN"] list)
  |
  SWITCH list	-> ^(FUNCTION["\%SWITCH"] list)
 ; 
	
CAT     : '!!' | '*CAT';

BCAT    : '!>' | '*BCAT';

TCAT    : '!<' | '*TCAT';	
	
SST 	: ('%' S S T) | ('%' S U B S T R I N G);

SWITCH  : '%' S W I T C H;	 

BINARY  : ('%' B I N) | ('%' B I N A R Y);
  
STRING	:	
   APOS ('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL|' '|'%'|'&'|ASTERISK|OPEN_BRACE|CLOSE_BRACE|ESCAPE)+ APOS	
   ;	  

TOKEN: 
  ('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL)+
  ;

VARIABLE: 
   '&' TOKEN   
 ;
 
SPECIAL	:	
   ASTERISK TOKEN
 ;  
 
FILTER	:	
	TOKEN ASTERISK
	;  	

ASTERISK:
	'*'	
	;
	

HEX	:
	'X' APOS ('0'..'9'|'A'..'F'|'a'..'f')+ APOS	
	;	 
      
OPEN_BRACE
  :
  '(' 
  ;
  
CLOSE_BRACE
  :
  ')' 
  ;
 
ESCAPE
	:
	APOS APOS
	;  
  
APOS	:
	'\''	
	;  

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

CR :
  ('\r')? '\n'
  ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )
        {$channel=HIDDEN;}
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

fragment
CHAR_SPECIAL
  :
  (
    '\u00A7'  //?
    | '$'
    | '_'
    | '.'    
    | '^'
    | '\u00e0' //?
    | '\u00e8' //?
    | '\u00e9' //?
    | '\u00ec' //?
    | '\u00f2' //?
    | '\u00f9' //?
    | '"'
    | '?'    
    | ','   
    | '\u00a3' //?	
    | '!'
    | '='
    | '>'
    | '<'	
    | '+'
    | '-'
    | '/'	
    | '\\' 
    | ':'        
  )
  ;