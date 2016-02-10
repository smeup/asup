/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.db.syntax.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.smeup.sys.db.syntax.ibmi.parser.dbl.DBLLexer;
import org.smeup.sys.db.syntax.ibmi.parser.dbl.DBLParser;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.base.BaseTestHelper;

@Test(category = "DB.SYNTAX", object = "DBL")
public class DBLParserTest {
	

	@Inject
	private QTestAsserter testAsserter;

	@TestStarted
	public void main() throws IOException {

		for (String expression : BaseTestHelper.readTextResource(this, "/resources/dbl/dbl.txt")) {
			try{
				
				DBLLexer lex = new DBLLexer(new ANTLRStringStream(expression));
				CommonTokenStream tokens = new CommonTokenStream(lex);
				DBLParser parser = new DBLParser(tokens);

				CommonTree tree = null;

				tree = parser.sql().getTree();					
				testAsserter.assertNotNull("Parse " + expression, tree);

			} catch(Exception exc) {
				testAsserter.fail("Cannot parse DBL statement: \"" + expression + "\" Cause: " + exc.getMessage());
			}
		}
	}
}