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
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.msgf.QMessageFile;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFileFactory;

@Supported
@Program(name = "QMHCRMSF")
public class MessageFileCreator {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	@Main
	public void main(@Supported @DataDef(qualified = true) MessageFile messageFile, @Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription, FileSize fileSize,
			@DataDef(length = 10) QEnum<AuthorityEnum, QCharacter> authority, @DataDef(binaryType = BinaryType.INTEGER) QEnum<CodedCharacterSetIDEnum, QBinary> codedCharacterSetID) {

		QResourceWriter<QMessageFile> resource = null;
		String library = null;

		switch (messageFile.library.asEnum()) {
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, library);
			break;
		}

		QMessageFile qMessageFile = resource.lookup(messageFile.name.trimR());
		if (qMessageFile != null)
			throw new OperatingSystemRuntimeException("Message File " + messageFile.name + " already exists in library " + library);

		qMessageFile = QOperatingSystemMessageFileFactory.eINSTANCE.createMessageFile();

		// MSGF
		qMessageFile.setName(messageFile.name.trimR());
		// qMessageFile.setLibrary(library);

		// TEXT
		switch (textDescription.asEnum()) {
		case BLANK:
			qMessageFile.setText("");
			break;
		case OTHER:
			qMessageFile.setText(textDescription.asData().trimR());
			break;
		}

		resource.save(qMessageFile);
		jobLogManager.info(job, "Message File " + messageFile.name.trimR() + " created");
	}

	public static class MessageFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*CURLIB")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			CURLIB, OTHER
		}
	}

	public static enum TextDescriptionEnum {
		@Special(value = "")
		BLANK, OTHER
	}

	public static class FileSize extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT, value = "10")
		public QBinary initialStorageSize;
		@DataDef(binaryType = BinaryType.SHORT, value = "2")
		public QBinary incrementStorageSize;
		@DataDef(binaryType = BinaryType.SHORT, value = "*NOMAX")
		public QEnum<MaximumIncrementsEnum, QBinary> maximumIncrements;

		public static enum MaximumIncrementsEnum {
			@Special(value = "-1")
			NOMAX, OTHER
		}
	}

	public static enum AuthorityEnum {
		LIBCRTAUT, CHANGE, ALL, USE, EXCLUDE, OTHER
	}

	public static enum CodedCharacterSetIDEnum {
		@Special(value = "65535")
		HEX, @Special(value = "65534")
		MSGD, @Special(value = "0")
		JOB, OTHER
	}
}
