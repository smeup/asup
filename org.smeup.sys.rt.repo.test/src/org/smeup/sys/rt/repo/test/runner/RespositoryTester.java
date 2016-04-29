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
package org.smeup.sys.rt.repo.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.repo.QRepositoryManager;

@Test(object = "Repository")
public class RespositoryTester {

	@Inject
	private QApplication application;
	@Inject
	private QApplicationManager applicationManager;
	@Inject
	private QRepositoryManager repositoryManager;
	@Inject
	private QTestAsserter testAsserter;

	@SuppressWarnings("unused")
	@TestStarted
	public void main() {

		if(true)
			return;
	}
	
	
}
