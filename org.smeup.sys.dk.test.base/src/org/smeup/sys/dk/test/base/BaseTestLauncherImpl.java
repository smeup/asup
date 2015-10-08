package org.smeup.sys.dk.test.base;

import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.impl.TestLauncherImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.jobs.QJob;

public class BaseTestLauncherImpl extends TestLauncherImpl {
	
	@Inject
	QJob job;
	
	@Inject
	QTestManager testManager;

	@Override
	public void launchTests(String object) {
		
		// Notify start to all listeners
		for (QTestLauncherListener listener: getListeners()) {
			listener.launcherStarted(this);
		}
		
		QContext context = job.getContext();
		
		Collection<Class<QTestRunner>> testRunners = TestLauncherHelper.findTestRunners(this, object);
		
		for (Class<QTestRunner> testRunnerClass : testRunners) {
			
			Class<?> klass = context.loadClassByName(testRunnerClass.getName());
			
			try {

				QContext testContext = testManager.prepareContext(klass);
				QTestRunner testRunner = testManager.prepareRunner(testContext, klass);					
				QTestResult testResult = testRunner.call();
				
				// Notify result to all listeners
				for (QTestLauncherListener listener: getListeners()) {
					listener.resultAdded(testRunner, testResult);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// Notify start to all listeners
		for (QTestLauncherListener listener: getListeners()) {
			listener.launcherDestroyed(this);
		}
		
	}

	
	/*		
	

*/	 
	

}
