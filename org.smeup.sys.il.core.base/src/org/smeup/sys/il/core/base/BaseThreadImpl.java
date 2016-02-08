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

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ThreadStatus;

public class BaseThreadImpl extends Thread implements QThread {

	private static final long serialVersionUID = 1L;
	private final ReentrantLock lock = new ReentrantLock();
	private BaseThreadManagerImpl threadManager = null;

	protected BaseThreadImpl(BaseThreadManagerImpl threadManager, Runnable runnable, String name, boolean daemon) {
		super(runnable, name);
		this.threadManager = threadManager;
		setDaemon(daemon);
	}

	@Override
	public Thread getJavaThread() {
		return this;
	}

	@Override
	public boolean checkRunnable() {

		try {
			while (true) {
				if (isInterrupted())
					return false;

				if (!isSuspended())
					return true;

				if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
					lock.unlock();
					return true;
				}
			}
		} catch (InterruptedException e) {
			return false;
		}
	}

	@Override
	public long getThreadID() {
		return getJavaThread().getId();
	}

	@Override
	public String getThreadName() {
		return getJavaThread().getName();
	}

	@Override
	public int getThreadPriority() {
		return getJavaThread().getPriority();
	}

	@Override
	public ThreadStatus getThreadStatus() {
		return BaseThreadHelper.getThreadStatus(getJavaThread().getState());
	}

	@Override
	public boolean isThreadDaemon() {
		return getJavaThread().isDaemon();
	}

	@Override
	public boolean isNative() {
		return true;
	}

	@Override
	public boolean isSuspended() {
		return lock.isLocked();
	}

	protected void unlock() {
		if(lock.isLocked())
			lock.unlock();
	}

	protected void lock() {
		lock.lock();
	}
	
	@Override
	public double getThreadCPUUsage() {

		BaseThreadTime threadTime = threadManager.getThreadTime(getJavaThread());
		if (threadTime == null)
			return 0;

		return threadTime.getCPUUsage();
	}

}