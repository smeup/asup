/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.nio.ByteBuffer;
import java.util.List;

public abstract class QDataStructWrapper implements QDataStruct, QBufferedElementDelegator {

	private static final long serialVersionUID = 1L;

	private QDataStruct delegate;

	@Override
	public final void accept(QDataVisitor visitor) {
		delegate.accept(visitor);
	}

	@Override
	public final byte[] asBytes() {
		return delegate.asBytes();
	}

	@Override
	public final void assign(QBufferedData value) {
		delegate.assign(value);
	}

	@Override
	public final void slice(QBufferedData value) {
		delegate.slice(value);
	}
	
	@Override
	public final void slice(QBufferedData value, int position) {
		delegate.slice(value, position);
	}

	@Override
	public final String asString() {
		return delegate.asString();
	}

	@Override
	public final void bitoff(byte bitNumbers) {
		delegate.bitoff(bitNumbers);
	}

	@Override
	public final void bitoff(String bitNumbers) {
		delegate.bitoff(bitNumbers);
	}

	@Override
	public final void biton(byte bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public final void biton(String bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public final void biton(QString bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public final void cat(QString factor1) {
		delegate.cat(factor1);
	}

	@Override
	public final void cat(QString factor1, QString factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(QString factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1) {
		delegate.cat(factor1);
	}

	@Override
	public final void cat(String factor1, QString factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(QString factor1, Number space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final void cat(String factor1, Number space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(String factor1, String factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(QString factor1, String factor2, boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(String factor1, boolean clear) {
		delegate.cat(factor1, clear);
	}

	@Override
	public final void cat(QString factor1, Number space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(String factor1, Number space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(QString factor1, QNumeric space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(String factor1, QNumeric space, boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(QString factor1, boolean clear) {
		delegate.cat(factor1, clear);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);		
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space) {
		delegate.cat(factor1, factor2, space);		
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space, boolean clear) {
		delegate.cat(factor1, factor2, space, clear);		
	}

	@Override
	public final void clear() {
		delegate.clear();
	}

	@Override
	public final boolean eq(DataSpecial value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean eq(QString value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean eq(String value) {
		return delegate.eq(value);
	}

	@Override
	public final void eval(QString value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(QIndicator value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(boolean value) {
		delegate.eval(value);
	}

	@Override
	public final QBufferedData eval(DataSpecial value) {
		delegate.eval(value);
		return this;
	}

	@Override
	public final void eval(String value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(QDataArea<? extends QString> value) {
		delegate.eval(value);
	}

	@Override
	public final void evalr(String value) {
		delegate.evalr(value);
	}

	@Override
	public final void evalr(QString value) {
		delegate.evalr(value);
	}

	@Override
	public final boolean ge(DataSpecial value) {
		return delegate.ge(value);
	}

	@Override
	public final boolean ge(QString value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean ge(String value) {
		return delegate.ge(value);
	}

	@Override
	public final QDataStruct getDelegate() {
		return this.delegate;
	}

	@Override
	public final QBufferedData getElement(String name) {
		return delegate.getElement(name);
	}

	@Override
	public final List<QBufferedData> getElements() {
		return delegate.getElements();
	}

	@Override
	public final List<String> getElementNames() {
		return delegate.getElementNames();
	}

	@Override
	public final boolean gt(DataSpecial value) {
		return delegate.gt(value);
	}

	@Override
	public final boolean gt(QString value) {
		return delegate.gt(value);
	}

	@Override
	public final boolean gt(String value) {
		return delegate.gt(value);
	}

	@Override
	public final boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public final boolean isNull() {
		return delegate.isNull();
	}

	@Override
	public final boolean le(DataSpecial value) {
		return delegate.le(value);
	}

	@Override
	public final boolean le(QString value) {
		return delegate.le(value);
	}

	@Override
	public final boolean le(String value) {
		return delegate.le(value);
	}

	@Override
	public final int getLength() {
		return delegate.getLength();
	}

	@Override
	public final boolean lt(DataSpecial value) {
		return delegate.lt(value);
	}

	@Override
	public final boolean lt(QString value) {
		return delegate.lt(value);
	}

	@Override
	public final boolean lt(String value) {
		return delegate.lt(value);
	}

	@Override
	public final void move(DataSpecial value) {
		delegate.move(value);
	}

	@Override
	public final void move(DataSpecial value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public final void move(Number value) {
		delegate.move(value);
	}

	@Override
	public final void move(Number value, boolean clear) {
		delegate.move(value);
	}
	
	@Override
	public final void move(String value) {
		delegate.move(value);
	}

	@Override
	public final void move(String value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public final void movel(DataSpecial value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(DataSpecial value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public final void movel(Number value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(Number value, boolean clear) {
		delegate.movel(value);
	}

	@Override
	public final void movel(String value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(String value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public final boolean ne(DataSpecial value) {
		return delegate.ne(value);
	}

	@Override
	public final boolean ne(QString value) {
		return delegate.ne(value);
	}

	@Override
	public final boolean ne(String value) {
		return delegate.ne(value);
	}

	public final void setDelegate(QDataStruct delegate) {
		this.delegate = delegate;
	}

	@Override
	public final int getSize() {
		return delegate.getSize();
	}

	@Override
	public final String toString() {
		return delegate.toString();
	}

	@Override
	public final String trim() {
		return delegate.trim();
	}

	@Override
	public final String trimL() {
		return delegate.trimL();
	}

	@Override
	public final String trimR() {
		return delegate.trimR();
	}

	@Override
	public final void move(QDataFiller value) {
		delegate.move(value);
	}

	@Override
	public final void move(QDataFiller value, boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public final void movel(QDataFiller value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(QDataFiller value, boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public final void cat(QString factor1, QNumeric space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final void cat(String factor1, QNumeric space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final boolean eq(QHexadecimal value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean ne(QHexadecimal value) {
		return delegate.ne(value);
	}

	@Override
	public final boolean eq(byte value) {
		return delegate.eq(value);
	}

	@Override
	public final QBufferedData eval(byte value) {
		delegate.eval(value);
		return this;
	}

	@Override
	public final String s() {
		return delegate.s();
	}

	@Override
	public final boolean ge(QHexadecimal value) {
		return delegate.ge(value);
	}

	@Override
	public final boolean le(QHexadecimal value) {
		return delegate.le(value);
	}

	@Override
	public final void xlate(QString from, QString to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, String to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, String to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(String from, String to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, String to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, QString to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, QString to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(String from, QString to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, QString to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, QString to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, QString to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, String to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(QString from, String to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(QString from, String to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, String to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, String to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, String to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}
	
	@Override
	public final void xlate(byte from, String to, QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(QString from, QString to, String source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(QString from, QString to, String source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(QString from, QString to, String source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, String source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, QString to, String source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, String source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, String to, String source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, String to, String source, boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(String from, String to, String source, Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, String source, Number start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, String to, String source, QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, String source, QNumeric start, boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}
	
	@Override
	public final QCharacter qSubst(QNumeric start, QNumeric length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(QNumeric start) {
		return delegate.qSubst(start);
	}

	@Override
	public final QCharacter qSubst(Number start, Number length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(Number start) {
		return delegate.qSubst(start);
	}

	@Override
	public final QCharacter qSubst(QNumeric start, Number length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(Number start, QNumeric length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qTrim() {
		return delegate.qTrim();
	}

	@Override
	public final QCharacter qTriml() {
		return delegate.qTriml();
	}

	@Override
	public final QCharacter qTrimr() {
		return delegate.qTrimr();
	}

	@Override
	public final QNumeric qScan(byte argument) {
		return delegate.qScan(argument);
	}

	@Override
	public final QNumeric qScan(byte argument, QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(byte argument, Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(QCharacter argument, QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(String argument, QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(QCharacter argument, Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(String argument, Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(QCharacter argument) {
		return delegate.qScan(argument);
	}

	@Override
	public final QNumeric qScan(String argument) {
		return delegate.qScan(argument);
	}

	public final QDatetime qDate(DatetimeFormat format) {
		return delegate.qDate(format);
	}
	
	@Override
	public final QNumeric qInt() {
		return delegate.qInt();
	}

	@Override
	public final QNumeric qInth() {
		return delegate.qInth();
	}
	
	@Override
	public final QNumeric qLen() {
		return delegate.qLen();
	}

	@Override
	public final void testn(QIndicator numeric) {
		delegate.testn(numeric);
	}

	public final void testn(QIndicator numeric, QIndicator blank) {
		delegate.testn(numeric, blank);
	}

	public final void testn(QIndicator numeric, QIndicator blank, QIndicator blankNumeric) {
		delegate.testn(numeric, blank, blankNumeric);
	}

	@Override
	public final QPointer qAddr() {
		return delegate.qAddr();
	}

	public final QNumeric qScan(QCharacter source, QIndicator found) {
		return delegate.qScan(source, found);
	}

	public final QNumeric qScan(QCharacter source, QNumeric start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final QNumeric qScan(QCharacter source, Number start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final QNumeric qScan(String source, QIndicator found) {
		return delegate.qScan(source, found);
	}

	public final QNumeric qScan(String source, QNumeric start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final QNumeric qScan(String source, Number start, QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final boolean ne(byte value) {
		return delegate.ne(value);
	}

	public final boolean ge(byte value) {
		return delegate.ge(value);
	}

	public final boolean gt(byte value) {
		return delegate.gt(value);
	}

	public final boolean le(byte value) {
		return delegate.le(value);
	}

	public final boolean lt(byte value) {
		return delegate.lt(value);
	}
	

	@Override
	public final QNumeric qCheck(QCharacter base) {
		return delegate.qCheck(base);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, QNumeric start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, Number start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(String base) {
		return delegate.qCheck(base);
	}

	@Override
	public final QNumeric qCheck(String base, QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(String base, QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(String base, QNumeric start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(String base, Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(String base, Number start, QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base) {
		return delegate.qCheckr(base);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, QIndicator found) {
		return delegate.qCheckr(base, found);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, QNumeric start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, QNumeric start, QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, Number start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, Number start, QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(String base) {
		return delegate.qCheckr(base);
	}

	@Override
	public final QNumeric qCheckr(String base, QIndicator found) {
		return delegate.qCheckr(base, found);
	}

	@Override
	public final QNumeric qCheckr(String base, QNumeric start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(String base, QNumeric start, QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(String base, Number start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(String base, Number start, QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}
	
	@Override
	public final QString qPlus(String factor1) {
		return delegate.qPlus(factor1);
	}

	@Override
	public final QString qPlus(QString factor1) {
		return delegate.qPlus(factor1);
	}

	@Override
	public final ByteBuffer getBuffer() {
		return delegate.getBuffer();
	}

	@Override
	public final int getPosition() {
		return delegate.getPosition();
	}

	public final boolean eq(QDataFiller value) {
		return delegate.eq(value);
	}

	public final QBufferedData eval(QDataFiller value) {
		delegate.eval(value);
		return this;
	}

	public final boolean ge(QDataFiller value) {
		return delegate.ge(value);
	}

	public final boolean gt(QDataFiller value) {
		return delegate.gt(value);
	}

	public final boolean le(QDataFiller value) {
		return delegate.le(value);
	}

	public final boolean lt(QDataFiller value) {
		return delegate.lt(value);
	}

	public final boolean ne(QDataFiller value) {
		return delegate.ne(value);
	}

	public final boolean isStoreOwner() {
		return delegate.isStoreOwner();
	}

	public final BufferedElementType getBufferedElementType() {
		return delegate.getBufferedElementType();
	}
	
	@Override
	public final BufferedDataType getBufferedDataType() {
		return delegate.getBufferedDataType();
	}
	
	public final void move(QString value) {
		delegate.move(value);
	}

	public final void move(QString value, boolean clear) {
		delegate.move(value, clear);
	}

	public final void move(QNumeric value) {
		delegate.move(value);
	}

	public final void move(QNumeric value, boolean clear) {
		delegate.move(value, clear);
	}

	public final void movel(QString value) {
		delegate.movel(value);
	}

	public final void movel(QString value, boolean clear) {
		delegate.movel(value, clear);
	}

	public final void movel(QNumeric value) {
		delegate.movel(value);
	}

	public final void movel(QNumeric value, boolean clear) {
		delegate.movel(value, clear);
	}

	public final void movea(QArray<? extends QString> value) {
		delegate.movea(value);
	}

	public final void movea(QArray<? extends QString> value, boolean clear) {
		delegate.movea(value, clear);
	}

	public final void movea(QArray<? extends QString> value, int startIndex) {
		delegate.movea(value, startIndex);
	}

	public final void movea(QArray<? extends QString> value, int startIndex, boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public final void movea(QArray<? extends QString> value, QNumeric startIndex) {
		delegate.movea(value, startIndex);
	}

	public final void movea(QArray<? extends QString> value, QNumeric startIndex, boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public final void move(QBufferedElement value) {
		delegate.move(value);
	}

	public final void move(QBufferedElement value, boolean clear) {
		delegate.move(value, clear);
	}

	public final void movel(QBufferedElement value) {
		delegate.movel(value);
	}

	public final void movel(QBufferedElement value, boolean clear) {
		delegate.movel(value, clear);
	}

	public final boolean isVarying() {
		return delegate.isVarying();
	}

	public final QCharacter qTrim(String trimmed) {
		return delegate.qTrim(trimmed);
	}

	public final QCharacter qTrim(QString trimmed) {
		return delegate.qTrim(trimmed);
	}

	public final void cat(byte factor1, String factor2) {
		delegate.cat(factor1, factor2);
	}

	public final void testb(byte bitNumbers, QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public final void testb(String bitNumbers, QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public final void testb(QString bitNumbers, QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public final void testb(byte bitNumbers, QIndicator off, QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public final void testb(String bitNumbers, QIndicator off, QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public final void testb(QString bitNumbers, QIndicator off, QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public final void testb(byte bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}

	public final void testb(String bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}

	public final void testb(QString bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}
	
	public final void reset() {
		delegate.reset();
	}
	
	public final void snap() {
		delegate.snap();
	}
	
	@Override
	public final QIndicator qFound() {
		return delegate.qFound();
	}
	
	@Override
	public final void eval(QScroller<? extends QString> value) {
		delegate.eval(value);
	}
	
	@Override
	public final void eval(QStroller<? extends QDataStruct> value) {
		delegate.eval(value);
	}

	public final void xlate(String from, byte to, QString source) {
		delegate.xlate(from, to, source);
	}
}