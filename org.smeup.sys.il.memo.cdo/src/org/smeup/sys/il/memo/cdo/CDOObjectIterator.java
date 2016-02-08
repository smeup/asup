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
package org.smeup.sys.il.memo.cdo;

import org.eclipse.net4j.util.collection.CloseableIterator;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;

public class CDOObjectIterator<T extends QObjectNameable> implements QObjectIterator<T> {

	private CloseableIterator<T> iterator;

	public CDOObjectIterator(CloseableIterator<T> iterator) {
		this.iterator = iterator;
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
		return object;
	}

	@Override
	public void remove() {
		iterator.remove();
	}

}
