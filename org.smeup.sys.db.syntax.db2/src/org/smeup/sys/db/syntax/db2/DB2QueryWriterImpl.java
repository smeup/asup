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
package org.smeup.sys.db.syntax.db2;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.query.util.SQLSourceWriter;
import org.smeup.sys.db.syntax.QQueryWriter;
import org.smeup.sys.db.syntax.impl.StatementWriterImpl;

public class DB2QueryWriterImpl extends StatementWriterImpl implements QQueryWriter {
	private SQLSourceWriter querySourceWriter;

	public DB2QueryWriterImpl() {
		super();
		this.querySourceWriter = new DB2QuerySourceWriter();
	}

	@Override
	public String writeQuery(QueryStatement query) {
		return querySourceWriter.getSQL(query);
	}
}