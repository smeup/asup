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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;

public class NIOPointerImpl extends NIOBufferedDataImpl implements QPointer {

	private static final long serialVersionUID = 1L;
	
	public NIOPointerImpl(QDataContext dataContext, NIOBufferedDataImpl target) {
		super(dataContext);
		target.assign(this);
	}

	@Override
	public void eval(QPointer value) {
		value.assign(this);	
	}

	@Override
	public void eval(QBufferedData value) {

		if(value instanceof QPointer) {

		}
		else if(value == null)
			"".toCharArray();
		else
			value.toString();
	}

	@Override
	public int getLength() {
		return getBuffer().capacity()-getPosition();
	}

	@Override
	public int getSize() {
		return getLength();
	}

	@Override
	public QPointer divide(short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer divide(long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer divide(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer divide(QNumeric value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer minus(short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer minus(long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer minus(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer minus(QNumeric value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer mult(short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer mult(long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer mult(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer mult(QNumeric value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer plus(short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer plus(long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer plus(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer plus(QNumeric value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer power(short value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer power(long value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer power(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QPointer power(QNumeric value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte getFiller() {
		// TODO Auto-generated method stub
		return 0;
	}
}
