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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.co.core.QServerSocketConfig;
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
import org.smeup.sys.rt.core.QApplication;

public class CDOResourceProviderImpl implements QResourceProvider {

	@Inject
	private QApplication application;
	@Inject
	private QResourceManager resourceManager;

	private QServerSocketConfig socketConfig;
	
	@PostConstruct
	public void init(QServerSocketConfig socketConfig) {
		this.socketConfig = socketConfig;
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String name) {

		// session
		CDONet4jSession session = getSession(contextProvider);

		// resource
		QResourceReader<T> resource = new CDOResourceReaderImpl<T>(contextProvider, klass, session);

		prepareResource(contextProvider, resource, name, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		// session
		CDONet4jSession session = getSession(contextProvider);

		// resource
		QResourceSetReader<T> resource = new CDOResourceSetReaderImpl<T>(contextProvider, klass, session);

		prepareResource(contextProvider, resource, scope, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String name) {

		// session
		CDONet4jSession session = getSession(contextProvider);

		// resource
		QResourceWriter<T> resource = new CDOResourceWriterImpl<T>(contextProvider, klass, session);

		prepareResource(contextProvider, resource, name, klass);

		return resource;
	}

	private <T extends QObjectNameable> void prepareResource(QContextProvider contextProvider, QResourceReader<T> resource, String name, Class<T> klass) {

		resource.setContextProvider(contextProvider);

		// set scope library
		resource.setName(name);
	}

	private <T extends QObjectNameable> void prepareResource(QContextProvider contextProvider, QResourceSetReader<T> resource, Scope scope, Class<T> klass) {

		resource.setContextProvider(contextProvider);

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		// set scope libraries
		switch (scope) {
		case ALL:
			
			CDOView view = getSession(contextProvider).openView();
			
			CDOResourceNode rootResource = view.getRootResource(); // this is the root resource
			for (EObject eObject : rootResource.eContents()) {
				if (!(eObject instanceof CDOResourceNode)) {
					continue;
				}
				CDOResourceNode cdoResource = (CDOResourceNode) eObject;
				if (cdoResource.cdoRevision().getPermission().isReadable()) 
					resource.getResources().add(resource.getName());
			}
			
			view.close();
			break;
		case LIBRARY_LIST:
			String curLib = contextDescription.getCurrentLibrary();
			resource.getResources().add(curLib);
			resource.getResources().addAll(filter(contextDescription.getLibraryPath(), curLib));
			break;
			
		case CURRENT_LIBRARY:
			resource.getResources().add(contextDescription.getCurrentLibrary());
			break;
			
		default:
			throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
		}

	}

	private Collection<? extends String> filter(List<String> list, String element) {
		if (list.contains(element)) {
			ArrayList<String> result = new ArrayList<String>(list);
			result.remove(element);
			return result;
		}
		return list;
	}

	private CDONet4jSession getSession(QContextProvider contextProvider) {

		CDONet4jSession session = contextProvider.getContext().get(CDONet4jSession.class);
		if (session == null) {
			session = CDOSessionUtil.openSession(socketConfig.getAddress()+":"+socketConfig.getPort(), application.getName());
			session.options().getNet4jProtocol().setTimeout(60000);
		}
		return session;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		if (scope.equals(Scope.CURRENT_LIBRARY)) {
			return getResourceWriter(contextProvider, klass, contextDescription.getCurrentLibrary());
		}
		throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
	}


}