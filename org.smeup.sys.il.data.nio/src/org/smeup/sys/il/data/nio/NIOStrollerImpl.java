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

import java.util.Iterator;
import java.util.List;

import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;

public class NIOStrollerImpl<D extends QDataStruct> extends NIOScrollerImpl<D> implements QStroller<D> {

	private static final long serialVersionUID = 1L;

	public NIOStrollerImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOStrollerImpl(QDataContext dataContext, D model, int dimension) {
		super(dataContext, model, dimension);
	}

	@Override
	public String asString() {
		return current().asString();
	}

	@Override
	public void bitoff(byte bitNumbers) {
		current().bitoff(bitNumbers);
	}

	@Override
	public void bitoff(String bitNumbers) {
		current().bitoff(bitNumbers);
	}
	
	@Override
	public void biton(byte bitNumbers) {
		current().biton(bitNumbers);
	}

	@Override
	public void biton(String bitNumbers) {
		current().biton(bitNumbers);
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
	public void cat(QString factor1, QString factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		current().cat(factor1, factor2);
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
	public void cat(String factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		current().cat(factor1, factor2);
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
	public void cat(String factor1, String factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, Number space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
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
	public void evalr(String value) {
		current().evalr(value);
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
	public QBufferedData getElement(String name) {
		return current().getElement(name);
	}

	@Override
	public List<QBufferedData> getElements() {
		return current().getElements();
	}

	@Override
	public List<String> getElementNames() {
		return current().getElementNames();
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
	public boolean le(QString value) {
		return current().le(value);
	}

	@Override
	public boolean le(String value) {
		return current().le(value);
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
	public void xlate(QString from, QString to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(String from, String to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(String from, String to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(String from, QString to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(QString from, String to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(byte from, String to, QString source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(QString from, QString to, String source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(QString from, QString to, String source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, String to, String source) {
		current().xlate(from, to, source);
	}

	@Override
	public void xlate(String from, String to, String source, boolean clear) {
		current().xlate(from, to, source, clear);
	}

	@Override
	public void xlate(String from, String to, String source, Number start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, String source, Number start, boolean clear) {
		current().xlate(from, to, source, start, clear);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start) {
		current().xlate(from, to, source, start);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start, boolean clear) {
		current().xlate(from, to, source, start, clear);
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

	@Override
	public void testn(QIndicator numeric, QIndicator blank) {
		current().testn(numeric, blank);
	}

	@Override
	public void testn(QIndicator numeric, QIndicator blank, QIndicator numericBlank) {
		current().testn(numeric, blank, numericBlank);
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
	public void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		current().cat(factor1, factor2, space, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
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

	@Override
	public QNumeric qLookup(QArray<?> array, QIndicator found) {
		return current().qLookup(array, found);
	}

	@Override
	public QNumeric qLookup(QArray<?> array) {
		return current().qLookup(array);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start) {
		return current().qLookup(array, start);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start) {
		return current().qLookup(array, start);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, QNumeric elements) {
		return current().qLookup(array, start, elements);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, Number elements) {
		return current().qLookup(array, start, elements);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, QIndicator found) {
		return current().qLookup(array, start, found);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, QIndicator found) {
		return current().qLookup(array, start, found);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found) {
		return current().qLookup(array, start, elements, found);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, Number elements, QIndicator found) {
		return current().qLookup(array, start, elements, found);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, Number elements, QIndicator found) {
		return current().qLookup(array, start, elements, found);
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, QNumeric elements, QIndicator found) {
		return current().qLookup(array, start, elements, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QIndicator found) {
		return current().qLookupgt(array, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QNumeric start, QIndicator found) {
		return current().qLookupgt(array, start, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, Number start, QIndicator found) {
		return current().qLookupgt(array, start, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found) {
		return current().qLookupgt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, Number start, Number elements, QIndicator found) {
		return current().qLookupgt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QNumeric start, Number elements, QIndicator found) {
		return current().qLookupgt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, Number start, QNumeric elements, QIndicator found) {
		return current().qLookupgt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QIndicator found) {
		return current().qLookuplt(array, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QNumeric start, QIndicator found) {
		return current().qLookuplt(array, start, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, Number start, QIndicator found) {
		return current().qLookuplt(array, start, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found) {
		return current().qLookuplt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, Number start, Number elements, QIndicator found) {
		return current().qLookuplt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QNumeric start, Number elements, QIndicator found) {
		return current().qLookuplt(array, start, elements, found);
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, Number start, QNumeric elements, QIndicator found) {
		return current().qLookuplt(array, start, elements, found);
	}

	@Override
	public QString qPlus(String factor1) {
		return current().qPlus(factor1);
	}

	@Override
	public QString qPlus(QString factor1) {
		return current().qPlus(factor1);
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
	public String s() {
		return asString();
	}

	@Override
	public void eval(QIndicator value) {
		current().eval(value);
	}

	@Override
	public void evalr(QString value) {
		current().evalr(value);
	}

	public byte[] _toBytes() {
		return current().asBytes();
	}

	@Override
	public boolean isVarying() {
		return false;
	}

	@Override
	public void movea(QArray<? extends QString> value) {
		current().movea(value);
	}

	@Override
	public void movea(QArray<? extends QString> value, boolean clear) {
		current().movea(value, clear);
	}

	@Override
	public void movea(QArray<? extends QString> value, int startIndex) {
		current().movea(value, startIndex);		
	}

	@Override
	public void movea(QArray<? extends QString> value, int startIndex, boolean clear) {
		current().movea(value, startIndex, clear);
	}

	@Override
	public void movea(QArray<? extends QString> value, QNumeric startIndex) {
		current().movea(value, startIndex);		
	}

	@Override
	public void movea(QArray<? extends QString> value, QNumeric startIndex, boolean clear) {
		current().movea(value, startIndex, clear);		
	}

	
	@Override
	public QNumeric qCheck(QCharacter base) {
		return current().qCheck(base);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheck(QCharacter base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(QCharacter base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheck(String base) {
		return current().qCheck(base);
	}

	@Override
	public QNumeric qCheck(String base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public QNumeric qCheck(String base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(String base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheck(String base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheck(String base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}
	
	@Override
	public QNumeric qCheckr(QCharacter base) {
		return current().qCheck(base);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(String base) {
		return current().qCheck(base);
	}

	@Override
	public QNumeric qCheckr(String base, QIndicator found) {
		return current().qCheck(base, found);
	}

	@Override
	public QNumeric qCheckr(String base, QNumeric start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(String base, QNumeric start, QIndicator found) {
		return current().qCheck(base, start, found);
	}

	@Override
	public QNumeric qCheckr(String base, Number start) {
		return current().qCheck(base, start);
	}

	@Override
	public QNumeric qCheckr(String base, Number start, QIndicator found) {
		return current().qCheck(base, start, found);
	}
	
	@Override
	public QDatetime qDate(DatetimeFormat format) {
		return current().qDate(format);
	}

	@Override
	public QCharacter qTrim(String trimmed) {
		return current().qTrim(trimmed);
	}

	@Override
	public QCharacter qTrim(QString trimmed) {
		return current().qTrim(trimmed);
	}

	@Override
	public void cat(byte factor1, String factor2) {
		current().cat(factor1, factor2);
	}
}