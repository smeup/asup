/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.smeup.sys.os.core.jdt;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.il.core.QObjectNameable;

public class JDTSourceIterator<T extends QObjectNameable> implements Iterator<T> {

	private Iterator<QSourceEntry> entries;
	private EMFConverter emfConverter;

	public JDTSourceIterator(EMFConverter emfConverter, Iterator<QSourceEntry> entries) {
		this.entries = entries;
		this.emfConverter = emfConverter;
	}

	@Override
	public boolean hasNext() {
		return entries.hasNext();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {

		T typedObject = null;
		QSourceEntry entry = entries.next();
		try {
			InputStream inputStream = entry.getInputStream();
			typedObject = (T) emfConverter.convertToEObject(inputStream);
			inputStream.close();
		} catch (IOException e) {
			System.err.println(e.getMessage() + " location: " + entry);
			typedObject = next();
		}

		return typedObject;
	}

	@Override
	public void remove() {
		entries.remove();
	}

}
