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
package org.smeup.sys.il.core.osgi;

import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.core.osgi.OSGIObjectRegistryImpl;

public class OSGIObjectRegistryFactoryImpl implements QObjectRegistryFactory {

	@Override
	public <T> QObjectRegistry<T> createObjectRegistry(Class<T> klass) {
		return new OSGIObjectRegistryImpl<T>(klass);
	}

}
