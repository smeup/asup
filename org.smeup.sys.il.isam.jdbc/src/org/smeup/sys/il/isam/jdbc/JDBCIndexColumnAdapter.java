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

import org.eclipse.datatools.modelbase.sql.constraints.IncrementType;
import org.eclipse.datatools.modelbase.sql.constraints.IndexMember;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.DataType;
import org.eclipse.datatools.modelbase.sql.datatypes.NumericalDataType;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.il.isam.OperationDirection;
import org.smeup.sys.il.isam.QIndexColumn;

public class JDBCIndexColumnAdapter implements QIndexColumn {

	private IndexMember indexMember;

	public JDBCIndexColumnAdapter(IndexMember indexMember) {
		this.indexMember = indexMember;
	}

	@Override
	public String getName() {

		Column column = indexMember.getColumn();
		return column.getName();
	}

	@Override
	public OperationDirection getDirection() {

		if (indexMember.getIncrementType().getValue() == IncrementType.DESC)
			return OperationDirection.BACKWARD;
		else
			return OperationDirection.FORWARD;
	}

	@Override
	public boolean isNumeric() {

		Column column = indexMember.getColumn();
		DataType dataType = column.getDataType();
		if (dataType instanceof NumericalDataType)
			return true;
		else if (dataType instanceof CharacterStringDataType)
			return false;
		else
			System.err.println(dataType);

		return false;
	}

	@Override
	public int getLength() {

		Column column = indexMember.getColumn();
		DataType dataType = column.getDataType();
		if (dataType instanceof NumericalDataType) {
			NumericalDataType numericalDataType = (NumericalDataType) dataType;
			return numericalDataType.getPrecision();
		} else if (dataType instanceof CharacterStringDataType) {
			CharacterStringDataType characterStringDataType = (CharacterStringDataType) dataType;
			return characterStringDataType.getLength();
		} else
			throw new DatabaseCoreRuntimeException("Unexpected condition cb4t7qtvqetrexntew7: " + dataType);

	}

}
