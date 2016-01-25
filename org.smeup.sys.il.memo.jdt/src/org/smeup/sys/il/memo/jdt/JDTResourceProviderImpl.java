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

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.source.jdt.JDTSourceManagerImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;

public class JDTResourceProviderImpl implements QResourceProvider {

	private JDTSourceManagerImpl sourceManager;

	@Inject
	public JDTResourceProviderImpl(QResourceManager resourceManager) {
		this.sourceManager = new JDTSourceManagerImpl("asup-obj");
		
		resourceManager.registerProvider(QObjectNameable.class, this);
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceReader<T> resourceReader = new JDTResourceReaderImpl<T>(contextProvider, sourceManager, klass, resource);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {

		QResourceReader<T> resourceReader = new JDTResourceSetReaderImpl<T>(contextProvider, sourceManager, klass, resources);

		return resourceReader;
	}
	
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceWriter<T> resourceWriter = new JDTResourceWriterImpl<T>(contextProvider, sourceManager, resource, klass);

		return resourceWriter;
	}
}