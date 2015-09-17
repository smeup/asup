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
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataVisitor;

public abstract class NIODataImpl implements QData {

	private static final long serialVersionUID = 1L;	
	private QDataContainer dataContainer;
	
	public NIODataImpl(QDataContainer dataContainer) {
		super();
		this.dataContainer = dataContainer;
	}

	protected QDataContainer getDataContainer() {
		return this.dataContainer;
	}
	
	public abstract NIODataImpl copy();

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

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
