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
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesFactory;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.core.resources.ResourceEventType;
import org.smeup.sys.os.type.QTypedObject;

public class E4ResourceWriterImpl<T extends QObjectNameable> extends E4ResourceReaderImpl<T> implements QResourceWriter<T> {

	private QResourceEvent<T> resourceEvent = QOperatingSystemResourcesFactory.eINSTANCE.createResourceEvent();

	public E4ResourceWriterImpl(QJob job, String container, Class<T> klass, Resource resource) {
		super(job, container, klass, resource);
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

			if (object instanceof QTypedObject) {
				QTypedObject typedObject = (QTypedObject) object;

				// library
				typedObject.setLibrary(getContainer());

				// creation info
				if (typedObject.getCreationInfo() == null)
					typedObject.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));

			}

			resource.getContents().add((EObject) object);
			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			resource.save(Collections.EMPTY_MAP);
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}
