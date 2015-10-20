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

import java.util.List;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.SortDirection;

public class NIOStrollerImpl<D extends QDataStruct> extends NIOScrollerImpl<D> implements QStroller<D> {

	private static final long serialVersionUID = 1L;

	public NIOStrollerImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOStrollerImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection) {
		super(dataContext, model, dimension, sortDirection);
	}

	@Override
	public String asString() {
		// absolute(1);
		return current().asString();
	}

	@Override
	public void cat(QString factor1) {
		current().cat(factor1);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1) {
		current().cat(factor1);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, Number space) {
		current().cat(factor1, space);
	}

	@Override
	public void cat(String factor1, Number space) {
		current().cat(factor1, space);
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return current().eq(value);
	}

	@Override
	public boolean eq(QString value) {
		return current().eq(value);
	}

	@Override
	public boolean eq(String value) {
		return current().eq(value);
	}

	@Override
	public void eval(boolean value) {
		current().eval(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		current().eval(value);
	}

	@Override
	public void eval(QBufferedData value) {
		current().eval(value);
	}

	@Override
	public void eval(String value) {
		current().eval(value);
	}

	@Override
	public void eval(QStroller<D> value) {
		movea(value, false);
	}

	@Override
	public void evalr(String value) {
		current().evalr(value);
	}

	@Override
	public void evalr(QBufferedData value) {
		current().evalr(value);
	}
	
	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return current().ge(value);
	}

	@Override
	public boolean ge(QString value) {
		return current().ge(value);
	}

	@Override
	public boolean ge(String value) {
		return current().ge(value);
	}

	@Override
	public QBufferedData getElement(int position) {
		return current().getElement(position);
	}

	@Override
	public QBufferedData getElement(String name) {
		return current().getElement(name);
	}

	@Override
	public List<QBufferedData> getElements() {
		return current().getElements();
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return current().gt(value);
	}

	@Override
	public boolean gt(QString value) {
		return current().gt(value);
	}

	@Override
	public boolean gt(String value) {
		return current().gt(value);
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return current().le(value);
	}

	@Override
	public boolean le(QString value) {
		return current().le(value);
	}

	@Override
	public boolean le(String value) {
		return current().le(value);
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return current().lt(value);
	}

	@Override
	public boolean lt(QString value) {
		return current().lt(value);
	}

	@Override
	public boolean lt(String value) {
		return current().lt(value);
	}

	@Override
	public void move(boolean value) {
		current().move(value);
	}

	@Override
	public void move(QDecimal value) {
		move(value, false);
	}

	@Override
	public void move(QDecimal value, boolean clear) {
		NIOBufferedDataImpl bufferedData = (NIOBufferedDataImpl) current();
		NIOBufferHelper.move(getBuffer(), bufferedData.getPosition(), bufferedData.getLength(), value.asBytes(), true, (byte) 64);
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		current().move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(int value) {
		current().move(value);
	}

	@Override
	public void move(int value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(QBufferedData value) {
		current().move(value);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(String value) {
		current().move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void movea(QArray<?> value) {
		current().movea(value);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		current().movea(value, clear);
	}

	@Override
	public void movel(boolean value) {
		current().movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		current().movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(int value) {
		current().movel(value);
	}

	@Override
	public void movel(int value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		current().movel(value);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(String value) {
		current().movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return current().ne(value);
	}

	@Override
	public boolean ne(QString value) {
		return current().ne(value);
	}

	@Override
	public boolean ne(String value) {
		return current().ne(value);
	}

	@Override
	public String trim() {
		return current().trim();
	}

	@Override
	public String trimL() {
		return current().trimL();
	}

	@Override
	public String trimR() {
		return current().trimR();
	}

	@Override
	public void xlate(String from, String to, QString target) {
		current().xlate(from, to, target);
	}

	@Override
	public void xlate(QString from, String to, QString target) {
		current().xlate(from, to, target);
	}

	@Override
	public void xlate(QString from, QString to, QString target) {
		current().xlate(from, to, target);
	}

	@Override
	public void xlate(byte from, String to, QString target) {
		current().xlate(from, to, target);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public void cat(String factor1, QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public boolean eq(QHexadecimal value) {
		return current().eq(value);
	}

	@Override
	public boolean ne(QHexadecimal value) {
		return current().ne(value);
	}

	@Override
	public boolean eq(byte value) {
		return current().eq(value);
	}

	@Override
	public void eval(byte value) {
		current().eval(value);
	}

	@Override
	public boolean ge(QHexadecimal value) {
		return current().ge(value);
	}

	@Override
	public boolean le(QHexadecimal value) {
		return current().le(value);
	}

	@Override
	public QCharacter qSubst(QNumeric start, QNumeric length) {
		return current().qSubst(start, length);
	}

	@Override
	public QCharacter qSubst(QNumeric start) {
		return current().qSubst(start);
	}

	@Override
	public QCharacter qSubst(Number start, Number length) {
		return current().qSubst(start, length);
	}

	@Override
	public QCharacter qSubst(Number start) {
		return current().qSubst(start);
	}

	@Override
	public QCharacter qSubst(QNumeric start, Number length) {
		return current().qSubst(start, length);
	}

	@Override
	public QCharacter qSubst(Number start, QNumeric length) {
		return current().qSubst(start, length);
	}

	@Override
	public QCharacter qTrim() {
		return current().qTrim();
	}

	@Override
	public QCharacter qTriml() {
		return current().qTriml();
	}

	@Override
	public QCharacter qTrimr() {
		return current().qTrimr();
	}

	@Override
	public void testn(QIndicator numeric) {
		current().testn(numeric);
	}

	public QNumeric qScan(QCharacter source) {
		return current().qScan(source);
	}

	public QNumeric qScan(QCharacter source, QIndicator found) {
		return current().qScan(source, found);
	}

	public QNumeric qScan(QCharacter source, QNumeric start) {
		return current().qScan(source, start);
	}

	public QNumeric qScan(QCharacter source, QNumeric start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	public QNumeric qScan(QCharacter source, Number start) {
		return current().qScan(source, start);
	}

	public QNumeric qScan(QCharacter source, Number start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	public QNumeric qScan(String source) {
		return current().qScan(source);
	}

	public QNumeric qScan(String source, QIndicator found) {
		return current().qScan(source, found);
	}

	public QNumeric qScan(String source, QNumeric start) {
		return current().qScan(source, start);
	}

	public QNumeric qScan(String source, QNumeric start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	public QNumeric qScan(String source, Number start) {
		return current().qScan(source, start);
	}

	public QNumeric qScan(String source, Number start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	@Override
	public void cat(String factor1, String factor2, int space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, int space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, String factor2, int space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, String factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public void cat(QString factor1, String factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public void cat(String factor1, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public void cat(QString factor1, Number space, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public void cat(String factor1, Number space, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public void cat(QString factor1, QNumeric space, boolean clear) {
		current().cat(factor1, space, clear);
	}

	@Override
	public void cat(String factor1, QNumeric space, boolean clear) {
		current().cat(factor1, space, clear);
	}

	@Override
	public void cat(QString factor1, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public QNumeric qInt() {
		return current().qInt();
	}

	@Override
	public QNumeric qInth() {
		return current().qInth();
	}
}