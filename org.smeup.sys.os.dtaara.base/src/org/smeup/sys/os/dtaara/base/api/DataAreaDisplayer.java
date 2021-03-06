/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.dtaara.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.DataAreaNotFoundException;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.LibraryNotFoundException;

@Program(name = "QWCCDSVC")
public class DataAreaDisplayer {

	public static enum QCPFMSG {
		CPF1015, // Non è stata trovata l'area dati &1 in &2.
		CPF1021, // Non è stata trovata la libreria &1 per l'area dati &2.
		CPF1046, // DTAARA(*GDA) non è valido perché il lavoro non è un lavoro
					// di gruppo.
		CPF9871 // Si è verificato un errore durante l'elaborazione.
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataAreaManager dataAreaManager;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@DataDef(qualified = true) QEnum<ExistingDataAreaSpecification.DATAAREAEnum, ExistingDataAreaSpecification> dataAreaSpecification,
			@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output, @DataDef(length = 1) QEnum<OUTPUTFORMATEnum, QCharacter> outputFormat,
			@Unsupported @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {

		try {
			QDataArea area = dataAreaSpecification.asData().findDataArea(job, resourceManager, dataAreaManager, dataAreaSpecification.asEnum());
			QObjectWriter objectWriter = findOutputWriter(output);
			objectWriter.initialize();
			objectWriter.write(area);
			objectWriter.flush();
		} catch (DataAreaNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1015, new String[] { e.dataAreaName, e.libraryName });
		} catch (LibraryNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1021, new String[] { e.libraryName, e.dataAreaName });
		} catch (IOException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9871, new String[0]);
		}
	}

	private QObjectWriter findOutputWriter(QEnum<OUTPUTEnum, QCharacter> output) {
		if (output.asEnum().equals(OUTPUTEnum.PRINT)) {
			return outputManager.getObjectWriter(job.getContext(), "P");
		} else {
			return outputManager.getDefaultWriter(job.getContext());
		}
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR,

		@Special(value = "L")
		PRINT
	}

	public static enum OUTPUTFORMATEnum {
		@Special(value = "C")
		CHAR,

		@Special(value = "H")
		HEX
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL,

		@Special(value = "R")
		RMT
	}
}
