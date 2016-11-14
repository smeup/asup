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
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;

public class BaseLockManagerImpl implements QLockManager {

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContextProvider contextProvider, URI address) {
		return new BaseLockerImpl<N>(address);
	}

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContextProvider contextProvider, N object) {
		return getLocker(contextProvider, object.qURI());
	}

	@Override
	public <E> BlockingQueue<E> getQueue(QContextProvider contextProvider, String name) {
		return new LinkedBlockingQueue<E>();
	}
}