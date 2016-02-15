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
package org.smeup.sys.db.syntax.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.syntax.QDefinitionParser;
import org.smeup.sys.db.syntax.QDefinitionParserRegistry;
import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;

public class BaseDefinitionParserRegistryImpl implements QDefinitionParserRegistry {
	
	private QObjectRegistry<QDefinitionParser> objectRegistry;
	
	@Inject
	public BaseDefinitionParserRegistryImpl(QObjectRegistryFactory objectRegistryFactory) {
		 this.objectRegistry = objectRegistryFactory.createObjectRegistry(QDefinitionParser.class);
	}

	@Override
	public QDefinitionParser lookup(QConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public QDefinitionParser lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<QDefinitionParser> list() {
		return this.objectRegistry.list();
	}

	@Override
	public QDefinitionParser lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public QDefinitionParser lookupByPort(int port) {
		return objectRegistry.lookupByPort(port);
	}
}
