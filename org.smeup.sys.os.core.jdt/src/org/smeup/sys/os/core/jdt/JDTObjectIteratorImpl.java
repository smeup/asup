/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.smeup.sys.os.core.jdt;

import java.util.Iterator;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.ResourceEventType;

public class JDTObjectIteratorImpl<T extends QObjectNameable> implements QObjectIterator<T> {

	private Class<T> klass;
	private Iterator<T> iterator;

	private T nextObject = null;
	private QResourceEvent<T> resourceEvent;

	public JDTObjectIteratorImpl(Class<T> klass, Iterator<T> iterator, QResourceEvent<T> resourceEvent) {
		this.klass = klass;
		this.iterator = iterator;
		this.resourceEvent = resourceEvent;
		doNext();
	}

	@Override
	public void close() {
		this.iterator = null;
	}

	@Override
	public boolean hasNext() {
		return nextObject != null;
	}

	@Override
	public T next() {
		T object = nextObject;

		doNext();

		if (object != null)
			resourceEvent.getResource().fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	private void doNext() {

		nextObject = null;
		while (iterator.hasNext()) {
			T eObject = iterator.next();

			if (!klass.isInstance(eObject))
				continue;

			T tempObject = klass.cast(eObject);
			nextObject = tempObject;
			break;
		}
	}
}
