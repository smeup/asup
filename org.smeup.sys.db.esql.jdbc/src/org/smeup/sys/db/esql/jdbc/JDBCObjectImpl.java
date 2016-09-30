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
package org.smeup.sys.db.esql.jdbc;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.QESqlObject;
import org.smeup.sys.db.esql.QEsqlContext;

public class JDBCObjectImpl implements QESqlObject{

	private QConnection databaseConnection;
	private QEsqlContext esqlContext;
	
	public JDBCObjectImpl(QConnection databaseConnection, QEsqlContext esqlContext) {
		this.databaseConnection = databaseConnection;
		this.esqlContext = esqlContext;
	}
	
	protected QEsqlContext getEsqlContext() {
		return esqlContext;
	}

	protected QConnection getDatabaseConnection() {
		return databaseConnection;
	}
}
