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
	public final void accept(final QDataVisitor visitor) {
		delegate.accept(visitor);
	}

	@Override
	public final byte[] asBytes() {
		return delegate.asBytes();
	}

	@Override
	public final void assign(final QBufferedData value) {
		delegate.assign(value);
	}

	@Override
	public final void slice(final QBufferedData value) {
		delegate.slice(value);
	}

	@Override
	public final void slice(final QBufferedData value, final int position) {
		delegate.slice(value, position);
	}

	@Override
	public final String asString() {
		return delegate.asString();
	}

	@Override
	public final void bitoff(final byte bitNumbers) {
		delegate.bitoff(bitNumbers);
	}

	@Override
	public final void bitoff(final String bitNumbers) {
		delegate.bitoff(bitNumbers);
	}

	@Override
	public final void biton(final byte bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public final void biton(final String bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public final void biton(final QString bitNumbers) {
		delegate.biton(bitNumbers);
	}

	@Override
	public final void cat(final QString factor1) {
		delegate.cat(factor1);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final QString factor1, final String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1) {
		delegate.cat(factor1);
	}

	@Override
	public final void cat(final String factor1, final QString factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1, final String factor2) {
		delegate.cat(factor1, factor2);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final QNumeric space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final QString factor1, final Number space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final void cat(final String factor1, final Number space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final QNumeric space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final QNumeric space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final QNumeric space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final Number space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final Number space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final boolean clear) {
		delegate.cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final String factor1, final boolean clear) {
		delegate.cat(factor1, clear);
	}

	@Override
	public final void cat(final QString factor1, final Number space, final boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(final String factor1, final Number space, final boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QNumeric space, final boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(final String factor1, final QNumeric space, final boolean clear) {
		delegate.cat(factor1, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final boolean clear) {
		delegate.cat(factor1, clear);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final Number space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final Number space) {
		delegate.cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final Number space, final boolean clear) {
		delegate.cat(factor1, factor2, space, clear);
	}

	@Override
	public final void clear() {
		delegate.clear();
	}

	@Override
	public final boolean eq(final DataSpecial value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean eq(final QString value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean eq(final String value) {
		return delegate.eq(value);
	}

	@Override
	public final void eval(final QString value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(final QIndicator value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(final boolean value) {
		delegate.eval(value);
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		delegate.eval(value);
		return this;
	}

	@Override
	public final void eval(final String value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(final QDataArea<? extends QString> value) {
		delegate.eval(value);
	}

	@Override
	public final void evalr(final String value) {
		delegate.evalr(value);
	}

	@Override
	public final void evalr(final QString value) {
		delegate.evalr(value);
	}

	@Override
	public final boolean ge(final DataSpecial value) {
		return delegate.ge(value);
	}

	@Override
	public final boolean ge(final QString value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean ge(final String value) {
		return delegate.ge(value);
	}

	@Override
	public final QDataStruct getDelegate() {
		return this.delegate;
	}

	@Override
	public final QBufferedData getElement(final String name) {
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
	public final boolean gt(final DataSpecial value) {
		return delegate.gt(value);
	}

	@Override
	public final boolean gt(final QString value) {
		return delegate.gt(value);
	}

	@Override
	public final boolean gt(final String value) {
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
	public final boolean le(final DataSpecial value) {
		return delegate.le(value);
	}

	@Override
	public final boolean le(final QString value) {
		return delegate.le(value);
	}

	@Override
	public final boolean le(final String value) {
		return delegate.le(value);
	}

	@Override
	public final int getLength() {
		return delegate.getLength();
	}

	@Override
	public final boolean lt(final DataSpecial value) {
		return delegate.lt(value);
	}

	@Override
	public final boolean lt(final QString value) {
		return delegate.lt(value);
	}

	@Override
	public final boolean lt(final String value) {
		return delegate.lt(value);
	}

	@Override
	public final void move(final DataSpecial value) {
		delegate.move(value);
	}

	@Override
	public final void move(final DataSpecial value, final boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public final void move(final Number value) {
		delegate.move(value);
	}

	@Override
	public final void move(final Number value, final boolean clear) {
		delegate.move(value);
	}

	@Override
	public final void move(final String value) {
		delegate.move(value);
	}

	@Override
	public final void move(final String value, final boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public final void movel(final DataSpecial value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(final DataSpecial value, final boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public final void movel(final Number value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(final Number value, final boolean clear) {
		delegate.movel(value);
	}

	@Override
	public final void movel(final String value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(final String value, final boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public final boolean ne(final DataSpecial value) {
		return delegate.ne(value);
	}

	@Override
	public final boolean ne(final QString value) {
		return delegate.ne(value);
	}

	@Override
	public final boolean ne(final String value) {
		return delegate.ne(value);
	}

	public final void setDelegate(final QDataStruct delegate) {
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
	public final void move(final QDataFiller value) {
		delegate.move(value);
	}

	@Override
	public final void move(final QDataFiller value, final boolean clear) {
		delegate.move(value, clear);
	}

	@Override
	public final void movel(final QDataFiller value) {
		delegate.movel(value);
	}

	@Override
	public final void movel(final QDataFiller value, final boolean clear) {
		delegate.movel(value, clear);
	}

	@Override
	public final void cat(final QString factor1, final QNumeric space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final void cat(final String factor1, final QNumeric space) {
		delegate.cat(factor1, space);
	}

	@Override
	public final boolean eq(final QHexadecimal value) {
		return delegate.eq(value);
	}

	@Override
	public final boolean ne(final QHexadecimal value) {
		return delegate.ne(value);
	}

	@Override
	public final boolean eq(final byte value) {
		return delegate.eq(value);
	}

	@Override
	public final QBufferedData eval(final byte value) {
		delegate.eval(value);
		return this;
	}

	@Override
	public final String s() {
		return delegate.s();
	}

	@Override
	public final boolean ge(final QHexadecimal value) {
		return delegate.ge(value);
	}

	@Override
	public final boolean le(final QHexadecimal value) {
		return delegate.le(value);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final Number start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final QNumeric start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final Number start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final QNumeric start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final Number start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final QNumeric start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final byte from, final String to, final QString source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final Number start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final QNumeric start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final Number start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final QNumeric start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source) {
		delegate.xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final boolean clear) {
		delegate.xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final Number start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final Number start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final QNumeric start) {
		delegate.xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final QNumeric start, final boolean clear) {
		delegate.xlate(from, to, source, start, clear);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start, final QNumeric length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start) {
		return delegate.qSubst(start);
	}

	@Override
	public final QCharacter qSubst(final Number start, final Number length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(final Number start) {
		return delegate.qSubst(start);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start, final Number length) {
		return delegate.qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(final Number start, final QNumeric length) {
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
	public final QNumeric qScan(final byte argument) {
		return delegate.qScan(argument);
	}

	@Override
	public final QNumeric qScan(final byte argument, final QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final byte argument, final Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final String argument, final QNumeric start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final String argument, final Number start) {
		return delegate.qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument) {
		return delegate.qScan(argument);
	}

	@Override
	public final QNumeric qScan(final String argument) {
		return delegate.qScan(argument);
	}

	public final QDatetime qDate(final DatetimeFormat format) {
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
	public final void testn(final QIndicator numeric) {
		delegate.testn(numeric);
	}

	public final void testn(final QIndicator numeric, final QIndicator blank) {
		delegate.testn(numeric, blank);
	}

	public final void testn(final QIndicator numeric, final QIndicator blank, final QIndicator blankNumeric) {
		delegate.testn(numeric, blank, blankNumeric);
	}

	@Override
	public final QPointer qAddr() {
		return delegate.qAddr();
	}

	public final QNumeric qScan(final QCharacter source, final QIndicator found) {
		return delegate.qScan(source, found);
	}

	public final QNumeric qScan(final QCharacter source, final QNumeric start, final QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final QNumeric qScan(final QCharacter source, final Number start, final QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final QNumeric qScan(final String source, final QIndicator found) {
		return delegate.qScan(source, found);
	}

	public final QNumeric qScan(final String source, final QNumeric start, final QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final QNumeric qScan(final String source, final Number start, final QIndicator found) {
		return delegate.qScan(source, start, found);
	}

	public final boolean ne(final byte value) {
		return delegate.ne(value);
	}

	public final boolean ge(final byte value) {
		return delegate.ge(value);
	}

	public final boolean gt(final byte value) {
		return delegate.gt(value);
	}

	public final boolean le(final byte value) {
		return delegate.le(value);
	}

	public final boolean lt(final byte value) {
		return delegate.lt(value);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base) {
		return delegate.qCheck(base);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QNumeric start, final QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final Number start, final QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(final String base) {
		return delegate.qCheck(base);
	}

	@Override
	public final QNumeric qCheck(final String base, final QIndicator found) {
		return delegate.qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(final String base, final QNumeric start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final String base, final QNumeric start, final QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(final String base, final Number start) {
		return delegate.qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final String base, final Number start, final QIndicator found) {
		return delegate.qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base) {
		return delegate.qCheckr(base);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QIndicator found) {
		return delegate.qCheckr(base, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QNumeric start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QNumeric start, final QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final Number start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final Number start, final QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final String base) {
		return delegate.qCheckr(base);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QIndicator found) {
		return delegate.qCheckr(base, found);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QNumeric start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QNumeric start, final QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final String base, final Number start) {
		return delegate.qCheckr(base, start);
	}

	@Override
	public final QNumeric qCheckr(final String base, final Number start, final QIndicator found) {
		return delegate.qCheckr(base, start, found);
	}

	@Override
	public final QString qPlus(final String factor1) {
		return delegate.qPlus(factor1);
	}

	@Override
	public final QString qPlus(final QString factor1) {
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

	public final boolean eq(final QDataFiller value) {
		return delegate.eq(value);
	}

	public final QBufferedData eval(final QDataFiller value) {
		delegate.eval(value);
		return this;
	}

	public final boolean ge(final QDataFiller value) {
		return delegate.ge(value);
	}

	public final boolean gt(final QDataFiller value) {
		return delegate.gt(value);
	}

	public final boolean le(final QDataFiller value) {
		return delegate.le(value);
	}

	public final boolean lt(final QDataFiller value) {
		return delegate.lt(value);
	}

	public final boolean ne(final QDataFiller value) {
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

	public final void move(final QString value) {
		delegate.move(value);
	}

	public final void move(final QString value, final boolean clear) {
		delegate.move(value, clear);
	}

	public final void move(final QNumeric value) {
		delegate.move(value);
	}

	public final void move(final QNumeric value, final boolean clear) {
		delegate.move(value, clear);
	}

	public final void movel(final QString value) {
		delegate.movel(value);
	}

	public final void movel(final QString value, final boolean clear) {
		delegate.movel(value, clear);
	}

	public final void movel(final QNumeric value) {
		delegate.movel(value);
	}

	public final void movel(final QNumeric value, final boolean clear) {
		delegate.movel(value, clear);
	}

	public final void movea(final QArray<? extends QString> value) {
		delegate.movea(value);
	}

	public final void movea(final QArray<? extends QString> value, final boolean clear) {
		delegate.movea(value, clear);
	}

	public final void movea(final QArray<? extends QString> value, final int startIndex) {
		delegate.movea(value, startIndex);
	}

	public final void movea(final QArray<? extends QString> value, final int startIndex, final boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public final void movea(final QArray<? extends QString> value, final QNumeric startIndex) {
		delegate.movea(value, startIndex);
	}

	public final void movea(final QArray<? extends QString> value, final QNumeric startIndex, final boolean clear) {
		delegate.movea(value, startIndex, clear);
	}

	public final void move(final QBufferedElement value) {
		delegate.move(value);
	}

	public final void move(final QBufferedElement value, final boolean clear) {
		delegate.move(value, clear);
	}

	public final void movel(final QBufferedElement value) {
		delegate.movel(value);
	}

	public final void movel(final QBufferedElement value, final boolean clear) {
		delegate.movel(value, clear);
	}

	public final boolean isVarying() {
		return delegate.isVarying();
	}

	public final QCharacter qTrim(final String trimmed) {
		return delegate.qTrim(trimmed);
	}

	public final QCharacter qTrim(final QString trimmed) {
		return delegate.qTrim(trimmed);
	}

	public final void cat(final byte factor1, final String factor2) {
		delegate.cat(factor1, factor2);
	}

	public final void testb(final byte bitNumbers, final QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public final void testb(final String bitNumbers, final QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public final void testb(final QString bitNumbers, final QIndicator off) {
		delegate.testb(bitNumbers, off);
	}

	public final void testb(final byte bitNumbers, final QIndicator off, final QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public final void testb(final String bitNumbers, final QIndicator off, final QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public final void testb(final QString bitNumbers, final QIndicator off, final QIndicator on) {
		delegate.testb(bitNumbers, off, on);
	}

	public final void testb(final byte bitNumbers, final QIndicator off, final QIndicator on, final QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}

	public final void testb(final String bitNumbers, final QIndicator off, final QIndicator on, final QIndicator equal) {
		delegate.testb(bitNumbers, off, on, equal);
	}

	public final void testb(final QString bitNumbers, final QIndicator off, final QIndicator on, final QIndicator equal) {
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
	public final void eval(final QScroller<? extends QString> value) {
		delegate.eval(value);
	}

	@Override
	public final void eval(final QStroller<? extends QDataStruct> value) {
		delegate.eval(value);
	}

	public final void xlate(final String from, final byte to, final QString source) {
		delegate.xlate(from, to, source);
	}
}