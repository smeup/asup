/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.co.shell.QShellCredentials;
import org.smeup.sys.co.shell.QShellManager;
import org.smeup.sys.co.shell.QShellOutputWrapper;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.rt.auth.QAuthentication;
import org.smeup.sys.rt.auth.QAuthenticationManager;

public class BaseShellSocketHandler implements Runnable {

	@Inject
	private QAuthenticationManager authenticationManager;
	@Inject
	private QShellManager shellManager;
	@Inject
	private QShellOutputWrapper shellOutputWrapper;

	private Socket socket;
	private QJobCapability jobCapability;
	
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
						if (jobCapability == null) {
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
				
				writePrompt(outputStreamWriter);

				outputStreamWriter.flush();
			}

			if (jobCapability != null) {
				shellOutputWrapper.unregister(jobCapability.getObjectID());
				jobCapability = null;				
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
		QIdentity<?> identity = authenticate(request);
		 
		jobCapability = shellManager.connect(identity);
		
		shellOutputWrapper.register(jobCapability.getObjectID(), outputStreamWriter);
		shellManager.setDefaultWriter(jobCapability, "S");
	}

	private void writePrompt(OutputStreamWriter outputStreamWriter)	throws IOException {
		if (jobCapability != null)
			outputStreamWriter.write(jobCapability.getJavaPrincipal().getName().toLowerCase() + "> ");
		else
			outputStreamWriter.write(LOGIN);
	}

	private QIdentity<QAuthentication> authenticate(String command) {

		// retrieve user
		command = cleanup(command);

		String tokens[] = command.split(" ");

		QShellCredentials credentials = QCommunicationShellFactory.eINSTANCE.createShellCredentials();
		switch (tokens.length) {
		case 1:
			credentials.setUser(tokens[0]);
			break;
		case 2:		
			credentials.setUser(tokens[0]);
			credentials.setPassword(tokens[1]);
			break;
		default:
			return null;

		}
		System.out.println("Connection request for user " + credentials.getUser());
		
		// connect
		return authenticationManager.authenticate(credentials);
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
		shellManager.executeCommand(jobCapability, command, null);
		System.out.println(command + " terminated");
		
		return nextLoop;
	}
}