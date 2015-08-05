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
package org.smeup.sys.os.splf.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
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
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.splf.QSpoolFile;

public @ToDo @Program(name = "QSPWRKF") class SpoolFileWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	public static enum QCPFMSG {
	}

	public @Entry void main(@ToDo SELECTFILESFOR selectFilesFor, @DataDef(qualified = true) QEnum<JOBNAMEEnum, JOBNAME> jobName, TIMEPERIOD timePeriod,
			@DataDef(length = 10) QEnum<ASPDEVICEEnum, QCharacter> aSPDevice, @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@DataDef(length = 7) QEnum<DISPLAYFORMATEnum, QCharacter> displayFormat, @DataDef(length = 10) QEnum<ASSISTANCELEVELEnum, QCharacter> assistanceLevel) {

		QResourceReader<QSpoolFile> spoolFileReader = resourceManager.getResourceReader(job, QSpoolFile.class, job.getSystem().getSystemLibrary());

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

		try(QObjectIterator<QSpoolFile> spoolFileIterator = spoolFileReader.find(null);) {
			while (spoolFileIterator.hasNext()) {
				QSpoolFile spoolFile = spoolFileIterator.next();
		
				try {
					objectWriter.write(spoolFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		objectWriter.flush();
	}

	public static class SELECTFILESFOR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*CURRENT")
		public QEnum<USEREnum, QCharacter> user;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<PRINTDEVICEEnum, QCharacter> printDevice;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<FORMTYPEEnum, QCharacter> formType;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<USERDATAEnum, QCharacter> userData;
		@DataDef(binaryType = BinaryType.SHORT, value = "*ALL")
		public QEnum<ASPEnum, QBinary> aSP;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<SPOOLEDFILEEnum, QCharacter> spooledFile;

		public static enum USEREnum {
			CURRENT, ALL, OTHER
		}

		public static enum PRINTDEVICEEnum {
			ALL, OUTQ, OTHER
		}

		public static enum FORMTYPEEnum {
			ALL, STD, OTHER
		}

		public static enum USERDATAEnum {
			ALL, OTHER
		}

		public static enum ASPEnum {
			@Special(value = "0")
			ALL, @Special(value = "-1")
			ASPDEV, OTHER
		}

		public static enum SPOOLEDFILEEnum {
			ALL, OTHER
		}
	}

	public static class JOBNAME extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter nameGeneric;
		@DataDef(length = 10, value = "*ALL")
		public QEnum<USEREnum, QCharacter> user;
		@DataDef(length = 6, value = "*ALL")
		public QEnum<NUMBEREnum, QCharacter> number;

		public static enum USEREnum {
			ALL, OTHER
		}

		public static enum NUMBEREnum {
			ALL, OTHER
		}
	}

	public static enum JOBNAMEEnum {
		ALL, OTHER
	}

	public static class TIMEPERIOD extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		public TIMEPERIOD.STARTTIMEANDDATE startTimeAndDate;
		public TIMEPERIOD.ENDTIMEANDDATE endTimeAndDate;

		public static class STARTTIMEANDDATE extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(datetimeType = DatetimeType.TIME, value = "*AVAIL")
			public QEnum<BEGINNINGTIMEEnum, QDatetime> beginningTime;
			@DataDef(datetimeType = DatetimeType.DATE, value = "*BEGIN")
			public QEnum<BEGINNINGDATEEnum, QDatetime> beginningDate;

			public static enum BEGINNINGTIMEEnum {
				@Special(value = "000000")
				AVAIL, OTHER
			}

			public static enum BEGINNINGDATEEnum {
				@Special(value = "0000000")
				BEGIN, OTHER
			}
		}

		public static class ENDTIMEANDDATE extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(datetimeType = DatetimeType.TIME, value = "*AVAIL")
			public QEnum<ENDINGTIMEEnum, QDatetime> endingTime;
			@DataDef(datetimeType = DatetimeType.DATE, value = "*END")
			public QEnum<ENDINGDATEEnum, QDatetime> endingDate;

			public static enum ENDINGTIMEEnum {
				@Special(value = "235959")
				AVAIL, OTHER
			}

			public static enum ENDINGDATEEnum {
				@Special(value = "0000000")
				END, OTHER
			}
		}
	}

	public static enum ASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, SYSBAS, CURASPGRP, OTHER
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum DISPLAYFORMATEnum {
		INLENV, S36FMT, NORMAL
	}

	public static enum ASSISTANCELEVELEnum {
		PRV, USRPRF, BASIC, INTERMED
	}
}
