package org.smeup.sys.il.data.nio;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
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

	private Map<QBufferedData, QBufferedData> snapshots = null;

	public NIODataContextImpl(QContext context, QDataAreaFactory dataAreaFactory, Object owner) {
		this.context = context;		
		dataFactory = new NIODataFactoryImpl(this, owner, dataAreaFactory);
		found = dataFactory.createIndicator(true);
		endOfData = dataFactory.createIndicator(true);
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

	@Override
	public void snap(QBufferedData data) {
				
		QCharacter snapData = new NIOCharacterImpl(this, data.getSize(), true);
		NIOBufferHelper.write(snapData, data);
		
		if(snapshots == null)
			snapshots = new HashMap<QBufferedData, QBufferedData>();
		snapshots.put(data, snapData);
	}

	@Override
	public QBufferedData getSnap(QBufferedData data) {
		if(snapshots == null)
			return null;
		
		return snapshots.get(data);
	}

	@Override
	public void removeSnap(QBufferedData data) {
		if(snapshots == null)
			return;
		
		snapshots.remove(data);
	}
}