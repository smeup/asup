package org.smeup.sys.os.file.base.api.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QFile;

public class FileStructureDuplicator {

	public class LibraryNotFoundException extends Exception {
		private static final long serialVersionUID = 1L;
	}
	
	private QJob job;
	private QJobLogManager jobLogManager;

	public FileStructureDuplicator(QJob job, QJobLogManager jobLogManager) {
		this.job = job;
		this.jobLogManager = jobLogManager;
	}

	public QFile createFile(QFile qFileFrom, String toFileName, QResourceWriter<QFile> fileWriter) throws LibraryNotFoundException {
		QFile qFileTo = (QFile) EcoreUtil.copy((EObject)qFileFrom);
		qFileTo.setName(toFileName);
		try {
			fileWriter.save(qFileTo);
			jobLogManager.info(job, "File " + toFileName + " created in library " + qFileTo.getLibrary());
			return qFileTo;
		} catch (OperatingSystemRuntimeException e) {
			if (e.toString().contains(qFileTo.getLibrary())) {
				throw new LibraryNotFoundException();
			} else {
				throw e;
			}
		}
	}
	
}
