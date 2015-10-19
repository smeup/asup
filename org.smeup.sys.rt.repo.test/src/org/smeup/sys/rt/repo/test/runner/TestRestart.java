/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.rt.repo.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.rt.core.QApplicationManager;

@Test(category = "RT.REPO", object = "RepoRestart")
public class TestRestart {
	
	@Inject
	private QApplicationManager applicationManager;
	
	@Inject
	private QTestAsserter testAsserter;
	

	@TestStarted
	public void main() {

		try {
			applicationManager.restart();
			testAsserter.success("Application manager restart OK");
		} catch(Exception exc) {
			testAsserter.fail("Application manager restart failed: " + exc.getMessage());
		}
	}
	
	
}
