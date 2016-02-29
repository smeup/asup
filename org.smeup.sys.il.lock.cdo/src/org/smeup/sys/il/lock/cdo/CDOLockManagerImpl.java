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

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

public class CDOLockManagerImpl implements QLockManager {

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContext context, URI address) {
		
		N object = null;
		return new CDOLockerImpl<N>(object, context.get(QLogger.class));
	}

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContext context, N object) {
		return getLocker(context, object.qURI());
	}
}
