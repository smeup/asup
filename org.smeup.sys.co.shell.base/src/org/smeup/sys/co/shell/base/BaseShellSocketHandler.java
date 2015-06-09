/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.co.shell.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.inject.Inject;

import org.smeup.sys.co.shell.QShellManager;
import org.smeup.sys.co.shell.QShellOutputWrapper;
import org.smeup.sys.rt.core.auth.QAuthenticationManager;
import org.smeup.sys.rt.core.auth.QAuthenticationToken;

public class BaseShellSocketHandler extends Thread {

	@Inject
	private QAuthenticationManager authenticationManager;
	@Inject
	private QShellManager shellManager;
	@Inject
	private QShellOutputWrapper shellOutputWrapper;

	private Socket socket;
	private QAuthenticationToken authenticationToken;
	private String user;
	
	private static String WELCOME = 
			  "------------------------------------------\n" 
	        + "Welcome to the As.UP console\n\n" 
			+ "Type your user name to login\n\n"
			+ "Type SIGNOFF to disconnect from console\n" 
			+ "------------------------------------------\n";

	private static String LOGIN = "login> ";

	public BaseShellSocketHandler(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {

		try {

			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.socket.getOutputStream());
			outputStreamWriter.write(WELCOME);
			outputStreamWriter.write(LOGIN);
			outputStreamWriter.flush();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

			while (true) {

				String request = bufferedReader.readLine();

				// hello
				if (request.equals("HELLO"))
					outputStreamWriter.write(WELCOME);

				// disconnect
				else if (request.equalsIgnoreCase("SIGNOFF") || request.equalsIgnoreCase("EXIT") || request.equalsIgnoreCase("QUIT")) {
					if(authenticationToken != null)
						shellOutputWrapper.unregister(authenticationToken.getID());
					break;
				}
				else
					try {
						if (authenticationToken == null) {
							authenticationToken = connect(request);
							shellOutputWrapper.register(authenticationToken.getID(), outputStreamWriter);
						} else
							executeCommand(request);
					} catch (Exception e) {
						if (e.getCause() == null)
							outputStreamWriter.write(e.getMessage() + "\n");
						else
							outputStreamWriter.write(e.getCause().getMessage() + "\n");
					}

				if (authenticationToken != null)
					outputStreamWriter.write(user.toLowerCase() + ">");
				else
					outputStreamWriter.write(LOGIN);

				outputStreamWriter.flush();
			}

			bufferedReader.close();
			this.socket.close();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				this.socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	private QAuthenticationToken connect(String command) {
		// retrieve user
		user = command;

		// connect
		return authenticationManager.createAuthenticationToken();
	}

	private void executeCommand(String command) {

		if (command == null || command.trim().length() == 0)
			return;

		shellManager.execute(authenticationToken.getID(), command, null, true);
	}
}