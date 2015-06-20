/**
 *  Copyright (c) 2012, 2015 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

public class DevelopmentKitCompilerException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DevelopmentKitCompilerException(Throwable cause) {
		this(cause.getMessage(), cause.getCause());
	}
	public DevelopmentKitCompilerException(String message) {
		this(message, null);
	}
	public DevelopmentKitCompilerException(String message, Throwable cause) {
		super(message, cause);
	}
}