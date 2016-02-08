/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.il.core.QObjectIterator;
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
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.msgf.QMessageFile;

@Supported
@Program(name = "QMHCHMSF")
public class MessageFileChanger {

	public static enum QCPFMSG {
		CPF2407, //Non è stato trovato il file messaggi &1 nella libreria &2 
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Main
	public void main(@Supported @DataDef(qualified = true) MessageFile messageFile, @Supported @DataDef(length = 50) QEnum<TextDescriptionEnum, QCharacter> textDescription,
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
			name = "*";
			break;
		case OTHER:
			name = messageFile.name.asData().trimR();
			break;
		}


		int changed = 0;
		try (QObjectIterator<QMessageFile> qMessageFiles = resource.find(name)) {
			while (qMessageFiles.hasNext()) {
				QMessageFile qMessageFile = qMessageFiles.next();
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
				changed++;
				jobLogManager.info(job, "Message File " + name + " changed");
			}
		}
		if (changed == 0) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2407, new String[] {name, library});
		}
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
