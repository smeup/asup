// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g 2016-07-12 15:54:36

  package org.smeup.sys.dk.parser.ibmi.cl.antlr;
  
  import org.smeup.sys.dk.parser.ibmi.cl.util.CLParserHelper;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CLParameterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "APOS", "ASTERISK", "B", 
		"BCAT", "BINARY", "C", "CAT", "CHAR_SPECIAL", "CLOSE_BRACE", "COMMENT", 
		"CR", "D", "E", "ESCAPE", "F", "FILTER", "FUNCTION", "G", "H", "HEX", 
		"I", "J", "K", "L", "LIST", "M", "N", "O", "OPEN_BRACE", "P", "Q", "R", 
		"S", "SPECIAL", "SST", "STRING", "SWITCH", "T", "TCAT", "TOKEN", "U", 
		"V", "VALUE", "VARIABLE", "W", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int APOS=5;
	public static final int ASTERISK=6;
	public static final int B=7;
	public static final int BCAT=8;
	public static final int BINARY=9;
	public static final int C=10;
	public static final int CAT=11;
	public static final int CHAR_SPECIAL=12;
	public static final int CLOSE_BRACE=13;
	public static final int COMMENT=14;
	public static final int CR=15;
	public static final int D=16;
	public static final int E=17;
	public static final int ESCAPE=18;
	public static final int F=19;
	public static final int FILTER=20;
	public static final int FUNCTION=21;
	public static final int G=22;
	public static final int H=23;
	public static final int HEX=24;
	public static final int I=25;
	public static final int J=26;
	public static final int K=27;
	public static final int L=28;
	public static final int LIST=29;
	public static final int M=30;
	public static final int N=31;
	public static final int O=32;
	public static final int OPEN_BRACE=33;
	public static final int P=34;
	public static final int Q=35;
	public static final int R=36;
	public static final int S=37;
	public static final int SPECIAL=38;
	public static final int SST=39;
	public static final int STRING=40;
	public static final int SWITCH=41;
	public static final int T=42;
	public static final int TCAT=43;
	public static final int TOKEN=44;
	public static final int U=45;
	public static final int V=46;
	public static final int VALUE=47;
	public static final int VARIABLE=48;
	public static final int W=49;
	public static final int WS=50;
	public static final int X=51;
	public static final int Y=52;
	public static final int Z=53;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CLParameterParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLParameterParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CLParameterParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g"; }



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
	  



	public static class parse_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:93:1: parse : ( elem )* -> ^( LIST[$parse.text] ( elem )* ) ;
	public final CLParameterParser.parse_return parse() throws RecognitionException {
		CLParameterParser.parse_return retval = new CLParameterParser.parse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope elem1 =null;

		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:94:3: ( ( elem )* -> ^( LIST[$parse.text] ( elem )* ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:95:3: ( elem )*
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:95:3: ( elem )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ASTERISK||LA1_0==BINARY||LA1_0==ESCAPE||LA1_0==FILTER||LA1_0==HEX||LA1_0==OPEN_BRACE||(LA1_0 >= SPECIAL && LA1_0 <= SWITCH)||LA1_0==TOKEN||LA1_0==VARIABLE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:95:4: elem
					{
					pushFollow(FOLLOW_elem_in_parse118);
					elem1=elem();
					state._fsp--;

					stream_elem.add(elem1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: elem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 95:11: -> ^( LIST[$parse.text] ( elem )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:95:14: ^( LIST[$parse.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, input.toString(retval.start,input.LT(-1))), root_1);
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:95:34: ( elem )*
				while ( stream_elem.hasNext() ) {
					adaptor.addChild(root_1, stream_elem.nextTree());
				}
				stream_elem.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class elem_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "elem"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:98:1: elem : ( composite | list );
	public final CLParameterParser.elem_return elem() throws RecognitionException {
		CLParameterParser.elem_return retval = new CLParameterParser.elem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope composite2 =null;
		ParserRuleReturnScope list3 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:99:2: ( composite | list )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ASTERISK||LA2_0==BINARY||LA2_0==ESCAPE||LA2_0==FILTER||LA2_0==HEX||(LA2_0 >= SPECIAL && LA2_0 <= SWITCH)||LA2_0==TOKEN||LA2_0==VARIABLE) ) {
				alt2=1;
			}
			else if ( (LA2_0==OPEN_BRACE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:100:5: composite
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_composite_in_elem152);
					composite2=composite();
					state._fsp--;

					adaptor.addChild(root_0, composite2.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:100:15: list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_list_in_elem154);
					list3=list();
					state._fsp--;

					adaptor.addChild(root_0, list3.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elem"


	public static class composite_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "composite"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:104:3: composite : value ( operator value )* -> ^( VALUE[$composite.text] value ( operator value )* ) ;
	public final CLParameterParser.composite_return composite() throws RecognitionException {
		CLParameterParser.composite_return retval = new CLParameterParser.composite_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope value4 =null;
		ParserRuleReturnScope operator5 =null;
		ParserRuleReturnScope value6 =null;

		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:105:3: ( value ( operator value )* -> ^( VALUE[$composite.text] value ( operator value )* ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:106:4: value ( operator value )*
			{
			pushFollow(FOLLOW_value_in_composite183);
			value4=value();
			state._fsp--;

			stream_value.add(value4.getTree());
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:106:10: ( operator value )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BCAT||LA3_0==CAT||LA3_0==TCAT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:106:11: operator value
					{
					pushFollow(FOLLOW_operator_in_composite186);
					operator5=operator();
					state._fsp--;

					stream_operator.add(operator5.getTree());
					pushFollow(FOLLOW_value_in_composite188);
					value6=value();
					state._fsp--;

					stream_value.add(value6.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: value, value, operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 106:28: -> ^( VALUE[$composite.text] value ( operator value )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:106:31: ^( VALUE[$composite.text] value ( operator value )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, input.toString(retval.start,input.LT(-1))), root_1);
				adaptor.addChild(root_1, stream_value.nextTree());
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:106:62: ( operator value )*
				while ( stream_value.hasNext()||stream_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_operator.nextTree());
					adaptor.addChild(root_1, stream_value.nextTree());
				}
				stream_value.reset();
				stream_operator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "composite"


	public static class list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:109:1: list : OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) ;
	public final CLParameterParser.list_return list() throws RecognitionException {
		CLParameterParser.list_return retval = new CLParameterParser.list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_BRACE7=null;
		Token CLOSE_BRACE9=null;
		ParserRuleReturnScope elem8 =null;

		CommonTree OPEN_BRACE7_tree=null;
		CommonTree CLOSE_BRACE9_tree=null;
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:110:3: ( OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:111:3: OPEN_BRACE ( elem )* CLOSE_BRACE
			{
			OPEN_BRACE7=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_list229);  
			stream_OPEN_BRACE.add(OPEN_BRACE7);

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:111:14: ( elem )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ASTERISK||LA4_0==BINARY||LA4_0==ESCAPE||LA4_0==FILTER||LA4_0==HEX||LA4_0==OPEN_BRACE||(LA4_0 >= SPECIAL && LA4_0 <= SWITCH)||LA4_0==TOKEN||LA4_0==VARIABLE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:111:15: elem
					{
					pushFollow(FOLLOW_elem_in_list232);
					elem8=elem();
					state._fsp--;

					stream_elem.add(elem8.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			CLOSE_BRACE9=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_list236);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE9);

			// AST REWRITE
			// elements: elem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 111:34: -> ^( LIST[$list.text] ( elem )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:111:37: ^( LIST[$list.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, input.toString(retval.start,input.LT(-1))), root_1);
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:111:57: ( elem )*
				while ( stream_elem.hasNext() ) {
					adaptor.addChild(root_1, stream_elem.nextTree());
				}
				stream_elem.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:115:1: value : ( ASTERISK -> ^( TOKEN[$ASTERISK.text] ) | TOKEN | VARIABLE | SPECIAL | FILTER | HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)] | STRING -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace(\"''\", \"'\")] ) | ESCAPE -> ^( STRING[\"''\"] ) | function );
	public final CLParameterParser.value_return value() throws RecognitionException {
		CLParameterParser.value_return retval = new CLParameterParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASTERISK10=null;
		Token TOKEN11=null;
		Token VARIABLE12=null;
		Token SPECIAL13=null;
		Token FILTER14=null;
		Token HEX15=null;
		Token STRING16=null;
		Token ESCAPE17=null;
		ParserRuleReturnScope function18 =null;

		CommonTree ASTERISK10_tree=null;
		CommonTree TOKEN11_tree=null;
		CommonTree VARIABLE12_tree=null;
		CommonTree SPECIAL13_tree=null;
		CommonTree FILTER14_tree=null;
		CommonTree HEX15_tree=null;
		CommonTree STRING16_tree=null;
		CommonTree ESCAPE17_tree=null;
		RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_HEX=new RewriteRuleTokenStream(adaptor,"token HEX");
		RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:116:3: ( ASTERISK -> ^( TOKEN[$ASTERISK.text] ) | TOKEN | VARIABLE | SPECIAL | FILTER | HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)] | STRING -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace(\"''\", \"'\")] ) | ESCAPE -> ^( STRING[\"''\"] ) | function )
			int alt5=9;
			switch ( input.LA(1) ) {
			case ASTERISK:
				{
				alt5=1;
				}
				break;
			case TOKEN:
				{
				alt5=2;
				}
				break;
			case VARIABLE:
				{
				alt5=3;
				}
				break;
			case SPECIAL:
				{
				alt5=4;
				}
				break;
			case FILTER:
				{
				alt5=5;
				}
				break;
			case HEX:
				{
				alt5=6;
				}
				break;
			case STRING:
				{
				alt5=7;
				}
				break;
			case ESCAPE:
				{
				alt5=8;
				}
				break;
			case BINARY:
			case SST:
			case SWITCH:
				{
				alt5=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:117:3: ASTERISK
					{
					ASTERISK10=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_value271);  
					stream_ASTERISK.add(ASTERISK10);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 117:12: -> ^( TOKEN[$ASTERISK.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:117:15: ^( TOKEN[$ASTERISK.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOKEN, (ASTERISK10!=null?ASTERISK10.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:119:3: TOKEN
					{
					root_0 = (CommonTree)adaptor.nil();


					TOKEN11=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_value286); 
					TOKEN11_tree = (CommonTree)adaptor.create(TOKEN11);
					adaptor.addChild(root_0, TOKEN11_tree);

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:121:3: VARIABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					VARIABLE12=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_value294); 
					VARIABLE12_tree = (CommonTree)adaptor.create(VARIABLE12);
					adaptor.addChild(root_0, VARIABLE12_tree);

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:123:3: SPECIAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SPECIAL13=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value302); 
					SPECIAL13_tree = (CommonTree)adaptor.create(SPECIAL13);
					adaptor.addChild(root_0, SPECIAL13_tree);

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:125:3: FILTER
					{
					root_0 = (CommonTree)adaptor.nil();


					FILTER14=(Token)match(input,FILTER,FOLLOW_FILTER_in_value312); 
					FILTER14_tree = (CommonTree)adaptor.create(FILTER14);
					adaptor.addChild(root_0, FILTER14_tree);

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:127:3: HEX
					{
					HEX15=(Token)match(input,HEX,FOLLOW_HEX_in_value320);  
					stream_HEX.add(HEX15);

					// AST REWRITE
					// elements: HEX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:7: -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(HEX, (HEX15!=null?HEX15.getText():null).substring(2, (HEX15!=null?HEX15.getText():null).length()-1)));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:129:3: STRING
					{
					STRING16=(Token)match(input,STRING,FOLLOW_STRING_in_value333);  
					stream_STRING.add(STRING16);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 129:10: -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace(\"''\", \"'\")] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:129:13: ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace(\"''\", \"'\")] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, (STRING16!=null?STRING16.getText():null).substring(1, (STRING16!=null?STRING16.getText():null).length()-1).replace("''", "'")), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:131:3: ESCAPE
					{
					ESCAPE17=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_value350);  
					stream_ESCAPE.add(ESCAPE17);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 131:10: -> ^( STRING[\"''\"] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:131:13: ^( STRING[\"''\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "''"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:133:3: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_value365);
					function18=function();
					state._fsp--;

					adaptor.addChild(root_0, function18.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:136:1: operator : ( CAT | BCAT | TCAT );
	public final CLParameterParser.operator_return operator() throws RecognitionException {
		CLParameterParser.operator_return retval = new CLParameterParser.operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;

		CommonTree set19_tree=null;

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:136:9: ( CAT | BCAT | TCAT )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set19=input.LT(1);
			if ( input.LA(1)==BCAT||input.LA(1)==CAT||input.LA(1)==TCAT ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set19));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operator"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:144:1: function : ( SST list -> ^( FUNCTION[\"\\%SST\"] list ) | BINARY list -> ^( FUNCTION[\"\\%BIN\"] list ) | SWITCH list -> ^( FUNCTION[\"\\%SWITCH\"] list ) );
	public final CLParameterParser.function_return function() throws RecognitionException {
		CLParameterParser.function_return retval = new CLParameterParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SST20=null;
		Token BINARY22=null;
		Token SWITCH24=null;
		ParserRuleReturnScope list21 =null;
		ParserRuleReturnScope list23 =null;
		ParserRuleReturnScope list25 =null;

		CommonTree SST20_tree=null;
		CommonTree BINARY22_tree=null;
		CommonTree SWITCH24_tree=null;
		RewriteRuleTokenStream stream_SST=new RewriteRuleTokenStream(adaptor,"token SST");
		RewriteRuleTokenStream stream_BINARY=new RewriteRuleTokenStream(adaptor,"token BINARY");
		RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:144:9: ( SST list -> ^( FUNCTION[\"\\%SST\"] list ) | BINARY list -> ^( FUNCTION[\"\\%BIN\"] list ) | SWITCH list -> ^( FUNCTION[\"\\%SWITCH\"] list ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case SST:
				{
				alt6=1;
				}
				break;
			case BINARY:
				{
				alt6=2;
				}
				break;
			case SWITCH:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:145:3: SST list
					{
					SST20=(Token)match(input,SST,FOLLOW_SST_in_function404);  
					stream_SST.add(SST20);

					pushFollow(FOLLOW_list_in_function406);
					list21=list();
					state._fsp--;

					stream_list.add(list21.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 145:12: -> ^( FUNCTION[\"\\%SST\"] list )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:145:15: ^( FUNCTION[\"\\%SST\"] list )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "%SST"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:147:3: BINARY list
					{
					BINARY22=(Token)match(input,BINARY,FOLLOW_BINARY_in_function423);  
					stream_BINARY.add(BINARY22);

					pushFollow(FOLLOW_list_in_function425);
					list23=list();
					state._fsp--;

					stream_list.add(list23.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 147:15: -> ^( FUNCTION[\"\\%BIN\"] list )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:147:18: ^( FUNCTION[\"\\%BIN\"] list )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "%BIN"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:149:3: SWITCH list
					{
					SWITCH24=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_function442);  
					stream_SWITCH.add(SWITCH24);

					pushFollow(FOLLOW_list_in_function444);
					list25=list();
					state._fsp--;

					stream_list.add(list25.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 149:15: -> ^( FUNCTION[\"\\%SWITCH\"] list )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:149:18: ^( FUNCTION[\"\\%SWITCH\"] list )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "%SWITCH"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"

	// Delegated rules



	public static final BitSet FOLLOW_elem_in_parse118 = new BitSet(new long[]{0x000113C201140242L});
	public static final BitSet FOLLOW_composite_in_elem152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_elem154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_composite183 = new BitSet(new long[]{0x0000080000000902L});
	public static final BitSet FOLLOW_operator_in_composite186 = new BitSet(new long[]{0x000113C001140240L});
	public static final BitSet FOLLOW_value_in_composite188 = new BitSet(new long[]{0x0000080000000902L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_list229 = new BitSet(new long[]{0x000113C201142240L});
	public static final BitSet FOLLOW_elem_in_list232 = new BitSet(new long[]{0x000113C201142240L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_list236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASTERISK_in_value271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_value286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_value294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_value312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ESCAPE_in_value350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_value365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SST_in_function404 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_list_in_function406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_function423 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_list_in_function425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_function442 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_list_in_function444 = new BitSet(new long[]{0x0000000000000002L});
}
