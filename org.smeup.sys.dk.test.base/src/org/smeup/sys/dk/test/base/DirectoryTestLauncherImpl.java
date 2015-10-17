package org.smeup.sys.dk.test.base;

import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.impl.DevelopmentKitTestFactoryImpl;
import org.smeup.sys.il.core.ctx.QContext;

public abstract class DirectoryTestLauncherImpl extends BaseTestLauncherImpl {

	@Inject
	QTestManager testManager;
	
	private String runnerDirPath = "/runner/";	

	@Override
	public void launch(QContext context, String object) {
		
		// Notify launcher start
		TestLauncherHelper.notifyLauncherStarted(context, this);
		
		Collection<Class<?>> testClasses = TestLauncherHelper.findTestClasses(this, runnerDirPath, object);		
		
		for (Class<?> testClass: testClasses){
						
			QTestRunner testRunner = testManager.prepareRunner(context, testClass);
			QTestResult testResult;
			try {
				testResult = testRunner.call();
				
				// Notify launcher result
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, testResult);
				
			} catch (Exception e) {
				
				QTestResult errorResult = DevelopmentKitTestFactoryImpl.eINSTANCE.createTestResult();
			
				errorResult.setRunner(testRunner.getClass().getSimpleName());
				
				Test testCalssAnnotation = testClass.getAnnotation(Test.class);
				if (testCalssAnnotation != null) {
					errorResult.setObject(testCalssAnnotation.object());
				} else {
					errorResult.setObject("");
				}

				errorResult.setCategory(getCategory());
				errorResult.setFailed(true);
				
				QAssertionFailed assertionFailed = DevelopmentKitTestFactoryImpl.eINSTANCE.createAssertionFailed();
				assertionFailed.setMessage(e.getMessage());
				assertionFailed.setTime(0);
				
				errorResult.getAssertResults().add(assertionFailed);

				TestLauncherHelper.notifyResultAdded(context, this, testRunner, errorResult);				
				
			}
		}
		
		// Notify launcher stop
		TestLauncherHelper.notifyLauncherStopped(context, this);
	}	
}
