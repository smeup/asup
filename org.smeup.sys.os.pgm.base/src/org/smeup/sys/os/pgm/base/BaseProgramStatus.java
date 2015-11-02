package org.smeup.sys.os.pgm.base;

import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;

public class BaseProgramStatus extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;
	
	@DataDef(length = 10)
	public QCharacter programName;	
	@DataDef(precision = 5)
	public QDecimal status;
	@DataDef(precision = 5)
	public QDecimal previousStatus;
	@DataDef(length = 8)
	public QCharacter lineNumber;
	@DataDef(length = 8)
	public QCharacter routineName;
	@DataDef(precision = 3)
	public QDecimal params;
	@DataDef(length = 3)
	public QCharacter exceptionType;
	@DataDef(length = 3)
	public QCharacter exceptionNumber;
	@DataDef(length = 4)
	public QCharacter filler_0;
	@DataDef(length = 30)
	public QCharacter workAreaMessage;
	@DataDef(length = 10)
	public QCharacter programLibrary;
	@DataDef(length = 80)
	public QCharacter messageText;	
	@DataDef(length = 8)
	@Overlay(position = 201)
	public QCharacter fileName;
	@DataDef(length = 35)
	@Overlay(position = 209)
	public QCharacter fileInformation;
	@DataDef(length = 10)
	@Overlay(position = 244)
	public QCharacter jobName;
	@DataDef(length = 10)
	@Overlay(position = 254)
	public QCharacter userName;
	@DataDef(precision = 6)
	@Overlay(position = 264)
	public QDecimal jobNumber;	
	@DataDef(length = 10)
	@Overlay(position = 334)
	public QCharacter moduleName;
}