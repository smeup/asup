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

import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QStorable;

public class NIOStorageImpl implements QStorable {

	private ByteBuffer byteBuffer = null;
	private int position = 0;

	public NIOStorageImpl(final ByteBuffer byteBuffer, final int position) {
		this.byteBuffer = byteBuffer;
		this.position = position;
	}

	public NIOStorageImpl(final int storageLength) {
		byteBuffer = ByteBuffer.allocate(storageLength);
	}

	@Override
	public final ByteBuffer getBuffer() {
		return byteBuffer;
	}

	@Override
	public final boolean isEmpty() {
		return byteBuffer.capacity() == 0;
	}

	protected final void setPosition(final int position) {
		this.position = position;
	}

	@Override
	public final int getPosition() {
		return position;
	}

	@Override
	public final void assign(final QBufferedData target) {
		NIOBufferHelper.assign(this, target);
	}
}
