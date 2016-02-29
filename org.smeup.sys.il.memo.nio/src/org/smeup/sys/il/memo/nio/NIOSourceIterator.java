/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.smeup.sys.il.memo.nio;

import java.io.IOException;
import java.util.Iterator;

import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.il.core.QObjectNameable;

public class NIOSourceIterator<T extends QObjectNameable> implements Iterator<T> {

	private Class<T> klass;
	private Iterator<QSourceEntry> entries;
	
	public NIOSourceIterator(Class<T> klass, Iterator<QSourceEntry> entries) {
		this.klass = klass;
		this.entries = entries;
	}

	@Override
	public boolean hasNext() {
		return entries.hasNext();
	}

	@Override
	public T next() {

		T typedObject = null;
		QSourceEntry entry = entries.next();
		try {
			typedObject = entry.load(klass);
		} catch (IOException e) {
			System.err.println(e.getMessage() + " location: " + entry);
			typedObject = next();
		}

		return typedObject;
	}

	@Override
	public void remove() {
		entries.remove();
	}
}
