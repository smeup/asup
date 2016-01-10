/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import java.io.IOException;
import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.mi.core.util.QThreads;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.JobThreadStatus;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobThread;
import org.smeup.sys.os.core.jobs.impl.JobThreadImpl;


@Program(name = "QWCCDSACTHD")
public class ActivetThreadsWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QThreads threads;
	@Inject
	private QThreadManager threadManager;
	
	@Main
	public void main(@Supported @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output) {
		QObjectWriter objectWriter = null;

		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			break;
		case TERM_STAR:
			objectWriter = outputManager.getDefaultWriter(job.getContext());
			break;
		}

		objectWriter.initialize();

		for (QJobThread thread :threads())
			try {
				objectWriter.write(thread);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}

		objectWriter.flush();
		
		
		QThread myThread = threadManager.createThread("job-test"+System.currentTimeMillis(), new MyRunnable());
		threadManager.start(myThread);
		
		try {
			Thread.sleep(5000);
			System.out.println("suspend "+myThread.getJavaThread().getName());
			threadManager.suspend(myThread);
			
			Thread.sleep(5000);			
			System.out.println("release "+myThread.getJavaThread().getName());
			threadManager.release(myThread);
			
			Thread.sleep(5000);
			System.out.println("stop "+myThread.getJavaThread().getName());
			threadManager.stop(myThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}

	private Collection<QJobThread> threads() {
		try {
			Collection<QJobThread> result = new ArrayList<QJobThread>();
			
			for (ThreadInfo threadInfo: threads.listThreadInfos()) {
				result.add(new InternalJobThreadAdapter(threads, threadInfo));
			}
			return result;
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, 
		@Special(value = "L")
		PRINT
	}
	
	public static class InternalJobThreadAdapter extends JobThreadImpl {

		private static final long serialVersionUID = 1L;
		private ThreadInfo threadInfo;
		private QThreads threads;
		
		public InternalJobThreadAdapter(QThreads threads, ThreadInfo threadInfo) {
			this.threads = threads;
			this.threadInfo = threadInfo;
		}

		@Override
		public String getThreadName() {
			return threadInfo.getThreadName();
		}

		@Override
		public JobThreadStatus getThreadStatus() {

			JobThreadStatus jobThreadStatus = null;
			
			switch (threadInfo.getThreadState()) {
			case NEW:
			case RUNNABLE:
				jobThreadStatus = JobThreadStatus.RUN;
				break;			
			case BLOCKED:
			case TIMED_WAITING:
			case WAITING:
				jobThreadStatus = JobThreadStatus.WAITING;
				break;
			case TERMINATED:
				jobThreadStatus = JobThreadStatus.END;
				break;
			}
			return jobThreadStatus;
		}

		@Override
		public long getThreadID() {
			return threadInfo.getThreadId();
		}
		
		@Override
		public int getThreadPriority() {
			Thread thread = threads.lookupThread(threadInfo);
			return thread.getPriority();
		}
		
		
		@Override
		public boolean isThreadDaemon() {
			Thread thread = threads.lookupThread(threadInfo);
			return thread.isDaemon();
		}
	}
	
	private class MyRunnable implements Runnable {

		@Override
		public void run() {
			
			QThread currentThread = threadManager.currentThread();
			while(currentThread.checkRunnable()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					break;
				}
			}
			
			System.out.println("ended");
		}
		
	}
}