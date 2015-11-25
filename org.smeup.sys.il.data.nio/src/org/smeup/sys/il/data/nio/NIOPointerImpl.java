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

import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;

public class NIOPointerImpl extends NIODataImpl implements QPointer {

	private static final long serialVersionUID = 1L;

	protected QStorable _storable = null;
	
	public NIOPointerImpl(QDataContext dataContext) {
		super(dataContext);
	}
	
	public NIOPointerImpl(QDataContext dataContext, QStorable storable) {
		super(dataContext);
		this._storable = storable;
	}

	@Override
	public void assign(QBufferedData target) {
		this._storable.assign(target);
	}

	@Override
	public void assign(QBufferedData target, int position) {
		this._storable.assign(target, position);
	}
	
	@Override
	public void eval(QPointer value) {
		this._storable = (QStorable) value.getStore();
	}

	@Override
	public void dealloc() {
	}
	
	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}
	
	public QString qStr() {
		return qStr(getByteSize(_storable));
	}
	
	public QString qStr(int length) {

		QCharacter character = getDataContext().getDataFactory().createCharacter(length, false, false);
		_storable.assign(character);

		return character;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub		
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eq(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eval(QDataWriter value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ge(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gt(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(_storable == null)
			return true;
		else
			return _storable.isEmpty();
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean le(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lt(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ne(QDataWriter value) {
		// TODO Auto-generated method stub
		return false;
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
	public NIODataImpl copy() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getStore() {
		return _storable;
	}

	@Override
	public int getPosition() {
		return _storable.getPosition();
	}
	
	private int getByteSize(QStorable storable) {
		if(storable instanceof QBufferedData)
			return ((QBufferedData)storable).getSize();
		else
			throw new IntegratedLanguageDataRuntimeException("Invalid storage: "+storable);
	}
}
