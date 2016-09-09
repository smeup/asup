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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QStorable;

public final class NIOStorageImpl implements QStorable {

	private static final long serialVersionUID = 1L;

	private transient ByteBuffer _storage = null;
	private int position = 0;

	public NIOStorageImpl(final ByteBuffer storage, final int position) {
		this._storage = storage;
		this.position = position;
	}

	public NIOStorageImpl(final int storageLength) {
		_storage = ByteBuffer.allocate(storageLength);
	}

	@Override
	public final ByteBuffer getBuffer() {
		return _storage;
	}

	@Override
	public final boolean isEmpty() {
		return _storage.capacity() == 0;
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

	private final void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {

		stream.defaultReadObject();

		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);
		_storage = ByteBuffer.allocate(length).put(array);
	}

	private final void writeObject(final ObjectOutputStream stream) throws IOException {

		stream.defaultWriteObject();

		byte[] array = _storage.array();
		stream.writeInt(array.length);
		stream.write(array);
	}
}