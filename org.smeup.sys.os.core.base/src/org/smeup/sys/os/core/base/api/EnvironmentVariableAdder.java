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

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QP0ZADDE")
public class EnvironmentVariableAdder {

	public @Entry void main(@ToDo @DataDef(length = 128) QCharacter environmentVariable, @ToDo @DataDef(length = 1024) QEnum<InitialValueEnum, QCharacter> initialValue,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID, @ToDo @DataDef(length = 4) QEnum<LevelEnum, QCharacter> level,
			@ToDo @DataDef(length = 4) QEnum<ReplaceExistingEntryEnum, QCharacter> replaceExistingEntry) {

		"".toCharArray();
	}

	public static enum InitialValueEnum {
		NULL, OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "0")
		JOB, @Special(value = "65535")
		HEX, OTHER
	}

	public static enum LevelEnum {
		JOB, SYS
	}

	public static enum ReplaceExistingEntryEnum {
		NO, YES
	}
}
