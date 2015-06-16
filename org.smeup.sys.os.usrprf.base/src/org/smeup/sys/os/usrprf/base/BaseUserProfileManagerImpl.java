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
package org.smeup.sys.os.usrprf.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.os.usrprf.QUserProfileManager;

public class BaseUserProfileManagerImpl implements QUserProfileManager {

	@Inject
	private QResourceManager resourceManager;

	@PostConstruct
	public void init(QJob job) {

		QSystem qSystem = job.getSystem();

		QResourceWriter<QUserProfile> userProfileWriter = resourceManager.getResourceWriter(job, QUserProfile.class, qSystem.getSystemLibrary());

		if (!userProfileWriter.exists(qSystem.getSystemUser())) {
			// User Profile
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName(qSystem.getSystemUser());
			userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
			userProfile.setLibrary(qSystem.getSystemLibrary());
			userProfile.setText("As.UP System User Profile");
			QResourceWriter<QUserProfile> resourceUserProfile = resourceManager.getResourceWriter(job, QUserProfile.class, qSystem.getSystemLibrary());
			resourceUserProfile.save(userProfile);
		}
	}
}
