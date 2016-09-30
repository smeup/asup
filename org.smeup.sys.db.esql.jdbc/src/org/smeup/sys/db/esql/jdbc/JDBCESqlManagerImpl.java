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
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QESqlManager;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.il.data.QDataContext;

public class JDBCESqlManagerImpl implements QESqlManager{

	@Override
	public QEsqlContext createEsqlContext(Object connection, QDataContext dataContext, QCommunicationArea communicationArea) {

		QConnection databaseConnection = dataContext.getContext().getAdapter(connection, QConnection.class);		
		QEsqlContext esqlContext = new JDBCEsqlContextImpl(databaseConnection, dataContext, communicationArea);
		
		return esqlContext;
	}
}