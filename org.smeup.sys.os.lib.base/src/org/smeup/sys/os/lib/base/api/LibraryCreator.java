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
package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;

@Program(name = "QLICRLIB")
public class LibraryCreator {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Entry
	public void main(
			@Supported @DataDef(length = 10) QCharacter library,
			@ToDo @DataDef(length = 10) QEnum<LibraryTypeEnum, QCharacter> libraryType,
			@Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
		    @ToDo @DataDef(length = 10) QEnum<AuthorityEnum, QCharacter> authority,
			@Unsupported @DataDef(binaryType = BinaryType.SHORT) QEnum<ASPNumberEnum, QBinary> aSPNumber,
			@Unsupported @DataDef(length = 10) QEnum<ASPDeviceEnum, QCharacter> aSPDevice,
			@DataDef(length = 10) QEnum<CreateAuthorityEnum, QCharacter> createAuthority,
			@DataDef(length = 10) QEnum<CreateObjectAuditingEnum, QCharacter> createObjectAuditing,
			@Supported @DataDef(length = 1) QEnum<SYNCHRONIZEDLIBEnum, QCharacter> synchronizedLib) {

		QResourceWriter<QLibrary> libraryWriter = resourceManager
				.getResourceWriter(job, QLibrary.class, systemManager
						.getSystem().getSystemLibrary());

		if (libraryWriter.exists(library.trimR()))
			throw new OperatingSystemRuntimeException(
					"Library already exists: " + library.trimR());

		QLibrary qLibrary = QOperatingSystemLibraryFactory.eINSTANCE
				.createLibrary();
		qLibrary.setName(library.trimR());

		switch (textDescription.asEnum()) {
		case BLANK:
			break;
		case OTHER:
			qLibrary.setText(textDescription.asData().trimR());
			break;
		}

		switch (synchronizedLib.asEnum()) {
		case NO:
			qLibrary.setSynchronized(false);
			break;
		case YES:
			qLibrary.setSynchronized(true);
			break;
		default:
			qLibrary.setSynchronized(false);
			break;

		}

		libraryWriter.save(qLibrary);
	}

	public static enum LibraryTypeEnum {
		@Special(value = "PROD")
		PROD, @Special(value = "TEST")
		TEST
	}

	public static enum TextDescriptionEnum {
		@Special(value = "")
		BLANK, OTHER
	}

	public static enum AuthorityEnum {
		LIBCRTAUT, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum ASPNumberEnum {
		@Special(value = "0")
		ASPDEV, OTHER
	}

	public static enum ASPDeviceEnum {
		ASP, ASPGRPPRI, SYSTEM, OTHER
	}

	public static enum CreateAuthorityEnum {
		SYSVAL, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum CreateObjectAuditingEnum {
		SYSVAL, NONE, USRPRF, CHANGE, ALL
	}

	public static enum SYNCHRONIZEDLIBEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}
}
