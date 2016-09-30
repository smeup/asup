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
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.test.dbf.MUTEST0F;

@Test(object = "RRDS")
public class KSDS_write {

	@Inject
	public transient QTestAsserter testAsserter;
	@Inject
	private QAccessFactory accessFactory;

	@TestStarted
	public void doTest() throws SQLException, IOException {

		testMUTEST();
	}

	private void testMUTEST() {

		QKSDataSet<MUTEST0F> mutest0f = accessFactory.createKeySequencedDataSet(MUTEST0F.class, AccessMode.UPDATE);

		mutest0f.open();
		testAsserter.resetTime();

		MUTEST0F mutestr = mutest0f.get();
		mutestr.clear();

		for (int r = 1; r <= 100; r++) {
			mutestr.mtcate.eval("ILESAM");
			mutestr.mtogge.eval("WRITE");
			mutestr.mterro.eval("RR00" + r);
			mutestr.mtuses.eval("QASUP");

			mutest0f.write();
		}

		/*
		 * int count = 0; brarti2l.setgt("MU"); while (brarti2l.reade("MU"))
		 * count++; testAsserter.assertEquals("Items TIAR=MU count", 100,
		 * count);
		 */

		mutest0f.close();
	}
}
