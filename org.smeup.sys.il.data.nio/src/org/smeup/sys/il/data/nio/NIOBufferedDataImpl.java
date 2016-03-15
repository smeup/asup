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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData {

	private static final long serialVersionUID = 1L;

	protected transient ByteBuffer _buffer;
	protected QStorable _storage;
	protected int _position; // 0 based

	public NIOBufferedDataImpl(QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	public final void assign(QBufferedData target) {
		assign(target, 1);
	}

	@Override
	public void assign(QBufferedData target, int position) {
		NIOBufferHelper.assign(this, target, position);
	}

	protected NIOBufferedDataImpl allocate() {

		// TODO synchronize
		if (_storage != null || _buffer != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dmn8432m75n030");

		_buffer = ByteBuffer.allocate(getSize());

		NIOBufferHelper.fill(_buffer, 0, _buffer.capacity(), getFiller());

		return this;
	}

	protected final ByteBuffer getBuffer() {

		// TODO synchronize
		if (_buffer != null)
			return _buffer;
		else if (_storage != null)
			return NIOBufferHelper.getBuffer(_storage);
		else
			return null;
	}

	@Override
	public final Object getStore() {
		return getBuffer();
	}

	@Override
	public final int getPosition() {

		// TODO synchronize
		if (_storage != null)
			return _storage.getPosition() + _position;
		else
			return _position;
	}

	@Override
	public final QPointer qAddr() {
		return new NIOPointerImpl(getDataContext(), this);
	}

	@Override
	public final QNumeric qLen() {

		QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		number.eval(getLength());

		return number;
	}
	
	@Override
	public final boolean isNull() {
		return getBuffer() == null;
	}

	@Override
	public final boolean isStoreOwner() {
		return _buffer != null;
	}

	protected abstract byte getFiller();

	@Override
	protected final NIOBufferedDataImpl copy() {

		try {

			NIOBufferedDataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			QStorable tempStorage = _storage;
			ByteBuffer tempBuffer = _buffer;
			int tempPosition = _position;
			QDataContext tempDataContext = getDataContext();

			_storage = null;
			_buffer = null;
			_position = 0;

			_dataContext = null;

			oos.writeObject(this);

			_storage = tempStorage;
			_buffer = tempBuffer;
			_position = tempPosition;

			_dataContext = tempDataContext;
			baos.close();
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDataImpl) ois.readObject();
			copy._dataContext = tempDataContext;
			bais.close();
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {

		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);
		_storage = (NIOBufferedDataImpl) stream.readObject();
		_position = stream.readInt();

		// TODO
		if (_position == 538976288) {
			System.err.println("Unexpected condition: xm74tx045m07");
			_position = 0;
		}

		if (length > 0) {
			_buffer = ByteBuffer.allocate(length);
			_buffer.put(array);
		}
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {

		// TODO synchronize
		byte[] array = null;
		if (_buffer != null)
			array = _buffer.array();
		else
			array = new byte[0];

		stream.writeInt(array.length);
		stream.write(array);
		stream.writeObject(_storage);
		stream.writeInt(_position);
	}
}