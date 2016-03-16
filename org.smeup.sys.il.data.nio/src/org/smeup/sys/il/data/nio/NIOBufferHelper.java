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
import java.util.Arrays;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedElementDelegator;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QStorable;

public class NIOBufferHelper {

	public static byte[] read(ByteBuffer buffer, int position, int length) {
		assert buffer != null;

		prepare(buffer, position, length);

		byte[] bytes = new byte[buffer.remaining()];
		buffer.get(bytes);

		return bytes;
	}

	public static void movel(ByteBuffer buffer, int position, int length, byte[] bytes, boolean clear, byte filler) {
		assert buffer != null;

		prepare(buffer, position, length);

		// overflow
		if (bytes.length >= buffer.remaining())
			buffer.put(bytes, 0, buffer.remaining());
		else {
			buffer.put(bytes);

			if (clear) {
				for (int i = buffer.position(); i < buffer.limit(); i++)
					buffer.put(filler);
			}
		}
	}

	public static void move(ByteBuffer buffer, int position, int length, byte[] bytes, boolean clear, byte filler) {
		assert buffer != null;

		prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, bytes.length - buffer.remaining(), buffer.remaining());
		else {

			if (clear) {
				for (int i = buffer.position(); i < buffer.limit() - bytes.length; i++)
					buffer.put(filler);
			} else
				buffer.position(position + buffer.remaining() - bytes.length);

			buffer.put(bytes);
		}
	}

	public static void clear(ByteBuffer buffer, int position, int length, byte filler) {
		assert buffer != null;

		prepare(buffer, position, length);

		for (int i = position; i < buffer.limit(); i++)
			buffer.put(filler);
	}

	public static void prepare(ByteBuffer buffer, int position, int length) {
		assert buffer != null;

		if (position > 0) {
			buffer.position(position);
			
			// overflow
			if (position + length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(position + length);
		} else {
			buffer.position(0);
			if (length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(length);
		}
	}

	public static void fill(ByteBuffer buffer, int position, int length, byte[] filler) {
		assert buffer != null;

		if(filler.length == 1) {
			fill(buffer, position, length, filler[0]);
			return;
		}
		
		prepare(buffer, position, length);

		while(true) {
			int remaining = buffer.remaining();
			if(remaining > filler.length)
				buffer.put(filler);
			else {
				buffer.put(filler, 0, remaining);
				break;
			}
		}
	}

	public static void fill(ByteBuffer buffer, int position, int length, byte filler) {
		assert buffer != null;

		Arrays.fill(buffer.array(), position, position+length, filler);
	}

	public static void assign(QStorable storable, QBufferedData target) {
		assign(storable, target, 1);
	}

	public static void assign(QStorable storable, QBufferedData target, int position) {

		if (position <= 0)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dm5c46dsfgdsf7405mc");

		NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);
		if (nioBufferedData == null)
			throw new IntegratedLanguageCoreRuntimeException("No buffer reference found: " + target.getClass());

		nioBufferedData._buffer = null;
		nioBufferedData._storage = storable;
		nioBufferedData._position = position - 1;
	}

	public static NIOBufferedDataImpl getNIOBufferedDataImpl(QData data) {

		NIOBufferedDataImpl nioBufferedData = null;

		if (data instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl) data;
		else if (data instanceof QBufferedElementDelegator) {
			QBufferedElementDelegator dataDelegator = (QBufferedElementDelegator) data;
			nioBufferedData = getNIOBufferedDataImpl(dataDelegator.getDelegate());
		}

		return nioBufferedData;
	}

	public static NIOBufferedElementImpl getNIOBufferedElementImpl(QData data) {

		NIOBufferedElementImpl nioBufferedElement = null;

		if (data instanceof NIOBufferedElementImpl)
			nioBufferedElement = (NIOBufferedElementImpl) data;
		else if (data instanceof QBufferedElementDelegator) {
			QBufferedElementDelegator dataDelegator = (QBufferedElementDelegator) data;
			nioBufferedElement = getNIOBufferedElementImpl(dataDelegator.getDelegate());
		}

		return nioBufferedElement;
	}
	
	public static ByteBuffer getBuffer(QStorable storable) {

		if (storable instanceof NIOBufferedDataImpl)
			return ((NIOBufferedDataImpl) storable).getBuffer();
		else if (storable instanceof NIOPointerImpl)
			return ((NIOPointerImpl) storable).getBuffer();
		else if (storable != null) {
			return (ByteBuffer) storable.getStore();
		} else
			return null;
	}

	public static final int compareBytes(QBufferedElement bufferedElement, byte[] b2) {
		return compareBytes(getNIOBufferedElementImpl(bufferedElement), b2);
	}

	public static final int compareBytes(NIOBufferedElementImpl bufferedElement, byte[] b2) {
		return compareBytes(bufferedElement._toBytes(), b2, bufferedElement.getFiller());
	}

	public static final int compareBytes(byte[] b1, byte[] b2, byte filler) {

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
					if (b1[i] == filler)
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
					if (b2[i] == filler)
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

	public static final String toHexString(byte b) {

		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexChars = new char[2];

		int v = b & 0xFF;
		hexChars[0] = hexArray[v >>> 4];
		hexChars[1] = hexArray[v & 0x0F];

		return new String(hexChars);
	}

	public static final String bytesToHex(byte[] bytes) {
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

	public static int compareBytes(NIOBufferedElementImpl bufferedElement, DataSpecial value) {

		switch (value) {
		case BLANK:
		case BLANKS:
			if (bufferedElement.getLength() == 0)
				return 0;
			break;
		case HIVAL:
		case LOVAL:
		case NULL:
		case OFF:
		case OMIT:
		case ON:
		case ZERO:
		case ZEROS:
		}

		return NIOBufferHelper.compareBytes(bufferedElement, bufferedElement._toBytes(value));
	}

	public static int compareBytes(NIOBufferedElementImpl bufferedElement, QDataFiller value) {

		int length = bufferedElement.getLength();
		int fillerLength = value.get().getLength();

		if (length == 0)
			if (fillerLength == 0)
				return 0;
			else
				return -1;
		else if (fillerLength == 0)
			return 1;

		ByteBuffer byteBuffer = ByteBuffer.allocate(length);
		NIOBufferHelper.fill(byteBuffer, 0, length, value.get().asBytes());

		return compareBytes(bufferedElement, byteBuffer.array());
	}
}