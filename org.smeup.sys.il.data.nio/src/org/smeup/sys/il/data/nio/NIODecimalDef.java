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

	private static NIODecimalDef decimalTypes[][] = new NIODecimalDef[100][100];

	protected final AS400ZonedDecimal zoned;
	protected final byte[] zoned_init;
	protected final byte[] zoned_loval;
	protected final byte[] zoned_hival;

	protected final AS400PackedDecimal packed;
	protected final byte[] packed_init;
	protected final byte[] packed_loval;
	protected final byte[] packed_hival;

	protected final NumberFormat formatUP;
	protected final NumberFormat formatDW;

	public NIODecimalDef(final int precision, final int scale) {

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

	public static NIODecimalDef getInstance(final int precision, final int scale) {

		try {
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
		catch(Exception e) {
			e.printStackTrace();
			e.toString();
			return null;
		}
	}
	
	private final String formatMinValue(final int precision, final int scale) {
		return "-" + formatMaxValue(precision, scale);
	}

	private final String formatMaxValue(final int precision, final int scale) {

		final StringBuffer sb = new StringBuffer();
		for (int i = 0; i < precision - scale; i++)
			sb.append("9");
		if (scale > 0) {
			sb.append(".");
			for (int i = 0; i < scale; i++)
				sb.append("9");
		}

		return sb.toString();
	}

	private final static AS400ZonedDecimal createDecimalZoned(final int precision, final int scale) {

		final AS400ZonedDecimal decimal = new AS400ZonedDecimal(precision, scale);
		decimal.setUseDouble(false);

		return decimal;
	}

	private final static AS400PackedDecimal createDecimalPacked(final int precision, final int scale) {

		final AS400PackedDecimal decimal = new AS400PackedDecimal(precision, scale);
		decimal.setUseDouble(false);

		return decimal;
	}

	private final static NumberFormat createNumberFormatUP(final int precision, final int scale) {

		final DecimalFormat numberFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US); // TODO
		// verify
		numberFormat.setMaximumIntegerDigits(precision - scale);
		numberFormat.setMaximumFractionDigits(scale);
		numberFormat.setRoundingMode(RoundingMode.UP);
		numberFormat.setGroupingUsed(false);

		return numberFormat;
	}

	private final static NumberFormat createNumberFormatDW(final int precision, final int scale) {

		final DecimalFormat numberFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US); // TODO
		// verify
		numberFormat.setMaximumIntegerDigits(precision - scale);
		numberFormat.setMaximumFractionDigits(scale);
		numberFormat.setRoundingMode(RoundingMode.DOWN);
		numberFormat.setGroupingUsed(false);

		return numberFormat;
	}
}