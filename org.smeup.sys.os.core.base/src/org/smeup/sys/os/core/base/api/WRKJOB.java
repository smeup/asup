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
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

public @ToDo @Program(name = "WRKJOB") class WRKJOB {
	public @Main void main(@ToDo @DataDef(qualified = true) JobName jobName, @ToDo @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<OptionEnum, QBinary> option, @ToDo @DataDef(length = 10) QEnum<DuplicateJobOptionEnum, QCharacter> duplicateJobOption) {
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

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum OptionEnum {
		@Special(value = "13")
		SELECT, @Special(value = "1")
		STSA, @Special(value = "2")
		DFNA, @Special(value = "3")
		RUNA, @Special(value = "4")
		SPLF, @Special(value = "5")
		JOBLOG, @Special(value = "6")
		PGMSTK, @Special(value = "7")
		JOBLCK, @Special(value = "8")
		LIBL, @Special(value = "9")
		OPNF, @Special(value = "10")
		FILOVR, @Special(value = "11")
		CMTCTL, @Special(value = "14")
		CMNSTS, @Special(value = "15")
		ACTGRP, @Special(value = "16")
		MUTEX, @Special(value = "17")
		THREAD, @Special(value = "18")
		MLBA, @Special(value = "12")
		ALL
	}

	public static enum DuplicateJobOptionEnum {
		SELECT, MSG
	}
}
