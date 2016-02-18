/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.lock.base;

import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLocker;

public class BaseLockerImpl<N extends QObjectNameable> implements QObjectLocker<N> {

	private ReentrantReadWriteLock lock;

	private URI objectURI;

	public BaseLockerImpl(URI objectURI) {
		this.objectURI = objectURI;

		this.lock = new ReentrantReadWriteLock();
	}

	@Override
	public URI getObjectURI() {
		return objectURI;
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
}