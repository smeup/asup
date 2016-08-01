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
package org.smeup.sys.il.data.nio;

import java.util.Iterator;

import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.SortDirection;

public final class NIOBufferedListIterator<D extends QBufferedElement> implements Iterator<D> {

	private final QBufferedList<D> list;
	private final SortDirection sortDirection;
	private final int startIndex;
	private final int numElements;
	private int current = 0;

	public NIOBufferedListIterator(final NIOBufferedListImpl<D> list, final SortDirection sortDirection, final int startIndex, final int numElements) {
		this.list = list;
		this.sortDirection = sortDirection != null ? sortDirection : list.getSortDirection();
		this.startIndex = startIndex;
		this.numElements = numElements;
		this.current = sortDirection == SortDirection.ASCEND ? startIndex - 1 : list.capacity() + 1;
	}

	@Override
	public final boolean hasNext() {
		return sortDirection == SortDirection.ASCEND ? current < (numElements) : current > startIndex;
	}

	@Override
	public final D next() {
		current = sortDirection == SortDirection.ASCEND ? current + 1 : current - 1;
		return list.get(current);
	}

	protected final int current() {
		return this.current;
	}
}
