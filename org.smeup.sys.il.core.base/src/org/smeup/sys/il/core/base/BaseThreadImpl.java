package org.smeup.sys.il.core.base;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.smeup.sys.il.core.QThread;

public class BaseThreadImpl extends Thread implements QThread {

	protected volatile ReentrantLock lock = new ReentrantLock();	

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

		if (Thread.currentThread().isInterrupted())
			return false;

		try {
			while(true) {
				if(lock.tryLock() || lock.tryLock(100, TimeUnit.MILLISECONDS)) {
					lock.unlock();
					return true;
				}
				if (Thread.currentThread().isInterrupted())
					return false;
			}
		} catch (InterruptedException e) {				
			return false;
		}
	}
}