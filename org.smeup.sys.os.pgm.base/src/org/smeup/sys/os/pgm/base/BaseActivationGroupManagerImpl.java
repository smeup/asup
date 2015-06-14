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
package org.smeup.sys.os.pgm.base;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;

public class BaseActivationGroupManagerImpl implements QActivationGroupManager {

	private Map<QJob, Map<String, QActivationGroup>> contextToMapActivationGroup = new WeakHashMap<QJob, Map<String,QActivationGroup>>();

	@Override
	public void register(QJob job, QActivationGroup activationGroup) {
		getMapActivationGroup(job).put(activationGroup.getName(), activationGroup);
	}

	@Override
	public QActivationGroup lookup(QJob job, String name) {
		return getMapActivationGroup(job).get(name);
	}

	protected Map<String, QActivationGroup> getMapActivationGroup(QJob job) {

		// retrieve job activation groups
		Map<String, QActivationGroup> mapActivationGroup = contextToMapActivationGroup.get(job);
		if(mapActivationGroup == null) { 
			mapActivationGroup = new HashMap<String, QActivationGroup>();
			contextToMapActivationGroup.put(job, mapActivationGroup);
		}		
		
		return mapActivationGroup;
	}

	@Override
	public QActivationGroup create(QJob job, String name, boolean register) {

		// create
		QActivationGroup activationGroup = QOperatingSystemProgramFactory.eINSTANCE.createActivationGroup();
		activationGroup.setName(name);
		activationGroup.setFrameworkContext(job.getContext().createChildContext(job.getJobName()+"/"+name));

		// register on job
		if(register)
			register(job, activationGroup);
		
		return activationGroup;

	}
}