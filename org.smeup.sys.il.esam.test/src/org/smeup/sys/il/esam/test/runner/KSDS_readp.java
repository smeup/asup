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
package org.smeup.sys.il.esam.test.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.esam.QAccessContext;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.test.dbf.BRARTI2L;

@Test(object = "KSDS")
public class KSDS_readp {

	@Inject
	public transient QTestAsserter testAsserter;
	@Inject
	private QAccessContext accessContext;

	@TestStarted
	public void doTest() throws SQLException, IOException {

		testBRARTI();

	}

	private void testBRARTI() {

		QKSDataSet<BRARTI2L> brarti2l = accessContext.getAccessFactory().createKeySequencedDataSet(BRARTI2L.class);

		brarti2l.open();
		testAsserter.resetTime();

		int count = 0;
		brarti2l.setgt(new Object[] { "ART", "EM-057" });
		while (brarti2l.readpe("ART"))
			count++;
		testAsserter.assertEquals("Items TIAR=ART and ARTI<=EM-057 count", 327, count);

		brarti2l.close();
	}
}
