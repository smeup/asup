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

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.impl.DataWriterImpl;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData {

	private static final long serialVersionUID = 1L;
	protected static final ComparatorType defaultComparator = ComparatorType.EBCDIC;

	private NIOBufferedDataImpl _parent;
	private int _position;

	private transient ByteBuffer _buffer;

	public NIOBufferedDataImpl(QDataContext dataContext) {
		super(dataContext);
	}

	protected NIOBufferedDataImpl getParent() {
		return _parent;
	}

	@Override
	public QNumeric qLen() {

		NIODecimalImpl decimalImpl = new NIODecimalImpl(getDataContext(), 5, 0);
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
			QDataContext tempDataContext = getDataContext();
			
			_parent = null;
			_buffer = null;
			_position = 0;
			_dataContext = null;			
			oos.writeObject(this);
			
			_parent = tempParent;
			_buffer = tempBuffer;
			_position = tempPosition;
			_dataContext = tempDataContext;
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
		nioBufferedData._dataContext = getDataContext();
		// System.out.println(nioBufferedData._position);
	}

	@Override
	public void assign(QBufferedData target) {
		assign(target, 1);

		// TODO remove
		if (target instanceof NIOCharacterVaryingImpl) {
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
//		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.asBytes(), clear, getFiller());
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.getLength(), value.asBytes(), clear, getFiller());	}

	@Override
	public void movea(String value) {
		movea(value, false);
	}

	@Override
	public void movea(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.length(), value.getBytes(), clear, getFiller());
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

			switch (defaultComparator) {
			case ASCII:

				if (dataWriterImpl.object instanceof QBufferedData)
					return asString().equals(((QBufferedData) dataWriterImpl.object).asString());
				else
					return toString().equals(dataWriterImpl.object.toString());

			case EBCDIC:

				if (dataWriterImpl.object instanceof QBufferedData)
					return eq((QBufferedData) dataWriterImpl.object);
				else
					return toString().equals(dataWriterImpl.object.toString());

			}
		}

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

		return compareBytes(asBytes(), value.asBytes()) == 0;

		/*
		 * byte[] a = asBytes(); byte[] a2 = value.asBytes();
		 * 
		 * if(a2.length > a.length) a2 = Arrays.copyOfRange(a2, 0, a.length);
		 * 
		 * return Arrays.equals(a, a2);
		 */
	}

	@Override
	public boolean ne(QBufferedData value) {
		return !eq(value);
	}

	@Override
	public QPointer qAddr() {
		return new NIOPointerImpl(getDataContext(), this);
	}

	public int compareBytes(byte[] b1, byte[] b2) {

		if (b1 == null && b2 == null)
			return 0;

		if (b1 == null)
			return -1;

		if (b2 == null)
			return 1;

		if (b1.length == b2.length) {
			for (int i = 0; i < b1.length; i++) {
				if(b1[i] == b2[i])
					continue;
				
				return toHexString(b1[i]).compareTo(toHexString(b2[i]));
			}
		} else if (b1.length > b2.length) {
			for (int i = 0; i < b1.length; i++) {

				if (i + 1 > b2.length) {
					if (b1[i] == getFiller())
						continue;

					return 1;
				}

				if(b1[i] == b2[i])
					continue;

				return toHexString(b1[i]).compareTo(toHexString(b2[i]));
			}
		} else if (b2.length > b1.length) {
			for (int i = 0; i < b2.length; i++) {

				if (i + 1 > b1.length) {
					if (b2[i] == getFiller())
						continue;

					return -1;
				}

				if(b1[i] == b2[i])
					continue;
				
				return toHexString(b1[i]).compareTo(toHexString(b2[i]));
			}
		}

		return 0;
	}

	public String toHexString(byte b) {

		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexChars = new char[2];

		int v = b & 0xFF;
		hexChars[0] = hexArray[v >>> 4];
		hexChars[1] = hexArray[v & 0x0F];

		return new String(hexChars);
	}

	public String bytesToHex(byte[] bytes) {
		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	protected void _eval(byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, true, getFiller());
	}
}