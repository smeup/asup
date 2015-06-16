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
package org.smeup.sys.il.esam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.impl.DataWriterImpl;

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

				if (bufferedData instanceof QString) {
					QString string = (QString) bufferedData;
					resultSet.updateString(c, string.toString());
				} else if (bufferedData instanceof QDecimal) {
					QDecimal decimal = (QDecimal) bufferedData;
					resultSet.updateDouble(c, decimal.asDouble());
				} else
					resultSet.updateBytes(c, bufferedData.asBytes());

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}

		return false;
	}
}
