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
package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

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

@Program(name = "QLICLLIB")
public class LibraryDeleter {

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
	
	public @Entry void main(@DataDef(length = 10) QCharacter library, @DataDef(length = 10) QEnum<ASPDeviceEnum, QCharacter> aSPDevice) {

		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);

		QLibrary qLibrary = libraryWriter.lookup(library.trimR());

		if (qLibrary == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] {library.trimR()});	
		
		new LibraryHandler(qLibrary, job, typeRegistry, resourceManager).clear();

		libraryWriter.delete(qLibrary);
		
		jobLogManager.info(job, "Deleted library " + qLibrary.getName());
	}


	public static enum ASPDeviceEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
