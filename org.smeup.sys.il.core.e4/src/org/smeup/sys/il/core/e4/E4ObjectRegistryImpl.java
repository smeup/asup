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
package org.smeup.sys.il.core.e4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectRegistry;

public class E4ObjectRegistryImpl<T> implements QObjectRegistry<T> {

	private BundleContext bundleContext;
	private Class<T> klass;

	public E4ObjectRegistryImpl(Class<T> klass) {
		this.bundleContext = FrameworkUtil.getBundle(QObject.class).getBundleContext();
		this.klass = klass;
	}

	@Override
	public T lookup(String name) {

		// search plugin
		String serviceFilter = "(org.smeup.sys.il.core.registry.name=" + name + ")";

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, serviceFilter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
			return null;
		}

		ServiceReference<T> pluginReference = null;
		for (ServiceReference<T> pReference : pluginReferences) {
			pluginReference = pReference;
			break;
		}

		if (pluginReference == null)
			return null;

		T plugin = bundleContext.getService(pluginReference);

		return plugin;
	}

	@Override
	public List<T> list() {

		List<T> plugins = new ArrayList<T>();

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, null);
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}

		// TODO
		for (ServiceReference<T> pluginReference : pluginReferences)
			if (pluginReference != null) {
				T plugin = bundleContext.getService(pluginReference);
				plugins.add(plugin);
			}

		return plugins;
	}

	@Override
	public T lookupByVendorVersion(String vendor, String version) {

		// search plugin
		String serviceFilter = "(&(org.smeup.sys.il.core.registry.vendor=" + vendor + ")" + "(org.smeup.sys.il.core.registry.version=" + version + "))";

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, serviceFilter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
			return null;
		}

		ServiceReference<T> pluginReference = null;
		for (ServiceReference<T> pReference : pluginReferences) {
			pluginReference = pReference;
			break;
		}

		if (pluginReference == null)
			return null;

		T plugin = bundleContext.getService(pluginReference);

		return plugin;
	}
}
