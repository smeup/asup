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
package org.smeup.sys.db.core.test;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.dk.test.base.BaseTestProviderImpl;

public class PrintCommands extends BaseTestProviderImpl {

	@Inject
	private QConnectionManager connectionManager;

	public void _printCatalog(CommandInterpreter interpreter) throws SQLException {

		String catalog = interpreter.nextArgument();

		QConnection connection = connectionManager.createConnection(catalog);

		for (Schema schema : connection.getCatalogMetaData().getSchemas())
			System.out.println(schema);

		connection.close();

	}

	@SuppressWarnings("unchecked")
	public void _printSchema(CommandInterpreter interpreter) throws SQLException {

		String schemaName = interpreter.nextArgument();
		String catalog = interpreter.nextArgument();

		QConnection connection = connectionManager.createConnection(catalog);

		Schema schema = connection.getCatalogMetaData().getSchema(schemaName);
		if (schema == null)
			return;

		System.out.println("\t" + schema);
		for (Table table : (List<Table>) schema.getTables())
			System.out.println("\t\t" + table);

		connection.close();

	}
}