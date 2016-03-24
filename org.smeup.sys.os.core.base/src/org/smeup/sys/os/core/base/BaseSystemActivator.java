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
package org.smeup.sys.os.core.base;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;

public class BaseSystemActivator {

	@Inject
	private QThreadManager threadManager;

	@ComponentStarted
	public void start(QApplication application, QSystem system, QResourceManager resourceManager, QJobManager jobManager, QLibraryManager libraryManager, QSystemManager systemManager,
			QJobLogManager jobLogManager) {

		system.setName(resolveVariables(application, system.getName()));
		
		QContext systemContext = application.getContext().createChildContext(system.getName());
		system.setContext(systemContext);
		
		QJob jobKernel = systemManager.start(system);

		BaseBundleListener bundleListener = jobKernel.getContext().make(BaseBundleListener.class);
		bundleListener.init();

		// Library
		QResourceWriter<QLibrary> resourceLibrary = resourceManager.getResourceWriter(jobKernel, QLibrary.class, Scope.SYSTEM_LIBRARY);
		if (!resourceLibrary.exists(system.getSystemLibrary())) {
			QLibrary library = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			library.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));
			library.setName(system.getSystemLibrary());
			library.setText("As.UP System Library");
			resourceLibrary.save(library);
		}

		QResourceWriter<QUserProfile> userProfileWriter = resourceManager.getResourceWriter(jobKernel, QUserProfile.class, system.getSystemLibrary());

		if (!userProfileWriter.exists(system.getSystemUser())) {
			// User Profile
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName(system.getSystemUser());
			userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(jobKernel));
			userProfile.setText("As.UP System User Profile");
			QResourceWriter<QUserProfile> resourceUserProfile = resourceManager.getResourceWriter(jobKernel, QUserProfile.class, system.getSystemLibrary());
			resourceUserProfile.save(userProfile);
		}

		application.getContext().set(QSystem.class, system);
		application.getContext().set(QJob.class, jobKernel);

		try {
			libraryManager.destroyAllTemporaryLibrary(jobKernel);
		} catch (Exception e) {
			jobLogManager.warning(jobKernel, e.getMessage());
		}

		QThread thread = threadManager.createThread("job-closer", new BaseJobCloser(threadManager, jobManager), true);
		threadManager.start(thread);
	}

	public static String resolveVariables(QApplication application, String varString) {

		String resolvedString = varString;
		if (resolvedString.indexOf("${rt.core.application.name}") >= 0)
			resolvedString = resolvedString.replace("${rt.core.application.name}", application.getName());
		if (resolvedString.indexOf("${osgi.instance.area}") >= 0)
			resolvedString = resolvedString.replace("${osgi.instance.area}", System.getProperty("osgi.instance.area"));

		return resolvedString;
	}
}
