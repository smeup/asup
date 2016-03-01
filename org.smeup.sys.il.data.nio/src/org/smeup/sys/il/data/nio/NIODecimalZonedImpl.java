package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.data.QDataContext;

import com.ibm.as400.access.AS400ZonedDecimal;

public class NIODecimalZonedImpl extends NIODecimalImpl {
	private static final long serialVersionUID = 1L;

	private static final AS400ZonedDecimal zoneds[][] = new AS400ZonedDecimal[50][50];
	
	private AS400ZonedDecimal zoned = null;

	public NIODecimalZonedImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext, precision, scale);
		
		zoned = getDecimal(precision, scale);
	}

	@Override
	public int getSize() {
		return zoned.getByteLength();
	}

	@Override
	public int getPrecision() {
		return zoned.getNumberOfDigits();
	}

	@Override
	public int getScale() {
		return zoned.getNumberOfDecimalPositions();
	}

	@Override
	public Number readNumber() {

		Number result = 0;
		try {
			if (getScale() > 0)
				result = zoned.toDouble(asBytes());
			else
				result = ((Double) zoned.toDouble(asBytes())).longValue();

		} catch (Exception e) {
			// TODO
			// System.err.println("Unexpected condition vv6666eqw5rqvcrqv: " +
			// e);
		}

		return result;
	}
	
	@Override
	public void writeNumber(Number number, String roundingMode) {

		try {
			byte[] bytes = zoned.toBytes(number.doubleValue());
			
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, INIT);
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
	
	protected static AS400ZonedDecimal getDecimal(int precision, int scale) {

		try {
			AS400ZonedDecimal decimal = zoneds[precision - 1][scale];

			if (decimal == null)
				synchronized (zoneds) {
					decimal = zoneds[precision - 1][scale];
					if (decimal == null) {
						decimal = new AS400ZonedDecimal(precision, scale);
						decimal.setUseDouble(true);
						zoneds[precision - 1][scale] = decimal;
					}
				}

			return decimal;
		} catch (Exception e) {
			e.toString();
			return null;
		}
	}
}
