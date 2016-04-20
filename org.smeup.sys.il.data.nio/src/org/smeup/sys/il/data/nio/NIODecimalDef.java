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
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import com.ibm.as400.access.AS400PackedDecimal;
import com.ibm.as400.access.AS400ZonedDecimal;

public class NIODecimalDef implements Serializable {

	private static final long serialVersionUID = 1L;

	private static NIODecimalDef decimalTypes[][] = new NIODecimalDef[50][20];;

	private AS400PackedDecimal packed = null;
	private AS400ZonedDecimal zoned = null;
	private NumberFormat formatUP = null;
	private NumberFormat formatDW = null;

	public NIODecimalDef(int precision, int scale) {

		packed = createDecimalPacked(precision, scale);
		zoned = getDecimalZoned(precision, scale);
		formatUP = createNumberFormatUP(precision, scale);
		formatDW = createNumberFormatDW(precision, scale);
	}

	protected AS400PackedDecimal getPacked() {
		return packed;
	}

	protected AS400ZonedDecimal getZoned() {
		return zoned;
	}

	public NumberFormat getFormatUP() {
		return formatUP;
	}

	public NumberFormat getFormatDW() {
		return formatDW;
	}

	private static AS400ZonedDecimal getDecimalZoned(int precision, int scale) {

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