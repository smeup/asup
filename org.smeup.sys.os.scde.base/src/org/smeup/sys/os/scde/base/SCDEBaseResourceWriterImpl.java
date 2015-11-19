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

public class SCDEBaseResourceWriterImpl extends SCDEBaseResourceReaderImpl implements QResourceWriter<QScheduleEntry> {

	public SCDEBaseResourceWriterImpl(QContextProvider contextProvider, String container) {
		super(contextProvider, container);
	}

	@Override
	public synchronized void delete(QScheduleEntry object) {
		//TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public synchronized void save(QScheduleEntry object) {
		save(object, false);
	}

	@Override
	public synchronized void save(QScheduleEntry object, boolean replace) {
		//TODO
		throw new UnsupportedOperationException();
	}
}
