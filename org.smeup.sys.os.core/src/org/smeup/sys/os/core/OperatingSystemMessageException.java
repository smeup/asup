/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

public class OperatingSystemMessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String messageName;
	private String messageText;
	private int severity;

	public OperatingSystemMessageException(String messageName, String messageText, int severity) {
		super(messageText);
		this.messageName = messageName;
		this.messageText = messageText;
		this.severity = severity;
	}

	public String getMessageName() {
		return messageName;
	}

	public String getMessageText() {
		return messageText;
	}

	public int getSeverity() {
		return severity;
	}

	@Override
	public String toString() {
		return messageName + " " + messageText;
	}
}
