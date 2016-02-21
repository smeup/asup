/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.core.base;

import java.util.HashMap;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QObjectWriterFactory;
import org.smeup.sys.il.core.out.QOutputManager;

public class BaseOutputManagerImpl implements QOutputManager {

	@Inject
	private QObjectRegistryFactory objectRegistryFactory;

	@Override
	public QObjectWriter getDefaultWriter(QContext context) {

		QObjectWriter objectWriter = context.get(QObjectWriter.class);

		if (objectWriter == null) {
			QObjectRegistry<QObjectWriterFactory> objectWriterFactoryRegistry = objectRegistryFactory.createObjectRegistry(QObjectWriterFactory.class);
			QObjectWriterFactory objectWriterFactory = objectWriterFactoryRegistry.lookup("S");
			objectWriter = objectWriterFactory.createObjectWriter(context);

			context.set(QObjectWriter.class, objectWriter);
		}

		return objectWriter;
	}

	@Override
	public QObjectWriter getObjectWriter(QContext context, String name) {

		if (name == null || name.isEmpty())
			name = "*";

		JobToObjectWriterMap jobWriters = context.get(JobToObjectWriterMap.class);
		if (jobWriters == null) {
			jobWriters = new JobToObjectWriterMap();
			context.set(JobToObjectWriterMap.class, jobWriters);
		}

		QObjectWriter objectWriter = jobWriters.get(name);
		if (objectWriter == null) {

			if (name.equals("*"))
				return getDefaultWriter(context);

			QObjectRegistry<QObjectWriterFactory> objectWriterFactoryRegistry = objectRegistryFactory.createObjectRegistry(QObjectWriterFactory.class);
			QObjectWriterFactory objectWriterFactory = objectWriterFactoryRegistry.lookup(name);
			objectWriter = objectWriterFactory.createObjectWriter(context);
			jobWriters.put(name, objectWriter);
		}

		return objectWriter;
	}

	@Override
	public void registerWriter(QContext context, String name, QObjectWriter objectWriter) {

		JobToObjectWriterMap jobWriters = context.get(JobToObjectWriterMap.class);
		if (jobWriters == null) {
			jobWriters = new JobToObjectWriterMap();
			context.set(JobToObjectWriterMap.class, jobWriters);
		}
	}

	@Override
	public void setDefaultWriter(QContext context, String name) {
		context.set(QObjectWriter.class, getObjectWriter(context, name));
	}

	private class JobToObjectWriterMap extends HashMap<String, QObjectWriter> {

		private static final long serialVersionUID = 1L;

	}
}
