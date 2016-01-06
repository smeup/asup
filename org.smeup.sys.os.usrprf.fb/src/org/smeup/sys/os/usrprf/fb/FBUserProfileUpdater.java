/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.usrprf.fb;

import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrprf.QOperatingSystemUserProfileFactory;
import org.smeup.sys.os.usrprf.QUserProfile;

import com.restfb.Connection;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FBUserProfileUpdater extends Thread {

	private QJob job;
	private QResourceWriter<QUserProfile> userProfileWriter;
	private FacebookClient facebookClient;

	protected FBUserProfileUpdater(QJob job, QResourceWriter<QUserProfile> userProfileWriter, FacebookClient facebookClient) {
		super("asup://thread/facebook");
		setDaemon(true);
		this.job = job;
		this.userProfileWriter = userProfileWriter;
		this.facebookClient = facebookClient;
	}

	@Override
	public void run() {

		while (Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(60 * 1000);

				System.out.println("Update FB UserProfiles");

				Connection<User> friends = facebookClient.fetchConnection("me/friends", User.class);
				List<User> tempFriends = new ArrayList<User>();
				User root = facebookClient.fetchObject("me", User.class);
				tempFriends.add(root);

				for (User friend : friends.getData()) {
					// User Profile
					QUserProfile userProfile = QOperatingSystemUserProfileFactory.eINSTANCE.createUserProfile();
					userProfile.setName(friend.getId());
					userProfile.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(job));
					userProfile.setText("FB friend: " + friend.getName());
					userProfileWriter.save(userProfile, true);
					tempFriends.add(friend);
				}

				List<QUserProfile> savedUser = new ArrayList<>();
				try (QObjectIterator<QUserProfile> userIterator = userProfileWriter.find(null);) {
					while (userIterator.hasNext())
						savedUser.add(userIterator.next());
				}

				for (QUserProfile userProfile : savedUser)
					if (!existsUser(tempFriends, userProfile.getName()))
						userProfileWriter.delete(userProfile);
				
			} catch (InterruptedException e) {
				 Thread.currentThread().interrupt();
				    break;
			}
		}
	}

	private boolean existsUser(List<User> users, String id) {
		for (User user : users)
			if (user.getId().equals(id))
				return true;
		return false;
	}
}
