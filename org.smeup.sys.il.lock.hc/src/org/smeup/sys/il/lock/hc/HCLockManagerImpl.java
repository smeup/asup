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
 *   Rocchi Mattia - Contribution
 */
package org.smeup.sys.il.lock.hc;

import java.net.URI;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentMap;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QLogger;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HCLockManagerImpl implements QLockManager {

	private HazelcastInstance hazelcastInstance;

	@Inject
	public HCLockManagerImpl(QApplication application) {
		Config cfg = new Config();
		cfg.setInstanceName(application.getName());

		NetworkConfig network = cfg.getNetworkConfig();
		JoinConfig join = network.getJoin();
		join.getMulticastConfig().setEnabled(false);
		join.getTcpIpConfig().addMember("127.0.0.1");
		
		hazelcastInstance = Hazelcast.newHazelcastInstance(cfg);
	}

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContextProvider contextProvider, URI address) {
		return new HCObjectLockerImpl<N>(address, contextProvider.getContext().get(QLogger.class), hazelcastInstance);
	}

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContextProvider contextProvider, N object) {
		return getLocker(contextProvider, object.qURI());
	}

	@Override
	public <E> BlockingQueue<E> getQueue(QContextProvider contextProvider, String name) {
		return hazelcastInstance.getQueue(name);
	}

	@Override
	public <K, V> ConcurrentMap<K, V> getConcurrentMap(QContextProvider contextProvider, String name) {
		return hazelcastInstance.getMap(name);
	}
}