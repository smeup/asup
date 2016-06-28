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
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedElementDelegator;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;

public class NIOBufferHelper {
	
	private static final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	
	public static void movel(ByteBuffer buffer, int position, int length, byte[] bytes) {
		prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, 0, buffer.remaining());
		else {
			buffer.put(bytes);
		}
	}

	public static void movel(ByteBuffer buffer, int position, int length, byte[] bytes, byte filler) {
		prepare(buffer, position, length);

		// overflow
		if (bytes.length >= buffer.remaining())
			buffer.put(bytes, 0, buffer.remaining());
		else {
			buffer.put(bytes);
			while (buffer.hasRemaining())
				buffer.put(filler);
		}
	}

	public static void move(ByteBuffer buffer, int position, int length, byte[] bytes) {
		prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, bytes.length - buffer.remaining(), buffer.remaining());
		else {

			buffer.position(position + buffer.remaining() - bytes.length);
			buffer.put(bytes);
		}
	}

	public static void move(ByteBuffer buffer, int position, int length, byte[] bytes, byte filler) {
		prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, bytes.length - buffer.remaining(), buffer.remaining());
		else {

			for (int i = buffer.position(); i < buffer.limit() - bytes.length; i++)
				buffer.put(filler);

			buffer.put(bytes);
		}
	}

	public static void prepare(ByteBuffer buffer, int position, int length) {

		if (position > 0) {

			// overflow
			if (position + length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(position + length);

			buffer.position(position);
		} else {
			if (length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(length);

			buffer.position(0);
		}
	}

	public static void fill(ByteBuffer buffer, int position, int length, byte[] filler) {

		if (filler.length == 0)
			return;

		if (filler.length == 1) {
			fill(buffer, position, length, filler[0]);
			return;
		}

		prepare(buffer, position, length);

		while (true) {
			int remaining = buffer.remaining();
			if (remaining > filler.length)
				buffer.put(filler);
			else {
				buffer.put(filler, 0, remaining);
				break;
			}
		}
	}

	public static void fill(ByteBuffer buffer, int position, int length, byte filler) {

		if (buffer.isDirect())
			Arrays.fill(buffer.array(), position, position + length, filler);
		else {
			NIOBufferHelper.prepare(buffer, position, length);
			while(buffer.hasRemaining())
				buffer.put(filler);
		}
	}

	public static void fillr(ByteBuffer buffer, int position, int length, byte[] filler) {

		if (filler.length == 0)
			return;

		if (filler.length == 1) {
			fill(buffer, position, length, filler[0]);
			return;
		}

		int remainder = length % filler.length;
		if (remainder == 0) {
			fill(buffer, position, length, filler);
			return;
		}

		prepare(buffer, position, length);
		if (remainder == length) {
			buffer.put(filler, filler.length - length, length);
			return;
		}

		buffer.put(filler, filler.length - remainder, remainder);
		while (true) {
			int remaining = buffer.remaining();
			if (remaining > filler.length)
				buffer.put(filler);
			else {
				buffer.put(filler, 0, remaining);
				break;
			}
		}
	}

	public static void assign(QStorable storable, QBufferedData target) {
		NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);
		if (nioBufferedData == null)
			throw new IntegratedLanguageCoreRuntimeException("No buffer reference found: " + target.getClass());

		nioBufferedData._buffer = null;
		nioBufferedData._storage = storable;
		nioBufferedData._position = 0;
	}

	public static void slice(QStorable storable, QBufferedData target, int position) {

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
		if (data instanceof QScroller<?>) {
			NIOScrollerImpl<?> nioScrollerImpl = (NIOScrollerImpl<?>)data;
			data = nioScrollerImpl.current();
		}
		
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

		byte filler = 0;
		switch (bufferedElement.getBufferedElementType()) {
		case DATETIME:
			filler = NIODatetimeImpl.INIT;
			break;
		case NUMERIC:
			filler = NIODecimalImpl.INIT;
			break;
		case STRING:
			filler = NIOStringImpl.INIT;
			break;
		}

		return compareBytes(bufferedElement._toBytes(), b2, filler);
	}

	public static final int compareBytes(byte[] b1, byte[] b2, byte filler) {

		if (b2 == null)
			return 1;

		if (b1.length == b2.length) {
			for (int i = 0; i < b1.length; i++) {
				if (b1[i] == b2[i])
					continue;

				return compareByte(b1[i], b2[i]);
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

				return compareByte(b1[i], b2[i]);
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

				return compareByte(b1[i], b2[i]);
			}
		}

		return 0;
	}

	public static int compareByte(byte b1, byte b2) {
		return toHexString(b1).compareTo(toHexString(b2));
	}

	public static final String toHexString(byte b) {

		char[] hexChars = new char[2];

		int v = b & 0xFF;
		hexChars[0] = hexArray[v >>> 4];
		hexChars[1] = hexArray[v & 0x0F];

		return new String(hexChars);
	}

	public static final String bytesToHex(byte[] bytes) {
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

		return compareBytes(bufferedElement, bufferedElement._toBytes(value));
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
		fill(byteBuffer, 0, length, value.get().asBytes());

		return compareBytes(bufferedElement, byteBuffer.array());
	}

	public static byte[] trim(QString string) {

		byte[] bytes = string.asBytes();
		int i = 0;
		while (i < bytes.length && (bytes[i] == NIOStringImpl.INIT || bytes[i] == 0))
			i++;

		int f = bytes.length - 1;
		while (f >= i && (bytes[f] == NIOStringImpl.INIT || bytes[f] == 0))
			f--;

		if (i == 0 && f == bytes.length - 1)
			return bytes;
		else
			return Arrays.copyOfRange(bytes, i, f + 1);
	}

	public static byte[] trimL(QString string) {

		byte[] bytes = string.asBytes();
		int i = 0;
		while (i < bytes.length && (bytes[i] == NIOStringImpl.INIT || bytes[i] == 0))
			i++;

		if (i == 0)
			return bytes;
		else
			return Arrays.copyOfRange(bytes, i, bytes.length);
	}

	public static byte[] trimR(QString string) {

		byte[] bytes = string.asBytes();
		int i = bytes.length - 1;
		while (i >= 0 && (bytes[i] == NIOStringImpl.INIT || bytes[i] == 0))
			i--;

		if (i == bytes.length - 1)
			return bytes;
		else
			return Arrays.copyOfRange(bytes, 0, i + 1);
	}

	public static byte[] read(QBufferedData data) {
		NIOBufferedDataImpl nioData = getNIOBufferedDataImpl(data);
		return read(nioData.getBuffer(), nioData.getPosition(), nioData.getSize());
	}

	public static byte[] read(ByteBuffer buffer, int position, int length) {
		if(buffer == null)
			return null;
		prepare(buffer, position, length);

		byte[] bytes = new byte[buffer.remaining()];
		buffer.get(bytes);

		return bytes;
	}

	public static void write(QBufferedData target, QBufferedData source) {
		NIOBufferedDataImpl nioTarget = getNIOBufferedDataImpl(target);
		movel(nioTarget.getBuffer(), nioTarget.getPosition(), nioTarget.getSize(), read(source));
	}

	public static void writeDefault(QBufferedElement element, String value) {

		DataSpecial dataSpecial = null;
		if (value.trim().startsWith("*"))
			dataSpecial = DataSpecial.get(value.trim().toUpperCase());

		if (dataSpecial != null) {
			element.eval(dataSpecial);
		} else {
			element = NIOBufferHelper.getNIOBufferedElementImpl(element);
			switch (element.getBufferedElementType()) {
			case DATETIME:
				element.movel(value, true);
				break;
			case NUMERIC:
				((QNumeric)element).eval(new BigDecimal(value.trim()));
				break;
			case STRING:
				((QString)element).eval(value);
				break;
			}
		}
	}

	public static void writeDefault(QList<?> list, String value) {
		if(list instanceof QBufferedList<?>)
			writeDefault((QBufferedList<?>)list, value);
		else {
			QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
			dataWriter.set(value);
			list.accept(dataWriter);
		}
	}
	
	public static void writeDefault(QBufferedList<?> bufferedList, String value) {

		DataSpecial dataSpecial = null;
		if (value.trim().startsWith("*"))
			dataSpecial = DataSpecial.get(value.trim().toUpperCase());

		if (dataSpecial != null)
			bufferedList.eval(dataSpecial);
		else {			
			NIOBufferedElementImpl nioBufferedElementImpl = getNIOBufferedElementImpl(((NIOBufferedListImpl<?>)bufferedList).getModel());
			switch (nioBufferedElementImpl.getBufferedElementType()) {
			case DATETIME:
				bufferedList.movel(value, true);
				break;
			case NUMERIC:
				bufferedList.eval(new BigDecimal(value.trim()));
				break;
			case STRING:
				bufferedList.eval(value);
				break;
			}
		}
	}

	public static void writeDefault(QBufferedList<?> bufferedList, String[] values) {

		for (int i = 1; i <= values.length; i++)
			bufferedList.get(i).movel(values[i-1], true);
	}

	public static NIODataImpl copy(QDataContext dataContext, NIOBufferedDataImpl nioBufferedDataImpl) {

		try {

			NIODataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			QStorable tempStorage = nioBufferedDataImpl._storage;
			ByteBuffer tempBuffer = nioBufferedDataImpl._buffer;
			int tempPosition = nioBufferedDataImpl._position;

			nioBufferedDataImpl._storage = null;
			nioBufferedDataImpl._buffer = null;
			nioBufferedDataImpl._position = 0;
			oos.writeObject(nioBufferedDataImpl);
			nioBufferedDataImpl._storage = tempStorage;
			nioBufferedDataImpl._buffer = tempBuffer;
			nioBufferedDataImpl._position = tempPosition;

			baos.close();
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais) {
				@Override
				protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
					try {
						return super.resolveClass(desc);
					} catch (Exception e) {
						if (nioBufferedDataImpl instanceof NIODataStructWrapperHandler) {
							NIODataStructWrapperHandler nioDataStructWrapperHandler = (NIODataStructWrapperHandler) nioBufferedDataImpl;
							Class<?> c = nioDataStructWrapperHandler._wrapped.getClass().getClassLoader().loadClass(desc.getName());
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
}