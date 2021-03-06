/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.db.syntax.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.smeup.sys.db.syntax.QDefinitionParseResult;
import org.smeup.sys.db.syntax.QDefinitionParser;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.base.BaseTestHelper;

@Test(object = "DDL")
public class ParseDDL {

	@Inject
	public transient QTestAsserter testAsserter;

	@Inject
	private QDefinitionParser definitionParser;

	@TestStarted
	public void main() throws SQLException, IOException {

		for (String sql : BaseTestHelper.readTextResource(this, "/resources/ddl.txt")) {

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