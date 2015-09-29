package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.base.api.tools.JobName;
import org.smeup.sys.os.core.base.api.tools.JobName.JobNotFoundException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name = "QWTCCCHJ")
public @Supported class JobAttributesSetter {
	public static enum QCPFMSG {
		CPF1321, //Il lavoro &1 utente &2 numero di lavoro &3 non trovati
		CPF1156, //Job &3/&2/&1 job switch &4 not valid. 
	}

	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJobManager jobManager;

	
	public @Entry void main(
			@DataDef(qualified = true) JobName jobName,
			@DataDef(length = 1) QEnum<JOBPRIORITYONJOBQEnum, QCharacter> jobPriorityonJOBQ,
			@DataDef(length = 1) QEnum<OUTPUTPRIORITYONOUTQEnum, QCharacter> outputPriorityonOUTQ,
			@DataDef(length = 10) QEnum<PRINTDEVICEEnum, QCharacter> printDevice,
			@ToDo @DataDef(qualified = true) QEnum<OUTPUTQUEUEEnum, OUTPUTQUEUE> outputQueue,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<RUNPRIORITYEnum, QBinary> runPriority,
			@DataDef(qualified = true) QEnum<JOBQUEUEEnum, JOBQUEUE> jobQueue,
			@DataDef(length = 30) QEnum<PRINTTEXTEnum, QCharacter> printText,
			MESSAGELOGGING messageLogging,
			@DataDef(length = 1) QEnum<LOGCLPROGRAMCOMMANDSEnum, QCharacter> logCLProgramCommands,
			@DataDef(length = 10) QEnum<JOBLOGOUTPUTEnum, QCharacter> jobLogOutput,
			@ToDo @DataDef(length = 10) QEnum<JOBMESSAGEQUEUEFULLACTIONEnum, QCharacter> jobMessageQueueFullAction,
			@ToDo @DataDef(length = 1) QEnum<INQUIRYMESSAGEREPLYEnum, QCharacter> inquiryMessageReply,
			@DataDef(length = 7) QEnum<BREAKMESSAGEHANDLINGEnum, QCharacter> breakMessageHandling,
			@ToDo @DataDef(length = 7) QEnum<STATUSMESSAGEEnum, QCharacter> statusMessage,
			@DataDef(length = 1) QEnum<DDMCONVERSATIONEnum, QCharacter> dDMConversation,
			@DataDef(datetimeType = DatetimeType.DATE) QEnum<SCHEDULEDATEEnum, QDatetime> scheduleDate,
			@DataDef(datetimeType = DatetimeType.TIME) QEnum<SCHEDULETIMEEnum, QDatetime> scheduleTime,
			@ToDo @DataDef(datetimeType = DatetimeType.DATE) QEnum<JOBDATEEnum, QDatetime> jobDate,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<DATEFORMATEnum, QBinary> dateFormat,
			@ToDo @DataDef(length = 1) QEnum<DATESEPARATOREnum, QCharacter> dateSeparator,
			@ToDo @DataDef(length = 1) QEnum<TIMESEPARATOREnum, QCharacter> timeSeparator,
			@ToDo @DataDef(length = 8) QEnum<JOBSWITCHESEnum, QCharacter> jobSwitches,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<TIMESLICEEnum, QBinary> timeSlice,
			@DataDef(length = 1) QEnum<ELIGIBLEFORPURGEEnum, QCharacter> eligibleForPurge,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<DEFAULTWAITTIMEEnum, QBinary> defaultWaitTime,
			@DataDef(length = 13) QEnum<DEVICERECOVERYACTIONEnum, QCharacter> deviceRecoveryAction,
			@DataDef(length = 10) QEnum<TIMESLICEENDPOOLEnum, QCharacter> timeSliceEndPool,
			@DataDef(length = 10) QEnum<PRINTKEYFORMATEnum, QCharacter> printKeyFormat,
			@DataDef(qualified = true) QEnum<SORTSEQUENCEEnum, SORTSEQUENCE> sortSequence,
			@ToDo @DataDef(length = 3) QEnum<LANGUAGEIDEnum, QCharacter> languageID,
			@ToDo @DataDef(length = 2) QEnum<COUNTRYORREGIONIDEnum, QCharacter> countryOrRegionID,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CODEDCHARACTERSETIDEnum, QBinary> codedCharacterSetID,
			@ToDo @DataDef(length = 1) QEnum<DECIMALFORMATEnum, QCharacter> decimalFormat,
			@DataDef(length = 10) QEnum<CHARACTERIDENTIFIERCONTROLEnum, QCharacter> characterIdentifierControl,
			@DataDef(length = 10) QEnum<SPOOLEDFILEACTIONEnum, QCharacter> spooledFileAction,
			@DataDef(length = 10) QEnum<WORKLOADCAPPINGGROUPEnum, QCharacter> wORKLOADCAPPINGGROUP,
			@DataDef(length = 10) QEnum<DUPLICATEJOBOPTIONEnum, QCharacter> duplicateJobOption) {
		
		/*
		cLVarForSWS8.eval(job.getSwitches());
		cLVarForDATE6.eval(varForDate());
		cLVarForDATFMT4.eval(job.getJobDateFormat().getLiteral());
		cLVarForDATSEP1.eval(job.getDateSeparator());
		cLVarForTIMSEP1.eval(job.getTimeSeparator());
		//
		cLVarForDFTWAIT70.eval(1);
		//
		cLVarForCCSID50.eval(UTF_8);
		cLVarForDFTCCSID50.eval(UTF_8); 		 
		 */
	
		try {
			QJob jobToChange = jobName.findJob(job, jobManager);
			setSwitches(jobToChange, jobSwitches);
		} catch (JobNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] {jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trim()});				
		}

	}

	private void setSwitches(QJob jobToChange, QEnum<JOBSWITCHESEnum, QCharacter> jobSwitches) {
		String jobSwitchesString = jobSwitches.asData().trimR();
		try {
			jobSwitches.asEnum().setSwitches(jobToChange, jobSwitchesString);
		} catch (Exception e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, 
					new String[] {jobToChange.getName(), jobToChange.getCreationInfo().getCreationUser(), "" + jobToChange.getJobNumber(), jobSwitchesString});
		}
	}

	public static enum JOBPRIORITYONJOBQEnum {
		@Special(value = "*")
		SAME, 
		OTHER
	}

	public static enum OUTPUTPRIORITYONOUTQEnum {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum PRINTDEVICEEnum {
		SAME, USRPRF, SYSVAL, WRKSTN, OTHER
	}

	public static class OUTPUTQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum OUTPUTQUEUEEnum {
		SAME, USRPRF, DEV, WRKSTN, OTHER
	}

	public static enum RUNPRIORITYEnum {
		@Special(value = "0")
		SAME, OTHER
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
		SAME, OTHER
	}

	public static enum PRINTTEXTEnum {
		SAME, SYSVAL, BLANK, OTHER
	}

	public static class MESSAGELOGGING extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<LEVELEnum, QCharacter> level;
		@DataDef(binaryType = BinaryType.SHORT, value = "*SAME")
		public QEnum<SEVERITYEnum, QBinary> severity;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<TEXTEnum, QCharacter> text;

		public static enum LEVELEnum {
			@Special(value = "*")
			SAME, OTHER
		}

		public static enum SEVERITYEnum {
			@Special(value = "-2")
			SAME, OTHER
		}

		public static enum TEXTEnum {
			@Special(value = "*")
			SAME, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, @Special(value = "N")
			NOLIST
		}
	}

	public static enum LOGCLPROGRAMCOMMANDSEnum {
		@Special(value = "*")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JOBLOGOUTPUTEnum {
		SAME, SYSVAL, JOBLOGSVR, JOBEND, PND
	}

	public static enum JOBMESSAGEQUEUEFULLACTIONEnum {
		@Special(value = "*")
		SAME, SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP
	}

	public static enum INQUIRYMESSAGEREPLYEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL
	}

	public static enum BREAKMESSAGEHANDLINGEnum {
		SAME, NORMAL, NOTIFY, HOLD
	}

	public static enum STATUSMESSAGEEnum {
		SAME, USRPRF, SYSVAL, NONE, NORMAL
	}

	public static enum DDMCONVERSATIONEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		KEEP, @Special(value = "D")
		DROP
	}

	public static enum SCHEDULEDATEEnum {
		@Special(value = "0000000")
		SAME, @Special(value = "0000001")
		CURRENT, @Special(value = "0000002")
		MONTHSTR, @Special(value = "0000003")
		MONTHEND, @Special(value = "0000011")
		MON, @Special(value = "0000012")
		TUE, @Special(value = "0000013")
		WED, @Special(value = "0000014")
		THU, @Special(value = "0000015")
		FRI, @Special(value = "0000016")
		SAT, @Special(value = "0000017")
		SUN, OTHER
	}

	public static enum SCHEDULETIMEEnum {
		@Special(value = "888888")
		SAME, @Special(value = "999999")
		CURRENT, OTHER
	}

	public static enum JOBDATEEnum {
		@Special(value = "0000000")
		SAME, OTHER
	}

	public static enum DATEFORMATEnum {
		@Special(value = "-1")
		SAME, @Special(value = "0")
		SYSVAL, @Special(value = "1")
		YMD, @Special(value = "2")
		MDY, @Special(value = "3")
		DMY, @Special(value = "4")
		JUL
	}

	public static enum DATESEPARATOREnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		SYSVAL, @Special(value = "X'40'")
		BLANK, @Special(value = "/")
		slash, @Special(value = "-")
		minus, @Special(value = ".")
		dot, @Special(value = "")
		blank, @Special(value = ",")
		comma
	}

	public static enum TIMESEPARATOREnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		SYSVAL, @Special(value = "X'40'")
		BLANK, @Special(value = ":")
		column, @Special(value = ".")
		dot, @Special(value = "")
		blank, @Special(value = ",")
		comma
	}

	public static enum JOBSWITCHESEnum {
		SAME {
			@Override
			public void setSwitches(QJob jobToChange, String trimR) throws Exception {
				//Nothing to do
			}
		}, 
		OTHER {
			@Override
			public void setSwitches(QJob jobToChange, String jobSwitches) throws Exception {
				char[] parameterSwitches = jobSwitches.toCharArray();	
				if (parameterSwitches.length != 8) {
					throw new Exception();
				}
				char[] oldSwitches = jobToChange.getSwitches().toCharArray();
				char[] newSwitches = new char[8];
				for (int i = 0; i < parameterSwitches.length; i++) {
					switch (parameterSwitches[i]) {
					case '0':
					case '1':
						newSwitches[i] = parameterSwitches[i]; 
						break;
					case 'X':
						newSwitches[i] = oldSwitches[i]; 					
					default:
						throw new Exception();
					}
				}
				jobToChange.setSwitches(new String(newSwitches));
			}
		}
	;

		public abstract void setSwitches(QJob jobToChange, String trimR) throws Exception;
	}
	
	
	public static enum TIMESLICEEnum {
		@Special(value = "0")
		SAME, OTHER
	}

	public static enum ELIGIBLEFORPURGEEnum {
		@Special(value = "*")
		SAME, @Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DEFAULTWAITTIMEEnum {
		@Special(value = "0")
		SAME, @Special(value = "-1")
		NOMAX, OTHER
	}

	public static enum DEVICERECOVERYACTIONEnum {
		SAME, SYSVAL, MSG, DSCMSG, DSCENDRQS, ENDJOB, ENDJOBNOLIST
	}

	public static enum TIMESLICEENDPOOLEnum {
		SAME, SYSVAL, NONE, BASE
	}

	public static enum PRINTKEYFORMATEnum {
		SAME, SYSVAL, NONE, PRTBDR, PRTHDR, PRTALL
	}

	public static class SORTSEQUENCE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum SORTSEQUENCEEnum {
		SAME, USRPRF, SYSVAL, HEX, LANGIDUNQ, LANGIDSHR, OTHER
	}

	public static enum LANGUAGEIDEnum {
		@Special(value = "*")
		SAME, @Special(value = "*US")
		USRPRF, @Special(value = "*SY")
		SYSVAL, OTHER
	}

	public static enum COUNTRYORREGIONIDEnum {
		@Special(value = "*")
		SAME, @Special(value = "*U")
		USRPRF, @Special(value = "*S")
		SYSVAL, OTHER
	}

	public static enum CODEDCHARACTERSETIDEnum {
		@Special(value = "0")
		SAME, @Special(value = "-1")
		USRPRF, @Special(value = "-2")
		SYSVAL, @Special(value = "65535")
		HEX, OTHER
	}

	public static enum DECIMALFORMATEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		SYSVAL, @Special(value = "X'40'")
		BLANK, @Special(value = "I")
		I, @Special(value = "J")
		J
	}

	public static enum CHARACTERIDENTIFIERCONTROLEnum {
		SAME, USRPRF, SYSVAL, DEVD, JOBCCSID
	}

	public static enum SPOOLEDFILEACTIONEnum {
		SAME, SYSVAL, KEEP, DETACH
	}

	public static enum WORKLOADCAPPINGGROUPEnum {
		SAME, NONE, OTHER
	}

	public static enum DUPLICATEJOBOPTIONEnum {
		SELECT, MSG
	}
}
