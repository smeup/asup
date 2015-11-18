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

import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.enums.YesNoEnum;
import org.smeup.sys.os.core.jobs.QJob;

@Supported @Program(name = "QP0ZADDE")
public class EnvironmentVariableAdder {

	@Inject
	private QJob job;
	
	public @Main void main(
			@Supported @DataDef(length = 128) QCharacter environmentVariable, 
			@Supported @DataDef(length = 1024) QEnum<InitialValueEnum, QCharacter> initialValue,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID, 
			@Supported @DataDef(length = 4) QEnum<EnvironmentVariableLevelEnum, QCharacter> level,
			@Supported @DataDef(length = 4) QEnum<YesNoEnum, QCharacter> replaceExistingEntry) {

		new EnvironmentVariables(job, level.asEnum())
		.setValue(environmentVariable.trimR(), getValue(initialValue), replaceExistingEntry.asEnum().asBoolean())
		.save();
	}


	private String getValue(QEnum<InitialValueEnum, QCharacter> initialValue) {
		switch (initialValue.asEnum()) {
		case NULL:
			return null;
		case OTHER:
			return initialValue.asData().trimR();
		}
		throw new RuntimeException("Wrong initial value: " + initialValue);
	}


	public static enum InitialValueEnum {
		NULL, 
		OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "0")
		JOB, 
		@Special(value = "65535")
		HEX, 
		OTHER
	}

}
