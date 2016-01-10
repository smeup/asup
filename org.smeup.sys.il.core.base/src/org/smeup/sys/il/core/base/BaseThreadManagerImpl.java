package org.smeup.sys.il.core.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.mi.core.util.QThreads;

public class BaseThreadManagerImpl implements QThreadManager {

	@Inject
	private QThreads threads;
	
	@Override
	public QThread createThread(String name, Runnable runnable) {
		return createThread(name, runnable, false);
	}

	@Override
	public QThread createThread(String name, Runnable runnable, boolean daemon) {

		BaseThreadImpl thread = new BaseThreadImpl(runnable, "asup://thread/"+name, daemon);
		return thread;
	}

	@Override
	public List<QThread> listThreads() {
		
		List<QThread> qThreads = new ArrayList<QThread>();
		
		for(Thread thread: threads.listThreads()) {
			if(thread instanceof QThread)
				qThreads.add((QThread) thread);
		}

		return qThreads;
	}

	@Override
	public QThread lookupThread(long id) {
		
		Thread thread = threads.lookupThread(id);
		if(thread instanceof QThread)
			return (QThread)thread;
		
		return null;
	}

	@Override
	public QThread lookupThread(String name) {
		
		Thread thread = threads.lookupThread(name);
		if(thread instanceof QThread)
			return (QThread)thread;
		
		return null;
	}
	
	@Override
	public void release(QThread thread) {
	    BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
	    synchronized (baseThreadImpl.lock) {
			baseThreadImpl.lock.unlock();			
		}		
	}

	@Override
	public void start(QThread thread) {
		((BaseThreadImpl)thread).start();
	}

	@Override
	public void stop(QThread thread) {
	    BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;		
	    baseThreadImpl.interrupt();
	}

	@Override
	public void suspend(QThread thread) {
	    BaseThreadImpl baseThreadImpl = (BaseThreadImpl) thread;
	    synchronized (baseThreadImpl.lock) {
			baseThreadImpl.lock.lock();			
		}
	}

	@Override
	public QThread currentThread() {
		
		Thread currentThread = Thread.currentThread();
		if(currentThread instanceof QThread)
			return (QThread)currentThread;
		
		return null;
	}
}