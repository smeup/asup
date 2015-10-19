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
package org.smeup.sys.il.core.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.meta.QFrameManager;

@Test(category = "IL.CORE", object = "Frame")
public class FrameTester {

	@Inject
	public QTestAsserter testAsserter;

	@Inject
	public QFrameManager frameManager;

	public @TestStarted void main() {

		testAsserter.assertNotNull("FrameManager", frameManager);

	}

}
