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
package org.smeup.sys.os.pgm.rpj;

import javax.inject.Inject;

import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.impl.CommunicationAreaImpl;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Module.Scope;
import org.smeup.sys.il.data.annotation.Overlay;

@Module(name = "*SQL", scope = Scope.OWNER)
public class RPJDatabaseSupport extends RPJModule {
	private static final long serialVersionUID = 1L;

	@Inject
	private transient QEsqlContext esqlContext;

	@DataDef
	@Overlay(name = "*SQLCA")
	public transient CommunicationAreaImpl sqlca;
	
	@SuppressWarnings("resource")
	public QCursor declare(CursorType cursorType, boolean hold, String sql, QBufferedElement[] parameters) {

		QStatement statement = esqlContext.getEsqlFactory().createStatement();
		statement.prepare(sql, parameters);

		return esqlContext.getEsqlFactory().createCursor(cursorType, hold, statement);
	}

	public void qSetoption(String key, String value) {
	}

	public void qAllocatedescriptor(String name, String scope, QNumeric maxColumn) {
		qAllocatedescriptor(name, scope, maxColumn.asInteger());
	}

	public void qAllocatedescriptor(String name, String scope, int maxColumns) {		
		esqlContext.allocateDescriptorArea(name, maxColumns);		
	}

	public void qDeallocatedescriptor(String name, String scope) {
		esqlContext.deallocateDescriptorArea(name);
	}

	public void qGetdiagnostic(int condition, String name, QBufferedElement value) {
		// TODO Auto-generated method stub

	}

	public void qGetdescriptor(String name, String scope, QNumeric object, String parameter, Object value) {
		// TODO Auto-generated method stub

	}

	public void qSetdescriptor(String name, QNumeric column, String parameter, Object value) {
		// TODO Auto-generated method stub

	}

}