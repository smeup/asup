package org.smeup.sys.os.scde.base.api;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;


@Program(name = "RMVJOBSCDE")
public class ScheduleEntryDeleter {
	public static enum QCPFMSG {
	}

	public @Main void main(@DataDef(length = 10) QCharacter jobName,
			@DataDef(length = 6) QEnum<ENTRYNUMBEREnum, QCharacter> entryNumber) {
	}

	public static enum ENTRYNUMBEREnum {
		ONLY, ALL, OTHER
	}
}
