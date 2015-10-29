/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.il.memo.test;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.dk.test.base.MultipleTestLauncherImpl;
import org.smeup.sys.dk.test.base.TestLauncherHelper;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;

@Test(category = "IL.MEMO")
public class LanguageMemoryTestLauncherImpl extends MultipleTestLauncherImpl {
	
	@Override
	public void destroy(QContext context) {
		super.destroy(context);
	}


	@Override
	public void init(QContext context) {
		super.init(context);
	}


	@Override
	public Collection<Class<?>> getTestClassList(String object) {
		
		Collection<Class<?>> testClasses = new ArrayList<Class<?>>();
		if (object.length() == 0) {			
			testClasses.add(TestWrite.class);
			testClasses.add(TestRead.class);
			
		} else {
			// Filter test classes by object
			
			if (TestLauncherHelper.validateTestClassByObject(TestWrite.class, object)) {
				testClasses.add(TestWrite.class);
			}
						
			if (TestLauncherHelper.validateTestClassByObject(TestRead.class, object)) {
				testClasses.add(TestRead.class);
			}
			
		}
		return testClasses;				
	}


	@Override
	public boolean breaksOnFirstFailedTest() {		
		return true;
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