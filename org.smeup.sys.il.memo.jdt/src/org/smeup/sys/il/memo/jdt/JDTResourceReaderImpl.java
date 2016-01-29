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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class JDTResourceReaderImpl<T extends QObjectNameable> extends ResourceReaderImpl<T> {

	private static final long serialVersionUID = 1L;
	
	protected QSourceManager sourceManager;
	protected Class<T> klass;

	private QProject project;
	
	public JDTResourceReaderImpl(QContextProvider contextProvider, QSourceManager sourceManager, Class<T> klass, QProject project) {
		setContextProvider(contextProvider);

		this.project = project;
		if(project == null)
			"".toCharArray();
		this.sourceManager = sourceManager;
		this.klass = klass;
	}
	
	protected QProject getProject() {
		return project;
	}
	
	@Override
	public boolean exists(String name) {
		return sourceManager.getObjectEntry(getContextProvider().getContext(), getProject(), klass, name) != null;
	}

	@Override
	public QObjectIterator<T> find(String nameFilter) {

		List<QSourceEntry> entries = sourceManager.listObjectEntries(getContextProvider().getContext(), getProject(), klass, nameFilter);
		if (entries == null)
			entries = new ArrayList<>();

		return new JDTObjectIteratorImpl<T>(klass, new JDTSourceIterator(klass, entries.iterator()));
	}

	@Override
	public T lookup(String name) {

		QSourceEntry entry = sourceManager.getObjectEntry(getContextProvider().getContext(), getProject(), klass, name);
		if (entry == null)
			return null;

		T object = null;
		try {
			object = entry.load(klass);
//			InputStream inputStream = entry.getInputStream();
//			object = (T) emfConverter.convertToEObject(inputStream);
//			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return object;
	}
}