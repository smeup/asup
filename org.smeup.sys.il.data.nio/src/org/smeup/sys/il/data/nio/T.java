package org.smeup.sys.il.data.nio;

import java.math.BigDecimal;
import java.math.MathContext;

public class T {

	public static void main(String[] args) {

		BigDecimal bd = new BigDecimal(275);
		bd = bd.divide(new BigDecimal(7), MathContext.DECIMAL32);
		System.out.println(bd);
	}

}
