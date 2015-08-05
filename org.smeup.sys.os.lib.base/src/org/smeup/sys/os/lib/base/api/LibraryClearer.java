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
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.base.api.tools.LibraryHandler;
import org.smeup.sys.os.type.QTypeRegistry;

@Program(name = "QLICLLIB1")
public @Supported class LibraryClearer {
	public static enum QCPFMSG {
		CPF2110
	}
	
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	public @Entry void main(
			@Supported @DataDef(length = 10) QEnum<LIBRARYEnum, QCharacter> library,
			@DataDef(length = 10) QEnum<ASPDEVICEEnum, QCharacter> aSPDevice) {
		
		QLibrary qLibrary = findLibrary(library);
		
		if (qLibrary == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] {library.asData().trimR()});	
		
		new LibraryHandler(qLibrary, job, typeRegistry, resourceManager).clear();
		
		jobLogManager.info(job, "Cleared library " + qLibrary.getName());
	}

	private QLibrary findLibrary(QEnum<LIBRARYEnum, QCharacter> library) {
		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);
		QLibrary qLibrary = null;
		
		switch (library.asEnum()) {
		case OTHER:
			qLibrary = libraryWriter.lookup(library.asData().trimR());
			break;

		case CURLIB:
			qLibrary = libraryWriter.lookup(job.getCurrentLibrary());
			break;
		}
			
		return qLibrary;
	}

	public static enum LIBRARYEnum {
		CURLIB, OTHER
	}

	public static enum ASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
