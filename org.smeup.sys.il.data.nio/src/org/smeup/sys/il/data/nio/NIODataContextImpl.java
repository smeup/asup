package org.smeup.sys.il.data.nio;

import java.nio.charset.Charset;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.TimeFormat;

public class NIODataContextImpl implements QDataContext {

	private QContext context;
	private QDataFactory dataFactory;
	private QIndicator found;
	private QIndicator endOfData;

	private static final Charset CHARSET = Charset.forName("IBM-280");
	private static final DateFormat DATEFMT = DateFormat.ISO;
	private static final TimeFormat TIMEFMT = TimeFormat.ISO;

	private NIOCharacterVaryingImpl temporaryString;

	public NIODataContextImpl(QContext context) {
		this.context = context;
		QDataAreaFactory dataAreaFactory = context.get(QDataAreaFactory.class);
		dataFactory = new NIODataFactoryImpl(this, dataAreaFactory);
		found = dataFactory.createIndicator(true);
		endOfData = dataFactory.createIndicator(true);

		this.temporaryString = new NIOCharacterVaryingImpl(this, 64000);
		this.temporaryString.allocate();
	}
	
	protected NIOCharacterVaryingImpl getTemporaryString() {
		return temporaryString;
	}

	@Override
	public Charset getCharset() {
		return CHARSET;
	}

	@Override
	public QIndicator found() {
		return this.found;
	}

	@Override
	public QIndicator endOfData() {
		return this.endOfData;
	}

	@Override
	public QDataFactory getDataFactory() {
		return dataFactory;
	}

	@Override
	public QContext getContext() {
		return context;
	}

	@Override
	public DateFormat getDateFormat() {
		return DATEFMT;
	}

	@Override
	public TimeFormat getTimeFormat() {
		return TIMEFMT;
	}
}