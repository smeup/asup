package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.data.QBufferedData;
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
			byte[] bytes = NIOBufferHelper.readBytes(getBuffer(), getPosition(), getSize());
			if (getScale() > 0)
				result = packed.toDouble(bytes);
			else
				result = ((Double) packed.toDouble(bytes)).longValue();

		} catch (Exception e) {
			System.err.println("Unexpected condition 87g5r7xer6fv7fdsa: " + e.getMessage());
		}

		return result;
	}

	@Override
	public void writeNumber(Number number, String roundingMode) {

		try {
			byte[] bytes = packed.toBytes(number.doubleValue());

			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, INIT);
		} catch (Exception e) {
			System.err.println("Unexpected condition ibvedsf8dsfas: " + e.getMessage());
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
			System.err.println("Unexpected condition 8werv68w7erwer: " + e.getMessage());
			return null;
		}
	}

	@Override
	public byte[] asBytes() {
		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
		return zoned.toBytes(asDouble());
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {

		try {
			AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
			double doubleValue = zoned.toDouble(value.asBytes());

			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), packed.toBytes(doubleValue), clear, getFiller());
		} catch (Exception e) {
			System.err.println("Unexpected condition weirdsifzgxcgzx: " + e.getMessage());
		}
	}

	@Override
	public void move(QBufferedData value, boolean clear) {

		try {
			   AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
			   byte[] bytes = value.asBytes();
			   
			   double doubleValue;
			   if(getPrecision()>bytes.length)
			    doubleValue = zoned.toDouble(bytes);
			   else
			    doubleValue = zoned.toDouble(bytes, bytes.length-getPrecision());

			   NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), packed.toBytes(doubleValue), clear, getFiller());
		  } catch (Exception e) {
		   System.err.println("Unexpected condition wei43t7345er5wev7s8dg: " + e.getMessage());
		  }
	}

	@Override
	public void move(String value, boolean clear) {

		try {
			   AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
			   byte[] bytes = value.getBytes(getDataContext().getCharset());
			   
			   double doubleValue;
			   if(getPrecision()>bytes.length)
			    doubleValue = zoned.toDouble(bytes);
			   else
			    doubleValue = zoned.toDouble(bytes, bytes.length-getPrecision());

			   NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), packed.toBytes(doubleValue), clear, getFiller());
		  } catch (Exception e) {
		   System.err.println("Unexpected condition wei43t7345er5wev7s8dg: " + e.getMessage());
		  }
	}

	@Override
	public void movel(String value, boolean clear) {
		
		try {
			AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
			double doubleValue = zoned.toDouble(value.getBytes(getDataContext().getCharset()));

			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), packed.toBytes(doubleValue), clear, getFiller());
		} catch (Exception e) {
			System.err.println("Unexpected condition weird567uyr6zgxcgzx: " + e.getMessage());
		}
	}
}
