package org.smeup.sys.os.core.base;

import java.util.regex.Matcher;

import javax.inject.Inject;

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
	public <E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object variable) {
		if (variable == null)
			return prepareException(job, message, null);
		else
			return prepareException(job, message, new Object[] { variable });
	}

	@Override
	public <E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object[] variables) {

		if (variables == null)
			variables = new Object[] {};

		QResourceReader<QMessageFile> messageFileReader = resourceManager.getResourceReader(job, QMessageFile.class, Scope.LIBRARY_LIST);

		QMessageFile qMessageFile = null;

		if (message.getClass().getSimpleName().equalsIgnoreCase("QCPFMSG")) {
			if (cpfMessageFile == null) {
				synchronized (this) {
					if (cpfMessageFile == null) {
						cpfMessageFile = messageFileReader.lookup(message.getClass().getSimpleName());
						qMessageFile = cpfMessageFile;
					}
				}
				qMessageFile = cpfMessageFile;
			} else
				qMessageFile = cpfMessageFile;

		} else
			qMessageFile = messageFileReader.lookup(message.getClass().getSimpleName());

		QMessageDescription messageDescription = null;
		if (qMessageFile != null)
			messageDescription = qMessageFile.lookup(message);

		String messageText = "Invalid message file: " + message;
		String name = message.toString();
		int severity = 0;

		if (messageDescription != null) {
			messageText = messageDescription.getMessageText();
			name = messageDescription.getName();
			severity = messageDescription.getSeverity();
		}

		for (int i = 0; i < variables.length; i++)
			messageText = messageText.replaceFirst("&" + (i + 1), Matcher.quoteReplacement("" + variables[i]));

		OperatingSystemMessageException messageException = new OperatingSystemMessageException(name, messageText, severity);

		// TODO ???
		// jobLogManager.addEntry(job, severity, messageText);

		return messageException;

	}
}