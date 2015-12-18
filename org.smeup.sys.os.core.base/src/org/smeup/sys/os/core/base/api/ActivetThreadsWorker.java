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
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.JobThreadStatus;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobThread;
import org.smeup.sys.os.core.jobs.impl.JobThreadImpl;

import com.jvmtop.monitor.ThreadStats;
import com.jvmtop.monitor.VMInfo;


@Program(name = "QWCCDSACTHD")
public class ActivetThreadsWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;

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

		for (QObject thrd :threads())
			try {
				objectWriter.write(thrd);
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}

		objectWriter.flush();
	}

	private Collection<QJobThread> threads() {
		try {
			VMInfo info = VMInfo.processCurrentVM();
			List<ThreadStats> threadInfosSortedByCPU = info.getThreadInfoSortedByCPU();
			Collection<QJobThread> result = new ArrayList<QJobThread>();
			for (ThreadStats threadStats: threadInfosSortedByCPU) {
				result.add(new InternalJobThreadAdapter(threadStats.getThreadInfo()));
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
	
	private class InternalJobThreadAdapter extends JobThreadImpl {

		private static final long serialVersionUID = 1L;
		private ThreadInfo threadInfo;
		
		public InternalJobThreadAdapter(ThreadInfo threadInfo) {
			this.threadInfo = threadInfo;
			this.name = threadInfo.getThreadName(); 
			setThreadID(threadInfo.getThreadId());
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
				
	}
}