package org.smeup.sys.os.core.base;

import java.util.regex.Matcher;

import javax.inject.Inject;

import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;

public class BaseExceptionManagerImpl implements QExceptionManager {


	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobLogManager jobLogManager;
	
	@Override
	public <E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object[] variables) {

		QResourceReader<QMessageFile> messageFileReader = resourceManager.getResourceReader(job, QMessageFile.class, Scope.LIBRARY_LIST);
		
		QMessageFile qMessageFile = messageFileReader.lookup(message.getClass().getSimpleName());

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

		// TODO
		if (variables != null && variables.length > 0 && variables[0] != null)
			messageText = messageText.replaceFirst("&1", Matcher.quoteReplacement(variables[0].toString()));

		OperatingSystemMessageException messageException = new OperatingSystemMessageException(name, messageText, severity);

		jobLogManager.addEntry(job, severity, messageText);
		
		return messageException;

	}

}
