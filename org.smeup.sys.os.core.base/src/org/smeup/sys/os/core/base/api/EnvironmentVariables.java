package org.smeup.sys.os.core.base.api;

import java.util.Map;

import org.smeup.sys.os.core.jobs.QJob;

public class EnvironmentVariables {

	private QJob job;
	private EnvironmentVariableLevelEnum level;
	private Map<String, String> variables;

	public EnvironmentVariables(QJob job, EnvironmentVariableLevelEnum level) {
		this.job = job;
		this.level = level;		
		initVariables();
	}

	private void initVariables() {
		switch (level) {
		case JOB:
			this.variables = job.getVariables();						

		case SYS:
			this.variables =  job.getSystem().getVariables();			
		}
		throw new RuntimeException("Wrong level type: " + level);		
	}

	public EnvironmentVariables setValue(String key, String value, boolean replace) {
		if (replace || !this.variables.containsKey(key)) {
			this.variables.put(key, value);
		} 
		return this;
	}

	public void save() {
		if (EnvironmentVariableLevelEnum.SYS.equals(level)) {
			//TODO
		}
	}

	@Override
	public String toString() {
		return level + "\n" + variables;
	}
}
