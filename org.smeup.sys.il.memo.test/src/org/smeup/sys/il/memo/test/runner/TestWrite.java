package org.smeup.sys.il.memo.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.test.Enum1;
import org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestFactory;
import org.smeup.sys.il.memo.test.QObjectA;
import org.smeup.sys.il.memo.test.QObjectB;

@Test(object = "Object")
public class TestWrite {

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