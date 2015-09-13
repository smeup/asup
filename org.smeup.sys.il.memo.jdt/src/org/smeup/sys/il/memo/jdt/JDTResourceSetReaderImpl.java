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
import java.util.List;
import java.util.Stack;

import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.il.memo.impl.ResourceSetReaderImpl;

public class JDTResourceSetReaderImpl<T extends QObjectNameable> extends ResourceSetReaderImpl<T> {

	private List<JDTResourceReaderImpl<T>> resourceSet;
	private QResourceEvent<T> resourceEvent;

	public JDTResourceSetReaderImpl(QContextProvider contextProvider, QSourceManager sourceManager, List<String> resources, Class<T> klass) {

		setContextProvider(contextProvider);

		this.resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);

		resourceSet = new ArrayList<JDTResourceReaderImpl<T>>();
		for (String resource: resources) {
			JDTResourceReaderImpl<T> resourceReader = new JDTResourceReaderImpl<T>(contextProvider, sourceManager, resource, klass);
			resourceSet.add(resourceReader);
		}
	}

	@Override
	public T lookup(String resource, String name) {

		T object = null;
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (resource != null && !resource.isEmpty() && !resourceReader.getName().equals(resource))
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

		return new JDTResourceReaderIteratorImpl<T>(readers, nameFilter, resourceEvent);
	}

}