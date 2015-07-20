/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import java.util.Arrays;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.impl.DataWriterImpl;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData {

	private static final long serialVersionUID = 1L;

	private NIOBufferedDataImpl _parent;
	private int _position;

	private transient ByteBuffer _buffer;

	public NIOBufferedDataImpl() {
		super();
	}

	protected NIOBufferedDataImpl getParent() {
		return _parent;
	}

	@Override
	public QNumeric qLen() {

		NIODecimalImpl decimalImpl = new NIODecimalImpl(5, 0);
		decimalImpl.allocate();
		decimalImpl.eval(getLength());

		return decimalImpl;
	}

	protected abstract byte getFiller();

	@Override
	public NIOBufferedDataImpl copy() {

		try {

			NIOBufferedDataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			// remove buffer and parent reference
			// TODO synchronize
			NIOBufferedDataImpl tempParent = _parent;
			ByteBuffer tempBuffer = _buffer;
			int tempPosition = _position;
			_parent = null;
			_buffer = null;
			_position = 0;
			oos.writeObject(this);
			_parent = tempParent;
			_buffer = tempBuffer;
			_position = tempPosition;
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDataImpl) ois.readObject();
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void allocate() {

		// TODO synchronize
		if (_parent != null || _buffer != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dmn8432m75n030");

		_parent = null;
		_buffer = ByteBuffer.allocate(getSize());

		// TODO performances
		clear();
	}

	public void slice(QBufferedData target, int position) {

		NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);

		if (nioBufferedData == null)
			throw new IntegratedLanguageCoreRuntimeException("No buffer reference found: " + target.getClass());

		// TODO synchronize
		if (nioBufferedData._buffer != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dmn8432m75n031");

		nioBufferedData._parent = this;
		nioBufferedData._buffer = null;
		nioBufferedData._position = position;

		// System.out.println(nioBufferedData._position);
	}

	@Override
	public void assign(QBufferedData target) {
		assign(target, 1);
		
		// TODO remove
		if(target instanceof NIOCharacterVaryingImpl) {
			target.eval(this);
		}
	}

	@Override
	public void assign(QBufferedData target, int position) {

		NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);

		if (nioBufferedData == null)
			throw new IntegratedLanguageCoreRuntimeException("No buffer reference found: " + target.getClass());

		nioBufferedData._parent = null;
		nioBufferedData._buffer = getBuffer();
		nioBufferedData._position = getPosition() + position - 1;
	}

	@Override
	public void clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), getSize(), getFiller());
	}

	@Override
	public boolean isEmpty() {

		byte[] bytes = asBytes();
		for (byte b : bytes)
			if (b != getFiller())
				return false;
		return true;
	}

	@Override
	public boolean isNull() {
		return getBuffer() == null;
	}

	public ByteBuffer getBuffer() {

		// TODO synchronize
		if (_buffer != null)
			return _buffer;
		else if (_parent != null)
			return _parent.getBuffer();
		else
			return null;
	}

	public int getPosition() {

		// TODO synchronize
		if (_parent != null)
			return _parent.getPosition() + _position;
		else
			return _position;
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
		stream.writeObject(_parent);
		stream.writeInt(_position);
	}

	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {

		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);
		Object object = stream.readObject();
		_parent = (NIOBufferedDataImpl) object;
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

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), getSize());
	}

	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		move(Integer.toString(value), clear);
	}

	@Override
	public void move(Number value) {
		move(value, false);
	}

	@Override
	public void move(Number value, boolean clear) {
		move(value.toString(), clear);
	}

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {

		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void movel(int value) {
		movel(value, false);
	}

	@Override
	public void movel(int value, boolean clear) {
		movel(Integer.toString(value), clear);
	}

	@Override
	public void movel(Number value) {
		movel(value, false);
	}

	@Override
	public void movel(Number value, boolean clear) {
		movel(value.toString(), clear);
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.asBytes(), clear, getFiller());
	}

	@Override
	public String toString() {
		try {
			return new String(asBytes());
		} catch (Exception e) {
			// TODO
			return "";
		}
	}

	@Override
	public String asString() {
		return new String(asBytes());
	}

	@Override
	public boolean eq(QDataWriter value) {

		if (value instanceof DataWriterImpl) {
			DataWriterImpl dataWriterImpl = (DataWriterImpl) value;

			if (dataWriterImpl.object instanceof QBufferedData)
				return asString().equals(((QBufferedData) dataWriterImpl.object).asString());
			else
				return toString().equals(dataWriterImpl.object.toString());
		} else
			return false;
	}

	@Override
	public void eval(QDataWriter value) {
		this.accept(value);
	}

	@Override
	public boolean ge(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gt(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean le(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lt(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ne(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(QDataWriter value) {
		// TODO Auto-generated method stub
	}

	@Override
	public void move(QDataWriter value, boolean clear) {
		// TODO Auto-generated method stub
	}

	@Override
	public void movel(QDataWriter value) {
		accept(value);
	}

	@Override
	public void movel(QDataWriter value, boolean clear) {
		// TODO Auto-generated method stub
	}

	@Override
	public String s() {
		return toString();
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(String value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value.getBytes(), clear, getFiller());
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void movel(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.getBytes(), clear, getFiller());
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean eq(QBufferedData value) {
		
		byte[] a = asBytes();
		byte[] a2 = value.asBytes();
		
		if(a2.length > a.length)
			a2 = Arrays.copyOfRange(a2, 0, a.length);
		
		return Arrays.equals(a, a2);
	}

	@Override
	public boolean ne(QBufferedData value) {
		return !eq(value);
	}

	@Override
	public QPointer qAddr() {
		return new NIOPointerImpl(this);
	}
}