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
package org.smeup.sys.os.core.cdo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.il.memo.cdo.CDOResourceHelper;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.base.BaseJobManagerImpl;
import org.smeup.sys.os.core.jobs.JobEventType;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobEvent;
import org.smeup.sys.os.core.jobs.QJobListener;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;
import org.smeup.sys.os.jobd.QJobDescription;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.rt.core.QApplication;

public class CDOJobManagerImpl extends BaseJobManagerImpl implements QJobManager {

	private CDOSystemManagerImpl systemManager;
	private QResourceManager resourceManager;
	private QLockManager lockManager;

	private static final String CDO_RESOURCE = "os/core";

	private Map<String, QJob> activeJobs;

	private List<QJobListener> listeners = new ArrayList<QJobListener>();

	@Inject
	public CDOJobManagerImpl(QApplication application, QThreadManager threadManager, QSystemManager systemManager, QResourceManager resourceManager, QLockManager lockManager) {
		super(application);
		
		this.systemManager = (CDOSystemManagerImpl) systemManager;
		this.resourceManager = resourceManager;
		this.lockManager = lockManager;
		this.activeJobs = new HashMap<String, QJob>();
		
		QThread thread = threadManager.createThread("job-closer", new CDOJobCloser(threadManager, this), true);
		threadManager.start(thread);		
	}
	
	@Override
	public QJob create(String user, String password) {
		return create(user, password, null);
	}
	
	@Override
	public QJob create(String user, String password, String jobName) {

		QJob startupJob = systemManager.getStartupJob();
		QResourceReader<QUserProfile> userResource = resourceManager.getResourceReader(startupJob, QUserProfile.class, systemManager.getSystem().getSystemLibrary());

		// check credential
		QUserProfile userProfile = userResource.lookup(user);

		if (userProfile == null)
			throw new OperatingSystemRuntimeException("User " + user + " not found");

		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(startupJob.getContext(), systemManager.getTransactionSystem());
		
		while (!locker.tryLock(QSystem.LOCK_TIMEOUT, LockType.WRITE))
			;
		// System.out.print("Retry lock system "+systemManager.getSystem().getName());

		try {
			// System.out.println("lock system "+systemManager.getSystem().getName()+" jobManager");

			QJob job = systemManager.createJob(JobType.BATCH, userProfile.getName(), jobName);

			// add job description libraries
			if (userProfile.getJobDescription() != null) {
				QResourceReader<QJobDescription> jobDescriptionResource = resourceManager.getResourceReader(startupJob, QJobDescription.class, Scope.ALL);
				QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
				if (jobDescription != null)
					for (String library : jobDescription.getLibraries())
						job.getLibraries().add(library);
			}

			String library = userProfile.getLibrary();
			if (library != null && !library.trim().equals("")) {
				job.setCurrentLibrary(library);
			}

			QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
			jobEvent.setSource(job);
			jobEvent.setType(JobEventType.STARTING);
			fireEvent(jobEvent);

			// save job
			CDOResource resource = systemManager.getTransaction().getOrCreateResource(CDO_RESOURCE);
			resource.getContents().add((EObject) job);
			systemManager.getTransaction().commit();

			jobEvent.setType(JobEventType.STARTED);
			fireEvent(jobEvent);			

			activeJobs.put(job.getJobID(), job);

			return job;
		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			locker.unlock(LockType.WRITE);
		}
	}

	public QJob create(QJob credential) {
		return create(credential, null);
	}
	
	@Override
	public QJob create(QJob credential, String jobName) {
		return create(credential.getJobUser(), "*SAME");
	}

	@Override
	public QJob lookup(String contextID, String name, String user, int number) {

		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from " + CDOResourceHelper.getTableName(QJob.class));
		queryString.append(" where jobName=:jobName and jobUser=:jobUser and jobNumber=:jobNumber");

		CDOQuery query = systemManager.getView().createQuery("sql", queryString.toString());
		query.setParameter("jobName", name);
		query.setParameter("jobUser", user);
		query.setParameter("jobNumber", number);

		QJob qJob = query.getResultValue(QJob.class);

		if (qJob == null)
			throw new OperatingSystemRuntimeException("Job not found: " + qJob);

		return qJob;
	}

	@Override
	public List<QJob> getActiveJobs() {

		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from " + CDOResourceHelper.getTableName(QJob.class));
		queryString.append(" where jobStatus<>:end");

		CDOQuery query = systemManager.getView().createQuery("sql", queryString.toString());

		query.setParameter("end", JobStatus.END_VALUE);

		List<QJob> jobs = query.getResult(QJob.class);
		return jobs;
	}

	@Override
	public QJob lookup(String contextID) {

		QJob job = null;

		job = activeJobs.get(contextID);

		if (job != null)
			return job;

		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from " + CDOResourceHelper.getTableName(QJob.class));
		queryString.append(" where jobID=:jobID");

		CDOQuery query = systemManager.getView().createQuery("sql", queryString.toString());
		query.setParameter("jobID", contextID);

		QJob qJob = query.getResultValue(QJob.class);

		if (qJob == null)
			throw new OperatingSystemRuntimeException("Job not found: " + qJob);

		if (qJob.getJobStatus().equals(JobStatus.END))
			throw new OperatingSystemRuntimeException("Job not active: " + qJob);

		return qJob;
	}

	@Override
	public QJob lookupActiveJob(String contextID, String jobID) {

		QJob job = this.activeJobs.get(jobID);

		return job;
	}

	protected CDOTransaction getTransaction() {
		return systemManager.getTransaction();
	}

	@Override
	public void close(QJob job) {
		super.close(job);
		
		this.activeJobs.remove(job.getJobID());
	}

	@Override
	public void registerListener(QJobListener listener) {
		this.listeners.add(listener);		
	}
}