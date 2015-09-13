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
package org.smeup.sys.os.core.cdo.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.cdo.util.CDOSessionUtil;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.QLibrary;

public class CDOResourceProviderImpl implements QResourceProvider {

	private final Map<QJob, CDONet4jSession> sessions;

	@Inject
	private QResourceManager resourceManager;

	public CDOResourceProviderImpl() {
		this.sessions = new HashMap<QJob, CDONet4jSession>();
	}

	@PostConstruct
	public void init() {
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String name) {

		QJob job = contextProvider.getContext().get(QJob.class);
		
		// session
		CDONet4jSession session = getSession(job);

		// resource
		QResourceReader<T> resource = new CDOResourceReaderImpl<T>(job, klass, session);

		prepareResource(job, resource, name, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		QJob job = contextProvider.getContext().get(QJob.class);

		// session
		CDONet4jSession session = getSession(job);

		// resource
		QResourceSetReader<T> resource = new CDOResourceSetReaderImpl<T>(job, klass, session);

		prepareResource(job, resource, scope, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String name) {

		QJob job = contextProvider.getContext().get(QJob.class);

		// session
		CDONet4jSession session = getSession(job);

		// resource
		QResourceWriter<T> resource = new CDOResourceWriterImpl<T>(job, klass, session);

		prepareResource(job, resource, name, klass);

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
			QResourceReader<QLibrary> libraryReader = getResourceReader(contextProvider, QLibrary.class, contextDescription.getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				QLibrary library = libraryIterator.next();
				resource.getResources().add(library.getName());
			}
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
			throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
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

	private CDONet4jSession getSession(QJob job) {

		CDONet4jSession session = sessions.get(job);
		if (session == null) {
			session = CDOSessionUtil.openSession("asup-db1:2036", job.getSystem().getName());
			session.options().getNet4jProtocol().setTimeout(60000);
			sessions.put(job, session);
		}
		return session;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		
		if (scope.equals(Scope.CURRENT_LIBRARY)) {
			return getResourceWriter(contextProvider, klass, contextDescription.getCurrentLibrary());
		}
		throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
	}


}