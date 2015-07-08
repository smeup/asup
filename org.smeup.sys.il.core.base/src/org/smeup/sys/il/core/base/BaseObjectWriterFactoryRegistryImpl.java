/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;
import org.smeup.sys.il.core.out.QObjectWriterFactory;
import org.smeup.sys.il.core.out.QObjectWriterFactoryRegistry;

public class BaseObjectWriterFactoryRegistryImpl implements QObjectWriterFactoryRegistry {

	private QPluginRegistry<QObjectWriterFactory> pluginRegistry;

	@Inject
	public BaseObjectWriterFactoryRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		this.pluginRegistry = pluginRegistryFactory.createPluginRegistry(QObjectWriterFactory.class);
	}

	@Override
	public QObjectWriterFactory lookup(String name) {
		return this.pluginRegistry.lookup(name);
	}

	@Override
	public List<QObjectWriterFactory> list() {
		return this.pluginRegistry.list();
	}

	@Override
	public QObjectWriterFactory lookupByVendorVersion(String vendor, String version) {
		return this.pluginRegistry.lookupByVendorVersion(vendor, version);
	}

}
