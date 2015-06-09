/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.db.syntax.ibmi.parser.dml;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.smeup.sys.db.syntax.QQueryParser;

public class IBMiQueryParserImpl implements QQueryParser {

	private IBMiQueryParserManagerImpl parserManager;

	public IBMiQueryParserImpl() {
		// Create parser instance
		parserManager = new IBMiQueryParserManagerImpl();
		parserManager.configParser(SQLQuerySourceFormat.SQL_SOURCE_FORMAT_DEFAULT, null);
	}

	@Override
	public SQLQueryParseResult parseQuery(String sql) throws SQLException {
		try {
			return parserManager.parseQuery(sql);
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}

	@Override
	public SQLQueryParseResult parseQuery(InputStream stream) throws SQLException {
		String sql = toString(stream);
		try {
			return parserManager.parseQuery(sql);
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}

	public static String toString(InputStream is) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			StringBuffer message = new StringBuffer();
			while (true) {
				String input = in.readLine();
				if (input == null)
					break;
				message.append(input);
			}
			return message.toString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}

}
