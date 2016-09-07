/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.core.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.env.EnvironmentLevel;
import org.smeup.sys.os.core.env.QEnvironmentVariable;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;
import org.smeup.sys.os.core.env.QEnvironmentVariableManager;
import org.smeup.sys.os.core.env.QOperatingSystemEnvironmentFactory;
import org.smeup.sys.os.core.jobs.QJob;

public class BaseEnvironmentVariableManagerImpl implements QEnvironmentVariableManager {

	@Inject
	private QResourceManager resourceManager;

	@Override
	public QEnvironmentVariable addVariable(QJob job, EnvironmentLevel level, String name, String value, boolean replace) {
		
		QEnvironmentVariableContainer variableContainer = null;
		switch (level) {
		case JOB:
			variableContainer = job.getVariableContainer();
			if (variableContainer == null) {
				variableContainer = QOperatingSystemEnvironmentFactory.eINSTANCE.createEnvironmentVariableContainer();
				job.setVariableContainer(variableContainer);
			}

			break;
		case SYSTEM:
			variableContainer = job.getSystem().getVariableContainer();
			if (variableContainer == null) {
				variableContainer = QOperatingSystemEnvironmentFactory.eINSTANCE.createEnvironmentVariableContainer();
				job.getSystem().setVariableContainer(variableContainer);
			}

			break;
		}

		QEnvironmentVariable variable = lookupVariable(job, level, name);
		if(!replace && variable != null)
			return null;

		if(variable != null)
			variable.setValue(value);
		else {
			variable = QOperatingSystemEnvironmentFactory.eINSTANCE.createEnvironmentVariable();
			variable.setName(name);
			variable.setValue(value);
			variableContainer.getVariables().add(variable);
		}
		
		save(job, level);
		
		return variable;
	}

	@Override
	public void addVariables(QJob job, List<QEnvironmentVariable> variables, boolean replace) {
		
		for(QEnvironmentVariable environmentVariable: variables) {
			
			QEnvironmentVariable newEnvironmentVariable = lookupVariable(job, EnvironmentLevel.JOB, environmentVariable.getName());
			if(!replace && newEnvironmentVariable != null)
				continue;
			
			if(newEnvironmentVariable != null)
				newEnvironmentVariable.setValue(environmentVariable.getValue());
			else {
				newEnvironmentVariable = QOperatingSystemEnvironmentFactory.eINSTANCE.createEnvironmentVariable();
				newEnvironmentVariable.setName(environmentVariable.getName());
				newEnvironmentVariable.setValue(environmentVariable.getValue());
				
				QEnvironmentVariableContainer variableContainer = job.getVariableContainer();
				if(variableContainer == null) {
					variableContainer = QOperatingSystemEnvironmentFactory.eINSTANCE.createEnvironmentVariableContainer();
					job.setVariableContainer(variableContainer);
				}
				variableContainer.getVariables().add(newEnvironmentVariable);
			}
		}
		
		save(job, EnvironmentLevel.JOB);		
	}

	@Override
	public QEnvironmentVariable changeVariable(QJob job, EnvironmentLevel level, String name, String value) {

		QEnvironmentVariable variable = lookupVariable(job, level, name);
		if(variable == null)
			return null;
		
		variable.setValue(value);

		save(job, level);

		return variable;
	}

	@Override
	public List<QEnvironmentVariable> listVariables(QJob job, EnvironmentLevel level) {
		
		QEnvironmentVariableContainer variableContainer = null;
		switch (level) {
		case JOB: 
			variableContainer = job.getVariableContainer();
			break;
		case SYSTEM: 
			variableContainer = job.getSystem().getVariableContainer();
			break;
		}

		if (variableContainer == null)
			return new ArrayList<QEnvironmentVariable>();
		else
			return variableContainer.getVariables();
	}

	@Override
	public QEnvironmentVariable lookupVariable(QJob job, EnvironmentLevel level, String name) {

		List<QEnvironmentVariable> variables = null;
		switch (level) {
		case JOB: {
			QEnvironmentVariableContainer variableContainer = job.getVariableContainer();
			if (variableContainer == null)
				return null;
			variables = variableContainer.getVariables();
			break;
		}
		case SYSTEM: {
			QEnvironmentVariableContainer variableContainer = job.getSystem().getVariableContainer();
			if (variableContainer == null)
				return null;
			variables = variableContainer.getVariables();
			break;
		}
		}

		for (QEnvironmentVariable variable : variables) {
			if (variable.getName().equals(name))
				return variable;
		}
		
		return null;
	}

	@Override
	public QEnvironmentVariable removeVariable(QJob job, EnvironmentLevel level, String name) {

		List<QEnvironmentVariable> variables = null;
		switch (level) {
		case JOB: {
			QEnvironmentVariableContainer variableContainer = job.getVariableContainer();
			if (variableContainer == null)
				return null;
			variables = variableContainer.getVariables();
			break;
		}
		case SYSTEM: {
			QEnvironmentVariableContainer variableContainer = job.getSystem().getVariableContainer();
			if (variableContainer == null)
				return null;
			variables = variableContainer.getVariables();
			break;
		}
		}

		for (QEnvironmentVariable variable : variables) {
			if (variable.getName().equals(name)) {
				variables.remove(variable);

				save(job, level);

				return variable;
			}
		}

		return null;
	}
	

	private void save(QJob job, EnvironmentLevel level) {
		switch (level) {
		case JOB:
			QResourceWriter<QJob> jobWriter = resourceManager.getResourceWriter(job, QJob.class, Scope.SYSTEM_LIBRARY);
			jobWriter.save(job, true);
			break;
		case SYSTEM:
			// save
			QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(job, QSystem.class, Scope.SYSTEM_LIBRARY);
			systemWriter.save(job.getSystem(), true);
			break;
		}
	}
}
