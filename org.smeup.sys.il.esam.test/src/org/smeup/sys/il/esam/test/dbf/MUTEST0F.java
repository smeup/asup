package org.smeup.sys.il.esam.test.dbf;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.esam.annotation.Format;

@Format(value = "MUTESTR")
public class MUTEST0F extends QRecordWrapper {
	private static final long serialVersionUID = 1L;
	@DataDef(length = 15)
	public QCharacter mtcate;
	@DataDef(length = 30)
	public QCharacter mtogge;
	@DataDef(length = 1)
	public QCharacter mterro;
	@DataDef(length = 7)
	public QCharacter mtmess;
	@DataDef(precision = 15)
	public QDecimal mttime;
	@DataDef(length = 10)
	public QCharacter mtuses;
	@DataDef(precision = 8)
	public QDecimal mtdtes;
	@DataDef(precision = 8)
	public QDecimal mtores;
	@DataDef(length = 6)
	public QCharacter mtjoes;
}
