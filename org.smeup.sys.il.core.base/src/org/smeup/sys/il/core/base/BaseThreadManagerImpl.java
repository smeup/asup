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

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.mi.core.util.QThreads;

public class BaseThreadManagerImpl implements QThreadManager {

	private Map<Long, BaseThreadTime> currentTimes = new HashMap<Long, BaseThreadTime>();
	private Map<Long, Long> previousCpuTimes = new HashMap<Long, Long>();

	private QThreads threads;
	private long totalCpuTime = 0;

	@Inject
	public BaseThreadManagerImpl(QThreads threads) {
		this.threads = threads;

		QThread thread = createThread("cpu-monitor", new BaseThreadsMonitor(this), true);
		start(thread);
	}

	protected long getCpuTime() {
		return totalCpuTime;
	}

	protected BaseThreadTime getThreadTime(Thread thread) {
		return currentTimes.get(thread.getId());
	}

	@Override
	public QThread createThread(String name, Runnable runnable) {
		return createThread(name, runnable, false);
	}

	@Override
	public QThread createThread(String name, Runnable runnable, boolean daemon) {

		BaseThreadImpl thread = new BaseThreadImpl(this, runnable, "asup://thread/" + name, daemon);
		return thread;
	}

	@Override
	public List<QThread> listThreads() {

		List<QThread> qThreads = new ArrayList<QThread>();

		for (Thread thread : threads.listThreads()) {
			if (thread == null)
				continue;

			if (thread instanceof QThread)
				qThreads.add((QThread) thread);
			else
				qThreads.add(new BaseThreadAdapter(this, thread));
		}

		return qThreads;
	}

	@Override
	public QThread lookupThread(long id) {

		Thread thread = threads.lookupThread(id);
		if (thread instanceof QThread)
			return (QThread) thread;
		else
			return new BaseThreadAdapter(this, thread);
	}

	@Override
	public QThread lookupThread(String name) {

		Thread thread = threads.lookupThread(name);
		if (thread instanceof QThread)
			return (QThread) thread;
		else
			return new BaseThreadAdapter(this, thread);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void release(QThread thread) {
		if (thread instanceof BaseThreadImpl) {
			BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
			baseThreadImpl.unlock();
		} else
			thread.getJavaThread().resume();
	}

	@Override
	public void start(QThread thread) {
		thread.getJavaThread().start();
	}

	@Override
	public void stop(QThread thread) {
		thread.getJavaThread().interrupt();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void suspend(QThread thread) {

		if (thread instanceof BaseThreadImpl) {
			BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
			if(!baseThreadImpl.isSuspended())
				baseThreadImpl.lock();
		} else
			thread.getJavaThread().suspend();
	}

	@Override
	public QThread currentThread() {

		Thread currentThread = Thread.currentThread();
		if (currentThread instanceof QThread)
			return (QThread) currentThread;
		else
			return new BaseThreadAdapter(this, currentThread);
	}

	protected synchronized void refreshCPUUsage() {

		ThreadMXBean thBean = ManagementFactory.getThreadMXBean();
		HashMap<Long, BaseThreadTime> newTimes = new HashMap<Long, BaseThreadTime>();

		for (Thread thread : threads.listThreads()) {
			// TODO remove me
			if (thread == null)
				continue;

			BaseThreadTime currentThreadTime = this.currentTimes.get(thread.getId());
			long cpuTime = thBean.getThreadCpuTime(thread.getId());
			Long previousCpuTime = previousCpuTimes.get(thread.getId());
			double cpuUsage = 0;
			previousCpuTimes.put(thread.getId(), cpuTime);
			if (previousCpuTime != null)
				cpuUsage = Math.min((cpuTime - previousCpuTime) / 10000000d, 100);
			previousCpuTimes.put(thread.getId(), cpuTime);
			
			if (currentThreadTime == null) 
				newTimes.put(thread.getId(), new BaseThreadTime(cpuUsage));
			else  {
				currentThreadTime.setCPUUsage(cpuUsage);
				newTimes.put(thread.getId(), new BaseThreadTime(cpuUsage));
			}
		}

		this.currentTimes = newTimes;
	}
}