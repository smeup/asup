/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 * 
 * 
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.smeup.sys.dk.parser.ibmi.cl.antlr.CLParameterLexer;
import org.smeup.sys.dk.parser.ibmi.cl.antlr.CLParameterParser;
import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmAbstractComponent;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmFilter;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmFunction;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmFunction.CLParmFunctionType;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmHexadecimal;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmList;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmSpecial;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmString;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmStringOperator;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmStringOperator.CLParmStringOperatorType;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmToken;
import org.smeup.sys.dk.parser.ibmi.cl.model.parm.CLParmVariable;

public class CLParameterParserWrapper implements ParserInterface <CLParmAbstractComponent> {


	@Override
	public CLParmAbstractComponent parse(InputStream in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRInputStream(in, "UTF-8"));
		} catch (IOException e) {
            throw new CLScriptException(e);
		}
	}

	@Override
	public CLParmAbstractComponent parse(Reader in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRReaderStream(in));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public CLParmAbstractComponent parse(File f) throws CLScriptException {

		try {
			return invokeParser(new ANTLRFileStream(f.getCanonicalPath(), "UTF-8"));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public CLParmAbstractComponent parse(String script) throws CLScriptException {
		return invokeParser(new ANTLRStringStream(script.trim() + "\n"));
	}



	private CLParmAbstractComponent invokeParser(CharStream charstream) throws CLScriptException {
		try {

			// create a lexer & parser
		    CLParameterLexer lexer = new CLParameterLexer(charstream);
		    CLParameterParser parser = new CLParameterParser(new CommonTokenStream(lexer));

		    CommonTree tree = (CommonTree)parser.parse().getTree();
            return buildAST(tree.getText(), tree);

        } catch (RecognitionException ex) {
            ex.printStackTrace();
            throw new CLScriptException(ex);
        }
	}


	private CLParmAbstractComponent buildAST(String parameter, CommonTree tree) {
		
		// The response is always a list of values, so return an object of this type		
		
		return build(null, tree);

	}
	
	CLParmAbstractComponent build(CLParmAbstractComponent father, Tree antlrNode) {
		
		CLParmAbstractComponent buildNode = null; 
		switch (antlrNode.getType()) {
		
		case CLParameterLexer.LIST:
			
			buildNode = new CLParmList();
			buildNode.setText(antlrNode.getText());
			
			for (int i = 0; i < antlrNode.getChildCount(); i++) {
				buildNode.addChild(build(buildNode, antlrNode.getChild(i)));
			}
			
			break;
		
		case CLParameterLexer.TOKEN:
			
			buildNode = new CLParmToken();
			buildNode.setText(antlrNode.getText());
						
			break;
		
		case CLParameterLexer.VARIABLE:
			
			buildNode = new CLParmVariable();
			buildNode.setText(antlrNode.getText());
			
			break;
			
		case CLParameterLexer.SPECIAL:
			
			buildNode = new CLParmSpecial();
			buildNode.setText(antlrNode.getText());
			
			break;
		
		case CLParameterLexer.FILTER:
			
			buildNode = new CLParmFilter();
			buildNode.setText(antlrNode.getText());
			
			break;
		
		case CLParameterLexer.HEX:
			
			buildNode = new CLParmHexadecimal();
			buildNode.setText(antlrNode.getText());
			
			break;	

		case CLParameterLexer.STRING:
			
			buildNode = new CLParmString();
			buildNode.setText(antlrNode.getText());
			
			break;	
			
		case CLParameterLexer.FUNCTION:
			
			buildNode = new CLParmFunction();
			buildNode.setText(antlrNode.getText());		
			
			if ("%SST".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.SST);
			} else if ("%SWITCH".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.SWITCH);
			} else if ("%BINARY".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.BINARY);
			} else if ("%BIN".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmFunction)buildNode).setFunctionType(CLParmFunctionType.BIN);
			}
			
			Tree funChild = antlrNode.getChild(0);
			CLParmList parmAsList = (CLParmList) build(buildNode, funChild);
						
			buildNode.addChild(parmAsList);
			((CLParmFunction) buildNode).setParms(parmAsList);

			break;	
		
		case CLParameterLexer.STR_OPERATOR:			
			
			buildNode = new CLParmStringOperator();
			
			if ("*CAT".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmStringOperator)buildNode).setOperatorType(CLParmStringOperatorType.CAT);
			} else if ("*BCAT".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmStringOperator)buildNode).setOperatorType(CLParmStringOperatorType.BCAT);
			} else if ("*TCAT".equalsIgnoreCase(antlrNode.getText())) {
				((CLParmStringOperator)buildNode).setOperatorType(CLParmStringOperatorType.TCAT);
			} 
			
			for (int i = 0; i < antlrNode.getChildCount(); i++) {
				buildNode.addChild(build(buildNode, antlrNode.getChild(i)));
			}
			
			break;

		default:
			break;
		}
		
		// Set father node
		buildNode.setFather(father);
				
		return buildNode;
	}
		
}
