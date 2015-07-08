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
package org.smeup.sys.il.core.base;

import java.util.List;

import org.smeup.sys.il.core.java.QLists;

public class BaseListsImpl implements QLists {

	@Override
	public <E> void addFirst(List<E> list, E element) {
		list.add(0, element);
	}

	@Override
	public <E> void addLast(List<E> list, E element) {
		list.add(list.size() - 1, element);
	}
}
