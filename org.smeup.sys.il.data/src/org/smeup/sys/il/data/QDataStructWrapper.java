/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.util.List;

public abstract class QDataStructWrapper implements QDataStruct, QBufferedDataDelegator {

	private static final long serialVersionUID = 1L;

	private QDataStruct delegate;

	@Override
	public void accept(QDataVisitor visitor) {
		delegate.accept(visitor);
	}

	@Override
	public byte[] asBytes() {
		return delegate.asBytes();
	}

	@Override
	public void assign(QBufferedData value) {
		delegate.assign(value);
	}

	@Override
	public void assign(QBufferedData value, int position) {
		delegate.assign(value, position);
	}

	@Override
	public String asString() {
		return delegate.asString();
	}

	@Override
	public void cat(QString factor1) {
		delegate.cat(factor1);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1) {
		delegate.cat(factor1);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, Number space) {
		delegate.cat(factor1, space);
	}

	@Override
	public void cat(String factor1, Number space) {
		delegate.cat(factor1, space);
	}

	@Override
	public void cat(String factor1, String factor2, int space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, int space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, String factor2, int space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, String factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public void cat(QString factor1, String factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public void cat(String factor1, boolean clear) {
		delegate.cat(factor1, clear);
	}

	@Override
	public void cat(QString factor1, Number space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public void cat(String factor1, Number space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public void cat(QString factor1, QNumeric space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public void cat(String factor1, QNumeric space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public void cat(QString factor1, boolean clear) {
		delegate.cat(factor1, clear);
	}
	
	@Override
	public void clear() {
		delegate.clear();
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return delegate.eq(value);
	}

	@Override
	public boolean eq(QString value) {
		return delegate.eq(value);
	}

	@Override
	public boolean eq(String value) {
		return delegate.eq(value);
	}

	@Override
	public boolean eq(QDataWriter value) {
		return delegate.eq(value);
	}

	@Override
	public void eval(boolean value) {
		delegate.eval(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		delegate.eval(value);
	}

	@Override
	public void eval(QBufferedData value) {
		delegate.eval(value);
	}

	@Override
	public void eval(String value) {
		delegate.eval(value);
	}

	@Override
	public void evalr(String value) {
		delegate.evalr(value);
	}

	@Override
	public void evalr(QBufferedData value) {
		delegate.evalr(value);
	}

	@Override
	public void eval(QDataWriter value) {
		delegate.eval(value);
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return delegate.ge(value);
	}

	@Override
	public boolean ge(QString value) {
		return delegate.eq(value);
	}

	@Override
	public boolean ge(String value) {
		return delegate.ge(value);
	}

	@Override
	public boolean ge(QDataWriter value) {
		return delegate.ge(value);
	}

	@Override
	public QDataStruct getDelegate() {
		return this.delegate;
	}

	@Override
	public QBufferedData getElement(int position) {
		return delegate.getElement(position);
	}

	@Override
	public QBufferedData getElement(String name) {
		return delegate.getElement(name);
	}

	@Override
	public List<QBufferedData> getElements() {
		return delegate.getElements();
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return delegate.gt(value);
	}

	@Override
	public boolean gt(QString value) {
		return delegate.gt(value);
	}

	@Override
	public boolean gt(String value) {
		return delegate.gt(value);
	}

	@Override
	public boolean gt(QDataWriter value) {
		return delegate.gt(value);
	}

	@Override
	public void in() {
		delegate.in();
	}

	@Override
	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public boolean isNull() {
		return delegate.isNull();
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return delegate.le(value);
	}

	@Override
	public boolean le(QString value) {
		return delegate.le(value);
	}

	@Override
	public boolean le(String value) {
		return delegate.le(value);
	}

	@Override
	public boolean le(QDataWriter value) {
		return delegate.le(value);
	}

	@Override
	public int getLength() {
		return delegate.getLength();
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return delegate.lt(value);
	}

	@Override
	public boolean lt(QString value) {
		return delegate.lt(value);
	}

	@Override
	public boolean lt(String value) {
		return delegate.lt(value);
	}

	@Override
	public boolean lt(QDataWriter value) {
		return delegate.lt(value);
	}

	@Override
	public void move(boolean value) {
		delegate.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		delegate.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void move(int value) {
		delegate.move(value);
	}

	@Override
	public void move(int value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void move(Number value) {
		delegate.move(value);
	}

	@Override
	public void move(Number value, boolean clear) {
		delegate.move(value);
	}

	@Override
	public void move(QBufferedData value) {
		delegate.move(value);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void move(String value) {
		delegate.move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void movea(QArray<?> value) {
		delegate.movea(value);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		delegate.movea(value, clear);
	}

	@Override
	public void movea(String value) {
		delegate.movea(value);
	}

	@Override
	public void movea(String value, boolean clear) {
		delegate.movea(value, clear);
	}
	
	@Override
	public void movel(boolean value) {
		delegate.movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		delegate.movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public void movel(int value) {
		delegate.movel(value);
	}

	@Override
	public void movel(int value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public void movel(Number value) {
		delegate.movel(value);
	}

	@Override
	public void movel(Number value, boolean clear) {
		delegate.movel(value);
	}

	@Override
	public void movel(QBufferedData value) {
		delegate.movel(value);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public void movel(String value) {
		delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return delegate.ne(value);
	}

	@Override
	public boolean ne(QString value) {
		return delegate.ne(value);
	}

	@Override
	public boolean ne(String value) {
		return delegate.ne(value);
	}

	@Override
	public boolean ne(QDataWriter value) {
		return delegate.ne(value);
	}

	@Override
	public void out() {
		delegate.out();
	}

	public void setDelegate(QDataStruct delegate) {
		this.delegate = delegate;
	}

	@Override
	public int getSize() {
		return delegate.getSize();
	}

	@Override
	public String toString() {
		return delegate.toString();
	}

	@Override
	public String trim() {
		return delegate.trim();
	}

	@Override
	public String trimL() {
		return delegate.trimL();
	}

	@Override
	public String trimR() {
		return delegate.trimR();
	}

	@Override
	public void move(QDataWriter value) {
		delegate.move(value);
	}

	@Override
	public void move(QDataWriter value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void movel(QDataWriter value) {
		delegate.movel(value);
	}

	@Override
	public void movel(QDataWriter value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public void cat(QString factor1, QNumeric space) {
		delegate.cat(factor1, space);
	}

	@Override
	public void cat(String factor1, QNumeric space) {
		delegate.cat(factor1, space);
	}

	@Override
	public boolean eq(QHexadecimal value) {
		return delegate.eq(value);
	}

	@Override
	public boolean ne(QHexadecimal value) {
		return delegate.ne(value);
	}

	@Override
	public boolean eq(byte value) {
		return delegate.eq(value);
	}

	@Override
	public void eval(byte value) {
		delegate.eval(value);
	}

	@Override
	public String s() {
		return delegate.s();
	}

	@Override
	public boolean ge(QHexadecimal value) {
		return delegate.ge(value);
	}

	@Override
	public boolean le(QHexadecimal value) {
		return delegate.le(value);
	}

	@Override
	public boolean eq(QBufferedData value) {
		return delegate.eq(value);
	}

	@Override
	public boolean ne(QBufferedData value) {
		return delegate.ne(value);
	}

	@Override
	public void move(QDecimal value) {
		delegate.move(value);
	}

	@Override
	public void move(QDecimal value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString target) {
		delegate.xlate(from, to, target);
	}

	@Override
	public void xlate(String from, String to, QString target) {
		delegate.xlate(from, to, target);
	}

	@Override
	public void xlate(byte from, String to, QString target) {
		delegate.xlate(from, to, target);
	}

	@Override
	public QCharacter qSubst(QNumeric start, QNumeric length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public QCharacter qSubst(QNumeric start) {
		return delegate.qSubst(start);
	}

	@Override
	public QCharacter qSubst(Number start, Number length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public QCharacter qSubst(Number start) {
		return delegate.qSubst(start);
	}

	@Override
	public QCharacter qSubst(QNumeric start, Number length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public QCharacter qSubst(Number start, QNumeric length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public QCharacter qTrim() {
		return delegate.qTrim();
	}

	@Override
	public QCharacter qTriml() {
		return delegate.qTriml();
	}

	@Override
	public QCharacter qTrimr() {
		return delegate.qTrimr();
	}

	@Override
	public QNumeric qScan(QCharacter argument, QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public QNumeric qScan(String argument, QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public QNumeric qScan(QCharacter argument, Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public QNumeric qScan(String argument, Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public QNumeric qScan(QCharacter argument) {
		return delegate.qScan(argument);
	}

	@Override
	public QNumeric qScan(String argument) {
		return delegate.qScan(argument);
	}

	@Override
	public QNumeric qInt() {
		return delegate.qInt();
	}

	@Override
	public QNumeric qInth() {
		return delegate.qInth();
	}
	
	@Override
	public QNumeric qLen() {
		return delegate.qLen();
	}

	@Override
	public void testn(QIndicator numeric) {
		delegate.testn(numeric);
	}

	@Override
	public QPointer qAddr() {
		return delegate.qAddr();
	}

	public QNumeric qScan(QCharacter source, QIndicator found) {
		return delegate.qScan(source, found);
	}

	public QNumeric qScan(QCharacter source, QNumeric start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public QNumeric qScan(QCharacter source, Number start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public QNumeric qScan(String source, QIndicator found) {
		return delegate.qScan(source, found);
	}

	public QNumeric qScan(String source, QNumeric start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public QNumeric qScan(String source, Number start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public boolean ne(byte value) {
		return delegate.ne(value);
	}

	public boolean ge(byte value) {
		return delegate.ge(value);
	}

	public boolean gt(byte value) {
		return delegate.gt(value);
	}

	public boolean le(byte value) {
		return delegate.le(value);
	}

	public boolean lt(byte value) {
		return delegate.lt(value);
	}
	public void movea(QArray<?> value, int startIndex) {
		delegate.movea(value, startIndex);
	}

	public void movea(QArray<?> value, QNumeric startIndex) {
		delegate.movea(value, startIndex);
	}

	public void movea(QArray<?> value, int startIndex, boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public void movea(QArray<?> value, QNumeric startIndex, boolean clear) {
		delegate.movea(value, startIndex, clear);
	}
}