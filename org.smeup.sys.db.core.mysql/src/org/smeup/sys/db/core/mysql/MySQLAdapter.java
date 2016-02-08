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
package org.smeup.sys.db.core.mysql;


import java.sql.Connection;

import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.ddl.*;
import org.eclipse.net4j.db.ddl.delta.IDBTableDelta;
import org.eclipse.net4j.db.ddl.delta.IDBDelta.ChangeKind;
import org.eclipse.net4j.db.mysql.MYSQLAdapter;
import org.eclipse.net4j.util.CheckUtil;


public class MySQLAdapter extends MYSQLAdapter {
	
	public MySQLAdapter() {
		super();
	}

	@Override
	protected void createTable(Connection connection, IDBTable table, IDBTableDelta delta)
	{
	    CheckUtil.checkArg(delta.getChangeKind() == ChangeKind.ADD, "Not added: " + delta.getName());
	
	    StringBuilder builder = new StringBuilder();
	    builder.append("CREATE TABLE "); //$NON-NLS-1$
	    builder.append(delta.getName());
	    builder.append(" ("); //$NON-NLS-1$
	    appendFieldDefs(builder, table, createFieldDefinitions(table));
	    builder.append(")"); //$NON-NLS-1$
	    //See bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=439772
	    builder.append(" ENGINE=InnoDB ROW_FORMAT=COMPRESSED");
	    
	    DBUtil.execute(connection, builder);
	}

}
