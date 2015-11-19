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

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.scde.QScheduleEntry;

public abstract class SCDEAbstractResourceWriterImpl extends SCDEAbstractResourceReaderImpl implements QResourceWriter<QScheduleEntry> {

	public SCDEAbstractResourceWriterImpl(QContextProvider contextProvider, String container) {
		super(contextProvider, container);
	}

	@Override
	public abstract void delete(QScheduleEntry object); 

	@Override
	public abstract void save(QScheduleEntry object);
	
	@Override
	public abstract void save(QScheduleEntry object, boolean replace); 
}
