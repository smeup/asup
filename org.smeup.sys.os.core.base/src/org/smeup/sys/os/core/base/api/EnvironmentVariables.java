package org.smeup.sys.os.core.base.api;

import java.util.Map;

import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;

public class EnvironmentVariables {

	private QJob job;
	private EnvironmentVariableLevelEnum level;
	private Map<String, String> variables;

	public EnvironmentVariables(QJob job, EnvironmentVariableLevelEnum level) {
		this.job = job;
		this.level = level;
		this.variables = initVariables();
	}

	private Map<String, String> initVariables() {
		switch (level) {
		case JOB:
			return job.getVariables();

		case SYS:
			return job.getSystem().getVariables();
		}

		throw new RuntimeException("Wrong level type: " + level);
	}

	public EnvironmentVariables setValue(String key, String value, boolean replace) {
		if (replace || !this.variables.containsKey(key)) {
			this.variables.put(key, value);
		}
		return this;
	}

	public void save(QSystemManager systemManager, QResourceManager resourceManager) {
		if (EnvironmentVariableLevelEnum.SYS.equals(level)) {
			QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(job, QSystem.class, systemManager.getSystem().getSystemLibrary());
			systemWriter.save(systemManager.getSystem(), true);
		}
	}

	@Override
	public String toString() {
		return "" + variables;
	}
}
