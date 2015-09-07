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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;

public abstract class NIOBufferedListImpl<D extends QBufferedData> extends NIOBufferedDataImpl implements QBufferedList<D>, QBufferedData {

	private static final long serialVersionUID = 1L;

	private int lengthSlot = 0;
	private D _model;
	
	public NIOBufferedListImpl() {
		super();
	}
	
	public NIOBufferedListImpl(D model) {
		super();
		this._model = model;
	}

	protected D getModel() {
		return _model;
	}

	protected void setModel(D _model) {
		this._model = _model;
	}
	
	protected int getLengthSlot() {
		return lengthSlot;
	}

	protected void setLengthSlot(int lengthSlot) {
		this.lengthSlot = lengthSlot;
	}
	
	@Override
	public boolean isEmpty() {

		for (D element : this)
			if (!element.isEmpty())
				return false;

		return true;
	}

	@Override
	public void clear() {
		for (QBufferedData element : this)
			element.clear();
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), getSize());
	}

	/*
	 * @Override public void reset() { for (QBufferedData element : this) {
	 * element.reset(); } }
	 */

	@Override
	public void eval(QBufferedData value) {
		for (QBufferedData element : this)
			element.eval(value);
	}

	@Override
	public D get(QNumeric index) {
		return get(index.asInteger());
	}

	@Override
	public Iterator<D> iterator() {
		return new NIOListIteratorImpl<D>(this);
	}

	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		for (QBufferedData element : this)
			element.move(value, clear);
	}

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		for (QBufferedData element : this)
			element.move(value, clear);
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void move(String value, boolean clear) {
		for (QBufferedData element : this)
			element.move(value, clear);
	}

	@Override
	public void movel(int value, boolean clear) {
		for (QBufferedData element : this)
			element.movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {

		if (value instanceof QArray<?>)
			movea((QArray<?>) value, clear);
		else
			for (QBufferedData element : this)
				element.movel(value, clear);
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(String value, boolean clear) {
		for (QBufferedData element : this)
			element.movel(value, clear);
	}

	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer(getSize());

		for (QBufferedData element : this) {
			sb.append(element);
		}

		return sb.toString();
	}

	@Override
	public <E extends Enum<E>> void move(E value) {

		for (QBufferedData element : this) {
			element.move(value);
		}
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {

		for (QBufferedData element : this) {
			element.move(value, clear);
		}


	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		
		for (QBufferedData element : this) {
			element.movel(value);
		}
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		
		for (QBufferedData element : this) {
			element.movel(value, clear);
		}
	}

	@Override
	public void accept(QDataVisitor visitor) {

		if (visitor.visit(this)) {

			Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);
			visitor.endVisit(this);
		}
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {

		for (QBufferedData element : this) {
			element.eval(value);
		}
	}

	@Override
	public void eval(QList<D> value) {
		value.eval(this);
	}

	@Override
	public void sorta() {
		// TODO Verificare con Mattia
	
		List<String> sortableList = new ArrayList<String>();		
		for (QBufferedData elementTarget : this) {
			sortableList.add(elementTarget.s());
		}

		Collections.sort(sortableList, new Comparator<String>() {
			public int compare(String param1, String param2) {
				return param1.compareTo(param2);
			}
		});
		clear();

		int i = 0;
		for (QBufferedData elementTarget : this) {
			elementTarget.movel(sortableList.get(i));
			i++;
		}
	}

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {

		if (getSize() == value.getSize())
			NIOBufferHelper.movel(getBuffer(), getPosition(), value.getSize(), value.asBytes(), false, (byte) 32);
		else {

			int i = 1;
			for (QBufferedData elementTarget : this) {

				if (value.capacity() >= i)
					elementTarget.eval(value.get(i));
				else if (clear)
					elementTarget.clear();
				i++;
			}
		}

	}

	@Override
	public void movea(QBufferedData value) {
		movea(value, false);
	}

	@Override
	public void movea(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.getSize(), value.asBytes(), clear, (byte) 32);
	}

	@Override
	public void movea(QDataWriter value) {
		this.accept(value);
	}

	@Override
	public void movea(String value) {
		for (QBufferedData element : this)
			element.movel(value, true);
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		for (QBufferedData element : this)
			element.eval(value);
	}

}