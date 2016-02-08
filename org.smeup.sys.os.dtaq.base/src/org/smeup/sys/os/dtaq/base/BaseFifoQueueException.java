/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.base;

public class BaseFifoQueueException extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int iErrorCode = -1;

	public final static int QUEUE_ALREADY_EXISTS = 0;
	public final static int QUEUE_DO_NOT_EXISTS = 1;

	public BaseFifoQueueException(int aErrorCode) {
		super();
		iErrorCode = aErrorCode;
	}

	public int getErrorCode() {
		return iErrorCode;
	}

}
