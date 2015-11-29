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
import org.smeup.sys.il.memo.IntegratedLanguageMemoryRuntimeException;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceProvider;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.scde.QScheduleEntry;

public abstract class SCDEAbstractResourceProviderImpl<SE extends QScheduleEntry> implements QResourceProvider {

	@Inject
	public SCDEAbstractResourceProviderImpl(QResourceManager resourceManager) {

		// Register as provider for QScheduleEntry objects
		resourceManager.registerProvider(QScheduleEntry.class, this);
	}
	
	@Override
	public <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope, String name) {

		switch (scope) {
		case ALL:
		case CURRENT_LIBRARY:
		case LIBRARY_LIST:
		case USER_LIBRARY_LIST:
		case ALL_USER:
			return getResourceReader(contextProvider, klass, scope);
		case OTHER:
			return getResourceReader(contextProvider, klass, scope, name);
		}
		
		throw new IntegratedLanguageMemoryRuntimeException("Invalid scope: "+scope); 
	}

	@Override
	public <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope, String name) {
		
		switch (scope) {
		case ALL:
		case ALL_USER:
		case CURRENT_LIBRARY:
		case LIBRARY_LIST:
		case USER_LIBRARY_LIST:
			return getResourceWriter(contextProvider, klass, scope);
		case OTHER:
			return getResourceWriter(contextProvider, klass, name);
		}
				
		throw new IntegratedLanguageMemoryRuntimeException("Invalid scope: "+scope); 
	}

	@Override
	public abstract <T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource);
	
	@Override
	public abstract <T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, Scope scope);
	
	@Override
	public abstract <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource);
	
	@Override
	public abstract <T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, Scope scope);
	
	
}