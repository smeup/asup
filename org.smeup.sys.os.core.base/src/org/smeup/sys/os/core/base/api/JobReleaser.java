package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.base.api.JobName.JobNotFoundException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name = "QWTCCRLJ")
public class JobReleaser {

	public static enum QCPFMSG {
		CPF1321, // Il lavoro &1 utente &2 numero di lavoro &3 non trovati
	}

	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QThreadManager threadManager;
	
	@Main
	public void main(@DataDef(qualified = true) JobName jobName, @DataDef(length = 10) QEnum<DUPLICATEJOBOPTIONEnum, QCharacter> duplicateJobOption) {
		"".toCharArray();

		QJob jobSearch = null;
		try {
			jobSearch = jobName.findJob(job, jobManager);
			if (jobSearch == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR() });
			
			QJob jobToRelease = jobManager.lookupActiveJob(jobSearch.getJobID(), jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR());
			if (jobToRelease == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR() });

			threadManager.release(jobToRelease.getJobThread());
			
			jobLogManager.info(job, "Job " + jobName.number.trimR() + "/" + jobName.user.trimR() + "/" + jobName.name.asData().trimR() + " has released.");
			jobLogManager.info(jobToRelease, "Job " + jobName.number.trimR() + "/" + jobName.user.trimR() + "/" + jobName.name.asData().trimR() + " has released.");
		
		} catch (JobNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR() });
		}
	
	}

	public static enum DUPLICATEJOBOPTIONEnum {
		SELECT, MSG
	}
}
