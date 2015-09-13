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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.resource.Resource;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.il.memo.impl.ResourceSetReaderImpl;

public class E4ResourceSetReaderImpl<T extends QObjectNameable> extends ResourceSetReaderImpl<T> {

	private List<E4ResourceReaderImpl<T>> resourceSet;
	private QResourceEvent<T> resourceEvent;

	public E4ResourceSetReaderImpl(QContextProvider contextProvider, Map<String, Resource> resources, Class<T> klass) {

		setContextProvider(contextProvider);

		this.resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);

		resourceSet = new ArrayList<E4ResourceReaderImpl<T>>();
		for (String container : resources.keySet()) {
			Resource resource = resources.get(container);
			E4ResourceReaderImpl<T> resourceReader = new E4ResourceReaderImpl<T>(contextProvider, container, klass, resource);
			resourceSet.add(resourceReader);
		}
	}

	@Override
	public T lookup(String resource, String name) {

		T object = null;
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (resource != null && !resourceReader.getName().equals(resource))
				continue;

			object = resourceReader.lookup(name);
			if (object != null)
				break;
		}

		// notify
		if (object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}

	@Override
	public boolean exists(String resource, String name) {

		boolean exists = false;

		for (QResourceReader<T> resourceReader : resourceSet) {
			if (resource != null && !resourceReader.getName().equals(resource))
				continue;

			exists = resourceReader.exists(name);
			if (exists)
				break;
		}

		return exists;
	}

	@Override
	public QObjectIterator<T> find(String resource, String nameFilter) {

		Stack<QResourceReader<T>> readers = new Stack<QResourceReader<T>>();
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (resource != null && !resourceReader.getName().equals(resource))
				continue;
			readers.add(resourceReader);
		}

		return new E4ObjectIteratorSetImpl<T>(readers, nameFilter, resourceEvent);
	}

}