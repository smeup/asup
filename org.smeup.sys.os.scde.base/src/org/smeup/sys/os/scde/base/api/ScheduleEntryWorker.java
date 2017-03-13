package org.smeup.sys.os.scde.base.api;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.scde.QScheduleEntry;
import org.smeup.sys.os.scde.QScheduleManager;

@Program(name = "QWCCWRYC")
public class ScheduleEntryWorker {
	
	@Inject
	QJobCapability jobCapability;
	
	@Inject
	QJobManager jobManager;
	
	@Inject
	private QOutputManager outputManager;
	
	@Inject
	private QJobLogManager jobLogManager;
		
	@Inject
	private QScheduleManager scheduleManager;
	
	public static enum QCPFMSG {
		//TODO: manage command CPF
	}

	@Main
	public void main(
			@DataDef(length = 10) QEnum<JOBNAMEEnum, QCharacter> jobName,
			@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@DataDef(length = 6) QEnum<PRINTFORMATEnum, QCharacter> printFormat,
			@DataDef(length = 9) QEnum<SEQUENCEEnum, QCharacter> sequence,
			@DataDef(length = 10) QEnum<SCHEDULEDBYUSEREnum, QCharacter> scheduledByUser,
			@DataDef(datetimeType = DatetimeType.DATE) QEnum<SUBMITDATEEnum, QDatetime> submitDate,
			@DataDef(qualified = true) QEnum<JOBQUEUEEnum, JOBQUEUE> jobQueue) {
		
		QJob job = jobManager.lookup(jobCapability);
		
		QObjectWriter objectWriter = null;

		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			break;
		case TERM_STAR:
			objectWriter = outputManager.getDefaultWriter(job.getContext());
			break;
		}
		
		String strJobName = "";
		
		switch (jobName.asEnum()){
		case ALL:
				strJobName = "*";
			break;
		case OTHER:
				strJobName = jobName.asData().asString();
			break;
		default:
			break;
		
		}		

		objectWriter.initialize();
		
		List<QScheduleEntry> entries = scheduleManager.lookup(jobCapability, strJobName);

		QObject qObject = null;
		for (QScheduleEntry entry: entries) {
			try {				
				objectWriter.write(entry);
			} catch (Exception e) {
				jobLogManager.error(job, qObject + " " + e.getMessage());
			}
		}

		objectWriter.flush();		
	}

	public static enum JOBNAMEEnum {
		ALL, OTHER
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum PRINTFORMATEnum {
		BASIC, FULL
	}

	public static enum SEQUENCEEnum {
		JOB, DATETIME, JOBQ
	}

	public static enum SCHEDULEDBYUSEREnum {
		ALL, OTHER
	}

	public static enum SUBMITDATEEnum {
		@Special(value = "0000002")
		ALL, @Special(value = "0000003")
		CURRENT, OTHER
	}

	public static class JOBQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(dimension = 1, length = 10)
		public QScroller<QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum JOBQUEUEEnum {
		ALL, OTHER
	}
}
