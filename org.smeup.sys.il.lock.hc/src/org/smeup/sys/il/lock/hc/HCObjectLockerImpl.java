/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.il.lock.hc;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ILock;

public class HCObjectLockerImpl<N extends QObjectNameable> implements QObjectLocker<N> {

	private URI objectURI;
	private QLogger logger;
	private HazelcastInstance hazelcastInstance = null;
	
	private static final String READ_LOCK_EXT = "?lockType=READ";
	private static final String WRITE_LOCK_EXT = "?lockType=WRITE";
	

	public HCObjectLockerImpl(URI objectURI, QLogger qLogger, HazelcastInstance hazelcastInstance) {
		this.objectURI = objectURI;
		this.logger = qLogger;
		this.hazelcastInstance = hazelcastInstance;		
	}

	@Override
	public void lock(LockType lockType) {
		
		ILock lock = null;
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(objectURI + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(objectURI + WRITE_LOCK_EXT);
			break;
		}
		
		lock.lock();
		
	}

	@Override
	public boolean tryLock(long time, LockType lockType) {
		
		ILock lock = null;
		
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(objectURI + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(objectURI + WRITE_LOCK_EXT);
			break;
		}
		
		boolean result = false;
		try {
			result = lock.tryLock(time, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			logger.warning(null, e);
			result = false;
		}
		
		return result;
	}

	@Override
	public void unlock(LockType lockType) {
		
		ILock lock = null;
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(objectURI + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(objectURI + WRITE_LOCK_EXT);
			break;
		}
		
		if (lock != null) 
			lock.unlock();		
	}

	@Override
	public boolean isLocked(LockType lockType) {
		
		ILock lock = null;		
		switch (lockType) {
		case READ:
			lock = hazelcastInstance.getLock(objectURI + READ_LOCK_EXT);
			break;
		case WRITE:
			lock = hazelcastInstance.getLock(objectURI + WRITE_LOCK_EXT);
			break;
		}
		
		return lock.isLocked();
	}

	@Override
	public URI getObjectURI() {
		return objectURI;
	}
}
