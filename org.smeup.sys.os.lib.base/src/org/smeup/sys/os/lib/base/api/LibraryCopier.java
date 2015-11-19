/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;

@Program(name = "QMNCPYL")
public @Supported class LibraryCopier {
	public static enum QCPFMSG {
		CPF2365, CPF2110, CPF2111
	}

	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QCommandManager commandManager;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@Supported @DataDef(length = 10) QCharacter existingLibrary, @Supported @DataDef(length = 10) QCharacter newLibrary,
			@Supported @DataDef(length = 4) QEnum<CREATELIBRARYEnum, QCharacter> createLibrary, @Supported @DataDef(length = 4) QEnum<DUPLICATEDATAEnum, QCharacter> duplicateData,
			@DataDef(length = 4) QEnum<DUPLICATECONSTRAINTSEnum, QCharacter> duplicateConstraints, @DataDef(length = 4) QEnum<DUPLICATETRIGGERSEnum, QCharacter> duplicateTriggers,
			@DataDef(length = 4) QEnum<DUPLICATEFILEIDENTIFIERSEnum, QCharacter> duplicateFileIdentifiers) {

		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);

		String existingLibName = existingLibrary.trimR();
		String newLibName = newLibrary.trimR();

		if (existingLibName.equalsIgnoreCase(newLibName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2365, new String[] {});
		}

		QLibrary qExistingLibrary = libraryWriter.lookup(existingLibName);

		if (qExistingLibrary == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] { existingLibName });
		}

		QLibrary qNewLibrary = libraryWriter.lookup(newLibName);

		switch (createLibrary.asEnum()) {
		case YES:
			if (qNewLibrary != null) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2111, new String[] { newLibName });
			}
			qNewLibrary = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			qNewLibrary.setName(newLibName);
			libraryWriter.save(qNewLibrary);
			break;

		case NO:
			if (qNewLibrary == null) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] { newLibName });
			}
			break;
		}

		String command = "CRTDUPOBJ OBJ(*ALL)" + " FROMLIB(" + existingLibrary.trimR() + ")" + " OBJTYPE(*ALL)" + " TOLIB(" + newLibName + ")" + " NEWOBJ(*OBJ)" + " DATA("
				+ duplicateData.asData().trimR() + ")";
		commandManager.executeCommandImmediate(job.getJobID(), command, null, true);
	}

	public static enum CREATELIBRARYEnum {
		YES, NO
	}

	public static enum DUPLICATEDATAEnum {
		YES, NO
	}

	public static enum DUPLICATECONSTRAINTSEnum {
		YES, NO
	}

	public static enum DUPLICATETRIGGERSEnum {
		YES, NO
	}

	public static enum DUPLICATEFILEIDENTIFIERSEnum {
		NO, YES
	}
}
