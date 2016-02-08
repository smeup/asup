/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class ConnectorCoreHelper {

	public static String getSystemIP() {
		String ip = "127.0.0.1";
		Enumeration<NetworkInterface> networkInterfaces;
		try {
			networkInterfaces = NetworkInterface.getNetworkInterfaces();
			boolean found = false;
			while (networkInterfaces.hasMoreElements() && found == false) {
                NetworkInterface e = networkInterfaces.nextElement();
                Enumeration<InetAddress> addresses = e.getInetAddresses();
                while (addresses.hasMoreElements() && found == false) {
                        InetAddress addr = addresses.nextElement();
                        ip = addr.getHostAddress();

                        if(ip.contains(":"))
                        	continue;
                        if(ip.equals("127.0.0.1"))
                        	continue;

                    	found = true;
                }
	        }

		} catch (SocketException e1) {
			ip = "127.0.0.1";
		}
		return ip;
	}


	public static String getHostName() {
		String hostName = "localhost";
		try {
			hostName = InetAddress.getLocalHost().getHostName();
			//hostName = InetAddress.getLocalHost().getCanonicalHostName();
		} catch (UnknownHostException e) {
			hostName = "localhost";
		}
		return hostName;
	}


	public static String resolveVariables(String varString){
		String resolvedString = varString;
		if (resolvedString.indexOf("${ip}") >= 0) {
			resolvedString = resolvedString.replace("${ip}", getSystemIP());
		}
		if (resolvedString.indexOf("${hostname}") >= 0) {
			resolvedString = resolvedString.replace("${hostname}", getHostName());
		}
		return resolvedString;
	}



}
