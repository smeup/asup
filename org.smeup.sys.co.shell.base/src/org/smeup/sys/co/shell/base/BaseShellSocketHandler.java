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

import org.smeup.sys.co.shell.QCommunicationShellFactory;
import org.smeup.sys.co.shell.QShellManager;
import org.smeup.sys.co.shell.QShellOutputWrapper;
import org.smeup.sys.il.core.ctx.QCredentials;
import org.smeup.sys.rt.core.auth.QAuthenticationManager;
import org.smeup.sys.rt.core.auth.QAuthenticationToken;

public class BaseShellSocketHandler implements Runnable {

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
		this.socket = socket;
	}

	@Override
	public void run() {
		
		BufferedReader bufferedReader = null;
		
		try {

			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.socket.getOutputStream());
			outputStreamWriter.write(WELCOME);
			outputStreamWriter.write(LOGIN);
			outputStreamWriter.flush();

			bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

			boolean nextLoop = true;
			while (nextLoop) {

				String request = bufferedReader.readLine();

				// hello
				if (request.equalsIgnoreCase("HELLO")) {
					outputStreamWriter.write(WELCOME);
				} else {
					try {
						if (authenticationToken == null) {
							login(outputStreamWriter, request);
						} else {
							nextLoop = executeCommand(request);
						}
					} catch (Exception e) {
						if (e.getCause() == null)
							outputStreamWriter.write(e + "\n");
						else
							outputStreamWriter.write(e.getCause() + "\n");
					}
				}
				
				checkValidSession();
				
				writePrompt(outputStreamWriter);

				outputStreamWriter.flush();
			}
			outputStreamWriter.write("\nGoodbye\n");
			outputStreamWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				this.socket.close();
			} catch (Exception e) {
			}			
		}
	}

	private void login(OutputStreamWriter outputStreamWriter, String request) {
		authenticationToken = authenticate(request);
		
		shellOutputWrapper.register(authenticationToken.getID(), outputStreamWriter);
		shellManager.setDefaultWriter(authenticationToken.getID(), "S");
	}

	private void checkValidSession() {
		if (authenticationToken != null && !authenticationToken.isValid()) {
			shellOutputWrapper.unregister(authenticationToken.getID());
			authenticationManager.deleteAuthenticationToken(authenticationToken);
			authenticationToken = null;				
		}
	}

	private void writePrompt(OutputStreamWriter outputStreamWriter)	throws IOException {
		if (authenticationToken != null)
			outputStreamWriter.write(user.toLowerCase() + "> ");
		else
			outputStreamWriter.write(LOGIN);
	}


	private QAuthenticationToken authenticate(String command) {
		// retrieve user
		user = cleanup(command);

		System.out.println("Connection request for user " + user);
		
		QCredentials credentials = QCommunicationShellFactory.eINSTANCE.createShellCredentials();
		credentials.setUser(user);
		// connect
		return authenticationManager.createAuthenticationToken(credentials);
	}

	private String cleanup(String command) {
		//Solves the problem of the first connection from Windows machines
		return command.toUpperCase().replaceAll("[^A-Z0-9§$£_]", "");
	}

	private boolean executeCommand(String command) {
		boolean nextLoop = true;
		if (command == null || command.trim().length() == 0) {
			return nextLoop;
		}
		
		if (command.equalsIgnoreCase("QUIT") || command.equalsIgnoreCase("EXIT")) {
			nextLoop = false;
			command = "SIGNOFF";
		}
		
		System.out.println("Executing " + command + "...");
		shellManager.executeCommand(authenticationToken.getID(), command, null);
		System.out.println(command + " terminated");
		
		return nextLoop;
	}
}