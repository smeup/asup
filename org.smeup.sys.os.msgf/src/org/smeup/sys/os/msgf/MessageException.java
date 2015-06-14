/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message Exception</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageException()
 * @model
 * @generated NOT
 */
public class MessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String messageName;
	private String messageText;
	private int severity;

	public MessageException(String messageName, String messageText, int severity) {
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

} // QMessageException
