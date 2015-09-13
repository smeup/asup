package org.smeup.sys.il.lock.base;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLockable;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class BaseLockManagerImpl implements QLockManager {

	@Override
	public <T extends QObjectLockable> QObjectLocker<T> getLocker(QContext context, T object) {
		return new BaseLockerImpl<T>(object, context.get(QLogger.class));
	}

}