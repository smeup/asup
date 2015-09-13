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
package org.smeup.sys.os.msgf.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.msgf.QMessageFile;
import org.smeup.sys.os.msgf.QMessageFileManager;

@Supported
@Program(name = "QASMSGFOVR")
public class MessageFileOverrider {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QMessageFileManager messageFileManager;
	@Inject
	private QJob job;

	public @Entry void main(@Supported @DataDef(length = 10) QCharacter messageFileBeingOverridden, @Supported @DataDef(qualified = true) OverridingToMessageFile overridingToMessageFile,
			@DataDef(length = 1) QEnum<SecureFromOtherOverridesEnum, QCharacter> secureFromOtherOverrides) {

		QResourceReader<QMessageFile> resource = null;
		String library = null;
		switch (overridingToMessageFile.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceReader(job, QMessageFile.class, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceReader(job, QMessageFile.class, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = overridingToMessageFile.library.asData().trimR();
			resource = resourceManager.getResourceReader(job, QMessageFile.class, library);
			break;
		}

		QMessageFile qMessageFile = resource.lookup(library);

		if (qMessageFile == null)
			throw new OperatingSystemRuntimeException("Message File not found: " + overridingToMessageFile.name);

		messageFileManager.overrideMessageFile(job, messageFileBeingOverridden.trimR(), qMessageFile);
	}

	public static class OverridingToMessageFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum SecureFromOtherOverridesEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}
}
