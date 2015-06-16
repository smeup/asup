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
package org.smeup.sys.os.core.e4;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.ResourceEventType;

public class E4ObjectIteratorImpl<T extends QObjectNameable> implements QObjectIterator<T> {

	private Class<T> klass;
	private Iterator<EObject> iterator;
	private String namePrefix;
	private T nextObject = null;
	private QResourceEvent<T> resourceEvent;

	public E4ObjectIteratorImpl(Class<T> klass, Iterator<EObject> iterator, String namePrefix, QResourceEvent<T> resourceEvent) {
		this.klass = klass;
		this.iterator = iterator;
		this.resourceEvent = resourceEvent;
		this.namePrefix = namePrefix;
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
			EObject eObject = iterator.next();
			if (klass.isInstance(eObject)) {
				T tempObject = klass.cast(eObject);
				if (namePrefix == null) {
					nextObject = tempObject;
					break;
				} else if (namePrefix.endsWith("*")) {
					if (tempObject.getName().startsWith(namePrefix.substring(0, namePrefix.length() - 1))) {
						nextObject = tempObject;
						break;
					}
				} else if (tempObject.getName().equals(namePrefix)) {
					nextObject = tempObject;
					break;
				}
			}
		}
	}
}
