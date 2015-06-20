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
package org.smeup.sys.os.core.cdo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.cdo.util.CDOResourceUtil;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.jobd.QJobDescription;
import org.smeup.sys.os.usrprf.QUserProfile;

public class CDOJobManagerImpl implements QJobManager {

	private CDOSystemManagerImpl systemManager;
	private QResourceManager resourceManager;
	private QLockManager lockManager;

	private static final String CDO_RESOURCE = "os/core";

	private Map<String, QJob> activeJobs;

	@Inject
	public CDOJobManagerImpl(QSystemManager systemManager, QResourceManager resourceManager, QLockManager lockManager) {

		this.systemManager = (CDOSystemManagerImpl) systemManager;
		this.resourceManager = resourceManager;
		this.lockManager = lockManager;
		this.activeJobs = new HashMap<String, QJob>();

		new CDOJobCloser(this).start();
	}

	@Override
	public QJob create(String user, String password) {

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

			QJob job = systemManager.createJob(JobType.BATCH, userProfile.getName());

			// add job description libraries
			if (userProfile.getJobDescription() != null) {
				QResourceReader<QJobDescription> jobDescriptionResource = resourceManager.getResourceReader(startupJob, QJobDescription.class, Scope.ALL);
				QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
				if (jobDescription != null)
					for (String library : jobDescription.getLibraries())
						job.getLibraries().add(library);
			}

			// save job
			CDOResource resource = systemManager.getTransaction().getOrCreateResource(CDO_RESOURCE);
			resource.getContents().add((EObject) job);
			systemManager.getTransaction().commit();

			activeJobs.put(job.getJobID(), job);

			return job;
		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			locker.unlock(LockType.WRITE);
		}
	}

	@Override
	public QJob create(QJob credential) {
		return create(credential.getJobUser(), "*SAME");
	}

	@Override
	public QJob lookup(String contextID, String name, String user, int number) {

		StringBuffer queryString = new StringBuffer();
		queryString.append("select * from " + CDOResourceUtil.getTableName(QJob.class));
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
		queryString.append("select * from " + CDOResourceUtil.getTableName(QJob.class));
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
		queryString.append("select * from " + CDOResourceUtil.getTableName(QJob.class));
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
	public void updateStatus(QJob job, JobStatus status) {
		try {
			// save job
			CDOResource resource = systemManager.getTransaction().getOrCreateResource(CDO_RESOURCE);
			job.setJobStatus(status);
			resource.getContents().add((EObject) job);
			systemManager.getTransaction().commit();
		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public void close(QJob job) {
		QJob activeJob = this.activeJobs.get(job.getJobID());
		if (activeJob != null)
			this.activeJobs.remove(activeJob);

		job.getContext().close();
	}
}