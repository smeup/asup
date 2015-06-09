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
package org.smeup.sys.il.isam.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.isam.QIsamFactory;
import org.smeup.sys.il.isam.QRRDataSet;
import org.smeup.sys.il.isam.test.dbf.BRARTI0F;

@Test(category = "ILISAM", object = "RRDS")
public class RRDS_readp {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;

	@TestStarted
	public void doTest() throws SQLException, IOException {

		testBRARTI();
	}

	private void testBRARTI() {

		QRRDataSet<BRARTI0F> brarti0f = isamFactory.createRelativeRecordDataSet(BRARTI0F.class);

		brarti0f.open();

		testAsserter.resetTime();
		int count = 0;
		brarti0f.setgt(Integer.MAX_VALUE);
		while (brarti0f.readp())
			count++;
		testAsserter.assertEquals("Items count", 9574, count);

		brarti0f.close();

		brarti0f.open();

		testAsserter.resetTime();
		boolean first = true;
		while (brarti0f.read())
			if (first && brarti0f.get().açarti.eq("00104600138")) {
				first = false;

				brarti0f.readp();
				brarti0f.readp();
				brarti0f.readp();

				brarti0f.read();
				testAsserter.assertEquals("Item code", "00104400069", brarti0f.get().açarti.trimR());
			}

		brarti0f.close();
	}

}
