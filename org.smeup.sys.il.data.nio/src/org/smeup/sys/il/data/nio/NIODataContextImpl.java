package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.os.pgm.base.BaseProgramStatus;

public class NIODataContextImpl implements QDataContext {
	
	private QContext context;	
	private QDataFactory dataFactory;
	private QIndicator found;
	private QIndicator endOfData;
	private QDataStruct infoStruct;
	
	
	public NIODataContextImpl(QContext context) {
		this.context = context;
		dataFactory = new NIODataFactoryImpl(this);		
		found = dataFactory.createIndicator(true);
		endOfData = dataFactory.createIndicator(true);
		infoStruct = dataFactory.createDataStruct(BaseProgramStatus.class, 512, true);
	}
	
	@Override public QIndicator found() {
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
	public QDataStruct getInfoStruct() {
		return infoStruct;
	}
}