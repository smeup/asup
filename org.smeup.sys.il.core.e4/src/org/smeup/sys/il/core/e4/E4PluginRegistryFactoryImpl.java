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
package org.smeup.sys.il.core.e4;

import org.smeup.sys.il.core.ctx.QPluginRegistry;
import org.smeup.sys.il.core.ctx.QPluginRegistryFactory;

public class E4PluginRegistryFactoryImpl implements QPluginRegistryFactory {

	@Override
	public <T> QPluginRegistry<T> createPluginRegistry(Class<T> klass) {
		return new E4PluginRegistryImpl<T>(klass);
	}

}
