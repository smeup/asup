package org.smeup.sys.il.memo.test;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.base.BaseTestLauncherImpl;
import org.smeup.sys.dk.test.base.TestLauncherHelper;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.rt.core.QApplication;

@Test(category = "IL.MEMO")
public class LanguageMemoryTestLauncherImpl extends BaseTestLauncherImpl {

	@Inject
	private QTestManager testManager;
	@Inject
	private QApplication application;
	
	
	@Override
	public void launch(QContext context, String object) {
		QContext testContext = application.getContext().createChildContext(this.getClass().getSimpleName());
		
		QTestRunner testRunner = null;
		QTestResult testResult = null;
		
		try {
			testRunner = testManager.prepareRunner(testContext, TestWrite.class);
			testResult = testRunner.call();
			
			TestLauncherHelper.notifyResultAdded(context, this, testRunner, testResult);
			
		} catch (Exception e) {
			QTestResult errorResult = TestLauncherHelper.createErrorResult(this, testRunner, TestRead.class, e.getMessage());
			TestLauncherHelper.notifyResultAdded(context, this, testRunner, errorResult);								
		}
		
		if (testResult != null && !testResult.isFailed()) {						
			
			try {
				testRunner = testManager.prepareRunner(testContext, TestRead.class);
				testResult = testRunner.call();
				
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, testResult);
				
			} catch (Exception e) {
				QTestResult errorResult = TestLauncherHelper.createErrorResult(this, testRunner, TestRead.class, e.getMessage());
				TestLauncherHelper.notifyResultAdded(context, this, testRunner, errorResult);								
			}
		}

		
	}

	@Test(category = "IL.MEMO", object = "READ")
	public static class TestRead {

		@Inject
		private QResourceManager resourceManager;
		@Inject
		private QTestRunner testRunner;
		@Inject 
		private QTestAsserter asserter;
		
		
		@TestStarted
		public void start() {
			
			try {
				QResourceReader<QObjectA> applicationReader = resourceManager.getResourceReader(testRunner, QObjectA.class, Scope.ALL);
				
				QObjectIterator<QObjectA> objectIterator = applicationReader.find(null); 
				while(objectIterator.hasNext()) {
					QObjectA objectA = objectIterator.next();					
					asserter.assertNotNull("Read object", objectA);
				}
				
				objectIterator.close();
				
			} catch(Exception exc) {
				asserter.fail("Resource reading failed: " + exc.getMessage());
			}
		}
	}
	

	@Test(category = "IL.MEMO", object = "WRITE")
	public static class TestWrite {

		@Inject
		private QResourceManager resourceManager;
		@Inject
		private QTestRunner testRunner;
		@Inject 
		private QTestAsserter asserter;
		
		@TestStarted
		public void start() {

			try {
				QResourceWriter<QObjectA> objectWriter = resourceManager.getResourceWriter(testRunner, QObjectA.class, "QSYS");
				
				QObjectA objectA = QIntegratedLanguageMemoryTestFactory.eINSTANCE.createObjectA();
				objectA.setName("PIPPO");
				objectA.setText("Pippo text");
				
				QObjectB objectB = QIntegratedLanguageMemoryTestFactory.eINSTANCE.createObjectB();
				objectB.setName("PLUTO");
				objectB.setEnum1(Enum1.VALUE1);		
				objectA.setObjectB(objectB);
				
				objectWriter.save(objectA);
				
				objectA = QIntegratedLanguageMemoryTestFactory.eINSTANCE.createObjectA();
				objectA.setName("PAPERINO");
				objectA.setText("Paperino text");
				
				objectB = QIntegratedLanguageMemoryTestFactory.eINSTANCE.createObjectB();
				objectB.setName("PAPEROGA");
				objectB.setEnum1(Enum1.VALUE2);
				objectA.setObjectB(objectB);
				
				objectWriter.save(objectA);
				
				asserter.success("Resource writing");
				
			} catch (Exception exc) {
				asserter.fail("Resource writing failed: " + exc.getMessage());
			}
		}
	}


	
}