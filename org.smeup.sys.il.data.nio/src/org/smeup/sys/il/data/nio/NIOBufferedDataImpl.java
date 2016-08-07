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

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData {

	private static final long serialVersionUID = 1L;

	protected transient ByteBuffer _buffer;
	
	protected QStorable _storage;
	protected int _position = 0; // 1 based
	protected transient byte[] _reset;

	public NIOBufferedDataImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	protected final QDataContext getDataContext() {

		if (_dataContext == null) {
			final NIOBufferedDataImpl nioBufferedDataImpl = NIOBufferHelper.getNIOBufferedDataImpl((_storage));
			if(nioBufferedDataImpl != null)
				return nioBufferedDataImpl.getDataContext();
			else
				return null;
		}
		else
			return _dataContext;
	}
	
	@Override
	public final void slice(final QBufferedData target) {
		NIOBufferHelper.slice(this, target, 1);
	}

	protected final boolean isSliced() {
		return _position > 0;
	}

	protected final void checkAllocation() {

		if (_storage != null || _buffer != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dmn8432m75n030");
	}

	@Override
	public final ByteBuffer getBuffer() {

		// TODO synchronize
		if (_buffer != null)
			return _buffer;
		else if (_storage != null)
			return NIOBufferHelper.getBuffer(_storage);
		else
			return null;
	}

	@Override
	public final int getPosition() {

		// TODO synchronize
		if (_storage != null) {
			if (_position > 0)
				return _storage.getPosition() + _position - 1;
			else
				return _storage.getPosition();
		} else if (_position > 0)
			return _position - 1;
		else
			return 0;
	}

	@Override
	public final QPointer qAddr() {
		return new NIOPointerImpl(getDataContext(), this);
	}

	@Override
	public final boolean isNull() {
		return getBuffer() == null;
	}

	@Override
	public final boolean isStoreOwner() {
		return _buffer != null;
	}

	private final void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {

		stream.defaultReadObject();
		
		final int length = stream.readInt();
		final byte[] array = new byte[length];
		stream.read(array);

		if (length > 0) {
			_buffer = ByteBuffer.allocate(length);
			_buffer.put(array);
		}
	}

	private final void writeObject(final ObjectOutputStream stream) throws IOException {

		stream.defaultWriteObject();
		
		// TODO synchronize
		byte[] array = null;
		if (_buffer != null)
			array = _buffer.array();
		else
			array = new byte[0];

		stream.writeInt(array.length);
		stream.write(array);
	}
}