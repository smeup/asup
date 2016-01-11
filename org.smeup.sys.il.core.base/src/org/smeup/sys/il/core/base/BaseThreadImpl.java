package org.smeup.sys.il.core.base;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ThreadStatus;

public class BaseThreadImpl extends Thread implements QThread {

	private static final long serialVersionUID = 1L;
	private volatile ReentrantLock lock = new ReentrantLock();	

	protected BaseThreadImpl(Runnable runnable, String name, boolean daemon) {
		super(runnable, name);
		setDaemon(daemon);
	}

	@Override
	public Thread getJavaThread() {
		return this;
	}

	@Override
	public boolean checkRunnable() {
		
		try {
			while(true) {
				if (Thread.currentThread().isInterrupted())
					return false;

				synchronized (lock) {
					if(!lock.isLocked())
						return true;

					if(lock.tryLock(100, TimeUnit.MILLISECONDS)) {
						lock.unlock();
						return true;
					}					
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
	    synchronized (lock) {
			lock.unlock();			
		}		
	}

	protected void lock() {
	    synchronized (lock) {
			lock.lock();			
		}		
	}
}