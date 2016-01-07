/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.List;

import org.smeup.sys.mi.core.util.QThreads;

public class BaseThreadsImpl implements QThreads {

	private ThreadGroup rootThreadGroup = null;

	@Override
	public List<Thread> listThreads() {
		final ThreadGroup rootThreadGroup = getRootThreadGroup();
		final ThreadMXBean thbean = ManagementFactory.getThreadMXBean();

		int size = thbean.getThreadCount();
		int n = 0;
		Thread[] threads = null;
		do {
			size *= 2;
			threads = new Thread[size];
			n = rootThreadGroup.enumerate(threads, true);
		} while (n == size);

		return java.util.Arrays.asList(threads);
	}

	@Override
	public List<ThreadInfo> listThreadInfos() {
		final ThreadMXBean thbean = ManagementFactory.getThreadMXBean();
		final long[] threadIds = thbean.getAllThreadIds();

		// Get thread info with lock info, when available.
		ThreadInfo[] infos;
		if (!thbean.isObjectMonitorUsageSupported() || !thbean.isSynchronizerUsageSupported())
			infos = thbean.getThreadInfo(threadIds);
		else
			infos = thbean.getThreadInfo(threadIds, true, true);

		final ThreadInfo[] notNulls = new ThreadInfo[infos.length];
		int nNotNulls = 0;
		for (ThreadInfo info : infos)
			if (info != null)
				notNulls[nNotNulls++] = info;
		
		if (nNotNulls == infos.length)
			return java.util.Arrays.asList(infos);
		
		return java.util.Arrays.asList(notNulls);
	}

	private ThreadGroup getRootThreadGroup() {
		if (rootThreadGroup != null)
			return rootThreadGroup;

		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup parentThreadGroup;
		while ((parentThreadGroup = threadGroup.getParent()) != null)
			threadGroup = parentThreadGroup;

		rootThreadGroup = threadGroup;
		return threadGroup;
	}
}
