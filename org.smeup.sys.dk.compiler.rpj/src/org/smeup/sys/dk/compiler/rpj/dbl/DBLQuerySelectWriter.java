/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj.dbl;

import java.lang.reflect.Method;

import org.eclipse.datatools.modelbase.sql.query.QuerySelect;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionVariable;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.smeup.sys.db.syntax.dml.QExtendedQuerySelect;

public class DBLQuerySelectWriter extends SQLQuerySourceWriter {

	public DBLQuerySelectWriter() {
 		setIndentUnitSize(0);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Method getSpecificAppendSQLMethod(Class sourceWriterClass, SQLObject sqlObject) throws NoSuchMethodException {
		if (sqlObject instanceof QExtendedQuerySelect) {
			return DBLQuerySelectWriter.class.getMethod("appendSpecificSQL", QExtendedQuerySelect.class, StringBuffer.class);
		} else {
			return super.getSpecificAppendSQLMethod(sourceWriterClass, sqlObject);
		}
	}

	@Override
	protected void appendSpecificSQL(ValueExpressionVariable var, StringBuffer sb) {
		var.setName(null);
		super.appendSpecificSQL(var, sb);
	}
	
	public String escapeQuerySelect(QuerySelect select) {

		String newSQLString = normalizeQuerySelect(select);
		newSQLString = newSQLString.replaceAll("'", "''");
		newSQLString = newSQLString.replaceAll("\"", "\\\"");

		return newSQLString;
	}
	
	public String normalizeQuerySelect(QuerySelect select) {

		StringBuffer sb = new StringBuffer();
		super.appendSpecificSQL(select, sb);
		
		return sb.toString().replaceAll("\n", " ");
	}
}
