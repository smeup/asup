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

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.jdt.JDTSourceManagerImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;

public class JDTResourceProviderImpl implements QResourceProvider {

	private JDTSourceManagerImpl sourceManager;

	@Inject
	public JDTResourceProviderImpl(QResourceManager resourceManager) {
		this.sourceManager = new JDTSourceManagerImpl("asup-obj");
		
		resourceManager.registerProvider(QObjectNameable.class, this);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope, String name) {

		switch (scope) {
		case ALL:
		case CURRENT_LIBRARY:
		case LIBRARY_LIST:
		case USER_LIBRARY_LIST:
		case ALL_USER:
			return getResourceReader(contextProvider, klass, scope);
		case OTHER:
			return getResourceReader(contextProvider, klass, name);
		}
		
		throw new IntegratedLanguageMemoryRuntimeException("Invalid scope: "+scope); 
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
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope, String name) {
		
		switch (scope) {
		case ALL:
		case ALL_USER:
		case CURRENT_LIBRARY:
		case LIBRARY_LIST:
		case USER_LIBRARY_LIST:
			return getResourceWriter(contextProvider, klass, scope);
		case OTHER:
			return getResourceWriter(contextProvider, klass, name);
		}
				
		throw new IntegratedLanguageMemoryRuntimeException("Invalid scope: "+scope); 
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
			
			for(QProject project: sourceManager.listProjects(contextProvider.getContext())) 
				resources.add(project.getName());

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