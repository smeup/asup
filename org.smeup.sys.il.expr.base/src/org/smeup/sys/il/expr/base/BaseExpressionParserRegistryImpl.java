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
package org.smeup.sys.il.expr.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;

public class BaseExpressionParserRegistryImpl implements QExpressionParserRegistry {

	private QObjectRegistry<QExpressionParser> objectRegistry;

	@Inject
	public BaseExpressionParserRegistryImpl(QObjectRegistryFactory objectRegistryFactory) {
		this.objectRegistry = objectRegistryFactory.createObjectRegistry(QExpressionParser.class);
	}

	@Override
	public QExpressionParser lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<QExpressionParser> list() {
		return this.objectRegistry.list();
	}

	@Override
	public QExpressionParser lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public QExpressionParser lookupByPort(int port) {
		return objectRegistry.lookupByPort(port);
	}
}
