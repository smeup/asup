package org.smeup.sys.il.lock.base;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLockable;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class E4LockerImpl<T extends QObjectLockable> implements QObjectLocker<T> {

	private ReentrantReadWriteLock lock;

	private T object;
	private QLogger logger;

	public E4LockerImpl(T object, QLogger logger) {
		this.object = object;
		this.logger = logger;

		this.lock = new ReentrantReadWriteLock();
	}

	@Override
	public T getObject() {
		return object;
	}

	@Override
	public void lock(LockType lockType) {

		switch (lockType) {
		case READ:
			lock.readLock().lock();
			break;
		case WRITE:
			lock.writeLock().lock();
			break;
		}
	}

	@Override
	public boolean tryLock(long time, LockType lockType) {

		try {
			switch (lockType) {
			case READ:
				return lock.readLock().tryLock(time, TimeUnit.MILLISECONDS);
			case WRITE:
				return lock.writeLock().tryLock(time, TimeUnit.MILLISECONDS);
			}
		} catch (InterruptedException e) {
			logger.warning(null, e);
		}
		
		return false;
	}

	@Override
	public void unlock(LockType lockType) {

		switch (lockType) {
		case READ:
			lock.readLock().unlock();
		case WRITE:
			lock.writeLock().unlock();
		}
	}

	@Override
	public boolean isLocked(LockType lockType) {
		
		switch (lockType) {
		case READ:
//			return lock.readLock().
		case WRITE:
//			return lockWrite.tryLock();
		}
		
		return false;
	}

	@Override
	public boolean isLockedByOther(LockType lockType) {
		// TODO Auto-generated method stub
		return false;
	}

}