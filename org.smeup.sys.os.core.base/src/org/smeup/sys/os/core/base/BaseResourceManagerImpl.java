/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.core.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceNotifier;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.lib.LibraryType;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.type.QTypedObject;

public class BaseResourceManagerImpl implements QResourceManager {

	private final Map<Class<? extends QObjectNameable>, QResourceNotifier<? extends QObject>> notifiers;
	private final Map<Class<? extends QObjectNameable>, QResourceProvider> providers;

	public BaseResourceManagerImpl() {
		super();

		notifiers = new HashMap<Class<? extends QObjectNameable>, QResourceNotifier<? extends QObject>>();
		providers = new HashMap<Class<? extends QObjectNameable>, QResourceProvider>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> void registerListener(Class<T> klass, QResourceListener<T> listener) {
		QResourceNotifier<T> notifier = (QResourceNotifier<T>) notifiers.get(klass);
		if (notifier == null) {
			notifier = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceNotifier();
			notifiers.put(klass, notifier);

			// TODO retrieve listener hierarchy
			if (QTypedObject.class.isAssignableFrom(klass)) {
				QResourceNotifier<T> typedNotifier = (QResourceNotifier<T>) notifiers.get(QTypedObject.class);
				if (typedNotifier != null) {
					for (QResourceListener<T> resourceListener : typedNotifier.getListeners())
						notifier.registerListener(resourceListener);
				}
			}
		}

		notifier.registerListener(listener);
	}

	@Override
	public <T extends QObjectNameable> void registerProvider(Class<T> klass, QResourceProvider provider) {
		providers.put(klass, provider);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope, String resource) {

		switch (scope) {
		case ALL:
		case CURRENT_LIBRARY:
		case LIBRARY_LIST:
		case USER_LIBRARY_LIST:
		case SYSTEM_LIBRARY:
		case ALL_USER:
			return getResourceReader(contextProvider, klass, scope);
		case OTHER:
			return getResourceReader(contextProvider, klass, resource);
		}
		
		throw new IntegratedLanguageMemoryRuntimeException("Invalid scope: "+scope); 
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope, String resource) {
		
		switch (scope) {
		case ALL:
		case ALL_USER:
		case CURRENT_LIBRARY:
		case LIBRARY_LIST:
		case USER_LIBRARY_LIST:
		case SYSTEM_LIBRARY:
			return getResourceWriter(contextProvider, klass, scope);
		case OTHER:
			return getResourceWriter(contextProvider, klass, resource);
		}
				
		throw new IntegratedLanguageMemoryRuntimeException("Invalid scope: "+scope); 
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		resource = contextProvider.getContext().resolveAlias(resource); 
		
		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceReader<T> resourceReader = resourceProvider.getResourceReader(contextProvider, klass, resource);
		if(resourceReader != null)
			prepareListener(resourceReader, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {
		return getResourceReader(contextProvider, klass, resources(contextProvider, scope));
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {

		resources = contextProvider.getContext().resolveAliases(resources);
		
		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceReader<T> resourceReader = resourceProvider.getResourceReader(contextProvider, klass, resources);
		if(resourceReader != null)
			prepareListener(resourceReader, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {
		
		String resource = null;
		switch (scope) {
		case CURRENT_LIBRARY:
			resource = contextProvider.getContext().getContextDescription().getCurrentLibrary();
			break;
		case SYSTEM_LIBRARY:
			resource = contextProvider.getContext().getContextDescription().getSystemLibrary();
			break;
		case ALL:
		case ALL_USER:
		case LIBRARY_LIST:
		case OTHER:
		case USER_LIBRARY_LIST:
			throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
		}
		
		return getResourceWriter(contextProvider, klass, resource);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {

		resource = contextProvider.getContext().resolveAlias(resource);
		
		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceWriter<T> resourceWriter = resourceProvider.getResourceWriter(contextProvider, klass, resource);
		if(resourceWriter != null)
			prepareListener(resourceWriter, klass);

		return resourceWriter;
	}

	private <T extends QObjectNameable> QResourceProvider getResourceProvider(Class<T> klass) {

		QResourceProvider resourceProvider = providers.get(klass);
		if (resourceProvider == null)
			// resourceProvider = providers.get(QTypedObject.class);
			resourceProvider = providers.get(QObjectNameable.class);

		return resourceProvider;
	}

	@SuppressWarnings("unchecked")
	private <T extends QObjectNameable> void prepareListener(QResourceReader<T> resource, Class<T> klass) {

		QResourceNotifier<T> notifier = (QResourceNotifier<T>) notifiers.get(klass);
		if (notifier == null) {
			// TODO retrieve listener hierarchy
			if (QTypedObject.class.isAssignableFrom(klass)) {
				QResourceNotifier<T> typedNotifier = (QResourceNotifier<T>) notifiers.get(QTypedObject.class);
				if (typedNotifier != null)
					resource.setNotifier(typedNotifier);
			}
		} else
			resource.setNotifier(notifier);
	}

	private List<String> resources(QContextProvider contextProvider, Scope scope) {
		
		List<String> resources = new ArrayList<>();

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		// set scope libraries
		switch (scope) {
		case ALL: {
			QObjectIterator<QLibrary> libraryIterator = getResourceReader(contextProvider, QLibrary.class, contextDescription.getSystemLibrary()).find(null);
			while(libraryIterator.hasNext()) {
				QLibrary library = libraryIterator.next();
				if(library.getLibraryType() == LibraryType.TEMPORARY)
					continue;
				resources.add(library.getName());
			}
			break;
		}
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
		case SYSTEM_LIBRARY:
			resources.add(contextDescription.getSystemLibrary());
			break;
		case ALL_USER:
		case OTHER:
		case USER_LIBRARY_LIST:
			throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
		}
		return resources;
	}
}