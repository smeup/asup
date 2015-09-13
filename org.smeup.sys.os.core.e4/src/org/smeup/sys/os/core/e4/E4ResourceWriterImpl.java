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

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class E4ResourceWriterImpl<T extends QObjectNameable> extends E4ResourceReaderImpl<T> implements QResourceWriter<T> {

	private QResourceEvent<T> resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();

	public E4ResourceWriterImpl(QContextProvider contextProvider, String name, Class<T> klass, Resource resource) {
		super(contextProvider, name, klass, resource);
		resourceEvent.setResource(this);
	}

	@Override
	public synchronized void delete(T object) {
		if (!exists(object.getName()))
			throw new OperatingSystemRuntimeException("Object " + object.getName() + " not found");

		try {

			Resource resource = getResource();
			resource.getContents().remove(object);

			fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
			resource.save(Collections.EMPTY_MAP);
			fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public synchronized void save(T object) {
		save(object, false);
	}

	@Override
	public synchronized void save(T object, boolean replace) {

		try {
			Resource resource = getResource();

			T oldObject = lookup(object.getName());
			if (oldObject != null)
				if (replace)
					resource.getContents().remove(oldObject);
				else
					throw new OperatingSystemRuntimeException("Object already exists: " + object);
			resource.getContents().add((EObject) object);
			
			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			resource.save(Collections.EMPTY_MAP);
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}
