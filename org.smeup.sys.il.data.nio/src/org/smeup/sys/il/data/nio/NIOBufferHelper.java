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

import java.nio.ByteBuffer;
import java.util.Arrays;

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

			buffer.position(position);
		} else {
			buffer.position(0);
			if (length > buffer.capacity())
				buffer.limit(buffer.capacity());
			else
				buffer.limit(length);
		}
	}

	public static void fill(ByteBuffer buffer, int position, int length, byte filler) {

		if (buffer.hasArray())
			Arrays.fill(buffer.array(), position, length, filler);
		else
			for (int i = position; i < length; i++)
				buffer.put(filler);
	}
}