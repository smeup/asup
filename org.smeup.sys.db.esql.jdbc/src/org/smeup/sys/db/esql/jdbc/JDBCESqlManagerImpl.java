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
import org.smeup.sys.db.esql.QESqlFactory;
import org.smeup.sys.db.esql.QESqlManager;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QDataContext;

public class JDBCESqlManagerImpl implements QESqlManager{

	@Override
	public QESqlFactory createFactory(QContextProvider contextProvider, QDataContext dataContext, QCommunicationArea communicationArea) {

		QConnection connection = contextProvider.getContext().getAdapter(contextProvider, QConnection.class);
		
		QESqlFactory esqlFactory = new JDBCESqlFactoryImpl(connection, dataContext, communicationArea);
		
		return esqlFactory;
	}

}
