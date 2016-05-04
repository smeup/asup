/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QASTHDRL")
public class ThreadReleaser {

	@Inject
	private QThreadManager threadManager;

	@Main
	public void main(@Supported @DataDef(precision = 10, packed = true) QDecimal threadId) {

		QThread thread = threadManager.lookupThread(threadId.asLong());
		if (thread != null)
			threadManager.release(thread);
	}
}
