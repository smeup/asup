/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.smeup.sys.il.memo.nio;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.nio.NIOSourceManagerImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResource;
import org.smeup.sys.il.memo.QResourceHelper;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.rt.core.QApplication;

public class NIOResourceProviderImpl implements QResourceProvider {

	private NIOSourceManagerImpl sourceManager;
	
	@Inject
	public NIOResourceProviderImpl(QApplication application, QResourceManager resourceManager) {

		this.sourceManager = new NIOSourceManagerImpl(application, "asup-obj");
		
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		QProject project = sourceManager.getProject(contextProvider.getContext(), resource);
		if(project == null)
			return null;
		
		QResourceReader<T> resourceReader = new NIOResourceReaderImpl<T>(contextProvider, sourceManager, klass, project);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {

		List<QResourceReader<T>> readers = new ArrayList<QResourceReader<T>>();
		for (String resource: resources) {
			QProject project = sourceManager.getProject(contextProvider.getContext(), resource);
			if(project == null)
				continue;
			
			NIOResourceReaderImpl<T> resourceReader = new NIOResourceReaderImpl<T>(contextProvider, sourceManager, klass, project);
			readers.add(resourceReader);
		}

		return QResourceHelper.wrapReader(readers);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, final String resource) {

		QProject project = sourceManager.getProject(contextProvider.getContext(), resource);
		if(project == null)
			return null;

		QResource qResource = new QResource() {
		
			@Override
			public String getName() {
				return resource;
			}
		};
		
		QResourceWriter<T> resourceWriter = new NIOResourceWriterImpl<T>(contextProvider, sourceManager, qResource, klass, project);

		return resourceWriter;
	}
}