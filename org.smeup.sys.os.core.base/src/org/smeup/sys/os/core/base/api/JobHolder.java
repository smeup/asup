package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.base.api.JobName.JobNotFoundException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name = "QWTCCHDJ")
public class JobHolder {

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
	public void main(@DataDef(qualified = true) JobName jobName, @DataDef(length = 1) QEnum<HOLDSPOOLEDFILESEnum, QCharacter> holdSpooledFiles,
			@DataDef(length = 10) QEnum<DUPLICATEJOBOPTIONEnum, QCharacter> duplicateJobOption) {
		
		QJob jobSearch = null;
		try {
			jobSearch = jobName.findJob(job, jobManager);
			if (jobSearch == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR() });
			
			QJob jobToHold = jobManager.lookupActiveJob(jobSearch.getJobID(), jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR());
			if (jobToHold == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR() });

			threadManager.suspend(jobToHold.getJobThread());
			
			jobLogManager.info(job, "Job " + jobName.number.trimR() + "/" + jobName.user.trimR() + "/" + jobName.name.asData().trimR() + " has held.");
		
		} catch (JobNotFoundException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1321, new String[] { jobName.name.asData().trimR(), jobName.user.trimR(), jobName.number.trimR() });
		}
	}

	public static enum HOLDSPOOLEDFILESEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum DUPLICATEJOBOPTIONEnum {
		SELECT, MSG
	}
}
