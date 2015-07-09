/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.msgf.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.msgf.QMessageFile;

@Supported
@Program(name = "QMHCHMSF")
public class MessageFileChanger {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(@Supported @DataDef(qualified = true) MessageFile messageFile, @Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID) {

		QResourceWriter<QMessageFile> resource = null;
		// MSGF
		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.CURRENT_LIBRARY);
			break;
		case USRLIBL:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.USER_LIBRARY_LIST);
			break;
		case ALLUSR:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.ALL_USER);
			break;
		case ALL:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.ALL);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, library);
			break;
		}

		String name = null;
		switch (messageFile.name.asEnum()) {
		case ALL:
			// TODO
			// il nome può essere anche *ALL, gestiamo questa cosa?
			name = messageFile.name.getSpecialName();
			break;
		case OTHER:
			name = messageFile.name.asData().trimR();
			break;
		}

		QMessageFile qMessageFile = resource.lookup(name);
		if (qMessageFile == null)
			throw new OperatingSystemRuntimeException("Message File " + name + " not exists in library " + library);

		// TEXT
		switch (textDescription.asEnum()) {
		case SAME:
			break;
		case BLANK:
			qMessageFile.setText("");
			break;
		case OTHER:
			qMessageFile.setText(textDescription.asData().trimR());
			break;
		}

		resource.save(qMessageFile, true);
		jobLogManager.info(job, "Message File " + name + " changed");
	}

	public static class MessageFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGenericEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameGenericEnum {
			ALL, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}

	public static enum TextDescriptionEnum {
		SAME, BLANK, OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "-1")
		SAME, @Special(value = "65535")
		HEX, @Special(value = "65534")
		MSGD, @Special(value = "0")
		JOB, OTHER
	}
}
