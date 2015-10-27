package org.smeup.sys.os.pgm.base;

import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;

public class BaseProgramStatus extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;
	
	@DataDef(length = 10)
	@Overlay(position = "1")
	public QCharacter programName;	
	@DataDef(precision = 5)
	@Overlay(position = "11")
	public QDecimal status;
	@DataDef(length = 8)
	@Overlay(position = "21")
	public QCharacter line;
	@DataDef(precision = 3)
	@Overlay(position = "37")
	public QDecimal params;
	@DataDef(length = 10)
	@Overlay(position = "81")
	public QCharacter programLibrary;
	@DataDef(length = 80)
	@Overlay(position = "91")
	public QCharacter messageText;
	@DataDef(length = 8)
	@Overlay(position = "201")
	public QCharacter fileName;
	@DataDef(length = 35)
	@Overlay(position = "209")
	public QCharacter fileInformation;
	@DataDef(length = 10)
	@Overlay(position = "244")
	public QCharacter jobName;
	@DataDef(length = 10)
	@Overlay(position = "254")
	public QCharacter userName;
	@DataDef(precision = 6)
	@Overlay(position = "264")
	public QDecimal jobNumber;	
	@DataDef(length = 10)
	@Overlay(position = "334")
	public QCharacter moduleName;
}