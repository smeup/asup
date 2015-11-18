/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti				- Initial API and implementation
 *
 */
package org.smeup.sys.os.scde.cron;

import java.util.List;

import javax.inject.Inject;

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
import org.smeup.sys.os.scde.QScheduleEntry;

public class CronResourceProviderImpl<T extends QScheduleEntry> implements QResourceProvider {
	

	@Inject
	public CronResourceProviderImpl(QResourceManager resourceManager) {
		
		// Register as provider for QScheduleEntry objects
		resourceManager.registerProvider(QScheduleEntry.class, this);
	}
	
	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceReader<T> resourceReader = (QResourceReader<T>) new CronResourceReaderImpl(contextProvider, resource);

		return resourceReader;

	}

	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope) {
		
		List<String> containers = resources(contextProvider, scope);

		QResourceSetReader<T> resourceReader = (QResourceSetReader<T>) new CronResourceSetReaderImpl(contextProvider, containers);

		return resourceReader;
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceWriter<T> resourceWriter = (QResourceWriter<T>) new CronResourceWriterImpl(contextProvider, resource);

		return resourceWriter;
	}
	
	@SuppressWarnings({"hiding" })
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope) {

		QContextDescription contextDescription = contextProvider.getContext().getContextDescription();

		if (scope.equals(Scope.CURRENT_LIBRARY)) {
			return getResourceWriter(contextProvider, klass, contextDescription.getCurrentLibrary());
		}
		throw new IntegratedLanguageMemoryRuntimeException("Unsupported scope " + scope);
	}


	private List<String> resources(QContextProvider contextProvider, Scope scope) {
		//TODO
		throw new UnsupportedOperationException();
	}
}