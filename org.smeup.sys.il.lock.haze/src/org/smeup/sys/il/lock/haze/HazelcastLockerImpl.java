package org.smeup.sys.il.lock.haze;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

import com.hazelcast.core.HazelcastInstance;

public class HazelcastLockerImpl<T extends QObject> implements QObjectLocker<T> {

	
	private T object;
	private QLogger logger;
	private HazelcastInstance hazelcastInstance = null;
	
	private static final String READ_LOCK_EXT = "?lockType=READ";
	private static final String WRITE_LOCK_EXT = "?lockType=WRITE";
	

	public HazelcastLockerImpl(T object, QLogger qLogger, HazelcastInstance hazelcastInstance) {
		this.object = object;
		this.logger = qLogger;
		this.hazelcastInstance = hazelcastInstance;		
	}

	@Override
	public void lock(LockType lockType) {
		
		Lock lock = null;
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(object.qURI() + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(object.qURI() + WRITE_LOCK_EXT);
			break;
		}
		
		lock.lock();
		
	}

	@Override
	public boolean tryLock(long time, LockType lockType) {
		Lock lock = null;
		
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(object.qURI() + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(object.qURI() + WRITE_LOCK_EXT);
			break;
		}
		
		boolean result = false;
		try {
			result = lock.tryLock(time, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			logger.warning(null, e);
			result = false;
		}
		
		return result;
	}

	@Override
	public void unlock(LockType lockType) {
		
		Lock lock = null;
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(object.qURI() + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(object.qURI() + WRITE_LOCK_EXT);
			break;
		}
		
		if (lock != null) {
			lock.unlock();
		}
		
	}

	@Override
	public boolean isLocked(LockType lockType) {
		Lock lock = null;		
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(object.qURI() + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(object.qURI() + WRITE_LOCK_EXT);
			break;
		}
		
		boolean locked = false;
		
		locked = lock.tryLock();
		
		if (locked) lock.unlock();

		return !locked;

	}

	@Override
	public boolean isLockedByOther(LockType lockType) {
		//TODO
		return false;
	}

	@Override
	public T getObject() {		
		return object;
	}
}
