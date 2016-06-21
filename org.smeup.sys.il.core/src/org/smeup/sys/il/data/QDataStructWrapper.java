/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.util.List;

public abstract class QDataStructWrapper implements QDataStruct, QBufferedElementDelegator {

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
	public void bitoff(byte bitNumbers) {
		delegate.bitoff(bitNumbers);
	}

	@Override
	public void bitoff(String bitNumbers) {
		delegate.bitoff(bitNumbers);
	}

	@Override
	public void biton(byte bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public void biton(String bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public void biton(QString bitNumbers) {
		delegate.biton(bitNumbers);
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
	public void cat(QString factor1, QString factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		delegate.cat(factor1, factor2);
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
	public void cat(String factor1, QString factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		delegate.cat(factor1, factor2);
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
	public void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
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
	public void cat(String factor1, String factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);		
	}

	@Override
	public void cat(String factor1, QString factor2, Number space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public void cat(String factor1, QString factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);		
	}

	@Override
	public void clear() {
		delegate.clear();
	}

	@Override
	public boolean eq(DataSpecial value) {
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
	public void eval(QString value) {
		delegate.eval(value);
	}

	@Override
	public void eval(QIndicator value) {
		delegate.eval(value);
	}

	@Override
	public void eval(boolean value) {
		delegate.eval(value);
	}

	@Override
	public QBufferedData eval(DataSpecial value) {
		delegate.eval(value);
		return this;
	}

	@Override
	public void eval(String value) {
		delegate.eval(value);
	}

	@Override
	public void eval(QDataArea<? extends QString> value) {
		delegate.eval(value);
	}

	@Override
	public void evalr(String value) {
		delegate.evalr(value);
	}

	@Override
	public void evalr(QString value) {
		delegate.evalr(value);
	}

	@Override
	public boolean ge(DataSpecial value) {
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
	public QDataStruct getDelegate() {
		return this.delegate;
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
	public List<String> getElementNames() {
		return delegate.getElementNames();
	}

	@Override
	public boolean gt(DataSpecial value) {
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
	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public boolean isNull() {
		return delegate.isNull();
	}

	@Override
	public boolean le(DataSpecial value) {
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
	public int getLength() {
		return delegate.getLength();
	}

	@Override
	public boolean lt(DataSpecial value) {
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
	public void move(DataSpecial value) {
		delegate.move(value);
	}

	@Override
	public void move(DataSpecial value, boolean clear) {
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
	public void move(String value) {
		delegate.move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void movel(DataSpecial value) {
		delegate.movel(value);
	}

	@Override
	public void movel(DataSpecial value, boolean clear) {
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
	public void movel(String value) {
		delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public boolean ne(DataSpecial value) {
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
	public void move(QDataFiller value) {
		delegate.move(value);
	}

	@Override
	public void move(QDataFiller value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public void movel(QDataFiller value) {
		delegate.movel(value);
	}

	@Override
	public void movel(QDataFiller value, boolean clear) {
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
	public QBufferedData eval(byte value) {
		delegate.eval(value);
		return this;
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
	public void xlate(QString from, QString to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(String from, String to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(String from, String to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(String from, QString to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(QString from, String to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}
	
	@Override
	public void xlate(byte from, String to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(QString from, QString to, String source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(QString from, QString to, String source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, String to, String source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public void xlate(String from, String to, String source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public void xlate(String from, String to, String source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, String source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
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
	public QNumeric qScan(byte argument) {
		return delegate.qScan(argument);
	}

	@Override
	public QNumeric qScan(byte argument, QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public QNumeric qScan(byte argument, Number start) {
		return delegate.qScan(argument, start);
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

	public QDatetime qDate(DatetimeFormat format) {
		return delegate.qDate(format);
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

	public void testn(QIndicator numeric, QIndicator blank) {
		delegate.testn(numeric, blank);
	}

	public void testn(QIndicator numeric, QIndicator blank, QIndicator blankNumeric) {
		delegate.testn(numeric, blank, blankNumeric);
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
	

	@Override
	public QNumeric qCheck(QCharacter base) {
		return delegate.qCheck(base);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QNumeric start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheck(QCharacter base, Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(QCharacter base, Number start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheck(String base) {
		return delegate.qCheck(base);
	}

	@Override
	public QNumeric qCheck(String base, QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public QNumeric qCheck(String base, QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(String base, QNumeric start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheck(String base, Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(String base, Number start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base) {
		return delegate.qCheck(base);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QNumeric start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, Number start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(String base) {
		return delegate.qCheck(base);
	}

	@Override
	public QNumeric qCheckr(String base, QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public QNumeric qCheckr(String base, QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(String base, QNumeric start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(String base, Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(String base, Number start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}
	
	@Override
	public QString qPlus(String factor1) {
		return delegate.qPlus(factor1);
	}

	@Override
	public QString qPlus(QString factor1) {
		return delegate.qPlus(factor1);
	}

	@Override
	public Object getStore() {
		return delegate.getStore();
	}

	@Override
	public int getPosition() {
		return delegate.getPosition();
	}

	public boolean eq(QDataFiller value) {
		return delegate.eq(value);
	}

	public QBufferedData eval(QDataFiller value) {
		delegate.eval(value);
		return this;
	}

	public boolean ge(QDataFiller value) {
		return delegate.ge(value);
	}

	public boolean gt(QDataFiller value) {
		return delegate.gt(value);
	}

	public boolean le(QDataFiller value) {
		return delegate.le(value);
	}

	public boolean lt(QDataFiller value) {
		return delegate.lt(value);
	}

	public boolean ne(QDataFiller value) {
		return delegate.ne(value);
	}

	public boolean isStoreOwner() {
		return delegate.isStoreOwner();
	}

	public BufferedElementType getBufferedElementType() {
		return delegate.getBufferedElementType();
	}
	
	@Override
	public BufferedDataType getBufferedDataType() {
		return delegate.getBufferedDataType();
	}
	
	public void move(QString value) {
		delegate.move(value);
	}

	public void move(QString value, boolean clear) {
		delegate.move(value, clear);
	}

	public void move(QNumeric value) {
		delegate.move(value);
	}

	public void move(QNumeric value, boolean clear) {
		delegate.move(value, clear);
	}

	public void movel(QString value) {
		delegate.movel(value);
	}

	public void movel(QString value, boolean clear) {
		delegate.movel(value, clear);
	}

	public void movel(QNumeric value) {
		delegate.movel(value);
	}

	public void movel(QNumeric value, boolean clear) {
		delegate.movel(value, clear);
	}

	public void movea(QArray<? extends QString> value) {
		delegate.movea(value);
	}

	public void movea(QArray<? extends QString> value, boolean clear) {
		delegate.movea(value, clear);
	}

	public void movea(QArray<? extends QString> value, int startIndex) {
		delegate.movea(value, startIndex);
	}

	public void movea(QArray<? extends QString> value, int startIndex, boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public void movea(QArray<? extends QString> value, QNumeric startIndex) {
		delegate.movea(value, startIndex);
	}

	public void movea(QArray<? extends QString> value, QNumeric startIndex, boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public void move(QBufferedElement value) {
		delegate.move(value);
	}

	public void move(QBufferedElement value, boolean clear) {
		delegate.move(value, clear);
	}

	public void movel(QBufferedElement value) {
		delegate.movel(value);
	}

	public void movel(QBufferedElement value, boolean clear) {
		delegate.movel(value, clear);
	}

	public boolean isVarying() {
		return delegate.isVarying();
	}

	public QCharacter qTrim(String trimmed) {
		return delegate.qTrim(trimmed);
	}

	public QCharacter qTrim(QString trimmed) {
		return delegate.qTrim(trimmed);
	}

	public void cat(byte factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	public void testb(byte bitNumbers, QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public void testb(String bitNumbers, QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public void testb(QString bitNumbers, QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public void testb(byte bitNumbers, QIndicator off, QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public void testb(String bitNumbers, QIndicator off, QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public void testb(QString bitNumbers, QIndicator off, QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public void testb(byte bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}

	public void testb(String bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}

	public void testb(QString bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}
	
	public void reset() {
		delegate.reset();
	}
	
	public void snap() {
		delegate.snap();
	}
	
	@Override
	public QIndicator qFound() {
		return delegate.qFound();
	}
	
	@Override
	public void eval(QScroller<? extends QString> value) {
		delegate.eval(value);
	}
	
	@Override
	public void eval(QStroller<? extends QDataStruct> value) {
		delegate.eval(value);
	}

	public void xlate(String from, byte to, QString source) {
		delegate.xlate(from, to, source);
	}
}