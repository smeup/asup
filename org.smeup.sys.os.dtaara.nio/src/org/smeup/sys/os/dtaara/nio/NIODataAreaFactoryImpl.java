/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.dtaara.nio;

import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QString;

public class NIODataAreaFactoryImpl implements QDataAreaFactory {

	@Override
	public <E extends QBufferedElement> QDataArea<E> createDataArea(QDataContext dataContext, E argument, QString externalName) {

		QDataArea<E> dataArea = new NIODataAreaImpl<E>(dataContext, argument, externalName);
		return dataArea;
	}

}
