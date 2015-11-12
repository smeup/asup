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

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name = "QWCCDSAC")
public class ActiveJobWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;

	public @Main void main(@ToDo @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output, @ToDo @DataDef(length = 1) QEnum<ResetStatusStatisticsEnum, QCharacter> resetStatusStatistics,
			@ToDo @DataDef(dimension = 25, length = 10) QScroller<QEnum<SubsystemEnum, QCharacter>> subsystem,
			@ToDo @DataDef(precision = 3, scale = 1) QEnum<CPUPercentLimitEnum, QDecimal> cPUPercentLimit,
			@ToDo @DataDef(precision = 4, scale = 1) QEnum<ResponseTimeLimitEnum, QDecimal> responseTimeLimit, @ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<SequenceEnum, QBinary> sequence,
			@ToDo @DataDef(qualified = true) JobName jobName, @ToDo @DataDef(precision = 3) QEnum<AutomaticRefreshIntervalEnum, QDecimal> automaticRefreshInterval) {

		QObjectWriter objectWriter = null;

		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			break;
		case TERM_STAR:
			objectWriter = outputManager.getDefaultWriter(job.getContext());
			break;
		}

		objectWriter.initialize();

		for (QJob qJob : jobManager.getActiveJobs())
			try {
				objectWriter.write(qJob);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}

		objectWriter.flush();
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum ResetStatusStatisticsEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SubsystemEnum {
		ALL, OTHER
	}

	public static enum CPUPercentLimitEnum {
		@Special(value = "-1.0")
		NONE, OTHER
	}

	public static enum ResponseTimeLimitEnum {
		@Special(value = "-1.0")
		NONE, OTHER
	}

	public static enum SequenceEnum {
		@Special(value = "1")
		SBS, @Special(value = "9")
		AUXIO, @Special(value = "6")
		CPU, @Special(value = "10")
		CPUPCT, @Special(value = "16")
		CURUSR, @Special(value = "11")
		FUNCTION, @Special(value = "7")
		INT, @Special(value = "2")
		JOB, @Special(value = "14")
		NUMBER, @Special(value = "4")
		POOL, @Special(value = "5")
		PTY, @Special(value = "8")
		RSP, @Special(value = "12")
		STS, @Special(value = "15")
		THREADS, @Special(value = "3")
		TYPE, @Special(value = "13")
		USER
	}

	public static class JobName extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<NameGenericEnum, QCharacter> nameGeneric;

		public static enum NameGenericEnum {
			ALL, SYS, SBS, OTHER
		}
	}

	public static enum AutomaticRefreshIntervalEnum {
		@Special(value = "-1")
		PRV, OTHER
	}
}