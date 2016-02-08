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
import org.smeup.sys.dk.parser.ibmi.cl.exceptions.CLScriptException;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.base.BaseExpressionBuilder;
import org.smeup.sys.il.expr.ibmi.cl.CLExpressionHelper;

public class CLExpressionParserWrapper implements ParserInterface <QExpression> {


	@Override
	public QExpression parse(InputStream in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRInputStream(in, "UTF-8"));
		} catch (IOException e) {
            throw new CLScriptException(e);
		}
	}

	@Override
	public QExpression parse(Reader in) throws CLScriptException {

		try {
			return invokeParser(new ANTLRReaderStream(in));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public QExpression parse(File f) throws CLScriptException {

		try {
			return invokeParser(new ANTLRFileStream(f.getCanonicalPath(), "UTF-8"));
		} catch (IOException ex) {
            throw new CLScriptException(ex);
        }
	}

	@Override
	public QExpression parse(String script) throws CLScriptException {
		return invokeParser(new ANTLRStringStream(script.trim()));
	}



	public QExpression invokeParser(CharStream charstream) throws CLScriptException {
		return new BaseExpressionBuilder(new CLExpressionHelper()).buildAsPredicate(charstream.toString());
	}
}
