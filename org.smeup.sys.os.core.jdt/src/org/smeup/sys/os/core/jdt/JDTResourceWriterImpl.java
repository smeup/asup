/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *   Giuliano Giancristoforo	- Implementation
 *
 */
package org.smeup.sys.os.core.jdt;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.core.resources.ResourceEventType;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

public class JDTResourceWriterImpl<T extends QObjectNameable> extends JDTResourceReaderImpl<T> implements QResourceWriter<T> {

	public JDTResourceWriterImpl(QJob job, QSourceManager sourceManager, String container, Class<T> klass) {
		super(job, sourceManager, container, klass);
	}

	@Override
	public synchronized void delete(T object) {

		QSourceEntry entry = sourceManager.getObjectEntry(getJob().getContext(), getContainer(), klass, object.getName());
		if (entry == null)
			throw new OperatingSystemRuntimeException("Object " + object.getName() + " not found");

		try {
			fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);
			sourceManager.removeEntry(getJob().getContext(), entry);
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
			if (object instanceof TypedObjectImpl) {
				TypedObjectImpl typedObject = (TypedObjectImpl) object;
				
				// library
				typedObject.eSet(QOperatingSystemTypePackage.eINSTANCE.getTypedObject_Library(), getContainer());
				
				// creation info
				if (typedObject.getCreationInfo() == null)
					typedObject.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));

			}

			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			
			ByteArrayOutputStream outpuStream = new ByteArrayOutputStream();
			emfConverter.writeToStream((EObject) object, outpuStream);

			sourceManager.createObjectEntry(getJob().getContext(), getContainer(), klass, object.getName(), replace, new ByteArrayInputStream(outpuStream.toByteArray()));
			
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}
