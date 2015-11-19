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

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryFactory;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;
import org.smeup.sys.os.scde.QScheduleEntry;

public abstract class SCDEAbstractResourceReaderImpl extends ResourceReaderImpl<QScheduleEntry> {
	
	protected QResourceEvent<QScheduleEntry> resourceEvent;

	public SCDEAbstractResourceReaderImpl(QContextProvider contextProvider, String name) {
		setContextProvider(contextProvider);
		setName(name);
		
		this.resourceEvent = QIntegratedLanguageMemoryFactory.eINSTANCE.createResourceEvent();
		this.resourceEvent.setResource(this);		
	}

	@Override
	public abstract boolean exists(String name);

	@Override
	public abstract QObjectIterator<QScheduleEntry> find(String nameFilter);

	@Override
	public abstract QScheduleEntry lookup(String name); 
}