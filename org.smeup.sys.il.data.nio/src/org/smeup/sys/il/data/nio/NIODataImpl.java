/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.data.QBufferedDataDelegator;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;

public abstract class NIODataImpl implements QData {

	private static final long serialVersionUID = 1L;	
	
	protected transient QDataContext _dataContext;
	
	public NIODataImpl(QDataContext dataContext) {
		this._dataContext = dataContext;
	}

	protected QDataContext getDataContext() {
		return this._dataContext;
	}

	public abstract NIODataImpl copy();

	protected NIOBufferedDataImpl getNIOBufferedDataImpl(QData bufferedData) {

		NIOBufferedDataImpl nioBufferedData = null;

		if (bufferedData instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl) bufferedData;
		else if (bufferedData instanceof QBufferedDataDelegator) {
			QBufferedDataDelegator dataDelegator = (QBufferedDataDelegator) bufferedData;
			nioBufferedData = getNIOBufferedDataImpl(dataDelegator.getDelegate());
		}

		return nioBufferedData;
	}
	
	public enum ComparatorType {
		ASCII, EBCDIC;
	}
}
