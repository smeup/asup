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
package org.smeup.sys.os.core.e4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QCredentials;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.il.memo.Scope;
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
import org.smeup.sys.rt.core.auth.QAuthenticationManager;
import org.smeup.sys.rt.core.auth.QAuthenticationToken;

public class E4JobManagerImpl implements QJobManager, QAuthenticationManager {

	private Map<String, QJob> activeJobs;
	private Map<String, ExecutorService> jobExecutorServices;

	
	private E4SystemManagerImpl systemManager;
	private QResourceManager resourceManager;

	private QExpressionParser expressionParser;

	private List<QJobListener> listeners = new ArrayList<QJobListener>();

	@Inject
	public E4JobManagerImpl(QSystemManager systemManager, QResourceManager resourceManager, QApplication application) {
		this.systemManager = (E4SystemManagerImpl) systemManager;
		this.resourceManager = resourceManager;
		this.activeJobs = new HashMap<String, QJob>();  //TODO ConcurrentHashMap????
		this.jobExecutorServices = new HashMap<String, ExecutorService>();  //TODO ConcurrentHashMap????
		
		new E4JobCloser(this).start();

		application.getContext().set(QAuthenticationManager.class, this);
	}

	@PostConstruct
	public void init(QExpressionParserRegistry expressionParserRegistry) {
		this.expressionParser = expressionParserRegistry.lookup(QExpressionParserRegistry.DEFAULT_PARSER);
	}

	@Override
	public QJob lookup(String contextID) {

		return activeJobs.get(contextID);
	}

	@Override
	public QJob lookupActiveJob(String contextID, String jobID) {

		QJob job = this.activeJobs.get(jobID);

		return job;
	}

	@Override
	public QJob lookup(String contextID, String name, String user, int number) {

		QJob jobCaller = lookup(contextID);

		QPredicateExpression filter = expressionParser.parsePredicate("jobName *EQ '" + name + "' *AND jobNumber *EQ " + number + " *AND jobUser *EQ '" + user + "'");

		QJob jobTarget = null;

		QResourceReader<QJob> jobReader = resourceManager.getResourceReader(jobCaller, QJob.class, jobCaller.getSystem().getSystemLibrary());
		try (QObjectIterator<QJob> jobs = jobReader.findByExpression(filter);) {

			// first element
			if (jobs.hasNext())
				jobTarget = jobs.next();

			return jobTarget;
		}
	}

	@Override
	public void updateStatus(QJob job, JobStatus status) {
		job.setJobStatus(status);
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

		if (!userProfile.isEnabled())
			throw new OperatingSystemRuntimeException("User " + user + " is disabled");

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

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		// save
		QResourceWriter<QJob> jobWriter = resourceManager.getResourceWriter(job, QJob.class, job.getSystem().getSystemLibrary());
		jobWriter.save(job);

		jobEvent.setType(JobEventType.STARTED);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		activeJobs.put(job.getJobID(), job);

		return job;
	}

	@Override
	public QJob create(QJob credential) {
		return create(credential, null);
	}

	@Override
	public QJob create(QJob credential, String jobName) {
		return create(credential.getJobUser(), "*SAME", jobName);
	}

	@Override
	public List<QJob> getActiveJobs() {
		return new ArrayList<QJob>(activeJobs.values());
	}

	@Override
	public void close(QJob job) {

		QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STOPPING);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		this.activeJobs.remove(job.getJobID());
		this.jobExecutorServices.remove(job.getJobID());

		job.getContext().close();

		jobEvent.setType(JobEventType.STOPPED);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);
	}

	@Override
	public QAuthenticationToken createAuthenticationToken(QCredentials credentials) {
		final QJob job = create(credentials.getUser(), credentials.getPassword());

		return new QAuthenticationToken() {

			@Override
			public String getID() {
				return job.getJobID();
			}

			@Override
			public Boolean isValid() {
				return job != null && 
					   lookup(job.getJobID()) != null;	
			}
		};
	}

	@Override
	public void deleteAuthenticationToken(QAuthenticationToken authToken) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void registerListener(QJobListener listener) {
		this.listeners.add(listener);
	}

	@Override
	public synchronized ExecutorService executorFor(QJob job) {
		ExecutorService executorService = this.jobExecutorServices.get(job.getJobID());
		if (executorService == null) {
			executorService = Executors.newSingleThreadExecutor();
			this.jobExecutorServices.put(job.getJobID(), executorService);
		}
		return executorService;
	}
}