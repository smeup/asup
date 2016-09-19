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
package org.smeup.sys.il.data.nio;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

import org.smeup.sys.il.data.QDataContext;

public class NIOContextInputStreamImpl extends ObjectInputStream {
	
	private NIODataContextImpl dataContext;
	private ClassLoader classLoader;
	
	protected NIOContextInputStreamImpl(NIODataContextImpl dataContext, ClassLoader classLoader, InputStream inputStream) throws IOException, SecurityException {
		super(inputStream);
		
		this.dataContext = dataContext;
		this.classLoader = classLoader;
	}
	
	protected QDataContext getDataContext() {
		return this.dataContext;
	}
	
	@Override
	protected Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {

		String name = desc.getName();
		
		try {
			Class<?> c = classLoader.loadClass(name);
			return c;
		} catch (Exception e) {
		}

		try {
			Class<?> c = dataContext.getDataFactory().getDataAreaFactory().getClass().getClassLoader().loadClass(name);
			return c;
		} catch (Exception e) {
		}
		
		return super.resolveClass(desc);
	}
}
