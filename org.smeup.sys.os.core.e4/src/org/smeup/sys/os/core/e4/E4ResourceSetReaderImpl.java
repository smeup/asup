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
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesFactory;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.ResourceEventType;
import org.smeup.sys.os.core.resources.impl.ResourceSetReaderImpl;

public class E4ResourceSetReaderImpl<T extends QObjectNameable> extends ResourceSetReaderImpl<T> {

	private List<E4ResourceReaderImpl<T>> resourceSet;
	private QResourceEvent<T> resourceEvent;

	public E4ResourceSetReaderImpl(QJob job, Map<String, Resource> resources, Class<T> klass) {

		setJob(job);

		this.resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);

		resourceSet = new ArrayList<E4ResourceReaderImpl<T>>();
		for (String container : resources.keySet()) {
			Resource resource = resources.get(container);
			E4ResourceReaderImpl<T> resourceReader = new E4ResourceReaderImpl<T>(job, container, klass, resource);
			resourceSet.add(resourceReader);
		}
	}

	@Override
	public T lookup(String library, String name) {

		T object = null;
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (library != null && !resourceReader.getContainer().equals(library))
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
	public boolean exists(String library, String name) {

		boolean exists = false;

		for (QResourceReader<T> resourceReader : resourceSet) {
			if (library != null && !resourceReader.getContainer().equals(library))
				continue;

			exists = resourceReader.exists(name);
			if (exists)
				break;
		}

		return exists;
	}

	@Override
	public QObjectIterator<T> find(String library, String nameFilter) {

		Stack<QResourceReader<T>> readers = new Stack<QResourceReader<T>>();
		for (QResourceReader<T> resourceReader : resourceSet) {
			if (library != null && !resourceReader.getContainer().equals(library))
				continue;
			readers.add(resourceReader);
		}

		return new E4ObjectIteratorSetImpl<T>(readers, nameFilter, resourceEvent);
	}

}