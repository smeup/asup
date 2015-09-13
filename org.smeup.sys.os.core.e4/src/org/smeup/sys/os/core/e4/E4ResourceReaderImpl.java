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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

public class E4ResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	private QResourceEvent<T> resourceEvent;
	private Class<T> klass;
	private Resource resource;

	public E4ResourceReaderImpl(QContextProvider contextProvider, String name, Class<T> klass, Resource resource) {
		setContextProvider(contextProvider);
		setName(name);
		this.klass = klass;
		this.resource = resource;
		this.resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);
	}

	protected Resource getResource() {
		return this.resource;
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {
		return new E4ObjectIteratorImpl<T>(klass, resource.getContents().iterator(), nameFilter, resourceEvent);
	}

	@Override
	public T lookup(String name) {

		T object = null;

		for (EObject eObject : resource.getContents())
			if (klass.isInstance(eObject)) {
				T tempObject = klass.cast(eObject);
				if (tempObject.getName().equals(name)) {
					object = tempObject;
					break;
				}
			}

		if (object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}
}