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
package org.smeup.sys.il.memo.cdo;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResourceHelper;
import org.smeup.sys.il.memo.QResourceWriter;

public class CDOResourceWriterImpl<T extends QObjectNameable> extends CDOResourceReaderImpl<T> implements QResourceWriter<T> {

	private static final long serialVersionUID = 1L;

	public static final String CDO_OMAC = "os/omac";

	private CDOResource resource;
	private CDOTransaction transaction;

	public CDOResourceWriterImpl(QContextProvider contextProvider, CDONet4jSession session, Class<T> klass, String resource) {
		super(contextProvider, session, klass, resource);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void rename(T object, String newName) {
		try {

			QResourceHelper.firePreRenameEvent(this, object, newName);

			String oldName = object.getName();

			T newObject = (T) EcoreUtil.copy((EObject) object);
			EObject eObject = (EObject) newObject;

			// new name
			eObject.eSet(eObject.eClass().getEStructuralFeature("name"), newName);

			doSave(newObject, true);
			doDelete(object);

			QResourceHelper.firePostRenameEvent(this, newObject, oldName);
		} catch (Exception e) {
			throw new IntegratedLanguageMemoryRuntimeException(e);
		}
	}

	@Override
	public void delete(T object) {

		QResourceHelper.firePreDeleteEvent(this, object);

		doDelete(object);
		
		QResourceHelper.firePostDeleteEvent(this, object);
	}

	@Override
	public void save(T object) {
		save(object, false);
	}

	@Override
	public void save(T object, boolean replace) {

		QResourceHelper.firePreSaveEvent(this, object);
		
		doSave(object, replace);
		
		QResourceHelper.firePostSaveEvent(this, object);
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
			resource = transaction.getOrCreateResource(CDO_OMAC + "/" + getResourceName() + "/" + getResourceClass().getName());
		return resource;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T copy(T object, String name) {

		EObject eObject = EcoreUtil.copy((EObject) object);

		// new name
		eObject.eSet(eObject.eClass().getEStructuralFeature("name"), name);

		save((T) eObject);

		return (T) eObject;
	}

	private void doDelete(T object) {
		CDOTransaction transaction = getTransaction();
		CDOResource resource = getResource(transaction);

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);
		if (cdoObject.cdoID() == null)
			throw new IntegratedLanguageMemoryRuntimeException("Object " + object.getName() + " not found");

		resource.getContents().remove(object);
		try {
			transaction.commit();
		} catch (CommitException e) {
			throw new IntegratedLanguageMemoryRuntimeException(e);
		} catch (RuntimeException e) {
			transaction.rollback();
		}
	}

	private void doSave(T object, boolean replace) {

		CDOTransaction transaction = getTransaction();
		CDOResource resource = getResource(transaction);

		CDOObject cdoObject = CDOUtil.getCDOObject((EObject) object);

		// insert object
		boolean insert = cdoObject.cdoID() == null;
		if (insert) {
			// lock resource
			try {
				if (!resource.cdoWriteLock().tryLock(1000 * 60))
					throw new IntegratedLanguageMemoryRuntimeException("Unable to lock resource: " + resource);
			} catch (InterruptedException e) {
				throw new IntegratedLanguageMemoryRuntimeException("Unable to lock resource: " + resource);
			}

			T oldObject = lookup(object.getName());
			if (oldObject != null)
				if (replace)
					resource.getContents().remove(oldObject);
				else {
					resource.cdoWriteLock().unlock();
					throw new IntegratedLanguageMemoryRuntimeException("Object already exists: " + object);
				}
		}

		// update object
		resource.getContents().add((EObject) object);

		// commit and notify event
		try {
			transaction.commit();

		} catch (Exception e) {
			// unlock resource
			if (insert)
				resource.cdoWriteLock().unlock();

			throw new IntegratedLanguageMemoryRuntimeException(e);
		}
	}
}