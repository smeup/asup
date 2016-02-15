/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.usrprf.fb;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;
import org.smeup.sys.os.usrprf.base.BaseUserProfileManagerImpl;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FBUserProfileManagerImpl extends BaseUserProfileManagerImpl {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QThreadManager threadManager;
	
	public void init(QJob job) {

		QResourceWriter<QUserProfile> userProfileWriter = resourceManager.getResourceWriter(job, QUserProfile.class, Scope.SYSTEM_LIBRARY);

		String accessToken = "CAACEdEose0cBAJSVN4eICu5gZBnmZCPRTJj6nKPZChsKsizoA5BU5b5pZBXjiWPn1UYw59EWVarotfoHQ4psy29TApe5bCktZAd1UJmgmf9rwZA978AoMkcuJmHkxPT0kT42dGwJDgcpxvtSniT2QlEZBRUGCjhYuAaiU8cHLfFNenMmMda1vBJZBxVYgQFbCb4ZD";
		FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
		User root = facebookClient.fetchObject("me", User.class);

		if (!userProfileWriter.exists(root.getId())) {
			// User Profile
			QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
			userProfile.setName(root.getId());
			userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
			userProfile.setText("FB root  : " + root.getName());
			QResourceWriter<QUserProfile> resourceUserProfile = resourceManager.getResourceWriter(job, QUserProfile.class, Scope.SYSTEM_LIBRARY);
			resourceUserProfile.save(userProfile);
		}

		QThread thread = threadManager.createThread("facebook", new FBUserProfileUpdater(threadManager, job, userProfileWriter, facebookClient), true);
		threadManager.start(thread);		
	}

}
