// $ANTLR 3.5.1 C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g 2016-09-22 16:06:44

  package org.smeup.sys.dk.parser.ibmi.cl.antlr;
  
  import org.smeup.sys.dk.parser.ibmi.cl.util.CLParserHelper;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CLParameterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "APOS", "ASTERISK", "B", 
		"BCAT", "BINARY", "C", "CAT", "CHAR_SPECIAL", "CLOSE_BRACE", "COMMENT", 
		"CR", "D", "E", "ESCAPE", "F", "FILTER", "FUNCTION", "G", "H", "HEX", 
		"I", "J", "K", "L", "LIST", "M", "N", "O", "OPEN_BRACE", "P", "Q", "R", 
		"S", "SPECIAL", "SST", "STRING", "STR_OPERATOR", "SWITCH", "T", "TCAT", 
		"TOKEN", "U", "V", "VARIABLE", "W", "WS", "X", "Y", "Z"
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
	public static final int STR_OPERATOR=41;
	public static final int SWITCH=42;
	public static final int T=43;
	public static final int TCAT=44;
	public static final int TOKEN=45;
	public static final int U=46;
	public static final int V=47;
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:95:1: parse : ( elem )* -> ^( LIST[$parse.text] ( elem )* ) ;
	public final CLParameterParser.parse_return parse() throws RecognitionException {
		CLParameterParser.parse_return retval = new CLParameterParser.parse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope elem1 =null;

		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:96:3: ( ( elem )* -> ^( LIST[$parse.text] ( elem )* ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:97:2: ( elem )*
			{
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:97:2: ( elem )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ASTERISK||LA1_0==BINARY||LA1_0==ESCAPE||LA1_0==FILTER||LA1_0==HEX||LA1_0==OPEN_BRACE||(LA1_0 >= SPECIAL && LA1_0 <= STRING)||LA1_0==SWITCH||LA1_0==TOKEN||LA1_0==VARIABLE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:97:2: elem
					{
					pushFollow(FOLLOW_elem_in_parse123);
					elem1=elem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_elem.add(elem1.getTree());
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
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 97:8: -> ^( LIST[$parse.text] ( elem )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:97:11: ^( LIST[$parse.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, input.toString(retval.start,input.LT(-1))), root_1);
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:97:31: ( elem )*
				while ( stream_elem.hasNext() ) {
					adaptor.addChild(root_1, stream_elem.nextTree());
				}
				stream_elem.reset();

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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:100:1: elem : ( list | composite );
	public final CLParameterParser.elem_return elem() throws RecognitionException {
		CLParameterParser.elem_return retval = new CLParameterParser.elem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope list2 =null;
		ParserRuleReturnScope composite3 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:101:2: ( list | composite )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==OPEN_BRACE) ) {
				alt2=1;
			}
			else if ( (LA2_0==ASTERISK||LA2_0==BINARY||LA2_0==ESCAPE||LA2_0==FILTER||LA2_0==HEX||(LA2_0 >= SPECIAL && LA2_0 <= STRING)||LA2_0==SWITCH||LA2_0==TOKEN||LA2_0==VARIABLE) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:102:5: list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_list_in_elem157);
					list2=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list2.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:102:10: composite
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_composite_in_elem159);
					composite3=composite();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, composite3.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:105:1: list : OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) ;
	public final CLParameterParser.list_return list() throws RecognitionException {
		CLParameterParser.list_return retval = new CLParameterParser.list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_BRACE4=null;
		Token CLOSE_BRACE6=null;
		ParserRuleReturnScope elem5 =null;

		CommonTree OPEN_BRACE4_tree=null;
		CommonTree CLOSE_BRACE6_tree=null;
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:106:3: ( OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:107:3: OPEN_BRACE ( elem )* CLOSE_BRACE
			{
			OPEN_BRACE4=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_list184); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE4);

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:107:14: ( elem )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ASTERISK||LA3_0==BINARY||LA3_0==ESCAPE||LA3_0==FILTER||LA3_0==HEX||LA3_0==OPEN_BRACE||(LA3_0 >= SPECIAL && LA3_0 <= STRING)||LA3_0==SWITCH||LA3_0==TOKEN||LA3_0==VARIABLE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:107:15: elem
					{
					pushFollow(FOLLOW_elem_in_list187);
					elem5=elem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_elem.add(elem5.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			CLOSE_BRACE6=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_list191); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE6);

			// AST REWRITE
			// elements: elem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 107:34: -> ^( LIST[$list.text] ( elem )* )
			{
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:107:37: ^( LIST[$list.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, input.toString(retval.start,input.LT(-1))), root_1);
				// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:107:57: ( elem )*
				while ( stream_elem.hasNext() ) {
					adaptor.addChild(root_1, stream_elem.nextTree());
				}
				stream_elem.reset();

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


	public static class composite_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "composite"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:110:1: composite : value ( operator ^ value )* ;
	public final CLParameterParser.composite_return composite() throws RecognitionException {
		CLParameterParser.composite_return retval = new CLParameterParser.composite_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope value7 =null;
		ParserRuleReturnScope operator8 =null;
		ParserRuleReturnScope value9 =null;


		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:111:3: ( value ( operator ^ value )* )
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:112:4: value ( operator ^ value )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_value_in_composite230);
			value7=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value7.getTree());

			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:112:10: ( operator ^ value )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BCAT||LA4_0==CAT||LA4_0==TCAT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:112:11: operator ^ value
					{
					pushFollow(FOLLOW_operator_in_composite233);
					operator8=operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(operator8.getTree(), root_0);
					pushFollow(FOLLOW_value_in_composite236);
					value9=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value9.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:115:1: value : ( ASTERISK -> ^( TOKEN[$ASTERISK.text] ) | TOKEN | VARIABLE | SPECIAL | FILTER | HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)] | STRING -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace(\"''\", \"'\")] ) | ESCAPE -> ^( STRING[\"\"] ) | function );
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
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:116:3: ( ASTERISK -> ^( TOKEN[$ASTERISK.text] ) | TOKEN | VARIABLE | SPECIAL | FILTER | HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)] | STRING -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1).replace(\"''\", \"'\")] ) | ESCAPE -> ^( STRING[\"\"] ) | function )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:117:3: ASTERISK
					{
					ASTERISK10=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_value256); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK10);

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

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:119:3: TOKEN
					{
					root_0 = (CommonTree)adaptor.nil();


					TOKEN11=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_value271); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TOKEN11_tree = (CommonTree)adaptor.create(TOKEN11);
					adaptor.addChild(root_0, TOKEN11_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:121:3: VARIABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					VARIABLE12=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_value279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE12_tree = (CommonTree)adaptor.create(VARIABLE12);
					adaptor.addChild(root_0, VARIABLE12_tree);
					}

					}
					break;
				case 4 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:123:3: SPECIAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SPECIAL13=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value287); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SPECIAL13_tree = (CommonTree)adaptor.create(SPECIAL13);
					adaptor.addChild(root_0, SPECIAL13_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:125:3: FILTER
					{
					root_0 = (CommonTree)adaptor.nil();


					FILTER14=(Token)match(input,FILTER,FOLLOW_FILTER_in_value297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FILTER14_tree = (CommonTree)adaptor.create(FILTER14);
					adaptor.addChild(root_0, FILTER14_tree);
					}

					}
					break;
				case 6 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:127:3: HEX
					{
					HEX15=(Token)match(input,HEX,FOLLOW_HEX_in_value305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HEX.add(HEX15);

					// AST REWRITE
					// elements: HEX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:7: -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(HEX, (HEX15!=null?HEX15.getText():null).substring(2, (HEX15!=null?HEX15.getText():null).length()-1)));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:129:3: STRING
					{
					STRING16=(Token)match(input,STRING,FOLLOW_STRING_in_value318); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(STRING16);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
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

					}
					break;
				case 8 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:131:3: ESCAPE
					{
					ESCAPE17=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_value333); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ESCAPE.add(ESCAPE17);

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
					// 131:10: -> ^( STRING[\"\"] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:131:13: ^( STRING[\"\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, ""), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:133:3: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_value348);
					function18=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function18.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:138:1: operator : ( CAT -> ^( STR_OPERATOR[$operator.text] ) | BCAT -> ^( STR_OPERATOR[$operator.text] ) | TCAT -> ^( STR_OPERATOR[$operator.text] ) );
	public final CLParameterParser.operator_return operator() throws RecognitionException {
		CLParameterParser.operator_return retval = new CLParameterParser.operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAT19=null;
		Token BCAT20=null;
		Token TCAT21=null;

		CommonTree CAT19_tree=null;
		CommonTree BCAT20_tree=null;
		CommonTree TCAT21_tree=null;
		RewriteRuleTokenStream stream_TCAT=new RewriteRuleTokenStream(adaptor,"token TCAT");
		RewriteRuleTokenStream stream_CAT=new RewriteRuleTokenStream(adaptor,"token CAT");
		RewriteRuleTokenStream stream_BCAT=new RewriteRuleTokenStream(adaptor,"token BCAT");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:138:9: ( CAT -> ^( STR_OPERATOR[$operator.text] ) | BCAT -> ^( STR_OPERATOR[$operator.text] ) | TCAT -> ^( STR_OPERATOR[$operator.text] ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case CAT:
				{
				alt6=1;
				}
				break;
			case BCAT:
				{
				alt6=2;
				}
				break;
			case TCAT:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:139:2: CAT
					{
					CAT19=(Token)match(input,CAT,FOLLOW_CAT_in_operator366); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CAT.add(CAT19);

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
					// 139:8: -> ^( STR_OPERATOR[$operator.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:139:11: ^( STR_OPERATOR[$operator.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:141:2: BCAT
					{
					BCAT20=(Token)match(input,BCAT,FOLLOW_BCAT_in_operator381); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BCAT.add(BCAT20);

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
					// 141:10: -> ^( STR_OPERATOR[$operator.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:141:13: ^( STR_OPERATOR[$operator.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:143:2: TCAT
					{
					TCAT21=(Token)match(input,TCAT,FOLLOW_TCAT_in_operator397); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TCAT.add(TCAT21);

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
					// 143:10: -> ^( STR_OPERATOR[$operator.text] )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:143:13: ^( STR_OPERATOR[$operator.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, input.toString(retval.start,input.LT(-1))), root_1);
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
	// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:146:1: function : ( SST list -> ^( FUNCTION[\"\\%SST\"] list ) | BINARY list -> ^( FUNCTION[\"\\%BIN\"] list ) | SWITCH list -> ^( FUNCTION[\"\\%SWITCH\"] list ) );
	public final CLParameterParser.function_return function() throws RecognitionException {
		CLParameterParser.function_return retval = new CLParameterParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SST22=null;
		Token BINARY24=null;
		Token SWITCH26=null;
		ParserRuleReturnScope list23 =null;
		ParserRuleReturnScope list25 =null;
		ParserRuleReturnScope list27 =null;

		CommonTree SST22_tree=null;
		CommonTree BINARY24_tree=null;
		CommonTree SWITCH26_tree=null;
		RewriteRuleTokenStream stream_SST=new RewriteRuleTokenStream(adaptor,"token SST");
		RewriteRuleTokenStream stream_BINARY=new RewriteRuleTokenStream(adaptor,"token BINARY");
		RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:146:9: ( SST list -> ^( FUNCTION[\"\\%SST\"] list ) | BINARY list -> ^( FUNCTION[\"\\%BIN\"] list ) | SWITCH list -> ^( FUNCTION[\"\\%SWITCH\"] list ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case SST:
				{
				alt7=1;
				}
				break;
			case BINARY:
				{
				alt7=2;
				}
				break;
			case SWITCH:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:147:3: SST list
					{
					SST22=(Token)match(input,SST,FOLLOW_SST_in_function419); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SST.add(SST22);

					pushFollow(FOLLOW_list_in_function421);
					list23=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list23.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 147:12: -> ^( FUNCTION[\"\\%SST\"] list )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:147:15: ^( FUNCTION[\"\\%SST\"] list )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "%SST"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:149:3: BINARY list
					{
					BINARY24=(Token)match(input,BINARY,FOLLOW_BINARY_in_function438); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BINARY.add(BINARY24);

					pushFollow(FOLLOW_list_in_function440);
					list25=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list25.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 149:15: -> ^( FUNCTION[\"\\%BIN\"] list )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:149:18: ^( FUNCTION[\"\\%BIN\"] list )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "%BIN"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:151:3: SWITCH list
					{
					SWITCH26=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_function457); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH26);

					pushFollow(FOLLOW_list_in_function459);
					list27=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list27.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 151:15: -> ^( FUNCTION[\"\\%SWITCH\"] list )
					{
						// C:\\Users\\darfores\\git\\asup_0_8_0\\org.smeup.sys.dk.parser.ibmi\\src\\org\\smeup\\sys\\dk\\parser\\ibmi\\cl\\antlr\\CLParameter.g:151:18: ^( FUNCTION[\"\\%SWITCH\"] list )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "%SWITCH"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
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



	public static final BitSet FOLLOW_elem_in_parse123 = new BitSet(new long[]{0x000125C201140242L});
	public static final BitSet FOLLOW_list_in_elem157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_composite_in_elem159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_list184 = new BitSet(new long[]{0x000125C201142240L});
	public static final BitSet FOLLOW_elem_in_list187 = new BitSet(new long[]{0x000125C201142240L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_list191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_composite230 = new BitSet(new long[]{0x0000100000000902L});
	public static final BitSet FOLLOW_operator_in_composite233 = new BitSet(new long[]{0x000125C001140240L});
	public static final BitSet FOLLOW_value_in_composite236 = new BitSet(new long[]{0x0000100000000902L});
	public static final BitSet FOLLOW_ASTERISK_in_value256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_value271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_value279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_value297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ESCAPE_in_value333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_value348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAT_in_operator366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BCAT_in_operator381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TCAT_in_operator397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SST_in_function419 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_list_in_function421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_function438 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_list_in_function440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_function457 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_list_in_function459 = new BitSet(new long[]{0x0000000000000002L});
}
