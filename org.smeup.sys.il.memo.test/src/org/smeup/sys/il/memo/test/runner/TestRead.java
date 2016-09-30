package org.smeup.sys.il.memo.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.il.memo.test.QObjectA;

@Test(object = "Object")
public class TestRead {
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QTestRunner testRunner;
	@Inject 
	public transient QTestAsserter asserter;
	
	
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

