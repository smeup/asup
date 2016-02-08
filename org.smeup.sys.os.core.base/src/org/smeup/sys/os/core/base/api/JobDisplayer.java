/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 *   Mattia Rocchi   - Further implementation
 */
package org.smeup.sys.os.core.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.base.api.JobName.JobNotFoundException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name = "QMHDSPJ")
public class JobDisplayer {

	public static enum QCPFMSG {
		CPF9871, CPF1070
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJobManager jobManager;

	@Main
	public void main(@Supported @DataDef(qualified = true) JobName jobName, @Supported @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output,
			@ToDo @DataDef(qualified = true) FileToReceiveOutput fileToReceiveOutput, @ToDo OutputMemberOptions outputMemberOptions) {

		try {
			QJob jobFound = jobName.findJob(job, jobManager);
			QObjectWriter objectWriter = findWiter(output);
			objectWriter.initialize();
			objectWriter.write(jobFound);
			objectWriter.flush();
		} catch (JobNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1070, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trim() });
		} catch (IOException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9871);
		}
	}

	private QObjectWriter findWiter(QEnum<OutputEnum, QCharacter> output) {
		switch (output.asEnum()) {
		case TERM_STAR:
			return outputManager.getDefaultWriter(job.getContext());
		case PRINT:
			return outputManager.getObjectWriter(job.getContext(), "P");
		case OUTFILE:
			throw new OperatingSystemRuntimeException("Unsupported output type " + output);
		case APIDFN:
			throw new OperatingSystemRuntimeException("Unsupported output type " + output);
		}
		throw new OperatingSystemRuntimeException("Unsupported output type " + output);
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT, @Special(value = "P")
		APIDFN, @Special(value = "N")
		OUTFILE
	}

	public static class FileToReceiveOutput extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class OutputMemberOptions extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*FIRST")
		public QEnum<MemberToReceiveOutputEnum, QCharacter> memberToReceiveOutput;
		@DataDef(length = 7, value = "*REPLACE")
		public QEnum<ReplaceOrAddRecordsEnum, QCharacter> replaceOrAddRecords;

		public static enum MemberToReceiveOutputEnum {
			FIRST, OTHER
		}

		public static enum ReplaceOrAddRecordsEnum {
			@Special(value = "REPLACE")
			REPLACE, @Special(value = "ADD")
			ADD
		}
	}

}