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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;

public class NIOPointerImpl extends NIODataImpl implements QPointer {

	private static final long serialVersionUID = 1L;

	protected QStorable _storage = null;

	public NIOPointerImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOPointerImpl(QDataContext dataContext, QStorable storage) {
		super(dataContext);
		this._storage = storage;
	}

	@Override
	public void assign(QBufferedData target) {
		NIOBufferHelper.assign(this, target);
	}

	@Override
	public void assign(QBufferedData target, int position) {
		NIOBufferHelper.assign(this, target);
	}

	@Override
	public void eval(QPointer value) {
		this._storage = (QStorable) value.getStore();
	}

	@Override
	public void dealloc() {
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	public QString qStr() {
		return qStr(getByteSize(_storage));
	}

	public QString qStr(int length) {

		QCharacter character = getDataContext().getDataFactory().createCharacter(length, false, false);
		_storage.assign(character);

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
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (_storage == null)
			return true;
		else
			return _storage.isEmpty();
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
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

		try {

			NIOBufferedDataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			QStorable tempStorage = _storage;
			QDataContext tempDataContext = getDataContext();

			_storage = null;
			_dataContext = null;
			oos.writeObject(this);

			_storage = tempStorage;
			_dataContext = tempDataContext;
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDataImpl) ois.readObject();
			copy._dataContext = _dataContext;
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	protected ByteBuffer getBuffer() {
		if(_storage != null)
			return NIOBufferHelper.getBuffer(_storage);
		else
			return null;
	}

	@Override
	public Object getStore() {
		return _storage;
	}

	@Override
	public int getPosition() {
		return _storage.getPosition();
	}

	private int getByteSize(QStorable storable) {
		if (storable instanceof QBufferedData)
			return ((QBufferedData) storable).getSize();
		else
			throw new IntegratedLanguageDataRuntimeException("Invalid storage: " + storable);
	}

	@Override
	public String toString() {
		return "SPP:" + _storage.hashCode();
	}
}
