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
import org.smeup.sys.dk.test.AssertionState;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QTestResult;

public abstract class BaseTestProviderImpl implements CommandProvider {

	
	protected void printTestResult(QTestResult testResult) {
		
		System.out.println();
		System.out.println(testResult);

		int failedNr = 0;
		int successNr = 0;
		
		for (QAssertionResult assertionResult : testResult.getAssertResults()) {
			if (AssertionState.SUCCESS.equals(assertionResult.getAssertionState())) {
				successNr++;
			} else {
				failedNr++;
			}
			System.out.println("\t" + assertionResult);
		}
		System.out.println("Success: " + successNr);
		if(failedNr >0)
			System.err.println("Failed: " + failedNr);
	}
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
