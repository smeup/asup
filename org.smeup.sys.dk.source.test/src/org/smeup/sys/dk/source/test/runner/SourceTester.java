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
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QRuntimeCoreFactory;

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

		QContext context = testRunner.getContext();
		
		QProjectDef projectDef = QDevelopmentKitSourceFactory.eINSTANCE.createProjectDef();
		projectDef.setName("P_TEST");
		projectDef.setText("Test project P_TEST");
		
		QProject project = sourceManager.createProject(context, projectDef, true);
		
		testAsserter.assertTrue("Project creation", project != null);
		testAsserter.assertEquals("Project name", projectDef.getName(), project.getName());
		testAsserter.assertEquals("Project description", projectDef.getText(), project.getText());
		
		QApplicationComponent applicationComponent = QRuntimeCoreFactory.eINSTANCE.createApplicationComponent();
		applicationComponent.setName("test");
		
		context.close();
//		QSourceEntry objectEntry = sourceManager.createObjectEntry(context, project.getName(), QApplicationComponent.class, "test", true, applicationComponent);
//		testAsserter.assertNotNull("Test sourceEntry creation", objectEntry);

	}
}
