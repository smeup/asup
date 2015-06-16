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
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesFactory;
import org.smeup.sys.os.core.resources.QResource;
import org.smeup.sys.os.core.resources.QResourceListener;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceNotifier;
import org.smeup.sys.os.core.resources.QResourceProvider;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceSetReader;
import org.smeup.sys.os.core.resources.QResourceWriter;

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
			notifier = QOperatingSystemResourcesFactory.eINSTANCE.createResourceNotifier();
			notifiers.put(klass, notifier);
		}
		notifier.registerListener(listener);
	}

	@Override
	public <T extends QObjectNameable> void registerProvider(Class<T> klass, QResourceProvider provider) {
		providers.put(klass, provider);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceReader<T> resourceReader = resourceProvider.getResourceReader(job, klass, container);
		prepareListener(resourceReader, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceSetReader<T> resourceSetReader = resourceProvider.getResourceReader(job, klass, scope);
		prepareListener(resourceSetReader, klass);

		return resourceSetReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {

		QResourceProvider resourceProvider = getResourceProvider(klass);
		QResourceWriter<T> resourceWriter = resourceProvider.getResourceWriter(job, klass, container);
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
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope) {
		// TODO Auto-generated method stub
		return null;
	}
}
