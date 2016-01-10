package org.smeup.sys.il.core.base;

import java.lang.Thread.State;

import org.smeup.sys.il.core.ThreadStatus;

public class BaseThreadHelper {

	public static ThreadStatus getThreadStatus(State state) {

		ThreadStatus jobThreadStatus = null;
		
		switch (state) {
		case NEW:
		case RUNNABLE:
			jobThreadStatus = ThreadStatus.RUN;
			break;			
		case BLOCKED:
		case TIMED_WAITING:
		case WAITING:
			jobThreadStatus = ThreadStatus.WAITING;
			break;
		case TERMINATED:
			jobThreadStatus = ThreadStatus.END;
			break;
		}
		return jobThreadStatus;
	}
}
