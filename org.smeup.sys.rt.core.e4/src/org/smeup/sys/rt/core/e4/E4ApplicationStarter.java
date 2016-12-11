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
import org.smeup.sys.rt.core.QServiceCommandProvider;
import org.smeup.sys.rt.core.QServiceExecutor;
import org.smeup.sys.rt.core.QServiceHook;
import org.smeup.sys.rt.core.QServiceRef;
import org.smeup.sys.rt.core.QServiceRegistry;
import org.smeup.sys.rt.core.QServiceRegistryEntry;
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
				return "QSYS";
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

			@Override
			public String getTemporaryArea() {
				return "";
			}
		};
		QContext contextApplication = new E4ContextRootImpl(bundleContext, UUID.randomUUID().toString(), contextDescription);
		this.application.setContext(contextApplication);

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
		}

		// hooks
		messageLevel++;

		for (Object hook : loadHooks(application)) {
			println("+hook " + hook);
			contextApplication.invoke(hook, ApplicationStarting.class);
		}

		messageLevel--;

		for (QApplicationComponent component : application.getComponents()) {
			QContext contextComponent = contextApplication.createChildContext(component.getName());
			contextComponent.set(QApplicationComponent.class, component);

			// register configurations
			if (component.getConfig() != null) {
				for (QObject object : component.getConfig().getObjects())
					contextComponent.set(object.getClass().getInterfaces()[0].getName(), object);
			}

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

		// commands provider
		messageLevel++;
		for (QServiceCommandProvider command : application.getCommands()) {

			// STOPPED
			if (command.getStatus() == ServiceStatus.STOPPED) {
				println("-command " + command + " unactive");
				continue;
			}

			println("+command " + command);
			Object service = loadObject(contextApplication, command.getClassName());
			bundleContext.registerService(command.getInterfaceName(), service, null);
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

		// hooks
		messageLevel++;
		for (Object hook : loadHooks(component)) {
			println("!component starting " + hook);
			contextComponent.invoke(hook, ComponentStarting.class);
		}
		messageLevel--;

		for (QApplicationModule module : component.getModules()) {
			messageLevel++;
			println(">module " + module);

			messageLevel++;

			// services
			for (QServiceRef serviceRef : module.getServices()) {
				try {
					registerService(application, component, contextComponent, serviceRef);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			messageLevel--;

			messageLevel--;
		}

		// hooks
		messageLevel++;
		for (Object hook : loadHooks(component)) {
			println("!component started " + hook);
			contextComponent.invoke(hook, ComponentStarted.class);
		}
		messageLevel--;

		// commands provider
		messageLevel++;
		for (QServiceCommandProvider command : component.getCommands()) {

			// STOPPED
			if (command.getStatus() == ServiceStatus.STOPPED) {
				println("-command " + command + " unactive");
				continue;
			}

			println("+command " + command);
			Object service = loadObject(contextComponent, command.getClassName());
			bundleContext.registerService(command.getInterfaceName(), service, null);
		}
		messageLevel--;
	}

	public void registerService(QApplication application, QApplicationComponent component, QContext componentContext, QServiceRef serviceRef) throws ClassNotFoundException {

		boolean remoteExport = false;

		// STOPPED
		if (serviceRef.getStatus() == ServiceStatus.STOPPED) {
			println("-service " + serviceRef + " unactive");
			return;
		}

		println("+service " + serviceRef);

		if (serviceRef instanceof QServiceExecutor) {
			QServiceExecutor serviceExecutor = (QServiceExecutor) serviceRef;
			remoteExport = serviceExecutor.isRemoteExport();

			// service references
			// for (QServiceExecutor serviceChildRef :
			// serviceExecutor.getServices()) {
			// messageLevel++;
			// registerService(application, component, componentContext,
			// serviceChildRef);
			// messageLevel--;
			// }
		}

		if (serviceRef instanceof QServiceRegistry) {
			QServiceRegistry serviceRegistry = (QServiceRegistry) serviceRef;

			// service entries
			for (QServiceRegistryEntry serviceChildRef : serviceRegistry.getEntries()) {
				messageLevel++;
				registerService(application, component, componentContext, serviceChildRef);
				messageLevel--;
			}
		}

		// load service
		Object service = loadObject(componentContext, serviceRef.getClassName());

		// register on context
		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();

		if (serviceRef instanceof QServiceRegistryEntry) {
			QServiceRegistryEntry serviceRegistry = (QServiceRegistryEntry) serviceRef;

			// register on context
			dictionary.put("org.smeup.sys.il.core.registry.name", serviceRegistry.getName());
			dictionary.put("org.smeup.sys.il.core.registry.vendor", serviceRegistry.getVendor());
			dictionary.put("org.smeup.sys.il.core.registry.version", serviceRegistry.getVersion());
		}

		// service registration
		if (serviceRef.getInterfaceName() != null)
			registerService(application, component, componentContext, serviceRef.getInterfaceName(), service, dictionary, remoteExport);
		else
			registerService(application, component, componentContext, serviceRef.getClassName(), service, dictionary, remoteExport);
	}

	private void registerService(QApplication application, QApplicationComponent component, QContext componentContext, String name, Object service, Dictionary<String, Object> properties,
			boolean remoteExport) {

		// service properties
		properties.put("org.smeup.sys.rt.core.application.name", application.getName());
		properties.put("org.smeup.sys.rt.core.application.port", application.getPort());
		properties.put("org.smeup.sys.rt.core.component.name", component.getName());

		// context properties
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

		// singleton
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
				contextService.close();
				throw new RuntimeException(e);
			}
		}

		contextService.invoke(service, ServiceRegistering.class);
		bundleContext.registerService(name, service, properties);

		// prevent remote injection
		application.getContext().set(name, service);

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
