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
package org.smeup.sys.os.usrprf.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;

@Program(name = "QMUGNRUP")
public class UserProfileGenerator {

	@Inject
	QResourceManager resourceManager;
	@Inject
	QJob job;
	@Inject
	QJobLogManager jobLogManager;

	@Entry
	public void main() {

		QResourceWriter<QUserProfile> userProfileWriter = resourceManager.getResourceWriter(job, QUserProfile.class, job.getSystem().getSystemLibrary());

		for (int i = 20; i < 100; i++) {
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName("QTEST" + i);
			userProfile.setText("Text of QTEST" + i);
			try {
				userProfileWriter.save(userProfile);
			} catch (Exception e) {
				jobLogManager.error(job, e.getMessage());
			}
		}
	}
}