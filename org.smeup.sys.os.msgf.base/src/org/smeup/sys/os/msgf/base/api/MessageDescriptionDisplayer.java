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

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.msgf.QMessageDataField;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;

@Supported
@Program(name = "QMHDSMSF")
public class MessageDescriptionDisplayer {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(@Supported QEnum<RangeOfMessageIdentifiersEnum, RangeOfMessageIdentifiers> rangeOfMessageIdentifiers, @Supported @DataDef(qualified = true) MessageFile messageFile,
			@ToDo @DataDef(length = 6) QEnum<DetailEnum, QCharacter> detail, @ToDo @DataDef(length = 1) QEnum<FormatMessageTextEnum, QCharacter> formatMessageText,
			@Supported @DataDef(length = 1) QEnum<OutputEnum, QCharacter> output) {

		QResourceWriter<QMessageFile> resource = null;
		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.USER_LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, library);
			break;
		}

		QMessageFile qMessageFile = resource.lookup(messageFile.name.trimR());
		if (qMessageFile == null)
			throw new OperatingSystemRuntimeException("Message File " + messageFile.name + " not exists in library " + library);

		QObjectWriter objectWriter = null;
		switch (output.asEnum()) {
		case PRINT:
			objectWriter = outputManager.getObjectWriter(job.getContext(), output.getSpecialName());
			break;
		case TERM_STAR:
			objectWriter = outputManager.getObjectWriter(job.getContext(), output.asData().trimR());
			break;
		}
		objectWriter.initialize();

		// RANGE
		switch (rangeOfMessageIdentifiers.asEnum()) {
		case ALL:
			for (QMessageDescription qMessageDescription : qMessageFile.getMessages())
				writeRecord(qMessageDescription, objectWriter, detail);
			break;
		case OTHER:
			boolean exit = false;
			for (QMessageDescription qMessageDescription : qMessageFile.getMessages()) {
				switch (rangeOfMessageIdentifiers.asData().lowerValue.asEnum()) {
				case FIRST:
					break;
				case OTHER:
					if (rangeOfMessageIdentifiers.asData().lowerValue.asData().trimR().compareTo(qMessageDescription.getName()) > 0)
						continue;
					break;
				}
				switch (rangeOfMessageIdentifiers.asData().upperValue.asEnum()) {
				case LAST:
					break;
				case ONLY:
					exit = true;
					break;
				case OTHER:
					if (rangeOfMessageIdentifiers.asData().upperValue.asData().trimR().compareTo(qMessageDescription.getName()) < 0)
						continue;
					break;
				}

				writeRecord(qMessageDescription, objectWriter, detail);
				if (exit)
					break;
			}
			break;
		}

		/*
		 * for (QJob qJob : jobManager.getActiveJobs()) { try {
		 * objectWriter.write(qJob); } catch (IOException e) { throw new
		 * OperatingSystemRuntimeException(e); } }
		 */
		objectWriter.flush();
	}

	private void writeRecord(QMessageDescription qMessageDescription, QObjectWriter objectWriter, QEnum<DetailEnum, QCharacter> detail) {
		try {
			objectWriter.write(qMessageDescription);
			switch (detail.asEnum()) {
			case BASIC:
				break;
			case FULL:
				for (QMessageDataField qMessageDescriptionDataField : qMessageDescription.getMessageDataFields())
					try {
						objectWriter.write(qMessageDescriptionDataField);
					} catch (IOException e) {
						jobLogManager.error(job, e.getMessage());
					}
				break;
			}

		} catch (IOException e) {
			jobLogManager.error(job, e.getMessage());
		}
	}

	public static class RangeOfMessageIdentifiers extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 7, value = "*FIRST")
		public QEnum<LowerValueEnum, QCharacter> lowerValue;
		@DataDef(length = 7, value = "*ONLY")
		public QEnum<UpperValueEnum, QCharacter> upperValue;

		public static enum LowerValueEnum {
			FIRST, OTHER
		}

		public static enum UpperValueEnum {
			ONLY, LAST, OTHER
		}
	}

	public static enum RangeOfMessageIdentifiersEnum {
		ALL, OTHER
	}

	public static class MessageFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "QCPFMSG")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, OTHER
		}
	}

	public static enum DetailEnum {
		BASIC, FULL
	}

	public static enum FormatMessageTextEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum OutputEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}
}
