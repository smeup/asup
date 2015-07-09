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

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

public @ToDo @Program(name = "ENDJOB") class ENDJOB {
	public @Entry void main(@ToDo @DataDef(qualified = true) JobName jobName, @ToDo @DataDef(length = 1) QEnum<HowToEndEnum, QCharacter> howToEnd,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary controlledEndDelayTime, @ToDo @DataDef(length = 1) QEnum<DeleteSpooledFilesEnum, QCharacter> deleteSpooledFiles,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<MaximumLogEntriesEnum, QBinary> maximumLogEntries,
			@ToDo @DataDef(length = 7) QEnum<AdditionalInteractiveJobsEnum, QCharacter> additionalInteractiveJobs,
			@ToDo @DataDef(length = 10) QEnum<DuplicateJobOptionEnum, QCharacter> duplicateJobOption) {
	}

	public static class JobName extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10)
		public QCharacter user;
		@DataDef(length = 6)
		public QCharacter number;

		public static enum NameEnum {
			@Special(value = "*")
			TERM_STAR, OTHER
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
