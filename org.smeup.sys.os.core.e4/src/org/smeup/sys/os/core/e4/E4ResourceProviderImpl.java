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
package org.smeup.sys.os.core.e4;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.lib.QLibrary;

public class E4ResourceProviderImpl implements QResourceProvider {

	private String basePath;

	private Map<String, Resource> resources;

	private ResourceSet resourceSet;

	@Inject
	public E4ResourceProviderImpl(QSystemManager systemManager) {

		this.resourceSet = new ResourceSetImpl();
		this.basePath = systemManager.getSystem().getInstallPath() + "/asup-resources/";

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		resources = new HashMap<>();
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String repository) {

		Resource resource = getResource(repository, klass);
		QResourceReader<T> resourceReader = new E4ResourceReaderImpl<T>(contextProvider, repository, klass, resource);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable, E extends Enum<E>> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, E path) {

		Map<String, Resource> resources = new HashMap<>();

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		Scope scope = Scope.get(path.toString());
		// set scope libraries
		switch (scope) {
		case ALL:
			QResourceReader<QLibrary> libraryReader = getResourceReader(contextProvider, QLibrary.class, contextDescription.getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				QObjectNameable library = libraryIterator.next();
				Resource resource = getResource(library.getName(), klass);
				resources.put(library.getName(), resource);
			}
			break;
		
		case LIBRARY_LIST:
			String curLib = contextDescription.getCurrentLibrary();
			resources.put(curLib, getResource(curLib, klass));
			for (String libraryName : contextDescription.getLibraryPath()) {
				if (!libraryName.equals(curLib)) {
					resources.put(libraryName, getResource(libraryName, klass));
				}
			}

			break;
		
		case CURRENT_LIBRARY:
			resources.put(contextDescription.getCurrentLibrary(), getResource(contextDescription.getCurrentLibrary(), klass));
			break;
			
		default:
			throw new OperatingSystemRuntimeException("Unsupported scope " + path);
		}

		QResourceSetReader<T> resourceReader = new E4ResourceSetReaderImpl<T>(contextProvider, resources, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String repository) {	

		Resource resource = getResource(repository, klass);
		QResourceWriter<T> resourceWriter = new E4ResourceWriterImpl<T>(contextProvider, repository, klass, resource);

		return resourceWriter;
	}

	@Override
	public <T extends QObjectNameable, E extends Enum<E>> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, E path) {
		
		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		if (Scope.CURRENT_LIBRARY.getLiteral().equals(path.toString())) {
			return getResourceWriter(contextProvider, klass, contextDescription.getCurrentLibrary());
		}
		throw new OperatingSystemRuntimeException("Unsupported scope " + path);
	}

	private <T extends QObjectNameable> Resource getResource(String repository, Class<T> klass) {

		String resourceKey = repository + "/" + klass.getName();

		Resource resource = resources.get(resourceKey);
		if (resource == null) {
			XMIResourceImpl xmiResource = (XMIResourceImpl) resourceSet.createResource(URI.createURI(basePath + repository + "/" + klass.getSimpleName() + ".xmi"));
			xmiResource.setEncoding("UTF-8");
			resource = xmiResource;
			try {
				resource.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// first load
				try {
					resource.save(Collections.EMPTY_MAP);
				} catch (IOException e1) {
					throw new OperatingSystemRuntimeException(e);
				}
			}
			resources.put(resourceKey, resource);
		}
		return resource;
	}

}