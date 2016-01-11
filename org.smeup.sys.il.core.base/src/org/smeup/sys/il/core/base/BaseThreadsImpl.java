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
import java.lang.management.MonitorInfo;
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
	public List<Thread> listThreads(String threadGroup) {
		final ThreadGroup group = lookupThreadGroup(threadGroup);
		if (group == null)
			return null;
		return listThreads(group);

	}

	@Override
	public List<Thread> listThreads(ThreadGroup threadGroup) {
		int size = threadGroup.activeCount();
		int n = 0;
		Thread[] threads = null;
		do {
			size *= 2;
			threads = new Thread[size];
			n = threadGroup.enumerate(threads, false);
		} while (n == size);
		return java.util.Arrays.asList(threads);

	}

	@Override
	public List<ThreadGroup> listThreadGroups() {
		final ThreadGroup root = getRootThreadGroup();
		int size = root.activeGroupCount();
		int n = 0;
		ThreadGroup[] groups = null;
		do {
			size *= 2;
			groups = new ThreadGroup[size];
			n = root.enumerate(groups, true);
		} while (n == size);
		ThreadGroup[] allGroups = new ThreadGroup[n + 1];
		allGroups[0] = root;
		System.arraycopy(groups, 0, allGroups, 1, n);
		return java.util.Arrays.asList(allGroups);
	}

	@Override
	public List<ThreadInfo> listThreadInfos() {
		final ThreadMXBean thbean = ManagementFactory.getThreadMXBean();
		final long[] threadIds = thbean.getAllThreadIds();

		ThreadInfo[] infos;
		if (!thbean.isObjectMonitorUsageSupported() || !thbean.isSynchronizerUsageSupported())
			infos = thbean.getThreadInfo(threadIds);
		else
			infos = thbean.getThreadInfo(threadIds, true, false);

		final ThreadInfo[] notNulls = new ThreadInfo[infos.length];
		int nNotNulls = 0;
		for (ThreadInfo info : infos)
			if (info != null)
				notNulls[nNotNulls++] = info;

		if (nNotNulls == infos.length)
			return java.util.Arrays.asList(infos);

		return java.util.Arrays.asList(notNulls);
	}

	@Override
	public Thread lookupBlockingThread(Thread thread) {
		final ThreadInfo info = lookupThreadInfo(thread);
		if (info == null)
			return null;
		final long id = info.getLockOwnerId();
		if (id == -1)
			return null;
		return lookupThread(id);
	}

	@Override
	public Thread lookupLockingThread(Object object) {

		final long identity = System.identityHashCode(object);

		ThreadInfo info = null;
		MonitorInfo[] monitors = null;
		for (Thread thread : listThreads()) {
			info = lookupThreadInfo(thread.getId());
			if (info == null)
				continue;
			monitors = info.getLockedMonitors();
			for (MonitorInfo monitor : monitors)
				if (identity == monitor.getIdentityHashCode())
					return thread;
		}
		return null;
	}

	@Override
	public Thread lookupThread(long id) {
		for (Thread thread : listThreads())
			if (thread.getId() == id)
				return thread;
		return null;
	}

	@Override
	public Thread lookupThread(String name) {
		for (Thread thread : listThreads())
			if (thread.getName().equals(name))
				return thread;
		return null;
	}

	@Override
	public Thread lookupThread(ThreadInfo info) {
		return lookupThread(info.getThreadId());
	}

	@Override
	public ThreadGroup lookupThreadGroup(String name) {
		for (ThreadGroup group : listThreadGroups())
			if (group.getName().equals(name))
				return group;
		return null;
	}

	@Override
	public ThreadInfo lookupThreadInfo(long id) {
		final ThreadMXBean thbean = ManagementFactory.getThreadMXBean();

		if (!thbean.isObjectMonitorUsageSupported() || !thbean.isSynchronizerUsageSupported())
			return thbean.getThreadInfo(id);

		final ThreadInfo[] infos = thbean.getThreadInfo(new long[] { id }, true, false);
		if (infos.length == 0)
			return null;
		return infos[0];
	}

	@Override
	public ThreadInfo lookupThreadInfo(Thread thread) {
		return lookupThreadInfo(thread.getId());
	}

	@Override
	public ThreadInfo lookupThreadInfo(String name) {

		for (Thread thread : listThreads())
			if (thread.getName().equals(name))
				return lookupThreadInfo(thread.getId());
		return null;

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