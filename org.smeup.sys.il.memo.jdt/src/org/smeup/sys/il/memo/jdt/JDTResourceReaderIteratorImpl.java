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
package org.smeup.sys.il.memo.jdt;

import java.util.Queue;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.ResourceEventType;

public class JDTResourceReaderIteratorImpl<T extends QObjectNameable> implements QObjectIterator<T> {

	private Queue<QResourceReader<T>> readers;
	private QObjectIterator<T> currentIterator;
	private String namePrefix;
	private T nextObject = null;
	private QResourceEvent<T> resourceEvent;

	public JDTResourceReaderIteratorImpl(Queue<QResourceReader<T>> readers, String namePrefix, QResourceEvent<T> resourceEvent) {
		this.readers = readers;
		this.namePrefix = namePrefix;
		this.resourceEvent = resourceEvent;
		this.currentIterator = readers.poll().find(namePrefix);
		doNext();
	}

	@Override
	public void close() {
		this.currentIterator = null;
		this.readers = null;
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
		if (currentIterator == null)
			return;

		if (currentIterator.hasNext()) {
			nextObject = currentIterator.next();
			return;
		}

		while (readers.peek() != null) {
			currentIterator = readers.poll().find(namePrefix);
			while (currentIterator.hasNext()) {
				nextObject = currentIterator.next();
				return;
			}
		}
	}
}