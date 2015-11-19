/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.jobd.base.api;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.jobd.QJobDescription;
import org.smeup.sys.os.type.QOperatingSystemTypeFactory;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.QTypedRef;

@Supported
@Program(name = "QWDCCHG")
public class JobDescriptionChanger {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	@Main
	public void main(@Supported @DataDef(qualified = true) JobDescription jobDescription, @Supported @DataDef(qualified = true) QEnum<JobQueueEnum, JobQueue> jobQueue,
			@Supported @DataDef(length = 1) QEnum<JobPriorityonJOBQEnum, QCharacter> jobPriorityonJOBQ,
			@Supported @DataDef(length = 1) QEnum<OutputPriorityonOUTQEnum, QCharacter> outputPriorityonOUTQ, @DataDef(length = 10) QEnum<PrintDeviceEnum, QCharacter> printDevice,
			@DataDef(qualified = true) QEnum<OutputQueueEnum, OutputQueue> outputQueue, @Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			@Supported @DataDef(length = 10) QEnum<UserEnum, QCharacter> user, @DataDef(length = 15) QEnum<AccountingCodeEnum, QCharacter> accountingCode,
			@DataDef(length = 30) QEnum<PrintTextEnum, QCharacter> printText, @DataDef(length = 80) QEnum<RoutingDataEnum, QCharacter> routingData,
			@DataDef(length = 256) QEnum<RequestDataOrCommandEnum, QCharacter> requestDataOrCommand,
			@Supported @DataDef(dimension = 250, length = 10) QScroller<QEnum<InitialLibraryListEnum, QCharacter>> initialLibraryList,
			@DataDef(length = 10) QEnum<InitialASPGroupEnum, QCharacter> initialASPGroup, MessageLogging messageLogging,
			@DataDef(length = 1) QEnum<LogCLProgramCommandsEnum, QCharacter> logCLProgramCommands, @DataDef(length = 10) QEnum<JobLogOutputEnum, QCharacter> jobLogOutput,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<JobMessageQueueMaximumSizeEnum, QBinary> jobMessageQueueMaximumSize,
			@DataDef(length = 10) QEnum<JobMessageQueueFullActionEnum, QCharacter> jobMessageQueueFullAction,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<CLSyntaxCheckEnum, QBinary> cLSyntaxCheck, @DataDef(binaryType = BinaryType.SHORT) QEnum<EndSeverityEnum, QBinary> endSeverity,
			@DataDef(length = 1) QEnum<InquiryMessageReplyEnum, QCharacter> inquiryMessageReply, @DataDef(length = 1) QEnum<HoldOnJobQueueEnum, QCharacter> holdOnJobQueue,
			@DataDef(datetimeType = DatetimeType.DATE) QEnum<JobDateEnum, QDatetime> jobDate, @DataDef(length = 8) QEnum<JobSwitchesEnum, QCharacter> jobSwitches,
			@DataDef(length = 13) QEnum<DeviceRecoveryActionEnum, QCharacter> deviceRecoveryAction, @DataDef(length = 10) QEnum<TimeSliceEndPoolEnum, QCharacter> timeSliceEndPool,
			@DataDef(length = 1) QEnum<AllowMultipleThreadsEnum, QCharacter> allowMultipleThreads, @DataDef(length = 10) QEnum<SpooledFileActionEnum, QCharacter> spooledFileAction,
			@DataDef(length = 10) QEnum<DDMConversationEnum, QCharacter> dDMConversation) {

		QResourceWriter<QJobDescription> resource = null;

		String library = null;
		switch (jobDescription.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceWriter(job, QJobDescription.class, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QJobDescription.class, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = jobDescription.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QJobDescription.class, library);
			break;
		}

		QJobDescription qJobDescription = resource.lookup(jobDescription.name.trimR());
		if (qJobDescription == null)
			throw new OperatingSystemRuntimeException("Job Description " + jobDescription.name + " not exists in library " + library);

		// TEXT
		switch (textDescription.asEnum()) {
		case SAME:
			break;
		case BLANK:
			qJobDescription.setText(textDescription.getSpecialName());
			break;
		case OTHER:
			qJobDescription.setText(textDescription.asData().trimR());
			break;
		}

		// JOBQ
		QTypedRef<?> refJobQueue = null;
		switch (jobQueue.asEnum()) {
		case SAME:
			refJobQueue = qJobDescription.getJobQueue();
			break;
		case OTHER:

			refJobQueue = QOperatingSystemTypeFactory.eINSTANCE.createTypedRef();
			refJobQueue.setName(jobQueue.asData().name.trimR());
			switch (jobQueue.asData().library.asEnum()) {
			case LIBL:
			case CURLIB:
				refJobQueue.setLibrary(jobQueue.asData().library.getSpecialName());
				break;
			case OTHER:
				refJobQueue.setLibrary(jobQueue.asData().library.asData().trimR());
				break;
			}
			break;
		}
		qJobDescription.setJobQueue(refJobQueue);

		// JOBPTY
		switch (jobPriorityonJOBQ.asEnum()) {
		case SAME:
			break;
		case OTHER:
			qJobDescription.setJobPriorityOnJobq(jobPriorityonJOBQ.asData().trimR());
			break;
		}

		// OUTPTY
		switch (outputPriorityonOUTQ.asEnum()) {
		case SAME:
			break;
		case OTHER:
			qJobDescription.setOutputPriorityOnOutq(outputPriorityonOUTQ.asData().trimR());
			break;
		}

		// OUTQ
		QTypedRef<QTypedObject> refOutQueue = null;
		switch (outputQueue.asEnum()) {
		case SAME:
			break;
		case DEV:
		case WRKSTN:
		case USRPRF:
			refOutQueue = QOperatingSystemTypeFactory.eINSTANCE.createTypedRef();
			refOutQueue.setName(outputQueue.getSpecialName());
			qJobDescription.setOutQueue(refOutQueue);
			break;
		case OTHER:

			refOutQueue = QOperatingSystemTypeFactory.eINSTANCE.createTypedRef();
			refOutQueue.setName(outputQueue.asData().name.trimR());
			switch (outputQueue.asData().library.asEnum()) {
			case LIBL:
			case CURLIB:
				refOutQueue.setLibrary(outputQueue.asData().library.getSpecialName());
				break;
			case OTHER:
				refOutQueue.setLibrary(outputQueue.asData().library.asData().trimR());
				break;
			}
			qJobDescription.setOutQueue(refOutQueue);
			break;
		}

		// USER
		switch (user.asEnum()) {
		case SAME:
			break;
		case RQD:
			qJobDescription.setUser(user.getSpecialName());
			break;
		case OTHER:
			qJobDescription.setUser(user.asData().trimR());
			break;
		}

		// INLLIBL
		List<String> libraries = qJobDescription.getLibraries();
		qJobDescription.getLibraries().clear();
		for (QEnum<InitialLibraryListEnum, QCharacter> initialLibrary : initialLibraryList) {

			if (initialLibrary.asData().isEmpty())
				continue;

			switch (initialLibrary.asEnum()) {
			case NONE:
				qJobDescription.getLibraries().clear();
				break;
			case SAME:
				qJobDescription.getLibraries().addAll(libraries);
				break;
			case SYSVAL:
				// TODO
				break;
			case OTHER:
				qJobDescription.getLibraries().add(initialLibrary.asData().asString());
				break;
			}
		}

		resource.save(qJobDescription, true);
		jobLogManager.info(job, "Job Description " + jobDescription.name.trimR() + " changed");
	}

	public static class JobDescription extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class JobQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum JobQueueEnum {
		SAME, OTHER
	}

	public static enum JobPriorityonJOBQEnum {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum OutputPriorityonOUTQEnum {
		@Special(value = "*")
		SAME, OTHER
	}

	public static enum PrintDeviceEnum {
		SAME, @Special(value = "X'40404040404040404040'")
		USRPRF, SYSVAL, WRKSTN, OTHER
	}

	public static class OutputQueue extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum OutputQueueEnum {
		SAME, USRPRF, DEV, WRKSTN, OTHER
	}

	public static enum TextDescriptionEnum {
		SAME, @Special(value = "")
		BLANK, OTHER
	}

	public static enum UserEnum {
		SAME, RQD, OTHER
	}

	public static enum AccountingCodeEnum {
		SAME, USRPRF, @Special(value = "X'404040404040404040404040404040'")
		BLANK, OTHER
	}

	public static enum PrintTextEnum {
		SAME, SYSVAL, BLANK, OTHER
	}

	public static enum RoutingDataEnum {
		SAME, RQSDTA, OTHER
	}

	public static enum RequestDataOrCommandEnum {
		SAME, NONE, RTGDTA, OTHER
	}

	public static enum InitialLibraryListEnum {
		SAME, SYSVAL, NONE, OTHER
	}

	public static enum InitialASPGroupEnum {
		SAME, NONE, OTHER
	}

	public static class MessageLogging extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<LevelEnum, QCharacter> level;
		@DataDef(binaryType = BinaryType.SHORT, value = "*SAME")
		public QEnum<SeverityEnum, QBinary> severity;
		@DataDef(length = 1, value = "*SAME")
		public QEnum<TextEnum, QCharacter> text;

		public static enum LevelEnum {
			@Special(value = "*")
			SAME, OTHER
		}

		public static enum SeverityEnum {
			@Special(value = "-2")
			SAME, OTHER
		}

		public static enum TextEnum {
			@Special(value = "*")
			SAME, @Special(value = "M")
			MSG, @Special(value = "S")
			SECLVL, @Special(value = "N")
			NOLIST
		}
	}

	public static enum LogCLProgramCommandsEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'40'")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobLogOutputEnum {
		SAME, SYSVAL, JOBLOGSVR, JOBEND, PND
	}

	public static enum JobMessageQueueMaximumSizeEnum {
		@Special(value = "-2")
		SAME, @Special(value = "0")
		SYSVAL, OTHER
	}

	public static enum JobMessageQueueFullActionEnum {
		@Special(value = "*")
		SAME, @Special(value = "")
		SYSVAL, @Special(value = "N")
		NOWRAP, @Special(value = "W")
		WRAP, @Special(value = "P")
		PRTWRAP
	}

	public static enum CLSyntaxCheckEnum {
		@Special(value = "-2")
		SAME, @Special(value = "-1")
		NOCHK, OTHER
	}

	public static enum EndSeverityEnum {
		@Special(value = "-2")
		SAME, OTHER
	}

	public static enum InquiryMessageReplyEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		RQD, @Special(value = "X'01'")
		DFT, @Special(value = "X'02'")
		SYSRPYL
	}

	public static enum HoldOnJobQueueEnum {
		@Special(value = "*")
		SAME, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum JobDateEnum {
		@Special(value = "0000000")
		SAME, @Special(value = "0010000")
		SYSVAL, OTHER
	}

	public static enum JobSwitchesEnum {
		SAME, OTHER
	}

	public static enum DeviceRecoveryActionEnum {
		SAME, SYSVAL, MSG, DSCMSG, DSCENDRQS, ENDJOB, ENDJOBNOLIST
	}

	public static enum TimeSliceEndPoolEnum {
		SAME, SYSVAL, NONE, BASE
	}

	public static enum AllowMultipleThreadsEnum {
		@Special(value = "*")
		SAME, @Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES
	}

	public static enum SpooledFileActionEnum {
		SAME, SYSVAL, KEEP, DETACH
	}

	public static enum DDMConversationEnum {
		SAME, KEEP, DROP
	}
}
