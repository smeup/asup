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

	public NIOStrollerImpl(QDataContext dataContext, D model, int dimension, boolean allocate) {
		super(dataContext, model, dimension, allocate);
	}

	@Override
	public final String asString() {
		return current().asString();
	}

	@Override
	public final void bitoff(byte bitNumbers) {
		current().bitoff(bitNumbers);
	}

	@Override
	public final void bitoff(String bitNumbers) {
		current().bitoff(bitNumbers);
	}
	
	@Override
	public final void biton(byte bitNumbers) {
		current().biton(bitNumbers);
	}

	@Override
	public final void biton(String bitNumbers) {
		current().biton(bitNumbers);
	}
	
	@Override
	public final void cat(QString factor1) {
		current().cat(factor1);
	}

	@Override
	public final void cat(QString factor1, QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(QString factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1) {
		current().cat(factor1);
	}

	@Override
	public final void cat(String factor1, QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(QString factor1, Number space) {
		current().cat(factor1, space);
	}

	@Override
	public final void cat(String factor1, Number space) {
		current().cat(factor1, space);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final boolean eq(QString value) {
		return current().eq(value);
	}

	@Override
	public final boolean eq(String value) {
		return current().eq(value);
	}

	@Override
	public final void eval(boolean value) {
		current().eval(value);
	}

	@Override
	public final void evalr(String value) {
		current().evalr(value);
	}

	@Override
	public final boolean ge(QString value) {
		return current().ge(value);
	}

	@Override
	public final boolean ge(String value) {
		return current().ge(value);
	}

	@Override
	public final QBufferedData getElement(String name) {
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
	public final boolean gt(QString value) {
		return current().gt(value);
	}

	@Override
	public final boolean gt(String value) {
		return current().gt(value);
	}

	@Override
	public final boolean le(QString value) {
		return current().le(value);
	}

	@Override
	public final boolean le(String value) {
		return current().le(value);
	}

	@Override
	public final boolean lt(QString value) {
		return current().lt(value);
	}

	@Override
	public final boolean lt(String value) {
		return current().lt(value);
	}

	@Override
	public final boolean ne(QString value) {
		return current().ne(value);
	}

	@Override
	public final boolean ne(String value) {
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
	public final void xlate(QString from, QString to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, String to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, String to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(String from, String to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, String to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, QString to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, QString to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(String from, QString to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, QString to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, QString to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, QString to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, String to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(QString from, String to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(QString from, String to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, String to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, String to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, String to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(byte from, String to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(QString from, QString to, String source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(QString from, QString to, String source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(QString from, QString to, String source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, String source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, QString to, String source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, String source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(QString from, QString to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, String to, String source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void xlate(String from, String to, String source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public final void xlate(String from, String to, String source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, String source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void xlate(String from, String to, String source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public final void xlate(String from, String to, String source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public final void cat(QString factor1, QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public final void cat(String factor1, QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public final boolean eq(QHexadecimal value) {
		return current().eq(value);
	}

	@Override
	public final boolean ne(QHexadecimal value) {
		return current().ne(value);
	}

	@Override
	public final boolean ge(QHexadecimal value) {
		return current().ge(value);
	}

	@Override
	public final boolean le(QHexadecimal value) {
		return current().le(value);
	}

	@Override
	public final QCharacter qSubst(QNumeric start, QNumeric length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(QNumeric start) {
		return current().qSubst(start);
	}

	@Override
	public final QCharacter qSubst(Number start, Number length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(Number start) {
		return current().qSubst(start);
	}

	@Override
	public final QCharacter qSubst(QNumeric start, Number length) {
		return current().qSubst(start, length);
	}

	@Override
	public final QCharacter qSubst(Number start, QNumeric length) {
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
	public final void testn(QIndicator numeric) {
		current().testn(numeric);
	}

	@Override
	public final void testn(QIndicator numeric, QIndicator blank) {
		current().testn(numeric, blank);
	}

	@Override
	public final void testn(QIndicator numeric, QIndicator blank, QIndicator numericBlank) {
		current().testn(numeric, blank, numericBlank);
	}

	public final QNumeric qScan(QCharacter source) {
		return current().qScan(source);
	}

	public final QNumeric qScan(QCharacter source, QIndicator found) {
		return current().qScan(source, found);
	}

	public final QNumeric qScan(QCharacter source, QNumeric start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(QCharacter source, QNumeric start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	public final QNumeric qScan(QCharacter source, Number start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(QCharacter source, Number start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	public final QNumeric qScan(String source) {
		return current().qScan(source);
	}

	public final QNumeric qScan(String source, QIndicator found) {
		return current().qScan(source, found);
	}

	public final QNumeric qScan(String source, QNumeric start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(String source, QNumeric start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	public final QNumeric qScan(String source, Number start) {
		return current().qScan(source, start);
	}

	public final QNumeric qScan(String source, Number start, QIndicator found) {
		return current().qScan(source, start, found);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public final void cat(String factor1, String factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(QString factor1, String factor2, boolean clear) {
		current().cat(factor1, factor2, clear);
	}

	@Override
	public final void cat(String factor1, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final void cat(QString factor1, Number space, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final void cat(String factor1, Number space, boolean clear) {
		current().cat(factor1, clear);
	}

	@Override
	public final void cat(QString factor1, QNumeric space, boolean clear) {
		current().cat(factor1, space, clear);
	}

	@Override
	public final void cat(String factor1, QNumeric space, boolean clear) {
		current().cat(factor1, space, clear);
	}

	@Override
	public final void cat(QString factor1, boolean clear) {
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
	public final QString qPlus(String factor1) {
		return current().qPlus(factor1);
	}

	@Override
	public final QString qPlus(QString factor1) {
		return current().qPlus(factor1);
	}

	@Override
	public final String s() {
		return asString();
	}

	@Override
	public final void eval(QIndicator value) {
		current().eval(value);
	}

	@Override
	public final void evalr(QString value) {
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
	public final void movea(QArray<? extends QString> value) {
		current().movea(value);
	}

	@Override
	public final void movea(QArray<? extends QString> value, boolean clear) {
		current().movea(value, clear);
	}

	@Override
	public final void movea(QArray<? extends QString> value, int startIndex) {
		current().movea(value, startIndex);		
	}

	@Override
	public final void movea(QArray<? extends QString> value, int startIndex, boolean clear) {
		current().movea(value, startIndex, clear);
	}

	@Override
	public final void movea(QArray<? extends QString> value, QNumeric startIndex) {
		current().movea(value, startIndex);		
	}

	@Override
	public final void movea(QArray<? extends QString> value, QNumeric startIndex, boolean clear) {
		current().movea(value, startIndex, clear);		
	}

	
	@Override
	public final QNumeric qCheck(QCharacter base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(QCharacter base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(String base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheck(String base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheck(String base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(String base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheck(String base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheck(String base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}
	
	@Override
	public final QNumeric qCheckr(QCharacter base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(QCharacter base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(String base) {
		return current().qCheck(base);
	}

	@Override
	public final QNumeric qCheckr(String base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public final QNumeric qCheckr(String base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(String base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public final QNumeric qCheckr(String base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public final QNumeric qCheckr(String base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}
	
	@Override
	public final QDatetime qDate(DatetimeFormat format) {
		return current().qDate(format);
	}

	@Override
	public final QCharacter qTrim(String trimmed) {
		return current().qTrim(trimmed);
	}

	@Override
	public final QCharacter qTrim(QString trimmed) {
		return current().qTrim(trimmed);
	}

	@Override
	public final void cat(byte factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public final void testb(byte bitNumbers, QIndicator off) {
		current().testb(bitNumbers, off);
	}

	@Override
	public final void testb(String bitNumbers, QIndicator off) {
		current().testb(bitNumbers, off);
	}

	@Override
	public final void testb(QString bitNumbers, QIndicator off) {
		current().testb(bitNumbers, off);
	}

	@Override
	public final void testb(byte bitNumbers, QIndicator off, QIndicator on) {
		current().testb(bitNumbers, off, on);
	}

	@Override
	public final void testb(String bitNumbers, QIndicator off, QIndicator on) {
		current().testb(bitNumbers, off, on);
	}

	@Override
	public final void testb(QString bitNumbers, QIndicator off, QIndicator on) {
		current().testb(bitNumbers, off, on);
	}

	@Override
	public final void testb(byte bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		current().testb(bitNumbers, off, on, equal);
	}

	@Override
	public final void testb(String bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		current().testb(bitNumbers, off, on, equal);
	}

	@Override
	public final void testb(QString bitNumbers, QIndicator off, QIndicator on, QIndicator equal) {
		current().testb(bitNumbers, off, on, equal);
	}

	@Override
	public final void eval(QDataArea<? extends QString> value) {
		current().eval(value);
	}
	
	@Override
	public final void reset() {		
		current().reset();
	}

	@Override
	public final boolean eq(byte value) {
		return current().eq(value);
	}

	@Override
	public final QBufferedData eval(byte value) {
		return current().eval(value);
	}

	@Override
	public final boolean ge(byte value) {
		return current().ge(value);
	}

	@Override
	public final boolean gt(byte value) {
		return current().gt(value);
	}

	@Override
	public final boolean le(byte value) {
		return current().le(value);
	}

	@Override
	public final boolean lt(byte value) {
		return current().lt(value);
	}

	@Override
	public final boolean ne(byte value) {
		return current().ne(value);
	}

	@Override
	public final void eval(QScroller<? extends QString> value) {
		current().eval(value.current());
	}
	
	@Override
	public final void eval(QStroller<? extends QDataStruct> value) {
		current().eval(value.current());
	}

	@Override
	public final void xlate(String from, byte to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public final void biton(QString bitMask) {
		current().biton(bitMask);
	}

	@Override
	public final QNumeric qScan(byte argument) {
		return current().qScan(argument);
	}

	@Override
	public final QNumeric qScan(byte argument, QNumeric start) {
		return current().qScan(argument, start);
	}

	@Override
	public final QNumeric qScan(byte argument, Number start) {
		return current().qScan(argument, start);
	}
	
}