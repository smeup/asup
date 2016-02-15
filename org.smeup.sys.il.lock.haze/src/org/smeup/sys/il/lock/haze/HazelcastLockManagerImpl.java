package org.smeup.sys.il.lock.haze;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QLogger;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastLockManagerImpl implements QLockManager {
	
	private HazelcastInstance hazelcastInstance;

	public HazelcastLockManagerImpl() {
		Config cfg = new Config();
        hazelcastInstance = Hazelcast.newHazelcastInstance(cfg);
	}	

	@Override
	public <N extends QObjectNameable> QObjectLocker<N> getLocker(QContext context, N object) {
		return new HazelcastLockerImpl<N>(object, context.get(QLogger.class), hazelcastInstance);
	}

}
