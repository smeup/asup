package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.data.QDataContext;

import com.ibm.as400.access.AS400PackedDecimal;
import com.ibm.as400.access.AS400ZonedDecimal;

public class NIODecimalPackedImpl extends NIODecimalImpl {
	private static final long serialVersionUID = 1L;

	private static final AS400PackedDecimal packeds[][] = new AS400PackedDecimal[50][50];
	
	private AS400PackedDecimal packed = null;

	public NIODecimalPackedImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext, precision, scale);
		
		packed = getDecimal(precision, scale);
	}

	@Override
	public int getSize() {
		return packed.getByteLength();
	}

	@Override
	public int getPrecision() {
		return packed.getNumberOfDigits();
	}

	@Override
	public int getScale() {
		return packed.getNumberOfDecimalPositions();
	}

	@Override
	public Number readNumber() {

		Number result = 0;
		try {
			if (getScale() > 0)
				result = packed.toDouble(asBytes());
			else
				result = ((Double) packed.toDouble(asBytes())).longValue();

		} catch (Exception e) {
			// TODO
			// System.err.println("Unexpected condition vv6666eqw5rqvcrqv: " +
			// e);
//			e.printStackTrace();
		}

		return result;
	}
	
	@Override
	public void writeNumber(Number number, String roundingMode) {

		try {
			byte[] bytes = packed.toBytes(number.doubleValue());

			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, INIT);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private AS400PackedDecimal getDecimal(int precision, int scale) {

		try {
			AS400PackedDecimal decimal = packeds[precision - 1][scale];

			if (decimal == null)
				synchronized (packeds) {
					decimal = packeds[precision - 1][scale];
					if (decimal == null) {
						decimal = new AS400PackedDecimal(precision, scale);
						decimal.setUseDouble(true);
						packeds[precision - 1][scale] = decimal;
					}
				}

			return decimal;
		} catch (Exception e) {
			e.toString();
			return null;
		}
	}

	@Override
	public byte[] asBytes() {		
		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
		return zoned.toBytes(readNumber());
	}
}
