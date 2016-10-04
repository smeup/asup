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

import java.sql.JDBCType;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.impl.DescriptorAreaImpl;
import org.smeup.sys.db.esql.impl.DescriptorVariableImpl;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;

public class JDBCStatementImpl extends JDBCObjectImpl implements QStatement {
	

	private org.smeup.sys.db.core.QPreparedStatement dbStatement = null;
	
	public JDBCStatementImpl(QConnection databaseConnection, QEsqlContext esqlContext) {
		super(databaseConnection, esqlContext);
	}

	@Override
	public void prepare(QString sql) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			if(dbStatement != null)
				dbStatement.close();
			
			dbStatement = getDatabaseConnection().prepareStatement(sql.trimR());
		} catch (SQLException e) {
			handleSQLException(e);
		}		
	}

	@Override
	public void prepare(String sql) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			if(dbStatement != null)
				dbStatement.close();

			dbStatement = getDatabaseConnection().prepareStatement(sql);
		} catch (SQLException e) {
			handleSQLException(e);
		}		
	}
	
	@Override
	public void execute() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if(dbStatement == null) {
			handleSQLException(new SQLException("Invalid statement", "X", -924));
			return;
		}

		try {
			dbStatement.close();
			
			dbStatement.execute();
		} catch (SQLException e) {
			handleSQLException(e);
		}
	}

	@Override
	public Object executeQuery() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if(dbStatement == null) {
			handleSQLException(new SQLException("Invalid statement", "X", -924));
			return null;
		}

		try {
			return dbStatement.executeQuery();
		} catch (SQLException e) {
			handleSQLException(e);
			return null;
		}
	}

	@Override
	public void close() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if(dbStatement != null)
			dbStatement.close();		
	}

	@Override
	public void describe(String descriptor) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();
		
		DescriptorAreaImpl descriptorArea = (DescriptorAreaImpl) getEsqlContext().getDescriptorArea(descriptor);
		if (descriptorArea == null)
			throw new DatabaseCoreRuntimeException("Descriptor not found: " + descriptor);

		try {
			ResultSetMetaData resultSetMetaData = dbStatement.getMetaData();
			descriptorArea.initialize(resultSetMetaData.getColumnCount());
			for(int c = 1; c <= descriptorArea.getColumnsNumber(); c++) {
				DescriptorVariableImpl variable = getEsqlContext().getDataContext().getDataFactory().createDataStruct(DescriptorVariableImpl.class, 0, true);

				int sqlType = 0;
				
				JDBCType jdbcType = JDBCType.valueOf(resultSetMetaData.getColumnType(c));
				QDataDef<?> dataDef = null;
				switch(jdbcType) {
				case ARRAY:					
					break;
				case BIGINT:
					QBinaryDef binaryDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
					binaryDef.setType(BinaryType.INTEGER);
					sqlType = 25;
					dataDef = binaryDef;
					break;
				case BINARY:
					sqlType = -2;
					break;
				case BIT:
					break;
				case BLOB:
					sqlType = 30;
					break;
				case BOOLEAN:					
					break;
				case CHAR:
					QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
					dataDef = characterDef;
					sqlType = 1;
					break;
				case CLOB:
					sqlType = 40;
					break;
				case DATALINK:					
					break;
				case DATE:
					break;
				case DECIMAL:
					QDecimalDef decimalDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDecimalDef();
					dataDef = decimalDef;
					sqlType = 3;
					break;
				case DISTINCT:
					break;
				case DOUBLE:
					sqlType = 8;
					break;
				case FLOAT:
					sqlType = 6;
					break;
				case INTEGER:
					QBinaryDef integerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createBinaryDef();
					integerDef.setType(BinaryType.INTEGER);
					dataDef = integerDef;
					sqlType = 4;
					break;
				case JAVA_OBJECT:
					break;
				case LONGNVARCHAR:
					break;
				case LONGVARBINARY:
					break;
				case LONGVARCHAR:
					break;
				case NCHAR:
					break;
				case NCLOB:
					break;
				case NULL:
					break;
				case NUMERIC:
					sqlType = 2;
					break;
				case NVARCHAR:
					break;
				case OTHER:
					break;
				case REAL:
					sqlType = 7;
					break;
				case REF:
					break;
				case REF_CURSOR:
					break;
				case ROWID:
					sqlType = -904;
					break;
				case SMALLINT:
					sqlType = 5;
					break;
				case SQLXML:
					break;
				case STRUCT:
					break;
				case TIME:
					break;
				case TIMESTAMP:
					sqlType = 9;
					break;
				case TIMESTAMP_WITH_TIMEZONE:
					break;
				case TIME_WITH_TIMEZONE:
					break;
				case TINYINT:
					break;
				case VARBINARY:
					sqlType = -3;
					break;
				case VARCHAR:
					characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
					characterDef.setVarying(true);;
					dataDef = characterDef;

					sqlType = 12;
					break;				
				}

				if(sqlType == 0 || dataDef == null)
					"".toCharArray();
				
				variable.type.eval(sqlType);
				variable.name.eval(resultSetMetaData.getColumnName(c));
				variable.length.eval(resultSetMetaData.getPrecision(c));
				variable.ccsid.eval(65535);
				variable.scale.eval(resultSetMetaData.getScale(c));
				variable.label.eval(resultSetMetaData.getColumnLabel(c));
				variable.nullable.eval(resultSetMetaData.isNullable(c) > 0);

				if(dataDef instanceof QCharacterDef || dataDef instanceof QDecimalDef) {
					QUnaryAtomicBufferedDataDef<?> bufferedDataDef = (QUnaryAtomicBufferedDataDef<?>)dataDef;
					bufferedDataDef.setLength(variable.length.asInteger());
				}
				else
					"".toCharArray();

				if(dataDef instanceof QDecimalDef) {
					QDecimalDef decimalDef = (QDecimalDef) dataDef;
					decimalDef.setScale(variable.scale.asInteger());
				}
				
				QBufferedData bufferedData = (QBufferedData) getEsqlContext().getDataContext().getDataFactory().createData(dataDef, true);
				variable.setBufferedData(bufferedData);				
				
				descriptorArea.setVariable(c, variable);
			}
		} catch (SQLException e) {
			descriptorArea.initialize(0);
			handleSQLException(e);
		}		
	}

	@Override
	public void prepare(String sql, QBufferedElement[] parameters) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			dbStatement = getDatabaseConnection().prepareStatement(sql);
			int i = 1;
			for(QBufferedElement parameter: parameters) {
				switch (parameter.getBufferedElementType()) {
				case DATETIME:
					QDatetime datetime = (QDatetime)parameter;
					dbStatement.setDate(i, datetime.asDate());	
					break;
				case NUMERIC:
					QNumeric numeric = (QNumeric)parameter;
					dbStatement.setNumber(i, numeric.asNumber());
					break;
				case STRING:
					QString string = (QString)parameter;
					dbStatement.setString(i, string.asString());
					break;
				}
				
				i++;
			}
		} catch (SQLException e) {
			handleSQLException(e);
		}		
	}
	

	protected void handleSQLException(SQLException e) {
		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.setSqlCode(e.getErrorCode());
		if(communicationArea.getSqlCode() == 0)
			communicationArea.setSqlCode(-924);
	}
}