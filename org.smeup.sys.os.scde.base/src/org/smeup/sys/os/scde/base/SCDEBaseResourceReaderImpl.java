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
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;
import org.smeup.sys.os.scde.QScheduleEntry;

public class SCDEBaseResourceReaderImpl extends ResourceReaderImpl<QScheduleEntry> {

	public SCDEBaseResourceReaderImpl(QContextProvider contextProvider, String name) {
		setContextProvider(contextProvider);
		setName(name);
	}

	@Override
	public boolean exists(String name) {
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public QObjectIterator<QScheduleEntry> find(String nameFilter) {
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public QScheduleEntry lookup(String name) {
		// TODO
		throw new UnsupportedOperationException();
	}
}