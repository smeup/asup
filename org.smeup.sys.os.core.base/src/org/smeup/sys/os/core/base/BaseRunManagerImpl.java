package org.smeup.sys.os.core.base;

import javax.inject.Inject;

import org.smeup.sys.os.core.QRunManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;

public class BaseRunManagerImpl implements QRunManager {

	@Inject
	private QJobManager jobManager;
	
	@Override
	public QJobManager locate() {
		return jobManager;
	}

	@Override
	public <S> S locate(QJobCapability capability, Class<S> klass) {

		QJob job = jobManager.lookup(capability);
		if(job == null)
			return null;
		
		return job.getContext().get(klass);
	}

}
