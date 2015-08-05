package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QLICHLBL")
public class LibraryListEntryRemover {
	
	@Inject
	private QExceptionManager exceptionManager;
	
	public static enum QCPFMSG {
		CPF2104, CPF2110, CPF9999
	}

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
