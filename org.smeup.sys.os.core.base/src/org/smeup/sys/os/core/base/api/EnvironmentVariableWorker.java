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

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.core.out.QWritableObject;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;

@Supported
@Program(name = "QP0ZWRKE")
public class EnvironmentVariableWorker {

	@Inject
	private QJob job;
	@Inject
	private QOutputManager outputManager;

	@Main
	public void main(@Supported @DataDef(length = 4) QEnum<EnvironmentVariableLevelEnum, QCharacter> level) {
		try {
			String label = "Environment variables for level " + level;
			QWritableObject objectToWrite = outputManager.getWritableObject(label, 132);
			objectToWrite.setObject(new EnvironmentVariablesManager(job, level.asEnum()).toString());

			QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
			objectWriter.initialize();
			objectWriter.write(objectToWrite.getObjectToWrite());
			objectWriter.flush();
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

}