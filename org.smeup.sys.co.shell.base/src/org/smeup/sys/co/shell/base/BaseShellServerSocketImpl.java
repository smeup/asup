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

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

import org.smeup.sys.co.core.ConnectorCoreHelper;
import org.smeup.sys.co.core.QServerSocket;
import org.smeup.sys.co.core.QServerSocketConfig;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;

public class BaseShellServerSocketImpl implements QServerSocket, Runnable {

	private QApplication application;
	private QThreadManager threadManager;
	private QServerSocketConfig config;

	@ComponentStarted
	public void init(QApplication application, QThreadManager threadManager, QServerSocketConfig config) {
		this.application = application;
		this.threadManager = threadManager;
		this.config = config;

		QThread thread = threadManager.createThread("telnet", this);
		threadManager.start(thread);
	}

	@Override
	public void run() {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			String systemAddress = ConnectorCoreHelper.resolveVariables(config.getAddress());
			InetAddress inetAddress = InetAddress.getByName(systemAddress);
			SocketAddress socketAddress = new InetSocketAddress(inetAddress, config.getPort());
			System.out.println("Start shell on " + socketAddress);
			serverSocket = new ServerSocket();
			serverSocket.bind(socketAddress);

			while (threadManager.currentThread().checkRunnable()) {
				socket = serverSocket.accept();

				try {
					BaseShellSocketHandler shellHandler = application.getContext().make(BaseShellSocketHandler.class);
					shellHandler.setSocket(socket);

					QThread thread = threadManager.createThread("telnet/" + socket.getRemoteSocketAddress(), shellHandler);
					threadManager.start(thread);

				} catch (Exception e) {
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
					outputStreamWriter.write(e.getMessage());
					outputStreamWriter.flush();
					socket.close();
					continue;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (socket != null)
					socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				if (serverSocket != null)
					serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			serverSocket = null;
		}
	}
}