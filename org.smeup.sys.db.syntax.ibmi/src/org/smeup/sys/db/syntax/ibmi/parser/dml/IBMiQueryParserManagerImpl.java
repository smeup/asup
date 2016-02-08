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
package org.smeup.sys.db.syntax.ibmi.parser.dml;

import java.util.List;

import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParser;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserFactory;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserInternalException;
import org.eclipse.datatools.sqltools.parsers.sql.lexer.AbstractSQLLexer;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParserManager;

@SuppressWarnings("rawtypes")
public class IBMiQueryParserManagerImpl extends SQLQueryParserManager {

	/**
	 *
	 */
	public IBMiQueryParserManagerImpl() {
		super();
	}

	/**
	 * @param sourceFormat
	 * @param postParseProcessors
	 */
	public IBMiQueryParserManagerImpl(SQLQuerySourceFormat sourceFormat, List postParseProcessors) {
		super(sourceFormat, postParseProcessors);
	}

	@Override
	protected SQLParser createParser(AbstractSQLLexer lexer, boolean syntaxCheckOnly) throws SQLParserInternalException {
		return new IBMiQueryParser(lexer, (IBMiQueryParserFactory) getParserFactory(), getSourceFormat(), syntaxCheckOnly);
	}

	/**
	 * Returns this <code>SQLXMLQueryParserManager</code>'s
	 * <code>SQLXMLQueryParserFactory</code>. If this
	 * <code>SQLXMLQueryParserManager</code>'s <code>parserFactory</code> is
	 * <code>null</code>, a new <code>SQLXMLQueryParserFactory</code> will be
	 * created for this <code>SQLXMLQueryParserManager</code> and returned. That
	 * is, this method never returns <code>null</code>!
	 *
	 * @return <code>SQLXMLQueryParserFactory</code>
	 */
	@Override
	public SQLParserFactory createParserFactory() {
		return new IBMiQueryParserFactory(getSourceFormat());
	}

}
