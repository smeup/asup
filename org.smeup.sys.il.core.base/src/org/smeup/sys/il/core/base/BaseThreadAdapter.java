package org.smeup.sys.il.core.base;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ThreadStatus;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.mi.core.util.QThreads;

public class BaseThreadAdapter extends ObjectImpl implements QThread {

	private static final long serialVersionUID = 1L;
	private Thread thread;
	
	public BaseThreadAdapter(Thread thread) {
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
		return QThreads.qINSTANCE.lookupThreadInfo(getJavaThread()).isSuspended();
	}
}
