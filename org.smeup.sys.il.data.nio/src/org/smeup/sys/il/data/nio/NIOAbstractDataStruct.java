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
import java.io.ObjectStreamClass;
import java.nio.ByteBuffer;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIOAbstractDataStruct extends NIOCharacterImpl implements QDataStruct {

	private static final long serialVersionUID = 1L;

	public NIOAbstractDataStruct(final QDataContext dataContext, final int length) {
		super(dataContext, length);
	}

	protected final void _allocate() {
		checkAllocation();
		_buffer = ByteBuffer.allocate(getSize());
		NIOBufferHelper.fill(_buffer, 0, _buffer.capacity(), INIT);
	}

	@Override
	public final String toString() {
		return asString();
	}

	@Override
	public final int getLength() {
		return _maxLength;
	}

	@Override
	public final int getSize() {
		return _maxLength;
	}

	protected abstract void addElement(String name, QBufferedData element, int position);

	@Override
	public final void clear() {

		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), INIT);

		for (final QBufferedData element : this.getElements())
			element.clear();
	}

	@Override
	public final boolean isEmpty() {

		for (final QBufferedData element : this.getElements())
			if (!element.isEmpty())
				return false;

		return eq(DataSpecial.BLANKS);
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final void eval(final String value) {
		_write(value.getBytes(getDataContext().getCharset()));
	}

	@Override
	public final void snap() {

		if (!isEmpty())
			_reset = NIOBufferHelper.read(this);

		for (final QBufferedData element : getElements()) 
			element.snap();
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
	
		try {

			NIODataImpl copy = null;

			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final ObjectOutputStream oos = new ObjectOutputStream(baos);

			final QStorable tempStorage = _storage;
			final ByteBuffer tempBuffer = _buffer;
			final int tempPosition = _position;

			_storage = null;
			_buffer = null;
			_position = 0;
			oos.writeObject(this);
			_storage = tempStorage;
			_buffer = tempBuffer;
			_position = tempPosition;

			baos.close();
			oos.close();

			final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			final ObjectInputStream ois = new ObjectInputStream(bais) {
				@Override
				protected Class<?> resolveClass(final ObjectStreamClass desc) throws IOException, ClassNotFoundException {
					try {
						return super.resolveClass(desc);
					} catch (final Exception e) {
						if (NIOAbstractDataStruct.this instanceof NIODataStructWrapperHandler) {
							final NIODataStructWrapperHandler nioDataStructWrapperHandler = (NIODataStructWrapperHandler) NIOAbstractDataStruct.this;
							final Class<?> c = nioDataStructWrapperHandler._wrapped.getClass().getClassLoader().loadClass(desc.getName());
							return c;
						}

						throw e;
					}
				}
			};
			copy = (NIODataImpl) ois.readObject();
			copy._dataContext = dataContext;
			bais.close();
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public final boolean isVarying() {
		return false;
	}

	@Override
	protected final void cat(final byte[] factor1, final byte[] factor2, final Number space, final boolean clear) {

		final ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), getLength());

		int remaining = buffer.remaining();
		if (remaining > factor1.length) {
			buffer.put(factor1);
			remaining = remaining - factor1.length;
		} else {
			buffer.put(factor1, 0, remaining);
			return;
		}

		if (space != null) {
			final int s = space.intValue();
			if (s > remaining) {
				for (int i = 0; i < remaining; i++)
					buffer.put(INIT);
				return;
			} else {
				for (int i = 0; i < s; i++)
					buffer.put(INIT);

				remaining = remaining - s;
			}
		}

		if (remaining > factor2.length)
			buffer.put(factor2);
		else {
			buffer.put(factor2, 0, remaining);
			return;
		}

		if (clear)
			while (buffer.hasRemaining())
				buffer.put(INIT);
	}

	@Override
	protected final void _fill(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _fillr(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _write(final byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, INIT);
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	public final byte[] asBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}

	@Override
	public final QNumeric qLen() {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		number.eval(getLength());

		return number;
	}
	

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	public final void evalr(final QString value) {

		final byte[] bytes = value.asBytes();
		if (bytes.length > _maxLength)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final void evalr(final String value) {

		final byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (bytes.length > _maxLength)
			_move(bytes, false);
		else
			_move(bytes, true);
	}
}