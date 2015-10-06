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
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.base.api.tools.JobName;
import org.smeup.sys.os.core.base.api.tools.JobName.JobNotFoundException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

public @ToDo @Program(name = "QWTCCCNJ") class JobTerminator {
	
	public static enum QCPFMSG {
		CPF1321, //Il lavoro &1 utente &2 numero di lavoro &3 non trovati
	}
	
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJobManager jobManager;
	
	public @Entry void main(
			@Supported @DataDef(qualified = true) JobName jobName,
			@ToDo @DataDef(length = 1) QEnum<HowToEndEnum, QCharacter> howToEnd,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary controlledEndDelayTime,
			@ToDo @DataDef(length = 1) QEnum<DeleteSpooledFilesEnum, QCharacter> deleteSpooledFiles,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<MaximumLogEntriesEnum, QBinary> maximumLogEntries,
			@ToDo @DataDef(length = 7) QEnum<AdditionalInteractiveJobsEnum, QCharacter> additionalInteractiveJobs,
			@ToDo @DataDef(length = 10) QEnum<DuplicateJobOptionEnum, QCharacter> duplicateJobOption) {
		
		try {
			QJob jobToTerminate = jobName.findJob(job, jobManager);
			jobManager.close(jobToTerminate);						
		} catch (JobNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] {jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trim()});				
		}
	}

	public static enum HowToEndEnum {
		@Special(value = "C")
		CNTRLD, @Special(value = "I")
		IMMED
	}

	public static enum DeleteSpooledFilesEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum MaximumLogEntriesEnum {
		@Special(value = "-2")
		SAME, @Special(value = "-1")
		NOMAX, OTHER
	}

	public static enum AdditionalInteractiveJobsEnum {
		@Special(value = "NON")
		NONE, @Special(value = "GRP")
		GRPJOB, @Special(value = "ALL")
		ALL
	}

	public static enum DuplicateJobOptionEnum {
		SELECT, MSG
	}
}
