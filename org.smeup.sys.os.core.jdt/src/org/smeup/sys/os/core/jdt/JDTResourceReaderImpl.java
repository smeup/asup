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
package org.smeup.sys.os.core.jdt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class JDTResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	protected QSourceManager sourceManager;
	protected Class<T> klass;
	protected QResourceEvent<T> resourceEvent;
	protected EMFConverter emfConverter;

	public JDTResourceReaderImpl(QContextProvider contextProvider, QSourceManager sourceManager, String name, Class<T> klass) {
		setContextProvider(contextProvider);
		setName(name);
		this.sourceManager = sourceManager;
		this.klass = klass;
		this.resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);
		String uri = "asup://" + contextProvider.getContext().getContextDescription().getName() + "/" + getName() + "/" + klass.getSimpleName().toLowerCase().substring(1);
		this.emfConverter = new EMFConverter(new ResourceSetImpl(), uri);

		// sourceManager.refreshEntry(job, sourceManager.getLibraryEntry(job,
		// container));
	}

	@Override
	public boolean exists(String name) {
		return sourceManager.getObjectEntry(getContextProvider().getContext(), getName(), klass, name) != null;
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {

		List<QSourceEntry> entries = sourceManager.listObjectEntries(getContextProvider().getContext(), getName(), klass, nameFilter);
		if (entries == null)
			entries = new ArrayList<>();

		return new JDTObjectIteratorImpl<T>(klass, new JDTSourceIterator(emfConverter, entries.iterator()), resourceEvent);
	}

	@Override
	public T lookup(String name) {

		QSourceEntry entry = sourceManager.getObjectEntry(getContextProvider().getContext(), getName(), klass, name);
		if (entry == null)
			return null;

		T object = null;
		try {
			InputStream inputStream = entry.getInputStream();
			object = (T) emfConverter.convertToEObject(inputStream);
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (object != null)
			fireEvent(resourceEvent, ResourceEventType.POST_LOAD, object);

		return object;
	}
}