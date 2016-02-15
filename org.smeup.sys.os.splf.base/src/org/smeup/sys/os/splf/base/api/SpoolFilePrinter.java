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
package org.smeup.sys.os.splf.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.splf.QSpoolFile;
import org.smeup.sys.os.splf.QSpoolFileWriter;

public @Program(name = "QASSPLFP") class SpoolFilePrinter {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QSpoolFileWriter spoolFileWriter;

	public static enum QCPFMSG {
	}

	@Main
	public void main(@DataDef(length = 255) QCharacter spoolID) {

		QResourceReader<QSpoolFile> spoolFileReader = resourceManager.getResourceReader(job, QSpoolFile.class, Scope.SYSTEM_LIBRARY);
		QSpoolFile spoolFile = spoolFileReader.lookup(spoolID.trimR());

		if (spoolFile == null) {
			throw new OperatingSystemRuntimeException("Invalid spool ID");
		}

		spoolFileWriter.writeSpoolFile(job.getContext(), spoolFile);
	}
}
