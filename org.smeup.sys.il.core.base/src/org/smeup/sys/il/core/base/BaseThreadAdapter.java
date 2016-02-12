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

import java.lang.management.ThreadInfo;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ThreadStatus;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.mi.core.util.QThreads;

public class BaseThreadAdapter extends ObjectImpl implements QThread {

	private static final long serialVersionUID = 1L;
	private Thread thread;
	private BaseThreadManagerImpl threadManager = null;

	public BaseThreadAdapter(BaseThreadManagerImpl threadManager, Thread thread) {
		this.threadManager = threadManager;
		this.thread = thread;
	}

	@Override
	public String getThreadName() {
		return thread.getName();
	}

	@Override
	public ThreadStatus getThreadStatus() {
		return BaseThreadHelper.getThreadStatus(thread.getState());
	}

	@Override
	public long getThreadID() {
		return thread.getId();
	}

	@Override
	public int getThreadPriority() {
		return getJavaThread().getPriority();
	}

	@Override
	public boolean isThreadDaemon() {
		return getJavaThread().isDaemon();
	}

	@Override
	public Thread getJavaThread() {
		return thread;
	}

	@Override
	public boolean checkRunnable() {
		return false;
	}

	@Override
	public boolean isNative() {
		return false;
	}

	@Override
	public boolean isSuspended() {
		ThreadInfo threadInfo = QThreads.qINSTANCE.lookupThreadInfo(getJavaThread());
		if (threadInfo != null)
			return threadInfo.isSuspended();
		else
			return false;
	}
	
	@Override
	public boolean isInterrupted() {
		return getJavaThread().isInterrupted();
	}
	
	@Override
	public double getThreadCPUUsage() {

		BaseThreadTime threadTime = threadManager.getThreadTime(getJavaThread());
		if (threadTime == null)
			return 0;

		return threadTime.getCPUUsage();
	}

	@Override
	public String qURI() {
		return "asup://"+this.toString();
	}
}