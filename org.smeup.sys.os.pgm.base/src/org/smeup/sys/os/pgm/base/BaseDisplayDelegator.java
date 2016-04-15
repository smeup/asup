package org.smeup.sys.os.pgm.base;

import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.esam.QDisplay;

public class BaseDisplayDelegator<D> implements QDisplay<D> {

	private D delegate = null;
	private boolean isOpen = false;
	public BaseDisplayDelegator(D delegate, boolean userOpen) {
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
	public void readc(Class<?> format) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show(Class<?> format) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Class<?> format) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(Class<?> format) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public D get() {
		return delegate;
	}

}
