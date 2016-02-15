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
package org.smeup.sys.dk.compiler.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QUnitConverter;
import org.smeup.sys.dk.compiler.QUnitConverterRegistry;
import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;

public class BaseUnitConverterRegistryImpl implements QUnitConverterRegistry {

	
	private QObjectRegistry<QUnitConverter> objectRegistry;
	
	@Inject
	public BaseUnitConverterRegistryImpl(QObjectRegistryFactory objectRegistryFactory) {
		 this.objectRegistry = objectRegistryFactory.createObjectRegistry(QUnitConverter.class);
	}

	@Override
	public QUnitConverter lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<QUnitConverter> list() {
		return this.objectRegistry.list();
	}

	@Override
	public QUnitConverter lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public QUnitConverter lookupByPort(int port) {
		return objectRegistry.lookupByPort(port);
	}

}
