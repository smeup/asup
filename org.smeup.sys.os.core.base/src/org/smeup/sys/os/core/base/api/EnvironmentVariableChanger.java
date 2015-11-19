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
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;

@Supported
@Program(name = "QP0ZCHGE")
public class EnvironmentVariableChanger {

	public static enum QCPFMSG {
		CPFA981     //La variabile di ambiente non esiste.	
	}
	
	@Inject
	private QJob job;
	@Inject
	private QSystemManager systemManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	
	public @Main void main(
			@Supported @DataDef(length = 128) QCharacter environmentVariable, 
			@Supported @DataDef(length = 1024) QEnum<NewValueEnum, QCharacter> newValue,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID, 
			@Supported @DataDef(length = 4) QEnum<EnvironmentVariableLevelEnum, QCharacter> level) {
	
		EnvironmentVariablesManager environmentVariablesManager = new EnvironmentVariablesManager(job, level.asEnum());
		String key = environmentVariable.trimR();
		if (!environmentVariablesManager.contains(key)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPFA981, new String[0]); 
		}
		
		switch (newValue.asEnum()) {
		case SAME:
			return;
		
		case NULL:
			environmentVariablesManager.setValue(key, null, true);
			break;

		case OTHER:
			environmentVariablesManager.setValue(key, newValue.asData().trimR(), true);
			break;
		}
		environmentVariablesManager.save(systemManager, resourceManager);				
	}

	public static enum NewValueEnum {
		SAME, NULL, OTHER
	}
	
	public static enum CodedCharacterSetIDEnum {
		@Special(value = "0")
		JOB, @Special(value = "65535")
		HEX, OTHER
	}
}
