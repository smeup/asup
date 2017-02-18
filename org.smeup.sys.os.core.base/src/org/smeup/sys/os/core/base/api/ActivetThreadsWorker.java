/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.os.core.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadInfo;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.impl.OperatingSystemCoreFactoryImpl;
import org.smeup.sys.os.core.jobs.QJob;


@Program(name = "QWCCDSACTHD")
public class ActivetThreadsWorker {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QThreadManager threadManager;
	
	@Main
	public void main(@Supported @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output) {
		QObjectWriter objectWriter = null;

		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			break;
		case TERM_STAR:
			objectWriter = outputManager.getDefaultWriter(job.getContext());
			break;
		}
		
		objectWriter.initialize();
		
		for (QThread thread :threadManager.listThreads())
			try {
				objectWriter.write(threadManager.getThreadInfo(thread));
			} catch (IOException e) {
				throw new OperatingSystemRuntimeException(e);
			}

		objectWriter.flush();		
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, 
		@Special(value = "L")
		PRINT
	}
}