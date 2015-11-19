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

import java.util.List;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.impl.ResourceSetReaderImpl;
import org.smeup.sys.os.scde.QScheduleEntry;

public class SCDEBaseResourceSetReaderImpl extends ResourceSetReaderImpl<QScheduleEntry> {

	public SCDEBaseResourceSetReaderImpl(QContextProvider contextProvider, List<String> resources) {
		setContextProvider(contextProvider);
	}

	@Override
	public QScheduleEntry lookup(String resource, String name) {
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean exists(String resource, String name) {
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public QObjectIterator<QScheduleEntry> find(String resource, String nameFilter) {
		// TODO
		throw new UnsupportedOperationException();
	}

}