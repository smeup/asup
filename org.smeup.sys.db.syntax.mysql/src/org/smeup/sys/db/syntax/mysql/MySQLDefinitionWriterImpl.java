/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.smeup.sys.db.syntax.mysql;

import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.syntax.base.BaseDefinitionWriterImpl;


public class MySQLDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	protected MySQLDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty) {
		return dropSchema(schema);
	}
	
	@Override
	public String createLabel(String name, QSchemaDef schema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLabel(Schema schema, String name, QTableDef table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLabelForFields(Schema schema, String name,
			QTableDef table) {
		// TODO Auto-generated method stub
		return null;
	}
}