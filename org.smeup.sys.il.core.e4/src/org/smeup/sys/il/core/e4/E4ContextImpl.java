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

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.InjectionException;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.smeup.sys.il.core.ctx.ContextInjectionStrategy;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;

@SuppressWarnings("restriction")
public abstract class E4ContextImpl implements QContext {

	private static final String ADAPTER_FACTORIES_NAME = "org.asup.fw.core.e4.context.adapterFactories";

	private static Boolean postConstruct = null;

	private BundleContext bundleContext;
	private String name;
	private String contextID;
	
	public E4ContextImpl(BundleContext bundleContext, String contextID, String name) {
		this.bundleContext = bundleContext;
		this.contextID = contextID;
		this.name = name;
	}

	abstract IEclipseContext getEclipseContext();

	protected void initializeContext(IEclipseContext eclipseContext) {
		eclipseContext.set(ADAPTER_FACTORIES_NAME, new HashMap<Class<?>, List<QAdapterFactory>>());
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public <T> void set(Class<T> clazz, T object) {
		getEclipseContext().set(clazz, object);
	}

	@Override
	public <T> void set(String name, T object) {
		getEclipseContext().set(name, object);
	}

	@Override
	public <T> T make(Class<T> clazz) {

		IEclipseContext eclipseContext = getEclipseContext();
		T object = ContextInjectionFactory.make(clazz, eclipseContext);

		if (isActivePostConstruct())
			ContextInjectionFactory.invoke(object, PostConstruct.class, eclipseContext, object);

		return object;
	}

	@Override
	public void inject(Object consumer) {
		ContextInjectionFactory.inject(consumer, getEclipseContext());
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return getEclipseContext().get(clazz);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) {
		try {
			ContextInjectionFactory.invoke(object, qualifier, getEclipseContext());
		} catch (InjectionException e) {
			// TODO
			e.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Class<?> loadClass(String address) {

		URI uriAddress = URI.createURI(address);

		Bundle bundleAuthority = Platform.getBundle(uriAddress.segment(1));
		if (bundleAuthority == null)
			return null;

		try {
			return bundleAuthority.loadClass(uriAddress.segment(2));
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void close() {

		Map<Class<?>, List<QAdapterFactory>> adapterFactories = (Map<Class<?>, List<QAdapterFactory>>) getEclipseContext().get(ADAPTER_FACTORIES_NAME);
		adapterFactories.clear();

		getEclipseContext().dispose();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Object adaptable, Class<T> adapterType) {

		T adaptee = searchAdapter(getEclipseContext(), adaptable, adapterType);
		if (adaptee != null)
			return adaptee;

		if (adaptee == null && adapterType.isInstance(adaptable))
			adaptee = (T) adaptable;

		return adaptee;
	}

	@SuppressWarnings("unchecked")
	private <T> T searchAdapter(IEclipseContext eclipseContext, Object adaptable, Class<T> adapterType) {

		T adaptee = null;

		Map<Class<?>, List<QAdapterFactory>> adapterFactories = (Map<Class<?>, List<QAdapterFactory>>) eclipseContext.get(ADAPTER_FACTORIES_NAME);
		if (!adapterFactories.isEmpty()) {
			adaptee = searchAdapter(adaptable, adaptable.getClass().getInterfaces(), adapterFactories, adapterType);

			if (adaptee != null)
				return adaptee;

			Class<?> superClass = adaptable.getClass().getSuperclass();
			if (superClass != Object.class)
				adaptee = searchAdapter(adaptable, superClass.getInterfaces(), adapterFactories, adapterType);
		}

		if (adaptee != null)
			return adaptee;

		// search on parent
		IEclipseContext parentContext = eclipseContext.getParent();
		if (parentContext != null)
			adaptee = searchAdapter(parentContext, adaptable, adapterType);

		return adaptee;
	}

	private <T> T searchAdapter(Object adaptable, Class<?> interfaces[], Map<Class<?>, List<QAdapterFactory>> adapterFactories, Class<T> adapterType) {

		T adaptee = null;

		for (Class<?> _interface : interfaces) {

			List<QAdapterFactory> factories = adapterFactories.get(_interface);
			if (factories != null)
				// search adaptee on naturally registration order
				for (QAdapterFactory adapterFactory : factories) {
					adaptee = adapterFactory.getAdapter(this, adaptable, adapterType);
					if (adaptee != null)
						break;
				}

			if (adaptee != null)
				break;

			adaptee = searchAdapter(adaptable, _interface.getInterfaces(), adapterFactories, adapterType);
		}

		return adaptee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void registerAdapterFactory(QAdapterFactory factory, Class<T> adapterType) {

		synchronized (adapterType) {

			Map<Class<?>, List<QAdapterFactory>> adapterFactories = (Map<Class<?>, List<QAdapterFactory>>) getEclipseContext().get(ADAPTER_FACTORIES_NAME);

			List<QAdapterFactory> factories = adapterFactories.get(adapterType);
			if (factories == null) {
				factories = new ArrayList<QAdapterFactory>();
				adapterFactories.put(adapterType, factories);
			}

			factories.add(factory);
		}
	}

	@Override
	public QContext createChildContext(String name) {
		return createChildContext(name, ContextInjectionStrategy.LOCAL);
	}

	@Override
	public QContext createChildContext(String name, ContextInjectionStrategy injectionStrategy) {

		switch (injectionStrategy) {
		case LOCAL:
			return createLocalContext(name);
		case REMOTE:
			return createRemoteContext(name);
		}

		// TODO
		return null;
	}

	private QContext createLocalContext(String name) {

		IEclipseContext eclipseChildContext = getEclipseContext().createChild();

		initializeContext(eclipseChildContext);

		QContext contextChild = new E4ContextChildImpl(bundleContext, eclipseChildContext, UUID.randomUUID().toString(), name);

		return contextChild;
	}

	private QContext createRemoteContext(String name) {

		IEclipseContext eclipseChildContext = getEclipseContext().createChild();

		// bind remote service
		try {
			for (ServiceReference<?> serviceReference : bundleContext.getAllServiceReferences(null, null))
				if (serviceReference.getProperty(Constants.SERVICE_IMPORTED) != null) {

					Object object = null;
					String className = ((String[]) serviceReference.getProperty("objectClass"))[0];

					for (Bundle bundle : bundleContext.getBundles())
						if (className.startsWith(bundle.getSymbolicName())) {
							if (bundle.getSymbolicName().equals("org.asup.os.type"))
								continue;
							object = bundle.getBundleContext().getService(serviceReference);
							if (object == null)
								continue;

							eclipseChildContext.set(className, object);
							break;
						}
				}
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}

		initializeContext(eclipseChildContext);

		return new E4ContextChildImpl(bundleContext, eclipseChildContext, UUID.randomUUID().toString(), name);
	}

	private boolean isActivePostConstruct() {

		if (postConstruct == null) {

			IEclipseContext eclipseContext = getEclipseContext();
			Dummy dummy = ContextInjectionFactory.make(Dummy.class, eclipseContext);
			postConstruct = !dummy.isLoaded();

		}

		return postConstruct;
	}

	public static class Dummy {

		private boolean loaded = false;

		public Dummy() {

		}

		@PostConstruct
		public void init() {
			this.loaded = true;
		}

		public boolean isLoaded() {
			return loaded;
		}
	}

	@Override
	public String getID() {
		return this.contextID;
	}

}
