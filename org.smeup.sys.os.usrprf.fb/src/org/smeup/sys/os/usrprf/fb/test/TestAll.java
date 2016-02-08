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
package org.smeup.sys.os.usrprf.fb.test;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class TestAll {

	/**
	 * RestFB Graph API client.
	 */
	private final FacebookClient facebookClient;

	/**
	 * Entry point. You must provide a single argument on the command line: a
	 * valid Graph API access token.
	 *
	 * @param args
	 *            Command-line arguments.
	 * @throws IllegalArgumentException
	 *             If no command-line arguments are provided.
	 */
	public static void main(String[] args) {

		String token = "CAACEdEose0cBAAJrdzPcEH3ESfDakjZAzrA9E3LQwYmzsWOE1VmZAjV8RH3JM7BZB5iW8dyMW5OjZB7Qr1PJKjouAlZBHnVzIr0sW6ziZBxHBTgDD2rgrOpkgyJn8yWwMdad6LZBMbiIiy2IzrWZBGeEZBlmbubgNxRfZAQZBFXdmGR9DVjm98PAydXYIGf1BCsPdMZD";
		new TestAll(token).run();
	}

	TestAll(String accessToken) {
		facebookClient = new DefaultFacebookClient(accessToken);
	}

	void run() {
		User user = facebookClient.fetchObject("me", User.class);
		System.out.println(user);

		Connection<User> friends = facebookClient.fetchConnection("me/friends", User.class);
		for (User friend : friends.getData()) {
			System.out.println(friend.getName());
			System.out.println("\t" + friend.getId());
			System.out.println("\t" + friend.getType());
			System.out.println("\t" + friend.getVerified());
		}
	}
}
