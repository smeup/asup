grammar CL;

options {
  	output=AST;
  	ASTLabelType=CommonTree;
	language=Java;
}

tokens
{
	CL;
	ROW;
	LABEL;
	COMMAND;
	CMD_NAME;
	POS_PAR;
	PAR;
	PAR_NAME;
	PAR_VALUE;

	/*
		CL
		|___ ROW*
		     |
		     |__ LABEL
		     |
		     |__ CMD
		          |__ CMD_NAME
                  |
                  |__ (POS_PAR *)
                  |    |
                  |	   |___ VALUE
                  |
                  |__ (PAR)*
                       |__ PAR_NAME
                       |
                       |__ PAR_VALUE
                              |
                              |__ VALUE
	*/
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

@lexer::members {
  int openBraces = 0;
  int closeBraces = 0;
}


parse  :
  (row | ((WS)* CR))* EOF ->^(CL[$parse.text] row*)
  ;

row :
    single_label
    | command_row
    ;

single_label  :
    label (WS)* CR ->^(ROW[$single_label.text] label)
    ;

command_row:
	(label)? (WS)* command CR ->^(ROW[$command_row.text] (label)? command)
  ;

label : 
	(WS)* LABEL -> ^(LABEL[$LABEL.text.substring(0, $LABEL.text.length()-1)])
  ;

command
  :
  cmd_name ((WS)+ pos_parm)* ((WS)+ parm)* (WS)* -> ^(COMMAND[$command.text] cmd_name (pos_parm)* (parm)*)
  ;

cmd_name
  :
  TOKEN -> ^(CMD_NAME[$TOKEN.text])
  ;

pos_parm
  :
  TOKEN  -> ^(POS_PAR[$TOKEN.text])
  |
  PAREN -> ^(POS_PAR[$PAREN.text])
  |
  STRING -> ^(POS_PAR[$STRING.text])
  |
  fun
  ;

fun
  :
  FUN PAREN -> ^(POS_PAR[$fun.text])
  ;

parm
  :
  parm_name parm_value -> ^(PAR[$parm.text] parm_name parm_value)
  ;

 parm_name
  :
  TOKEN -> ^(PAR_NAME[$TOKEN.text])
  ;

 parm_value
  :
  PAREN -> ^(PAR_VALUE[$PAREN.text])
  ;

LABEL : TOKEN ':'
  ;

FUN	:
   '%'TOKEN
	;

STRING	:
   {(openBraces - closeBraces) == 0}?=> APOS ('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL|' '|'%'|':'|ESCAPE)+ APOS
   ;

TOKEN: {(openBraces - closeBraces) == 0}?=>('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL)+
  ;

PAREN: OPEN_BRACE ('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL|APOS|' '|PAREN|'%'|':')* CLOSE_BRACE
  ;

OPEN_BRACE
  :
  '(' {openBraces++;}
  ;

CLOSE_BRACE
  :
  ')' {closeBraces++;}
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
        //{$channel=HIDDEN;}
    ;
	
ESCAPE	:
	APOS APOS	
	;	

APOS	:
	'\''
	;

fragment
CHAR_SPECIAL
  :
  (
    '\u00A7'  //§
    | '$'
    | '_'
    | '.'
    | '^'
    | '\u00e0' //à
    | '\u00e8' //è
    | '\u00e9' //é
    | '\u00ec' //ì
    | '\u00f2' //ò
    | '\u00f9' //ù
    | '"'
    | '?'
    | ','
    | '\u00a3' //£
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
  )
  ;


