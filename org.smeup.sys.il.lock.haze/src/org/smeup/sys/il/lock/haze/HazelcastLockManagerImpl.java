package org.smeup.sys.il.lock.haze;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class HazelcastLockManagerImpl implements QLockManager {

	@Override
	public <T extends QObject> QObjectLocker<T> getLocker(QContext context, T object) {
		return new HazelcastLockerImpl<T>(object, context.get(QLogger.class));
	}

}
