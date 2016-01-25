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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

public class JDTResourceSetReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<JDTResourceReaderImpl<T>> resourceSet;

	public JDTResourceSetReaderImpl(QContextProvider contextProvider, QSourceManager sourceManager, Class<T> klass, List<String> resources) {

		setContextProvider(contextProvider);

		resourceSet = new ArrayList<JDTResourceReaderImpl<T>>();
		for (String resource: resources) {
			JDTResourceReaderImpl<T> resourceReader = new JDTResourceReaderImpl<T>(contextProvider, sourceManager, klass, resource);
			resourceSet.add(resourceReader);
		}
	}

	@Override
	public T lookup(String name) {

		T object = null;
		for (QResourceReader<T> resourceReader : resourceSet) {
			object = resourceReader.lookup(name);
			if (object != null)
				break;
		}

		return object;
	}

	@Override
	public boolean exists(String name) {

		for (QResourceReader<T> resourceReader : resourceSet) {
			if(resourceReader.exists(name))
				return true;
		}

		return false;
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {

		Queue<QResourceReader<T>> readers = new LinkedList<QResourceReader<T>>();
		for (QResourceReader<T> resourceReader : resourceSet)
			readers.add(resourceReader);

		return new JDTResourceReaderIteratorImpl<T>(readers, nameFilter);
	}

}