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

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QLICHLBL")
public class LibraryListEntryRemover {

	public static enum QCPFMSG {
		CPF2104, CPF2110, CPF9999
	}
	
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;
	
	public @Entry void main(@DataDef(length = 10) QCharacter library) {
		String libName = library.trimR();
		
		if (!exists(libName))
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] {libName});		
		
		if (!job.getLibraries().remove(libName))			
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2104, new String[] {libName});		
		
	}

	private boolean exists(String libName) {
		return resourceManager
			   .getResourceReader(job, QLibrary.class, Scope.ALL)
			   .exists(libName);
	}
}
