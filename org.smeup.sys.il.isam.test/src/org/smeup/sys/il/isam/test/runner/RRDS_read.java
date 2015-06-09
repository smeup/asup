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
import org.smeup.sys.il.isam.test.dbf.BRENTI0F;

@Test(category = "ILISAM", object = "RRDS")
public class RRDS_read {

	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QIsamFactory isamFactory;

	@TestStarted
	public void doTest() throws SQLException, IOException {

		testBRARTI();

		testBRENTI();
	}

	private void testBRARTI() {

		QRRDataSet<BRARTI0F> brarti0f = isamFactory.createRelativeRecordDataSet(BRARTI0F.class);

		brarti0f.open();

		testAsserter.resetTime();
		int count = 0;
		while (brarti0f.read())
			count++;
		testAsserter.assertEquals("Items count", 9574, count);

		brarti0f.close();
	}

	private void testBRENTI() {

		QRRDataSet<BRENTI0F> brenti0f = isamFactory.createRelativeRecordDataSet(BRENTI0F.class);

		brenti0f.open();

		testAsserter.resetTime();
		int count = 0;
		while (brenti0f.read())
			count++;
		testAsserter.assertEquals("Customers count", 33198, count);

		brenti0f.close();

	}
}
