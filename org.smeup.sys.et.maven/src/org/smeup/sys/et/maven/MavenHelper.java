/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial implementation
 */

package org.smeup.sys.et.maven;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;

public class MavenHelper {
	
	public static boolean executeMavenTask(String pomFilePath, String... parms) {
		
		boolean result = false;
		
		InvocationRequest request = new DefaultInvocationRequest();

		Invoker invoker = new DefaultInvoker();
		
		File pomFile = new File(pomFilePath);
		request.setPomFile(pomFile);

		List<String> goals = new ArrayList<String>();
		for (String parm: parms) {
			goals.add(parm);
		}
		request.setGoals(goals);

		try {
			InvocationResult invocationResult = invoker.execute(request);

			if (invocationResult.getExitCode() != 0) {
				if (invocationResult.getExecutionException() != null) {
					System.out.println("Maven task failed: " + invocationResult.getExecutionException().getMessage());
				} else {
					System.out.println("Maven task failed: " + invocationResult.getExitCode());
				}
				
				result = false;
				
			} else {
				result = true;
			}

		} catch (MavenInvocationException e) {
			result = false;
		}
		
		return result;
	}

}
