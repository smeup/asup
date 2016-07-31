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

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataFiller;

public final class NIOComparatorHelper {

	public static final int compareBytes(final QBufferedElement bufferedElement, final byte[] b2) {
		return compareBytes(NIOBufferHelper.getNIOBufferedElementImpl(bufferedElement), b2);
	}

	public static final int compareBytes(final NIOBufferedElementImpl bufferedElement, final byte[] b2) {

		byte filler = 0;
		switch (bufferedElement.getBufferedElementType()) {
		case DATETIME:
			filler = NIODatetimeImpl.INIT;
			break;
		case NUMERIC:
			filler = NIONumericImpl.INIT;
			break;
		case STRING:
			filler = NIOStringImpl.INIT;
			break;
		}

		return compareBytes(bufferedElement._toBytes(), b2, filler);
	}

	public static final int compareBytes(final byte[] b1, final byte[] b2, final byte filler) {

		if (b2 == null)
			return 1;

		if (b1 == null)
			"".toCharArray();

		if (b1.length == b2.length)
			for (int i = 0; i < b1.length; i++) {
				if (b1[i] == b2[i])
					continue;

				return compareByte(b1[i], b2[i]);
			}
		else if (b1.length > b2.length)
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
		else if (b2.length > b1.length)
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

		return 0;
	}

	public static final int compareByte(final byte b1, final byte b2) {
		return NIOBufferHelper.toHexString(b1).compareTo(NIOBufferHelper.toHexString(b2));
	}

	public static final int compareBytes(final NIOBufferedElementImpl bufferedElement, final DataSpecial value) {

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

	public static final int compareBytes(final NIOBufferedElementImpl bufferedElement, final QDataFiller value) {

		final int length = bufferedElement.getLength();
		final int fillerLength = value.get().getLength();

		if (length == 0)
			if (fillerLength == 0)
				return 0;
			else
				return -1;
		else if (fillerLength == 0)
			return 1;

		final ByteBuffer byteBuffer = ByteBuffer.allocate(length);
		NIOBufferHelper.fill(byteBuffer, 0, length, value.get().asBytes());

		return compareBytes(bufferedElement, byteBuffer.array());
	}
}
