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
package org.smeup.sys.os.core.base;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;

public class BaseSystemActivator {

	@ComponentStarted
	public void start(QApplication application, QResourceManager resourceManager, QSystemManager systemManager) {

		QSystem system = systemManager.getSystem();
		QContext systemContext = application.getContext().createChildContext(system.getName());
		system.setContext(systemContext);

		QJob job = systemManager.start();

		BaseBundleListener bundleListener = systemContext.make(BaseBundleListener.class);
		bundleListener.init(job);

		// Library
		QResourceWriter<QLibrary> resourceLibrary = resourceManager.getResourceWriter(job, QLibrary.class, system.getSystemLibrary());
		if (!resourceLibrary.exists(system.getSystemLibrary())) {
			QLibrary library = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			library.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));
			library.setName(system.getSystemLibrary());
			library.setText("As.UP System Library");
			resourceLibrary.save(library);
		}

		// System
		QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(job, QSystem.class, system.getSystemLibrary());
		QSystem persistedSystem = systemWriter.lookup(system.getName());
		if (persistedSystem != null) {
			QEnvironmentVariableContainer variableContainer = persistedSystem.getVariableContainer();
			if(variableContainer != null) {
				system.setVariableContainer(variableContainer);
				systemWriter.save(system, true);
			}
		}
		QResourceWriter<QUserProfile> userProfileWriter = resourceManager.getResourceWriter(job, QUserProfile.class, system.getSystemLibrary());

		if (!userProfileWriter.exists(system.getSystemUser())) {
			// User Profile
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName(system.getSystemUser());
			userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
			userProfile.setText("As.UP System User Profile");
			QResourceWriter<QUserProfile> resourceUserProfile = resourceManager.getResourceWriter(job, QUserProfile.class, system.getSystemLibrary());
			resourceUserProfile.save(userProfile);
		}

		application.getContext().set(QSystem.class, system);

		application.getContext().set(QJob.class, job);

	}
}
