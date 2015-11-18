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
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.jobs.QJob;

@Supported @Program(name = "QP0ZWRKE")
public class EnvironmentVariableWorker {

	@Inject
	private QJob job;
	
	public @Main void main(@Supported @DataDef(length = 4) QEnum<EnvironmentVariableLevelEnum, QCharacter> level) {
		//TODO
		System.out.println(new EnvironmentVariables(job, level.asEnum()));
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
