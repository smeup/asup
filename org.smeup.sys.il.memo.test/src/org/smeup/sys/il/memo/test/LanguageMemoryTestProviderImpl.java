package org.smeup.sys.il.memo.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.e4.E4TestProviderImpl;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.rt.core.QApplication;

public class LanguageMemoryTestProviderImpl extends E4TestProviderImpl {

	@Inject
	private QTestManager testManager;
	@Inject
	private QApplication application;

	public void _testMemo(CommandInterpreter commandInterpreter) {
		
		QContext testContext = application.getContext().createChildContext(this.getClass().getSimpleName());
		
		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, TestWrite.class);
			QTestResult testResult = testRunner.call();
			printTestResult(testResult);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			QTestRunner testRunner = testManager.prepareRunner(testContext, TestRead.class);
			QTestResult testResult = testRunner.call();
			printTestResult(testResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test(category = "ILMEMO", object = "READ")
	public static class TestRead {

		@Inject
		private QResourceManager resourceManager;
		@Inject
		private QTestRunner testRunner;
		
		@TestStarted
		public void start() {

			QResourceReader<QObjectA> applicationReader = resourceManager.getResourceReader(testRunner, QObjectA.class, Scope.ALL);
			
			QObjectIterator<QObjectA> objectIterator = applicationReader.find(null); 
			while(objectIterator.hasNext()) {
				QObjectA objectA = objectIterator.next();
				System.out.println(objectA);
			}
			
			objectIterator.close();
		}
	}
	

	@Test(category = "ILMEMO", object = "WRITE")
	public static class TestWrite {

		@Inject
		private QResourceManager resourceManager;
		@Inject
		private QTestRunner testRunner;
		
		@TestStarted
		public void start() {

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
		}
	}
}