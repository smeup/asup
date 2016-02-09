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
package org.smeup.sys.rt.core.e4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectRegistryKey;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.core.e4.E4ContextRootImpl;
import org.smeup.sys.mi.core.util.QSingleton;
import org.smeup.sys.rt.core.ApplicationStarted;
import org.smeup.sys.rt.core.ApplicationStarting;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.ComponentStarting;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QApplicationModule;
import org.smeup.sys.rt.core.QServiceHook;
import org.smeup.sys.rt.core.QServiceRef;
import org.smeup.sys.rt.core.ServiceRegistering;
import org.smeup.sys.rt.core.ServiceStatus;

public class E4ApplicationStarter {

	private static final String SINGLETON_INSTANCE = "qINSTANCE";

	private QApplication application;
	private BundleContext bundleContext;

	private int messageLevel;
	private Writer writer;

	protected E4ApplicationStarter(QApplication application, BundleContext bundleContext, OutputStream outputStream) {
		this.application = application;
		this.bundleContext = bundleContext;
		this.writer = new OutputStreamWriter(outputStream);
	}

	public QApplication start() throws Exception {

		println("");

		println(">application " + application);

		final String name = bundleContext.getBundle().getSymbolicName();
		// root context
		QContextDescription contextDescription = new QContextDescription() {

			@Override
			public String getSystemLibrary() {
				return "";
			}

			@Override
			public String getName() {
				return name;
			}

			@Override
			public List<String> getLibraryPath() {
				return Collections.singletonList(getSystemLibrary());
			}

			@Override
			public String getCurrentLibrary() {
				return "";
			}

			@Override
			public String getTemporaryLibrary() {
				return "";
			}
		};
		QContext contextApplication = new E4ContextRootImpl(bundleContext, UUID.randomUUID().toString(), contextDescription);

		QApplication application = new E4ApplicationImpl(this.application, contextApplication);
		bundleContext.registerService(QApplication.class, application, null);

		// hooks
		messageLevel++;
		for (QServiceHook hook : application.getHooks()) {

			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook " + hook + " unactive");
				continue;
			}

			println("+hook " + hook);
			Object service = loadObject(contextApplication, hook.getClassName());

			Dictionary<String, Object> properties = new Hashtable<String, Object>();
			properties.put("org.smeup.sys.rt.core.hook.application", application.getText());
			bundleContext.registerService(hook.getInterfaceName(), service, properties);
			contextApplication.invoke(service, ApplicationStarting.class);
		}

		messageLevel--;

		for (QApplicationComponent component : application.getComponents()) {
			QContext contextComponent = contextApplication.createChildContext(component.getName());

			// register configurations
			for (QObject config : component.getConfigs())
				contextComponent.set(config.getClass().getInterfaces()[0].getName(), config);

			messageLevel++;
			println(">component " + component);
			activateComponent(application, component, contextComponent);
			messageLevel--;

			contextComponent.close();
		}

		// hooks
		messageLevel++;

		for (Object hook : loadHooks(application)) {
			println("+hook " + hook);
			contextApplication.invoke(hook, ApplicationStarted.class);
		}

		messageLevel--;

		return application;
	}

	public void activateComponent(QApplication application, QApplicationComponent component, QContext contextComponent) {

		// hooks
		messageLevel++;
		for (QServiceHook hook : component.getHooks()) {
			// STOPPED
			if (hook.getStatus() == ServiceStatus.STOPPED) {
				println("-hook " + hook + " unactive");
				continue;
			}

			println("+hook " + hook);
			Object service = loadObject(contextComponent, hook.getClassName());
			Dictionary<String, Object> properties = new Hashtable<String, Object>();
			properties.put("org.smeup.sys.rt.core.hook.component", component.getName());
			bundleContext.registerService(hook.getInterfaceName(), service, properties);
		}
		messageLevel--;

		// ComponentStarting event
		messageLevel++;
		for (Object hook : loadHooks(component)) {
			println("!component starting " + hook);
			contextComponent.invoke(hook, ComponentStarting.class);
		}
		messageLevel--;

		for (QApplicationModule module : component.getModules()) {
			messageLevel++;
			println(">module " + module);

			// Register services
			messageLevel++;
			for (QServiceRef serviceRef : module.getServices())
				try {
					registerService(application, component, contextComponent, serviceRef);
				} catch (Exception e) {
					e.printStackTrace();
				}
			messageLevel--;

			messageLevel--;
		}

		// ComponentStarted event
		messageLevel++;
		for (Object hook : loadHooks(component)) {
			println("!component started " + hook);
			contextComponent.invoke(hook, ComponentStarted.class);
		}
		messageLevel--;
	}

	public void registerService(QApplication application, QApplicationComponent component, QContext componentContext, QServiceRef serviceRef) throws ClassNotFoundException {

		// STOPPED
		if (serviceRef.getStatus() == ServiceStatus.STOPPED) {
			println("-service " + serviceRef + " unactive");
			return;
		}

		println("+service " + serviceRef);
		// service references
		for (QServiceRef serviceChildRef : serviceRef.getServices()) {
			messageLevel++;
			registerService(application, component, componentContext, serviceChildRef);
			messageLevel--;
		}

		// load service
		Object service = loadObject(componentContext, serviceRef.getClassName());

		// register on context
		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();

		if (serviceRef.getRegistryKey() != null) {
			QObjectRegistryKey plugin = serviceRef.getRegistryKey();

			// register on context
			dictionary.put("org.smeup.sys.il.core.registry.name", plugin.getName());
			dictionary.put("org.smeup.sys.il.core.registry.text", plugin.getText());
			dictionary.put("org.smeup.sys.il.core.registry.vendor", plugin.getVendor());
			dictionary.put("org.smeup.sys.il.core.registry.version", plugin.getVersion());

		}

		// service registry
		if (serviceRef.getInterfaceName() != null)
			registerService(application, component, componentContext, serviceRef.getInterfaceName(), service, dictionary, serviceRef.isRemoteExport());
		else
			registerService(application, component, componentContext, serviceRef.getClassName(), service, dictionary, serviceRef.isRemoteExport());
	}

	public void registerService(QApplication application, QApplicationComponent component, QContext componentContext, String name, Object service, Dictionary<String, Object> properties,
			boolean remoteExport) {

		// Register component as service property
		properties.put("org.smeup.sys.rt.core.component", component.getName().toLowerCase());

		QContext contextService = componentContext.createChildContext(name);
		contextService.set("org.smeup.sys.rt.core.service.name", name);
		contextService.set("org.smeup.sys.rt.core.service.object", service);
		contextService.set("org.smeup.sys.rt.core.service.properties", properties);
		contextService.set("org.smeup.sys.rt.core.service.remoteExport", remoteExport);

		// application hooks
		for (Object hook : loadHooks(application))
			contextService.invoke(hook, ServiceRegistering.class);

		// component hooks
		for (Object hook : loadHooks(component))
			contextService.invoke(hook, ServiceRegistering.class);

		if (service instanceof QSingleton<?>) {
			Class<?> klass = service.getClass();
			try {
				Field field = klass.getField(SINGLETON_INSTANCE);
				if (field != null) {
					field.setAccessible(true);
					Field modifiersField = Field.class.getDeclaredField("modifiers");
					modifiersField.setAccessible(true);
					modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
					field.set(null, service);
					field.setAccessible(false);
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		bundleContext.registerService(name, service, properties);

		contextService.close();
	}

	public Object loadObject(QContext context, String className) {

		for (Bundle bundle : bundleContext.getBundles()) {

			try {
				Class<?> tempClass = bundle.loadClass(className);
				return context.make(tempClass);
			} catch (ClassNotFoundException e) {
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Service: class not found " + className);
	}

	private List<Object> loadHooks(QApplication application) {

		List<Object> hooks = new ArrayList<>();

		try {
			String serviceFilter = "(org.smeup.sys.rt.core.hook.application=" + application.getText() + ")";
			ServiceReference<?> serviceReferences[] = bundleContext.getServiceReferences((String) null, serviceFilter);
			if (serviceReferences != null) {
				for (org.osgi.framework.ServiceReference<?> reference : serviceReferences) {
					Object service = bundleContext.getService(reference);
					hooks.add(service);
				}
			}
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}

		return hooks;
	}

	private List<Object> loadHooks(QApplicationComponent component) {

		List<Object> hooks = new ArrayList<>();

		try {
			String serviceFilter = "(org.smeup.sys.rt.core.hook.component=" + component.getName() + ")";
			ServiceReference<?> serviceReferences[] = bundleContext.getServiceReferences((String) null, serviceFilter);
			if (serviceReferences != null) {
				for (ServiceReference<?> reference : serviceReferences) {
					Object service = bundleContext.getService(reference);
					hooks.add(service);
				}
			}
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}

		return hooks;
	}

	private void println(String message) {

		try {
			writer.write(appendChars(message + "\n", "\t", messageLevel, true));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String appendChars(String in, String chars, int times, boolean before) {
		StringBuffer sb = new StringBuffer();
		if (!before)
			sb.append(in);
		for (int x = 0; x < times; x++)
			sb.append(chars);
		if (before)
			sb.append(in);
		sb.trimToSize();
		return sb.toString();
	}
}
