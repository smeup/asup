/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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

import javax.annotation.PostConstruct;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceDef;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.scde.QScheduleEntry;

public class CronResourceProviderImpl implements QResourceProvider {
	
	private QCronSchedulerConfig config;

	@PostConstruct
	private void init(QResourceManager resourceManager, QCronSchedulerConfig config) {
		resourceManager.registerProvider(QScheduleEntry.class, this);
		this.config = config;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceReader<T> resourceReader = (QResourceReader<T>) new CronResourceReaderImpl(contextProvider, resource, config);
		return resourceReader;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, List<String> resources) {

		QResourceReader<T> resourceReader = (QResourceReader<T>) new CronResourceReaderImpl(contextProvider, null, config);
		return resourceReader;
	}

	@SuppressWarnings({ "unchecked"})
	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource) {

		QResourceWriter<T> resourceWriter = (QResourceWriter<T>) new CronResourceWriterImpl(contextProvider, resource, config);

		return resourceWriter;
	}

	@Override
	public void createResource(QContextProvider contextProvider, QResourceDef resource, boolean replace) {
		// TODO Auto-generated method stub
		
	}
}