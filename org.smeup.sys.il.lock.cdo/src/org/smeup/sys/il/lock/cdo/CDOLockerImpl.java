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
package org.smeup.sys.il.lock.cdo;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class CDOLockerImpl<N extends QObjectNameable> implements QObjectLocker<N> {

	private N object;
	private URI objectURI;
	private QLogger logger;

	public CDOLockerImpl(N object, QLogger logger) {
		this.object = object;
		this.objectURI = URI.create(object.qURI());
		this.logger = logger;
	}

	@Override
	public URI getObjectURI() {
		return objectURI;
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
}
