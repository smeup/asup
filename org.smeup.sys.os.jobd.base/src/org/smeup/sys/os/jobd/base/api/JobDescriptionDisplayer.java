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
package org.smeup.sys.os.jobd.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.jobd.QJobDescription;

@Supported
@Program(name = "QWDCDSG")
public class JobDescriptionDisplayer {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;

	@Main
	public void main(@Supported @DataDef(qualified = true) JobDescription jobDescription, @Supported @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output) {

		QObjectWriter objectWriter = null;
		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), output.getSpecialName());
			break;
		case TERM_STAR:
			objectWriter = outputManager.getObjectWriter(job.getContext(), output.asData().trimR());
			break;
		}
		objectWriter.initialize();

		// if (jobDescription.name.trimR().equals("*CURRENT")) {
		// writeLibraries(objectWriter, job.getLibraries());
		// objectWriter.flush();
		// return;
		// }

		QResourceReader<QJobDescription> resourceReader = null;

		String library = null;
		switch (jobDescription.library.asEnum()) {
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, QJobDescription.class, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, QJobDescription.class, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = jobDescription.library.asData().trimR();
			resourceReader = resourceManager.getResourceReader(job, QJobDescription.class, library);
			break;
		}

		QJobDescription qJobDescription = resourceReader.lookup(jobDescription.name.trimR());
		if (qJobDescription == null)
			throw new OperatingSystemRuntimeException("Job description not found: " + jobDescription);

		try {
			objectWriter.write(qJobDescription);
		} catch (IOException e) {
			jobLogManager.error(job, e.getMessage());
		}
		
		objectWriter.flush();

	}

	public static class JobDescription extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}
}
