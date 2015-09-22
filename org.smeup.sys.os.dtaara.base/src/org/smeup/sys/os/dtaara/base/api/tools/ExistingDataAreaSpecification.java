package org.smeup.sys.os.dtaara.base.api.tools;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;

public class ExistingDataAreaSpecification extends QDataStructWrapper {
	
	private static final long serialVersionUID = 1L;
	
	@DataDef(length = 10)
	public QCharacter name;
	
	@DataDef(length = 10, value = "*LIBL")
	public QEnum<LIBRARYEnum, QCharacter> library;

	public static enum LIBRARYEnum {
		LIBL, CURLIB, OTHER
	}

	public static enum DATAAREAEnum {
		LDA, GDA, PDA, OTHER
	}
		
}
