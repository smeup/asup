/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.il.expr.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QExpressionWriterRegistry;

public class BaseExpressionWriterRegistryImpl implements QExpressionWriterRegistry {

	private QObjectRegistry<QExpressionWriter> objectRegistry;

	@Inject
	public BaseExpressionWriterRegistryImpl(QObjectRegistryFactory objectRegistryFactory) {
		this.objectRegistry = objectRegistryFactory.createObjectRegistry(QExpressionWriter.class);
	}

	@Override
	public QExpressionWriter lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<QExpressionWriter> list() {
		return this.objectRegistry.list();
	}

	@Override
	public QExpressionWriter lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}
}
