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
package org.smeup.sys.os.lib.base;

import javax.inject.Inject;

import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;

public class BaseLibraryManagerImpl implements QLibraryManager {

	private QResourceManager resourceManager;

	private String systemLibrary;

	// private BundleContext bundleContext;
	// private Map<String, Long> bundleMap;

	@Inject
	public BaseLibraryManagerImpl(QSystemManager systemManager, QResourceManager resourceManager) {

		this.systemLibrary = systemManager.getSystem().getSystemLibrary();
		this.resourceManager = resourceManager;

	}

	@Override
	public QResourceReader<QLibrary> getLibraryReader(QJob job) {
		QResourceReader<QLibrary> libraryReader = resourceManager.getResourceReader(job, QLibrary.class, systemLibrary);
		return libraryReader;
	}

	@Override
	public QResourceWriter<QLibrary> getLibraryWriter(QJob job) {
		QResourceWriter<QLibrary> libraryWriter = resourceManager.getResourceWriter(job, QLibrary.class, systemLibrary);
		return libraryWriter;
	}

	/*
	 * @Override public Class<?> loadClass(QJob job, String library, String
	 * name) throws OperatingSystemException {
	 * 
	 * // prepareBundleMap();
	 * 
	 * // load bundle library Long bundleId = bundleMap.get(library);
	 * if(bundleId == null) { for(Bundle bundle: bundleContext.getBundles()) {
	 * System.out.println(bundle); bundleMap.put(bundle.getSymbolicName(),
	 * bundle.getBundleId()); } bundleId = bundleMap.get(library); if(bundleId
	 * == null) throw new
	 * OperatingSystemException("Bundle "+library+" not found"); } Bundle
	 * bundleLibrary = bundleContext.getBundle(bundleId); Bundle bundleLibrary =
	 * Platform.getBundle(library); if(bundleLibrary == null) throw new
	 * OperatingSystemException("Bundle "+library+" not found");
	 * 
	 * // load class try { return bundleLibrary.loadClass(name); } catch
	 * (ClassNotFoundException e) { throw new OperatingSystemException(e); }
	 * catch (ClassCastException e) { throw new
	 * OperatingSystemRuntimeException(e); }
	 * 
	 * }
	 */

	/*
	 * private void prepareBundleMap() { if(this.bundleMap == null) {
	 * this.bundleMap = new HashMap<String, Long>(); for(Bundle bundle:
	 * bundleContext.getBundles()) { bundleMap.put(bundle.getSymbolicName(),
	 * bundle.getBundleId()); } } }
	 */
}