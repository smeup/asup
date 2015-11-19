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
package org.smeup.sys.os.dtaara.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.base.api.DataAreaDeleter.DATAAREA.LIBRARYEnum;
import org.smeup.sys.os.dtaara.base.api.DataAreaDeleter.DATAAREA.NAMEGENERICEnum;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QLIDLDTAARA")
public @ToDo class DataAreaDeleter {
	public static enum QCPFMSG {
		CPF2105, // Non trovato oggetto &1 in &2 tipo *&3.
		CPF2110, // Libreria &1 non trovata.
		CPF2117, // &4 oggetti di tipo *&3 sono stati cancellati. &5 oggetti non
					// sono stati cancellati.
		CPC2191 // È stato cancellato l'oggetto &1 in &2 di tipo *&3
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@DataDef(qualified = true) DATAAREA dataArea) {
		checkLibrary(dataArea.library);

		String areaName = dataArea.nameGeneric.asData().trimR();
		String libName = dataArea.library.asData().trimR();

		QResourceReader<QDataArea> reader = findReader(dataArea);

		int deleted = 0;
		try (QObjectIterator<QDataArea> objectIterator = findIterator(dataArea.nameGeneric, reader);) {
			while (objectIterator.hasNext()) {
				QDataArea nextDataArea = objectIterator.next();
				findWriter(nextDataArea.getLibrary()).delete(nextDataArea);
				exceptionManager.prepareException(job, QCPFMSG.CPC2191, new String[] { nextDataArea.getName(), nextDataArea.getLibrary(), "DTAARA" });
				deleted++;
			}
			if (deleted == 0) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] { areaName, libName, "DTAARA" });
			}
		}
		exceptionManager.prepareException(job, QCPFMSG.CPF2117, new String[] { "", "", "DTAARA", "" + deleted, "0" });
	}

	private void checkLibrary(QEnum<LIBRARYEnum, QCharacter> library) {
		if (library.asEnum().equals(DATAAREA.LIBRARYEnum.OTHER)) {
			QResourceSetReader<QLibrary> resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
			String libraryString = library.asData().trimR();
			if (!resourceReader.exists(libraryString)) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] { libraryString });
			}
		}
	}

	@SuppressWarnings("resource")
	private QObjectIterator<QDataArea> findIterator(QEnum<NAMEGENERICEnum, QCharacter> nameGeneric, QResourceReader<QDataArea> reader) {
		QObjectIterator<QDataArea> result = null;
		switch (nameGeneric.asEnum()) {
		case ALL:
			result = reader.find(null);
			break;
		case OTHER:
			result = reader.find(nameGeneric.asData().trimR());
			break;
		}
		return result;
	}

	private QResourceReader<QDataArea> findReader(DATAAREA object) {
		QResourceReader<QDataArea> resourceReader = null;
		switch (object.library.asEnum()) {
		case ALL:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.ALL);
			break;
		case ALLUSR:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.ALL_USER);
			break;
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, object.library.asData().trimR());
			break;
		}
		return resourceReader;
	}

	private QResourceWriter<QDataArea> findWriter(String library) {
		return resourceManager.getResourceWriter(job, QDataArea.class, library);
	}

	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(length = 10)
		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;

		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEGENERICEnum {
			ALL, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}
}
