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
package org.smeup.sys.db.core.test.runner;

import java.sql.SQLException;

import javax.inject.Inject;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;

@Test(object = "Connection")
public class Connection {

	@Inject
	private QConnection connection;
	@Inject
	public transient QTestAsserter testAsserter;
	
	@TestStarted
	public void main() throws SQLException {
		
		testAsserter.assertNotNull("Connection not null", connection);
	}
}