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
package org.smeup.sys.il.esam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.impl.DataWriterImpl;
import org.smeup.sys.il.esam.IntegratedLanguageEsamRuntimeException;

public class JDBCDataWriterImpl extends DataWriterImpl {

	public JDBCDataWriterImpl set(ResultSet resultSet) {

		super.object = resultSet;

		return this;
	}

	@Override
	public boolean visit(QDataStruct data) {

		if (!(super.object instanceof ResultSet))
			return super.visit(data);

		ResultSet resultSet = (ResultSet) this.object;

		int c = 1;
		for (QBufferedData bufferedData : data.getElements()) {
			try {
				if(!(bufferedData instanceof QBufferedElement))
					throw new IntegratedLanguageEsamRuntimeException("Invalid buffered data: "+bufferedData);
				
				QBufferedElement bufferedElement = (QBufferedElement)bufferedData;
				switch (bufferedElement.getBufferedElementType()) {
				case DATETIME:
					QDatetime datetime = (QDatetime)bufferedData;
					resultSet.updateDate(c, new java.sql.Date(datetime.asTime()));
					break;
				case NUMERIC:
					QNumeric numeric = (QNumeric) bufferedData;
					resultSet.updateDouble(c, numeric.asDouble());
					break;
				case STRING:
					QString string = (QString) bufferedData;
					resultSet.updateString(c, string.asString());
					break;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}

		return false;
	}
}
