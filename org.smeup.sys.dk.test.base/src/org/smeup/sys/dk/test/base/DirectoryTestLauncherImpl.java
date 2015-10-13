package org.smeup.sys.dk.test.base;

import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.ctx.QContext;

public abstract class DirectoryTestLauncherImpl extends BaseTestLauncherImpl {

	@Inject
	QTestManager testManager;
	
	private String runnerDirPath = "/runner/";	

	@Override
	public void launch(String object) {
		
		// Notify launcher start
		TestLauncherHelper.notifyLauncherStarted(this);
		
		Collection<Class<?>> testRunners = TestLauncherHelper.findTestClasses(this, runnerDirPath, object);		
		
		for (Class<?> testRunnerClass: testRunners){
			
			QContext testContext = testManager.prepareContext(testRunnerClass);
			QTestRunner testRunner = testManager.prepareRunner(testContext, testRunnerClass);
			QTestResult testResult;
			try {
				testResult = testRunner.call();
				
				// Notify launcher result
				TestLauncherHelper.notifyResultAdded(this, testRunner, testResult);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// Notify launcher stop
		TestLauncherHelper.notifyLauncherStopped(this);
	}	
}
