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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.dk.source.jdt.JDTSourceManagerImpl;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.jdt.JDTResourceReaderImpl;
import org.smeup.sys.il.memo.jdt.JDTResourceSetReaderImpl;
import org.smeup.sys.il.memo.jdt.JDTResourceWriterImpl;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.lib.QLibrary;

public class JDTResourceProviderImpl implements QResourceProvider {

	@Inject
	private QResourceManager resourceManager;

	private JDTSourceManagerImpl sourceManager;

	public JDTResourceProviderImpl() {
		super();
		this.sourceManager = new JDTSourceManagerImpl("asup-obj");

	}

	@PostConstruct
	public void init() {
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceReader<T> resourceReader = new JDTResourceReaderImpl<T>(contextProvider, sourceManager, resource, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {
		
		List<String> containers = resources(contextProvider, scope);

		QResourceSetReader<T> resourceReader = new JDTResourceSetReaderImpl<T>(contextProvider, sourceManager, containers, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceWriter<T> resourceWriter = new JDTResourceWriterImpl<T>(contextProvider, sourceManager, resource, klass);

		return resourceWriter;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();

		if (scope.equals(Scope.CURRENT_LIBRARY)) {
			return getResourceWriter(contextProvider, klass, contextDescription.getCurrentLibrary());
		}
		throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
	}


	private List<String> resources(QContextProvider contextProvider, Scope scope) {
		
		List<String> resources = new ArrayList<>();

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		// set scope libraries
		switch (scope) {
		case ALL:
			QResourceReader<QLibrary> libraryReader = getResourceReader(contextProvider, QLibrary.class, contextDescription.getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				resources.add(libraryIterator.next().getName());
			}
			break;
			
		case LIBRARY_LIST:
			String curLib = contextDescription.getCurrentLibrary();
			resources.add(curLib);
			for (String libraryName : contextDescription.getLibraryPath()) {
				if (!libraryName.equals(curLib)) {
					resources.add(libraryName);
				}
			}
			break;

		case CURRENT_LIBRARY:
			resources.add(contextDescription.getCurrentLibrary());
			break;
			
		default:
			throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
		}
		return resources;
	}
}