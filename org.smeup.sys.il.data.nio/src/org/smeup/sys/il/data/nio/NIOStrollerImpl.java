/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;

public final class NIOStrollerImpl<D extends QDataStruct> extends NIOScrollerImpl<D> implements QStroller<D> {

	private static final long serialVersionUID = 1L;

	public NIOStrollerImpl(final QDataContext dataContext, final D model, final int dimension, final boolean allocate) {
		super(dataContext, model, dimension, allocate);
	}

	@Override
	public final String asString() {
		return current().asString();
	}

	@Override
	public final void bitoff(final byte bitNumbers) {
		current().bitoff(bitNumbers);
	}

	@Override
	public final void bitoff(final String bitNumbers) {
		current().bitoff(bitNumbers);
	}

	@Override
	public final void biton(final byte bitNumbers) {
		current().biton(bitNumbers);
	}

	@Override
	public final void biton(final String bitNumbers) {
		current().biton(bitNumbers);
	}

	@Override
	public final void cat(final QString factor1) {
		current().cat(factor1);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final QString factor1, final String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1) {
		current().cat(factor1);
	}

	@Override
	public final void cat(final String factor1, final QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1, final String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final QString factor1, final Number space) {
		current().cat(factor1, space);
	}

	@Override
	public final void cat(final String factor1, final Number space) {
		current().cat(factor1, space);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final Number space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final Number space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final boolean eq(final QString value) {
		return current().eq(value);
	}

	@Override
	public final boolean eq(final String value) {
		return current().eq(value);
	}

	@Override
	public final void eval(final boolean value) {
		current().eval(value);
	}

	@Override
	public final void evalr(final String value) {
		current().evalr(value);
	}

	@Override
	public final boolean ge(final QString value) {
		return current().ge(value);
	}

	@Override
	public final boolean ge(final String value) {
		return current().ge(value);
	}

	@Override
	public final QBufferedData getElement(final String name) {
		return current().getElement(name);
	}

	@Override
	public final List<QBufferedData> getElements() {
		return current().getElements();
	}

	@Override
	public final List<String> getElementNames() {
		return current().getElementNames();
	}

	@Override
	public final boolean gt(final QString value) {
		return current().gt(value);
	}

	@Override
	public final boolean gt(final String value) {
		return current().gt(value);
	}

	@Override
	public final boolean le(final QString value) {
		return current().le(value);
	}

	@Override
	public final boolean le(final String value) {
		return current().le(value);
	}

	@Override
	public final boolean lt(final QString value) {
		return current().lt(value);
	}

	@Override
	public final boolean lt(final String value) {
		return current().lt(value);
	}

	@Override
	public final boolean ne(final QString value) {
		return current().ne(value);
	}

	@Override
	public final boolean ne(final String value) {
		return current().ne(value);
	}

	@Override
	public final String trim() {
		return current().trim();
	}

	@Override
	public final String trimL() {
		return current().trimL();
	}

	@Override
	public final String trimR() {
		return current().trimR();
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final Number start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final QNumeric start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final Number start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final QNumeric start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final Number start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final QNumeric start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final byte from, final String to, final QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final Number start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final QNumeric start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final Number start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final QNumeric start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final Number start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final QNumeric start, final boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(final QString factor1, final QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public final void cat(final String factor1, final QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public final boolean eq(final QHexadecimal value) {
		return current().eq(value);
	}

	@Override
	public final boolean ne(final QHexadecimal value) {
		return current().ne(value);
	}

	@Override
	public final boolean ge(final QHexadecimal value) {
		return current().ge(value);
	}

	@Override
	public final boolean le(final QHexadecimal value) {
		return current().le(value);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start, final QNumeric length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start) {
		return current().qSubst(start);
	}

	@Override
	public final QCharacter qSubst(final Number start, final Number length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(final Number start) {
		return current().qSubst(start);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start, final Number length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(final Number start, final QNumeric length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qTrim() {
		return current().qTrim();
	}

	@Override
	public final QCharacter qTriml() {
		return current().qTriml();
	}

	@Override
	public final QCharacter qTrimr() {
		return current().qTrimr();
	}

	@Override
	public final void testn(final QIndicator numeric) {
		current().testn(numeric);
	}

	@Override
	public final void testn(final QIndicator numeric, final QIndicator blank) {
		current().testn(numeric, blank);
	}

	@Override
	public final void testn(final QIndicator numeric, final QIndicator blank, final QIndicator numericBlank) {
		current().testn(numeric, blank, numericBlank);
	}

	public final QNumeric qScan(final QCharacter source) {
		return current().qScan(source);
	}

	public final QNumeric qScan(final QCharacter source, final QIndicator found) {
		return current().qScan(source, found);
	}

	public final QNumeric qScan(final QCharacter source, final QNumeric start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(final QCharacter source, final QNumeric start, final QIndicator found) {
		return current().qScan(source, start, found);
	}

	public final QNumeric qScan(final QCharacter source, final Number start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(final QCharacter source, final Number start, final QIndicator found) {
		return current().qScan(source, start, found);
	}

	public final QNumeric qScan(final String source) {
		return current().qScan(source);
	}

	public final QNumeric qScan(final String source, final QIndicator found) {
		return current().qScan(source, found);
	}

	public final QNumeric qScan(final String source, final QNumeric start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(final String source, final QNumeric start, final QIndicator found) {
		return current().qScan(source, start, found);
	}

	public final QNumeric qScan(final String source, final Number start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(final String source, final Number start, final QIndicator found) {
		return current().qScan(source, start, found);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final QNumeric space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final QNumeric space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final QNumeric space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final Number space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final Number space, final boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(final String factor1, final boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final void cat(final QString factor1, final Number space, final boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final void cat(final String factor1, final Number space, final boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final void cat(final QString factor1, final QNumeric space, final boolean clear) {
		current().cat(factor1, space, clear);
	}

	@Override
	public final void cat(final String factor1, final QNumeric space, final boolean clear) {
		current().cat(factor1, space, clear);
	}

	@Override
	public final void cat(final QString factor1, final boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final QNumeric qInt() {
		return current().qInt();
	}

	@Override
	public final QNumeric qInth() {
		return current().qInth();
	}

	@Override
	public final QString qPlus(final String factor1) {
		return current().qPlus(factor1);
	}

	@Override
	public final QString qPlus(final QString factor1) {
		return current().qPlus(factor1);
	}

	@Override
	public final String s() {
		return asString();
	}

	@Override
	public final void eval(final QIndicator value) {
		current().eval(value);
	}

	@Override
	public final void evalr(final QString value) {
		current().evalr(value);
	}

	public final byte[] _toBytes() {
		return current().asBytes();
	}

	@Override
	public final boolean isVarying() {
		return false;
	}

	@Override
	public final void movea(final QArray<? extends QString> value) {
		current().movea(value);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final boolean clear) {
		current().movea(value, clear);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final int startIndex) {
		current().movea(value, startIndex);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final int startIndex, final boolean clear) {
		current().movea(value, startIndex, clear);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final QNumeric startIndex) {
		current().movea(value, startIndex);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final QNumeric startIndex, final boolean clear) {
		current().movea(value, startIndex, clear);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QNumeric start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final Number start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(final String base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheck(final String base, final QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(final String base, final QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final String base, final QNumeric start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(final String base, final Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(final String base, final Number start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QNumeric start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final Number start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final String base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QNumeric start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(final String base, final Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(final String base, final Number start, final QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QDatetime qDate(final DatetimeFormat format) {
		return current().qDate(format);
	}

	@Override
	public final QCharacter qTrim(final String trimmed) {
		return current().qTrim(trimmed);
	}

	@Override
	public final QCharacter qTrim(final QString trimmed) {
		return current().qTrim(trimmed);
	}

	@Override
	public final void cat(final byte factor1, final String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void testb(final byte bitNumbers, final QIndicator off) {
		current().testb(bitNumbers, off);
	}

	@Override
	public final void testb(final String bitNumbers, final QIndicator off) {
		current().testb(bitNumbers, off);
	}

	@Override
	public final void testb(final QString bitNumbers, final QIndicator off) {
		current().testb(bitNumbers, off);
	}

	@Override
	public final void testb(final byte bitNumbers, final QIndicator off, final QIndicator on) {
		current().testb(bitNumbers, off, on);
	}

	@Override
	public final void testb(final String bitNumbers, final QIndicator off, final QIndicator on) {
		current().testb(bitNumbers, off, on);
	}

	@Override
	public final void testb(final QString bitNumbers, final QIndicator off, final QIndicator on) {
		current().testb(bitNumbers, off, on);
	}

	@Override
	public final void testb(final byte bitNumbers, final QIndicator off, final QIndicator on, final QIndicator equal) {
		current().testb(bitNumbers, off, on, equal);
	}

	@Override
	public final void testb(final String bitNumbers, final QIndicator off, final QIndicator on, final QIndicator equal) {
		current().testb(bitNumbers, off, on, equal);
	}

	@Override
	public final void testb(final QString bitNumbers, final QIndicator off, final QIndicator on, final QIndicator equal) {
		current().testb(bitNumbers, off, on, equal);
	}

	@Override
	public final void eval(final QDataArea<? extends QString> value) {
		current().eval(value);
	}

	@Override
	public final void reset() {
		current().reset();
	}

	@Override
	public final boolean eq(final byte value) {
		return current().eq(value);
	}

	@Override
	public final QBufferedData eval(final byte value) {
		return current().eval(value);
	}

	@Override
	public final boolean ge(final byte value) {
		return current().ge(value);
	}

	@Override
	public final boolean gt(final byte value) {
		return current().gt(value);
	}

	@Override
	public final boolean le(final byte value) {
		return current().le(value);
	}

	@Override
	public final boolean lt(final byte value) {
		return current().lt(value);
	}

	@Override
	public final boolean ne(final byte value) {
		return current().ne(value);
	}

	@Override
	public final void eval(final QScroller<? extends QString> value) {
		current().eval(value.current());
	}

	@Override
	public final void eval(final QStroller<? extends QDataStruct> value) {
		current().eval(value.current());
	}

	@Override
	public final void xlate(final String from, final byte to, final QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void biton(final QString bitMask) {
		current().biton(bitMask);
	}

	@Override
	public final QNumeric qScan(final byte argument) {
		return current().qScan(argument);
	}

	@Override
	public final QNumeric qScan(final byte argument, final QNumeric start) {
		return current().qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(final byte argument, final Number start) {
		return current().qScan(argument, start);
	}
}