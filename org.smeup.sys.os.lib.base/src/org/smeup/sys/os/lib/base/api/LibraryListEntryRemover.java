package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QLICHLBL")
public @ToDo class LibraryListEntryRemover {
	
	@Inject
	private QExceptionManager exceptionManager;
	
	public static enum QCPFMSG {
		CPF2104, CPF2110, CPF9999
	}

	@Inject
	private QJob job;
	
	public @Entry void main(@ToDo @DataDef(length = 10) QCharacter library) {
		
		if (!job.getLibraries().remove(library.trimR()))			
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2104, new String[] {library.trimR()});		
		
	}
}
