package org.smeup.sys.il.lock.base;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLocker;

public class BaseLockerImpl<T extends QObject> implements QObjectLocker<T> {

	private ReentrantReadWriteLock lock;

	private T object;

	public BaseLockerImpl(T object) {
		this.object = object;

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
			System.err.println(e);
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
			// return lock.readLock().
		case WRITE:
			// return lockWrite.tryLock();
		}

		return false;
	}

	@Override
	public boolean isLockedByOther(LockType lockType) {
		// TODO Auto-generated method stub
		return false;
	}

}