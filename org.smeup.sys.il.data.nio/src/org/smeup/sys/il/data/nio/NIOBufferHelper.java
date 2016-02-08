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

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedDataDelegator;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QStorable;

public class NIOBufferHelper {

	public static byte[] readBytes(ByteBuffer buffer, int position, int length) {
		assert buffer != null;

		prepare(buffer, position, length);

		byte[] bytes = new byte[buffer.remaining()];
		buffer.get(bytes);

		return bytes;
	}

	public static void movel(ByteBuffer target, int position, int length, byte[] bytes, boolean clear, byte filler) {
		assert target != null;

		prepare(target, position, length);

		// overflow
		if (bytes.length >= target.remaining())
			target.put(bytes, 0, target.remaining());
		else {
			target.put(bytes);

			if (clear)
				fill(target, target.position(), target.limit(), filler);
		}
	}

	public static void move(ByteBuffer buffer, int position, int length, byte[] bytes, boolean clear, byte filler) {
		assert buffer != null;

		prepare(buffer, position, length);

		// overflow
		if (bytes.length > buffer.remaining())
			buffer.put(bytes, bytes.length - buffer.remaining(), buffer.remaining());
		else {

			if (clear)
				fill(buffer, buffer.position(), buffer.limit() - bytes.length, filler);

			buffer.position(position + buffer.remaining() - bytes.length);

			buffer.put(bytes);
		}
	}

	public static void clear(NIOBufferedDataImpl bufferedData) {
		NIOBufferHelper.clear(bufferedData.getBuffer(), bufferedData.getPosition(), bufferedData.getSize(), bufferedData.getFiller());
	}

	public static void clear(ByteBuffer buffer, int position, int length, byte filler) {
		assert buffer != null;

		prepare(buffer, position, length);

		fill(buffer, position, buffer.limit(), filler);
	}
	
	public static void prepare(ByteBuffer buffer, int position, int length) {
		assert buffer != null;

		if (position > 0) {
			// overflow
			if (position + length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(position + length);

			try {
				buffer.position(position);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			buffer.position(0);
			if (length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(length);
		}
	}

	private static void fill(ByteBuffer buffer, int position, int length, byte filler) {
		for (int i = position; i < length; i++)
			buffer.put(filler);
	}
	
	public static void fill(ByteBuffer buffer, int position, int length, byte[] filler) {
		assert buffer != null;

		if(filler.length == 0)
			"".toCharArray();
		
		prepare(buffer, position, length);

		for (int i = position; i < length; i++) {
			buffer.put(filler);
			if(filler.length>1)
				position = position+filler.length-1;
		}
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

	public static NIOBufferedDataImpl getNIOBufferedDataImpl(QData bufferedData) {

		NIOBufferedDataImpl nioBufferedData = null;

		if (bufferedData instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl) bufferedData;
		else if (bufferedData instanceof QBufferedDataDelegator) {
			QBufferedDataDelegator dataDelegator = (QBufferedDataDelegator) bufferedData;
			nioBufferedData = getNIOBufferedDataImpl(dataDelegator.getDelegate());
		}

		return nioBufferedData;
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

}