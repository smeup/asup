package org.smeup.sys.il.data.nio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class T {

	public static void main(String[] args) {

		int precision = 4;
		int scale = 2;

		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setMaximumIntegerDigits(precision - scale);
		nf.setMaximumFractionDigits(scale);
		nf.setRoundingMode(RoundingMode.DOWN);

		System.out.println(nf.format(14234351.345));

		BigDecimal bd = new BigDecimal(nf.format(14234351.3456));
		System.out.println(bd.precision());
		System.out.println(bd.scale());
		
		System.out.println(bd.toPlainString());

		System.out.println(bd.longValue());
	}

}
