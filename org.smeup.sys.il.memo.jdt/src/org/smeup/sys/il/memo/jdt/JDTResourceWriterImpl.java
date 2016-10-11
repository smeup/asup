/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
package org.smeup.sys.il.memo.jdt;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceHelper;
import org.smeup.sys.il.memo.QResourceWriter;

public class JDTResourceWriterImpl<T extends QObjectNameable> extends JDTResourceReaderImpl<T> implements QResourceWriter<T> {

	private static final long serialVersionUID = 1L;

	private QResource resource;
	
	public JDTResourceWriterImpl(QContextProvider contextProvider, QSourceManager sourceManager, QResource resource, Class<T> klass, QProject project) {
		super(contextProvider, sourceManager, klass, project);
		this.resource = resource;
	}

	@Override
	public QResource getResource() {
		return resource;
	}

	@Override
	public void delete(T object) {
		try {
			QResourceHelper.firePreDeleteEvent(this, object);

			doDelete(object);
			
			QResourceHelper.firePostDeleteEvent(this, object);
		} catch (IOException e) {
			throw new IntegratedLanguageMemoryRuntimeException(e);
		}
	}

	private void doDelete(T object) throws IOException {
		QSourceEntry entry = sourceManager.getObjectEntry(getContextProvider().getContext(), getProject(), klass, object.getName());
		if (entry == null)
			throw new IntegratedLanguageMemoryRuntimeException("Object " + object.getName() + " not found");

		sourceManager.removeEntry(getContextProvider().getContext(), entry);
	}

	@Override
	public void save(T object) {
		save(object, false);
	}

	@Override
	public void save(T object, boolean replace) {
		try {
			QResourceHelper.firePreSaveEvent(this, object);
			
			doSave(object, replace);
			
			QResourceHelper.firePostSaveEvent(this, object);
		} catch (IOException e) {
			throw new IntegratedLanguageMemoryRuntimeException(e);
		}
	}

	private void doSave(T object, boolean replace) throws IOException {
		sourceManager.createObjectEntry(getContextProvider().getContext(), getProject(), klass, object.getName(), replace, object);
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

	@SuppressWarnings("unchecked")
	@Override
	public T copy(T object, String name) {

		EObject eObject = EcoreUtil.copy((EObject)object);

		// new name
		eObject.eSet(eObject.eClass().getEStructuralFeature("name"), name);
		
		save((T)eObject);
		
		return (T)eObject;
	}
}
