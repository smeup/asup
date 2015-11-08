package org.smeup.sys.os.dtaara.nio;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;

public class NIODataAreaFactoryImpl implements QDataAreaFactory {

	@Override
	public <D extends QBufferedData> QDataArea<D> createDataArea(QDataContext dataContext, D argument, String externalName) {

		QDataArea<D> dataArea = new NIODataAreaImpl<D>(dataContext, argument, externalName);
		return dataArea;
	}

}
