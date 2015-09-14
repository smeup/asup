/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.memo.cdo;

import org.eclipse.net4j.util.collection.CloseableIterator;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.ResourceEventType;

public class CDOObjectIterator<T extends QObjectNameable> implements QObjectIterator<T> {

	private CloseableIterator<T> iterator;
	private QResourceEvent<T> resourceEvent;

	public CDOObjectIterator(CloseableIterator<T> iterator, QResourceEvent<T> resourceEvent) {
		this.iterator = iterator;
		this.resourceEvent = resourceEvent;
	}

	@Override
	public void close() {
		iterator.close();
	}

	@Override
	public boolean hasNext() {
		try {
			return iterator.hasNext();
		} catch (Exception e) {
			throw new IntegratedLanguageMemoryRuntimeException(e);
		}
	}

	@Override
	public T next() {
		T object = iterator.next();

		if (object != null)
			resourceEvent.getResource().fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}

	@Override
	public void remove() {
		iterator.remove();
	}

}
