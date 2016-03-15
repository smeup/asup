package org.smeup.sys.os.dtaara.nio;

import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;

public class NIODataAreaFactoryImpl implements QDataAreaFactory {

	@Override
	public <E extends QBufferedElement> QDataArea<E> createDataArea(QDataContext dataContext, E argument, String externalName) {

		QDataArea<E> dataArea = new NIODataAreaImpl<E>(dataContext, argument, externalName);
		return dataArea;
	}

}
