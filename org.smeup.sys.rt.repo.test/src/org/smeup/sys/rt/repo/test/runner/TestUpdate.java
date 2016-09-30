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
package org.smeup.sys.rt.repo.test.runner;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.engine.IPhaseSet;
import org.eclipse.equinox.p2.engine.IProfile;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.engine.PhaseSetFactory;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.operations.ProfileModificationJob;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.rt.core.QApplicationManager;

@Test(object = "CheckUpdates")
public class TestUpdate {
		
	private static final String REPOSITORY_LOC = "http://smeup.github.io/application-e4/";
	
	
	@Inject
	private QApplicationManager applicationManager;
	
	@Inject
	private IProvisioningAgent agent;
	
	@Inject
	public transient QTestAsserter testAsserter;
	
	@TestStarted
	public void main() {
		
		System.out.println("Version 0.1.1");
		
		try {
			check();
			testAsserter.success("Application manager restart OK");
		} catch(Exception exc) {
			testAsserter.fail("Application manager restart failed: " + exc.getMessage());
		}
	}

	private void check() throws ProvisionException, URISyntaxException {
		//agent = getAgent(context);
		checkUpdates(agent);
	}	

	private IStatus checkUpdates(final IProvisioningAgent agent) throws ProvisionException {

		final ProvisioningSession session = new ProvisioningSession(agent);
		final UpdateOperation operation = new UpdateOperation(session);

		try {
			addUpdateSite(agent);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
		
		final IProfileRegistry registry= (IProfileRegistry)agent.getService(IProfileRegistry.SERVICE_NAME);

		if (registry == null) {			
			return Status.CANCEL_STATUS;
		}

		final IProfile profile= registry.getProfile(IProfileRegistry.SELF);

		if (profile == null) {			
			return Status.CANCEL_STATUS;
		}
		
		// Prints profile content
		
		IQuery<IInstallableUnit> queryAll = QueryUtil.createIUAnyQuery();

		IQueryResult<IInstallableUnit> queryResult = profile.query(queryAll, new NullProgressMonitor());

		for (final IInstallableUnit iu : queryResult)
		  {
		    System.out.println(iu);
		  }
		
		
		 
		IQuery<IInstallableUnit> query= QueryUtil.createIUQuery("com.smeup.erp.file.dbf.gen");
		Collection<IInstallableUnit> iusToUpdate= profile.query(query, null).toUnmodifiableSet();

		
		IStatus result= checkForUpdates(agent, iusToUpdate);
		
		//IStatus result= checkForUpdates(agent, null);
		
		printIStatus(result);

		if (result.isOK()) {
						
			// run installation
			final ProvisioningJob provisioningJob = operation.getProvisioningJob(new NullProgressMonitor());

			configureProvisioningJob(provisioningJob);

			provisioningJob.schedule();
		} else {
			return Status.CANCEL_STATUS;
		}
		
		/*
		// check for updates, this causes I/O
		final IStatus status = operation.resolveModal(null);
		

		//failed to find updates (inform user and exit)
		if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
			System.out.println("CANCEL_STATUS-1");
			return Status.CANCEL_STATUS;
		}

		// run installation
		final ProvisioningJob provisioningJob = operation.getProvisioningJob(null);

		// updates cannot run from within Eclipse IDE!!!
		if (provisioningJob == null) {
			System.out.println("CANCEL_STATUS-2");
			return Status.CANCEL_STATUS;
		}
		configureProvisioningJob(provisioningJob);

		provisioningJob.schedule();
		*/
		return Status.OK_STATUS;

	}


	private void configureProvisioningJob(ProvisioningJob provisioningJob) {

		// register a job change listener to track
		// installation progress and notify user upon success
		provisioningJob.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					new Runnable() {

						@Override
						public void run() {
							System.out.println("RESTART");
							applicationManager.restart();
						}
					};

				}
				super.done(event);
			}
		});

	}
	
	private static void addUpdateSite(IProvisioningAgent provisioningAgent) throws InvocationTargetException {
		// Load repository manager
		IMetadataRepositoryManager metadataManager = (IMetadataRepositoryManager) provisioningAgent.getService(IMetadataRepositoryManager.SERVICE_NAME);
		if (metadataManager == null) {
			System.err.println("Metadata manager was null");
			Throwable throwable = new Throwable("Could not load Metadata Repository Manager");
			throwable.fillInStackTrace();
			throw new InvocationTargetException(throwable);
		}

		// Load artifact manager
		IArtifactRepositoryManager artifactManager = (IArtifactRepositoryManager) provisioningAgent.getService(IArtifactRepositoryManager.SERVICE_NAME);
		if (artifactManager == null) {
			System.err.println("Artifact manager was null");
			Throwable throwable = new Throwable("Could not load Artifact Repository Manager");
			throwable.fillInStackTrace();
			throw new InvocationTargetException(throwable);
		}

		// Load repo
		try {
			URI repoLocation = new URI(REPOSITORY_LOC);
			
			metadataManager.addRepository(repoLocation);
			artifactManager.addRepository(repoLocation);

			System.out.println("Adding repository " + repoLocation);
			metadataManager.loadRepository(repoLocation, new NullProgressMonitor());
			artifactManager.loadRepository(repoLocation, new NullProgressMonitor());

		} catch (ProvisionException pe) {
			System.err.println("Caught provisioning exception " + pe.getMessage()/* , pe */);
			throw new InvocationTargetException(pe);

		} catch (URISyntaxException e) {
			System.err.println("Caught URI syntax exception " + e.getMessage()/* , e */);
			throw new InvocationTargetException(e);
		}
	}
	
	private void printIStatus(IStatus status)
	{
		System.err.println() ;
		System.err.printf("UpdateStatus result: %s", status.getMessage()) ;
		System.err.println() ;
		if (status.getException() != null)
			System.err.printf("Error : %s", status.getException()) ;
		
		if (status.isMultiStatus())
		{
			for (int i = 0 ; i < status.getChildren().length ; ++i)
			{
				printIStatus(status.getChildren()[i]) ;
			}
		}
	}
	
	public static IStatus checkForUpdates(IProvisioningAgent agent, Collection<IInstallableUnit> iusToUpdate) {
		ProvisioningSession session = new ProvisioningSession(agent);
		// the default update operation looks for updates to the currently
		// running profile, using the default profile root marker. To change
		// which installable units are being updated, use the more detailed
		// constructors.
		UpdateOperation operation = null;
		if (iusToUpdate != null) {
			operation = new UpdateOperation(session, iusToUpdate);
		} else {
			operation = new UpdateOperation(session);
		}
	
		IStatus status = operation.resolveModal(new NullProgressMonitor());
		if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
			return status;
		}		

		if (status.getSeverity() != IStatus.ERROR) {
			// More complex status handling might include showing the user what updates
			// are available if there are multiples, differentiating patches vs. updates, etc.
			// In this example, we simply update as suggested by the operation.
			ProvisioningJob job = operation.getProvisioningJob(null);
			if (job instanceof ProfileModificationJob) {
			    ProfileModificationJob pJob = (ProfileModificationJob) job;
			    IPhaseSet phaseSet = PhaseSetFactory.createDefaultPhaseSetExcluding(new String[] {PhaseSetFactory.PHASE_CHECK_TRUST});
			    pJob.setPhaseSet(phaseSet);
	            status = job.runModal(new NullProgressMonitor());
	            if (status.getSeverity() == IStatus.CANCEL)
	            	return MultiStatus.CANCEL_STATUS;
			} else {
				
			    return MultiStatus.CANCEL_STATUS;
			}
		}
		
		return status;
	}
}
