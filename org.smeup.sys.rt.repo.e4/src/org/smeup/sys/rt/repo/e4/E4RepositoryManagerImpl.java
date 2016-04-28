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
package org.smeup.sys.rt.repo.e4;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.IProvisioningAgentProvider;
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
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.repo.QRepositoryManager;

public class E4RepositoryManagerImpl implements QRepositoryManager {

	@Inject
	public IProvisioningAgentProvider agentProvider;
	
	@Inject
	private QApplicationManager applicationManager;

	@Inject
	private IProvisioningAgent agent;

	@PostConstruct
	public void init() throws ProvisionException, URISyntaxException {
		if (agent == null) {
			String path = System.getProperty("osgi.instance.area");
			this.agent = agentProvider.createAgent(new URI(path + "/p2"));
		}
			
	}
	
	@Override
	public boolean checkUpdates(String repositoryLocation) {
		
		boolean result = false;
		try {
			addUpdateSite(repositoryLocation);
			
			UpdateOperation operation = buildUpdateOperation();
			addUpdateSite(repositoryLocation);
			
			IStatus checkUpdateResult = checkForUpdates(operation);
			if (checkUpdateResult.getCode() != UpdateOperation.STATUS_NOTHING_TO_UPDATE
					&&
			checkUpdateResult.getSeverity() != IStatus.CANCEL) {
				result = true;
			}			
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);			
		}		
		
		return result;
	}

	@Override
	public boolean update(String repositoryLocation) {
		
		boolean result = false;
		
		try {
			addUpdateSite(repositoryLocation);
			
			UpdateOperation operation = buildUpdateOperation();
			
			IStatus checkUpdateResult= checkForUpdates(operation);		
	
			if (checkUpdateResult.isOK()) {
							
				// run installation
				final ProvisioningJob provisioningJob = operation.getProvisioningJob(new NullProgressMonitor());
	
				configureProvisioningJob(provisioningJob);
	
				provisioningJob.schedule();
				result = true;
			} else {
				if (checkUpdateResult.getSeverity() == IStatus.WARNING || checkUpdateResult.getSeverity() == IStatus.INFO) {
					System.out.println("WARNING: " + checkUpdateResult.getMessage());
					result = true;
				} else if (checkUpdateResult.getSeverity() == IStatus.ERROR) {
					System.out.println("ERROR: " + checkUpdateResult.getMessage());
					result = false;
				}
			}
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	private void addUpdateSite(String repositoryLocation) throws InvocationTargetException {
		
		// Load repository manager
		IMetadataRepositoryManager metadataManager = (IMetadataRepositoryManager) this.agent.getService(IMetadataRepositoryManager.SERVICE_NAME);
		
		if (metadataManager == null) {
			System.err.println("Metadata manager was null");
			Throwable throwable = new Throwable("Could not load Metadata Repository Manager");
			throwable.fillInStackTrace();
			throw new InvocationTargetException(throwable);
		}

		// Load artifact manager
		IArtifactRepositoryManager artifactManager = (IArtifactRepositoryManager) this.agent.getService(IArtifactRepositoryManager.SERVICE_NAME);
		
		if (artifactManager == null) {
			System.err.println("Artifact manager was null");
			Throwable throwable = new Throwable("Could not load Artifact Repository Manager");
			throwable.fillInStackTrace();
			throw new InvocationTargetException(throwable);
		}

		// Load repo
		try {
			URI repoLocation = new URI(repositoryLocation);
						
			metadataManager.addRepository(repoLocation);
			artifactManager.addRepository(repoLocation);			
			metadataManager.loadRepository(repoLocation, new NullProgressMonitor());
			artifactManager.loadRepository(repoLocation, new NullProgressMonitor());
			

		} catch (ProvisionException pe) {
			System.out.println("Caught provisioning exception " + pe.getMessage()/* , pe */);
			throw new InvocationTargetException(pe);

		} catch (URISyntaxException e) {
			System.out.println("Caught URI syntax exception " + e.getMessage()/* , e */);
			throw new InvocationTargetException(e);
		}
	}
	
	public IStatus checkForUpdates(UpdateOperation operation) {

		IStatus status = operation.resolveModal(new NullProgressMonitor());
		
		if (status.getCode() != UpdateOperation.STATUS_NOTHING_TO_UPDATE) {			

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
		            	status = MultiStatus.CANCEL_STATUS;
				} else {					
				    status = MultiStatus.CANCEL_STATUS;
				}
			}
		}
		
		return status;
	}

	private UpdateOperation buildUpdateOperation() {
		IProfileRegistry registry= (IProfileRegistry)agent.getService(IProfileRegistry.SERVICE_NAME);
		IProfile profile= registry.getProfile(IProfileRegistry.SELF);		
		
		IQuery<IInstallableUnit> queryAll = QueryUtil.createIUAnyQuery();
		Collection<IInstallableUnit> iusToUpdate = profile.query(queryAll, new NullProgressMonitor()).toUnmodifiableSet();
		
		ProvisioningSession session = new ProvisioningSession(agent);
		return  new UpdateOperation(session, iusToUpdate);
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
}
