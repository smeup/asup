package org.smeup.sys.os.file.base.api.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QFile;

public class FileStructureDuplicator {

	private QJob job;
	private QJobLogManager jobLogManager;

	public FileStructureDuplicator(QJob job, QJobLogManager jobLogManager) {
		this.job = job;
		this.jobLogManager = jobLogManager;
	}

	public QFile createFile(QFile qFileFrom, String toFileName, QResourceWriter<QFile> fileWriter) {
		QFile qFileTo = (QFile) EcoreUtil.copy((EObject)qFileFrom);
		qFileTo.setName(toFileName);
		fileWriter.save(qFileTo);
		jobLogManager.info(job, "File " + toFileName + " created in library " + qFileTo.getLibrary());
		return qFileTo;
	}
	
}
