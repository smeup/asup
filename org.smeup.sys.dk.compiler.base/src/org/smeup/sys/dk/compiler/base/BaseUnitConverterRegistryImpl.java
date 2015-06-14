/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.dk.compiler.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QUnitConverter;
import org.smeup.sys.dk.compiler.QUnitConverterRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;

public class BaseUnitConverterRegistryImpl implements QUnitConverterRegistry {

	
	private QPluginRegistry<QUnitConverter> pluginRegistry;
	
	@Inject
	public BaseUnitConverterRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		 this.pluginRegistry = pluginRegistryFactory.createPluginRegistry(QUnitConverter.class);
	}

	@Override
	public QUnitConverter lookup(String name) {
		return this.pluginRegistry.lookup(name);
	}

	@Override
	public List<QUnitConverter> list() {
		return this.pluginRegistry.list();
	}

	@Override
	public QUnitConverter lookupByVendorVersion(String vendor, String version) {
		return this.pluginRegistry.lookupByVendorVersion(vendor, version);
	}

}
