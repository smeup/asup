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
package org.smeup.sys.os.dtaq.base;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class BaseBlockingKeyedQueue<K, V> extends BaseBlockingQueue {

	private Map<K, V> map = null;
	
	public BaseBlockingKeyedQueue(ConcurrentMap<K, V> map) {
		this.map = map; 
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	public void put(K key, V value) {
		map.put(key, value);
	}

	public V get(K key) {
		return map.get(key);
	}


	public V remove(K key) {
		return map.remove(key);
	}
}
