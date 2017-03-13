package org.smeup.sys.os.scde.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.scde.QScheduleManager;


@Program(name = "QWCCRMYC")
public class ScheduleEntryDeleter {
	
	@Inject
	private QJobCapability jobCapability;
	
	@Inject
	private QScheduleManager scheduleManager;
	
	public static enum QCPFMSG {
		//TODO: manage command CPF
	}

	public @Main void main(@DataDef(length = 10) QCharacter jobName,
			@DataDef(length = 6) QEnum<ENTRYNUMBEREnum, QCharacter> entryNumber) {

		String entryName = jobName.asString().trim();		
		scheduleManager.delete(jobCapability, entryName);
	}

	public static enum ENTRYNUMBEREnum {
		ONLY, ALL, OTHER
	}
}
