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

import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.rt.core.QApplicationManager;

@Test(category = "RT.REPO", object = "CheckUpdates")
public class TestRestart {
		
	private static final String REPOSITORY_LOC = "http://smeup.github.io/application-e4";
//  private static final String REPOSITORY_LOC = "http://smeup.github.io/application-e4";
	
	@Inject
	private QApplicationManager applicationManager;
	@Inject
	private IProvisioningAgent agent;
	@Inject
	private QTestAsserter testAsserter;
	
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

		checkForUpdates(agent);
	}	

	private IStatus checkForUpdates(final IProvisioningAgent agent) throws ProvisionException {

		final ProvisioningSession session = new ProvisioningSession(agent);
		final UpdateOperation operation = new UpdateOperation(session);

//		operation.setProfileId("ASUP");
		
		// create uri and check for validity
		URI uri = null;
		try {
			uri = new URI(REPOSITORY_LOC);
		} catch (final URISyntaxException e) {
			return null;
		}

		// set location of artifact and metadata repo
		operation.getProvisioningContext().setArtifactRepositories(new URI[] { uri });
		operation.getProvisioningContext().setMetadataRepositories(new URI[] { uri });


		// check for updates, this causes I/O
		final IStatus status = operation.resolveModal(null);

		// failed to find updates (inform user and exit)
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
}
