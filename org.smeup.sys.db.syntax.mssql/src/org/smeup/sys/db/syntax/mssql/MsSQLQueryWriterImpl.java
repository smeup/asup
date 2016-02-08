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
package org.smeup.sys.db.syntax.mssql;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.smeup.sys.db.syntax.QQueryWriter;
import org.smeup.sys.db.syntax.impl.StatementWriterImpl;

public class MsSQLQueryWriterImpl extends StatementWriterImpl implements QQueryWriter {

	private MsSQLQuerySourceWriter querySourceWriter;

	public MsSQLQueryWriterImpl(){
		querySourceWriter = new MsSQLQuerySourceWriter();
	}

	@Override
	public String writeQuery(QueryStatement query) {
		return querySourceWriter.getSQL(query);
	}

}