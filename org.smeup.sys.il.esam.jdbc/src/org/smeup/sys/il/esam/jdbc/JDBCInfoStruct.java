package org.smeup.sys.il.esam.jdbc;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.BinaryType;

public class JDBCInfoStruct extends QDataStructWrapper {
	private static final long serialVersionUID = 1L;
	
	@DataDef(binaryType = BinaryType.INTEGER)
	@Overlay(position = 397)
	public QBinary rrn;
}
