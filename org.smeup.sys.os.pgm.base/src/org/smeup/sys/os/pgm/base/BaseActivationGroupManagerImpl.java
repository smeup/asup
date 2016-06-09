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
package org.smeup.sys.os.pgm.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QProgramCallable;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgramManager;
import org.smeup.sys.os.pgm.QProgramStack;

public class BaseActivationGroupManagerImpl implements QActivationGroupManager {

	private QProgramManager programManager;

	public BaseActivationGroupManagerImpl(QProgramManager programManager) {
		this.programManager = programManager;
	}

	@Override
	public void register(QJob job, QActivationGroup activationGroup) {
		getMapActivationGroup(job).put(activationGroup.getName(), activationGroup);
	}

	@Override
	public QActivationGroup lookup(QJob job, String name) {
		return getMapActivationGroup(job).get(name);
	}

	@SuppressWarnings("resource")
	protected Map<String, QActivationGroup> getMapActivationGroup(QJob job) {

		QContext jobContext = job.getContext();
		BaseActivationGroupCache activationGroupCache = jobContext.get(BaseActivationGroupCache.class);
		if (activationGroupCache == null) {
			synchronized (job) {
				activationGroupCache = jobContext.get(BaseActivationGroupCache.class);
				if (activationGroupCache == null) {
					activationGroupCache = new BaseActivationGroupCache();
					jobContext.set(BaseActivationGroupCache.class, activationGroupCache);
				}
			}
		}

		return activationGroupCache;
	}

	@Override
	public QActivationGroup create(QJob job, String name, boolean register) {

		// create
		QActivationGroup activationGroup = QOperatingSystemProgramFactory.eINSTANCE.createActivationGroup();
		activationGroup.setName(name);

		// register on job
		if (register)
			register(job, activationGroup);

		return activationGroup;
	}

	@Override
	public List<QActivationGroup> list(QJob job) {
		return new ArrayList<QActivationGroup>(getMapActivationGroup(job).values());
	}

	@Override
	public boolean close(QJob job, QActivationGroup activationGroup) {
		QProgramStack programStack = programManager.getProgramStack(job.getContext().getID());
		return closeActivationGroup(programStack, activationGroup);
	}

	@Override
	public void closeAll(QJob job) {
		QProgramStack programStack = programManager.getProgramStack(job.getContext().getID());
		for (QActivationGroup activationGroup : list(job)) {
			closeActivationGroup(programStack, activationGroup);
		}			
	}
	
	private boolean closeActivationGroup(QProgramStack programStack, QActivationGroup activationGroup) {

		if(activationGroup.getName().equalsIgnoreCase("*DFT"))
			return false;

		boolean active = false;
		for (QProgramCallable callableProgram : new ArrayList<QProgramCallable>(activationGroup.getPrograms())) {
			if (programStack.contains(callableProgram)) {
				active = true;
				break;					
			}
		}
		
		if(active)
			return false;
		
		for (QProgramCallable callableProgram : new ArrayList<QProgramCallable>(activationGroup.getPrograms()))
			callableProgram.close();
		
		return true;
	}
}