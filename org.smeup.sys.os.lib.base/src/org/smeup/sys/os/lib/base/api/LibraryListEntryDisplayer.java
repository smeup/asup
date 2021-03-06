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
 */
package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;

@Program(name = "QLIDSPLL")
public class LibraryListEntryDisplayer {
	
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	@Main
	public void main(@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {
		jobLogManager.error(job, "***TODO*** Implement API - QLIDSPLL - LibraryListEntryDisplayer");
		System.err.println("***TODO*** Implement API - QLIDSPLL - LibraryListEntryDisplayer");
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

}
