package org.smeup.sys.os.cmd.base;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

public class BaseSubmittedCommand implements Runnable {

	private QJob job;
	private String commandString;
	private Object caller;

	protected BaseSubmittedCommand(QJob job, String commandString, Object caller) {
		this.job = job;
		this.commandString = commandString;
		this.caller = caller;
	}

	@Override
	public void run() {

		job.getJobThread().checkRunnable();
		
		Map<String, Object> variables = null;
		if (caller != null) {

			variables = new HashMap<String, Object>();

			for (Field field : caller.getClass().getDeclaredFields()) {

				Type type = field.getGenericType();

				Class<?> fieldKlass = null;

				if (type instanceof ParameterizedType)
					fieldKlass = (Class<?>) ((ParameterizedType) type).getRawType();
				else
					fieldKlass = (Class<?>) type;

				if (QData.class.isAssignableFrom(fieldKlass)) {
					Object variable;
					try {
						field.setAccessible(true);
						variable = field.get(caller);
						variables.put(field.getName(), variable);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						field.setAccessible(false);
					}

				}
			}
		}

		job.getContext().get(QCommandManager.class).executeCommand(job.getJobID(), commandString, variables);
	}
}