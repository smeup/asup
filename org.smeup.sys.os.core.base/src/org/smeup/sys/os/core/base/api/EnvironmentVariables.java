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
