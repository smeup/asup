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

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;

public class BaseSystemActivator {

	private QJob jobKernel;
	
	@ComponentStarted
	public void start(QApplication application, QResourceManager resourceManager, QLibraryManager libraryManager, QSystemManager systemManager, QJobLogManager jobLogManager) {
		
		QSystem system = systemManager.getSystem();
		QContext systemContext = application.getContext().createChildContext(system.getName());
		system.setContext(systemContext);

		jobKernel = systemManager.start();
		
		BaseBundleListener bundleListener = systemContext.make(BaseBundleListener.class);
		bundleListener.init(jobKernel);

		// Library
		QResourceWriter<QLibrary> resourceLibrary = resourceManager.getResourceWriter(jobKernel, QLibrary.class, system.getSystemLibrary());
		if (!resourceLibrary.exists(system.getSystemLibrary())) {
			QLibrary library = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			library.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));
			library.setName(system.getSystemLibrary());
			library.setText("As.UP System Library");
			resourceLibrary.save(library);
		}

		// System
		QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(jobKernel, QSystem.class, system.getSystemLibrary());
		QSystem persistedSystem = systemWriter.lookup(system.getName());
		if (persistedSystem != null) {
			QEnvironmentVariableContainer variableContainer = persistedSystem.getVariableContainer();
			if(variableContainer != null) {
				system.setVariableContainer(variableContainer);
				systemWriter.save(system, true);
			}
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
		}
		catch(Exception e) {
			jobLogManager.warning(jobKernel, e.getMessage());
		}		
	}	
}
