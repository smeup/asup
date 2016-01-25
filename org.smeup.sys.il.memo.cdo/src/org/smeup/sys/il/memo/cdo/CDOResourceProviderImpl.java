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

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.smeup.sys.co.core.QServerSocketConfig;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
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
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		// session
		CDONet4jSession session = getSession(contextProvider);

		// resource
		QResourceReader<T> resourceReader = new CDOResourceReaderImpl<T>(contextProvider, session, klass, resource);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {

		// session
		CDONet4jSession session = getSession(contextProvider);

		// resource
		QResourceReader<T> resourceReader = new CDOResourceSetReaderImpl<T>(contextProvider, session, klass, resources);

		return resourceReader;
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {

		// session
		CDONet4jSession session = getSession(contextProvider);

		// resource
		QResourceWriter<T> resourceWriter = new CDOResourceWriterImpl<T>(contextProvider, session, klass, resource);

		return resourceWriter;
	}

	private CDONet4jSession getSession(QContextProvider contextProvider) {

		CDONet4jSession session = contextProvider.getContext().get(CDONet4jSession.class);
		if (session == null) {
			session = CDOSessionHelper.openSession(socketConfig.getAddress()+":"+socketConfig.getPort(), application.getName());
			session.options().getNet4jProtocol().setTimeout(60000);
		}
		return session;
	}
}