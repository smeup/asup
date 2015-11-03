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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.core.out.QWritableObject;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QLIDSPLL")
public class LibraryListEntryDisplayer {
	
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;

	public @Main void main(@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {

		QObjectWriter objectWriter = null;

		if (output.asEnum().equals(OUTPUTEnum.PRINT)) {
			objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
		} else {
			objectWriter = outputManager.getDefaultWriter(job.getContext());
		}

		objectWriter.initialize();
		
		QWritableObject objectToWrite =outputManager.getWritableObject("Library");
		
		List<String> libs = new ArrayList<String>();
		libs.add(job.getCurrentLibrary() + " - CUR") ;
		libs.addAll(job.getLibraries());				
		for (String lib : libs) {
			objectToWrite.setObject(lib);
			try {
				objectWriter.write(objectToWrite.getObjectToWrite());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		objectWriter.flush();
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, 
		@Special(value = "L")
		PRINT
	}
	
}
