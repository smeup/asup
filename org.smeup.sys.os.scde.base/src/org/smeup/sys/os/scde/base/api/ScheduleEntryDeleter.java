package org.smeup.sys.os.scde.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.scde.QScheduleEntry;


@Program(name = "QWCCRMYC")
public class ScheduleEntryDeleter {
	
	@Inject
	private QResourceManager resourceManager;
	
	@Inject
	private QJob job;
	
	public static enum QCPFMSG {
	}

	public @Main void main(@DataDef(length = 10) QCharacter jobName,
			@DataDef(length = 6) QEnum<ENTRYNUMBEREnum, QCharacter> entryNumber) {
		
		QResourceWriter<QScheduleEntry> resourceWriter = resourceManager.getResourceWriter(job, QScheduleEntry.class, job.getSystem().getSystemLibrary());

		String entryName = jobName.asString().trim();
		
		if (resourceWriter.exists(entryName)) {
		
			QScheduleEntry scheduleEntry = resourceWriter.lookup(entryName);
			resourceWriter.delete(scheduleEntry);
		}		
	}

	public static enum ENTRYNUMBEREnum {
		ONLY, ALL, OTHER
	}
}
