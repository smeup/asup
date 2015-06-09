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

import java.sql.SQLException;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;

public class ConnectionCommands extends E4TestProviderImpl {

	@Inject
	private QConnectionManager connectionManager;

	public void _connect(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		long timeIni = System.currentTimeMillis();
		QConnection connection = connectionManager.createConnection(catalog);
		System.out.println(connection);
		connection.close();
		long timeEnd = System.currentTimeMillis();

		System.out.println("(" + (timeEnd - timeIni) + " ms)");

	}
}