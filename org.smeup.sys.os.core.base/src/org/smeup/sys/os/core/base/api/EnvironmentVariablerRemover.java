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
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.env.EnvironmentLevel;
import org.smeup.sys.os.core.env.QEnvironmentVariableManager;
import org.smeup.sys.os.core.jobs.QJob;

@Supported
@Program(name = "QP0ZDLTE")
public class EnvironmentVariablerRemover {

	public static enum QCPFMSG {
		CPFA981     //La variabile di ambiente non esiste.	
	}

	@Inject
	private QJob job;
	@Inject
	private QEnvironmentVariableManager environmentVariableManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Main
	public void main(
			@Supported @DataDef(length = 128) QCharacter environmentVariable, 
			@Supported @DataDef(length = 4) QEnum<EnvironmentLevel, QCharacter> level) {
	
		if(environmentVariableManager.removeVariable(job, level.asEnum(), environmentVariable.trimR()) == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPFA981, environmentVariable.trimR()); 
	}
}
