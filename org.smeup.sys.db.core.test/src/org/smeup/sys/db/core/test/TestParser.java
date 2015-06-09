/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.db.core.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.db.syntax.QBindingParseResult;
import org.smeup.sys.db.syntax.QBindingParser;
import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionParser;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.e4.E4TestHelper;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;

public class TestParser extends E4TestProviderImpl {

	@Inject
	private QConnectionManager connectionManager;
	@Inject
	private QTestManager testManager;

	public void _testDML(CommandInterpreter interpreter) throws Exception {

		String script = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();
		QConnection connection = connectionManager.createConnection(catalog);

		QContext testContext = connection.getContext().createChildContext(script);
		testContext.set(QConnection.class, connection);
		testContext.set("org.smeup.sys.db.core.test.script", script);

		try {
			// Parse
			QTestRunner testRunner = testManager.prepareRunner(testContext, ParseDML.class);
			QTestResult testResult = testRunner.call();

			printTestResult(testResult);
		} finally {
			// TODO remove and listen context.close()
			connection.close();

			testContext.close();
		}
	}

	public void _testDDL(CommandInterpreter interpreter) throws Exception {

		String script = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();
		QConnection connection = connectionManager.createConnection(catalog);

		QContext testContext = connection.getContext().createChildContext(script);
		testContext.set(QConnection.class, connection);
		testContext.set("org.smeup.sys.db.core.test.script", script);

		try {
			// Parse
			QTestRunner testRunner = testManager.prepareRunner(testContext, ParseDDL.class);
			QTestResult testResult = testRunner.call();

			printTestResult(testResult);
		} finally {
			// TODO remove and listen context.close()
			connection.close();

			testContext.close();
		}
	}

	public void _testDBL(CommandInterpreter interpreter) throws Exception {

		String script = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();
		QConnection connection = connectionManager.createConnection(catalog);

		QContext testContext = connection.getContext().createChildContext(script);
		testContext.set(QConnection.class, connection);
		testContext.set("org.smeup.sys.db.core.test.script", script);

		try {
			// Parse
			QTestRunner testRunner = testManager.prepareRunner(testContext, ParseDBL.class);
			QTestResult testResult = testRunner.call();

			printTestResult(testResult);
		} finally {
			// TODO remove and listen context.close()
			connection.close();

			testContext.close();
		}
	}

	@Test(category = "DBSYNTAX", object = "PARSEDML")
	public static class ParseDML {

		@Inject
		private QTestAsserter testAsserter;

		@Inject
		private QQueryParser queryParser;

		@TestStarted
		public void doTest(@Named("org.smeup.sys.db.core.test.script") String script) throws SQLException, IOException {

			List<String> statements = E4TestHelper.readTextResource(this, script);

			testAsserter.resetTime();

			for (String sql : statements) {
				SQLQueryParseResult parseResult = null;
				try {
					parseResult = queryParser.parseQuery(sql);

				} catch (Exception e) {
					// e.printStackTrace();
				}

				testAsserter.assertNotNull("Test parser: " + sql, parseResult);
			}
		}
	}

	@Test(category = "DBSYNTAX", object = "PARSEDDL")
	public static class ParseDDL {

		@Inject
		private QTestAsserter testAsserter;

		@Inject
		private QDefinitionParser definitionParser;

		@TestStarted
		public void doTest(@Named("org.smeup.sys.db.core.test.script") String script) throws SQLException, IOException {

			List<String> statements = E4TestHelper.readTextResource(this, script);

			testAsserter.resetTime();

			for (String sql : statements) {

				QDefinitionParseResult parseResult = null;
				try {
					parseResult = definitionParser.parseDefinition(sql);

				} catch (Exception e) {
					// e.printStackTrace();
				}

				testAsserter.assertNotNull("Test parser: " + sql, parseResult);
			}
		}
	}

	@Test(category = "DBSYNTAX", object = "PARSEDBL")
	public static class ParseDBL {

		@Inject
		private QTestAsserter testAsserter;

		@Inject
		private QBindingParser bindingParser;

		@TestStarted
		public void doTest(@Named("org.smeup.sys.db.core.test.script") String script) throws SQLException, IOException {

			List<String> statements = E4TestHelper.readTextResource(this, script);

			testAsserter.resetTime();

			for (String sql : statements) {

				QBindingParseResult parseResult = null;
				try {
					parseResult = bindingParser.parseBinding(sql);

				} catch (Exception e) {
					// e.printStackTrace();
					parseResult = null;
				}

				testAsserter.assertNotNull("Test parser: " + sql, parseResult);
			}
		}
	}
}
