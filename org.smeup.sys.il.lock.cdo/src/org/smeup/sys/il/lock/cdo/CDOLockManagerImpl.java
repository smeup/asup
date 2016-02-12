package org.smeup.sys.il.lock.cdo;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class CDOLockManagerImpl implements QLockManager {

	@Override
	public <T extends QObject> QObjectLocker<T> getLocker(QContext context, T object) {
		return new CDOLockerImpl<T>(object, context.get(QLogger.class));
	}

}
