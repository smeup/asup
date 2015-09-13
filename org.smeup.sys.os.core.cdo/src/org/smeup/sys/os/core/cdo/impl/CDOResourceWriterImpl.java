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
package org.smeup.sys.os.core.cdo.impl;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.lib.QLibrary;

public class CDOResourceWriterImpl<T extends QObjectNameable> extends CDOResourceReaderImpl<T> implements QResourceWriter<T> {

	public static final String CDO_OMAC = "os/omac";

	private CDOResource resource;
	private CDOTransaction transaction;
	private QResourceEvent<T> resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
	private Class<T> klass;

	protected CDOResourceWriterImpl(QContextProvider contextProvider, Class<T> klass, CDONet4jSession session) {
		super(contextProvider, klass, session);
		this.klass = klass;
		resourceEvent.setResource(this);
	}

	@Override
	public void delete(T object) {

		CDOTransaction transaction = getTransaction();
		CDOResource resource = getResource(transaction);

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);
		if (cdoObject.cdoID() == null)
			throw new OperatingSystemRuntimeException("Object " + object.getName() + " not found");

		resource.getContents().remove(object);
		try {
			fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, object);

			if (klass.isAssignableFrom(QLibrary.class)) {
				QLibrary qLibrary = (QLibrary) object;
				CDOResource libraryResource = transaction.getOrCreateResource(CDO_OMAC + "/" + qLibrary.getName());
				if (libraryResource != null)
					try {
						libraryResource.delete(Collections.EMPTY_MAP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

			transaction.commit();
			fireEvent(resourceEvent, ResourceEventType.POST_DELETE, object);
		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		} catch (RuntimeException e) {
			transaction.rollback();
		}
	}

	@Override
	public void save(T object) {
		save(object, false);
	}

	@Override
	public void save(T object, boolean replace) {

		CDOTransaction transaction = getTransaction();
		CDOResource resource = getResource(transaction);

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);

		// insert object
		boolean insert = cdoObject.cdoID() == null;
		if (insert) {
			// lock resource
			try {
				if (!resource.cdoWriteLock().tryLock(1000 * 60))
					throw new OperatingSystemRuntimeException("Unable to lock resource: " + resource);
			} catch (InterruptedException e) {
				throw new OperatingSystemRuntimeException("Unable to lock resource: " + resource);
			}

			T oldObject = lookup(object.getName());
			if (oldObject != null)
				if (replace)
					resource.getContents().remove(oldObject);
				else {
					resource.cdoWriteLock().unlock();
					throw new OperatingSystemRuntimeException("Object already exists: " + object);
				}
		}

		// update object
		resource.getContents().add((EObject) object);

		// commit and notify event
		try {
			fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, object);
			transaction.commit();
			fireEvent(resourceEvent, ResourceEventType.POST_SAVE, object);
		} catch (Exception e) {
			// unlock resource
			if (insert)
				resource.cdoWriteLock().unlock();

			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	protected CDOView getView(QContext context) {
		return getTransaction();
	}

	protected CDOTransaction getTransaction() {
		if (transaction == null)
			transaction = getSession().openTransaction();
		return transaction;
	}

	private CDOResource getResource(CDOTransaction transaction) {
		if (resource == null)
			resource = transaction.getOrCreateResource(CDO_OMAC + "/" + getName() + "/" + klass.getName());
		return resource;
	}
}