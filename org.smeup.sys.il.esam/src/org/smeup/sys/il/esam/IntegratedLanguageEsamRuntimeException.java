/**
 *  Copyright (c) 2012, 2015 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

public class IntegratedLanguageEsamRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IntegratedLanguageEsamRuntimeException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}

	public IntegratedLanguageEsamRuntimeException(String message) {
		this(message, null);
	}

	public IntegratedLanguageEsamRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}
