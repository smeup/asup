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
package org.smeup.sys.os.lib.base.api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.base.api.tools.CurrentLibraryChangeHelper;

@Program(name = "QLICHLIB")
public class LibraryListChanger {

	public static enum QCPFMSG {
		CPF2110
	}

	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QJobLogManager jobLogManager;

	@Main
	public void main(@DataDef(dimension = 250, length = 10) QScroller<QEnum<LIBRARIESFORCURRENTTHREADEnum, QCharacter>> librariesForCurrentThread,
			@DataDef(length = 10) QEnum<CURRENTLIBRARYEnum, QCharacter> currentLibrary) {

		switch (librariesForCurrentThread.first().asEnum()) {
		case SAME:
			break;

		case NONE:
			job.getLibraries().removeAll(job.getLibraries());
			break;

		case OTHER:
			librariesForCurrentThread.count();
			List<String> newLibList = new ArrayList<String>();
			for (QEnum<LIBRARIESFORCURRENTTHREADEnum, QCharacter> libEnum : librariesForCurrentThread) {
				String lib = libEnum.asData().trimR();
				if (!lib.equals("")) {
					newLibList.add(lib);
				}
			}
			if (newLibList.size() > 0) {
				job.getLibraries().removeAll(job.getLibraries());
				job.getLibraries().addAll(newLibList);
			}
			break;
		}

		new CurrentLibraryChangeHelper(job, libraryManager, jobLogManager, exceptionManager).changeCurrentLibrary(currentLibrary);
	}

	public static enum LIBRARIESFORCURRENTTHREADEnum {
		SAME, NONE, OTHER
	}
}
