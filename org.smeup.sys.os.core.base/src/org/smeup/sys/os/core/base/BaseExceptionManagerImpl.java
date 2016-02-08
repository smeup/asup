/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.core.base;

import java.util.regex.Matcher;

import javax.inject.Inject;

import org.smeup.sys.il.data.annotation.MessageFile;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;

public class BaseExceptionManagerImpl implements QExceptionManager {

	@Inject
	private QResourceManager resourceManager;

	private QMessageFile cpfMessageFile;

	@Override
	public <E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message) {
		return prepareException(job, message, null);
	}

	@Override
	public <E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object variable) {
		if (variable == null)
			return prepareException(job, message, null);
		else
			return prepareException(job, message, new Object[] { variable });
	}

	@Override
	public OperatingSystemMessageException prepareException(QJob job, String messageName, String messageFileName, String messageFileLib, Object[] variables) {
		QMessageDescription messageDescription = findMessageDescription(job, messageName, messageFileName, reader(job, messageFileLib));

		String messageText = "Invalid message file: " + messageFileName;
		String name = messageFileName.toString();
		int severity = -1;

		if (messageDescription != null) {
			messageText = messageDescription.getMessageText();
			name = messageDescription.getName();
			severity = messageDescription.getSeverity();
		}

		for (int i = 0; i < variables.length; i++)
			messageText = messageText.replaceFirst("&" + (i + 1), Matcher.quoteReplacement("" + variables[i]));

		OperatingSystemMessageException messageException = new OperatingSystemMessageException(name, messageText, severity);

		return messageException;
	}

	
	private QResourceReader<QMessageFile> reader(QJob job, String messageFileLib) {
		try {
//			Scope libraryScope = Scope.valueOf(messageFileLib);
			Scope libraryScope = Scope.get(messageFileLib);
			return resourceManager.getResourceReader(job, QMessageFile.class, libraryScope);
		} catch (Exception e) {
			return resourceManager.getResourceReader(job, QMessageFile.class, messageFileLib);
		}		
	}

	@Override
	public <E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object[] variables) {

		if (variables == null)
			variables = new Object[] {};

		String messageFileName = null;
		if (message.getClass().getAnnotation(MessageFile.class) != null)
			messageFileName = message.getClass().getAnnotation(MessageFile.class).name();
		else
			messageFileName = message.getClass().getSimpleName();
		
		String messageName = message.name();
		
		return prepareException(job, messageName, messageFileName, "*LIBL", variables);
	}


	private QMessageDescription findMessageDescription(QJob job, String messageName, String messageFileName, QResourceReader<QMessageFile> messageFileReader) {
		QMessageFile messageFile = null;
		if (messageFileName.equalsIgnoreCase("QCPFMSG")) {
			if (cpfMessageFile == null) {
				synchronized (this) {
					if (cpfMessageFile == null) {
						cpfMessageFile = messageFileReader.lookup(messageFileName);
						messageFile = cpfMessageFile;
					}
				}
				messageFile = cpfMessageFile;
			} else
				messageFile = cpfMessageFile;

		} else
			messageFile = messageFileReader.lookup(messageFileName);

		QMessageDescription messageDescription = null;
		if (messageFile != null)
			messageDescription = messageFile.lookup(messageName);
		return messageDescription;
	}
}