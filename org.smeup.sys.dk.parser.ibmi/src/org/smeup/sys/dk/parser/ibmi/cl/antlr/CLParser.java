// $ANTLR 3.5.1 /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g 2015-05-26 20:06:35

  package org.smeup.sys.dk.parser.ibmi.cl.antlr;

  import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;
import org.smeup.sys.dk.parser.ibmi.cl.util.CLParserHelper;


@SuppressWarnings("all")
public class CLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APOS", "CHAR_SPECIAL", "CL", 
		"CLOSE_BRACE", "CMD_NAME", "COMMAND", "COMMENT", "CR", "ESCAPE", "FUN", 
		"LABEL", "OPEN_BRACE", "PAR", "PAREN", "PAR_NAME", "PAR_VALUE", "POS_PAR", 
		"ROW", "STRING", "TOKEN", "WS"
	};
	public static final int EOF=-1;
	public static final int APOS=4;
	public static final int CHAR_SPECIAL=5;
	public static final int CL=6;
	public static final int CLOSE_BRACE=7;
	public static final int CMD_NAME=8;
	public static final int COMMAND=9;
	public static final int COMMENT=10;
	public static final int CR=11;
	public static final int ESCAPE=12;
	public static final int FUN=13;
	public static final int LABEL=14;
	public static final int OPEN_BRACE=15;
	public static final int PAR=16;
	public static final int PAREN=17;
	public static final int PAR_NAME=18;
	public static final int PAR_VALUE=19;
	public static final int POS_PAR=20;
	public static final int ROW=21;
	public static final int STRING=22;
	public static final int TOKEN=23;
	public static final int WS=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g"; }



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
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:93:1: parse : ( row | ( ( WS )* CR ) )* EOF -> ^( CL[$parse.text] ( row )* ) ;
	public final CLParser.parse_return parse() throws RecognitionException {
		CLParser.parse_return retval = new CLParser.parse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WS2=null;
		Token CR3=null;
		Token EOF4=null;
		ParserRuleReturnScope row1 =null;

		CommonTree WS2_tree=null;
		CommonTree CR3_tree=null;
		CommonTree EOF4_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_CR=new RewriteRuleTokenStream(adaptor,"token CR");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_row=new RewriteRuleSubtreeStream(adaptor,"rule row");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:93:8: ( ( row | ( ( WS )* CR ) )* EOF -> ^( CL[$parse.text] ( row )* ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:3: ( row | ( ( WS )* CR ) )* EOF
			{
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:3: ( row | ( ( WS )* CR ) )*
			loop2:
			while (true) {
				int alt2=3;
				alt2 = dfa2.predict(input);
				switch (alt2) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:4: row
					{
					pushFollow(FOLLOW_row_in_parse129);
					row1=row();
					state._fsp--;

					stream_row.add(row1.getTree());
					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:10: ( ( WS )* CR )
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:10: ( ( WS )* CR )
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:11: ( WS )* CR
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:11: ( WS )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==WS) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:12: WS
							{
							WS2=(Token)match(input,WS,FOLLOW_WS_in_parse135);  
							stream_WS.add(WS2);

							}
							break;

						default :
							break loop1;
						}
					}

					CR3=(Token)match(input,CR,FOLLOW_CR_in_parse139);  
					stream_CR.add(CR3);

					}

					}
					break;

				default :
					break loop2;
				}
			}

			EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_parse144);  
			stream_EOF.add(EOF4);

			// AST REWRITE
			// elements: row
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 94:27: -> ^( CL[$parse.text] ( row )* )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:29: ^( CL[$parse.text] ( row )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CL, input.toString(retval.start,input.LT(-1))), root_1);
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:94:47: ( row )*
				while ( stream_row.hasNext() ) {
					adaptor.addChild(root_1, stream_row.nextTree());
				}
				stream_row.reset();

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


	public static class row_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "row"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:97:1: row : ( single_label | command_row );
	public final CLParser.row_return row() throws RecognitionException {
		CLParser.row_return retval = new CLParser.row_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope single_label5 =null;
		ParserRuleReturnScope command_row6 =null;


		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:97:5: ( single_label | command_row )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:98:5: single_label
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_single_label_in_row168);
					single_label5=single_label();
					state._fsp--;

					adaptor.addChild(root_0, single_label5.getTree());

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:99:7: command_row
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_command_row_in_row176);
					command_row6=command_row();
					state._fsp--;

					adaptor.addChild(root_0, command_row6.getTree());

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
	// $ANTLR end "row"


	public static class single_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "single_label"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:102:1: single_label : label ( WS )* CR -> ^( ROW[$single_label.text] label ) ;
	public final CLParser.single_label_return single_label() throws RecognitionException {
		CLParser.single_label_return retval = new CLParser.single_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WS8=null;
		Token CR9=null;
		ParserRuleReturnScope label7 =null;

		CommonTree WS8_tree=null;
		CommonTree CR9_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_CR=new RewriteRuleTokenStream(adaptor,"token CR");
		RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:102:15: ( label ( WS )* CR -> ^( ROW[$single_label.text] label ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:103:5: label ( WS )* CR
			{
			pushFollow(FOLLOW_label_in_single_label194);
			label7=label();
			state._fsp--;

			stream_label.add(label7.getTree());
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:103:11: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:103:12: WS
					{
					WS8=(Token)match(input,WS,FOLLOW_WS_in_single_label197);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop4;
				}
			}

			CR9=(Token)match(input,CR,FOLLOW_CR_in_single_label201);  
			stream_CR.add(CR9);

			// AST REWRITE
			// elements: label
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 103:20: -> ^( ROW[$single_label.text] label )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:103:22: ^( ROW[$single_label.text] label )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROW, input.toString(retval.start,input.LT(-1))), root_1);
				adaptor.addChild(root_1, stream_label.nextTree());
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
	// $ANTLR end "single_label"


	public static class command_row_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "command_row"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:106:1: command_row : ( label )? ( WS )* command CR -> ^( ROW[$command_row.text] ( label )? command ) ;
	public final CLParser.command_row_return command_row() throws RecognitionException {
		CLParser.command_row_return retval = new CLParser.command_row_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WS11=null;
		Token CR13=null;
		ParserRuleReturnScope label10 =null;
		ParserRuleReturnScope command12 =null;

		CommonTree WS11_tree=null;
		CommonTree CR13_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_CR=new RewriteRuleTokenStream(adaptor,"token CR");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:106:12: ( ( label )? ( WS )* command CR -> ^( ROW[$command_row.text] ( label )? command ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:2: ( label )? ( WS )* command CR
			{
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:2: ( label )?
			int alt5=2;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:3: label
					{
					pushFollow(FOLLOW_label_in_command_row223);
					label10=label();
					state._fsp--;

					stream_label.add(label10.getTree());
					}
					break;

			}

			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:11: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:12: WS
					{
					WS11=(Token)match(input,WS,FOLLOW_WS_in_command_row228);  
					stream_WS.add(WS11);

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_command_in_command_row232);
			command12=command();
			state._fsp--;

			stream_command.add(command12.getTree());
			CR13=(Token)match(input,CR,FOLLOW_CR_in_command_row234);  
			stream_CR.add(CR13);

			// AST REWRITE
			// elements: label, command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 107:28: -> ^( ROW[$command_row.text] ( label )? command )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:30: ^( ROW[$command_row.text] ( label )? command )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROW, input.toString(retval.start,input.LT(-1))), root_1);
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:107:55: ( label )?
				if ( stream_label.hasNext() ) {
					adaptor.addChild(root_1, stream_label.nextTree());
				}
				stream_label.reset();

				adaptor.addChild(root_1, stream_command.nextTree());
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
	// $ANTLR end "command_row"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:110:1: label : ( WS )* LABEL -> ^( LABEL[$LABEL.text.substring(0, $LABEL.text.length()-1)] ) ;
	public final CLParser.label_return label() throws RecognitionException {
		CLParser.label_return retval = new CLParser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WS14=null;
		Token LABEL15=null;

		CommonTree WS14_tree=null;
		CommonTree LABEL15_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_LABEL=new RewriteRuleTokenStream(adaptor,"token LABEL");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:110:7: ( ( WS )* LABEL -> ^( LABEL[$LABEL.text.substring(0, $LABEL.text.length()-1)] ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:111:2: ( WS )* LABEL
			{
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:111:2: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:111:3: WS
					{
					WS14=(Token)match(input,WS,FOLLOW_WS_in_label261);  
					stream_WS.add(WS14);

					}
					break;

				default :
					break loop7;
				}
			}

			LABEL15=(Token)match(input,LABEL,FOLLOW_LABEL_in_label265);  
			stream_LABEL.add(LABEL15);

			// AST REWRITE
			// elements: LABEL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 111:14: -> ^( LABEL[$LABEL.text.substring(0, $LABEL.text.length()-1)] )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:111:17: ^( LABEL[$LABEL.text.substring(0, $LABEL.text.length()-1)] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, (LABEL15!=null?LABEL15.getText():null).substring(0, (LABEL15!=null?LABEL15.getText():null).length()-1)), root_1);
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
	// $ANTLR end "label"


	public static class command_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "command"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:114:1: command : cmd_name ( ( WS )+ pos_parm )* ( ( WS )+ parm )* ( WS )* -> ^( COMMAND[$command.text] cmd_name ( pos_parm )* ( parm )* ) ;
	public final CLParser.command_return command() throws RecognitionException {
		CLParser.command_return retval = new CLParser.command_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WS17=null;
		Token WS19=null;
		Token WS21=null;
		ParserRuleReturnScope cmd_name16 =null;
		ParserRuleReturnScope pos_parm18 =null;
		ParserRuleReturnScope parm20 =null;

		CommonTree WS17_tree=null;
		CommonTree WS19_tree=null;
		CommonTree WS21_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_parm=new RewriteRuleSubtreeStream(adaptor,"rule parm");
		RewriteRuleSubtreeStream stream_pos_parm=new RewriteRuleSubtreeStream(adaptor,"rule pos_parm");
		RewriteRuleSubtreeStream stream_cmd_name=new RewriteRuleSubtreeStream(adaptor,"rule cmd_name");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:115:3: ( cmd_name ( ( WS )+ pos_parm )* ( ( WS )+ parm )* ( WS )* -> ^( COMMAND[$command.text] cmd_name ( pos_parm )* ( parm )* ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:3: cmd_name ( ( WS )+ pos_parm )* ( ( WS )+ parm )* ( WS )*
			{
			pushFollow(FOLLOW_cmd_name_in_command287);
			cmd_name16=cmd_name();
			state._fsp--;

			stream_cmd_name.add(cmd_name16.getTree());
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:12: ( ( WS )+ pos_parm )*
			loop9:
			while (true) {
				int alt9=2;
				alt9 = dfa9.predict(input);
				switch (alt9) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:13: ( WS )+ pos_parm
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:13: ( WS )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==WS) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:14: WS
							{
							WS17=(Token)match(input,WS,FOLLOW_WS_in_command291);  
							stream_WS.add(WS17);

							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					pushFollow(FOLLOW_pos_parm_in_command295);
					pos_parm18=pos_parm();
					state._fsp--;

					stream_pos_parm.add(pos_parm18.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:30: ( ( WS )+ parm )*
			loop11:
			while (true) {
				int alt11=2;
				alt11 = dfa11.predict(input);
				switch (alt11) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:31: ( WS )+ parm
					{
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:31: ( WS )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==WS) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:32: WS
							{
							WS19=(Token)match(input,WS,FOLLOW_WS_in_command301);  
							stream_WS.add(WS19);

							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					pushFollow(FOLLOW_parm_in_command305);
					parm20=parm();
					state._fsp--;

					stream_parm.add(parm20.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:44: ( WS )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:45: WS
					{
					WS21=(Token)match(input,WS,FOLLOW_WS_in_command310);  
					stream_WS.add(WS21);

					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: parm, pos_parm, cmd_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 116:50: -> ^( COMMAND[$command.text] cmd_name ( pos_parm )* ( parm )* )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:53: ^( COMMAND[$command.text] cmd_name ( pos_parm )* ( parm )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, input.toString(retval.start,input.LT(-1))), root_1);
				adaptor.addChild(root_1, stream_cmd_name.nextTree());
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:87: ( pos_parm )*
				while ( stream_pos_parm.hasNext() ) {
					adaptor.addChild(root_1, stream_pos_parm.nextTree());
				}
				stream_pos_parm.reset();

				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:116:99: ( parm )*
				while ( stream_parm.hasNext() ) {
					adaptor.addChild(root_1, stream_parm.nextTree());
				}
				stream_parm.reset();

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
	// $ANTLR end "command"


	public static class cmd_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cmd_name"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:119:1: cmd_name : TOKEN -> ^( CMD_NAME[$TOKEN.text] ) ;
	public final CLParser.cmd_name_return cmd_name() throws RecognitionException {
		CLParser.cmd_name_return retval = new CLParser.cmd_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN22=null;

		CommonTree TOKEN22_tree=null;
		RewriteRuleTokenStream stream_TOKEN=new RewriteRuleTokenStream(adaptor,"token TOKEN");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:120:3: ( TOKEN -> ^( CMD_NAME[$TOKEN.text] ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:121:3: TOKEN
			{
			TOKEN22=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cmd_name346);  
			stream_TOKEN.add(TOKEN22);

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
			// 121:9: -> ^( CMD_NAME[$TOKEN.text] )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:121:12: ^( CMD_NAME[$TOKEN.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_NAME, (TOKEN22!=null?TOKEN22.getText():null)), root_1);
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
	// $ANTLR end "cmd_name"


	public static class pos_parm_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pos_parm"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:124:1: pos_parm : ( TOKEN -> ^( POS_PAR[$TOKEN.text] ) | PAREN -> ^( POS_PAR[$PAREN.text] ) | STRING -> ^( POS_PAR[$STRING.text] ) | fun );
	public final CLParser.pos_parm_return pos_parm() throws RecognitionException {
		CLParser.pos_parm_return retval = new CLParser.pos_parm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN23=null;
		Token PAREN24=null;
		Token STRING25=null;
		ParserRuleReturnScope fun26 =null;

		CommonTree TOKEN23_tree=null;
		CommonTree PAREN24_tree=null;
		CommonTree STRING25_tree=null;
		RewriteRuleTokenStream stream_PAREN=new RewriteRuleTokenStream(adaptor,"token PAREN");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_TOKEN=new RewriteRuleTokenStream(adaptor,"token TOKEN");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:125:3: ( TOKEN -> ^( POS_PAR[$TOKEN.text] ) | PAREN -> ^( POS_PAR[$PAREN.text] ) | STRING -> ^( POS_PAR[$STRING.text] ) | fun )
			int alt13=4;
			switch ( input.LA(1) ) {
			case TOKEN:
				{
				alt13=1;
				}
				break;
			case PAREN:
				{
				alt13=2;
				}
				break;
			case STRING:
				{
				alt13=3;
				}
				break;
			case FUN:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:126:3: TOKEN
					{
					TOKEN23=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pos_parm368);  
					stream_TOKEN.add(TOKEN23);

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
					// 126:10: -> ^( POS_PAR[$TOKEN.text] )
					{
						// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:126:13: ^( POS_PAR[$TOKEN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POS_PAR, (TOKEN23!=null?TOKEN23.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:128:3: PAREN
					{
					PAREN24=(Token)match(input,PAREN,FOLLOW_PAREN_in_pos_parm384);  
					stream_PAREN.add(PAREN24);

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
					// 128:9: -> ^( POS_PAR[$PAREN.text] )
					{
						// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:128:12: ^( POS_PAR[$PAREN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POS_PAR, (PAREN24!=null?PAREN24.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:130:3: STRING
					{
					STRING25=(Token)match(input,STRING,FOLLOW_STRING_in_pos_parm399);  
					stream_STRING.add(STRING25);

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
					// 130:10: -> ^( POS_PAR[$STRING.text] )
					{
						// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:130:13: ^( POS_PAR[$STRING.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POS_PAR, (STRING25!=null?STRING25.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:132:3: fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fun_in_pos_parm414);
					fun26=fun();
					state._fsp--;

					adaptor.addChild(root_0, fun26.getTree());

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
	// $ANTLR end "pos_parm"


	public static class fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fun"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:135:1: fun : FUN PAREN -> ^( POS_PAR[$fun.text] ) ;
	public final CLParser.fun_return fun() throws RecognitionException {
		CLParser.fun_return retval = new CLParser.fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUN27=null;
		Token PAREN28=null;

		CommonTree FUN27_tree=null;
		CommonTree PAREN28_tree=null;
		RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
		RewriteRuleTokenStream stream_PAREN=new RewriteRuleTokenStream(adaptor,"token PAREN");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:136:3: ( FUN PAREN -> ^( POS_PAR[$fun.text] ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:137:3: FUN PAREN
			{
			FUN27=(Token)match(input,FUN,FOLLOW_FUN_in_fun429);  
			stream_FUN.add(FUN27);

			PAREN28=(Token)match(input,PAREN,FOLLOW_PAREN_in_fun431);  
			stream_PAREN.add(PAREN28);

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
			// 137:13: -> ^( POS_PAR[$fun.text] )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:137:16: ^( POS_PAR[$fun.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POS_PAR, input.toString(retval.start,input.LT(-1))), root_1);
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
	// $ANTLR end "fun"


	public static class parm_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parm"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:140:1: parm : parm_name parm_value -> ^( PAR[$parm.text] parm_name parm_value ) ;
	public final CLParser.parm_return parm() throws RecognitionException {
		CLParser.parm_return retval = new CLParser.parm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope parm_name29 =null;
		ParserRuleReturnScope parm_value30 =null;

		RewriteRuleSubtreeStream stream_parm_name=new RewriteRuleSubtreeStream(adaptor,"rule parm_name");
		RewriteRuleSubtreeStream stream_parm_value=new RewriteRuleSubtreeStream(adaptor,"rule parm_value");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:141:3: ( parm_name parm_value -> ^( PAR[$parm.text] parm_name parm_value ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:142:3: parm_name parm_value
			{
			pushFollow(FOLLOW_parm_name_in_parm453);
			parm_name29=parm_name();
			state._fsp--;

			stream_parm_name.add(parm_name29.getTree());
			pushFollow(FOLLOW_parm_value_in_parm455);
			parm_value30=parm_value();
			state._fsp--;

			stream_parm_value.add(parm_value30.getTree());
			// AST REWRITE
			// elements: parm_name, parm_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 142:24: -> ^( PAR[$parm.text] parm_name parm_value )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:142:27: ^( PAR[$parm.text] parm_name parm_value )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAR, input.toString(retval.start,input.LT(-1))), root_1);
				adaptor.addChild(root_1, stream_parm_name.nextTree());
				adaptor.addChild(root_1, stream_parm_value.nextTree());
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
	// $ANTLR end "parm"


	public static class parm_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parm_name"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:145:2: parm_name : TOKEN -> ^( PAR_NAME[$TOKEN.text] ) ;
	public final CLParser.parm_name_return parm_name() throws RecognitionException {
		CLParser.parm_name_return retval = new CLParser.parm_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN31=null;

		CommonTree TOKEN31_tree=null;
		RewriteRuleTokenStream stream_TOKEN=new RewriteRuleTokenStream(adaptor,"token TOKEN");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:146:3: ( TOKEN -> ^( PAR_NAME[$TOKEN.text] ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:147:3: TOKEN
			{
			TOKEN31=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_parm_name482);  
			stream_TOKEN.add(TOKEN31);

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
			// 147:9: -> ^( PAR_NAME[$TOKEN.text] )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:147:12: ^( PAR_NAME[$TOKEN.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAR_NAME, (TOKEN31!=null?TOKEN31.getText():null)), root_1);
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
	// $ANTLR end "parm_name"


	public static class parm_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parm_value"
	// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:150:2: parm_value : PAREN -> ^( PAR_VALUE[$PAREN.text] ) ;
	public final CLParser.parm_value_return parm_value() throws RecognitionException {
		CLParser.parm_value_return retval = new CLParser.parm_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PAREN32=null;

		CommonTree PAREN32_tree=null;
		RewriteRuleTokenStream stream_PAREN=new RewriteRuleTokenStream(adaptor,"token PAREN");

		try {
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:151:3: ( PAREN -> ^( PAR_VALUE[$PAREN.text] ) )
			// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:152:3: PAREN
			{
			PAREN32=(Token)match(input,PAREN,FOLLOW_PAREN_in_parm_value505);  
			stream_PAREN.add(PAREN32);

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
			// 152:9: -> ^( PAR_VALUE[$PAREN.text] )
			{
				// /home/jamiro/Dati/eclipse/workspace_asup_0.8.0/org.asup.dk.parser.ibmi/src/org/asup/dk/parser/ibmi/cl/antlr/CL.g:152:12: ^( PAR_VALUE[$PAREN.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAR_VALUE, (PAREN32!=null?PAREN32.getText():null)), root_1);
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
	// $ANTLR end "parm_value"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA9 dfa9 = new DFA9(this);
	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA2_eotS =
		"\5\uffff";
	static final String DFA2_eofS =
		"\1\1\4\uffff";
	static final String DFA2_minS =
		"\1\13\1\uffff\1\13\2\uffff";
	static final String DFA2_maxS =
		"\1\30\1\uffff\1\30\2\uffff";
	static final String DFA2_acceptS =
		"\1\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA2_specialS =
		"\5\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\4\2\uffff\1\3\10\uffff\1\3\1\2",
			"",
			"\1\4\2\uffff\1\3\10\uffff\1\3\1\2",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 94:3: ( row | ( ( WS )* CR ) )*";
		}
	}

	static final String DFA3_eotS =
		"\6\uffff";
	static final String DFA3_eofS =
		"\6\uffff";
	static final String DFA3_minS =
		"\2\16\1\13\1\uffff\1\13\1\uffff";
	static final String DFA3_maxS =
		"\3\30\1\uffff\1\30\1\uffff";
	static final String DFA3_acceptS =
		"\3\uffff\1\2\1\uffff\1\1";
	static final String DFA3_specialS =
		"\6\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\10\uffff\1\3\1\1",
			"\1\2\10\uffff\1\3\1\1",
			"\1\5\13\uffff\1\3\1\4",
			"",
			"\1\5\13\uffff\1\3\1\4",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "97:1: row : ( single_label | command_row );";
		}
	}

	static final String DFA5_eotS =
		"\4\uffff";
	static final String DFA5_eofS =
		"\4\uffff";
	static final String DFA5_minS =
		"\2\16\2\uffff";
	static final String DFA5_maxS =
		"\2\30\2\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA5_specialS =
		"\4\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\2\10\uffff\1\3\1\1",
			"\1\2\10\uffff\1\3\1\1",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "107:2: ( label )?";
		}
	}

	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\13\1\uffff\1\13\1\uffff";
	static final String DFA9_maxS =
		"\2\30\1\uffff\1\30\1\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\14\uffff\1\1",
			"\1\2\1\uffff\1\4\3\uffff\1\4\4\uffff\1\4\1\3\1\1",
			"",
			"\1\4\5\uffff\1\2\6\uffff\1\4",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 116:12: ( ( WS )+ pos_parm )*";
		}
	}

	static final String DFA11_eotS =
		"\4\uffff";
	static final String DFA11_eofS =
		"\4\uffff";
	static final String DFA11_minS =
		"\2\13\2\uffff";
	static final String DFA11_maxS =
		"\2\30\2\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA11_specialS =
		"\4\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\14\uffff\1\1",
			"\1\2\13\uffff\1\3\1\1",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 116:30: ( ( WS )+ parm )*";
		}
	}

	public static final BitSet FOLLOW_row_in_parse129 = new BitSet(new long[]{0x0000000001804800L});
	public static final BitSet FOLLOW_WS_in_parse135 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_CR_in_parse139 = new BitSet(new long[]{0x0000000001804800L});
	public static final BitSet FOLLOW_EOF_in_parse144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_label_in_row168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_row_in_row176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_single_label194 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_single_label197 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_CR_in_single_label201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_command_row223 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_WS_in_command_row228 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_command_in_command_row232 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CR_in_command_row234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_label261 = new BitSet(new long[]{0x0000000001004000L});
	public static final BitSet FOLLOW_LABEL_in_label265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cmd_name_in_command287 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_WS_in_command291 = new BitSet(new long[]{0x0000000001C22000L});
	public static final BitSet FOLLOW_pos_parm_in_command295 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_WS_in_command301 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_parm_in_command305 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_WS_in_command310 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_TOKEN_in_cmd_name346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_pos_parm368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAREN_in_pos_parm384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_pos_parm399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_in_pos_parm414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_fun429 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_PAREN_in_fun431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parm_name_in_parm453 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_parm_value_in_parm455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_parm_name482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAREN_in_parm_value505 = new BitSet(new long[]{0x0000000000000002L});
}
