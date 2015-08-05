/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

public class OperatingSystemRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OperatingSystemRuntimeException(String message) {
		super(message);
	}

	public OperatingSystemRuntimeException(Throwable cause) {
		super(cause);
	}

	public OperatingSystemRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
	
	@Override
	public String toString() {
		Throwable originalException = getCause();
		if ( originalException != null && (originalException instanceof OperatingSystemMessageException)) {
			return originalException.toString();
		}
		return super.toString();
	}
}
