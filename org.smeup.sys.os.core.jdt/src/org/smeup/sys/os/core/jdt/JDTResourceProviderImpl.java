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
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceProvider;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceSetReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
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
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container) {

		QResourceReader<T> resourceReader = new JDTResourceReaderImpl<T>(job, sourceManager, container, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope) {

		List<String> containers = new ArrayList<>();

		// set scope libraries
		switch (scope) {
		case ALL:
			QResourceReader<QLibrary> libraryReader = getResourceReader(job, QLibrary.class, job.getSystem().getSystemLibrary());

			QObjectIterator<QLibrary> libraryIterator = libraryReader.find(null);
			while (libraryIterator.hasNext()) {
				containers.add(libraryIterator.next().getName());
			}
			break;
		case LIBRARY_LIST:

			for (String libraryName : job.getLibraries())
				containers.add(libraryName);

			break;
		default:
			throw new OperatingSystemRuntimeException("Unsupported scope " + scope);
		}

		QResourceSetReader<T> resourceReader = new JDTResourceSetReaderImpl<T>(job, sourceManager, containers, klass);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container) {

		QResourceWriter<T> resourceWriter = new JDTResourceWriterImpl<T>(job, sourceManager, container, klass);

		return resourceWriter;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope) {
		// TODO Auto-generated method stub
		return null;
	}

}