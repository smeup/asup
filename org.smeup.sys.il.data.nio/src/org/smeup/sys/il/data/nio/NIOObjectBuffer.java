/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.data.nio;

import java.io.Serializable;
import java.nio.ByteBuffer;

public class NIOObjectBuffer implements Serializable  {
	private static final long serialVersionUID = 1L;

	private byte[] content;
	
	public NIOObjectBuffer(byte[] content) {
		this.content = content;
	}
	
	protected ByteBuffer getByteBuffer() {
		return ByteBuffer.wrap(content);
	}
}
