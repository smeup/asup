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
package org.smeup.sys.il.isam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.impl.DataReaderImpl;

public class JDBCDataReaderImpl extends DataReaderImpl {

//	private static DecimalFormat[][] decimalFormats = new DecimalFormat[32][9];

	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	public JDBCDataReaderImpl set(ResultSet resultSet) {

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
				// bufferedData.movel(resultSet.getString(c), true);

				dataWriter.set(resultSet.getObject(c));
				bufferedData.accept(dataWriter);
				/*
				 * if(bufferedData instanceof QString) { QString string =
				 * (QString) bufferedData; string.eval(resultSet.getString(c));
				 * } else if(bufferedData instanceof QDecimal) { QDecimal
				 * decimal = (QDecimal) bufferedData;
				 * 
				 * // BigDecimal bigDecimal = resultSet.getBigDecimal(c); //
				 * decimal.eval(bigDecimal);
				 * 
				 * // bufferedData.move(formatBigDecimal(bigDecimal, decimal),
				 * true);
				 * 
				 * System.out.println(resultSet.getObject(c));
				 * decimal.eval(resultSet.getDouble(c)); } else {
				 * bufferedData.movel(resultSet.getObject(c).toString(), true);
				 * }
				 */

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}

		return false;
	}

}
