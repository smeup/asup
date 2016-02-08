/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti	- Initial API and implementation
 */
package org.smeup.sys.dk.test.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;

@Test(category = "DK.TEST", object = "ASSERTER")
public class TestTester {

	@Inject
	private QTestAsserter testAsserter;

	@TestStarted
	public void main() {

		testAsserter.assertTrue("Assert true success", true);
		testAsserter.assertTrue("Assert true failed", false);

		testAsserter.assertNull("Assert null success", null);
		testAsserter.assertNull("Assert null failed", new Object());

		testAsserter.assertNotNull("Assert not null success", new Object());
		testAsserter.assertNotNull("Assert not null failed", null);

		testAsserter.assertEquals("Assert equals boolean success", true, true);
		testAsserter.assertEquals("Assert equals boolean failed", true, false);

		testAsserter.assertEquals("Assert equals String success", "abc", "abc");
		testAsserter.assertEquals("Assert equals boolean failed", "abc", "cba");

		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		Integer obj3 = new Integer(1);
		testAsserter.assertEquals("Assert equals Object success", obj1, obj3);
		testAsserter.assertEquals("Assert equals Object failed", obj1, obj2);

		testAsserter.assertSame("Assert same Object success", obj1, obj1);
		testAsserter.assertSame("Assert same Object failed", obj1, new Integer(1));

		testAsserter.assertNotSame("Assert not same Object success", obj1, new Integer(1));
		testAsserter.assertNotSame("Assert not same Object failed", obj1, obj1);

		testAsserter.assertEquals("Assert equals double success", 1d, 1d);
		testAsserter.assertEquals("Assert equals double failed", 1d, 2d);

		testAsserter.assertEquals("Assert equals double delta success", 1d, 4d, 3d);
		testAsserter.assertEquals("Assert equals double delta failed", 1d, 4d, 2d);

		testAsserter.assertEquals("Assert equals float success", 1f, 1f);
		testAsserter.assertEquals("Assert equals float failed", 1f, 2f);

		testAsserter.assertEquals("Assert equals float delta success", 1f, 4f, 3f);
		testAsserter.assertEquals("Assert equals float delta failed", 1f, 4f, 2f);

		testAsserter.assertEquals("Assert equals int success", 1, 1);
		testAsserter.assertEquals("Assert equals int failed", 1, 2);

		testAsserter.assertEquals("Assert equals char success", 'a', 'a');
		testAsserter.assertEquals("Assert equals char failed", 'a', 'b');
	}
}
