package org.smeup.sys.il.core.base;

import java.lang.Thread.State;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.core.ThreadStatus;

public class BaseThreadHelper {

	public static ThreadStatus getThreadStatus(State state) {

		switch (state) {
		case NEW:
			return ThreadStatus.NEW;
		case RUNNABLE:
			return ThreadStatus.RUNNABLE;
		case TIMED_WAITING:
			return ThreadStatus.TIMED_WAITING;
		case BLOCKED:			
			return ThreadStatus.BLOCKED;
		case WAITING:
			return ThreadStatus.WAITING;
		case TERMINATED:
			return ThreadStatus.TERMINATED;
		}
		
		throw new IntegratedLanguageCoreRuntimeException("Invalid thread status: "+state);
	}
}
