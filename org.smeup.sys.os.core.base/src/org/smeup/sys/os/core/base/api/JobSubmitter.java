/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.base.api.tools.JobLogWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QProgramManager;

@Program(name = "QWTCCSBJ")
public class JobSubmitter {

	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QCommandManager commandManager;
	@Inject
	private QProgramManager programManager;
	@Inject
	private QOutputManager outputManager;

	@Entry
	public void main(@ToDo @DataDef(length = 20000) QCharacter commandToRun, 
			@ToDo @DataDef(length = 10) QEnum<JobNameEnum, QCharacter> jobName,
			@ToDo @DataDef(qualified = true) JobDescription jobDescription, @ToDo @DataDef(qualified = true) JobQueue jobQueue,
			@ToDo @DataDef(length = 1) QEnum<JobPriorityonJOBQEnum, QCharacter> jobPriorityonJOBQ, @ToDo @DataDef(length = 1) QEnum<OutputPriorityonOUTQEnum, QCharacter> outputPriorityonOUTQ,
			@ToDo @DataDef(length = 10) QEnum<PrintDeviceEnum, QCharacter> printDevice, @ToDo @DataDef(qualified = true) OutputQueue outputQueue,
			@ToDo @DataDef(length = 10) QEnum<UserEnum, QCharacter> user, @ToDo @DataDef(length = 15) QEnum<AccountingCodeEnum, QCharacter> accountingCode,
			@ToDo @DataDef(length = 30) QEnum<PrintTextEnum, QCharacter> printText, @ToDo @DataDef(length = 80) QEnum<RoutingDataEnum, QCharacter> routingData,
			@ToDo @DataDef(length = 3000) QEnum<RequestDataOrCommandEnum, QCharacter> requestDataOrCommand, @ToDo @DataDef(length = 10) QEnum<SystemLibraryListEnum, QCharacter> systemLibraryList,
			@ToDo @DataDef(length = 10) QEnum<CurrentLibraryEnum, QCharacter> currentLibrary,
			@ToDo @DataDef(dimension = 250, length = 10) QEnum<InitialLibraryListEnum, QScroller<QCharacter>> initialLibraryList,
			@ToDo @DataDef(length = 10) QEnum<InitialASPGroupEnum, QCharacter> initialASPGroup, @ToDo MessageLogging messageLogging,
			@ToDo @DataDef(length = 1) QEnum<LogCLProgramCommandsEnum, QCharacter> logCLProgramCommands, @ToDo @DataDef(length = 10) QEnum<JobLogOutputEnum, QCharacter> jobLogOutput,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<JobMessageQueueMaximumSizeEnum, QBinary> jobMessageQueueMaximumSize,
			@ToDo @DataDef(length = 10) QEnum<JobMessageQueueFullActionEnum, QCharacter> jobMessageQueueFullAction,
			@ToDo @DataDef(length = 1) QEnum<InquiryMessageReplyEnum, QCharacter> inquiryMessageReply, @ToDo @DataDef(length = 1) QEnum<HoldOnJobQueueEnum, QCharacter> holdOnJobQueue,
			@ToDo @DataDef(datetimeType = DatetimeType.DATE) QEnum<ScheduleDateEnum, QDatetime> scheduleDate,
			@ToDo @DataDef(datetimeType = DatetimeType.TIME) QEnum<ScheduleTimeEnum, QDatetime> scheduleTime, @ToDo @DataDef(datetimeType = DatetimeType.DATE) QEnum<JobDateEnum, QDatetime> jobDate,
			@ToDo @DataDef(length = 8) QEnum<JobSwitchesEnum, QCharacter> jobSwitches, @ToDo @DataDef(length = 1) QEnum<AllowDisplayByWRKSBMJOBEnum, QCharacter> allowDisplayByWRKSBMJOB,
			@ToDo @DataDef(qualified = true) SubmittedFor submittedFor, @ToDo @DataDef(qualified = true) MessageQueue messageQueue, @ToDo @DataDef(qualified = true) SortSequence sortSequence,
			@ToDo @DataDef(length = 3) QEnum<LanguageIDEnum, QCharacter> languageID, @ToDo @DataDef(length = 2) QEnum<CountryOrRegionIDEnum, QCharacter> countryOrRegionID,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID,
			@ToDo @DataDef(length = 1) QEnum<CopyEnvironmentVariablesEnum, QCharacter> copyEnvironmentVariables,
			@ToDo @DataDef(length = 1) QEnum<AllowMultipleThreadsEnum, QCharacter> allowMultipleThreads, @ToDo @DataDef(length = 10) QEnum<SpooledFileActionEnum, QCharacter> spooledFileAction) {

		@SuppressWarnings("resource")
		QCallableProgram caller = programManager.getCaller(job.getJobID(), this);

		// Job spawn
		QJob childJob = jobManager.create(job);
		
		switch (jobName.asEnum()) {
		// TODO
		case JOBD:
			break;
		case OTHER:
			if (!jobName.isEmpty()) {
				childJob.setJobName(jobName.asData().trimR());

				// TODO remove -> QJobListener
				if (childJob.getJobName().startsWith("LO_")) {
					outputManager.setDefaultWriter(job.getContext(), "L");
				}
			}

			break;
		}

		// add message to queue
		NumberFormat numberFormat = new DecimalFormat("000000");
		job.getMessages().add(numberFormat.format(childJob.getJobNumber()));

		// Submit command
		new SubmittedCommand(childJob, commandToRun.trimR(), caller).start();

		jobLogManager.info(job, "Job submitted:" + childJob);
	}

	private class SubmittedCommand extends Thread {

		private QJob qJob;
		private String commandString;
		private QCallableProgram caller;

		protected SubmittedCommand(QJob qJob, String commandString, QCallableProgram caller) {
			this.qJob = qJob;
			this.commandString = commandString;
			this.caller = caller;
		}

		@Override
		public void run() {

			Map<String, Object> variables = null;
			if (caller != null) {

				variables = new HashMap<String, Object>();

				for (Field field : caller.getRawProgram().getClass().getFields()) {

					Type type = field.getGenericType();

					Class<?> fieldKlass = null;

					if (type instanceof ParameterizedType)
						fieldKlass = (Class<?>) ((ParameterizedType) type).getRawType();
					else
						fieldKlass = (Class<?>) type;

					if (QData.class.isAssignableFrom(fieldKlass)) {
						Object variable;
						try {
							variable = field.get(caller.getRawProgram());
							variables.put(field.getName(), variable);
						} catch (IllegalArgumentException | IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			}

			commandManager.executeCommandImmediate(qJob.getJobID(), commandString, variables, true);
			
			QObjectWriter objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			QJobLog jobLog = jobLogManager.lookup(qJob);
			
			new JobLogWriter(objectWriter).write(jobLog);
			
			jobManager.close(qJob);
		}
	}

	public static enum JobNameEnum {
		JOBD, OTHER
	}

	public static class JobDescription extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameEnum {
			USRPRF, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class JobQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameEnum {
			JOBD, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum JobPriorityonJOBQEnum {
		@Special(value = "*")
		JOBD, OTHER
	}

	public static enum OutputPriorityonOUTQEnum {
		@Special(value = "*")
		JOBD, OTHER
	}

	public static enum PrintDeviceEnum {
		CURRENT, @Special(value = "X'40404040404040404040'")
		USRPRF, SYSVAL, JOBD, OTHER
	}

	public static class OutputQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameEnum {
			CURRENT, USRPRF, DEV, JOBD, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum UserEnum {
		CURRENT, JOBD, OTHER
	}

	public static enum AccountingCodeEnum {
		CURRENT, USRPRF, JOBD, OTHER
	}

	public static enum PrintTextEnum {
		CURRENT, JOBD, SYSVAL, BLANK, OTHER
	}

	public static enum RoutingDataEnum {
		JOBD, RQSDTA, OTHER
	}

	public static enum RequestDataOrCommandEnum {
		CMD, JOBD, NONE, RTGDTA, OTHER
	}

	public static enum SystemLibraryListEnum {
		CURRENT, SYSVAL
	}

	public static enum CurrentLibraryEnum {
		CURRENT, USRPRF, CRTDFT, OTHER
	}

	public static enum InitialLibraryListEnum {
		CURRENT, JOBD, SYSVAL, NONE, OTHER
	}

	public static enum InitialASPGroupEnum {
		CURRENT, JOBD, NONE, OTHER
	}

	public static class MessageLogging extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*JOBD")
		public QEnum<LevelEnum, QCharacter> level;
		@DataDef(binaryType = BinaryType.SHORT, value = "*JOBD")
		public QEnum<SeverityEnum, QBinary> severity;
		@DataDef(length = 1, value = "*JOBD")
		public QEnum<TextEnum, QCharacter> text;

		public static enum LevelEnum {
			@Special(value = "*")
			JOBD, OTHER
		}

		public static enum SeverityEnum {
			@Special(value = "-2")
			JOBD, OTHER
		}

		public static enum TextEnum {
			@Special(value = "*")
			JOBD, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, @Special(value = "N")
			NOLIST
		}
	}

	public static enum LogCLProgramCommandsEnum {
		@Special(value = "*")
		JOBD, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobLogOutputEnum {
		JOBD, SYSVAL, JOBLOGSVR, JOBEND, PND
	}

	public static enum JobMessageQueueMaximumSizeEnum {
		@Special(value = "1")
		JOBD, @Special(value = "0")
		SYSVAL, OTHER
	}

	public static enum JobMessageQueueFullActionEnum {
		@Special(value = "D")
		JOBD, SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP
	}

	public static enum InquiryMessageReplyEnum {
		@Special(value = "*")
		JOBD, @Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL
	}

	public static enum HoldOnJobQueueEnum {
		@Special(value = "*")
		JOBD, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum ScheduleDateEnum {
		@Special(value = "0000001")
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

	public static enum ScheduleTimeEnum {
		@Special(value = "999999")
		CURRENT, OTHER
	}

	public static enum JobDateEnum {
		@Special(value = "0020000")
		JOBD, @Special(value = "0010000")
		SYSVAL, OTHER
	}

	public static enum JobSwitchesEnum {
		JOBD, OTHER
	}

	public static enum AllowDisplayByWRKSBMJOBEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static class SubmittedFor extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10)
		public QCharacter user;
		@DataDef(length = 6)
		public QCharacter number;

		public static enum NameEnum {
			CURRENT, OTHER
		}
	}

	public static class MessageQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameEnum {
			USRPRF, WRKSTN, NONE, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class SortSequence extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameEnum {
			CURRENT, USRPRF, SYSVAL, HEX, LANGIDUNQ, LANGIDSHR, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum LanguageIDEnum {
		@Special(value = "*")
		CURRENT, @Special(value = "*US")
		USRPRF, @Special(value = "*SY")
		SYSVAL, OTHER
	}

	public static enum CountryOrRegionIDEnum {
		@Special(value = "*")
		CURRENT, @Special(value = "*U")
		USRPRF, @Special(value = "*S")
		SYSVAL, OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "0")
		CURRENT, @Special(value = "-1")
		USRPRF, @Special(value = "-2")
		SYSVAL, @Special(value = "65535")
		HEX, OTHER
	}

	public static enum CopyEnvironmentVariablesEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum AllowMultipleThreadsEnum {
		@Special(value = "*")
		JOBD, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SpooledFileActionEnum {
		CURRENT, JOBD, SYSVAL, KEEP, DETACH
	}

}
