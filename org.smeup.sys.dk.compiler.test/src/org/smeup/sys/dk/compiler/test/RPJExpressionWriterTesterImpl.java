package org.smeup.sys.dk.compiler.test;
/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */


import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.ctx.QContext;

public class RPJExpressionWriterTesterImpl extends E4TestProviderImpl{

		
	@Inject
	private QTestManager testManager;


	public void _testRPJWriter(CommandInterpreter interpreter){

		QContext testContext = testManager.prepareContext(this.getClass());
		QTestRunner testRunner = testManager.prepareRunner(testContext, WriteRPJ.class);
		QTestResult testResult;
		try {
			testResult = testRunner.call();
			printTestResult(testResult);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

