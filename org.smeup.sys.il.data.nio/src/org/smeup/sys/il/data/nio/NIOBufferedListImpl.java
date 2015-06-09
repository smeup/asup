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

import java.util.Iterator;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;

public abstract class NIOBufferedListImpl<D extends QBufferedData> extends NIOBufferedDataImpl implements QBufferedList<D>, QBufferedData {

	private static final long serialVersionUID = 1L;

	public NIOBufferedListImpl() {
		super();
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
		try {
			return super.toString();
		} catch (Exception e) {
			// TODO
			return "";
		}
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void eval(QList<D> value) {
		value.eval(this);
	}

	@Override
	public void sorta() {
		// TODO Auto-generated method stub

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
		for (QBufferedData elementTarget : this)
			elementTarget.movel(value, true);
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		for (QBufferedData elementTarget : this)
			elementTarget.eval(value);
	}

}