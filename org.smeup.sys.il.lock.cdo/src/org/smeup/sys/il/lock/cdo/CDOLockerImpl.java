package org.smeup.sys.il.lock.cdo;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLockable;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class CDOLockerImpl<T extends QObjectLockable> implements QObjectLocker<T> {

	private T object;
	private QLogger logger;

	public CDOLockerImpl(T object, QLogger logger) {
		this.object = object;
		this.logger = logger;
	}

	@Override
	public T getObject() {
		return object;
	}
	
	@Override
	public void lock(LockType lockType) {

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);

		CDOLock lock = null;
		switch (lockType) {
		case READ:
			lock = cdoObject.cdoReadLock();
			break;
		case WRITE:
			lock = cdoObject.cdoWriteLock();
			break;
		}

		lock.lock();
	}

	@Override
	public boolean tryLock(long time, LockType lockType) {

		try {
			CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);

			CDOLock lock = null;
			switch (lockType) {
			case READ:
				lock = cdoObject.cdoReadLock();
				break;
			case WRITE:
				lock = cdoObject.cdoWriteLock();
				break;
			}

			return lock.tryLock(time, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			logger.warning(null, e);
		}
		
		return false;
	}

	@Override
	public void unlock(LockType lockType) {

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);
		
		CDOLock lock = null;
		switch (lockType) {
		case READ:
			lock = cdoObject.cdoReadLock();
			break;
		case WRITE:
			lock = cdoObject.cdoWriteLock();
			break;
		}

		lock.unlock();
	}

	@Override
	public boolean isLocked(LockType lockType) {
		
		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);
		
		CDOLock lock = null;
		switch (lockType) {
		case READ:
			lock = cdoObject.cdoReadLock();
			break;
		case WRITE:
			lock = cdoObject.cdoWriteLock();
			break;
		}

		return lock.isLocked();
	}

	@Override
	public boolean isLockedByOther(LockType lockType) {
		
		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);
		
		CDOLock lock = null;
		switch (lockType) {
		case READ:
			lock = cdoObject.cdoReadLock();
			break;
		case WRITE:
			lock = cdoObject.cdoWriteLock();
			break;
		}

		return lock.isLockedByOthers();
	}
}
