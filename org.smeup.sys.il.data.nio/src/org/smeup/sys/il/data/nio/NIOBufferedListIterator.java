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

public class NIOBufferedListIterator<D extends QBufferedElement> implements Iterator<D> {

	private QBufferedList<D> list;
	private SortDirection sortDirection;
	private final int startIndex;
	private final int numElements;
	private int current = 0;

	public NIOBufferedListIterator(NIOBufferedListImpl<D> list, SortDirection sortDirection, int startIndex, int numElements) {
		this.list = list;
		this.sortDirection = sortDirection != null ?  sortDirection: list.getSortDirection();
		this.startIndex = startIndex;
		this.numElements = numElements;
		this.current = sortDirection == SortDirection.ASCEND ? startIndex - 1 : list.capacity() + 1;
	}

	@Override
	public boolean hasNext() {
		return sortDirection == SortDirection.ASCEND ? current < (numElements - startIndex + 1) : current > startIndex;
	}

	@Override
	public D next() {
		current = sortDirection == SortDirection.ASCEND ? current + 1 : current - 1;
		return list.get(current);
	}

	protected int current() {
		return this.current;
	}
}
