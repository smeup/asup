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
package org.smeup.sys.il.data.nio;

import java.util.Iterator;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QList;

public class NIOListIteratorImpl<D extends QBufferedData> implements Iterator<D> {

	private QList<D> list;
	private int current = 0;

	protected NIOListIteratorImpl(QList<D> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return current < list.capacity();
	}

	@Override
	public D next() {
		current++;
		return list.get(current);
	}

	@Override
	public void remove() {
		list.get(current).clear();
	}

}
