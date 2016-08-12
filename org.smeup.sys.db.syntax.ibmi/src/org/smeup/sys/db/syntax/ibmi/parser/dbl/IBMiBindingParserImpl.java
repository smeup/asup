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
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.db.syntax.ibmi.parser.dbl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.db.syntax.QBindingParseResult;
import org.smeup.sys.db.syntax.QBindingParser;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.db.syntax.QQueryParserRegistry;

public class IBMiBindingParserImpl implements QBindingParser {

	private DBLModelBuilder bindingBuilder;

	@Inject
	private QQueryParserRegistry queryParserRegistry;
	
	@PostConstruct
	private void init() {
		QQueryParser queryParser = queryParserRegistry.lookup("ASUP");
		bindingBuilder = new DBLModelBuilder(queryParser);		
	}
	
	@Override
	public QBindingParseResult parseBinding(InputStream bindingStream) throws SQLException {

		return parseBinding(toString(bindingStream));
	}

	@Override
	public QBindingParseResult parseBinding(String bindingString) throws SQLException {

		QBindingParseResult parseResult = bindingBuilder.parseBinding(bindingString);
		
		return parseResult;
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
