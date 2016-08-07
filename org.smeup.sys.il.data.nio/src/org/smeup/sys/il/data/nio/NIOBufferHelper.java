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
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;

public final class NIOBufferHelper {

	private static final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public final static void assign(final QStorable storable, final QBufferedData target) {

		final NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);
		if (nioBufferedData == null)
			throw new IntegratedLanguageCoreRuntimeException("No buffer reference found: " + target.getClass());

		// same address
		if (storable.getBuffer() != null && equalsAddress(storable, nioBufferedData, 1))
			return;

		// storage chain
		final NIOBufferedDataImpl nioBufferOwner = getNIOBufferOwner(nioBufferedData);

		if (nioBufferOwner == null) {
			nioBufferedData._buffer = null;
			nioBufferedData._storage = storable;
			nioBufferedData._position = 0;
		} else {
			nioBufferOwner._buffer = null;
			nioBufferOwner._storage = storable;
			nioBufferOwner._position = 0;
		}
	}

	public final static void slice(final QStorable storable, final QBufferedData target, final int position) {

		if (position <= 0)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dm5c46dsfgdsf7405mc");

		final NIOBufferedDataImpl nioBufferedData = getNIOBufferedDataImpl(target);
		if (nioBufferedData == null)
			throw new IntegratedLanguageCoreRuntimeException("No buffer reference found: " + target.getClass());

		// same address
		if (storable.getBuffer() != null && equalsAddress(storable, nioBufferedData, position))
			return;

		nioBufferedData._buffer = null;
		nioBufferedData._storage = storable;
		nioBufferedData._position = position;
	}

	public final static NIOBufferedDataImpl getNIOBufferOwner(final QStorable data) {

		final NIOBufferedDataImpl nioBufferedDataImpl = getNIOBufferedDataImpl(data);
		if (nioBufferedDataImpl == null)
			return null;

		final QDataContext dataContext = nioBufferedDataImpl.getDataContext();

		if (nioBufferedDataImpl.isStoreOwner())
			return nioBufferedDataImpl;
		else if (nioBufferedDataImpl.isSliced())
			return nioBufferedDataImpl;
		else if (nioBufferedDataImpl._storage == null)
			return nioBufferedDataImpl;
		else {
			final NIOBufferedDataImpl nioBufferedOwner = getNIOBufferOwner(nioBufferedDataImpl._storage);
			if (nioBufferedOwner == null)
				return null;

			if (nioBufferedOwner.getDataContext() != dataContext)
				return nioBufferedDataImpl;
			else
				return nioBufferedOwner;
		}
	}

	public final static NIOBufferedDataImpl getNIOBufferedDataImpl(final QStorable storable) {

		NIOBufferedDataImpl nioBufferedData = null;

		if (storable instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl) storable;
		else if (storable instanceof QBufferedElementDelegator) {
			final QBufferedElementDelegator dataDelegator = (QBufferedElementDelegator) storable;
			nioBufferedData = getNIOBufferedDataImpl(dataDelegator.getDelegate());
		}

		return nioBufferedData;
	}

	public final static NIOBufferedElementImpl getNIOBufferedElementImpl(QData data) {

		NIOBufferedElementImpl nioBufferedElement = null;
		if (data instanceof QScroller<?>) {
			final NIOScrollerImpl<?> nioScrollerImpl = (NIOScrollerImpl<?>) data;
			data = nioScrollerImpl.current();
		}

		if (data instanceof NIOBufferedElementImpl)
			nioBufferedElement = (NIOBufferedElementImpl) data;
		else if (data instanceof QBufferedElementDelegator) {
			final QBufferedElementDelegator dataDelegator = (QBufferedElementDelegator) data;
			nioBufferedElement = getNIOBufferedElementImpl(dataDelegator.getDelegate());
		}

		return nioBufferedElement;
	}

	public final static void prepare(final ByteBuffer buffer, final int position, final int length) {

		if (position > 0) {

			// overflow
			if (position + length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(position + length);

			try {
				buffer.position(position);
			} catch (final Exception e) {
				"".toCharArray();
			}
		} else {
			if (length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(length);

			buffer.position(0);
		}
	}

	public final static void movel(final ByteBuffer buffer, final int position, final int length, final byte[] bytes) {
		prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, 0, buffer.remaining());
		else
			buffer.put(bytes);
	}

	public final static void movel(final ByteBuffer buffer, final int position, final int length, final byte[] bytes, final byte filler) {
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

	public final static void move(final ByteBuffer buffer, final int position, final int length, final byte[] bytes) {
		prepare(buffer, position, length);

		final int remaining = buffer.remaining();
		
		// overflow
		if (bytes.length > remaining)
			buffer.put(bytes, bytes.length - remaining, remaining);
		else {

			buffer.position(position + remaining - bytes.length);
			buffer.put(bytes);
		}
	}

	public final static void move(final ByteBuffer buffer, final int position, final int length, final byte[] bytes, final byte filler) {
		prepare(buffer, position, length);

		final int remaining = buffer.remaining();
		// overflow
		if (bytes.length > remaining)
			buffer.put(bytes, bytes.length - remaining, remaining);
		else {

			for (int i = buffer.position(); i < buffer.limit() - bytes.length; i++)
				buffer.put(filler);

			buffer.put(bytes);
		}
	}

	public final static void fill(final ByteBuffer buffer, final int position, final int length, final byte[] filler) {

		if (filler.length == 0)
			return;

		if (filler.length == 1) {
			fill(buffer, position, length, filler[0]);
			return;
		}

		prepare(buffer, position, length);

		while (true) {
			final int remaining = buffer.remaining();
			if (remaining > filler.length)
				buffer.put(filler);
			else {
				buffer.put(filler, 0, remaining);
				break;
			}
		}
	}

	public final static void fill(final ByteBuffer buffer, final int position, final int length, final byte filler) {

		if (buffer.isDirect())
			Arrays.fill(buffer.array(), position, position + length, filler);
		else {
			NIOBufferHelper.prepare(buffer, position, length);
			while (buffer.hasRemaining())
				buffer.put(filler);
		}
	}

	public final static void fillr(final ByteBuffer buffer, final int position, final int length, final byte[] filler) {

		if (filler.length == 0)
			return;

		if (filler.length == 1) {
			fill(buffer, position, length, filler[0]);
			return;
		}

		final int remainder = length % filler.length;
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
			final int remaining = buffer.remaining();
			if (remaining > filler.length)
				buffer.put(filler);
			else {
				buffer.put(filler, 0, remaining);
				break;
			}
		}
	}

	public final static ByteBuffer getBuffer(final QStorable storable) {

		if (storable instanceof NIOBufferedDataImpl)
			return ((NIOBufferedDataImpl) storable).getBuffer();
		else if (storable instanceof NIOPointerImpl)
			return ((NIOPointerImpl) storable).getBuffer();
		else if (storable instanceof NIOStorageImpl)
			return ((NIOStorageImpl) storable).getBuffer();
		else
			return null;
	}

	public final static String toHexString(final byte b) {

		final char[] hexChars = new char[2];

		final int v = b & 0xFF;
		hexChars[0] = hexArray[v >>> 4];
		hexChars[1] = hexArray[v & 0x0F];

		return new String(hexChars);
	}

	public final static String bytesToHex(final byte[] bytes) {
		final char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	public final static byte[] trim(final QString string) {

		final byte[] bytes = string.asBytes();
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

	public final static byte[] trimL(final QString string) {

		final byte[] bytes = string.asBytes();
		int i = 0;
		while (i < bytes.length && (bytes[i] == NIOStringImpl.INIT || bytes[i] == 0))
			i++;

		if (i == 0)
			return bytes;
		else
			return Arrays.copyOfRange(bytes, i, bytes.length);
	}

	public final static byte[] trimR(final QString string) {

		final byte[] bytes = string.asBytes();
		int i = bytes.length - 1;
		while (i >= 0 && (bytes[i] == NIOStringImpl.INIT || bytes[i] == 0))
			i--;

		if (i == bytes.length - 1)
			return bytes;
		else
			return Arrays.copyOfRange(bytes, 0, i + 1);
	}

	public final static byte[] read(final QBufferedData data) {
		final NIOBufferedDataImpl nioData = getNIOBufferedDataImpl(data);
		return read(nioData.getBuffer(), nioData.getPosition(), nioData.getSize());
	}

	public final static byte[] read(final ByteBuffer buffer, final int position, final int length) {
		if (buffer == null)
			return null;
		
		prepare(buffer, position, length);

		final byte[] bytes = new byte[buffer.remaining()];
		buffer.get(bytes);

		return bytes;
	}

	public final static void write(final QBufferedData target, final QBufferedData source) {
		final NIOBufferedDataImpl nioTarget = getNIOBufferedDataImpl(target);
		movel(nioTarget.getBuffer(), nioTarget.getPosition(), nioTarget.getSize(), read(source));
	}

	public final static void writeDefault(QBufferedElement element, final String value) {

		DataSpecial dataSpecial = null;
		if (value.trim().startsWith("*"))
			dataSpecial = DataSpecial.get(value.trim().toUpperCase());

		if (dataSpecial != null)
			element.eval(dataSpecial);
		else {
			element = NIOBufferHelper.getNIOBufferedElementImpl(element);
			switch (element.getBufferedElementType()) {
			case DATETIME:
				element.movel(value, true);
				break;
			case NUMERIC:
				((QNumeric) element).eval(new BigDecimal(value.trim()));
				break;
			case STRING:
				((QString) element).eval(value);
				break;
			}
		}
	}

	public final static void writeDefault(final QList<?> list, final String value) {
		if (list instanceof QBufferedList<?>)
			writeDefault((QBufferedList<?>) list, value);
		else {
			final QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
			dataWriter.set(value);
			list.accept(dataWriter);
		}
	}

	public final static void writeDefault(final QBufferedList<?> bufferedList, final String value) {

		DataSpecial dataSpecial = null;
		if (value.trim().startsWith("*"))
			dataSpecial = DataSpecial.get(value.trim().toUpperCase());

		if (dataSpecial != null)
			bufferedList.eval(dataSpecial);
		else {
			final NIOBufferedElementImpl nioBufferedElementImpl = getNIOBufferedElementImpl(((NIOBufferedListImpl<?>) bufferedList).getModel());
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

	public final static void writeDefault(final QBufferedList<?> bufferedList, final String[] values) {

		for (int i = 1; i <= values.length; i++)
			bufferedList.get(i).movel(values[i - 1], true);
	}

	public final static void setDataContext(final QBufferedData data, final QDataContext dataContext) {

		NIOBufferedDataImpl nioBufferedData = null;

		if (data instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl) data;
		else if (data instanceof QBufferedElementDelegator) {
			final QBufferedElementDelegator dataDelegator = (QBufferedElementDelegator) data;
			nioBufferedData = getNIOBufferedDataImpl(dataDelegator.getDelegate());
		}

		nioBufferedData._dataContext = dataContext;
	}

	public final static boolean equalsAddress(final QStorable source, final QStorable target, final int position) {
		return source.getBuffer() == target.getBuffer() && source.getPosition() == target.getPosition() + position - 1;
	}
}