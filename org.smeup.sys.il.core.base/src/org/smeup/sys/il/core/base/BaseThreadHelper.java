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
package org.smeup.sys.il.core.base;

import java.lang.Thread.State;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.core.ThreadStatus;

public class BaseThreadHelper {

	public static ThreadStatus getThreadStatus(State state) {

		switch (state) {
		case NEW:
			return ThreadStatus.NEW;
		case RUNNABLE:
			return ThreadStatus.RUNNABLE;
		case TIMED_WAITING:
			return ThreadStatus.TIMED_WAITING;
		case BLOCKED:
			return ThreadStatus.BLOCKED;
		case WAITING:
			return ThreadStatus.WAITING;
		case TERMINATED:
			return ThreadStatus.TERMINATED;
		}

		throw new IntegratedLanguageCoreRuntimeException("Invalid thread status: " + state);
	}

	public static long getThreadCPUTime(long threadId) {

		ThreadMXBean thbean = ManagementFactory.getThreadMXBean();
		long cpuTime = thbean.getThreadCpuTime(threadId);

		return cpuTime;
	}
}
