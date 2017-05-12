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

import org.osgi.service.log.LogService;
import org.smeup.sys.rt.core.QLogger;

public class OSGILoggerImpl implements QLogger {

	private LogService logService = new SystemLogService("E4Logger");
	
	@Override
	public void debug(String message) {
		logService.log(LogService.LOG_DEBUG, message);		
	}

	@Override
	public void debug(Throwable throwable) {
		logService.log(LogService.LOG_DEBUG,  null, throwable);		
	}

	@Override
	public void debug(String message, Throwable throwable) {
		logService.log(LogService.LOG_DEBUG, message, throwable);		
	}

	@Override
	public void error(String message) {
		logService.log(LogService.LOG_ERROR, message);
	}

	@Override
	public void error(Throwable throwable) {
		logService.log(LogService.LOG_ERROR, null, throwable);
	}

	@Override
	public void error(String message, Throwable throwable) {
		logService.log(LogService.LOG_ERROR, message, throwable);
	}
	
	@Override
	public void info(String message) {
		logService.log(LogService.LOG_INFO, message);
	}

	@Override
	public void info(Throwable throwable) {
		logService.log(LogService.LOG_INFO, null, throwable);
	}

	@Override
	public void info(String message, Throwable throwable) {
		logService.log(LogService.LOG_INFO, message, throwable);
	}

	@Override
	public void warning(String message) {
		logService.log(LogService.LOG_WARNING, message);
	}

	@Override
	public void warning(Throwable throwable) {
		logService.log(LogService.LOG_WARNING, null, throwable);
	}

	@Override
	public void warning(String message, Throwable throwable) {
		logService.log(LogService.LOG_WARNING, message, throwable);
	}
}