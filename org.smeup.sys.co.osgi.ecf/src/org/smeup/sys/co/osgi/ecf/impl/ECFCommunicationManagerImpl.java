/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.osgi.service.remoteserviceadmin.EndpointDescription;
import org.smeup.sys.co.core.QCommunicationManager;
import org.smeup.sys.co.core.QEndPoint;
import org.smeup.sys.co.osgi.ecf.hook.ECFClientActivatorHook;
import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;

public class ECFCommunicationManagerImpl implements QCommunicationManager {

	@Inject
	private QObjectRegistryFactory objectRegistryFactory;
	
	private QObjectRegistry<QJobManager> jobRegistry;
	
	@PostConstruct
	private void init() {
		jobRegistry = objectRegistryFactory.createObjectRegistry(QJobManager.class);
	}

	@Override
	public List<QEndPoint> find(String contextID) {

		List<QEndPoint> endPoints = new ArrayList<QEndPoint>();

		for (final EndpointDescription endpointDescription : ECFClientActivatorHook.getEndPoints())
			endPoints.add(new ECFEndPointAdapterImpl(endpointDescription));

		return endPoints;

	}

	@Override
	public QEndPoint lookup(String contextID, String endPointID) {

		QEndPoint endPoint = null;

		for (final EndpointDescription endpointDescription : ECFClientActivatorHook.getEndPoints())
			if (endpointDescription.getId().equals(endPointID)) {
				endPoint = new ECFEndPointAdapterImpl(endpointDescription);
				break;
			}

		return endPoint;
	}

	@Override
	public QJobCapability connect(QIdentity<?> identity) {
		
		QJobManager jobManager = locate();
		if(jobManager == null)
			return null;

		QJobCapability jobCapability = jobManager.create(identity);
		
		return jobCapability;
	}

	@Override
	public void disconnect(QJobCapability capability) {
		
		QJobManager jobManager = locate(capability, QJobManager.class);
		jobManager.close(capability);
	}

	@Override
	public <S> S locate(QJobCapability capability, Class<S> klass) {

		QObjectRegistry<S> objectRegistry = objectRegistryFactory.createObjectRegistry(klass);
		return objectRegistry.lookupByPort(capability.getPort());
	}
	
	
	private QJobManager locate() {
		
		QJobManager jobManager = null;
		int activeJobs = Integer.MAX_VALUE;
		
		for(QJobManager jm: jobRegistry.list()) {
			
			int tempActiveJobs = jm.countActiveJobs();
			
			if(tempActiveJobs < activeJobs) {
				jobManager = jm;
				activeJobs = tempActiveJobs;
			}
		}
		
		return jobManager;
	}
} // ECFCommunicationManagerImpl
