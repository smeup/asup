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
package org.smeup.sys.os.core.base;

import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceNotifier;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
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
			if(QTypedObject.class.isAssignableFrom(klass)) {
				QResourceNotifier<T> typedNotifier = (QResourceNotifier<T>) notifiers.get(QTypedObject.class);
				if(typedNotifier != null) {
					for(QResourceListener<T> resourceListener: typedNotifier.getListeners()) 
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
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String name) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceReader<T> resourceReader = resourceProvider.getResourceReader(contextProvider, klass, name);
		prepareListener(resourceReader, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceSetReader<T> resourceSetReader = resourceProvider.getResourceReader(contextProvider, klass, scope);
		prepareListener(resourceSetReader, klass);

		return resourceSetReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String name) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceWriter<T> resourceWriter = resourceProvider.getResourceWriter(contextProvider, klass, name);
		prepareListener(resourceWriter, klass);

		return resourceWriter;
	}

	private <T extends QObjectNameable> QResourceProvider getResourceProvider(Class<T> klass) {

		QResourceProvider resourceProvider = providers.get(klass);
		if (resourceProvider == null)
//			resourceProvider = providers.get(QTypedObject.class);
			resourceProvider = providers.get(QObjectNameable.class);

		return resourceProvider;
	}

	@SuppressWarnings("unchecked")
	private <T extends QObjectNameable> void prepareListener(QResource<T> resource, Class<T> klass) {

		QResourceNotifier<T> notifier = (QResourceNotifier<T>) notifiers.get(klass);
		if (notifier == null)
			return;

		// TODO copy
		resource.setNotifier(notifier);

	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {
		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceWriter<T> resourceWriter = resourceProvider.getResourceWriter(contextProvider, klass, scope);
		prepareListener(resourceWriter, klass);

		return resourceWriter;
	}
}
