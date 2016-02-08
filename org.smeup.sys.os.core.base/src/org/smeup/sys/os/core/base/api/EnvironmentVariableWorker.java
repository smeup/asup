/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.env.EnvironmentLevel;
import org.smeup.sys.os.core.env.QEnvironmentVariable;
import org.smeup.sys.os.core.env.QEnvironmentVariableManager;
import org.smeup.sys.os.core.jobs.QJob;

@Supported
@Program(name = "QP0ZWRKE")
public class EnvironmentVariableWorker {

	@Inject
	private QJob job;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QEnvironmentVariableManager environmentVariableManager;
	
	@Main
	public void main(@Supported @DataDef(length = 4) QEnum<EnvironmentLevel, QCharacter> level) {
		try {

			QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
			objectWriter.initialize();
	
			for(QEnvironmentVariable variable: environmentVariableManager.listVariables(job, level.asEnum())) 
				objectWriter.write(variable);
			
			objectWriter.flush();
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

}