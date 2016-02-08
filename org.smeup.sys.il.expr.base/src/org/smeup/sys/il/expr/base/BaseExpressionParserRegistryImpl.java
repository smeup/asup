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

import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionParserRegistry;

public class BaseExpressionParserRegistryImpl implements QExpressionParserRegistry {

	private QPluginRegistry<QExpressionParser> pluginRegistry;

	@Inject
	public BaseExpressionParserRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		this.pluginRegistry = pluginRegistryFactory.createPluginRegistry(QExpressionParser.class);
	}

	@Override
	public QExpressionParser lookup(String name) {
		return this.pluginRegistry.lookup(name);
	}

	@Override
	public List<QExpressionParser> list() {
		return this.pluginRegistry.list();
	}

	@Override
	public QExpressionParser lookupByVendorVersion(String vendor, String version) {
		return this.pluginRegistry.lookupByVendorVersion(vendor, version);
	}
}
