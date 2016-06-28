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
	
	public NIOStorageImpl(ByteBuffer byteBuffer, int position) {
		this.byteBuffer = byteBuffer;
		this.position = position;
	}
	
	public NIOStorageImpl(int storageLength) {
		this.byteBuffer = ByteBuffer.allocate(storageLength);
	}

	@Override
	public boolean isEmpty() {
		return byteBuffer.capacity() == 0;
	}

	@Override
	public Object getStore() {
		return byteBuffer;
	}

	protected void setPosition(int position) {
		this.position = position;
	}
	
	@Override
	public int getPosition() {
		return position;
	}

	@Override
	public void assign(QBufferedData target) {
		NIOBufferHelper.assign(this, target);
	}
}
