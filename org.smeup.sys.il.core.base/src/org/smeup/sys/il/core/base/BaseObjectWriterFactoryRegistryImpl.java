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

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.core.out.QObjectWriterFactory;
import org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry;

public class BaseObjectWriterFactoryRegistryImpl implements QObjectWriterFactoryRegistry {

	private QObjectRegistry<QObjectWriterFactory> objectRegistry;
	
	@Inject
	public BaseObjectWriterFactoryRegistryImpl(QObjectRegistryFactory objectRegistryFactory) {
		 this.objectRegistry = objectRegistryFactory.createObjectRegistry(QObjectWriterFactory.class);
	}

	@Override
	public QObjectWriterFactory lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<QObjectWriterFactory> list() {
		return this.objectRegistry.list();
	}

	@Override
	public QObjectWriterFactory lookupByPort(int port) {
		return this.objectRegistry.lookupByPort(port);
	}

	@Override
	public QObjectWriterFactory lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}
}
