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

import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.impl.CommunicationAreaImpl;
import org.smeup.sys.db.esql.impl.DescriptorAreaImpl;
import org.smeup.sys.db.esql.impl.DescriptorVariableImpl;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
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
	public QCursor qCreateCursor(CursorType cursorType, boolean hold, String sql, QBufferedElement[] parameters) {

		QStatement statement = esqlContext.getEsqlFactory().createStatement();
		statement.prepare(sql, parameters);

		return esqlContext.getEsqlFactory().createCursor(cursorType, hold, sql, parameters);
	}

	public void qSetoption(String key, String value) {
		
		"".toCharArray();
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
		"".toCharArray();
	}

	public void qGetdescriptor(String name, String scope, QNumeric index, String parameter, Object value) {

		DescriptorAreaImpl descriptorArea = (DescriptorAreaImpl) esqlContext.getDescriptorArea(name);
		if (descriptorArea == null)
			throw new DatabaseCoreRuntimeException("Descriptor not found: " + name);

		DescriptorVariableImpl variable = null;
		if(index != null)
			variable = (DescriptorVariableImpl) descriptorArea.getVariable(index.asInteger());
		
		switch (parameter.toUpperCase()) {
		case "COUNT":
			((QNumeric)value).eval(descriptorArea.getColumnsNumber());
			break;
		case "NAME":
		case "DB2_SYSTEM_COLUMN_NAME":
			((QString)value).eval(variable.name);
			break;
		case "DB2_LABEL":
			((QString)value).eval(variable.label);
			break;
		case "TYPE":
			((QNumeric)value).eval(variable.type);
			break;
		case "DB2_CCSID":
			((QNumeric)value).eval(variable.ccsid);
			break;
		case "LENGTH":
		case "PRECISION":
			((QNumeric)value).eval(variable.length);
			break;
		case "SCALE":
			((QNumeric)value).eval(variable.scale);
			break;
		case "NULLABLE":
			((QBinary)value).eval(variable.nullable.isEmpty() ? 0 : 1);
			break;
		case "DATETIME_INTERVAL_CODE":
			// TODO
			break;
		case "DATA":
			if(!(value instanceof QBufferedElement))
				throw new DatabaseCoreRuntimeException("Unknown data type: " + value.getClass());

			QBufferedData data = variable.getBufferedData();
			if(data == null)
				"".toCharArray();
			
			switch (data.getBufferedDataType()) {
			case ELEMENT:
				QBufferedElement bufferedValue = (QBufferedElement)value;
				switch (bufferedValue.getBufferedElementType()) {
				case DATETIME:
					QDatetime datetime = (QDatetime)value;
					datetime.movel((QBufferedElement)data, true);
					break;
				case NUMERIC:
					QNumeric numeric = (QNumeric)value;
					if(!(value instanceof QNumeric))
						throw new DatabaseCoreRuntimeException("Unknown data type: " + value.getClass());

					numeric.eval((QNumeric) data);
					break;
				case STRING:
					if(!(value instanceof QString))
						throw new DatabaseCoreRuntimeException("Unknown data type: " + value.getClass());
					
					QString string = (QString)value;
					string.eval((QString)data);
					break;
				}
				break;
			case LIST:
				break;
			}
						
			break;
		default:
			throw new DatabaseCoreRuntimeException("Unknown parameter: " + parameter);
		}		
	}

	public void qSetdescriptor(String name, QNumeric column, String parameter, Object value) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	public void qExecute(QCharacter sql) {
		
		QStatement statement = esqlContext.getEsqlFactory().createStatement();
		statement.prepare(sql);
		statement.execute();
		statement.close();
	}

	public void qSelect(String sql, QBufferedElement into) {
		qSelect(sql, new QBufferedElement[] { into });
	}

	public void qSelect(String sql, QBufferedElement[] into) {
		qSelect(sql, into, new QBufferedElement[] {});
	}
	
	public void qSelect(String sql, QBufferedElement into, QBufferedElement parameter) {
		qSelect(sql, new QBufferedElement[] { into }, new QBufferedElement[] { parameter });
	}
	
	public void qSelect(String sql, QBufferedElement[] into, QBufferedElement parameter) {
		qSelect(sql, into , new QBufferedElement[] { parameter });
	}
	
	public void qSelect(String sql, QBufferedElement[] into, QBufferedElement[] parameters) {

		QCursor cursor = esqlContext.getEsqlFactory().createCursor(CursorType.SCROLLABLE, false, sql, parameters);
		cursor.open();
		cursor.next(into);
		cursor.close();
	}
}