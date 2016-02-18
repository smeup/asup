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

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HCLockManagerImpl implements QLockManager {
	
	private HazelcastInstance hazelcastInstance;

	public HCLockManagerImpl() {
		Config cfg = new Config();
        hazelcastInstance = Hazelcast.newHazelcastInstance(cfg);
	}	

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContext context, N object) {
		return new HCObjectLockerImpl<N>(URI.create(object.qURI()), context.get(QLogger.class), hazelcastInstance);
	}

}
