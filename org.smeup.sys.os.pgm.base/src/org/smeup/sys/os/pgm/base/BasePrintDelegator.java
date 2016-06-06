/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.pgm.base;

import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.esam.QPrint;

public class BasePrintDelegator<R extends QRecord> implements QPrint<R> {

	private R delegate = null;
	private boolean isOpen = false;
	private BaseInfoStruct infoStruct;
	
	public BasePrintDelegator(R delegate, boolean userOpen, BaseInfoStruct infoStruct) {
		this.delegate = delegate;
		if(!userOpen)
			isOpen = true;
		this.infoStruct = infoStruct;
		
		this.infoStruct.clear();
		this.delegate.clear();
	}

	@Override
	public R get() {
		return delegate;
	}

	@Override
	public QDataStruct getInfoStruct() {
		return infoStruct;
	}
	
	@Override
	public void close() {
		isOpen = false;
	}

	@Override
	public void close(QIndicator error) {
		isOpen = false;
	}

	@Override
	public boolean isOpen() {
		return isOpen;
	}

	@Override
	public void open() {
		isOpen = true;
	}

	@Override
	public void open(QIndicator error) {
		isOpen = true;		
	}
}
