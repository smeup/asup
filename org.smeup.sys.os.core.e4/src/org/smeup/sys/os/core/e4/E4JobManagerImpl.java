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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.jobd.QJobDescription;
import org.smeup.sys.os.usrprf.QUserProfile;

public class E4JobManagerImpl implements QJobManager {

	private Map<String, QJob> activeJobs;

	private E4SystemManagerImpl systemManager;
	private QResourceManager resourceManager;

	private QExpressionParser expressionParser;

	@Inject
	public E4JobManagerImpl(QSystemManager systemManager, QResourceManager resourceManager) {
		this.systemManager = (E4SystemManagerImpl) systemManager;
		this.resourceManager = resourceManager;
		this.activeJobs = new HashMap<String, QJob>();

		new E4JobCloser(this).start();
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
		QObjectIterator<QJob> jobs = jobReader.findByExpression(filter);

		// first element
		if (jobs.hasNext())
			jobTarget = jobs.next();

		return jobTarget;
	}

	@Override
	public void updateStatus(QJob job, JobStatus status) {
		job.setJobStatus(status);
	}

	@Override
	public QJob create(String user, String password) {

		QJob startupJob = systemManager.getStartupJob();
		QResourceReader<QUserProfile> userResource = resourceManager.getResourceReader(startupJob, QUserProfile.class, systemManager.getSystem().getSystemLibrary());

		// check credential
		QUserProfile userProfile = userResource.lookup(user);

		if (userProfile == null)
			throw new OperatingSystemRuntimeException("User " + user + " not found");

		QJob job = systemManager.createJob(JobType.BATCH, userProfile.getName());

		// add job description libraries
		if (userProfile.getJobDescription() != null) {
			QResourceReader<QJobDescription> jobDescriptionResource = resourceManager.getResourceReader(startupJob, QJobDescription.class, Scope.ALL);
			QJobDescription jobDescription = jobDescriptionResource.lookup(userProfile.getJobDescription());
			if (jobDescription != null)
				for (String library : jobDescription.getLibraries())
					job.getLibraries().add(library);
		}

		// save
		QResourceWriter<QJob> jobWriter = resourceManager.getResourceWriter(job, QJob.class, job.getSystem().getSystemLibrary());
		jobWriter.save(job);

		activeJobs.put(job.getJobID(), job);

		return job;
	}

	@Override
	public QJob create(QJob credential) {
		return create(credential.getJobUser(), "*SAME");
	}

	@Override
	public List<QJob> getActiveJobs() {
		return new ArrayList<QJob>(activeJobs.values());
	}

	@Override
	public void close(QJob job) {

		this.activeJobs.remove(job.getJobID());

		job.getContext().close();
	}
}