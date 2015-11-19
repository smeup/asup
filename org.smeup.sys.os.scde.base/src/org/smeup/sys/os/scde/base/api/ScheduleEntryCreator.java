package org.smeup.sys.os.scde.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
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
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryFactory;
import org.smeup.sys.os.scde.QScheduleEntry;

@Program(name = "ADDJOBSCDE")
public @ToDo class ScheduleEntryCreator {

	@Inject
	private QResourceManager resourceManager;

	@Inject
	private QJob job;

	public static enum QCPFMSG {

	}

	public @Main void main(
			@ToDo @DataDef(length = 10) QEnum<JOBNAMEEnum, QCharacter> jobName,
			@ToDo @DataDef(length = 512) QCharacter commandToRun,
			@ToDo @DataDef(length = 1) QEnum<FREQUENCYEnum, QCharacter> frequency,
			@ToDo @DataDef(datetimeType = DatetimeType.DATE) QEnum<SCHEDULEDATEEnum, QDatetime> scheduleDate,
			@ToDo @DataDef(dimension = 7, length = 1) QScroller<QEnum<SCHEDULEDAYEnum, QCharacter>> scheduleDay,
			@ToDo @DataDef(datetimeType = DatetimeType.TIME) QEnum<SCHEDULETIMEEnum, QDatetime> scheduleTime,
			@DataDef(dimension = 5, length = 1) QScroller<QEnum<RELATIVEDAYOFMONTHEnum, QCharacter>> relativeDayOfMonth,
			@ToDo @DataDef(length = 5) QEnum<SAVEEnum, QCharacter> save,
			@DataDef(dimension = 20, datetimeType = DatetimeType.DATE) QScroller<QEnum<OMITDATEEnum, QDatetime>> omitDate,
			@ToDo @DataDef(length = 1) QEnum<RECOVERYACTIONEnum, QCharacter> recoveryAction,
			@DataDef(qualified = true) QEnum<JOBDESCRIPTIONEnum, JOBDESCRIPTION> jobDescription,
			@DataDef(qualified = true) QEnum<JOBQUEUEEnum, JOBQUEUE> jobQueue,
			@ToDo @DataDef(length = 10) QEnum<USEREnum, QCharacter> user,
			@ToDo @DataDef(qualified = true) QEnum<MESSAGEQUEUEEnum, MESSAGEQUEUE> messageQueue,
			@ToDo @DataDef(length = 50) QEnum<TEXTDESCRIPTIONEnum, QCharacter> textDescription) {

		QResourceWriter<QScheduleEntry> resourceWriter = resourceManager.getResourceWriter(job, QScheduleEntry.class, job.getSystem().getSystemLibrary());

		QScheduleEntry scheduleEntry = QOperativeSystemScheduleEntryFactory.eINSTANCE.createScheduleEntry();

		scheduleEntry.setJobName(jobName.asData().trimR());
		scheduleEntry.setFrequency(frequency.asData().trimR());
		
		
		switch(scheduleDate.asEnum()) {
		case CURRENT:		
		case MONTHEND:			
		case MONTHSTR:
		case OTHER:
			scheduleEntry.setScheduledDate(scheduleDate.asData().toString());
			break;
		case NONE:
			break;	
		}
		
		for (QEnum<SCHEDULEDAYEnum, QCharacter> enumElem : scheduleDay) {

			switch(enumElem.asEnum()){
			case ALL:			
			case MON:
			case TUE:
			case WED:
			case THU:
			case FRI:					
			case SAT:			
			case SUN:			
				scheduleEntry.getScheduledDay().add(enumElem.asData().trimR());		
				break;	
			case NONE:
				break;		
			}
		}

		scheduleEntry.setScheduledTime(scheduleTime.asData().toString());
		scheduleEntry.setCommandToRun(commandToRun.asString());
		scheduleEntry.setUser(user.asData().asString());
		scheduleEntry.setDescription(textDescription.asData().asString());

		resourceWriter.save(scheduleEntry);
	}

	public static enum JOBNAMEEnum {
		JOBD, OTHER
	}

	public static enum FREQUENCYEnum {
		@Special(value = "O")
		ONCE, @Special(value = "W")
		WEEKLY, @Special(value = "M")
		MONTHLY
	}

	public static enum SCHEDULEDATEEnum {
		@Special(value = "0000001")
		CURRENT, @Special(value = "0000002")
		MONTHSTR, @Special(value = "0000003")
		MONTHEND, @Special(value = "0000004")
		NONE, OTHER
	}

	public static enum SCHEDULEDAYEnum {
		@Special(value = "0")
		NONE, @Special(value = "8")
		ALL, @Special(value = "1")
		MON, @Special(value = "2")
		TUE, @Special(value = "3")
		WED, @Special(value = "4")
		THU, @Special(value = "5")
		FRI, @Special(value = "6")
		SAT, @Special(value = "7")
		SUN
	}

	public static enum SCHEDULETIMEEnum {
		@Special(value = "999999")
		CURRENT, OTHER
	}

	public static enum RELATIVEDAYOFMONTHEnum {
		@Special(value = "6")
		LAST, NUM_1, NUM_2, NUM_3, NUM_4, NUM_5
	}

	public static enum SAVEEnum {
		NO, YES
	}

	public static enum OMITDATEEnum {
		@Special(value = "0000001")
		NONE, OTHER
	}

	public static enum RECOVERYACTIONEnum {
		@Special(value = "R")
		SBMRLS, @Special(value = "H")
		SBMHLD, @Special(value = "N")
		NOSBM
	}

	public static class JOBDESCRIPTION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum JOBDESCRIPTIONEnum {
		USRPRF, OTHER
	}

	public static class JOBQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum JOBQUEUEEnum {
		JOBD, OTHER
	}

	public static enum USEREnum {
		CURRENT, JOBD, OTHER
	}

	public static class MESSAGEQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum MESSAGEQUEUEEnum {
		USRPRF, NONE, OTHER
	}

	public static enum TEXTDESCRIPTIONEnum {
		@Special(value = "")
		BLANK, OTHER
	}
}
