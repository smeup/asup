package org.smeup.sys.os.lib.base.api.tools;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.base.api.CURRENTLIBRARYEnum;

public class CurrentLibraryChangeHelper {

	public static enum QCPFMSG {
		CPF2110
	}

	private QJob job;
	private QLibraryManager libraryManager;
	private QJobLogManager jobLogManager;
	private QExceptionManager exceptionManager;

	public CurrentLibraryChangeHelper(QJob job, QLibraryManager libraryManager, QJobLogManager jobLogManager, QExceptionManager exceptionManager) {
		this.job = job;
		this.libraryManager = libraryManager;
		this.jobLogManager = jobLogManager;
		this.exceptionManager = exceptionManager;
	}

	public void changeCurrentLibrary(QEnum<CURRENTLIBRARYEnum, QCharacter> currentLibrary) {

		switch (currentLibrary.asEnum()) {
		case SAME:
			break;

		case CRTDFT:
			job.setCurrentLibrary(null);
			break;

		case OTHER:
			String libName = currentLibrary.asData().trimR();
			QResourceReader<QLibrary> libraryReader = libraryManager.getLibraryReader(job);
			QLibrary qLibrary = libraryReader.lookup(libName);

			if (qLibrary == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] { libName });

			job.setCurrentLibrary(libName);
			break;
		}

		jobLogManager.info(job, "Current library is now " + job.getCurrentLibrary());
	}

}
