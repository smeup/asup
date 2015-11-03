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

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;

@Program(name = "QLICHGLB")
public class LibraryChanger {

	public static enum QCPFMSG {
		CPF9810
	}
	
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;

	public @Main void main(
			@DataDef(length = 10) QEnum<LIBRARYEnum, QCharacter> library,
			@DataDef(length = 7) QEnum<LIBRARYTYPEEnum, QCharacter> libraryType,
			@DataDef(length = 50) QEnum<TEXTDESCRIPTIONEnum, QCharacter> textDescription,
			@DataDef(length = 10) QEnum<CREATEAUTHORITYEnum, QCharacter> createAuthority,
			@DataDef(length = 10) QEnum<CREATEOBJECTAUDITINGEnum, QCharacter> createObjectAuditing,
			@DataDef(length = 1) QEnum<SYNCHRONIZEDLIBEnum, QCharacter> synchronizedLib) {

		String libraryName = null;

		switch (library.asEnum()) {
		case CURLIB:

			break;
		case OTHER:
			libraryName = library.asData().trimR();
			break;
		}

		if (libraryName != null && libraryName.length() > 0) {

			QResourceReader<QLibrary> libraryReader = libraryManager
					.getLibraryReader(job);

			if (!libraryReader.exists(libraryName))
				throw exceptionManager.prepareException(job, QCPFMSG.CPF9810, new String[] {libraryName});		
			
			QLibrary qLibrary = libraryReader.lookup(libraryName);

			String text = null;
			switch (textDescription.asEnum()) {
			case BLANK:
				text = "";
				break;
			case OTHER:
				text = textDescription.asData().toString();
				break;
			case SAME:
				break;
			default:
				break;

			}

			switch (synchronizedLib.asEnum()) {
			case NO:
				qLibrary.setSynchronized(false);
				break;
			case YES:
				qLibrary.setSynchronized(true);
				break;
			case SAME:

				break;
			default:
				qLibrary.setSynchronized(false);
				break;
			}

			if (text != null) {
				qLibrary.setText(text);
			}

			// Save changes
			libraryManager.getLibraryWriter(job).save(qLibrary, true);

		}

	}

	public static enum LIBRARYEnum {
		CURLIB, OTHER
	}

	public static enum LIBRARYTYPEEnum {
		SAME, @Special(value = "PROD")
		PROD, @Special(value = "TEST")
		TEST
	}

	public static enum TEXTDESCRIPTIONEnum {
		SAME, @Special(value = "")
		BLANK, OTHER
	}

	public static enum CREATEAUTHORITYEnum {
		SAME, SYSVAL, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum CREATEOBJECTAUDITINGEnum {
		SAME, SYSVAL, NONE, USRPRF, CHANGE, ALL
	}

	public static enum SYNCHRONIZEDLIBEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES, @Special(value = "S")
		SAME
	}
}
