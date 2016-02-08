/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
import org.smeup.sys.dk.parser.ibmi.cl.antlr.CLLexer;
import org.smeup.sys.dk.parser.ibmi.cl.antlr.CLParser;
import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;
import org.smeup.sys.dk.parser.ibmi.cl.model.pgm.CLObject;

public class CLParserWrapper extends CLAbstractParserWrapper implements ParserInterface<CLObject> {

	@Override
	public CLObject parse(InputStream in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRInputStream(in, "UTF-8"));
		} catch (IOException e) {
            throw new CLScriptException(e);
		}
	}

	@Override
	public CLObject parse(Reader in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRReaderStream(in));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public CLObject parse(File f) throws CLScriptException {

		try {
			return invokeParser(new ANTLRFileStream(f.getCanonicalPath(), "UTF-8"));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public CLObject parse(String script) throws CLScriptException {
		return invokeParser(new ANTLRStringStream(script));
	}

	private CLObject invokeParser(CharStream charstream) throws CLScriptException {
		try {

            CLLexer lex = new CLLexer(charstream);
            CommonTokenStream tokens = new CommonTokenStream(lex);

            CLParser g = new CLParser(tokens);

            CommonTree ast = g.parse().getTree();


            CLObject clObject = new CLObject();
            clObject.setFather(null);
            clObject.setText(ast.getText());

            build(clObject, ast);

            return clObject;


        } catch (RecognitionException ex) {
            ex.printStackTrace();
            throw new CLScriptException(ex);
        }
	}

}
