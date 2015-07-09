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
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;

@Supported
@Program(name = "QMHDLMSD")
public class MessageDescriptionRemover {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(@Supported @DataDef(length = 7) QCharacter messageIdentifier, @Supported @DataDef(qualified = true) MessageFile messageFile) {

		QResourceWriter<QMessageFile> resource = null;

		String library = null;
		switch (messageFile.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, Scope.LIBRARY_LIST);
			break;
		case OTHER:
			library = messageFile.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QMessageFile.class, library);
			break;
		}

		@SuppressWarnings("unused")
		QMessageDescription qMessageDescription = (QMessageDescription) resource.lookup(messageIdentifier.trimR());

		// TODO non ho trovato modo migliore al momento
		try {
			QMessageFile qMessageFile = resource.lookup(messageFile.name.trimR());
			if (qMessageFile == null)
				throw new OperatingSystemException("Message File " + messageFile.name + " not exists in library " + library);

			int ii = 0;
			for (QMessageDescription messageDescription : qMessageFile.getMessages())
				if (messageDescription.getName().equals(messageIdentifier.trimR())) {
					ii++;
					qMessageFile.getMessages().remove(messageDescription);
					jobLogManager.info(job, "Message Description " + messageIdentifier + " deleted ");
					resource.save(qMessageFile, true);
					break;
				}
			if (ii == 0)
				throw new OperatingSystemException("Message Description " + messageIdentifier + " not exist");
		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class MessageFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB")
			CURLIB, OTHER
		}
	}
}