/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.dk.test.base;

import org.eclipse.osgi.framework.console.CommandProvider;
import org.smeup.sys.dk.test.QTestResult;

public abstract class BaseTestProviderImpl implements CommandProvider {

	
	protected void printTestResult(QTestResult testResult) {
		
		System.out.println();
		System.out.println(testResult);

		System.out.println("Success: " + testResult.getSuccessCount());
		System.err.println("Failed: " + testResult.getFailedCount());
	}
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
