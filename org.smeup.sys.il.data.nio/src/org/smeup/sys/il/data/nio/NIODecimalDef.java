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

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import com.ibm.as400.access.AS400PackedDecimal;
import com.ibm.as400.access.AS400ZonedDecimal;

public final class NIODecimalDef implements Serializable {

	private static final long serialVersionUID = 1L;

	private static NIODecimalDef decimalTypes[][] = new NIODecimalDef[50][20];

	private AS400ZonedDecimal zoned = null;
	private byte[] zoned_init = null;
	private byte[] zoned_loval = null;
	private byte[] zoned_hival = null;

	private AS400PackedDecimal packed = null;
	private byte[] packed_init = null;
	private byte[] packed_loval = null;
	private byte[] packed_hival = null;

	private NumberFormat formatUP = null;
	private NumberFormat formatDW = null;

	public NIODecimalDef(int precision, int scale) {
		
		zoned = createDecimalZoned(precision, scale);
		zoned_init = zoned.toBytes(BigDecimal.ZERO);
		zoned_loval = zoned.toBytes(new BigDecimal(formatMinValue(precision, scale)));
		zoned_hival = zoned.toBytes(new BigDecimal(formatMaxValue(precision, scale)));

		packed = createDecimalPacked(precision, scale);
		packed_init = packed.toBytes(BigDecimal.ZERO);
		packed_loval = packed.toBytes(new BigDecimal(formatMinValue(precision, scale)));
		packed_hival = packed.toBytes(new BigDecimal(formatMaxValue(precision, scale)));
		
		formatUP = createNumberFormatUP(precision, scale);
		formatDW = createNumberFormatDW(precision, scale);
	}

	private String formatMinValue(int precision, int scale) {
		return "-"+formatMaxValue(precision, scale);
	}
	
	private String formatMaxValue(int precision, int scale) {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < precision - scale; i++)
			sb.append("9");
		if (scale > 0) {
			sb.append(".");
			for (int i = 0; i < scale; i++)
				sb.append("9");
		}

		return sb.toString();
	}

	protected AS400PackedDecimal getPacked() {
		return packed;
	}

	protected byte[] getPackedInit() {
		return packed_init;
	}

	protected byte[] getPackedLoval() {
		return packed_loval;
	}

	protected byte[] getPackedHival() {
		return packed_hival;
	}

	protected AS400ZonedDecimal getZoned() {
		return zoned;
	}

	protected byte[] getZonedInit() {
		return zoned_init;
	}

	protected byte[] getZonedLoval() {
		return zoned_loval;
	}

	protected byte[] getZonedHival() {
		return zoned_hival;
	}

	public NumberFormat getFormatUP() {
		return formatUP;
	}

	public NumberFormat getFormatDW() {
		return formatDW;
	}

	private static AS400ZonedDecimal createDecimalZoned(int precision, int scale) {

		AS400ZonedDecimal decimal = new AS400ZonedDecimal(precision, scale);
		decimal.setUseDouble(true);

		return decimal;
	}

	private AS400PackedDecimal createDecimalPacked(int precision, int scale) {

		AS400PackedDecimal decimal = new AS400PackedDecimal(precision, scale);
		decimal.setUseDouble(true);

		return decimal;
	}

	private static NumberFormat createNumberFormatUP(int precision, int scale) {

		DecimalFormat numberFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.US); // TODO
		// verify
		numberFormat.setMaximumIntegerDigits(precision - scale);
		numberFormat.setMaximumFractionDigits(scale);
		numberFormat.setRoundingMode(RoundingMode.UP);
		numberFormat.setGroupingUsed(false);

		return numberFormat;
	}

	private static NumberFormat createNumberFormatDW(int precision, int scale) {

		DecimalFormat numberFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.US); // TODO
		// verify
		numberFormat.setMaximumIntegerDigits(precision - scale);
		numberFormat.setMaximumFractionDigits(scale);
		numberFormat.setRoundingMode(RoundingMode.DOWN);
		numberFormat.setGroupingUsed(false);

		return numberFormat;
	}

	public static NIODecimalDef getInstance(int precision, int scale) {

		NIODecimalDef decimalType = decimalTypes[precision - 1][scale];
		if (decimalType == null)
			synchronized (decimalTypes) {
				decimalType = decimalTypes[precision - 1][scale];
				if (decimalType == null) {
					decimalType = new NIODecimalDef(precision, scale);
					decimalTypes[precision - 1][scale] = decimalType;
				}
			}

		return decimalType;
	}
}