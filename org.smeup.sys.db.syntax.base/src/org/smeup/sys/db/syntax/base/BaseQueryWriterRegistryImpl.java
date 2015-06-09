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
package org.smeup.sys.db.syntax.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.syntax.QQueryWriter;
import org.smeup.sys.db.syntax.QQueryWriterRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;

public class BaseQueryWriterRegistryImpl implements QQueryWriterRegistry {
	
	
	private QPluginRegistry<QQueryWriter> pluginRegistry;
	
	@Inject
	public BaseQueryWriterRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		 this.pluginRegistry = pluginRegistryFactory.createPluginRegistry(QQueryWriter.class);
	}

	@Override
	public QQueryWriter lookup(QConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public QQueryWriter lookup(String name) {
		return this.pluginRegistry.lookup(name);
	}

	@Override
	public List<QQueryWriter> list() {
		return this.pluginRegistry.list();
	}

	@Override
	public QQueryWriter lookupByVendorVersion(String vendor, String version) {
		return this.pluginRegistry.lookupByVendorVersion(vendor, version);
	}


}
