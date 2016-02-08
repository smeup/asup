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
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.dtaara.QDataArea;

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
	private QJobLogManager jobLogManager;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@DataDef(qualified = true) DATAAREA dataArea) {

		String areaName = dataArea.nameGeneric.asData().trimR();
		String libName = dataArea.library.asData().trimR();

		QResourceWriter<QDataArea> writer = resourceManager.getResourceWriter(job, QDataArea.class, dataArea.library.asEnum(), dataArea.library.asData().trimR());
		if (writer == null) 
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, dataArea.library.asData().trimR());

		int deleted = 0;
		
		QObjectIterator<QDataArea> objectIterator = null;
		try {
			switch (dataArea.nameGeneric.asEnum()) {
			case ALL:
				objectIterator = writer.find(null);
				break;
			case OTHER:
				objectIterator = writer.find(dataArea.nameGeneric.asData().trimR());
				break;
			}

			while (objectIterator.hasNext()) {
				QDataArea nextDataArea = objectIterator.next();

				writer.delete(nextDataArea);
				jobLogManager.info(job, exceptionManager.prepareException(job, QCPFMSG.CPC2191, new String[] { nextDataArea.getName(), nextDataArea.getLibrary(), "DTAARA" }).getMessageText());
				deleted++;
			}
			
			if (deleted == 0) 
				jobLogManager.info(job, exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] { areaName, libName, "DTAARA" }).getMessageText());
		}
		finally {
			if(objectIterator != null)
				objectIterator.close();
		}
		jobLogManager.info(job, exceptionManager.prepareException(job, QCPFMSG.CPF2117, new String[] { "", "", "DTAARA", "" + deleted, "0" }).getMessageText());
	}

	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(length = 10)
		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;

		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;

		public static enum NAMEGENERICEnum {
			ALL, OTHER
		}
	}
}
