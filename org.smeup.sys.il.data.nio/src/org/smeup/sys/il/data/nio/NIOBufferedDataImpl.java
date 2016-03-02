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
import java.util.Arrays;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
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
	public QNumeric qLen() {

		QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		number.eval(getLength());

		return number;
	}

	protected abstract byte getFiller();

	@Override
	public NIOBufferedDataImpl copy() {

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
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDataImpl) ois.readObject();
			copy._dataContext = tempDataContext;
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	protected NIOBufferedDataImpl allocate() {

		// TODO synchronize
		if (_storage != null || _buffer != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dmn8432m75n030");

		_buffer = ByteBuffer.allocate(getSize());

		// TODO performances
		clear();

		return this;
	}

	@Override
	public void assign(QBufferedData target) {
		assign(target, 1);
	}

	@Override
	public void assign(QBufferedData target, int position) {

		if (target instanceof NIOAdapterImpl) {
			NIOAdapterImpl nioAdapterImpl = (NIOAdapterImpl) target;
			nioAdapterImpl.setDelegate(this);
			return;
		}

		NIOBufferHelper.assign(this, target, position);
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

	@Override
	public boolean isStoreOwner() {
		return _buffer != null;
	}

	protected ByteBuffer getBuffer() {

		// TODO synchronize
		if (_buffer != null)
			return _buffer;
		else if (_storage != null)
			return NIOBufferHelper.getBuffer(_storage);
		else 
			return null;
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

	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {

		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);
		Object object = stream.readObject();
		_storage = (NIOBufferedDataImpl) object;
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
	public void move(String value) {
		move(value, false);
	}
	
	@Override
	public void movel(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.asBytes(), clear, getFiller());
	}
	
	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value.asBytes(), clear, getFiller());
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
	public void move(QDataFiller value) {
		accept(value);
	}

	@Override
	public void move(QDataFiller value, boolean clear) {
		accept(value);
	}

	@Override
	public void movel(QDataFiller value) {
		accept(value);
	}

	@Override
	public void movel(QDataFiller value, boolean clear) {
		accept(value);
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
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value.getBytes(getDataContext().getCharset()), clear, getFiller());
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
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.getBytes(getDataContext().getCharset()), clear, getFiller());
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
	}

	@Override
	public boolean ne(QBufferedData value) {
		return compareBytes(asBytes(), value.asBytes()) != 0;
	}

	@Override
	public boolean ge(QBufferedData value) {
		return compareBytes(asBytes(), value.asBytes()) >= 0;
	}

	@Override
	public boolean gt(QBufferedData value) {
		return compareBytes(asBytes(), value.asBytes()) > 0;
	}

	@Override
	public boolean le(QBufferedData value) {
		return compareBytes(asBytes(), value.asBytes()) <= 0;
	}

	@Override
	public boolean lt(QBufferedData value) {
		return compareBytes(asBytes(), value.asBytes()) < 0;
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
				if (b1[i] == b2[i])
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

				if (b1[i] == b2[i])
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

				if (b1[i] == b2[i])
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

	@Override
	public void eval(byte value) {
		_eval(new byte[] { value });
	}

	protected void _eval(byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, true, getFiller());
	}

	@Override
	public boolean eq(byte value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ne(byte value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ge(byte value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gt(byte value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean le(byte value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lt(byte value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getStore() {
		return getBuffer();
	}

	@Override
	public int getPosition() {

		// TODO synchronize
		if (_storage != null)
			return _storage.getPosition() + _position;
		else
			return _position;
	}

	@Override
	public void eval(QDataFiller value) {
		accept(value);
	}

	@Override
	public boolean eq(QDataFiller value) {

		QBufferedData copy = copy().allocate();
		copy.fill(value.get());

		return eq(copy);
	}

	@Override
	public boolean ge(QDataFiller value) {

		QBufferedData copy = copy().allocate();
		copy.fill(value.get());

		return ge(copy);
	}

	@Override
	public boolean gt(QDataFiller value) {

		QBufferedData copy = copy().allocate();
		copy.fill(value.get());

		return gt(copy);
	}

	@Override
	public boolean le(QDataFiller value) {

		QBufferedData copy = copy().allocate();
		copy.fill(value.get());

		return le(copy);
	}

	@Override
	public boolean lt(QDataFiller value) {

		QBufferedData copy = copy().allocate();
		copy.fill(value.get());

		return lt(copy);
	}

	@Override
	public boolean ne(QDataFiller value) {

		QBufferedData copy = copy().allocate();
		copy.fill(value.get());

		return ne(copy);
	}

	@Override
	public void fill(QBufferedData filler) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getLength(), filler.asBytes());
	}

	@Override
	public void accept(QDataVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(boolean value) {
		move(value, false);
	}

	@Override
	public void movel(boolean value) {
		movel(value, false);		
	}

	@Override
	public void move(boolean value, boolean clear) {
		if(value)
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), new byte[]{NIOIndicatorImpl.ON}, clear, getFiller());		
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), new byte[]{NIOIndicatorImpl.OFF}, clear, getFiller());
	}

	@Override
	public void movel(boolean value, boolean clear) {
		if(value)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), new byte[]{NIOIndicatorImpl.ON}, clear, getFiller());		
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), new byte[]{NIOIndicatorImpl.OFF}, clear, getFiller());		
	}	

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, QNumeric startIndex) {
		movea(value, startIndex.i());
	}

	@Override
	public void movea(QArray<?> value, QNumeric startIndex, boolean clear) {
		movea(value, startIndex.i(), clear);
	}

	@Override
	public void movea(QArray<?> value, int startIndex) {
		movea(value, startIndex, false);
	}

	@Override
	public void movea(QArray<?> value, int startIndex, boolean clear) {
//		movel(value.get(startIndex), true);
		// TODO verify me
		int position = ((value.getLength() / value.capacity()) * (startIndex - 1));
		byte[] bytes = value.asBytes();
		bytes = Arrays.copyOfRange(bytes, position, bytes.length);
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.getSize(), bytes, clear, getFiller());
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.getLength(), value.asBytes(), clear, getFiller());
	}
}