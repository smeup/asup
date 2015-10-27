package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.os.pgm.base.BaseProgramStatus;

public class NIODataContextImpl implements QDataContext {
	
	private NIODataFactoryImpl dataFactory;
	
	private QIndicator found;
	private QIndicator endOfData;
	private QDataStruct infoStruct;
	
	
	public NIODataContextImpl(NIODataFactoryImpl dataFactory) {
		this.dataFactory = dataFactory;
		this.found = dataFactory.createIndicator(true);
		this.endOfData = dataFactory.createIndicator(true);
		this.infoStruct = dataFactory.createDataStruct(BaseProgramStatus.class, 512, true);
		this.dataFactory.setDataContext(this);
	}
	
	@Override public QIndicator found() {
		return this.found;
	}

	@Override
	public QIndicator endOfData() {
		return this.endOfData;
	}

	@Override
	public NIODataFactoryImpl getDataFactory() {
		return dataFactory;
	}

	@Override
	public QContext getContext() {
		return dataFactory.getContext();
	}

	@Override
	public QDataStruct getInfoStruct() {
		return infoStruct;
	}
}