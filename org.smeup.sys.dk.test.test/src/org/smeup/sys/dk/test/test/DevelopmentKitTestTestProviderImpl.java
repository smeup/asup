package org.smeup.sys.dk.test.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.dk.test.test.runner.TestTester;
import org.smeup.sys.il.core.ctx.QContext;

public class DevelopmentKitTestTestProviderImpl extends E4TestProviderImpl {


	@Inject
	private QTestManager testManager;

	public void _testDKTest(CommandInterpreter interpreter) throws Exception {

		QContext testContext = testManager.prepareContext(this.getClass());

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, TestTester.class);
			QTestResult testResult = testRunner.call();
			
			printTestResult(testResult);
		}
		finally {
			if(testContext != null)
				testContext.close();
		}
	
	}
}
