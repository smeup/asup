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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;

public class NIODecimalHelper {

	/**
	 * This is BigInteger.valueOf( 100000000000000000L ).
	 */
	private final static BigInteger TEN_TO_THE_SEVENTEENTH = BigInteger.valueOf(100000000000000000L);

	/**
	 * An array used for the upper limits of digit-oriented items that have
	 * values with decimals.
	 */
	private static final BigDecimal[][] MAX_DIGIT_ORIENTED_BD_VALUES;

	/**
	 * An array used for the lower limits of digit-oriented items that have
	 * values with decimals.
	 */
	private static final BigDecimal[][] MIN_DIGIT_ORIENTED_BD_VALUES;

	/**
	 * An array used for the upper limits of byte-oriented items that have
	 * values with decimals.
	 */
	private static final BigDecimal[][] MAX_BYTE_ORIENTED_BD_VALUES;

	/**
	 * An array used for the lower limits of byte-oriented items that have
	 * values with decimals.
	 */
	private static final BigDecimal[][] MIN_BYTE_ORIENTED_BD_VALUES;

	/** */
	public static final int TRUNCATE_BD = BigDecimal.ROUND_DOWN;

	/** */
	public static final int ROUND_BD = BigDecimal.ROUND_HALF_UP;

	public static final int BIGDECIMAL_RESULT_SCALE = 32;

	// Initialize the BD_VALUES arrays.
	static {
		// The first dimension of the DIGIT_ORIENTED arrays is based on the
		// length of the items (1-32). The second dimension is long enough to
		// hold the number of decimal digits that the items might have.
		MAX_DIGIT_ORIENTED_BD_VALUES = new BigDecimal[34][];
		MAX_DIGIT_ORIENTED_BD_VALUES[0] = new BigDecimal[1];
		MAX_DIGIT_ORIENTED_BD_VALUES[0][0] = BigDecimal.ZERO;

		MIN_DIGIT_ORIENTED_BD_VALUES = new BigDecimal[34][];
		MIN_DIGIT_ORIENTED_BD_VALUES[0] = new BigDecimal[1];
		MIN_DIGIT_ORIENTED_BD_VALUES[0][0] = BigDecimal.ZERO;

		for (int i = 1; i < 34; i++) {
			MAX_DIGIT_ORIENTED_BD_VALUES[i] = new BigDecimal[i + 1];
			MIN_DIGIT_ORIENTED_BD_VALUES[i] = new BigDecimal[i + 1];
		}

		// The first dimension of the BYTE_ORIENTED arrays is based on
		// the length of the items (4, 9, or 18 digits). The second dimension
		// is long enough to hold the number of decimal digits that the items
		// might have.
		MAX_BYTE_ORIENTED_BD_VALUES = new BigDecimal[3][];
		MAX_BYTE_ORIENTED_BD_VALUES[0] = new BigDecimal[5];
		MAX_BYTE_ORIENTED_BD_VALUES[0][0] = BigDecimal.ZERO;
		MAX_BYTE_ORIENTED_BD_VALUES[1] = new BigDecimal[10];
		MAX_BYTE_ORIENTED_BD_VALUES[1][0] = BigDecimal.ZERO;
		MAX_BYTE_ORIENTED_BD_VALUES[2] = new BigDecimal[19];
		MAX_BYTE_ORIENTED_BD_VALUES[2][0] = BigDecimal.ZERO;

		MIN_BYTE_ORIENTED_BD_VALUES = new BigDecimal[3][];
		MIN_BYTE_ORIENTED_BD_VALUES[0] = new BigDecimal[5];
		MIN_BYTE_ORIENTED_BD_VALUES[0][0] = BigDecimal.ZERO;
		MIN_BYTE_ORIENTED_BD_VALUES[1] = new BigDecimal[10];
		MIN_BYTE_ORIENTED_BD_VALUES[1][0] = BigDecimal.ZERO;
		MIN_BYTE_ORIENTED_BD_VALUES[2] = new BigDecimal[19];
		MIN_BYTE_ORIENTED_BD_VALUES[2][0] = BigDecimal.ZERO;
	}

	/**
	 * An array used for the upper limits of digit-oriented items (their length
	 * specifies a number of digits not a number of bytes) without decimals.
	 */
	public static final BigInteger[] MAX_DIGIT_ORIENTED_BI_VALUES = { BigInteger.ZERO, BigInteger.valueOf(9), BigInteger.valueOf(99), BigInteger.valueOf(999), BigInteger.valueOf(9999),
		BigInteger.valueOf(99999), BigInteger.valueOf(999999), BigInteger.valueOf(9999999), BigInteger.valueOf(99999999), BigInteger.valueOf(999999999), BigInteger.valueOf(9999999999L),
		BigInteger.valueOf(99999999999L), BigInteger.valueOf(999999999999L), BigInteger.valueOf(9999999999999L), BigInteger.valueOf(99999999999999L), BigInteger.valueOf(999999999999999L),
		BigInteger.valueOf(9999999999999999L), BigInteger.valueOf(99999999999999999L), BigInteger.valueOf(999999999999999999L), new BigInteger("9999999999999999999"),
		new BigInteger("99999999999999999999"), new BigInteger("999999999999999999999"), new BigInteger("9999999999999999999999"), new BigInteger("99999999999999999999999"),
		new BigInteger("999999999999999999999999"), new BigInteger("9999999999999999999999999"), new BigInteger("99999999999999999999999999"), new BigInteger("999999999999999999999999999"),
		new BigInteger("9999999999999999999999999999"), new BigInteger("99999999999999999999999999999"), new BigInteger("999999999999999999999999999999"),
		new BigInteger("9999999999999999999999999999999"), new BigInteger("99999999999999999999999999999999"), new BigInteger("999999999999999999999999999999999") };

	/**
	 * An array used for the lower limits of digit-oriented items (their length
	 * specifies a number of digits not a number of bytes) without decimals.
	 */
	public static final BigInteger[] MIN_DIGIT_ORIENTED_BI_VALUES = { BigInteger.ZERO, MAX_DIGIT_ORIENTED_BI_VALUES[1].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[2].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[3].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[4].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[5].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[6].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[7].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[8].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[9].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[10].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[11].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[12].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[13].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[14].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[15].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[16].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[17].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[18].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[19].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[20].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[21].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[22].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[23].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[24].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[25].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[26].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[27].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[28].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[29].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[30].negate(),
		MAX_DIGIT_ORIENTED_BI_VALUES[31].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[32].negate(), MAX_DIGIT_ORIENTED_BI_VALUES[33].negate() };

	public static BigDecimal asDecimal(Integer value, Integer... args) {
		if (value == null)
			return null;
		if (args.length == 2)
			return asDecimal(BigDecimal.valueOf(value), args[0], args[1]);
		else
			return BigDecimal.valueOf(value);
	}

	public static BigDecimal asDecimal(BigDecimal value, int precision, int scale) {
		if (value == null)
			return null;

		return asDecimal(value, getMaxValue(precision, scale), getMinValue(precision, scale), precision, scale, false);
	}

	/**
	 * Returns the upper limit for a digit-oriented item (its length specifies a
	 * number of digits not a number of bytes). This method will cache values in
	 * MAX_DIGIT_ORIENTED_BD_VALUES.
	 *
	 * @param length
	 *            the number of decimal digits stored by the item.
	 * @param decimals
	 *            the number of decimal digits stored by the item.
	 * @return the largest number that the item can store.
	 */
	public static BigDecimal getMaxValue(int length, int decimals) {
		// Get the cached limit.
		BigDecimal max = MAX_DIGIT_ORIENTED_BD_VALUES[length][decimals];
		if (max == null) {
			// Need to make it, and save it for later.
			max = new BigDecimal(MAX_DIGIT_ORIENTED_BI_VALUES[length], decimals);
			MAX_DIGIT_ORIENTED_BD_VALUES[length][decimals] = max;
		}

		return max;
	}

	/**
	 * Returns the lower limit for a digit-oriented item (its length specifies a
	 * number of digits not a number of bytes). This method will cache values in
	 * MIN_DIGIT_ORIENTED_BD_VALUES.
	 *
	 * @param length
	 *            the number of decimal digits stored by the item.
	 * @param decimals
	 *            the number of decimal digits stored by the item.
	 * @return the smallest number that the item can store.
	 */
	public static BigDecimal getMinValue(int length, int decimals) {
		// Get the cached limit.
		BigDecimal min = MIN_DIGIT_ORIENTED_BD_VALUES[length][decimals];
		if (min == null) {
			// Need to make it, and save it for later.
			BigDecimal max = getMaxValue(length, decimals);
			min = max.negate();
			MIN_DIGIT_ORIENTED_BD_VALUES[length][decimals] = min;
		}

		return min;
	}

	public static BigDecimal asDecimal(BigDecimal value, BigDecimal max, BigDecimal min, int precision, int scale, boolean ignoreOverflow) {
		if (value == null || max == null || min == null) // TODO why check max
			// and min? can they
			// ever be null?
			return null;
		BigDecimal result = value;
		if (scale < value.scale())
			// truncate or round the value based on the program setting
			// TODO set this variable up in Program
			// if ( program._truncateDecimals )
			// {
			// result = value.setScale( scale, TRUNCATE_BD );
			// }
			// else
			// {
			result = value.setScale(scale, TRUNCATE_BD);
		// }
		if (ignoreOverflow)
			return result;
		else // Now make sure the value isn't too big for the target.
			if ((result.compareTo(max) <= 0 && result.compareTo(min) >= 0))
				return result;
			else
				return handleNumericOverflow(value, precision, scale, ignoreOverflow);
	}

	/**
	 * Call this when the assignment overflows and the target is a numeric type.
	 *
	 * @param program
	 * @param target
	 * @param source
	 * @throws AnyException
	 */
	private static BigDecimal handleNumericOverflow(BigDecimal value, int precision, int scale, boolean ignoreOverflow) {
		BigDecimal result = value;
		if (ignoreOverflow) {
			// Don't throw an exception. Store as much of the source as
			// possible.
			// This algorithm comes from v6, and from VAGen before that.
			// TODO is this still the right algorithm?
			BigDecimal divisor = new BigDecimal(BigInteger.ONE, -(precision - scale));

			// This is result = source % divisor.
			result = value.subtract(value.divide(divisor, 0, BigDecimal.ROUND_DOWN).multiply(divisor));

		} else
			// The program wants an exception to be thrown.
			throw new IntegratedLanguageCoreRuntimeException("Numeric overflow");
		return result;

	}

	/**
	 * Returns a BigInteger made from the DECIMAL or PACF data in the buffer.
	 *
	 * @param buffer
	 *            where to read the value from.
	 * @param offset
	 *            index of the first byte in the buffer.
	 * @param length
	 *            the number of digits to read.
	 * @return the value as a BigInteger.
	 * @throws InvalidArgumentException
	 *             if the bytes are not in the expected format.
	 */
	public static BigInteger decimalToBigInteger(byte[] buffer, int offset, int length) {
		// Avoid using BigIntegers as much as possible.
		if (length <= 17)
			return BigInteger.valueOf(decimalToLong(buffer, offset, length));

		// Get the bottom 17 digits and the sign as a long.
		int byteOfSeventeethDigit = offset + (length / 2) - 8;
		long bottom = decimalToLong(buffer, byteOfSeventeethDigit, 17);

		// Note the sign for later and make the value positive.
		boolean positive = true;
		if (bottom < 0) {
			bottom = -bottom;
			positive = false;
		}

		// Make a long from the top 1-15 digits. Start by grabbing the digits
		// from the first byte.
		long top = (buffer[offset] & 0xF0) >> 4;
		if (top > 9)
			throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");
		int nextDigit = buffer[offset] & 0xF;
		if (nextDigit < 10)
			top = top * 10 + nextDigit;
		else
			throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");

		// Collect the rest of the remaining digits.
		for (offset++; offset < byteOfSeventeethDigit; offset++) {
			// Add in the digit from the high nibble.
			nextDigit = (buffer[offset] & 0xF0) >> 4;
		if (nextDigit < 10)
			top = top * 10 + nextDigit;
		else
			throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");

		// Add in the digit from the low nibble.
		nextDigit = buffer[offset] & 0xF;
		if (nextDigit < 10)
			top = top * 10 + nextDigit;
		else
			throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");
		}

		// Now merge bottom and top into a BigInteger.
		BigInteger bi;
		if (top == 0)
			// There aren't any significant digits in top.
			bi = BigInteger.valueOf(bottom);
		else {
			// The value is (top * 10^17) + bottom.
			bi = BigInteger.valueOf(top);
			bi = bi.multiply(TEN_TO_THE_SEVENTEENTH);
			bi = bi.add(BigInteger.valueOf(bottom));
		}

		// Correct the sign if we changed it.
		if (positive)
			return bi;
		else
			return bi.negate();
	}

	/**
	 * Returns a long made from the DECIMAL or PACF data in the buffer.
	 *
	 * @param buffer
	 *            where to read the value from.
	 * @param offset
	 *            index of the first byte in the buffer.
	 * @param length
	 *            the number of digits to read.
	 * @return the value as a long.
	 * @throws InvalidArgumentException
	 *             if the bytes are not in the expected format.
	 */
	public static long decimalToLong(byte[] buffer, int offset, int length) {
		// Make a long from the first digit, which is in the high nibble
		// of the first byte.
		long result = (buffer[offset] & 0xF0) >> 4;

		// Now loop over the rest of the digits.
		for (int lastByte = offset + (length / 2); offset < lastByte;) {
			// Pick up the next digit, which is in the low nibble of the byte.
			int nextDigit = buffer[offset] & 0xF;
			if (nextDigit < 10)
				result = result * 10 + nextDigit;
			else
				throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");

			// Move to the next byte.
			offset++;

			// Pick up the next digit, which is in the high nibble of the byte.
			nextDigit = (buffer[offset] & 0xF0) >> 4;
			if (nextDigit < 10)
				result = result * 10 + nextDigit;
			else
				throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");
		}

		// Now check the sign, which is in the low nibble of the byte. The
		// negative sign is usually 0xD, but we recognize 0xB as well.
		int sign = buffer[offset] & 0xF;
		if (sign == 0xC || sign == 0xF)
			return result;
		else if (sign == 0xD || sign == 0xB)
			return -result;
		else
			throw new IntegratedLanguageCoreRuntimeException("Invalid conversion");
	}

	/**
	 * Converts a value to DECIMAL or PACF format, writing it into the buffer at
	 * the specified position.
	 *
	 * @param value
	 *            the value.
	 * @param buffer
	 *            where to write the value.
	 * @param offset
	 *            index of the first byte in the buffer.
	 * @param length
	 *            the number of digits to write.
	 * @param itemLength
	 *            length of the value in bytes.
	 * @param packed
	 *            the positive sign to use: 0xC for DECIMAL, 0xF for PACF.
	 */
	public static void toDecimal(int value, byte[] buffer, int offset, int length, int itemLength, boolean packed) {
		int bufferIndex = offset + itemLength - 1;

		// Make sure the value is positive and set the sign.
		if (value >= 0) {
			if (packed)
				buffer[bufferIndex] = 0xF;
			else
				buffer[bufferIndex] = 0xC;
		} else {
			value = -value;
			buffer[bufferIndex] = (byte) 0x0D;
		}

		// Write the digits, starting from the end and working backwards.
		boolean wroteLow = true;
		int digitsToWrite = length;
		while (value > 0 && digitsToWrite > 0) {

			// Set the high nibble of the current byte.
			buffer[bufferIndex] |= (byte) ((value % 10) << 4);
			digitsToWrite--;
			wroteLow = false;
			value = value / 10;

			// We're done with this byte.
			bufferIndex--;

			if (value == 0 || digitsToWrite == 0)
				// We're done with value.
				break;

			// Set the low nibble of the current byte.
			buffer[bufferIndex] = (byte) (value % 10);
			digitsToWrite--;
			wroteLow = true;
			value = value / 10;
		}

		// Fill with zeros if neccessary.
		if (digitsToWrite > 0) {
			if (wroteLow) {
				// Since we just wrote the low nibble of a byte, the high nibble
				// is already a zero. We can move to the next byte.
				digitsToWrite--;
				bufferIndex--;
			}

			while (digitsToWrite > 0) {
				// Zero out two nibbles at a time.
				buffer[bufferIndex] = 0;
				bufferIndex--;
				digitsToWrite -= 2;
			}
		}
	}
}
