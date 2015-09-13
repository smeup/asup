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
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;

@Program(name = "QLICHLLE") 
public @Supported class CurrentLibraryChanger {
	
	public static enum QCPFMSG {
		CPF2110
	}

	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(@Supported @DataDef(length = 10) QEnum<CURRENTLIBRARYEnum, QCharacter> currentLibrary) {
		
		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);

		switch (currentLibrary.asEnum()) {
		case CRTDFT:
			job.setCurrentLibrary(null);
			break;

		case OTHER:
			String libName = currentLibrary.asData().trimR();
			QLibrary qLibrary = libraryWriter.lookup(libName);

			if (qLibrary == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] {libName});		
			
			job.setCurrentLibrary(libName);
			break;
		}
		
		jobLogManager.info(job, "Current library is now " + job.getCurrentLibrary());
	}

	
	public static enum CURRENTLIBRARYEnum {
		@Special(value = "X'40404040404040404040'")
		CRTDFT, OTHER
	}
}
