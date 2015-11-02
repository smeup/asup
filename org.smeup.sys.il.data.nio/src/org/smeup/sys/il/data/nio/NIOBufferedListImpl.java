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

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.SortDirection;

public abstract class NIOBufferedListImpl<D extends QBufferedData> extends NIOBufferedDataImpl implements QBufferedList<D>, QBufferedData {

	private static final long serialVersionUID = 1L;

	private NIOBufferedListImpl<?> listOwner;
	private D _model;
	private SortDirection sortDirection = null;

	public NIOBufferedListImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOBufferedListImpl(QDataContext dataContext, D model, SortDirection sortDirection) {
		super(dataContext);
		this._model = model;
		this.sortDirection = sortDirection;
	}

	protected D getModel() {
		return _model;
	}

	protected void setModel(D _model) {
		this._model = _model;
	}

	protected SortDirection getSortDirection() {
		return this.sortDirection;
	}

	protected NIOBufferedListImpl<?> getListOwner() {
		return this.listOwner;
	}

	protected void setListOwner(NIOBufferedListImpl<?> listOwner) {
		this.listOwner = listOwner;
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

		int i = 0;

		switch (defaultComparator) {
		case ASCII:
			List<String> stringList = new ArrayList<String>();
			for (QBufferedData elementTarget : this) {
				stringList.add(elementTarget.s());
			}

			Collections.sort(stringList, new Comparator<String>() {
				public int compare(String param1, String param2) {

					switch (getSortDirection()) {
					case ASCEND:
						return param1.compareTo(param2);
					case DESCEND:
						return param1.compareTo(param2) * -1;
					}

					return param1.compareTo(param2);
				}
			});

			for (QBufferedData elementTarget : this) {
				elementTarget.movel(stringList.get(i));
				i++;
			}

			break;
		case EBCDIC:

			if (getListOwner() != null) {
				List<byte[]> dataList = new ArrayList<byte[]>();

				for (QBufferedData elementTarget : getListOwner()) {
					dataList.add(elementTarget.asBytes());
				}

				Collections.sort(dataList, new Comparator<byte[]>() {
					@Override
					public int compare(byte[] param1, byte[] param2) {

						byte[] b1 = Arrays.copyOfRange(param1, getPosition(), getPosition() + getModel().getLength());
						byte[] b2 = Arrays.copyOfRange(param2, getPosition(), getPosition() + getModel().getLength());

						switch (getSortDirection()) {
						case ASCEND:
							return compareBytes(b1, b2);
						case DESCEND:
							return compareBytes(b1, b2) * -1;
						}

						return compareBytes(b1, b2);
					}
				});

				for (byte[] bd : dataList) {

					((NIOBufferedDataImpl) getListOwner().get(i + 1))._eval(bd);
					i++;
				}

			} else {

				List<byte[]> dataList = new ArrayList<byte[]>();
				for (QBufferedData elementTarget : this) {
					dataList.add(elementTarget.asBytes());
				}

				Collections.sort(dataList, new Comparator<byte[]>() {
					@Override
					public int compare(byte[] param1, byte[] param2) {

						switch (getSortDirection()) {
						case ASCEND:
							return compareBytes(param1, param2);
						case DESCEND:
							return compareBytes(param1, param2) * -1;
						}

						return compareBytes(param1, param2);
					}
				});

				for (byte[] bd : dataList) {
					((NIOBufferedDataImpl) this.get(i + 1))._eval(bd);
					i++;
				}
			}
		}
	}

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		movea(1, value, 1, clear);
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
		movea(1, value);
	}

	@Override
	public void movea(int targetIndex, QDataWriter value) {
		for (int i = targetIndex; i <= capacity(); i++)
			get(i).accept(value);
	}

	@Override
	public void movea(String value) {
		try {
			NIOBufferHelper.movel(getBuffer(), getPosition(), value.length(), value.getBytes(getEncoding()), false, (byte) 32);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(getBuffer(), getPosition(), value.length(), value.getBytes(), false, (byte) 32);
		}
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		movea(1, value);
	}

	@Override
	public <E extends Enum<E>> void movea(QNumeric targetIndex, E value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public <E extends Enum<E>> void movea(int targetIndex, E value) {
		for (int i = targetIndex; i <= capacity(); i++)
			get(i).eval(value);
	}

	@Override
	public void movea(QNumeric targetIndex, QBufferedData value) {
		movea(targetIndex.i(), value);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, QBufferedData value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(int targetIndex, QBufferedData value, boolean clear) {
		movea(targetIndex, value.s(), clear);
	}

	@Override
	public void movea(int targetIndex, String value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, String value, boolean clear) {
		if (clear)
			this.clear();
		int position = ((this.getLength() / this.capacity()) * (targetIndex - 1));
		try {
			NIOBufferHelper.movel(getBuffer(), position, value.length(), value.getBytes(getEncoding()), clear, (byte) 32);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(getBuffer(), position, value.length(), value.getBytes(), clear, (byte) 32);
		}
	}

	@Override
	public void movea(QArray<?> value, QNumeric sourceIndex) {
		movea(value, sourceIndex.i());
	}

	@Override
	public void movea(QArray<?> value, QNumeric sourceIndex, boolean clear) {
		movea(value, sourceIndex.i(), clear);
	}

	@Override
	public void movea(QArray<?> value, int sourceIndex) {
		movea(value, sourceIndex, false);
	}

	@Override
	public void movea(QArray<?> value, int sourceIndex, boolean clear) {
		movea(1, value, sourceIndex, clear);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, int sourceIndex) {
		movea(targetIndex.i(), value, sourceIndex);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, QNumeric sourceIndex) {
		movea(targetIndex.i(), value, sourceIndex.i());
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, QNumeric sourceIndex) {
		movea(targetIndex, value, sourceIndex.i());
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, int sourceIndex) {
		movea(targetIndex, value, sourceIndex, false);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, boolean clear) {
		movea(targetIndex, value, 1, false);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, int sourceIndex, boolean clear) {
		int idx = sourceIndex;
		if (clear)
			this.clear();

		if (getSize() != value.getSize()) {
			int positionSource = ((value.getLength() / value.capacity()) * (sourceIndex - 1));
			int positionTarget = ((this.getLength() / this.capacity()) * (targetIndex - 1));
			// TODO è corretto splittare i bytes???
			try {
				NIOBufferHelper.movel(getBuffer(), positionTarget, value.getSize(), value.s().substring(positionSource).getBytes(getEncoding()), false, (byte) 32);
			} catch (UnsupportedEncodingException e) {
				NIOBufferHelper.movel(getBuffer(), positionTarget, value.getSize(), value.s().substring(positionSource).getBytes(), false, (byte) 32);
			}
		} else {
			for (int i = targetIndex; i <= this.capacity(); i++) {
				QBufferedData element = this.get(i);
				element.movel(value.get(idx), true);
				idx++;
			}
		}
	}

	@Override
	public D[] asArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public D get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, D value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(QNumeric index, D value) {
		// TODO Auto-generated method stub

	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}