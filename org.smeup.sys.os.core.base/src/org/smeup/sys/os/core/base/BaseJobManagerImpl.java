/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.core.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.env.QEnvironmentVariableManager;
import org.smeup.sys.os.core.jobs.JobEventType;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobEvent;
import org.smeup.sys.os.core.jobs.QJobListener;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;
import org.smeup.sys.os.jobd.QJobDescription;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.rt.core.QApplication;

public class BaseJobManagerImpl implements QJobManager {

	private static final int MILLIS_IN_ONE_DAY = 1000 * 60 * 60 * 24;

	@Inject
	private QApplication application;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QExpressionParserRegistry expressionParserRegistry;
	@Inject
	private QEnvironmentVariableManager environmentVariableManager;

	private BaseSystemManagerImpl systemManager;
	private Map<String, QJob> activeJobs;
	private QExpressionParser expressionParser;
	private List<QJobListener> listeners;

	@Inject
	public BaseJobManagerImpl(QSystemManager systemManager) {

		this.systemManager = (BaseSystemManagerImpl) systemManager;
		this.activeJobs = new HashMap<String, QJob>(); // TODO
														// ConcurrentHashMap????
		this.listeners = new ArrayList<QJobListener>();
	}

	@PostConstruct
	private void init() {
		this.expressionParser = expressionParserRegistry.lookup(QExpressionParserRegistry.DEFAULT_PARSER);
	}

	@Override
	public QJobCapability create(QIdentity<?> identity) {
		return create(identity, null);
	}

	@Override
	public QJobCapability create(QIdentity<?> identity, String jobName) {

		QJob startupJob = systemManager.getJobKernel();
		QResourceReader<QUserProfile> userResource = resourceManager.getResourceReader(startupJob, QUserProfile.class, Scope.SYSTEM_LIBRARY);

		// check credential
		QUserProfile userProfile = userResource.lookup(identity.getJavaPrincipal().getName());

		if (userProfile == null)
			throw new OperatingSystemRuntimeException("User " + identity.getJavaPrincipal().getName() + " not found");

		if (!userProfile.isEnabled())
			throw new OperatingSystemRuntimeException("User " + userProfile.getName() + " is disabled");

		QJob job = systemManager.createJob(JobType.BATCH, identity.getJavaPrincipal(), jobName);

		// add job description libraries
		if (userProfile.getJobDescription() != null) {
			QResourceReader<QJobDescription> jobDescriptionResource = resourceManager.getResourceReader(startupJob, QJobDescription.class, Scope.ALL);
			QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
			if (jobDescription != null)
				for (String library : jobDescription.getLibraries())
					job.getLibraries().add(library);
		}

		QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STARTING);
		fireEvent(jobEvent);

		// save
		QResourceWriter<QJob> jobWriter = resourceManager.getResourceWriter(job, QJob.class, Scope.SYSTEM_LIBRARY);
		jobWriter.save(job);

		jobEvent.setType(JobEventType.STARTED);
		fireEvent(jobEvent);

		activeJobs.put(job.getJobID(), job);

		// capability
		QJobCapability jobCapability = QOperatingSystemJobsFactory.eINSTANCE.createJobCapability();
		jobCapability.setJobReference((QJobReference) EcoreUtil.copy((EObject) job.getJobReference()));
		jobCapability.setObjectURI(job.qURI());
		jobCapability.setPort(application.getPort());

		job.getContext().set(QJobCapability.class, jobCapability);

		job.getContext().set(QIdentity.class, identity);

		return jobCapability;
	}

	@Override
	public QJobCapability spawn(final QJob parent, String jobName, boolean copyEnvironmentVariables) {

		QIdentity<?> identity = parent.getContext().get(QIdentity.class);
		QJobCapability jobCapability = create(identity, jobName);

		QJob jobSpawned = lookup(jobCapability);

		if (copyEnvironmentVariables && parent.getVariableContainer() != null)
			environmentVariableManager.addVariables(jobSpawned, parent.getVariableContainer().getVariables(), false);

		return jobCapability;
	}

	@Override
	public QJob lookup(QJobCapability capability) {
		return lookup(capability.getObjectName());
	}

	@Override
	public QJob lookup(String contextID, QJobReference jobReference) {
		return lookup(contextID, jobReference.getJobName(), jobReference.getJobUser(), jobReference.getJobNumber());
	}

	@Override
	public QJob lookup(String contextID, String name, String user, String number) {
		return lookup(contextID, name, user, Integer.parseInt(number));
	}

	@Override
	public QJob lookup(String contextID) {
		return activeJobs.get(contextID);
	}

	@Override
	public boolean checkCapability(QJobCapability capability) {
		return lookup(capability) != null;
	}

	@Override
	public QJob lookupActiveJob(String contextID, String jobID) {

		QJob job = this.activeJobs.get(jobID);

		return job;
	}

	@Override
	public QJob lookup(String contextID, String name, String user, int number) {

		QJob jobCaller = lookup(contextID);

		QPredicateExpression filter = expressionParser
				.parsePredicate("jobReference.jobName *EQ '" + name + "' *AND jobReference.jobNumber *EQ " + number + " *AND jobReference.jobUser *EQ '" + user + "'");

		QJob jobTarget = null;

		QResourceReader<QJob> jobReader = resourceManager.getResourceReader(jobCaller, QJob.class, Scope.SYSTEM_LIBRARY);
		try (QObjectIterator<QJob> jobs = jobReader.findByExpression(filter);) {

			// first element
			if (jobs.hasNext())
				jobTarget = jobs.next();

			return jobTarget;
		}
	}

	@Override
	public List<QJob> getActiveJobs() {
		return new ArrayList<QJob>(activeJobs.values());
	}
	
	@Override
	public List<QJob> getUserJobs(String user) {

		ArrayList<QJob> userJobs = new ArrayList<QJob>();
		for(QJob job: getActiveJobs()){

		if(job.getJobReference().getJobUser().equals(user))
			userJobs.add(job);	
			
		}
		return userJobs;
	}

	@Override
	public void close(QJobCapability jobCapability) {

		QJob job = lookup(jobCapability);
		close(job);
	}

	@Override
	public void close(QJob job) {

		QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STOPPING);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		job.getContext().close();

		jobEvent.setType(JobEventType.STOPPED);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		this.activeJobs.remove(job.getJobID());
	}

	@Override
	public void registerListener(QJobListener listener) {
		this.listeners.add(listener);
	}

	protected void fireEvent(QJobEvent jobEvent) {
		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);
	}

	@Override
	public void registerWriter(QJobCapability capability, String name, QObjectWriter writer) {

		QJob job = lookup(capability);
		outputManager.registerWriter(job.getContext(), name, writer);
	}

	@Override
	public void setDefaultWriter(QJobCapability capability, String name) {

		QJob job = lookup(capability);
		outputManager.setDefaultWriter(job.getContext(), name);
	}

	@Override
	public void updateStatus(QJob job, JobStatus status) {

		QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STATUS_CHANGED);

		fireEvent(jobEvent);
	}

	@Override
	public void delay(long millis) {
		if (millis <= 0)
			throw new RuntimeException("You must specify millis");

		try {
			System.out.println("Job delay " + millis);
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delay(String resumeTime) {
		Date resumeDate = toDate(resumeTime);
		if (resumeDate == null)
			throw new RuntimeException("You must specify resume time");

		delay(nrOfMillisUntilTime(resumeDate));
	}

	private Date toDate(String resumeTime) {
		try {
			String resumeTimeString = resumeTime.replaceAll("[^\\d.]", ""); // Just
																			// numeric
																			// chars
			Date todayHour = hourFormatter().parse(todayString() + resumeTimeString);
			if (todayHour.after(new Date())) {
				return todayHour;
			} else {
				return addOneDay(todayHour);
			}
		} catch (ParseException e) {
			return null;
		}
	}

	private Date addOneDay(Date date) {
		return new Date(date.getTime() + MILLIS_IN_ONE_DAY);
	}

	private String todayString() {
		return new SimpleDateFormat("ddMMyyyy").format(new Date());
	}

	private SimpleDateFormat hourFormatter() {
		SimpleDateFormat dfOre = new SimpleDateFormat("ddMMyyyyHHmmss");
		dfOre.setLenient(false);
		return dfOre;
	}

	private long nrOfMillisUntilTime(Date resumeDate) {
		return (resumeDate.getTime() - new Date().getTime());
	}

	@Override
	public int countActiveJobs() {
		return getActiveJobs().size();
	}

	@Override
	public Date now(QJob job) {
		return new Date();
	}

	@Override
	public QJob lookupActiveJob(String contextID, String name, String user, String number) {

		for (QJob activeJob : getActiveJobs()) {
			QJobReference jobReference = activeJob.getJobReference();
			if (jobReference.getJobName().equals(name) && jobReference.getJobUser().equals(user) && jobReference.getJobNumber() == Integer.parseInt(number))
				return activeJob;
		}

		return null;
	}
}