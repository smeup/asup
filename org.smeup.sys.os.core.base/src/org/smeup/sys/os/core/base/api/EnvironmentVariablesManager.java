/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import java.util.List;

import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QEnvironmentVariable;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;

public class EnvironmentVariablesManager {

	private QJob job;
	private EnvironmentVariableLevelEnum level;
	private List<QEnvironmentVariable> variables;

	public EnvironmentVariablesManager(QJob job, EnvironmentVariableLevelEnum level) {
		this.job = job;
		this.level = level;
		this.variables = initVariables();
	}

	private List<QEnvironmentVariable> initVariables() {
		switch (level) {
		case JOB:
			return job.getVariables();

		case SYS:
			return job.getSystem().getVariables();
		}

		throw new RuntimeException("Wrong level type: " + level);
	}

	public EnvironmentVariablesManager setValue(String key, String value, boolean replace) {
		QEnvironmentVariable containedVariable = getEnvironmentVariable(key);
		if (containedVariable == null) {
			containedVariable = newVariable(key, value);
			variables.add(containedVariable);
		} else {
			if (replace) {
				containedVariable.setValue(value);
			}
		}
		return this;
	}

	public QEnvironmentVariable getEnvironmentVariable(String variableName) {
		QEnvironmentVariable environmentVariable = null;
		for (QEnvironmentVariable envVariable : variables) {
			if (envVariable.getName().equalsIgnoreCase(variableName)) {
				environmentVariable = envVariable;
				break;
			}
		}
		return environmentVariable;
	}

	private QEnvironmentVariable newVariable(String key, String value) {
		QEnvironmentVariable result = QOperatingSystemCoreFactory.eINSTANCE.createEnvironmentVariable();
		result.setName(key);
		result.setValue(value);
		return result;
	}

	public void save(QSystemManager systemManager, QResourceManager resourceManager) {
		if (EnvironmentVariableLevelEnum.SYS.equals(level)) {
			QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(job, QSystem.class, systemManager.getSystem().getSystemLibrary());
			systemWriter.save(systemManager.getSystem(), true);
		}
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (QEnvironmentVariable qEnvironmentVariable : variables) {
			result.append(qEnvironmentVariable.getName()).append(" = ").append(qEnvironmentVariable.getValue()).append("\n");
		}
		return result.toString();
	}

	public EnvironmentVariablesManager remove(String key) {
		this.variables.remove(getEnvironmentVariable(key));
		return this;
	}

	public boolean contains(String key) {
		return getEnvironmentVariable(key) != null;
	}
}
