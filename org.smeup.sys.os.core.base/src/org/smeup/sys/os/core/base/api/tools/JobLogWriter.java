/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api.tools;

import java.io.IOException;

import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;

public class JobLogWriter {

	private QObjectWriter objectWriter;

	public JobLogWriter(QObjectWriter objectWriter) {
		this.objectWriter = objectWriter;
	}

	public void write(QJobLog jobLog) {
		objectWriter.initialize();
		write(objectWriter, jobLog);
		objectWriter.flush();		
	}

	private void write(QObjectWriter objectWriter, QJobLog jobLog) {
		try {
			for (QJobLogEntry jobLogEntry : jobLog.getEntries())
				objectWriter.write(jobLogEntry);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

}
