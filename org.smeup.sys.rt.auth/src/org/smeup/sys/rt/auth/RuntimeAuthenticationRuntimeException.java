/**
 *  Copyright (c) 2012, 2016 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.auth;

public class RuntimeAuthenticationRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RuntimeAuthenticationRuntimeException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}

	public RuntimeAuthenticationRuntimeException(String message) {
		this(message, null);
	}

	public RuntimeAuthenticationRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}
