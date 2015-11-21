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
package org.smeup.sys.os.scde.base;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.scde.QScheduleEntry;

public abstract class SCDEAbstractResourceProviderImpl<T extends QScheduleEntry> implements QResourceProvider {

	@Inject
	public SCDEAbstractResourceProviderImpl(QResourceManager resourceManager) {

		// Register as provider for QScheduleEntry objects
		resourceManager.registerProvider(QScheduleEntry.class, this);
	}

	@SuppressWarnings({"hiding" })
	@Override
	public abstract <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource);
	
	@SuppressWarnings({"hiding" })
	@Override
	public abstract <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope);
	
	@SuppressWarnings({ "hiding" })
	@Override
	public abstract <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource);
	
	@SuppressWarnings({ "hiding" })
	@Override
	public abstract <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope);
	
	
}