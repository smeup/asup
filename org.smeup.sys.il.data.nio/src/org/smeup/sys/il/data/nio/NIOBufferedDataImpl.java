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
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData {

	private static final long serialVersionUID = 1L;

	protected transient Object _storage;
	protected int _position = 0;
	protected transient byte[] _reset;

	public NIOBufferedDataImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	protected abstract NIODataImpl _copyDef(QDataContext dataContext);
	
	@Override
	protected final QDataContext getDataContext() {

		if (_dataContext == null && _storage instanceof QStorable) {
			final NIOBufferedDataImpl nioBufferedDataImpl = NIOBufferHelper.getNIOBufferedDataImpl((QStorable)_storage);
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

	@Override
	public final ByteBuffer getBuffer() {

		if(_storage == null)
			return null;
		
		if (_storage instanceof ByteBuffer)
			return (ByteBuffer)_storage;
		else 
			return NIOBufferHelper.getBuffer((QStorable)_storage);
	}

	@Override
	public final int getPosition() {

		if (_storage instanceof QStorable) {
			if (_position > 0)
				return ((QStorable)_storage).getPosition() + _position - 1;
			else
				return ((QStorable)_storage).getPosition();
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
		return _storage instanceof ByteBuffer;
	}

	private final void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {

		stream.defaultReadObject();

		// storage
		Object object = stream.readObject();
		if(object instanceof QStorable) {
			_storage = object;
		}
		else if(object instanceof NIOObjectBuffer) {
			
			NIOObjectBuffer nioObjectBuffer = (NIOObjectBuffer)object;
			_storage = nioObjectBuffer.getByteBuffer();
		}
		else
			_storage = null;
	}

	private final void writeObject(final ObjectOutputStream stream) throws IOException {

		stream.defaultWriteObject();
		
		// storage
		if(_storage instanceof QStorable)
			stream.writeObject(_storage);
		else if(_storage instanceof ByteBuffer) {
			ByteBuffer byteBuffer = (ByteBuffer)_storage;
			
			if(stream instanceof NIOContextOutputStreamImpl) {
				NIOContextOutputStreamImpl nioContextOutputStreamImpl = (NIOContextOutputStreamImpl)stream;
				if(nioContextOutputStreamImpl.isAllocated())
					stream.writeObject(new NIOObjectBuffer(byteBuffer.array()));
				else
					stream.writeObject(NIOObjectNull.getInstance());
			}
			else 
				stream.writeObject(new NIOObjectBuffer(byteBuffer.array()));
		}
		else {
			stream.writeObject(NIOObjectNull.getInstance());
		}
	}
}