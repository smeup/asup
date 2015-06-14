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
package org.smeup.sys.os.splf.base.api;

import javax.inject.Inject;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.splf.QSpoolFile;
import org.smeup.sys.os.splf.QSpoolFileWriter;

public @Program(name = "QMUSPLFP") class SpoolFilePrinter {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	public static enum QCPFMSG {
	}

	public @Entry void main(@DataDef(length = 255) QCharacter spoolID) {

		QResourceReader<QSpoolFile> spoolFileReader = resourceManager.getResourceReader(job, QSpoolFile.class, job.getSystem().getSystemLibrary());
		QSpoolFile spoolFile = spoolFileReader.lookup(spoolID.trimR());

		BundleContext bundleContext = FrameworkUtil.getBundle(QJob.class).getBundleContext();

		try {
			for (ServiceReference<QSpoolFileWriter> sfw : bundleContext.getServiceReferences(QSpoolFileWriter.class, null)) {
				QSpoolFileWriter sw = bundleContext.getService(sfw);
				System.out.println(sw);
			}
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(spoolFile);
	}
}
