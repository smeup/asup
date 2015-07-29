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

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.cdo.util.CDOSessionUtil;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceProvider;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceSetReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
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
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String library) {
		assert job != null;

		// session
		CDONet4jSession session = getSession(job);

		// resource
		QResourceReader<T> resource = new CDOResourceReaderImpl<T>(job, klass, session);

		prepareResource(job, resource, library, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {
		assert job != null;

		// session
		CDONet4jSession session = getSession(job);

		// resource
		QResourceSetReader<T> resource = new CDOResourceSetReaderImpl<T>(job, klass, session);

		prepareResource(job, resource, scope, klass);

		return resource;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String library) {
		assert job != null;

		// session
		CDONet4jSession session = getSession(job);

		// resource
		QResourceWriter<T> resource = new CDOResourceWriterImpl<T>(job, klass, session);

		prepareResource(job, resource, library, klass);

		return resource;
	}

	private <T extends QObjectNameable> void prepareResource(QJob job, QResourceReader<T> resource, String library, Class<T> klass) {

		resource.setJob(job);

		// set scope library
		resource.setContainer(library);
	}

	private <T extends QObjectNameable> void prepareResource(QJob job, QResourceSetReader<T> resource, Scope scope, Class<T> klass) {

		resource.setJob(job);

		// set scope libraries
		switch (scope) {
		case ALL:
			QResourceReader<QLibrary> libraryReader = getResourceReader(job, QLibrary.class, job.getSystem().getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				QLibrary library = libraryIterator.next();
				resource.getContainers().add(library.getName());
			}
			break;
		case LIBRARY_LIST:
			resource.getContainers().add(job.getCurrentLibrary());
			resource.getContainers().addAll(job.getLibraries());
			break;
			
		case CURRENT_LIBRARY:
			resource.getContainers().add(job.getCurrentLibrary());
			break;
			
		default:
			throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
		}

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
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope) {
		if (Scope.CURRENT_LIBRARY.equals(scope)) {
			return getResourceWriter(job, klass, job.getCurrentLibrary());
		}
		throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
	}
}