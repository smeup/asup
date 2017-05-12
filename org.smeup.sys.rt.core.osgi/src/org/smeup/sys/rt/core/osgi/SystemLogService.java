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
package org.smeup.sys.rt.core.osgi;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

public class SystemLogService implements LogService {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("Z yyyy.MM.dd HH:mm:ss:S");
	private final String pluginName;

	public SystemLogService(String pluginName) {
		this.pluginName = pluginName;
	}

	private static final String getLogCode(int level) {
		switch (level) {
		case 3:
			return "INFO";
		case 1:
			return "ERROR";
		case 4:
			return "DEBUG";
		case 2:
			return "WARNING";
		}
		return "UNKNOWN";
	}

	private final void doLog(ServiceReference<?> sr, int level, String message, Throwable t) {
		StringBuffer buf = new StringBuffer("[log;");
		buf.append(dateFormat.format(new Date())).append(";");
		buf.append(getLogCode(level)).append(";");
		if (sr != null)
			buf.append(sr.getBundle().getSymbolicName()).append(";");
		else
			buf.append(this.pluginName).append(";");

		if (t != null) {
//			t.printStackTrace(System.err);
			buf.append(t.getMessage()+";");
			buf.append(message).append("]");
			System.err.println(buf.toString());
		} else {
			buf.append(message).append("]");
			System.out.println(buf.toString());
		}
	}

	public void log(int level, String message) {
		log(null, level, message, null);
	}

	public void log(int level, String message, Throwable exception) {
		doLog(null, level, message, exception);
	}

	@SuppressWarnings("rawtypes")
	public void log(ServiceReference sr, int level, String message) {
		log(sr, level, message, null);
	}

	@SuppressWarnings("rawtypes")
	public void log(ServiceReference sr, int level, String message, Throwable exception) {
		doLog(sr, level, message, exception);
	}
}