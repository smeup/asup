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
	public void launch(QContext context, String object) {
		
		Collection<Class<?>> testClasses = TestLauncherHelper.findTestClasses(this, getRunnersDirPath(), object);		
		
		for (Class<?> testClass: testClasses){
						
			QTestRunner testRunner = testManager.prepareRunner(context, testClass);
			QTestResult testResult;
			try {
				testResult = testRunner.call();
				
				// Notify launcher result
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, testResult);
				
			} catch (Exception e) {
				
				QTestResult errorResult = TestLauncherHelper.createErrorResult(this, testRunner, testClass, e.getMessage());
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, errorResult);								
			}
		}
	}
	
	/**
	 * Override to define runners dir path
	 * @return
	 */
	public String getRunnersDirPath() {
		return runnerDirPath;
	}
}
