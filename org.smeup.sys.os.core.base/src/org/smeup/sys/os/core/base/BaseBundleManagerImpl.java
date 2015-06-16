/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.core.base;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleWiring;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectContainer;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandContainer;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.module.QModule;
import org.smeup.sys.os.module.QModuleContainer;
import org.smeup.sys.os.module.QOperatingSystemModuleFactory;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramContainer;
import org.smeup.sys.rt.core.QBundleManager;
import org.smeup.sys.rt.core.QBundleVisitor;

public class BaseBundleManagerImpl implements QBundleManager {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QResourceManager resourceManager;

	private ResourceSet resourceSet = new ResourceSetImpl();
	
	@Override
	public boolean isRegisterable(QContext context, String symbolicName) {

		Bundle bundle = Platform.getBundle(symbolicName);
		if(bundle == null)
			return false;
		
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
		if(models == null)
			return false;
		
		return true;
	}

	@Override
	public void register(QContext context, String symbolicName) {

		// exclude
		if(!isRegisterable(context, symbolicName))
			return;

		Bundle bundle = Platform.getBundle(symbolicName);
		
		QJob job = context.get(QJob.class);
		
		registerBundle(job, bundle);
	}

	@Override
	public void unregister(QContext context, String symbolicName) {

		// exclude
		if(!isRegisterable(context, symbolicName))
			return;

		Bundle bundle = Platform.getBundle(symbolicName);
		
		QJob job = context.get(QJob.class);
		unregisterBundle(job, bundle);
		
	}

	private synchronized void registerBundle(QJob job, Bundle bundle) {

		System.out.println("Registering bundle: "+bundle.getSymbolicName());
		
		// As.UP introspection
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
				
		// context
		while (models.hasMoreElements()) {
			
			URL entry = bundle.getEntry(models.nextElement());
			if(entry == null)
				continue;

			// XMI only
			if(!(entry.toString().endsWith(".xmi")))
				continue;

			Resource resource = null;
			try {
				resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
			}
			catch(Exception e) {
				System.out.println("Error on loading resource "+entry);
				return;
			}
	
			// type check
			EObject eObject = resource.getContents().get(0);
			
			if(eObject instanceof QProgramContainer) {
				QResourceWriter<QProgram> programWriter = resourceManager.getResourceWriter(job, QProgram.class, systemManager.getSystem().getSystemLibrary());
				QProgramContainer programContainer = (QProgramContainer)eObject;

				// package introspection
				if(programContainer.isScanPackage()) {
					List<QProgram> programs = loadPrograms(bundle, programContainer.getBasePackage());
					for(QProgram program: programs) {						
						try {
							programWriter.save(program, true);
						} catch (Exception e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}					
					}
				}
				
				// container read
				List<QProgram > programs = new ArrayList<>(programContainer.getContents());
				for(QProgram program: programs) {
					
					try {
						// set address
						if(program.getAddress() == null) {
							URI uriAddress = URI.createPlatformPluginURI(bundle.getSymbolicName(), true);
							uriAddress = uriAddress.appendSegment(programContainer.getBasePackage()+"."+program.getName());
							program.setAddress(uriAddress.toString());
						}
						programWriter.save(program, true);
					} catch (Exception e) {
						System.err.println("Unexpected error: "+e.getMessage());
					}					
				}
			}
			else if(eObject instanceof QModuleContainer) {
				QResourceWriter<QModule> moduleWriter = resourceManager.getResourceWriter(job, QModule.class, systemManager.getSystem().getSystemLibrary());
				QModuleContainer moduleContainer = (QModuleContainer)eObject;

				// package introspection
				if(moduleContainer.isScanPackage()) {
					List<QModule> modules = loadModules(bundle, moduleContainer.getBasePackage());
					for(QModule module: modules) {						
						try {
							moduleWriter.save(module, true);
						} catch (Exception e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}					
					}
				}
				
				// container read
				List<QModule > modules = new ArrayList<>(moduleContainer.getContents());
				for(QModule module: modules) {
					
					try {
						// set address
						if(module.getAddress() == null) {
							URI uriAddress = URI.createPlatformPluginURI(bundle.getSymbolicName(), true);
							uriAddress = uriAddress.appendSegment(moduleContainer.getBasePackage()+"."+module.getName());
							module.setAddress(uriAddress.toString());
						}
						moduleWriter.save(module, true);
					} catch (Exception e) {
						System.err.println("Unexpected error: "+e.getMessage());
					}					
				}
			}
			else if(eObject instanceof QCommandContainer) {
				QResourceWriter<QCommand> commandWriter = resourceManager.getResourceWriter(job, QCommand.class, systemManager.getSystem().getSystemLibrary());				
				QCommandContainer commandContainer = (QCommandContainer)eObject;
				List<QCommand > commands = new ArrayList<>(commandContainer.getContents()); 
				
				for(QCommand command: commands) {
					try {
//						if(command.getStatus() == CommandStatus.SUPPORTED ||
//						   command.getStatus() == CommandStatus.TODO)
						
							command.setAddress(entry.toString());
							command.setTypeName(commandContainer.getTypeName());
							commandWriter.save(command, true);
							
					} catch (Exception e) {
						System.err.println("Unexpected error: "+e.getMessage());
					}
				}
			}
			else
				System.out.println("Unknown entry "+eObject);
		}
	
	}

	private synchronized void unregisterBundle(QJob job, Bundle bundle) {

		System.out.println("Unregistering bundle: "+bundle.getSymbolicName());
		
		// As.UP introspection
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
				
		// context
		while (models.hasMoreElements()) {
			
			URL entry = bundle.getEntry(models.nextElement());
			if(entry == null)
				continue;

			// XMI only
			if(!(entry.toString().endsWith(".xmi")))
				continue;

			Resource resource = null;
			try {
				resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				return;
			}
	
			// type check
			EObject eObject = resource.getContents().get(0);
			
			if(eObject instanceof QProgramContainer) {
				QResourceWriter<QProgram> programWriter = resourceManager.getResourceWriter(job, QProgram.class, systemManager.getSystem().getSystemLibrary());
				QProgramContainer programContainer = (QProgramContainer)eObject;
				

				// package introspection
				if(programContainer.isScanPackage()) {
					List<QProgram> programs = loadPrograms(bundle, programContainer.getBasePackage());
					for(QProgram program: programs) {
						QProgram previousProgram = programWriter.lookup(program.getName());
						if(previousProgram != null) {
							try {
								programWriter.delete(previousProgram);
							}
							catch(Exception e) {
								System.err.println("Unexpected error: "+e.getMessage());
							}						
						}					
					}
				}
				
				List<QProgram > programs = new ArrayList<>(programContainer.getContents());
				for(QProgram program: programs) {
					QProgram previousProgram = programWriter.lookup(program.getName());
					if(previousProgram != null) {
						try {
							programWriter.delete(previousProgram);
						}
						catch(Exception e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}						
					}					
				}
			}
			else if(eObject instanceof QModuleContainer) {
				QResourceWriter<QModule> moduleWriter = resourceManager.getResourceWriter(job, QModule.class, systemManager.getSystem().getSystemLibrary());
				QModuleContainer moduleContainer = (QModuleContainer)eObject;
				

				// package introspection
				if(moduleContainer.isScanPackage()) {
					List<QModule> modules = loadModules(bundle, moduleContainer.getBasePackage());
					for(QModule module: modules) {
						QModule previousModule = moduleWriter.lookup(module.getName());
						if(previousModule != null) {
							try {
								moduleWriter.delete(previousModule);
							}
							catch(Exception e) {
								System.err.println("Unexpected error: "+e.getMessage());
							}						
						}					
					}
				}
				
				List<QModule> modules = new ArrayList<>(moduleContainer.getContents());
				for(QModule module: modules) {
					QModule previousModule = moduleWriter.lookup(module.getName());
					if(previousModule != null) {
						try {
							moduleWriter.delete(previousModule);
						}
						catch(Exception e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}						
					}					
				}
			}
			else if(eObject instanceof QCommandContainer) {
				QResourceWriter<QCommand> commandWriter = resourceManager.getResourceWriter(job, QCommand.class, systemManager.getSystem().getSystemLibrary());				
				QCommandContainer commandContainer = (QCommandContainer)eObject;
				List<QCommand > commands = new ArrayList<>(commandContainer.getContents()); 
				for(QCommand command: commands) {
					QCommand previousCommand = commandWriter.lookup(command.getName());
					if(previousCommand != null) {
						try {
							commandWriter.delete(previousCommand);
						}
						catch(Exception e) {
							System.err.println("Unexpected error: "+e.getMessage());
						}
					}	
				}
			}
			else
				System.out.println("Unknown entry "+eObject);			
		}
	}
	
	@SuppressWarnings("unchecked")
	private List<QProgram> loadPrograms(Bundle bundle, String basePackage) {
		
		List<QProgram> programs = new ArrayList<>();
		
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
		for(String resource: bundleWiring.listResources(basePackage.replace('.', '/'), null, BundleWiring.LISTRESOURCES_LOCAL)) {
			Class<?> klass = null;
			try {
				String resourceURI = resource.replace(".class", "").replace('/', '.');
				if(resourceURI.contains("$"))
					continue;
				klass = bundle.loadClass(resourceURI);
			} catch (ClassNotFoundException e) {
				continue;
			}
			if(QCallableProgram.class.isAssignableFrom(klass) || klass.getAnnotation(Program.class) != null)
				programs.add(buildProgram(bundle, (Class<QCallableProgram>)klass));
		}
		
		return programs;
	}
	
	private QProgram buildProgram(Bundle bundle, Class<?> klass) {
		
		QProgram qProgram = QOperatingSystemProgramFactory.eINSTANCE.createProgram();

		// address
		URI uriAddress = URI.createURI("asup:/omac");
		uriAddress = uriAddress.appendSegment(bundle.getSymbolicName());
		uriAddress = uriAddress.appendSegment(klass.getName());
		qProgram.setAddress(uriAddress.toString());
		
		// annotation
		Program programAnnotation = klass.getAnnotation(Program.class);
		if(programAnnotation != null) {
			qProgram.setName(programAnnotation.name());			
			if(!programAnnotation.text().isEmpty()) 
				qProgram.setText(programAnnotation.text());
		}
		else
			qProgram.setName(klass.getSimpleName());
		
		return qProgram;
	}

	@SuppressWarnings("unchecked")
	private List<QModule> loadModules(Bundle bundle, String basePackage) {
		
		List<QModule> modules = new ArrayList<>();
		
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
		for(String resource: bundleWiring.listResources(basePackage.replace('.', '/'), null, BundleWiring.LISTRESOURCES_LOCAL)) {
			Class<?> klass = null;
			try {
				klass = bundle.loadClass(resource.replace(".class", "").replace('/', '.'));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				continue;
			}
			if(QCallableProgram.class.isAssignableFrom(klass) || klass.getAnnotation(Module.class) != null)
				modules.add(buildModule(bundle, (Class<QCallableProgram>)klass));
		}
		
		return modules;
	}
	
	private QModule buildModule(Bundle bundle, Class<?> klass) {
		
		QModule qModule = QOperatingSystemModuleFactory.eINSTANCE.createModule();

		// address
		URI uriAddress = URI.createURI("asup:/omac");
		uriAddress = uriAddress.appendSegment(bundle.getSymbolicName());
		uriAddress = uriAddress.appendSegment(klass.getName());
		qModule.setAddress(uriAddress.toString());
		
		// annotation
		Module moduleAnnotation = klass.getAnnotation(Module.class);
		if(moduleAnnotation != null) {
			qModule.setName(moduleAnnotation.name());			
			if(!moduleAnnotation.text().isEmpty()) 
				qModule.setText(moduleAnnotation.text());
		}
		else
			qModule.setName(klass.getSimpleName());
		
		return qModule;
	}

	@Override
	public void visit(QContext context, String bundleName, QBundleVisitor visitor) {

		// bundle
		Bundle bundle = Platform.getBundle(bundleName);		
		if(bundle == null)
			throw new OperatingSystemRuntimeException("Bundle not found: "+bundleName);
		
		// As.UP introspection
		Enumeration<String> models = bundle.getEntryPaths("ASUP-INF");
				
		// context
		while (models.hasMoreElements()) {
			
			URL entry = bundle.getEntry(models.nextElement());
			if(entry == null)
				continue;

			// XMI only
			if(!(entry.toString().endsWith(".xmi")))
				continue;

			Resource resource = null;
			try {
				resource = resourceSet.createResource(URI.createURI(entry.toString()));
				resource.load(Collections.EMPTY_MAP);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				return;
			}
	
			// type check
			EObject eObject = resource.getContents().get(0);
			
			if(eObject instanceof QObjectContainer) {
				QObjectContainer<?> objectContainer = (QObjectContainer<?>)eObject;
				
				// enter
				visitor.visitEnter(objectContainer);
				
				// visit
				for (QObject qObject: objectContainer.getContents()) 
					visitor.visit(qObject);
				
				// exit
				visitor.visitExit(objectContainer);
			}
		}
	}
}