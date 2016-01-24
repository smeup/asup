package org.smeup.sys.os.pgm.base;

import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.esam.QPrint;

public class BasePrintDelegator<D> implements QPrint<D> {

	private D delegate = null;
	private boolean isOpen = false;
	
	public BasePrintDelegator(D delegate, boolean userOpen) {
		this.delegate = delegate;
		if(!userOpen)
			isOpen = true;
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

	@Override
	public D get() {
		return delegate;
	}
}
