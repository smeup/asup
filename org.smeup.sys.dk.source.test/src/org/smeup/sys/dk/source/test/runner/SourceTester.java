/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.dk.source.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.source.QDevelopmentKitSourceFactory;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.dk.test.QDevelopmentKitTestFactory;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestObject;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;

@Test(category = "DK.SOURCE", object = "Manager")
public class SourceTester {

	@Inject
	private QTestAsserter testAsserter;
	
	@Inject
	private QTestRunner testRunner;
	
	@Inject
	private QSourceManager sourceManager;

	@TestStarted
	public void main() throws IOException {

		QProjectDef projectDef = QDevelopmentKitSourceFactory.eINSTANCE.createProjectDef();
		projectDef.setName("P_TEST");
		projectDef.setText("Test project P_TEST");

		QProject project = sourceManager.createProject(testRunner.getContext(), projectDef, true);		
		testAsserter.assertNotNull("Project creation", project);
		testAsserter.assertEquals("Project name", projectDef.getName(), project.getName());
		testAsserter.assertEquals("Project description", projectDef.getText(), project.getText());
		
		QTestObject testObject = QDevelopmentKitTestFactory.eINSTANCE.createTestObject();
		testObject.setName("testName");
		testObject.setStringProperty("abcdefg");
		testObject.setIntegerProperty(123);
		QSourceEntry sourceEntry = sourceManager.createObjectEntry(testRunner.getContext(), project, QTestObject.class, "testName", true, testObject);
		testAsserter.assertNotNull("Source entry creation", sourceEntry);
		
		sourceEntry = sourceManager.getObjectEntry(testRunner.getContext(), project, QTestObject.class, "testName");
		testAsserter.assertNotNull("Source entry lookup", sourceEntry);
		testAsserter.assertEquals("Source entry name", sourceEntry.getName(), "testName");
		
		testObject = sourceEntry.load(QTestObject.class);
		testAsserter.assertNotNull("Source entry load", sourceEntry);
		testAsserter.assertEquals("Source entry stringPropery", testObject.getStringProperty(), "abcdefg");
		testAsserter.assertEquals("Source entry integerPropery", testObject.getIntegerProperty(), 123);
		
		sourceManager.removeEntry(testRunner.getContext(), sourceEntry);
		sourceEntry = sourceManager.getObjectEntry(testRunner.getContext(), project, QTestObject.class, "testName");
		testAsserter.assertNull("Source entry remove", sourceEntry);
		
		for(int i=0; i<10; i++) {
			testObject = QDevelopmentKitTestFactory.eINSTANCE.createTestObject();
			testObject.setName("testName_"+i);
			testObject.setStringProperty("abc"+i);
			testObject.setIntegerProperty(i);
			sourceEntry = sourceManager.createObjectEntry(testRunner.getContext(), project, QTestObject.class, "testName_"+i, true, testObject);
			testAsserter.assertNotNull("Source entry lookup testName_"+i, sourceEntry);
		}
		
		sourceEntry = sourceManager.getObjectEntry(testRunner.getContext(), project, QTestObject.class, "testName_5");
		testAsserter.assertNotNull("Source entry lookup testName_5", sourceEntry);
		testObject = sourceEntry.load(QTestObject.class);
		testAsserter.assertEquals("Source entry stringPropery", testObject.getStringProperty(), "abc5");
		testAsserter.assertEquals("Source entry integerPropery", testObject.getIntegerProperty(), 5);
		
		for(int i=0; i<10; i++) {
			sourceEntry = sourceManager.getObjectEntry(testRunner.getContext(), project, QTestObject.class, "testName_"+i);
			testAsserter.assertNotNull("Source entry lookup testName_"+i, sourceEntry);
		}
		
		sourceManager.deleteProject(testRunner.getContext(), project);
		
		project = sourceManager.getProject(testRunner.getContext(), projectDef.getName());
		testAsserter.assertNull("Project deleted", project);
	}
}
